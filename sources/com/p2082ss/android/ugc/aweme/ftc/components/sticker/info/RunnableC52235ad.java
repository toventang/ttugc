package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45889g;
import com.p2082ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.ad */
final /* synthetic */ class RunnableC52235ad implements Runnable {

    /* renamed from: a */
    private final C52264i f120345a;

    /* renamed from: b */
    private final FrameLayout f120346b;

    static {
        Covode.recordClassIndex(61623);
    }

    RunnableC52235ad(C52264i iVar, FrameLayout frameLayout) {
        this.f120345a = iVar;
        this.f120346b = frameLayout;
    }

    public final void run() {
        MethodCollector.m26663i(12790);
        C52264i iVar = this.f120345a;
        FrameLayout frameLayout = this.f120346b;
        VESize b = iVar.f120447r.mo56330b();
        if (b.width == 0 || b.height == 0) {
            MethodCollector.m26664o(12790);
            return;
        }
        int[] a = C45889g.m88533a(frameLayout, b.width, b.height);
        iVar.f120412C = a[0];
        iVar.f120413D = a[1];
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        iVar.f120414E = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            iVar.f120415F = aVar.mo77311a(iVar.f120432c, iVar.f120412C);
            frameLayout.addView(iVar.f120415F.getContentView());
        }
        MethodCollector.m26664o(12790);
    }
}
