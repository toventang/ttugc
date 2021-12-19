package com.bytedance.webx.monitor.p1776a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.p706d.C11922e;
import com.bytedance.android.monitor.p706d.C11923f;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18356p;
import com.bytedance.ies.web.jsbridge2.C18326ak;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.webx.monitor.a.a */
public class C23656a implements AbstractC18356p {

    /* renamed from: c */
    public SoftReference<WebView> f55978c;

    static {
        Covode.recordClassIndex(27755);
    }

    /* renamed from: a */
    public static int m44732a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public C23656a(WebView webView) {
        this.f55978c = new SoftReference<>(webView);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public void mo13317a(final String str) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236571 */

            static {
                Covode.recordClassIndex(27756);
            }

            public final void run() {
                WebView webView = C23656a.this.f55978c.get();
                if (webView != null && !TextUtils.isEmpty(str)) {
                    C11923f fVar = new C11923f();
                    fVar.f28507a = str;
                    fVar.f28508b = 0;
                    fVar.f28512f = 0;
                    if (fVar.f28512f != 0) {
                        fVar.f28513g = elapsedRealtime;
                        fVar.f28511e = fVar.f28513g - fVar.f28512f;
                    }
                    C12044i.f28862a.mo19234a(webView, fVar);
                }
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public void mo13318a(final String str, final C18326ak akVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236582 */

            static {
                Covode.recordClassIndex(27757);
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 109
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236582.run():void");
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public final void mo13319a(String str, String str2, int i) {
        mo13321b(str, str2, i);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: b */
    public void mo13321b(String str, final String str2, final int i) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236593 */

            static {
                Covode.recordClassIndex(27758);
            }

            public final void run() {
                WebView webView = C23656a.this.f55978c.get();
                if (webView != null && !TextUtils.isEmpty(str2)) {
                    C11923f fVar = new C11923f();
                    fVar.f28507a = str2;
                    fVar.f28508b = C23656a.m44732a(i);
                    fVar.f28512f = 0;
                    if (fVar.f28512f != 0) {
                        fVar.f28513g = elapsedRealtime;
                        fVar.f28511e = fVar.f28513g - fVar.f28512f;
                    }
                    C12044i.f28862a.mo19234a(webView, fVar);
                    C11922e eVar = new C11922e();
                    eVar.f28502c = str2;
                    eVar.f28500a = C23656a.m44732a(i);
                    C12044i.f28862a.mo19233a(webView, eVar);
                }
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public void mo13320a(String str, final String str2, final int i, final String str3, final C18326ak akVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236604 */

            static {
                Covode.recordClassIndex(27759);
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 144
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.monitor.p1776a.C23656a.RunnableC236604.run():void");
            }
        });
    }
}
