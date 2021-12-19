package com.bytedance.ies.bullet.kit.p1148a.p1150b;

import android.os.FileObserver;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.p1148a.C16342f;
import com.bytedance.ies.bullet.service.base.C16610ap;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.b.a */
public final class C16329a {

    /* renamed from: d */
    public static final C16330a f39229d = new C16330a((byte) 0);

    /* renamed from: a */
    public LruCache<String, byte[]> f39230a;

    /* renamed from: b */
    final ConcurrentHashMap<String, C16610ap> f39231b;

    /* renamed from: c */
    final ConcurrentHashMap<String, FileObserver> f39232c;

    static {
        Covode.recordClassIndex(18622);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$a */
    public static final class C16330a {
        static {
            Covode.recordClassIndex(18623);
        }

        private C16330a() {
        }

        public /* synthetic */ C16330a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$b */
    public static final class C16331b {

        /* renamed from: a */
        public static final C16329a f39233a = new C16329a((byte) 0);

        /* renamed from: b */
        public static final C16331b f39234b = new C16331b();

        private C16331b() {
        }

        static {
            Covode.recordClassIndex(18624);
        }
    }

    private C16329a() {
        this.f39231b = new ConcurrentHashMap<>();
        this.f39232c = new ConcurrentHashMap<>();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$d */
    public static final class CallableC16333d<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16329a f39236a;

        /* renamed from: b */
        final /* synthetic */ List f39237b;

        /* renamed from: c */
        final /* synthetic */ String f39238c;

        static {
            Covode.recordClassIndex(18626);
        }

        public CallableC16333d(C16329a aVar, List list, String str) {
            this.f39236a = aVar;
            this.f39237b = list;
            this.f39238c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            LruCache<String, byte[]> lruCache;
            try {
                if ((!this.f39237b.isEmpty()) && (lruCache = this.f39236a.f39230a) != null) {
                    lruCache.put(this.f39238c, C89070n.m154569c((Collection<Byte>) this.f39237b));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C16329a(byte b) {
        this();
    }

    /* renamed from: a */
    public final byte[] mo25905a(String str) {
        boolean z;
        LruCache<String, byte[]> lruCache;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (lruCache = this.f39230a) != null) {
            return lruCache.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final C16610ap mo25906b(String str) {
        byte[] bArr;
        MethodCollector.m26663i(6847);
        C89219l.m154719c(str, "");
        C16610ap apVar = this.f39231b.get(str);
        if (apVar == null) {
            MethodCollector.m26664o(6847);
            return null;
        }
        C89219l.m154709a((Object) apVar, "");
        C16342f a = m30340a(new C16342f(apVar.f39754n, false, null, 0, 2046), apVar);
        a.f39275b = str;
        LruCache<String, byte[]> lruCache = this.f39230a;
        if (!(lruCache == null || (bArr = lruCache.get(str)) == null)) {
            a.f39761u = new ByteArrayInputStream(bArr);
        }
        MethodCollector.m26664o(6847);
        return a;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$c */
    public static final class C16332c extends LruCache<String, byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f39235a;

        static {
            Covode.recordClassIndex(18625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16332c(int i, int i2) {
            super(i2);
            this.f39235a = i;
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

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$e */
    public static final class FileObserverC16334e extends FileObserver {

        /* renamed from: a */
        final /* synthetic */ C16329a f39239a;

        /* renamed from: b */
        final /* synthetic */ String f39240b;

        /* renamed from: c */
        final /* synthetic */ C16610ap f39241c;

        /* renamed from: d */
        final /* synthetic */ int f39242d = 1536;

        static {
            Covode.recordClassIndex(18627);
        }

        public final void onEvent(int i, String str) {
            if (i == 512 || i == 1024) {
                C16329a aVar = this.f39239a;
                String str2 = this.f39240b;
                C89219l.m154719c(str2, "");
                if (str2.length() != 0) {
                    aVar.f39231b.remove(str2);
                    LruCache<String, byte[]> lruCache = aVar.f39230a;
                    if (lruCache != null) {
                        lruCache.remove(str2);
                    }
                    aVar.f39232c.remove(str2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        FileObserverC16334e(C16329a aVar, String str, C16610ap apVar, String str2) {
            super(str2, 1536);
            this.f39239a = aVar;
            this.f39240b = str;
            this.f39241c = apVar;
        }
    }

    /* renamed from: a */
    public final void mo25904a(String str, C16610ap apVar) {
        String str2;
        C89219l.m154719c(str, "");
        C89219l.m154719c(apVar, "");
        if (str.length() != 0 && (str2 = apVar.f39755o) != null && str2.length() != 0) {
            try {
                FileObserverC16334e eVar = new FileObserverC16334e(this, str, apVar, apVar.f39755o);
                this.f39231b.put(str, apVar);
                FileObserver fileObserver = this.f39232c.get(str);
                if (fileObserver != null) {
                    fileObserver.stopWatching();
                }
                eVar.startWatching();
                this.f39232c.put(str, eVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static C16342f m30340a(C16342f fVar, C16610ap apVar) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(apVar, "");
        fVar.f39755o = apVar.f39755o;
        fVar.f39756p = apVar.f39756p;
        fVar.f39757q = apVar.f39757q;
        fVar.f39758r = apVar.f39758r;
        fVar.f39759s = apVar.f39759s;
        fVar.f39760t = apVar.f39760t;
        fVar.f39761u = apVar.f39761u;
        fVar.f39762v = apVar.f39762v;
        if (apVar instanceof C16342f) {
            C16342f fVar2 = (C16342f) apVar;
            fVar.mo25917d(fVar2.f39280g);
            fVar.f39275b = fVar2.f39275b;
            fVar.f39281h = fVar2.f39281h;
        }
        fVar.mo26375f(apVar.f39763w);
        fVar.f39764x = apVar.f39764x;
        fVar.mo26374e(apVar.f39749i);
        fVar.mo26373b(apVar.f39752l);
        fVar.mo26370a(apVar.f39751k);
        fVar.f39750j = apVar.f39750j;
        return fVar;
    }
}
