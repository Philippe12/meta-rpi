do_install_append () {
    cat >> ${D}${sysconfdir}/fstab <<EOF

# ENVEA mount bott part
/dev/mmcblk0p1	/boot	auto	defaults	0	0

EOF
}
