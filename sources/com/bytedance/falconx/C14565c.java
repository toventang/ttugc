package com.bytedance.falconx;

import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.p973a.C14557a;
import com.bytedance.falconx.p973a.C14560b;
import com.bytedance.falconx.p973a.p974a.C14559a;
import com.bytedance.falconx.statistic.C14575d;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.geckox.p1022i.C14957a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.falconx.c */
public final class C14565c {

    /* renamed from: a */
    public boolean f35211a = true;

    /* renamed from: b */
    private C14568d f35212b;

    /* renamed from: c */
    private C14553a f35213c;

    static {
        Covode.recordClassIndex(16652);
    }

    public C14565c(C14568d dVar) {
        if (dVar != null) {
            this.f35212b = dVar;
            C14575d.m26653a().f35242b = this.f35212b;
            this.f35213c = new C14553a(this.f35212b);
            C14568d dVar2 = this.f35212b;
            if (C14560b.f35205a) {
                if (C14557a.f35191a == null) {
                    C14557a.f35191a = new ArrayList();
                }
                C14559a aVar = new C14559a(dVar2.f35215b, dVar2.f35216c, dVar2.f35217d, dVar2.f35219f, dVar2.f35221h, dVar2.f35222i, dVar2.f35223j, dVar2.f35224k);
                if (!C14557a.f35191a.contains(aVar)) {
                    C14557a.f35191a.add(aVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: a */
    public final WebResourceResponse mo23441a(WebView webView, String str) {
        if (!this.f35211a) {
            return null;
        }
        try {
            List<AbstractC14561b> list = this.f35212b.f35218e;
            if (list != null && !list.isEmpty()) {
                InterceptorModel interceptorModel = new InterceptorModel();
                for (AbstractC14561b bVar : list) {
                    interceptorModel.startTime = Long.valueOf(SystemClock.uptimeMillis());
                    WebResourceResponse a = bVar.mo23432a(webView, str);
                    if (a != null) {
                        interceptorModel.loadFinish(true);
                        interceptorModel.url = str;
                        interceptorModel.mimeType = a.getMimeType();
                        C14570e.m26650a(webView, interceptorModel, false);
                        return a;
                    }
                }
            }
            return this.f35213c.mo23432a(webView, str);
        } catch (Throwable unused) {
            C14957a.m27542a();
            return null;
        }
    }
}
