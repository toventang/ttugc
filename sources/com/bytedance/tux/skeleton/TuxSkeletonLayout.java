package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.p032a.C0641g;
import androidx.core.p037h.C0803x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSkeletonLayout extends AbstractC23237a {

    /* renamed from: d */
    public static final C23235a f55065d = new C23235a((byte) 0);

    /* renamed from: e */
    private int f55066e;

    /* renamed from: f */
    private int f55067f;

    /* renamed from: g */
    private int f55068g;

    /* renamed from: h */
    private int f55069h;

    /* renamed from: i */
    private int f55070i;

    /* renamed from: j */
    private LinearLayout f55071j;

    static {
        Covode.recordClassIndex(27176);
    }

    public TuxSkeletonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.tux.skeleton.TuxSkeletonLayout$a */
    public static final class C23235a {
        static {
            Covode.recordClassIndex(27177);
        }

        private C23235a() {
        }

        public /* synthetic */ C23235a(byte b) {
            this();
        }
    }

    public final int getPreviewItemRes() {
        return this.f55068g;
    }

    public final int getRepeat() {
        return this.f55066e;
    }

    public final int getRepeatOrientation() {
        return this.f55067f;
    }

    public final void setRepeat(int i) {
        if (this.f55066e != i) {
            this.f55066e = i;
            if (mo37841a() && this.f55068g != 0) {
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    private final void m43796a(int i) {
        MethodCollector.m26663i(9091);
        while (this.f55071j.getChildCount() < i) {
            FrameLayout.inflate(getContext(), this.f55068g, this.f55071j);
        }
        while (this.f55071j.getChildCount() > i) {
            this.f55071j.removeViewAt(0);
        }
        MethodCollector.m26664o(9091);
    }

    public final void setRepeatOrientation(int i) {
        MethodCollector.m26663i(8787);
        if (this.f55067f != i) {
            if (mo37841a() && this.f55068g != 0) {
                if (i == 2 || this.f55067f == 2) {
                    this.f55071j.removeAllViews();
                } else {
                    requestLayout();
                }
            }
            this.f55067f = i;
        }
        MethodCollector.m26664o(8787);
    }

    public final void setPreviewItemRes(int i) {
        MethodCollector.m26663i(8929);
        if (this.f55068g != i) {
            this.f55068g = i;
            this.f55071j.removeAllViews();
            FrameLayout.inflate(getContext(), this.f55068g, this.f55071j);
            this.f55071j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f55069h = this.f55071j.getMeasuredWidth();
            this.f55070i = this.f55071j.getMeasuredHeight();
            this.f55071j.removeAllViews();
        }
        MethodCollector.m26664o(8929);
    }

    /* renamed from: a */
    private static int m43795a(int i, int i2) {
        int i3;
        int i4 = i / i2;
        if (i % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        return i4 + i3;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        if (this.f55068g != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!mo37841a() || !z) {
            Iterator<View> a = C0803x.m2810a(this).mo2926a();
            while (a.hasNext()) {
                a.next().setVisibility(0);
            }
            this.f55071j.setVisibility(8);
        } else {
            Iterator<View> a2 = C0803x.m2810a(this).mo2926a();
            while (a2.hasNext()) {
                a2.next().setVisibility(8);
            }
            this.f55071j.setVisibility(0);
            LinearLayout linearLayout = this.f55071j;
            int i4 = this.f55067f;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    i3 = 1;
                } else {
                    throw new IllegalStateException("wrong repeatOrientation");
                }
            }
            linearLayout.setOrientation(i3);
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
            if (this.f55067f == 2) {
                m43797a(this.f55066e, size, size2);
            } else {
                int i5 = this.f55066e;
                if (i5 > 0) {
                    m43796a(i5);
                } else if (this.f55071j.getOrientation() == 0) {
                    if (size == 0) {
                        m43796a(1);
                    } else {
                        m43796a(m43795a(size, this.f55069h));
                    }
                } else if (size2 == 0) {
                    m43796a(1);
                } else {
                    m43796a(m43795a(size2, this.f55070i));
                }
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxSkeletonLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSkeletonLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9232);
        this.f55069h = Integer.MAX_VALUE;
        this.f55070i = Integer.MAX_VALUE;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f55071j = linearLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqr, R.attr.aqu, R.attr.aqx, R.attr.aqy}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setLoading(C0641g.m2355a(obtainStyledAttributes));
        }
        setPreviewItemRes(obtainStyledAttributes.getResourceId(1, 0));
        setRepeat(obtainStyledAttributes.getInt(2, 0));
        setRepeatOrientation(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
        addView(this.f55071j, new ViewGroup.MarginLayoutParams(-1, -1));
        MethodCollector.m26664o(9232);
    }

    /* renamed from: a */
    private final void m43797a(int i, int i2, int i3) {
        int a;
        int a2;
        int i4;
        MethodCollector.m26663i(9230);
        int i5 = 1;
        if (i2 == 0) {
            a = 1;
        } else {
            a = m43795a(i2, this.f55069h);
        }
        if (i3 == 0) {
            a2 = 1;
        } else {
            a2 = m43795a(i3, this.f55070i);
        }
        if (i <= 0) {
            i = a * a2;
        }
        int i6 = i / a;
        int i7 = i % a;
        if (i7 != 0) {
            i5 = 0;
        }
        int i8 = i6 - i5;
        if (i7 == 0) {
            i7 = a;
        }
        while (true) {
            i4 = i8 + 1;
            if (this.f55071j.getChildCount() >= i4) {
                break;
            }
            LinearLayout linearLayout = this.f55071j;
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(context, (AttributeSet) null, 6);
            tuxSkeletonLayout.setRepeatOrientation(0);
            tuxSkeletonLayout.setPreviewItemRes(this.f55068g);
            linearLayout.addView(tuxSkeletonLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        while (this.f55071j.getChildCount() > i4) {
            this.f55071j.removeViewAt(0);
        }
        for (int i9 = 0; i9 < i8; i9++) {
            View childAt = this.f55071j.getChildAt(i9);
            if (childAt != null) {
                ((TuxSkeletonLayout) childAt).setRepeat(a);
            } else {
                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(9230);
                throw wVar;
            }
        }
        View childAt2 = this.f55071j.getChildAt(i8);
        if (childAt2 != null) {
            ((TuxSkeletonLayout) childAt2).setRepeat(i7);
            this.f55071j.requestLayout();
            MethodCollector.m26664o(9230);
            return;
        }
        C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
        MethodCollector.m26664o(9230);
        throw wVar2;
    }
}
