package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private int f1351a;

    /* renamed from: b */
    private int f1352b;

    /* renamed from: c */
    private int f1353c;

    /* renamed from: d */
    private int f1354d;

    /* renamed from: e */
    private int f1355e;

    /* renamed from: f */
    public boolean f1356f;

    /* renamed from: g */
    public boolean f1357g;

    /* renamed from: h */
    private float f1358h;

    /* renamed from: i */
    private int[] f1359i;

    /* renamed from: j */
    private int[] f1360j;

    /* renamed from: k */
    private Drawable f1361k;

    /* renamed from: l */
    private int f1362l;

    /* renamed from: m */
    private int f1363m;

    /* renamed from: n */
    private int f1364n;

    /* renamed from: o */
    private int f1365o;

    static {
        Covode.recordClassIndex(409);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1351a;
    }

    public Drawable getDividerDrawable() {
        return this.f1361k;
    }

    public int getDividerPadding() {
        return this.f1365o;
    }

    public int getDividerWidth() {
        return this.f1362l;
    }

    public int getGravity() {
        return this.f1354d;
    }

    public int getOrientation() {
        return this.f1353c;
    }

    public int getShowDividers() {
        return this.f1364n;
    }

    public float getWeightSum() {
        return this.f1358h;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0352a generateDefaultLayoutParams() {
        int i = this.f1353c;
        if (i == 0) {
            return new C0352a(-2, -2);
        }
        if (i == 1) {
            return new C0352a(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        int i;
        if (this.f1351a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1351a;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1352b;
                if (this.f1353c == 1 && (i = this.f1354d & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1355e) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1355e;
                    }
                }
                return i3 + ((C0352a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1351a == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0352a;
    }

    public void setBaselineAligned(boolean z) {
        this.f1356f = z;
    }

    public void setDividerPadding(int i) {
        this.f1365o = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1357g = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public void setWeightSum(float f) {
        this.f1358h = Math.max(0.0f, f);
    }

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    public static class C0352a extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f1366g;

        /* renamed from: h */
        public int f1367h = -1;

        static {
            Covode.recordClassIndex(410);
        }

        public C0352a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0352a(int i, int i2) {
            super(i, i2);
        }

        public C0352a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997, 16843137});
            this.f1366g = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f1367h = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public C0352a generateLayoutParams(AttributeSet attributeSet) {
        return new C0352a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0352a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0352a(layoutParams);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void setOrientation(int i) {
        if (this.f1353c != i) {
            this.f1353c = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1364n) {
            requestLayout();
        }
        this.f1364n = i;
    }

    public void setGravity(int i) {
        if (this.f1354d != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1354d = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1354d;
        if ((8388615 & i3) != i2) {
            this.f1354d = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1354d;
        if ((i3 & 112) != i2) {
            this.f1354d = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1351a = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1361k) {
            this.f1361k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1362l = drawable.getIntrinsicWidth();
                this.f1363m = drawable.getIntrinsicHeight();
            } else {
                this.f1362l = 0;
                this.f1363m = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1445a(int i) {
        if (i == 0) {
            if ((this.f1364n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f1364n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f1364n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.f1361k != null) {
            int i4 = 0;
            if (this.f1353c == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo1445a(i4))) {
                        m1337a(canvas, (childAt.getTop() - ((C0352a) childAt.getLayoutParams()).topMargin) - this.f1363m);
                    }
                    i4++;
                }
                if (mo1445a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f1363m;
                    } else {
                        bottom = childAt2.getBottom() + ((C0352a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    m1337a(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C0415ar.m1540a(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo1445a(i4))) {
                    C0352a aVar = (C0352a) childAt3.getLayoutParams();
                    if (a) {
                        left = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        left = (childAt3.getLeft() - aVar.leftMargin) - this.f1362l;
                    }
                    m1340b(canvas, left);
                }
                i4++;
            }
            if (mo1445a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0352a aVar2 = (C0352a) childAt4.getLayoutParams();
                    if (a) {
                        i = childAt4.getLeft() - aVar2.leftMargin;
                        i2 = this.f1362l;
                        i3 = i - i2;
                    } else {
                        i3 = childAt4.getRight() + aVar2.rightMargin;
                    }
                } else if (a) {
                    i3 = getPaddingLeft();
                } else {
                    i = getWidth() - getPaddingRight();
                    i2 = this.f1362l;
                    i3 = i - i2;
                }
                m1340b(canvas, i3);
            }
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m1336a(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0352a aVar = (C0352a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: b */
    private void m1340b(Canvas canvas, int i) {
        this.f1361k.setBounds(i, getPaddingTop() + this.f1365o, this.f1362l + i, (getHeight() - getPaddingBottom()) - this.f1365o);
        this.f1361k.draw(canvas);
    }

    /* renamed from: a */
    private void m1337a(Canvas canvas, int i) {
        this.f1361k.setBounds(getPaddingLeft() + this.f1365o, i, (getWidth() - getPaddingRight()) - this.f1365o, this.f1363m + i);
        this.f1361k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0214, code lost:
        if (r5 < 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0243, code lost:
        if (r8.width == -1) goto L_0x0245;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fc, code lost:
        if (r15 < 0) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        if (r8[3] != -1) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1339b(int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 1200
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m1339b(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1356f = true;
        this.f1351a = -1;
        this.f1354d = 8388659;
        C0405al a = C0405al.m1466a(context, attributeSet, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, R.attr.rg, R.attr.rp, R.attr.a5c, R.attr.abz}, i, 0);
        int a2 = a.mo1824a(1, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo1824a(0, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo1827a(2, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f1358h = a.mo1823a(4, -1.0f);
        this.f1351a = a.mo1824a(3, -1);
        this.f1357g = a.mo1827a(7, false);
        setDividerDrawable(a.mo1826a(5));
        this.f1364n = a.mo1824a(8, 0);
        this.f1365o = a.mo1834e(6, 0);
        a.f1585a.recycle();
    }

    /* renamed from: a */
    private void m1338a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    private static void m1341b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        if (this.f1353c == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i14 = i3 - i;
            int paddingRight = i14 - getPaddingRight();
            int paddingRight2 = (i14 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i15 = this.f1354d;
            int i16 = i15 & 112;
            int i17 = 8388615 & i15;
            if (i16 == 16) {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f1355e) / 2);
            } else if (i16 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f1355e;
            }
            int i18 = 0;
            while (i18 < virtualChildCount) {
                View childAt = getChildAt(i18);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i13) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0352a aVar = (C0352a) childAt.getLayoutParams();
                    int i19 = aVar.f1367h;
                    if (i19 < 0) {
                        i19 = i17;
                    }
                    int a = C0774e.m2693a(i19, C0792v.m2768e(this)) & 7;
                    if (a == 1) {
                        i10 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + aVar.leftMargin;
                        i11 = aVar.rightMargin;
                        i12 = i10 - i11;
                    } else if (a != 5) {
                        i12 = aVar.leftMargin + paddingLeft2;
                    } else {
                        i10 = paddingRight - measuredWidth;
                        i11 = aVar.rightMargin;
                        i12 = i10 - i11;
                    }
                    if (mo1445a(i18)) {
                        paddingTop += this.f1363m;
                    }
                    int i20 = paddingTop + aVar.topMargin;
                    m1341b(childAt, i12, i20 + 0, measuredWidth, measuredHeight);
                    paddingTop = i20 + measuredHeight + aVar.bottomMargin + 0;
                    i18 += 0;
                }
                i18++;
                i13 = 8;
            }
            return;
        }
        boolean a2 = C0415ar.m1540a(this);
        int paddingTop2 = getPaddingTop();
        int i21 = i4 - i2;
        int paddingBottom = i21 - getPaddingBottom();
        int paddingBottom2 = (i21 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i22 = this.f1354d;
        int i23 = i22 & 112;
        boolean z2 = this.f1356f;
        int[] iArr = this.f1359i;
        int[] iArr2 = this.f1360j;
        int a3 = C0774e.m2693a(8388615 & i22, C0792v.m2768e(this));
        if (a3 == 1) {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1355e) / 2);
        } else if (a3 != 5) {
            paddingLeft = getPaddingLeft();
        } else {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.f1355e;
        }
        if (a2) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i24 = 0;
        while (i24 < virtualChildCount2) {
            int i25 = i5 + (i6 * i24);
            View childAt2 = getChildAt(i25);
            if (childAt2 == null) {
                paddingLeft += 0;
                i7 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0352a aVar2 = (C0352a) childAt2.getLayoutParams();
                    if (!z2 || aVar2.height == -1) {
                        i8 = -1;
                    } else {
                        i8 = childAt2.getBaseline();
                    }
                    int i26 = aVar2.f1367h;
                    if (i26 < 0) {
                        i26 = i23;
                    }
                    int i27 = i26 & 112;
                    if (i27 == 16) {
                        i9 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + aVar2.topMargin) - aVar2.bottomMargin;
                    } else if (i27 == 48) {
                        i9 = aVar2.topMargin + paddingTop2;
                        if (i8 != -1) {
                            i9 += iArr[1] - i8;
                        }
                    } else if (i27 != 80) {
                        i9 = paddingTop2;
                    } else {
                        i9 = (paddingBottom - measuredHeight2) - aVar2.bottomMargin;
                        if (i8 != -1) {
                            i9 -= iArr2[2] - (childAt2.getMeasuredHeight() - i8);
                        }
                    }
                    if (mo1445a(i25)) {
                        paddingLeft += this.f1362l;
                    }
                    int i28 = paddingLeft + aVar2.leftMargin;
                    m1341b(childAt2, i28 + 0, i9, measuredWidth2, measuredHeight2);
                    paddingLeft = i28 + measuredWidth2 + aVar2.rightMargin + 0;
                    i24 += 0;
                }
                i7 = 1;
            }
            i24 += i7;
        }
    }
}
