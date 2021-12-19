package com.bytedance.ies.web.jsbridge2;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.web.jsbridge2.a */
public abstract class AbstractC18304a {

    /* renamed from: a */
    private volatile boolean f43778a;

    /* renamed from: b */
    private volatile View f43779b;

    static {
        Covode.recordClassIndex(20976);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo13335a();

    /* renamed from: com.bytedance.ies.web.jsbridge2.a$a */
    public static final class C18305a extends AbstractC18304a {

        /* renamed from: a */
        private final WebView f43780a;

        static {
            Covode.recordClassIndex(20977);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18304a
        /* renamed from: a */
        public final View mo13335a() {
            return this.f43780a;
        }

        public C18305a(WebView webView) {
            this.f43780a = webView;
        }
    }

    /* renamed from: b */
    public final View mo29304b() {
        if (!this.f43778a) {
            synchronized (this) {
                if (!this.f43778a) {
                    this.f43778a = true;
                    this.f43779b = mo13335a();
                }
            }
        }
        return this.f43779b;
    }
}
