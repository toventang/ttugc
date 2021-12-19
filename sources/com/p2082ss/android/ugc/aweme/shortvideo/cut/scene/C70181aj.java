package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45828d;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj */
public final class C70181aj extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: t */
    public static final C70182a f156925t = new C70182a((byte) 0);

    /* renamed from: a */
    public AbstractC70298bt f156926a;

    /* renamed from: b */
    public VECutVideoPresenter f156927b;

    /* renamed from: c */
    public SurfaceView f156928c;

    /* renamed from: d */
    public ImageView f156929d;

    /* renamed from: e */
    public FrameLayout f156930e;

    /* renamed from: f */
    public FrameLayout f156931f;

    /* renamed from: g */
    public VEVideoCutterViewModel f156932g;

    /* renamed from: h */
    public CutMultiVideoViewModel f156933h;

    /* renamed from: i */
    public VideoEditViewModel f156934i;

    /* renamed from: j */
    public CutVideoSpeedViewModel f156935j;

    /* renamed from: k */
    public final Handler f156936k = new Handler();

    /* renamed from: l */
    public final RunnableC70192j f156937l = new RunnableC70192j(this);

    /* renamed from: u */
    private CutVideoViewModel f156938u;

    /* renamed from: v */
    private CutVideoPreviewViewModel f156939v;

    /* renamed from: w */
    private CutVideoMultiBottomViewModel f156940w;

    static {
        Covode.recordClassIndex(82624);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$a */
    public static final class C70182a {
        static {
            Covode.recordClassIndex(82625);
        }

        private C70182a() {
        }

        public /* synthetic */ C70182a(byte b) {
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

    /* renamed from: C */
    public final int mo110836C() {
        SurfaceView surfaceView = this.f156928c;
        if (surfaceView == null) {
            C89219l.m154710a("videoSurface");
        }
        return surfaceView.getMeasuredHeight();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f156936k.removeCallbacks(this.f156937l);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$h */
    static final class RunnableC70190h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156948a;

        static {
            Covode.recordClassIndex(82633);
        }

        RunnableC70190h(C70181aj ajVar) {
            this.f156948a = ajVar;
        }

        public final void run() {
            CutVideoSpeedViewModel a = C70181aj.m123898a(this.f156948a);
            C70181aj ajVar = this.f156948a;
            a.mo110753b(ajVar.mo110841d(ajVar.mo110837D()));
        }
    }

    /* renamed from: D */
    public final int mo110837D() {
        FrameLayout frameLayout = this.f156930e;
        if (frameLayout == null) {
            C89219l.m154710a("videoLayout");
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    /* renamed from: b */
    public final SurfaceView mo110840b() {
        SurfaceView surfaceView = this.f156928c;
        if (surfaceView == null) {
            C89219l.m154710a("videoSurface");
        }
        return surfaceView;
    }

    /* renamed from: d */
    public final int mo110842d() {
        SurfaceView surfaceView = this.f156928c;
        if (surfaceView == null) {
            C89219l.m154710a("videoSurface");
        }
        return surfaceView.getMeasuredWidth();
    }

    /* renamed from: a */
    public final VECutVideoPresenter mo110838a() {
        VECutVideoPresenter vECutVideoPresenter = this.f156927b;
        if (vECutVideoPresenter == null) {
            C89219l.m154710a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$j */
    public static final class RunnableC70192j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156950a;

        static {
            Covode.recordClassIndex(82635);
        }

        public final void run() {
            AbstractC70078j jVar = this.f156950a.mo110838a().f156555f;
            if (jVar != null) {
                long a = jVar.mo110548a();
                if (a > 0) {
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.f156950a.f156933h;
                    if (cutMultiVideoViewModel == null) {
                        C89219l.m154710a("cutMultiVideoViewModel");
                    }
                    cutMultiVideoViewModel.mo110474a(a, C70181aj.m123902e(this.f156950a).mo111231j(), C70181aj.m123902e(this.f156950a).mo111233l());
                }
            }
            this.f156950a.f156936k.postDelayed(this, 30);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC70192j(C70181aj ajVar) {
            this.f156950a = ajVar;
        }
    }

    /* renamed from: a */
    public final void mo110839a(VECutVideoPresenter vECutVideoPresenter) {
        C89219l.m154721d(vECutVideoPresenter, "");
        this.f156927b = vECutVideoPresenter;
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoSpeedViewModel m123898a(C70181aj ajVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = ajVar.f156935j;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m123899b(C70181aj ajVar) {
        ImageView imageView = ajVar.f156929d;
        if (imageView == null) {
            C89219l.m154710a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m123900c(C70181aj ajVar) {
        FrameLayout frameLayout = ajVar.f156931f;
        if (frameLayout == null) {
            C89219l.m154710a("videoControlLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ FrameLayout m123901d(C70181aj ajVar) {
        FrameLayout frameLayout = ajVar.f156930e;
        if (frameLayout == null) {
            C89219l.m154710a("videoLayout");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public static final /* synthetic */ VideoEditViewModel m123902e(C70181aj ajVar) {
        VideoEditViewModel videoEditViewModel = ajVar.f156934i;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$i */
    static final class View$OnClickListenerC70191i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156949a;

        static {
            Covode.recordClassIndex(82634);
        }

        View$OnClickListenerC70191i(C70181aj ajVar) {
            this.f156949a = ajVar;
        }

        public final void onClick(View view) {
            C70576a aVar;
            ClickAgent.onClick(view);
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f156949a.f156932g;
            if (vEVideoCutterViewModel == null) {
                C89219l.m154710a("veVideoCutterViewModel");
            }
            if (this.f156949a.mo110838a().mo110490b()) {
                aVar = new C70576a(2);
            } else {
                aVar = new C70576a(1);
            }
            vEVideoCutterViewModel.mo111336a(aVar);
        }
    }

    /* renamed from: d */
    public final float mo110841d(int i) {
        FrameLayout frameLayout = this.f156930e;
        if (frameLayout == null) {
            C89219l.m154710a("videoLayout");
        }
        Context context = frameLayout.getContext();
        C89219l.m154716b(context, "");
        return (float) (((i - ((int) C45828d.m88452a(context, 32.0f))) / 2) + context.getResources().getDimensionPixelSize(R.dimen.qt));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$b */
    static final class C70183b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156941a;

        static {
            Covode.recordClassIndex(82626);
        }

        C70183b(C70181aj ajVar) {
            this.f156941a = ajVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            C70576a aVar = (C70576a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f157914d)) != null) {
                if (valueOf.intValue() == 1) {
                    if (this.f156941a.mo110838a().mo110490b()) {
                        C70181aj.m123899b(this.f156941a).setVisibility(8);
                        this.f156941a.f156936k.post(this.f156941a.f156937l);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (aVar.f157915e) {
                        C70181aj.m123899b(this.f156941a).setVisibility(0);
                    }
                    this.f156941a.f156936k.removeCallbacks(this.f156941a.f156937l);
                } else if (valueOf.intValue() == 3) {
                    this.f156941a.f156936k.removeCallbacks(this.f156941a.f156937l);
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f156933h = (CutMultiVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a2, "");
        this.f156934i = (VideoEditViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a3 = C1181ae.m3881a((ActivityC0945e) activity3, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a3, "");
        this.f156932g = (VEVideoCutterViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a4, "");
        this.f156939v = (CutVideoPreviewViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoMultiBottomViewModel.class);
        C89219l.m154716b(a5, "");
        this.f156940w = (CutVideoMultiBottomViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a6, "");
        this.f156935j = (CutVideoSpeedViewModel) a6;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f156932g;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo111335a().observe(this, new C70183b(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f156939v;
        if (cutVideoPreviewViewModel == null) {
            C89219l.m154710a("previewViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoPreviewViewModel, C70194al.f156952a, new C70186d(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f156939v;
        if (cutVideoPreviewViewModel2 == null) {
            C89219l.m154710a("previewViewModel");
        }
        selectNonNullSubscribe(cutVideoPreviewViewModel2, C70195am.f156953a, new C20370ah(), new C70187e(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.f156939v;
        if (cutVideoPreviewViewModel3 == null) {
            C89219l.m154710a("previewViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoPreviewViewModel3, C70196an.f156954a, new C70188f(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.f156939v;
        if (cutVideoPreviewViewModel4 == null) {
            C89219l.m154710a("previewViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoPreviewViewModel4, C70197ao.f156955a, new C70189g(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel5 = this.f156939v;
        if (cutVideoPreviewViewModel5 == null) {
            C89219l.m154710a("previewViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoPreviewViewModel5, C70193ak.f156951a, new C70184c(this));
        CutVideoViewModel cutVideoViewModel = this.f156938u;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            VideoEditViewModel videoEditViewModel = this.f156934i;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            if (videoEditViewModel.mo111235n()) {
                VideoEditViewModel videoEditViewModel2 = this.f156934i;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel2.mo111232k().get(0);
                int min = Math.min(videoSegment.f156714f, videoSegment.f156715g);
                int max = Math.max(videoSegment.f156714f, videoSegment.f156715g);
                C33398a aVar = C33398a.f79357a;
                SurfaceView surfaceView = this.f156928c;
                if (surfaceView == null) {
                    C89219l.m154710a("videoSurface");
                }
                aVar.mo59450a(surfaceView, min, max);
            }
        } else {
            CutVideoViewModel cutVideoViewModel2 = this.f156938u;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.mo110805i()) {
                FrameLayout frameLayout = this.f156931f;
                if (frameLayout == null) {
                    C89219l.m154710a("videoControlLayout");
                }
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += C70636dh.m124833c(this.f52549m);
                FrameLayout frameLayout2 = this.f156931f;
                if (frameLayout2 == null) {
                    C89219l.m154710a("videoControlLayout");
                }
                frameLayout2.setLayoutParams(layoutParams2);
                FrameLayout frameLayout3 = this.f156930e;
                if (frameLayout3 == null) {
                    C89219l.m154710a("videoLayout");
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin += C70636dh.m124833c(this.f52549m);
                FrameLayout frameLayout4 = this.f156930e;
                if (frameLayout4 == null) {
                    C89219l.m154710a("videoLayout");
                }
                frameLayout4.setLayoutParams(layoutParams4);
            }
            FrameLayout frameLayout5 = this.f156930e;
            if (frameLayout5 == null) {
                C89219l.m154710a("videoLayout");
            }
            frameLayout5.post(new RunnableC70190h(this));
        }
        SurfaceView surfaceView2 = this.f156928c;
        if (surfaceView2 == null) {
            C89219l.m154710a("videoSurface");
        }
        surfaceView2.setOnClickListener(new View$OnClickListenerC70191i(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$c */
    static final class C70184c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156942a;

        static {
            Covode.recordClassIndex(82627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70184c(C70181aj ajVar) {
            super(2);
            this.f156942a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C70181aj.m123900c(this.f156942a).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70181aj.C70184c.RunnableC701851 */

                /* renamed from: a */
                final /* synthetic */ C70184c f156943a;

                static {
                    Covode.recordClassIndex(82628);
                }

                {
                    this.f156943a = r1;
                }

                public final void run() {
                    float width = (float) C70181aj.m123901d(this.f156943a.f156942a).getWidth();
                    float height = (float) C70181aj.m123901d(this.f156943a.f156942a).getHeight();
                    float height2 = (float) C70181aj.m123900c(this.f156943a.f156942a).getHeight();
                    AbstractC70298bt btVar = this.f156943a.f156942a.f156926a;
                    if (btVar != null) {
                        btVar.mo110871a(width, height, height2);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$e */
    static final class C70187e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156945a;

        static {
            Covode.recordClassIndex(82630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70187e(C70181aj ajVar) {
            super(2);
            this.f156945a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f156945a.mo110840b().setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.arq, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$d */
    static final class C70186d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156944a;

        static {
            Covode.recordClassIndex(82629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70186d(C70181aj ajVar) {
            super(2);
            this.f156944a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f156944a.f156936k.removeCallbacks(this.f156944a.f156937l);
            this.f156944a.f156936k.post(this.f156944a.f156937l);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$f */
    static final class C70188f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156946a;

        static {
            Covode.recordClassIndex(82631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70188f(C70181aj ajVar) {
            super(2);
            this.f156946a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C33398a.f79357a.mo59450a(this.f156946a.mo110840b(), ((Number) pVar2.getFirst()).intValue(), ((Number) pVar2.getSecond()).intValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aj$g */
    static final class C70189g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70181aj f156947a;

        static {
            Covode.recordClassIndex(82632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70189g(C70181aj ajVar) {
            super(2);
            this.f156947a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C70181aj.m123900c(this.f156947a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin += intValue;
            C70181aj.m123900c(this.f156947a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C70181aj.m123901d(this.f156947a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin += intValue;
            C70181aj.m123901d(this.f156947a).setLayoutParams(layoutParams4);
            CutVideoSpeedViewModel a = C70181aj.m123898a(this.f156947a);
            C70181aj ajVar = this.f156947a;
            a.mo110753b(ajVar.mo110841d(ajVar.mo110837D()));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.fbt);
        C89219l.m154716b(c, "");
        this.f156928c = (SurfaceView) c;
        View c2 = mo36475c(R.id.bs2);
        C89219l.m154716b(c2, "");
        this.f156929d = (ImageView) c2;
        View c3 = mo36475c(R.id.fcz);
        C89219l.m154716b(c3, "");
        this.f156930e = (FrameLayout) c3;
        View c4 = mo36475c(R.id.fc7);
        C89219l.m154716b(c4, "");
        this.f156931f = (FrameLayout) c4;
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        CutVideoViewModel cutVideoViewModel = (CutVideoViewModel) a;
        this.f156938u = cutVideoViewModel;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity t = mo36486t();
            C89219l.m154716b(t, "");
            marginLayoutParams.topMargin = (int) C45828d.m88452a(t, 56.0f);
            CutVideoViewModel cutVideoViewModel2 = this.f156938u;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.mo110805i()) {
                marginLayoutParams.bottomMargin = mo36486t().getResources().getDimensionPixelSize(R.dimen.sy);
            } else {
                marginLayoutParams.topMargin += C70636dh.m124833c(this.f52549m);
                Activity t2 = mo36486t();
                C89219l.m154716b(t2, "");
                marginLayoutParams.bottomMargin = (int) C45828d.m88452a(t2, 270.0f);
            }
            view.setLayoutParams(marginLayoutParams);
        }
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
