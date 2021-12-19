package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.j */
public final class C66387j implements AbstractC66380d {
    static {
        Covode.recordClassIndex(77919);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final String mo90115a() {
        return "web";
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        QrCodeScanService b = QrCodeScanImpl.m118122b();
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://reactnative/"))) {
            C36125t.m73598a(C36125t.m73591a(), str);
            return true;
        } else if (TextUtils.isEmpty(str) || (!str.startsWith("snssdk1180") && !str.startsWith("snssdk1233"))) {
            return false;
        } else {
            b.mo105339a(C17867d.m33078a(), str);
            return true;
        }
    }
}
