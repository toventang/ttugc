package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage */
public class LinkDefaultSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(81539);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage$b */
    static final class C69223b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154737a;

        static {
            Covode.recordClassIndex(81543);
        }

        C69223b(AbstractC89172b bVar) {
            this.f154737a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f154737a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkDefaultSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage$a */
    static final class C69220a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ LinkDefaultSharePackage f154730a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f154731b;

        /* renamed from: c */
        final /* synthetic */ String f154732c;

        static {
            Covode.recordClassIndex(81540);
        }

        C69220a(LinkDefaultSharePackage linkDefaultSharePackage, AbstractC69581b bVar, String str) {
            this.f154730a = linkDefaultSharePackage;
            this.f154731b = bVar;
            this.f154732c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            String a = this.f154731b.mo109548a();
            if (a.hashCode() == 96619420 && a.equals("email")) {
                return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage.C69220a.C692211 */

                    /* renamed from: a */
                    final /* synthetic */ C69220a f154733a;

                    static {
                        Covode.recordClassIndex(81541);
                    }

                    {
                        this.f154733a = r1;
                    }

                    @Override // p4560f.p4561a.AbstractC88976q
                    /* renamed from: a */
                    public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                        C89219l.m154721d(oVar, "");
                        String str = str;
                        C89219l.m154716b(str, "");
                        oVar.mo143049a(new C69650k(str, this.f154733a.f154730a.f155489f, this.f154733a.f154732c));
                    }
                });
            }
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage.C69220a.C692222 */

                /* renamed from: a */
                final /* synthetic */ C69220a f154735a;

                static {
                    Covode.recordClassIndex(81542);
                }

                {
                    this.f154735a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    String str = str;
                    C89219l.m154716b(str, "");
                    oVar.mo143049a(new C69650k(str, this.f154735a.f154732c, null, 4));
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final void mo109572a(AbstractC69581b bVar, AbstractC89172b<? super AbstractC69645h, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        String a = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        if (C69659a.m123052a()) {
            C69125c.m122234b(this.f155491h, this.f155487d, bVar).mo143237a(new C69220a(this, bVar, a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69223b(bVar2));
            return;
        }
        String a2 = C69125c.m122232a(this.f155491h, this.f155487d, bVar);
        String a3 = bVar.mo109548a();
        if (a3.hashCode() == 96619420 && a3.equals("email")) {
            bVar2.invoke(new C69650k(a2, this.f155489f, a));
        } else {
            bVar2.invoke(new C69650k(a2, a, null, 4));
        }
    }
}
