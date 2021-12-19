package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.ab */
public final class C17084ab implements AbstractC17128o {

    /* renamed from: d */
    public static final C17085a f40653d = new C17085a((byte) 0);

    /* renamed from: a */
    public final C17098ah<String, C17144y> f40654a;

    /* renamed from: b */
    public final LinkedHashSet<String> f40655b = new LinkedHashSet<>();

    /* renamed from: c */
    public final AbstractC17115g f40656c;

    /* renamed from: e */
    private final AbstractC17117i f40657e;

    /* renamed from: f */
    private final Executor f40658f;

    static {
        Covode.recordClassIndex(19541);
    }

    /* renamed from: com.bytedance.ies.d.a.ab$a */
    public static final class C17085a {
        static {
            Covode.recordClassIndex(19542);
        }

        private C17085a() {
        }

        public /* synthetic */ C17085a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: a */
    public final void mo26994a(String str, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3, C17091ad adVar) {
        boolean z;
        C89219l.m154719c(adVar, "");
        C17130q.m31653a("Start request: ".concat(String.valueOf(adVar)));
        SortedMap<String, AbstractC17099ai> sortedMap4 = adVar.f40673e;
        JSONObject jSONObject = null;
        SortedMap<String, String> a = sortedMap4 != null ? m31561a(sortedMap, sortedMap2, null, sortedMap4) : null;
        SortedMap<String, AbstractC17099ai> sortedMap5 = adVar.f40674f;
        if (sortedMap5 != null) {
            jSONObject = C17105ak.m31593a(m31561a(sortedMap, sortedMap2, null, sortedMap5));
        }
        C17147z zVar = new C17147z(adVar.f40669a, adVar.f40670b, adVar.f40672d, a, jSONObject, adVar.f40676h, adVar.f40677i);
        String str2 = zVar.f40779c;
        Locale locale = Locale.ROOT;
        C89219l.m154709a((Object) locale, "");
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(locale);
            C89219l.m154709a((Object) lowerCase, "");
            if (C89219l.m154714a((Object) lowerCase, (Object) UGCMonitor.TYPE_POST)) {
                z = true;
            } else {
                C17144y a2 = this.f40654a.mo27002a(zVar.toString());
                if (a2 != null) {
                    z = m31562a(a2);
                } else {
                    z = true;
                }
            }
            m31560a(str, zVar, adVar.f40675g, false, z);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: a */
    public final void mo26991a() {
        this.f40654a.mo27006b();
        AbstractC17115g gVar = this.f40656c;
        if (gVar != null) {
            gVar.mo27021a("__prefetch_cache_key_array", this.f40655b);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.ab$c */
    static final class RunnableC17087c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17084ab f40663a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40664b;

        static {
            Covode.recordClassIndex(19544);
        }

        RunnableC17087c(C17084ab abVar, AbstractC89171a aVar) {
            this.f40663a = abVar;
            this.f40664b = aVar;
        }

        public final void run() {
            AbstractC17115g gVar = this.f40663a.f40656c;
            if (gVar != null) {
                Collection<String> b = gVar.mo27022b("__prefetch_cache_key_array");
                if (b == null) {
                    C17130q.m31653a("Nothing found in LocalStorage.");
                    gVar.mo27019a();
                    return;
                }
                for (String str : b) {
                    String a = gVar.mo27018a(str);
                    if (a != null) {
                        try {
                            C17144y a2 = C17144y.C17145a.m31677a(new JSONObject(a));
                            if (C17084ab.m31562a(a2)) {
                                gVar.mo27023c(str);
                            } else {
                                this.f40663a.f40654a.mo27003a(str, a2);
                                this.f40663a.f40655b.add(str);
                            }
                        } catch (JSONException e) {
                            C17130q.m31654a("Failed to load cache at ".concat(String.valueOf(str)), e);
                        }
                    }
                }
            }
            this.f40664b.invoke();
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: a */
    public final void mo26993a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f40658f.execute(new RunnableC17087c(this, aVar));
    }

    /* renamed from: com.bytedance.ies.d.a.ab$b */
    public static final class C17086b implements AbstractC17117i.AbstractC17118a {

        /* renamed from: a */
        final /* synthetic */ C17084ab f40659a;

        /* renamed from: b */
        final /* synthetic */ String f40660b;

        /* renamed from: c */
        final /* synthetic */ C17144y f40661c;

        /* renamed from: d */
        final /* synthetic */ C17147z f40662d;

        static {
            Covode.recordClassIndex(19543);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i.AbstractC17118a
        /* renamed from: a */
        public final void mo26997a(Throwable th) {
            C89219l.m154719c(th, "");
            C17130q.m31653a("Request failed, url: " + this.f40660b);
            this.f40661c.mo26997a(th);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i.AbstractC17118a
        /* renamed from: a */
        public final void mo26996a(AbstractC17117i.C17120c cVar) {
            C89219l.m154719c(cVar, "");
            C17130q.m31653a("Received response, url: " + this.f40660b);
            this.f40661c.mo26996a(cVar);
            if (this.f40661c.f40775j > 0) {
                C17130q.m31653a("Putting to cache, key: " + this.f40662d + ", expires: " + this.f40661c.f40775j);
                this.f40659a.mo26992a(this.f40662d, this.f40661c);
            }
        }

        C17086b(C17084ab abVar, String str, C17144y yVar, C17147z zVar) {
            this.f40659a = abVar;
            this.f40660b = str;
            this.f40661c = yVar;
            this.f40662d = zVar;
        }
    }

    /* renamed from: a */
    public static boolean m31562a(C17144y yVar) {
        if ((System.currentTimeMillis() - yVar.f40774i) - yVar.f40775j > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m31563c(C17147z zVar) {
        String zVar2 = zVar.toString();
        this.f40654a.mo27005b(zVar2);
        AbstractC17115g gVar = this.f40656c;
        if (gVar != null) {
            if (this.f40655b.remove(zVar2)) {
                gVar.mo27021a("__prefetch_cache_key_array", this.f40655b);
            }
            gVar.mo27023c(zVar2);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: b */
    public final C17144y mo26995b(C17147z zVar) {
        C89219l.m154719c(zVar, "");
        C17130q.m31653a("Skip Cache to normal fetch for " + zVar + '.');
        return m31560a((String) null, zVar, -1L, true, true);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: a */
    public final C17144y mo26989a(C17147z zVar) {
        String a;
        Object obj;
        C89219l.m154719c(zVar, "");
        C17130q.m31653a("Start to get from cache for " + zVar + '.');
        String zVar2 = zVar.toString();
        C17144y a2 = this.f40654a.mo27002a(zVar2);
        if (a2 == null) {
            C17130q.m31653a("Not found in lruCache.");
            AbstractC17115g gVar = this.f40656c;
            if (!(gVar == null || (a = gVar.mo27018a(zVar2)) == null)) {
                try {
                    obj = C89379q.m157068constructorimpl(C17144y.C17145a.m31677a(new JSONObject(a)));
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                if (C89379q.m157073isFailureimpl(obj)) {
                    obj = null;
                }
                C17144y yVar = (C17144y) obj;
                if (yVar == null || m31562a(yVar)) {
                    C17130q.m31653a("Found in local storage but expired.");
                    m31563c(zVar);
                } else {
                    C17130q.m31653a("Found in local storage.");
                    yVar.mo27045a(C17144y.EnumC17146b.CACHED);
                    mo26992a(zVar, yVar);
                    return yVar;
                }
            }
        } else if (!m31562a(a2)) {
            C17130q.m31653a("Found in lruCache.");
            if (a2.f40771f != null) {
                a2.mo27045a(C17144y.EnumC17146b.CACHED);
            }
            return a2;
        } else {
            C17130q.m31653a("Found in lruCache but expired.");
            m31563c(zVar);
        }
        C17130q.m31653a("Fallback to normal fetch.");
        return m31560a((String) null, zVar, -1L, true, true);
    }

    /* renamed from: com.bytedance.ies.d.a.ab$d */
    static final class C17088d extends AbstractC89220m implements AbstractC89183m<String, C17144y, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C17084ab f40665a;

        static {
            Covode.recordClassIndex(19545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17088d(C17084ab abVar) {
            super(2);
            this.f40665a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(String str, C17144y yVar) {
            C17144y yVar2 = yVar;
            C89219l.m154719c(str, "");
            C89219l.m154719c(yVar2, "");
            return Boolean.valueOf(C17084ab.m31562a(yVar2));
        }
    }

    /* renamed from: com.bytedance.ies.d.a.ab$e */
    static final class C17089e extends AbstractC89220m implements AbstractC89183m<String, C17144y, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17084ab f40666a;

        static {
            Covode.recordClassIndex(19546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17089e(C17084ab abVar) {
            super(2);
            this.f40666a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, C17144y yVar) {
            String str2 = str;
            C17144y yVar2 = yVar;
            C89219l.m154719c(str2, "");
            C89219l.m154719c(yVar2, "");
            AbstractC17115g gVar = this.f40666a.f40656c;
            if (gVar != null) {
                gVar.mo27023c(str2);
                this.f40666a.f40655b.remove(str2);
                gVar.mo27021a("__prefetch_cache_key_array", this.f40666a.f40655b);
            }
            C17130q.m31653a("PrefetchRequest " + yVar2.f40773h.f40778b + " expired(expires: " + yVar2.f40775j + "), removed from cache.");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo26992a(C17147z zVar, C17144y yVar) {
        AbstractC17115g gVar;
        if (yVar.f40775j > 0) {
            String zVar2 = zVar.toString();
            this.f40654a.mo27003a(zVar2, yVar);
            if (yVar.f40771f != null && (gVar = this.f40656c) != null) {
                if (this.f40655b.add(zVar2)) {
                    gVar.mo27021a("__prefetch_cache_key_array", this.f40655b);
                }
                String jSONObject = yVar.mo27043a().toString();
                C89219l.m154709a((Object) jSONObject, "");
                gVar.mo27020a(zVar2, jSONObject);
            }
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17128o
    /* renamed from: a */
    public final List<C17144y> mo26990a(String str, AbstractC17116h hVar) {
        C89219l.m154719c(str, "");
        C17130q.m31653a("Start to get cache by " + str + '.');
        ArrayList arrayList = null;
        for (T t : this.f40654a.mo27004a().values()) {
            if (C89219l.m154714a((Object) str, (Object) t.f40772g)) {
                if (!m31562a((C17144y) t)) {
                    C17130q.m31653a(t.f40773h.f40778b + " found in lruCache.");
                    if (t.f40771f != null) {
                        t.mo27045a(C17144y.EnumC17146b.CACHED);
                    }
                    t.f40769d = t.f40774i;
                    t.f40767b = hVar;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t);
                } else {
                    C17130q.m31653a(t.f40773h.f40778b + " found in lruCache but expired.");
                    m31563c(t.f40773h);
                }
            }
        }
        return arrayList;
    }

    public C17084ab(AbstractC17115g gVar, AbstractC17117i iVar, Executor executor, int i) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(executor, "");
        this.f40656c = gVar;
        this.f40657e = iVar;
        this.f40658f = executor;
        this.f40654a = new C17098ah<>(i, new C17088d(this), new C17089e(this));
    }

    /* renamed from: a */
    private static SortedMap<String, String> m31561a(SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3, SortedMap<String, AbstractC17099ai> sortedMap4) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, AbstractC17099ai> entry : sortedMap4.entrySet()) {
            AbstractC17099ai value = entry.getValue();
            if (value instanceof C17097ag) {
                str = entry.getValue().f40699a;
            } else if (value instanceof C17106al) {
                if (sortedMap3 != null) {
                    str = sortedMap3.get(entry.getValue().f40699a);
                }
                C17130q.m31653a("No param '" + entry.getValue().f40699a + "' found.");
            } else if (value instanceof C17134t) {
                if (sortedMap != null) {
                    str = sortedMap.get(entry.getValue().f40699a);
                }
                C17130q.m31653a("No param '" + entry.getValue().f40699a + "' found.");
            } else {
                if (sortedMap2 != null) {
                    str = sortedMap2.get(entry.getValue().f40699a);
                }
                C17130q.m31653a("No param '" + entry.getValue().f40699a + "' found.");
            }
            if (str != null) {
                String key = entry.getKey();
                C89219l.m154709a((Object) key, "");
                treeMap.put(key, str);
                C17130q.m31653a("Append param: " + entry.getKey() + " = " + str);
            }
            C17130q.m31653a("No param '" + entry.getValue().f40699a + "' found.");
        }
        return treeMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.p1191d.p1192a.C17144y m31560a(java.lang.String r11, com.bytedance.ies.p1191d.p1192a.C17147z r12, long r13, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17084ab.m31560a(java.lang.String, com.bytedance.ies.d.a.z, long, boolean, boolean):com.bytedance.ies.d.a.y");
    }
}
