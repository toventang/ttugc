package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0803x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: com.bytedance.tux.widget.b */
public final class C23409b extends ViewGroup {

    /* renamed from: a */
    private Drawable f55500a;

    /* renamed from: b */
    private int f55501b;

    /* renamed from: c */
    private boolean f55502c;

    /* renamed from: d */
    private boolean f55503d;

    /* renamed from: e */
    private List<Integer> f55504e;

    static {
        Covode.recordClassIndex(27368);
    }

    public final Drawable getDividerLine() {
        return this.f55500a;
    }

    public final int getDividerLineSize() {
        return this.f55501b;
    }

    public final boolean getForceVertical() {
        return this.f55502c;
    }

    public final boolean getLayoutHorizontal() {
        return this.f55503d;
    }

    public final void setDividerLine(Drawable drawable) {
        this.f55500a = drawable;
    }

    public final void setDividerLineSize(int i) {
        this.f55501b = i;
    }

    public final void setForceVertical(boolean z) {
        this.f55502c = z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: com.bytedance.tux.widget.b$a */
    static final class C23410a extends AbstractC89220m implements AbstractC89172b<View, Boolean> {

        /* renamed from: a */
        public static final C23410a f55505a = new C23410a();

        static {
            Covode.recordClassIndex(27369);
        }

        C23410a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            C89219l.m154719c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.tux.widget.b$b */
    static final class C23411b extends AbstractC89220m implements AbstractC89172b<View, Boolean> {

        /* renamed from: a */
        public static final C23411b f55506a = new C23411b();

        static {
            Covode.recordClassIndex(27370);
        }

        C23411b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            C89219l.m154719c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.widget.b$c */
    public static final class C23412c extends AbstractC89220m implements AbstractC89172b<View, Boolean> {

        /* renamed from: a */
        public static final C23412c f55507a = new C23412c();

        static {
            Covode.recordClassIndex(27371);
        }

        C23412c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            C89219l.m154719c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23409b(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8625);
        this.f55502c = true;
        this.f55503d = true;
        this.f55504e = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.aoz, R.attr.ap0, R.attr.ap5}, 0, 0);
        this.f55502c = obtainStyledAttributes.getBoolean(2, false);
        this.f55500a = obtainStyledAttributes.getDrawable(0);
        this.f55501b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(8625);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            super.dispatchDraw(canvas);
            return;
        }
        Drawable drawable = this.f55500a;
        if (drawable != null) {
            Iterator<T> it = this.f55504e.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (this.f55503d) {
                    drawable.setBounds(intValue, getPaddingTop(), this.f55501b + intValue, getPaddingTop() + getMeasuredHeight());
                } else {
                    drawable.setBounds(getPaddingLeft(), intValue, getPaddingRight() + getMeasuredWidth(), this.f55501b + intValue);
                }
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public /* synthetic */ C23409b(Context context, byte b) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C89269g a = C89271h.m154766a(0, getChildCount());
        ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((AbstractC89040af) it).mo143429a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            View view = (View) obj;
            C89219l.m154709a((Object) view, "");
            if (view.getVisibility() != 8) {
                arrayList2.add(obj);
            }
        }
        ArrayList<View> arrayList3 = arrayList2;
        int size = arrayList3.size();
        this.f55503d = true;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int i19 = 0;
        int i20 = 0;
        for (View view2 : arrayList3) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            C89219l.m154709a((Object) view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i11 = marginLayoutParams.leftMargin;
            } else {
                i11 = 0;
            }
            int i21 = paddingLeft + i11;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                i12 = marginLayoutParams2.rightMargin;
            } else {
                i12 = 0;
            }
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i21 + i12, view2.getLayoutParams().width);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (marginLayoutParams3 != null) {
                i13 = marginLayoutParams3.topMargin;
            } else {
                i13 = 0;
            }
            int i22 = paddingTop + i13;
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (marginLayoutParams4 != null) {
                i14 = marginLayoutParams4.bottomMargin;
            } else {
                i14 = 0;
            }
            view2.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i2, i22 + i14, view2.getLayoutParams().height));
            int measuredWidth = view2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i15 = marginLayoutParams5.leftMargin;
            } else {
                i15 = 0;
            }
            int i23 = measuredWidth + i15;
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i16 = marginLayoutParams6.rightMargin;
            } else {
                i16 = 0;
            }
            i19 = Math.max(i23 + i16, i19);
            int measuredHeight = view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i17 = marginLayoutParams7.topMargin;
            } else {
                i17 = 0;
            }
            int i24 = measuredHeight + i17;
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i18 = marginLayoutParams8.bottomMargin;
            } else {
                i18 = 0;
            }
            i20 = Math.max(i24 + i18, i20);
        }
        if (this.f55502c) {
            m44060a(i, i2, i19, i20);
            return;
        }
        int i25 = size - 1;
        int paddingLeft2 = (i19 * size) + (this.f55501b * i25) + getPaddingLeft() + getPaddingRight();
        if (mode == 0 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -2)) {
            for (View view3 : arrayList3) {
                C89219l.m154709a((Object) view3, "");
                ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                if (!(layoutParams9 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams9 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                if (marginLayoutParams9 != null) {
                    i3 = marginLayoutParams9.leftMargin;
                } else {
                    i3 = 0;
                }
                int i26 = i19 - i3;
                ViewGroup.LayoutParams layoutParams10 = view3.getLayoutParams();
                if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams10 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                if (marginLayoutParams10 != null) {
                    i4 = marginLayoutParams10.rightMargin;
                } else {
                    i4 = 0;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i4, 1073741824);
                ViewGroup.LayoutParams layoutParams11 = view3.getLayoutParams();
                if (!(layoutParams11 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams11 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                if (marginLayoutParams11 != null) {
                    i5 = marginLayoutParams11.topMargin;
                } else {
                    i5 = 0;
                }
                int i27 = i20 - i5;
                ViewGroup.LayoutParams layoutParams12 = view3.getLayoutParams();
                if (!(layoutParams12 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams12 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams12;
                if (marginLayoutParams12 != null) {
                    i6 = marginLayoutParams12.bottomMargin;
                } else {
                    i6 = 0;
                }
                view3.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i27 - i6, 1073741824));
            }
            if (mode2 != 1073741824) {
                size3 = i20 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft2, size3);
        } else if (size == 0) {
            if (mode2 != 1073741824) {
                size3 = getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size2, size3);
        } else if (size2 < paddingLeft2) {
            m44060a(i, i2, i19, i20);
        } else {
            int paddingLeft3 = (size2 - (((this.f55501b * i25) + getPaddingLeft()) + getPaddingRight())) / size;
            for (View view4 : arrayList3) {
                C89219l.m154709a((Object) view4, "");
                ViewGroup.LayoutParams layoutParams13 = view4.getLayoutParams();
                if (!(layoutParams13 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams13 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams13;
                if (marginLayoutParams13 != null) {
                    i7 = marginLayoutParams13.leftMargin;
                } else {
                    i7 = 0;
                }
                int i28 = paddingLeft3 - i7;
                ViewGroup.LayoutParams layoutParams14 = view4.getLayoutParams();
                if (!(layoutParams14 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams14 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams14;
                if (marginLayoutParams14 != null) {
                    i8 = marginLayoutParams14.rightMargin;
                } else {
                    i8 = 0;
                }
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i28 - i8, 1073741824);
                ViewGroup.LayoutParams layoutParams15 = view4.getLayoutParams();
                if (!(layoutParams15 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams15 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams15 = (ViewGroup.MarginLayoutParams) layoutParams15;
                if (marginLayoutParams15 != null) {
                    i9 = marginLayoutParams15.topMargin;
                } else {
                    i9 = 0;
                }
                int i29 = i20 - i9;
                ViewGroup.LayoutParams layoutParams16 = view4.getLayoutParams();
                if (!(layoutParams16 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams16 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) layoutParams16;
                if (marginLayoutParams16 != null) {
                    i10 = marginLayoutParams16.bottomMargin;
                } else {
                    i10 = 0;
                }
                view4.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i29 - i10, 1073741824));
            }
            if (mode2 != 1073741824) {
                size3 = i20 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size2, size3);
        }
    }

    /* renamed from: a */
    private final void m44060a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC89306h a = C89309k.m154799a((AbstractC89306h) C0803x.m2810a(this), (AbstractC89172b) C23412c.f55507a);
        int j = C89309k.m154816j(a);
        int i14 = 0;
        this.f55503d = false;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -1)) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && getLayoutParams().height == -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i5 = (size - getPaddingLeft()) - getPaddingRight();
        } else {
            i5 = i3;
            size = i3;
        }
        if (!z2) {
            Iterator a2 = a.mo2926a();
            while (a2.hasNext()) {
                View view = (View) a2.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    i10 = 0;
                }
                int i15 = i5 - i10;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i11 = marginLayoutParams2.rightMargin;
                } else {
                    i11 = 0;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i11, 1073741824);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams3 != null) {
                    i12 = marginLayoutParams3.topMargin;
                } else {
                    i12 = 0;
                }
                int i16 = i4 - i12;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams4 != null) {
                    i13 = marginLayoutParams4.bottomMargin;
                } else {
                    i13 = 0;
                }
                view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16 - i13, 1073741824));
            }
            int paddingTop = (i4 * j) + (this.f55501b * (j - 1)) + getPaddingTop() + getPaddingBottom();
            if (paddingTop > 0) {
                i14 = paddingTop;
            }
            setMeasuredDimension(size, i14);
            return;
        }
        int paddingTop2 = (size2 - (((this.f55501b * (j - 1)) + getPaddingTop()) + getPaddingBottom())) / j;
        Iterator a3 = a.mo2926a();
        while (a3.hasNext()) {
            View view2 = (View) a3.next();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i6 = marginLayoutParams5.leftMargin;
            } else {
                i6 = 0;
            }
            int i17 = i3 - i6;
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i7 = marginLayoutParams6.rightMargin;
            } else {
                i7 = 0;
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17 - i7, 1073741824);
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i8 = marginLayoutParams7.topMargin;
            } else {
                i8 = 0;
            }
            int i18 = paddingTop2 - i8;
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i9 = marginLayoutParams8.bottomMargin;
            } else {
                i9 = 0;
            }
            view2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i18 - i9, 1073741824));
        }
        setMeasuredDimension(i3 + getPaddingLeft() + getPaddingRight(), size2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this.f55504e.clear();
        if (this.f55503d) {
            List<View> g = C89309k.m154813g(C89309k.m154799a((AbstractC89306h) C0803x.m2810a(this), (AbstractC89172b) C23410a.f55505a));
            int paddingLeft = getPaddingLeft();
            if (C0792v.m2768e(this) != 0) {
                g = C89070n.m154584g((Iterable) g);
            }
            for (View view : g) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i9 = marginLayoutParams.leftMargin;
                } else {
                    i9 = 0;
                }
                int i13 = paddingLeft + i9;
                int paddingTop = getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i10 = marginLayoutParams2.topMargin;
                } else {
                    i10 = 0;
                }
                int i14 = paddingTop + i10;
                int measuredWidth = view.getMeasuredWidth() + i13;
                int paddingTop2 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams3 != null) {
                    i11 = marginLayoutParams3.topMargin;
                } else {
                    i11 = 0;
                }
                view.layout(i13, i14, measuredWidth, paddingTop2 + i11 + view.getMeasuredHeight());
                int measuredWidth2 = i13 + view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams4 != null) {
                    i12 = marginLayoutParams4.rightMargin;
                } else {
                    i12 = 0;
                }
                int i15 = measuredWidth2 + i12;
                this.f55504e.add(Integer.valueOf(i15));
                paddingLeft = i15 + this.f55501b;
            }
            return;
        }
        AbstractC89306h a = C89309k.m154799a((AbstractC89306h) C0803x.m2810a(this), (AbstractC89172b) C23411b.f55506a);
        int paddingTop3 = getPaddingTop();
        Iterator a2 = a.mo2926a();
        while (a2.hasNext()) {
            View view2 = (View) a2.next();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i5 = marginLayoutParams5.topMargin;
            } else {
                i5 = 0;
            }
            int i16 = paddingTop3 + i5;
            int paddingLeft2 = getPaddingLeft();
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i6 = marginLayoutParams6.leftMargin;
            } else {
                i6 = 0;
            }
            int i17 = paddingLeft2 + i6;
            int paddingLeft3 = getPaddingLeft();
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i7 = marginLayoutParams7.leftMargin;
            } else {
                i7 = 0;
            }
            view2.layout(i17, i16, paddingLeft3 + i7 + view2.getMeasuredWidth(), view2.getMeasuredHeight() + i16);
            int measuredHeight = i16 + view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i8 = marginLayoutParams8.topMargin;
            } else {
                i8 = 0;
            }
            int i18 = measuredHeight + i8;
            this.f55504e.add(Integer.valueOf(i18));
            paddingTop3 = i18 + this.f55501b;
        }
    }
}
