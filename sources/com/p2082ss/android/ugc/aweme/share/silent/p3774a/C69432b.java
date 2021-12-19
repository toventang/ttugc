package com.p2082ss.android.ugc.aweme.share.silent.p3774a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.b */
public final class C69432b implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155108a;

    static {
        Covode.recordClassIndex(81770);
    }

    public C69432b(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155108a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a.b$a */
    static final class C69433a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69432b f155109a;

        /* renamed from: b */
        final /* synthetic */ Context f155110b;

        /* renamed from: c */
        final /* synthetic */ C69331c f155111c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f155112d;

        static {
            Covode.recordClassIndex(81771);
        }

        C69433a(C69432b bVar, Context context, C69331c cVar, AbstractC89172b bVar2) {
            this.f155109a = bVar;
            this.f155110b = context;
            this.f155111c = cVar;
            this.f155112d = bVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            AbstractC69581b bVar = this.f155109a.f155108a;
            C89219l.m154716b(str, "");
            bVar.mo109554a(new C69650k(str, null, null, 6), this.f155110b);
            this.f155111c.mo109610b("url_form");
            this.f155112d.invoke(this.f155111c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a
    /* renamed from: a */
    public final void mo109696a(Context context, String str, C69331c cVar, AbstractC89172b<? super C69331c, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        ShareInfo shareInfo = cVar.f154901d.getShareInfo();
        C89219l.m154716b(shareInfo, "");
        String shareUrl = shareInfo.getShareUrl();
        C89219l.m154716b(shareUrl, "");
        C69125c.m122234b(shareUrl, "aweme", this.f155108a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69433a(this, context, cVar, bVar));
    }
}
