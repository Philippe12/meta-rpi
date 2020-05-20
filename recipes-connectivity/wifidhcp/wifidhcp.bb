DESCRIPTION = "wifi dhcp server configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=b97a012949927931feb7793eee5ed924"

SRC_URI = " file://dnsmasq.conf"

S = "${WORKDIR}"

do_install () {
	install -d ${D}${sysconfdir}/dnsmasq.conf
	install -m 0644 ${WORKDIR}/dnsmasq.conf ${D}${sysconfdir}/
}
