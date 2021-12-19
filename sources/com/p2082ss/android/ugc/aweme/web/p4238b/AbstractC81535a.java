package com.p2082ss.android.ugc.aweme.web.p4238b;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.sdk.webview.C30262h;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.b.a */
public abstract class AbstractC81535a implements C30262h.AbstractC30264a {

    /* renamed from: o */
    public boolean f182331o;

    static {
        Covode.recordClassIndex(94913);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo66293a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo66294b(String str);

    public AbstractC81535a(boolean z) {
        this.f182331o = z;
    }

    @Override // com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a
    /* renamed from: a */
    public WebResourceResponse mo53719a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = mo66293a();
        if (TextUtils.isEmpty(a) || !Pattern.compile(a).matcher(str).find()) {
            return null;
        }
        return m141395a(mo66295c(str), "", mo66294b(str), null);
    }

    /* renamed from: c */
    public String mo66295c(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: a */
    protected static WebResourceResponse m141394a(String str, String str2, InputStream inputStream) {
        return m141395a(str, str2, inputStream, null);
    }

    /* renamed from: a */
    protected static WebResourceResponse m141395a(String str, String str2, InputStream inputStream, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (inputStream == null) {
            return null;
        }
        if (map2 == null) {
            try {
                map2 = new HashMap<>();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (!map2.containsKey("Access-Control-Allow-Origin") && !map2.containsKey("access-control-allow-origin")) {
            map2.put("Access-Control-Allow-Origin", "*");
        }
        if (Build.VERSION.SDK_INT >= 21 && "font/ttf".equals(str)) {
            return new WebResourceResponse(str, str2, 200, "OK", map2, inputStream);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(map2);
            return webResourceResponse;
        }
        try {
            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
            field.setAccessible(true);
            field.set(webResourceResponse, map2);
            return webResourceResponse;
        } catch (Throwable unused) {
            return webResourceResponse;
        }
    }
}
