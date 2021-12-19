package com.bytedance.ies.bullet.service.webkit;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.web.AbstractC16674b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.webkit.a */
public final class C16982a implements AbstractC16674b {

    /* renamed from: a */
    public final C16983b f40441a;

    /* renamed from: b */
    private String f40442b;

    static {
        Covode.recordClassIndex(19427);
    }

    public C16982a(C16983b bVar) {
        C89219l.m154719c(bVar, "");
        this.f40441a = bVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16674b
    /* renamed from: a */
    public final void mo26486a(Map<String, ? extends Object> map) {
        C89219l.m154719c(map, "");
        if (map.isEmpty()) {
            this.f40442b = null;
        } else {
            this.f40442b = new JSONObject(map).toString();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16674b
    /* renamed from: a */
    public final void mo26485a(WebView webView) {
        C89219l.m154719c(webView, "");
        if (this.f40442b != null) {
            Object tag = webView.getTag(R.id.c26);
            if (tag == null) {
                int i = Build.VERSION.SDK_INT;
                GlobalProps globalProps = new GlobalProps();
                globalProps.f40440a = this.f40442b;
                WebSettings settings = webView.getSettings();
                C89219l.m154709a((Object) settings, "");
                settings.setJavaScriptEnabled(true);
                webView.addJavascriptInterface(globalProps, "__globalprops");
                webView.setTag(R.id.c26, globalProps);
                this.f40441a.printLog("injectGlobalProps:successfully set", EnumC16586p.D, "webkit");
            } else if (!(tag instanceof GlobalProps)) {
                this.f40441a.printLog("injectGlobalProps:type mismatch, current type is " + tag.getClass(), EnumC16586p.E, "webkit");
            } else {
                this.f40441a.printLog("injectGlobalProps:already set", EnumC16586p.D, "webkit");
                ((GlobalProps) tag).f40440a = this.f40442b;
            }
        }
    }
}
