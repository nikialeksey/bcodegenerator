package com.nikialeksey.bcodegenerator;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bottlerocketstudios.barcode.generation.ui.BarcodeView;
import com.google.zxing.BarcodeFormat;

public class BCodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final BarcodeView barcodeView = new BarcodeView(this);

        barcodeView.setBarcodeFormat(BarcodeFormat.QR_CODE);
        barcodeView.setBarcodeText("https://github.com/nikialeksey/bcodegenerator");

        final Uri data = getIntent().getData();
        if (data != null) {
            final String typeText = data.getQueryParameter("type");
            barcodeView.setBarcodeFormat(BarcodeFormat.valueOf(typeText));
            barcodeView.setBarcodeText(data.getQueryParameter("data"));
        }

        setContentView(barcodeView);
    }
}
