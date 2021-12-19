package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.net.IIESNetworkApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.l */
public final class C40705l {

    /* renamed from: a */
    public static final C40706a f95310a = new C40706a((byte) 0);

    /* renamed from: b */
    private static final IIESNetworkApi f95311b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.l$a */
    public static final class C40706a {
        static {
            Covode.recordClassIndex(48552);
        }

        private C40706a() {
        }

        public /* synthetic */ C40706a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(48551);
        String str = Api.f79771d;
        C89219l.m154716b(str, "");
        AbstractC18099f d = C18097a.m33699b(str).mo28823a().mo28832d();
        C89219l.m154716b(d, "");
        f95311b = (IIESNetworkApi) d.mo28858a(IIESNetworkApi.class);
    }

    /* renamed from: a */
    static WebResourceResponse m82115a(C22099u<TypedInput> uVar) {
        String str;
        String lowerCase;
        if (uVar != null) {
            List<C22027b> list = uVar.f52261a.f52042d;
            C89219l.m154716b(list, "");
            if (!C34717d.m70908a(list)) {
                Iterator<C22027b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C22027b next = it.next();
                    if (!TextUtils.isEmpty(next.f52037a) && !TextUtils.isEmpty(next.f52038b)) {
                        String str2 = next.f52037a;
                        C89219l.m154716b(str2, "");
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase2 = str2.toLowerCase();
                        C89219l.m154716b(lowerCase2, "");
                        if (C89219l.m154714a((Object) lowerCase2, (Object) "content-type")) {
                            str = next.f52038b;
                            C89219l.m154716b(str, "");
                            break;
                        }
                    }
                }
            }
            str = "";
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                lowerCase = null;
            } else {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                lowerCase = str.toLowerCase();
                C89219l.m154716b(lowerCase, "");
                if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "js") || C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "application/javascript") || C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "javascript")) {
                    lowerCase = "application/x-javascript";
                } else if (C89361p.m154876c(lowerCase, "text/css", false) || C89361p.m154876c(lowerCase, "css", false)) {
                    lowerCase = "text/css";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "test/html") || C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "html")) {
                    lowerCase = "text/html";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "image")) {
                    int a = C89361p.m154888a((CharSequence) lowerCase, ";", 0, false, 6);
                    if (a >= 0) {
                        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
                        lowerCase = lowerCase.substring(0, a);
                        C89219l.m154716b(lowerCase, "");
                    }
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "jpeg") || C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "jpg")) {
                    lowerCase = "image/jpeg";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "png")) {
                    lowerCase = "image/png";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "gif")) {
                    lowerCase = "image/gif";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "woff")) {
                    lowerCase = "font/woff";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "svg")) {
                    lowerCase = "image/svg+xml";
                } else if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) ".ttf")) {
                    lowerCase = "font/ttf";
                } else {
                    int a2 = C89361p.m154888a((CharSequence) lowerCase, ";", 0, false, 6);
                    if (a2 >= 0) {
                        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
                        lowerCase = lowerCase.substring(0, a2);
                        C89219l.m154716b(lowerCase, "");
                    }
                }
            }
            if (TextUtils.isEmpty(lowerCase)) {
                return null;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (Build.VERSION.SDK_INT >= 21 && C89219l.m154714a((Object) "font/ttf", (Object) str)) {
                    return new WebResourceResponse(lowerCase, "", 200, "OK", hashMap, uVar.f52262b.mo11577in());
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(lowerCase, "", uVar.f52262b.mo11577in());
                if (Build.VERSION.SDK_INT >= 21) {
                    webResourceResponse.setResponseHeaders(hashMap);
                    return webResourceResponse;
                }
                try {
                    Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                    C89219l.m154716b(field, "");
                    field.setAccessible(true);
                    field.set(webResourceResponse, hashMap);
                    return webResourceResponse;
                } catch (Throwable unused) {
                    return webResourceResponse;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    static C22099u<TypedInput> m82116a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22027b("accept", "*/*"));
        arrayList.add(new C22027b("accept-encoding", "gzip, deflate, br"));
        arrayList.add(new C22027b("accept-language", "en-GB,en;q=0.9,zh-CN;q=0.8,zh-TW;q=0.7,zh;q=0.6,en-US;q=0.5"));
        arrayList.add(new C22027b("x-requested-with", "com.ss.android.ugc.aweme"));
        arrayList.add(new C22027b("ttnet", "1"));
        if (!C89219l.m154714a((Object) str, (Object) str2)) {
            arrayList.add(new C22027b("referer", str));
        }
        try {
            C22099u<TypedInput> execute = f95311b.downloadFile(false, -1, str2, null, arrayList).execute();
            C89219l.m154716b(execute, "");
            if (execute.f52261a.mo35845a()) {
                return execute;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
