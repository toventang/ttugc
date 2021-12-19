package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70075h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractView$OnTouchListenerC70571l;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72449g;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n */
public final class C70333n extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: x */
    public static final C70334a f157209x = new C70334a((byte) 0);

    /* renamed from: A */
    private final boolean f157210A;

    /* renamed from: a */
    public C70242ba f157211a;

    /* renamed from: b */
    public VECutVideoPresenter f157212b;

    /* renamed from: c */
    public AbstractC70516a f157213c;

    /* renamed from: d */
    public TextView f157214d;

    /* renamed from: e */
    public FrameLayout f157215e;

    /* renamed from: f */
    public final C70576a f157216f;

    /* renamed from: g */
    public VideoEditViewModel f157217g;

    /* renamed from: h */
    public VEVideoCutterViewModel f157218h;

    /* renamed from: i */
    public CutVideoBottomBarViewModel f157219i;

    /* renamed from: j */
    public CutMultiVideoViewModel f157220j;

    /* renamed from: k */
    public CutVideoViewModel f157221k;

    /* renamed from: l */
    public CutVideoEditViewModel f157222l;

    /* renamed from: t */
    public CutVideoListViewModel f157223t;

    /* renamed from: u */
    public CutVideoSpeedViewModel f157224u;

    /* renamed from: v */
    public String f157225v;

    /* renamed from: w */
    public String f157226w;

    /* renamed from: y */
    private final boolean f157227y;

    /* renamed from: z */
    private final boolean f157228z;

    static {
        Covode.recordClassIndex(82776);
    }

    public C70333n() {
        this(false, false, 3);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$a */
    public static final class C70334a {
        static {
            Covode.recordClassIndex(82777);
        }

        private C70334a() {
        }

        public /* synthetic */ C70334a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: a */
    public final VECutVideoPresenter mo110953a() {
        VECutVideoPresenter vECutVideoPresenter = this.f157212b;
        if (vECutVideoPresenter == null) {
            C89219l.m154710a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: b */
    public final AbstractC70516a mo110956b() {
        AbstractC70516a aVar = this.f157213c;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$v */
    public static final class C70356v implements AbstractC70075h {

        /* renamed from: a */
        final /* synthetic */ C70333n f157250a;

        static {
            Covode.recordClassIndex(82799);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70075h
        /* renamed from: a */
        public final void mo110531a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new C70357a(this));
            C70333n.m124116c(this.f157250a).mo110652e(true);
            C70333n.m124121h(this.f157250a).setVisibility(8);
            ofFloat.start();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70356v(C70333n nVar) {
            this.f157250a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70075h
        /* renamed from: b */
        public final void mo110533b(float f) {
            TextView f2 = C70333n.m124119f(this.f157250a);
            Activity t = this.f157250a.mo36486t();
            C89219l.m154716b(t, "");
            f2.setText(C70563d.m124627a(t, f, this.f157250a.mo110956b().mo111107d()));
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$v$a */
        static final class C70357a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C70356v f157251a;

            static {
                Covode.recordClassIndex(82800);
            }

            C70357a(C70356v vVar) {
                this.f157251a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView f = C70333n.m124119f(this.f157251a.f157250a);
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f.setAlpha(((Float) animatedValue).floatValue());
                CutVideoBottomBarViewModel c = C70333n.m124116c(this.f157251a.f157250a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c.mo110648b(1.0f - ((Float) animatedValue2).floatValue());
                CutVideoSpeedViewModel g = C70333n.m124120g(this.f157251a.f157250a);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                g.mo110749a(1.0f - ((Float) animatedValue3).floatValue());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$v$b */
        static final class C70358b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C70356v f157252a;

            static {
                Covode.recordClassIndex(82801);
            }

            C70358b(C70356v vVar) {
                this.f157252a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView f = C70333n.m124119f(this.f157252a.f157250a);
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f.setAlpha(((Float) animatedValue).floatValue());
                CutVideoBottomBarViewModel c = C70333n.m124116c(this.f157252a.f157250a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c.mo110648b(1.0f - ((Float) animatedValue2).floatValue());
                CutVideoSpeedViewModel g = C70333n.m124120g(this.f157252a.f157250a);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                g.mo110749a(1.0f - ((Float) animatedValue3).floatValue());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70075h
        /* renamed from: a */
        public final void mo110532a(float f) {
            mo110533b(f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new C70358b(this));
            C70333n.m124116c(this.f157250a).mo110652e(false);
            C70333n.m124121h(this.f157250a).setVisibility(0);
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$n */
    static final class C70347n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157241a;

        static {
            Covode.recordClassIndex(82790);
        }

        C70347n(C70333n nVar) {
            this.f157241a = nVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$n$a */
        public static final class C70348a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C70347n f157242a;

            static {
                Covode.recordClassIndex(82791);
            }

            C70348a(C70347n nVar) {
                this.f157242a = nVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                this.f157242a.f157241a.mo110956b().setAlpha(1.0f);
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f157241a.mo110956b(), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(400L);
            ofFloat.addListener(new C70348a(this));
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo110954a(VECutVideoPresenter vECutVideoPresenter) {
        C89219l.m154721d(vECutVideoPresenter, "");
        this.f157212b = vECutVideoPresenter;
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoEditViewModel m124114a(C70333n nVar) {
        CutVideoEditViewModel cutVideoEditViewModel = nVar.f157222l;
        if (cutVideoEditViewModel == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoCutterViewModel m124115b(C70333n nVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = nVar.f157218h;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoBottomBarViewModel m124116c(C70333n nVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = nVar.f157219i;
        if (cutVideoBottomBarViewModel == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m124117d(C70333n nVar) {
        VideoEditViewModel videoEditViewModel = nVar.f157217g;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoListViewModel m124118e(C70333n nVar) {
        CutVideoListViewModel cutVideoListViewModel = nVar.f157223t;
        if (cutVideoListViewModel == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ TextView m124119f(C70333n nVar) {
        TextView textView = nVar.f157214d;
        if (textView == null) {
            C89219l.m154710a("selfAdaptionToast");
        }
        return textView;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutVideoSpeedViewModel m124120g(C70333n nVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = nVar.f157224u;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ FrameLayout m124121h(C70333n nVar) {
        FrameLayout frameLayout = nVar.f157215e;
        if (frameLayout == null) {
            C89219l.m154710a("selfAdaptionToastLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$b */
    static final class C70335b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157229a;

        static {
            Covode.recordClassIndex(82778);
        }

        C70335b(C70333n nVar) {
            this.f157229a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            CutVideoEditViewModel a = C70333n.m124114a(this.f157229a);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            a.f156782a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$f */
    static final class C70339f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157233a;

        static {
            Covode.recordClassIndex(82782);
        }

        C70339f(C70333n nVar) {
            this.f157233a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157233a).mo111336a(new C70576a(this.f157233a.mo110956b().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$g */
    static final class C70340g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157234a;

        static {
            Covode.recordClassIndex(82783);
        }

        C70340g(C70333n nVar) {
            this.f157234a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157234a).mo111336a(new C70576a(this.f157234a.mo110956b().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$o */
    static final class C70349o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157243a;

        static {
            Covode.recordClassIndex(82792);
        }

        C70349o(C70333n nVar) {
            this.f157243a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                C70333n.m124115b(this.f157243a).mo111336a(new C70576a(l.longValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$p */
    static final class C70350p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157244a;

        static {
            Covode.recordClassIndex(82793);
        }

        C70350p(C70333n nVar) {
            this.f157244a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124116c(this.f157244a).mo110645a(this.f157244a.mo110956b().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$c */
    static final class C70336c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157230a;

        static {
            Covode.recordClassIndex(82779);
        }

        C70336c(C70333n nVar) {
            this.f157230a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f157230a.f157216f.f157912b = this.f157230a.mo110956b().getPlayingPosition();
            C70333n.m124115b(this.f157230a).mo111336a(this.f157230a.f157216f);
            C70333n.m124116c(this.f157230a).mo110645a(this.f157230a.mo110956b().getSelectedTime());
            C70333n.m124114a(this.f157230a).mo110669b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$j */
    static final class C70343j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157237a;

        static {
            Covode.recordClassIndex(82786);
        }

        C70343j(C70333n nVar) {
            this.f157237a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                C70333n.m124115b(this.f157237a).mo111336a(new C70576a(this.f157237a.mo110956b().getPlayingPosition(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$m */
    static final class C70346m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157240a;

        static {
            Covode.recordClassIndex(82789);
        }

        C70346m(C70333n nVar) {
            this.f157240a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f157240a.mo110956b(), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(400L);
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$q */
    static final class C70351q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157245a;

        static {
            Covode.recordClassIndex(82794);
        }

        C70351q(C70333n nVar) {
            this.f157245a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157245a).mo111336a(new C70576a(this.f157245a.mo110956b().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
            C70333n.m124116c(this.f157245a).mo110645a(this.f157245a.mo110956b().getSelectedTime());
            C70333n.m124114a(this.f157245a).mo110669b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$r */
    static final class C70352r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157246a;

        static {
            Covode.recordClassIndex(82795);
        }

        C70352r(C70333n nVar) {
            this.f157246a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157246a).mo111336a(new C70576a(this.f157246a.mo110956b().getRightSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
            C70333n.m124116c(this.f157246a).mo110645a(this.f157246a.mo110956b().getSelectedTime());
            C70333n.m124114a(this.f157246a).mo110669b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$t */
    static final class C70354t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157248a;

        static {
            Covode.recordClassIndex(82797);
        }

        C70354t(C70333n nVar) {
            this.f157248a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157248a).mo111336a(new C70576a(this.f157248a.mo110956b().getRightSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            C70333n.m124116c(this.f157248a).mo110645a(this.f157248a.mo110956b().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$s */
    static final class C70353s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157247a;

        static {
            Covode.recordClassIndex(82796);
        }

        C70353s(C70333n nVar) {
            this.f157247a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C70333n.m124115b(this.f157247a).mo111336a(new C70576a(this.f157247a.mo110956b().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            C70333n.m124116c(this.f157247a).mo110645a(this.f157247a.mo110956b().getSelectedTime());
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f157247a.f157220j;
            if (cutMultiVideoViewModel == null) {
                C89219l.m154710a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.f156541m = this.f157247a.mo110956b().getLeftSeekingValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$u */
    static final class C70355u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157249a;

        static {
            Covode.recordClassIndex(82798);
        }

        C70355u(C70333n nVar) {
            this.f157249a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            CutVideoViewModel cutVideoViewModel = this.f157249a.f157221k;
            if (cutVideoViewModel == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (!cutVideoViewModel.mo110802b().f156845c) {
                C39162r.m79460a("upload_duration_adjust", new C84425b().mo129406a("creation_id", this.f157249a.f157226w).mo129406a("shoot_way", this.f157249a.f157225v).mo129406a("enter_from", "clip_edit_page").mo129406a("content_type", C70463h.m124285a(this.f157249a.mo110956b().mo111107d())).mo129403a("content_duration_ms", (int) (this.f157249a.mo110956b().getSelectedTime() * 1000.0f)).f188764a);
            }
        }
    }

    /* renamed from: a */
    public final void mo110955a(boolean z) {
        AbstractC70516a aVar = this.f157213c;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        aVar.setEditViewHeight(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$e */
    static final class C70338e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157232a;

        static {
            Covode.recordClassIndex(82781);
        }

        C70338e(C70333n nVar) {
            this.f157232a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            long singleSeekTime;
            Float f = (Float) obj;
            if (f != null) {
                float floatValue = f.floatValue();
                VECutVideoPresenter a = this.f157232a.mo110953a();
                int i = C70333n.m124118e(this.f157232a).f156789b;
                AbstractC70076i iVar = a.f156560k.f157495a;
                if (iVar != null) {
                    iVar.mo110545b(i, floatValue);
                }
                C0692e<Long, Long> playBoundary = this.f157232a.mo110956b().getPlayBoundary();
                C89219l.m154716b(playBoundary, "");
                if (!(playBoundary.f2750a == null || playBoundary.f2751b == null)) {
                    if (C70333n.m124114a(this.f157232a).f156782a == 1) {
                        singleSeekTime = this.f157232a.mo110956b().getMultiSeekTime();
                    } else {
                        singleSeekTime = this.f157232a.mo110956b().getSingleSeekTime();
                    }
                    VECutVideoPresenter a2 = this.f157232a.mo110953a();
                    C0692e<Long, Long> playBoundary2 = this.f157232a.mo110956b().getPlayBoundary();
                    C89219l.m154716b(playBoundary2, "");
                    a2.mo110485a(playBoundary2);
                    C70333n.m124115b(this.f157232a).mo111336a(new C70576a(singleSeekTime, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
                }
                C70333n.m124116c(this.f157232a).mo110645a(this.f157232a.mo110956b().getSelectedTime());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$d */
    static final class C70337d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70333n f157231a;

        static {
            Covode.recordClassIndex(82780);
        }

        C70337d(C70333n nVar) {
            this.f157231a = nVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            long singlePlayingPosition;
            VEImageTransformFilterParam a;
            if (this.f157231a.mo110956b() instanceof VEVideoEditViewV2) {
                C70333n.m124115b(this.f157231a).mo111336a(new C70576a(this.f157231a.mo110956b().getSingleSeekTime(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            } else {
                if (C70333n.m124114a(this.f157231a).f156782a == 1) {
                    singlePlayingPosition = this.f157231a.mo110956b().getMultiPlayingPosition();
                } else {
                    singlePlayingPosition = this.f157231a.mo110956b().getSinglePlayingPosition();
                }
                VECutVideoPresenter a2 = this.f157231a.mo110953a();
                C0692e<Long, Long> playBoundary = this.f157231a.mo110956b().getPlayBoundary();
                C89219l.m154716b(playBoundary, "");
                a2.mo110485a(playBoundary);
                C70333n.m124115b(this.f157231a).mo111336a(new C70576a(singlePlayingPosition, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            }
            C70333n.m124116c(this.f157231a).mo110645a(this.f157231a.mo110956b().getSelectedTime());
            C70333n.m124114a(this.f157231a).mo110669b();
            if (C70333n.m124114a(this.f157231a).f156782a == 2) {
                VECutVideoPresenter a3 = this.f157231a.mo110953a();
                VideoSegment videoSegment = C70333n.m124117d(this.f157231a).mo111232k().get(C70333n.m124118e(this.f157231a).f156789b);
                F f = this.f157231a.mo110956b().getPlayBoundary().f2750a;
                if (f == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(f, "");
                long longValue = f.longValue();
                S s = this.f157231a.mo110956b().getPlayBoundary().f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(s, "");
                long longValue2 = s.longValue();
                C72449g gVar = a3.f156561l;
                if (C70455f.f157420d && gVar.f162427a != null && videoSegment != null) {
                    gVar.mo114722a();
                    if (gVar.f162428b && C84896h.m145866a(videoSegment.mo110571a(false), true) && (a = C72449g.m127825a(videoSegment.f156725q)) != null) {
                        AbstractC31071f fVar = gVar.f162427a;
                        if (fVar == null) {
                            C89219l.m154715b();
                        }
                        int a4 = fVar.mo56264a(0, a, (int) longValue, (int) longValue2);
                        AbstractC31071f fVar2 = gVar.f162427a;
                        if (fVar2 == null) {
                            C89219l.m154715b();
                        }
                        fVar2.mo56263a(a4, a);
                        gVar.f162429c.add(Integer.valueOf(a4));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        VideoEditViewModel videoEditViewModel = this.f157217g;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel.f157677b.observe(this, new C70335b(this));
        VideoEditViewModel videoEditViewModel2 = this.f157217g;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel2.f157678c.observe(this, new C70343j(this));
        VideoEditViewModel videoEditViewModel3 = this.f157217g;
        if (videoEditViewModel3 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel3.f157680e.observe(this, new C70349o(this));
        VideoEditViewModel videoEditViewModel4 = this.f157217g;
        if (videoEditViewModel4 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel4.f157679d.observe(this, new C70350p(this));
        VideoEditViewModel videoEditViewModel5 = this.f157217g;
        if (videoEditViewModel5 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel5.f157682g.observe(this, new C70351q(this));
        VideoEditViewModel videoEditViewModel6 = this.f157217g;
        if (videoEditViewModel6 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel6.f157681f.observe(this, new C70352r(this));
        VideoEditViewModel videoEditViewModel7 = this.f157217g;
        if (videoEditViewModel7 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel7.f157683h.observe(this, new C70353s(this));
        VideoEditViewModel videoEditViewModel8 = this.f157217g;
        if (videoEditViewModel8 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel8.f157686k.observe(this, new C70354t(this));
        VideoEditViewModel videoEditViewModel9 = this.f157217g;
        if (videoEditViewModel9 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel9.f157695t.observe(this, new C70355u(this));
        VideoEditViewModel videoEditViewModel10 = this.f157217g;
        if (videoEditViewModel10 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel10.f157687l.observe(this, new C70336c(this));
        VideoEditViewModel videoEditViewModel11 = this.f157217g;
        if (videoEditViewModel11 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel11.f157688m.observe(this, new C70337d(this));
        VideoEditViewModel videoEditViewModel12 = this.f157217g;
        if (videoEditViewModel12 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel12.f157689n.observe(this, new C70338e(this));
        VideoEditViewModel videoEditViewModel13 = this.f157217g;
        if (videoEditViewModel13 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel13.f157684i.observe(this, new C70339f(this));
        VideoEditViewModel videoEditViewModel14 = this.f157217g;
        if (videoEditViewModel14 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel14.f157685j.observe(this, new C70340g(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f157222l;
        if (cutVideoEditViewModel == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoEditViewModel, C70359o.f157253a, new C70341h(this));
        CutVideoEditViewModel cutVideoEditViewModel2 = this.f157222l;
        if (cutVideoEditViewModel2 == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        selectNonNullSubscribe(cutVideoEditViewModel2, C70360p.f157254a, new C20370ah(), new C70342i(this));
        CutVideoEditViewModel cutVideoEditViewModel3 = this.f157222l;
        if (cutVideoEditViewModel3 == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoEditViewModel3, C70361q.f157255a, new C70344k(this));
        CutVideoEditViewModel cutVideoEditViewModel4 = this.f157222l;
        if (cutVideoEditViewModel4 == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoEditViewModel4, C70362r.f157256a, new C70345l(this));
        VideoEditViewModel videoEditViewModel15 = this.f157217g;
        if (videoEditViewModel15 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel15.f157696u.observe(this, new C70346m(this));
        VideoEditViewModel videoEditViewModel16 = this.f157217g;
        if (videoEditViewModel16 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel16.f157697v.observe(this, new C70347n(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$i */
    static final class C70342i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70333n f157236a;

        static {
            Covode.recordClassIndex(82785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70342i(C70333n nVar) {
            super(2);
            this.f157236a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f157236a.mo110956b().setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$k */
    static final class C70344k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70333n f157238a;

        static {
            Covode.recordClassIndex(82787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70344k(C70333n nVar) {
            super(2);
            this.f157238a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f157238a.mo110956b().mo111105a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$l */
    static final class C70345l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70333n f157239a;

        static {
            Covode.recordClassIndex(82788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70345l(C70333n nVar) {
            super(2);
            this.f157239a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f157239a.mo110956b().mo111108e();
            return C89391z.f203057a;
        }
    }

    public C70333n(boolean z, boolean z2) {
        boolean z3;
        this.f157228z = z;
        this.f157210A = z2;
        this.f157216f = new C70576a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing);
        if (!z || !C70983b.m125339a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f157227y = z3;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        if (this.f157227y) {
            View a = C1764a.m5927a(layoutInflater, R.layout.arl, viewGroup, false);
            C89219l.m154716b(a, "");
            return a;
        }
        View a2 = C1764a.m5927a(layoutInflater, R.layout.ark, viewGroup, false);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$h */
    static final class C70341h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70333n f157235a;

        static {
            Covode.recordClassIndex(82784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70341h(C70333n nVar) {
            super(2);
            this.f157235a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C0692e<Long, Long> playBoundary = this.f157235a.mo110956b().getPlayBoundary();
            C89219l.m154716b(playBoundary, "");
            C70242ba baVar = this.f157235a.f157211a;
            long j = 0;
            Long l = 0L;
            if (baVar != null && baVar.mo110881g()) {
                List<VideoSegment> k = C70333n.m124117d(this.f157235a).mo111232k();
                C89219l.m154716b(k, "");
                for (T t : k) {
                    if (!t.f156717i) {
                        C89219l.m154716b(t, "");
                        j += t.mo110580e() - t.mo110578d();
                    }
                }
                playBoundary = new C0692e<>(l, Long.valueOf(j));
            }
            this.f157235a.mo110953a().mo110485a(playBoundary);
            VEVideoCutterViewModel b = C70333n.m124115b(this.f157235a);
            F f = playBoundary.f2750a;
            if (f != null) {
                l = f;
            }
            C89219l.m154716b(l, "");
            b.mo111336a(new C70576a(l.longValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        boolean a;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157217g = (VideoEditViewModel) a2;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a3 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a3, "");
        this.f157218h = (VEVideoCutterViewModel) a3;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a4, "");
        this.f157219i = (CutVideoBottomBarViewModel) a4;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a5, "");
        this.f157221k = (CutVideoViewModel) a5;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a6 = C1181ae.m3881a((ActivityC0945e) activity5, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a6, "");
        this.f157220j = (CutMultiVideoViewModel) a6;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a7, "");
        this.f157222l = (CutVideoEditViewModel) a7;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = C20531t.m38716a((ActivityC0945e) activity7).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a8, "");
        this.f157223t = (CutVideoListViewModel) a8;
        Activity activity8 = this.f52549m;
        Objects.requireNonNull(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a9 = C20531t.m38716a((ActivityC0945e) activity8).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a9, "");
        this.f157224u = (CutVideoSpeedViewModel) a9;
        View c = mo36475c(R.id.fbq);
        C89219l.m154716b(c, "");
        AbstractC70516a aVar = (AbstractC70516a) c;
        this.f157213c = aVar;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        if ((aVar instanceof VEVideoEditViewV2) && this.f157210A) {
            int i = Build.VERSION.SDK_INT;
            AbstractC70516a aVar2 = this.f157213c;
            if (aVar2 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar2.setLayoutDirection(0);
        }
        CutVideoViewModel cutVideoViewModel = this.f157221k;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        C70155ad b = cutVideoViewModel.mo110802b();
        String str = b.f156844b;
        ArrayList<MediaModel> arrayList = b.f156843a;
        if (!TextUtils.isEmpty(str) || !arrayList.isEmpty()) {
            AbstractC70516a aVar3 = this.f157213c;
            if (aVar3 == null) {
                C89219l.m154710a("videoEditView");
            }
            C70983b.m125338a(aVar3);
            AbstractC70516a aVar4 = this.f157213c;
            if (aVar4 == null) {
                C89219l.m154710a("videoEditView");
            }
            boolean z = true;
            aVar4.f157702a = true;
            if (b.f156855m) {
                AbstractC70516a aVar5 = this.f157213c;
                if (aVar5 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar5.f157702a = false;
                AbstractC70516a aVar6 = this.f157213c;
                if (aVar6 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar6.setMaxVideoLength(b.f156856n);
            }
            if (b.f156845c) {
                AbstractC70516a aVar7 = this.f157213c;
                if (aVar7 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar7.f157702a = false;
                AbstractC70516a aVar8 = this.f157213c;
                if (aVar8 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar8.setMinVideoLength(1000);
                AbstractC70516a aVar9 = this.f157213c;
                if (aVar9 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar9.setMaxVideoLength(5000);
                AbstractC70516a aVar10 = this.f157213c;
                if (aVar10 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar10.setExtractFramesInRoughMode(false);
            } else {
                AbstractC70516a aVar11 = this.f157213c;
                if (aVar11 == null) {
                    C89219l.m154710a("videoEditView");
                }
                aVar11.setExtractFramesInRoughMode(true);
            }
            AbstractC70516a aVar12 = this.f157213c;
            if (aVar12 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar12.setExtractFramesInRoughMode(true);
            if (!TextUtils.isEmpty(str)) {
                AbstractC70516a aVar13 = this.f157213c;
                if (aVar13 == null) {
                    C89219l.m154710a("videoEditView");
                }
                Activity activity9 = this.f52549m;
                Objects.requireNonNull(activity9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar = (ActivityC0945e) activity9;
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f157220j;
                if (cutMultiVideoViewModel == null) {
                    C89219l.m154710a("cutMultiVideoViewModel");
                }
                a = aVar13.mo111140a(eVar, cutMultiVideoViewModel, str);
            } else {
                AbstractC70516a aVar14 = this.f157213c;
                if (aVar14 == null) {
                    C89219l.m154710a("videoEditView");
                }
                Activity activity10 = this.f52549m;
                Objects.requireNonNull(activity10, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar2 = (ActivityC0945e) activity10;
                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f157220j;
                if (cutMultiVideoViewModel2 == null) {
                    C89219l.m154710a("cutMultiVideoViewModel");
                }
                a = aVar14.mo111141a(eVar2, cutMultiVideoViewModel2, arrayList);
                AbstractC70516a aVar15 = this.f157213c;
                if (aVar15 == null) {
                    C89219l.m154710a("videoEditView");
                }
                if (arrayList.size() > 1) {
                    z = false;
                }
                aVar15.setEditViewHeight(z);
            }
            if (!a) {
                CutVideoViewModel cutVideoViewModel2 = this.f157221k;
                if (cutVideoViewModel2 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                cutVideoViewModel2.mo110800a();
            } else {
                CutVideoEditViewModel cutVideoEditViewModel = this.f157222l;
                if (cutVideoEditViewModel == null) {
                    C89219l.m154710a("cutVideoEditViewModel");
                }
                AbstractC70516a aVar16 = this.f157213c;
                if (aVar16 == null) {
                    C89219l.m154710a("videoEditView");
                }
                cutVideoEditViewModel.f156782a = aVar16.getEditState();
                CutVideoViewModel cutVideoViewModel3 = this.f157221k;
                if (cutVideoViewModel3 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                if (!cutVideoViewModel3.mo110803g()) {
                    VideoEditViewModel videoEditViewModel = this.f157217g;
                    if (videoEditViewModel == null) {
                        C89219l.m154710a("videoEditViewModel");
                    }
                    if (videoEditViewModel.mo111235n()) {
                        CutVideoViewModel cutVideoViewModel4 = this.f157221k;
                        if (cutVideoViewModel4 == null) {
                            C89219l.m154710a("cutVideoViewModel");
                        }
                        if (cutVideoViewModel4.mo110802b().f156855m) {
                            C70463h.f157437b = "prop_customized_video";
                        }
                        CutVideoViewModel cutVideoViewModel5 = this.f157221k;
                        if (cutVideoViewModel5 == null) {
                            C89219l.m154710a("cutVideoViewModel");
                        }
                        if (!cutVideoViewModel5.mo110802b().f156845c) {
                            VideoEditViewModel videoEditViewModel2 = this.f157217g;
                            if (videoEditViewModel2 == null) {
                                C89219l.m154710a("videoEditViewModel");
                            }
                            C70463h.m124292b(videoEditViewModel2.mo111232k());
                        }
                    } else {
                        CutVideoViewModel cutVideoViewModel6 = this.f157221k;
                        if (cutVideoViewModel6 == null) {
                            C89219l.m154710a("cutVideoViewModel");
                        }
                        cutVideoViewModel6.mo110800a();
                    }
                }
                this.f157226w = b.f156857o;
                this.f157225v = b.f156854l;
            }
        } else {
            CutVideoViewModel cutVideoViewModel7 = this.f157221k;
            if (cutVideoViewModel7 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            cutVideoViewModel7.mo110800a();
        }
        if (this.f157227y) {
            View c2 = mo36475c(R.id.dv0);
            C89219l.m154716b(c2, "");
            this.f157214d = (TextView) c2;
            View c3 = mo36475c(R.id.gg);
            C89219l.m154716b(c3, "");
            this.f157215e = (FrameLayout) c3;
            CutVideoViewModel cutVideoViewModel8 = this.f157221k;
            if (cutVideoViewModel8 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (!cutVideoViewModel8.mo110803g()) {
                Drawable a10 = C84916a.m145947a(0, 1459617792, 0, C71812ep.m126783a(2.0d, C63247i.f143610a));
                TextView textView = this.f157214d;
                if (textView == null) {
                    C89219l.m154710a("selfAdaptionToast");
                }
                textView.setBackground(a10);
            }
            AbstractC70516a aVar17 = this.f157213c;
            if (aVar17 == null) {
                C89219l.m154710a("videoEditView");
            }
            Objects.requireNonNull(aVar17, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2");
            ((AbstractView$OnTouchListenerC70571l) aVar17).setSelfAdaptiontoastAnimListener(new C70356v(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C70333n(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
