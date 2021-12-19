package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.browser.view.c */
public final /* synthetic */ class View$OnLongClickListenerC7247c implements View.OnLongClickListener {

    /* renamed from: a */
    private final C7244b f18046a;

    static {
        Covode.recordClassIndex(7995);
    }

    View$OnLongClickListenerC7247c(C7244b bVar) {
        this.f18046a = bVar;
    }

    public final boolean onLongClick(View view) {
        WebView webView;
        WebView.HitTestResult hitTestResult;
        C7244b bVar = this.f18046a;
        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            String extra = hitTestResult.getExtra();
            Context context = webView.getContext();
            if (!(extra == null || context == null || !C6935a.m14806b(extra))) {
                new DialogInterfaceC0216c.C0217a(context).mo449a(extra).mo452a(new String[]{context.getResources().getString(R.string.gqp)}, new DialogInterface$OnClickListenerC7248d(bVar, context, extra)).mo458b();
                return true;
            }
        }
        return false;
    }
}
