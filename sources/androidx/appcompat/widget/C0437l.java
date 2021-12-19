package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0822g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.l */
public final class C0437l extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1695a;

    /* renamed from: b */
    private boolean f1696b;

    static {
        boolean z;
        Covode.recordClassIndex(502);
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f1695a = z;
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (f1695a && this.f1696b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public C0437l(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0405al a = C0405al.m1466a(context, attributeSet, new int[]{16843126, 16843465, R.attr.a6l}, i, i2);
        if (a.mo1837f(2)) {
            boolean a2 = a.mo1827a(2, false);
            if (f1695a) {
                this.f1696b = a2;
            } else {
                C0822g.m2902a(this, a2);
            }
        }
        setBackgroundDrawable(a.mo1826a(0));
        a.f1585a.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1695a && this.f1696b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        int i5 = i2;
        if (f1695a && this.f1696b) {
            i5 -= view.getHeight();
        }
        super.update(view, i, i5, i3, i4);
    }
}
