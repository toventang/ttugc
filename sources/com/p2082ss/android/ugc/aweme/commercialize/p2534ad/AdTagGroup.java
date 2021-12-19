package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup */
public final class AdTagGroup extends ViewGroup {

    /* renamed from: a */
    private final int f88846a;

    static {
        Covode.recordClassIndex(45005);
    }

    public AdTagGroup(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setTagList(String[] strArr) {
        MethodCollector.m26663i(8216);
        C89219l.m154721d(strArr, "");
        removeAllViews();
        for (String str : strArr) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            frameLayout.setPadding(C34728n.m70946a(4.0d), C34728n.m70946a(2.0d), C34728n.m70946a(4.0d), C34728n.m70946a(2.0d));
            Context context = getContext();
            C89219l.m154716b(context, "");
            frameLayout.setBackground(context.getResources().getDrawable(R.drawable.a91));
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setLines(1);
            textView.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView);
            addView(frameLayout);
        }
        MethodCollector.m26664o(8216);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        measureChildren(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            i3 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (i5 != 0) {
                    C89219l.m154716b(childAt, "");
                    int i6 = this.f88846a;
                    if (childAt.getMeasuredWidth() + i3 + i6 >= size) {
                        break;
                    }
                    childAt.layout(i6 + i3, 0, childAt.getMeasuredWidth() + i3 + this.f88846a, childAt.getMeasuredHeight());
                    i3 += this.f88846a;
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    C89219l.m154716b(childAt, "");
                    if (childAt.getMeasuredWidth() >= size) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                }
                i3 += measuredWidth;
            }
        } else if (mode == 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            int childCount2 = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(0);
                C89219l.m154716b(childAt2, "");
                i7 = Math.max(i7, childAt2.getMeasuredHeight());
            }
            i4 = i7;
        } else if (mode2 == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdTagGroup(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8218);
        this.f88846a = C34728n.m70946a(4.0d);
        MethodCollector.m26664o(8218);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdTagGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                i5 = getChildCount() - 1;
                break;
            }
            View childAt = getChildAt(i5);
            if (i5 != 0) {
                C89219l.m154716b(childAt, "");
                int i7 = this.f88846a;
                if (childAt.getMeasuredWidth() + i6 + i7 >= i3) {
                    break;
                }
                childAt.layout(i7 + i6, 0, childAt.getMeasuredWidth() + i6 + this.f88846a, childAt.getMeasuredHeight());
                i6 += this.f88846a;
            } else {
                C89219l.m154716b(childAt, "");
                if (childAt.getMeasuredWidth() >= i3) {
                    break;
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
            i6 += childAt.getMeasuredWidth();
            i5++;
        }
        removeViewsInLayout(i5 + 1, (getChildCount() - i5) - 1);
    }
}
