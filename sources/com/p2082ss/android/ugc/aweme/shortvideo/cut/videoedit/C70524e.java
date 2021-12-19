package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70520b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.e */
final /* synthetic */ class C70524e implements AbstractC70086a {

    /* renamed from: a */
    private final C70520b.C70521a f157729a;

    /* renamed from: b */
    private final C70520b.C70521a f157730b;

    /* renamed from: c */
    private final String f157731c;

    /* renamed from: d */
    private final int f157732d;

    /* renamed from: e */
    private final C0692e f157733e;

    /* renamed from: f */
    private final String f157734f;

    static {
        Covode.recordClassIndex(82980);
    }

    C70524e(C70520b.C70521a aVar, C70520b.C70521a aVar2, String str, int i, C0692e eVar, String str2) {
        this.f157729a = aVar;
        this.f157730b = aVar2;
        this.f157731c = str;
        this.f157732d = i;
        this.f157733e = eVar;
        this.f157734f = str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a
    /* renamed from: a */
    public final void mo110587a(C24117a aVar) {
        C70520b.C70521a aVar2 = this.f157729a;
        C70520b.C70521a aVar3 = this.f157730b;
        String str = this.f157731c;
        int i = this.f157732d;
        C0692e eVar = this.f157733e;
        String str2 = this.f157734f;
        if (aVar3.f157723a != null && aVar3.f157723a.getTag().equals(str)) {
            aVar2.mo111252a((C24117a<AbstractC24453b>) aVar, false);
        }
        if (i == eVar.f2751b.intValue()) {
            C70520b.this.f157710e.mo110502a(str2);
        }
    }
}
