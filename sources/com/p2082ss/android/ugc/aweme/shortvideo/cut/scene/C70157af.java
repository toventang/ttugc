package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
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
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70242ba;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70483m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70435a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.utils.C80221ao;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82005a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af */
public final class C70157af extends AbstractC82005a implements AbstractC20382b {

    /* renamed from: z */
    public static final C70158a f156869z = new C70158a((byte) 0);

    /* renamed from: A */
    private CutVideoMultiModeViewModel f156870A;

    /* renamed from: B */
    private CutVideoListViewModel f156871B;

    /* renamed from: C */
    private CutVideoMultiBottomViewModel f156872C;

    /* renamed from: D */
    private CutVideoEditViewModel f156873D;

    /* renamed from: E */
    private View f156874E;

    /* renamed from: F */
    private final AbstractC89244h f156875F = C89250i.m154773a((AbstractC89171a) new C70162e(this));

    /* renamed from: G */
    private final AbstractC89244h f156876G = C89250i.m154773a((AbstractC89171a) new C70172n(this));

    /* renamed from: H */
    private final AbstractC89244h f156877H = C89250i.m154773a((AbstractC89171a) new C70173o(this));

    /* renamed from: I */
    private final AbstractC89244h f156878I = C89250i.m154773a((AbstractC89171a) new C70170l(this));

    /* renamed from: J */
    private final AbstractC89244h f156879J = C89250i.m154773a((AbstractC89171a) new C70159b(this));

    /* renamed from: f */
    public C70242ba f156880f;

    /* renamed from: g */
    public VECutVideoPresenter f156881g;

    /* renamed from: h */
    public AbstractC70297bs f156882h;

    /* renamed from: i */
    public CutVideoViewModel f156883i;

    /* renamed from: j */
    public VideoEditViewModel f156884j;

    /* renamed from: k */
    public VEVideoCutterViewModel f156885k;

    /* renamed from: l */
    CutVideoPreviewViewModel f156886l;

    /* renamed from: t */
    public CutVideoStickerPointMusicViewModel f156887t;

    /* renamed from: u */
    public View f156888u;

    /* renamed from: v */
    public View f156889v;

    /* renamed from: w */
    public View f156890w;

    /* renamed from: x */
    public boolean f156891x;

    /* renamed from: y */
    public boolean f156892y;

    static {
        Covode.recordClassIndex(82600);
    }

    /* renamed from: G */
    public final C70174ag mo110810G() {
        return (C70174ag) this.f156875F.getValue();
    }

    /* renamed from: H */
    public final C70333n mo110811H() {
        return (C70333n) this.f156876G.getValue();
    }

    /* renamed from: I */
    public final C70363s mo110812I() {
        return (C70363s) this.f156877H.getValue();
    }

    /* renamed from: J */
    public final C70262bf mo110813J() {
        return (C70262bf) this.f156878I.getValue();
    }

    /* renamed from: K */
    public final C70306e mo110814K() {
        return (C70306e) this.f156879J.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$a */
    public static final class C70158a {
        static {
            Covode.recordClassIndex(82601);
        }

        private C70158a() {
        }

        public /* synthetic */ C70158a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$d */
    public static final class C70161d implements AbstractC70229av {

        /* renamed from: a */
        final /* synthetic */ C70157af f156895a;

        static {
            Covode.recordClassIndex(82604);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70229av
        /* renamed from: a */
        public final void mo110827a() {
            this.f156895a.mo110821b(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70229av
        /* renamed from: b */
        public final void mo110828b() {
            C70242ba baVar = this.f156895a.f156880f;
            if (baVar == null) {
                C89219l.m154715b();
            }
            baVar.mo110881g();
            this.f156895a.mo110821b(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70161d(C70157af afVar) {
            this.f156895a = afVar;
        }
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$c */
    public static final class C70160c implements AbstractC70441g {

        /* renamed from: a */
        final /* synthetic */ C70157af f156894a;

        static {
            Covode.recordClassIndex(82603);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g
        /* renamed from: a */
        public final void mo110822a() {
            C70157af.m123860b(this.f156894a).mo111336a(new C70576a(1));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g
        /* renamed from: c */
        public final List<VideoSegment> mo110826c() {
            List<VideoSegment> k = C70157af.m123859a(this.f156894a).mo111232k();
            C89219l.m154716b(k, "");
            return k;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g
        /* renamed from: b */
        public final void mo110825b() {
            this.f156894a.mo62771E().mo110489a((List<? extends VideoSegment>) C70157af.m123859a(this.f156894a).mo111232k(), false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70160c(C70157af afVar) {
            this.f156894a = afVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g
        /* renamed from: a */
        public final void mo110823a(List<? extends VideoSegment> list) {
            this.f156894a.mo62771E().mo110488a(list, C70157af.m123859a(this.f156894a).mo111232k().size());
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g
        /* renamed from: a */
        public final void mo110824a(boolean z, boolean z2) {
            int i;
            VECutVideoPresenter E = this.f156894a.mo62771E();
            E.f156552c = z;
            E.f156560k.f157497c = z;
            AbstractC70078j jVar = E.f156555f;
            if (jVar != null) {
                jVar.mo110555d(z);
            }
            E.f156561l.f162428b = z;
            if (z2) {
                this.f156894a.mo62771E().mo110489a(C70157af.m123859a(this.f156894a).mo111232k(), !z);
            }
            C70363s I = this.f156894a.mo110812I();
            FrameLayout frameLayout = I.f157294t;
            if (frameLayout == null) {
                C89219l.m154710a("recyclerViewLayout");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                i = (int) C13628n.m24520b(I.f52549m, 37.0f);
            } else {
                i = 0;
            }
            layoutParams2.bottomMargin = i;
            if (z) {
                this.f156894a.mo110812I().f157277T = false;
                C70582z zVar = this.f156894a.mo110812I().f157282a;
                if (zVar == null) {
                    C89219l.m154715b();
                }
                zVar.f157925b = 0;
                StickPointVideoSegView stickPointVideoSegView = this.f156894a.mo110812I().f157289h;
                if (stickPointVideoSegView == null) {
                    C89219l.m154710a("stickPointVideoTitleView");
                }
                stickPointVideoSegView.setVisibility(0);
                C70157af afVar = this.f156894a;
                afVar.mo36417e(afVar.mo110813J());
                C70157af afVar2 = this.f156894a;
                afVar2.mo36413d(afVar2.mo110814K());
                C70157af afVar3 = this.f156894a;
                afVar3.mo36413d(afVar3.mo110811H());
                C70157af afVar4 = this.f156894a;
                afVar4.mo36413d(afVar4.mo110812I());
                this.f156894a.mo110811H().mo110955a(true);
                return;
            }
            if (z2) {
                VECutVideoPresenter E2 = this.f156894a.mo62771E();
                C0692e<Long, Long> playBoundary = this.f156894a.mo110811H().mo110956b().getPlayBoundary();
                C89219l.m154716b(playBoundary, "");
                E2.mo110485a(playBoundary);
                VEVideoCutterViewModel b = C70157af.m123860b(this.f156894a);
                F f = this.f156894a.mo110811H().mo110956b().getPlayBoundary().f2750a;
                if (f == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(f, "");
                b.mo111336a(new C70576a(f.longValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            } else {
                C70157af.m123860b(this.f156894a).mo111336a(new C70576a(1, false));
            }
            C70363s I2 = this.f156894a.mo110812I();
            CutVideoViewModel cutVideoViewModel = this.f156894a.f156883i;
            if (cutVideoViewModel == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            I2.f157277T = cutVideoViewModel.mo110804h();
            StickPointVideoSegView stickPointVideoSegView2 = this.f156894a.mo110812I().f157289h;
            if (stickPointVideoSegView2 == null) {
                C89219l.m154710a("stickPointVideoTitleView");
            }
            stickPointVideoSegView2.setVisibility(8);
            C70157af afVar5 = this.f156894a;
            afVar5.mo36417e(afVar5.mo110814K());
            this.f156894a.mo110811H().mo110955a(false);
            C70157af afVar6 = this.f156894a;
            afVar6.mo36417e(afVar6.mo110811H());
            C70157af afVar7 = this.f156894a;
            afVar7.mo36417e(afVar7.mo110812I());
            C70157af afVar8 = this.f156894a;
            afVar8.mo36413d(afVar8.mo110813J());
        }
    }

    /* renamed from: E */
    public final VECutVideoPresenter mo62771E() {
        VECutVideoPresenter vECutVideoPresenter = this.f156881g;
        if (vECutVideoPresenter == null) {
            C89219l.m154710a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: F */
    public final AbstractC70297bs mo110809F() {
        AbstractC70297bs bsVar = this.f156882h;
        if (bsVar == null) {
            C89219l.m154710a("previewEditCallback");
        }
        return bsVar;
    }

    /* renamed from: N */
    public final boolean mo110817N() {
        C70242ba baVar = this.f156880f;
        if (baVar == null) {
            return false;
        }
        return baVar.mo110881g();
    }

    /* renamed from: P */
    public final AbstractC70527h mo110819P() {
        return mo110811H().mo110956b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$e */
    static final class C70162e extends AbstractC89220m implements AbstractC89171a<C70174ag> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156896a;

        static {
            Covode.recordClassIndex(82605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70162e(C70157af afVar) {
            super(0);
            this.f156896a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70174ag invoke() {
            C70174ag agVar = new C70174ag();
            C70242ba baVar = this.f156896a.f156880f;
            if (baVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(baVar, "");
            agVar.f156916a = baVar;
            this.f156896a.mo36387a(R.id.cl1, agVar, "CutVideoMultiModeScene");
            return agVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$l */
    static final class C70170l extends AbstractC89220m implements AbstractC89171a<C70262bf> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156911a;

        static {
            Covode.recordClassIndex(82613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70170l(C70157af afVar) {
            super(0);
            this.f156911a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70262bf invoke() {
            C70262bf bfVar = new C70262bf();
            C70242ba baVar = this.f156911a.f156880f;
            if (baVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(baVar, "");
            bfVar.f157102a = baVar;
            this.f156911a.mo36387a(R.id.as0, bfVar, "CutVideoStickerPointScene");
            return bfVar;
        }
    }

    /* renamed from: M */
    public final void mo110816M() {
        Activity activity = this.f52549m;
        if (activity != null) {
            activity.finish();
        }
        C70242ba baVar = this.f156880f;
        if (baVar != null) {
            C70005cr.m123611a().mo70083a(baVar.f157053h);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C70242ba baVar = this.f156880f;
        if (baVar != null) {
            if (baVar.f157069x && !baVar.f157070y) {
                baVar.f157048c.mo111036c();
            }
            baVar.f157069x = false;
            baVar.f157070y = false;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        C70242ba baVar = this.f156880f;
        if (baVar != null) {
            if (baVar.f157048c.mo111032a()) {
                baVar.f157069x = true;
            }
            baVar.f157048c.mo111034b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$b */
    static final class C70159b extends AbstractC89220m implements AbstractC89171a<C70306e> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156893a;

        static {
            Covode.recordClassIndex(82602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70159b(C70157af afVar) {
            super(0);
            this.f156893a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70306e invoke() {
            C70306e eVar = new C70306e();
            eVar.mo110943a(this.f156893a.mo62771E());
            eVar.f157158a = this.f156893a.f156880f;
            eVar.mo110944a(this.f156893a.mo110809F());
            this.f156893a.mo36387a(R.id.ema, eVar, "CutVideoBottomBarScene");
            return eVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$m */
    public static final class RunnableC70171m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70157af f156912a;

        static {
            Covode.recordClassIndex(82614);
        }

        RunnableC70171m(C70157af afVar) {
            this.f156912a = afVar;
        }

        public final void run() {
            Activity t = this.f156912a.mo36486t();
            C89219l.m154716b(t, "");
            View startSlide = this.f156912a.mo110811H().mo110956b().getStartSlide();
            C89219l.m154716b(startSlide, "");
            C80221ao.m139048a(t, startSlide, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$n */
    static final class C70172n extends AbstractC89220m implements AbstractC89171a<C70333n> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156913a;

        static {
            Covode.recordClassIndex(82615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70172n(C70157af afVar) {
            super(0);
            this.f156913a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70333n invoke() {
            C70333n nVar = new C70333n(false, true, 1);
            nVar.mo110954a(this.f156913a.mo62771E());
            nVar.f157211a = this.f156913a.f156880f;
            this.f156913a.mo36387a(R.id.ema, nVar, "CutVideoEditScene");
            return nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$o */
    static final class C70173o extends AbstractC89220m implements AbstractC89171a<C70363s> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156914a;

        static {
            Covode.recordClassIndex(82616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70173o(C70157af afVar) {
            super(0);
            this.f156914a = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70363s invoke() {
            C70363s sVar = new C70363s();
            VECutVideoPresenter E = this.f156914a.mo62771E();
            C89219l.m154721d(E, "");
            sVar.f157284c = E;
            AbstractC70297bs F = this.f156914a.mo110809F();
            C89219l.m154721d(F, "");
            sVar.f157286e = F;
            sVar.f157283b = this.f156914a.f156880f;
            this.f156914a.mo36387a(R.id.as0, sVar, "CutVideoListScene");
            return sVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$g */
    public static final class C70165g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70157af f156899a;

        /* renamed from: b */
        final /* synthetic */ boolean f156900b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f156901c;

        static {
            Covode.recordClassIndex(82608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70165g(C70157af afVar, boolean z, AbstractC89172b bVar) {
            super(0);
            this.f156899a = afVar;
            this.f156900b = z;
            this.f156901c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f156900b) {
                C70157af.m123861c(this.f156899a).mo110780b(false);
            } else {
                View view = this.f156899a.f156888u;
                if (view == null) {
                    C89219l.m154710a("normalModeView");
                }
                view.setVisibility(8);
                C70157af.m123862d(this.f156899a).setVisibility(8);
            }
            if (!this.f156900b) {
                C70157af.m123861c(this.f156899a).mo110779a(true);
                C70242ba baVar = this.f156899a.f156880f;
                if (baVar != null) {
                    baVar.mo110880f();
                }
            }
            AbstractC89172b bVar = this.f156901c;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f156900b));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: L */
    public final void mo110815L() {
        List<VideoSegment> videoSegmentList;
        if (C80221ao.m139049a(true)) {
            if (C70983b.m125339a() || mo110819P().getMaxCutDuration() < 60000) {
                VideoEditViewModel videoEditViewModel = this.f156884j;
                if (videoEditViewModel == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                C1213t<CutVideoContext> tVar = videoEditViewModel.f157698w;
                C89219l.m154716b(tVar, "");
                CutVideoContext value = tVar.getValue();
                if (value != null && (videoSegmentList = value.getVideoSegmentList()) != null) {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) videoSegmentList, 10));
                    Iterator<T> it = videoSegmentList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().f156710b));
                    }
                    if (C89070n.m154600t(arrayList) > 60000) {
                        mo110811H().mo110956b().post(new RunnableC70171m(this));
                    }
                }
            }
        }
    }

    /* renamed from: O */
    public final C69790a mo110818O() {
        C70242ba baVar = this.f156880f;
        if (baVar == null) {
            return null;
        }
        if (baVar.f157062q == null) {
            baVar.f157062q = new C69790a();
        }
        C69790a aVar = baVar.f157062q;
        List<VideoSegment> c = baVar.mo110877c();
        if (aVar != null && !C84904k.m145909a(c)) {
            if (!TextUtils.isEmpty(C70455f.f157417a)) {
                aVar.setAiCutId(C70455f.f157417a);
            }
            if (c == null) {
                C89219l.m154715b();
            }
            aVar.setVideoCount(Integer.valueOf(c.size()));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            for (T t : c) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                sb.append(t2.f156710b);
                sb2.append(t2.mo110578d());
                t2.mo110580e();
                t2.mo110578d();
                if (i < c.size() - 1) {
                    sb.append(",");
                    sb2.append(",");
                }
                i = i2;
            }
            aVar.setVideoCutLenListStr(sb.toString());
            aVar.setVideoSrcLenListStr(sb.toString());
            aVar.setVideoCutStartTimeListStr(sb2.toString());
        }
        C70455f.f157417a = null;
        return baVar.f157062q;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$f */
    public static final class C70163f implements AbstractC70435a {

        /* renamed from: a */
        final /* synthetic */ C70157af f156897a;

        static {
            Covode.recordClassIndex(82606);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70163f(C70157af afVar) {
            this.f156897a = afVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$f$a */
        static final class C70164a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C70163f f156898a;

            static {
                Covode.recordClassIndex(82607);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C70164a(C70163f fVar) {
                super(1);
                this.f156898a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    this.f156898a.f156897a.mo110815L();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70435a
        /* renamed from: a */
        public final void mo110829a(int i) {
            if (i == 1) {
                if (!this.f156897a.f156891x) {
                    C70463h.m124287a(C70157af.m123859a(this.f156897a).mo111232k());
                    this.f156897a.f156891x = true;
                }
                this.f156897a.mo110820a(false, (AbstractC89172b<? super Boolean, C89391z>) null);
                return;
            }
            if (!this.f156897a.f156892y) {
                C70463h.m124292b(C70157af.m123859a(this.f156897a).mo111232k());
                this.f156897a.f156892y = true;
            }
            this.f156897a.mo110820a(true, (AbstractC89172b<? super Boolean, C89391z>) new C70164a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$h */
    public static final class DialogInterface$OnClickListenerC70166h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70157af f156902a;

        static {
            Covode.recordClassIndex(82609);
        }

        DialogInterface$OnClickListenerC70166h(C70157af afVar) {
            this.f156902a = afVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C70463h.m124288a(C70157af.m123859a(this.f156902a).mo111232k(), "exit_clip_popup_cancel", this.f156902a.mo110817N());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m123859a(C70157af afVar) {
        VideoEditViewModel videoEditViewModel = afVar.f156884j;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoCutterViewModel m123860b(C70157af afVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = afVar.f156885k;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m123861c(C70157af afVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = afVar.f156887t;
        if (cutVideoStickerPointMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m123862d(C70157af afVar) {
        View view = afVar.f156889v;
        if (view == null) {
            C89219l.m154710a("topVideoEditView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m123863e(C70157af afVar) {
        View view = afVar.f156890w;
        if (view == null) {
            C89219l.m154710a("editPanelView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$k */
    public static final class C70169k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C70157af f156909a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout.LayoutParams f156910b;

        static {
            Covode.recordClassIndex(82612);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            C70157af.m123862d(this.f156909a).setVisibility(8);
            this.f156910b.height = -2;
            C70157af.m123863e(this.f156909a).setLayoutParams(this.f156910b);
        }

        C70169k(C70157af afVar, LinearLayout.LayoutParams layoutParams) {
            this.f156909a = afVar;
            this.f156910b = layoutParams;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$j */
    public static final class C70168j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70157af f156904a;

        /* renamed from: b */
        final /* synthetic */ int f156905b;

        /* renamed from: c */
        final /* synthetic */ float f156906c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout.LayoutParams f156907d;

        /* renamed from: e */
        final /* synthetic */ boolean f156908e;

        static {
            Covode.recordClassIndex(82611);
        }

        C70168j(C70157af afVar, int i, float f, LinearLayout.LayoutParams layoutParams, boolean z) {
            this.f156904a = afVar;
            this.f156905b = i;
            this.f156906c = f;
            this.f156907d = layoutParams;
            this.f156908e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f156905b;
            float f = (floatValue - ((float) i)) / (this.f156906c - ((float) i));
            this.f156907d.height = (int) floatValue;
            C70157af.m123863e(this.f156904a).setLayoutParams(this.f156907d);
            if (this.f156908e) {
                C70157af.m123862d(this.f156904a).setAlpha(f);
            } else {
                C70157af.m123862d(this.f156904a).setAlpha(1.0f - f);
            }
        }
    }

    /* renamed from: b */
    public final void mo110821b(boolean z) {
        int i;
        float dimension;
        C70242ba baVar = this.f156880f;
        if (baVar == null) {
            C89219l.m154715b();
        }
        boolean g = baVar.mo110881g();
        if (g) {
            View view = this.f156890w;
            if (view == null) {
                C89219l.m154710a("editPanelView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View view2 = this.f156890w;
            if (view2 == null) {
                C89219l.m154710a("editPanelView");
            }
            int height = view2.getHeight();
            if (z) {
                View view3 = this.f156889v;
                if (view3 == null) {
                    C89219l.m154710a("topVideoEditView");
                }
                view3.setAlpha(0.0f);
                View view4 = this.f156889v;
                if (view4 == null) {
                    C89219l.m154710a("topVideoEditView");
                }
                view4.setVisibility(0);
                dimension = mo36486t().getResources().getDimension(R.dimen.qt);
            } else {
                dimension = mo36486t().getResources().getDimension(R.dimen.sy);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) height, dimension);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new C70168j(this, height, dimension, layoutParams2, z));
            if (!z) {
                ofFloat.addListener(new C70169k(this, layoutParams2));
            }
            ofFloat.start();
        } else {
            View view5 = this.f156888u;
            if (view5 == null) {
                C89219l.m154710a("normalModeView");
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            view5.setVisibility(i);
        }
        if (g) {
            if (z) {
                CutVideoListViewModel cutVideoListViewModel = this.f156871B;
                if (cutVideoListViewModel == null) {
                    C89219l.m154710a("videoListViewModel");
                }
                cutVideoListViewModel.mo110697b();
                CutVideoListViewModel cutVideoListViewModel2 = this.f156871B;
                if (cutVideoListViewModel2 == null) {
                    C89219l.m154710a("videoListViewModel");
                }
                cutVideoListViewModel2.mo33689c(new CutVideoListViewModel.C70123j(g));
                return;
            }
            CutVideoListViewModel cutVideoListViewModel3 = this.f156871B;
            if (cutVideoListViewModel3 == null) {
                C89219l.m154710a("videoListViewModel");
            }
            cutVideoListViewModel3.mo110695a();
            CutVideoListViewModel cutVideoListViewModel4 = this.f156871B;
            if (cutVideoListViewModel4 == null) {
                C89219l.m154710a("videoListViewModel");
            }
            cutVideoListViewModel4.mo33689c(new CutVideoListViewModel.C70117d(g));
        } else if (z) {
            CutVideoListViewModel cutVideoListViewModel5 = this.f156871B;
            if (cutVideoListViewModel5 == null) {
                C89219l.m154710a("videoListViewModel");
            }
            cutVideoListViewModel5.mo110696a(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f156870A;
            if (cutVideoMultiModeViewModel == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo110722g();
        } else {
            CutVideoListViewModel cutVideoListViewModel6 = this.f156871B;
            if (cutVideoListViewModel6 == null) {
                C89219l.m154710a("videoListViewModel");
            }
            cutVideoListViewModel6.mo110696a(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f156870A;
            if (cutVideoMultiModeViewModel2 == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel2.mo110721b();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        Serializable serializable;
        Intent intent;
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        List<C69905c> list = null;
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a, "");
        this.f156884j = (VideoEditViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a2, "");
        this.f156885k = (VEVideoCutterViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a3, "");
        this.f156886l = (CutVideoPreviewViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoStickerPointMusicViewModel.class);
        C89219l.m154716b(a4, "");
        this.f156887t = (CutVideoStickerPointMusicViewModel) a4;
        CutVideoViewModel cutVideoViewModel = this.f156883i;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110805i()) {
            mo36417e(mo110810G());
            mo110810G().f156917b = new C70163f(this);
            mo36417e(mo110813J());
            if (mo110810G().mo110835a().getCurrentMode() == 2) {
                mo110815L();
            }
        } else {
            mo36417e(mo110814K());
            mo36417e(mo110811H());
            mo36417e(mo110812I());
            mo110815L();
        }
        CutVideoViewModel cutVideoViewModel2 = this.f156883i;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo110805i()) {
            this.f156891x = true;
            View c = mo36475c(R.id.ux);
            C89219l.m154716b(c, "");
            this.f156874E = c;
            View c2 = mo36475c(R.id.ctn);
            C89219l.m154716b(c2, "");
            this.f156888u = c2;
            View c3 = mo36475c(R.id.ema);
            C89219l.m154716b(c3, "");
            this.f156889v = c3;
            View c4 = mo36475c(R.id.as0);
            C89219l.m154716b(c4, "");
            this.f156890w = c4;
            C70242ba baVar = this.f156880f;
            if (baVar != null) {
                Activity t = mo36486t();
                Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar = (ActivityC0945e) t;
                C89219l.m154721d(eVar, "");
                JediViewModel a5 = C20531t.m38716a(eVar).mo33800a(CutVideoStickerPointMusicViewModel.class);
                C89219l.m154716b(a5, "");
                baVar.f157065t = (CutVideoStickerPointMusicViewModel) a5;
                JediViewModel a6 = C20531t.m38716a(eVar).mo33800a(CutVideoMultiModeViewModel.class);
                C89219l.m154716b(a6, "");
                baVar.f157066u = (CutVideoMultiModeViewModel) a6;
                JediViewModel a7 = C20531t.m38716a(eVar).mo33800a(CutVideoBottomBarViewModel.class);
                C89219l.m154716b(a7, "");
                baVar.f157067v = (CutVideoBottomBarViewModel) a7;
                JediViewModel a8 = C20531t.m38716a(eVar).mo33800a(CutVideoEditViewModel.class);
                C89219l.m154716b(a8, "");
                baVar.f157068w = (CutVideoEditViewModel) a8;
                baVar.f157051f.mo111010a(eVar);
                baVar.f157051f.mo111011a(new C70242ba.C70244b(baVar, eVar));
                baVar.f157048c.mo111029a(new C70242ba.C70245c(baVar));
                baVar.f157057l = new C70483m();
                baVar.f157059n = new C70242ba.C70246d(baVar);
                baVar.f157053h = C70005cr.m123611a().f156482a;
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = baVar.f157067v;
                if (cutVideoBottomBarViewModel == null) {
                    C89219l.m154710a("bottomBarViewModel");
                }
                AbstractC88412b unused = cutVideoBottomBarViewModel.mo33677a(eVar, C70252bb.f157079a, new C20370ah(), new C70242ba.C70247e(baVar));
                CutVideoEditViewModel cutVideoEditViewModel = baVar.f157068w;
                if (cutVideoEditViewModel == null) {
                    C89219l.m154710a("cutVideoEditViewModel");
                }
                AbstractC88412b unused2 = cutVideoEditViewModel.mo33677a(eVar, C70253bc.f157080a, new C20370ah(), new C70242ba.C70248f(baVar));
            }
            C70242ba baVar2 = this.f156880f;
            if (baVar2 != null) {
                AbstractC70516a b = mo110811H().mo110956b();
                C89219l.m154721d(b, "");
                baVar2.f157060o = b;
            }
            Activity activity5 = this.f52549m;
            if (activity5 == null || (intent = activity5.getIntent()) == null) {
                serializable = null;
            } else {
                serializable = intent.getSerializableExtra("extra_stickpoint_music_list");
            }
            C70242ba baVar3 = this.f156880f;
            if (baVar3 != null) {
                if (serializable != null) {
                    list = C89070n.m154585g((Collection) ((List) serializable));
                }
                baVar3.f157058m = list;
                AbstractC70301bw bwVar = baVar3.f157046a;
                if (bwVar == null) {
                    C89219l.m154710a("musicViewController");
                }
                bwVar.mo110899a(list);
            }
            C70242ba baVar4 = this.f156880f;
            if (baVar4 != null) {
                baVar4.f157050e = new C70160c(this);
            }
            AbstractC70297bs bsVar = this.f156882h;
            if (bsVar == null) {
                C89219l.m154710a("previewEditCallback");
            }
            C70242ba baVar5 = this.f156880f;
            if (baVar5 == null) {
                C89219l.m154715b();
            }
            bsVar.mo110854a(baVar5);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f156870A;
            if (cutVideoMultiModeViewModel == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            Activity activity6 = this.f52549m;
            Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            cutVideoMultiModeViewModel.mo110719a((ActivityC0945e) activity6, true);
            View view = this.f156888u;
            if (view == null) {
                C89219l.m154710a("normalModeView");
            }
            view.setVisibility(8);
            View view2 = this.f156889v;
            if (view2 == null) {
                C89219l.m154710a("topVideoEditView");
            }
            view2.setVisibility(8);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f156887t;
            if (cutVideoStickerPointMusicViewModel == null) {
                C89219l.m154710a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo110780b(true);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f156887t;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                C89219l.m154710a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.mo110779a(true);
            C70242ba baVar6 = this.f156880f;
            if (baVar6 != null) {
                baVar6.mo110880f();
            }
            mo110810G().mo110835a().measure(C70636dh.m124831b(this.f52549m), C70636dh.m124828a(this.f52549m));
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f156886l;
            if (cutVideoPreviewViewModel == null) {
                C89219l.m154710a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo33689c(new CutVideoPreviewViewModel.C70132d(mo110810G().mo110835a().getMeasuredHeight()));
            mo110812I().f157278U = new C70161d(this);
            return;
        }
        this.f156892y = true;
        VideoEditViewModel videoEditViewModel = this.f156884j;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        C70463h.m124292b(videoEditViewModel.mo111232k());
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$i */
    static final class DialogInterface$OnClickListenerC70167i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70157af f156903a;

        static {
            Covode.recordClassIndex(82610);
        }

        DialogInterface$OnClickListenerC70167i(C70157af afVar) {
            this.f156903a = afVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f156903a.mo110816M();
            C70463h.m124288a(C70157af.m123859a(this.f156903a).mo111232k(), "exit_clip_popup_confirm", this.f156903a.mo110817N());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110820a(boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        View view = this.f156888u;
        if (view == null) {
            C89219l.m154710a("normalModeView");
        }
        view.setVisibility(0);
        View view2 = this.f156889v;
        if (view2 == null) {
            C89219l.m154710a("topVideoEditView");
        }
        view2.setVisibility(0);
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f156887t;
        if (cutVideoStickerPointMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        cutVideoStickerPointMusicViewModel.mo110780b(true);
        C80558hx.m139642a(200, new C70165g(this, z, bVar));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        CutVideoViewModel cutVideoViewModel = this.f156883i;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110805i()) {
            this.f156880f = new C70242ba();
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f156870A;
            if (cutVideoMultiModeViewModel == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            C70242ba baVar = this.f156880f;
            if (baVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(baVar, "");
            cutVideoMultiModeViewModel.f156807b = baVar;
            CutVideoListViewModel cutVideoListViewModel = this.f156871B;
            if (cutVideoListViewModel == null) {
                C89219l.m154710a("videoListViewModel");
            }
            C70242ba baVar2 = this.f156880f;
            if (baVar2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(baVar2, "");
            cutVideoListViewModel.f156790c = baVar2;
        }
        CutVideoViewModel cutVideoViewModel2 = this.f156883i;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo110805i()) {
            mo36413d(mo110810G());
            mo36413d(mo110813J());
            mo36413d(mo110814K());
            mo36413d(mo110811H());
            mo36413d(mo110812I());
            return;
        }
        mo36417e(mo110814K());
        mo36417e(mo110811H());
        mo36417e(mo110812I());
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f156883i = (CutVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoMultiModeViewModel.class);
        C89219l.m154716b(a2, "");
        this.f156870A = (CutVideoMultiModeViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a3, "");
        this.f156871B = (CutVideoListViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoMultiBottomViewModel.class);
        C89219l.m154716b(a4, "");
        this.f156872C = (CutVideoMultiBottomViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a5, "");
        this.f156873D = (CutVideoEditViewModel) a5;
        CutVideoViewModel cutVideoViewModel = this.f156883i;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110805i()) {
            View a6 = C1764a.m5927a(layoutInflater, R.layout.aro, viewGroup, false);
            Objects.requireNonNull(a6, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) a6;
        }
        View a7 = C1764a.m5927a(layoutInflater, R.layout.arn, viewGroup, false);
        Objects.requireNonNull(a7, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a7;
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
