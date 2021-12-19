package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.bb */
public final /* synthetic */ class C69852bb implements AbstractC88983w {

    /* renamed from: a */
    private final ShortVideoContext f156099a;

    static {
        Covode.recordClassIndex(82260);
    }

    C69852bb(ShortVideoContext shortVideoContext) {
        this.f156099a = shortVideoContext;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        ShortVideoContext shortVideoContext = this.f156099a;
        C70625d dVar = shortVideoContext.f155811au;
        if (TextUtils.isEmpty(shortVideoContext.f155817b.f155669y)) {
            vVar.mo143031a(AbstractC27242j.absent());
            vVar.mo143023a();
        } else if (dVar == null || !TextUtils.equals(dVar.getMusicPath(), shortVideoContext.f155817b.f155669y)) {
            C70612k.m124747a(shortVideoContext.f155817b.f155669y, new C69855be(shortVideoContext, vVar));
        } else {
            vVar.mo143031a(AbstractC27242j.m54223of(dVar));
            vVar.mo143023a();
        }
    }
}
