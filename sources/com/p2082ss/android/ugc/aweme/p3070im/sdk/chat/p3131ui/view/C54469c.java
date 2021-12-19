package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c */
public final class C54469c extends PopupWindow {

    /* renamed from: a */
    public int f124772a;

    /* renamed from: b */
    public int f124773b;

    /* renamed from: c */
    public int f124774c;

    /* renamed from: d */
    private View f124775d;

    /* renamed from: e */
    private int f124776e;

    static {
        Covode.recordClassIndex(64179);
    }

    /* renamed from: b */
    private void m99803b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f124772a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m99804c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f124772a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: a */
    private void m99802a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = this.f124772a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f124774c;
        Double.isNaN(d);
        Double.isNaN(width);
        showAtLocation(view, i, (int) (width - (d * 0.6666666666666666d)), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo91551a(View view, int i, int i2) {
        this.f124775d = view;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f124774c = i;
        this.f124776e = i2;
    }

    /* renamed from: c */
    private void m99805c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f124772a, iArr[0] + i, (iArr[1] - this.f124776e) + i2);
    }

    /* renamed from: b */
    public final void mo91552b(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            int i3 = this.f124773b;
            if (i3 == 0) {
                m99805c(view, i, i2);
            } else if (i3 == 1) {
                m99802a(view);
            } else if (i3 == 2) {
                m99803b(view);
            } else if (i3 == 3) {
                m99804c(view);
            }
        }
    }
}
