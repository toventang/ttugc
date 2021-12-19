package com.p2082ss.android.ugc.aweme.story.feed.detail;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.detail.b */
public final class C77243b extends C77238a {
    static {
        Covode.recordClassIndex(90257);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.b$a */
    static final class C77244a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C77243b f173265a;

        static {
            Covode.recordClassIndex(90258);
        }

        C77244a(C77243b bVar) {
            this.f173265a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f173265a.f173261d = false;
            this.f173265a.mo120836a(C89070n.m154516a(obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.b$b */
    static final class C77245b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C77243b f173266a;

        static {
            Covode.recordClassIndex(90259);
        }

        C77245b(C77243b bVar) {
            this.f173266a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f173266a.f173261d = false;
            C77283a.m135112c("StoryCommonDetailOperator", String.valueOf(((Throwable) obj).getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.feed.detail.C77238a
    /* renamed from: a */
    public final void mo120835a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        String aid = bVar.getAid();
        AbstractC76444b e = C77260g.f173332a.mo120157e();
        C89219l.m154716b(aid, "");
        AbstractC88412b a = e.mo120172a(aid, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77244a(this), new C77245b(this));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f173258a);
    }
}
