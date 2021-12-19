package com.p2082ss.android.ugc.aweme.music.assem.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.assem.video.b */
public final class C60683b extends AbstractC60682a implements AbstractC61180m {

    /* renamed from: j */
    private final C12814b f137911j;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$j */
    public static final class C60693j extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C60693j INSTANCE = new C60693j();

        static {
            Covode.recordClassIndex(71249);
        }

        public C60693j() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(71239);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final MusicPlayViewModel mo98139v() {
        return (MusicPlayViewModel) this.f137911j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$g */
    public static final class C60690g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137917a;

        static {
            Covode.recordClassIndex(71246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60690g(AbstractC12748a aVar) {
            super(0);
            this.f137917a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137917a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        return this.f31048h;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$f */
    public static final class C60689f extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60689f INSTANCE = new C60689f();

        static {
            Covode.recordClassIndex(71245);
        }

        public C60689f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$h */
    public static final class C60691h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137918a;

        static {
            Covode.recordClassIndex(71247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60691h(AbstractC12748a aVar) {
            super(0);
            this.f137918a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137918a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$l */
    public static final class C60695l extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60695l INSTANCE = new C60695l();

        static {
            Covode.recordClassIndex(71251);
        }

        public C60695l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$q */
    public static final class C60700q extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60700q INSTANCE = new C60700q();

        static {
            Covode.recordClassIndex(71256);
        }

        public C60700q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return mo98139v().f137891l;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: l */
    public final void mo20537l() {
        super.mo20537l();
        mo98138a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$i */
    public static final class C60692i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137919a;

        static {
            Covode.recordClassIndex(71248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60692i(AbstractC12748a aVar) {
            super(0);
            this.f137919a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137919a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$k */
    public static final class C60694k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137920a;

        static {
            Covode.recordClassIndex(71250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60694k(AbstractC12748a aVar) {
            super(0);
            this.f137920a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137920a.bD_().f30985g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        Context az_ = az_();
        if (!(az_ instanceof ActivityC0945e)) {
            az_ = null;
        }
        return (ActivityC0945e) az_;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        super.mo20525j();
        mo98139v().mo98135l();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$a */
    public static final class C60684a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137912a;

        static {
            Covode.recordClassIndex(71240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60684a(AbstractC89277c cVar) {
            super(0);
            this.f137912a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137912a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$b */
    public static final class C60685b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137913a;

        static {
            Covode.recordClassIndex(71241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60685b(AbstractC12748a aVar) {
            super(0);
            this.f137913a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137913a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$c */
    public static final class C60686c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137914a;

        static {
            Covode.recordClassIndex(71242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60686c(AbstractC12748a aVar) {
            super(0);
            this.f137914a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137914a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$m */
    public static final class C60696m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137921a;

        static {
            Covode.recordClassIndex(71252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60696m(AbstractC12748a aVar) {
            super(0);
            this.f137921a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137921a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$n */
    public static final class C60697n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137922a;

        static {
            Covode.recordClassIndex(71253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60697n(AbstractC12748a aVar) {
            super(0);
            this.f137922a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137922a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$o */
    public static final class C60698o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137923a;

        static {
            Covode.recordClassIndex(71254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60698o(AbstractC12748a aVar) {
            super(0);
            this.f137923a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137923a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$p */
    public static final class C60699p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137924a;

        static {
            Covode.recordClassIndex(71255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60699p(AbstractC12748a aVar) {
            super(0);
            this.f137924a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137924a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$r */
    static final class C60701r extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60683b f137925a;

        static {
            Covode.recordClassIndex(71257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60701r(C60683b bVar) {
            super(0);
            this.f137925a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137925a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        mo98138a(false);
        MusicPlayViewModel v = mo98139v();
        v.f137890k = null;
        v.f137889j = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$d */
    public static final class C60687d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137915a;

        static {
            Covode.recordClassIndex(71243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60687d(AbstractC12748a aVar) {
            super(0);
            this.f137915a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137915a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$e */
    public static final class C60688e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137916a;

        static {
            Covode.recordClassIndex(71244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60688e(AbstractC12748a aVar) {
            super(0);
            this.f137916a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137916a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C60683b() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C60701r rVar = new C60701r(this);
        AbstractC89277c a = C89204ab.m154669a(MusicPlayViewModel.class);
        C60684a aVar = new C60684a(a);
        C60693j jVar = C60693j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C60695l.INSTANCE, new C60696m(this), new C60697n(this), rVar, jVar, new C60698o(this), new C60699p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C60700q.INSTANCE, new C60685b(this), new C60686c(this), rVar, jVar, new C60687d(this), new C60688e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C60689f.INSTANCE, new C60690g(this), new C60691h(this), rVar, jVar, new C60692i(this), new C60694k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137911j = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98138a(boolean z) {
        mo98139v().mo98128a(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$t */
    static final class C60703t extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60683b f137932a;

        static {
            Covode.recordClassIndex(71259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60703t(C60683b bVar) {
            super(1);
            this.f137932a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                if (aVar2.f31085a.booleanValue()) {
                    this.f137932a.mo98139v().mo98135l();
                } else {
                    this.f137932a.mo98138a(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        DataCenter dataCenter = null;
        if (a != null) {
            dataCenter = DataCenter.m69492a(C1181ae.m3879a(a, (C1175ad.AbstractC1177b) null), this);
        }
        MusicPlayViewModel v = mo98139v();
        C89219l.m154721d(this, "");
        v.f137889j = new MusicDownloadPlayHelper(this);
        MusicDownloadPlayHelper musicDownloadPlayHelper = v.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.mo63043b();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = v.f137889j;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.f138612h = new MusicPlayViewModel.C60673c(dataCenter);
        }
        v.f137890k = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("music_loading", (AbstractC1214u<C33942b>) v);
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C60704c.f137933a, new C60703t(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$s */
    public static final class C60702s extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f137926a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig f137927b;

        /* renamed from: c */
        final /* synthetic */ C60683b f137928c;

        /* renamed from: d */
        final /* synthetic */ String f137929d;

        /* renamed from: e */
        final /* synthetic */ String f137930e;

        /* renamed from: f */
        final /* synthetic */ MusicModel f137931f;

        static {
            Covode.recordClassIndex(71258);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f137926a, this.f137927b, this.f137931f, true);
        }

        C60702s(Activity activity, RecordConfig recordConfig, C60683b bVar, String str, String str2, MusicModel musicModel) {
            this.f137926a = activity;
            this.f137927b = recordConfig;
            this.f137928c = bVar;
            this.f137929d = str;
            this.f137930e = str2;
            this.f137931f = musicModel;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, MusicModel musicModel, String str2) {
        Activity i;
        if (musicModel != null && (i = mo62886i()) != null) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            if (str2 == null) {
                C89219l.m154715b();
            }
            RecordConfig.Builder musicOrigin = builder.musicOrigin(str2);
            if (str == null) {
                C89219l.m154715b();
            }
            RecordConfig.Builder musicPath = musicOrigin.musicPath(str);
            if (!mo98139v().mo98132i()) {
                musicPath.shootFrom("others_homepage");
            }
            AVExternalServiceImpl.m113114a().asyncService("OriginMusic", new C60702s(i, musicPath.build(), this, str2, str, musicModel));
        }
    }
}
