package com.p2082ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.c */
public final class C46671c extends PopupWindow {

    /* renamed from: a */
    public int f108813a;

    /* renamed from: b */
    public int f108814b;

    /* renamed from: c */
    public int f108815c;

    /* renamed from: d */
    private View f108816d;

    /* renamed from: e */
    private Context f108817e;

    /* renamed from: f */
    private int f108818f;

    static {
        Covode.recordClassIndex(55265);
    }

    /* renamed from: b */
    private void m90068b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f108813a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m90070c(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f108813a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: a */
    private void m90067a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = this.f108813a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f108815c;
        Double.isNaN(d);
        Double.isNaN(width);
        showAtLocation(view, i, (int) (width - (d * 0.6666666666666666d)), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo79292a(View view, Context context) {
        this.f108816d = view;
        this.f108817e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        view.measure(0, 0);
        this.f108815c = view.getMeasuredWidth();
        this.f108818f = view.getMeasuredHeight();
    }

    /* renamed from: b */
    private void m90069b(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f108813a, iArr[0] + i, (iArr[1] - this.f108818f) + i2);
    }

    /* renamed from: a */
    public final void mo79291a(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            int i3 = this.f108814b;
            if (i3 == 0) {
                m90069b(view, i, i2);
            } else if (i3 == 1) {
                m90067a(view);
            } else if (i3 == 2) {
                m90068b(view);
            } else if (i3 == 3) {
                m90070c(view);
            }
        }
    }
}
