package com.p2082ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.l */
final /* synthetic */ class CallableC66482l implements Callable {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f149457a;

    /* renamed from: b */
    private final String f149458b;

    static {
        Covode.recordClassIndex(78018);
    }

    CallableC66482l(ScanQRCodeActivityV2 scanQRCodeActivityV2, String str) {
        this.f149457a = scanQRCodeActivityV2;
        this.f149458b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f149457a.mo105387a(this.f149458b);
        return null;
    }
}
