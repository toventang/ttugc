package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.property.C65409cs;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.utils.C84912r;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bu */
public final /* synthetic */ class RunnableC73537bu implements Runnable {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165214a;

    static {
        Covode.recordClassIndex(86274);
    }

    RunnableC73537bu(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f165214a = vEVideoPublishPreviewActivity;
    }

    public final void run() {
        float width;
        int b;
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f165214a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f164720g.getLayoutParams();
        if (vEVideoPublishPreviewActivity.f164733t.getVideoWidth() == null || vEVideoPublishPreviewActivity.f164733t.getVideoWidth().intValue() == 0) {
            width = ((float) vEVideoPublishPreviewActivity.f164720g.getWidth()) * 1.0f;
            b = C70636dh.m124831b(C40963b.m82473a());
        } else {
            width = ((float) vEVideoPublishPreviewActivity.f164720g.getWidth()) * 1.0f;
            b = vEVideoPublishPreviewActivity.f164733t.getVideoWidth().intValue();
        }
        float f = width / ((float) b);
        C84911q.m145928d("renderCaption surface width " + vEVideoPublishPreviewActivity.f164720g.getWidth());
        float height = (float) ((vEVideoPublishPreviewActivity.f164720g.getHeight() - vEVideoPublishPreviewActivity.f164719f.f200423w.mo56330b().height) / 2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f164732s.getLayoutParams();
        int i = C83090d.f185668t;
        int i2 = C83090d.f185667s;
        int i3 = C83090d.f185666r;
        if (vEVideoPublishPreviewActivity.f164733t.getMarginStart() != null && vEVideoPublishPreviewActivity.f164733t.getMarginStart().intValue() > 0) {
            i = vEVideoPublishPreviewActivity.f164733t.getMarginStart().intValue();
            i2 = vEVideoPublishPreviewActivity.f164733t.getMarginTop().intValue();
            i3 = vEVideoPublishPreviewActivity.f164733t.getMarginBottom().intValue();
        }
        if (vEVideoPublishPreviewActivity.f164733t.getLocation() == EnumC75306a.LEFT_BOTTOM.getValue()) {
            layoutParams2.gravity = 80;
            if (C65409cs.m117124b()) {
                layoutParams2.bottomMargin = (int) (vEVideoPublishPreviewActivity.f164723j.getBottomMarginForCaptionSticker() + C84912r.m145930a(vEVideoPublishPreviewActivity, 8.0f));
            } else {
                layoutParams2.bottomMargin = (int) ((((((float) vEVideoPublishPreviewActivity.f164729p.getHeight()) + height) - ((float) layoutParams.topMargin)) - ((float) layoutParams.height)) + (((float) i3) * f));
            }
        } else {
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = (int) (height + ((float) layoutParams.topMargin) + (((float) i2) * f));
        }
        if (C80471gb.m139482a()) {
            layoutParams2.rightMargin = (int) (((float) layoutParams.rightMargin) + (((float) i) * f));
        } else {
            layoutParams2.leftMargin = (int) (((float) layoutParams.leftMargin) + (((float) i) * f));
        }
        vEVideoPublishPreviewActivity.f164732s.bringToFront();
        vEVideoPublishPreviewActivity.f164732s.setLayoutParams(layoutParams2);
        vEVideoPublishPreviewActivity.f164719f.f200423w.mo56305a(new C73539bw(vEVideoPublishPreviewActivity));
    }
}
