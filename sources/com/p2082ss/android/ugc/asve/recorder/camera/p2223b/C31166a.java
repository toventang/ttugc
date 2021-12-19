package com.p2082ss.android.ugc.asve.recorder.camera.p2223b;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.p037h.C0769d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31191d;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d;
import com.p2082ss.android.ugc.asve.recorder.view.C31259i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a */
public final class C31166a extends C31259i implements AbstractC31254d {

    /* renamed from: a */
    final Context f74718a;

    /* renamed from: b */
    final ASCameraView f74719b;

    /* renamed from: c */
    public final AbstractC31191d f74720c;

    /* renamed from: d */
    private boolean f74721d = true;

    /* renamed from: e */
    private final ScaleGestureDetector f74722e;

    /* renamed from: f */
    private final C0769d f74723f;

    static {
        Covode.recordClassIndex(37811);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.C31259i
    /* renamed from: a */
    public final boolean mo56711a() {
        if (!this.f74721d) {
            return false;
        }
        this.f74719b.mo56907a(C31031b.f74352b);
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56710a(boolean z) {
        this.f74721d = z;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$a */
    public static final class GestureDetector$OnDoubleTapListenerC31167a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C31166a f74724a;

        static {
            Covode.recordClassIndex(37812);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        GestureDetector$OnDoubleTapListenerC31167a(C31166a aVar) {
            this.f74724a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f74724a.mo56711a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            C31166a aVar = this.f74724a;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            AbstractC31185d c = aVar.f74720c.mo56545c();
            int width = aVar.f74719b.getPresentView().getWidth();
            int height = aVar.f74719b.getPresentView().getHeight();
            Resources resources = aVar.f74718a.getResources();
            C89219l.m154716b(resources, "");
            if (c.mo56660a(width, height, resources.getDisplayMetrics().density, new float[]{x, y})) {
                aVar.f74719b.getCameraViewHelper$lib_asve_release().mo56721a((int) x, (int) y);
                if (aVar.f74719b.getExposureCompensationEnable()) {
                    aVar.f74719b.mo56901a(x, y);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$b */
    public static final class ScaleGestureDetector$OnScaleGestureListenerC31168b implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C31166a f74725a;

        static {
            Covode.recordClassIndex(37813);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ScaleGestureDetector$OnScaleGestureListenerC31168b(C31166a aVar) {
            this.f74725a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            return this.f74725a.f74720c.mo56545c().mo56659a(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56709a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        this.f74722e.onTouchEvent(motionEvent);
        this.f74723f.mo2893a(motionEvent);
    }

    public C31166a(Context context, ASCameraView aSCameraView, AbstractC31191d dVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(dVar, "");
        this.f74718a = context;
        this.f74719b = aSCameraView;
        this.f74720c = dVar;
        this.f74722e = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC31168b(this));
        C0769d dVar2 = new C0769d(context, new GestureDetector.SimpleOnGestureListener());
        dVar2.mo2892a(new GestureDetector$OnDoubleTapListenerC31167a(this));
        this.f74723f = dVar2;
    }
}
