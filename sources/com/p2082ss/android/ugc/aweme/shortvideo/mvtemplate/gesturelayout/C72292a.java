package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a */
public final class C72292a {

    /* renamed from: a */
    ScaleGestureDetector f162060a;

    /* renamed from: b */
    GestureDetector f162061b;

    /* renamed from: c */
    public GestureDetector$OnDoubleTapListenerC72293a f162062c;

    /* renamed from: d */
    boolean f162063d;

    /* renamed from: e */
    boolean f162064e;

    /* renamed from: f */
    boolean f162065f;

    /* renamed from: g */
    public MotionEvent f162066g;

    /* renamed from: h */
    private final GestureDetector.OnGestureListener f162067h;

    /* renamed from: i */
    private final ScaleGestureDetector.OnScaleGestureListener f162068i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$a */
    public static class GestureDetector$OnDoubleTapListenerC72293a implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
        static {
            Covode.recordClassIndex(84960);
        }

        /* renamed from: a */
        public void mo114521a() {
        }

        /* renamed from: a */
        public void mo114522a(int i) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            return false;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }
    }

    static {
        Covode.recordClassIndex(84959);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$b */
    public static final class GestureDetector$OnGestureListenerC72294b implements GestureDetector.OnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C72292a f162069a;

        static {
            Covode.recordClassIndex(84961);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        GestureDetector$OnGestureListenerC72294b(C72292a aVar) {
            this.f162069a = aVar;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar != null) {
                aVar.onLongPress(motionEvent);
            }
        }

        public final void onShowPress(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar != null) {
                aVar.onShowPress(motionEvent);
            }
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar != null) {
                return aVar.onDown(motionEvent);
            }
            return false;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar == null) {
                C89219l.m154715b();
            }
            return aVar.onSingleTapUp(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar != null) {
                return aVar.onFling(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162069a.f162062c;
            if (aVar != null) {
                return aVar.onScroll(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$c */
    public static final class ScaleGestureDetector$OnScaleGestureListenerC72295c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C72292a f162070a;

        static {
            Covode.recordClassIndex(84962);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ScaleGestureDetector$OnScaleGestureListenerC72295c(C72292a aVar) {
            this.f162070a = aVar;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162070a.f162062c;
            if (aVar != null) {
                aVar.onScaleEnd(scaleGestureDetector);
            }
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162070a.f162062c;
            if (aVar != null) {
                return aVar.onScale(scaleGestureDetector);
            }
            return false;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            if (this.f162070a.f162066g != null) {
                MotionEvent motionEvent = this.f162070a.f162066g;
                if (motionEvent == null) {
                    C89219l.m154715b();
                }
                if (motionEvent.getPointerCount() <= 1) {
                    return false;
                }
            }
            GestureDetector$OnDoubleTapListenerC72293a aVar = this.f162070a.f162062c;
            if (aVar == null) {
                C89219l.m154715b();
            }
            return aVar.onScaleBegin(scaleGestureDetector);
        }
    }

    public C72292a(Context context, GestureDetector$OnDoubleTapListenerC72293a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        GestureDetector$OnGestureListenerC72294b bVar = new GestureDetector$OnGestureListenerC72294b(this);
        this.f162067h = bVar;
        ScaleGestureDetector$OnScaleGestureListenerC72295c cVar = new ScaleGestureDetector$OnScaleGestureListenerC72295c(this);
        this.f162068i = cVar;
        this.f162062c = aVar;
        GestureDetector gestureDetector = new GestureDetector(context, bVar);
        this.f162061b = gestureDetector;
        gestureDetector.setOnDoubleTapListener(aVar);
        this.f162060a = new ScaleGestureDetector(context, cVar);
        int i = Build.VERSION.SDK_INT;
        ScaleGestureDetector scaleGestureDetector = this.f162060a;
        if (scaleGestureDetector == null) {
            C89219l.m154715b();
        }
        scaleGestureDetector.setQuickScaleEnabled(false);
        try {
            Field declaredField = ScaleGestureDetector.class.getDeclaredField("mMinSpan");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this.f162060a, 1);
        } catch (Throwable unused) {
        }
    }
}
