package com.p2082ss.android.sdk.webview;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.sdk.webview.q */
public class C30278q {

    /* renamed from: b */
    private static volatile C30278q f72229b;

    /* renamed from: a */
    public Map<String, Boolean> f72230a = new HashMap();

    /* renamed from: c */
    private boolean f72231c;

    /* renamed from: d */
    private boolean f72232d;

    /* renamed from: e */
    private boolean f72233e;

    static {
        Covode.recordClassIndex(36790);
    }

    private C30278q() {
    }

    /* renamed from: a */
    public static C30278q m61264a() {
        MethodCollector.m26663i(4079);
        if (f72229b == null) {
            synchronized (C30278q.class) {
                try {
                    if (f72229b == null) {
                        f72229b = new C30278q();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4079);
                    throw th;
                }
            }
        }
        C30278q qVar = f72229b;
        MethodCollector.m26664o(4079);
        return qVar;
    }

    /* renamed from: a */
    public static String m61265a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getHost()) || !parse.getHost().contains("link-sg.byteoversea.com") || TextUtils.isEmpty(parse.getQueryParameter("target"))) {
                return parse.getHost();
            }
            return Uri.parse(parse.getQueryParameter("target")).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo53733a(boolean z, String str) {
        String a = m61265a(str);
        if (a != null) {
            boolean z2 = true;
            if (!z ? !this.f72231c || !this.f72233e : !this.f72231c || !this.f72232d) {
                z2 = false;
            }
            this.f72230a.put(a, Boolean.valueOf(z2));
        }
    }
}
