package com.p2082ss.android.ugc.aweme.bullet.utils;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16595af;
import com.bytedance.ies.bullet.service.base.AbstractC16599ai;
import com.bytedance.ies.bullet.service.base.AbstractC16700z;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1174a.C16719a;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.api.AbstractC34962a;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.utils.c */
public final class C35301c {

    /* renamed from: a */
    public static final C35301c f83326a = new C35301c();

    /* renamed from: com.ss.android.ugc.aweme.bullet.utils.c$b */
    public static final class C35303b implements AbstractC16700z {
        static {
            Covode.recordClassIndex(42470);
        }

        C35303b() {
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16646g
        /* renamed from: a */
        public final Uri mo26406a(Uri uri, Bundle bundle) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bundle, "");
            IBulletService f = BulletService.m71938f();
            String uri2 = uri.toString();
            C89219l.m154716b(uri2, "");
            Uri parse = Uri.parse(f.mo61857b(uri2));
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> rnFallback = inst.getRnFallback();
            C89219l.m154716b(rnFallback, "");
            Boolean c = rnFallback.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue()) {
                Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
                C89219l.m154716b(build, "");
                return build;
            }
            C89219l.m154716b(parse, "");
            return parse;
        }
    }

    private C35301c() {
    }

    static {
        Covode.recordClassIndex(42468);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.utils.c$a */
    public static final class C35302a implements AbstractC16599ai {

        /* renamed from: a */
        final /* synthetic */ AbstractC34962a f83327a;

        static {
            Covode.recordClassIndex(42469);
        }

        C35302a(AbstractC34962a aVar) {
            this.f83327a = aVar;
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16646g
        /* renamed from: a */
        public final Uri mo26406a(Uri uri, Bundle bundle) {
            Uri a;
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bundle, "");
            IBulletService f = BulletService.m71938f();
            String uri2 = uri.toString();
            C89219l.m154716b(uri2, "");
            String b = f.mo61857b(uri2);
            AbstractC34962a aVar = this.f83327a;
            if (aVar != null && (a = aVar.mo61861a(b, bundle)) != null) {
                return a;
            }
            Uri parse = Uri.parse(b);
            C89219l.m154716b(parse, "");
            return parse;
        }
    }

    /* renamed from: a */
    public static final Uri m72246a(String str) {
        C89219l.m154721d(str, "");
        return m72247a(str, null);
    }

    /* renamed from: b */
    public static final String m72249b(String str) {
        if (str == null) {
            return "";
        }
        return String.valueOf(m72244a(Uri.parse(str)));
    }

    /* renamed from: a */
    private static Uri m72244a(Uri uri) {
        if (uri == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        C89219l.m154716b(buildUpon, "");
        if (!TextUtils.isEmpty(uri.getQueryParameter("hybrid_sdk_version"))) {
            return uri;
        }
        if (!TextUtils.isEmpty(null)) {
            buildUpon.appendQueryParameter("package_name", null);
        }
        buildUpon.appendQueryParameter("hybrid_sdk_version", "bullet");
        return buildUpon.build();
    }

    /* renamed from: a */
    public static final Uri m72247a(String str, String str2) {
        List list;
        C89219l.m154721d(str, "");
        if (str2 != null) {
            list = C89070n.m154516a(str2);
        } else {
            list = null;
        }
        return m72248a(str, list, null, null);
    }

    /* renamed from: b */
    public static final String m72250b(String str, String str2) {
        if (str == null) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null && !TextUtils.isEmpty(parse.getQueryParameter(str2))) {
            Uri.Builder buildUpon = parse.buildUpon();
            C89219l.m154716b(buildUpon, "");
            buildUpon.clearQuery();
            for (String str3 : parse.getQueryParameterNames()) {
                if (!C89219l.m154714a((Object) str3, (Object) str2)) {
                    for (String str4 : parse.getQueryParameters(str3)) {
                        buildUpon.appendQueryParameter(str3, str4);
                    }
                }
            }
            parse = buildUpon.build();
        }
        return String.valueOf(parse);
    }

    /* renamed from: a */
    public static final Uri m72245a(Uri uri, String str, String str2) {
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        C89219l.m154716b(buildUpon, "");
        buildUpon.clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (!C89219l.m154714a((Object) str3, (Object) str)) {
                for (String str4 : uri.getQueryParameters(str3)) {
                    buildUpon.appendQueryParameter(str3, str4);
                }
            } else {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        return buildUpon.build();
    }

    /* renamed from: a */
    public static final Uri m72248a(String str, List<String> list, Bundle bundle, AbstractC34962a aVar) {
        C89219l.m154721d(str, "");
        AbstractC16595af afVar = (AbstractC16595af) C16622e.C16623a.m30858a().mo26346a(AbstractC16595af.class);
        if (afVar != null) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C35302a(aVar));
            arrayList.add(new C35303b());
            Uri a = afVar.mo26364a(parse, bundle, list, arrayList);
            if (a != null) {
                return a;
            }
        }
        Uri build = new C16719a().mo26658b().build();
        C89219l.m154716b(build, "");
        return build;
    }
}
