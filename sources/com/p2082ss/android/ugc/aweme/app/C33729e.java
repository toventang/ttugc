package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.e */
public final class C33729e {

    /* renamed from: a */
    public static final C33729e f79893a = new C33729e();

    private C33729e() {
    }

    static {
        Covode.recordClassIndex(40624);
    }

    /* renamed from: a */
    public static boolean m69050a(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        return C89219l.m154714a((Object) "1", (Object) str);
    }

    /* renamed from: b */
    public static boolean m69051b(String str) {
        C89219l.m154721d(str, "");
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || !m69050a(parse.getQueryParameter("hide_more"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final Intent m69049a(Context context, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (uri == null || context == null) {
            return null;
        }
        try {
            Intent intent = new Intent();
            try {
                intent.setClass(context, CrossPlatformActivity.class);
                String queryParameter = uri.getQueryParameter("url");
                if (queryParameter == null) {
                    return null;
                }
                if (queryParameter.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                boolean a = m69050a(uri.getQueryParameter("rotate"));
                boolean a2 = m69050a(uri.getQueryParameter("no_hw"));
                boolean a3 = m69050a(uri.getQueryParameter("hide_more"));
                boolean a4 = m69050a(uri.getQueryParameter("hide_bar"));
                boolean a5 = m69050a(uri.getQueryParameter("hide_status_bar"));
                boolean a6 = m69050a(uri.getQueryParameter("hide_nav_bar"));
                boolean a7 = m69050a(uri.getQueryParameter("hide_more"));
                if (a4 || a6) {
                    z2 = true;
                    intent.putExtra("hide_nav_bar", true);
                } else {
                    z2 = true;
                }
                if (a5) {
                    intent.putExtra("hide_status_bar", z2);
                }
                String queryParameter2 = uri.getQueryParameter("ad_id");
                if (!C13627m.m24498a(queryParameter2)) {
                    if (queryParameter2 == null) {
                        try {
                            C89219l.m154715b();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    C89219l.m154716b(intent.putExtra("ad_id", Long.parseLong(queryParameter2)), "");
                }
                String queryParameter3 = uri.getQueryParameter("adinfojson");
                if (!C13627m.m24498a(queryParameter3)) {
                    JSONObject jSONObject = new JSONObject(queryParameter3);
                    String string = jSONObject.getString("cid");
                    String string2 = jSONObject.getString("log_extra");
                    if (!C13627m.m24498a(string)) {
                        intent.putExtra("ad_id", Long.parseLong(string));
                    }
                    if (!C13627m.m24498a(string2)) {
                        intent.putExtra("bundle_download_app_log_extra", string2);
                    }
                }
                if (C89361p.m154874b(queryParameter, "http://", true) || C89361p.m154874b(queryParameter, "https://", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    queryParameter = URLDecoder.decode(queryParameter, "UTF-8");
                }
                intent.setData(Uri.parse(queryParameter));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (a) {
                    intent.putExtra("orientation", 0);
                }
                if (a2) {
                    intent.putExtra("bundle_no_hw_acceleration", a2);
                }
                if (a3) {
                    intent.putExtra("hide_more", a3);
                }
                if (a7) {
                    intent.putExtra("hide_more", a7);
                }
                String queryParameter4 = uri.getQueryParameter("title");
                if (C13627m.m24498a(queryParameter4)) {
                    queryParameter4 = Uri.parse(queryParameter).getQueryParameter("title");
                }
                String queryParameter5 = uri.getQueryParameter("title_extra");
                if (!C13627m.m24498a(queryParameter5)) {
                    queryParameter4 = queryParameter5;
                }
                if (!C13627m.m24498a(queryParameter4)) {
                    intent.putExtra("title", queryParameter4);
                    z4 = true;
                } else {
                    intent.putExtra("title", " ");
                    z4 = true;
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter6 = uri.getQueryParameter("gd_label");
                if (!C13627m.m24498a(queryParameter6)) {
                    intent.putExtra("gd_label", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("gd_ext_json");
                if (!C13627m.m24498a(queryParameter7)) {
                    intent.putExtra("gd_ext_json", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("webview_track_key");
                if (!C13627m.m24498a(queryParameter8)) {
                    intent.putExtra("webview_track_key", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("wap_headers");
                if (!C13627m.m24498a(queryParameter9)) {
                    intent.putExtra("wap_headers", queryParameter9);
                }
                intent.putExtra("bundle_auto_play_audio", m69050a(uri.getQueryParameter("auto_play_bgm")));
                if (m69050a(uri.getQueryParameter("hide_loading"))) {
                    z4 = false;
                }
                intent.putExtra("show_load_dialog", z4);
                String queryParameter10 = uri.getQueryParameter("status_bar_color");
                if (!C13627m.m24498a(queryParameter10)) {
                    intent.putExtra("status_bar_color", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("load_no_cache");
                if (!C13627m.m24498a(queryParameter11)) {
                    intent.putExtra("load_no_cache", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("add_common");
                if (!C13627m.m24498a(queryParameter12)) {
                    intent.putExtra("add_common", queryParameter12);
                }
                return intent;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
