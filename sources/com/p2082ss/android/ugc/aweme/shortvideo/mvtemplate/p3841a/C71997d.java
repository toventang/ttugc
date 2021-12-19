package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.vesdk.AbstractC85541q;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.d */
public final /* synthetic */ class C71997d implements AbstractC85541q {

    /* renamed from: a */
    private final C71993c f161345a;

    /* renamed from: b */
    private final long f161346b;

    /* renamed from: c */
    private final String f161347c;

    /* renamed from: d */
    private final AbstractC88434g f161348d;

    /* renamed from: e */
    private final AbstractC72004a f161349e;

    static {
        Covode.recordClassIndex(84637);
    }

    C71997d(C71993c cVar, long j, String str, AbstractC88434g gVar, AbstractC72004a aVar) {
        this.f161345a = cVar;
        this.f161346b = j;
        this.f161347c = str;
        this.f161348d = gVar;
        this.f161349e = aVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C71993c cVar = this.f161345a;
        String str2 = this.f161347c;
        AbstractC88434g gVar = this.f161348d;
        AbstractC72004a aVar = this.f161349e;
        if (i == 4101 && !cVar.f161340n) {
            cVar.f161340n = true;
            C1731i.m5640b(new CallableC71998e(cVar, gVar, str2), C1731i.f5562a).mo5534a(new C71999f(cVar, aVar), C1731i.f5564c, null);
        }
    }
}
