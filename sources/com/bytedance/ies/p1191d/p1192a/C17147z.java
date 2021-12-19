package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.SortedMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.d.a.z */
public final class C17147z {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f40777a = {new C89232y(C89204ab.m154669a(C17147z.class), "str", "getStr()Ljava/lang/String;"), new C89232y(C89204ab.m154669a(C17147z.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"), new C89232y(C89204ab.m154669a(C17147z.class), "hashCode", "getHashCode()I")};

    /* renamed from: b */
    public final String f40778b;

    /* renamed from: c */
    public final String f40779c;

    /* renamed from: d */
    public final SortedMap<String, String> f40780d;

    /* renamed from: e */
    public final SortedMap<String, String> f40781e;

    /* renamed from: f */
    public final JSONObject f40782f;

    /* renamed from: g */
    public final boolean f40783g;

    /* renamed from: h */
    public final Map<String, String> f40784h;

    /* renamed from: i */
    private final AbstractC89244h f40785i;

    /* renamed from: j */
    private final AbstractC89244h f40786j;

    /* renamed from: k */
    private final AbstractC89244h f40787k;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo27046a() {
        return (JSONObject) this.f40786j.getValue();
    }

    public final int hashCode() {
        return ((Number) this.f40787k.getValue()).intValue();
    }

    public final String toString() {
        return (String) this.f40785i.getValue();
    }

    static {
        Covode.recordClassIndex(19604);
    }

    /* renamed from: com.bytedance.ies.d.a.z$a */
    static final class C17148a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C17147z f40788a;

        static {
            Covode.recordClassIndex(19605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17148a(C17147z zVar) {
            super(0);
            this.f40788a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            int i2;
            int i3;
            int hashCode = ((this.f40788a.f40778b.hashCode() * 31) + this.f40788a.f40779c.hashCode()) * 31;
            SortedMap<String, String> sortedMap = this.f40788a.f40780d;
            int i4 = 0;
            if (sortedMap != null) {
                i = sortedMap.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 31;
            SortedMap<String, String> sortedMap2 = this.f40788a.f40781e;
            if (sortedMap2 != null) {
                i2 = sortedMap2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            JSONObject jSONObject = this.f40788a.f40782f;
            if (jSONObject != null) {
                i3 = jSONObject.hashCode();
            } else {
                i3 = 0;
            }
            int hashCode2 = (((i6 + i3) * 31) + Boolean.valueOf(this.f40788a.f40783g).hashCode()) * 31;
            Map<String, String> map = this.f40788a.f40784h;
            if (map != null) {
                i4 = map.hashCode();
            }
            return Integer.valueOf(hashCode2 + i4);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.z$b */
    static final class C17149b extends AbstractC89220m implements AbstractC89171a<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C17147z f40789a;

        static {
            Covode.recordClassIndex(19606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17149b(C17147z zVar) {
            super(0);
            this.f40789a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ JSONObject invoke() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject put = new JSONObject().put("url", this.f40789a.f40778b).put("method", this.f40789a.f40779c);
            SortedMap<String, String> sortedMap = this.f40789a.f40780d;
            JSONObject jSONObject3 = null;
            if (sortedMap != null) {
                jSONObject = C17105ak.m31593a(sortedMap);
            } else {
                jSONObject = null;
            }
            JSONObject put2 = put.put("headers", jSONObject);
            SortedMap<String, String> sortedMap2 = this.f40789a.f40781e;
            if (sortedMap2 != null) {
                jSONObject2 = C17105ak.m31593a(sortedMap2);
            } else {
                jSONObject2 = null;
            }
            JSONObject put3 = put2.put("params", jSONObject2).put("data", this.f40789a.f40782f).put("needCommonParams", this.f40789a.f40783g);
            Map<String, String> map = this.f40789a.f40784h;
            if (map != null) {
                jSONObject3 = C17105ak.m31593a(map);
            }
            return put3.put("extras", jSONObject3);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.z$c */
    static final class C17150c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C17147z f40790a;

        static {
            Covode.recordClassIndex(19607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17150c(C17147z zVar) {
            super(0);
            this.f40790a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            StringBuilder append = new StringBuilder().append(C17105ak.m31590a(this.f40790a.f40778b, this.f40790a.f40781e)).append(',');
            Object obj = this.f40790a.f40782f;
            Object obj2 = "{}";
            if (obj == null) {
                obj = obj2;
            }
            StringBuilder append2 = append.append(obj).append(',');
            SortedMap<String, String> sortedMap = this.f40790a.f40780d;
            if (sortedMap != null) {
                obj2 = sortedMap;
            }
            return append2.append(obj2).append(',').append(this.f40790a.f40783g).toString();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17147z(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r11, r2)
            java.lang.String r0 = "url"
            java.lang.String r3 = r11.optString(r0)
            p4600h.p4611f.p4613b.C89219l.m154709a(r3, r2)
            java.lang.String r1 = "method"
            java.lang.String r0 = "get"
            java.lang.String r4 = r11.optString(r1, r0)
            p4600h.p4611f.p4613b.C89219l.m154709a(r4, r2)
            java.lang.String r0 = "headers"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            r9 = 0
            if (r0 == 0) goto L_0x0052
            java.util.SortedMap r5 = com.bytedance.ies.p1191d.p1192a.C17105ak.m31592a(r0)
        L_0x0026:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 == 0) goto L_0x0050
            java.util.SortedMap r6 = com.bytedance.ies.p1191d.p1192a.C17105ak.m31592a(r0)
        L_0x0032:
            java.lang.String r0 = "data"
            org.json.JSONObject r7 = r11.optJSONObject(r0)
            r1 = 0
            java.lang.String r0 = "needCommonParams"
            boolean r8 = r11.optBoolean(r0, r1)
            java.lang.String r0 = "extras"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 == 0) goto L_0x004b
            java.util.SortedMap r9 = com.bytedance.ies.p1191d.p1192a.C17105ak.m31592a(r0)
        L_0x004b:
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0050:
            r6 = r9
            goto L_0x0032
        L_0x0052:
            r5 = r9
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17147z.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17147z)) {
            return false;
        }
        C17147z zVar = (C17147z) obj;
        if (!C89219l.m154714a((Object) this.f40778b, (Object) zVar.f40778b) || !C89219l.m154714a((Object) this.f40779c, (Object) zVar.f40779c) || !C89219l.m154714a(this.f40780d, zVar.f40780d) || !C89219l.m154714a(this.f40781e, zVar.f40781e) || !C89219l.m154714a(this.f40782f, zVar.f40782f) || this.f40783g != zVar.f40783g || !C89219l.m154714a(this.f40784h, zVar.f40784h)) {
            return false;
        }
        return true;
    }

    public C17147z(String str, String str2, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, JSONObject jSONObject, boolean z, Map<String, String> map) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f40778b = str;
        this.f40779c = str2;
        this.f40780d = sortedMap;
        this.f40781e = sortedMap2;
        this.f40782f = jSONObject;
        this.f40783g = z;
        this.f40784h = map;
        this.f40785i = C89250i.m154773a((AbstractC89171a) new C17150c(this));
        this.f40786j = C89250i.m154773a((AbstractC89171a) new C17149b(this));
        this.f40787k = C89250i.m154773a((AbstractC89171a) new C17148a(this));
    }
}
