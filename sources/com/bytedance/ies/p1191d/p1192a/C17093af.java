package com.bytedance.ies.p1191d.p1192a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.ies.d.a.af */
public class C17093af {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f40679a = {new C89232y(C89204ab.m154669a(C17093af.class), "hostRegMatcher", "getHostRegMatcher()Lkotlin/text/Regex;"), new C89232y(C89204ab.m154669a(C17093af.class), "hashRegMatcher", "getHashRegMatcher()Lkotlin/text/Regex;")};

    /* renamed from: b */
    public final String f40680b;

    /* renamed from: c */
    public final String f40681c;

    /* renamed from: d */
    public final String f40682d;

    /* renamed from: e */
    public final Map<String, String> f40683e;

    /* renamed from: f */
    public final List<String> f40684f;

    /* renamed from: g */
    private final AbstractC89244h f40685g;

    /* renamed from: h */
    private final AbstractC89244h f40686h;

    /* renamed from: a */
    private final C89350l m31574a() {
        return (C89350l) this.f40685g.getValue();
    }

    /* renamed from: b */
    private final C89350l m31578b() {
        return (C89350l) this.f40686h.getValue();
    }

    /* renamed from: com.bytedance.ies.d.a.af$a */
    static final class C17094a extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        final /* synthetic */ C17093af f40687a;

        static {
            Covode.recordClassIndex(19551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17094a(C17093af afVar) {
            super(0);
            this.f40687a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            String str = this.f40687a.f40682d;
            if (str == null) {
                str = ".*?";
            }
            return new C89350l(str);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.af$b */
    static final class C17095b extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        final /* synthetic */ C17093af f40688a;

        static {
            Covode.recordClassIndex(19552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17095b(C17093af afVar) {
            super(0);
            this.f40688a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            String str = this.f40688a.f40681c;
            if (str == null) {
                str = ".*?";
            }
            return new C89350l(str);
        }
    }

    static {
        Covode.recordClassIndex(19550);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.d.a.af$c */
    public static final class C17096c extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        public static final C17096c f40689a = new C17096c();

        static {
            Covode.recordClassIndex(19553);
        }

        C17096c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154719c(str2, "");
            Locale locale = Locale.ROOT;
            C89219l.m154709a((Object) locale, "");
            String lowerCase = str2.toLowerCase(locale);
            C89219l.m154709a((Object) lowerCase, "");
            return lowerCase;
        }
    }

    /* renamed from: a */
    private final boolean m31576a(String str) {
        if (TextUtils.isEmpty(this.f40681c)) {
            return true;
        }
        return m31574a().matches(str);
    }

    /* renamed from: b */
    private final boolean m31579b(String str) {
        if (TextUtils.isEmpty(this.f40682d)) {
            return true;
        }
        return m31578b().matches(str);
    }

    /* renamed from: a */
    private final boolean m31577a(SortedMap<String, String> sortedMap) {
        if (this.f40683e == null) {
            return true;
        }
        if (sortedMap.size() < this.f40683e.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : this.f40683e.entrySet()) {
            if (sortedMap.containsKey(entry.getKey())) {
                String value = entry.getValue();
                if (value.length() != 0) {
                    C89350l lVar = new C89350l(value);
                    String str = sortedMap.get(entry.getKey());
                    if (str == null) {
                        str = "";
                    }
                    if (!lVar.matches(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<String> mo27001a(C17100aj ajVar) {
        C89219l.m154719c(ajVar, "");
        if (TextUtils.isEmpty(this.f40681c) && TextUtils.isEmpty(this.f40682d) && this.f40683e == null) {
            m31575a(null, ajVar);
            return this.f40684f;
        } else if (!m31576a(ajVar.mo27011b()) || !m31579b(ajVar.mo27013d()) || !m31577a(ajVar.mo27012c())) {
            return null;
        } else {
            m31575a(null, ajVar);
            return this.f40684f;
        }
    }

    /* renamed from: a */
    private final void m31575a(String str, C17100aj ajVar) {
        C17130q.m31655b("[scheme:" + ajVar.f40701b + "] matchRule:" + this.f40680b + " matchApis:" + C89070n.m154551a(this.f40684f, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C17096c.f40689a, 31));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17093af(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            r1 = r7
            p4600h.p4611f.p4613b.C89219l.m154719c(r1, r0)
            p4600h.p4611f.p4613b.C89219l.m154719c(r8, r0)
            java.lang.String r0 = "host"
            r4 = 0
            java.lang.String r2 = r8.optString(r0, r4)
            java.lang.String r0 = "hash"
            java.lang.String r3 = r8.optString(r0, r4)
            java.lang.String r0 = "query"
            org.json.JSONArray r0 = r8.optJSONArray(r0)
            if (r0 == 0) goto L_0x0022
            java.util.Map r4 = com.bytedance.ies.p1191d.p1192a.C17105ak.m31594b(r0)
        L_0x0022:
            java.lang.String r0 = "prefetch_apis"
            org.json.JSONArray r0 = r8.getJSONArray(r0)
            java.util.List r5 = com.bytedance.ies.p1191d.p1192a.C17105ak.m31591a(r0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17093af.<init>(java.lang.String, org.json.JSONObject):void");
    }

    private C17093af(String str, String str2, String str3, Map<String, String> map, List<String> list) {
        this.f40680b = str;
        this.f40681c = str2;
        this.f40682d = str3;
        this.f40683e = map;
        this.f40684f = list;
        this.f40685g = C89250i.m154773a((AbstractC89171a) new C17095b(this));
        this.f40686h = C89250i.m154773a((AbstractC89171a) new C17094a(this));
    }
}
