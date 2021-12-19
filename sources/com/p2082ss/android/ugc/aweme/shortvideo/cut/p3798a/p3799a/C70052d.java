package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IVideo2GifService;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a.d */
public final /* synthetic */ class C70052d implements AbstractC85541q {

    /* renamed from: a */
    private final IVideo2GifService.ConvertListener f156658a;

    /* renamed from: b */
    private final C85581w f156659b;

    static {
        Covode.recordClassIndex(82472);
    }

    public C70052d(IVideo2GifService.ConvertListener convertListener, C85581w wVar) {
        this.f156658a = convertListener;
        this.f156659b = wVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C1731i.m5640b(new CallableC70055g(i, this.f156658a, f, this.f156659b), C1731i.f5564c);
    }
}
