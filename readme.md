# BCode Generator
Android barcode generator through adb for testing purposes

### Build
gradlew clean assemblyRelease

### Generate barcode
adb shell am start -a android.intent.action.VIEW -c android.intent.category.BROWSABLE -d "bcode://generate?type=QR_CODE&data=google.com"

### Barcode types
See [Barcode Formats](https://zxing.github.io/zxing/apidocs/com/google/zxing/BarcodeFormat.html) from Zxing

---
Thanks to [Android-Barcode](https://github.com/BottleRocketStudios/Android-Barcode)!