package com.snapchat.kit.sdk.core.networking;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.C90052g;

/* access modifiers changed from: package-private */
/* renamed from: com.snapchat.kit.sdk.core.networking.n */
public final class C29040n {

    /* renamed from: a */
    private static final List<String> f68609a = Arrays.asList("sha256/1XUWswVGCeFUaI5FKrhY7R+dIrDXIzTtDy/WDGcjAoY=", "sha256/8ca6Zwz8iOTfUpc8rkIPCgid1HQUT+WAbEIAZOFZEik=", "sha256/uUwZgwDOxcBXrQcntwu+kYFpkiVkOaezL0WYEZ3anJc=", "sha256/I/Lt/z7ekCWanjD0Cvj5EqXls2lOaThEA0H2Bg4BT/o=", "sha256/Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=", "sha256/O4rGMvpV1NfGyWRRTZ6v92jubDQNBdwlK+E35oZJ9qo=", "sha256/i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=", "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=", "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=", "sha256/Fe7TOVlLME+M+Ee0dzcdjW/sYfTbKwGvWJ58U7Ncrkw=");

    static {
        Covode.recordClassIndex(35373);
    }

    /* renamed from: a */
    static synchronized C90052g m58030a() {
        synchronized (C29040n.class) {
            MethodCollector.m26663i(6868);
            C90052g.C90053a aVar = new C90052g.C90053a();
            try {
                String host = Uri.parse("https://api.snapkit.com").getHost();
                if (TextUtils.isEmpty(host)) {
                    C90052g a = aVar.mo144772a();
                    MethodCollector.m26664o(6868);
                    return a;
                }
                Iterator<String> it = f68609a.iterator();
                while (it.hasNext()) {
                    aVar.mo144771a(host, it.next());
                }
                C90052g a2 = aVar.mo144772a();
                MethodCollector.m26664o(6868);
                return a2;
            } catch (NullPointerException unused) {
                C90052g a3 = aVar.mo144772a();
                MethodCollector.m26664o(6868);
                return a3;
            }
        }
    }
}
