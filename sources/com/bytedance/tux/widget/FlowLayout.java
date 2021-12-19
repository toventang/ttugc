package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class FlowLayout extends ViewGroup {

    /* renamed from: b */
    public static final C23406a f55474b = new C23406a((byte) 0);

    /* renamed from: a */
    public boolean f55475a;

    /* renamed from: c */
    private final List<List<View>> f55476c;

    /* renamed from: d */
    private final List<Integer> f55477d;

    /* renamed from: e */
    private final List<Integer> f55478e;

    /* renamed from: f */
    private List<View> f55479f;

    /* renamed from: g */
    private final List<View> f55480g;

    /* renamed from: h */
    private int f55481h;

    /* renamed from: i */
    private int f55482i;

    /* renamed from: j */
    private int f55483j;

    /* renamed from: k */
    private boolean f55484k;

    /* renamed from: l */
    private boolean f55485l;

    /* renamed from: m */
    private View f55486m;

    /* renamed from: n */
    private boolean f55487n;

    static {
        Covode.recordClassIndex(27362);
    }

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.tux.widget.FlowLayout$a */
    public static final class C23406a {
        static {
            Covode.recordClassIndex(27363);
        }

        private C23406a() {
        }

        public /* synthetic */ C23406a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final void setGravity(int i) {
        this.f55481h = i;
        invalidate();
    }

    public final void setMaxTagLines(int i) {
        this.f55483j = i;
        requestLayout();
    }

    public final void setShowEndItem(boolean z) {
        this.f55484k = z;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setShowMore(boolean z) {
        if (this.f55475a != z) {
            this.f55475a = z;
            requestLayout();
        }
    }

    private final void setUpLineInfo(boolean z) {
        int size;
        boolean z2 = z;
        while (true) {
            this.f55476c.clear();
            this.f55477d.clear();
            this.f55478e.clear();
            this.f55479f.clear();
            int measuredWidth = getMeasuredWidth();
            int childCount = getChildCount();
            this.f55487n = z2;
            int i = 0;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                C89219l.m154709a((Object) childAt, "");
                if (!(childAt.getVisibility() == 8 || childAt == this.f55486m)) {
                    int i5 = this.f55482i;
                    if (1 <= i5 && i >= i5) {
                        break;
                    }
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (measuredWidth2 + i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                            i3++;
                            int i6 = this.f55483j;
                            if (1 <= i6 && i3 > i6) {
                                View view = this.f55486m;
                                if (!z2 || view == null) {
                                    this.f55487n = true;
                                } else {
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        i2 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                                        i4 = Math.max(i4, view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                                        this.f55479f.add(view);
                                        if (i2 > (measuredWidth - getPaddingLeft()) - getPaddingRight() && (size = this.f55479f.size()) > 1) {
                                            int i7 = size - 2;
                                            View view2 = this.f55479f.get(i7);
                                            if (view2 != null) {
                                                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                                if (layoutParams3 != null) {
                                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                                    i2 -= (view2.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
                                                } else {
                                                    throw new C89388w("null cannot be cast to non-null type");
                                                }
                                            }
                                            this.f55479f.remove(i7);
                                        }
                                    } else {
                                        throw new C89388w("null cannot be cast to non-null type");
                                    }
                                }
                            } else {
                                this.f55477d.add(Integer.valueOf(i4));
                                this.f55476c.add(this.f55479f);
                                this.f55478e.add(Integer.valueOf(i2));
                                i4 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                                this.f55479f = new ArrayList();
                                if (z2 && i3 == this.f55483j && this.f55486m != null) {
                                    int width = getWidth();
                                    View view3 = this.f55486m;
                                    if (view3 == null) {
                                        C89219l.m154707a();
                                    }
                                    measuredWidth = width - view3.getMeasuredWidth();
                                }
                                i2 = 0;
                            }
                        }
                        i2 += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                        i4 = Math.max(i4, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                        this.f55479f.add(childAt);
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                i++;
            }
            this.f55477d.add(Integer.valueOf(i4));
            this.f55478e.add(Integer.valueOf(i2));
            this.f55476c.add(this.f55479f);
            if (!z2 && this.f55475a && this.f55487n && this.f55486m != null) {
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C89219l.m154709a((Object) childAt, "");
            if (childAt.getVisibility() != 8 && childAt != this.f55486m) {
                int i9 = this.f55482i;
                if (1 <= i9 && i3 >= i9) {
                    i4 = Math.max(i6, i4);
                    i5 += i7;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i2);
                    int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    int i10 = i6 + measuredWidth;
                    if (i10 > (size - getPaddingLeft()) - getPaddingRight()) {
                        i8++;
                        int i11 = this.f55483j;
                        if (1 <= i11 && i8 > i11) {
                            i4 = Math.max(i6, i4);
                            i5 += i7;
                            break;
                        }
                        i4 = Math.max(i4, i6);
                        i5 += i7;
                        i6 = measuredWidth;
                        i7 = measuredHeight;
                    } else {
                        i7 = Math.max(i7, measuredHeight);
                        i6 = i10;
                    }
                    if (i3 == childCount - 1) {
                        i4 = Math.max(i6, i4);
                        i5 += i7;
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i3 == childCount - 1) {
                i4 = Math.max(i6, i4);
                i5 += i7;
            }
            i3++;
        }
        View view = this.f55486m;
        if (view != null) {
            measureChild(view, i, i2);
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i4 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i5 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlowLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(7021);
        this.f55476c = new ArrayList();
        this.f55477d = new ArrayList();
        this.f55478e = new ArrayList();
        this.f55479f = new ArrayList();
        this.f55480g = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.u_, R.attr.ua, R.attr.ub, R.attr.uc, R.attr.ud, R.attr.y3, R.attr.a2g});
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f55481h = obtainStyledAttributes.getInt(0, 0);
        this.f55482i = obtainStyledAttributes.getInt(1, -1);
        this.f55483j = obtainStyledAttributes.getInt(2, -1);
        this.f55484k = obtainStyledAttributes.getBoolean(3, false);
        this.f55485l = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(7021);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f55476c.size();
        this.f55480g.clear();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.f55483j;
            int i7 = 1;
            if (1 <= i6 && i5 >= i6) {
                break;
            }
            this.f55479f = this.f55476c.get(i5);
            int intValue = this.f55477d.get(i5).intValue();
            int intValue2 = this.f55478e.get(i5).intValue();
            int i8 = this.f55481h;
            if (C23163i.m43664a(this)) {
                i8 = this.f55481h * -1;
            }
            if (i8 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i8 == 0) {
                paddingLeft = ((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - intValue2) / 2) + getPaddingLeft();
            } else if (i8 == 1) {
                int i9 = measuredWidth - intValue2;
                if (C23163i.m43664a(this)) {
                    paddingRight = getPaddingLeft();
                } else {
                    paddingRight = getPaddingRight();
                }
                paddingLeft = i9 - paddingRight;
            }
            int size2 = this.f55479f.size();
            int i10 = 0;
            while (i10 < size2) {
                if (C23163i.m43664a(this)) {
                    List<View> list = this.f55479f;
                    view = list.get((list.size() - i10) - i7);
                } else {
                    view = this.f55479f.get(i10);
                }
                if (!(view == null || view.getVisibility() == 8)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i11 = marginLayoutParams.leftMargin + paddingLeft;
                        int i12 = marginLayoutParams.topMargin + paddingTop;
                        int measuredWidth2 = view.getMeasuredWidth() + i11;
                        if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                            measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                        }
                        view.layout(i11, i12, measuredWidth2, view.getMeasuredHeight() + i12);
                        this.f55480g.add(view);
                        paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                i10++;
                i7 = 1;
            }
            paddingTop += intValue;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C89219l.m154709a((Object) childAt, "");
            if (!this.f55480g.contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
