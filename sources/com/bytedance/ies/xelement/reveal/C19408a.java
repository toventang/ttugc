package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.p037h.C0769d;
import androidx.core.p037h.C0792v;
import androidx.customview.p040a.C0827a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.reveal.p1396a.C19414a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.reveal.a */
public final class C19408a extends ViewGroup {

    /* renamed from: t */
    public static final C19409a f45977t = new C19409a((byte) 0);

    /* renamed from: A */
    private int f45978A;

    /* renamed from: a */
    public View f45979a;

    /* renamed from: b */
    public View f45980b;

    /* renamed from: c */
    public final Rect f45981c = new Rect();

    /* renamed from: d */
    public final Rect f45982d = new Rect();

    /* renamed from: e */
    public int f45983e;

    /* renamed from: f */
    public volatile boolean f45984f;

    /* renamed from: g */
    public volatile boolean f45985g;

    /* renamed from: h */
    public volatile boolean f45986h;

    /* renamed from: i */
    int f45987i = 300;

    /* renamed from: j */
    public int f45988j;

    /* renamed from: k */
    public int f45989k = 1;

    /* renamed from: l */
    public int f45990l;

    /* renamed from: m */
    public int f45991m;

    /* renamed from: n */
    int f45992n = 1;

    /* renamed from: o */
    public C0827a f45993o;

    /* renamed from: p */
    C0769d f45994p;

    /* renamed from: q */
    public AbstractC19410b f45995q;

    /* renamed from: r */
    final C0827a.AbstractC0830a f45996r;

    /* renamed from: s */
    final GestureDetector.OnGestureListener f45997s;

    /* renamed from: u */
    private final Rect f45998u = new Rect();

    /* renamed from: v */
    private final Rect f45999v = new Rect();

    /* renamed from: w */
    private boolean f46000w;

    /* renamed from: x */
    private float f46001x;

    /* renamed from: y */
    private float f46002y = -1.0f;

    /* renamed from: z */
    private float f46003z = -1.0f;

    /* renamed from: com.bytedance.ies.xelement.reveal.a$b */
    public interface AbstractC19410b {
        static {
            Covode.recordClassIndex(22220);
        }

        /* renamed from: a */
        void mo30959a();

        /* renamed from: b */
        void mo30960b();
    }

    static {
        Covode.recordClassIndex(22218);
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.a$a */
    public static final class C19409a {
        static {
            Covode.recordClassIndex(22219);
        }

        private C19409a() {
        }

        public /* synthetic */ C19409a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.a$c  reason: invalid class name */
    public static final class animationInterpolatorC19411c implements Interpolator {
        static {
            Covode.recordClassIndex(22221);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }

        animationInterpolatorC19411c() {
        }
    }

    public final int getDragEdge() {
        return this.f45992n;
    }

    public final int getMinFlingVelocity() {
        return this.f45987i;
    }

    public final void computeScroll() {
        C0827a aVar = this.f45993o;
        if (aVar == null) {
            C89219l.m154707a();
        }
        if (aVar.mo3027c()) {
            C0792v.m2764c(this);
        }
    }

    private final int getMainOpenLeft() {
        int i = this.f45992n;
        if (i == 1) {
            int i2 = this.f45981c.left;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i2 + view.getWidth();
        } else if (i == 2) {
            int i3 = this.f45981c.left;
            View view2 = this.f45980b;
            if (view2 == null) {
                C89219l.m154707a();
            }
            return i3 - view2.getWidth();
        } else if (i == 4 || i == 8) {
            return this.f45981c.left;
        } else {
            return 0;
        }
    }

    private final int getMainOpenTop() {
        int i = this.f45992n;
        if (i == 1 || i == 2) {
            return this.f45981c.top;
        }
        if (i == 4) {
            int i2 = this.f45981c.top;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i2 + view.getHeight();
        } else if (i != 8) {
            return 0;
        } else {
            int i3 = this.f45981c.top;
            View view2 = this.f45980b;
            if (view2 == null) {
                C89219l.m154707a();
            }
            return i3 - view2.getHeight();
        }
    }

    private final int getSecOpenLeft() {
        int i;
        if (this.f45989k == 0 || (i = this.f45992n) == 8 || i == 4) {
            return this.f45998u.left;
        }
        if (i == 1) {
            int i2 = this.f45998u.left;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i2 + view.getWidth();
        }
        int i3 = this.f45998u.left;
        View view2 = this.f45980b;
        if (view2 == null) {
            C89219l.m154707a();
        }
        return i3 - view2.getWidth();
    }

    private final int getSecOpenTop() {
        int i;
        if (this.f45989k == 0 || (i = this.f45992n) == 1 || i == 2) {
            return this.f45998u.top;
        }
        if (i == 4) {
            int i2 = this.f45998u.top;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i2 + view.getHeight();
        }
        int i3 = this.f45998u.top;
        View view2 = this.f45980b;
        if (view2 == null) {
            C89219l.m154707a();
        }
        return i3 - view2.getHeight();
    }

    public final int getHalfwayPivotHorizontal() {
        if (this.f45992n == 1) {
            int i = this.f45981c.left;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i + (view.getWidth() / 2);
        }
        int i2 = this.f45981c.right;
        View view2 = this.f45980b;
        if (view2 == null) {
            C89219l.m154707a();
        }
        return i2 - (view2.getWidth() / 2);
    }

    public final int getHalfwayPivotVertical() {
        if (this.f45992n == 4) {
            int i = this.f45981c.top;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            return i + (view.getHeight() / 2);
        }
        int i2 = this.f45981c.bottom;
        View view2 = this.f45980b;
        if (view2 == null) {
            C89219l.m154707a();
        }
        return i2 - (view2.getHeight() / 2);
    }

    public final int getClosestEdgeDistance() {
        int i = this.f45992n;
        if (i == 1) {
            int i2 = this.f45981c.left;
            View view = this.f45980b;
            if (view == null) {
                C89219l.m154707a();
            }
            int width = i2 + view.getWidth();
            View view2 = this.f45979a;
            if (view2 == null) {
                C89219l.m154707a();
            }
            int left = view2.getLeft() - this.f45981c.left;
            View view3 = this.f45979a;
            if (view3 == null) {
                C89219l.m154707a();
            }
            return Math.min(left, width - view3.getLeft());
        } else if (i == 2) {
            int i3 = this.f45981c.right;
            View view4 = this.f45980b;
            if (view4 == null) {
                C89219l.m154707a();
            }
            int width2 = i3 - view4.getWidth();
            View view5 = this.f45979a;
            if (view5 == null) {
                C89219l.m154707a();
            }
            int right = view5.getRight() - width2;
            int i4 = this.f45981c.right;
            View view6 = this.f45979a;
            if (view6 == null) {
                C89219l.m154707a();
            }
            return Math.min(right, i4 - view6.getRight());
        } else if (i == 4) {
            int i5 = this.f45981c.top;
            View view7 = this.f45980b;
            if (view7 == null) {
                C89219l.m154707a();
            }
            int height = i5 + view7.getHeight();
            View view8 = this.f45979a;
            if (view8 == null) {
                C89219l.m154707a();
            }
            int bottom = view8.getBottom() - height;
            View view9 = this.f45979a;
            if (view9 == null) {
                C89219l.m154707a();
            }
            return Math.min(bottom, height - view9.getTop());
        } else if (i != 8) {
            return 0;
        } else {
            int i6 = this.f45981c.bottom;
            View view10 = this.f45980b;
            if (view10 == null) {
                C89219l.m154707a();
            }
            int height2 = i6 - view10.getHeight();
            int i7 = this.f45981c.bottom;
            View view11 = this.f45979a;
            if (view11 == null) {
                C89219l.m154707a();
            }
            int bottom2 = i7 - view11.getBottom();
            View view12 = this.f45979a;
            if (view12 == null) {
                C89219l.m154707a();
            }
            return Math.min(bottom2, view12.getBottom() - height2);
        }
    }

    public final void setDragEdge(int i) {
        this.f45992n = i;
    }

    public final void setLockDrag(boolean z) {
        this.f45986h = z;
    }

    public final void setMinFlingVelocity(int i) {
        this.f45987i = i;
    }

    public final void setMode$x_element_reveal_view_release(int i) {
        this.f45989k = i;
    }

    public final void setSwipeListener(AbstractC19410b bVar) {
        this.f45995q = bVar;
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.a$e */
    public static final class C19413e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f46006a;

        /* renamed from: b */
        final /* synthetic */ C19408a f46007b;

        static {
            Covode.recordClassIndex(22223);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19413e(C19408a aVar) {
            this.f46007b = aVar;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C89219l.m154719c(motionEvent, "");
            this.f46007b.f45985g = false;
            this.f46006a = false;
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154719c(motionEvent, "");
            C89219l.m154719c(motionEvent2, "");
            this.f46007b.f45985g = true;
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            C89219l.m154719c(motionEvent, "");
            C89219l.m154719c(motionEvent2, "");
            boolean z2 = true;
            this.f46007b.f45985g = true;
            if (this.f46007b.getParent() != null) {
                if (!this.f46006a) {
                    if (this.f46007b.getClosestEdgeDistance() >= this.f46007b.f45983e) {
                        z = true;
                        this.f46006a = true;
                    } else {
                        z = false;
                    }
                    z2 = z;
                }
                this.f46007b.getParent().requestDisallowInterceptTouchEvent(z2);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo30962a(View view) {
        C89219l.m154719c(view, "");
        View view2 = this.f45980b;
        if (view2 != null) {
            removeView(view2);
        }
        this.f45980b = view;
        addView(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154719c(motionEvent, "");
        C0769d dVar = this.f45994p;
        if (dVar == null) {
            C89219l.m154707a();
        }
        dVar.mo2893a(motionEvent);
        C0827a aVar = this.f45993o;
        if (aVar == null) {
            C89219l.m154707a();
        }
        aVar.mo3026b(motionEvent);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19408a(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(1929);
        this.f45996r = new C19412d(this, context);
        this.f45997s = new C19413e(this);
        MethodCollector.m26664o(1929);
    }

    /* renamed from: a */
    public final void mo30963a(boolean z) {
        this.f46000w = true;
        this.f45984f = false;
        if (z) {
            this.f45988j = 3;
            C0827a aVar = this.f45993o;
            if (aVar == null) {
                C89219l.m154707a();
            }
            View view = this.f45979a;
            if (view == null) {
                C89219l.m154707a();
            }
            aVar.mo3022a(view, this.f45982d.left, this.f45982d.top);
        } else {
            this.f45988j = 2;
            C0827a aVar2 = this.f45993o;
            if (aVar2 == null) {
                C89219l.m154707a();
            }
            aVar2.mo3024b();
            View view2 = this.f45979a;
            if (view2 == null) {
                C89219l.m154707a();
            }
            view2.layout(this.f45982d.left, this.f45982d.top, this.f45982d.right, this.f45982d.bottom);
            View view3 = this.f45980b;
            if (view3 == null) {
                C89219l.m154707a();
            }
            view3.layout(this.f45999v.left, this.f45999v.top, this.f45999v.right, this.f45999v.bottom);
        }
        C0792v.m2764c(this);
    }

    /* renamed from: b */
    public final void mo30964b(boolean z) {
        this.f46000w = false;
        this.f45984f = false;
        if (z) {
            this.f45988j = 1;
            C0827a aVar = this.f45993o;
            if (aVar == null) {
                C89219l.m154707a();
            }
            View view = this.f45979a;
            if (view == null) {
                C89219l.m154707a();
            }
            aVar.mo3022a(view, this.f45981c.left, this.f45981c.top);
        } else {
            this.f45988j = 0;
            C0827a aVar2 = this.f45993o;
            if (aVar2 == null) {
                C89219l.m154707a();
            }
            aVar2.mo3024b();
            View view2 = this.f45979a;
            if (view2 == null) {
                C89219l.m154707a();
            }
            view2.layout(this.f45981c.left, this.f45981c.top, this.f45981c.right, this.f45981c.bottom);
            View view3 = this.f45980b;
            if (view3 == null) {
                C89219l.m154707a();
            }
            view3.layout(this.f45998u.left, this.f45998u.top, this.f45998u.right, this.f45998u.bottom);
        }
        C0792v.m2764c(this);
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.a$d */
    public static final class C19412d extends C0827a.AbstractC0830a {

        /* renamed from: a */
        final /* synthetic */ C19408a f46004a;

        /* renamed from: b */
        final /* synthetic */ Context f46005b;

        static {
            Covode.recordClassIndex(22222);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
            if (r0.getLeft() == r5.f46004a.f45981c.left) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
            if (r0.getTop() == r5.f46004a.f45981c.top) goto L_0x0034;
         */
        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3033a(int r6) {
            /*
                r5 = this;
                super.mo3033a(r6)
                r2 = 0
                r4 = 1
                r1 = 2
                if (r6 == 0) goto L_0x000f
                if (r6 == r4) goto L_0x000b
            L_0x000a:
                return
            L_0x000b:
                com.bytedance.ies.xelement.reveal.a r3 = r5.f46004a
                r2 = 4
                goto L_0x0034
            L_0x000f:
                com.bytedance.ies.xelement.reveal.a r3 = r5.f46004a
                int r0 = r3.getDragEdge()
                if (r0 == r4) goto L_0x001f
                com.bytedance.ies.xelement.reveal.a r0 = r5.f46004a
                int r0 = r0.getDragEdge()
                if (r0 != r1) goto L_0x0037
            L_0x001f:
                com.bytedance.ies.xelement.reveal.a r0 = r5.f46004a
                android.view.View r0 = r0.f45979a
                if (r0 != 0) goto L_0x0028
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x0028:
                int r1 = r0.getLeft()
                com.bytedance.ies.xelement.reveal.a r0 = r5.f46004a
                android.graphics.Rect r0 = r0.f45981c
                int r0 = r0.left
                if (r1 != r0) goto L_0x004d
            L_0x0034:
                r3.f45988j = r2
                goto L_0x000a
            L_0x0037:
                com.bytedance.ies.xelement.reveal.a r0 = r5.f46004a
                android.view.View r0 = r0.f45979a
                if (r0 != 0) goto L_0x0040
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x0040:
                int r1 = r0.getTop()
                com.bytedance.ies.xelement.reveal.a r0 = r5.f46004a
                android.graphics.Rect r0 = r0.f45981c
                int r0 = r0.top
                if (r1 != r0) goto L_0x004d
                goto L_0x0034
            L_0x004d:
                r2 = 2
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.C19408a.C19412d.mo3033a(int):void");
        }

        C19412d(C19408a aVar, Context context) {
            this.f46004a = aVar;
            this.f46005b = context;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final boolean mo3039b(View view, int i) {
            C89219l.m154719c(view, "");
            this.f46004a.f45984f = false;
            if (this.f46004a.f45986h) {
                return false;
            }
            C0827a aVar = this.f46004a.f45993o;
            if (aVar == null) {
                C89219l.m154707a();
            }
            View view2 = this.f46004a.f45979a;
            if (view2 == null) {
                C89219l.m154707a();
            }
            aVar.mo3018a(view2, i);
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: c */
        public final int mo3040c(View view, int i) {
            C89219l.m154719c(view, "");
            int dragEdge = this.f46004a.getDragEdge();
            if (dragEdge == 1) {
                int i2 = this.f46004a.f45981c.left;
                View view2 = this.f46004a.f45980b;
                if (view2 == null) {
                    C89219l.m154707a();
                }
                return Math.max(Math.min(i, i2 + view2.getWidth()), this.f46004a.f45981c.left);
            } else if (dragEdge != 2) {
                return view.getLeft();
            } else {
                int min = Math.min(i, this.f46004a.f45981c.left);
                int i3 = this.f46004a.f45981c.left;
                View view3 = this.f46004a.f45980b;
                if (view3 == null) {
                    C89219l.m154707a();
                }
                return Math.max(min, i3 - view3.getWidth());
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3034a(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            super.mo3034a(i, i2);
            if (!this.f46004a.f45986h) {
                boolean z4 = false;
                if (this.f46004a.getDragEdge() == 2 && i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f46004a.getDragEdge() == 1 && i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f46004a.getDragEdge() == 8 && i == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f46004a.getDragEdge() == 4 && i == 8) {
                    z4 = true;
                }
                if (z || z2 || z3 || z4) {
                    C0827a aVar = this.f46004a.f45993o;
                    if (aVar == null) {
                        C89219l.m154707a();
                    }
                    View view = this.f46004a.f45979a;
                    if (view == null) {
                        C89219l.m154707a();
                    }
                    aVar.mo3018a(view, i2);
                }
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            C89219l.m154719c(view, "");
            int dragEdge = this.f46004a.getDragEdge();
            if (dragEdge == 4) {
                int i3 = this.f46004a.f45981c.top;
                View view2 = this.f46004a.f45980b;
                if (view2 == null) {
                    C89219l.m154707a();
                }
                return Math.max(Math.min(i, i3 + view2.getHeight()), this.f46004a.f45981c.top);
            } else if (dragEdge != 8) {
                return view.getTop();
            } else {
                int min = Math.min(i, this.f46004a.f45981c.top);
                int i4 = this.f46004a.f45981c.top;
                View view3 = this.f46004a.f45980b;
                if (view3 == null) {
                    C89219l.m154707a();
                }
                return Math.max(min, i4 - view3.getHeight());
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            boolean z;
            boolean z2;
            boolean z3;
            C89219l.m154719c(view, "");
            int i = (int) f;
            boolean z4 = false;
            if (C19414a.m36220a(this.f46005b, i) >= this.f46004a.getMinFlingVelocity()) {
                z = true;
            } else {
                z = false;
            }
            if (C19414a.m36220a(this.f46005b, i) <= (-this.f46004a.getMinFlingVelocity())) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = (int) f2;
            if (C19414a.m36220a(this.f46005b, i2) <= (-this.f46004a.getMinFlingVelocity())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (C19414a.m36220a(this.f46005b, i2) >= this.f46004a.getMinFlingVelocity()) {
                z4 = true;
            }
            int halfwayPivotHorizontal = this.f46004a.getHalfwayPivotHorizontal();
            int halfwayPivotVertical = this.f46004a.getHalfwayPivotVertical();
            int dragEdge = this.f46004a.getDragEdge();
            if (dragEdge != 1) {
                if (dragEdge != 2) {
                    if (dragEdge != 4) {
                        if (dragEdge == 8) {
                            if (z3) {
                                this.f46004a.mo30963a(true);
                                return;
                            } else if (!z4) {
                                View view2 = this.f46004a.f45979a;
                                if (view2 == null) {
                                    C89219l.m154707a();
                                }
                                if (view2.getBottom() < halfwayPivotVertical) {
                                    this.f46004a.mo30963a(true);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!z3) {
                        if (z4) {
                            this.f46004a.mo30963a(true);
                            return;
                        }
                        View view3 = this.f46004a.f45979a;
                        if (view3 == null) {
                            C89219l.m154707a();
                        }
                        if (view3.getTop() >= halfwayPivotVertical) {
                            this.f46004a.mo30963a(true);
                            return;
                        }
                    }
                } else if (!z) {
                    if (z2) {
                        this.f46004a.mo30963a(true);
                        return;
                    }
                    View view4 = this.f46004a.f45979a;
                    if (view4 == null) {
                        C89219l.m154707a();
                    }
                    if (view4.getRight() < halfwayPivotHorizontal) {
                        this.f46004a.mo30963a(true);
                        return;
                    } else {
                        this.f46004a.mo30964b(true);
                        return;
                    }
                }
            } else if (z) {
                this.f46004a.mo30963a(true);
                return;
            } else if (!z2) {
                View view5 = this.f46004a.f45979a;
                if (view5 == null) {
                    C89219l.m154707a();
                }
                if (view5.getLeft() >= halfwayPivotHorizontal) {
                    this.f46004a.mo30963a(true);
                    return;
                }
            }
            this.f46004a.mo30964b(true);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0167  */
        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3037a(android.view.View r5, int r6, int r7, int r8, int r9) {
            /*
            // Method dump skipped, instructions count: 408
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.C19408a.C19412d.mo3037a(android.view.View, int, int, int, int):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.C19408a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                C89219l.m154709a((Object) childAt, "");
                i3 = Math.max(childAt.getMeasuredWidth(), i3);
                i4 = Math.max(childAt.getMeasuredHeight(), i4);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, mode2);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                C89219l.m154709a((Object) childAt2, "");
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(childAt2.getMeasuredWidth(), i3);
                i4 = Math.max(childAt2.getMeasuredHeight(), i4);
            }
            int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
            int paddingTop = i4 + getPaddingTop() + getPaddingBottom();
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(paddingLeft, size);
                } else {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(paddingTop, size2);
                } else {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int min;
        int min2;
        int min3;
        int min4;
        boolean z2;
        boolean z3;
        int i5 = 0;
        this.f45984f = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((i3 - getPaddingRight()) - i, i5);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((i4 - getPaddingBottom()) - i2, i5);
            C89219l.m154709a((Object) childAt, "");
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.height == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (layoutParams.width == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    measuredHeight = max2 - paddingTop;
                    if (layoutParams == null) {
                        C89219l.m154707a();
                    }
                    layoutParams.height = measuredHeight;
                }
                if (z3) {
                    measuredWidth = max - paddingLeft;
                    if (layoutParams == null) {
                        C89219l.m154707a();
                    }
                    layoutParams.width = measuredWidth;
                }
            }
            int i7 = this.f45992n;
            if (i7 != 1) {
                if (i7 == 2) {
                    min = Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, paddingLeft);
                    min2 = Math.min(getPaddingTop(), max2);
                    min3 = Math.max((i3 - getPaddingRight()) - i, paddingLeft);
                    min4 = Math.min(measuredHeight + getPaddingTop(), max2);
                } else if (i7 != 4) {
                    if (i7 != 8) {
                        min = 0;
                        min2 = 0;
                        min3 = 0;
                        min4 = 0;
                    } else {
                        min = Math.min(getPaddingLeft(), max);
                        min2 = Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, paddingTop);
                        min3 = Math.min(measuredWidth + getPaddingLeft(), max);
                        min4 = Math.max((i4 - getPaddingBottom()) - i2, paddingTop);
                    }
                }
                childAt.layout(min, min2, min3, min4);
                i6++;
                i5 = 0;
            }
            min = Math.min(getPaddingLeft(), max);
            min2 = Math.min(getPaddingTop(), max2);
            min3 = Math.min(measuredWidth + getPaddingLeft(), max);
            min4 = Math.min(measuredHeight + getPaddingTop(), max2);
            childAt.layout(min, min2, min3, min4);
            i6++;
            i5 = 0;
        }
        if (this.f45989k == 1) {
            int i8 = this.f45992n;
            if (i8 == 1) {
                View view = this.f45980b;
                if (view == null) {
                    C89219l.m154707a();
                }
                View view2 = this.f45980b;
                if (view2 == null) {
                    C89219l.m154707a();
                }
                view.offsetLeftAndRight(-view2.getWidth());
            } else if (i8 == 2) {
                View view3 = this.f45980b;
                if (view3 == null) {
                    C89219l.m154707a();
                }
                View view4 = this.f45980b;
                if (view4 == null) {
                    C89219l.m154707a();
                }
                view3.offsetLeftAndRight(view4.getWidth());
            } else if (i8 == 4) {
                View view5 = this.f45980b;
                if (view5 == null) {
                    C89219l.m154707a();
                }
                View view6 = this.f45980b;
                if (view6 == null) {
                    C89219l.m154707a();
                }
                view5.offsetTopAndBottom(-view6.getHeight());
            } else if (i8 == 8) {
                View view7 = this.f45980b;
                if (view7 == null) {
                    C89219l.m154707a();
                }
                View view8 = this.f45980b;
                if (view8 == null) {
                    C89219l.m154707a();
                }
                view7.offsetTopAndBottom(view8.getHeight());
            }
        }
        Rect rect = this.f45981c;
        View view9 = this.f45979a;
        if (view9 == null) {
            C89219l.m154707a();
        }
        int left = view9.getLeft();
        View view10 = this.f45979a;
        if (view10 == null) {
            C89219l.m154707a();
        }
        int top = view10.getTop();
        View view11 = this.f45979a;
        if (view11 == null) {
            C89219l.m154707a();
        }
        int right = view11.getRight();
        View view12 = this.f45979a;
        if (view12 == null) {
            C89219l.m154707a();
        }
        rect.set(left, top, right, view12.getBottom());
        Rect rect2 = this.f45998u;
        View view13 = this.f45980b;
        if (view13 == null) {
            C89219l.m154707a();
        }
        int left2 = view13.getLeft();
        View view14 = this.f45980b;
        if (view14 == null) {
            C89219l.m154707a();
        }
        int top2 = view14.getTop();
        View view15 = this.f45980b;
        if (view15 == null) {
            C89219l.m154707a();
        }
        int right2 = view15.getRight();
        View view16 = this.f45980b;
        if (view16 == null) {
            C89219l.m154707a();
        }
        rect2.set(left2, top2, right2, view16.getBottom());
        Rect rect3 = this.f45982d;
        int mainOpenLeft = getMainOpenLeft();
        int mainOpenTop = getMainOpenTop();
        int mainOpenLeft2 = getMainOpenLeft();
        View view17 = this.f45979a;
        if (view17 == null) {
            C89219l.m154707a();
        }
        int width = mainOpenLeft2 + view17.getWidth();
        int mainOpenTop2 = getMainOpenTop();
        View view18 = this.f45979a;
        if (view18 == null) {
            C89219l.m154707a();
        }
        rect3.set(mainOpenLeft, mainOpenTop, width, mainOpenTop2 + view18.getHeight());
        Rect rect4 = this.f45999v;
        int secOpenLeft = getSecOpenLeft();
        int secOpenTop = getSecOpenTop();
        int secOpenLeft2 = getSecOpenLeft();
        View view19 = this.f45980b;
        if (view19 == null) {
            C89219l.m154707a();
        }
        int width2 = secOpenLeft2 + view19.getWidth();
        int secOpenTop2 = getSecOpenTop();
        View view20 = this.f45980b;
        if (view20 == null) {
            C89219l.m154707a();
        }
        rect4.set(secOpenLeft, secOpenTop, width2, secOpenTop2 + view20.getHeight());
        if (this.f46000w) {
            mo30963a(false);
        } else {
            mo30964b(false);
        }
        View view21 = this.f45979a;
        if (view21 == null) {
            C89219l.m154707a();
        }
        this.f45990l = view21.getLeft();
        View view22 = this.f45979a;
        if (view22 == null) {
            C89219l.m154707a();
        }
        this.f45991m = view22.getTop();
        this.f45978A++;
    }
}
