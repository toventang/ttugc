package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bk */
final /* synthetic */ class C7137bk implements AbstractC88983w {

    /* renamed from: a */
    private final C7132bj f17773a;

    /* renamed from: b */
    private final byte[] f17774b;

    /* renamed from: c */
    private final String f17775c;

    static {
        Covode.recordClassIndex(7883);
    }

    C7137bk(C7132bj bjVar, byte[] bArr, String str) {
        this.f17773a = bjVar;
        this.f17774b = bArr;
        this.f17775c = str;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C40780g.m82241a().submit(new RunnableC7139bm(this.f17773a, vVar, this.f17774b, this.f17775c));
    }
}
