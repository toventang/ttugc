package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.settings.C68726aa;
import com.p2082ss.android.ugc.aweme.settings.C68762z;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b */
public class C40686b extends WebChromeClient {

    /* renamed from: d */
    public static final C40687a f95283d = new C40687a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f95284a = C89250i.m154773a((AbstractC89171a) C40688b.f95286a);

    /* renamed from: c */
    public boolean f95285c = true;

    static {
        Covode.recordClassIndex(48532);
    }

    /* renamed from: a */
    private final C68762z m82071a() {
        return (C68762z) this.f95284a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b$a */
    public static final class C40687a {
        static {
            Covode.recordClassIndex(48533);
        }

        private C40687a() {
        }

        public /* synthetic */ C40687a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b$b */
    static final class C40688b extends AbstractC89220m implements AbstractC89171a<C68762z> {

        /* renamed from: a */
        public static final C40688b f95286a = new C40688b();

        static {
            Covode.recordClassIndex(48534);
        }

        C40688b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C68762z invoke() {
            return C68726aa.m121163a();
        }
    }

    /* renamed from: a */
    private final boolean m82072a(String str) {
        int i;
        boolean z;
        String[] strArr;
        if (str == null) {
            return false;
        }
        if (m82071a() == null) {
            return this.f95285c;
        }
        C68762z a = m82071a();
        if (a != null) {
            i = a.f153809a;
        } else {
            i = 1;
        }
        C68762z a2 = m82071a();
        if (a2 != null && (strArr = a2.f153810b) != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C89361p.m154908a((CharSequence) str, (CharSequence) strArr[i2], false)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (this.f95285c || i == 0 || i != 1 || z) {
                return false;
            }
            return true;
        }
        z = false;
        if (this.f95285c) {
        }
        return false;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (m82072a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (m82072a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (m82072a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (m82072a(str)) {
            return false;
        }
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
