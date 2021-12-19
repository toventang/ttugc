package com.bytedance.falconx;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.statistic.InterceptorModel;

/* renamed from: com.bytedance.falconx.e */
public final class C14570e {

    /* renamed from: a */
    public static AbstractC14571a f35236a;

    /* renamed from: com.bytedance.falconx.e$a */
    public interface AbstractC14571a {
        static {
            Covode.recordClassIndex(16658);
        }

        /* renamed from: a */
        void mo23443a(WebView webView, InterceptorModel interceptorModel, boolean z);
    }

    static {
        Covode.recordClassIndex(16657);
    }

    /* renamed from: a */
    public static void m26650a(WebView webView, InterceptorModel interceptorModel, boolean z) {
        AbstractC14571a aVar = f35236a;
        if (aVar != null) {
            aVar.mo23443a(webView, interceptorModel, z);
        }
    }
}
