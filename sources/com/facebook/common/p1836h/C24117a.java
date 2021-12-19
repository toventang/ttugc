package com.facebook.common.p1836h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1832d.C24091i;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.common.h.a */
public final class C24117a<T> implements Closeable, Cloneable {

    /* renamed from: b */
    private static Class<C24117a> f57047b = C24117a.class;

    /* renamed from: d */
    private static final AbstractC24120c<Closeable> f57048d = new AbstractC24120c<Closeable>() {
        /* class com.facebook.common.p1836h.C24117a.C241181 */

        static {
            Covode.recordClassIndex(28246);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.facebook.common.p1836h.AbstractC24120c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo39665a(Closeable closeable) {
            try {
                C24083b.m45599a(closeable);
            } catch (IOException unused) {
            }
        }
    };

    /* renamed from: a */
    public final C24121d<T> f57049a;

    /* renamed from: c */
    private boolean f57050c;

    static {
        Covode.recordClassIndex(28245);
    }

    /* renamed from: b */
    public final synchronized C24117a<T> clone() {
        C24117a<T> aVar;
        MethodCollector.m26663i(12032);
        C24091i.m45622b(mo39700d());
        aVar = new C24117a<>(this.f57049a);
        MethodCollector.m26664o(12032);
        return aVar;
    }

    /* renamed from: c */
    public final synchronized C24117a<T> mo39697c() {
        MethodCollector.m26663i(12033);
        if (mo39700d()) {
            C24117a<T> b = clone();
            MethodCollector.m26664o(12033);
            return b;
        }
        MethodCollector.m26664o(12033);
        return null;
    }

    /* renamed from: d */
    public final synchronized boolean mo39700d() {
        MethodCollector.m26663i(12168);
        if (!this.f57050c) {
            MethodCollector.m26664o(12168);
            return true;
        }
        MethodCollector.m26664o(12168);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r1 = r9.f57049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1.mo39704c() != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r6 = r1.f57055b;
        r1.f57055b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r1.f57056c.mo39665a(r6);
        r5 = com.facebook.common.p1836h.C24121d.f57054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = com.facebook.common.p1836h.C24121d.f57054a.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        com.facebook.common.p1833e.C24099a.m45660d("SharedReference", "No entry in sLiveObjects for value of type %s", r6.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r2.intValue() != 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        com.facebook.common.p1836h.C24121d.f57054a.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        com.facebook.common.p1836h.C24121d.f57054a.put(r6, java.lang.Integer.valueOf(r2.intValue() - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12316);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12316);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12316);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        return;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p1836h.C24117a.close():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r2 = com.facebook.common.p1836h.C24117a.f57047b;
        r7 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r9));
        r6 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r9.f57049a));
        r4 = r9.f57049a.mo39702a().getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (com.facebook.common.p1833e.C24099a.f57025a.mo39656b(3) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        com.facebook.common.p1833e.C24099a.f57025a.mo39654b(r2.getSimpleName(), com.C1764a.m5929a(null, "Finalized without closing: %x %x (type = %s)", new java.lang.Object[]{r7, r6, r4}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        close();
        super.finalize();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12547);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        return;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p1836h.C24117a.finalize():void");
    }

    /* renamed from: a */
    public final synchronized T mo39695a() {
        boolean z;
        T a;
        MethodCollector.m26663i(12031);
        if (!this.f57050c) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        a = this.f57049a.mo39702a();
        MethodCollector.m26664o(12031);
        return a;
    }

    /* renamed from: c */
    public static void m45712c(C24117a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    private C24117a(C24121d<T> dVar) {
        this.f57049a = (C24121d) C24091i.m45617a(dVar);
        dVar.mo39703b();
    }

    /* renamed from: a */
    public static <T extends Closeable> C24117a<T> m45706a(T t) {
        if (t == null) {
            return null;
        }
        return new C24117a<>(t, f57048d);
    }

    /* renamed from: b */
    public static <T> C24117a<T> m45711b(C24117a<T> aVar) {
        if (aVar != null) {
            return aVar.mo39697c();
        }
        return null;
    }

    /* renamed from: a */
    public static <T> List<C24117a<T>> m45708a(Collection<C24117a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (C24117a<T> aVar : collection) {
            arrayList.add(m45711b(aVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m45709a(Iterable<? extends C24117a<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends C24117a<?>> it = iterable.iterator();
            while (it.hasNext()) {
                m45712c((C24117a) it.next());
            }
        }
    }

    /* renamed from: a */
    public static boolean m45710a(C24117a<?> aVar) {
        if (aVar == null || !aVar.mo39700d()) {
            return false;
        }
        return true;
    }

    private C24117a(T t, AbstractC24120c<T> cVar) {
        this.f57049a = new C24121d<>(t, cVar);
    }

    /* renamed from: a */
    public static <T> C24117a<T> m45707a(T t, AbstractC24120c<T> cVar) {
        if (t == null) {
            return null;
        }
        return new C24117a<>(t, cVar);
    }
}
