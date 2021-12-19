package com.p2082ss.android.ugc.aweme.crossplatform.p2706a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.gyf.barlibrary.ImmersionBar;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.web.C81546h;
import com.p2082ss.android.ugc.trill.R;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.a.a */
public abstract class AbstractC40518a {
    static {
        Covode.recordClassIndex(48334);
    }

    /* renamed from: a */
    public static String m81726a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "webview_back" : "react-native" : "webview";
    }

    /* renamed from: a */
    public static boolean m81732a(C40618a aVar, Activity activity) {
        if (!C80534hh.m139608a() || aVar == null || activity == null || !aVar.f95071d.f95188u || (!aVar.f95071d.f95186s && C33716a.m69034a(activity))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m81729a(Activity activity) {
        final View findViewById = activity.findViewById(R.id.agj);
        findViewById.setPadding(0, 0, 0, 0);
        if (activity instanceof AbstractC1204m) {
            KeyboardUtils.m70895a((AbstractC1204m) activity, findViewById, new KeyboardUtils.AbstractC34711a() {
                /* class com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40518a.C405191 */

                static {
                    Covode.recordClassIndex(48335);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
                /* renamed from: b */
                public final void mo61027b() {
                    findViewById.setPadding(0, 0, 0, 0);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
                /* renamed from: c */
                public final void mo61028c() {
                    findViewById.setPadding(0, 0, 0, 0);
                }
            });
        }
    }

    /* renamed from: a */
    public static String m81728a(String str, int i) {
        if (str == null || !C30128d.m60946a(str)) {
            return str;
        }
        try {
            if (!C81546h.m141420a((List<String>) Collections.singletonList("host"), false).contains(Uri.parse(str).getHost())) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append("status_bar_height=".concat(String.valueOf(i)));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m81733a(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        return charSequence2.startsWith("http") || charSequence2.startsWith("https") || charSequence2.startsWith("about:");
    }

    /* renamed from: a */
    public static boolean m81730a(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter(str) == null) {
            return bundle != null ? bundle.getBoolean(str, z) : z;
        }
        return TextUtils.equals(uri.getQueryParameter(str), "1");
    }

    /* renamed from: a */
    public static String m81727a(Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri.getQueryParameter(str);
        }
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
            return null;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    public static boolean m81734a(String str) {
        return !C13627m.m24498a(str) && "1".equals(str);
    }

    /* renamed from: a */
    public static boolean m81731a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("webview_progress_bar", C16048b.m29633a().mo25421a(true, "webview_progress_bar", false));
    }

    /* renamed from: b */
    public static int m81735b(Activity activity) {
        if (C80534hh.m139608a()) {
            return ImmersionBar.getStatusBarHeight(activity);
        }
        return 0;
    }

    /* renamed from: b */
    public static Uri m81736b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    /* renamed from: a */
    private static Object m81725a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m81720a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            return null;
        }
        try {
            sb.append("aweme://ame/webview/?url=").append(URLEncoder.encode(str, "ISO-8859-1"));
        } catch (Exception unused) {
        }
        return C40520b.m81719a(context, Uri.parse(sb.toString()));
    }

    /* renamed from: a */
    public static Intent m81719a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (C13627m.m24498a(queryParameter)) {
                return null;
            }
            boolean a = C40520b.m81734a(uri.getQueryParameter("no_hw"));
            boolean a2 = C40520b.m81734a(uri.getQueryParameter("hide_more"));
            boolean a3 = C40520b.m81734a(uri.getQueryParameter("hide_bar"));
            boolean a4 = C40520b.m81734a(uri.getQueryParameter("hide_status_bar"));
            boolean a5 = C40520b.m81734a(uri.getQueryParameter("hide_nav_bar"));
            try {
                boolean a6 = C40520b.m81734a(uri.getQueryParameter("hide_more"));
                if (a3 || a5) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (a4) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = uri.getQueryParameter("ad_id");
                if (!C13627m.m24498a(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                intent.setData(Uri.parse(decode));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (a) {
                    intent.putExtra("bundle_no_hw_acceleration", true);
                }
                if (a2) {
                    intent.putExtra("hide_more", true);
                }
                if (!a6) {
                    intent.putExtra("hide_more", a6);
                }
                String queryParameter3 = uri.getQueryParameter("title");
                if (C13627m.m24498a(queryParameter3)) {
                    queryParameter3 = Uri.parse(decode).getQueryParameter("title");
                }
                String queryParameter4 = uri.getQueryParameter("title_extra");
                if (!C13627m.m24498a(queryParameter4)) {
                    queryParameter3 = queryParameter4;
                }
                if (!C13627m.m24498a(queryParameter3)) {
                    intent.putExtra("title", queryParameter3);
                } else {
                    intent.putExtra("title", " ");
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter5 = uri.getQueryParameter("gd_label");
                if (!C13627m.m24498a(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("gd_ext_json");
                if (!C13627m.m24498a(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("webview_track_key");
                if (!C13627m.m24498a(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("wap_headers");
                if (!C13627m.m24498a(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m81718a(Uri uri, Bundle bundle, int i) {
        String str;
        if (bundle != null) {
            i = bundle.getInt("bundle_webview_background", i);
        }
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter("bundle_webview_background") == null) {
            str = null;
        } else {
            str = uri.getQueryParameter("bundle_webview_background");
        }
        try {
            if (TextUtils.isEmpty(str) || str.contains("#")) {
                return i;
            }
            return Color.parseColor("#".concat(String.valueOf(str)));
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: b */
    public static boolean m81737b(Uri uri, Bundle bundle, String str) {
        if (uri == null || !uri.isHierarchical() || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            if (bundle != null) {
                return bundle.getBoolean(str, false);
            }
            return false;
        } else if (uri.getQueryParameter(str).equals("1") || uri.getQueryParameter(str).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static int m81738c(Uri uri, Bundle bundle, String str) {
        String queryParameter;
        if (uri == null || !uri.isHierarchical() || (queryParameter = uri.getQueryParameter(str)) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            if (bundle != null) {
                return bundle.getInt(str);
            }
            return -1;
        }
    }

    /* renamed from: d */
    public static int m81739d(Uri uri, Bundle bundle, String str) {
        String str2 = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    str2 = uri.getQueryParameter(str);
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        if (!(!TextUtils.isEmpty(str2) || bundle == null || bundle.getString(str) == null)) {
            str2 = bundle.getString(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.contains("#")) {
            str2 = "#".concat(String.valueOf(str2));
        }
        if (!TextUtils.isEmpty(str2)) {
            return Color.parseColor(str2);
        }
        return -2;
    }

    /* renamed from: a */
    private static Object m81723a(Uri uri, String str, Class cls) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            if (cls == String.class) {
                return queryParameter;
            }
            if (cls == Integer.class) {
                return Integer.valueOf(Integer.parseInt(queryParameter));
            }
            if (cls == Long.class) {
                return Long.valueOf(Long.parseLong(queryParameter));
            }
            if (cls == Boolean.class) {
                return Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            }
            if (cls == Float.class) {
                return Float.valueOf(Float.parseFloat(queryParameter));
            }
            if (cls == Double.class) {
                return Double.valueOf(Double.parseDouble(queryParameter));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static <T> T m81724a(Uri uri, String str, Class<T> cls, T t) {
        T t2;
        if (uri == null || (t2 = (T) m81723a(uri, str, cls)) == null) {
            return t;
        }
        return t2;
    }

    /* renamed from: a */
    private static <T> T m81721a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls) {
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(str) && uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    T t = (T) m81723a(uri, str, cls);
                    if (cls.isInstance(t)) {
                        return t;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (bundle == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        return (T) m81725a(bundle, str2);
    }

    /* renamed from: a */
    public static <T> T m81722a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls, T t) {
        T t2 = (T) m81721a(uri, str, bundle, str2, cls);
        if (t2 != null) {
            return t2;
        }
        return t;
    }
}
