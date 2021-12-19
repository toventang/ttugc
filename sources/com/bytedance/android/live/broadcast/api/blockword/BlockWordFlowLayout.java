package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.api.blockword.model.C3043a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class BlockWordFlowLayout extends ViewGroup {

    /* renamed from: a */
    public View f8829a;

    /* renamed from: b */
    public boolean f8830b = true;

    /* renamed from: c */
    boolean f8831c;

    /* renamed from: d */
    public AbstractC89172b<? super C3043a, C89391z> f8832d;

    /* renamed from: e */
    private final int f8833e = C3966y.m9653a(8.0f);

    /* renamed from: f */
    private final int f8834f = C3966y.m9653a(8.0f);

    /* renamed from: g */
    private final List<List<View>> f8835g = new ArrayList();

    /* renamed from: h */
    private ArrayList<Integer> f8836h = new ArrayList<>();

    /* renamed from: i */
    private boolean f8837i;

    /* renamed from: j */
    private int f8838j;

    /* renamed from: k */
    private final boolean f8839k = C3966y.m9672g();

    /* renamed from: l */
    private HashMap f8840l;

    static {
        Covode.recordClassIndex(3499);
    }

    public final int getSize() {
        return getChildCount() - 1;
    }

    public final void setDeleteListener(AbstractC89172b<? super C3043a, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f8832d = bVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.BlockWordFlowLayout$a */
    static final class View$OnClickListenerC3026a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockWordFlowLayout f8842a;

        /* renamed from: b */
        final /* synthetic */ C3043a f8843b;

        static {
            Covode.recordClassIndex(3501);
        }

        View$OnClickListenerC3026a(BlockWordFlowLayout blockWordFlowLayout, C3043a aVar) {
            this.f8842a = blockWordFlowLayout;
            this.f8843b = aVar;
        }

        public final void onClick(View view) {
            AbstractC89172b<? super C3043a, C89391z> bVar = this.f8842a.f8832d;
            if (bVar != null) {
                bVar.invoke(this.f8843b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockWordFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6210);
        View a = C11279p.m20000a((ViewGroup) this, (int) R.layout.b4o, false);
        this.f8829a = a;
        ((ImageView) a.findViewById(R.id.bh1)).setImageResource(R.drawable.c5d);
        this.f8829a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.broadcast.api.blockword.BlockWordFlowLayout.View$OnClickListenerC30251 */

            /* renamed from: a */
            final /* synthetic */ BlockWordFlowLayout f8841a;

            static {
                Covode.recordClassIndex(3500);
            }

            {
                this.f8841a = r1;
            }

            public final void onClick(View view) {
                int i;
                BlockWordFlowLayout blockWordFlowLayout = this.f8841a;
                blockWordFlowLayout.f8830b = !blockWordFlowLayout.f8830b;
                ImageView imageView = (ImageView) this.f8841a.f8829a.findViewById(R.id.bh1);
                if (this.f8841a.f8830b) {
                    i = R.drawable.c5d;
                } else {
                    i = R.drawable.c5e;
                }
                imageView.setImageResource(i);
                this.f8841a.requestLayout();
            }
        });
        addView(this.f8829a);
        MethodCollector.m26664o(6210);
    }

    /* renamed from: a */
    public final void mo8241a(C3043a aVar, int i) {
        C89219l.m154721d(aVar, "");
        this.f8831c = false;
        if (this.f8840l == null) {
            this.f8840l = new HashMap();
        }
        View view = (View) this.f8840l.get(Integer.valueOf((int) R.id.b65));
        if (view == null) {
            view = findViewById(R.id.b65);
            this.f8840l.put(Integer.valueOf((int) R.id.b65), view);
        }
        BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) view;
        C89219l.m154716b(blockWordFlowLayout, "");
        View a = C11279p.m20000a((ViewGroup) blockWordFlowLayout, (int) R.layout.b9j, false);
        ((LinearLayout) a.findViewById(R.id.t7)).setOnClickListener(new View$OnClickListenerC3026a(this, aVar));
        LiveTextView liveTextView = (LiveTextView) a.findViewById(R.id.t6);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(aVar.f8884b);
        addView(a, i);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f8835g.clear();
        this.f8836h.clear();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList = new ArrayList();
        this.f8837i = false;
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft + paddingRight, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingBottom, layoutParams.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.f8830b) {
                    if (this.f8837i) {
                        break;
                    } else if (measuredWidth + i4 + this.f8833e > size) {
                        this.f8837i = true;
                        int max = Math.max(i3 - 1, 0);
                        int i8 = 0;
                        while (true) {
                            if (max < 0) {
                                break;
                            }
                            View childAt2 = getChildAt(max);
                            C89219l.m154716b(childAt2, "");
                            i8 += childAt2.getMeasuredWidth() + this.f8833e;
                            if (i8 > C3966y.m9653a(31.0f) + this.f8833e) {
                                this.f8838j = max;
                                this.f8835g.add(arrayList);
                                break;
                            }
                            max--;
                        }
                        i7 += i5 + this.f8834f;
                    }
                }
                if (measuredWidth + i4 + this.f8833e > size) {
                    this.f8835g.add(arrayList);
                    this.f8836h.add(Integer.valueOf(i5));
                    i7 += i5 + this.f8834f;
                    i6 = Math.max(i6, i4 + this.f8833e);
                    arrayList = new ArrayList();
                    i4 = 0;
                    i5 = 0;
                }
                if (!this.f8830b) {
                    arrayList.add(childAt);
                } else if (!C89219l.m154714a(childAt, this.f8829a)) {
                    arrayList.add(childAt);
                }
                i4 += measuredWidth + this.f8833e;
                i5 = Math.max(i5, measuredHeight);
                if (i3 == getChildCount() - 1) {
                    this.f8835g.add(arrayList);
                    this.f8836h.add(Integer.valueOf(i5));
                    i7 += this.f8834f + i5;
                    i6 = Math.max(i6, this.f8833e + i4);
                }
            }
            i3++;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = i6;
        }
        if (mode2 != 1073741824) {
            size2 = i7;
        }
        int max2 = Math.max(size2, 102);
        if (getChildCount() == 1 && C89219l.m154714a(getChildAt(0), this.f8829a)) {
            max2 = 0;
        }
        setMeasuredDimension(size, max2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f8830b || !this.f8837i) {
            if (this.f8839k) {
                int size = this.f8835g.size();
                int measuredWidth = getMeasuredWidth() - getPaddingRight();
                int paddingTop = getPaddingTop();
                for (int i5 = 0; i5 < size; i5++) {
                    Integer num = this.f8836h.get(i5);
                    C89219l.m154716b(num, "");
                    int intValue = num.intValue();
                    for (T t : this.f8835g.get(i5)) {
                        int measuredWidth2 = measuredWidth - t.getMeasuredWidth();
                        t.layout(measuredWidth2, paddingTop, measuredWidth, t.getMeasuredHeight() + paddingTop);
                        measuredWidth = measuredWidth2 - this.f8833e;
                    }
                    paddingTop += intValue + this.f8834f;
                    measuredWidth = getMeasuredWidth() - getPaddingRight();
                }
                return;
            }
            int size2 = this.f8835g.size();
            int paddingLeft = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            for (int i6 = 0; i6 < size2; i6++) {
                Integer num2 = this.f8836h.get(i6);
                C89219l.m154716b(num2, "");
                int intValue2 = num2.intValue();
                for (T t2 : this.f8835g.get(i6)) {
                    int measuredWidth3 = t2.getMeasuredWidth() + paddingLeft;
                    t2.layout(paddingLeft, paddingTop2, measuredWidth3, t2.getMeasuredHeight() + paddingTop2);
                    paddingLeft = this.f8833e + measuredWidth3;
                }
                paddingTop2 += intValue2 + this.f8834f;
                paddingLeft = getPaddingLeft();
            }
            if (size2 == 1 && this.f8831c) {
                this.f8829a.layout(0, 0, 0, 0);
            }
        } else if (this.f8839k) {
            int measuredWidth4 = getMeasuredWidth() - getPaddingRight();
            int paddingTop3 = getPaddingTop();
            if (getChildCount() != 1) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (i7 < this.f8838j) {
                        C89219l.m154716b(childAt, "");
                        int measuredWidth5 = measuredWidth4 - childAt.getMeasuredWidth();
                        childAt.layout(measuredWidth5, paddingTop3, measuredWidth4, childAt.getMeasuredHeight() + paddingTop3);
                        measuredWidth4 = measuredWidth5 - this.f8833e;
                    } else if (!C89219l.m154714a(childAt, this.f8829a)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                }
                if (this.f8838j != getChildCount() - 1 || this.f8838j == 0) {
                    this.f8829a.layout(measuredWidth4 - this.f8829a.getMeasuredWidth(), paddingTop3, measuredWidth4, this.f8829a.getMeasuredHeight() + paddingTop3);
                    return;
                }
                this.f8829a.layout(0, 0, 0, 0);
            }
        } else {
            int paddingLeft2 = getPaddingLeft();
            int paddingTop4 = getPaddingTop();
            if (getChildCount() != 1) {
                int childCount2 = getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt2 = getChildAt(i8);
                    if (i8 < this.f8838j) {
                        C89219l.m154716b(childAt2, "");
                        int measuredWidth6 = childAt2.getMeasuredWidth() + paddingLeft2;
                        childAt2.layout(paddingLeft2, paddingTop4, measuredWidth6, childAt2.getMeasuredHeight() + paddingTop4);
                        paddingLeft2 = measuredWidth6 + this.f8833e;
                    } else if (!C89219l.m154714a(childAt2, this.f8829a)) {
                        childAt2.layout(0, 0, 0, 0);
                    }
                }
                if (this.f8838j != getChildCount() - 1 || this.f8838j == 0) {
                    this.f8829a.layout(paddingLeft2, paddingTop4, this.f8829a.getMeasuredWidth() + paddingLeft2, this.f8829a.getMeasuredHeight() + paddingTop4);
                    return;
                }
                this.f8829a.layout(0, 0, 0, 0);
            }
        }
    }
}
