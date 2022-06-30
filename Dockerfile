FROM ubuntu:20.04

RUN apt-get update
RUN DEBIAN_FRONTEND=noninteractive TZ=Europe/Rome apt-get -y install tzdata

# Install the necessary packages
RUN apt-get update && apt-get install -y \
	apt-transport-https \
	ca-certificates \
	curl \
	gnupg-agent \
	software-properties-common \
	wget \
	g++-11 \
	build-essential \
	libfreetype6-dev \
	libcups2-dev \
	libx11-dev libxext-dev libxrender-dev libxrandr-dev libxtst-dev libxt-dev \
	libasound2-dev \
	libffi-dev \
	autoconf \
	build-essential \
	git

# Install OpenJDK 18 
RUN curl -O https://download.java.net/java/GA/jdk18/43f95e8614114aeaa8e8a5fcf20a682d/36/GPL/openjdk-18_linux-x64_bin.tar.gz \
	&& tar -xzf openjdk-18_linux-x64_bin.tar.gz \
	&& mv jdk-18 /opt/jdk \
	&& rm openjdk-18_linux-x64_bin.tar.gz

ENV JAVA_HOME="/opt/jdk"
ENV PATH="${PATH}:$JAVA_HOME/bin"

# Download panama-vector
RUN git clone https://github.com/openjdk/panama-vector
# Build panama-vector
RUN apt-get install -y unzip zip libfontconfig1-dev

RUN cd panama-vector && bash configure  && make images JOBS=$(nproc)
# Install panama-vector and clean old JDK
RUN rm -rf /opt/jdk \
 	&& mv /panama-vector/build/linux-x86_64-server-release/images/jdk /opt/jdk \
 	&& rm -rf /panama-vector
