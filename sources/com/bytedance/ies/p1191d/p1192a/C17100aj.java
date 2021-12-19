package com.bytedance.ies.p1191d.p1192a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.net.URLDecoder;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.d.a.aj */
public final class C17100aj {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f40700a = {new C89232y(C89204ab.m154669a(C17100aj.class), "uri", "getUri()Landroid/net/Uri;"), new C89232y(C89204ab.m154669a(C17100aj.class), "host", "getHost()Ljava/lang/String;"), new C89232y(C89204ab.m154669a(C17100aj.class), "queryMap", "getQueryMap()Ljava/util/SortedMap;"), new C89232y(C89204ab.m154669a(C17100aj.class), "hash", "getHash()Ljava/lang/String;")};

    /* renamed from: b */
    public final String f40701b;

    /* renamed from: c */
    private final AbstractC89244h f40702c = C89250i.m154773a((AbstractC89171a) new C17104d(this));

    /* renamed from: d */
    private final AbstractC89244h f40703d = C89250i.m154773a((AbstractC89171a) new C17102b(this));

    /* renamed from: e */
    private final AbstractC89244h f40704e = C89250i.m154773a((AbstractC89171a) new C17103c(this));

    /* renamed from: f */
    private final AbstractC89244h f40705f = C89250i.m154773a((AbstractC89171a) new C17101a(this));

    /* renamed from: a */
    public final Uri mo27010a() {
        return (Uri) this.f40702c.getValue();
    }

    /* renamed from: b */
    public final String mo27011b() {
        return (String) this.f40703d.getValue();
    }

    /* renamed from: c */
    public final SortedMap<String, String> mo27012c() {
        return (SortedMap) this.f40704e.getValue();
    }

    /* renamed from: d */
    public final String mo27013d() {
        return (String) this.f40705f.getValue();
    }

    /* renamed from: com.bytedance.ies.d.a.aj$b */
    static final class C17102b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C17100aj f40707a;

        static {
            Covode.recordClassIndex(19559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17102b(C17100aj ajVar) {
            super(0);
            this.f40707a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String host = this.f40707a.mo27010a().getHost();
            if (host == null) {
                return "";
            }
            return host;
        }
    }

    /* renamed from: com.bytedance.ies.d.a.aj$d */
    static final class C17104d extends AbstractC89220m implements AbstractC89171a<Uri> {

        /* renamed from: a */
        final /* synthetic */ C17100aj f40709a;

        static {
            Covode.recordClassIndex(19561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17104d(C17100aj ajVar) {
            super(0);
            this.f40709a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Uri invoke() {
            return Uri.parse(this.f40709a.f40701b);
        }
    }

    static {
        Covode.recordClassIndex(19557);
    }

    /* renamed from: com.bytedance.ies.d.a.aj$a */
    static final class C17101a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C17100aj f40706a;

        static {
            Covode.recordClassIndex(19558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17101a(C17100aj ajVar) {
            super(0);
            this.f40706a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String fragment = this.f40706a.mo27010a().getFragment();
            if (fragment == null) {
                fragment = "";
            }
            if (!C89361p.m154908a((CharSequence) fragment, (CharSequence) "?", false)) {
                return "#".concat(String.valueOf(fragment));
            }
            List<String> b = C89361p.m154915b(fragment, new String[]{"?"});
            String str = b.get(1);
            if (str.length() > 0) {
                for (T t : C89361p.m154915b(str, new String[]{"&"})) {
                    int a = C89361p.m154888a((CharSequence) t, "=", 0, false, 6);
                    if (a > 0) {
                        SortedMap<String, String> c = this.f40706a.mo27012c();
                        if (t != null) {
                            String substring = t.substring(0, a);
                            C89219l.m154709a((Object) substring, "");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            String substring2 = t.substring(a + 1);
                            C89219l.m154709a((Object) substring2, "");
                            c.put(decode, URLDecoder.decode(substring2, "UTF-8"));
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            return "#" + b.get(0);
        }
    }

    /* renamed from: com.bytedance.ies.d.a.aj$c */
    static final class C17103c extends AbstractC89220m implements AbstractC89171a<SortedMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ C17100aj f40708a;

        static {
            Covode.recordClassIndex(19560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17103c(C17100aj ajVar) {
            super(0);
            this.f40708a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SortedMap<String, String> invoke() {
            String query;
            List<String> c;
            Uri a = this.f40708a.mo27010a();
            C89219l.m154719c(a, "");
            TreeMap treeMap = new TreeMap();
            String fragment = a.getFragment();
            if (fragment != null && C89361p.m154929e((CharSequence) fragment, (CharSequence) "?")) {
                for (String str : C89361p.m154921c((String) C89361p.m154921c(fragment, new String[]{"?"}).get(1), new String[]{"&"})) {
                    int a2 = C89361p.m154888a((CharSequence) str, "=", 0, false, 6);
                    if (a2 >= 0) {
                        if (str != null) {
                            String substring = str.substring(0, a2);
                            C89219l.m154709a((Object) substring, "");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            C89219l.m154709a((Object) decode, "");
                            String substring2 = str.substring(a2 + 1);
                            C89219l.m154709a((Object) substring2, "");
                            String decode2 = URLDecoder.decode(substring2, "UTF-8");
                            C89219l.m154709a((Object) decode2, "");
                            treeMap.put(decode, decode2);
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            String query2 = a.getQuery();
            if (!(query2 == null || query2.length() == 0 || (query = a.getQuery()) == null || (c = C89361p.m154921c(query, new String[]{"&"})) == null)) {
                for (String str2 : c) {
                    int a3 = C89361p.m154888a((CharSequence) str2, "=", 0, false, 6);
                    if (a3 >= 0) {
                        if (str2 != null) {
                            String substring3 = str2.substring(0, a3);
                            C89219l.m154709a((Object) substring3, "");
                            String decode3 = URLDecoder.decode(substring3, "UTF-8");
                            C89219l.m154709a((Object) decode3, "");
                            String substring4 = str2.substring(a3 + 1);
                            C89219l.m154709a((Object) substring4, "");
                            String decode4 = URLDecoder.decode(substring4, "UTF-8");
                            C89219l.m154709a((Object) decode4, "");
                            treeMap.put(decode3, decode4);
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            return treeMap;
        }
    }

    public C17100aj(String str) {
        C89219l.m154719c(str, "");
        this.f40701b = str;
    }
}
