package com.p2082ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.C14565c;
import com.bytedance.falconx.C14568d;
import com.bytedance.falconx.statistic.AbstractC14573b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.sdk.webview.h */
public final class C30262h {

    /* renamed from: a */
    public AbstractC30264a f72195a;

    /* renamed from: b */
    public String f72196b;

    /* renamed from: c */
    private C14565c f72197c;

    /* renamed from: d */
    private AbstractC14573b f72198d = new AbstractC14573b() {
        /* class com.p2082ss.android.sdk.webview.C30262h.C302631 */

        static {
            Covode.recordClassIndex(36775);
        }
    };

    /* renamed from: com.ss.android.sdk.webview.h$a */
    public interface AbstractC30264a {
        static {
            Covode.recordClassIndex(36776);
        }

        /* renamed from: a */
        WebResourceResponse mo53719a(String str);
    }

    static {
        Covode.recordClassIndex(36774);
    }

    /* renamed from: a */
    public final synchronized void mo53718a() {
        MethodCollector.m26663i(4570);
        this.f72195a = null;
        MethodCollector.m26664o(4570);
    }

    /* renamed from: a */
    public final C30262h mo53717a(boolean z) {
        C14565c cVar = this.f72197c;
        if (cVar != null) {
            cVar.f35211a = z;
        }
        return this;
    }

    /* renamed from: a */
    private static File m61242a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    public C30262h(String str) {
        Context a = C17867d.m33078a();
        String f = C17867d.m33085f();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (!TextUtils.isEmpty(str)) {
            String g = C58071d.m104913g();
            this.f72196b = str.substring(str.lastIndexOf("/") + 1);
            C14568d.C14569a aVar = new C14568d.C14569a(a);
            aVar.f35226b = this.f72196b;
            aVar.f35231g = new ArrayList();
            aVar.f35233i = serverDeviceId;
            aVar.f35227c = f;
            aVar.f35235k = TextUtils.isEmpty(g) ? "unknow" : g;
            aVar.f35234j = "gecko-sg.tiktokv.com";
            aVar.f35229e = this.f72198d;
            aVar.f35230f = false;
            aVar.f35232h = Arrays.asList(Uri.fromFile(new File(m61242a(C17867d.m33078a()), "offlineX")));
            this.f72197c = new C14565c(aVar.mo23442a());
        }
    }

    /* renamed from: a */
    public final C30262h mo53716a(List<Pattern> list) {
        String g = C58071d.m104913g();
        C14568d.C14569a aVar = new C14568d.C14569a(C17867d.m33078a());
        aVar.f35226b = this.f72196b;
        aVar.f35231g = list;
        aVar.f35234j = "gecko-sg.tiktokv.com";
        aVar.f35229e = this.f72198d;
        aVar.f35230f = false;
        aVar.f35232h = Arrays.asList(Uri.fromFile(new File(m61242a(C17867d.m33078a()), "offlineX")));
        aVar.f35233i = AppLog.getServerDeviceId();
        aVar.f35227c = C17867d.m33085f();
        if (TextUtils.isEmpty(g)) {
            g = "unknow";
        }
        aVar.f35235k = g;
        this.f72197c = new C14565c(aVar.mo23442a());
        return this;
    }

    /* renamed from: a */
    public final synchronized WebResourceResponse mo53715a(WebView webView, String str) {
        WebResourceResponse a;
        MethodCollector.m26663i(4560);
        AbstractC30264a aVar = this.f72195a;
        if (aVar == null || (a = aVar.mo53719a(str)) == null) {
            try {
                C14565c cVar = this.f72197c;
                if (cVar != null) {
                    WebResourceResponse a2 = cVar.mo23441a(webView, str);
                    MethodCollector.m26664o(4560);
                    return a2;
                }
                MethodCollector.m26664o(4560);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(4560);
                return null;
            }
        } else {
            MethodCollector.m26664o(4560);
            return a;
        }
    }
}
