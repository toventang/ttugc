package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45561f;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.j */
public final class C45264j {

    /* renamed from: a */
    public static final C45264j f105497a = new C45264j();

    /* renamed from: b */
    private static final AbstractC89244h f105498b = C89250i.m154773a((AbstractC89171a) C45265a.f105499a);

    /* renamed from: a */
    public static C27910f m87844a() {
        return (C27910f) f105498b.getValue();
    }

    private C45264j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.j$a */
    static final class C45265a extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C45265a f105499a = new C45265a();

        static {
            Covode.recordClassIndex(53717);
        }

        C45265a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27917g().mo46681a((Type) HashMap.class, (Object) new C45558d()).mo46682b();
        }
    }

    static {
        Covode.recordClassIndex(53716);
    }

    /* renamed from: a */
    public static Uri.Builder m87841a(String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                buildUpon.appendQueryParameter(key, value.toString());
            } else {
                buildUpon.appendQueryParameter(key, C80342dg.m139300a().mo46674b(value));
            }
        }
        C89219l.m154716b(buildUpon, "");
        return buildUpon;
    }

    /* renamed from: b */
    public static Uri.Builder m87845b(String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((!C89219l.m154714a(value, (Object) "")) && value != null) {
                if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                    buildUpon.appendQueryParameter(key, value.toString());
                } else {
                    buildUpon.appendQueryParameter(key, C80342dg.m139300a().mo46674b(value));
                }
            }
        }
        C89219l.m154716b(buildUpon, "");
        return buildUpon;
    }

    /* renamed from: c */
    public static String m87846c(String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        Uri parse = Uri.parse(str);
        Uri uri = null;
        String queryParameter = parse != null ? parse.getQueryParameter("url") : null;
        if (C80537hk.m139613a(queryParameter)) {
            Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if ((!C89219l.m154714a(value, (Object) "")) && value != null) {
                    if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                        buildUpon.appendQueryParameter(key, value.toString());
                    } else {
                        buildUpon.appendQueryParameter(key, C80342dg.m139300a().mo46674b(value));
                    }
                }
            }
            C89219l.m154716b(parse, "");
            if (buildUpon != null) {
                uri = buildUpon.build();
            }
            String uri2 = C45561f.m88107a(parse, "url", String.valueOf(uri)).toString();
            C89219l.m154716b(uri2, "");
            return uri2;
        }
        String uri3 = parse.toString();
        C89219l.m154716b(uri3, "");
        return uri3;
    }

    /* renamed from: a */
    public static SmartRoute m87843a(Context context, String str, Map<String, ? extends Object> map, boolean z) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        Uri.Builder a = m87841a(str, map);
        if (z) {
            a.appendQueryParameter("fallback", null);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, a.toString());
        C89219l.m154716b(buildRoute, "");
        return buildRoute;
    }
}
