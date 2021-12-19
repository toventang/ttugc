package com.p2082ss.android.ugc.aweme.comment.barrage.view;

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
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AnchorsFlowLayout */
public final class AnchorsFlowLayout extends ViewGroup {

    /* renamed from: b */
    public static final C36351a f85945b = new C36351a((byte) 0);

    /* renamed from: a */
    public boolean f85946a;

    /* renamed from: c */
    private final List<List<View>> f85947c;

    /* renamed from: d */
    private final List<Integer> f85948d;

    /* renamed from: e */
    private final List<Integer> f85949e;

    /* renamed from: f */
    private List<View> f85950f;

    /* renamed from: g */
    private final List<View> f85951g;

    /* renamed from: h */
    private int f85952h;

    /* renamed from: i */
    private int f85953i;

    /* renamed from: j */
    private int f85954j;

    /* renamed from: k */
    private boolean f85955k;

    /* renamed from: l */
    private boolean f85956l;

    /* renamed from: m */
    private View f85957m;

    /* renamed from: n */
    private boolean f85958n;

    /* renamed from: o */
    private int f85959o;

    /* renamed from: p */
    private int f85960p;

    static {
        Covode.recordClassIndex(43635);
    }

    public AnchorsFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AnchorsFlowLayout$a */
    public static final class C36351a {
        static {
            Covode.recordClassIndex(43636);
        }

        private C36351a() {
        }

        public /* synthetic */ C36351a(byte b) {
            this();
        }
    }

    public final int getFinalLines() {
        return this.f85959o;
    }

    public final int getFirstLineCount() {
        return this.f85960p;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final void setFinalLines(int i) {
        this.f85959o = i;
    }

    public final void setFirstLineCount(int i) {
        this.f85960p = i;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final void setGravity(int i) {
        this.f85952h = i;
        invalidate();
    }

    public final void setMaxTagLines(int i) {
        this.f85954j = i;
        requestLayout();
    }

    public final void setShowEndItem(boolean z) {
        this.f85955k = z;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setShowMore(boolean z) {
        if (this.f85946a != z) {
            this.f85946a = z;
            requestLayout();
        }
    }

    private final void setUpLineInfo(boolean z) {
        int size;
        boolean z2 = z;
        while (true) {
            this.f85947c.clear();
            this.f85948d.clear();
            this.f85949e.clear();
            this.f85950f.clear();
            int measuredWidth = getMeasuredWidth();
            int childCount = getChildCount();
            this.f85958n = z2;
            int i = 0;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                C89219l.m154716b(childAt, "");
                if (!(childAt.getVisibility() == 8 || childAt == this.f85957m)) {
                    int i5 = this.f85953i;
                    if (1 <= i5 && i >= i5) {
                        break;
                    }
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredWidth2 + i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                        i3++;
                        int i6 = this.f85954j;
                        if (1 <= i6 && i3 > i6) {
                            View view = this.f85957m;
                            if (!z2 || view == null) {
                                this.f85958n = true;
                            } else {
                                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                i2 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                                i4 = Math.max(i4, view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                                this.f85950f.add(view);
                                if (i2 > (measuredWidth - getPaddingLeft()) - getPaddingRight() && (size = this.f85950f.size()) > 1) {
                                    int i7 = size - 2;
                                    View view2 = this.f85950f.get(i7);
                                    if (view2 != null) {
                                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                        i2 -= (view2.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
                                    }
                                    this.f85950f.remove(i7);
                                }
                            }
                        } else {
                            this.f85948d.add(Integer.valueOf(i4));
                            this.f85947c.add(this.f85950f);
                            this.f85949e.add(Integer.valueOf(i2));
                            i4 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                            this.f85950f = new ArrayList();
                            if (z2 && i3 == this.f85954j && this.f85957m != null) {
                                int width = getWidth();
                                View view3 = this.f85957m;
                                if (view3 == null) {
                                    C89219l.m154715b();
                                }
                                measuredWidth = width - view3.getMeasuredWidth();
                            }
                            i2 = 0;
                        }
                    }
                    i2 += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i4 = Math.max(i4, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                    this.f85950f.add(childAt);
                }
                i++;
            }
            this.f85948d.add(Integer.valueOf(i4));
            this.f85949e.add(Integer.valueOf(i2));
            this.f85947c.add(this.f85950f);
            if (!z2 && this.f85946a && this.f85958n && this.f85957m != null) {
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
        int i3 = i2;
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8 && childAt != this.f85957m) {
                int i11 = this.f85953i;
                if (1 <= i11 && i4 >= i11) {
                    i5 = Math.max(i7, i5);
                    i6 += i8;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i3 = i3;
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i3);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i12 = i7 + measuredWidth;
                if (i12 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i9++;
                    this.f85959o = i9;
                    int i13 = this.f85954j;
                    if (1 <= i13 && i9 > i13) {
                        i5 = Math.max(i7, i5);
                        i6 += i8;
                        break;
                    }
                    i5 = Math.max(i5, i7);
                    i6 += i8;
                    i7 = measuredWidth;
                    i8 = measuredHeight;
                } else {
                    if (i9 == 1) {
                        i10++;
                        this.f85960p = i10;
                    }
                    i8 = Math.max(i8, measuredHeight);
                    i7 = i12;
                }
                if (i4 == childCount - 1) {
                    i5 = Math.max(i7, i5);
                    i6 += i8;
                }
            } else if (i4 == childCount - 1) {
                i5 = Math.max(i7, i5);
                i6 += i8;
            }
            i4++;
        }
        View view = this.f85957m;
        if (view != null) {
            measureChild(view, i, i3);
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i5 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i6 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ AnchorsFlowLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AnchorsFlowLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11593);
        this.f85947c = new ArrayList();
        this.f85948d = new ArrayList();
        this.f85949e = new ArrayList();
        this.f85950f = new ArrayList();
        this.f85951g = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.u_, R.attr.ua, R.attr.ub, R.attr.uc, R.attr.ud, R.attr.y3, R.attr.a2g});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f85952h = obtainStyledAttributes.getInt(0, 0);
        this.f85953i = obtainStyledAttributes.getInt(1, -1);
        this.f85954j = obtainStyledAttributes.getInt(2, -1);
        this.f85955k = obtainStyledAttributes.getBoolean(3, false);
        this.f85956l = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11593);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f85947c.size();
        this.f85951g.clear();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.f85954j;
            int i7 = 1;
            if (1 <= i6 && i5 >= i6) {
                break;
            }
            this.f85950f = this.f85947c.get(i5);
            int intValue = this.f85948d.get(i5).intValue();
            int intValue2 = this.f85949e.get(i5).intValue();
            int i8 = this.f85952h;
            if (C23163i.m43664a(this)) {
                i8 = this.f85952h * -1;
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
            int size2 = this.f85950f.size();
            int i10 = 0;
            while (i10 < size2) {
                if (C23163i.m43664a(this)) {
                    List<View> list = this.f85950f;
                    view = list.get((list.size() - i10) - i7);
                } else {
                    view = this.f85950f.get(i10);
                }
                if (!(view == null || view.getVisibility() == 8)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i11 = marginLayoutParams.leftMargin + paddingLeft;
                    int i12 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth2 = view.getMeasuredWidth() + i11;
                    if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                        measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                    }
                    view.layout(i11, i12, measuredWidth2, view.getMeasuredHeight() + i12);
                    this.f85951g.add(view);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                i10++;
                i7 = 1;
            }
            paddingTop += intValue;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C89219l.m154716b(childAt, "");
            if (!this.f85951g.contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
