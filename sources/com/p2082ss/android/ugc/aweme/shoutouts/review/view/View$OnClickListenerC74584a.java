package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.a */
final /* synthetic */ class View$OnClickListenerC74584a implements View.OnClickListener {

    /* renamed from: a */
    private final ShoutOutRatingBar f167721a;

    /* renamed from: b */
    private final ImageView f167722b;

    static {
        Covode.recordClassIndex(87398);
    }

    View$OnClickListenerC74584a(ShoutOutRatingBar shoutOutRatingBar, ImageView imageView) {
        this.f167721a = shoutOutRatingBar;
        this.f167722b = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ShoutOutRatingBar shoutOutRatingBar = this.f167721a;
        ImageView imageView = this.f167722b;
        if (shoutOutRatingBar.f167682b) {
            int i = (int) shoutOutRatingBar.f167683c;
            if (new BigDecimal(Float.toString(shoutOutRatingBar.f167683c)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (shoutOutRatingBar.f167681a.indexOfChild(view) > i) {
                shoutOutRatingBar.setStar((float) (shoutOutRatingBar.f167681a.indexOfChild(view) + 1));
            } else if (shoutOutRatingBar.f167681a.indexOfChild(view) != i) {
                shoutOutRatingBar.setStar(((float) shoutOutRatingBar.f167681a.indexOfChild(view)) + 1.0f);
            } else if (shoutOutRatingBar.f167685e == ShoutOutRatingBar.EnumC74574c.Full) {
            } else {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(shoutOutRatingBar.f167684d.getConstantState())) {
                    shoutOutRatingBar.setStar((float) (shoutOutRatingBar.f167681a.indexOfChild(view) + 1));
                } else {
                    shoutOutRatingBar.setStar(((float) shoutOutRatingBar.f167681a.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
