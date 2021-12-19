package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4492d.C87308a;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87327a;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.toutiao.proxyserver.i */
public final class C87343i extends AbstractC87275a {

    /* renamed from: m */
    final Object f197970m = this;

    /* renamed from: n */
    public Exception f197971n;

    /* renamed from: o */
    private int f197972o;

    /* renamed from: p */
    private final AbstractC87347b f197973p;

    /* renamed from: q */
    private final boolean f197974q;

    /* renamed from: r */
    private AbstractC87368q f197975r;

    /* renamed from: s */
    private int f197976s;

    /* renamed from: com.toutiao.proxyserver.i$b */
    public interface AbstractC87347b {
        static {
            Covode.recordClassIndex(103243);
        }

        /* renamed from: a */
        void mo141388a(C87343i iVar);

        /* renamed from: b */
        void mo141389b(C87343i iVar);
    }

    static {
        Covode.recordClassIndex(103239);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.i$a */
    public static final class C87346a {

        /* renamed from: a */
        String f197985a;

        /* renamed from: b */
        String f197986b;

        /* renamed from: c */
        C87289ad f197987c;

        /* renamed from: d */
        AbstractC87368q f197988d;

        /* renamed from: e */
        AbstractC87294b f197989e;

        /* renamed from: f */
        C87301c f197990f;

        /* renamed from: g */
        List<C87360c> f197991g;

        /* renamed from: h */
        int f197992h;

        /* renamed from: i */
        C87403y f197993i;

        /* renamed from: j */
        AbstractC87347b f197994j;

        /* renamed from: k */
        boolean f197995k;

        static {
            Covode.recordClassIndex(103242);
        }

        C87346a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87343i mo141386a() {
            if (this.f197989e != null && this.f197990f != null && (this.f197988d != null || (!TextUtils.isEmpty(this.f197985a) && !TextUtils.isEmpty(this.f197986b) && this.f197987c != null))) {
                return new C87343i(this);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87346a mo141381a(C87289ad adVar) {
            if (adVar != null) {
                this.f197987c = adVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87346a mo141382a(AbstractC87294b bVar) {
            if (bVar != null) {
                this.f197989e = bVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C87346a mo141387b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f197986b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87346a mo141383a(C87301c cVar) {
            if (cVar != null) {
                this.f197990f = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87346a mo141384a(AbstractC87368q qVar) {
            if (qVar != null) {
                this.f197988d = qVar;
                return this;
            }
            throw new IllegalArgumentException("urlsLazyProvider is NULL");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87346a mo141385a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f197985a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }
    }

    @Override // com.toutiao.proxyserver.AbstractC87275a
    /* renamed from: a */
    public final void mo141290a() {
        super.mo141290a();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0007 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0007 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.toutiao.proxyserver.a, com.toutiao.proxyserver.i] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Throwable, com.toutiao.proxyserver.z] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Throwable, com.toutiao.proxyserver.x$a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m151588k() {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87343i.m151588k():boolean");
    }

    public final void run() {
        AbstractC87368q qVar;
        try {
            if (this.f197796j == null && (qVar = this.f197975r) != null) {
                String[] a = qVar.mo124056a();
                if (a == null || a.length <= 0) {
                    C87383u.m151659a(1, "lazy provide lazy url fail, provide empty urls.");
                    return;
                }
                this.f197796j = new C87289ad(C87328b.m151549a(a));
                this.f197793g = this.f197975r.mo124058c();
                this.f197794h = C87327a.m151540a(this.f197793g);
                C87312c.m151524b("TAG_PROXY_DownloadTask", "lazy preload rawKey:" + this.f197793g + ", key:" + this.f197794h, null);
                if (!TextUtils.isEmpty(this.f197794h)) {
                    String a2 = C87327a.m151540a(this.f197794h);
                    File e = this.f197787a.mo141331e(a2);
                    int b = this.f197975r.mo124057b();
                    if (b > 0) {
                        this.f197972o = b;
                    }
                    if (e != null && e.length() >= ((long) this.f197972o)) {
                        C87312c.m151524b("TAG_PROXY_DownloadTask", "lazy no need preload, file size: " + e.length() + ", need preload size: " + this.f197972o, null);
                        return;
                    } else if (C87385v.m151666a().mo141434a(mo141307g(), a2)) {
                        C87312c.m151525c("TAG_PROXY_DownloadTask", "lazy has pending proxy task, skip preload for key: " + this.f197794h, null);
                        return;
                    } else {
                        AbstractC87347b bVar = this.f197973p;
                        if (bVar != null) {
                            bVar.mo141388a(this);
                        }
                    }
                } else {
                    return;
                }
            }
            try {
                this.f197787a.mo141328b(this.f197794h);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    m151588k();
                } catch (C87309e e2) {
                    C87312c.m151525c("TAG_PROXY_DownloadTask", C87312c.m151522a(e2), this.f197793g);
                    if (this.f197974q) {
                        mo141292a(this.f197976s, this.f197793g);
                    }
                }
                this.f197790d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f197787a.mo141329c(this.f197794h);
                AbstractC87347b bVar2 = this.f197973p;
                if (bVar2 != null) {
                    bVar2.mo141389b(this);
                }
            } catch (C87308a unused) {
                AbstractC87347b bVar3 = this.f197973p;
                if (bVar3 != null) {
                    bVar3.mo141389b(this);
                }
            }
        } catch (Exception e3) {
            C87383u.m151659a(1, "lazy provide lazy url fail:" + e3.toString());
        }
    }

    C87343i(C87346a aVar) {
        super(aVar.f197989e, aVar.f197990f);
        int i;
        this.f197972o = aVar.f197992h;
        this.f197973p = aVar.f197994j;
        this.f197793g = aVar.f197985a;
        this.f197794h = aVar.f197986b;
        this.f197791e = aVar.f197991g;
        this.f197796j = aVar.f197987c;
        this.f197795i = aVar.f197993i;
        this.f197974q = aVar.f197995k;
        this.f197975r = aVar.f197988d;
        if (!C13603b.m24435a((Collection) this.f197791e)) {
            Iterator it = this.f197791e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C87360c cVar = (C87360c) it.next();
                if (TextUtils.equals(cVar.f198014a, "cache_scene") && TextUtils.equals(cVar.f198015b, "music")) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        this.f197976s = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0431 A[SYNTHETIC, Splitter:B:130:0x0431] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0519 A[SYNTHETIC, Splitter:B:193:0x0519] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016d A[SYNTHETIC, Splitter:B:39:0x016d] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0280 A[Catch:{ IOException -> 0x045c, Exception -> 0x0457, all -> 0x0455 }, LOOP:0: B:65:0x0280->B:87:0x031c, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151586b(java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 1314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87343i.m151586b(java.lang.String):void");
    }

    /* renamed from: c */
    private void m151587c(final int i, final int i2) {
        final AbstractC87366o oVar = C87383u.f198087g;
        if (oVar != null) {
            C87328b.m151562b(new Runnable() {
                /* class com.toutiao.proxyserver.C87343i.RunnableC873452 */

                /* renamed from: b */
                final /* synthetic */ boolean f197979b = false;

                /* renamed from: c */
                final /* synthetic */ int f197980c = 0;

                /* renamed from: f */
                final /* synthetic */ int f197983f;

                static {
                    Covode.recordClassIndex(103241);
                }

                public final void run() {
                    AbstractC87366o oVar = oVar;
                    C87343i.this.mo141307g();
                    String str = C87343i.this.f197793g;
                    oVar.mo124033a();
                }

                {
                    this.f197983f = 0;
                }
            });
        }
    }
}
