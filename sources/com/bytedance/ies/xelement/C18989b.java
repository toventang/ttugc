package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.p037h.AbstractC0781k;
import androidx.core.p037h.AbstractC0785o;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.C89376n;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.b */
public final class C18989b extends FrameLayout implements AbstractC0781k, AbstractC0785o {

    /* renamed from: a */
    public static final C18990a f44952a = new C18990a((byte) 0);

    /* renamed from: b */
    private EnumC18992c f44953b;

    /* renamed from: c */
    private boolean f44954c;

    /* renamed from: d */
    private final C0787q f44955d;

    /* renamed from: e */
    private final C0783m f44956e;

    /* renamed from: f */
    private int f44957f;

    /* renamed from: g */
    private boolean f44958g;

    /* renamed from: h */
    private OverScroller f44959h;

    /* renamed from: i */
    private View f44960i;

    /* renamed from: j */
    private View f44961j;

    /* renamed from: k */
    private AbstractC18991b f44962k;

    /* renamed from: com.bytedance.ies.xelement.b$b */
    public interface AbstractC18991b {
        static {
            Covode.recordClassIndex(21740);
        }

        /* renamed from: a */
        void mo29984a();
    }

    /* renamed from: com.bytedance.ies.xelement.b$c */
    public enum EnumC18992c {
        VERTICAL_TOP,
        VERTICAL_BOTTOM,
        HORIZONTAL_LEFT,
        HORIZONTAL_RIGHT;

        static {
            Covode.recordClassIndex(21741);
        }
    }

    static {
        Covode.recordClassIndex(21738);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C89219l.m154719c(view, "");
        return false;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedPreFling(View view, float f, float f2) {
        C89219l.m154719c(view, "");
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.b$a */
    public static final class C18990a {
        static {
            Covode.recordClassIndex(21739);
        }

        private C18990a() {
        }

        public /* synthetic */ C18990a(byte b) {
            this();
        }
    }

    public final View getMBounceView() {
        return this.f44961j;
    }

    public final View getMContentView() {
        return this.f44960i;
    }

    public final boolean getMEnableBounce() {
        return this.f44954c;
    }

    public final EnumC18992c getMScrollDirection() {
        return this.f44953b;
    }

    public final int getNestedScrollAxes() {
        return this.f44955d.mo2913a();
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public final boolean isNestedScrollingEnabled() {
        return this.f44956e.f2940a;
    }

    public final void computeScroll() {
        if (this.f44959h.computeScrollOffset()) {
            scrollTo(this.f44959h.getCurrX(), this.f44959h.getCurrY());
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (this.f44953b != EnumC18992c.HORIZONTAL_RIGHT || this.f44953b != EnumC18992c.HORIZONTAL_LEFT) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C89219l.m154709a((Object) childAt, "");
                i += childAt.getWidth();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final int computeVerticalScrollRange() {
        if (this.f44953b != EnumC18992c.VERTICAL_BOTTOM || this.f44953b != EnumC18992c.VERTICAL_TOP) {
            return super.computeVerticalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C89219l.m154709a((Object) childAt, "");
                i += childAt.getHeight();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final void setMEnableBounce(boolean z) {
        this.f44954c = z;
    }

    public final void setOnScrollToEndListener(AbstractC18991b bVar) {
        this.f44962k = bVar;
    }

    @Override // androidx.core.p037h.AbstractC0781k
    /* renamed from: a */
    public final void mo2900a(int i) {
        this.f44956e.mo2910b(i);
    }

    public final void setMScrollDirection(EnumC18992c cVar) {
        C89219l.m154719c(cVar, "");
        this.f44953b = cVar;
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f44956e.mo2902a(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18989b(Context context) {
        this(context, (byte) 0);
        C89219l.m154719c(context, "");
    }

    public final void setMBounceView(View view) {
        View view2 = this.f44961j;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            addView(view);
        }
        this.f44961j = view;
    }

    public final void setMContentView(View view) {
        View view2 = this.f44960i;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            addView(view, -1, -1);
        }
        this.f44960i = view;
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f44956e.mo2903a(f, f2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C18989b(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154719c(context, "");
    }

    /* renamed from: a */
    private final void m35260a(int i, int i2) {
        this.f44959h.startScroll(getScrollX(), getScrollY(), i, i2);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C18989b(Context context, char c) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(7111);
        this.f44953b = EnumC18992c.HORIZONTAL_RIGHT;
        this.f44955d = new C0787q();
        this.f44956e = new C0783m(this);
        this.f44959h = new OverScroller(context);
        MethodCollector.m26664o(7111);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        MethodCollector.m26663i(6786);
        super.onMeasure(i, i2);
        View view = this.f44961j;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i4 = C19053c.f45141a[this.f44953b.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin;
                    i3 = marginLayoutParams.bottomMargin;
                } else if (i4 == 3 || i4 == 4) {
                    measuredHeight = view.getMeasuredWidth() + marginLayoutParams.rightMargin;
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    C89376n nVar = new C89376n();
                    MethodCollector.m26664o(6786);
                    throw nVar;
                }
                this.f44957f = measuredHeight + i3;
                MethodCollector.m26664o(6786);
                return;
            }
            C89388w wVar = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(6786);
            throw wVar;
        }
        MethodCollector.m26664o(6786);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2476b(View view, int i) {
        AbstractC18991b bVar;
        AbstractC18991b bVar2;
        AbstractC18991b bVar3;
        AbstractC18991b bVar4;
        C89219l.m154719c(view, "");
        this.f44955d.mo2914a(i);
        if (i != 1) {
            int i2 = C19053c.f45146f[this.f44953b.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && getScrollY() < 0) {
                            double abs = (double) Math.abs(getScrollY());
                            double d = (double) this.f44957f;
                            Double.isNaN(d);
                            if (abs > d * 0.88d && (bVar4 = this.f44962k) != null) {
                                bVar4.mo29984a();
                            }
                            m35260a(0, -getScrollY());
                        }
                    } else if (getScrollY() > 0) {
                        double scrollY = (double) getScrollY();
                        double d2 = (double) this.f44957f;
                        Double.isNaN(d2);
                        if (scrollY > d2 * 0.88d && (bVar3 = this.f44962k) != null) {
                            bVar3.mo29984a();
                        }
                        m35260a(0, -getScrollY());
                    }
                } else if (getScrollX() < 0) {
                    double abs2 = (double) Math.abs(getScrollX());
                    double d3 = (double) this.f44957f;
                    Double.isNaN(d3);
                    if (abs2 > d3 * 0.88d && (bVar2 = this.f44962k) != null) {
                        bVar2.mo29984a();
                    }
                    m35260a(-getScrollX(), 0);
                }
            } else if (getScrollX() > 0) {
                double scrollX = (double) getScrollX();
                double d4 = (double) this.f44957f;
                Double.isNaN(d4);
                if (scrollX > d4 * 0.88d && (bVar = this.f44962k) != null) {
                    bVar.mo29984a();
                }
                m35260a(-getScrollX(), 0);
            }
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f44956e.mo2904a(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2477b(View view, View view2, int i, int i2) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        this.f44955d.mo2915a(i, i2);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final boolean mo2474a(View view, View view2, int i, int i2) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        if (!this.f44954c) {
            return false;
        }
        int i3 = C19053c.f45143c[this.f44953b.ordinal()];
        if (i3 == 1 || i3 == 2) {
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i3 != 3 && i3 != 4) {
            throw new C89376n();
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        MethodCollector.m26663i(6936);
        super.onLayout(z, getLeft(), getTop(), getRight(), getBottom());
        View view = this.f44961j;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i5 = C19053c.f45142b[this.f44953b.ordinal()];
                int i6 = 0;
                if (i5 == 1) {
                    i6 = marginLayoutParams.leftMargin;
                    measuredHeight = marginLayoutParams.topMargin + getMeasuredHeight();
                } else if (i5 == 2) {
                    i6 = marginLayoutParams.leftMargin;
                    measuredHeight = -(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
                } else if (i5 == 3) {
                    i6 = getMeasuredWidth() + marginLayoutParams.leftMargin;
                    measuredHeight = marginLayoutParams.topMargin;
                } else if (i5 != 4) {
                    measuredHeight = 0;
                } else {
                    i6 = -(view.getMeasuredWidth() + marginLayoutParams.rightMargin);
                    measuredHeight = marginLayoutParams.topMargin;
                }
                view.layout(i6, measuredHeight, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + measuredHeight);
                MethodCollector.m26664o(6936);
                return;
            }
            C89388w wVar = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(6936);
            throw wVar;
        }
        MethodCollector.m26664o(6936);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2472a(View view, int i, int i2, int[] iArr, int i3) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(iArr, "");
        if (i3 == 0) {
            int i4 = C19053c.f45144d[this.f44953b.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            if (!view.canScrollVertically(-1) && i2 < 0) {
                                if (Math.abs(i2) + Math.abs(getScrollY()) > this.f44957f) {
                                    scrollTo(getScrollX(), -this.f44957f);
                                } else {
                                    requestDisallowInterceptTouchEvent(true);
                                    scrollBy(0, i2);
                                }
                                iArr[1] = i2;
                            } else if (i2 > 0 && getScrollY() < 0) {
                                if (i2 > Math.abs(getScrollY())) {
                                    scrollBy(0, -getScrollY());
                                } else {
                                    scrollBy(0, i2);
                                }
                                iArr[1] = i2;
                            }
                        }
                    } else if (!view.canScrollVertically(1) && i2 > 0) {
                        if (getScrollY() + i2 > this.f44957f) {
                            scrollTo(getScrollX(), this.f44957f);
                        } else {
                            requestDisallowInterceptTouchEvent(true);
                            scrollBy(0, i2);
                        }
                        iArr[1] = i2;
                    } else if (i2 < 0 && getScrollY() > 0) {
                        if (Math.abs(i2) > getScrollY()) {
                            scrollBy(0, -getScrollY());
                        } else {
                            scrollBy(0, i2);
                        }
                        iArr[1] = i2;
                    }
                } else if (!view.canScrollHorizontally(-1) && i < 0) {
                    int abs = Math.abs(i) + Math.abs(getScrollX());
                    int i5 = this.f44957f;
                    if (abs > i5) {
                        scrollTo(-i5, getScrollY());
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                        scrollBy(i, 0);
                    }
                    iArr[0] = i;
                } else if (i > 0 && getScrollX() < 0) {
                    if (i > Math.abs(getScrollX())) {
                        scrollBy(-getScrollX(), 0);
                    } else {
                        scrollBy(i, 0);
                    }
                    iArr[0] = i;
                }
            } else if (!view.canScrollHorizontally(1) && i > 0) {
                int scrollX = getScrollX() + i;
                int i6 = this.f44957f;
                if (scrollX > i6) {
                    scrollTo(i6, getScrollY());
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    scrollBy(i, 0);
                }
                iArr[0] = i;
            } else if (i < 0 && getScrollX() > 0) {
                if (Math.abs(i) > getScrollX()) {
                    scrollBy(-getScrollX(), 0);
                } else {
                    scrollBy(i, 0);
                }
                iArr[0] = i;
            }
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154719c(view, "");
        if (i5 == 1) {
            int i6 = C19053c.f45145e[this.f44953b.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            if (this.f44958g && getScrollY() == this.f44957f) {
                                m35260a(0, -getScrollY());
                                this.f44958g = false;
                            } else if (i2 > 0 && i4 > 0) {
                                m35260a(0, -this.f44957f);
                                this.f44958g = true;
                            }
                        }
                    } else if (this.f44958g && getScrollY() == this.f44957f) {
                        m35260a(0, -getScrollY());
                        this.f44958g = false;
                    } else if (i2 > 0 && i4 > 0) {
                        m35260a(0, this.f44957f);
                        this.f44958g = true;
                    }
                } else if (this.f44958g && Math.abs(getScrollX()) == this.f44957f) {
                    m35260a(-getScrollX(), 0);
                    this.f44958g = false;
                } else if (i < 0 && i3 < 0) {
                    m35260a(-this.f44957f, 0);
                    this.f44958g = true;
                }
            } else if (this.f44958g && Math.abs(getScrollX()) == this.f44957f) {
                m35260a(-getScrollX(), 0);
                this.f44958g = false;
            } else if (i > 0 && i3 > 0) {
                m35260a(this.f44957f, 0);
                this.f44958g = true;
            }
        }
    }
}
