package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1242a.C17779b;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.c */
public final class C17796c {

    /* renamed from: a */
    public static C17796c f42476a;

    /* renamed from: b */
    public static final ConcurrentLinkedQueue<AbstractC17800b> f42477b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public static final C17797a f42478c = new C17797a((byte) 0);

    /* renamed from: d */
    private final AbstractC89244h f42479d;

    /* renamed from: e */
    private final C17779b f42480e;

    /* renamed from: f */
    private final C17782b f42481f;

    /* renamed from: com.bytedance.ies.powerpreload.c$b */
    public interface AbstractC17800b {
        static {
            Covode.recordClassIndex(20364);
        }

        /* renamed from: a */
        void mo28271a(C17808a aVar);
    }

    /* renamed from: com.bytedance.ies.powerpreload.c$a */
    public static final class C17797a {
        static {
            Covode.recordClassIndex(20361);
        }

        private C17797a() {
        }

        /* renamed from: a */
        public static boolean m32994a() {
            if (C17796c.f42476a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: com.bytedance.ies.powerpreload.c$a$b */
        public static final class RunnableC17799b implements Runnable {

            /* renamed from: a */
            public static final RunnableC17799b f42483a = new RunnableC17799b();

            static {
                Covode.recordClassIndex(20363);
            }

            RunnableC17799b() {
            }

            public final void run() {
                Iterator<T> it = C17796c.f42477b.iterator();
                while (it.hasNext()) {
                    it.next().mo28271a(C17808a.C17809a.m32999a());
                }
                C17796c.f42477b.clear();
            }
        }

        public /* synthetic */ C17797a(byte b) {
            this();
        }

        /* renamed from: com.bytedance.ies.powerpreload.c$a$a */
        public static final class C17798a extends AbstractC89220m implements AbstractC89172b<C17779b, C17796c> {

            /* renamed from: a */
            final /* synthetic */ C17779b f42482a;

            static {
                Covode.recordClassIndex(20362);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17798a(C17779b bVar) {
                super(1);
                this.f42482a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C17796c invoke(C17779b bVar) {
                C89219l.m154719c(bVar, "");
                return new C17796c(this.f42482a, new C17782b(this.f42482a), (byte) 0);
            }
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.c$c */
    static final class C17801c extends AbstractC89220m implements AbstractC89171a<C17808a> {

        /* renamed from: a */
        public static final C17801c f42484a = new C17801c();

        static {
            Covode.recordClassIndex(20365);
        }

        C17801c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17808a invoke() {
            return C17808a.C17809a.m32999a();
        }
    }

    static {
        Covode.recordClassIndex(20360);
    }

    /* renamed from: a */
    public static final void m32993a(AbstractC17800b bVar) {
        if (C17797a.m32994a()) {
            bVar.mo28271a(C17808a.C17809a.m32999a());
            return;
        }
        ConcurrentLinkedQueue<AbstractC17800b> concurrentLinkedQueue = f42477b;
        if (concurrentLinkedQueue.size() >= 5) {
            concurrentLinkedQueue.poll();
            concurrentLinkedQueue.offer(bVar);
            return;
        }
        concurrentLinkedQueue.offer(bVar);
    }

    private C17796c(C17779b bVar, C17782b bVar2) {
        this.f42480e = bVar;
        this.f42481f = bVar2;
        this.f42479d = C89250i.m154773a((AbstractC89171a) C17801c.f42484a);
    }

    public /* synthetic */ C17796c(C17779b bVar, C17782b bVar2, byte b) {
        this(bVar, bVar2);
    }
}
