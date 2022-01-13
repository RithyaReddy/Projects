# png image will be the output

import qrcode as qr
img = qr.make("https://github.com/RithyaReddy?tab=repositories")
img.save("github_rithya.png")