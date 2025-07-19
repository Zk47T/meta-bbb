LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""


FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/Zk47T/ssd1306.git;protocol=https;branch=main \
           file://0001-ssd1306-bbb.patch"

PV = "1.0+git${SRCPV}"
SRCREV = "b1397ef7ec704d8631b73b2c0521f9c804954d3a"

S = "${WORKDIR}/git"

do_compile() {
    ${CC} ${LDFLAGS} ${S}/src/main.c -o ssd1306
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ssd1306 ${D}${bindir}/ssd1306
}