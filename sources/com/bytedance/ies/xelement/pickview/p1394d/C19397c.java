package com.bytedance.ies.xelement.pickview.p1394d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1395e.C19398a;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.pickview.d.c */
public final class C19397c extends TimerTask {

    /* renamed from: a */
    private int f45910a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f45911b;

    /* renamed from: c */
    private int f45912c;

    /* renamed from: d */
    private final C19398a f45913d;

    static {
        Covode.recordClassIndex(22192);
    }

    public final void run() {
        if (this.f45910a == Integer.MAX_VALUE) {
            this.f45910a = this.f45912c;
        }
        int i = this.f45910a;
        int i2 = (int) (((float) i) * 0.1f);
        this.f45911b = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f45911b = -1;
            } else {
                this.f45911b = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f45913d.mo30915a();
            this.f45913d.getHandler().sendEmptyMessage(3000);
            return;
        }
        C19398a aVar = this.f45913d;
        aVar.setTotalScrollY(aVar.getTotalScrollY() + ((float) this.f45911b));
        if (!this.f45913d.f45945e) {
            float itemHeight = this.f45913d.getItemHeight();
            float itemsCount = ((float) ((this.f45913d.getItemsCount() - 1) - this.f45913d.getInitPosition())) * itemHeight;
            if (this.f45913d.getTotalScrollY() <= ((float) (-this.f45913d.getInitPosition())) * itemHeight || this.f45913d.getTotalScrollY() >= itemsCount) {
                C19398a aVar2 = this.f45913d;
                aVar2.setTotalScrollY(aVar2.getTotalScrollY() - ((float) this.f45911b));
                this.f45913d.mo30915a();
                this.f45913d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f45913d.getHandler().sendEmptyMessage(1000);
        this.f45910a -= this.f45911b;
    }

    public C19397c(C19398a aVar, int i) {
        this.f45913d = aVar;
        this.f45912c = i;
    }
}
