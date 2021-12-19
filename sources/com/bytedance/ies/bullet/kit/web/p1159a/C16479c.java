package com.bytedance.ies.bullet.kit.web.p1159a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.AbstractC16497f;
import com.bytedance.ies.bullet.kit.web.C16476a;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.web.a.c */
public class C16479c implements AbstractC16497f {
    static {
        Covode.recordClassIndex(18910);
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: a */
    public Map<String, Object> mo26182a(AbstractC16494c cVar, C16248b bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: b */
    public AbstractC16486b mo26184b() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: a */
    public final C16476a mo26181a() {
        return new C16476a(true, 2);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m
    /* renamed from: a */
    public AbstractC16741q mo25787a(C16248b bVar) {
        C89219l.m154719c(bVar, "");
        return new C16855g();
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: a */
    public void mo26183a(WebSettings webSettings, WebView webView) {
        C89219l.m154719c(webSettings, "");
        C89219l.m154719c(webView, "");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
    }
}
