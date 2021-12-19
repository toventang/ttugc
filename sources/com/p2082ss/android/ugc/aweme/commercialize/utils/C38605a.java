package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a */
public final class C38605a {

    /* renamed from: a */
    public static final C38605a f91222a = new C38605a();

    private C38605a() {
    }

    static {
        Covode.recordClassIndex(46146);
    }

    /* renamed from: a */
    public static Bundle m78335a(Bundle bundle, Context context) {
        if (context == null) {
            return bundle;
        }
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m78336a(Bundle bundle, Aweme aweme, Context context) {
        String str;
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getWebUrl();
            } else {
                str = null;
            }
            bundle.putString("url", str);
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putBoolean("control_request_url", true);
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m78338c(Bundle bundle, Aweme aweme, Context context) {
        String str;
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getWebTitle();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = " ";
            }
            bundle.putString("bundle_web_title", str);
            boolean z = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || !awemeRawAd2.isUseDefaultColor()) {
                bundle.putInt("bundle_webview_background", -1);
            } else {
                bundle.putInt("bundle_webview_background", C0643b.m2378c(context, R.color.l));
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                bundle.putBoolean("show_report", awemeRawAd3.isReportEnable());
            }
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                bundle.putBoolean("use_ordinary_web", C50543k.m94758a(awemeRawAd4));
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 == null || awemeRawAd5.getWebviewProgressBar() != 1) {
                z = false;
            }
            bundle.putBoolean("webview_progress_bar", z);
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0199  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m78337b(android.os.Bundle r10, com.p2082ss.android.ugc.aweme.feed.model.Aweme r11, android.content.Context r12) {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.utils.C38605a.m78337b(android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):android.os.Bundle");
    }
}
