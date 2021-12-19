package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

public class Group extends AbstractC0549a {
    static {
        Covode.recordClassIndex(618);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0549a
    /* renamed from: b */
    public final void mo2425b() {
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) getLayoutParams();
        aVar.f2262al.mo2296c(0);
        aVar.f2262al.mo2298d(0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0549a
    /* renamed from: a */
    public final void mo2390a(AttributeSet attributeSet) {
        super.mo2390a(attributeSet);
        this.f2298f = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0549a
    /* renamed from: a */
    public final void mo2424a(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = 0.0f;
        }
        for (int i = 0; i < this.f2295c; i++) {
            View a = constraintLayout.mo2394a(this.f2294b[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (f > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a.setElevation(f);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
