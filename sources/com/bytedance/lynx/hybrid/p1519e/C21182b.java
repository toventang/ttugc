package com.bytedance.lynx.hybrid.p1519e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21155i;
import com.bytedance.lynx.hybrid.p1518d.AbstractC21173a;
import com.bytedance.lynx.hybrid.p1521g.C21194b;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.provider.AbstractC28843b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.e.b */
public final class C21182b implements AbstractC21155i {

    /* renamed from: i */
    public static final C21185b f50243i = new C21185b((byte) 0);

    /* renamed from: a */
    public final boolean f50244a;

    /* renamed from: b */
    public final List<AbstractC21173a> f50245b;

    /* renamed from: c */
    public final AbstractC28773f f50246c;

    /* renamed from: d */
    public final AbstractC28843b f50247d;

    /* renamed from: e */
    public final List<C28463a> f50248e;

    /* renamed from: f */
    public final Map<String, C21194b> f50249f;

    /* renamed from: g */
    public final AbstractC21181a f50250g;

    /* renamed from: h */
    public final AbstractC89172b<LynxEnv, C89391z> f50251h;

    static {
        Covode.recordClassIndex(24798);
    }

    /* renamed from: com.bytedance.lynx.hybrid.e.b$b */
    public static final class C21185b {
        static {
            Covode.recordClassIndex(24801);
        }

        private C21185b() {
        }

        public /* synthetic */ C21185b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.e.b$a */
    public static final class C21183a {

        /* renamed from: a */
        public boolean f50252a = true;

        /* renamed from: b */
        public final List<AbstractC21173a> f50253b = new ArrayList();

        /* renamed from: c */
        public AbstractC28773f f50254c;

        /* renamed from: d */
        public AbstractC28843b f50255d;

        /* renamed from: e */
        public final List<C28463a> f50256e = new ArrayList();

        /* renamed from: f */
        public final Map<String, C21194b> f50257f = new LinkedHashMap();

        /* renamed from: g */
        public AbstractC21181a f50258g;

        /* renamed from: h */
        public AbstractC89172b<? super LynxEnv, C89391z> f50259h = C21184a.f50261a;

        /* renamed from: i */
        public Application f50260i;

        static {
            Covode.recordClassIndex(24799);
        }

        /* renamed from: com.bytedance.lynx.hybrid.e.b$a$a */
        static final class C21184a extends AbstractC89220m implements AbstractC89172b<LynxEnv, C89391z> {

            /* renamed from: a */
            public static final C21184a f50261a = new C21184a();

            static {
                Covode.recordClassIndex(24800);
            }

            C21184a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(LynxEnv lynxEnv) {
                C89219l.m154719c(lynxEnv, "");
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final void mo34742a(List<? extends C28463a> list) {
            C89219l.m154719c(list, "");
            this.f50256e.addAll(list);
        }

        public C21183a(Application application) {
            C89219l.m154719c(application, "");
            this.f50260i = application;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super com.lynx.tasm.LynxEnv, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C21182b(Application application, boolean z, List<AbstractC21173a> list, AbstractC28773f fVar, AbstractC28843b bVar, List<C28463a> list2, Map<String, C21194b> map, AbstractC21181a aVar, AbstractC89172b<? super LynxEnv, C89391z> bVar2) {
        this.f50244a = z;
        this.f50245b = list;
        this.f50246c = fVar;
        this.f50247d = bVar;
        this.f50248e = list2;
        this.f50249f = map;
        this.f50250g = aVar;
        this.f50251h = bVar2;
        C89219l.m154719c(application, "");
        C21187d.f50265a = application;
    }

    public /* synthetic */ C21182b(Application application, boolean z, List list, AbstractC28773f fVar, AbstractC28843b bVar, List list2, Map map, AbstractC21181a aVar, AbstractC89172b bVar2, byte b) {
        this(application, z, list, fVar, bVar, list2, map, aVar, bVar2);
    }
}
