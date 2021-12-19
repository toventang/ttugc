package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.y */
public final class C17144y implements AbstractC17117i.AbstractC17118a {

    /* renamed from: k */
    public static final C17145a f40765k = new C17145a((byte) 0);

    /* renamed from: a */
    final transient Set<AbstractC17083aa> f40766a;

    /* renamed from: b */
    public transient AbstractC17116h f40767b;

    /* renamed from: c */
    public transient EnumC17146b f40768c;

    /* renamed from: d */
    public transient long f40769d;

    /* renamed from: e */
    public transient Throwable f40770e;

    /* renamed from: f */
    public AbstractC17117i.C17120c f40771f;

    /* renamed from: g */
    public final String f40772g;

    /* renamed from: h */
    public final C17147z f40773h;

    /* renamed from: i */
    public final long f40774i;

    /* renamed from: j */
    public final long f40775j;

    /* renamed from: com.bytedance.ies.d.a.y$b */
    public enum EnumC17146b {
        FALLBACK,
        PENDING,
        CACHED;

        static {
            Covode.recordClassIndex(19603);
        }
    }

    static {
        Covode.recordClassIndex(19601);
    }

    /* renamed from: com.bytedance.ies.d.a.y$a */
    public static final class C17145a {
        static {
            Covode.recordClassIndex(19602);
        }

        private C17145a() {
        }

        public /* synthetic */ C17145a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C17144y m31677a(JSONObject jSONObject) {
            SortedMap<String, String> sortedMap;
            C89219l.m154719c(jSONObject, "");
            String string = jSONObject.getString("page_url");
            C89219l.m154709a((Object) string, "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("request");
            C89219l.m154709a((Object) jSONObject2, "");
            C17144y yVar = new C17144y(string, new C17147z(jSONObject2), jSONObject.getLong("timestamp"), jSONObject.getLong("expires"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("response");
            new AbstractC17117i.C17120c();
            C89219l.m154709a((Object) jSONObject3, "");
            C89219l.m154719c(jSONObject3, "");
            AbstractC17117i.C17120c cVar = new AbstractC17117i.C17120c();
            JSONObject optJSONObject = jSONObject3.optJSONObject("headers");
            SortedMap<String, String> sortedMap2 = null;
            if (optJSONObject != null) {
                sortedMap = C17105ak.m31592a(optJSONObject);
            } else {
                sortedMap = null;
            }
            cVar.f40732c = sortedMap;
            cVar.f40731b = jSONObject3.optString("body");
            cVar.f40733d = jSONObject3.optInt("status_code");
            JSONObject optJSONObject2 = jSONObject3.optJSONObject("extra");
            if (optJSONObject2 != null) {
                sortedMap2 = C17105ak.m31592a(optJSONObject2);
            }
            cVar.f40734e = sortedMap2;
            yVar.f40771f = cVar;
            return yVar;
        }
    }

    /* renamed from: b */
    private final void m31671b() {
        String str;
        Class<?> cls;
        if (this.f40767b != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f40769d;
            AbstractC17116h hVar = this.f40767b;
            if (hVar != null) {
                hVar.mo27025a(this.f40773h, this.f40768c);
            }
            StringBuilder append = new StringBuilder("{ request: ").append(this.f40773h.f40778b).append("], duration: ").append(currentTimeMillis).append(", hitState: ").append(this.f40768c).append(", content: ").append(this.f40773h.mo27046a()).append(", error: ");
            Throwable th = this.f40770e;
            if (th == null || (cls = th.getClass()) == null) {
                str = null;
            } else {
                str = cls.getSimpleName();
            }
            C17130q.m31655b(append.append(str).append(" }").toString());
        }
    }

    /* renamed from: a */
    public final JSONObject mo27043a() {
        JSONObject jSONObject;
        JSONObject put = new JSONObject().put("page_url", this.f40772g).put("request", this.f40773h.mo27046a()).put("timestamp", this.f40774i).put("expires", this.f40775j);
        AbstractC17117i.C17120c cVar = this.f40771f;
        JSONObject jSONObject2 = null;
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            Map<String, String> map = cVar.f40732c;
            if (map != null) {
                jSONObject = C17105ak.m31593a(map);
            } else {
                jSONObject = null;
            }
            jSONObject3.put("headers", jSONObject);
            jSONObject3.put("body", cVar.mo27030a());
            jSONObject3.put("status_code", cVar.f40733d);
            Map<String, String> map2 = cVar.f40734e;
            if (map2 != null) {
                jSONObject2 = C17105ak.m31593a(map2);
            }
            jSONObject3.put("extra", jSONObject2);
            jSONObject2 = jSONObject3;
        }
        JSONObject put2 = put.put("response", jSONObject2);
        C89219l.m154709a((Object) put2, "");
        return put2;
    }

    /* renamed from: a */
    public final void mo27045a(EnumC17146b bVar) {
        C89219l.m154719c(bVar, "");
        this.f40768c = bVar;
    }

    /* renamed from: a */
    public final void mo27044a(AbstractC17083aa aaVar) {
        C89219l.m154719c(aaVar, "");
        this.f40766a.add(aaVar);
        AbstractC17117i.C17120c cVar = this.f40771f;
        if (cVar != null) {
            m31671b();
            aaVar.mo26987a(cVar);
        }
        Throwable th = this.f40770e;
        if (th != null) {
            m31671b();
            aaVar.mo26988a(th);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i.AbstractC17118a
    /* renamed from: a */
    public final void mo26996a(AbstractC17117i.C17120c cVar) {
        C89219l.m154719c(cVar, "");
        this.f40771f = cVar;
        m31671b();
        Set<AbstractC17083aa> set = this.f40766a;
        C89219l.m154709a((Object) set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            it.next().mo26987a(cVar);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i.AbstractC17118a
    /* renamed from: a */
    public final void mo26997a(Throwable th) {
        C89219l.m154719c(th, "");
        this.f40770e = th;
        m31671b();
        Set<AbstractC17083aa> set = this.f40766a;
        C89219l.m154709a((Object) set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            it.next().mo26988a(th);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17144y(String str, C17147z zVar, long j) {
        this(str, zVar, System.currentTimeMillis(), j);
        C89219l.m154719c(str, "");
        C89219l.m154719c(zVar, "");
    }

    public C17144y(String str, C17147z zVar, long j, long j2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(zVar, "");
        this.f40772g = str;
        this.f40773h = zVar;
        this.f40774i = j;
        this.f40775j = j2;
        this.f40766a = Collections.synchronizedSet(new HashSet());
        this.f40768c = EnumC17146b.FALLBACK;
        this.f40769d = System.currentTimeMillis();
    }
}
