package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bm */
final /* synthetic */ class RunnableC7139bm implements Runnable {

    /* renamed from: a */
    private final C7132bj f17777a;

    /* renamed from: b */
    private final AbstractC88982v f17778b;

    /* renamed from: c */
    private final byte[] f17779c;

    /* renamed from: d */
    private final String f17780d;

    static {
        Covode.recordClassIndex(7885);
    }

    RunnableC7139bm(C7132bj bjVar, AbstractC88982v vVar, byte[] bArr, String str) {
        this.f17777a = bjVar;
        this.f17778b = vVar;
        this.f17779c = bArr;
        this.f17780d = str;
    }

    public final void run() {
        C7132bj bjVar = this.f17777a;
        AbstractC88982v vVar = this.f17778b;
        try {
            vVar.mo143031a(bjVar.mo13367a(bjVar.f17763b, this.f17779c, this.f17780d));
        } catch (Exception e) {
            vVar.mo143024a((Throwable) e);
        }
    }
}
