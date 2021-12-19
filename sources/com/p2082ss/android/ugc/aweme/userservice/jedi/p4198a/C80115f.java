package com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61616b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.userservice.api.C80103a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88962d;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.f */
public final class C80115f extends AbstractC20287b {

    /* renamed from: b */
    public final C80105a f179512b;

    /* renamed from: c */
    public final C80112c f179513c;

    /* renamed from: d */
    public final C88962d<C89378p<C80103a, FollowStatus>> f179514d;

    /* renamed from: e */
    public final C80114e f179515e;

    static {
        Covode.recordClassIndex(93355);
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.f$a */
    public static final class C80118a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C80115f f179518a;

        /* renamed from: b */
        final /* synthetic */ C89378p f179519b;

        /* renamed from: c */
        final /* synthetic */ String f179520c;

        /* renamed from: d */
        final /* synthetic */ C80103a f179521d;

        static {
            Covode.recordClassIndex(93358);
        }

        public C80118a(C80115f fVar, C89378p pVar, String str, C80103a aVar) {
            this.f179518a = fVar;
            this.f179519b = pVar;
            this.f179520c = str;
            this.f179521d = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar;
            Integer num;
            FollowStatus followStatus = (FollowStatus) obj;
            C89219l.m154716b(followStatus, "");
            if (!(followStatus.followStatus != 1 || (pVar = this.f179519b) == null || (num = (Integer) pVar.getSecond()) == null)) {
                if (num.intValue() == 1) {
                    C61616b.m111628a(this.f179520c, null);
                } else if (num.intValue() == 0) {
                    C61616b.m111630b(this.f179520c, null);
                }
            }
            this.f179518a.f179514d.onNext(new C89378p<>(this.f179521d, followStatus));
        }
    }

    public C80115f(C80114e eVar) {
        C89219l.m154721d(eVar, "");
        this.f179515e = eVar;
        C80105a aVar = new C80105a();
        this.f179512b = aVar;
        C80112c cVar = new C80112c();
        this.f179513c = cVar;
        C88962d<C89378p<C80103a, FollowStatus>> i = C88962d.m154225i();
        C89219l.m154716b(i, "");
        this.f179514d = i;
        mo33647a(C20165b.m38139a(aVar), C20165b.m38137a(eVar), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, C801161.f179516a));
        mo33647a(C20165b.m38139a(cVar), C20165b.m38137a(eVar), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, C801172.f179517a));
    }
}
