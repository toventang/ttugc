package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.ies.d.a.i */
public interface AbstractC17117i {

    /* renamed from: com.bytedance.ies.d.a.i$a */
    public interface AbstractC17118a {
        static {
            Covode.recordClassIndex(19575);
        }

        /* renamed from: a */
        void mo26996a(C17120c cVar);

        /* renamed from: a */
        void mo26997a(Throwable th);
    }

    static {
        Covode.recordClassIndex(19574);
    }

    /* renamed from: a */
    void mo27026a(String str, Map<String, String> map, AbstractC17118a aVar);

    /* renamed from: a */
    void mo27027a(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17118a aVar);

    /* renamed from: b */
    void mo27028b(String str, Map<String, String> map, AbstractC17118a aVar);

    /* renamed from: b */
    void mo27029b(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17118a aVar);

    /* renamed from: com.bytedance.ies.d.a.i$c */
    public static class C17120c {

        /* renamed from: a */
        public byte[] f40730a;

        /* renamed from: b */
        public String f40731b;

        /* renamed from: c */
        public Map<String, String> f40732c;

        /* renamed from: d */
        public int f40733d = -1;

        /* renamed from: e */
        public Map<String, String> f40734e;

        /* renamed from: f */
        public int f40735f = C17144y.EnumC17146b.FALLBACK.ordinal();

        static {
            Covode.recordClassIndex(19577);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo27030a() {
            String str = this.f40731b;
            if (str != null) {
                return str;
            }
            byte[] bArr = this.f40730a;
            if (bArr != null) {
                this.f40731b = new String(bArr, C89338d.f202990a);
            }
            return this.f40731b;
        }

        /* renamed from: b */
        public final JSONObject mo27031b() {
            Object obj;
            JSONObject jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            try {
                String a = mo27030a();
                if (a != null) {
                    jSONObject = new JSONObject(a);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject2.put("raw", jSONObject);
                jSONObject2.put("headers", C17105ak.m31593a(this.f40732c));
                jSONObject2.put("cached", this.f40735f);
                obj = C89379q.m157068constructorimpl(jSONObject2.put("status_code", this.f40733d));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            Throwable r1 = C89379q.m157071exceptionOrNullimpl(obj);
            if (r1 != null) {
                C17130q.m31656b("Format json error.", r1);
            }
            return jSONObject2;
        }
    }

    /* renamed from: com.bytedance.ies.d.a.i$b */
    public static final class C17119b {
        static {
            Covode.recordClassIndex(19576);
        }

        /* renamed from: a */
        public static void m31625a(AbstractC17117i iVar, String str, Map<String, String> map, AbstractC17118a aVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(map, "");
            C89219l.m154719c(aVar, "");
            iVar.mo27026a(str, map, aVar);
        }

        /* renamed from: a */
        public static void m31626a(AbstractC17117i iVar, String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17118a aVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(map, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(jSONObject, "");
            C89219l.m154719c(aVar, "");
            iVar.mo27027a(str, map, str2, jSONObject, aVar);
        }
    }
}
