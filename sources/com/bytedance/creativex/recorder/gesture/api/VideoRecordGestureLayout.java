package com.bytedance.creativex.recorder.gesture.api;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.p037h.C0769d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import java.lang.reflect.Field;

public class VideoRecordGestureLayout extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    AbstractC14312a f34668a;

    /* renamed from: b */
    C0769d f34669b;

    /* renamed from: c */
    ScaleGestureDetector f34670c;

    /* renamed from: d */
    C84885c f34671d;

    /* renamed from: e */
    C84882b f34672e;

    /* renamed from: f */
    float f34673f;

    /* renamed from: g */
    float f34674g;

    /* renamed from: h */
    float f34675h;

    /* renamed from: i */
    float f34676i;

    /* renamed from: j */
    boolean f34677j;

    /* renamed from: k */
    private C84885c.C84887b f34678k;

    /* renamed from: l */
    private C84882b.AbstractC84884b f34679l;

    /* renamed from: com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout$a */
    public interface AbstractC14312a {
        static {
            Covode.recordClassIndex(16385);
        }

        /* renamed from: a */
        void mo23041a(MotionEvent motionEvent, int[] iArr);

        /* renamed from: a */
        boolean mo23044a();

        /* renamed from: a */
        boolean mo23045a(float f);

        /* renamed from: a */
        boolean mo23046a(MotionEvent motionEvent);

        /* renamed from: a */
        boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: a */
        boolean mo23048a(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: a */
        boolean mo23049a(C84882b bVar);

        /* renamed from: a */
        boolean mo23050a(C84882b bVar, float f, float f2);

        /* renamed from: a */
        boolean mo23051a(C84885c cVar);

        /* renamed from: b */
        void mo23052b(MotionEvent motionEvent, int[] iArr);

        /* renamed from: b */
        void mo23053b(C84882b bVar);

        /* renamed from: b */
        boolean mo23054b();

        /* renamed from: b */
        boolean mo23055b(float f);

        /* renamed from: b */
        boolean mo23056b(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: b */
        boolean mo23058b(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: c */
        void mo23059c();

        /* renamed from: c */
        void mo23060c(MotionEvent motionEvent, int[] iArr);

        /* renamed from: c */
        boolean mo23061c(float f);

        /* renamed from: c */
        boolean mo23062c(MotionEvent motionEvent);

        /* renamed from: d */
        void mo23063d(MotionEvent motionEvent, int[] iArr);

        /* renamed from: d */
        boolean mo23064d(MotionEvent motionEvent);

        /* renamed from: e */
        void mo23066e(MotionEvent motionEvent, int[] iArr);

        /* renamed from: e */
        boolean mo23067e(MotionEvent motionEvent);

        /* renamed from: f */
        void mo23068f(MotionEvent motionEvent);
    }

    /* renamed from: com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout$b */
    public static abstract class AbstractC14313b implements AbstractC14312a {
        static {
            Covode.recordClassIndex(16386);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public void mo23041a(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23044a() {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23045a(float f) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23046a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23048a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23049a(C84882b bVar) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23050a(C84882b bVar, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: a */
        public boolean mo23051a(C84885c cVar) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public void mo23052b(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public void mo23053b(C84882b bVar) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public boolean mo23054b() {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public boolean mo23055b(float f) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public boolean mo23056b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: b */
        public boolean mo23058b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: c */
        public final void mo23059c() {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: c */
        public void mo23060c(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: c */
        public boolean mo23061c(float f) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: c */
        public boolean mo23062c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: d */
        public void mo23063d(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: d */
        public boolean mo23064d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: e */
        public void mo23066e(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: e */
        public boolean mo23067e(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
        /* renamed from: f */
        public void mo23068f(MotionEvent motionEvent) {
        }
    }

    static {
        Covode.recordClassIndex(16382);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public AbstractC14312a getOnGestureListener() {
        return this.f34668a;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.f34670c;
    }

    public void setOnGestureListener(AbstractC14312a aVar) {
        this.f34668a = aVar;
    }

    public void onLongPress(MotionEvent motionEvent) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar != null) {
            aVar.mo23059c();
        }
    }

    public void setSloppyExtra(int i) {
        this.f34671d.f189725o = i;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null || !aVar.mo23048a(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar != null) {
            aVar.mo23045a(this.f34673f);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null || !aVar.mo23046a(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null) {
            return false;
        }
        boolean b = aVar.mo23058b(scaleGestureDetector);
        if (b) {
            this.f34673f = scaleGestureDetector.getScaleFactor();
        }
        return b;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f34675h = motionEvent.getX();
        this.f34676i = motionEvent.getY();
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null || !aVar.mo23056b(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f34670c.onTouchEvent(motionEvent);
        this.f34671d.mo129681a(motionEvent);
        this.f34672e.mo129681a(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f34677j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f34677j = true;
        }
        if (!this.f34677j) {
            this.f34669b.mo2893a(motionEvent);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f34669b.mo2893a(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.f34668a == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f34675h;
        float y = motionEvent.getY() - this.f34676i;
        if ((x * x) + (y * y) >= this.f34674g) {
            return false;
        }
        float f = (float) i;
        if (motionEvent.getX() >= f && ((float) measuredWidth) - motionEvent.getX() >= f) {
            float f2 = (float) i2;
            if (motionEvent.getY() >= f2 && ((float) measuredHeight) - motionEvent.getY() >= f2) {
                return this.f34668a.mo23062c(motionEvent);
            }
        }
        return false;
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null) {
            return false;
        }
        aVar.mo23068f(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f34668a.mo23064d(motionEvent);
        } else if (action == 1 || action == 3) {
            this.f34668a.mo23067e(motionEvent);
        } else if (action == 5) {
            this.f34668a.mo23044a();
        } else if (action == 6) {
            this.f34668a.mo23054b();
        }
        return false;
    }

    private VideoRecordGestureLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(2523);
        this.f34673f = 1.0f;
        this.f34678k = new C84885c.C84887b() {
            /* class com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.C143101 */

            static {
                Covode.recordClassIndex(16383);
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: c */
            public final boolean mo23090c(C84885c cVar) {
                if (VideoRecordGestureLayout.this.f34668a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f34668a.mo23051a(cVar);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: a */
            public final boolean mo23088a(C84885c cVar) {
                float b = cVar.mo129684b();
                if (VideoRecordGestureLayout.this.f34668a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f34668a.mo23055b(b);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a, com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.C84887b
            /* renamed from: b */
            public final void mo23089b(C84885c cVar) {
                float b = cVar.mo129684b();
                if (VideoRecordGestureLayout.this.f34668a != null) {
                    VideoRecordGestureLayout.this.f34668a.mo23061c(b);
                }
            }
        };
        this.f34679l = new C84882b.AbstractC84884b() {
            /* class com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.C143112 */

            static {
                Covode.recordClassIndex(16384);
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: a */
            public final boolean mo23091a(C84882b bVar) {
                if (VideoRecordGestureLayout.this.f34668a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f34668a.mo23049a(bVar);
                return true;
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: b */
            public final void mo23093b(C84882b bVar) {
                if (VideoRecordGestureLayout.this.f34668a != null) {
                    VideoRecordGestureLayout.this.f34668a.mo23053b(bVar);
                }
            }

            @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
            /* renamed from: a */
            public final boolean mo23092a(C84882b bVar, float f, float f2) {
                if (VideoRecordGestureLayout.this.f34668a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f34668a.mo23050a(bVar, f, f2);
                return true;
            }
        };
        this.f34671d = new C84885c(context, this.f34678k);
        this.f34672e = new C84882b(context, this.f34679l);
        C0769d dVar = new C0769d(context, this);
        this.f34669b = dVar;
        dVar.mo2892a(this);
        this.f34670c = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f34674g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f34670c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f34670c)).intValue();
            Field declaredField2 = this.f34670c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f34670c, Integer.valueOf(intValue * 6));
            MethodCollector.m26664o(2523);
        } catch (Throwable unused) {
            MethodCollector.m26664o(2523);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC14312a aVar = this.f34668a;
        if (aVar == null || !aVar.mo23057b(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC14312a aVar;
        if (motionEvent == null || motionEvent2 == null || (aVar = this.f34668a) == null) {
            return false;
        }
        aVar.mo23047a(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
