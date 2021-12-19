package com.lynx.tasm.behavior.p2052ui.swiper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.behavior.ui.swiper.c */
public final class C28669c extends ViewGroup {

    /* renamed from: a */
    int f67562a;

    /* renamed from: b */
    int f67563b;

    /* renamed from: c */
    public final Scroller f67564c;

    /* renamed from: d */
    boolean f67565d;

    /* renamed from: e */
    int f67566e;

    /* renamed from: f */
    public int f67567f;

    /* renamed from: g */
    public boolean f67568g;

    /* renamed from: h */
    public final int f67569h;

    /* renamed from: i */
    AbstractC28672b f67570i;

    /* renamed from: j */
    AbstractC28667a f67571j;

    /* renamed from: k */
    public final List<AbstractC28674d> f67572k;

    /* renamed from: l */
    int f67573l;

    /* renamed from: m */
    public boolean f67574m;

    /* renamed from: n */
    boolean f67575n;

    /* renamed from: o */
    public boolean f67576o;

    /* renamed from: p */
    public boolean f67577p;

    /* renamed from: q */
    public Boolean f67578q;

    /* renamed from: r */
    int f67579r;

    /* renamed from: s */
    private int f67580s;

    /* renamed from: t */
    private int f67581t;

    /* renamed from: u */
    private float f67582u;

    /* renamed from: v */
    private AbstractC28673c f67583v;

    /* renamed from: w */
    private final GestureDetector f67584w;

    /* renamed from: com.lynx.tasm.behavior.ui.swiper.c$b */
    public interface AbstractC28672b {
        static {
            Covode.recordClassIndex(34740);
        }

        /* renamed from: a */
        void mo49677a(int i);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.swiper.c$c */
    public interface AbstractC28673c {
        static {
            Covode.recordClassIndex(34741);
        }

        /* renamed from: a */
        void mo49685a(View view);

        /* renamed from: a */
        void mo49686a(View view, int i);
    }

    static {
        Covode.recordClassIndex(34737);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.swiper.c$d */
    public static abstract class AbstractC28674d {

        /* renamed from: a */
        boolean f67587a;

        static {
            Covode.recordClassIndex(34742);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo49678b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo49679c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo49680d() {
        }

        AbstractC28674d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo49716a() {
            if (!this.f67587a) {
                this.f67587a = true;
                mo49678b();
            }
        }
    }

    public final void requestLayout() {
        super.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.swiper.c$a */
    public static class C28671a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        int f67586a;

        static {
            Covode.recordClassIndex(34739);
        }

        public C28671a() {
            super(-1, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo49706d() {
        if (this.f67579r == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private int m57357e() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: j */
    private int m57364j() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo49704c() {
        if (mo49706d()) {
            return getScrollY();
        }
        return getScrollX();
    }

    /* renamed from: g */
    private List<View> m57361g() {
        int childCount = getChildCount();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childCount; i++) {
            linkedList.add(getChildAt(i));
        }
        return linkedList;
    }

    /* renamed from: k */
    private int m57365k() {
        int width;
        int i;
        if (mo49706d()) {
            width = getHeight() - getPaddingBottom();
            i = this.f67566e;
        } else {
            width = getWidth() - getPaddingRight();
            i = this.f67566e;
        }
        return width - i;
    }

    /* renamed from: h */
    private View m57362h() {
        int b = mo49702b() + (mo49694a() / 2);
        int c = mo49704c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int a = mo49695a(childAt) - c;
            int f = m57359f(childAt) - c;
            int i2 = this.f67567f;
            if (i2 > 0) {
                f += this.f67566e;
            } else if (i2 < 0) {
                a -= this.f67566e;
            }
            if (a <= b && f >= b) {
                return childAt;
            }
        }
        return getChildAt(0);
    }

    /* renamed from: a */
    public final int mo49694a() {
        int e;
        int i = this.f67580s;
        if (i > 0) {
            return i;
        }
        if (mo49706d()) {
            e = m57364j();
        } else {
            e = m57357e();
        }
        float f = this.f67582u;
        if (f > 0.0f) {
            return (int) Math.ceil((double) (((float) e) * f));
        }
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo49702b() {
        if (mo49706d()) {
            return getPaddingTop() + this.f67581t;
        }
        if (this.f67577p) {
            return ((getPaddingLeft() + this.f67581t) + getWidth()) - mo49694a();
        }
        return getPaddingLeft() + this.f67581t;
    }

    /* renamed from: i */
    private void m57363i() {
        int left;
        int paddingLeft;
        if (this.f67583v != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (this.f67577p) {
                    left = (childAt.getLeft() - getScrollX()) + this.f67581t;
                    paddingLeft = getPaddingLeft();
                } else if (mo49706d()) {
                    left = (childAt.getTop() - getScrollY()) - this.f67581t;
                    paddingLeft = getPaddingTop();
                } else {
                    left = (childAt.getLeft() - getScrollX()) - this.f67581t;
                    paddingLeft = getPaddingLeft();
                }
                this.f67583v.mo49686a(childAt, left - paddingLeft);
            }
        }
    }

    public final void computeScroll() {
        AbstractC28672b bVar;
        if (this.f67564c.computeScrollOffset()) {
            if (mo49706d()) {
                scrollTo(getScrollX(), this.f67564c.getCurrY());
            } else {
                scrollTo(this.f67564c.getCurrX(), getScrollY());
            }
            invalidate();
        } else if (getChildCount() > 0 && !this.f67574m) {
            int i = this.f67562a;
            int i2 = ((C28671a) m57362h().getLayoutParams()).f67586a;
            this.f67562a = i2;
            if (i != i2 && (bVar = this.f67570i) != null) {
                bVar.mo49677a(i2);
            }
        }
    }

    /* renamed from: f */
    private void m57360f() {
        int a;
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop;
        int measuredHeight;
        int i5;
        int i6;
        int i7;
        if (this.f67573l > 0 && (a = mo49694a()) > 0) {
            int c = mo49704c();
            int i8 = this.f67566e + a;
            if (i8 > 0) {
                List<View> g = m57361g();
                int i9 = c / i8;
                int i10 = c % i8;
                if (this.f67577p) {
                    if (c <= 0 || !this.f67565d) {
                        i3 = (getWidth() + c) - i10;
                    } else {
                        if (i10 != 0) {
                            i9++;
                        } else {
                            i9 %= this.f67573l;
                        }
                        int width = (getWidth() + c) - i10;
                        if (i10 == 0) {
                            i7 = this.f67566e;
                        } else {
                            i7 = a;
                        }
                        i3 = width + i7 + this.f67566e;
                    }
                    int i11 = this.f67573l;
                    i = (i11 - i9) % i11;
                    if (i < 0) {
                        i += i11;
                    }
                    i2 = 0;
                } else {
                    if (c >= 0 || !this.f67565d) {
                        i = i9 % this.f67573l;
                        i2 = c - i10;
                    } else {
                        if (i10 != 0) {
                            i9--;
                        }
                        int i12 = this.f67573l;
                        i = ((i9 % i12) + i12) % i12;
                        if (i10 == 0) {
                            i4 = -this.f67566e;
                        } else {
                            i4 = a;
                        }
                        i2 = ((c - i4) - i10) - this.f67566e;
                    }
                    i3 = 0;
                }
                int max = c - Math.max(0, m57365k());
                int max2 = c + Math.max(0, m57365k());
                while (true) {
                    View c2 = m57354c(i);
                    g.remove(c2);
                    if (this.f67577p) {
                        i2 = i3 - a;
                    } else {
                        i3 = i2 + a;
                    }
                    if (mo49706d()) {
                        i6 = getPaddingLeft();
                        i5 = c2.getMeasuredWidth() + i6;
                        measuredHeight = i3;
                        paddingTop = i2;
                    } else {
                        paddingTop = getPaddingTop();
                        measuredHeight = c2.getMeasuredHeight() + paddingTop;
                        i5 = i3;
                        i6 = i2;
                    }
                    if (!(i6 == c2.getLeft() && paddingTop == c2.getTop() && i5 == c2.getRight() && measuredHeight == c2.getBottom())) {
                        c2.layout(i6, paddingTop, i5, measuredHeight);
                    }
                    m57363i();
                    if (!this.f67577p) {
                        if (i3 >= max2) {
                            break;
                        }
                        i2 = this.f67566e + i3;
                    } else if (i2 <= max) {
                        break;
                    } else {
                        i3 = i2 - this.f67566e;
                    }
                    int i13 = i + 1;
                    int i14 = this.f67573l;
                    if (i13 >= i14 && !this.f67565d) {
                        break;
                    }
                    i = i13 % i14;
                }
                for (View view : g) {
                    m57353b(view);
                }
            }
        }
    }

    public C28669c(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: b */
    private void m57353b(View view) {
        removeView(view);
        AbstractC28673c cVar = this.f67583v;
        if (cVar != null) {
            cVar.mo49685a(view);
        }
        view.getLayoutParams();
    }

    /* renamed from: f */
    private int m57359f(View view) {
        if (mo49706d()) {
            return view.getBottom();
        }
        return view.getRight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49695a(View view) {
        if (mo49706d()) {
            return view.getTop();
        }
        return view.getLeft();
    }

    /* renamed from: a */
    public final void mo49696a(float f) {
        this.f67580s = -1;
        this.f67582u = f;
        mo49699a(this.f67571j);
    }

    /* renamed from: b */
    public final void mo49703b(int i) {
        int i2 = this.f67581t;
        this.f67581t = i;
        if (mo49706d()) {
            scrollBy(0, i2 - i);
        } else {
            scrollBy(i2 - i, 0);
        }
    }

    /* renamed from: c */
    private View m57354c(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C28671a) childAt.getLayoutParams()).f67586a == i) {
                return childAt;
            }
        }
        View a = this.f67571j.mo49684a(i);
        C28671a aVar = new C28671a();
        aVar.f67586a = i;
        addViewInLayout(a, 0, aVar, true);
        m57355c(a);
        return a;
    }

    /* renamed from: c */
    private void m57355c(View view) {
        int makeMeasureSpec;
        int d;
        if (mo49706d()) {
            makeMeasureSpec = m57358e(view);
            d = View.MeasureSpec.makeMeasureSpec(mo49694a(), 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo49694a(), 1073741824);
            d = m57356d(view);
        }
        view.measure(makeMeasureSpec, d);
    }

    /* renamed from: d */
    private int m57356d(View view) {
        C28671a aVar = (C28671a) view.getLayoutParams();
        if (aVar.height >= 0) {
            return View.MeasureSpec.makeMeasureSpec(aVar.height, 1073741824);
        }
        int max = Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (aVar.height == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (aVar.height == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }

    /* renamed from: e */
    private int m57358e(View view) {
        C28671a aVar = (C28671a) view.getLayoutParams();
        if (aVar.width >= 0) {
            return View.MeasureSpec.makeMeasureSpec(aVar.width, 1073741824);
        }
        int max = Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
        if (aVar.width == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (aVar.width == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }

    /* renamed from: a */
    public final void mo49697a(int i) {
        this.f67582u = -1.0f;
        this.f67580s = i;
        mo49699a(this.f67571j);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f67578q = null;
            this.f67574m = false;
            if (!this.f67568g && getChildCount() > 0) {
                int b = mo49702b() + (mo49694a() / 2);
                int c = mo49704c();
                View h = m57362h();
                int a = (((mo49695a(h) - c) + m57359f(h)) - c) / 2;
                if (mo49706d()) {
                    this.f67564c.startScroll(0, c, 0, a - b, this.f67563b);
                } else {
                    this.f67564c.startScroll(c, 0, a - b, 0, this.f67563b);
                }
                invalidate();
            }
        }
        if (this.f67575n) {
            return this.f67584w.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo49699a(AbstractC28667a aVar) {
        if (this.f67571j != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m57353b(getChildAt(childCount));
            }
        } else {
            removeAllViews();
        }
        this.f67571j = aVar;
        if (aVar != null) {
            this.f67573l = aVar.mo49683a();
            if (mo49706d()) {
                setScrollY((-this.f67581t) - getPaddingTop());
            } else {
                setScrollX((-this.f67581t) - getPaddingLeft());
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo49700a(AbstractC28673c cVar) {
        if (this.f67583v != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.f67583v.mo49685a(getChildAt(childCount));
            }
        }
        this.f67583v = cVar;
        m57363i();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
    }

    private C28669c(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(2336);
        this.f67562a = -1;
        this.f67563b = 300;
        this.f67582u = 1.0f;
        this.f67572k = new ArrayList();
        this.f67575n = true;
        this.f67576o = false;
        this.f67577p = false;
        this.f67579r = 0;
        this.f67584w = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            /* class com.lynx.tasm.behavior.p2052ui.swiper.C28669c.C286701 */

            static {
                Covode.recordClassIndex(34738);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                C28669c.this.f67568g = false;
                C28669c.this.f67567f = 0;
                C28669c.this.f67574m = true;
                C28669c.this.f67576o = true;
                return true;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float f3;
                boolean onFling = super.onFling(motionEvent, motionEvent2, f, f2);
                if (f >= ((float) (-C28669c.this.f67569h)) && f <= ((float) C28669c.this.f67569h)) {
                    return onFling;
                }
                C28669c.this.f67568g = true;
                C28669c.this.f67564c.abortAnimation();
                C28669c cVar = C28669c.this;
                if (cVar.getChildCount() > 0) {
                    if (cVar.mo49706d()) {
                        f3 = f2;
                    } else {
                        f3 = f;
                    }
                    int b = cVar.mo49702b();
                    int c = cVar.mo49704c();
                    int i = 0;
                    if (f3 < 0.0f) {
                        int childCount = cVar.getChildCount();
                        int i2 = Integer.MAX_VALUE;
                        while (i < childCount) {
                            int a = cVar.mo49695a(cVar.getChildAt(i)) - c;
                            if (a > b && a < i2) {
                                i2 = a;
                            }
                            i++;
                        }
                        if (i2 != Integer.MAX_VALUE) {
                            if (cVar.mo49706d()) {
                                cVar.f67564c.startScroll(0, c, 0, i2 - b, cVar.f67563b);
                            } else {
                                cVar.f67564c.startScroll(c, 0, i2 - b, 0, cVar.f67563b);
                            }
                        }
                    } else {
                        int childCount2 = cVar.getChildCount();
                        int i3 = Integer.MIN_VALUE;
                        while (i < childCount2) {
                            int a2 = cVar.mo49695a(cVar.getChildAt(i)) - c;
                            if (a2 < b && a2 > i3) {
                                i3 = a2;
                            }
                            i++;
                        }
                        if (i3 != Integer.MIN_VALUE) {
                            if (cVar.mo49706d()) {
                                cVar.f67564c.startScroll(0, c, 0, i3 - b, cVar.f67563b);
                            } else {
                                cVar.f67564c.startScroll(c, 0, i3 - b, 0, cVar.f67563b);
                            }
                        }
                    }
                    cVar.invalidate();
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                if (C28669c.this.f67578q == null) {
                    C28669c cVar = C28669c.this;
                    if (Math.abs(f) > Math.abs(f2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f67578q = Boolean.valueOf(z);
                }
                if (C28669c.this.f67578q.booleanValue()) {
                    C28669c.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (C28669c.this.f67576o) {
                    C28669c.this.f67576o = false;
                    for (AbstractC28674d dVar : C28669c.this.f67572k) {
                        dVar.mo49716a();
                    }
                }
                C28669c cVar2 = C28669c.this;
                cVar2.f67567f = (int) (((float) cVar2.f67567f) + f);
                if (C28669c.this.mo49706d()) {
                    C28669c cVar3 = C28669c.this;
                    double d = (double) f2;
                    Double.isNaN(d);
                    cVar3.scrollBy(0, (int) (d + 0.5d));
                } else {
                    C28669c cVar4 = C28669c.this;
                    double d2 = (double) f;
                    Double.isNaN(d2);
                    cVar4.scrollBy((int) (d2 + 0.5d), 0);
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
        }, new Handler(Looper.getMainLooper()));
        this.f67569h = (int) (getResources().getDisplayMetrics().density * 600.0f);
        this.f67564c = new Scroller(context, new LinearInterpolator());
        MethodCollector.m26664o(2336);
    }

    /* renamed from: a */
    public final void mo49698a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        if (this.f67573l > 0 && getChildCount() > 0) {
            if (i5 < 0) {
                i5 = 0;
            }
            int a = mo49694a();
            int b = mo49702b() + (a / 2);
            int c = mo49704c();
            View h = m57362h();
            int i6 = (i5 - ((C28671a) h.getLayoutParams()).f67586a) * (a + this.f67566e);
            int a2 = (((mo49695a(h) - c) + m57359f(h)) - c) / 2;
            for (AbstractC28674d dVar : this.f67572k) {
                dVar.mo49716a();
            }
            if (this.f67577p) {
                Scroller scroller = this.f67564c;
                int i7 = (a2 - b) - i6;
                if (z) {
                    i4 = this.f67563b;
                } else {
                    i4 = 0;
                }
                scroller.startScroll(c, 0, i7, 0, i4);
            } else if (mo49706d()) {
                Scroller scroller2 = this.f67564c;
                int i8 = (a2 - b) + i6;
                if (z) {
                    i3 = this.f67563b;
                } else {
                    i3 = 0;
                }
                scroller2.startScroll(0, c, 0, i8, i3);
            } else {
                Scroller scroller3 = this.f67564c;
                int i9 = i6 + (a2 - b);
                if (z) {
                    i2 = this.f67563b;
                } else {
                    i2 = 0;
                }
                scroller3.startScroll(c, 0, i9, 0, i2);
            }
            invalidate();
        }
    }

    public final void scrollTo(int i, int i2) {
        int i3;
        int a;
        if (!this.f67565d) {
            if (mo49706d()) {
                int i4 = (-getPaddingTop()) - this.f67581t;
                if (i2 < i4) {
                    i2 = i4;
                }
                int a2 = (((this.f67573l - 1) * (mo49694a() + this.f67566e)) - getPaddingTop()) - this.f67581t;
                if (i2 > a2) {
                    i2 = a2;
                }
            } else {
                if (this.f67577p) {
                    a = getPaddingRight() - this.f67581t;
                    i3 = -((((this.f67573l - 1) * (mo49694a() + this.f67566e)) - getPaddingRight()) + this.f67581t);
                } else {
                    i3 = (-getPaddingLeft()) - this.f67581t;
                    a = (((this.f67573l - 1) * (mo49694a() + this.f67566e)) - getPaddingLeft()) - this.f67581t;
                }
                if (i < i3) {
                    i = i3;
                }
                if (i > a) {
                    i = a;
                }
            }
        }
        super.scrollTo(i, i2);
        m57360f();
        for (AbstractC28674d dVar : this.f67572k) {
            dVar.mo49680d();
        }
        if (!this.f67574m && this.f67564c.isFinished()) {
            for (AbstractC28674d dVar2 : this.f67572k) {
                if (dVar2.f67587a) {
                    dVar2.f67587a = false;
                    dVar2.mo49679c();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException();
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        super.setPadding(i, i2, i3, i4);
        if (mo49706d()) {
            scrollBy(0, paddingLeft - i);
        } else {
            scrollBy(paddingLeft - i, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m57355c(getChildAt(childCount));
        }
        m57360f();
    }
}
