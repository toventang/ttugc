package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36940a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36942c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.C89388w;
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
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w */
public final class C36801w extends AbstractC12769a implements AbstractC36675d {

    /* renamed from: j */
    final C12814b f86788j;

    /* renamed from: k */
    EditText f86789k;

    /* renamed from: l */
    public View f86790l;

    /* renamed from: m */
    public List<IMUser> f86791m;

    /* renamed from: n */
    private final C12814b f86792n;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$j */
    public static final class C36831j extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36831j INSTANCE = new C36831j();

        static {
            Covode.recordClassIndex(44168);
        }

        public C36831j() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$m */
    public static final class C36834m extends AbstractC89220m implements AbstractC89172b<C36942c, C36942c> {
        public static final C36834m INSTANCE = new C36834m();

        static {
            Covode.recordClassIndex(44171);
        }

        public C36834m() {
            super(1);
        }

        public final C36942c invoke(C36942c cVar) {
            C89219l.m154719c(cVar, "");
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(44138);
    }

    /* renamed from: v */
    private final VideoTagFriendsListViewModel m74487v() {
        return (VideoTagFriendsListViewModel) this.f86792n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ab */
    public static final class C36804ab extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86794a;

        static {
            Covode.recordClassIndex(44141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36804ab(AbstractC12748a aVar) {
            super(0);
            this.f86794a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86794a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ar */
    static final class C36821ar extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C36821ar f86810a = new C36821ar();

        static {
            Covode.recordClassIndex(44158);
        }

        C36821ar() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$g */
    public static final class C36828g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86816a;

        static {
            Covode.recordClassIndex(44165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36828g(AbstractC12748a aVar) {
            super(0);
            this.f86816a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86816a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$aa */
    public static final class C36803aa extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36803aa INSTANCE = new C36803aa();

        static {
            Covode.recordClassIndex(44140);
        }

        public C36803aa() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ac */
    public static final class C36805ac extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86795a;

        static {
            Covode.recordClassIndex(44142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36805ac(AbstractC12748a aVar) {
            super(0);
            this.f86795a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86795a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ad */
    public static final class C36806ad extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86796a;

        static {
            Covode.recordClassIndex(44143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36806ad(AbstractC12748a aVar) {
            super(0);
            this.f86796a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f86796a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ak */
    public static final class C36813ak extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36813ak INSTANCE = new C36813ak();

        static {
            Covode.recordClassIndex(44150);
        }

        public C36813ak() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ao */
    static final class C36818ao extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f86807a;

        static {
            Covode.recordClassIndex(44155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36818ao(ActivityC0945e eVar) {
            super(0);
            this.f86807a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f86807a.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$f */
    public static final class C36827f extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36827f INSTANCE = new C36827f();

        static {
            Covode.recordClassIndex(44164);
        }

        public C36827f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$h */
    public static final class C36829h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86817a;

        static {
            Covode.recordClassIndex(44166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36829h(AbstractC12748a aVar) {
            super(0);
            this.f86817a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86817a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$n */
    public static final class C36835n extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36835n INSTANCE = new C36835n();

        static {
            Covode.recordClassIndex(44172);
        }

        public C36835n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$q */
    public static final class C36838q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36838q INSTANCE = new C36838q();

        static {
            Covode.recordClassIndex(44175);
        }

        public C36838q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$t */
    public static final class C36841t extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36841t INSTANCE = new C36841t();

        static {
            Covode.recordClassIndex(44178);
        }

        public C36841t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$u */
    public static final class C36842u extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36842u INSTANCE = new C36842u();

        static {
            Covode.recordClassIndex(44179);
        }

        public C36842u() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$x */
    public static final class C36845x extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36845x INSTANCE = new C36845x();

        static {
            Covode.recordClassIndex(44182);
        }

        public C36845x() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ae */
    public static final class C36807ae extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86797a;

        static {
            Covode.recordClassIndex(44144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36807ae(AbstractC12748a aVar) {
            super(0);
            this.f86797a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86797a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ag */
    public static final class C36809ag extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86799a;

        static {
            Covode.recordClassIndex(44146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36809ag(AbstractC12748a aVar) {
            super(0);
            this.f86799a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86799a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$al */
    static final class C36814al extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C36801w f86803a;

        static {
            Covode.recordClassIndex(44151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36814al(C36801w wVar) {
            super(0);
            this.f86803a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f86803a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$i */
    public static final class C36830i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86818a;

        static {
            Covode.recordClassIndex(44167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36830i(AbstractC12748a aVar) {
            super(0);
            this.f86818a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86818a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$k */
    public static final class C36832k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86819a;

        static {
            Covode.recordClassIndex(44169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36832k(AbstractC12748a aVar) {
            super(0);
            this.f86819a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86819a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$a */
    public static final class C36802a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86793a;

        static {
            Covode.recordClassIndex(44139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36802a(AbstractC89277c cVar) {
            super(0);
            this.f86793a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86793a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$af */
    public static final class C36808af extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86798a;

        static {
            Covode.recordClassIndex(44145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36808af(AbstractC12748a aVar) {
            super(0);
            this.f86798a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86798a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ah */
    public static final class C36810ah extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86800a;

        static {
            Covode.recordClassIndex(44147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36810ah(AbstractC12748a aVar) {
            super(0);
            this.f86800a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86800a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ai */
    public static final class C36811ai extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86801a;

        static {
            Covode.recordClassIndex(44148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36811ai(AbstractC12748a aVar) {
            super(0);
            this.f86801a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86801a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$aj */
    public static final class C36812aj extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86802a;

        static {
            Covode.recordClassIndex(44149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36812aj(AbstractC12748a aVar) {
            super(0);
            this.f86802a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86802a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$b */
    public static final class C36823b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86812a;

        static {
            Covode.recordClassIndex(44160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36823b(AbstractC12748a aVar) {
            super(0);
            this.f86812a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86812a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$c */
    public static final class C36824c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86813a;

        static {
            Covode.recordClassIndex(44161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36824c(AbstractC12748a aVar) {
            super(0);
            this.f86813a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86813a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$l */
    public static final class C36833l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86820a;

        static {
            Covode.recordClassIndex(44170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36833l(AbstractC89277c cVar) {
            super(0);
            this.f86820a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86820a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$o */
    public static final class C36836o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86821a;

        static {
            Covode.recordClassIndex(44173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36836o(AbstractC12748a aVar) {
            super(0);
            this.f86821a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86821a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$p */
    public static final class C36837p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86822a;

        static {
            Covode.recordClassIndex(44174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36837p(AbstractC12748a aVar) {
            super(0);
            this.f86822a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86822a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$r */
    public static final class C36839r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86823a;

        static {
            Covode.recordClassIndex(44176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36839r(AbstractC12748a aVar) {
            super(0);
            this.f86823a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86823a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$s */
    public static final class C36840s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86824a;

        static {
            Covode.recordClassIndex(44177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36840s(AbstractC12748a aVar) {
            super(0);
            this.f86824a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86824a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$v */
    public static final class C36843v extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86825a;

        static {
            Covode.recordClassIndex(44180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36843v(AbstractC12748a aVar) {
            super(0);
            this.f86825a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86825a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$w */
    public static final class C36844w extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86826a;

        static {
            Covode.recordClassIndex(44181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36844w(AbstractC12748a aVar) {
            super(0);
            this.f86826a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86826a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a.AbstractC36675d
    /* renamed from: a */
    public final void mo64305a() {
        EditText editText = this.f86789k;
        if (editText == null) {
            C89219l.m154710a("searchEditText");
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.f86789k;
        if (editText2 == null) {
            C89219l.m154710a("searchEditText");
        }
        KeyboardUtils.m70897c(editText2);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C36674c mo20658e() {
        return new C36674c(null, new C12776a(false));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$d */
    public static final class C36825d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86814a;

        static {
            Covode.recordClassIndex(44162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36825d(AbstractC12748a aVar) {
            super(0);
            this.f86814a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86814a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$e */
    public static final class C36826e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86815a;

        static {
            Covode.recordClassIndex(44163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36826e(AbstractC12748a aVar) {
            super(0);
            this.f86815a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86815a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$y */
    public static final class C36846y extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86827a;

        static {
            Covode.recordClassIndex(44183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36846y(AbstractC12748a aVar) {
            super(0);
            this.f86827a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86827a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$z */
    public static final class C36847z extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86828a;

        static {
            Covode.recordClassIndex(44184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36847z(AbstractC12748a aVar) {
            super(0);
            this.f86828a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86828a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C36801w() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C36814al alVar = new C36814al(this);
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36802a aVar = new C36802a(a);
        C36831j jVar = C36831j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36842u.INSTANCE, new C36808af(this), new C36810ah(this), alVar, jVar, new C36811ai(this), new C36812aj(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36813ak.INSTANCE, new C36823b(this), new C36824c(this), alVar, jVar, new C36825d(this), new C36826e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36827f.INSTANCE, new C36828g(this), new C36829h(this), alVar, jVar, new C36830i(this), new C36832k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86792n = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a2 = C89204ab.m154669a(VideoTagSearchListViewModel.class);
        C36833l lVar = new C36833l(a2);
        C36834m mVar = C36834m.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, lVar, C36835n.INSTANCE, new C36836o(this), new C36837p(this), C36838q.INSTANCE, mVar, new C36839r(this), new C36840s(this));
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, lVar, C36841t.INSTANCE, new C36843v(this), new C36844w(this), C36845x.INSTANCE, mVar, new C36846y(this), new C36847z(this));
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, lVar, C36803aa.INSTANCE, new C36804ab(this), new C36805ac(this), new C36806ad(this), mVar, new C36807ae(this), new C36809ag(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86788j = bVar2;
        this.f86791m = new ArrayList();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$am */
    public static final class C36815am implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C36801w f86804a;

        static {
            Covode.recordClassIndex(44152);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C36815am(C36801w wVar) {
            this.f86804a = wVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                String obj = editable.toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                ((VideoTagSearchListViewModel) this.f86804a.f86788j.getValue()).mo64394a(C89361p.m154910b((CharSequence) obj).toString(), this.f86804a.f86791m);
            }
        }

        public final void onTextChanged(final CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            View view = this.f86804a.f86790l;
            if (view == null) {
                C89219l.m154710a("closeBtn");
            }
            if (charSequence == null || charSequence.length() == 0) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view.setVisibility(i4);
            C36801w wVar = this.f86804a;
            C368161 r5 = new AbstractC89172b<C36674c, C36674c>() {
                /* class com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a.C36801w.C36815am.C368161 */

                static {
                    Covode.recordClassIndex(44153);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C36674c invoke(C36674c cVar) {
                    String str;
                    C36674c cVar2 = cVar;
                    if (cVar2 == null) {
                        return null;
                    }
                    CharSequence charSequence = charSequence;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    return C36674c.m74462a(cVar2, str, null, 2);
                }
            };
            Class<C36801w> cls = C36801w.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar = wVar.bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar.mo20613a((Class) f, r5);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$as */
    static final class C36822as extends AbstractC89220m implements AbstractC89172b<C36674c, C36674c> {

        /* renamed from: a */
        public static final C36822as f86811a = new C36822as();

        static {
            Covode.recordClassIndex(44159);
        }

        C36822as() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36674c invoke(C36674c cVar) {
            C36674c cVar2 = cVar;
            if (cVar2 != null) {
                return C36674c.m74462a(cVar2, null, new C12776a(true), 1);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$an */
    static final class View$OnClickListenerC36817an implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36801w f86806a;

        static {
            Covode.recordClassIndex(44154);
        }

        View$OnClickListenerC36817an(C36801w wVar) {
            this.f86806a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36801w wVar = this.f86806a;
            View view2 = wVar.f86790l;
            if (view2 == null) {
                C89219l.m154710a("closeBtn");
            }
            view2.setVisibility(8);
            EditText editText = wVar.f86789k;
            if (editText == null) {
                C89219l.m154710a("searchEditText");
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            wVar.mo64305a();
            C36822as asVar = C36822as.f86811a;
            Class<C36801w> cls = C36801w.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar = wVar.bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar.mo20613a((Class) f, asVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        String str;
        C89219l.m154721d(view, "");
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) mo20528t().findViewById(R.id.eiz);
            TuxNavBar.C23179a a = new TuxNavBar.C23179a().mo37732a(new C23187b().mo37738a(R.raw.icon_x_mark).mo37741a((AbstractC89171a<C89391z>) new C36818ao(b)));
            C23194g gVar = new C23194g();
            Context az_ = az_();
            if (az_ == null || (str = az_.getString(R.string.g9w)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            tuxNavBar.setNavActions(a.mo37731a(gVar.mo37753a(str)));
            DmtEditText dmtEditText = (DmtEditText) mo20528t().findViewById(R.id.drm);
            dmtEditText.addTextChangedListener(new C36815am(this));
            C89219l.m154716b(dmtEditText, "");
            this.f86789k = dmtEditText;
            TuxIconView tuxIconView = (TuxIconView) mo20528t().findViewById(R.id.x7);
            tuxIconView.setOnClickListener(new View$OnClickListenerC36817an(this));
            C89219l.m154716b(tuxIconView, "");
            this.f86790l = tuxIconView;
            AbstractC12818f.C12819a.m23063a(this, m74487v(), C36848x.f86829a, C12856l.m23100a(), new C36819ap(this), 4);
            AbstractC12818f.C12819a.m23063a(this, m74487v(), C36849y.f86830a, C12856l.m23100a(), new C36820aq(this), 4);
            CommentServiceImpl.m73664e().mo63291a(b, true, (AbstractC89171a<C89391z>) C36821ar.f86810a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$aq */
    static final class C36820aq extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36801w f86809a;

        static {
            Covode.recordClassIndex(44157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36820aq(C36801w wVar) {
            super(2);
            this.f86809a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            C89219l.m154721d(pVar, "");
            this.f86809a.mo64305a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.w$ap */
    static final class C36819ap extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C36940a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36801w f86808a;

        static {
            Covode.recordClassIndex(44156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36819ap(C36801w wVar) {
            super(2);
            this.f86808a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends C36940a> aVar) {
            T t;
            C12776a<? extends C36940a> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f86808a.f86791m = C89070n.m154585g((Collection) t.f86979d);
            }
            return C89391z.f203057a;
        }
    }
}
