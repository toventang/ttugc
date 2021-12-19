package com.bytedance.android.monitorV2.webview;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.C12074b;
import com.bytedance.android.monitorV2.p728a.AbstractC12070e;
import com.bytedance.android.monitorV2.p739k.AbstractC12120c;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12192b;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12193c;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12194d;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12195e;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12196f;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.d */
public interface AbstractC12208d extends AbstractC12120c, AbstractC12192b, AbstractC12193c, AbstractC12195e, AbstractC12196f, AbstractC12197g {
    static {
        Covode.recordClassIndex(13939);
    }

    /* renamed from: a */
    void mo19596a(WebView webView);

    /* renamed from: b */
    void mo19597b(WebView webView);

    /* renamed from: com.bytedance.android.monitorV2.webview.d$a */
    public static class C12209a {

        /* renamed from: a */
        String f29368a;

        /* renamed from: b */
        AbstractC12211e f29369b;

        /* renamed from: c */
        AbstractC12198c f29370c;

        /* renamed from: d */
        AbstractC12194d f29371d;

        /* renamed from: e */
        String[] f29372e;

        /* renamed from: f */
        String[] f29373f;

        /* renamed from: g */
        AbstractC12070e f29374g;

        /* renamed from: h */
        AbstractC12190b f29375h;

        /* renamed from: i */
        String f29376i = "";

        /* renamed from: j */
        boolean f29377j = true;

        /* renamed from: k */
        boolean f29378k;

        /* renamed from: l */
        boolean f29379l;

        /* renamed from: m */
        String f29380m = "loc_after_detach";

        /* renamed from: n */
        boolean f29381n = true;

        /* renamed from: o */
        String f29382o = "";

        /* renamed from: p */
        String f29383p = "";

        /* renamed from: q */
        AbstractC12193c f29384q;

        /* renamed from: r */
        int f29385r = 100;

        /* renamed from: s */
        String f29386s = "";

        /* renamed from: t */
        JSONObject f29387t = new JSONObject();

        static {
            Covode.recordClassIndex(13940);
        }

        /* renamed from: a */
        public final C12209a mo19598a() {
            this.f29378k = true;
            return this;
        }

        C12209a() {
        }

        /* renamed from: a */
        public final C12209a mo19600a(String str) {
            this.f29386s = str;
            return this;
        }

        /* renamed from: a */
        public final C12209a mo19599a(AbstractC12190b bVar) {
            this.f29375h = bVar;
            this.f29374g = new C12074b(bVar);
            return this;
        }

        /* renamed from: a */
        public final C12209a mo19601a(String... strArr) {
            this.f29372e = strArr;
            return this;
        }
    }
}
