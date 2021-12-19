package com.bytedance.android.livesdk.actionhandler;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.C2940n;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.android.livesdk.actionhandler.s */
public final class C6627s implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7365);
    }

    /* renamed from: a */
    private static String m14110a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (C13627m.m24498a(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        String queryParameter2 = uri.getQueryParameter("status_bar_height");
        if (!C13627m.m24498a(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        if (TextUtils.equals("webcast_webview", uri.getHost()) && !TextUtils.equals("1", uri.getQueryParameter("use_new_container"))) {
            return true;
        }
        if (TextUtils.equals("webcast_lynxview", uri.getHost()) || !TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C4031a a;
        Activity activity;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Activity activity2;
        String a2 = m14110a(uri);
        if (C13627m.m24498a(a2)) {
            return false;
        }
        String a3 = m14110a(uri);
        String str4 = "";
        if (!C13627m.m24498a(a3)) {
            String queryParameter = uri.getQueryParameter(StringSet.type);
            if (queryParameter == null) {
                queryParameter = str4;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != 106852524) {
                if (hashCode == 110066619 && !queryParameter.equals("fullscreen")) {
                }
            } else if (queryParameter.equals("popup")) {
                if (TextUtils.equals("bottom", uri.getQueryParameter("gravity"))) {
                    if (m14109a(uri, "disable_mask_click_close", 0) == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC6956d.C6958b a4 = AbstractC6963e.m14871a(a3).mo13259a(m14109a(uri, "radius", 8), m14109a(uri, "radius", 8), 0, 0);
                    a4.f17399c = m14109a(uri, "height", 400);
                    a4.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                    a4.f17406j = 80;
                    a4.f17420x = uri.getQueryParameter("title");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_bar")) || "1".equals(uri.getQueryParameter("show_title_bar"))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    a4.f17421y = z8;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_share")) || "1".equals(uri.getQueryParameter("show_title_share"))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a4.f17422z = z9;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("title_bar_share_add_report_action")) || "1".equals(uri.getQueryParameter("title_bar_share_add_report_action"))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a4.f17387A = z10;
                    a4.f17388B = uri.getQueryParameter("report_schema");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_close")) || "1".equals(uri.getQueryParameter("show_title_close"))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a4.f17389C = z11;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("use_page_back")) || "1".equalsIgnoreCase(uri.getQueryParameter("use_page_back"))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a4.f17414r = z12;
                    AbstractC6956d.C6958b b = a4.mo13261b(uri.getQueryParameter("popup_enter_type"));
                    if (m14109a(uri, "show_dim", -1) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b.f17413q = z13;
                    AbstractC6956d.C6958b a5 = b.mo13260a(uri.getQueryParameter("mask_alpha"));
                    a5.f17419w = z7;
                    if ("1".equals(uri.getQueryParameter("pull_down_close"))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    a5.f17394H = z14;
                    a5.f17395I = C2940n.m8266a(uri, "variable_height", uri.getQueryParameter("variable_height"));
                    a5.f17391E = uri.toString();
                    a = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13245a(a5);
                    if (!(context instanceof Activity)) {
                        activity2 = ((IHostApp) C6193a.m13435a(IHostApp.class)).getTopActivity();
                    } else {
                        activity2 = context;
                    }
                    ActivityC0945e b2 = C3888a.m9506b(activity2);
                    if (b2 != null) {
                        C4031a.m9839a(b2, a);
                    }
                } else {
                    if (m14109a(uri, "mask_click_disable", 0) == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AbstractC6956d.C6958b a6 = AbstractC6963e.m14871a(a3).mo13258a(m14109a(uri, "radius", 8));
                    a6.f17399c = m14109a(uri, "height", 400);
                    a6.f17398b = m14109a(uri, "width", 300);
                    a6.f17419w = z2;
                    a6.f17406j = 17;
                    a6.f17420x = uri.getQueryParameter("title");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_bar")) || "1".equals(uri.getQueryParameter("show_title_bar"))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a6.f17421y = z3;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_close")) || "1".equals(uri.getQueryParameter("show_title_close"))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a6.f17389C = z4;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("use_page_back")) || "1".equalsIgnoreCase(uri.getQueryParameter("use_page_back"))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    a6.f17414r = z5;
                    if (m14109a(uri, "show_dim", -1) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    a6.f17413q = z6;
                    AbstractC6956d.C6958b a7 = a6.mo13261b(uri.getQueryParameter("popup_enter_type")).mo13260a(uri.getQueryParameter("mask_alpha"));
                    a7.f17391E = uri.toString();
                    String queryParameter2 = uri.getQueryParameter("close_button");
                    if (!C13627m.m24498a(queryParameter2) && "true".equals(queryParameter2)) {
                        a7.f17409m = true;
                    }
                    String queryParameter3 = uri.getQueryParameter("disable_background");
                    if (!C13627m.m24498a(queryParameter3) && "true".equals(queryParameter3)) {
                        a7.f17419w = false;
                    }
                    a = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13245a(a7);
                    if (!(context instanceof Activity)) {
                        activity = ((IHostApp) C6193a.m13435a(IHostApp.class)).getTopActivity();
                    } else {
                        activity = context;
                    }
                    ActivityC0945e b3 = C3888a.m9506b(activity);
                    if (b3 != null) {
                        C4031a.m9839a(b3, a);
                    }
                }
                if (a != null) {
                    return true;
                }
            }
        }
        AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
        AbstractC6956d.C6957a b4 = AbstractC6963e.m14872b(a2);
        if (m14109a(uri, "hide_nav_bar", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        b4.f17379c = z;
        if (uri != null) {
            str = uri.getQueryParameter("status_bar_color");
        } else {
            str = str4;
        }
        b4.f17382f = str;
        if (uri != null) {
            str2 = uri.getQueryParameter("status_bar_bg_color");
        } else {
            str2 = str4;
        }
        b4.f17383g = str2;
        boolean z15 = false;
        if (m14109a(uri, "hide_status_bar", 0) == 1) {
            z15 = true;
        }
        b4.f17380d = z15;
        if (uri != null) {
            str3 = uri.getQueryParameter("soft_input_mode");
        } else {
            str3 = str4;
        }
        b4.f17386j = str3;
        if (uri != null) {
            str4 = uri.toString();
        }
        b4.f17384h = str4;
        webViewManager.mo13248a(context, b4);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }

    /* renamed from: a */
    private static int m14109a(Uri uri, String str, int i) {
        try {
            return Integer.parseInt((String) Objects.requireNonNull(uri.getQueryParameter(str)));
        } catch (Exception unused) {
            return i;
        }
    }
}
