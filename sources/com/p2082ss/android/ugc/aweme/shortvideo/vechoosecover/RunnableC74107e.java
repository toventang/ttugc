package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Point;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.e */
public final /* synthetic */ class RunnableC74107e implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity f166382a;

    /* renamed from: b */
    private final NormalTrackTimeStamp f166383b;

    /* renamed from: c */
    private final int f166384c;

    /* renamed from: d */
    private final float f166385d;

    /* renamed from: e */
    private final int f166386e;

    /* renamed from: f */
    private final View f166387f;

    /* renamed from: g */
    private final int f166388g;

    /* renamed from: h */
    private final int f166389h;

    /* renamed from: i */
    private final int f166390i;

    static {
        Covode.recordClassIndex(86860);
    }

    RunnableC74107e(ChooseCoverActivity chooseCoverActivity, NormalTrackTimeStamp normalTrackTimeStamp, int i, float f, int i2, View view, int i3, int i4, int i5) {
        this.f166382a = chooseCoverActivity;
        this.f166383b = normalTrackTimeStamp;
        this.f166384c = i;
        this.f166385d = f;
        this.f166386e = i2;
        this.f166387f = view;
        this.f166388g = i3;
        this.f166389h = i4;
        this.f166390i = i5;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f166382a;
        NormalTrackTimeStamp normalTrackTimeStamp = this.f166383b;
        int i = this.f166384c;
        float f = this.f166385d;
        int i2 = this.f166386e;
        View view = this.f166387f;
        int i3 = this.f166388g;
        int i4 = this.f166389h;
        int i5 = this.f166390i;
        float f2 = (float) i;
        Point point = new Point((int) (normalTrackTimeStamp.getX() * f2 * f), (int) (normalTrackTimeStamp.getY() * ((float) i2) * f));
        view.setX(((float) ((chooseCoverActivity.f166352g.getLeft() + i3) + point.x)) - (((float) view.getWidth()) / 2.0f));
        if (chooseCoverActivity.f166349d.notUseCanvasSize()) {
            float width = ((((float) chooseCoverActivity.f166352g.getWidth()) * 1.0f) / ((float) chooseCoverActivity.f166349d.mVideoCanvasWidth)) * ((float) chooseCoverActivity.f166349d.mVideoCanvasHeight);
            view.setY((((normalTrackTimeStamp.getY() * width) + ((((float) chooseCoverActivity.f166352g.getHeight()) - width) / 2.0f)) - (((((float) chooseCoverActivity.f166352g.getHeight()) / 2.0f) - ((float) i4)) - (((float) i5) / 2.0f))) - (((float) view.getHeight()) / 2.0f));
        } else {
            view.setY(((float) ((chooseCoverActivity.f166352g.getTop() + i4) + point.y)) - (((float) view.getHeight()) / 2.0f));
        }
        view.setRotation(normalTrackTimeStamp.getRotation());
        float width2 = (normalTrackTimeStamp.getWidth() * f2) / (normalTrackTimeStamp.getScale().floatValue() * ((float) view.getWidth()));
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * f * width2);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * f * width2);
        view.setVisibility(0);
    }
}
