package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2363ba.C34412d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70094o;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70433c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70484n;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70410e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointSingleVideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71587b;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71588c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s */
public final class C70363s extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: W */
    public static final C70364a f157257W = new C70364a((byte) 0);

    /* renamed from: A */
    public CutVideoTitleBarViewModel f157258A;

    /* renamed from: B */
    public CutVideoEditViewModel f157259B;

    /* renamed from: C */
    public CutVideoListViewModel f157260C;

    /* renamed from: D */
    public CutVideoStickerPointMusicViewModel f157261D;

    /* renamed from: E */
    public CutVideoMultiModeViewModel f157262E;

    /* renamed from: F */
    public long f157263F;

    /* renamed from: G */
    public final AbstractC70300bv f157264G = new C70280bl();

    /* renamed from: H */
    public boolean f157265H;

    /* renamed from: I */
    public boolean f157266I;

    /* renamed from: J */
    float f157267J = 1.0f;

    /* renamed from: K */
    float f157268K;

    /* renamed from: L */
    float f157269L;

    /* renamed from: M */
    public View f157270M;

    /* renamed from: N */
    public C0692e<Integer, Integer> f157271N;

    /* renamed from: O */
    public AnimatorSet f157272O;

    /* renamed from: P */
    public boolean f157273P;

    /* renamed from: Q */
    public int f157274Q;

    /* renamed from: R */
    public boolean f157275R = true;

    /* renamed from: S */
    public boolean f157276S;

    /* renamed from: T */
    public boolean f157277T = true;

    /* renamed from: U */
    public AbstractC70229av f157278U;

    /* renamed from: V */
    public C71588c f157279V;

    /* renamed from: X */
    private CutVideoViewModel f157280X;

    /* renamed from: Y */
    private CutVideoPreviewViewModel f157281Y;

    /* renamed from: a */
    public C70582z f157282a;

    /* renamed from: b */
    public C70242ba f157283b;

    /* renamed from: c */
    public VECutVideoPresenter f157284c;

    /* renamed from: d */
    public RecyclerView f157285d;

    /* renamed from: e */
    public AbstractC70297bs f157286e;

    /* renamed from: f */
    public TextView f157287f;

    /* renamed from: g */
    public View f157288g;

    /* renamed from: h */
    public StickPointVideoSegView f157289h;

    /* renamed from: i */
    FrameLayout f157290i;

    /* renamed from: j */
    public ImageView f157291j;

    /* renamed from: k */
    public ImageView f157292k;

    /* renamed from: l */
    public TextView f157293l;

    /* renamed from: t */
    public FrameLayout f157294t;

    /* renamed from: u */
    public StickPointSingleVideoEditView f157295u;

    /* renamed from: v */
    public CutMultiVideoViewModel f157296v;

    /* renamed from: w */
    public VideoEditViewModel f157297w;

    /* renamed from: x */
    public VEVideoCutterViewModel f157298x;

    /* renamed from: y */
    public CutVideoSpeedViewModel f157299y;

    /* renamed from: z */
    public CutVideoBottomBarViewModel f157300z;

    static {
        Covode.recordClassIndex(82806);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$a */
    public static final class C70364a {
        static {
            Covode.recordClassIndex(82807);
        }

        private C70364a() {
        }

        public /* synthetic */ C70364a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$b */
    public static final class C70369b implements AbstractC70440f {
        static {
            Covode.recordClassIndex(82812);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
        }

        C70369b() {
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

    /* renamed from: b */
    public final AbstractC70297bs mo110963b() {
        AbstractC70297bs bsVar = this.f157286e;
        if (bsVar == null) {
            C89219l.m154710a("previewEditCallback");
        }
        return bsVar;
    }

    /* renamed from: d */
    public final boolean mo110964d() {
        C70242ba baVar = this.f157283b;
        if (baVar == null) {
            return false;
        }
        return baVar.mo110881g();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AnimatorSet animatorSet = this.f157272O;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f157279V != null) {
            C71588c cVar = this.f157279V;
            if (cVar == null) {
                C89219l.m154710a("cutVideoListViewHolder");
            }
            cVar.mo113336a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$x */
    static final class RunnableC70395x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70363s f157337a;

        static {
            Covode.recordClassIndex(82838);
        }

        RunnableC70395x(C70363s sVar) {
            this.f157337a = sVar;
        }

        public final void run() {
            int i;
            Resources resources = this.f157337a.mo36486t().getResources();
            if (C70455f.f157420d) {
                i = R.string.b1n;
            } else {
                i = R.string.g4t;
            }
            String string = resources.getString(i);
            C89219l.m154716b(string, "");
            new C79459a(this.f157337a.f52549m).mo123052a(string).mo123053a();
        }
    }

    /* renamed from: a */
    public final RecyclerView mo110960a() {
        RecyclerView recyclerView = this.f157285d;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$aa */
    public static final class ViewTreeObserver$OnPreDrawListenerC70365aa implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C70363s f157301a;

        /* renamed from: b */
        final /* synthetic */ int f157302b;

        /* renamed from: c */
        final /* synthetic */ Rect f157303c;

        static {
            Covode.recordClassIndex(82808);
        }

        public final boolean onPreDraw() {
            View view;
            View rootView = C70363s.m124142k(this.f157301a).getRootView();
            C89219l.m154716b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView a = this.f157301a.mo110960a();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ObjectAnimator.ofFloat(a, "alpha", 1.0f, 0.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(300L);
            animatorSet2.play(ObjectAnimator.ofFloat(C70363s.m124142k(this.f157301a), "alpha", 0.0f, 1.0f));
            C70363s sVar = this.f157301a;
            RecyclerView.ViewHolder f = sVar.mo110960a().mo4451f(this.f157302b);
            if (f != null) {
                view = f.itemView;
            } else {
                view = null;
            }
            sVar.f157270M = view;
            C70363s sVar2 = this.f157301a;
            sVar2.f157271N = C34412d.m70402a(sVar2.mo110960a());
            if (!(this.f157303c == null || this.f157301a.f157270M == null)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorSet);
                arrayList.add(animatorSet2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300L);
                animatorSet3.play(ObjectAnimator.ofFloat(C70363s.m124143l(this.f157301a), "alpha", 1.0f, 0.0f));
                arrayList.add(animatorSet3);
                C70363s sVar3 = this.f157301a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C70366a(this, arrayList));
                sVar3.f157272O = animatorSet4;
                AnimatorSet animatorSet5 = this.f157301a.f157272O;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$aa$a */
        public static final class C70366a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC70365aa f157304a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f157305b;

            static {
                Covode.recordClassIndex(82809);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                Activity activity = this.f157304a.f157301a.f52549m;
                if (activity == null || !activity.isFinishing()) {
                    C70363s.m124136e(this.f157304a.f157301a).mo110751a(true);
                    if (this.f157304a.f157301a.mo110964d()) {
                        C70363s.m124132a(this.f157304a.f157301a).mo110698b(false);
                    } else {
                        this.f157304a.f157301a.mo110960a().setVisibility(8);
                    }
                    C70363s.m124137f(this.f157304a.f157301a).setVisibility(0);
                    C70363s.m124138g(this.f157304a.f157301a).setVisibility(0);
                    C70363s.m124142k(this.f157304a.f157301a).setVisibility(0);
                    C70363s.m124144m(this.f157304a.f157301a).setVisibility(4);
                    C70363s.m124143l(this.f157304a.f157301a).setVisibility(4);
                    C70582z zVar = this.f157304a.f157301a.f157282a;
                    if (zVar == null) {
                        C89219l.m154715b();
                    }
                    zVar.f157927d = false;
                    C70363s.m124145n(this.f157304a.f157301a).mo110645a(this.f157304a.f157301a.mo110963b().mo110852L().getSelectedTime());
                }
            }

            C70366a(ViewTreeObserver$OnPreDrawListenerC70365aa aaVar, ArrayList arrayList) {
                this.f157304a = aaVar;
                this.f157305b = arrayList;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC70365aa(C70363s sVar, int i, Rect rect) {
            this.f157301a = sVar;
            this.f157302b = i;
            this.f157303c = rect;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ab */
    public static final class ViewTreeObserver$OnPreDrawListenerC70367ab implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C70363s f157306a;

        /* renamed from: b */
        final /* synthetic */ boolean f157307b;

        static {
            Covode.recordClassIndex(82810);
        }

        public final boolean onPreDraw() {
            int i;
            View rootView = this.f157306a.mo110960a().getRootView();
            C89219l.m154716b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (!(this.f157306a.f157270M == null || this.f157306a.f157271N == null)) {
                RecyclerView a = this.f157306a.mo110960a();
                ArrayList arrayList = new ArrayList();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.play(ObjectAnimator.ofFloat(a, "alpha", 0.0f, 1.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(300L);
                animatorSet2.play(ObjectAnimator.ofFloat(C70363s.m124142k(this.f157306a), "alpha", 0.0f, 1.0f));
                arrayList.add(animatorSet2);
                arrayList.add(animatorSet);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300L);
                animatorSet3.play(ObjectAnimator.ofFloat(C70363s.m124143l(this.f157306a), "alpha", 0.0f, 1.0f));
                arrayList.add(animatorSet3);
                C70363s sVar = this.f157306a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C70368a(this, arrayList));
                sVar.f157272O = animatorSet4;
                AnimatorSet animatorSet5 = this.f157306a.f157272O;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                C70582z zVar = this.f157306a.f157282a;
                if (zVar == null) {
                    C89219l.m154715b();
                }
                if (this.f157306a.mo110964d()) {
                    i = C70363s.m124132a(this.f157306a).f156788a;
                } else {
                    i = 0;
                }
                zVar.f157925b = i;
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$ab$a */
        public static final class C70368a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC70367ab f157308a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f157309b;

            static {
                Covode.recordClassIndex(82811);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                Activity activity = this.f157308a.f157306a.f52549m;
                if (activity == null || !activity.isFinishing()) {
                    C70363s.m124136e(this.f157308a.f157306a).mo110751a(true);
                    C70363s.m124142k(this.f157308a.f157306a).setVisibility(8);
                    C70363s.m124144m(this.f157308a.f157306a).setVisibility(0);
                    if (this.f157308a.f157307b) {
                        VideoEditViewModel b = C70363s.m124133b(this.f157308a.f157306a);
                        String a = C70363s.m124133b(this.f157308a.f157306a).mo111232k().get(C70363s.m124132a(this.f157308a.f157306a).f156789b).mo110571a(true);
                        Iterator<VideoSegment> it = b.f157698w.getValue().getVideoSegmentList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            VideoSegment next = it.next();
                            if (next.mo110571a(true).equals(a)) {
                                if (b.f157700y != null) {
                                    b.f157700y.mo110974b(next);
                                }
                                next.f156717i = true;
                            }
                        }
                    }
                    C70582z zVar = this.f157308a.f157306a.f157282a;
                    if (zVar == null) {
                        C89219l.m154715b();
                    }
                    zVar.f157927d = true;
                    C70363s.m124145n(this.f157308a.f157306a).mo110645a(this.f157308a.f157306a.mo110963b().mo110852L().getSelectedTime());
                    this.f157308a.f157306a.f157273P = false;
                }
            }

            C70368a(ViewTreeObserver$OnPreDrawListenerC70367ab abVar, ArrayList arrayList) {
                this.f157308a = abVar;
                this.f157309b = arrayList;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC70367ab(C70363s sVar, boolean z) {
            this.f157306a = sVar;
            this.f157307b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$d */
    public static final class C70371d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C70363s f157313a;

        static {
            Covode.recordClassIndex(82814);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70371d(C70363s sVar) {
            this.f157313a = sVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            C70363s.m124141j(this.f157313a).setVisibility(8);
            C70363s.m124141j(this.f157313a).setTranslationY(0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$g */
    public static final class C70374g implements VideoEditViewModel.AbstractC70515a {

        /* renamed from: a */
        final /* synthetic */ C70363s f157316a;

        static {
            Covode.recordClassIndex(82817);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70374g(C70363s sVar) {
            this.f157316a = sVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.AbstractC70515a
        /* renamed from: a */
        public final void mo110973a(VideoSegment videoSegment) {
            C70582z zVar = this.f157316a.f157282a;
            if (zVar != null) {
                zVar.mo111342a(videoSegment);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.AbstractC70515a
        /* renamed from: b */
        public final void mo110974b(VideoSegment videoSegment) {
            this.f157316a.f157263F = System.currentTimeMillis();
            C70582z zVar = this.f157316a.f157282a;
            if (zVar != null) {
                zVar.mo111346b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$s */
    static final class C70390s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157332a;

        static {
            Covode.recordClassIndex(82833);
        }

        C70390s(C70363s sVar) {
            this.f157332a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f157332a.mo110962a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$t */
    static final class C70391t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157333a;

        static {
            Covode.recordClassIndex(82834);
        }

        C70391t(C70363s sVar) {
            this.f157333a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f157333a.mo110962a(true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$u */
    static final class C70392u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157334a;

        static {
            Covode.recordClassIndex(82835);
        }

        C70392u(C70363s sVar) {
            this.f157334a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f157334a.mo110962a(false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$y */
    public static final class C70396y implements AbstractC70442h {

        /* renamed from: a */
        final /* synthetic */ C70363s f157338a;

        static {
            Covode.recordClassIndex(82839);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70396y(C70363s sVar) {
            this.f157338a = sVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: b */
        public final void mo110936b(View view) {
            C70242ba baVar = this.f157338a.f157283b;
            if (baVar == null) {
                C89219l.m154715b();
            }
            C70447e eVar = baVar.f157051f;
            C70242ba baVar2 = this.f157338a.f157283b;
            if (baVar2 == null) {
                C89219l.m154715b();
            }
            eVar.mo111012a(baVar2.mo110876b());
            C39162r.m79460a("apply_smart_sync", C70463h.m124284a().mo129406a("to_status", "on").f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: a */
        public final void mo110934a(View view) {
            C70363s.m124132a(this.f157338a).mo110699c(false);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f157338a.f157258A;
            if (cutVideoTitleBarViewModel == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo110799e(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f157338a.f157262E;
            if (cutVideoMultiModeViewModel == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo110721b();
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f157338a.f157261D;
            if (cutVideoStickerPointMusicViewModel == null) {
                C89219l.m154710a("stickPointMusicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo33689c(new CutVideoStickerPointMusicViewModel.C70142d());
            C70363s.m124132a(this.f157338a).mo110697b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: a */
        public final void mo110935a(List<? extends MediaModel> list) {
            if (C84904k.m145909a(list)) {
                C70242ba baVar = this.f157338a.f157283b;
                if (baVar == null) {
                    C89219l.m154715b();
                }
                if (baVar.f157069x) {
                    C70242ba baVar2 = this.f157338a.f157283b;
                    if (baVar2 == null) {
                        C89219l.m154715b();
                    }
                    baVar2.f157048c.mo111036c();
                    C70242ba baVar3 = this.f157338a.f157283b;
                    if (baVar3 == null) {
                        C89219l.m154715b();
                    }
                    baVar3.f157069x = false;
                    return;
                }
                return;
            }
            C70363s sVar = this.f157338a;
            ArrayList arrayList = new ArrayList();
            C70242ba baVar4 = sVar.f157283b;
            if (baVar4 == null) {
                C89219l.m154715b();
            }
            AbstractC70441g gVar = baVar4.f157050e;
            if (gVar == null) {
                C89219l.m154715b();
            }
            int size = gVar.mo110826c().size();
            if (list == null) {
                C89219l.m154715b();
            }
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i));
                videoSegment.f156709a = size;
                arrayList.add(videoSegment);
                size++;
            }
            sVar.f157264G.mo110929a(arrayList);
            sVar.f157264G.mo110933c();
            C70242ba baVar5 = sVar.f157283b;
            if (baVar5 == null) {
                C89219l.m154715b();
            }
            baVar5.mo110870a().mo111104a(arrayList);
            C70242ba baVar6 = sVar.f157283b;
            if (baVar6 == null) {
                C89219l.m154715b();
            }
            if (baVar6.f157050e != null) {
                C70242ba baVar7 = sVar.f157283b;
                if (baVar7 == null) {
                    C89219l.m154715b();
                }
                AbstractC70441g gVar2 = baVar7.f157050e;
                if (gVar2 == null) {
                    C89219l.m154715b();
                }
                gVar2.mo110823a(arrayList);
            }
            if (sVar.mo110964d()) {
                C70242ba baVar8 = sVar.f157283b;
                if (baVar8 == null) {
                    C89219l.m154715b();
                }
                baVar8.f157048c.mo111030a(arrayList, size, new C70369b());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: c */
        public final void mo110937c(View view) {
            String str;
            if (C70455f.f157421e.mo111020a(this.f157338a.f52549m, this.f157338a.f157264G.mo110925a(), this.f157338a.f157264G.mo110931b())) {
                C70242ba baVar = this.f157338a.f157283b;
                if (baVar == null) {
                    C89219l.m154715b();
                }
                baVar.f157070y = true;
                C70242ba baVar2 = this.f157338a.f157283b;
                if (baVar2 == null) {
                    C89219l.m154715b();
                }
                if (baVar2.f157048c.mo111032a()) {
                    C70242ba baVar3 = this.f157338a.f157283b;
                    if (baVar3 == null) {
                        C89219l.m154715b();
                    }
                    baVar3.f157069x = true;
                }
                C70242ba baVar4 = this.f157338a.f157283b;
                if (baVar4 == null) {
                    C89219l.m154715b();
                }
                baVar4.f157048c.mo111034b();
            }
            C84425b a = C70463h.m124284a().mo129406a("enter_from", "clip_edit_page");
            String str2 = "";
            if (C89219l.m154714a((Object) C70463h.f157436a, (Object) "comment_reply")) {
                str = C70463h.f157438c;
            } else {
                str = str2;
            }
            C84425b a2 = a.mo129406a("reply_comment_id", str);
            if (C89219l.m154714a((Object) C70463h.f157436a, (Object) "comment_reply")) {
                str2 = C70463h.f157439d;
            }
            C39162r.m79460a("click_upload_entrance", a2.mo129406a("reply_user_id", str2).mo129406a("from_group_id", C70747dv.m124972a()).f188764a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoListViewModel m124132a(C70363s sVar) {
        CutVideoListViewModel cutVideoListViewModel = sVar.f157260C;
        if (cutVideoListViewModel == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m124133b(C70363s sVar) {
        VideoEditViewModel videoEditViewModel = sVar.f157297w;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutMultiVideoViewModel m124134c(C70363s sVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = sVar.f157296v;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoEditViewModel m124135d(C70363s sVar) {
        CutVideoEditViewModel cutVideoEditViewModel = sVar.f157259B;
        if (cutVideoEditViewModel == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoSpeedViewModel m124136e(C70363s sVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = sVar.f157299y;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ ImageView m124137f(C70363s sVar) {
        ImageView imageView = sVar.f157291j;
        if (imageView == null) {
            C89219l.m154710a("ivSave");
        }
        return imageView;
    }

    /* renamed from: g */
    public static final /* synthetic */ ImageView m124138g(C70363s sVar) {
        ImageView imageView = sVar.f157292k;
        if (imageView == null) {
            C89219l.m154710a("ivCancel");
        }
        return imageView;
    }

    /* renamed from: h */
    public static final /* synthetic */ StickPointVideoSegView m124139h(C70363s sVar) {
        StickPointVideoSegView stickPointVideoSegView = sVar.f157289h;
        if (stickPointVideoSegView == null) {
            C89219l.m154710a("stickPointVideoTitleView");
        }
        return stickPointVideoSegView;
    }

    /* renamed from: i */
    public static final /* synthetic */ StickPointSingleVideoEditView m124140i(C70363s sVar) {
        StickPointSingleVideoEditView stickPointSingleVideoEditView = sVar.f157295u;
        if (stickPointSingleVideoEditView == null) {
            C89219l.m154710a("singleVideoEditView");
        }
        return stickPointSingleVideoEditView;
    }

    /* renamed from: j */
    public static final /* synthetic */ FrameLayout m124141j(C70363s sVar) {
        FrameLayout frameLayout = sVar.f157294t;
        if (frameLayout == null) {
            C89219l.m154710a("recyclerViewLayout");
        }
        return frameLayout;
    }

    /* renamed from: k */
    public static final /* synthetic */ TextView m124142k(C70363s sVar) {
        TextView textView = sVar.f157293l;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        return textView;
    }

    /* renamed from: l */
    public static final /* synthetic */ TextView m124143l(C70363s sVar) {
        TextView textView = sVar.f157287f;
        if (textView == null) {
            C89219l.m154710a("tvVideoSegmentDes");
        }
        return textView;
    }

    /* renamed from: m */
    public static final /* synthetic */ View m124144m(C70363s sVar) {
        View view = sVar.f157288g;
        if (view == null) {
            C89219l.m154710a("animTabDot");
        }
        return view;
    }

    /* renamed from: n */
    public static final /* synthetic */ CutVideoBottomBarViewModel m124145n(C70363s sVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = sVar.f157300z;
        if (cutVideoBottomBarViewModel == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$e */
    static final class View$OnClickListenerC70372e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70363s f157314a;

        static {
            Covode.recordClassIndex(82815);
        }

        View$OnClickListenerC70372e(C70363s sVar) {
            this.f157314a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f157314a.f157273P) {
                this.f157314a.f157273P = true;
                C63244g.m114602a().mo73263I().mo101634a("click_edit_segments", (Map<String, String>) null);
                C70363s.m124134c(this.f157314a).mo110480d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$f */
    static final class View$OnClickListenerC70373f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70363s f157315a;

        static {
            Covode.recordClassIndex(82816);
        }

        View$OnClickListenerC70373f(C70363s sVar) {
            this.f157315a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f157315a.f157273P) {
                this.f157315a.f157273P = true;
                C63244g.m114602a().mo73263I().mo101634a("click_edit_segments_return", (Map<String, String>) null);
                C70363s.m124134c(this.f157315a).mo110479c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$q */
    static final class C70388q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157330a;

        static {
            Covode.recordClassIndex(82831);
        }

        C70388q(C70363s sVar) {
            this.f157330a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C70363s.m124141j(this.f157330a).setAlpha(1.0f);
                FrameLayout j = C70363s.m124141j(this.f157330a);
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                j.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$c */
    static final class C70370c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70363s f157310a;

        /* renamed from: b */
        final /* synthetic */ boolean f157311b;

        /* renamed from: c */
        final /* synthetic */ float f157312c;

        static {
            Covode.recordClassIndex(82813);
        }

        C70370c(C70363s sVar, boolean z, float f) {
            this.f157310a = sVar;
            this.f157311b = z;
            this.f157312c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f157311b) {
                C70363s.m124141j(this.f157310a).setAlpha(floatValue);
                C70363s.m124141j(this.f157310a).setTranslationY(this.f157312c * (1.0f - floatValue));
                return;
            }
            C70363s.m124141j(this.f157310a).setAlpha(1.0f - floatValue);
            C70363s.m124141j(this.f157310a).setTranslationY(this.f157312c * floatValue);
        }
    }

    /* renamed from: a */
    public final void mo110961a(boolean z) {
        if (!this.f157276S) {
            CutVideoEditViewModel cutVideoEditViewModel = this.f157259B;
            if (cutVideoEditViewModel == null) {
                C89219l.m154710a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel.mo110668a(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f157258A;
            if (cutVideoTitleBarViewModel == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo110798d(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f157258A;
            if (cutVideoTitleBarViewModel2 == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo110797c(!z);
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f157281Y;
            if (cutVideoPreviewViewModel == null) {
                C89219l.m154710a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo110739a(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$v */
    static final class C70393v<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157335a;

        static {
            Covode.recordClassIndex(82836);
        }

        C70393v(C70363s sVar) {
            this.f157335a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C70091f fVar = (C70091f) obj;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f156760d);
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    if (this.f157335a.f157275R) {
                        this.f157335a.f157274Q = fVar.f156761e;
                        this.f157335a.mo110961a(true);
                        VEVideoCutterViewModel vEVideoCutterViewModel = this.f157335a.f157298x;
                        if (vEVideoCutterViewModel == null) {
                            C89219l.m154710a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel.mo111336a(new C70576a(2, false));
                    }
                    this.f157335a.f157275R = false;
                } else if (num.intValue() != 1 && num.intValue() == 2) {
                    this.f157335a.mo110961a(false);
                    C70363s sVar = this.f157335a;
                    int i = fVar.f156762f;
                    int i2 = this.f157335a.f157274Q;
                    if (fVar.f156757a) {
                        AbstractC70297bs bsVar = sVar.f157286e;
                        if (bsVar == null) {
                            C89219l.m154710a("previewEditCallback");
                        }
                        AbstractC70527h L = bsVar.mo110852L();
                        L.mo111145c();
                        VECutVideoPresenter vECutVideoPresenter = sVar.f157284c;
                        if (vECutVideoPresenter == null) {
                            C89219l.m154710a("presenter");
                        }
                        C70484n nVar = vECutVideoPresenter.f156560k;
                        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f156559j;
                        if (videoEditViewModel == null) {
                            C89219l.m154710a("videoEditViewModel");
                        }
                        List<VideoSegment> k = videoEditViewModel.mo111232k();
                        if (i2 != i && !C84904k.m145909a(k)) {
                            AbstractC70076i iVar = nVar.f157496b;
                            if (iVar != null) {
                                if (k == null) {
                                    C89219l.m154715b();
                                }
                                iVar.mo110535a(i2, i, k);
                            }
                            AbstractC70076i iVar2 = nVar.f157495a;
                            if (iVar2 != null) {
                                if (k == null) {
                                    C89219l.m154715b();
                                }
                                iVar2.mo110535a(i2, i, k);
                            }
                            if (nVar.f157497c) {
                                AbstractC70076i iVar3 = nVar.f157496b;
                                if (iVar3 != null) {
                                    iVar3.mo110534a(i2, i);
                                }
                            } else {
                                AbstractC70076i iVar4 = nVar.f157495a;
                                if (iVar4 != null) {
                                    iVar4.mo110534a(i2, i);
                                }
                            }
                        }
                        long j = 0;
                        for (int i3 = 0; i3 < i; i3++) {
                            VideoEditViewModel videoEditViewModel2 = sVar.f157297w;
                            if (videoEditViewModel2 == null) {
                                C89219l.m154710a("videoEditViewModel");
                            }
                            VideoSegment videoSegment = videoEditViewModel2.mo111232k().get(i3);
                            if (!videoSegment.f156717i) {
                                C89219l.m154716b(videoSegment, "");
                                float e = (float) (videoSegment.mo110580e() - videoSegment.mo110578d());
                                VideoEditViewModel videoEditViewModel3 = sVar.f157297w;
                                if (videoEditViewModel3 == null) {
                                    C89219l.m154710a("videoEditViewModel");
                                }
                                j += (long) (e / (videoEditViewModel3.mo111233l() * videoSegment.mo110582f()));
                            }
                        }
                        if (j >= L.getMaxCutDuration()) {
                            j = 0;
                        } else if (j != 0) {
                            j += 30;
                        }
                        VECutVideoPresenter vECutVideoPresenter2 = sVar.f157284c;
                        if (vECutVideoPresenter2 == null) {
                            C89219l.m154710a("presenter");
                        }
                        C0692e<Long, Long> playBoundary = L.getPlayBoundary();
                        C89219l.m154716b(playBoundary, "");
                        vECutVideoPresenter2.mo110485a(playBoundary);
                        VEVideoCutterViewModel vEVideoCutterViewModel2 = sVar.f157298x;
                        if (vEVideoCutterViewModel2 == null) {
                            C89219l.m154710a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel2.mo111336a(new C70576a(j, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
                        L.getPlayBoundary();
                        VECutVideoPresenter vECutVideoPresenter3 = sVar.f157284c;
                        if (vECutVideoPresenter3 == null) {
                            C89219l.m154710a("presenter");
                        }
                        if (!vECutVideoPresenter3.mo110490b()) {
                            CutMultiVideoViewModel cutMultiVideoViewModel = sVar.f157296v;
                            if (cutMultiVideoViewModel == null) {
                                C89219l.m154710a("cutMultiVideoViewModel");
                            }
                            VideoEditViewModel videoEditViewModel4 = sVar.f157297w;
                            if (videoEditViewModel4 == null) {
                                C89219l.m154710a("videoEditViewModel");
                            }
                            List<VideoSegment> j2 = videoEditViewModel4.mo111231j();
                            VideoEditViewModel videoEditViewModel5 = sVar.f157297w;
                            if (videoEditViewModel5 == null) {
                                C89219l.m154710a("videoEditViewModel");
                            }
                            cutMultiVideoViewModel.mo110474a(j, j2, videoEditViewModel5.mo111233l());
                        }
                        C70463h.m124290a(sVar.mo110964d(), false, false, false, false, true);
                    } else {
                        VEVideoCutterViewModel vEVideoCutterViewModel3 = sVar.f157298x;
                        if (vEVideoCutterViewModel3 == null) {
                            C89219l.m154710a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel3.mo111336a(new C70576a(1, false));
                    }
                    if (this.f157335a.f157283b != null) {
                        CutVideoListViewModel a = C70363s.m124132a(this.f157335a);
                        Activity activity = this.f157335a.f52549m;
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        ActivityC0945e eVar = (ActivityC0945e) activity;
                        int i4 = this.f157335a.f157274Q;
                        int i5 = fVar.f156762f;
                        C89219l.m154721d(eVar, "");
                        JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(CutVideoStickerPointMusicViewModel.class);
                        C89219l.m154716b(a2, "");
                        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = (CutVideoStickerPointMusicViewModel) a2;
                        AbstractC70298bt btVar = a.f156790c;
                        if (btVar == null) {
                            C89219l.m154710a("stickerPointController");
                        }
                        btVar.mo110872a(i4, i5, new CutVideoListViewModel.C70124k(cutVideoStickerPointMusicViewModel));
                    }
                    this.f157335a.f157275R = true;
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        CutVideoViewModel cutVideoViewModel = this.f157280X;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110805i()) {
            C70396y yVar = new C70396y(this);
            StickPointVideoSegView stickPointVideoSegView = this.f157289h;
            if (stickPointVideoSegView == null) {
                C89219l.m154710a("stickPointVideoTitleView");
            }
            stickPointVideoSegView.setStickPointVideoSegListener(yVar);
            this.f157264G.mo110928a(yVar);
            AbstractC70300bv bvVar = this.f157264G;
            RecyclerView recyclerView = this.f157285d;
            if (recyclerView == null) {
                C89219l.m154710a("videoRecyclerView");
            }
            bvVar.mo110927a((C70410e) recyclerView.getAdapter());
            ArrayList<String> a = this.f157264G.mo110925a();
            if (a == null) {
                C89219l.m154715b();
            }
            if (a.size() < 8) {
                C22228c.m41831a(this, new RunnableC70395x(this), 200);
            }
        }
        VideoEditViewModel videoEditViewModel = this.f157297w;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel.f157700y = new C70374g(this);
        VideoEditViewModel videoEditViewModel2 = this.f157297w;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel2.f157690o.observe(this, new C70382m(this));
        VideoEditViewModel videoEditViewModel3 = this.f157297w;
        if (videoEditViewModel3 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel3.f157691p.observe(this, new C70390s(this));
        VideoEditViewModel videoEditViewModel4 = this.f157297w;
        if (videoEditViewModel4 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel4.f157692q.observe(this, new C70391t(this));
        VideoEditViewModel videoEditViewModel5 = this.f157297w;
        if (videoEditViewModel5 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel5.f157693r.observe(this, new C70392u(this));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f157296v;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel.f156538j.observe(this, new C70393v(this));
        CutVideoListViewModel cutVideoListViewModel = this.f157260C;
        if (cutVideoListViewModel == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel, C70153ab.f156838a, new C70394w(this));
        CutVideoListViewModel cutVideoListViewModel2 = this.f157260C;
        if (cutVideoListViewModel2 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel2, C70154ac.f156839a, new C70375h(this));
        CutVideoListViewModel cutVideoListViewModel3 = this.f157260C;
        if (cutVideoListViewModel3 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel3, C70398t.f157340a, new C20370ah(), new C70376i(this));
        CutVideoListViewModel cutVideoListViewModel4 = this.f157260C;
        if (cutVideoListViewModel4 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel4, C70399u.f157341a, new C20370ah(), new C70377j(this));
        CutVideoListViewModel cutVideoListViewModel5 = this.f157260C;
        if (cutVideoListViewModel5 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel5, C70400v.f157342a, new C70378k(this));
        CutVideoListViewModel cutVideoListViewModel6 = this.f157260C;
        if (cutVideoListViewModel6 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel6, C70401w.f157343a, new C70380l(this));
        CutVideoListViewModel cutVideoListViewModel7 = this.f157260C;
        if (cutVideoListViewModel7 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel7, C70402x.f157344a, new C70383n(this));
        CutVideoListViewModel cutVideoListViewModel8 = this.f157260C;
        if (cutVideoListViewModel8 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel8, C70403y.f157345a, new C70385o(this));
        CutVideoListViewModel cutVideoListViewModel9 = this.f157260C;
        if (cutVideoListViewModel9 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel9, C70404z.f157346a, new C20370ah(), new C70387p(this));
        CutVideoListViewModel cutVideoListViewModel10 = this.f157260C;
        if (cutVideoListViewModel10 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        cutVideoListViewModel10.mo110700g().observe(this, new C70388q(this));
        CutVideoListViewModel cutVideoListViewModel11 = this.f157260C;
        if (cutVideoListViewModel11 == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoListViewModel11, C70152aa.f156837a, new C70389r(this));
        ImageView imageView = this.f157291j;
        if (imageView == null) {
            C89219l.m154710a("ivSave");
        }
        imageView.setOnClickListener(new View$OnClickListenerC70372e(this));
        ImageView imageView2 = this.f157292k;
        if (imageView2 == null) {
            C89219l.m154710a("ivCancel");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC70373f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$m */
    static final class C70382m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70363s f157324a;

        static {
            Covode.recordClassIndex(82825);
        }

        C70382m(C70363s sVar) {
            this.f157324a = sVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            float f;
            int i;
            C70363s sVar = this.f157324a;
            VideoEditViewModel videoEditViewModel = sVar.f157297w;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            List<VideoSegment> k = videoEditViewModel.mo111232k();
            CutVideoListViewModel cutVideoListViewModel = sVar.f157260C;
            if (cutVideoListViewModel == null) {
                C89219l.m154710a("cutVideoListViewModel");
            }
            VideoSegment videoSegment = k.get(cutVideoListViewModel.f156789b);
            C89219l.m154716b(videoSegment, "");
            View view = sVar.f157288g;
            if (view == null) {
                C89219l.m154710a("animTabDot");
            }
            view.setVisibility(4);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = sVar.f157258A;
            if (cutVideoTitleBarViewModel == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo110795a(false);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = sVar.f157258A;
            if (cutVideoTitleBarViewModel2 == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo110796b(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = sVar.f157300z;
            if (cutVideoBottomBarViewModel == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.mo110650c(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = sVar.f157300z;
            if (cutVideoBottomBarViewModel2 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel2.mo110651d(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = sVar.f157300z;
            if (cutVideoBottomBarViewModel3 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            if (!sVar.f157277T || !C70094o.m123774a(videoSegment)) {
                z = false;
            } else {
                z = true;
            }
            cutVideoBottomBarViewModel3.mo110646a(z);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = sVar.f157300z;
            if (cutVideoBottomBarViewModel4 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel4.mo110649b(sVar.f157266I);
            CutVideoSpeedViewModel cutVideoSpeedViewModel = sVar.f157299y;
            if (cutVideoSpeedViewModel == null) {
                C89219l.m154710a("speedViewModel");
            }
            cutVideoSpeedViewModel.mo110751a(false);
            CutVideoSpeedViewModel cutVideoSpeedViewModel2 = sVar.f157299y;
            if (cutVideoSpeedViewModel2 == null) {
                C89219l.m154710a("speedViewModel");
            }
            if (!sVar.f157266I || sVar.mo110964d() || !C70094o.m123774a(videoSegment)) {
                z2 = false;
            } else {
                z2 = true;
            }
            cutVideoSpeedViewModel2.mo110754b(z2);
            if (sVar.f157266I) {
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = sVar.f157299y;
                if (cutVideoSpeedViewModel3 == null) {
                    C89219l.m154710a("speedViewModel");
                }
                EnumC78601i a = C70082m.m123739a(videoSegment.mo110582f());
                C89219l.m154716b(a, "");
                cutVideoSpeedViewModel3.mo110750a(a);
            }
            VECutVideoPresenter vECutVideoPresenter = sVar.f157284c;
            if (vECutVideoPresenter == null) {
                C89219l.m154710a("presenter");
            }
            CutVideoListViewModel cutVideoListViewModel2 = sVar.f157260C;
            if (cutVideoListViewModel2 == null) {
                C89219l.m154710a("cutVideoListViewModel");
            }
            int i2 = cutVideoListViewModel2.f156789b;
            VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.f156559j;
            if (videoEditViewModel2 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            VideoSegment c = videoEditViewModel2.mo111221c(i2);
            if (c != null) {
                C70484n nVar = vECutVideoPresenter.f156560k;
                if (nVar.f157497c) {
                    AbstractC70076i iVar = nVar.f157496b;
                    if (iVar != null) {
                        iVar.mo110536a(i2, c);
                    }
                } else {
                    AbstractC70076i iVar2 = nVar.f157495a;
                    if (iVar2 != null) {
                        iVar2.mo110536a(i2, c);
                    }
                }
                vECutVideoPresenter.f156561l.mo114723a(c);
            }
            if (sVar.f157283b != null) {
                AbstractC70229av avVar = sVar.f157278U;
                if (avVar != null) {
                    avVar.mo110828b();
                }
                CutVideoListViewModel cutVideoListViewModel3 = sVar.f157260C;
                if (cutVideoListViewModel3 == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                Activity activity = sVar.f52549m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar = (ActivityC0945e) activity;
                CutVideoListViewModel cutVideoListViewModel4 = sVar.f157260C;
                if (cutVideoListViewModel4 == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                int i3 = cutVideoListViewModel4.f156789b;
                C89219l.m154721d(eVar, "");
                JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(CutVideoPreviewViewModel.class);
                C89219l.m154716b(a2, "");
                ((CutVideoPreviewViewModel) a2).mo110737a();
                AbstractC70298bt btVar = cutVideoListViewModel3.f156790c;
                if (btVar == null) {
                    C89219l.m154710a("stickerPointController");
                }
                btVar.mo110873a(i3, videoSegment);
            }
            if (videoSegment.mo110582f() == 0.0f) {
                f = 1.0f;
            } else {
                f = videoSegment.mo110582f();
            }
            VEVideoCutterViewModel vEVideoCutterViewModel = sVar.f157298x;
            if (vEVideoCutterViewModel == null) {
                C89219l.m154710a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.mo111336a(new C70576a((long) (((float) videoSegment.mo110578d()) / f), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            if (sVar.mo110964d()) {
                VideoEditViewModel videoEditViewModel3 = sVar.f157297w;
                if (videoEditViewModel3 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                videoEditViewModel3.f157696u.setValue(null);
            }
            sVar.f157267J = 1.0f;
            sVar.f157268K = 0.0f;
            sVar.f157269L = 0.0f;
            if (!sVar.mo110964d() || !C70455f.m124270b()) {
                CutVideoListViewModel cutVideoListViewModel5 = sVar.f157260C;
                if (cutVideoListViewModel5 == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel5.f156788a;
            } else {
                CutVideoListViewModel cutVideoListViewModel6 = sVar.f157260C;
                if (cutVideoListViewModel6 == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel6.f156788a + 1;
            }
            C70582z zVar = sVar.f157282a;
            if (zVar == null) {
                C89219l.m154715b();
            }
            RecyclerView recyclerView = sVar.f157285d;
            if (recyclerView == null) {
                C89219l.m154710a("videoRecyclerView");
            }
            Rect b = zVar.mo111345b(recyclerView, i);
            FrameLayout frameLayout = sVar.f157290i;
            if (frameLayout == null) {
                C89219l.m154710a("singleEditLayout");
            }
            frameLayout.setVisibility(0);
            ImageView imageView = sVar.f157291j;
            if (imageView == null) {
                C89219l.m154710a("ivSave");
            }
            imageView.setVisibility(8);
            ImageView imageView2 = sVar.f157292k;
            if (imageView2 == null) {
                C89219l.m154710a("ivCancel");
            }
            imageView2.setVisibility(8);
            TextView textView = sVar.f157293l;
            if (textView == null) {
                C89219l.m154710a("singleEditTitle");
            }
            textView.setVisibility(4);
            TextView textView2 = sVar.f157293l;
            if (textView2 == null) {
                C89219l.m154710a("singleEditTitle");
            }
            View rootView = textView2.getRootView();
            C89219l.m154716b(rootView, "");
            rootView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC70365aa(sVar, i, b));
            C70463h.m124290a(sVar.mo110964d(), true, false, false, false, false);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$i */
    static final class C70376i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157318a;

        static {
            Covode.recordClassIndex(82819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70376i(C70363s sVar) {
            super(2);
            this.f157318a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70363s.m124137f(this.f157318a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$j */
    static final class C70377j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157319a;

        static {
            Covode.recordClassIndex(82820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70377j(C70363s sVar) {
            super(2);
            this.f157319a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70363s.m124138g(this.f157319a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$p */
    static final class C70387p extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157329a;

        static {
            Covode.recordClassIndex(82830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70387p(C70363s sVar) {
            super(2);
            this.f157329a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            StickPointSingleVideoEditView i2 = C70363s.m124140i(this.f157329a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            i2.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.arm, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$k */
    static final class C70378k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157320a;

        static {
            Covode.recordClassIndex(82821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70378k(C70363s sVar) {
            super(2);
            this.f157320a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70363s.m124139h(this.f157320a).setButtonClickable(false);
            }
            C70303d.m124100a(C70363s.m124139h(this.f157320a), booleanValue, new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70363s.C70378k.C703791 */

                /* renamed from: a */
                final /* synthetic */ C70378k f157321a;

                static {
                    Covode.recordClassIndex(82822);
                }

                {
                    this.f157321a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    C70363s.m124139h(this.f157321a.f157320a).setButtonClickable(bool.booleanValue());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$l */
    static final class C70380l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157322a;

        static {
            Covode.recordClassIndex(82823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70380l(C70363s sVar) {
            super(2);
            this.f157322a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70363s.m124139h(this.f157322a).setButtonClickable(false);
            }
            C70303d.m124101b(C70363s.m124139h(this.f157322a), booleanValue, new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70363s.C70380l.C703811 */

                /* renamed from: a */
                final /* synthetic */ C70380l f157323a;

                static {
                    Covode.recordClassIndex(82824);
                }

                {
                    this.f157323a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    C70363s.m124139h(this.f157323a.f157322a).setButtonClickable(bool.booleanValue());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$n */
    static final class C70383n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157325a;

        static {
            Covode.recordClassIndex(82826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70383n(C70363s sVar) {
            super(2);
            this.f157325a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70303d.m124100a(C70363s.m124140i(this.f157325a), true, C703841.f157326a);
            } else {
                C70433c.m124217b(C70363s.m124140i(this.f157325a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$o */
    static final class C70385o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157327a;

        static {
            Covode.recordClassIndex(82828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70385o(C70363s sVar) {
            super(2);
            this.f157327a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70303d.m124101b(C70363s.m124140i(this.f157327a), true, C703861.f157328a);
            } else {
                C70433c.m124216a(C70363s.m124140i(this.f157327a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$w */
    static final class C70394w extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157336a;

        static {
            Covode.recordClassIndex(82837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70394w(C70363s sVar) {
            super(2);
            this.f157336a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C70363s.m124134c(this.f157336a).mo110475a(C70363s.m124133b(this.f157336a).mo111232k().get(C70363s.m124132a(this.f157336a).f156789b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$h */
    static final class C70375h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157317a;

        static {
            Covode.recordClassIndex(82818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70375h(C70363s sVar) {
            super(2);
            this.f157317a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            C70242ba baVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (C70363s.m124135d(this.f157317a).f156782a == 2) {
                this.f157317a.f157266I = booleanValue;
            } else {
                this.f157317a.f157265H = booleanValue;
            }
            if (!booleanValue || ((baVar = this.f157317a.f157283b) != null && baVar.mo110881g())) {
                C70363s.m124136e(this.f157317a).mo110754b(false);
            } else {
                CutVideoSpeedViewModel e = C70363s.m124136e(this.f157317a);
                EnumC78601i a = C70082m.m123739a(this.f157317a.mo110963b().mo110852L().getCurrentSpeed());
                C89219l.m154716b(a, "");
                e.mo110750a(a);
                C70363s.m124136e(this.f157317a).mo110754b(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$r */
    static final class C70389r extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70363s f157331a;

        static {
            Covode.recordClassIndex(82832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70389r(C70363s sVar) {
            super(2);
            this.f157331a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70363s sVar = this.f157331a;
            FrameLayout frameLayout = sVar.f157294t;
            if (frameLayout == null) {
                C89219l.m154710a("recyclerViewLayout");
            }
            frameLayout.setVisibility(0);
            float b = C13628n.m24520b(sVar.f52549m, 16.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new C70370c(sVar, booleanValue, b));
            if (!booleanValue) {
                ofFloat.addListener(new C70371d(sVar));
            }
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$z */
    static final class C70397z implements C70582z.AbstractC70584b {

        /* renamed from: a */
        final /* synthetic */ C70363s f157339a;

        static {
            Covode.recordClassIndex(82840);
        }

        C70397z(C70363s sVar) {
            this.f157339a = sVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z.AbstractC70584b
        /* renamed from: a */
        public final void mo110976a(int i, String str) {
            ArrayList<String> arrayList;
            if (C70363s.m124135d(this.f157339a).f156782a != 2 && !this.f157339a.f157276S) {
                if (i == 10003) {
                    C70455f fVar = C70455f.f157421e;
                    Activity activity = this.f157339a.f52549m;
                    C70582z zVar = this.f157339a.f157282a;
                    Long l = null;
                    if (zVar != null) {
                        arrayList = zVar.mo111340a();
                    } else {
                        arrayList = null;
                    }
                    C70582z zVar2 = this.f157339a.f157282a;
                    if (zVar2 == null || (l = Long.valueOf(zVar2.mo111344b())) == null) {
                        C89219l.m154715b();
                    }
                    fVar.mo111020a(activity, arrayList, l.longValue());
                    return;
                }
                C70363s.m124132a(this.f157339a).f156788a = i;
                C70363s.m124132a(this.f157339a).f156789b = C70363s.m124133b(this.f157339a).mo111205a(str);
                if (C70363s.m124132a(this.f157339a).f156789b < 0) {
                    C73991bj.m130132c("edit index:" + C70363s.m124132a(this.f157339a).f156788a + ", origin_index:" + C70363s.m124132a(this.f157339a).f156789b + ", path:" + str);
                } else {
                    C70363s.m124134c(this.f157339a).mo110473a(C70363s.m124132a(this.f157339a).f156788a, C70363s.m124132a(this.f157339a).f156789b);
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.erv);
        C89219l.m154716b(c, "");
        this.f157287f = (TextView) c;
        View c2 = mo36475c(R.id.fbs);
        C89219l.m154716b(c2, "");
        this.f157285d = (RecyclerView) c2;
        View c3 = mo36475c(R.id.ju);
        C89219l.m154716b(c3, "");
        this.f157288g = c3;
        View c4 = mo36475c(R.id.fdo);
        C89219l.m154716b(c4, "");
        this.f157289h = (StickPointVideoSegView) c4;
        View c5 = mo36475c(R.id.e1_);
        C89219l.m154716b(c5, "");
        this.f157290i = (FrameLayout) c5;
        View c6 = mo36475c(R.id.bs9);
        C89219l.m154716b(c6, "");
        this.f157291j = (ImageView) c6;
        View c7 = mo36475c(R.id.brw);
        C89219l.m154716b(c7, "");
        this.f157292k = (ImageView) c7;
        View c8 = mo36475c(R.id.e1c);
        C89219l.m154716b(c8, "");
        this.f157293l = (TextView) c8;
        View c9 = mo36475c(R.id.v2);
        C89219l.m154716b(c9, "");
        this.f157294t = (FrameLayout) c9;
        TextView textView = this.f157287f;
        if (textView == null) {
            C89219l.m154710a("tvVideoSegmentDes");
        }
        textView.setShadowLayer(2.0f, 0.0f, 0.0f, C0643b.m2378c(view.getContext(), R.color.bo));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        view.setLayoutParams(layoutParams2);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C70582z zVar = null;
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f157296v = (CutMultiVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157297w = (VideoEditViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a3, "");
        this.f157280X = (CutVideoViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a4 = C1181ae.m3881a((ActivityC0945e) activity4, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a4, "");
        this.f157298x = (VEVideoCutterViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a5, "");
        this.f157299y = (CutVideoSpeedViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a6, "");
        this.f157300z = (CutVideoBottomBarViewModel) a6;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = C20531t.m38716a((ActivityC0945e) activity7).mo33800a(CutVideoTitleBarViewModel.class);
        C89219l.m154716b(a7, "");
        this.f157258A = (CutVideoTitleBarViewModel) a7;
        Activity activity8 = this.f52549m;
        Objects.requireNonNull(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = C20531t.m38716a((ActivityC0945e) activity8).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a8, "");
        this.f157259B = (CutVideoEditViewModel) a8;
        Activity activity9 = this.f52549m;
        Objects.requireNonNull(activity9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a9 = C20531t.m38716a((ActivityC0945e) activity9).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a9, "");
        this.f157281Y = (CutVideoPreviewViewModel) a9;
        Activity activity10 = this.f52549m;
        Objects.requireNonNull(activity10, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a10 = C20531t.m38716a((ActivityC0945e) activity10).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a10, "");
        this.f157260C = (CutVideoListViewModel) a10;
        Activity activity11 = this.f52549m;
        Objects.requireNonNull(activity11, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a11 = C20531t.m38716a((ActivityC0945e) activity11).mo33800a(CutVideoStickerPointMusicViewModel.class);
        C89219l.m154716b(a11, "");
        this.f157261D = (CutVideoStickerPointMusicViewModel) a11;
        Activity activity12 = this.f52549m;
        Objects.requireNonNull(activity12, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a12 = C20531t.m38716a((ActivityC0945e) activity12).mo33800a(CutVideoMultiModeViewModel.class);
        C89219l.m154716b(a12, "");
        this.f157262E = (CutVideoMultiModeViewModel) a12;
        CutVideoViewModel cutVideoViewModel = this.f157280X;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110805i()) {
            AbstractC22219j jVar = this.f52551o;
            if (jVar == null) {
                C89219l.m154715b();
            }
            View c10 = jVar.mo36475c(R.id.e1b);
            C89219l.m154716b(c10, "");
            this.f157295u = (StickPointSingleVideoEditView) c10;
            C70242ba baVar = this.f157283b;
            if (baVar != null) {
                AbstractC70300bv bvVar = this.f157264G;
                C89219l.m154721d(bvVar, "");
                baVar.f157047b = bvVar;
            }
        } else {
            FrameLayout frameLayout = this.f157294t;
            if (frameLayout == null) {
                C89219l.m154710a("recyclerViewLayout");
            }
            frameLayout.setVisibility(0);
        }
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        VideoEditViewModel videoEditViewModel = this.f157297w;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f157296v;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        C71588c cVar = new C71588c(t, this, videoEditViewModel, cutMultiVideoViewModel);
        this.f157279V = cVar;
        RecyclerView recyclerView = this.f157285d;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        View view2 = this.f157288g;
        if (view2 == null) {
            C89219l.m154710a("animTabDot");
        }
        CutVideoViewModel cutVideoViewModel2 = this.f157280X;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        cVar.mo113337a(recyclerView, view2, new C71587b(cutVideoViewModel2.mo110805i(), true, true), new C70397z(this));
        RecyclerView recyclerView2 = this.f157285d;
        if (recyclerView2 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
        if (adapter instanceof C70582z) {
            zVar = adapter;
        }
        this.f157282a = zVar;
    }

    /* renamed from: a */
    public final void mo110962a(boolean z, boolean z2) {
        C70582z zVar;
        if (!z2 || (zVar = this.f157282a) == null || zVar.mo111340a().size() != 0) {
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f157258A;
            if (cutVideoTitleBarViewModel == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo110795a(true);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f157258A;
            if (cutVideoTitleBarViewModel2 == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo110796b(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f157300z;
            if (cutVideoBottomBarViewModel == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.mo110650c(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f157300z;
            if (cutVideoBottomBarViewModel2 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel2.mo110651d(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f157300z;
            if (cutVideoBottomBarViewModel3 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel3.mo110646a(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f157300z;
            if (cutVideoBottomBarViewModel4 == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel4.mo110649b(this.f157265H);
            CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f157299y;
            if (cutVideoSpeedViewModel == null) {
                C89219l.m154710a("speedViewModel");
            }
            cutVideoSpeedViewModel.mo110751a(false);
            CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f157299y;
            if (cutVideoSpeedViewModel2 == null) {
                C89219l.m154710a("speedViewModel");
            }
            cutVideoSpeedViewModel2.mo110754b(this.f157265H);
            if (this.f157265H) {
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f157299y;
                if (cutVideoSpeedViewModel3 == null) {
                    C89219l.m154710a("speedViewModel");
                }
                VideoEditViewModel videoEditViewModel = this.f157297w;
                if (videoEditViewModel == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                EnumC78601i a = C70082m.m123739a(videoEditViewModel.mo111233l());
                C89219l.m154716b(a, "");
                cutVideoSpeedViewModel3.mo110750a(a);
            }
            if (this.f157283b != null) {
                CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f157281Y;
                if (cutVideoPreviewViewModel == null) {
                    C89219l.m154710a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo110737a();
                AbstractC70229av avVar = this.f157278U;
                if (avVar != null) {
                    avVar.mo110827a();
                }
                CutVideoListViewModel cutVideoListViewModel = this.f157260C;
                if (cutVideoListViewModel == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                Activity activity = this.f52549m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar = (ActivityC0945e) activity;
                C89219l.m154721d(eVar, "");
                JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(CutVideoPreviewViewModel.class);
                C89219l.m154716b(a2, "");
                ((CutVideoPreviewViewModel) a2).mo110737a();
                AbstractC70298bt btVar = cutVideoListViewModel.f156790c;
                if (btVar == null) {
                    C89219l.m154710a("stickerPointController");
                }
                btVar.mo110875a(z, z2);
            }
            VECutVideoPresenter vECutVideoPresenter = this.f157284c;
            if (vECutVideoPresenter == null) {
                C89219l.m154710a("presenter");
            }
            C70484n nVar = vECutVideoPresenter.f156560k;
            VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.f156559j;
            if (videoEditViewModel2 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            List<VideoSegment> k = videoEditViewModel2.mo111232k();
            if (nVar.f157497c) {
                AbstractC70076i iVar = nVar.f157496b;
                if (iVar != null) {
                    iVar.mo110542a(z, z2, k);
                }
            } else {
                AbstractC70076i iVar2 = nVar.f157495a;
                if (iVar2 != null) {
                    iVar2.mo110542a(z, z2, k);
                }
            }
            if (!mo110964d()) {
                CutVideoEditViewModel cutVideoEditViewModel = this.f157259B;
                if (cutVideoEditViewModel == null) {
                    C89219l.m154710a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.mo33689c(CutVideoEditViewModel.C70113e.f156787a);
            }
            if (z2) {
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f157296v;
                if (cutMultiVideoViewModel == null) {
                    C89219l.m154710a("cutMultiVideoViewModel");
                }
                cutMultiVideoViewModel.mo110472a();
            }
            if (mo110964d()) {
                VideoEditViewModel videoEditViewModel3 = this.f157297w;
                if (videoEditViewModel3 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                videoEditViewModel3.f157697v.setValue(null);
            }
            ImageView imageView = this.f157291j;
            if (imageView == null) {
                C89219l.m154710a("ivSave");
            }
            imageView.setVisibility(8);
            ImageView imageView2 = this.f157292k;
            if (imageView2 == null) {
                C89219l.m154710a("ivCancel");
            }
            imageView2.setVisibility(8);
            FrameLayout frameLayout = this.f157290i;
            if (frameLayout == null) {
                C89219l.m154710a("singleEditLayout");
            }
            frameLayout.setVisibility(8);
            TextView textView = this.f157287f;
            if (textView == null) {
                C89219l.m154710a("tvVideoSegmentDes");
            }
            textView.setVisibility(0);
            if (mo110964d()) {
                CutVideoListViewModel cutVideoListViewModel2 = this.f157260C;
                if (cutVideoListViewModel2 == null) {
                    C89219l.m154710a("cutVideoListViewModel");
                }
                cutVideoListViewModel2.mo110698b(true);
            } else {
                RecyclerView recyclerView = this.f157285d;
                if (recyclerView == null) {
                    C89219l.m154710a("videoRecyclerView");
                }
                recyclerView.setVisibility(0);
            }
            TextView textView2 = this.f157293l;
            if (textView2 == null) {
                C89219l.m154710a("singleEditTitle");
            }
            textView2.setVisibility(4);
            if (!(this.f157270M == null || this.f157271N == null)) {
                RecyclerView recyclerView2 = this.f157285d;
                if (recyclerView2 == null) {
                    C89219l.m154710a("videoRecyclerView");
                }
                View rootView = recyclerView2.getRootView();
                C89219l.m154716b(rootView, "");
                rootView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC70367ab(this, z2));
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f157281Y;
            if (cutVideoPreviewViewModel2 == null) {
                C89219l.m154710a("previewViewModel");
            }
            cutVideoPreviewViewModel2.mo33689c(CutVideoPreviewViewModel.C70130b.f156812a);
            C70463h.m124290a(mo110964d(), false, z, !z, z2, false);
            return;
        }
        CutVideoViewModel cutVideoViewModel = this.f157280X;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        cutVideoViewModel.mo110800a();
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
