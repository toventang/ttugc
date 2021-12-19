package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.constraintlayout.p026a.p027a.C0512b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class Barrier extends AbstractC0549a {

    /* renamed from: a */
    C0512b f2201a;

    /* renamed from: g */
    private int f2202g;

    /* renamed from: h */
    private int f2203h;

    static {
        Covode.recordClassIndex(614);
    }

    public int getType() {
        return this.f2202g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2201a.f1947b = z;
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setType(int i) {
        this.f2202g = i;
        this.f2203h = i;
        int i2 = Build.VERSION.SDK_INT;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i3 = this.f2202g;
            if (i3 == 5) {
                this.f2203h = 1;
            } else if (i3 == 6) {
                this.f2203h = 0;
            }
        } else {
            int i4 = this.f2202g;
            if (i4 == 5) {
                this.f2203h = 0;
            } else if (i4 == 6) {
                this.f2203h = 1;
            }
        }
        this.f2201a.f1945a = this.f2203h;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0549a
    /* renamed from: a */
    public final void mo2390a(AttributeSet attributeSet) {
        super.mo2390a(attributeSet);
        this.f2201a = new C0512b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.jq, R.attr.jr, R.attr.ml, R.attr.pf, R.attr.pg, R.attr.zm, R.attr.zn, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0w, R.attr.a0x, R.attr.a11, R.attr.a12, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a1f});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 5) {
                    this.f2201a.f1947b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f2297e = this.f2201a;
        mo2437a();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
