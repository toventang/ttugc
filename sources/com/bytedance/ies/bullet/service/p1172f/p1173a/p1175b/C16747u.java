package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16733k;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16735l;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16742r;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16744s;
import com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.u */
public final class C16747u {

    /* renamed from: a */
    public static final AbstractC16726e<C16746t> f39990a;

    /* renamed from: b */
    public static final AbstractC16726e<EnumC16733k> f39991b;

    /* renamed from: c */
    public static final AbstractC16726e<EnumC16742r> f39992c;

    /* renamed from: d */
    public static final AbstractC16726e<EnumC16735l> f39993d;

    /* renamed from: e */
    public static final C16747u f39994e = new C16747u();

    /* renamed from: f */
    private static final AbstractC16726e<EnumC16744s> f39995f;

    /* renamed from: g */
    private static final Map<String, String> f39996g;

    private C16747u() {
    }

    static {
        Covode.recordClassIndex(19187);
        C16738n nVar = new C16738n(C16746t.class);
        f39990a = nVar;
        C16738n nVar2 = new C16738n(EnumC16744s.class);
        f39995f = nVar2;
        C16738n nVar3 = new C16738n(EnumC16733k.class);
        f39991b = nVar3;
        C16738n nVar4 = new C16738n(EnumC16742r.class);
        f39992c = nVar4;
        C16738n nVar5 = new C16738n(EnumC16735l.class);
        f39993d = nVar5;
        nVar.mo26554a(Uri.class, new C16772u());
        nVar.mo26555a(Uri.Builder.class, new C16774w());
        nVar2.mo26554a(Uri.class, new C16775x());
        nVar2.mo26555a(Uri.Builder.class, new C16776y());
        nVar3.mo26554a(Uri.class, new C16777z());
        nVar3.mo26555a(Uri.Builder.class, new C16749aa());
        nVar4.mo26554a(Uri.class, new C16750ab());
        nVar4.mo26555a(Uri.Builder.class, new C16751ac());
        nVar5.mo26554a(Uri.class, new C16752ad());
        nVar5.mo26555a(Uri.Builder.class, new C16773v());
        nVar.mo26554a(Map.class, new C16762k());
        nVar.mo26555a(Map.class, new C16764m());
        nVar2.mo26554a(Map.class, new C16765n());
        nVar2.mo26555a(Map.class, new C16766o());
        nVar3.mo26554a(Map.class, new C16767p());
        nVar3.mo26555a(Map.class, new C16768q());
        nVar4.mo26554a(Map.class, new C16769r());
        nVar4.mo26555a(Map.class, new C16770s());
        nVar5.mo26554a(Map.class, new C16771t());
        nVar5.mo26555a(Map.class, new C16763l());
        nVar.mo26554a(Bundle.class, new C16748a());
        nVar.mo26555a(Bundle.class, new C16754c());
        nVar2.mo26554a(Bundle.class, new C16755d());
        nVar2.mo26555a(Bundle.class, new C16756e());
        nVar3.mo26554a(Bundle.class, new C16757f());
        nVar3.mo26555a(Bundle.class, new C16758g());
        nVar4.mo26554a(Bundle.class, new C16759h());
        nVar4.mo26555a(Bundle.class, new C16760i());
        nVar5.mo26554a(Bundle.class, new C16761j());
        nVar5.mo26555a(Bundle.class, new C16753b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("white", "#FFFFFFFF");
        linkedHashMap.put("black", "#FF000000");
        linkedHashMap.put("transparent", "#00000000");
        f39996g = linkedHashMap;
    }

    /* renamed from: a */
    public static C16746t m31069a(String str) {
        C16746t tVar = new C16746t(-2);
        try {
            Map<String, String> map = f39996g;
            if (map.keySet().contains(str)) {
                return new C16746t(Color.parseColor(map.get(str)));
            }
            if (C89361p.m154874b(str, "#", false)) {
                str = C89361p.m154821a(str, 1);
            }
            int length = str.length();
            if (length == 3) {
                if (str.length() == 3) {
                    str = "FF" + str.charAt(0) + str.charAt(0) + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2);
                }
                return new C16746t(Color.parseColor("#".concat(String.valueOf(str))));
            } else if (length == 6) {
                return new C16746t(Color.parseColor("#FF".concat(String.valueOf(str))));
            } else {
                if (length != 8) {
                    return tVar;
                }
                if (str.length() == 8) {
                    str = C89361p.m154828k(str) + C89361p.m154823b(str, 2);
                }
                return new C16746t(Color.parseColor("#".concat(String.valueOf(str))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$a */
    public static final class C16748a extends AbstractC89220m implements AbstractC89183m<Bundle, String, C16746t> {
        static {
            Covode.recordClassIndex(19188);
        }

        public C16748a() {
            super(2);
        }

        public final C16746t invoke(Bundle bundle, String str) {
            String string;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            C89219l.m154709a((Object) string, "");
            return C16747u.m31069a(string);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$ab */
    public static final class C16750ab extends AbstractC89220m implements AbstractC89183m<Uri, String, EnumC16742r> {
        static {
            Covode.recordClassIndex(19190);
        }

        public C16750ab() {
            super(2);
        }

        public final EnumC16742r invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return EnumC16742r.C16743a.m31066a(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$ad */
    public static final class C16752ad extends AbstractC89220m implements AbstractC89183m<Uri, String, EnumC16735l> {
        static {
            Covode.recordClassIndex(19192);
        }

        public C16752ad() {
            super(2);
        }

        public final EnumC16735l invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return EnumC16735l.C16736a.m31048a(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$d */
    public static final class C16755d extends AbstractC89220m implements AbstractC89183m<Bundle, String, EnumC16744s> {
        static {
            Covode.recordClassIndex(19195);
        }

        public C16755d() {
            super(2);
        }

        public final EnumC16744s invoke(Bundle bundle, String str) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (bundle.containsKey(str)) {
                return EnumC16744s.C16745a.m31067a(bundle.getInt(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$f */
    public static final class C16757f extends AbstractC89220m implements AbstractC89183m<Bundle, String, EnumC16733k> {
        static {
            Covode.recordClassIndex(19197);
        }

        public C16757f() {
            super(2);
        }

        public final EnumC16733k invoke(Bundle bundle, String str) {
            String string;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            C89219l.m154709a((Object) string, "");
            return EnumC16733k.C16734a.m31047a(string);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$h */
    public static final class C16759h extends AbstractC89220m implements AbstractC89183m<Bundle, String, EnumC16742r> {
        static {
            Covode.recordClassIndex(19199);
        }

        public C16759h() {
            super(2);
        }

        public final EnumC16742r invoke(Bundle bundle, String str) {
            String string;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            C89219l.m154709a((Object) string, "");
            return EnumC16742r.C16743a.m31066a(string);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$j */
    public static final class C16761j extends AbstractC89220m implements AbstractC89183m<Bundle, String, EnumC16735l> {
        static {
            Covode.recordClassIndex(19201);
        }

        public C16761j() {
            super(2);
        }

        public final EnumC16735l invoke(Bundle bundle, String str) {
            String string;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            C89219l.m154709a((Object) string, "");
            return EnumC16735l.C16736a.m31048a(string);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$k */
    public static final class C16762k extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, C16746t> {
        static {
            Covode.recordClassIndex(19202);
        }

        public C16762k() {
            super(2);
        }

        public final C16746t invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return C16747u.m31069a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$n */
    public static final class C16765n extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, EnumC16744s> {
        static {
            Covode.recordClassIndex(19205);
        }

        public C16765n() {
            super(2);
        }

        public final EnumC16744s invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return EnumC16744s.C16745a.m31068a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$p */
    public static final class C16767p extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, EnumC16733k> {
        static {
            Covode.recordClassIndex(19207);
        }

        public C16767p() {
            super(2);
        }

        public final EnumC16733k invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return EnumC16733k.C16734a.m31047a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$r */
    public static final class C16769r extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, EnumC16742r> {
        static {
            Covode.recordClassIndex(19209);
        }

        public C16769r() {
            super(2);
        }

        public final EnumC16742r invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return EnumC16742r.C16743a.m31066a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$t */
    public static final class C16771t extends AbstractC89220m implements AbstractC89183m<Map<?, ?>, String, EnumC16735l> {
        static {
            Covode.recordClassIndex(19211);
        }

        public C16771t() {
            super(2);
        }

        public final EnumC16735l invoke(Map<?, ?> map, String str) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return EnumC16735l.C16736a.m31048a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$u */
    public static final class C16772u extends AbstractC89220m implements AbstractC89183m<Uri, String, C16746t> {
        static {
            Covode.recordClassIndex(19212);
        }

        public C16772u() {
            super(2);
        }

        public final C16746t invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C16747u.m31069a(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$x */
    public static final class C16775x extends AbstractC89220m implements AbstractC89183m<Uri, String, EnumC16744s> {
        static {
            Covode.recordClassIndex(19215);
        }

        public C16775x() {
            super(2);
        }

        public final EnumC16744s invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return EnumC16744s.C16745a.m31068a(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$z */
    public static final class C16777z extends AbstractC89220m implements AbstractC89183m<Uri, String, EnumC16733k> {
        static {
            Covode.recordClassIndex(19217);
        }

        public C16777z() {
            super(2);
        }

        public final EnumC16733k invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return EnumC16733k.C16734a.m31047a(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$aa */
    public static final class C16749aa extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, EnumC16733k, Uri.Builder> {
        static {
            Covode.recordClassIndex(19189);
        }

        public C16749aa() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, EnumC16733k kVar) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String value = kVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$ac */
    public static final class C16751ac extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, EnumC16742r, Uri.Builder> {
        static {
            Covode.recordClassIndex(19191);
        }

        public C16751ac() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, EnumC16742r rVar) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String value = rVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$b */
    public static final class C16753b extends AbstractC89220m implements AbstractC89187q<Bundle, String, EnumC16735l, Bundle> {
        static {
            Covode.recordClassIndex(19193);
        }

        public C16753b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, EnumC16735l lVar) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putString(str, lVar.getVALUE());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$c */
    public static final class C16754c extends AbstractC89220m implements AbstractC89187q<Bundle, String, C16746t, Bundle> {
        static {
            Covode.recordClassIndex(19194);
        }

        public C16754c() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, C16746t tVar) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putString(str, String.valueOf(tVar.f39989a));
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$e */
    public static final class C16756e extends AbstractC89220m implements AbstractC89187q<Bundle, String, EnumC16744s, Bundle> {
        static {
            Covode.recordClassIndex(19196);
        }

        public C16756e() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, EnumC16744s sVar) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putInt(str, sVar.getVALUE());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$g */
    public static final class C16758g extends AbstractC89220m implements AbstractC89187q<Bundle, String, EnumC16733k, Bundle> {
        static {
            Covode.recordClassIndex(19198);
        }

        public C16758g() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, EnumC16733k kVar) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putString(str, kVar.getVALUE());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$i */
    public static final class C16760i extends AbstractC89220m implements AbstractC89187q<Bundle, String, EnumC16742r, Bundle> {
        static {
            Covode.recordClassIndex(19200);
        }

        public C16760i() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, EnumC16742r rVar) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putString(str, rVar.getVALUE());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$l */
    public static final class C16763l extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, EnumC16735l, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19203);
        }

        public C16763l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, EnumC16735l lVar) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String value = lVar.getVALUE();
            if (value != null) {
                h.put(str, value);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$m */
    public static final class C16764m extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, C16746t, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19204);
        }

        public C16764m() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, C16746t tVar) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(tVar.f39989a);
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$o */
    public static final class C16766o extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, EnumC16744s, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19206);
        }

        public C16766o() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, EnumC16744s sVar) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String valueOf = String.valueOf(sVar.getVALUE());
            if (valueOf != null) {
                h.put(str, valueOf);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$q */
    public static final class C16768q extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, EnumC16733k, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19208);
        }

        public C16768q() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, EnumC16733k kVar) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String value = kVar.getVALUE();
            if (value != null) {
                h.put(str, value);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$s */
    public static final class C16770s extends AbstractC89220m implements AbstractC89187q<Map<?, ?>, String, EnumC16742r, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19210);
        }

        public C16770s() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, EnumC16742r rVar) {
            C89219l.m154719c(map, "");
            C89219l.m154719c(str, "");
            Map<Object, Object> h = C89206ad.m154686h(map);
            String value = rVar.getVALUE();
            if (value != null) {
                h.put(str, value);
            }
            return h;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$v */
    public static final class C16773v extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, EnumC16735l, Uri.Builder> {
        static {
            Covode.recordClassIndex(19213);
        }

        public C16773v() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, EnumC16735l lVar) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String value = lVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$w */
    public static final class C16774w extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, C16746t, Uri.Builder> {
        static {
            Covode.recordClassIndex(19214);
        }

        public C16774w() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, C16746t tVar) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(tVar.f39989a);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$y */
    public static final class C16776y extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, EnumC16744s, Uri.Builder> {
        static {
            Covode.recordClassIndex(19216);
        }

        public C16776y() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, EnumC16744s sVar) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(sVar.getVALUE());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }
}
