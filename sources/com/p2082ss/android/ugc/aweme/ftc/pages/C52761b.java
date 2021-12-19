package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46104o;
import com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.C88303z;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.b */
public final class C52761b extends AbstractC0952i.AbstractC0954b {

    /* renamed from: a */
    final ActivityC0945e f121411a;

    /* renamed from: b */
    final C52765c f121412b;

    /* renamed from: c */
    final VideoPublishEditModel f121413c;

    /* renamed from: d */
    public final C88303z f121414d;

    /* renamed from: e */
    final AbstractC89171a<SurfaceView> f121415e;

    /* renamed from: f */
    private final AbstractC89171a<ImageView> f121416f;

    static {
        Covode.recordClassIndex(62160);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.b$a */
    static final class RunnableC52762a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52761b f121417a;

        /* renamed from: b */
        final /* synthetic */ Fragment f121418b;

        static {
            Covode.recordClassIndex(62161);
        }

        RunnableC52762a(C52761b bVar, Fragment fragment) {
            this.f121417a = bVar;
            this.f121418b = fragment;
        }

        public final void run() {
            int i;
            ActivityC0945e activity = this.f121418b.getActivity();
            if (!this.f121418b.isDetached() && activity != null && !activity.isFinishing()) {
                C52761b bVar = this.f121417a;
                C52765c cVar = (C52765c) this.f121418b;
                int d = C70636dh.m124835d(activity);
                bVar.f121414d.f200423w.mo56331b(C0643b.m2378c(bVar.f121411a, R.color.e));
                int e = C70636dh.m124836e(cVar.getActivity());
                int width = bVar.f121415e.invoke().getWidth();
                FrameLayout frameLayout = (FrameLayout) cVar.mo88434a(R.id.fbu);
                C89219l.m154716b(frameLayout, "");
                int measuredHeight = frameLayout.getMeasuredHeight();
                VESize b = bVar.f121414d.f200423w.mo56330b();
                float f = (float) b.height;
                float f2 = ((float) b.width) / f;
                float f3 = (float) width;
                float f4 = (float) measuredHeight;
                boolean z = false;
                if (f2 > f3 / f4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, (float) ((int) (f3 / f2)));
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(0L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new C52763b(bVar, f2, e, d, cVar));
                    ofFloat.start();
                } else {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, f4);
                    C89219l.m154716b(ofFloat2, "");
                    ofFloat2.setDuration(0L);
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat2.addUpdateListener(new C52764c(bVar, f2, width, cVar));
                    ofFloat2.start();
                }
                bVar.f121414d.f200423w.mo56311a(true);
                float f5 = ((float) b.width) / ((float) b.height);
                FrameLayout frameLayout2 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout2, "");
                int width2 = frameLayout2.getWidth();
                FrameLayout frameLayout3 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout3, "");
                int height = frameLayout3.getHeight();
                float f6 = (float) width2;
                float f7 = (float) height;
                FrameLayout frameLayout4 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout4, "");
                ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                float f8 = 1.0f;
                if (f5 > f6 / f7) {
                    layoutParams2.width = width2;
                    layoutParams2.height = ((int) (f6 / f5)) + 2;
                    i = (height * 9) / 16;
                } else {
                    float f9 = ((float) ((int) (f5 * f7))) / f6;
                    if (f9 != 0.0f && !Float.isNaN(f9) && !Float.isInfinite(f9)) {
                        f8 = f9;
                    }
                    layoutParams2.height = (int) (f7 / f8);
                    i = -1;
                    z = true;
                }
                FrameLayout frameLayout5 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout5, "");
                frameLayout5.setLayoutParams(layoutParams2);
                FrameLayout frameLayout6 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout6, "");
                frameLayout6.setScaleX(f8);
                FrameLayout frameLayout7 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout7, "");
                frameLayout7.setScaleY(f8);
                FrameLayout frameLayout8 = (FrameLayout) cVar.mo88434a(R.id.asx);
                C89219l.m154716b(frameLayout8, "");
                frameLayout8.setTag(new C46104o(z, f8, i));
                C52765c cVar2 = bVar.f121412b;
                cVar2.mo88440c((bVar.f121413c.mVideoCoverStartTm * 1000.0f) / ((float) bVar.f121414d.f200423w.mo56368j()));
                FTCChooseCoverView fTCChooseCoverView = (FTCChooseCoverView) cVar2.mo88434a(R.id.fbp);
                AbstractC52760a aVar = cVar2.f121428a;
                if (aVar == null) {
                    C89219l.m154710a("mDependency");
                }
                fTCChooseCoverView.f121500a.setX(aVar.mo88410c().getCoverPublishModel().getVideoCoverViewX());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.b$c */
    static final class C52764c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C52761b f121424a;

        /* renamed from: b */
        final /* synthetic */ float f121425b;

        /* renamed from: c */
        final /* synthetic */ int f121426c;

        /* renamed from: d */
        final /* synthetic */ C52765c f121427d;

        static {
            Covode.recordClassIndex(62163);
        }

        C52764c(C52761b bVar, float f, int i, C52765c cVar) {
            this.f121424a = bVar;
            this.f121425b = f;
            this.f121426c = i;
            this.f121427d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f = this.f121425b * floatValue;
            AbstractC31071f fVar = this.f121424a.f121414d.f200423w;
            int i = (int) ((((float) this.f121426c) - f) / 2.0f);
            int a = (int) (((float) this.f121427d.mo88433a()) * animatedFraction);
            int i2 = (int) f;
            int i3 = (int) floatValue;
            fVar.mo56303a(i, a, i2, i3);
            this.f121424a.mo88429a(a, i2, i3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.b$b */
    static final class C52763b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C52761b f121419a;

        /* renamed from: b */
        final /* synthetic */ float f121420b;

        /* renamed from: c */
        final /* synthetic */ int f121421c;

        /* renamed from: d */
        final /* synthetic */ int f121422d;

        /* renamed from: e */
        final /* synthetic */ C52765c f121423e;

        static {
            Covode.recordClassIndex(62162);
        }

        C52763b(C52761b bVar, float f, int i, int i2, C52765c cVar) {
            this.f121419a = bVar;
            this.f121420b = f;
            this.f121421c = i;
            this.f121422d = i2;
            this.f121423e = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C52765c cVar = this.f121423e;
            LinearLayout linearLayout = (LinearLayout) cVar.mo88434a(R.id.dgm);
            C89219l.m154716b(linearLayout, "");
            int measuredHeight = linearLayout.getMeasuredHeight();
            FrameLayout frameLayout = (FrameLayout) cVar.mo88434a(R.id.asw);
            C89219l.m154716b(frameLayout, "");
            int measuredHeight2 = (int) ((((((float) (this.f121421c - this.f121422d)) - (((float) ((measuredHeight + frameLayout.getMeasuredHeight()) + this.f121423e.mo88433a())) * animatedFraction)) - floatValue) / 2.0f) + ((float) this.f121423e.mo88433a()));
            int i = (int) (this.f121420b * floatValue);
            int i2 = (int) floatValue;
            this.f121419a.f121414d.f200423w.mo56303a(0, measuredHeight2, i, i2);
            this.f121419a.mo88429a(measuredHeight2, i, i2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentDetached(AbstractC0952i iVar, Fragment fragment) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(fragment, "");
        super.onFragmentDetached(iVar, fragment);
        if (fragment instanceof C52765c) {
            Intent intent = new Intent();
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) this.f121413c);
            this.f121411a.setResult(-1, intent);
            this.f121411a.finish();
        }
    }

    /* renamed from: a */
    public final void mo88429a(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.f121416f.invoke().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i;
        layoutParams2.width = i2;
        layoutParams2.height = i3;
        this.f121416f.invoke().setLayoutParams(layoutParams2);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentActivityCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(fragment, "");
        super.onFragmentActivityCreated(iVar, fragment, bundle);
        if (fragment instanceof C52765c) {
            if (!(this.f121414d.f200422v == null || (vEEditorAutoStartStopArbiter = this.f121414d.f200422v) == null)) {
                vEEditorAutoStartStopArbiter.mo142667a(true, false);
            }
            View view = fragment.getView();
            if (view != null) {
                view.postDelayed(new RunnableC52762a(this, fragment), 300);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends android.widget.ImageView> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends android.view.SurfaceView> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52761b(ActivityC0945e eVar, C52765c cVar, VideoPublishEditModel videoPublishEditModel, C88303z zVar, AbstractC89171a<? extends ImageView> aVar, AbstractC89171a<? extends SurfaceView> aVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f121411a = eVar;
        this.f121412b = cVar;
        this.f121413c = videoPublishEditModel;
        this.f121414d = zVar;
        this.f121416f = aVar;
        this.f121415e = aVar2;
    }
}
