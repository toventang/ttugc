package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    static {
        Covode.recordClassIndex(396);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        int i8 = 0;
        while (true) {
            i3 = i2;
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.eks) {
                        view = childAt;
                    } else if (id == R.id.a02) {
                        view2 = childAt;
                    } else if ((id == R.id.acx || id == R.id.agz) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i8++;
            } else {
                int mode = View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i3);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i, 0);
                    paddingTop += view.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i4 = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    View view4 = view2;
                    while (true) {
                        i6 = C0792v.m2775i(view4);
                        if (i6 > 0) {
                            break;
                        }
                        if (!(view4 instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) view4;
                        if (viewGroup.getChildCount() != 1) {
                            break;
                        }
                        view4 = viewGroup.getChildAt(0);
                    }
                    i6 = 0;
                    i5 = view2.getMeasuredHeight() - i6;
                    paddingTop += i6;
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i, makeMeasureSpec);
                    i7 = view3.getMeasuredHeight();
                    paddingTop += i7;
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                } else {
                    i7 = 0;
                }
                int i9 = size - paddingTop;
                if (view2 != null) {
                    int i10 = paddingTop - i6;
                    int min = Math.min(i9, i5);
                    if (min > 0) {
                        i9 -= min;
                        i6 += min;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    paddingTop = i10 + view2.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                }
                if (view3 != null && i9 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
                    paddingTop = (paddingTop - i7) + view3.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        i11 = Math.max(i11, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i, i4), View.resolveSizeAndState(paddingTop, i3, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt3 = getChildAt(i13);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayoutCompat.C0352a aVar = (LinearLayoutCompat.C0352a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i14 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                i3 = i3;
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i3, 0);
                                aVar.height = i14;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i3);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i10 = gravity & 112;
        int i11 = gravity & 8388615;
        if (i10 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i10 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i5 = 0;
        } else {
            i5 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.C0352a aVar = (LinearLayoutCompat.C0352a) childAt.getLayoutParams();
                int i13 = aVar.f1367h;
                if (i13 < 0) {
                    i13 = i11;
                }
                int a = C0774e.m2693a(i13, C0792v.m2768e(this)) & 7;
                if (a == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i7 = aVar.rightMargin;
                    i8 = i6 - i7;
                } else if (a != 5) {
                    i8 = aVar.leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = aVar.rightMargin;
                    i8 = i6 - i7;
                }
                if (mo1445a(i12)) {
                    paddingTop += i5;
                }
                int i14 = paddingTop + aVar.topMargin;
                childAt.layout(i8, i14, measuredWidth + i8, i14 + measuredHeight2);
                paddingTop = i14 + measuredHeight2 + aVar.bottomMargin;
            }
        }
    }
}
