SUMMARY = "My custom Linux Image"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit extrausers

#Set rootfs to 200MiB by default
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "1048576"
IMAGE_ROOTFS_MAXSIZE = "2097152"

#Change root password to test
PASSWD = "\$5\$y9Aeg5ctwntRHo/g\$CAKtoTfQg7VPGfVAMGo5ZG/0GJLn3AD0JdoQ.i0dDFC"
EXTRA_USERS_PARAMS = "\
    usermod -p '${PASSWD}' root; \
    "

#SSH VSCode server package
IMAGE_INSTALL:append = " \
    dhcpcd \
    iproute2 \
    iputils \
    openssh \
    bash \
    tar \
    xz \
    procps \
    coreutils \
    curl \
    libgcc \
    libstdc++ \
    libatomic \
"

#USB WiFi package
IMAGE_INSTALL:append = " \
    kernel-module-rtl8188eu \
    linux-firmware \
    dhcpcd \
    iw \
    wpa-supplicant \
    wireless-regdb-static \
"

#SSD1306 OLED package
IMAGE_INSTALL:append = " \
    packagegroup-core-buildessential \
    nano \
    i2c-tools \
    custom-banner \
    opkg \
    dtc \
    kernel-modules \
    fbset \
    con2fbmap \
"

#eMMC script
IMAGE_INSTALL:append = " \
    rsync \
    dosfstools \
    u-boot-tools \
    util-linux \
    e2fsprogs \
"

KERNEL_MODULE_AUTOLOAD:append = " \
    rtl8188eu \
    "
