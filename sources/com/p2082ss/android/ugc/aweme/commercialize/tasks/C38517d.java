package com.p2082ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18146e;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18147f;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1273b.C18149a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2565c.C37892a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38594h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.d */
public final class C38517d {

    /* renamed from: a */
    public static final C38517d f91023a = new C38517d();

    private C38517d() {
    }

    static {
        Covode.recordClassIndex(46043);
    }

    /* renamed from: a */
    public static Bundle m78101a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("open_url", str);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m78100a(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            C89219l.m154716b(awemeRawAd, "");
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putString("light_page_web_url", awemeRawAd.getLightWebUrl());
            bundle.putInt("webview_type", awemeRawAd.getWebviewType());
            bundle.putInt("click_from", i);
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m78107b(String str, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            C89219l.m154716b(awemeRawAd, "");
            if (str == null && (str = awemeRawAd.getWebUrl()) == null) {
                str = C38594h.m78312b(aweme);
            }
            bundle.putString("real_web_url", str);
        }
        return bundle;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC18146e m78105a(Context context, AwemeRawAd awemeRawAd) {
        C38516c cVar = C38516c.f91022a;
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C18149a aVar = new C18149a(context, cVar);
        aVar.f43215c = awemeRawAd;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Bundle m78103a(String str, Aweme aweme, String str2) {
        AwemeRawAd awemeRawAd;
        long j;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            C89219l.m154716b(awemeRawAd, "");
            Long creativeId = awemeRawAd.getCreativeId();
            long j2 = 0;
            if (creativeId != null) {
                j = creativeId.longValue();
            } else {
                j = 0;
            }
            bundle.putLong("creative_id", j);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j2 = groupId.longValue();
            }
            bundle.putLong("group_id", j2);
            bundle.putString("open_url", str);
            bundle.putString("log_tag", str2);
            bundle.putString("aweme_id", aweme.getAid());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m78104a(String str, String str2, Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            C89219l.m154716b(awemeRawAd, "");
            bundle.putString("real_web_url", str);
            if (str2 == null) {
                str2 = awemeRawAd.getWebTitle();
            }
            bundle.putString("title", str2);
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putInt("click_from", i);
        }
        return bundle;
    }

    /* renamed from: a */
    public static C18147f m78106a(Context context, Aweme aweme, String str, int i) {
        AwemeRawAd awemeRawAd;
        if (context == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        C89219l.m154716b(awemeRawAd, "");
        boolean z = false;
        AbstractC18146e a = m78105a(context, awemeRawAd).mo28931a(0, m78101a(str)).mo28931a(1, m78103a(str, aweme, "draw_ad")).mo28931a(6, m78100a(aweme, i));
        Bundle bundle = new Bundle();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            C89219l.m154716b(awemeRawAd2, "");
            if (awemeRawAd2.getSplashInfo() != null) {
                AwemeSplashInfo splashInfo = awemeRawAd2.getSplashInfo();
                C89219l.m154716b(splashInfo, "");
                if (!TextUtils.isEmpty(splashInfo.getAwesomeSplashId())) {
                    z = true;
                }
            }
            bundle.putBoolean("is_awesome_splash_ad", z);
            bundle.putString("ad_type", awemeRawAd2.getType());
            bundle.putString("aweme_package_name", awemeRawAd2.getPackageName());
        }
        return a.mo28931a(9, bundle).mo28932c();
    }

    /* renamed from: a */
    public static /* synthetic */ Bundle m78099a(C38517d dVar, Context context, String str, String str2, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        long j;
        UrlModel originCover;
        List<String> urlList;
        Bundle a = m78098a(context, str, str2, aweme, z, "draw_ad", 0, null, 192);
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            String str3 = "";
            C89219l.m154716b(awemeRawAd, str3);
            if (C58067a.f132302a.mo95568a(awemeRawAd)) {
                C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    j = adId.longValue();
                } else {
                    j = 0;
                }
                a.putLong("ad_id", j);
                a.putString("render_type", nativeSiteConfig.getRenderType());
                a.putString("lynx_scheme", nativeSiteConfig.getLynxScheme());
                a.putInt("lynx_landing_style", nativeSiteConfig.getLynxLandingStyle());
                Video video = aweme.getVideo();
                if (!(video == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                    a.putString("video_cover", urlList.get(0));
                }
                List<String> geckoChannel = nativeSiteConfig.getGeckoChannel();
                if (geckoChannel != null && !geckoChannel.isEmpty()) {
                    str3 = geckoChannel.get(0);
                }
                a.putString("lynx_channel_name", str3);
                a.putString("native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                List<String> secondPageGeckoChannel = nativeSiteConfig.getSecondPageGeckoChannel();
                if (secondPageGeckoChannel != null) {
                    a.putStringArrayList("second_page_preload_channels", new ArrayList<>(secondPageGeckoChannel));
                }
                a.putString("key_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo());
                a.putString("native_site_app_data", awemeRawAd.getAppData());
                a.putString("log_tag", "draw_ad");
            }
        }
        return a;
    }

    /* renamed from: a */
    private static Bundle m78097a(Context context, String str, String str2, Aweme aweme, boolean z, String str3, int i, Boolean bool) {
        AwemeRawAd awemeRawAd;
        long j;
        String str4;
        C37892a preloadData;
        String jSONObject;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            String str5 = "";
            C89219l.m154716b(awemeRawAd, str5);
            Long creativeId = awemeRawAd.getCreativeId();
            long j2 = 0;
            if (creativeId != null) {
                j = creativeId.longValue();
            } else {
                j = 0;
            }
            bundle.putLong("creative_id", j);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j2 = groupId.longValue();
            }
            bundle.putLong("group_id", j2);
            bundle.putString("log_tag", str3);
            int i2 = 0;
            if (str == null) {
                str = awemeRawAd.getWebUrl();
                i2 = 1;
                if (str == null) {
                    str = C38594h.m78312b(aweme);
                }
            }
            bundle.putString("real_web_url", str);
            if (str2 == null) {
                str2 = awemeRawAd.getWebTitle();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = " ";
            }
            bundle.putString("title", str2);
            bundle.putBoolean("show_report", awemeRawAd.isReportEnable());
            bundle.putInt("app_ad_from", i);
            if (C38497a.f90936a.mo65621a(aweme)) {
                bundle.putString("enter_from", "topview");
            }
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("landing_page_info", awemeRawAd.getLandingPageInfo());
            bundle.putBoolean("disable_download_dialog", awemeRawAd.isDisableDownloadDialog());
            bundle.putString("download_url", awemeRawAd.getDownloadUrl());
            bundle.putString("aweme_package_name", awemeRawAd.getPackageName());
            bundle.putString("ad_quick_app_url", awemeRawAd.getQuickAppUrl());
            bundle.putString("download_app_name", awemeRawAd.getAppName());
            bundle.putString("web_url", awemeRawAd.getWebUrl());
            bundle.putString("web_title", awemeRawAd.getWebTitle());
            bundle.putInt("download_mode", awemeRawAd.getDownloadMode());
            bundle.putInt("link_mode", awemeRawAd.getLinkMode());
            bundle.putBoolean("support_multiple_download", awemeRawAd.isSupportMultiple());
            bundle.putString("open_url", awemeRawAd.getOpenUrl());
            JSONObject a = C38497a.f90936a.mo65612a(context, aweme, str5);
            if (!(a == null || (jSONObject = a.toString()) == null)) {
                str5 = jSONObject;
            }
            bundle.putString("aweme_json_extra", str5);
            bundle.putBoolean("use_default_color", awemeRawAd.isUseDefaultColor());
            bundle.putString("channel_name", awemeRawAd.getChannelName());
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putString("owner_id", aweme.getAuthorUid());
            bundle.putBoolean("use_ordinary_web", z);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (preloadData = awemeRawAd2.getPreloadData()) == null) {
                str4 = null;
            } else {
                str4 = preloadData.getSiteId();
            }
            bundle.putString("site_id", str4);
            bundle.putInt("preload_web_status", awemeRawAd.getPreloadWeb());
            bundle.putInt("preload_is_web_url", i2);
            bundle.putInt("web_type", awemeRawAd.getWebType());
            bundle.putBoolean("enable_web_report", awemeRawAd.isEnableWebReport());
            bundle.putInt("webview_progress_bar", awemeRawAd.getWebviewProgressBar());
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                bundle.putString("commerce_enter_from", "splash");
            } else {
                bundle.putString("commerce_enter_from", "feedad");
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static /* synthetic */ Bundle m78098a(Context context, String str, String str2, Aweme aweme, boolean z, String str3, int i, Boolean bool, int i2) {
        if ((i2 & 32) != 0) {
            str3 = "draw_ad";
        }
        if ((i2 & 64) != 0) {
            i = 1;
        }
        if ((i2 & 128) != 0) {
            bool = false;
        }
        return m78097a(context, str, str2, aweme, z, str3, i, bool);
    }
}
