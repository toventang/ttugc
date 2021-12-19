package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.b */
final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC44047b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final C44046a f102686a;

    static {
        Covode.recordClassIndex(52352);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC44047b(C44046a aVar) {
        this.f102686a = aVar;
    }

    public final void onGlobalLayout() {
        C44046a aVar = this.f102686a;
        if (aVar.f102685h) {
            aVar.f102684g = aVar.f102678a.getHeight();
            aVar.f102685h = false;
        }
        Rect rect = new Rect();
        aVar.f102678a.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != aVar.f102682e) {
            int height = aVar.f102678a.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                aVar.f102683f.height = (aVar.f102684g - i2) + aVar.f102680c + aVar.f102681d;
            } else {
                aVar.f102683f.height = aVar.f102684g;
                if (aVar.f102680c == 0) {
                    aVar.f102680c = aVar.f102679b.getPaddingBottom();
                }
                if (aVar.f102681d == 0) {
                    aVar.f102681d = aVar.f102679b.getPaddingTop();
                }
            }
            aVar.f102678a.requestLayout();
            aVar.f102682e = i;
        }
    }
}
