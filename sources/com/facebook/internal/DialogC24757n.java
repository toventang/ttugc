package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
public class DialogC24757n extends DialogC24700af {

    /* renamed from: k */
    private static final String f58735k = DialogC24757n.class.getName();

    /* renamed from: l */
    private boolean f58736l;

    static {
        Covode.recordClassIndex(28910);
    }

    @Override // com.facebook.internal.DialogC24700af
    public void cancel() {
        MethodCollector.m26663i(7344);
        WebView webView = this.f58642d;
        if (!this.f58648j || this.f58646h || webView == null || !webView.isShown()) {
            super.cancel();
            MethodCollector.m26664o(7344);
        } else if (this.f58736l) {
            MethodCollector.m26664o(7344);
        } else {
            this.f58736l = true;
            String concat = "javascript:".concat("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            String a = C84357h.f188595a.mo129370a(webView, concat);
            if (!TextUtils.isEmpty(a)) {
                concat = a;
            }
            webView.loadUrl(concat);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.facebook.internal.DialogC24757n.RunnableC247581 */

                static {
                    Covode.recordClassIndex(28911);
                }

                public final void run() {
                    if (!C24677a.m47209a(this)) {
                        try {
                            DialogC24757n.super.cancel();
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                }
            }, 1500);
            MethodCollector.m26664o(7344);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.DialogC24700af
    /* renamed from: a */
    public final Bundle mo40517a(String str) {
        Bundle c = C24693ad.m47271c(Uri.parse(str).getQuery());
        String string = c.getString("bridge_args");
        c.remove("bridge_args");
        if (!C24693ad.m47261a(string)) {
            try {
                c.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C24730d.m47358a(new JSONObject(string)));
            } catch (JSONException unused) {
                C24693ad.m47277d(f58735k);
            }
        }
        String string2 = c.getString("method_results");
        c.remove("method_results");
        if (!C24693ad.m47261a(string2)) {
            if (C24693ad.m47261a(string2)) {
                string2 = "{}";
            }
            try {
                c.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C24730d.m47358a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                C24693ad.m47277d(f58735k);
            }
        }
        c.remove("version");
        c.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C24786y.m47458a());
        return c;
    }

    private DialogC24757n(Context context, String str, String str2) {
        super(context, str);
        this.f58640b = str2;
    }

    /* renamed from: a */
    public static DialogC24757n m47402a(Context context, String str, String str2) {
        DialogC24700af.m47314a(context);
        return new DialogC24757n(context, str, str2);
    }
}
