package com.p2082ss.android.ugc.aweme.preload.p3563a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.a.a */
public final class C63311a {

    /* renamed from: a */
    public static final C63311a f143701a = new C63311a();

    /* renamed from: com.ss.android.ugc.aweme.preload.a.a$a */
    public static final class C63312a {

        /* renamed from: a */
        static final Map<String, C88411a> f143702a = new ConcurrentHashMap();

        /* renamed from: b */
        public static final C63312a f143703b = new C63312a();

        /* renamed from: c */
        private static final Map<String, List<AbstractC88412b>> f143704c = new ConcurrentHashMap();

        private C63312a() {
        }

        static {
            Covode.recordClassIndex(74595);
        }
    }

    private C63311a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.a.a$b */
    public static final class CallableC63313b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f143705a;

        static {
            Covode.recordClassIndex(74596);
        }

        CallableC63313b(Runnable runnable) {
            this.f143705a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f143705a.run();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.a.a$c */
    public static final class CallableC63314c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f143706a;

        static {
            Covode.recordClassIndex(74597);
        }

        CallableC63314c(Runnable runnable) {
            this.f143706a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f143706a.run();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.a$d */
    public static final class C63315d extends C63316b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Runnable f143707a;

        /* renamed from: b */
        final /* synthetic */ C63329e f143708b;

        static {
            Covode.recordClassIndex(74598);
        }

        @Override // com.p2082ss.android.ugc.aweme.preload.p3563a.C63316b, p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f143707a.run();
            super.onComplete();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63315d(Runnable runnable, C63329e eVar, C63329e eVar2) {
            super(eVar2);
            this.f143707a = runnable;
            this.f143708b = eVar;
        }
    }

    static {
        Covode.recordClassIndex(74594);
    }

    /* renamed from: a */
    public static void m114809a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C88411a aVar = C63312a.f143702a.get(str);
        if (aVar != null) {
            aVar.mo142944a();
            C63312a.f143702a.remove(str);
        }
    }

    /* renamed from: a */
    private static void m114812a(String str, AbstractC88412b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C88411a aVar = C63312a.f143702a.get(str);
        if (aVar == null) {
            aVar = new C88411a();
            C63312a.f143702a.put(str, aVar);
        }
        aVar.mo142945a(bVar);
    }

    /* renamed from: a */
    public static void m114810a(String str, C63329e eVar, Runnable runnable) {
        AbstractC88985y yVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(runnable, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC63313b(runnable));
        if (eVar != null) {
            yVar = C63326d.m114817a(eVar);
        } else {
            yVar = null;
        }
        AbstractC88986z c2 = c.mo143271a(yVar).mo143288c(new C63316b(eVar));
        C89219l.m154716b(c2, "");
        m114812a(str, (AbstractC88412b) c2);
    }

    /* renamed from: a */
    public static void m114811a(String str, C63329e eVar, Runnable runnable, Runnable runnable2) {
        AbstractC88985y yVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(runnable, "");
        C89219l.m154721d(runnable2, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC63314c(runnable));
        if (eVar != null) {
            yVar = C63326d.m114817a(eVar);
        } else {
            yVar = null;
        }
        AbstractC88986z c2 = c.mo143271a(yVar).mo143288c(new C63315d(runnable2, eVar, eVar));
        C89219l.m154716b(c2, "");
        m114812a(str, (AbstractC88412b) c2);
    }
}
