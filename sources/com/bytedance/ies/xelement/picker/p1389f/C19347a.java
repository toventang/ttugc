package com.bytedance.ies.xelement.picker.p1389f;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.picker.f.a */
public final class C19347a extends TimerTask {

    /* renamed from: a */
    private float f45751a = 2.14748365E9f;

    /* renamed from: b */
    private final float f45752b;

    /* renamed from: c */
    private final WheelView f45753c;

    static {
        Covode.recordClassIndex(22135);
    }

    public final void run() {
        if (this.f45751a == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f45752b) > 2000.0f) {
                if (this.f45752b <= 0.0f) {
                    f = -2000.0f;
                }
                this.f45751a = f;
            } else {
                this.f45751a = this.f45752b;
            }
        }
        if (Math.abs(this.f45751a) < 0.0f || Math.abs(this.f45751a) > 20.0f) {
            int i = (int) (this.f45751a / 100.0f);
            WheelView wheelView = this.f45753c;
            float f2 = (float) i;
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            if (!this.f45753c.f45786e) {
                float itemHeight = this.f45753c.getItemHeight();
                float f3 = ((float) (-this.f45753c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f45753c.getItemsCount() - 1) - this.f45753c.getInitPosition())) * itemHeight;
                double totalScrollY = (double) this.f45753c.getTotalScrollY();
                double d = (double) itemHeight;
                Double.isNaN(d);
                double d2 = d * 0.25d;
                Double.isNaN(totalScrollY);
                if (totalScrollY - d2 < ((double) f3)) {
                    f3 = this.f45753c.getTotalScrollY() + f2;
                } else {
                    double totalScrollY2 = (double) this.f45753c.getTotalScrollY();
                    Double.isNaN(totalScrollY2);
                    if (totalScrollY2 + d2 > ((double) itemsCount)) {
                        itemsCount = this.f45753c.getTotalScrollY() + f2;
                    }
                }
                if (this.f45753c.getTotalScrollY() <= f3) {
                    this.f45751a = 40.0f;
                    this.f45753c.setTotalScrollY((float) ((int) f3));
                } else if (this.f45753c.getTotalScrollY() >= itemsCount) {
                    this.f45753c.setTotalScrollY((float) ((int) itemsCount));
                    this.f45751a = -40.0f;
                }
            }
            float f4 = this.f45751a;
            if (f4 < 0.0f) {
                this.f45751a = f4 + 20.0f;
            } else {
                this.f45751a = f4 - 20.0f;
            }
            this.f45753c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f45753c.mo30814a();
        this.f45753c.getHandler().sendEmptyMessage(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public C19347a(WheelView wheelView, float f) {
        this.f45753c = wheelView;
        this.f45752b = f;
    }
}
