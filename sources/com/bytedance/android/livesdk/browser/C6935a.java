package com.bytedance.android.livesdk.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p218f.C3959t;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.livesetting.hybrid.WebViewUseBoeHeaderSetting;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.a */
public final class C6935a {

    /* renamed from: a */
    private static String f17338a;

    /* renamed from: b */
    private static boolean f17339b;

    static {
        Covode.recordClassIndex(7674);
    }

    /* renamed from: a */
    public static boolean m14805a(String str) {
        try {
            String host = new URI(str).getHost();
            if (host != null && !host.isEmpty()) {
                str = host;
            }
            String replace = str.replace("www.", "");
            List<String> e = C7038b.m14993e();
            if (replace.isEmpty()) {
                return false;
            }
            return e.contains(replace);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m14806b(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m14807c(String str) {
        try {
            if (C3966y.m9669e().getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static boolean m14808d(String str) {
        String str2;
        int indexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                    str2 = Uri.parse(str).getHost();
                } else {
                    str2 = Uri.parse(str.substring(0, indexOf)).getHost();
                }
                if (str2 != null && !str2.isEmpty()) {
                    str = str2;
                }
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("\\.");
                    if (split.length >= 2) {
                        str = split[split.length - 2] + "." + split[split.length - 1];
                    }
                }
            }
            if (str.isEmpty()) {
                return false;
            }
            return C7038b.m14993e().contains(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m14799a(final Activity activity, final Fragment fragment) {
        C6670f.m14183a(activity).mo12816a(new AbstractC6656d() {
            /* class com.bytedance.android.livesdk.browser.C6935a.C69361 */

            /* renamed from: c */
            final /* synthetic */ int f17342c = 40003;

            static {
                Covode.recordClassIndex(7675);
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: b */
            public final void mo11014b(String... strArr) {
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: a */
            public final void mo11013a(String... strArr) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    C13628n.m24507a(activity, 2131234335, (int) R.string.gj6);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                try {
                    Fragment fragment = fragment;
                    if (fragment != null) {
                        fragment.startActivityForResult(intent, this.f17342c);
                    } else {
                        activity.startActivityForResult(intent, this.f17342c);
                    }
                } catch (Exception unused) {
                    C13628n.m24507a(activity, 2131234335, (int) R.string.gj5);
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static String m14798a(Context context, WebView webView) {
        MethodCollector.m26663i(7727);
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!C13627m.m24498a(userAgentString)) {
                f17338a = userAgentString;
                MethodCollector.m26664o(7727);
                return userAgentString;
            }
        }
        if (!C13627m.m24498a(f17338a)) {
            String str = f17338a;
            MethodCollector.m26664o(7727);
            return str;
        }
        String a = C13501b.f32887a.mo21775a(context);
        f17338a = a;
        if (!C13627m.m24498a(a)) {
            String str2 = f17338a;
            MethodCollector.m26664o(7727);
            return str2;
        }
        if (!f17339b && webView == null && (context instanceof Activity)) {
            f17339b = true;
            try {
                WebView webView2 = new WebView(context);
                f17338a = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f17338a;
        MethodCollector.m26664o(7727);
        return str3;
    }

    /* renamed from: a */
    public static void m14804a(HashMap<String, String> hashMap, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            loop0:
            while (keys != null) {
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (!C13627m.m24498a(next)) {
                            if (!C13627m.m24498a(optString)) {
                                hashMap.put(next, optString);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                break loop0;
            }
        }
        if (!C13627m.m24498a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    /* renamed from: a */
    private static void m14801a(WebView webView, String str, Map map) {
        MethodCollector.m26663i(7554);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str, map);
        MethodCollector.m26664o(7554);
    }

    /* renamed from: a */
    public static void m14802a(String str, WebView webView, String str2) {
        if (webView != null && !C13627m.m24498a(str)) {
            if (!m14806b(str)) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!C13627m.m24498a(str2)) {
                hashMap.put("Referer", str2);
            }
            m14803a(str, webView, hashMap);
        }
    }

    /* renamed from: a */
    public static void m14803a(String str, WebView webView, Map<String, String> map) {
        long id;
        long ownerUserId;
        String str2;
        String log_pb;
        String str3 = str;
        Map<String, String> map2 = map;
        if (webView != null && !C13627m.m24498a(str3)) {
            IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
            if (iHostContext != null && iHostContext.isBoe() && WebViewUseBoeHeaderSetting.INSTANCE.getValue()) {
                if (map2 == null) {
                    map2 = new HashMap<>();
                }
                map2.put("X-TT-ENV", iHostContext.getBoeLane());
                map2.put("X-USE-BOE", "1");
            }
            boolean b = m14806b(str3);
            Context context = webView.getContext();
            if (b && context != null) {
                C22898a.m43150a(context);
                str3 = C22898a.m43153e(str3);
            }
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room == null) {
                id = 0;
                ownerUserId = 0;
            } else {
                id = room.getId();
                ownerUserId = room.getOwnerUserId();
            }
            String str4 = "";
            if (room == null) {
                str2 = String.valueOf(ownerUserId);
            } else if (room.getOwner() != null) {
                str2 = room.getOwner().getSecUid();
            } else {
                str2 = str4;
            }
            long c = C11115u.m19743a().mo17915b().mo13161c();
            String secUid = C11115u.m19743a().mo17915b().mo13147a().getSecUid();
            if (room == null) {
                log_pb = str4;
            } else {
                log_pb = room.getLog_pb();
                str4 = room.getRequestId();
            }
            String a = C6544e.m13987a();
            String d = C6544e.m13990d();
            String e = C6544e.m13991e();
            String f = C6544e.m13992f();
            String g = C6544e.m13993g();
            Uri parse = Uri.parse(str3);
            boolean d2 = m14808d(str3);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (d2 && queryParameterNames != null) {
                Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                if (!queryParameterNames.contains("room_id") && id != 0) {
                    buildUpon.appendQueryParameter("room_id", String.valueOf(id));
                }
                if (!queryParameterNames.contains("anchor_id") && ownerUserId != 0) {
                    buildUpon.appendQueryParameter("anchor_id", String.valueOf(ownerUserId));
                }
                if (!queryParameterNames.contains("sec_anchor_id")) {
                    buildUpon.appendQueryParameter("sec_anchor_id", str2);
                }
                if (!queryParameterNames.contains("user_id")) {
                    buildUpon.appendQueryParameter("user_id", String.valueOf(c));
                }
                if (!queryParameterNames.contains("sec_user_id")) {
                    buildUpon.appendQueryParameter("sec_user_id", secUid);
                }
                if (!queryParameterNames.contains("enter_from_merge")) {
                    buildUpon.appendQueryParameter("enter_from_merge", a);
                }
                if (!queryParameterNames.contains("enter_method")) {
                    buildUpon.appendQueryParameter("enter_method", d);
                }
                if (!queryParameterNames.contains("action_type")) {
                    buildUpon.appendQueryParameter("action_type", e);
                }
                if (!queryParameterNames.contains("log_pb") && !TextUtils.isEmpty(log_pb)) {
                    buildUpon.appendQueryParameter("log_pb", log_pb);
                }
                if (!queryParameterNames.contains("request_id") && !TextUtils.isEmpty(str4)) {
                    buildUpon.appendQueryParameter("request_id", str4);
                }
                if (!queryParameterNames.contains("video_id") && !TextUtils.isEmpty(f)) {
                    buildUpon.appendQueryParameter("video_id", f);
                }
                if (!queryParameterNames.contains("action_type") && !TextUtils.isEmpty(e)) {
                    buildUpon.appendQueryParameter("action_type", e);
                }
                if (!queryParameterNames.contains("gd_label") && !TextUtils.isEmpty(g)) {
                    buildUpon.appendQueryParameter("gd_label", g);
                }
                str3 = buildUpon.build().toString();
            }
            C12044i.f28862a.mo19245g(webView, str3);
            if (map2 == null || map2.isEmpty()) {
                C3959t.m9647a(webView, str3);
            } else {
                m14801a(webView, str3, map2);
            }
        }
    }

    /* renamed from: a */
    public static void m14800a(final Activity activity, final Fragment fragment, final String str, final String str2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C13628n.m24507a(activity, 2131234335, (int) R.string.gj6);
        } else {
            C6670f.m14183a(activity).mo12816a(new AbstractC6656d() {
                /* class com.bytedance.android.livesdk.browser.C6935a.C69372 */

                /* renamed from: e */
                final /* synthetic */ int f17347e = 40004;

                static {
                    Covode.recordClassIndex(7676);
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: b */
                public final void mo11014b(String... strArr) {
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: a */
                public final void mo11013a(String... strArr) {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    intent.putExtra("output", TTLiveFileProvider.getUri(activity, activity.getPackageName() + ".ttlive_provider", new File(file, str2)));
                    try {
                        Fragment fragment = fragment;
                        if (fragment != null) {
                            fragment.startActivityForResult(intent, this.f17347e);
                        } else {
                            activity.startActivityForResult(intent, this.f17347e);
                        }
                    } catch (Exception unused) {
                        C13628n.m24507a(activity, 2131234335, (int) R.string.gj4);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
