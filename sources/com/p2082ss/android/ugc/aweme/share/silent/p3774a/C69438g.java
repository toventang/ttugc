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

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.g */
public final class C69438g implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155117a;

    static {
        Covode.recordClassIndex(81776);
    }

    public C69438g(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155117a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a.g$a */
    static final class C69439a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69438g f155118a;

        /* renamed from: b */
        final /* synthetic */ Context f155119b;

        /* renamed from: c */
        final /* synthetic */ C69331c f155120c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f155121d;

        static {
            Covode.recordClassIndex(81777);
        }

        C69439a(C69438g gVar, Context context, C69331c cVar, AbstractC89172b bVar) {
            this.f155118a = gVar;
            this.f155119b = context;
            this.f155120c = cVar;
            this.f155121d = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            AbstractC69581b bVar = this.f155118a.f155117a;
            C89219l.m154716b(str, "");
            bVar.mo109554a(new C69650k(str, null, null, 6), this.f155119b);
            this.f155120c.mo109610b("url_form");
            this.f155121d.invoke(this.f155120c);
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
        C69125c.m122234b(shareUrl, "aweme", this.f155117a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69439a(this, context, cVar, bVar));
    }
}
