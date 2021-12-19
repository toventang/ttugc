package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d */
public final class C38739d {
    static {
        Covode.recordClassIndex(46280);
    }

    /* renamed from: c */
    public static Bundle m78576c(Aweme aweme) {
        Bundle a = m78572a(aweme);
        CardStruct h = C37699a.m76299h(aweme);
        if (h != null && !TextUtils.isEmpty(h.getCardUrl())) {
            a.putString("url", h.getCardUrl());
            a.putBoolean("use_css_injection", false);
        }
        if (C38620ad.m78374a(aweme)) {
            a.putBoolean("show_load_dialog", true);
        }
        return a;
    }

    /* renamed from: a */
    public static Bundle m78571a(C38751k kVar) {
        if (kVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", kVar.f91510a);
        bundle.putLong("aweme_creative_id", kVar.f91510a);
        bundle.putString("bundle_download_app_log_extra", kVar.f91511b);
        bundle.putString("group_id", String.valueOf(kVar.f91512c));
        bundle.putString("ad_type", kVar.f91519j);
        bundle.putInt("ad_system_origin", kVar.f91520k);
        if (!TextUtils.isEmpty(kVar.f91516g)) {
            bundle.putString("bundle_download_url", kVar.f91516g);
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("aweme_package_name", kVar.f91517h);
            bundle.putString("bundle_download_app_name", kVar.f91518i);
        }
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().mo59941c());
        if (kVar.f91522m != null) {
            bundle.putString("aweme_id", kVar.f91522m.getAid());
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m78574b(Aweme aweme) {
        Bundle a = m78572a(aweme);
        CardStruct ar = C37699a.m76272ar(aweme);
        if (ar != null) {
            if (!TextUtils.isEmpty(ar.getCardUrl()) && C37699a.m76227a(ar)) {
                a.putString("url", Uri.parse(ar.getCardUrl()).buildUpon().appendQueryParameter(StringSet.type, "4").toString());
                a.putBoolean("use_css_injection", false);
            } else if (!TextUtils.isEmpty(ar.getCardUrl()) && ar.getCardType() == 1001) {
                a.putString("url", ar.getCardUrl());
            }
        }
        a.putBoolean("show_load_dialog", true);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m78577d(com.p2082ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d.m78577d(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static Bundle m78572a(Aweme aweme) {
        Bundle bundle = new Bundle();
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        long longValue = aweme.getAwemeRawAd().getCreativeId().longValue();
        String logExtra = aweme.getAwemeRawAd().getLogExtra();
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        String quickAppUrl = aweme.getAwemeRawAd().getQuickAppUrl();
        String c = C37699a.m76286c(aweme);
        CardStruct e = C37699a.m76292e(aweme);
        if (C37699a.m76227a(e)) {
            c = Uri.parse(c).buildUpon().appendQueryParameter(StringSet.type, "3").toString();
        }
        bundle.putString("url", c);
        bundle.putLong("ad_id", longValue);
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().mo59941c());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("show_load_dialog", false);
        bundle.putString("bundle_download_app_log_extra", logExtra);
        bundle.putString("bundle_download_url", downloadUrl);
        bundle.putString("bundle_ad_quick_app_url", quickAppUrl);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putBoolean("bundle_show_download_status_bar", false);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        bundle.putString("preload_scene", "feed");
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putString("commerce_enter_from", "feedad");
        if (e != null) {
            bundle.putBoolean("bundle_enable_card_preload", e.isEnablePreload());
        }
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m78569a(Bundle bundle, Context context) {
        if (!(bundle == null || context == null)) {
            bundle.putInt("bundle_app_ad_from", 1);
            bundle.putBoolean("bundle_is_ad_fake", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m78570a(Bundle bundle, Aweme aweme, Context context) {
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putBoolean("control_request_url", true);
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m78575c(Bundle bundle, Aweme aweme, Context context) {
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            String webTitle = aweme.getAwemeRawAd().getWebTitle();
            if (TextUtils.isEmpty(webTitle)) {
                webTitle = " ";
            }
            bundle.putString("bundle_web_title", webTitle);
            boolean z = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            if (aweme.getAwemeRawAd().isUseDefaultColor()) {
                bundle.putInt("bundle_webview_background", C0643b.m2378c(context, R.color.l));
            } else {
                bundle.putInt("bundle_webview_background", -1);
            }
            bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
            bundle.putBoolean("use_ordinary_web", C50543k.m94758a(aweme.getAwemeRawAd()));
            if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
                z = false;
            }
            bundle.putBoolean("webview_progress_bar", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m78573b(Bundle bundle, Aweme aweme, Context context) {
        String webTitle;
        String jSONObject;
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            Long creativeId = aweme.getAwemeRawAd().getCreativeId();
            bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
            String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
            if (!TextUtils.isEmpty(downloadUrl)) {
                bundle.putBoolean("bundle_is_from_app_ad", true);
                bundle.putString("bundle_download_url", downloadUrl);
                bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
                bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
                if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                    bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
                }
                bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
                bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
                bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
                bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
                bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
            }
            bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
                webTitle = aweme.getAwemeRawAd().getSource();
            } else {
                webTitle = aweme.getAwemeRawAd().getWebTitle();
            }
            bundle.putString("bundle_download_app_name", webTitle);
            bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
            String packageName = aweme.getAwemeRawAd().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                bundle.putString("aweme_package_name", packageName);
            }
            JSONObject a = C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
            if (a == null) {
                jSONObject = "";
            } else {
                jSONObject = a.toString();
            }
            bundle.putString("aweme_json_extra", jSONObject);
            Long groupId = aweme.getAwemeRawAd().getGroupId();
            if (!(groupId == null || groupId.longValue() == 0)) {
                bundle.putString("aweme_group_id", String.valueOf(groupId));
            }
            if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
                bundle.putString("aweme_creative_id", String.valueOf(creativeId));
            }
            bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
            bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
            bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
            bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
            bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
            bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
            bundle.putString("preload_scene", "feed");
            bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
            bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
            bundle.putInt("preload_is_web_url", 1);
            bundle.putString("commerce_enter_from", "feedad");
            bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
            bundle.putBoolean("bundle_forbidden_jump", true);
            bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().mo59941c());
            bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        }
        return bundle;
    }
}
