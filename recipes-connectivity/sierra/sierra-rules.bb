DESCRIPTION = "udev rules for Sierra MC 7700 free AT port"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRC_URI = " file://77-mm-nc7700.rules"

S = "${WORKDIR}"

do_install () {
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${WORKDIR}/77-mm-nc7700.rules ${D}${sysconfdir}/udev/rules.d/
}
