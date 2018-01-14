# BCode Generator
Android barcode generator through adb for testing purposes

### Build
```shell
gradlew clean assemblyRelease
```

### Generate barcode
```shell
adb shell am start -a android.intent.action.VIEW -c android.intent.category.BROWSABLE -d "bcode://generate?type=QR_CODE&data=google.com"
```

### Barcode types
See [Barcode Formats](https://zxing.github.io/zxing/apidocs/com/google/zxing/BarcodeFormat.html) from Zxing

### Examples

- bcode://generate?type=QR_CODE&data=google.com

![qrcode](https://github.com/nikialeksey/bcodegenerator/blob/master/screens/qrcode.png)

- bcode://generate?type=EAN_13&data=9785913395511

![ean13](https://github.com/nikialeksey/bcodegenerator/blob/master/screens/ean13.png)

---
Thanks to [Android-Barcode](https://github.com/BottleRocketStudios/Android-Barcode)!