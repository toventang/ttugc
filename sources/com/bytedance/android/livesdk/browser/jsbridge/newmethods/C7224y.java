package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.y */
final /* synthetic */ class C7224y implements AbstractC88983w {

    /* renamed from: a */
    private final C7206t.C72158 f17989a;

    /* renamed from: b */
    private final byte[] f17990b;

    /* renamed from: c */
    private final String f17991c;

    static {
        Covode.recordClassIndex(7970);
    }

    C7224y(C7206t.C72158 r1, byte[] bArr, String str) {
        this.f17989a = r1;
        this.f17990b = bArr;
        this.f17991c = str;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C7206t.C72158 r5 = this.f17989a;
        vVar.mo143031a(new C7206t.C7219c(this.f17991c, C7206t.this.mo13399a(C7206t.this.f17942g, this.f17990b, C7206t.this.f17943h)));
    }
}
