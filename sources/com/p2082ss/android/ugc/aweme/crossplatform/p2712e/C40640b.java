package com.p2082ss.android.ugc.aweme.crossplatform.p2712e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1191d.p1192a.AbstractC17075a;
import com.bytedance.ies.p1191d.p1192a.AbstractC17114f;
import com.bytedance.ies.p1191d.p1192a.AbstractC17115g;
import com.bytedance.ies.p1191d.p1192a.AbstractC17116h;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.p1191d.p1192a.AbstractC17122k;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import com.bytedance.ies.p1191d.p1192a.C17147z;
import com.bytedance.ies.p1191d.p1192a.p1193a.C17076a;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b */
public final class C40640b {

    /* renamed from: a */
    static final ExecutorService f95211a;

    /* renamed from: b */
    public static boolean f95212b;

    /* renamed from: c */
    static AbstractC17117i f95213c;

    /* renamed from: d */
    static C17076a f95214d;

    /* renamed from: e */
    public static final C40640b f95215e = new C40640b();

    /* renamed from: f */
    private static String f95216f;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$c */
    public static final class C40643c implements AbstractC17122k {
        static {
            Covode.recordClassIndex(48483);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17122k
        /* renamed from: a */
        public final void mo27036a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17122k
        /* renamed from: a */
        public final void mo27037a(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
        }

        C40643c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$d */
    public static final class C40644d implements AbstractC17116h {
        static {
            Covode.recordClassIndex(48484);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17116h
        /* renamed from: a */
        public final void mo27025a(C17147z zVar, C17144y.EnumC17146b bVar) {
            C89219l.m154721d(zVar, "");
            C89219l.m154721d(bVar, "");
        }

        C40644d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$e */
    public static final class C40645e implements AbstractC17117i {
        static {
            Covode.recordClassIndex(48485);
        }

        C40645e() {
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
        /* renamed from: b */
        public final void mo27028b(String str, Map<String, String> map, AbstractC17117i.AbstractC17118a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(aVar, "");
            AbstractC17117i.C17119b.m31625a(this, str, map, aVar);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
        /* renamed from: a */
        public final void mo27026a(String str, Map<String, String> map, AbstractC17117i.AbstractC17118a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(aVar, "");
            AbstractC17117i iVar = C40640b.f95213c;
            if (iVar != null) {
                iVar.mo27026a(str, map, aVar);
            }
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
        /* renamed from: b */
        public final void mo27029b(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17117i.AbstractC17118a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(jSONObject, "");
            C89219l.m154721d(aVar, "");
            AbstractC17117i.C17119b.m31626a(this, str, map, str2, jSONObject, aVar);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
        /* renamed from: a */
        public final void mo27027a(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17117i.AbstractC17118a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(jSONObject, "");
            C89219l.m154721d(aVar, "");
            AbstractC17117i iVar = C40640b.f95213c;
            if (iVar != null) {
                iVar.mo27027a(str, map, str2, jSONObject, aVar);
            }
        }
    }

    private C40640b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$b */
    public static final class C40642b implements AbstractC17114f {

        /* renamed from: a */
        final /* synthetic */ String f95218a;

        static {
            Covode.recordClassIndex(48482);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17114f
        /* renamed from: a */
        public final List<String> mo27024a() {
            return C89070n.m154516a(this.f95218a);
        }

        C40642b(String str) {
            this.f95218a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$f */
    static final class C40646f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40646f f95219a = new C40646f();

        static {
            Covode.recordClassIndex(48486);
        }

        C40646f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            IAccountUserService e = AccountService.m65215a().mo57069e();
            C89219l.m154716b(e, "");
            return Boolean.valueOf(e.isLogin());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$g */
    public static final class CallableC40647g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC40647g f95220a = new CallableC40647g();

        static {
            Covode.recordClassIndex(48487);
        }

        CallableC40647g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a = C40640b.f95215e.mo69784a();
            if (a == null || a.length() == 0) {
                return "";
            }
            return a;
        }
    }

    static {
        Covode.recordClassIndex(48480);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        f95211a = C40780g.m82242a(a.mo70028a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo69784a() {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 6373(0x18e5, float:8.93E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r1)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = com.p2082ss.android.ugc.aweme.crossplatform.p2712e.C40640b.f95216f     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = com.p2082ss.android.ugc.aweme.crossplatform.p2712e.C40640b.f95216f     // Catch:{ all -> 0x0026 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r1)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return r0
        L_0x001d:
            java.lang.String r0 = m82010b()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r1)
            monitor-exit(r2)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.p2712e.C40640b.mo69784a():java.lang.String");
    }

    /* renamed from: b */
    private static String m82010b() {
        boolean z;
        MethodCollector.m26663i(6215);
        String b = C80333dc.m139277b(C81631k.f182525a.mo125297c(), "gecko_hybrid_prefetch_config");
        if (TextUtils.isEmpty(b)) {
            MethodCollector.m26664o(6215);
            return null;
        }
        File file = new File(b);
        if (file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            C89219l.m154716b(listFiles, "");
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                for (File file2 : listFiles2) {
                    C89219l.m154716b(file2, "");
                    if (C89361p.m154872a("prefetch.json", file2.getName(), true)) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), C89338d.f202990a), 8192);
                            try {
                                String a = C89167q.m154662a((Reader) bufferedReader);
                                C89146c.m154636a(bufferedReader, null);
                                f95216f = a;
                                String.valueOf(a);
                                String str = f95216f;
                                MethodCollector.m26664o(6215);
                                return str;
                            } catch (Throwable th) {
                                C89146c.m154636a(bufferedReader, th);
                                MethodCollector.m26664o(6215);
                                throw th;
                            }
                        } catch (Exception e) {
                            C51423a.m95790a((Throwable) e);
                        }
                    }
                }
                MethodCollector.m26664o(6215);
                return null;
            }
        }
        MethodCollector.m26664o(6215);
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$a */
    public static final class C40641a implements AbstractC17115g {

        /* renamed from: a */
        final /* synthetic */ Keva f95217a;

        static {
            Covode.recordClassIndex(48481);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: a */
        public final void mo27019a() {
        }

        C40641a(Keva keva) {
            this.f95217a = keva;
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: a */
        public final String mo27018a(String str) {
            C89219l.m154721d(str, "");
            return this.f95217a.getString(str, null);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: b */
        public final Collection<String> mo27022b(String str) {
            C89219l.m154721d(str, "");
            return this.f95217a.getStringSet(str, null);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: c */
        public final void mo27023c(String str) {
            C89219l.m154721d(str, "");
            this.f95217a.erase(str);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: a */
        public final void mo27020a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f95217a.storeString(str, str2);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
        /* renamed from: a */
        public final void mo27021a(String str, Collection<String> collection) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(collection, "");
            this.f95217a.storeStringSet(str, (Set) collection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$h */
    public static final class C40648h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C18364w f95221a;

        /* renamed from: b */
        final /* synthetic */ String f95222b;

        static {
            Covode.recordClassIndex(48488);
        }

        public C40648h(C18364w wVar, String str) {
            this.f95221a = wVar;
            this.f95222b = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C40640b bVar = C40640b.f95215e;
            C89219l.m154716b(iVar, "");
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            String str = (String) d;
            C89219l.m154721d(str, "");
            Keva repo = Keva.getRepo("KEY_PREFETCH_CACHE");
            C17076a.C17078b a = C17076a.C17077a.m31550a();
            a.f40642i = 32;
            a.f40641h = false;
            AbstractC17075a a2 = a.mo26977a(new C40641a(repo)).mo26976a(new C40642b(str)).mo26980a(new C40643c()).mo26978a(new C40644d());
            C89086z zVar = C89086z.INSTANCE;
            C89219l.m154719c(zVar, "");
            a2.f40638e = zVar;
            AbstractC17075a a3 = a2.mo26979a(new C40645e());
            ExecutorService executorService = C40640b.f95211a;
            C89219l.m154716b(executorService, "");
            AbstractC17075a a4 = a3.mo26981a(executorService);
            C40646f fVar = C40646f.f95219a;
            C89219l.m154719c("login", "");
            C89219l.m154719c(fVar, "");
            if (a4.f40644k == null) {
                a4.f40644k = new LinkedHashMap();
            } else {
                Map<String, AbstractC89171a<Boolean>> map = a4.f40644k;
                if (map == null) {
                    C89219l.m154707a();
                }
                map.put("login", fVar);
            }
            C40640b.f95214d = (C17076a) a4.mo26982a();
            if (!C89361p.m154870a((CharSequence) str) && bVar != null) {
                C40640b.f95212b = true;
            }
            C40640b.m82009a(this.f95221a, this.f95222b);
            return null;
        }
    }

    /* renamed from: a */
    public static void m82009a(C18364w wVar, String str) {
        try {
            f95213c = C40635a.f95202c;
            C17076a aVar = f95214d;
            if (aVar != null) {
                C89219l.m154719c(wVar, "");
                wVar.mo29400a(aVar.f40648e, (AbstractC18334e.AbstractC18336b) new C17076a.C17079c(aVar));
            }
            C17076a aVar2 = f95214d;
            if (aVar2 != null) {
                aVar2.mo26985a(str);
            }
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
    }
}
