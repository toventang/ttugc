package com.bytedance.android.livesdk.browser.p465f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import java.util.List;
import p078c.p083d.C1762a;

/* renamed from: com.bytedance.android.livesdk.browser.f.d */
public class C7019d {

    /* renamed from: a */
    private static volatile C7019d f17614a;

    /* renamed from: b */
    private List<AbstractC7017b> f17615b;

    static {
        Covode.recordClassIndex(7758);
    }

    private C7019d() {
        LinkedList linkedList = new LinkedList();
        this.f17615b = linkedList;
        linkedList.add(new C7020e());
        this.f17615b.add(new C7018c());
        this.f17615b.add(new C7016a());
    }

    /* renamed from: a */
    public static C7019d m14971a() {
        MethodCollector.m26663i(7166);
        if (f17614a == null) {
            synchronized (C7019d.class) {
                try {
                    if (f17614a == null) {
                        f17614a = new C7019d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7166);
                    throw th;
                }
            }
        }
        C7019d dVar = f17614a;
        MethodCollector.m26664o(7166);
        return dVar;
    }

    /* renamed from: a */
    public static String m14973a(String str) {
        Uri.Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str);
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public static String m14972a(Context context, Uri uri) {
        return m14973a(C1762a.m5918a(context, uri));
    }

    /* renamed from: a */
    public final WebResourceResponse mo13327a(String str, WebView webView) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        for (AbstractC7017b bVar : this.f17615b) {
            WebResourceResponse a = bVar.mo13326a(parse, webView);
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
