package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.h */
final /* synthetic */ class C22801h implements AbstractC88433f {

    /* renamed from: a */
    private final C22800g f53842a;

    /* renamed from: b */
    private final WebViewPreloadEntry f53843b;

    static {
        Covode.recordClassIndex(26697);
    }

    C22801h(C22800g gVar, WebViewPreloadEntry webViewPreloadEntry) {
        this.f53842a = gVar;
        this.f53843b = webViewPreloadEntry;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C22800g gVar = this.f53842a;
        WebViewPreloadEntry webViewPreloadEntry = this.f53843b;
        if (((Boolean) obj).booleanValue()) {
            gVar.mo37110a(webViewPreloadEntry.getUrl(), webViewPreloadEntry.getDelay(), webViewPreloadEntry.isNeedRender());
        }
    }
}
