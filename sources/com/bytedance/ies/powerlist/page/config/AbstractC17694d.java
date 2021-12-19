package com.bytedance.ies.powerlist.page.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.EnumC17699e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.config.d */
public abstract class AbstractC17694d<T> {

    /* renamed from: d */
    public static final C17695a f42328d = new C17695a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f42329a;

    /* renamed from: c */
    public AbstractC17691a<T> f42330c;

    static {
        Covode.recordClassIndex(20254);
    }

    /* renamed from: a */
    public abstract void mo23345a(AbstractC89124d<? super AbstractC17700f<T>> dVar);

    /* renamed from: b */
    public abstract void mo23347b(AbstractC89124d<? super AbstractC17700f<T>> dVar, T t);

    /* renamed from: com.bytedance.ies.powerlist.page.config.d$a */
    public static final class C17695a {
        static {
            Covode.recordClassIndex(20255);
        }

        private C17695a() {
        }

        public /* synthetic */ C17695a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.config.d$b */
    static final class C17696b extends AbstractC89220m implements AbstractC89171a<C176971> {

        /* renamed from: a */
        public static final C17696b f42331a = new C17696b();

        static {
            Covode.recordClassIndex(20256);
        }

        C17696b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C176971 invoke() {
            return new AbstractC17691a<T>() {
                /* class com.bytedance.ies.powerlist.page.config.AbstractC17694d.C17696b.C176971 */

                static {
                    Covode.recordClassIndex(20257);
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
                /* renamed from: a */
                public final void mo28155a(EnumC17699e eVar) {
                    C89219l.m154719c(eVar, "");
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
                /* renamed from: a */
                public final void mo28156a(T t) {
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
                /* renamed from: b */
                public final void mo28158b(T t) {
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
                /* renamed from: e */
                public final void mo28163e() {
                }
            };
        }
    }

    public AbstractC17694d() {
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C17696b.f42331a);
        this.f42329a = a;
        this.f42330c = (AbstractC17691a) a.getValue();
    }

    /* renamed from: a */
    public void mo23346a(AbstractC89124d<? super AbstractC17700f<T>> dVar, T t) {
        C89219l.m154719c(dVar, "");
        dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
    }
}
