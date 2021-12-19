package com.p2082ss.android.ugc.asve.recorder.camera.p2223b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.utils.C30744a;
import com.p2082ss.android.ugc.asve.context.AbstractC31034c;
import com.p2082ss.android.ugc.asve.p2217f.C31096d;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.p2217f.C31100h;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b */
public final class C31169b {

    /* renamed from: a */
    public boolean f74726a;

    /* renamed from: b */
    public boolean f74727b;

    /* renamed from: c */
    public final C31180d f74728c;

    /* renamed from: d */
    public final ImageView f74729d;

    /* renamed from: e */
    public boolean f74730e;

    /* renamed from: f */
    public final ASCameraView f74731f;

    /* renamed from: g */
    private int f74732g;

    /* renamed from: h */
    private int f74733h;

    /* renamed from: i */
    private final AbstractC89244h f74734i = C89250i.m154773a((AbstractC89171a) new C31170a(this));

    /* renamed from: j */
    private final AbstractC89244h f74735j = C89250i.m154773a((AbstractC89171a) new C31171b(this));

    /* renamed from: k */
    private final AbstractC89244h f74736k = C89250i.m154773a((AbstractC89171a) new C31172c(this));

    /* renamed from: l */
    private final Context f74737l;

    /* renamed from: m */
    private final AbstractC31034c f74738m;

    static {
        Covode.recordClassIndex(37814);
    }

    /* renamed from: a */
    public final AnimatorSet mo56718a() {
        return (AnimatorSet) this.f74734i.getValue();
    }

    /* renamed from: b */
    public final AnimatorSet mo56722b() {
        return (AnimatorSet) this.f74735j.getValue();
    }

    /* renamed from: c */
    public final AnimatorSet mo56723c() {
        return (AnimatorSet) this.f74736k.getValue();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$b */
    static final class C31171b extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C31169b f74740a;

        static {
            Covode.recordClassIndex(37816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31171b(C31169b bVar) {
            super(0);
            this.f74740a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            C31169b bVar = this.f74740a;
            return bVar.mo56719a(bVar.f74728c);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$c */
    static final class C31172c extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C31169b f74741a;

        static {
            Covode.recordClassIndex(37817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31172c(C31169b bVar) {
            super(0);
            this.f74741a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            C31169b bVar = this.f74741a;
            return bVar.mo56719a(bVar.f74729d);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$e */
    public static final class C31175e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C31169b f74745a;

        static {
            Covode.recordClassIndex(37820);
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$e$a */
        static final class C31176a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31175e f74746a;

            static {
                Covode.recordClassIndex(37821);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31176a(C31175e eVar) {
                super(0);
                this.f74746a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f74746a.f74745a.f74731f.removeView(this.f74746a.f74745a.f74729d);
                this.f74746a.f74745a.f74726a = false;
                this.f74746a.f74745a.f74730e = false;
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31175e(C31169b bVar) {
            this.f74745a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f74745a.f74730e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            C31098f.m64301a(new C31176a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$d */
    public static final class C31173d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C31169b f74742a;

        /* renamed from: b */
        final /* synthetic */ View f74743b;

        static {
            Covode.recordClassIndex(37818);
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$d$a */
        static final class C31174a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31173d f74744a;

            static {
                Covode.recordClassIndex(37819);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31174a(C31173d dVar) {
                super(0);
                this.f74744a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f74744a.f74742a.f74731f.removeView(this.f74744a.f74743b);
                if (this.f74744a.f74743b instanceof ImageView) {
                    this.f74744a.f74742a.f74726a = false;
                } else {
                    this.f74744a.f74742a.f74727b = false;
                }
                return C89391z.f203057a;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            C31098f.m64301a(new C31174a(this));
        }

        C31173d(C31169b bVar, View view) {
            this.f74742a = bVar;
            this.f74743b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$f */
    public static final class C31177f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C31169b f74747a;

        static {
            Covode.recordClassIndex(37822);
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$f$a */
        static final class C31178a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31177f f74748a;

            static {
                Covode.recordClassIndex(37823);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31178a(C31177f fVar) {
                super(0);
                this.f74748a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f74748a.f74747a.f74731f.removeView(this.f74748a.f74747a.f74729d);
                if (this.f74748a.f74747a.f74727b) {
                    this.f74748a.f74747a.f74731f.removeView(this.f74748a.f74747a.f74728c);
                    this.f74748a.f74747a.f74727b = false;
                }
                this.f74748a.f74747a.f74726a = false;
                this.f74748a.f74747a.f74730e = false;
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31177f(C31169b bVar) {
            this.f74747a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f74747a.f74730e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            C31098f.m64301a(new C31178a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$a */
    static final class C31170a extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C31169b f74739a;

        static {
            Covode.recordClassIndex(37815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31170a(C31169b bVar) {
            super(0);
            this.f74739a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            C31169b bVar = this.f74739a;
            AnimatorSet animatorSet = new AnimatorSet();
            if (!bVar.f74731f.getExposureCompensationEnable()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f74729d, View.SCALE_X, 1.0f, 1.1f, 0.95f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f74729d, View.SCALE_Y, 1.0f, 1.1f, 0.95f);
                ofFloat.addListener(new C31175e(bVar));
                C89219l.m154716b(ofFloat, "");
                ofFloat.setInterpolator(new C30744a());
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setInterpolator(new C30744a());
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(1500L);
            } else {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar.f74729d, View.SCALE_X, 1.2f, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar.f74729d, View.SCALE_Y, 1.2f, 1.0f);
                ofFloat3.addListener(new C31177f(bVar));
                C89219l.m154716b(ofFloat3, "");
                ofFloat3.setInterpolator(new C31179c());
                C89219l.m154716b(ofFloat4, "");
                ofFloat4.setInterpolator(new C31179c());
                animatorSet.playTogether(ofFloat3, ofFloat4);
                animatorSet.setDuration(1000L);
            }
            return animatorSet;
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo56719a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.5f);
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(1000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.5f, 0.5f);
        C89219l.m154716b(ofFloat3, "");
        ofFloat3.setDuration(500L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.5f, 0.0f);
        C89219l.m154716b(ofFloat4, "");
        ofFloat4.setDuration(500L);
        ofFloat4.addListener(new C31173d(this, view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo56721a(int i, int i2) {
        if (!this.f74726a || this.f74731f.getExposureCompensationEnable()) {
            ImageView imageView = this.f74729d;
            imageView.setImageResource(this.f74738m.mo56147j());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f74729d.setLayoutParams(m64586b(i, i2));
            if (this.f74726a) {
                if (this.f74730e) {
                    mo56718a().end();
                } else {
                    mo56723c().end();
                }
            }
            this.f74731f.removeView(this.f74729d);
            this.f74729d.setAlpha(1.0f);
            this.f74731f.addView(this.f74729d);
            mo56718a().start();
            this.f74726a = true;
        }
    }

    /* renamed from: b */
    private final FrameLayout.LayoutParams m64586b(int i, int i2) {
        int a = (int) C31100h.m64302a(this.f74737l, 65.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.leftMargin = (int) (((float) i) - (C31100h.m64302a(this.f74737l, 60.0f) / 2.0f));
        if (C31096d.m64298a(this.f74737l)) {
            layoutParams.rightMargin = (C31100h.m64303a(this.f74737l) - layoutParams.leftMargin) - a;
        }
        layoutParams.topMargin = i2 - (((int) C31100h.m64302a(this.f74737l, 60.0f)) / 2);
        if (layoutParams.leftMargin > C31100h.m64303a(this.f74737l) - a) {
            layoutParams.leftMargin = C31100h.m64303a(this.f74737l) - a;
        }
        if (C31096d.m64298a(this.f74737l) && layoutParams.rightMargin > C31100h.m64303a(this.f74737l) - a) {
            layoutParams.rightMargin = C31100h.m64303a(this.f74737l) - a;
        }
        if (layoutParams.leftMargin < 0) {
            layoutParams.leftMargin = 0;
        }
        if (C31096d.m64298a(this.f74737l) && layoutParams.rightMargin < 0) {
            layoutParams.rightMargin = 0;
        }
        if (layoutParams.topMargin > C31100h.m64304b(this.f74737l) - a) {
            layoutParams.topMargin = C31100h.m64304b(this.f74737l) - a;
        }
        if (layoutParams.topMargin < 0) {
            layoutParams.topMargin = 0;
        }
        return layoutParams;
    }

    /* renamed from: a */
    public final void mo56720a(float f, float f2) {
        float a;
        if (this.f74727b) {
            mo56722b().end();
        }
        this.f74731f.removeView(this.f74728c);
        if (f > ((float) C31100h.m64303a(this.f74737l)) - C31100h.m64302a(this.f74737l, 64.0f)) {
            a = f - C31100h.m64302a(this.f74737l, 51.5f);
        } else {
            a = f + C31100h.m64302a(this.f74737l, 51.5f);
        }
        double d = (double) this.f74732g;
        double seekBarTotalLength = (double) this.f74728c.getSeekBarTotalLength();
        Double.isNaN(seekBarTotalLength);
        Double.isNaN(d);
        double d2 = d + (seekBarTotalLength * 0.5d);
        double d3 = (double) (this.f74732g + this.f74733h);
        double seekBarTotalLength2 = (double) this.f74728c.getSeekBarTotalLength();
        Double.isNaN(seekBarTotalLength2);
        Double.isNaN(d3);
        double d4 = d3 - (seekBarTotalLength2 * 0.5d);
        double d5 = (double) f2;
        if (d5 >= d2 && d5 <= d4) {
            float[] fArr = {a, f2};
            this.f74727b = true;
            C31180d dVar = this.f74728c;
            float f3 = fArr[0];
            float f4 = fArr[1];
            dVar.f74753a = f3;
            dVar.f74754b = f4;
            C31180d dVar2 = this.f74728c;
            dVar2.f74756d = false;
            dVar2.f74755c = 0.5f;
            dVar2.invalidate();
            this.f74728c.setAlpha(1.0f);
            this.f74731f.setExposureCompensation(0);
            this.f74731f.addView(this.f74728c);
        }
    }

    public C31169b(Context context, ASCameraView aSCameraView, AbstractC31034c cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(cVar, "");
        MethodCollector.m26663i(4470);
        this.f74737l = context;
        this.f74731f = aSCameraView;
        this.f74738m = cVar;
        this.f74728c = new C31180d(context, (byte) 0);
        this.f74729d = new ImageView(context);
        MethodCollector.m26664o(4470);
    }
}
