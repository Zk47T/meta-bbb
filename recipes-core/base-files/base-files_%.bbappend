FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
TMPDIR = "${TOPDIR}/tmp"
SRC_URI += "file://zk47-banner.sh"

do_install:append() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 ${WORKDIR}/zk47-banner.sh ${D}${sysconfdir}/profile.d/
}