package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
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
import com.google.p1998c.p1999a.C27252o;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70044a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70157af;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70242ba;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82005a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap */
public final class C70198ap extends AbstractC82005a implements AbstractC20382b, AbstractC70098s, AbstractC70297bs, AbstractC70299bu {

    /* renamed from: A */
    public static long f156956A = -1;

    /* renamed from: B */
    public static final C70199a f156957B = new C70199a((byte) 0);

    /* renamed from: C */
    private final AbstractC89244h f156958C = C89250i.m154773a((AbstractC89171a) new C70209k(this));

    /* renamed from: D */
    private final AbstractC89244h f156959D = C89250i.m154773a((AbstractC89171a) new C70212n(this));

    /* renamed from: E */
    private final AbstractC89244h f156960E = C89250i.m154773a((AbstractC89171a) new C70210l(this));

    /* renamed from: F */
    private final AbstractC89244h f156961F = C89250i.m154773a((AbstractC89171a) new C70207i(this));

    /* renamed from: G */
    private final AbstractC89244h f156962G = C89250i.m154773a((AbstractC89171a) new C70211m(this));

    /* renamed from: H */
    private final AbstractC89244h f156963H = C89250i.m154773a((AbstractC89171a) new C70208j(this));

    /* renamed from: I */
    private CutMultiVideoViewModel f156964I;

    /* renamed from: f */
    public CutVideoViewModel f156965f;

    /* renamed from: g */
    public VideoEditViewModel f156966g;

    /* renamed from: h */
    public CutVideoTitleBarViewModel f156967h;

    /* renamed from: i */
    CutVideoBottomBarViewModel f156968i;

    /* renamed from: j */
    CutVideoListViewModel f156969j;

    /* renamed from: k */
    CutVideoEditViewModel f156970k;

    /* renamed from: l */
    public CutVideoPreviewViewModel f156971l;

    /* renamed from: t */
    public long f156972t;

    /* renamed from: u */
    long f156973u = C70637di.m124840a();

    /* renamed from: v */
    final int f156974v = 3600000;

    /* renamed from: w */
    public final ArrayList<ImportVideoInfo> f156975w = new ArrayList<>();

    /* renamed from: x */
    public boolean f156976x;

    /* renamed from: y */
    public long f156977y;

    /* renamed from: z */
    public boolean f156978z;

    /* renamed from: N */
    private final C70181aj m123914N() {
        return (C70181aj) this.f156958C.getValue();
    }

    /* renamed from: O */
    private final C70230aw m123915O() {
        return (C70230aw) this.f156962G.getValue();
    }

    /* renamed from: E */
    public final C70217au mo62771E() {
        return (C70217au) this.f156960E.getValue();
    }

    /* renamed from: F */
    public final C70157af mo110847F() {
        return (C70157af) this.f156961F.getValue();
    }

    /* renamed from: H */
    public final VECutVideoPresenter mo110848H() {
        return (VECutVideoPresenter) this.f156963H.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$a */
    public static final class C70199a {
        static {
            Covode.recordClassIndex(82642);
        }

        private C70199a() {
        }

        public /* synthetic */ C70199a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: b */
    public final AbstractC1204m mo110615b() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: e */
    public final void mo110618e() {
        mo110849I();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo110849I() {
        Activity activity = this.f52549m;
        if (activity != null) {
            activity.finish();
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

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: j */
    public final void mo110623j() {
        mo110852L().mo111142b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$j */
    static final class C70208j extends AbstractC89220m implements AbstractC89171a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156991a;

        static {
            Covode.recordClassIndex(82651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70208j(C70198ap apVar) {
            super(0);
            this.f156991a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VECutVideoPresenter invoke() {
            return new VECutVideoPresenter(C69744c.m123270b(), this.f156991a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$n */
    static final class C70212n extends AbstractC89220m implements AbstractC89171a<C70282bm> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156995a;

        static {
            Covode.recordClassIndex(82655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70212n(C70198ap apVar) {
            super(0);
            this.f156995a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70282bm invoke() {
            C70282bm bmVar = new C70282bm();
            this.f156995a.mo36387a(R.id.ah_, bmVar, "CutVideoTitleBarScene");
            return bmVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70299bu
    /* renamed from: G */
    public final float mo87661G() {
        return mo110852L().getSelectedTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: J */
    public final int mo110850J() {
        return m123914N().mo110842d();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: K */
    public final int mo110851K() {
        return m123914N().mo110836C();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: c */
    public final long mo110616c() {
        return mo110852L().getMaxCutDuration();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: d */
    public final C0692e<Long, Long> mo110617d() {
        C0692e<Long, Long> playBoundary = mo110852L().getPlayBoundary();
        C89219l.m154716b(playBoundary, "");
        return playBoundary;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: g */
    public final int mo110620g() {
        CutVideoEditViewModel cutVideoEditViewModel = this.f156970k;
        if (cutVideoEditViewModel == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel.f156782a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: h */
    public final SurfaceView mo110621h() {
        return m123914N().mo110840b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$k */
    static final class C70209k extends AbstractC89220m implements AbstractC89171a<C70181aj> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156992a;

        static {
            Covode.recordClassIndex(82652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70209k(C70198ap apVar) {
            super(0);
            this.f156992a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70181aj invoke() {
            C70181aj ajVar = new C70181aj();
            ajVar.mo110839a(this.f156992a.mo110848H());
            this.f156992a.mo36387a(R.id.ah_, ajVar, "CutVideoPreviewScene");
            return ajVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$m */
    static final class C70211m extends AbstractC89220m implements AbstractC89171a<C70230aw> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156994a;

        static {
            Covode.recordClassIndex(82654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70211m(C70198ap apVar) {
            super(0);
            this.f156994a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70230aw invoke() {
            C70230aw awVar = new C70230aw();
            awVar.f157022a = this.f156994a;
            this.f156994a.mo36387a(R.id.ah_, awVar, "CutVideoSpeedScene");
            return awVar;
        }
    }

    static {
        Covode.recordClassIndex(82641);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo110853M() {
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g() || !mo110847F().mo110817N()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: a */
    public final Context mo110613a() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) activity;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n */
    public final void mo36480n() {
        super.mo36480n();
        VECutVideoPresenter H = mo110848H();
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        H.mo110486a((ActivityC0945e) t);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$i */
    static final class C70207i extends AbstractC89220m implements AbstractC89171a<C70157af> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156990a;

        static {
            Covode.recordClassIndex(82650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70207i(C70198ap apVar) {
            super(0);
            this.f156990a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70157af invoke() {
            C70157af afVar = new C70157af();
            VECutVideoPresenter H = this.f156990a.mo110848H();
            C89219l.m154721d(H, "");
            afVar.f156881g = H;
            C70198ap apVar = this.f156990a;
            C89219l.m154721d(apVar, "");
            afVar.f156882h = apVar;
            this.f156990a.mo36387a(R.id.ah_, afVar, "CutVideoMultiBottomScene");
            return afVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$l */
    static final class C70210l extends AbstractC89220m implements AbstractC89171a<C70217au> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156993a;

        static {
            Covode.recordClassIndex(82653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70210l(C70198ap apVar) {
            super(0);
            this.f156993a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70217au invoke() {
            C70217au auVar = new C70217au();
            VECutVideoPresenter H = this.f156993a.mo110848H();
            C89219l.m154721d(H, "");
            auVar.f157001f = H;
            C70198ap apVar = this.f156993a;
            C89219l.m154721d(apVar, "");
            auVar.f157002g = apVar;
            this.f156993a.mo36387a(R.id.ah_, auVar, "CutVideoSingleBottomScene");
            return auVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: L */
    public final AbstractC70527h mo110852L() {
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            return mo110847F().mo110819P();
        }
        return mo62771E().mo110859H();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: f */
    public final void mo110619f() {
        C70242ba baVar;
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g() && (baVar = mo110847F().f156880f) != null) {
            C70467l lVar = baVar.f157048c;
            lVar.f157449b = -1;
            lVar.f157452e = -1;
            AbstractC70300bv bvVar = baVar.f157047b;
            if (bvVar == null) {
                C89219l.m154710a("stickPointVideoSegController");
            }
            bvVar.mo110932b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$h */
    static final class CallableC70206h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156989a;

        static {
            Covode.recordClassIndex(82649);
        }

        CallableC70206h(C70198ap apVar) {
            this.f156989a = apVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            CallableC70206h<V> hVar = this;
            List<VideoSegment> k = C70198ap.m123916a(hVar.f156989a).mo111232k();
            if (k == null) {
                return null;
            }
            for (T t : k) {
                ArrayList<ImportVideoInfo> arrayList = hVar.f156989a.f156975w;
                int i = t.f156714f;
                int i2 = t.f156715g;
                C89219l.m154716b(t, "");
                arrayList.add(new ImportVideoInfo(i, i2, t.mo110577c(), t.mo110575b(), t.mo110571a(true).toString(), t.f156710b, t.mo110580e() - t.mo110578d(), t.f156730v, t.f156731w, t.mo110570a(), t.mo110582f(), t.mo110571a(false).toString()));
                hVar = this;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: i */
    public final void mo110622i() {
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            mo110847F().mo110811H();
        } else {
            mo62771E().mo110858G();
        }
        C84425b a = new C84425b().mo129406a(StringSet.type, "1");
        CutVideoViewModel cutVideoViewModel2 = this.f156965f;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        C84425b a2 = a.mo129403a("count", cutVideoViewModel2.mo110802b().f156843a.size());
        long currentTimeMillis = System.currentTimeMillis();
        CutVideoViewModel cutVideoViewModel3 = this.f156965f;
        if (cutVideoViewModel3 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        C80322d.m139251a("tool_performance_video_clip_first_frame", a2.mo129404a("duration", currentTimeMillis - cutVideoViewModel3.mo110802b().f156867y).f188764a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$b */
    public static final class C70200b implements AbstractC70302c {

        /* renamed from: a */
        public ProgressDialogC84958b f156979a;

        /* renamed from: b */
        final /* synthetic */ C70198ap f156980b;

        /* renamed from: c */
        final /* synthetic */ boolean f156981c = true;

        /* renamed from: d */
        final /* synthetic */ BackgroundVideoCompileConfigure f156982d;

        /* renamed from: e */
        final /* synthetic */ C27252o f156983e;

        static {
            Covode.recordClassIndex(82643);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x026b  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x027d  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0293  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0297  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x029e  */
        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCompileDone() {
            /*
            // Method dump skipped, instructions count: 686
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70198ap.C70200b.onCompileDone():void");
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            ProgressDialogC84958b bVar = this.f156979a;
            if (bVar != null && bVar.isShowing()) {
                bVar.setProgress((int) (f * 100.0f));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70302c
        /* renamed from: a */
        public final void mo110855a(boolean z) {
            this.f156980b.f156976x = z;
            if (!z) {
                ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(this.f156980b.f52549m, this.f156980b.mo36486t().getResources().getString(R.string.fvf));
                this.f156979a = b;
                if (b != null) {
                    b.setIndeterminate(false);
                }
            }
        }

        C70200b(C70198ap apVar, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, C27252o oVar) {
            this.f156980b = apVar;
            this.f156982d = backgroundVideoCompileConfigure;
            this.f156983e = oVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            C70198ap.m123917b(this.f156980b).mo110798d(true);
            C85056k.m146253b(this.f156979a);
            String a = this.f156980b.mo36472a(R.string.ary, Integer.valueOf(i));
            C89219l.m154716b(a, "");
            new C79459a(this.f156980b.f52549m).mo123052a(a).mo123053a();
            C39162r.m79460a("import_transcoding_end", new C84425b().mo129403a("status", 0).f188764a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m123916a(C70198ap apVar) {
        VideoEditViewModel videoEditViewModel = apVar.f156966g;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoTitleBarViewModel m123917b(C70198ap apVar) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar.f156967h;
        if (cutVideoTitleBarViewModel == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: a */
    public final void mo110854a(AbstractC70298bt btVar) {
        C89219l.m154721d(btVar, "");
        m123914N().f156926a = btVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$e */
    static final class C70203e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156986a;

        static {
            Covode.recordClassIndex(82646);
        }

        C70203e(C70198ap apVar) {
            this.f156986a = apVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C70198ap apVar = this.f156986a;
                CutVideoEditViewModel cutVideoEditViewModel = apVar.f156970k;
                if (cutVideoEditViewModel == null) {
                    C89219l.m154710a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.mo110668a(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar.f156967h;
                if (cutVideoTitleBarViewModel == null) {
                    C89219l.m154710a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel.mo110798d(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = apVar.f156967h;
                if (cutVideoTitleBarViewModel2 == null) {
                    C89219l.m154710a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel2.mo110797c(!booleanValue);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = apVar.f156971l;
                if (cutVideoPreviewViewModel == null) {
                    C89219l.m154710a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo110739a(!booleanValue);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = apVar.f156968i;
                if (cutVideoBottomBarViewModel == null) {
                    C89219l.m154710a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel.mo33689c(new CutVideoBottomBarViewModel.C70103e(!booleanValue));
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = apVar.f156968i;
                if (cutVideoBottomBarViewModel2 == null) {
                    C89219l.m154710a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel2.mo33689c(new CutVideoBottomBarViewModel.C70106h(!booleanValue));
                CutVideoViewModel cutVideoViewModel = apVar.f156965f;
                if (cutVideoViewModel == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                if (cutVideoViewModel.mo110803g()) {
                    apVar.mo110847F().mo110812I().f157276S = booleanValue;
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = apVar.f156968i;
                    if (cutVideoBottomBarViewModel3 == null) {
                        C89219l.m154710a("bottomBarViewModel");
                    }
                    cutVideoBottomBarViewModel3.mo33689c(new CutVideoBottomBarViewModel.C70101c(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel = apVar.f156969j;
                    if (cutVideoListViewModel == null) {
                        C89219l.m154710a("videoListViewModel");
                    }
                    cutVideoListViewModel.mo33689c(new CutVideoListViewModel.C70119f(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel2 = apVar.f156969j;
                    if (cutVideoListViewModel2 == null) {
                        C89219l.m154710a("videoListViewModel");
                    }
                    cutVideoListViewModel2.mo33689c(new CutVideoListViewModel.C70120g(!booleanValue));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: a */
    public final void mo110614a(AbstractC31071f fVar) {
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            C70157af F = mo110847F();
            C70242ba baVar = F.f156880f;
            if (baVar != null) {
                baVar.f157048c.f157448a = fVar;
                baVar.f157051f.f157399a = fVar;
                baVar.mo110876b();
                AbstractC70300bv bvVar = baVar.f157047b;
                if (bvVar == null) {
                    C89219l.m154710a("stickPointVideoSegController");
                }
                bvVar.mo110932b(baVar.mo110881g());
                AbstractC70441g gVar = baVar.f157050e;
                if (gVar != null) {
                    gVar.mo110824a(baVar.mo110881g(), false);
                }
                baVar.f157048c.mo111028a((AbstractC70440f) new C70242ba.C70249g(baVar), false);
                C70463h.m124287a(baVar.mo110877c());
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel = F.f156886l;
            if (cutVideoPreviewViewModel == null) {
                C89219l.m154710a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo110737a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a, "");
        this.f156966g = (VideoEditViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a2, "");
        this.f156964I = (CutMultiVideoViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoTitleBarViewModel.class);
        C89219l.m154716b(a3, "");
        this.f156967h = (CutVideoTitleBarViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a4, "");
        this.f156968i = (CutVideoBottomBarViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a5, "");
        this.f156969j = (CutVideoListViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a6, "");
        this.f156970k = (CutVideoEditViewModel) a6;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = C20531t.m38716a((ActivityC0945e) activity7).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a7, "");
        this.f156971l = (CutVideoPreviewViewModel) a7;
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoViewModel, C70213aq.f156996a, new C70201c(this));
        CutVideoViewModel cutVideoViewModel2 = this.f156965f;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoViewModel2, C70214ar.f156997a, new C70202d(this));
        VideoEditViewModel videoEditViewModel = this.f156966g;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel.f157694s.observe(this, new C70203e(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f156968i;
        if (cutVideoBottomBarViewModel == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, C70215as.f156998a, new C20370ah(), new C70204f(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f156970k;
        if (cutVideoEditViewModel == null) {
            C89219l.m154710a("cutVideoEditViewModel");
        }
        selectNonNullSubscribe(cutVideoEditViewModel, C70216at.f156999a, new C20370ah(), new C70205g(this));
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$f */
    static final class C70204f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156987a;

        static {
            Covode.recordClassIndex(82647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70204f(C70198ap apVar) {
            super(2);
            this.f156987a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(bVar, "");
            this.f156987a.f156977y = (long) (floatValue * 1000.0f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$g */
    static final class C70205g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156988a;

        static {
            Covode.recordClassIndex(82648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70205g(C70198ap apVar) {
            super(2);
            this.f156988a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f156988a.f156978z = booleanValue;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.arr, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f156965f = (CutVideoViewModel) a;
        mo36417e(m123914N());
        mo36417e((C70282bm) this.f156959D.getValue());
        CutVideoViewModel cutVideoViewModel = this.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            mo36417e(mo110847F());
            mo36417e(m123915O());
            mo110848H().f156554e = C77795c.m135910a(true, false, false, false);
            return;
        }
        mo36417e(mo62771E());
        mo36417e(m123915O());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$c */
    static final class C70201c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156984a;

        static {
            Covode.recordClassIndex(82644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70201c(C70198ap apVar) {
            super(2);
            this.f156984a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C70198ap apVar = this.f156984a;
            CutVideoViewModel cutVideoViewModel = apVar.f156965f;
            if (cutVideoViewModel == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            C39078ad adVar = cutVideoViewModel.mo110802b().f156852j;
            if (C63253l.f143623a.mo73311g().mo93793a(adVar)) {
                C63253l.f143623a.mo73311g().mo93790a(apVar.f52549m, adVar, "Sharing canceled", 20013);
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f156965f;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.mo110803g()) {
                C70157af F = apVar.mo110847F();
                C70582z zVar2 = F.mo110812I().f157282a;
                if (zVar2 == null || zVar2.mo111340a().size() != 0) {
                    Activity activity = F.f52549m;
                    if (activity != null) {
                        new C17197a.C17200a(activity).mo27194b(R.string.f5d).mo27195b(R.string.d5a, (DialogInterface.OnClickListener) new C70157af.DialogInterface$OnClickListenerC70166h(F), false).mo27190a(R.string.c45, (DialogInterface.OnClickListener) new C70157af.DialogInterface$OnClickListenerC70167i(F), false).mo27193a().mo27184b().show();
                        VideoEditViewModel videoEditViewModel = F.f156884j;
                        if (videoEditViewModel == null) {
                            C89219l.m154710a("videoEditViewModel");
                        }
                        C70463h.m124288a(videoEditViewModel.mo111232k(), "exit_clip_popup_show", F.mo110817N());
                    }
                } else {
                    F.mo110816M();
                }
            } else {
                apVar.mo110849I();
            }
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                C84425b bVar2 = new C84425b();
                CutVideoViewModel cutVideoViewModel3 = apVar.f156965f;
                if (cutVideoViewModel3 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                C39162r.m79460a("video_trim_back", bVar2.mo129406a("creation_id", cutVideoViewModel3.mo110802b().f156857o).mo129406a("enter_from", "upload").f188764a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap$d */
    static final class C70202d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70198ap f156985a;

        static {
            Covode.recordClassIndex(82645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70202d(C70198ap apVar) {
            super(2);
            this.f156985a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            int i;
            BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
            String str;
            String str2;
            int i2;
            String str3;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            CutVideoViewModel cutVideoViewModel = this.f156985a.f156965f;
            if (cutVideoViewModel == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo110803g()) {
                C70157af F = this.f156985a.mo110847F();
                C70242ba baVar = F.f156880f;
                if (baVar != null) {
                    baVar.mo110884j();
                }
                C70242ba baVar2 = F.f156880f;
                if (baVar2 != null) {
                    C69905c i3 = baVar2.mo110883i();
                    List<VideoSegment> c = baVar2.mo110877c();
                    boolean z = baVar2.f157055j;
                    boolean g = baVar2.mo110881g();
                    String str4 = baVar2.f157054i;
                    long j = baVar2.f157063r;
                    boolean z2 = baVar2.f157064s;
                    C89219l.m154721d(str4, "");
                    if (i3 != null && !C84904k.m145909a(c)) {
                        if (g) {
                            j = 0;
                        }
                        if (c == null) {
                            C89219l.m154715b();
                        }
                        int i4 = 0;
                        long j2 = 0;
                        for (T t : c) {
                            j2 += t.f156710b;
                            if (t.f156732x) {
                                i4++;
                            }
                            if (g) {
                                j += (long) (((float) (t.mo110580e() - t.mo110578d())) / t.mo110582f());
                            }
                        }
                        C84425b a = C70463h.m124284a().mo129406a("music_id", i3.getMusicId()).mo129406a("music_selected_from", str4);
                        if (g) {
                            str = "sync_on";
                        } else {
                            str = "sync_off";
                        }
                        C84425b a2 = a.mo129406a("sync_mode", str).mo129404a("content_duration_ms", j2).mo129404a("edit_duration", j).mo129403a("is_edit", z2 ? 1 : 0);
                        if (g) {
                            str2 = "multi_sync";
                        } else {
                            str2 = "multi_normal";
                        }
                        C84425b a3 = a2.mo129406a("edit_type", str2).mo129403a("video_cnt", c.size() - i4).mo129403a("pic_cnt", i4);
                        if (c.size() > 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C84425b a4 = a3.mo129403a("is_multi_content", i2);
                        if (z) {
                            str3 = "on";
                        } else {
                            str3 = "off";
                        }
                        C39162r.m79460a("edit_upload_next", a4.mo129406a("smart_sync", str3).f188764a);
                    }
                    baVar2.mo110884j();
                }
            } else {
                List<VideoSegment> k = C70198ap.m123916a(this.f156985a).mo111232k();
                long j3 = this.f156985a.f156977y;
                boolean z3 = this.f156985a.f156978z;
                if (!C84904k.m145909a(k)) {
                    if (k == null) {
                        C89219l.m154715b();
                    }
                    int i5 = 0;
                    long j4 = 0;
                    for (T t2 : k) {
                        j4 += t2.f156710b;
                        if (t2.f156732x) {
                            i5++;
                        }
                    }
                    C84425b a5 = C70463h.m124284a().mo129404a("content_duration_ms", j4).mo129404a("edit_duration", j3).mo129403a("is_edit", z3 ? 1 : 0).mo129406a("edit_type", "single").mo129403a("video_cnt", k.size() - i5).mo129403a("pic_cnt", i5);
                    if (k.size() > 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C39162r.m79460a("edit_upload_next", a5.mo129403a("is_multi_content", i).f188764a);
                }
            }
            C70198ap.m123917b(this.f156985a).mo110798d(false);
            C70198ap apVar = this.f156985a;
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                C84425b a6 = new C84425b().mo129406a("enter_from", "upload");
                CutVideoViewModel cutVideoViewModel2 = apVar.f156965f;
                if (cutVideoViewModel2 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                C39162r.m79460a("video_trim_next", a6.mo129406a("creation_id", cutVideoViewModel2.mo110802b().f156857o).f188764a);
            }
            this.f156985a.f156972t = System.currentTimeMillis();
            if (this.f156985a.mo110852L() instanceof VEVideoEditViewV2) {
                VECutVideoPresenter H = this.f156985a.mo110848H();
                C0692e<Long, Long> playBoundary = this.f156985a.mo110852L().getPlayBoundary();
                C89219l.m154716b(playBoundary, "");
                H.mo110485a(playBoundary);
            }
            C70198ap apVar2 = this.f156985a;
            Activity activity = apVar2.f52549m;
            if (activity == null || !activity.isFinishing()) {
                if (apVar2.mo110848H().mo110484a() + 5 < apVar2.f156973u) {
                    String a7 = apVar2.mo36472a(R.string.h79, Long.valueOf(apVar2.f156973u / 1000));
                    C89219l.m154716b(a7, "");
                    new C79459a(apVar2.f52549m).mo123052a(a7).mo123053a();
                    CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar2.f156967h;
                    if (cutVideoTitleBarViewModel == null) {
                        C89219l.m154710a("titleBarViewModel");
                    }
                    cutVideoTitleBarViewModel.mo110798d(true);
                } else if (apVar2.mo110848H().mo110484a() > ((long) apVar2.f156974v)) {
                    C73991bj.m130128a("compile failed,duration=" + apVar2.mo110848H().mo110484a() + ",maxEncodeDuration=" + apVar2.f156974v);
                    new C79459a(apVar2.f52549m).mo123050a(R.string.d52).mo123053a();
                    CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = apVar2.f156967h;
                    if (cutVideoTitleBarViewModel2 == null) {
                        C89219l.m154710a("titleBarViewModel");
                    }
                    cutVideoTitleBarViewModel2.mo110798d(true);
                } else {
                    C39162r.m79460a("import_transcoding_start", Collections.emptyMap());
                    C27252o a8 = C27252o.m54253a();
                    CutVideoEditViewModel cutVideoEditViewModel = apVar2.f156970k;
                    if (cutVideoEditViewModel == null) {
                        C89219l.m154710a("cutVideoEditViewModel");
                    }
                    if (cutVideoEditViewModel.f156782a != 1) {
                        CutVideoListViewModel cutVideoListViewModel = apVar2.f156969j;
                        if (cutVideoListViewModel == null) {
                            C89219l.m154710a("videoListViewModel");
                        }
                        int i6 = cutVideoListViewModel.f156789b;
                        VECutVideoPresenter H2 = apVar2.mo110848H();
                        VideoEditViewModel videoEditViewModel = apVar2.f156966g;
                        if (videoEditViewModel == null) {
                            C89219l.m154710a("videoEditViewModel");
                        }
                        VECutVideoPresenter.m123653a(H2, i6, (float) videoEditViewModel.mo111231j().get(i6).f156718j, false, 0.0f, 0.0f, 0, 0, 120);
                    }
                    CutVideoViewModel cutVideoViewModel3 = apVar2.f156965f;
                    if (cutVideoViewModel3 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    if (cutVideoViewModel3.mo110802b().f156855m) {
                        CutVideoViewModel cutVideoViewModel4 = apVar2.f156965f;
                        if (cutVideoViewModel4 == null) {
                            C89219l.m154710a("cutVideoViewModel");
                        }
                        backgroundVideoCompileConfigure = cutVideoViewModel4.mo110802b().f156842C;
                        if (backgroundVideoCompileConfigure == null) {
                            CutVideoViewModel cutVideoViewModel5 = apVar2.f156965f;
                            if (cutVideoViewModel5 == null) {
                                C89219l.m154710a("cutVideoViewModel");
                            }
                            Workspace workspace = cutVideoViewModel5.mo110802b().f156851i;
                            if (workspace == null) {
                                C89219l.m154715b();
                            }
                            backgroundVideoCompileConfigure = C70044a.m123683a(workspace);
                        }
                    } else {
                        backgroundVideoCompileConfigure = null;
                    }
                    VECutVideoPresenter H3 = apVar2.mo110848H();
                    CutVideoViewModel cutVideoViewModel6 = apVar2.f156965f;
                    if (cutVideoViewModel6 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    Workspace workspace2 = cutVideoViewModel6.mo110802b().f156851i;
                    if (workspace2 == null) {
                        C89219l.m154715b();
                    }
                    CutVideoViewModel cutVideoViewModel7 = apVar2.f156965f;
                    if (cutVideoViewModel7 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    H3.mo110487a((VECutVideoPresenter) workspace2, (Workspace) backgroundVideoCompileConfigure, (BackgroundVideoCompileConfigure) C70156ae.m123858b(cutVideoViewModel7.mo110802b()), (boolean) new C70200b(apVar2, backgroundVideoCompileConfigure, a8), (AbstractC70302c) false);
                }
            }
            return C89391z.f203057a;
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
