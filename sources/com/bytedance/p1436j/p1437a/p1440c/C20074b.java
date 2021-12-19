package com.bytedance.p1436j.p1437a.p1440c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16627a;
import com.bytedance.p1436j.p1437a.p1439b.AbstractC20069a;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
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

/* renamed from: com.bytedance.j.a.c.b */
public final class C20074b implements AbstractC16627a {

    /* renamed from: a */
    public final C20075a f47783a;

    static {
        Covode.recordClassIndex(23582);
    }

    /* renamed from: com.bytedance.j.a.c.b$a */
    public static final class C20075a {

        /* renamed from: a */
        public boolean f47784a = true;

        /* renamed from: b */
        public final List<AbstractC20069a> f47785b = new ArrayList();

        /* renamed from: c */
        public AbstractC28773f f47786c;

        /* renamed from: d */
        public AbstractC28843b f47787d;

        /* renamed from: e */
        public final List<C28463a> f47788e = new ArrayList();

        /* renamed from: f */
        public final Map<String, C20100b> f47789f = new LinkedHashMap();

        /* renamed from: g */
        public AbstractC20073a f47790g;

        /* renamed from: h */
        public AbstractC89172b<? super LynxEnv, C89391z> f47791h = C20076a.f47793a;

        /* renamed from: i */
        public Application f47792i;

        static {
            Covode.recordClassIndex(23583);
        }

        /* renamed from: a */
        public final C20074b mo33429a() {
            return new C20074b(this.f47792i, this, (byte) 0);
        }

        /* renamed from: com.bytedance.j.a.c.b$a$a */
        static final class C20076a extends AbstractC89220m implements AbstractC89172b<LynxEnv, C89391z> {

            /* renamed from: a */
            public static final C20076a f47793a = new C20076a();

            static {
                Covode.recordClassIndex(23584);
            }

            C20076a() {
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

        public C20075a(Application application) {
            C89219l.m154719c(application, "");
            this.f47792i = application;
        }
    }

    private C20074b(Application application, C20075a aVar) {
        this.f47783a = aVar;
        C89219l.m154719c(application, "");
        C20083e.f47806a = application;
    }

    public /* synthetic */ C20074b(Application application, C20075a aVar, byte b) {
        this(application, aVar);
    }
}
