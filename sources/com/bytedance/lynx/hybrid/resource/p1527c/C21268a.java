package com.bytedance.lynx.hybrid.resource.p1527c;

import android.os.FileObserver;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.c.a */
public final class C21268a {

    /* renamed from: d */
    public static final C21269a f50473d = new C21269a((byte) 0);

    /* renamed from: a */
    public LruCache<String, byte[]> f50474a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, C21294e> f50475b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, FileObserver> f50476c;

    static {
        Covode.recordClassIndex(24884);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$a */
    public static final class C21269a {
        static {
            Covode.recordClassIndex(24885);
        }

        private C21269a() {
        }

        public /* synthetic */ C21269a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$b */
    public static final class C21270b {

        /* renamed from: a */
        public static final C21268a f50477a = new C21268a((byte) 0);

        /* renamed from: b */
        public static final C21270b f50478b = new C21270b();

        private C21270b() {
        }

        static {
            Covode.recordClassIndex(24886);
        }
    }

    private C21268a() {
        this.f50475b = new ConcurrentHashMap<>();
        this.f50476c = new ConcurrentHashMap<>();
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$d */
    public static final class CallableC21272d<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21268a f50480a;

        /* renamed from: b */
        final /* synthetic */ List f50481b;

        /* renamed from: c */
        final /* synthetic */ String f50482c;

        static {
            Covode.recordClassIndex(24888);
        }

        public CallableC21272d(C21268a aVar, List list, String str) {
            this.f50480a = aVar;
            this.f50481b = list;
            this.f50482c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            LruCache<String, byte[]> lruCache;
            try {
                if ((!this.f50481b.isEmpty()) && (lruCache = this.f50480a.f50474a) != null) {
                    lruCache.put(this.f50482c, C89070n.m154569c((Collection<Byte>) this.f50481b));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C21268a(byte b) {
        this();
    }

    /* renamed from: a */
    public final byte[] mo34847a(String str) {
        boolean z;
        LruCache<String, byte[]> lruCache;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (lruCache = this.f50474a) != null) {
            return lruCache.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final C21294e mo34848b(String str) {
        byte[] bArr;
        MethodCollector.m26663i(5033);
        C89219l.m154719c(str, "");
        C21294e eVar = this.f50475b.get(str);
        if (eVar == null) {
            MethodCollector.m26664o(5033);
            return null;
        }
        C89219l.m154709a((Object) eVar, "");
        C21335j a = m39973a(new C21335j(eVar.f50546m, false, null, 0, 2046), eVar);
        a.f50660b = str;
        LruCache<String, byte[]> lruCache = this.f50474a;
        if (!(lruCache == null || (bArr = lruCache.get(str)) == null)) {
            a.f50553t = new ByteArrayInputStream(bArr);
        }
        MethodCollector.m26664o(5033);
        return a;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$c */
    public static final class C21271c extends LruCache<String, byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f50479a;

        static {
            Covode.recordClassIndex(24887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21271c(int i, int i2) {
            super(i2);
            this.f50479a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, byte[] bArr) {
            byte[] bArr2 = bArr;
            if (bArr2 != null) {
                return bArr2.length;
            }
            return 0;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$e */
    public static final class FileObserverC21273e extends FileObserver {

        /* renamed from: a */
        final /* synthetic */ C21268a f50483a;

        /* renamed from: b */
        final /* synthetic */ String f50484b;

        /* renamed from: c */
        final /* synthetic */ C21294e f50485c;

        /* renamed from: d */
        final /* synthetic */ int f50486d = 1536;

        static {
            Covode.recordClassIndex(24889);
        }

        public final void onEvent(int i, String str) {
            if (i == 512 || i == 1024) {
                C21268a aVar = this.f50483a;
                String str2 = this.f50484b;
                C89219l.m154719c(str2, "");
                if (str2.length() != 0) {
                    aVar.f50475b.remove(str2);
                    LruCache<String, byte[]> lruCache = aVar.f50474a;
                    if (lruCache != null) {
                        lruCache.remove(str2);
                    }
                    aVar.f50476c.remove(str2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FileObserverC21273e(C21268a aVar, String str, C21294e eVar, String str2) {
            super(str2, 1536);
            this.f50483a = aVar;
            this.f50484b = str;
            this.f50485c = eVar;
        }
    }

    /* renamed from: a */
    private static C21335j m39973a(C21335j jVar, C21294e eVar) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(eVar, "");
        jVar.f50547n = eVar.f50547n;
        jVar.f50548o = eVar.f50548o;
        jVar.f50549p = eVar.f50549p;
        jVar.f50550q = eVar.f50550q;
        jVar.f50551r = eVar.f50551r;
        jVar.f50552s = eVar.f50552s;
        jVar.f50553t = eVar.f50553t;
        jVar.f50554u = eVar.f50554u;
        if (eVar instanceof C21335j) {
            C21335j jVar2 = (C21335j) eVar;
            jVar.mo34939d(jVar2.f50665g);
            jVar.f50660b = jVar2.f50660b;
            jVar.f50666h = jVar2.f50666h;
        }
        jVar.mo34904f(eVar.f50555v);
        jVar.f50556w = eVar.f50556w;
        jVar.mo34903e(eVar.f50542i);
        jVar.mo34900a(eVar.f50544k);
        jVar.f50543j = eVar.f50543j;
        return jVar;
    }
}
