package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h */
public final class C32586h {

    /* renamed from: a */
    public AbstractC32588b f77739a;

    /* renamed from: b */
    private AbstractC88412b f77740b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h$a */
    public interface AbstractC32587a {
        static {
            Covode.recordClassIndex(39359);
        }

        /* renamed from: a */
        void mo58473a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h$b */
    public interface AbstractC32588b {
        static {
            Covode.recordClassIndex(39360);
        }

        /* renamed from: a */
        void mo58474a(String str);
    }

    static {
        Covode.recordClassIndex(39358);
    }

    /* renamed from: a */
    public final void mo58470a() {
        AbstractC88412b bVar = this.f77740b;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h$c */
    static final class C32589c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C32586h f77741a;

        static {
            Covode.recordClassIndex(39361);
        }

        C32589c(C32586h hVar) {
            this.f77741a = hVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            this.f77741a.f77739a = new AbstractC32588b() {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h.C32589c.C325901 */

                static {
                    Covode.recordClassIndex(39362);
                }

                @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h.AbstractC32588b
                /* renamed from: a */
                public final void mo58474a(String str) {
                    C89219l.m154721d(str, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143031a(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.h$d */
    static final class C32591d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32587a f77743a;

        static {
            Covode.recordClassIndex(39363);
        }

        C32591d(AbstractC32587a aVar) {
            this.f77743a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            AbstractC32587a aVar = this.f77743a;
            C89219l.m154716b(str, "");
            aVar.mo58473a(str);
        }
    }

    /* renamed from: a */
    public final void mo58472a(String str) {
        C89219l.m154721d(str, "");
        AbstractC32588b bVar = this.f77739a;
        if (bVar != null) {
            bVar.mo58474a(str);
        }
    }

    /* renamed from: a */
    public final void mo58471a(AbstractC32587a aVar, TimeUnit timeUnit) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(timeUnit, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C32589c(this));
        C89219l.m154716b(a, "");
        this.f77740b = a.mo143291d(1000, timeUnit).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C32591d(aVar));
    }
}
