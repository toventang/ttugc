package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65409cs;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bv */
public final /* synthetic */ class RunnableC73538bv implements Runnable {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165215a;

    /* renamed from: b */
    private final NormalTrackTimeStamp f165216b;

    /* renamed from: c */
    private final View f165217c;

    /* renamed from: d */
    private final View f165218d;

    static {
        Covode.recordClassIndex(86275);
    }

    RunnableC73538bv(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity, NormalTrackTimeStamp normalTrackTimeStamp, View view, View view2) {
        this.f165215a = vEVideoPublishPreviewActivity;
        this.f165216b = normalTrackTimeStamp;
        this.f165217c = view;
        this.f165218d = view2;
    }

    public final void run() {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f165215a;
        NormalTrackTimeStamp normalTrackTimeStamp = this.f165216b;
        View view = this.f165217c;
        View view2 = this.f165218d;
        Point a = vEVideoPublishPreviewActivity.mo115947a(new PointF(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f164720g.getLayoutParams();
        view.setX(((float) (a.x + layoutParams.leftMargin)) - (((float) view.getWidth()) / 2.0f));
        view.setY(((float) (a.y + layoutParams.topMargin)) - (((float) view.getHeight()) / 2.0f));
        view.setRotation(normalTrackTimeStamp.getRotation());
        float floatValue = ((float) vEVideoPublishPreviewActivity.mo115947a(new PointF(normalTrackTimeStamp.getWidth(), normalTrackTimeStamp.getHeight())).x) / (normalTrackTimeStamp.getScale().floatValue() * ((float) view.getWidth()));
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.bringToFront();
        view2.bringToFront();
        view.setVisibility(0);
        if (C65409cs.m117124b()) {
            vEVideoPublishPreviewActivity.mo115950k();
        }
    }
}
