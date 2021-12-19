package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

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
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36893j;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36894k;
import com.p2082ss.android.ugc.aweme.comment.page.tag.SearchResultListCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.SectionCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36942c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e */
public final class C36676e extends AbstractC14534m<VideoTagSearchListViewModel> {

    /* renamed from: j */
    public TuxStatusView f86666j;

    /* renamed from: k */
    public EnumC36701u f86667k = EnumC36701u.INIT;

    /* renamed from: l */
    private final AbstractC89244h f86668l = C89250i.m154773a((AbstractC89171a) C36702v.f86690a);

    /* renamed from: m */
    private final C12814b f86669m;

    /* renamed from: n */
    private final AbstractC89244h f86670n;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$l */
    public static final class C36692l extends AbstractC89220m implements AbstractC89172b<C36942c, C36942c> {
        public static final C36692l INSTANCE = new C36692l();

        static {
            Covode.recordClassIndex(44029);
        }

        public C36692l() {
            super(1);
        }

        public final C36942c invoke(C36942c cVar) {
            C89219l.m154719c(cVar, "");
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$u */
    public enum EnumC36701u {
        INIT,
        LOCAL_COMPLETE,
        LOCAL_EMPTY;

        static {
            Covode.recordClassIndex(44038);
        }
    }

    static {
        Covode.recordClassIndex(44013);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f86670n.getValue();
    }

    /* renamed from: y */
    public final VideoTagSearchListViewModel mo23378v() {
        return (VideoTagSearchListViewModel) this.f86669m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$h */
    public static final class C36688h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86680a;

        static {
            Covode.recordClassIndex(44025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36688h(AbstractC12748a aVar) {
            super(0);
            this.f86680a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86680a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$d */
    public static final class C36684d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36684d INSTANCE = new C36684d();

        static {
            Covode.recordClassIndex(44021);
        }

        public C36684d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$g */
    public static final class C36687g extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36687g INSTANCE = new C36687g();

        static {
            Covode.recordClassIndex(44024);
        }

        public C36687g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$i */
    public static final class C36689i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86681a;

        static {
            Covode.recordClassIndex(44026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36689i(AbstractC12748a aVar) {
            super(0);
            this.f86681a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86681a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$j */
    public static final class C36690j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86682a;

        static {
            Covode.recordClassIndex(44027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36690j(AbstractC12748a aVar) {
            super(0);
            this.f86682a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f86682a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$n */
    public static final class C36694n extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36694n INSTANCE = new C36694n();

        static {
            Covode.recordClassIndex(44031);
        }

        public C36694n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$q */
    public static final class C36697q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36697q INSTANCE = new C36697q();

        static {
            Covode.recordClassIndex(44034);
        }

        public C36697q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$t */
    public static final class C36700t extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36700t INSTANCE = new C36700t();

        static {
            Covode.recordClassIndex(44037);
        }

        public C36700t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$k */
    public static final class C36691k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86683a;

        static {
            Covode.recordClassIndex(44028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36691k(AbstractC12748a aVar) {
            super(0);
            this.f86683a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86683a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$m */
    public static final class C36693m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86684a;

        static {
            Covode.recordClassIndex(44030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36693m(AbstractC12748a aVar) {
            super(0);
            this.f86684a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86684a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$v */
    static final class C36702v extends AbstractC89220m implements AbstractC89171a<TuxStatusView.C23263c> {

        /* renamed from: a */
        public static final C36702v f86690a = new C36702v();

        static {
            Covode.recordClassIndex(44039);
        }

        C36702v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView.C23263c invoke() {
            return C79440a.m138170b(new TuxStatusView.C23263c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$w */
    static final class C36703w extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86691a;

        static {
            Covode.recordClassIndex(44040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36703w(C36676e eVar) {
            super(0);
            this.f86691a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f86691a.mo20528t().findViewById(R.id.djc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$a */
    public static final class C36677a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86671a;

        static {
            Covode.recordClassIndex(44014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36677a(AbstractC89277c cVar) {
            super(0);
            this.f86671a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86671a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$b */
    public static final class C36682b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86676a;

        static {
            Covode.recordClassIndex(44019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36682b(AbstractC12748a aVar) {
            super(0);
            this.f86676a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86676a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$c */
    public static final class C36683c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86677a;

        static {
            Covode.recordClassIndex(44020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36683c(AbstractC12748a aVar) {
            super(0);
            this.f86677a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86677a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$o */
    public static final class C36695o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86685a;

        static {
            Covode.recordClassIndex(44032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36695o(AbstractC12748a aVar) {
            super(0);
            this.f86685a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86685a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$p */
    public static final class C36696p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86686a;

        static {
            Covode.recordClassIndex(44033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36696p(AbstractC12748a aVar) {
            super(0);
            this.f86686a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86686a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$r */
    public static final class C36698r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86687a;

        static {
            Covode.recordClassIndex(44035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36698r(AbstractC12748a aVar) {
            super(0);
            this.f86687a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86687a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$s */
    public static final class C36699s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86688a;

        static {
            Covode.recordClassIndex(44036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36699s(AbstractC12748a aVar) {
            super(0);
            this.f86688a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86688a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42319a = 5;
        cVar.f42320b = false;
        return cVar.mo28182a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$ab */
    static final class C36679ab extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86673a;

        static {
            Covode.recordClassIndex(44016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36679ab(C36676e eVar) {
            super(0);
            this.f86673a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f86673a.f86667k == EnumC36701u.LOCAL_EMPTY) {
                TuxStatusView a = C36676e.m74464a(this.f86673a);
                if (a != null) {
                    a.setVisibility(0);
                }
                TuxStatusView a2 = C36676e.m74464a(this.f86673a);
                if (a2 != null) {
                    a2.mo37867a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$e */
    public static final class C36685e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86678a;

        static {
            Covode.recordClassIndex(44022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36685e(AbstractC12748a aVar) {
            super(0);
            this.f86678a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86678a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$f */
    public static final class C36686f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86679a;

        static {
            Covode.recordClassIndex(44023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36686f(AbstractC12748a aVar) {
            super(0);
            this.f86679a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86679a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: z */
    public final void mo64307z() {
        TuxStatusView.C23263c cVar = (TuxStatusView.C23263c) this.f86668l.getValue();
        if (cVar != null) {
            TuxStatusView tuxStatusView = this.f86666j;
            if (tuxStatusView == null) {
                C89219l.m154710a("statusView");
            } else {
                tuxStatusView.setStatus(cVar);
            }
            TuxStatusView tuxStatusView2 = this.f86666j;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            } else {
                tuxStatusView2.setVisibility(0);
            }
        }
    }

    public C36676e() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoTagSearchListViewModel.class);
        C36677a aVar = new C36677a(a);
        C36692l lVar = C36692l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36694n.INSTANCE, new C36695o(this), new C36696p(this), C36697q.INSTANCE, lVar, new C36698r(this), new C36699s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36700t.INSTANCE, new C36682b(this), new C36683c(this), C36684d.INSTANCE, lVar, new C36685e(this), new C36686f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36687g.INSTANCE, new C36688h(this), new C36689i(this), new C36690j(this), lVar, new C36691k(this), new C36693m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86669m = bVar;
        this.f86670n = C89250i.m154773a((AbstractC89171a) new C36703w(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$x */
    public static final class C36704x extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C36676e f86692a;

        static {
            Covode.recordClassIndex(44041);
        }

        C36704x(C36676e eVar) {
            this.f86692a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            AbstractC36675d dVar = (AbstractC36675d) C12801d.m23025c(this.f86692a, C89204ab.m154669a(AbstractC36675d.class));
            if (dVar != null) {
                dVar.mo64305a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxStatusView m74464a(C36676e eVar) {
        TuxStatusView tuxStatusView = eVar.f86666j;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        return tuxStatusView;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$ac */
    static final class C36680ac extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86674a;

        static {
            Covode.recordClassIndex(44017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36680ac(C36676e eVar) {
            super(1);
            this.f86674a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            C36676e.m22977a(this.f86674a.mo23378v(), new AbstractC89172b<C36942c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a.C36676e.C36680ac.C366811 */

                /* renamed from: a */
                final /* synthetic */ C36680ac f86675a;

                static {
                    Covode.recordClassIndex(44018);
                }

                {
                    this.f86675a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C36942c cVar) {
                    C36942c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(cVar2);
                    if (b == null || b.isEmpty()) {
                        this.f86675a.f86674a.mo64307z();
                    } else {
                        TuxStatusView a = C36676e.m74464a(this.f86675a.f86674a);
                        if (a != null) {
                            a.setVisibility(8);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$y */
    static final class C36705y extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86693a;

        static {
            Covode.recordClassIndex(44042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36705y(C36676e eVar) {
            super(1);
            this.f86693a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            if (this.f86693a.f86667k == EnumC36701u.LOCAL_EMPTY) {
                this.f86693a.mo64307z();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        TuxStatusView tuxStatusView = (TuxStatusView) mo20528t().findViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        this.f86666j = tuxStatusView;
        PowerList w = mo23379w();
        w.mo28083a(SearchResultListCell.class, SectionCell.class);
        w.mo4405a(new C36704x(this));
        w.setItemAnimator(null);
        C12801d.m23021a(this, C89204ab.m154669a(AbstractC36675d.class), C36707f.f86695a, C36708g.f86696a, new C36706z(this));
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C36709h.f86697a, C12856l.m23100a(), new C36678aa(this), 4);
        AssemViewModel.m23030a(mo23378v(), C36710i.f86698a, null, new C36705y(this), new C36679ab(this), new C36680ac(this), 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$z */
    static final class C36706z extends AbstractC89220m implements AbstractC89183m<C12776a<? extends Boolean>, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86694a;

        static {
            Covode.recordClassIndex(44043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36706z(C36676e eVar) {
            super(2);
            this.f86694a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar, String str) {
            String str2 = str;
            C89219l.m154721d(aVar, "");
            PowerList w = this.f86694a.mo23379w();
            w.getState().mo28128a();
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                i = 4;
            }
            w.setVisibility(i);
            this.f86694a.f86667k = EnumC36701u.INIT;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$aa */
    static final class C36678aa extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C89378p<? extends List<? extends IMUser>, ? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36676e f86672a;

        static {
            Covode.recordClassIndex(44015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36678aa(C36676e eVar) {
            super(2);
            this.f86672a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C89378p<? extends List<? extends IMUser>, ? extends String> pVar2) {
            C89378p<? extends List<? extends IMUser>, ? extends String> pVar3 = pVar2;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(pVar3, "");
            List<IMUser> list = (List) pVar3.component1();
            String str = (String) pVar3.component2();
            C36676e eVar = this.f86672a;
            if (eVar.mo23379w().getVisibility() == 0) {
                if (list.isEmpty()) {
                    eVar.f86667k = EnumC36701u.LOCAL_EMPTY;
                    eVar.mo23378v().f86959l = C89086z.INSTANCE;
                } else {
                    eVar.f86667k = EnumC36701u.LOCAL_COMPLETE;
                    TuxStatusView tuxStatusView = eVar.f86666j;
                    if (tuxStatusView == null) {
                        C89219l.m154710a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                    VideoTagSearchListViewModel y = eVar.mo23378v();
                    C89219l.m154721d(list, "");
                    C89219l.m154721d(str, "");
                    y.f86959l = C89086z.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    String string = C17867d.m33078a().getString(R.string.byo);
                    C89219l.m154716b(string, "");
                    arrayList.add(new C36894k(string));
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (IMUser iMUser : list) {
                        arrayList2.add(new C36893j(iMUser, str));
                    }
                    arrayList.addAll(arrayList2);
                    y.f86959l = arrayList;
                    y.mo23340a((Collection) arrayList);
                }
                eVar.mo23378v().mo23342g();
            }
            return C89391z.f203057a;
        }
    }
}
