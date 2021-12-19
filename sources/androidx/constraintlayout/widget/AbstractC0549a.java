package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p026a.p027a.C0527j;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.widget.a */
public abstract class AbstractC0549a extends View {

    /* renamed from: a */
    private String f2293a;

    /* renamed from: b */
    protected int[] f2294b;

    /* renamed from: c */
    protected int f2295c;

    /* renamed from: d */
    protected Context f2296d;

    /* renamed from: e */
    protected C0527j f2297e;

    /* renamed from: f */
    protected boolean f2298f;

    static {
        Covode.recordClassIndex(622);
    }

    /* renamed from: b */
    public void mo2425b() {
    }

    public void onDraw(Canvas canvas) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2294b, this.f2295c);
    }

    /* renamed from: a */
    public final void mo2437a() {
        if (this.f2297e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0547a) {
                ((ConstraintLayout.C0547a) layoutParams).f2262al = this.f2297e;
            }
        }
    }

    public AbstractC0549a(Context context) {
        super(context);
        this.f2294b = new int[32];
        this.f2296d = context;
        mo2390a((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.f2295c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2086a(str.substring(i));
                    return;
                } else {
                    m2086a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2424a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2293a);
        }
        C0527j jVar = this.f2297e;
        if (jVar != null) {
            jVar.mo2336z();
            for (int i = 0; i < this.f2295c; i++) {
                View a = constraintLayout.mo2394a(this.f2294b[i]);
                if (a != null) {
                    this.f2297e.mo2335a(constraintLayout.mo2395a(a));
                }
            }
        }
    }

    /* renamed from: a */
    private void m2086a(String str) {
        Object a;
        if (str != null && this.f2296d != null) {
            String trim = str.trim();
            int i = 0;
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
            if (i != 0 || (i = this.f2296d.getResources().getIdentifier(trim, "id", this.f2296d.getPackageName())) != 0 || (isInEditMode() && (getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) getParent()).mo2396a(trim)) != null && (a instanceof Integer) && (i = ((Integer) a).intValue()) != 0)) {
                setTag(i, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2390a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.jq, R.attr.jr, R.attr.ml, R.attr.pf, R.attr.pg, R.attr.zm, R.attr.zn, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0w, R.attr.a0x, R.attr.a11, R.attr.a12, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a1f});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2293a = string;
                    setIds(string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2298f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public AbstractC0549a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2294b = new int[32];
        this.f2296d = context;
        mo2390a(attributeSet);
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f2295c + 1;
        int[] iArr = this.f2294b;
        if (i2 > iArr.length) {
            this.f2294b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2294b;
        int i3 = this.f2295c;
        iArr2[i3] = i;
        this.f2295c = i3 + 1;
    }
}
