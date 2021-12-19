package com.p2082ss.android.ugc.aweme.p4173ug.p4174a;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.a.b */
public final class C79561b implements AbstractC79589c {

    /* renamed from: b */
    public static final C79561b f178539b = new C79561b();

    private C79561b() {
    }

    static {
        Covode.recordClassIndex(92767);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.b$a */
    public static final class CallableC79562a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC79562a f178540a = new CallableC79562a();

        static {
            Covode.recordClassIndex(92768);
        }

        CallableC79562a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            boolean z;
            if (C79560a.m138314c() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C79560a.m138313b().putLong("active_time", System.currentTimeMillis()).apply();
                C79561b.f178539b.mo123117b("fb_mobile_achievement_unlocked", null, null);
            } else if (!C79560a.m138311a().getBoolean("has_2d_rr_use", false)) {
                if (TimeUnit.MILLISECONDS.toDays(C79560a.m138314c()) + 1 == TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())) {
                    C79561b.f178539b.mo123117b("2d_rr_user", null, null);
                    C79561b.f178539b.mo123114a("d2_rr_user", null, null);
                    C79560a.m138312a("has_2d_rr_use", true);
                }
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: a */
    public final void mo123112a(String str) {
        mo123117b("Login", null, null);
        mo123114a("login", "product", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: c */
    public final void mo123118c(String str) {
        AppsFlyerLib.getInstance().trackEvent(C17867d.m33078a(), str, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: b */
    public final void mo123116b(String str) {
        AppsFlyerLib.getInstance().trackEvent(C17867d.m33078a(), "mus_af_post_video", null);
        mo123114a("UPV", "product", str);
        mo123117b("fb_mobile_purchase", "product", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: d */
    public final void mo123119d(String str) {
        C89219l.m154721d(str, "");
        AppsFlyerLib.getInstance().trackEvent(C17867d.m33078a(), str, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: a */
    public final void mo123115a(String str, Map<String, ? extends Object> map) {
        AppsFlyerLib.getInstance().trackEvent(C17867d.m33078a(), str, map);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: a */
    public final void mo123113a(String str, String str2) {
        C89219l.m154721d(str2, "");
        if (str != null) {
            int i = 0;
            switch (str.hashCode()) {
                case -2090153577:
                    if (str.equals("mus_af_follow")) {
                        mo123117b("Subscribe", "product", str2);
                        return;
                    }
                    return;
                case -1617792023:
                    if (str.equals("video_view")) {
                        mo123114a("Video_content", "product", str2);
                        mo123117b("fb_mobile_content_view", "product", str2);
                        return;
                    }
                    return;
                case -1101213402:
                    if (str.equals("collect_video")) {
                        mo123117b("fb_mobile_add_to_wishlist", "product", str2);
                        return;
                    }
                    return;
                case 70775934:
                    if (str.equals("start_upload")) {
                        mo123117b("fb_mobile_initiated_checkout", null, null);
                        return;
                    }
                    return;
                case 109413407:
                    if (str.equals("shoot")) {
                        mo123117b("fb_mobile_add_payment_info", null, null);
                        return;
                    }
                    return;
                case 1263148345:
                    if (str.equals("mus_af_comment")) {
                        mo123117b("fb_mobile_rate", "product", str2);
                        return;
                    }
                    return;
                case 2026292779:
                    if (str.equals("mus_af_like_video_1")) {
                        if (C79560a.m138311a().getBoolean("is_first_like_success", true)) {
                            C79560a.m138312a("is_first_like_success", false);
                        }
                        mo123114a("like", "product", str2);
                        mo123117b("fb_mobile_add_to_cart", "product", str2);
                        return;
                    }
                    return;
                case 2026292783:
                    if (str.equals("mus_af_like_video_5")) {
                        int i2 = C79560a.m138311a().getInt("like_success_count", 0) + 1;
                        if (i2 != 5) {
                            i = i2;
                        }
                        C79560a.m138313b().putInt("like_success_count", i).apply();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: b */
    public final void mo123117b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        m138316b(str, str2, str3, new Bundle());
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c
    /* renamed from: a */
    public final void mo123114a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        m138315a(str, str2, str3, new Bundle());
    }

    /* renamed from: a */
    private static void m138315a(String str, String str2, String str3, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                bundle.putString("search_term", str3);
            } else {
                bundle.putString("item_id", str3);
            }
        }
        FirebaseAnalytics.getInstance(C17867d.m33078a()).mo46311a(str, bundle);
    }

    /* renamed from: b */
    private static void m138316b(String str, String str2, String str3, Bundle bundle) {
        C89219l.m154721d(bundle, "");
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("fb_content_type", str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (TextUtils.equals(str, "fb_mobile_search")) {
            bundle.putString("fb_search_string", str3);
        } else {
            bundle.putString("fb_content_id", str3);
        }
    }
}
