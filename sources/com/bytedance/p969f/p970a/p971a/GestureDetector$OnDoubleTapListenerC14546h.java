package com.bytedance.p969f.p970a.p971a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.p037h.C0769d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.f.a.a.h */
public final class GestureDetector$OnDoubleTapListenerC14546h extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    AbstractC14549a f35164a;

    /* renamed from: b */
    C0769d f35165b;

    /* renamed from: c */
    ScaleGestureDetector f35166c;

    /* renamed from: d */
    C84885c f35167d;

    /* renamed from: e */
    C84882b f35168e;

    /* renamed from: f */
    float f35169f;

    /* renamed from: g */
    float f35170g;

    /* renamed from: h */
    float f35171h;

    /* renamed from: i */
    float f35172i;

    /* renamed from: j */
    boolean f35173j;

    /* renamed from: k */
    private float f35174k;

    /* renamed from: l */
    private C84885c.C84887b f35175l;

    /* renamed from: m */
    private C84882b.AbstractC84884b f35176m;

    /* renamed from: com.bytedance.f.a.a.h$a */
    public interface AbstractC14549a {
        static {
            Covode.recordClassIndex(16636);
        }

        /* renamed from: a */
        boolean mo23389a();

        /* renamed from: a */
        boolean mo23390a(float f);

        /* renamed from: a */
        boolean mo23391a(MotionEvent motionEvent);

        /* renamed from: a */
        boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: a */
        boolean mo23393a(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: a */
        boolean mo23394a(C84882b bVar);

        /* renamed from: a */
        boolean mo23395a(C84882b bVar, float f, float f2);

        /* renamed from: a */
        boolean mo23396a(C84885c cVar);

        /* renamed from: b */
        void mo23397b(C84882b bVar);

        /* renamed from: b */
        boolean mo23398b();

        /* renamed from: b */
        boolean mo23399b(float f);

        /* renamed from: b */
        boolean mo23400b(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: b */
        boolean mo23402b(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: c */
        boolean mo23403c(float f);

        /* renamed from: c */
        boolean mo23404c(MotionEvent motionEvent);

        /* renamed from: d */
        boolean mo23405d(MotionEvent motionEvent);

        /* renamed from: e */
        void mo23381e(MotionEvent motionEvent);

        /* renamed from: f */
        boolean mo23406f(MotionEvent motionEvent);
    }

    /* renamed from: com.bytedance.f.a.a.h$b */
    public static abstract class AbstractC14550b implements AbstractC14549a {
        static {
            Covode.recordClassIndex(16637);
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public final boolean mo23389a() {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23390a(float f) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public final boolean mo23391a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23394a(C84882b bVar) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23395a(C84882b bVar, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: a */
        public boolean mo23396a(C84885c cVar) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public void mo23397b(C84882b bVar) {
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public final boolean mo23398b() {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public boolean mo23399b(float f) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public boolean mo23400b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: b */
        public boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: c */
        public boolean mo23403c(float f) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: c */
        public boolean mo23404c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: d */
        public final boolean mo23405d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: e */
        public void mo23381e(MotionEvent motionEvent) {
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
        /* renamed from: f */
        public boolean mo23406f(MotionEvent motionEvent) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(16633);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final AbstractC14549a getOnGestureListener() {
        return this.f35164a;
    }

    public final float getProtectY() {
        return this.f35174k;
    }

    public final ScaleGestureDetector getScaleGestureDetector() {
        return this.f35166c;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setOnGestureListener(AbstractC14549a aVar) {
        this.f35164a = aVar;
    }

    public GestureDetector$OnDoubleTapListenerC14546h(Context context) {
        this(context, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setSloppyExtra(int i) {
        this.f35167d.f189725o = i;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14549a aVar = this.f35164a;
        if (aVar == null || !aVar.mo23402b(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14549a aVar = this.f35164a;
        if (aVar != null) {
            aVar.mo23403c(this.f35169f);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        AbstractC14549a aVar = this.f35164a;
        if (aVar == null || !aVar.mo23404c(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setProtectY(float f) {
        this.f35174k = (f * 17.0f) / 20.0f;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14549a aVar = this.f35164a;
        if (aVar == null) {
            return false;
        }
        boolean a = aVar.mo23393a(scaleGestureDetector);
        if (a) {
            this.f35169f = scaleGestureDetector.getScaleFactor();
        }
        return a;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f35171h = motionEvent.getX();
        this.f35172i = motionEvent.getY();
        AbstractC14549a aVar = this.f35164a;
        if (aVar == null || !aVar.mo23405d(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f35166c.onTouchEvent(motionEvent);
        this.f35167d.mo129681a(motionEvent);
        this.f35168e.mo129681a(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f35173j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f35173j = true;
        }
        if (!this.f35173j) {
            this.f35165b.mo2893a(motionEvent);
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.f35164a == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f35171h;
        float y = motionEvent.getY() - this.f35172i;
        if ((x * x) + (y * y) >= this.f35170g) {
            return false;
        }
        float f = (float) i;
        if (motionEvent.getX() >= f && ((float) measuredWidth) - motionEvent.getX() >= f) {
            float f2 = (float) i2;
            if (motionEvent.getY() >= f2 && ((float) measuredHeight) - motionEvent.getY() >= f2) {
                return this.f35164a.mo23391a(motionEvent);
            }
        }
        return false;
    }

    private GestureDetector$OnDoubleTapListenerC14546h(Context context, byte b) {
        this(context, (char) 0);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f35164a == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35164a.mo23400b(motionEvent);
        } else if (action == 1) {
            this.f35164a.mo23406f(motionEvent);
        } else if (action == 3) {
            this.f35164a.mo23406f(motionEvent);
        } else if (action == 5) {
            this.f35164a.mo23389a();
        } else if (action == 6) {
            this.f35164a.mo23398b();
        }
        this.f35164a.mo23381e(motionEvent);
        return false;
    }

    private GestureDetector$OnDoubleTapListenerC14546h(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(1738);
        this.f35169f = 1.0f;
        this.f35174k = 1000.0f;
        this.f35175l = new C84885c.C84887b() {
            /* class com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.C145471 */

            static {
                Covode.recordClassIndex(16634);
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: c */
            public final boolean mo23090c(C84885c cVar) {
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a == null) {
                    return true;
                }
                GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23396a(cVar);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: a */
            public final boolean mo23088a(C84885c cVar) {
                float b = cVar.mo129684b();
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a == null) {
                    return true;
                }
                GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23390a(b);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: b */
            public final void mo23089b(C84885c cVar) {
                float b = cVar.mo129684b();
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a != null) {
                    GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23399b(b);
                }
            }
        };
        this.f35176m = new C84882b.AbstractC84884b() {
            /* class com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.C145482 */

            static {
                Covode.recordClassIndex(16635);
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: a */
            public final boolean mo23091a(C84882b bVar) {
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a == null) {
                    return true;
                }
                GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23394a(bVar);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: b */
            public final void mo23093b(C84882b bVar) {
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a != null) {
                    GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23397b(bVar);
                }
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: a */
            public final boolean mo23092a(C84882b bVar, float f, float f2) {
                if (GestureDetector$OnDoubleTapListenerC14546h.this.f35164a == null) {
                    return true;
                }
                GestureDetector$OnDoubleTapListenerC14546h.this.f35164a.mo23395a(bVar, f, f2);
                return true;
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f35167d = new C84885c(applicationContext, this.f35175l);
        this.f35168e = new C84882b(applicationContext, this.f35176m);
        C0769d dVar = new C0769d(applicationContext, this);
        this.f35165b = dVar;
        dVar.mo2891a();
        this.f35165b.mo2892a(this);
        this.f35166c = new ScaleGestureDetector(applicationContext, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f35170g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f35166c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f35166c)).intValue();
            Field declaredField2 = this.f35166c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f35166c, Integer.valueOf(intValue * 6));
            MethodCollector.m26664o(1738);
        } catch (Throwable unused) {
            MethodCollector.m26664o(1738);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC14549a aVar = this.f35164a;
        if (aVar == null || !aVar.mo23392a(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC14549a aVar;
        if (motionEvent == null || motionEvent2 == null || (aVar = this.f35164a) == null) {
            return false;
        }
        aVar.mo23401b(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
