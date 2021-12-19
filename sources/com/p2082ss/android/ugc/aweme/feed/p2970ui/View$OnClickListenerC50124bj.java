package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50120bi;
import java.math.BigDecimal;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.bj */
public final /* synthetic */ class View$OnClickListenerC50124bj implements View.OnClickListener {

    /* renamed from: a */
    private final C50120bi f115713a;

    /* renamed from: b */
    private final ImageView f115714b;

    static {
        Covode.recordClassIndex(59250);
    }

    View$OnClickListenerC50124bj(C50120bi biVar, ImageView imageView) {
        this.f115713a = biVar;
        this.f115714b = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C50120bi biVar = this.f115713a;
        ImageView imageView = this.f115714b;
        if (biVar.f115697b) {
            int i = (int) biVar.f115698c;
            if (new BigDecimal(Float.toString(biVar.f115698c)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (biVar.f115696a.indexOfChild(view) > i) {
                biVar.setStar((float) (biVar.f115696a.indexOfChild(view) + 1));
            } else if (biVar.f115696a.indexOfChild(view) != i) {
                biVar.setStar(((float) biVar.f115696a.indexOfChild(view)) + 1.0f);
            } else if (biVar.f115700e == C50120bi.EnumC50123c.Full) {
            } else {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(biVar.f115699d.getConstantState())) {
                    biVar.setStar((float) (biVar.f115696a.indexOfChild(view) + 1));
                } else {
                    biVar.setStar(((float) biVar.f115696a.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
