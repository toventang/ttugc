package com.bytedance.ies.xelement.pickview.p1394d;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1395e.C19398a;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.pickview.d.a */
public final class C19395a extends TimerTask {

    /* renamed from: a */
    private float f45906a = 2.14748365E9f;

    /* renamed from: b */
    private final float f45907b;

    /* renamed from: c */
    private final C19398a f45908c;

    static {
        Covode.recordClassIndex(22190);
    }

    public final void run() {
        if (this.f45906a == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f45907b) > 2000.0f) {
                if (this.f45907b <= 0.0f) {
                    f = -2000.0f;
                }
                this.f45906a = f;
            } else {
                this.f45906a = this.f45907b;
            }
        }
        if (Math.abs(this.f45906a) < 0.0f || Math.abs(this.f45906a) > 20.0f) {
            int i = (int) (this.f45906a / 100.0f);
            C19398a aVar = this.f45908c;
            float f2 = (float) i;
            aVar.setTotalScrollY(aVar.getTotalScrollY() - f2);
            if (!this.f45908c.f45945e) {
                float itemHeight = this.f45908c.getItemHeight();
                float f3 = ((float) (-this.f45908c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f45908c.getItemsCount() - 1) - this.f45908c.getInitPosition())) * itemHeight;
                double totalScrollY = (double) this.f45908c.getTotalScrollY();
                double d = (double) itemHeight;
                Double.isNaN(d);
                double d2 = d * 0.25d;
                Double.isNaN(totalScrollY);
                if (totalScrollY - d2 < ((double) f3)) {
                    f3 = this.f45908c.getTotalScrollY() + f2;
                } else {
                    double totalScrollY2 = (double) this.f45908c.getTotalScrollY();
                    Double.isNaN(totalScrollY2);
                    if (totalScrollY2 + d2 > ((double) itemsCount)) {
                        itemsCount = this.f45908c.getTotalScrollY() + f2;
                    }
                }
                if (this.f45908c.getTotalScrollY() <= f3) {
                    this.f45906a = 40.0f;
                    this.f45908c.setTotalScrollY((float) ((int) f3));
                } else if (this.f45908c.getTotalScrollY() >= itemsCount) {
                    this.f45908c.setTotalScrollY((float) ((int) itemsCount));
                    this.f45906a = -40.0f;
                }
            }
            float f4 = this.f45906a;
            if (f4 < 0.0f) {
                this.f45906a = f4 + 20.0f;
            } else {
                this.f45906a = f4 - 20.0f;
            }
            this.f45908c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f45908c.mo30915a();
        this.f45908c.getHandler().sendEmptyMessage(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public C19395a(C19398a aVar, float f) {
        this.f45908c = aVar;
        this.f45907b = f;
    }
}
