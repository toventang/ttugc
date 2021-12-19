package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p035f.C0687g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.c */
public class C38857c extends ViewGroup {

    /* renamed from: a */
    public static final C38858a f91744a = new C38858a((byte) 0);

    /* renamed from: b */
    private List<List<View>> f91745b;

    /* renamed from: c */
    private List<Integer> f91746c;

    /* renamed from: d */
    private List<Integer> f91747d;

    /* renamed from: e */
    private int f91748e;

    /* renamed from: f */
    private List<View> f91749f;

    /* renamed from: g */
    private int f91750g;

    /* renamed from: h */
    private int f91751h;

    /* renamed from: i */
    private int f91752i;

    static {
        Covode.recordClassIndex(46411);
    }

    public C38857c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.c$a */
    public static final class C38858a {
        static {
            Covode.recordClassIndex(46412);
        }

        private C38858a() {
        }

        public /* synthetic */ C38858a(byte b) {
            this();
        }
    }

    public final int getMaxLine() {
        return this.f91752i;
    }

    public final int getSpaceH() {
        return this.f91751h;
    }

    public final int getSpaceV() {
        return this.f91750g;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final void setMaxLine(int i) {
        this.f91752i = i;
    }

    public final void setSpaceH(int i) {
        this.f91751h = i;
    }

    public final void setSpaceV(int i) {
        this.f91750g = i;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C89219l.m154721d(attributeSet, "");
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i5 + measuredWidth > paddingLeft) {
                    i6 = Math.max(i6, i5);
                    i3 = measuredWidth + this.f91751h;
                    i7 += i8;
                    i9++;
                    int i10 = this.f91752i;
                    if (i10 > 0 && i9 > i10) {
                        i8 = measuredHeight;
                        break;
                    }
                } else {
                    i3 = measuredWidth + this.f91751h + i5;
                    measuredHeight = Math.max(i8, measuredHeight);
                }
                if (i4 == childCount - 1) {
                    i6 = Math.max(i3, i6);
                    i7 += measuredHeight;
                }
                i5 = i3;
                i8 = measuredHeight;
            } else if (i4 == childCount - 1) {
                i6 = Math.max(i5, i6);
                i7 += i8;
            }
            i4++;
        }
        if (i8 > 0) {
            i7 += ((i7 / i8) - 1) * this.f91750g;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i6 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i7 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ C38857c(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38857c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2018);
        this.f91745b = new ArrayList();
        this.f91746c = new ArrayList();
        this.f91747d = new ArrayList();
        int i2 = -1;
        this.f91748e = -1;
        this.f91749f = new ArrayList();
        this.f91750g = 5;
        this.f91751h = 10;
        if (C0687g.m2442a(Locale.getDefault()) == 1) {
            this.f91748e = this.f91748e == -1 ? 1 : i2;
        }
        MethodCollector.m26664o(2018);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.f91745b.clear();
        this.f91746c.clear();
        this.f91747d.clear();
        this.f91749f.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (true) {
            i5 = 8;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (measuredWidth + i8 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i9++;
                    int i11 = this.f91752i;
                    if (i11 > 0 && i9 > i11) {
                        break;
                    }
                    this.f91746c.add(Integer.valueOf(i10));
                    this.f91745b.add(this.f91749f);
                    this.f91747d.add(Integer.valueOf(i8));
                    this.f91749f = new ArrayList();
                    i10 = measuredHeight;
                    i8 = 0;
                }
                i8 += measuredWidth + this.f91751h;
                i10 = Math.max(i10, measuredHeight);
                this.f91749f.add(childAt);
            }
            i7++;
        }
        this.f91746c.add(Integer.valueOf(i10));
        this.f91747d.add(Integer.valueOf(i8));
        this.f91745b.add(this.f91749f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f91745b.size();
        int i12 = 0;
        while (i12 < size) {
            List<View> list = this.f91745b.get(i12);
            this.f91749f = list;
            int size2 = list.size();
            int intValue = this.f91746c.get(i12).intValue() + this.f91750g;
            int intValue2 = this.f91747d.get(i12).intValue();
            int i13 = this.f91748e;
            if (i13 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i13 == 0) {
                paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
            } else if (i13 == i6) {
                paddingLeft = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                C89070n.m154545e((List) this.f91749f);
            }
            int i14 = 0;
            while (i14 < size2) {
                View view = this.f91749f.get(i14);
                if (view.getVisibility() != i5) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i15 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i16 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i15, i16, i15 + view.getMeasuredWidth(), view.getMeasuredHeight() + i16);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.f91751h;
                }
                i14++;
                i5 = 8;
            }
            paddingTop += intValue;
            i12++;
            i6 = 1;
            i5 = 8;
        }
    }
}
