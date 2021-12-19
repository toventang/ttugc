package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1453a;

    /* renamed from: b */
    private int f1454b;

    /* renamed from: c */
    private WeakReference<View> f1455c;

    /* renamed from: d */
    private LayoutInflater f1456d;

    /* renamed from: e */
    private AbstractC0378a f1457e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface AbstractC0378a {
        static {
            Covode.recordClassIndex(443);
        }
    }

    static {
        Covode.recordClassIndex(442);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.f1454b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f1456d;
    }

    public final int getLayoutResource() {
        return this.f1453a;
    }

    /* renamed from: a */
    public final View mo1691a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1453a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1456d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View a = C1764a.m5927a(layoutInflater, this.f1453a, viewGroup, false);
            int i = this.f1454b;
            if (i != -1) {
                a.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(a, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(a, indexOfChild);
            }
            this.f1455c = new WeakReference<>(a);
            return a;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setInflatedId(int i) {
        this.f1454b = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1456d = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.f1453a = i;
    }

    public final void setOnInflateListener(AbstractC0378a aVar) {
        this.f1457e = aVar;
    }

    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1455c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1691a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    private ViewStubCompat(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, 0, 0);
        this.f1454b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1453a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
