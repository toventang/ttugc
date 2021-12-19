package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70520b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.d */
final /* synthetic */ class C70523d implements AbstractC70086a {

    /* renamed from: a */
    private final C70520b.C70521a f157727a;

    /* renamed from: b */
    private final int f157728b;

    static {
        Covode.recordClassIndex(82979);
    }

    C70523d(C70520b.C70521a aVar, int i) {
        this.f157727a = aVar;
        this.f157728b = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a
    /* renamed from: a */
    public final void mo110587a(C24117a aVar) {
        C70520b.C70521a aVar2 = this.f157727a;
        boolean z = true;
        if (this.f157728b != C70520b.this.getItemCount() - 1) {
            z = false;
        }
        aVar2.mo111252a(aVar, z);
    }
}
