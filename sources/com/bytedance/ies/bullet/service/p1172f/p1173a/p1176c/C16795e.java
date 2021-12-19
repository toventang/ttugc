package com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.c.e */
public final class C16795e {
    static {
        Covode.recordClassIndex(19235);
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$a */
    public static final class C16796a extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Boolean> {
        static {
            Covode.recordClassIndex(19236);
        }

        public C16796a() {
            super(2);
        }

        public final Boolean invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj == null || !(obj instanceof String)) {
                return null;
            }
            return Boolean.valueOf(C89219l.m154714a(obj, (Object) "1"));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$c */
    public static final class C16798c extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, String> {
        static {
            Covode.recordClassIndex(19238);
        }

        public C16798c() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r4, r0)
                p4600h.p4611f.p4613b.C89219l.m154719c(r5, r0)
                java.lang.Object r2 = r4.get(r5)
                r1 = 0
                if (r2 == 0) goto L_0x0013
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0014
            L_0x0013:
                return r1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16795e.C16798c.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$g */
    public static final class C16802g extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Uri> {
        static {
            Covode.recordClassIndex(19242);
        }

        public C16802g() {
            super(2);
        }

        public final Uri invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return Uri.parse(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$i */
    public static final class C16804i extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, String> {

        /* renamed from: a */
        final /* synthetic */ String f39998a;

        static {
            Covode.recordClassIndex(19244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16804i(String str) {
            super(2);
            this.f39998a = str;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r4, r0)
                p4600h.p4611f.p4613b.C89219l.m154719c(r5, r0)
                java.lang.String r0 = r3.f39998a
                java.lang.Object r2 = r4.get(r0)
                r1 = 0
                if (r2 == 0) goto L_0x0015
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0016
            L_0x0015:
                return r1
            L_0x0016:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16795e.C16804i.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$k */
    public static final class C16806k extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, String> {

        /* renamed from: a */
        final /* synthetic */ String f40000a;

        static {
            Covode.recordClassIndex(19246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16806k(String str) {
            super(2);
            this.f40000a = str;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r4, r0)
                p4600h.p4611f.p4613b.C89219l.m154719c(r5, r0)
                java.lang.String r0 = r3.f40000a
                java.lang.Object r2 = r4.get(r0)
                r1 = 0
                if (r2 == 0) goto L_0x0015
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0016
            L_0x0015:
                return r1
            L_0x0016:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16795e.C16806k.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$p */
    public static final class C16811p extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Integer> {
        static {
            Covode.recordClassIndex(19251);
        }

        public C16811p() {
            super(2);
        }

        public final Integer invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C89361p.m154863e(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$r */
    public static final class C16813r extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Long> {
        static {
            Covode.recordClassIndex(19253);
        }

        public C16813r() {
            super(2);
        }

        public final Long invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C89361p.m154865g(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$t */
    public static final class C16815t extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Float> {
        static {
            Covode.recordClassIndex(19255);
        }

        public C16815t() {
            super(2);
        }

        public final Float invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C89361p.m154861c(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$v */
    public static final class C16817v extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, Double> {
        static {
            Covode.recordClassIndex(19257);
        }

        public C16817v() {
            super(2);
        }

        public final Double invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C89361p.m154862d(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$e */
    public static final class C16800e extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, List<? extends String>> {
        static {
            Covode.recordClassIndex(19240);
        }

        public C16800e() {
            super(2);
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C89361p.m154915b(str2, new String[]{","});
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$n */
    public static final class C16809n extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ String f40002a;

        static {
            Covode.recordClassIndex(19249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16809n(String str) {
            super(2);
            this.f40002a = str;
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(this.f40002a);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    C89219l.m154709a((Object) str3, "");
                    return C89361p.m154915b(str2, new String[]{str3});
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$w */
    public static final class C16818w extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, String> {

        /* renamed from: a */
        public static final C16818w f40004a = new C16818w();

        static {
            Covode.recordClassIndex(19258);
        }

        C16818w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Map<?, ?> map, String str) {
            Map<?, ?> map2 = map;
            C89219l.m154719c(map2, "");
            C89219l.m154719c(str, "");
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    C89219l.m154709a((Object) str3, "");
                    for (T t : C89361p.m154915b(str2, new String[]{str3})) {
                        if (!C89361p.m154870a((CharSequence) t)) {
                            return t;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$y */
    public static final class C16820y extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, String> {

        /* renamed from: a */
        public static final C16820y f40006a = new C16820y();

        static {
            Covode.recordClassIndex(19260);
        }

        C16820y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Map<?, ?> map, String str) {
            Map<?, ?> map2 = map;
            C89219l.m154719c(map2, "");
            C89219l.m154719c(str, "");
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    C89219l.m154709a((Object) str3, "");
                    List<String> b = C89361p.m154915b(str2, new String[]{str3});
                    ListIterator<String> listIterator = b.listIterator(b.size());
                    while (listIterator.hasPrevious()) {
                        String previous = listIterator.previous();
                        if (!C89361p.m154870a((CharSequence) previous)) {
                            return previous;
                        }
                    }
                    throw new NoSuchElementException("List contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$b */
    public static final class C16797b extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Double, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19237);
        }

        public C16797b() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Double d) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(d.doubleValue());
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$d */
    public static final class C16799d extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, String, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19239);
        }

        public C16799d() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            if (str2 != null) {
                h.put(str, str2);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$h */
    public static final class C16803h extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Uri, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19243);
        }

        public C16803h() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Uri uri) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$j */
    public static final class C16805j extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f39999a;

        static {
            Covode.recordClassIndex(19245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16805j(String str) {
            super(3);
            this.f39999a = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            if (str2 != null) {
                h.put(this.f39999a, str2);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$l */
    public static final class C16807l extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Boolean, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19247);
        }

        public C16807l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Boolean bool) {
            String str2;
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            h.put(str, str2);
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$m */
    public static final class C16808m extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f40001a;

        static {
            Covode.recordClassIndex(19248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16808m(String str) {
            super(3);
            this.f40001a = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            if (str2 != null) {
                h.put(this.f40001a, str2);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$q */
    public static final class C16812q extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Integer, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19252);
        }

        public C16812q() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Integer num) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$s */
    public static final class C16814s extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Long, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19254);
        }

        public C16814s() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Long l) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(l.longValue());
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$u */
    public static final class C16816u extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, Float, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19256);
        }

        public C16816u() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Float f) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(f.floatValue());
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$f */
    public static final class C16801f extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19241);
        }

        public C16801f() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String a = C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
            if (a != null) {
                h.put(str, a);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$o */
    public static final class C16810o extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {

        /* renamed from: a */
        final /* synthetic */ String f40003a;

        static {
            Covode.recordClassIndex(19250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16810o(String str) {
            super(3);
            this.f40003a = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String str2 = File.separator;
            C89219l.m154709a((Object) str2, "");
            String a = C89070n.m154551a(list, str2, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
            if (a != null) {
                h.put(this.f40003a, a);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$x */
    public static final class C16819x extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        public static final C16819x f40005a = new C16819x();

        static {
            Covode.recordClassIndex(19259);
        }

        C16819x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            Map<?, ?> map2 = map;
            String str3 = str2;
            C89219l.m154719c(map2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(str3, "");
            Map h = C89206ad.m154686h(map2);
            StringBuilder sb = new StringBuilder();
            if ((!C89361p.m154870a((CharSequence) str3)) && str3 != null) {
                sb.append(File.separator).append(C89361p.m154910b((CharSequence) str3).toString());
            }
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    String str5 = File.separator;
                    C89219l.m154709a((Object) str5, "");
                    if (!C89361p.m154874b(str4, str5, false)) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            h.put("__PATH__", String.valueOf(sb));
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$z */
    public static final class C16821z extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a */
        public static final C16821z f40007a = new C16821z();

        static {
            Covode.recordClassIndex(19261);
        }

        C16821z() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            Map<?, ?> map2 = map;
            String str3 = str2;
            C89219l.m154719c(map2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(str3, "");
            Map h = C89206ad.m154686h(map2);
            StringBuilder sb = new StringBuilder();
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    String str5 = File.separator;
                    C89219l.m154709a((Object) str5, "");
                    if (!C89361p.m154874b(str4, str5, false)) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            if ((!C89361p.m154870a((CharSequence) str3)) && str3 != null) {
                sb.append(File.separator).append(C89361p.m154910b((CharSequence) str3).toString());
            }
            h.put("__PATH__", String.valueOf(sb));
            return h;
        }
    }
}
