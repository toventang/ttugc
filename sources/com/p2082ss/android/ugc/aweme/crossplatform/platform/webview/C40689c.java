package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.settings.C68727ab;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.c */
public final class C40689c {

    /* renamed from: a */
    public static final C40689c f95287a = new C40689c();

    private C40689c() {
    }

    static {
        Covode.recordClassIndex(48535);
    }

    /* renamed from: a */
    public static WebResourceResponse m82073a(String str) {
        boolean z;
        boolean z2;
        FileInputStream fileInputStream;
        MethodCollector.m26663i(4042);
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        WebResourceResponse webResourceResponse = null;
        if (z) {
            MethodCollector.m26664o(4042);
            return null;
        }
        C68727ab[] abVarArr = (C68727ab[]) SettingsManager.m29616a().mo25396a("ecommerce_buynow_config", C68727ab[].class);
        if (abVarArr != null) {
            if (abVarArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                if (parse.getScheme() == null || ((!C89219l.m154714a((Object) parse.getScheme(), (Object) "http")) && (true ^ C89219l.m154714a((Object) parse.getScheme(), (Object) "https")))) {
                    MethodCollector.m26664o(4042);
                    return null;
                }
                try {
                    String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
                    C89219l.m154716b(uri, "");
                    int length = abVarArr.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        C68727ab abVar = abVarArr[i];
                        if (C89361p.m154929e((CharSequence) uri, (CharSequence) abVar.f153743a)) {
                            String str2 = abVar.f153744b;
                            String str3 = abVar.f153745c;
                            C81631k kVar = C81631k.f182525a;
                            C89219l.m154716b(kVar, "");
                            String b = C80333dc.m139277b(kVar.mo125297c(), str2);
                            if (b != null) {
                                fileInputStream = new FileInputStream(new File(b, str3));
                            } else {
                                fileInputStream = null;
                            }
                            if (fileInputStream != null) {
                                webResourceResponse = m82074a("text/html", "", fileInputStream);
                                break;
                            }
                        }
                        i++;
                    }
                } catch (Exception unused) {
                }
                MethodCollector.m26664o(4042);
                return webResourceResponse;
            }
        }
        MethodCollector.m26664o(4042);
        return null;
    }

    /* renamed from: a */
    private static WebResourceResponse m82074a(String str, String str2, InputStream inputStream) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Access-Control-Allow-Origin", "*");
            linkedHashMap.put("Content-Type", str);
            if (Build.VERSION.SDK_INT >= 21 && C89219l.m154714a((Object) "font/ttf", (Object) str)) {
                return new WebResourceResponse(str, str2, 200, "OK", linkedHashMap, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (Build.VERSION.SDK_INT >= 21) {
                webResourceResponse.setResponseHeaders(linkedHashMap);
                return webResourceResponse;
            }
            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
            C89219l.m154716b(field, "");
            field.setAccessible(true);
            field.set(webResourceResponse, linkedHashMap);
            return webResourceResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
