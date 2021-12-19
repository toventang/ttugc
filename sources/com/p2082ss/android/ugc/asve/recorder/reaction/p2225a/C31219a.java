package com.p2082ss.android.ugc.asve.recorder.reaction.p2225a;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0769d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d;
import com.p2082ss.android.ugc.asve.recorder.view.C31259i;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a */
public final class C31219a extends C31259i implements AbstractC31254d {

    /* renamed from: a */
    final ScaleGestureDetector f74820a;

    /* renamed from: b */
    final AbstractC31185d f74821b;

    /* renamed from: c */
    private boolean f74822c = true;

    /* renamed from: d */
    private final C84882b f74823d;

    /* renamed from: e */
    private final C0769d f74824e;

    /* renamed from: f */
    private final ASCameraView f74825f;

    /* renamed from: g */
    private final AbstractC31218a f74826g;

    /* renamed from: h */
    private final C31223b f74827h;

    static {
        Covode.recordClassIndex(37865);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.C31259i
    /* renamed from: a */
    public final boolean mo56711a() {
        if (!this.f74822c) {
            return false;
        }
        this.f74825f.mo56907a(C31031b.f74351a);
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31257g, com.p2082ss.android.ugc.asve.recorder.view.C31259i
    /* renamed from: b */
    public final void mo56859b() {
        View a = this.f74827h.mo56867a();
        if (a != null) {
            a.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56710a(boolean z) {
        this.f74822c = z;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$a */
    public static final class GestureDetector$OnDoubleTapListenerC31220a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C31219a f74828a;

        static {
            Covode.recordClassIndex(37866);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        GestureDetector$OnDoubleTapListenerC31220a(C31219a aVar) {
            this.f74828a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f74828a.mo56711a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            motionEvent.getX();
            motionEvent.getY();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$b */
    public static final class C31221b implements C84882b.AbstractC84884b {

        /* renamed from: a */
        final /* synthetic */ C31219a f74829a;

        static {
            Covode.recordClassIndex(37867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31221b(C31219a aVar) {
            this.f74829a = aVar;
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: b */
        public final void mo23093b(C84882b bVar) {
            C89219l.m154721d(bVar, "");
            this.f74829a.mo56859b();
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: a */
        public final boolean mo23091a(C84882b bVar) {
            C89219l.m154721d(bVar, "");
            return this.f74829a.mo56860b(bVar.f189709i.x, bVar.f189709i.y);
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: a */
        public final boolean mo23092a(C84882b bVar, float f, float f2) {
            C89219l.m154721d(bVar, "");
            return this.f74829a.mo56858a(f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$c */
    public static final class ScaleGestureDetector$OnScaleGestureListenerC31222c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C31219a f74830a;

        static {
            Covode.recordClassIndex(37868);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ScaleGestureDetector$OnScaleGestureListenerC31222c(C31219a aVar) {
            this.f74830a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C89219l.m154721d(scaleGestureDetector, "");
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            C31219a aVar = this.f74830a;
            return aVar.f74821b.mo56659a(currentSpan, aVar.f74820a.getScaleFactor());
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56709a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        this.f74823d.mo129681a(motionEvent);
        this.f74820a.onTouchEvent(motionEvent);
        this.f74824e.mo2893a(motionEvent);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31257g, com.p2082ss.android.ugc.asve.recorder.view.C31259i
    /* renamed from: b */
    public final boolean mo56860b(float f, float f2) {
        this.f74826g.mo56852a((int) f, (int) f2);
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31257g, com.p2082ss.android.ugc.asve.recorder.view.C31259i
    /* renamed from: a */
    public final boolean mo56858a(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = this.f74825f.getPresentView().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = Build.VERSION.SDK_INT;
        if (!this.f74826g.mo56853b((int) (f - ((float) Math.min(marginLayoutParams.getMarginStart(), marginLayoutParams.leftMargin))), (int) (f2 - ((float) marginLayoutParams.topMargin)))) {
            return false;
        }
        View a = this.f74827h.mo56867a();
        if (a == null) {
            return true;
        }
        a.setVisibility(0);
        return true;
    }

    public C31219a(Context context, ASCameraView aSCameraView, AbstractC31218a aVar, AbstractC31185d dVar, C31223b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f74825f = aSCameraView;
        this.f74826g = aVar;
        this.f74821b = dVar;
        this.f74827h = bVar;
        this.f74820a = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC31222c(this));
        this.f74823d = new C84882b(context, new C31221b(this));
        C0769d dVar2 = new C0769d(context, new GestureDetector.SimpleOnGestureListener());
        dVar2.mo2892a(new GestureDetector$OnDoubleTapListenerC31220a(this));
        this.f74824e = dVar2;
    }
}
