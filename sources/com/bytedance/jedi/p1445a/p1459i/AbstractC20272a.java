package com.bytedance.jedi.p1445a.p1459i;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.i.a */
public abstract class AbstractC20272a<K, V, K1, V1> {

    /* renamed from: a */
    public static final C20276b f48116a = new C20276b((byte) 0);

    static {
        Covode.recordClassIndex(23780);
    }

    /* renamed from: com.bytedance.jedi.a.i.a$b */
    public static final class C20276b {
        static {
            Covode.recordClassIndex(23784);
        }

        private C20276b() {
        }

        public /* synthetic */ C20276b(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.i.a$b$a */
        public static final class C20277a extends AbstractC89220m implements AbstractC89183m<K, V, K1> {

            /* renamed from: a */
            public static final C20277a f48121a = new C20277a();

            static {
                Covode.recordClassIndex(23785);
            }

            C20277a() {
                super(2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: K */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final K1 invoke(K k, V v) {
                if ((k instanceof Object) && k != 0) {
                    return k;
                }
                throw new RuntimeException();
            }
        }

        /* renamed from: a */
        public static <K, V, K1, V1> AbstractC20272a<K, V, K1, V1> m38473a(AbstractC89183m<? super K, ? super V, ? extends K1> mVar, AbstractC89187q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(qVar, "");
            return new C20278c(mVar, qVar);
        }
    }

    private AbstractC20272a() {
    }

    /* renamed from: com.bytedance.jedi.a.i.a$a */
    public static final class C20273a<K, V, K1, V1> extends AbstractC20272a<K, V, K1, V1> {

        /* renamed from: b */
        public AbstractC89172b<? super V, ? extends List<? extends C89378p<? extends K1, ? extends V1>>> f48117b;

        /* renamed from: c */
        public AbstractC89183m<? super V1, ? super V1, ? extends V1> f48118c;

        static {
            Covode.recordClassIndex(23781);
        }

        public /* synthetic */ C20273a() {
            this(C202741.f48119a, C202752.f48120a);
        }

        /* renamed from: a */
        public final void mo33642a(AbstractC89172b<? super V, ? extends List<? extends C89378p<? extends K1, ? extends V1>>> bVar) {
            C89219l.m154719c(bVar, "");
            this.f48117b = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C20273a(AbstractC89172b<? super V, ? extends List<? extends C89378p<? extends K1, ? extends V1>>> bVar, AbstractC89183m<? super V1, ? super V1, ? extends V1> mVar) {
            super((byte) 0);
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(mVar, "");
            this.f48117b = bVar;
            this.f48118c = mVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.i.a$c */
    public static final class C20278c<K, V, K1, V1> extends AbstractC20272a<K, V, K1, V1> {

        /* renamed from: b */
        public AbstractC89183m<? super K, ? super V, ? extends K1> f48122b;

        /* renamed from: c */
        public AbstractC89187q<? super K, ? super V, ? super V1, ? extends V1> f48123c;

        static {
            Covode.recordClassIndex(23786);
        }

        public /* synthetic */ C20278c() {
            this(C202791.f48124a, C202802.f48125a);
        }

        /* renamed from: a */
        public final void mo33643a(AbstractC89183m<? super K, ? super V, ? extends K1> mVar) {
            C89219l.m154719c(mVar, "");
            this.f48122b = mVar;
        }

        /* renamed from: a */
        public final void mo33644a(AbstractC89187q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C89219l.m154719c(qVar, "");
            this.f48123c = qVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20278c(AbstractC89183m<? super K, ? super V, ? extends K1> mVar, AbstractC89187q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            super((byte) 0);
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(qVar, "");
            this.f48122b = mVar;
            this.f48123c = qVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.i.a$d */
    public static final class C20281d<K, V, K1, V1> extends AbstractC20272a<K, V, K1, V1> {

        /* renamed from: b */
        public AbstractC89183m<? super V, ? super V1, Boolean> f48126b;

        /* renamed from: c */
        public AbstractC89183m<? super V, ? super V1, ? extends V1> f48127c;

        static {
            Covode.recordClassIndex(23789);
        }

        public /* synthetic */ C20281d() {
            this(C202821.f48128a, C202832.f48129a);
        }

        /* renamed from: a */
        public final void mo33645a(AbstractC89183m<? super V, ? super V1, Boolean> mVar) {
            C89219l.m154719c(mVar, "");
            this.f48126b = mVar;
        }

        /* renamed from: b */
        public final void mo33646b(AbstractC89183m<? super V, ? super V1, ? extends V1> mVar) {
            C89219l.m154719c(mVar, "");
            this.f48127c = mVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C20281d(AbstractC89183m<? super V, ? super V1, Boolean> mVar, AbstractC89183m<? super V, ? super V1, ? extends V1> mVar2) {
            super((byte) 0);
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(mVar2, "");
            this.f48126b = mVar;
            this.f48127c = mVar2;
        }
    }

    public /* synthetic */ AbstractC20272a(byte b) {
        this();
    }
}
