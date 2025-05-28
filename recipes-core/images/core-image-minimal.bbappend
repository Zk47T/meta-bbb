inherit extrausers
# User "root" has password set to "password" in the image.
# printf "%q" $(mkpasswd -m sha256crypt password)
# \$5\$1ywTDE4jLgPDskTp\$yK5Ap.2xjc5gYeFQ4MGvR6C0VzA4VDSMIFkQ5.TJO84
PASSWD = "\$5\$1ywTDE4jLgPDskTp\$yK5Ap.2xjc5gYeFQ4MGvR6C0VzA4VDSMIFkQ5.TJO84"
EXTRA_USERS_PARAMS = "\
    usermod -p '${PASSWD}' root; \
    "
