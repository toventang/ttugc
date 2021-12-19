package emotes.p4557a;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* renamed from: emotes.a.e */
public final class C88365e extends PopupWindow {

    /* renamed from: a */
    public int f200596a;

    /* renamed from: b */
    public int f200597b;

    /* renamed from: c */
    public int f200598c;

    /* renamed from: d */
    private View f200599d;

    /* renamed from: e */
    private Context f200600e;

    /* renamed from: f */
    private int f200601f;

    static {
        Covode.recordClassIndex(104404);
    }

    /* renamed from: a */
    public final void mo142871a(View view, int i) {
        dismiss();
        if (view != null) {
            int i2 = this.f200597b;
            if (i2 == 0) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                showAtLocation(view, this.f200596a, iArr[0] + i, (iArr[1] - this.f200601f) + 0);
            } else if (i2 == 1) {
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int i3 = this.f200596a;
                double width = (double) (iArr2[0] + (view.getWidth() / 2));
                double d = (double) this.f200598c;
                Double.isNaN(d);
                Double.isNaN(width);
                showAtLocation(view, i3, (int) (width - (d * 0.6666666666666666d)), iArr2[1] + view.getHeight());
            } else if (i2 == 2) {
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                showAtLocation(view, this.f200596a, iArr3[0] - view.getWidth(), iArr3[1]);
            } else if (i2 == 3) {
                int[] iArr4 = new int[2];
                view.getLocationInWindow(iArr4);
                showAtLocation(view, this.f200596a, iArr4[0] + view.getWidth(), iArr4[1]);
            }
        }
    }

    /* renamed from: a */
    public final void mo142872a(View view, Context context, int i, int i2) {
        this.f200599d = view;
        this.f200600e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f200598c = i;
        this.f200601f = i2;
    }
}
