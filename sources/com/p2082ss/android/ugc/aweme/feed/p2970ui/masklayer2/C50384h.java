package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50397e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50349d;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.h */
public final class C50384h implements AbstractC50385i {

    /* renamed from: a */
    private final SharePackage f116328a;

    /* renamed from: b */
    private final DialogC69418s.C69419a.C69420a f116329b;

    static {
        Covode.recordClassIndex(59515);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: a */
    public final C50349d mo85526a(AbstractC50382f fVar) {
        C89219l.m154721d(fVar, "");
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: a */
    public final SharePackage mo85527a() {
        return this.f116328a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i
    /* renamed from: b */
    public final List<AbstractC50383g> mo85528b(AbstractC50382f fVar) {
        C89219l.m154721d(fVar, "");
        List<AbstractC69693h> list = this.f116329b.f155072c;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new C50387k(new C50397e(t.co_(), t.mo61918b()), new C50378c(t, fVar, this)));
        }
        return arrayList;
    }

    public C50384h(SharePackage sharePackage, DialogC69418s.C69419a.C69420a aVar) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(aVar, "");
        this.f116328a = sharePackage;
        this.f116329b = aVar;
    }
}
