package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40559w;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.j */
public final /* synthetic */ class RunnableC22803j implements Runnable {

    /* renamed from: a */
    private final C22800g f53845a;

    /* renamed from: b */
    private final boolean f53846b;

    /* renamed from: c */
    private final String f53847c;

    static {
        Covode.recordClassIndex(26699);
    }

    RunnableC22803j(C22800g gVar, boolean z, String str) {
        this.f53845a = gVar;
        this.f53846b = z;
        this.f53847c = str;
    }

    public final void run() {
        MethodCollector.m26663i(6695);
        C22800g gVar = this.f53845a;
        boolean z = this.f53846b;
        String str = this.f53847c;
        if (gVar.mo37111e()) {
            if (z) {
                gVar.f53839a = C40556v.m81851a().mo69682b(gVar.f53840b.getActivity());
                if (!(gVar.f53840b.mo37093h() == null || gVar.f53839a == null)) {
                    gVar.f53840b.mo37093h().addView(gVar.f53839a);
                    gVar.f53839a.loadUrl(str + "&cov_webview_prerender_time=" + System.currentTimeMillis() + "&cov19_render_no_need_load=1");
                    MethodCollector.m26664o(6695);
                    return;
                }
            } else {
                C40556v a = C40556v.m81851a();
                if (Build.VERSION.SDK_INT >= 23 && !a.mo69683c() && a.f94895a.size() < a.f94898d) {
                    C17867d.m33078a().getMainLooper().getQueue().addIdleHandler(new C40559w(a));
                }
            }
        }
        MethodCollector.m26664o(6695);
    }
}
