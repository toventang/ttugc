package com.lynx.tasm.behavior.p2052ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.a */
public class C28650a extends ScrollView implements AbstractC28586a.AbstractC28587a {

    /* renamed from: a */
    public LinearLayout f67489a;

    /* renamed from: b */
    public HorizontalScrollView f67490b;

    /* renamed from: c */
    public int f67491c;

    /* renamed from: d */
    boolean f67492d;

    /* renamed from: e */
    public int f67493e;

    /* renamed from: f */
    public int f67494f;

    /* renamed from: g */
    public boolean f67495g;

    /* renamed from: h */
    public boolean f67496h;

    /* renamed from: i */
    ArrayList<AbstractC28654a> f67497i;

    /* renamed from: j */
    public AbstractC28586a f67498j;

    /* renamed from: k */
    public int f67499k;

    /* renamed from: l */
    public int f67500l;

    /* renamed from: m */
    public int f67501m = 300;

    /* renamed from: n */
    public RunnableC28656c f67502n;

    /* renamed from: o */
    public boolean f67503o;

    /* renamed from: p */
    public int f67504p;

    /* renamed from: q */
    public int f67505q;

    /* renamed from: r */
    private boolean f67506r;

    /* renamed from: s */
    private int f67507s;

    /* renamed from: t */
    private Runnable f67508t;

    /* renamed from: u */
    private Rect f67509u;

    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$a */
    public interface AbstractC28654a {
        static {
            Covode.recordClassIndex(34719);
        }

        /* renamed from: a */
        void mo49607a();

        /* renamed from: a */
        void mo49608a(int i);

        /* renamed from: a */
        void mo49609a(int i, int i2, int i3, int i4);

        /* renamed from: b */
        void mo49610b();
    }

    static {
        Covode.recordClassIndex(34715);
    }

    public int getContentHeight() {
        return this.f67494f;
    }

    public int getContentWidth() {
        return this.f67493e;
    }

    public HorizontalScrollView getHScrollView() {
        return this.f67490b;
    }

    public LinearLayout getLinearLayout() {
        return this.f67489a;
    }

    public int getOrientation() {
        return this.f67489a.getOrientation();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        removeCallbacks(this.f67508t);
        super.finalize();
    }

    public int getRealScrollX() {
        if (this.f67492d) {
            return this.f67490b.getScrollX();
        }
        return getScrollX();
    }

    public int getRealScrollY() {
        if (this.f67492d) {
            return this.f67490b.getScrollY();
        }
        return getScrollY();
    }

    /* renamed from: c */
    private void m57319c() {
        mo49613a(2);
        Iterator<AbstractC28654a> it = this.f67497i.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo49612a() {
        this.f67499k = getScrollY();
        this.f67500l = this.f67490b.getScrollX();
        postDelayed(this.f67508t, (long) this.f67501m);
    }

    /* renamed from: b */
    public final void mo49622b() {
        mo49613a(1);
        Iterator<AbstractC28654a> it = this.f67497i.iterator();
        while (it.hasNext()) {
            it.next().mo49610b();
        }
    }

    public void removeAllViews() {
        MethodCollector.m26663i(219);
        if (this.f67506r) {
            this.f67489a.removeAllViews();
            MethodCollector.m26664o(219);
            return;
        }
        super.removeAllViews();
        this.f67506r = true;
        MethodCollector.m26664o(219);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$b */
    static class RunnableC28655b implements Runnable {

        /* renamed from: a */
        private WeakReference<C28650a> f67514a;

        static {
            Covode.recordClassIndex(34720);
        }

        public final void run() {
            if (this.f67514a.get() != null) {
                C28650a aVar = this.f67514a.get();
                int scrollY = aVar.getScrollY();
                int scrollX = aVar.f67490b.getScrollX();
                if ((!aVar.f67492d || aVar.f67500l - scrollX != 0) && (aVar.f67492d || aVar.f67499k - scrollY != 0)) {
                    aVar.f67499k = scrollY;
                    aVar.f67500l = scrollX;
                    aVar.postDelayed(this, (long) aVar.f67501m);
                    return;
                }
                aVar.mo49613a(0);
                Iterator<AbstractC28654a> it = aVar.f67497i.iterator();
                while (it.hasNext()) {
                    it.next().mo49607a();
                }
            }
        }

        public RunnableC28655b(C28650a aVar) {
            this.f67514a = new WeakReference<>(aVar);
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$c */
    class RunnableC28656c implements Runnable {
        static {
            Covode.recordClassIndex(34721);
        }

        public final void run() {
            if (C28650a.this.f67503o) {
                int realScrollX = C28650a.this.getRealScrollX();
                int realScrollY = C28650a.this.getRealScrollY();
                if (!C28650a.this.f67492d) {
                    C28650a aVar = C28650a.this;
                    aVar.mo49615a(realScrollX, aVar.f67504p + realScrollY, false);
                    if (realScrollY + C28650a.this.f67504p + C28650a.this.getMeasuredHeight() < C28650a.this.f67489a.getMeasuredHeight()) {
                        C28650a aVar2 = C28650a.this;
                        aVar2.postDelayed(aVar2.f67502n, 16);
                        return;
                    }
                    C28650a.this.f67503o = false;
                    return;
                }
                C28650a aVar3 = C28650a.this;
                aVar3.mo49615a(aVar3.f67504p + realScrollX, realScrollY, false);
                if (realScrollX + C28650a.this.f67504p + C28650a.this.getMeasuredWidth() < C28650a.this.f67489a.getMeasuredWidth()) {
                    C28650a aVar4 = C28650a.this;
                    aVar4.postDelayed(aVar4.f67502n, 16);
                    return;
                }
                C28650a.this.f67503o = false;
            }
        }

        private RunnableC28656c() {
        }

        /* synthetic */ RunnableC28656c(C28650a aVar, byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a.AbstractC28587a
    public void bindDrawChildHook(AbstractC28586a aVar) {
        this.f67498j = aVar;
    }

    public void setOnScrollListener(AbstractC28654a aVar) {
        this.f67497i.add(aVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f67492d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setEnableScroll(final boolean z) {
        View$OnTouchListenerC286511 r1 = new View.OnTouchListener() {
            /* class com.lynx.tasm.behavior.p2052ui.scroll.C28650a.View$OnTouchListenerC286511 */

            static {
                Covode.recordClassIndex(34716);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!z) {
                    return true;
                }
                return false;
            }
        };
        this.f67490b.setOnTouchListener(r1);
        setOnTouchListener(r1);
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.f67490b.setHorizontalScrollBarEnabled(z);
    }

    public void addView(View view) {
        MethodCollector.m26663i(2845);
        if (this.f67506r) {
            this.f67489a.addView(view);
            MethodCollector.m26664o(2845);
            return;
        }
        super.addView(view);
        this.f67506r = true;
        MethodCollector.m26664o(2845);
    }

    public void removeView(View view) {
        MethodCollector.m26663i(110);
        if (this.f67506r) {
            this.f67489a.removeView(view);
            MethodCollector.m26664o(110);
            return;
        }
        super.removeView(view);
        this.f67506r = true;
        MethodCollector.m26664o(110);
    }

    public void removeViewAt(int i) {
        MethodCollector.m26663i(193);
        if (this.f67506r) {
            this.f67489a.removeViewAt(i);
            MethodCollector.m26664o(193);
            return;
        }
        super.removeViewAt(i);
        this.f67506r = true;
        MethodCollector.m26664o(193);
    }

    public void setOrientation(int i) {
        if (i == 0) {
            this.f67489a.setOrientation(0);
            this.f67492d = true;
        } else if (i == 1) {
            this.f67489a.setOrientation(1);
            this.f67492d = false;
        }
    }

    /* renamed from: a */
    public final void mo49613a(int i) {
        this.f67505q = i;
        Iterator<AbstractC28654a> it = this.f67497i.iterator();
        while (it.hasNext()) {
            it.next().mo49608a(i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f67492d) {
            return false;
        }
        mo49616a(motionEvent);
        if (motionEvent.getAction() == 0) {
            mo49613a(this.f67505q);
        }
        if (motionEvent.getAction() == 1) {
            mo49612a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private static void m57318a(View view) {
        Field field;
        try {
            if (view instanceof HorizontalScrollView) {
                field = HorizontalScrollView.class.getDeclaredField("mScroller");
            } else {
                if (view instanceof ScrollView) {
                    field = ScrollView.class.getDeclaredField("mScroller");
                }
                LLog.m56861c("AndroidScrollView", "did not find mScroller in " + view.getClass().getName());
            }
            if (field != null) {
                field.setAccessible(true);
                OverScroller overScroller = (OverScroller) field.get(view);
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    return;
                }
                return;
            }
            LLog.m56861c("AndroidScrollView", "did not find mScroller in " + view.getClass().getName());
        } catch (Throwable th) {
            LLog.m56861c("AndroidScrollView", th.getMessage());
        }
    }

    public C28650a(Context context) {
        super(context);
        MethodCollector.m26663i(2821);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.f67497i = new ArrayList<>();
        this.f67509u = new Rect();
        if (this.f67489a == null) {
            C286522 r1 = new LinearLayout(getContext()) {
                /* class com.lynx.tasm.behavior.p2052ui.scroll.C28650a.C286522 */

                static {
                    Covode.recordClassIndex(34717);
                }

                /* access modifiers changed from: protected */
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                /* access modifiers changed from: protected */
                public final void dispatchDraw(Canvas canvas) {
                    if (C28650a.this.f67498j != null) {
                        C28650a.this.f67498j.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    if (C28650a.this.f67498j != null) {
                        C28650a.this.f67498j.afterDispatchDraw(canvas);
                    }
                }

                {
                    MethodCollector.m26663i(1844);
                    MethodCollector.m26664o(1844);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i, int i2) {
                    setMeasuredDimension(C28650a.this.f67493e, C28650a.this.f67494f);
                }

                /* access modifiers changed from: protected */
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    boolean drawChild;
                    Rect beforeDrawChild;
                    if (C28650a.this.f67498j == null || (beforeDrawChild = C28650a.this.f67498j.beforeDrawChild(canvas, view, j)) == null) {
                        drawChild = super.drawChild(canvas, view, j);
                    } else {
                        canvas.save();
                        canvas.clipRect(beforeDrawChild);
                        drawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                    }
                    if (C28650a.this.f67498j != null) {
                        C28650a.this.f67498j.afterDrawChild(canvas, view, j);
                    }
                    return drawChild;
                }
            };
            this.f67489a = r1;
            r1.setOrientation(1);
            this.f67489a.setWillNotDraw(true);
            this.f67489a.setFocusableInTouchMode(true);
            C286533 r12 = new HorizontalScrollView(getContext()) {
                /* class com.lynx.tasm.behavior.p2052ui.scroll.C28650a.C286533 */

                static {
                    Covode.recordClassIndex(34718);
                }

                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (C28650a.this.f67492d) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!C28650a.this.f67492d) {
                        return false;
                    }
                    C28650a.this.mo49616a(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        C28650a aVar = C28650a.this;
                        aVar.mo49613a(aVar.f67505q);
                    }
                    if (motionEvent.getAction() == 1) {
                        C28650a.this.mo49612a();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                {
                    MethodCollector.m26663i(1825);
                    MethodCollector.m26664o(1825);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i, int i2) {
                    MethodCollector.m26663i(1827);
                    super.onMeasure(i, i2);
                    MethodCollector.m26664o(1827);
                }

                /* access modifiers changed from: protected */
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    if (i != C28650a.this.f67491c) {
                        if (!C28650a.this.f67495g || C28650a.this.f67496h) {
                            C28650a.this.mo49614a(i, i2, i3, i4);
                        } else {
                            C28650a.this.f67496h = true;
                            C28650a.this.mo49622b();
                        }
                        if (C28650a.this.f67491c != getScrollX()) {
                            C28650a.this.f67491c = getScrollX();
                        }
                    }
                }
            };
            this.f67490b = r12;
            r12.setHorizontalScrollBarEnabled(false);
            this.f67490b.setOverScrollMode(2);
            this.f67490b.setFadingEdgeLength(0);
            this.f67490b.setWillNotDraw(true);
            this.f67490b.addView(this.f67489a, new FrameLayout.LayoutParams(-1, -1));
            addView(this.f67490b, new FrameLayout.LayoutParams(-2, -2));
        }
        this.f67508t = new RunnableC28655b(this);
        MethodCollector.m26664o(2821);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF b = backgroundDrawable.mo49754b();
            C28683b bVar = backgroundDrawable.f67608g;
            Rect bounds = background.getBounds();
            Path path = new Path();
            RectF rectF = new RectF(((float) bounds.left) + b.left, ((float) bounds.top) + b.top + ((float) this.f67507s), ((float) bounds.right) - b.right, (((float) bounds.bottom) - b.bottom) + ((float) this.f67507s));
            if (bVar == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, BackgroundDrawable.C28680b.m57417a(bVar.mo49770a(), b, 1.0f), Path.Direction.CW);
            }
            int save = canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        if (getParent() instanceof ViewGroup) {
            int i = Build.VERSION.SDK_INT;
            if (!((ViewGroup) getParent()).getClipChildren() && getClipBounds() == null) {
                this.f67509u.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
                canvas.clipRect(this.f67509u);
            }
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public final void mo49616a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f67495g = true;
        } else if (motionEvent.getAction() == 1) {
            if (this.f67496h) {
                m57319c();
            }
            this.f67496h = false;
            this.f67495g = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        MethodCollector.m26663i(2857);
        if (this.f67506r) {
            this.f67489a.addView(view, i);
            MethodCollector.m26664o(2857);
            return;
        }
        super.addView(view, i);
        this.f67506r = true;
        MethodCollector.m26664o(2857);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(77);
        if (this.f67506r) {
            this.f67489a.addView(view, layoutParams);
            MethodCollector.m26664o(77);
            return;
        }
        super.addView(view, layoutParams);
        this.f67506r = true;
        MethodCollector.m26664o(77);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        MethodCollector.m26663i(95);
        if (this.f67506r) {
            this.f67489a.addView(view, i, i2);
            MethodCollector.m26664o(95);
            return;
        }
        super.addView(view, i, i2);
        this.f67506r = true;
        MethodCollector.m26664o(95);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(63);
        if (this.f67506r) {
            this.f67489a.addView(view, i, layoutParams);
            MethodCollector.m26664o(63);
            return;
        }
        super.addView(view, i, layoutParams);
        this.f67506r = true;
        MethodCollector.m26664o(63);
    }

    /* renamed from: a */
    public final void mo49615a(int i, int i2, boolean z) {
        if (this.f67491c != i || this.f67507s != i2) {
            if (z) {
                if (this.f67492d) {
                    this.f67490b.setSmoothScrollingEnabled(true);
                    this.f67490b.smoothScrollTo(i, i2);
                    return;
                }
                setSmoothScrollingEnabled(true);
                smoothScrollTo(i, i2);
            } else if (this.f67492d) {
                m57318a(this.f67490b);
                this.f67490b.scrollTo(i, i2);
            } else {
                m57318a(this);
                scrollTo(i, i2);
            }
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f67489a.setPadding(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 != this.f67507s) {
            if (!this.f67495g || this.f67496h) {
                mo49614a(i, i2, i3, i4);
            } else {
                this.f67496h = true;
                mo49622b();
            }
            if (this.f67507s != getScrollY()) {
                this.f67507s = getScrollY();
            }
        }
    }

    /* renamed from: a */
    public final void mo49614a(int i, int i2, int i3, int i4) {
        mo49613a(this.f67505q);
        Iterator<AbstractC28654a> it = this.f67497i.iterator();
        while (it.hasNext()) {
            it.next().mo49609a(i, i2, i3, i4);
        }
    }
}
