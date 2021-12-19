package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1721g.C23144b;
import com.lynx.tasm.EnumC28856r;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38663a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40545l;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.C33369f;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a.a */
public final class C38665a {

    /* renamed from: a */
    public static final C38665a f91363a = new C38665a();

    private C38665a() {
    }

    static {
        Covode.recordClassIndex(46206);
    }

    /* renamed from: a */
    private static Bundle m78451a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m78452a(String str) {
        if (str != null && str.length() != 0) {
            C40538e.m81839a();
            C40538e.m81840a(new C40545l(str, "Jump directly to open the landing page"));
        }
    }

    /* renamed from: a */
    public static boolean m78456a(String str, Context context, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        if (C89219l.m154714a((Object) parse.getScheme(), (Object) "market")) {
            if (!C38669b.m78459a(context)) {
                C38663a.m78442a(context, awemeRawAd, str);
                while (true) {
                    if (context != null) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            Activity activity = (Activity) context;
                            if (activity != null) {
                                new C23144b(activity).mo37640e(R.string.o6).mo37637b();
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (C38669b.m78460a(context, parse)) {
                C38663a.m78445b(context, awemeRawAd, str);
            }
            return true;
        } else if (C38669b.m78463a(parse)) {
            if (!C38669b.m78459a(context)) {
                return false;
            }
            if (C38669b.m78464b(context, parse)) {
                C38663a.m78445b(context, awemeRawAd, str);
            }
            return true;
        } else if (C38767w.m78644a(parse)) {
            if (!C38663a.m78448c(context, parse)) {
                return false;
            }
            if (C38663a.m78443a(context, parse)) {
                C38663a.m78445b(context, awemeRawAd, str);
            }
            return true;
        } else if (C38663a.m78449d(context, parse)) {
            if (C38663a.m78446b(context, parse)) {
                C38663a.m78445b(context, awemeRawAd, str);
            }
            return true;
        } else {
            if (!(!C89219l.m154714a((Object) "sslocal", (Object) parse.getScheme())) || !(!C89219l.m154714a((Object) "localsdk", (Object) parse.getScheme()))) {
                C33722d.C33723a.m69045a(context, str, (String) null, false);
            } else {
                C38663a.m78442a(context, awemeRawAd, str);
            }
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity2 = (Activity) context;
                        if (activity2 != null) {
                            new C23144b(activity2).mo37640e(R.string.o6).mo37637b();
                        }
                    }
                } else {
                    break;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m78453a(Context context, Aweme aweme, Bundle bundle) {
        String str;
        String str2;
        List<String> secondPageGeckoChannel;
        String str3;
        List<String> geckoChannel;
        UrlModel originCover;
        List<String> urlList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        C89219l.m154716b(awemeRawAd, "");
        if (awemeRawAd.getNonNativeClick() != 0 || !C58067a.f132302a.mo95568a(awemeRawAd)) {
            return false;
        }
        C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig == null || (str = nativeSiteConfig.getLynxScheme()) == null) {
            str = "";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        bundle.putBoolean("need_bottom_out", true);
        C38220ag nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig2 != null && nativeSiteConfig2.getLynxLandingStyle() == 1) {
            Video video = aweme.getVideo();
            if (!(video == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                bundle.putString("bundle_full_screen_bg_image", urlList.get(0));
            }
            bundle.putInt("bundle_webview_background", 0);
        }
        C38220ag nativeSiteConfig3 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig3 == null || (geckoChannel = nativeSiteConfig3.getGeckoChannel()) == null || geckoChannel.isEmpty()) {
            str2 = "";
        } else {
            str2 = geckoChannel.get(0);
        }
        bundle.putString("lynx_channel_name", str2);
        bundle.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
        C38220ag nativeSiteConfig4 = awemeRawAd.getNativeSiteConfig();
        if (!(nativeSiteConfig4 == null || (secondPageGeckoChannel = nativeSiteConfig4.getSecondPageGeckoChannel()) == null || secondPageGeckoChannel.isEmpty())) {
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f == null || (str3 = f.mo59382b(awemeRawAd.getAdId())) == null) {
                str3 = "";
            }
            bundle.putString("second_page_preload_channel_prefix", str3);
            C33369f.f79310b.mo59416b(secondPageGeckoChannel);
        }
        bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
        bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(context) - C80534hh.m139609b(), 1073741824));
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        if (parse.isHierarchical()) {
            bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                bundle.putBoolean("preset_safe_point", true);
                bundle.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("lynx_landing_page_data", C58067a.f132302a.mo95567a(awemeRawAd, context));
        buildUpon.appendQueryParameter("lynx_landing_page_title", awemeRawAd.getWebTitle());
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        C34963b.m71413a(context, builder, "ad_commerce", bundle);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a.a$a */
    public static final class C38666a {

        /* renamed from: a */
        public Long f91364a;

        /* renamed from: b */
        public String f91365b;

        /* renamed from: c */
        public String f91366c;

        /* renamed from: d */
        public String f91367d;

        /* renamed from: e */
        public String f91368e;

        /* renamed from: f */
        public String f91369f;

        /* renamed from: g */
        public int f91370g;

        /* renamed from: h */
        public int f91371h;

        static {
            Covode.recordClassIndex(46207);
        }

        public C38666a() {
            this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
        }

        public C38666a(Long l, String str, String str2, String str3, String str4, String str5, byte b) {
            this(l, str, str2, str3, str4, str5, 192);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38666a)) {
                return false;
            }
            C38666a aVar = (C38666a) obj;
            return C89219l.m154714a(this.f91364a, aVar.f91364a) && C89219l.m154714a(this.f91365b, aVar.f91365b) && C89219l.m154714a(this.f91366c, aVar.f91366c) && C89219l.m154714a(this.f91367d, aVar.f91367d) && C89219l.m154714a(this.f91368e, aVar.f91368e) && C89219l.m154714a(this.f91369f, aVar.f91369f) && this.f91370g == aVar.f91370g && this.f91371h == aVar.f91371h;
        }

        public final int hashCode() {
            Long l = this.f91364a;
            int i = 0;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            String str = this.f91365b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f91366c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f91367d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f91368e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f91369f;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return ((((hashCode5 + i) * 31) + this.f91370g) * 31) + this.f91371h;
        }

        public final String toString() {
            return "AdWebUrlData(creativeId=" + this.f91364a + ", logExtra=" + this.f91365b + ", downloadUrl=" + this.f91366c + ", packageName=" + this.f91367d + ", appName=" + this.f91368e + ", adType=" + this.f91369f + ", adSystemOrigin=" + this.f91370g + ", appAdFrom=" + this.f91371h + ")";
        }

        private C38666a(Long l, String str, String str2, String str3, String str4, String str5) {
            this.f91364a = l;
            this.f91365b = str;
            this.f91366c = str2;
            this.f91367d = str3;
            this.f91368e = str4;
            this.f91369f = str5;
            this.f91370g = 0;
            this.f91371h = 0;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38666a(Long l, String str, String str2, String str3, String str4, String str5, int i) {
            this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null);
        }
    }

    /* renamed from: a */
    public static final boolean m78455a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C38666a aVar) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            C29844g gVar = new C29844g(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                gVar.mo52130a(entry.getKey(), entry.getValue());
            }
            str = gVar.mo52126a();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        Uri data = intent.getData();
        Integer num = null;
        if (!TextUtils.equals(data != null ? data.getQueryParameter("launch_mode") : null, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f91365b)) {
                intent.putExtra("bundle_download_app_log_extra", aVar.f91365b);
            }
            Long l = aVar.f91364a;
            if (l == null || l.longValue() != 0) {
                intent.putExtra("ad_id", aVar.f91364a);
                intent.putExtra("ad_type", aVar.f91369f);
                intent.putExtra("ad_system_origin", aVar.f91370g);
                intent.putExtra("aweme_creative_id", String.valueOf(aVar.f91364a));
            }
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<String> jsActlogUrl = inst.getJsActlogUrl();
            C89219l.m154716b(jsActlogUrl, "");
            String c = jsActlogUrl.mo59941c();
            if (!TextUtils.isEmpty(c)) {
                intent.putExtra("ad_js_url", c);
            }
            if (!TextUtils.isEmpty(aVar.f91366c)) {
                intent.putExtra("bundle_download_url", aVar.f91366c);
                intent.putExtra("aweme_package_name", aVar.f91367d);
                intent.putExtra("bundle_download_app_name", aVar.f91368e);
                intent.putExtra("bundle_app_ad_from", aVar.f91371h);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str3 = map.get("aweme_package_name");
                    String str4 = map.get("bundle_app_ad_from");
                    if (str4 != null) {
                        num = Integer.valueOf(Integer.parseInt(str4));
                    }
                    intent.putExtra("bundle_app_ad_from", num);
                    intent.putExtra("aweme_package_name", str3);
                    if (num != null && num.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        m78452a(str);
        return C38767w.m78632a(context, intent);
    }

    /* renamed from: a */
    public static final boolean m78454a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2, int i, Boolean bool) {
        int i2;
        String str3;
        boolean z3;
        String channelName;
        String appName;
        String str4 = str;
        String str5 = str2;
        if (context == null || aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (str4 == null) {
            if (awemeRawAd == null) {
                C89219l.m154715b();
            }
            str4 = awemeRawAd.getWebUrl();
            i2 = 1;
            if (str4 == null && (str4 = C38703bs.m78538f(aweme)) == null) {
                return false;
            }
        } else {
            i2 = 0;
        }
        Uri.parse(str4);
        if ((C38703bs.m78531b(awemeRawAd) || C38703bs.m78533c(awemeRawAd)) && m78456a(str4, context, awemeRawAd)) {
            return true;
        }
        if (str5 == null) {
            if (awemeRawAd == null) {
                C89219l.m154715b();
            }
            str5 = awemeRawAd.getWebTitle();
        } else if (awemeRawAd == null) {
            C89219l.m154715b();
        }
        Long creativeId = awemeRawAd.getCreativeId();
        Long groupId = awemeRawAd.getGroupId();
        String logExtra = awemeRawAd.getLogExtra();
        String downloadUrl = awemeRawAd.getDownloadUrl();
        JSONObject a = C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
        String packageName = awemeRawAd.getPackageName();
        String quickAppUrl = awemeRawAd.getQuickAppUrl();
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        if (C58067a.f132302a.mo95568a(aweme.getAwemeRawAd())) {
            if (i == 5) {
                C18129a.m33746a("result_ad", "open_url_h5", awemeRawAd).mo28900b("refer", "button").mo28897a("render_type", "lynx").mo28901b();
            } else if (i == 8) {
                C18129a.m33746a("result_ad_bg", "open_url_h5", awemeRawAd).mo28900b("refer", "bg_more_button").mo28897a("render_type", "lynx").mo28901b();
            } else {
                C38189j.m77532g(context, aweme);
                C18129a.m33746a("draw_ad", "open_url_h5", awemeRawAd).mo28897a("render_type", "lynx").mo28902c();
            }
        } else if (i == 5) {
            C18129a.m33746a("result_ad", "open_url_h5", awemeRawAd).mo28900b("refer", "button").mo28901b();
        } else if (i == 8) {
            C18129a.m33746a("result_ad_bg", "open_url_h5", awemeRawAd).mo28900b("refer", "bg_more_button").mo28901b();
        } else {
            C38189j.m77529f(context, aweme);
            C18129a.m33746a("draw_ad", "open_url_h5", awemeRawAd).mo28902c();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str4));
        if (TextUtils.isEmpty(str5)) {
            str5 = " ";
        }
        if (!TextUtils.isEmpty(str5)) {
            intent.putExtra("title", str5);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", awemeRawAd.isReportEnable());
        if (!TextUtils.isEmpty(logExtra)) {
            intent.putExtra("bundle_download_app_log_extra", logExtra);
        }
        intent.putExtra("bundle_app_ad_from", i);
        if (C37699a.m76199B(aweme)) {
            intent.putExtra("enter_from", "topview");
        }
        String str6 = "";
        if (creativeId == null || creativeId.longValue() != 0) {
            C89219l.m154716b(creativeId, str6);
            intent.putExtra("ad_id", creativeId.longValue());
            intent.putExtra("ad_type", awemeRawAd.getType());
            intent.putExtra("ad_system_origin", awemeRawAd.getSystemOrigin());
            intent.putExtra("bundle_download_app_extra", String.valueOf(creativeId.longValue()));
            intent.putExtra("landing_page_info", awemeRawAd.getLandingPageInfo());
            intent.putExtra("enable_web_google_login", awemeRawAd.isEnableWebGoogleLogin());
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, str6);
        C33594aj<String> jsActlogUrl = inst.getJsActlogUrl();
        C89219l.m154716b(jsActlogUrl, str6);
        String c = jsActlogUrl.mo59941c();
        if (!TextUtils.isEmpty(c)) {
            intent.putExtra("ad_js_url", c);
        }
        intent.putExtra("bundle_disable_download_dialog", awemeRawAd.isDisableDownloadDialog());
        if (!TextUtils.isEmpty(downloadUrl)) {
            intent.putExtra("bundle_is_from_app_ad", true);
            intent.putExtra("bundle_download_url", downloadUrl);
            intent.putExtra("aweme_package_name", packageName);
            intent.putExtra("bundle_ad_quick_app_url", quickAppUrl);
            boolean isEmpty = TextUtils.isEmpty(awemeRawAd.getAppName());
            if (isEmpty) {
                appName = awemeRawAd.getWebTitle();
            } else if (!isEmpty) {
                appName = awemeRawAd.getAppName();
            } else {
                throw new C89376n();
            }
            intent.putExtra("bundle_download_app_name", appName);
            intent.putExtra("bundle_download_mode", awemeRawAd.getDownloadMode());
            intent.putExtra("bundle_link_mode", awemeRawAd.getLinkMode());
            intent.putExtra("bundle_support_multiple_download", awemeRawAd.isSupportMultiple());
            intent.putExtra("bundle_web_url", awemeRawAd.getWebUrl());
            intent.putExtra("bundle_web_title", awemeRawAd.getWebTitle());
            String openUrl = awemeRawAd.getOpenUrl();
            if (C37699a.m76283b(openUrl)) {
                Uri.Builder buildUpon = Uri.parse(AbstractC37639a.AbstractC37640a.f89002a).buildUpon();
                if (i == 5) {
                    buildUpon.appendQueryParameter("tag", "result_ad");
                }
                C89219l.m154716b(openUrl, str6);
                String builder = buildUpon.toString();
                C89219l.m154716b(builder, str6);
                openUrl = C89361p.m154868a(openUrl, "__back_url__", builder);
            }
            intent.putExtra("bundle_open_url", openUrl);
        }
        if (a == null || (str3 = a.toString()) == null) {
            str3 = str6;
        }
        intent.putExtra("aweme_json_extra", str3);
        if (!(groupId == null || groupId.longValue() == 0)) {
            intent.putExtra("aweme_group_id", String.valueOf(groupId.longValue()));
        }
        if (creativeId.longValue() != 0) {
            intent.putExtra("aweme_creative_id", String.valueOf(creativeId.longValue()));
        }
        if (!TextUtils.isEmpty(packageName)) {
            intent.putExtra("aweme_package_name", packageName);
        }
        if (awemeRawAd.isUseDefaultColor()) {
            intent.putExtra("bundle_webview_background", C0643b.m2378c(context, R.color.l));
        } else {
            intent.putExtra("bundle_webview_background", -1);
        }
        intent.putExtra("aweme_id", aweme.getAid());
        intent.putExtra("owner_id", aweme.getAuthorUid());
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z);
        intent.addFlags(268435456);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (channelName = awemeRawAd2.getChannelName()) == null)) {
            str6 = channelName;
        }
        intent.putExtra("preload_channel_name", str6);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", awemeRawAd.getPreloadWeb());
        intent.putExtra("preload_web_status_new", awemeRawAd.getPreloadWebNew());
        intent.putExtra("preload_is_web_url", i2);
        intent.putExtra("web_type", awemeRawAd.getWebType());
        intent.putExtra("enable_web_report", awemeRawAd.isEnableWebReport());
        if (awemeRawAd.getWebviewProgressBar() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        intent.putExtra("webview_progress_bar", z3);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            intent.putExtra("commerce_enter_from", "splash");
        } else {
            intent.putExtra("commerce_enter_from", "feedad");
        }
        C38659ay.f91340a = awemeRawAd;
        m78452a(str4);
        if (m78453a(context, aweme, m78451a(intent))) {
            return true;
        }
        if (!C37588c.m75845a()) {
            return C38767w.m78632a(context, intent);
        }
        C34963b.m71413a(context, str4, "ad_commerce", m78451a(intent));
        return true;
    }
}
