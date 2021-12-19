package com.bytedance.ies.xelement.picker.p1389f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.picker.f.c */
public final class C19349c extends TimerTask {

    /* renamed from: a */
    private int f45755a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f45756b;

    /* renamed from: c */
    private int f45757c;

    /* renamed from: d */
    private final WheelView f45758d;

    static {
        Covode.recordClassIndex(22137);
    }

    public final void run() {
        if (this.f45755a == Integer.MAX_VALUE) {
            this.f45755a = this.f45757c;
        }
        int i = this.f45755a;
        int i2 = (int) (((float) i) * 0.1f);
        this.f45756b = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f45756b = -1;
            } else {
                this.f45756b = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f45758d.mo30814a();
            this.f45758d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f45758d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f45756b));
        if (!this.f45758d.f45786e) {
            float itemHeight = this.f45758d.getItemHeight();
            float itemsCount = ((float) ((this.f45758d.getItemsCount() - 1) - this.f45758d.getInitPosition())) * itemHeight;
            if (this.f45758d.getTotalScrollY() <= ((float) (-this.f45758d.getInitPosition())) * itemHeight || this.f45758d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f45758d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - ((float) this.f45756b));
                this.f45758d.mo30814a();
                this.f45758d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f45758d.getHandler().sendEmptyMessage(1000);
        this.f45755a -= this.f45756b;
    }

    public C19349c(WheelView wheelView, int i) {
        this.f45758d = wheelView;
        this.f45757c = i;
    }
}
