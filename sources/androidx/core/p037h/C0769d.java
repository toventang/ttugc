package androidx.core.p037h;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.d */
public final class C0769d {

    /* renamed from: a */
    private final AbstractC0770a f2907a;

    /* renamed from: androidx.core.h.d$a */
    interface AbstractC0770a {
        static {
            Covode.recordClassIndex(851);
        }

        /* renamed from: a */
        void mo2894a();

        /* renamed from: a */
        void mo2895a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        boolean mo2896a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(850);
    }

    /* renamed from: androidx.core.h.d$c */
    static class C0773c implements AbstractC0770a {

        /* renamed from: a */
        private final GestureDetector f2933a;

        static {
            Covode.recordClassIndex(854);
        }

        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        public final void mo2894a() {
            this.f2933a.setIsLongpressEnabled(false);
        }

        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        public final void mo2895a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2933a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        public final boolean mo2896a(MotionEvent motionEvent) {
            return this.f2933a.onTouchEvent(motionEvent);
        }

        C0773c(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f2933a = new GestureDetector(context, onGestureListener, null);
        }
    }

    /* renamed from: a */
    public final void mo2891a() {
        this.f2907a.mo2894a();
    }

    /* renamed from: androidx.core.h.d$b */
    static class C0771b implements AbstractC0770a {

        /* renamed from: l */
        private static final int f2908l = ViewConfiguration.getLongPressTimeout();

        /* renamed from: m */
        private static final int f2909m = ViewConfiguration.getTapTimeout();

        /* renamed from: n */
        private static final int f2910n = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        final Handler f2911a = new HandlerC0772a();

        /* renamed from: b */
        final GestureDetector.OnGestureListener f2912b;

        /* renamed from: c */
        GestureDetector.OnDoubleTapListener f2913c;

        /* renamed from: d */
        boolean f2914d;

        /* renamed from: e */
        boolean f2915e;

        /* renamed from: f */
        boolean f2916f;

        /* renamed from: g */
        MotionEvent f2917g;

        /* renamed from: h */
        private int f2918h;

        /* renamed from: i */
        private int f2919i;

        /* renamed from: j */
        private int f2920j;

        /* renamed from: k */
        private int f2921k;

        /* renamed from: o */
        private boolean f2922o;

        /* renamed from: p */
        private boolean f2923p;

        /* renamed from: q */
        private MotionEvent f2924q;

        /* renamed from: r */
        private boolean f2925r;

        /* renamed from: s */
        private float f2926s;

        /* renamed from: t */
        private float f2927t;

        /* renamed from: u */
        private float f2928u;

        /* renamed from: v */
        private float f2929v;

        /* renamed from: w */
        private boolean f2930w;

        /* renamed from: x */
        private VelocityTracker f2931x;

        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        public final void mo2894a() {
            this.f2930w = false;
        }

        static {
            Covode.recordClassIndex(852);
        }

        /* renamed from: androidx.core.h.d$b$a */
        class HandlerC0772a extends Handler {
            static {
                Covode.recordClassIndex(853);
            }

            HandlerC0772a() {
            }

            public final void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0771b.this.f2912b.onShowPress(C0771b.this.f2917g);
                } else if (i == 2) {
                    C0771b bVar = C0771b.this;
                    bVar.f2911a.removeMessages(3);
                    bVar.f2915e = false;
                    bVar.f2916f = true;
                    bVar.f2912b.onLongPress(bVar.f2917g);
                } else if (i != 3) {
                    throw new RuntimeException("Unknown message ".concat(String.valueOf(message)));
                } else if (C0771b.this.f2913c == null) {
                } else {
                    if (!C0771b.this.f2914d) {
                        C0771b.this.f2913c.onSingleTapConfirmed(C0771b.this.f2917g);
                    } else {
                        C0771b.this.f2915e = true;
                    }
                }
            }
        }

        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        public final void mo2895a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2913c = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0252  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0269  */
        @Override // androidx.core.p037h.C0769d.AbstractC0770a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo2896a(android.view.MotionEvent r14) {
            /*
            // Method dump skipped, instructions count: 679
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.p037h.C0769d.C0771b.mo2896a(android.view.MotionEvent):boolean");
        }

        C0771b(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f2912b = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                this.f2913c = (GestureDetector.OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (onGestureListener != null) {
                this.f2930w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f2920j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f2921k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f2918h = scaledTouchSlop * scaledTouchSlop;
                this.f2919i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }
    }

    /* renamed from: a */
    public final void mo2892a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f2907a.mo2895a(onDoubleTapListener);
    }

    /* renamed from: a */
    public final boolean mo2893a(MotionEvent motionEvent) {
        return this.f2907a.mo2896a(motionEvent);
    }

    public C0769d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private C0769d(Context context, GestureDetector.OnGestureListener onGestureListener, byte b) {
        int i = Build.VERSION.SDK_INT;
        this.f2907a = new C0773c(context, onGestureListener);
    }
}
