DESCRIPTION = "udev rules for Sierra MC 7700 free AT port"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=b97a012949927931feb7793eee5ed924"

SRC_URI = " file://77-mm-nc7700.rules"

S = "${WORKDIR}"

do_install () {
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${WORKDIR}/77-mm-nc7700.rules ${D}${sysconfdir}/udev/rules.d/
}
