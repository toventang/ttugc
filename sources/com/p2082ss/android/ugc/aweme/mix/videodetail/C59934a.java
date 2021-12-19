package com.p2082ss.android.ugc.aweme.mix.videodetail;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a;
import com.p2082ss.android.ugc.aweme.discover.mob.C42470r;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59221ap;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59857d;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59858e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59859f;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59860g;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59406f;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59412a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3683a.C67338a;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80779o;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a */
public final class C59934a extends AbstractC41363a implements AbstractC39063h.AbstractC39067a, AbstractC59968j, AbstractC59968j {

    /* renamed from: G */
    public static final int f136514G;

    /* renamed from: H */
    public static final C59941g f136515H = new C59941g((byte) 0);

    /* renamed from: A */
    public String f136516A = "";

    /* renamed from: B */
    public boolean f136517B;

    /* renamed from: C */
    public boolean f136518C;

    /* renamed from: D */
    public Aweme f136519D;

    /* renamed from: E */
    public Aweme f136520E;

    /* renamed from: F */
    public boolean f136521F;

    /* renamed from: I */
    private String f136522I;

    /* renamed from: J */
    private boolean f136523J;

    /* renamed from: K */
    private final C12814b f136524K;

    /* renamed from: L */
    private SparseArray f136525L;

    /* renamed from: v */
    public C34499i f136526v = new C34499i();

    /* renamed from: w */
    public String f136527w = "";

    /* renamed from: y */
    public C59537a f136528y;

    /* renamed from: z */
    public C23226a f136529z;

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$b */
    public static final class C59936b extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {
        public static final C59936b INSTANCE = new C59936b();

        static {
            Covode.recordClassIndex(70355);
        }

        public C59936b() {
            super(1);
        }

        public final C59857d invoke(C59857d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f136525L == null) {
            this.f136525L = new SparseArray();
        }
        View view = (View) this.f136525L.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f136525L.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: a */
    public final List<Aweme> mo70642a(AbstractC41262aa aaVar) {
        C89219l.m154721d(aaVar, "");
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: e */
    public final void mo61344e() {
        SparseArray sparseArray = this.f136525L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: y */
    public final MixVideosViewModel mo97343y() {
        return (MixVideosViewModel) this.f136524K.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$g */
    public static final class C59941g {
        static {
            Covode.recordClassIndex(70360);
        }

        private C59941g() {
        }

        public /* synthetic */ C59941g(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C1175ad.AbstractC1177b mo70651d() {
        return this.f136526v;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$c */
    public static final class C59937c extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59937c INSTANCE = new C59937c();

        static {
            Covode.recordClassIndex(70356);
        }

        public C59937c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$f */
    public static final class C59940f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59940f INSTANCE = new C59940f();

        static {
            Covode.recordClassIndex(70359);
        }

        public C59940f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z, com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am
    public final boolean bn_() {
        return mo97343y().f136235q;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: x */
    public final View mo70645x() {
        return mo61343a(R.id.ak6);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$d */
    public static final class C59938d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136531a;

        static {
            Covode.recordClassIndex(70357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59938d(Fragment fragment) {
            super(0);
            this.f136531a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f136531a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        if (this.f136521F) {
            mo62679l();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    /* renamed from: c */
    public final C41178b mo70690c() {
        C41178b c = super.mo70690c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        MixVideosViewModel y = mo97343y();
        mo97343y();
        y.mo97237b("", "");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$a */
    public static final class C59935a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136530a;

        static {
            Covode.recordClassIndex(70354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59935a(AbstractC89277c cVar) {
            super(0);
            this.f136530a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136530a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$e */
    public static final class C59939e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136532a;

        static {
            Covode.recordClassIndex(70358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59939e(Fragment fragment) {
            super(0);
            this.f136532a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f136532a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: v */
    public final int mo70643v() {
        C59538b searchParam;
        C59537a aVar = this.f136528y;
        if (aVar == null || (searchParam = aVar.getSearchParam()) == null) {
            return 0;
        }
        return searchParam.getFlowStartPositionInGeneralSearch();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    /* renamed from: w */
    public final MixFlowParam mo70644w() {
        String eventType = new C49812b().getEventType();
        if (eventType == null) {
            eventType = "";
        }
        return new MixFlowParam(eventType, "from_mix_video");
    }

    static {
        Covode.recordClassIndex(70353);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f136514G = C89241a.m154730a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics()));
    }

    public C59934a() {
        AbstractC89277c a = C89204ab.m154669a(MixVideosViewModel.class);
        this.f136524K = new C12814b(a, new C59935a(a), C59937c.INSTANCE, new C59938d(this), new C59939e(this), C59940f.INSTANCE, C59936b.INSTANCE);
        this.f136521F = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$h */
    public static final class RunnableC59942h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f136533a;

        /* renamed from: b */
        final /* synthetic */ C59934a f136534b;

        static {
            Covode.recordClassIndex(70361);
        }

        RunnableC59942h(Context context, C59934a aVar) {
            this.f136533a = context;
            this.f136534b = aVar;
        }

        public final void run() {
            Aweme aweme;
            String str;
            String str2;
            Aweme aweme2;
            String mVideoFrom;
            C59934a aVar = this.f136534b;
            IMixFeedService k = MixFeedService.m109435k();
            Context context = this.f136533a;
            String str3 = this.f136534b.f136527w;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            C59537a aVar2 = this.f136534b.f136528y;
            C59538b bVar = null;
            if (aVar2 != null) {
                aweme = aVar2.getMAweme();
            } else {
                aweme = null;
            }
            C59537a aVar3 = this.f136534b.f136528y;
            if (aVar3 == null || (str = aVar3.getMUsrId()) == null) {
                str = str4;
            }
            C59537a aVar4 = this.f136534b.f136528y;
            if (aVar4 == null || (str2 = aVar4.getMSecUid()) == null) {
                str2 = str4;
            }
            C59537a aVar5 = this.f136534b.f136528y;
            if (!(aVar5 == null || (mVideoFrom = aVar5.getMVideoFrom()) == null)) {
                str4 = mVideoFrom;
            }
            aVar.f136529z = k.mo97306a(context, "playlist", str3, aweme, str, str2, str4);
            C59537a aVar6 = this.f136534b.f136528y;
            if (aVar6 != null) {
                aweme2 = aVar6.getMAweme();
            } else {
                aweme2 = null;
            }
            String str5 = this.f136534b.f136527w;
            C59537a aVar7 = this.f136534b.f136528y;
            if (aVar7 != null) {
                bVar = aVar7.getSearchParam();
            }
            C59330a.m109030a(aweme2, str5, "playlist", bVar);
            this.f136534b.mo97343y().f136233o = this.f136534b.f136520E;
        }
    }

    /* renamed from: A */
    private final void m109475A() {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C23023b bVar = new C23023b(context);
        String string = getString(R.string.bmy);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f136516A}, 1));
        C89219l.m154716b(a, "");
        C23013a a2 = C23028c.m43435a((C23023b) bVar.mo37411b(a).mo37483b(R.string.bmz), new C59953r(this)).mo37405a();
        a2.mo37396b().show();
        a2.mo37395a();
    }

    /* renamed from: B */
    private final void m109476B() {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C23023b bVar = new C23023b(context);
        String string = getString(R.string.bmy);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f136516A}, 1));
        C89219l.m154716b(a, "");
        C23013a a2 = C23028c.m43435a(bVar.mo37413d(a), new C59957s(this)).mo37405a();
        a2.mo37396b().show();
        a2.mo37395a();
    }

    /* renamed from: z */
    public final void mo97344z() {
        if (this.f136517B && this.f136518C) {
            DmtStatusView p = mo70640p();
            if (p != null) {
                p.mo27385g();
            }
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            if (C89219l.m154714a((Object) e.getCurUserId(), (Object) mo97343y().f136239u)) {
                m109475A();
                C23226a aVar = this.f136529z;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else {
                m109476B();
            }
            this.f136517B = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$i */
    static final class CallableC59943i<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C59934a f136535a;

        static {
            Covode.recordClassIndex(70362);
        }

        CallableC59943i(C59934a aVar) {
            this.f136535a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme mAweme;
            String str;
            boolean z;
            boolean z2;
            String str2;
            String str3;
            String str4;
            Aweme aweme;
            long j;
            boolean z3;
            String mEventType;
            C59537a aVar = this.f136535a.f136528y;
            Aweme aweme2 = null;
            if (aVar == null || (mAweme = aVar.getMAweme()) == null) {
                return null;
            }
            String str5 = "";
            if (mAweme.getMusic() != null) {
                Music music = mAweme.getMusic();
                C89219l.m154716b(music, str5);
                str = String.valueOf(music.getId());
                Music music2 = mAweme.getMusic();
                C89219l.m154716b(music2, str5);
                if (music2.getMatchedPGCSoundInfo() != null) {
                    z = true;
                }
                z = false;
            } else {
                str = str5;
                z = false;
            }
            if (mAweme.getBottomBarModel() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C59221ap apVar = new C59221ap();
            C49812b bVar = this.f136535a.f96635j;
            C89219l.m154716b(bVar, str5);
            apVar.f134976b = bVar.getPreviousPage();
            C49812b bVar2 = this.f136535a.f96635j;
            C89219l.m154716b(bVar2, str5);
            apVar.f134998c = bVar2.getPreviousPagePosition();
            apVar.f134999d = z2;
            apVar.f134953ad = this.f136535a.f96635j.getFrom();
            C59537a aVar2 = this.f136535a.f136528y;
            if (aVar2 == null || (str2 = aVar2.getMEventType()) == null) {
                str2 = str5;
            }
            C59221ap a = apVar.mo96764a(str2);
            a.f135002q = "manul_play";
            C49812b bVar3 = this.f136535a.f96635j;
            C89219l.m154716b(bVar3, str5);
            C59221ap apVar2 = (C59221ap) a.mo96768c(mAweme, bVar3.getPageType()).mo96799a(Boolean.valueOf(C50545m.m94765b(mAweme)));
            apVar2.f134954ae = C62956e.m113374a();
            apVar2.f134923a = C80779o.m140114b().name();
            apVar2.f134955af = str;
            apVar2.f134956ag = z;
            apVar2.f134952ac = mAweme.isHighlighted();
            C59537a aVar3 = this.f136535a.f136528y;
            if (aVar3 != null) {
                str3 = aVar3.getMixId();
            } else {
                str3 = null;
            }
            apVar2.f134959aj = str3;
            C49812b bVar4 = this.f136535a.f96635j;
            C89219l.m154716b(bVar4, str5);
            apVar2.f134962am = bVar4.getPlaylistSearchId();
            C49812b bVar5 = this.f136535a.f96635j;
            C89219l.m154716b(bVar5, str5);
            apVar2.f134961al = bVar5.getIsFromVideo();
            C49812b bVar6 = this.f136535a.f96635j;
            C89219l.m154716b(bVar6, str5);
            apVar2.f134960ak = bVar6.getCategoryName();
            C59537a aVar4 = this.f136535a.f136528y;
            if (aVar4 == null || (str4 = aVar4.getMEventType()) == null) {
                str4 = str5;
            }
            apVar2.f134963an = str4;
            C49812b bVar7 = this.f136535a.f96635j;
            C89219l.m154716b(bVar7, str5);
            apVar2.f134964ao = bVar7.getLastGroupId();
            C49812b bVar8 = this.f136535a.f96635j;
            C89219l.m154716b(bVar8, str5);
            apVar2.f134965ap = bVar8.getPlaylistPreviousPage();
            C49812b bVar9 = this.f136535a.f96635j;
            C89219l.m154716b(bVar9, str5);
            apVar2.f134966aq = bVar9.getEnterPlaylistGroupId();
            C59221ap a2 = apVar2.mo96766b(C50532ah.m94734j(mAweme)).mo96765a(C50532ah.m94735k(mAweme));
            C49812b bVar10 = this.f136535a.f96635j;
            C89219l.m154716b(bVar10, str5);
            a2.f134957ah = bVar10.getSearchType();
            C89219l.m154716b(a2, str5);
            C49812b bVar11 = this.f136535a.f96635j;
            C89219l.m154716b(bVar11, str5);
            String previousPage = bVar11.getPreviousPage();
            C49812b bVar12 = this.f136535a.f96635j;
            C89219l.m154716b(bVar12, str5);
            a2.mo96788a(C50560y.m94792b(previousPage, bVar12.getFromGroupId()));
            a2.mo96792f();
            C59934a aVar5 = this.f136535a;
            C49812b bVar13 = aVar5.f96635j;
            C89219l.m154716b(bVar13, str5);
            String playlistPreviousPage = bVar13.getPlaylistPreviousPage();
            if (TextUtils.equals(playlistPreviousPage, "search_result") || TextUtils.equals(playlistPreviousPage, "general_search")) {
                long j2 = aVar5.mo97343y().f136236r;
                if (j2 > 0) {
                    j2++;
                }
                List<Aweme> j3 = aVar5.mo97343y().mo97239j();
                C59537a aVar6 = aVar5.f136528y;
                if (aVar6 != null) {
                    aweme = aVar6.getMAweme();
                } else {
                    aweme = null;
                }
                long a3 = (long) C59934a.m109477a(j3, aweme);
                if (a3 > 0) {
                    j = j2 + a3;
                } else {
                    j = -1;
                }
                if (TextUtils.equals(playlistPreviousPage, "search_result") || TextUtils.equals(playlistPreviousPage, "search_for_you_list")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ISearchResultStatistics a4 = SearchResultStatisticsImpl.m104992a();
                C59537a aVar7 = aVar5.f136528y;
                if (aVar7 != null) {
                    aweme2 = aVar7.getMAweme();
                }
                C59537a aVar8 = aVar5.f136528y;
                if (!(aVar8 == null || (mEventType = aVar8.getMEventType()) == null)) {
                    str5 = mEventType;
                }
                a4.mo71657a(new C42470r("search_video_play", aweme2, str5, z3, playlistPreviousPage, j));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        this.f136521F = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$j */
    public static final class C59944j implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ C59934a f136536a;

        static {
            Covode.recordClassIndex(70363);
        }

        C59944j(C59934a aVar) {
            this.f136536a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        public final void mo37101a(Aweme aweme) {
            if (C59412a.m109111a() != 0 || this.f136536a.f136519D == null) {
                this.f136536a.f136520E = aweme;
                return;
            }
            C59934a aVar = this.f136536a;
            aVar.f136520E = aVar.f136519D;
            Float f = null;
            this.f136536a.f136519D = null;
            C59537a aVar2 = this.f136536a.f136528y;
            if (aVar2 != null && aVar2.getVideoPlayedPercentage() != null) {
                C59537a aVar3 = this.f136536a.f136528y;
                if (aVar3 != null) {
                    f = aVar3.getVideoPlayedPercentage();
                }
                if (!C89219l.m154712a(f, 0.0f)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59944j.RunnableC599451 */

                        /* renamed from: a */
                        final /* synthetic */ C59944j f136537a;

                        static {
                            Covode.recordClassIndex(70364);
                        }

                        {
                            this.f136537a = r1;
                        }

                        public final void run() {
                            float f;
                            Float videoPlayedPercentage;
                            C41178b bVar = this.f136537a.f136536a.f96636k;
                            C89219l.m154716b(bVar, "");
                            AbstractC80747i aO = bVar.mo84707aO();
                            C59537a aVar = this.f136537a.f136536a.f136528y;
                            if (aVar == null || (videoPlayedPercentage = aVar.getVideoPlayedPercentage()) == null) {
                                f = 0.0f;
                            } else {
                                f = videoPlayedPercentage.floatValue();
                            }
                            aO.mo123931a(f);
                        }
                    }, 400);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$s */
    public static final class C59957s extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136549a;

        static {
            Covode.recordClassIndex(70376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59957s(C59934a aVar) {
            super(1);
            this.f136549a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            CharSequence text = this.f136549a.getText(R.string.bx);
            C89219l.m154716b(text, "");
            bVar2.mo37421c(text, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59957s.C599581 */

                /* renamed from: a */
                final /* synthetic */ C59957s f136550a;

                static {
                    Covode.recordClassIndex(70377);
                }

                {
                    this.f136550a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    ActivityC0945e activity = this.f136550a.f136549a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$r */
    public static final class C59953r extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136545a;

        static {
            Covode.recordClassIndex(70372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59953r(C59934a aVar) {
            super(1);
            this.f136545a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f54513b = true;
            CharSequence text = this.f136545a.getText(R.string.pd);
            C89219l.m154716b(text, "");
            bVar2.mo37417a(text, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59953r.C599541 */

                /* renamed from: a */
                final /* synthetic */ C59953r f136546a;

                static {
                    Covode.recordClassIndex(70373);
                }

                {
                    this.f136546a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_manage_mix_id", this.f136546a.f136545a.f136527w);
                    if (this.f136546a.f136545a.getContext() != null) {
                        IMixFeedService k = MixFeedService.m109435k();
                        Context context = this.f136546a.f136545a.getContext();
                        if (context == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(context, "");
                        k.mo97312a(context, bundle, 4, "", "");
                    }
                    ActivityC0945e activity = this.f136546a.f136545a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            CharSequence text2 = this.f136545a.getText(R.string.b5f);
            C89219l.m154716b(text2, "");
            bVar2.mo37417a(text2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59953r.C599552 */

                /* renamed from: a */
                final /* synthetic */ C59953r f136547a;

                static {
                    Covode.recordClassIndex(70374);
                }

                {
                    this.f136547a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C59330a.m109033a(this.f136547a.f136545a.f136527w, "playlist");
                    this.f136547a.f136545a.mo97343y().mo23343h();
                    return C89391z.f203057a;
                }
            });
            CharSequence text3 = this.f136545a.getText(R.string.bx);
            C89219l.m154716b(text3, "");
            bVar2.mo37419b(text3, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59953r.C599563 */

                /* renamed from: a */
                final /* synthetic */ C59953r f136548a;

                static {
                    Covode.recordClassIndex(70375);
                }

                {
                    this.f136548a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    ActivityC0945e activity = this.f136548a.f136545a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final List<Aweme> mo97342b(List<Aweme> list) {
        String str;
        String str2;
        IAwemeService b = AwemeService.m70060b();
        Aweme aweme = mo97343y().f136232n;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        Aweme b2 = b.mo60684b(str);
        int i = 0;
        for (T t : list) {
            String aid = t.getAid();
            Aweme aweme2 = mo97343y().f136232n;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (!C89219l.m154714a((Object) aid, (Object) str2) || b2 == null) {
                Aweme a = AwemeService.m70060b().mo60677a((Aweme) t);
                C89219l.m154716b(a, "");
                list.set(i, a);
            } else {
                list.set(i, b2);
            }
            i++;
        }
        return list;
    }

    /* renamed from: a */
    public final void mo97341a(List<? extends Aweme> list) {
        C59537a aVar;
        Context context;
        if (list.isEmpty()) {
            this.f136517B = true;
            mo97344z();
        } else if (C59412a.m109111a() == 0 && (aVar = this.f136528y) != null && aVar.getMNeedShowDialog() && (context = getContext()) != null) {
            new Handler().postDelayed(new RunnableC59942h(context, this), 1000);
        }
        if (!((C59412a.m109111a() != 1 && C59412a.m109111a() != 2) || mo97343y().f136232n == null || m109477a(list, mo97343y().f136232n) == 0)) {
            this.f96636k.f114810al = true;
        }
        if (!C67338a.m119381a()) {
            mo97343y().mo97233a(new C59858e(Integer.valueOf(C59859f.f136345a), mo97342b(C89070n.m154585g((Collection) list)), mo97343y().f136235q));
        } else {
            this.f96636k.mo59512a(mo97342b(C89070n.m154585g((Collection) list)), mo97343y().f136235q);
        }
        if (C59412a.m109111a() == 0) {
            C18285c.m34006b("playlist_first_render_cost_time");
        }
        C18285c.m34006b("playlist_first_open_dialog_cost_time");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        C59537a aVar;
        String str;
        String str2;
        String mVideoFrom;
        C59537a aVar2;
        C41178b bVar;
        String str3;
        Aweme aweme2;
        String str4;
        String str5;
        String str6;
        Aweme aweme3;
        String str7;
        super.onCreate(bundle);
        C50529ae.f116792c = mo97343y();
        Bundle arguments = getArguments();
        Aweme aweme4 = null;
        String str8 = "";
        if (arguments != null) {
            this.f136522I = arguments.getString("event_type");
            Serializable serializable = arguments.getSerializable("mix_video_list_params");
            if (!(serializable instanceof C59537a)) {
                serializable = null;
            }
            C59537a aVar3 = (C59537a) serializable;
            this.f136528y = aVar3;
            if (aVar3 != null) {
                String mixId = aVar3.getMixId();
                if (mixId == null) {
                    mixId = str8;
                }
                this.f136527w = mixId;
                C59867d mixInfo = aVar3.getMixInfo();
                if (mixInfo == null || (str7 = mixInfo.getMixName()) == null) {
                    str7 = str8;
                }
                this.f136516A = str7;
                this.f136523J = aVar3.getMEnterCleanMode();
            }
            MixVideosViewModel y = mo97343y();
            C89219l.m154716b(arguments, str8);
            y.f136241w = C17827e.m33012a(arguments);
        }
        C59537a aVar4 = this.f136528y;
        if (aVar4 == null || aVar4.getMEnterCleanMode()) {
            C41178b bVar2 = this.f96636k;
            if (bVar2 != null) {
                bVar2.mo70517w();
            }
        } else {
            C59537a aVar5 = this.f136528y;
            if ((aVar5 != null && !aVar5.getMNeedShowDialog()) || C59412a.m109111a() == 0) {
                MixVideosViewModel y2 = mo97343y();
                C59537a aVar6 = this.f136528y;
                if (aVar6 == null || (str4 = aVar6.getMUsrId()) == null) {
                    str4 = str8;
                }
                C59537a aVar7 = this.f136528y;
                if (aVar7 == null || (str5 = aVar7.getMSecUid()) == null) {
                    str5 = str8;
                }
                String str9 = this.f136527w;
                C59537a aVar8 = this.f136528y;
                if (aVar8 == null || (str6 = aVar8.getMAid()) == null) {
                    str6 = str8;
                }
                C59537a aVar9 = this.f136528y;
                if (aVar9 != null) {
                    aweme3 = aVar9.getMAweme();
                } else {
                    aweme3 = null;
                }
                C89219l.m154721d(str4, str8);
                C89219l.m154721d(str5, str8);
                C89219l.m154721d(str9, str8);
                C89219l.m154721d(str6, str8);
                y2.f136230l = str9;
                y2.f136231m = str6;
                y2.f136239u = str4;
                y2.f136240v = str5;
                y2.f136232n = aweme3;
                y2.mo97234a(str4, str5);
            }
            MixVideosViewModel y3 = mo97343y();
            C59537a aVar10 = this.f136528y;
            if (aVar10 != null) {
                aweme2 = aVar10.getMAweme();
            } else {
                aweme2 = null;
            }
            y3.f136232n = aweme2;
        }
        C41178b bVar3 = this.f96636k;
        if (bVar3 != null) {
            String str10 = this.f136527w;
            if (bVar3.f114782aJ != null) {
                bVar3.f114782aJ.setPlayListId(str10);
            }
        }
        C59537a aVar11 = this.f136528y;
        if (!(aVar11 == null || aVar11.getMEnterCleanMode() || (bVar = this.f96636k) == null)) {
            C59537a aVar12 = this.f136528y;
            if (aVar12 == null || (str3 = aVar12.getMAid()) == null) {
                str3 = str8;
            }
            if (bVar.f114782aJ != null) {
                bVar.f114782aJ.setAid(str3);
            }
        }
        C59537a aVar13 = this.f136528y;
        if (aVar13 != null) {
            aweme = aVar13.getMAweme();
        } else {
            aweme = null;
        }
        this.f136519D = aweme;
        C41178b bVar4 = this.f96636k;
        if (bVar4 != null) {
            bVar4.f96243h = false;
        }
        if (C59412a.m109111a() != 0) {
            C59537a aVar14 = this.f136528y;
            if ((aVar14 != null && aVar14.getMEnterCleanMode()) || (aVar = this.f136528y) == null || !aVar.getMNeedShowDialog() || getContext() == null) {
                return;
            }
            if (getContext() != null || ((aVar2 = this.f136528y) != null && aVar2.getMAweme() != null)) {
                IMixFeedService k = MixFeedService.m109435k();
                Context context = getContext();
                String str11 = this.f136527w;
                if (str11 == null) {
                    str11 = str8;
                }
                C59537a aVar15 = this.f136528y;
                if (aVar15 != null) {
                    aweme4 = aVar15.getMAweme();
                }
                C59537a aVar16 = this.f136528y;
                if (aVar16 == null || (str = aVar16.getMUsrId()) == null) {
                    str = str8;
                }
                C59537a aVar17 = this.f136528y;
                if (aVar17 == null || (str2 = aVar17.getMSecUid()) == null) {
                    str2 = str8;
                }
                C59537a aVar18 = this.f136528y;
                if (!(aVar18 == null || (mVideoFrom = aVar18.getMVideoFrom()) == null)) {
                    str8 = mVideoFrom;
                }
                this.f136529z = k.mo97306a(context, "playlist", str11, aweme4, str, str2, str8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$m */
    static final class C59948m extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C59867d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136540a;

        static {
            Covode.recordClassIndex(70367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59948m(C59934a aVar) {
            super(2);
            this.f136540a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C59867d dVar2) {
            C59867d dVar3 = dVar2;
            C89219l.m154721d(dVar, "");
            if (dVar3 != null) {
                if (!TextUtils.isEmpty(dVar3.getMixName())) {
                    this.f136540a.f136516A = dVar3.getMixName();
                    TuxTextView tuxTextView = (TuxTextView) this.f136540a.mo61343a(R.id.ak6);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setText(dVar3.getMixName());
                }
                this.f136540a.f136518C = true;
                this.f136540a.mo97344z();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$n */
    static final class C59949n extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136541a;

        static {
            Covode.recordClassIndex(70368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59949n(C59934a aVar) {
            super(2);
            this.f136541a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(dVar, "");
            if (intValue == 2) {
                new C23144b(this.f136541a).mo37640e(R.string.fz3).mo37637b();
            } else if (intValue == 3) {
                this.f136541a.f136517B = true;
                this.f136541a.mo97344z();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static int m109477a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            int i = 0;
            for (Aweme aweme2 : list) {
                String aid = aweme2.getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) aid, (Object) str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$k */
    static final class C59946k extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136538a;

        static {
            Covode.recordClassIndex(70365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59946k(C59934a aVar) {
            super(2);
            this.f136538a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Boolean bool) {
            Aweme aweme;
            String str;
            Aweme aweme2;
            String mSecUid;
            boolean booleanValue = bool.booleanValue();
            String str2 = "";
            C89219l.m154721d(dVar, str2);
            if (booleanValue) {
                C59934a aVar = this.f136538a;
                IMixFeedService k = MixFeedService.m109435k();
                Context context = aVar.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                String str3 = aVar.f136527w;
                C59537a aVar2 = aVar.f136528y;
                C59538b bVar = null;
                if (aVar2 != null) {
                    aweme = aVar2.getMAweme();
                } else {
                    aweme = null;
                }
                C59537a aVar3 = aVar.f136528y;
                if (aVar3 == null || (str = aVar3.getMUsrId()) == null) {
                    str = str2;
                }
                C59537a aVar4 = aVar.f136528y;
                if (!(aVar4 == null || (mSecUid = aVar4.getMSecUid()) == null)) {
                    str2 = mSecUid;
                }
                aVar.f136529z = k.mo97306a(context, "playlist", str3, aweme, str, str2, "");
                C59537a aVar5 = aVar.f136528y;
                if (aVar5 != null) {
                    aweme2 = aVar5.getMAweme();
                } else {
                    aweme2 = null;
                }
                String str4 = aVar.f136527w;
                C59537a aVar6 = aVar.f136528y;
                if (aVar6 != null) {
                    bVar = aVar6.getSearchParam();
                }
                C59330a.m109030a(aweme2, str4, "playlist", bVar);
                aVar.mo97343y().f136233o = aVar.f136520E;
                aVar.mo97343y().mo20662a(MixVideosViewModel.C59838p.f136307a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$o */
    static final class C59950o extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136542a;

        static {
            Covode.recordClassIndex(70369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59950o(C59934a aVar) {
            super(2);
            this.f136542a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r0.getAid().equals(r7.f31085a.getAid()) == false) goto L_0x002b;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.tiktok.proxy.AbstractC22876d r6, com.bytedance.assem.arch.extensions.C12776a<? extends com.p2082ss.android.ugc.aweme.feed.model.Aweme> r7) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.videodetail.C59934a.C59950o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$p */
    static final class C59951p extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136543a;

        static {
            Covode.recordClassIndex(70370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59951p(C59934a aVar) {
            super(2);
            this.f136543a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (aVar2 != null) {
                if (aVar2.f31085a.booleanValue()) {
                    AbstractC81915c.m141874a(new C59406f(this.f136543a.f96636k.mo70429y(), this.f136543a.f136527w));
                    ActivityC0945e activity = this.f136543a.getActivity();
                    if (activity != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37632a().mo37640e(R.string.gfv).mo37637b();
                    }
                    ActivityC0945e activity2 = this.f136543a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    new C23144b(this.f136543a).mo37640e(R.string.fz3).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$l */
    static final class C59947l extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136539a;

        static {
            Covode.recordClassIndex(70366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59947l(C59934a aVar) {
            super(2);
            this.f136539a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends C89391z> aVar) {
            C59537a aVar2;
            Aweme aweme;
            C59538b bVar;
            String str;
            Integer num;
            String str2;
            String searchId;
            User author;
            String str3 = "";
            C89219l.m154721d(dVar, str3);
            if (!(aVar == null || (aVar2 = this.f136539a.f136528y) == null || aVar2.getSearchParam() == null)) {
                C59537a aVar3 = this.f136539a.f136528y;
                String str4 = null;
                if (aVar3 != null) {
                    aweme = aVar3.getMAweme();
                } else {
                    aweme = null;
                }
                String str5 = this.f136539a.f136527w;
                C59537a aVar4 = this.f136539a.f136528y;
                if (aVar4 != null) {
                    bVar = aVar4.getSearchParam();
                } else {
                    bVar = null;
                }
                C33744d a = new C33744d().mo59983a("enter_from", "playlist").mo59983a("playlist_id", str5);
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    str = null;
                } else {
                    str = author.getUid();
                }
                C33744d a2 = a.mo59983a("author_id", str);
                if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
                    str3 = searchId;
                }
                C33744d a3 = a2.mo59983a("search_id", str3);
                if (bVar != null) {
                    num = bVar.isFromVideo();
                } else {
                    num = null;
                }
                C33744d a4 = a3.mo59982a("is_from_video", num);
                if (bVar != null) {
                    str2 = bVar.getSearchType();
                } else {
                    str2 = null;
                }
                C33744d a5 = a4.mo59983a("search_type", str2);
                if (aweme != null) {
                    str4 = aweme.getGroupId();
                }
                C39162r.m79460a("playlist_panel_click", a5.mo59983a("group_id", str4).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$q */
    static final class C59952q extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59934a f136544a;

        static {
            Covode.recordClassIndex(70371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59952q(C59934a aVar) {
            super(2);
            this.f136544a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(dVar, "");
            if (list2 != null) {
                int i = ((C59857d) this.f136544a.mo97343y().mo20671d().mo20680a()).f136336d;
                if (i == C59860g.f136349a) {
                    this.f136544a.mo97341a(list2);
                } else if (i == C59860g.f136351c) {
                    if (!C67338a.m119381a()) {
                        this.f136544a.mo97343y().mo97233a(new C59858e(Integer.valueOf(C59859f.f136346b), this.f136544a.mo97342b(C89070n.m154585g((Collection) list2)), this.f136544a.mo97343y().f136235q));
                    } else {
                        this.f136544a.f96636k.mo59517b(this.f136544a.mo97342b(C89070n.m154585g((Collection) list2)), this.f136544a.mo97343y().f136235q);
                    }
                } else if (i == C59860g.f136350b) {
                    if (!C67338a.m119381a()) {
                        this.f136544a.mo97343y().mo97233a(new C59858e(Integer.valueOf(C59859f.f136347c), this.f136544a.mo97342b(C89070n.m154585g((Collection) list2)), this.f136544a.mo97343y().f136235q));
                    } else {
                        this.f136544a.f96636k.mo59523c(this.f136544a.mo97342b(C89070n.m154585g((Collection) list2)), this.f136544a.mo97343y().f136234p);
                    }
                } else if (i == C59860g.f136352d) {
                    this.f136544a.mo97341a(list2);
                    C59412a.m109111a();
                }
                long j = this.f136544a.mo97343y().f136236r;
                if (j > 0) {
                    j++;
                }
                C49812b bVar = this.f136544a.f96635j;
                C89219l.m154716b(bVar, "");
                bVar.setPlaylistOffset(j);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b.AbstractC41363a
    public final void onViewCreated(View view, Bundle bundle) {
        C59537a aVar;
        C59538b searchParam;
        Integer isFromVideo;
        C59537a aVar2;
        MethodCollector.m26663i(323);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo61343a(R.id.ak6);
        tuxTextView.setMaxWidth(C13628n.m24504a(tuxTextView.getContext()) - (f136514G * 2));
        tuxTextView.setText(this.f136516A);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo61343a(R.id.ckq);
        C89219l.m154716b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C80534hh.m139609b();
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                AwemeChangeCallBack.m108594a(activity, activity, new C59944j(this));
            }
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59962e.f136554a, (C12854k) null, new C59950o(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59963f.f136555a, (C12854k) null, new C59951p(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59964g.f136556a, (C12854k) null, new C59952q(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59965h.f136557a, (C12854k) null, new C59946k(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59959b.f136551a, (C12854k) null, new C59947l(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59960c.f136552a, (C12854k) null, new C59948m(this), 6);
            AbstractC12818f.C12819a.m23063a(this, mo97343y(), C59961d.f136553a, (C12854k) null, new C59949n(this), 6);
            DmtStatusView p = mo70640p();
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akt, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.bhk);
            C89219l.m154716b(findViewById, "");
            View findViewById2 = inflate.findViewById(R.id.f63);
            C89219l.m154716b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.ev0);
            C89219l.m154716b(findViewById3, "");
            TextView textView2 = (TextView) findViewById3;
            ((AutoRTLImageView) findViewById).setBackgroundResource(2131232646);
            if (getContext() != null) {
                textView.setTextColor(C0643b.m2378c(textView.getContext(), R.color.l));
                textView2.setTextColor(C0643b.m2378c(textView.getContext(), R.color.l));
            }
            textView.setText(getString(R.string.dgo));
            textView2.setVisibility(8);
            C89219l.m154716b(inflate, "");
            DmtStatusView.C17269a b = a.mo27406b(inflate);
            b.f41304g = 1;
            p.setBuilder(b);
            if (C59412a.m109111a() == 0 || (aVar2 = this.f136528y) == null || aVar2.getMAweme() == null) {
                mo70640p().mo27384f();
            }
            if ((C59412a.m109111a() == 1 || C59412a.m109111a() == 2) && ((aVar = this.f136528y) == null || (searchParam = aVar.getSearchParam()) == null || (isFromVideo = searchParam.isFromVideo()) == null || isFromVideo.intValue() != 3 || C67338a.m119381a())) {
                C1731i.m5640b(new CallableC59943i(this), C1731i.f5562a);
            }
            MethodCollector.m26664o(323);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.m26664o(323);
        throw nullPointerException;
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.akk, viewGroup, false);
    }
}
