package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a */
public final class C55747a<R> extends AbstractC55765e<R> {

    /* renamed from: f */
    public static final C55749b f127150f = new C55749b((byte) 0);

    /* renamed from: a */
    public C55777g<R> f127151a;

    /* renamed from: b */
    public AbstractC89171a<Boolean> f127152b;

    /* renamed from: c */
    public AbstractC89172b<? super C55750c<R>, Boolean> f127153c;

    /* renamed from: d */
    public AbstractC89172b<? super List<R>, ? extends List<R>> f127154d;

    /* renamed from: e */
    public volatile boolean f127155e;

    /* renamed from: h */
    private final AbstractC89244h f127156h;

    static {
        Covode.recordClassIndex(65533);
    }

    /* renamed from: f */
    private final C88411a m101507f() {
        return (C88411a) this.f127156h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$b */
    public static final class C55749b {
        static {
            Covode.recordClassIndex(65535);
        }

        private C55749b() {
        }

        public /* synthetic */ C55749b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final boolean bO_() {
        return this.f127155e;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$d */
    static final class C55751d extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C55751d f127161a = new C55751d();

        static {
            Covode.recordClassIndex(65537);
        }

        C55751d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$e */
    public static final class C55752e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C55747a f127162a;

        /* renamed from: b */
        final /* synthetic */ boolean f127163b;

        static {
            Covode.recordClassIndex(65538);
        }

        C55752e(C55747a aVar, boolean z) {
            this.f127162a = aVar;
            this.f127163b = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$e$a */
        static final /* synthetic */ class C55753a extends C89217j implements AbstractC89171a<List<R>> {
            static {
                Covode.recordClassIndex(65539);
            }

            C55753a(AbstractC55766f fVar) {
                super(0, fVar, AbstractC55766f.class, "loadMoreDirectly", "loadMoreDirectly()Ljava/util/List;", 0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Object invoke() {
                return ((AbstractC55766f) this.receiver).mo92646h();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$e$b */
        static final /* synthetic */ class C55754b extends C89217j implements AbstractC89171a<List<R>> {
            static {
                Covode.recordClassIndex(65540);
            }

            C55754b(AbstractC55766f fVar) {
                super(0, fVar, AbstractC55766f.class, "loadMoreDirectly", "loadMoreDirectly()Ljava/util/List;", 0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Object invoke() {
                return ((AbstractC55766f) this.receiver).mo92646h();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$e$c */
        static final /* synthetic */ class C55755c extends C89217j implements AbstractC89171a<List<R>> {
            static {
                Covode.recordClassIndex(65541);
            }

            C55755c(AbstractC55766f fVar) {
                super(0, fVar, AbstractC55766f.class, "loadDirectly", "loadDirectly()Ljava/util/List;", 0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Object invoke() {
                return ((AbstractC55766f) this.receiver).mo92645g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<R>> vVar) {
            AbstractC89171a cVar;
            Boolean invoke;
            Object invoke2;
            Boolean invoke3;
            C89219l.m154721d(vVar, "");
            AbstractC89171a<Boolean> aVar = this.f127162a.f127152b;
            if (aVar == null || (invoke3 = aVar.invoke()) == null || invoke3.booleanValue()) {
                if (!this.f127163b) {
                    C55777g<R> gVar = this.f127162a.f127151a;
                    if (gVar == null) {
                        C89219l.m154715b();
                    }
                    gVar.mo92652b();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC55766f<?, R> fVar = null;
                while (true) {
                    C55777g<R> gVar2 = this.f127162a.f127151a;
                    if (gVar2 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC55766f<?, R> c = gVar2.mo92653c();
                    if (c == null) {
                        break;
                    }
                    if (fVar == null && this.f127163b) {
                        cVar = new C55753a(c);
                    } else if (C89219l.m154714a(c, fVar)) {
                        cVar = new C55754b(c);
                    } else {
                        cVar = new C55755c(c);
                    }
                    C55747a aVar2 = this.f127162a;
                    C55750c cVar2 = new C55750c(linkedHashMap, (List) cVar.invoke(), c);
                    AbstractC89172b<? super C55750c<R>, Boolean> bVar = aVar2.f127153c;
                    if (bVar == null || (invoke = bVar.invoke(cVar2)) == null || !invoke.booleanValue()) {
                        break;
                    }
                    fVar = c;
                }
                C55747a aVar3 = this.f127162a;
                List<R> a = C55758b.m101514a(linkedHashMap);
                AbstractC89172b<? super List<R>, ? extends List<R>> bVar2 = aVar3.f127154d;
                if (!(bVar2 == null || (invoke2 = bVar2.invoke(a)) == 0)) {
                    a = invoke2;
                }
                vVar.mo143031a(a);
                return;
            }
            vVar.mo143031a(new ArrayList());
        }
    }

    private C55747a() {
        this.f127156h = C89250i.m154773a((AbstractC89171a) C55751d.f127161a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final void bM_() {
        if (mo92623b()) {
            m101506a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final void bN_() {
        if (mo92623b()) {
            m101506a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: e */
    public final boolean mo92627e() {
        C55777g<R> gVar = this.f127151a;
        if (gVar == null || gVar.mo92653c() == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: b */
    public final boolean mo92623b() {
        C55777g<R> gVar;
        List<AbstractC55766f<?, R>> a;
        if (this.f127155e || (gVar = this.f127151a) == null || (a = gVar.mo92651a()) == null || a.isEmpty() || !super.mo92623b()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C55747a(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$a */
    public static final class C55748a<R> {

        /* renamed from: a */
        public final C55747a<R> f127157a = new C55747a<>((byte) 0);

        static {
            Covode.recordClassIndex(65534);
        }

        /* renamed from: a */
        public final C55748a<R> mo92628a(AbstractC55764d<R> dVar) {
            C89219l.m154721d(dVar, "");
            this.f127157a.mo92640a(dVar);
            return this;
        }

        /* renamed from: b */
        public final C55748a<R> mo92631b(AbstractC89172b<? super List<R>, ? extends List<R>> bVar) {
            C89219l.m154721d(bVar, "");
            this.f127157a.f127154d = bVar;
            return this;
        }

        /* renamed from: a */
        public final C55748a<R> mo92629a(C55777g<R> gVar) {
            C89219l.m154721d(gVar, "");
            this.f127157a.f127151a = gVar;
            return this;
        }

        /* renamed from: a */
        public final C55748a<R> mo92630a(AbstractC89172b<? super C55750c<R>, Boolean> bVar) {
            C89219l.m154721d(bVar, "");
            this.f127157a.f127153c = bVar;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$f */
    public static final class C55756f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C55747a f127164a;

        /* renamed from: b */
        final /* synthetic */ boolean f127165b;

        static {
            Covode.recordClassIndex(65542);
        }

        C55756f(C55747a aVar, boolean z) {
            this.f127164a = aVar;
            this.f127165b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<R> list = (List) obj;
            this.f127164a.f127155e = false;
            C55747a aVar = this.f127164a;
            C89219l.m154716b(list, "");
            aVar.mo92642a(list, this.f127165b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$g */
    public static final class C55757g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C55747a f127166a;

        /* renamed from: b */
        final /* synthetic */ boolean f127167b;

        static {
            Covode.recordClassIndex(65543);
        }

        C55757g(C55747a aVar, boolean z) {
            this.f127166a = aVar;
            this.f127167b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f127166a.f127155e = false;
            C55747a aVar = this.f127166a;
            C89219l.m154716b(th, "");
            aVar.mo92641a(th, this.f127167b);
        }
    }

    /* renamed from: a */
    private final void m101506a(boolean z) {
        this.f127155e = true;
        AbstractC88412b a = AbstractC88979t.m154294a(new C55752e(this, z)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C55756f(this, z), new C55757g(this, z));
        m101507f().mo142944a();
        m101507f().mo142945a(a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$c */
    public static final class C55750c<R> {

        /* renamed from: a */
        public final LinkedHashMap<AbstractC55765e<R>, List<R>> f127158a;

        /* renamed from: b */
        public final List<R> f127159b;

        /* renamed from: c */
        public final AbstractC55765e<R> f127160c;

        static {
            Covode.recordClassIndex(65536);
        }

        public C55750c(LinkedHashMap<AbstractC55765e<R>, List<R>> linkedHashMap, List<R> list, AbstractC55765e<R> eVar) {
            C89219l.m154721d(linkedHashMap, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(eVar, "");
            this.f127158a = linkedHashMap;
            this.f127159b = list;
            this.f127160c = eVar;
        }
    }
}
