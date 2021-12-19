package com.bytedance.ies.powerpreload.p1242a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.C17795j;
import com.bytedance.ies.powerpreload.task.AbstractC17825c;
import com.bytedance.ies.powerpreload.task.AbstractC17826d;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.a.b */
public final class C17779b {

    /* renamed from: a */
    public final Application f42451a;

    /* renamed from: b */
    public final boolean f42452b;

    /* renamed from: c */
    public final AbstractC17825c f42453c;

    /* renamed from: d */
    public final AbstractC89171a<ExecutorService> f42454d;

    /* renamed from: e */
    public final HashMap<Class<?>, AbstractC17826d<?>> f42455e;

    static {
        Covode.recordClassIndex(20343);
    }

    /* renamed from: com.bytedance.ies.powerpreload.a.b$a */
    public static final class C17780a {

        /* renamed from: a */
        public boolean f42456a;

        /* renamed from: b */
        public C17795j f42457b = new C17795j();

        /* renamed from: c */
        public AbstractC89171a<? extends ExecutorService> f42458c;

        /* renamed from: d */
        public final HashMap<Class<?>, AbstractC17826d<?>> f42459d = new HashMap<>();

        /* renamed from: e */
        public final Application f42460e;

        static {
            Covode.recordClassIndex(20344);
        }

        /* renamed from: com.bytedance.ies.powerpreload.a.b$a$a */
        public static final class C17781a extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

            /* renamed from: a */
            public static final C17781a f42461a = new C17781a();

            static {
                Covode.recordClassIndex(20345);
            }

            C17781a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ExecutorService invoke() {
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                C89219l.m154709a((Object) newCachedThreadPool, "");
                return newCachedThreadPool;
            }
        }

        public C17780a(Application application) {
            C89219l.m154719c(application, "");
            this.f42460e = application;
        }

        /* renamed from: a */
        public final <T> C17780a mo28250a(Class<T> cls, AbstractC17826d<T> dVar) {
            C89219l.m154719c(cls, "");
            C89219l.m154719c(dVar, "");
            this.f42459d.put(cls, dVar);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends java.util.concurrent.ExecutorService> */
    /* JADX WARN: Multi-variable type inference failed */
    private C17779b(Application application, boolean z, AbstractC17825c cVar, AbstractC89171a<? extends ExecutorService> aVar, HashMap<Class<?>, AbstractC17826d<?>> hashMap) {
        this.f42451a = application;
        this.f42452b = z;
        this.f42453c = cVar;
        this.f42454d = aVar;
        this.f42455e = hashMap;
    }

    public /* synthetic */ C17779b(Application application, boolean z, AbstractC17825c cVar, AbstractC89171a aVar, HashMap hashMap, byte b) {
        this(application, z, cVar, aVar, hashMap);
    }
}
