package com.bytedance.ies.bullet.kit.p1148a;

import android.content.res.AssetManager;
import android.os.Build;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.kit.a.e */
public final class C16341e {

    /* renamed from: a */
    public static final C16341e f39273a = new C16341e();

    private C16341e() {
    }

    static {
        Covode.recordClassIndex(18634);
    }

    /* renamed from: a */
    public static WebResourceResponse m30353a(String str) {
        boolean z;
        MethodCollector.m26663i(6201);
        if (str != null) {
            try {
                File file = new File(str);
                if (!file.exists() || file.isDirectory()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    file = null;
                }
                if (file != null) {
                    WebResourceResponse a = m30354a(m30355b(str), "", new FileInputStream(file));
                    MethodCollector.m26664o(6201);
                    return a;
                }
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
        C89379q.m157068constructorimpl(null);
        MethodCollector.m26664o(6201);
        return null;
    }

    /* renamed from: b */
    private static String m30355b(String str) {
        C89219l.m154719c(str, "");
        if (C89361p.m154876c(str, ".js", false)) {
            return "application/x-javascript";
        }
        if (C89361p.m154876c(str, ".json", false)) {
            return "application/json";
        }
        if (C89361p.m154876c(str, ".css", false)) {
            return "text/css";
        }
        if (C89361p.m154876c(str, ".html", false)) {
            return "text/html";
        }
        if (C89361p.m154876c(str, ".ico", false)) {
            return "image/x-icon";
        }
        if (C89361p.m154876c(str, ".jpeg", false) || C89361p.m154876c(str, ".jpg", false)) {
            return "image/jpeg";
        }
        if (C89361p.m154876c(str, ".png", false)) {
            return "image/png";
        }
        if (C89361p.m154876c(str, ".gif", false)) {
            return "image/gif";
        }
        if (C89361p.m154876c(str, ".woff", false)) {
            return "font/woff";
        }
        if (C89361p.m154876c(str, ".svg", false)) {
            return "image/svg+xml";
        }
        if (C89361p.m154876c(str, ".ttf", false)) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: a */
    public static WebResourceResponse m30352a(AssetManager assetManager, String str) {
        MethodCollector.m26663i(6046);
        if (assetManager == null || str == null || str.length() == 0) {
            MethodCollector.m26664o(6046);
            return null;
        }
        WebResourceResponse a = m30354a(m30355b(str), "", assetManager.open(str));
        MethodCollector.m26664o(6046);
        return a;
    }

    /* renamed from: a */
    private static WebResourceResponse m30354a(String str, String str2, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            if (Build.VERSION.SDK_INT >= 21 && C89219l.m154714a((Object) "font/ttf", (Object) str)) {
                return new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (Build.VERSION.SDK_INT >= 21) {
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            }
            try {
                Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                C89219l.m154709a((Object) field, "");
                field.setAccessible(true);
                field.set(webResourceResponse, hashMap);
                return webResourceResponse;
            } catch (Throwable unused) {
                return webResourceResponse;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
