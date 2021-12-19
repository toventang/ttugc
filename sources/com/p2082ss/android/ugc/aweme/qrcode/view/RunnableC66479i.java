package com.p2082ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.i */
final /* synthetic */ class RunnableC66479i implements Runnable {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f149453a;

    static {
        Covode.recordClassIndex(78015);
    }

    RunnableC66479i(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f149453a = scanQRCodeActivityV2;
    }

    public final void run() {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f149453a;
        if (!scanQRCodeActivityV2.isFinishing()) {
            scanQRCodeActivityV2.finish();
        }
    }
}
