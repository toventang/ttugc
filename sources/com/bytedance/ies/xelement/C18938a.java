package com.bytedance.ies.xelement;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ies.xelement.a */
public final class C18938a extends NestedScrollView implements AbstractC28586a.AbstractC28587a {

    /* renamed from: d */
    LinearLayout f44820d;

    /* renamed from: e */
    public HorizontalScrollView f44821e;

    /* renamed from: f */
    public int f44822f;

    /* renamed from: g */
    boolean f44823g;

    /* renamed from: h */
    public int f44824h;

    /* renamed from: i */
    public int f44825i;

    /* renamed from: j */
    public boolean f44826j;

    /* renamed from: k */
    public boolean f44827k;

    /* renamed from: l */
    ArrayList<AbstractC18941a> f44828l;

    /* renamed from: m */
    public AbstractC28586a f44829m;

    /* renamed from: n */
    public int f44830n;

    /* renamed from: o */
    public int f44831o;

    /* renamed from: p */
    public int f44832p = 300;

    /* renamed from: q */
    public int f44833q;

    /* renamed from: r */
    private boolean f44834r;

    /* renamed from: s */
    private int f44835s;

    /* renamed from: t */
    private Runnable f44836t;

    /* renamed from: com.bytedance.ies.xelement.a$a */
    public interface AbstractC18941a {
        static {
            Covode.recordClassIndex(21687);
        }

        /* renamed from: a */
        void mo29932a(int i);

        /* renamed from: a */
        void mo29933a(int i, int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(21684);
    }

    public final int getContentHeight() {
        return this.f44825i;
    }

    public final int getContentWidth() {
        return this.f44824h;
    }

    public final HorizontalScrollView getHScrollView() {
        return this.f44821e;
    }

    public final LinearLayout getLinearLayout() {
        return this.f44820d;
    }

    public final int getOrientation() {
        return this.f44820d.getOrientation();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        removeCallbacks(this.f44836t);
        super.finalize();
    }

    /* renamed from: c */
    private void m35138c() {
        mo30041c(2);
        Iterator<AbstractC18941a> it = this.f44828l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo30035a() {
        this.f44830n = getScrollY();
        this.f44831o = this.f44821e.getScrollX();
        postDelayed(this.f44836t, (long) this.f44832p);
    }

    /* renamed from: b */
    public final void mo30039b() {
        mo30041c(1);
        Iterator<AbstractC18941a> it = this.f44828l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void removeAllViews() {
        MethodCollector.m26663i(6833);
        if (this.f44834r) {
            this.f44820d.removeAllViews();
            MethodCollector.m26664o(6833);
            return;
        }
        super.removeAllViews();
        this.f44834r = true;
        MethodCollector.m26664o(6833);
    }

    /* renamed from: com.bytedance.ies.xelement.a$b */
    static class RunnableC18942b implements Runnable {

        /* renamed from: a */
        private WeakReference<C18938a> f44839a;

        static {
            Covode.recordClassIndex(21688);
        }

        public final void run() {
            if (this.f44839a.get() != null) {
                C18938a aVar = this.f44839a.get();
                int scrollY = aVar.getScrollY();
                int scrollX = aVar.f44821e.getScrollX();
                if ((!aVar.f44823g || aVar.f44831o - scrollX != 0) && (aVar.f44823g || aVar.f44830n - scrollY != 0)) {
                    aVar.f44830n = scrollY;
                    aVar.f44831o = scrollX;
                    aVar.postDelayed(this, (long) aVar.f44832p);
                    return;
                }
                aVar.mo30041c(0);
                Iterator<AbstractC18941a> it = aVar.f44828l.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        public RunnableC18942b(C18938a aVar) {
            this.f44839a = new WeakReference<>(aVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a.AbstractC28587a
    public final void bindDrawChildHook(AbstractC28586a aVar) {
        this.f44829m = aVar;
    }

    public final void setOnScrollListener(AbstractC18941a aVar) {
        this.f44828l.add(aVar);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f44823g) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.f44821e.setHorizontalScrollBarEnabled(z);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void addView(View view) {
        MethodCollector.m26663i(6229);
        if (this.f44834r) {
            this.f44820d.addView(view);
            MethodCollector.m26664o(6229);
            return;
        }
        super.addView(view);
        this.f44834r = true;
        MethodCollector.m26664o(6229);
    }

    public final void removeView(View view) {
        MethodCollector.m26663i(6831);
        if (this.f44834r) {
            this.f44820d.removeView(view);
            MethodCollector.m26664o(6831);
            return;
        }
        super.removeView(view);
        this.f44834r = true;
        MethodCollector.m26664o(6831);
    }

    public final void removeViewAt(int i) {
        MethodCollector.m26663i(6832);
        if (this.f44834r) {
            this.f44820d.removeViewAt(i);
            MethodCollector.m26664o(6832);
            return;
        }
        super.removeViewAt(i);
        this.f44834r = true;
        MethodCollector.m26664o(6832);
    }

    public final void setOrientation(int i) {
        if (i == 0) {
            this.f44820d.setOrientation(0);
            this.f44823g = true;
        } else if (i == 1) {
            this.f44820d.setOrientation(1);
            this.f44823g = false;
        }
    }

    /* renamed from: c */
    public final void mo30041c(int i) {
        this.f44833q = i;
        Iterator<AbstractC18941a> it = this.f44828l.iterator();
        while (it.hasNext()) {
            it.next().mo29932a(i);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44823g) {
            return false;
        }
        mo30037a(motionEvent);
        if (motionEvent.getAction() == 0) {
            mo30041c(this.f44833q);
        }
        if (motionEvent.getAction() == 1) {
            mo30035a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public C18938a(Context context) {
        super(context);
        MethodCollector.m26663i(6080);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.f44828l = new ArrayList<>();
        if (this.f44820d == null) {
            C189391 r1 = new LinearLayout(getContext()) {
                /* class com.bytedance.ies.xelement.C18938a.C189391 */

                static {
                    Covode.recordClassIndex(21685);
                }

                /* access modifiers changed from: protected */
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                /* access modifiers changed from: protected */
                public final void dispatchDraw(Canvas canvas) {
                    if (C18938a.this.f44829m != null) {
                        C18938a.this.f44829m.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    if (C18938a.this.f44829m != null) {
                        C18938a.this.f44829m.afterDispatchDraw(canvas);
                    }
                }

                {
                    MethodCollector.m26663i(8242);
                    MethodCollector.m26664o(8242);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i, int i2) {
                    setMeasuredDimension(C18938a.this.f44824h, C18938a.this.f44825i);
                }

                /* access modifiers changed from: protected */
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    if (C18938a.this.f44829m != null) {
                        C18938a.this.f44829m.beforeDrawChild(canvas, view, j);
                    }
                    boolean drawChild = super.drawChild(canvas, view, j);
                    if (C18938a.this.f44829m != null) {
                        C18938a.this.f44829m.afterDrawChild(canvas, view, j);
                    }
                    return drawChild;
                }
            };
            this.f44820d = r1;
            r1.setOrientation(1);
            this.f44820d.setWillNotDraw(true);
            C189402 r12 = new HorizontalScrollView(getContext()) {
                /* class com.bytedance.ies.xelement.C18938a.C189402 */

                static {
                    Covode.recordClassIndex(21686);
                }

                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (C18938a.this.f44823g) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!C18938a.this.f44823g) {
                        return false;
                    }
                    C18938a.this.mo30037a(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        C18938a aVar = C18938a.this;
                        aVar.mo30041c(aVar.f44833q);
                    }
                    if (motionEvent.getAction() == 1) {
                        C18938a.this.mo30035a();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                {
                    MethodCollector.m26663i(8103);
                    MethodCollector.m26664o(8103);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i, int i2) {
                    MethodCollector.m26663i(8105);
                    super.onMeasure(i, i2);
                    MethodCollector.m26664o(8105);
                }

                /* access modifiers changed from: protected */
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    if (i != C18938a.this.f44822f) {
                        if (!C18938a.this.f44826j || C18938a.this.f44827k) {
                            C18938a.this.mo30036a(i, i2, i3, i4);
                        } else {
                            C18938a.this.f44827k = true;
                            C18938a.this.mo30039b();
                        }
                        if (C18938a.this.f44822f != getScrollX()) {
                            C18938a.this.f44822f = getScrollX();
                        }
                    }
                }
            };
            this.f44821e = r12;
            r12.setHorizontalScrollBarEnabled(false);
            this.f44821e.setOverScrollMode(2);
            this.f44821e.setFadingEdgeLength(0);
            this.f44821e.setWillNotDraw(true);
            this.f44821e.addView(this.f44820d, new FrameLayout.LayoutParams(-1, -1));
            addView(this.f44821e, new FrameLayout.LayoutParams(-2, -2));
        }
        this.f44836t = new RunnableC18942b(this);
        MethodCollector.m26664o(6080);
    }

    /* renamed from: a */
    public final void mo30037a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f44826j = true;
        } else if (motionEvent.getAction() == 1) {
            if (this.f44827k) {
                m35138c();
            }
            this.f44827k = false;
            this.f44826j = false;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        MethodCollector.m26663i(6394);
        if (this.f44834r) {
            this.f44820d.addView(view, i);
            MethodCollector.m26664o(6394);
            return;
        }
        super.addView(view, i);
        this.f44834r = true;
        MethodCollector.m26664o(6394);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(6688);
        if (this.f44834r) {
            this.f44820d.addView(view, layoutParams);
            MethodCollector.m26664o(6688);
            return;
        }
        super.addView(view, layoutParams);
        this.f44834r = true;
        MethodCollector.m26664o(6688);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        MethodCollector.m26663i(6830);
        if (this.f44834r) {
            this.f44820d.addView(view, i, i2);
            MethodCollector.m26664o(6830);
            return;
        }
        super.addView(view, i, i2);
        this.f44834r = true;
        MethodCollector.m26664o(6830);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(6534);
        if (this.f44834r) {
            this.f44820d.addView(view, i, layoutParams);
            MethodCollector.m26664o(6534);
            return;
        }
        super.addView(view, i, layoutParams);
        this.f44834r = true;
        MethodCollector.m26664o(6534);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f44820d.setPadding(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo30036a(int i, int i2, int i3, int i4) {
        mo30041c(this.f44833q);
        Iterator<AbstractC18941a> it = this.f44828l.iterator();
        while (it.hasNext()) {
            it.next().mo29933a(i, i2, i3, i4);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 != this.f44835s) {
            if (!this.f44826j || this.f44827k) {
                mo30036a(i, i2, i3, i4);
            } else {
                this.f44827k = true;
                mo30039b();
            }
            if (this.f44835s != getScrollY()) {
                this.f44835s = getScrollY();
            }
        }
    }
}
