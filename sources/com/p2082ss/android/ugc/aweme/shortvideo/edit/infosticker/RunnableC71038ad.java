package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45889g;
import com.p2082ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ad */
public final /* synthetic */ class RunnableC71038ad implements Runnable {

    /* renamed from: a */
    private final C71056i f159040a;

    /* renamed from: b */
    private final FrameLayout f159041b;

    static {
        Covode.recordClassIndex(83536);
    }

    public RunnableC71038ad(C71056i iVar, FrameLayout frameLayout) {
        this.f159040a = iVar;
        this.f159041b = frameLayout;
    }

    public final void run() {
        MethodCollector.m26663i(13958);
        C71056i iVar = this.f159040a;
        FrameLayout frameLayout = this.f159041b;
        VESize b = iVar.f159137s.mo56330b();
        if (b.width == 0 || b.height == 0) {
            MethodCollector.m26664o(13958);
            return;
        }
        int[] a = C45889g.m88533a(frameLayout, b.width, b.height);
        iVar.f159097D = a[0];
        iVar.f159098E = a[1];
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        iVar.f159099F = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            iVar.f159100G = aVar.mo77311a(iVar.f159121c, iVar.f159097D);
            frameLayout.addView(iVar.f159100G.getContentView());
        }
        MethodCollector.m26664o(13958);
    }
}
