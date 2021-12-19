package com.p2082ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.k */
final /* synthetic */ class C66481k implements ScanQRCodeActivityV2.AbstractC66465b {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f149455a;

    /* renamed from: b */
    private final String f149456b;

    static {
        Covode.recordClassIndex(78017);
    }

    C66481k(ScanQRCodeActivityV2 scanQRCodeActivityV2, String str) {
        this.f149455a = scanQRCodeActivityV2;
        this.f149456b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AbstractC66465b
    /* renamed from: a */
    public final void mo105404a() {
        C1731i.m5640b(new CallableC66482l(this.f149455a, this.f149456b), ExecutorC34605m.f81660a);
    }
}
