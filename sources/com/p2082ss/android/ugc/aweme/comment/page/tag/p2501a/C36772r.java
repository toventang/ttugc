package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36890g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36894k;
import com.p2082ss.android.ugc.aweme.comment.page.tag.FriendsListCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.SectionCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36940a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.Collection;
import java.util.List;
import p077b.C1731i;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r */
public final class C36772r extends AbstractC12769a {

    /* renamed from: j */
    public PowerList f86759j;

    /* renamed from: k */
    public TuxStatusView f86760k;

    /* renamed from: l */
    public Boolean f86761l;

    /* renamed from: m */
    private final C12814b f86762m;

    /* renamed from: n */
    private final AbstractC89244h f86763n;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$j */
    public static final class C36782j extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36782j INSTANCE = new C36782j();

        static {
            Covode.recordClassIndex(44119);
        }

        public C36782j() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44109);
    }

    /* renamed from: w */
    private final VideoTagFriendsListViewModel m74483w() {
        return (VideoTagFriendsListViewModel) this.f86762m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$g */
    public static final class C36779g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86769a;

        static {
            Covode.recordClassIndex(44116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36779g(AbstractC12748a aVar) {
            super(0);
            this.f86769a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86769a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$f */
    public static final class C36778f extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36778f INSTANCE = new C36778f();

        static {
            Covode.recordClassIndex(44115);
        }

        public C36778f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$h */
    public static final class C36780h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86770a;

        static {
            Covode.recordClassIndex(44117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36780h(AbstractC12748a aVar) {
            super(0);
            this.f86770a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86770a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$l */
    public static final class C36784l extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36784l INSTANCE = new C36784l();

        static {
            Covode.recordClassIndex(44121);
        }

        public C36784l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$q */
    public static final class C36789q extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36789q INSTANCE = new C36789q();

        static {
            Covode.recordClassIndex(44126);
        }

        public C36789q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$i */
    public static final class C36781i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86771a;

        static {
            Covode.recordClassIndex(44118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36781i(AbstractC12748a aVar) {
            super(0);
            this.f86771a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86771a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$k */
    public static final class C36783k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86772a;

        static {
            Covode.recordClassIndex(44120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36783k(AbstractC12748a aVar) {
            super(0);
            this.f86772a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86772a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$w */
    static final class C36796w extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C36772r f86783a;

        static {
            Covode.recordClassIndex(44133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36796w(C36772r rVar) {
            super(0);
            this.f86783a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f86783a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$a */
    public static final class C36773a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86764a;

        static {
            Covode.recordClassIndex(44110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36773a(AbstractC89277c cVar) {
            super(0);
            this.f86764a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86764a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$b */
    public static final class C36774b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86765a;

        static {
            Covode.recordClassIndex(44111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36774b(AbstractC12748a aVar) {
            super(0);
            this.f86765a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86765a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$c */
    public static final class C36775c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86766a;

        static {
            Covode.recordClassIndex(44112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36775c(AbstractC12748a aVar) {
            super(0);
            this.f86766a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86766a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$m */
    public static final class C36785m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86773a;

        static {
            Covode.recordClassIndex(44122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36785m(AbstractC12748a aVar) {
            super(0);
            this.f86773a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86773a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$n */
    public static final class C36786n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86774a;

        static {
            Covode.recordClassIndex(44123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36786n(AbstractC12748a aVar) {
            super(0);
            this.f86774a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86774a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$o */
    public static final class C36787o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86775a;

        static {
            Covode.recordClassIndex(44124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36787o(AbstractC12748a aVar) {
            super(0);
            this.f86775a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86775a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$p */
    public static final class C36788p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86776a;

        static {
            Covode.recordClassIndex(44125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36788p(AbstractC12748a aVar) {
            super(0);
            this.f86776a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86776a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$d */
    public static final class C36776d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86767a;

        static {
            Covode.recordClassIndex(44113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36776d(AbstractC12748a aVar) {
            super(0);
            this.f86767a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86767a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$e */
    public static final class C36777e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86768a;

        static {
            Covode.recordClassIndex(44114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36777e(AbstractC12748a aVar) {
            super(0);
            this.f86768a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86768a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: v */
    public final void mo64320v() {
        TuxStatusView.C23263c cVar = (TuxStatusView.C23263c) this.f86763n.getValue();
        if (cVar != null) {
            TuxStatusView tuxStatusView = this.f86760k;
            if (tuxStatusView == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView.setStatus(cVar);
            TuxStatusView tuxStatusView2 = this.f86760k;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$r */
    static final class C36790r extends AbstractC89220m implements AbstractC89171a<TuxStatusView.C23263c> {

        /* renamed from: a */
        final /* synthetic */ C36772r f86777a;

        static {
            Covode.recordClassIndex(44127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36790r(C36772r rVar) {
            super(0);
            this.f86777a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView.C23263c invoke() {
            String str;
            String str2;
            Resources resources;
            Resources resources2;
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            Context az_ = this.f86777a.az_();
            if (az_ == null || (resources2 = az_.getResources()) == null || (str = resources2.getString(R.string.gzv)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            TuxStatusView.C23263c a = cVar.mo37879a(str);
            Context az_2 = this.f86777a.az_();
            if (az_2 == null || (resources = az_2.getResources()) == null || (str2 = resources.getString(R.string.vc)) == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            return a.mo37878a((CharSequence) str2).mo37877a(C23005c.m43393a(C367911.f86778a));
        }
    }

    public C36772r() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C36796w wVar = new C36796w(this);
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36773a aVar = new C36773a(a);
        C36782j jVar = C36782j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36784l.INSTANCE, new C36785m(this), new C36786n(this), wVar, jVar, new C36787o(this), new C36788p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36789q.INSTANCE, new C36774b(this), new C36775c(this), wVar, jVar, new C36776d(this), new C36777e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36778f.INSTANCE, new C36779g(this), new C36780h(this), wVar, jVar, new C36781i(this), new C36783k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86762m = bVar;
        this.f86763n = C89250i.m154773a((AbstractC89171a) new C36790r(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$s */
    public static final class C36792s extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C36772r f86779a;

        static {
            Covode.recordClassIndex(44129);
        }

        C36792s(C36772r rVar) {
            this.f86779a = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            AbstractC36675d dVar = (AbstractC36675d) C12801d.m23025c(this.f86779a, C89204ab.m154669a(AbstractC36675d.class));
            if (dVar != null) {
                dVar.mo64305a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PowerList m74482a(C36772r rVar) {
        PowerList powerList = rVar.f86759j;
        if (powerList == null) {
            C89219l.m154710a("friendsList");
        }
        return powerList;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        TuxStatusView tuxStatusView = (TuxStatusView) mo20528t().findViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        this.f86760k = tuxStatusView;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.mo37867a();
        tuxStatusView.setVisibility(0);
        PowerList powerList = (PowerList) mo20528t().findViewById(R.id.b93);
        C89219l.m154716b(powerList, "");
        this.f86759j = powerList;
        if (powerList == null) {
            C89219l.m154710a("friendsList");
        }
        powerList.mo28083a(FriendsListCell.class, SectionCell.class);
        powerList.setItemAnimator(null);
        powerList.mo4405a(new C36792s(this));
        VideoTagFriendsListViewModel w = m74483w();
        w.f86917l.clear();
        Aweme aweme = w.mo23342g().getAweme();
        if (aweme != null && (true ^ TextUtils.isEmpty(aweme.getAid()))) {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            w.f86921p.mo20458a().mo64354a(Long.parseLong(aid)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new VideoTagFriendsListViewModel.C36922n(w), VideoTagFriendsListViewModel.C36923o.f86947a);
        }
        C1731i b = C1731i.m5640b(new VideoTagFriendsListViewModel.CallableC36910f(w), C1731i.f5562a);
        C89219l.m154716b(b, "");
        b.mo5534a(new VideoTagFriendsListViewModel.C36924p(w), C1731i.f5564c, null);
        AbstractC12818f.C12819a.m23063a(this, m74483w(), C36797s.f86784a, C12856l.m23100a(), new C36793t(this), 4);
        C12801d.m23021a(this, C89204ab.m154669a(AbstractC36675d.class), C36798t.f86785a, C36799u.f86786a, new C36794u(this));
        AbstractC12818f.C12819a.m23063a(this, m74483w(), C36800v.f86787a, C12856l.m23100a(), new C36795v(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$v */
    static final class C36795v extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36772r f86782a;

        static {
            Covode.recordClassIndex(44132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36795v(C36772r rVar) {
            super(2);
            this.f86782a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            T t;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C36772r.m74482a(this.f86782a).getState().mo28137b(new C36890g(t));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$u */
    static final class C36794u extends AbstractC89220m implements AbstractC89183m<C12776a<? extends Boolean>, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36772r f86781a;

        static {
            Covode.recordClassIndex(44131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36794u(C36772r rVar) {
            super(2);
            this.f86781a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar, String str) {
            boolean z;
            int i;
            String str2 = str;
            C89219l.m154721d(aVar, "");
            PowerList a = C36772r.m74482a(this.f86781a);
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            if (str2 == null || str2.length() == 0) {
                if (C89219l.m154714a((Object) this.f86781a.f86761l, (Object) true)) {
                    TuxStatusView tuxStatusView = this.f86781a.f86760k;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                } else if (C89219l.m154714a((Object) this.f86781a.f86761l, (Object) false)) {
                    this.f86781a.mo64320v();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.r$t */
    static final class C36793t extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C36940a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36772r f86780a;

        static {
            Covode.recordClassIndex(44130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36793t(C36772r rVar) {
            super(2);
            this.f86780a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends C36940a> aVar) {
            T t;
            int i;
            int size;
            Context az_;
            String string;
            Context az_2;
            Context az_3;
            C12776a<? extends C36940a> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C36772r rVar = this.f86780a;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                PowerList powerList = rVar.f86759j;
                if (powerList == null) {
                    C89219l.m154710a("friendsList");
                }
                powerList.getState().mo28128a();
                int i2 = 0;
                if (C13603b.m24435a((Collection) t.f86979d)) {
                    PowerList powerList2 = rVar.f86759j;
                    if (powerList2 == null) {
                        C89219l.m154710a("friendsList");
                    }
                    powerList2.setVisibility(8);
                    rVar.f86761l = false;
                    rVar.mo64320v();
                } else {
                    TuxStatusView tuxStatusView = rVar.f86760k;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                    rVar.f86761l = true;
                    int i3 = -1;
                    if (C13603b.m24435a((Collection) t.f86976a)) {
                        i = -1;
                    } else {
                        i = 0;
                    }
                    if (C13603b.m24435a((Collection) t.f86977b)) {
                        size = -1;
                    } else {
                        size = t.f86976a.size();
                    }
                    if (!C13603b.m24435a((Collection) t.f86978c)) {
                        i3 = t.f86979d.size() - t.f86978c.size();
                    }
                    List<IMUser> list = t.f86979d;
                    if (list != null) {
                        for (T t2 : list) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                C89070n.m154520a();
                            }
                            T t3 = t2;
                            if (i2 != i ? i2 != size ? i2 != i3 || (az_ = rVar.az_()) == null || (string = az_.getString(R.string.byo)) == null : (az_2 = rVar.az_()) == null || (string = az_2.getString(R.string.cfi)) == null : (az_3 = rVar.az_()) == null || (string = az_3.getString(R.string.cgc)) == null) {
                                string = "";
                            }
                            C89219l.m154716b(string, "");
                            if (!TextUtils.isEmpty(string)) {
                                PowerList powerList3 = rVar.f86759j;
                                if (powerList3 == null) {
                                    C89219l.m154710a("friendsList");
                                }
                                powerList3.getState().mo28132a(new C36894k(string));
                            }
                            PowerList powerList4 = rVar.f86759j;
                            if (powerList4 == null) {
                                C89219l.m154710a("friendsList");
                            }
                            powerList4.getState().mo28132a(new C36890g(t3));
                            i2 = i4;
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
