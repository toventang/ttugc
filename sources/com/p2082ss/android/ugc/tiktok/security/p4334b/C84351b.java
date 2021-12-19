package com.p2082ss.android.ugc.tiktok.security.p4334b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84368c;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.security.b.b */
public final class C84351b extends AbstractC84350a {
    static {
        Covode.recordClassIndex(98303);
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84355f
    /* renamed from: a */
    public final AbstractC84355f mo129373a() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84353d, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    public final String mo129370a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        if (C84368c.m145127a().f188622a) {
            return super.mo129370a(webView, m145098a(str, webView.getContext()));
        }
        return super.mo129370a(webView, str);
    }

    /* renamed from: a */
    private static String m145098a(String str, Context context) {
        try {
            boolean z = false;
            if (C58939a.C58940a.f134171a.f134170a.enableWebHttps()) {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                if (!(!C89219l.m154714a((Object) parse.getScheme(), (Object) "http"))) {
                    C22898a a = C22898a.m43150a(context);
                    C89219l.m154716b(a, "");
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : a.f54077f) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        String host = parse.getHost();
                        if (host != null) {
                            C89219l.m154716b(str3, "");
                            if (C89361p.m154876c(host, str3, false)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!z) {
                return str;
            }
            if (str != null) {
                return new C89350l("http").replaceFirst(str, "https");
            }
            return null;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84354e, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4600h.C89378p<java.lang.String, java.lang.Boolean> mo129369a(java.lang.String r12, com.lynx.tasm.LynxView r13) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tiktok.security.p4334b.C84351b.mo129369a(java.lang.String, com.lynx.tasm.LynxView):h.p");
    }
}
