package com.p2082ss.android.ugc.aweme.music.search.p3478a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.AbstractC0549a;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.AbstractC12695v;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60604e;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.EnumC60605f;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.C60590k;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60706e;
import com.p2082ss.android.ugc.aweme.music.assem.video.EnumC60707f;
import com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.music.search.AbstractC61057r;
import com.p2082ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.music.search.a.a */
public class C60893a extends AbstractC12695v<C60893a> implements AbstractC12658i<C60603d> {

    /* renamed from: r */
    static final /* synthetic */ AbstractC89286i[] f138378r = {new C89232y(C60893a.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicCellViewModel;", 0), new C89232y(C60893a.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/search/SearchMusicListViewModel;", 0), new C89232y(C60893a.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/assem/video/MusicPlayViewModel;", 0)};

    /* renamed from: s */
    private final AbstractC89248d f138379s;

    /* renamed from: t */
    private final AbstractC89248d f138380t;

    /* renamed from: u */
    private final AbstractC89248d f138381u;

    /* renamed from: v */
    private EnumC60707f f138382v;

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$e */
    public static final class C60902e extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {
        public static final C60902e INSTANCE = new C60902e();

        static {
            Covode.recordClassIndex(71493);
        }

        public C60902e() {
            super(1);
        }

        public final C60706e invoke(C60706e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$i */
    public static final class C60906i extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {
        public static final C60906i INSTANCE = new C60906i();

        static {
            Covode.recordClassIndex(71497);
        }

        public C60906i() {
            super(1);
        }

        public final C60590k invoke(C60590k kVar) {
            C89219l.m154719c(kVar, "");
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$o */
    public static final class C60912o extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60912o INSTANCE = new C60912o();

        static {
            Covode.recordClassIndex(71503);
        }

        public C60912o() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71484);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final MusicCellViewModel mo98543C() {
        return (MusicCellViewModel) this.f138379s.mo23374a(this, f138378r[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final SearchMusicListViewModel mo98544D() {
        return (SearchMusicListViewModel) this.f138380t.mo23374a(this, f138378r[1]);
    }

    /* renamed from: E */
    public final MusicPlayViewModel mo98545E() {
        return (MusicPlayViewModel) this.f138381u.mo23374a(this, f138378r[2]);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$f */
    public static final class C60903f extends AbstractC89220m implements AbstractC89171a<C12874b<C60706e>> {
        public static final C60903f INSTANCE = new C60903f();

        static {
            Covode.recordClassIndex(71494);
        }

        public C60903f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60706e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$j */
    public static final class C60907j extends AbstractC89220m implements AbstractC89171a<C12874b<C60590k>> {
        public static final C60907j INSTANCE = new C60907j();

        static {
            Covode.recordClassIndex(71498);
        }

        public C60907j() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60590k> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$k */
    public static final class C60908k extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138393a;

        static {
            Covode.recordClassIndex(71499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60908k(AbstractC12693u uVar) {
            super(0);
            this.f138393a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f138393a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$p */
    public static final class C60913p extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60913p INSTANCE = new C60913p();

        static {
            Covode.recordClassIndex(71504);
        }

        public C60913p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$b */
    public static final class C60899b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138388a;

        static {
            Covode.recordClassIndex(71490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60899b(AbstractC12693u uVar) {
            super(0);
            this.f138388a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138388a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$c */
    public static final class C60900c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138389a;

        static {
            Covode.recordClassIndex(71491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60900c(AbstractC12693u uVar) {
            super(0);
            this.f138389a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138389a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$g */
    public static final class C60904g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138391a;

        static {
            Covode.recordClassIndex(71495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60904g(AbstractC12693u uVar) {
            super(0);
            this.f138391a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138391a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$h */
    public static final class C60905h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138392a;

        static {
            Covode.recordClassIndex(71496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60905h(AbstractC12693u uVar) {
            super(0);
            this.f138392a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138392a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$l */
    public static final class C60909l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138394a;

        static {
            Covode.recordClassIndex(71500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60909l(AbstractC12693u uVar) {
            super(0);
            this.f138394a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f138394a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$m */
    public static final class C60910m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f138395a;

        static {
            Covode.recordClassIndex(71501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60910m(AbstractC12693u uVar) {
            super(0);
            this.f138395a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f138395a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$a */
    public static final class C60894a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138383a;

        static {
            Covode.recordClassIndex(71485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60894a(AbstractC89277c cVar) {
            super(0);
            this.f138383a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138383a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$ac */
    static final class C60897ac extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60893a f138386a;

        static {
            Covode.recordClassIndex(71488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60897ac(C60893a aVar) {
            super(0);
            this.f138386a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f138386a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$d */
    public static final class C60901d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138390a;

        static {
            Covode.recordClassIndex(71492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60901d(AbstractC89277c cVar) {
            super(0);
            this.f138390a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138390a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$n */
    public static final class C60911n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f138396a;

        static {
            Covode.recordClassIndex(71502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60911n(AbstractC89277c cVar) {
            super(0);
            this.f138396a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f138396a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$u */
    static final class C60918u extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60893a f138405a;

        static {
            Covode.recordClassIndex(71509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60918u(C60893a aVar) {
            super(0);
            this.f138405a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f138405a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        MusicPlayViewModel E;
        mo20510a(E, C60925c.f138413a, C60926d.f138414a, C12856l.m23102a(mo98545E().f31149c), null, C60919v.f138406a);
        AbstractC12818f.C12819a.m23063a(this, mo98543C(), C60927e.f138415a, (C12854k) null, C60920w.f138407a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo98543C(), C60928f.f138416a, (C12854k) null, C60921x.f138408a, 6);
    }

    /* renamed from: F */
    public final void mo98546F() {
        boolean z = true;
        if (MusicService.m81198m().mo69308a(((C60603d) C12661l.m22797a(this)).f137817a, mo20528t().getContext(), true)) {
            MusicCellViewModel C = mo98543C();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this)).f137817a;
            String g = mo98545E().mo23342g();
            int b = C12661l.m22798b(this);
            if (((C60603d) C12661l.m22797a(this)).f137818b != EnumC60605f.PINNED) {
                z = false;
            }
            C.mo98081a(musicModel, g, b, z);
            ((CheckableImageView) mo20528t().findViewById(R.id.bxo)).mo98607b();
        }
    }

    public C60893a() {
        C60916s sVar = C60916s.f138403a;
        C60917t tVar = C60917t.f138404a;
        AbstractC89277c a = C89204ab.m154669a(MusicCellViewModel.class);
        this.f138379s = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C60894a(a), C60907j.INSTANCE, new C60908k(this), C60906i.INSTANCE, sVar, tVar, new C60909l(this), new C60910m(this));
        AbstractC12848i iVar = AbstractC12848i.C12852d.f31278a;
        C60918u uVar = new C60918u(this);
        AbstractC89277c a2 = C89204ab.m154669a(SearchMusicListViewModel.class);
        this.f138380t = C14530k.m26542a(this, a2, iVar == null ? AbstractC12848i.C12851c.f31277a : iVar, new C60911n(a2), C60913p.INSTANCE, uVar, C60912o.INSTANCE, null, null, new C60899b(this), new C60900c(this));
        AbstractC12848i iVar2 = AbstractC12848i.C12852d.f31278a;
        C60897ac acVar = new C60897ac(this);
        AbstractC89277c a3 = C89204ab.m154669a(MusicPlayViewModel.class);
        this.f138381u = C14530k.m26542a(this, a3, iVar2 == null ? AbstractC12848i.C12851c.f31277a : iVar2, new C60901d(a3), C60903f.INSTANCE, acVar, C60902e.INSTANCE, null, null, new C60904g(this), new C60905h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$ab */
    public static final class C60896ab implements CheckableImageView.AbstractC61078a {

        /* renamed from: a */
        final /* synthetic */ C60893a f138385a;

        static {
            Covode.recordClassIndex(71487);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        public final void bX_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60896ab(C60893a aVar) {
            this.f138385a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
        /* renamed from: a */
        public final void mo62594a(int i) {
            if (i == 1) {
                this.f138385a.mo98543C().mo23343h();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(C60603d dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: c */
    public final /* synthetic */ boolean mo20470c(C60603d dVar) {
        C89219l.m154721d(dVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$q */
    static final class View$OnClickListenerC60914q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60893a f138397a;

        /* renamed from: b */
        final /* synthetic */ String f138398b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f138399c;

        static {
            Covode.recordClassIndex(71505);
        }

        View$OnClickListenerC60914q(C60893a aVar, String str, MusicModel musicModel) {
            this.f138397a = aVar;
            this.f138398b = str;
            this.f138399c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f138397a.mo98546F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$aa */
    static final class View$OnClickListenerC60895aa implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60893a f138384a;

        static {
            Covode.recordClassIndex(71486);
        }

        View$OnClickListenerC60895aa(C60893a aVar) {
            this.f138384a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f138384a.mo98545E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f138384a)).f137817a;
            int b = C12661l.m22798b(this.f138384a);
            if (((C60603d) C12661l.m22797a(this.f138384a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98129b(musicModel, b, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$z */
    static final class View$OnClickListenerC60923z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60893a f138411a;

        static {
            Covode.recordClassIndex(71514);
        }

        View$OnClickListenerC60923z(C60893a aVar) {
            this.f138411a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            MusicPlayViewModel E = this.f138411a.mo98545E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f138411a)).f137817a;
            int b = C12661l.m22798b(this.f138411a);
            if (((C60603d) C12661l.m22797a(this.f138411a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98131d(musicModel, b, z);
        }
    }

    /* renamed from: a */
    private final void m110510a(EnumC60605f fVar) {
        int i;
        ((TuxIconView) mo20528t().findViewById(R.id.bxt)).setTuxIcon(C23005c.m43393a(new C60898ad(fVar)));
        TuxTextView tuxTextView = (TuxTextView) mo20528t().findViewById(R.id.f13);
        C89219l.m154716b(tuxTextView, "");
        if (fVar == EnumC60605f.PINNED) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$ad */
    public static final class C60898ad extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC60605f f138387a;

        static {
            Covode.recordClassIndex(71489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60898ad(EnumC60605f fVar) {
            super(1);
            this.f138387a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            int i2;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            if (this.f138387a == EnumC60605f.PINNED) {
                i = R.raw.icon_pin_fill;
            } else {
                i = R.raw.icon_pin;
            }
            aVar2.f54431a = i;
            if (this.f138387a == EnumC60605f.PINNED || this.f138387a == EnumC60605f.ENABLE_PINNED) {
                i2 = R.attr.bc;
            } else {
                i2 = R.attr.bd;
            }
            aVar2.f54435e = Integer.valueOf(i2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$y */
    static final class View$OnClickListenerC60922y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60893a f138409a;

        /* renamed from: b */
        final /* synthetic */ View f138410b;

        static {
            Covode.recordClassIndex(71513);
        }

        View$OnClickListenerC60922y(C60893a aVar, View view) {
            this.f138409a = aVar;
            this.f138410b = view;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            ((TuxIconView) this.f138410b.findViewById(R.id.bzx)).clearAnimation();
            ((TuxIconView) this.f138410b.findViewById(R.id.bzx)).setIconRes(R.raw.icon_color_play);
            MusicPlayViewModel E = this.f138409a.mo98545E();
            MusicModel musicModel = ((C60603d) C12661l.m22797a(this.f138409a)).f137817a;
            int b = C12661l.m22798b(this.f138409a);
            if (((C60603d) C12661l.m22797a(this.f138409a)).f137818b == EnumC60605f.PINNED) {
                z = true;
            } else {
                z = false;
            }
            E.mo98130c(musicModel, b, z);
        }
    }

    /* renamed from: a */
    public final void mo98547a(EnumC60707f fVar) {
        MethodCollector.m26663i(7358);
        if (this.f138382v == fVar) {
            MethodCollector.m26664o(7358);
            return;
        }
        this.f138382v = fVar;
        View t = mo20528t();
        int i = C60924b.f138412a[fVar.ordinal()];
        if (i == 1) {
            TuxIconView tuxIconView = (TuxIconView) t.findViewById(R.id.bzx);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) t.findViewById(R.id.bzx)).setImageResource(2131233424);
            ((TuxIconView) t.findViewById(R.id.bzx)).clearAnimation();
            ProgressBar progressBar = (ProgressBar) t.findViewById(R.id.d01);
            C89219l.m154716b(progressBar, "");
            progressBar.setVisibility(8);
            C39162r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(((C60603d) C12661l.m22797a(this)).f137817a.getMusicId()));
            MethodCollector.m26664o(7358);
        } else if (i != 2) {
            if (i == 3) {
                RelativeLayout relativeLayout = (RelativeLayout) t.findViewById(R.id.dlk);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                ProgressBar progressBar2 = (ProgressBar) t.findViewById(R.id.d01);
                C89219l.m154716b(progressBar2, "");
                progressBar2.setVisibility(8);
                TuxIconView tuxIconView2 = (TuxIconView) t.findViewById(R.id.bzx);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                ((TuxIconView) t.findViewById(R.id.bzx)).setIconRes(R.raw.icon_color_play);
                ((TuxIconView) t.findViewById(R.id.bzx)).clearAnimation();
            }
            MethodCollector.m26664o(7358);
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(mo20528t().getContext(), R.anim.da);
            C89219l.m154716b(loadAnimation, "");
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).setImageResource(2131232639);
            ((TuxIconView) mo20528t().findViewById(R.id.bzx)).startAnimation(loadAnimation);
            MethodCollector.m26664o(7358);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ((RelativeLayout) view.findViewById(R.id.dlk)).setOnClickListener(new View$OnClickListenerC60922y(this, view));
        ((LinearLayout) view.findViewById(R.id.ceu)).setOnClickListener(new View$OnClickListenerC60923z(this));
        ((TuxIconView) view.findViewById(R.id.cno)).setOnClickListener(new View$OnClickListenerC60895aa(this));
        ((CheckableImageView) view.findViewById(R.id.bxo)).setOnStateChangeListener(new C60896ab(this));
        CheckableImageView checkableImageView = (CheckableImageView) view.findViewById(R.id.bxo);
        C89219l.m154716b(checkableImageView, "");
        checkableImageView.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bxt);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
        int i = -a;
        C13628n.m24513a(view.findViewById(R.id.bxt), i, i, a, a);
        AbstractC0549a aVar = (AbstractC0549a) view.findViewById(R.id.qs);
        C89219l.m154716b(aVar, "");
        aVar.setReferencedIds(new int[]{R.id.bxo, R.id.bxt});
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$r */
    static final class View$OnClickListenerC60915r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60893a f138400a;

        /* renamed from: b */
        final /* synthetic */ String f138401b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f138402c;

        static {
            Covode.recordClassIndex(71506);
        }

        View$OnClickListenerC60915r(C60893a aVar, String str, MusicModel musicModel) {
            this.f138400a = aVar;
            this.f138401b = str;
            this.f138402c = musicModel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C60893a aVar = this.f138400a;
            if (((C60603d) C12661l.m22797a(aVar)).f137818b == EnumC60605f.PINNED) {
                SearchMusicListViewModel D = aVar.mo98544D();
                C60603d dVar = (C60603d) C12661l.m22797a(aVar);
                C89219l.m154721d(dVar, "");
                if (!D.f138349m && !D.f138350n) {
                    D.f138350n = true;
                    AbstractC61057r a = D.f138351o.mo20458a();
                    String j = D.mo98536j();
                    if (j == null) {
                        j = "";
                    }
                    String musicId = dVar.f137817a.getMusicId();
                    C89219l.m154716b(musicId, "");
                    AbstractC88412b a2 = a.mo98019b(j, musicId).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new SearchMusicListViewModel.C60888l(D, dVar), new SearchMusicListViewModel.C60890m(D));
                    C89219l.m154716b(a2, "");
                    D.mo20659a(a2);
                    return;
                }
                return;
            }
            SearchMusicListViewModel D2 = aVar.mo98544D();
            C60603d dVar2 = (C60603d) C12661l.m22797a(aVar);
            int b = C12661l.m22798b(aVar);
            C89219l.m154721d(dVar2, "");
            if (!D2.f138349m && !D2.f138350n) {
                PinnedMusicList k = D2.mo98537k();
                if (k == null || k.getAvalibleCapicity() != 0) {
                    C39162r.m79460a("search_result_click", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("button_type", "pin_to_top").mo59983a("search_result_id", dVar2.f137817a.getMusicId()).mo59980a("rank", b).f79943a);
                    D2.f138350n = true;
                    AbstractC61057r a3 = D2.f138351o.mo20458a();
                    String j2 = D2.mo98536j();
                    if (j2 == null) {
                        j2 = "";
                    }
                    String musicId2 = dVar2.f137817a.getMusicId();
                    C89219l.m154716b(musicId2, "");
                    AbstractC88412b a4 = a3.mo98018a(j2, musicId2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new SearchMusicListViewModel.C60881f(D2, dVar2), new SearchMusicListViewModel.C60882g(D2));
                    C89219l.m154716b(a4, "");
                    D2.mo20659a(a4);
                    return;
                }
                D2.mo20662a((AbstractC89172b) new SearchMusicListViewModel.C60880e(D2));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(C60603d dVar) {
        String str;
        C60603d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        mo20528t().setBackground(C0643b.m2369a(mo20528t().getContext(), (int) R.drawable.qa));
        MusicModel musicModel = dVar2.f137817a;
        if (!TextUtils.isEmpty(musicModel.getName())) {
            str = musicModel.getName();
        } else {
            str = "";
        }
        View t = mo20528t();
        TuxTextView tuxTextView = (TuxTextView) t.findViewById(R.id.ezz);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        int i = 0;
        ((TuxTextView) t.findViewById(R.id.ezz)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        ((CheckableImageView) t.findViewById(R.id.bxo)).setOnClickListener(new View$OnClickListenerC60914q(this, str, musicModel));
        TuxTextView tuxTextView2 = (TuxTextView) t.findViewById(R.id.f6s);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(t.getContext().getString(R.string.dm7, Integer.valueOf(musicModel.getUserCount())));
        if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
            TuxTextView tuxTextView3 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(MusicService.m81198m().mo69296a(musicModel.getPresenterDuration()));
            TuxTextView tuxTextView4 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView4, "");
            if (musicModel.getPresenterDuration() <= 0) {
                i = 4;
            }
            tuxTextView4.setVisibility(i);
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(MusicService.m81198m().mo69296a(musicModel.getDuration()));
            TuxTextView tuxTextView6 = (TuxTextView) t.findViewById(R.id.evh);
            C89219l.m154716b(tuxTextView6, "");
            if (musicModel.getDuration() <= 0) {
                i = 4;
            }
            tuxTextView6.setVisibility(i);
        }
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            C34577e.m70608b((RemoteImageView) t.findViewById(R.id.dqg), musicModel.getPicPremium(), -1, -1);
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            C34577e.m70608b((RemoteImageView) t.findViewById(R.id.dqg), musicModel.getPicBig(), -1, -1);
        } else {
            C34577e.m70591a((RemoteImageView) t.findViewById(R.id.dqg), 2131233384);
        }
        ((TuxIconView) t.findViewById(R.id.bxt)).setOnClickListener(new View$OnClickListenerC60915r(this, str, musicModel));
        m110510a(dVar2.f137818b);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$s */
    static final class C60916s extends AbstractC89220m implements AbstractC89183m<C60590k, C60603d, C60590k> {

        /* renamed from: a */
        public static final C60916s f138403a = new C60916s();

        static {
            Covode.recordClassIndex(71507);
        }

        C60916s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C60590k invoke(C60590k kVar, C60603d dVar) {
            boolean z;
            C60590k kVar2 = kVar;
            C60603d dVar2 = dVar;
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(dVar2, "");
            if (dVar2.f137817a.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                z = true;
            } else {
                z = false;
            }
            return C60590k.m110154a(kVar2, z, null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$t */
    static final class C60917t extends AbstractC89220m implements AbstractC89183m<C60603d, C60590k, C60603d> {

        /* renamed from: a */
        public static final C60917t f138404a = new C60917t();

        static {
            Covode.recordClassIndex(71508);
        }

        C60917t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C60603d invoke(C60603d dVar, C60590k kVar) {
            MusicModel.CollectionType collectionType;
            C60603d dVar2 = dVar;
            C60590k kVar2 = kVar;
            C89219l.m154721d(dVar2, "");
            C89219l.m154721d(kVar2, "");
            MusicModel musicModel = dVar2.f137817a;
            if (kVar2.f137806a) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            return dVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$w */
    static final class C60920w extends AbstractC89220m implements AbstractC89183m<C60893a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C60920w f138407a = new C60920w();

        static {
            Covode.recordClassIndex(71511);
        }

        C60920w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C60893a aVar, Boolean bool) {
            int i;
            C60893a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            CheckableImageView checkableImageView = (CheckableImageView) aVar2.mo20528t().findViewById(R.id.bxo);
            if (booleanValue) {
                i = 2131233382;
            } else {
                i = 2131233437;
            }
            checkableImageView.setImageResource(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$x */
    static final class C60921x extends AbstractC89220m implements AbstractC89183m<C60893a, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        public static final C60921x f138408a = new C60921x();

        static {
            Covode.recordClassIndex(71512);
        }

        C60921x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C60893a aVar, C12776a<? extends String> aVar2) {
            T t;
            C60893a aVar3 = aVar;
            C12776a<? extends String> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f31085a) == null)) {
                new C23144b(aVar3.mo20528t()).mo37635a(t).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20468a(C60603d dVar, List list) {
        Object obj;
        C60603d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        if (list != null && !list.isEmpty()) {
            if (list != null) {
                obj = list.get(0);
            } else {
                obj = null;
            }
            if ((obj instanceof C60604e) && ((C60604e) obj).f137819a) {
                m110510a(dVar2.f137818b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.a.a$v */
    static final class C60919v extends AbstractC89220m implements AbstractC89187q<C60893a, MusicModel, EnumC60707f, C89391z> {

        /* renamed from: a */
        public static final C60919v f138406a = new C60919v();

        static {
            Covode.recordClassIndex(71510);
        }

        C60919v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C60893a aVar, MusicModel musicModel, EnumC60707f fVar) {
            String str;
            C60893a aVar2 = aVar;
            MusicModel musicModel2 = musicModel;
            EnumC60707f fVar2 = fVar;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(fVar2, "");
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) ((C60603d) C12661l.m22797a(aVar2)).f137817a.getMusicId())) {
                aVar2.mo98547a(fVar2);
            } else {
                aVar2.mo98547a(EnumC60707f.Default);
            }
            return C89391z.f203057a;
        }
    }
}
