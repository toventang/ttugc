package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1205n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.p2724cz.C40902a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78341g;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88303z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity */
public final class FTCVideoPublishPreviewActivity extends ActivityC33402b {

    /* renamed from: d */
    public static final C52753a f121398d = new C52753a((byte) 0);

    /* renamed from: h */
    private static final String f121399h = FTCVideoPublishPreviewActivity.class.getSimpleName();

    /* renamed from: e */
    private VideoPublishEditModel f121400e;

    /* renamed from: f */
    private C88303z f121401f;

    /* renamed from: g */
    private C1205n f121402g = new C1205n(this);

    /* renamed from: i */
    private HashMap f121403i;

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f121403i == null) {
            this.f121403i = new HashMap();
        }
        View view = (View) this.f121403i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121403i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$a */
    public static final class C52753a {
        static {
            Covode.recordClassIndex(62152);
        }

        private C52753a() {
        }

        public /* synthetic */ C52753a(byte b) {
            this();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f121402g;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        super.onBackPressed();
        mo88416g();
    }

    static {
        Covode.recordClassIndex(62151);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        this.f121402g.mo4017a(AbstractC1196i.EnumC1199b.DESTROYED);
        C88303z zVar = this.f121401f;
        if (zVar == null) {
            C89219l.m154710a("mPresenter");
        }
        zVar.mo142796b();
        super.onDestroy();
        C84412c.m145200a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: g */
    public final void mo88416g() {
        if (Build.VERSION.SDK_INT >= 21) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
            ofFloat.addUpdateListener(new C52754b(this));
            ofFloat.addListener(new C52755c(this));
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(100L);
            ofFloat.start();
            ((ImageView) mo59481d_(R.id.bs3)).bringToFront();
            ((ImageView) mo59481d_(R.id.bs3)).setAlpha(1.0f);
            ((ImageView) mo59481d_(R.id.bs3)).setVisibility(0);
            finishAfterTransition();
            return;
        }
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$d */
    public static final class C52756d extends C40902a {

        /* renamed from: a */
        public final ValueAnimator f121406a = ValueAnimator.ofFloat(0.0f, 1.0f);

        /* renamed from: b */
        final /* synthetic */ FTCVideoPublishPreviewActivity f121407b;

        static {
            Covode.recordClassIndex(62155);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$d$b */
        public static final class C52758b implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C52756d f121409a;

            static {
                Covode.recordClassIndex(62157);
            }

            public final void onAnimationCancel(Animator animator) {
                C89219l.m154721d(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                C89219l.m154721d(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                C89219l.m154721d(animator, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52758b(C52756d dVar) {
                this.f121409a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                ((ImageView) this.f121409a.f121407b.mo59481d_(R.id.bs3)).setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52756d(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f121407b = fTCVideoPublishPreviewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$d$a */
        static final class C52757a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C52756d f121408a;

            static {
                Covode.recordClassIndex(62156);
            }

            C52757a(C52756d dVar) {
                this.f121408a = dVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154721d(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((ImageView) this.f121408a.f121407b.mo59481d_(R.id.bs3)).setAlpha(((Float) animatedValue).floatValue());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40902a
        public final void onTransitionEnd(Transition transition) {
            C89219l.m154721d(transition, "");
            ((FTCPreviewSurfaceView) this.f121407b.mo59481d_(R.id.d5p)).bringToFront();
            ((FTCPreviewSurfaceView) this.f121407b.mo59481d_(R.id.d5p)).setVisibility(0);
            this.f121406a.end();
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40902a
        public final void onTransitionStart(Transition transition) {
            C89219l.m154721d(transition, "");
            this.f121406a.addUpdateListener(new C52757a(this));
            this.f121406a.addListener(new C52758b(this));
            ValueAnimator valueAnimator = this.f121406a;
            C89219l.m154716b(valueAnimator, "");
            valueAnimator.setDuration(300L);
            this.f121406a.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$c */
    public static final class C52755c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ FTCVideoPublishPreviewActivity f121405a;

        static {
            Covode.recordClassIndex(62154);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52755c(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f121405a = fTCVideoPublishPreviewActivity;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            ((FTCPreviewSurfaceView) this.f121405a.mo59481d_(R.id.d5p)).setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$e */
    static final class View$OnClickListenerC52759e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FTCVideoPublishPreviewActivity f121410a;

        static {
            Covode.recordClassIndex(62158);
        }

        View$OnClickListenerC52759e(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f121410a = fTCVideoPublishPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121410a.mo88416g();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity$b */
    public static final class C52754b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FTCVideoPublishPreviewActivity f121404a;

        static {
            Covode.recordClassIndex(62153);
        }

        C52754b(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f121404a = fTCVideoPublishPreviewActivity;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((FTCPreviewSurfaceView) this.f121404a.mo59481d_(R.id.d5p)).setAlpha(((Float) animatedValue).floatValue());
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.bc);
        C84412c.m145202a(this, getIntent(), bundle);
        C63244g.m114602a().mo73293u();
        Bitmap bitmap = VideoCoverBitmapHolder.f164604a;
        if (bitmap != null) {
            ((ImageView) mo59481d_(R.id.bs3)).setImageBitmap(bitmap);
        }
        C0792v.m2752a(mo59481d_(R.id.bs3), "transition_view_v1");
        C0792v.m2752a(mo59481d_(R.id.du1), "transition_view_v2");
        FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) mo59481d_(R.id.d5p);
        C89219l.m154716b(fTCPreviewSurfaceView, "");
        fTCPreviewSurfaceView.setVisibility(4);
        ((FTCPreviewSurfaceView) mo59481d_(R.id.d5p)).setOnClickListener(new View$OnClickListenerC52759e(this));
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.f121400e = (VideoPublishEditModel) serializableExtra;
        VideoPublishEditModel videoPublishEditModel = this.f121400e;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        this.f121401f = new C88303z(videoPublishEditModel.videoEditorType);
        this.f121402g.mo4017a(AbstractC1196i.EnumC1199b.STARTED);
        FTCPreviewSurfaceView fTCPreviewSurfaceView2 = (FTCPreviewSurfaceView) mo59481d_(R.id.d5p);
        C89219l.m154716b(fTCPreviewSurfaceView2, "");
        C88303z zVar = this.f121401f;
        if (zVar == null) {
            C89219l.m154710a("mPresenter");
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f121400e;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        C78341g.m136805a(this, this, fTCPreviewSurfaceView2, zVar, videoPublishEditModel2);
        C33398a aVar = C33398a.f79357a;
        View d_ = mo59481d_(R.id.d5p);
        VideoPublishEditModel videoPublishEditModel3 = this.f121400e;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        int intValue = C78341g.m136804a(videoPublishEditModel3).getFirst().intValue();
        VideoPublishEditModel videoPublishEditModel4 = this.f121400e;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        aVar.mo59450a(d_, intValue, C78341g.m136804a(videoPublishEditModel4).getSecond().intValue());
        C33398a aVar2 = C33398a.f79357a;
        View d_2 = mo59481d_(R.id.bs3);
        VideoPublishEditModel videoPublishEditModel5 = this.f121400e;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        int intValue2 = C78341g.m136804a(videoPublishEditModel5).getFirst().intValue();
        VideoPublishEditModel videoPublishEditModel6 = this.f121400e;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        aVar2.mo59450a(d_2, intValue2, C78341g.m136804a(videoPublishEditModel6).getSecond().intValue());
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            Window window = getWindow();
            C89219l.m154716b(window, "");
            window.setSharedElementEnterTransition(autoTransition);
            Window window2 = getWindow();
            C89219l.m154716b(window2, "");
            window2.setSharedElementExitTransition(autoTransition);
            autoTransition.addListener((Transition.TransitionListener) new C52756d(this));
            AutoTransition autoTransition2 = new AutoTransition();
            Window window3 = getWindow();
            C89219l.m154716b(window3, "");
            window3.setReturnTransition(autoTransition2);
        } else {
            FTCPreviewSurfaceView fTCPreviewSurfaceView3 = (FTCPreviewSurfaceView) mo59481d_(R.id.d5p);
            C89219l.m154716b(fTCPreviewSurfaceView3, "");
            fTCPreviewSurfaceView3.setVisibility(0);
            ((FTCPreviewSurfaceView) mo59481d_(R.id.d5p)).bringToFront();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", false);
    }
}
