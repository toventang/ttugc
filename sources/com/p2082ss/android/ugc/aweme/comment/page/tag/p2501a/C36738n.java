package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.AbstractC36857g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.EnumC36856f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.EnumC36941b;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
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

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n */
public final class C36738n extends AbstractC12769a {

    /* renamed from: l */
    public static final C36760s f86721l = new C36760s((byte) 0);

    /* renamed from: j */
    public View f86722j;

    /* renamed from: k */
    TuxButton f86723k;

    /* renamed from: m */
    private final C12814b f86724m;

    /* renamed from: n */
    private final C12786i f86725n;

    /* renamed from: o */
    private final AbstractC89244h f86726o;

    /* renamed from: p */
    private String f86727p;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$j */
    public static final class C36751j extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36751j INSTANCE = new C36751j();

        static {
            Covode.recordClassIndex(44088);
        }

        public C36751j() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44075);
    }

    /* renamed from: v */
    public final VideoTagFriendsListViewModel mo64313v() {
        return (VideoTagFriendsListViewModel) this.f86724m.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo64315x() {
        return ((Boolean) this.f86726o.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$g */
    public static final class C36748g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86736a;

        static {
            Covode.recordClassIndex(44085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36748g(AbstractC12748a aVar) {
            super(0);
            this.f86736a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86736a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$s */
    public static final class C36760s {
        static {
            Covode.recordClassIndex(44097);
        }

        private C36760s() {
        }

        public /* synthetic */ C36760s(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$f */
    public static final class C36747f extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36747f INSTANCE = new C36747f();

        static {
            Covode.recordClassIndex(44084);
        }

        public C36747f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$h */
    public static final class C36749h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86737a;

        static {
            Covode.recordClassIndex(44086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36749h(AbstractC12748a aVar) {
            super(0);
            this.f86737a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86737a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$l */
    public static final class C36753l extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36753l INSTANCE = new C36753l();

        static {
            Covode.recordClassIndex(44090);
        }

        public C36753l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$q */
    public static final class C36758q extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36758q INSTANCE = new C36758q();

        static {
            Covode.recordClassIndex(44095);
        }

        public C36758q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$ac */
    static final class C36742ac extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86731a;

        static {
            Covode.recordClassIndex(44079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36742ac(C36738n nVar) {
            super(0);
            this.f86731a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f86731a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$i */
    public static final class C36750i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86738a;

        static {
            Covode.recordClassIndex(44087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36750i(AbstractC12748a aVar) {
            super(0);
            this.f86738a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86738a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$k */
    public static final class C36752k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86739a;

        static {
            Covode.recordClassIndex(44089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36752k(AbstractC12748a aVar) {
            super(0);
            this.f86739a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86739a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$a */
    public static final class C36739a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86728a;

        static {
            Covode.recordClassIndex(44076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36739a(AbstractC89277c cVar) {
            super(0);
            this.f86728a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86728a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$b */
    public static final class C36743b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86732a;

        static {
            Covode.recordClassIndex(44080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36743b(AbstractC12748a aVar) {
            super(0);
            this.f86732a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86732a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$c */
    public static final class C36744c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86733a;

        static {
            Covode.recordClassIndex(44081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36744c(AbstractC12748a aVar) {
            super(0);
            this.f86733a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86733a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$m */
    public static final class C36754m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86740a;

        static {
            Covode.recordClassIndex(44091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36754m(AbstractC12748a aVar) {
            super(0);
            this.f86740a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86740a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$n */
    public static final class C36755n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86741a;

        static {
            Covode.recordClassIndex(44092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36755n(AbstractC12748a aVar) {
            super(0);
            this.f86741a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86741a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$o */
    public static final class C36756o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86742a;

        static {
            Covode.recordClassIndex(44093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36756o(AbstractC12748a aVar) {
            super(0);
            this.f86742a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86742a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$p */
    public static final class C36757p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86743a;

        static {
            Covode.recordClassIndex(44094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36757p(AbstractC12748a aVar) {
            super(0);
            this.f86743a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86743a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$r */
    public static final class C36759r extends AbstractC89220m implements AbstractC89171a<VideoTagPage.C36641b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86744a;

        /* renamed from: b */
        final /* synthetic */ String f86745b;

        static {
            Covode.recordClassIndex(44096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36759r(AbstractC12748a aVar, String str) {
            super(0);
            this.f86744a = aVar;
            this.f86745b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f86744a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b> r1 = com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b.class
                java.lang.String r0 = r3.f86745b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a.C36738n.C36759r.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$t */
    static final class C36761t extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86746a;

        static {
            Covode.recordClassIndex(44098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36761t(C36738n nVar) {
            super(0);
            this.f86746a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f86746a.mo64314w().getTagged().isEmpty());
        }
    }

    /* renamed from: w */
    public final VideoTagPage.C36641b mo64314w() {
        VideoTagPage.C36641b bVar = (VideoTagPage.C36641b) this.f86725n.getValue();
        if (bVar == null) {
            return new VideoTagPage.C36641b(null, null, 0, null, 15, null);
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$ab */
    static final class RunnableC36741ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36738n f86730a;

        static {
            Covode.recordClassIndex(44078);
        }

        RunnableC36741ab(C36738n nVar) {
            this.f86730a = nVar;
        }

        public final void run() {
            int i;
            View view = this.f86730a.f86722j;
            if (view == null) {
                C89219l.m154710a("widget");
            }
            if (this.f86730a.mo64313v().mo64388i().size() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$d */
    public static final class C36745d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86734a;

        static {
            Covode.recordClassIndex(44082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36745d(AbstractC12748a aVar) {
            super(0);
            this.f86734a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86734a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$e */
    public static final class C36746e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86735a;

        static {
            Covode.recordClassIndex(44083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36746e(AbstractC12748a aVar) {
            super(0);
            this.f86735a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86735a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        VideoTagFriendsListViewModel v = mo64313v();
        String str = this.f86727p;
        C89219l.m154721d(str, "");
        C39162r.m79460a("close_tag_mention_page", new C33744d().mo59983a("previous_page", v.mo23342g().getEnterFrom()).mo59983a("close_type", str).mo59980a("tag_num", v.mo64388i().size()).mo59983a("function", "tag").f79943a);
        super.mo20527p();
    }

    public C36738n() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C36742ac acVar = new C36742ac(this);
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36739a aVar = new C36739a(a);
        C36751j jVar = C36751j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36753l.INSTANCE, new C36754m(this), new C36755n(this), acVar, jVar, new C36756o(this), new C36757p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36758q.INSTANCE, new C36743b(this), new C36744c(this), acVar, jVar, new C36745d(this), new C36746e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36747f.INSTANCE, new C36748g(this), new C36749h(this), acVar, jVar, new C36750i(this), new C36752k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86724m = bVar;
        this.f86725n = new C12786i(bW_(), new C36759r(this, null));
        this.f86726o = C89250i.m154773a((AbstractC89171a) new C36761t(this));
        this.f86727p = "click_close";
    }

    /* renamed from: y */
    public final void mo64316y() {
        this.f86727p = "click_done";
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            VideoTagFriendsListViewModel v = mo64313v();
            Intent intent = new Intent();
            boolean z = false;
            if (v.mo64388i().size() != v.mo23342g().getTagged().size()) {
                z = true;
            }
            List<IMUser> j = C89070n.m154590j(v.mo64388i());
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) j, 10));
            for (IMUser iMUser : j) {
                if (!z && !v.mo23342g().getTagged().contains(iMUser)) {
                    z = true;
                }
                arrayList.add(IMUser.toInteractionTagUserInfo(iMUser));
            }
            ArrayList arrayList2 = arrayList;
            if (z) {
                Aweme aweme = v.mo23342g().getAweme();
                if (aweme != null) {
                    InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
                    if (interactionTagInfo != null) {
                        interactionTagInfo.setTaggedUsers(arrayList2);
                    } else {
                        aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", arrayList2));
                    }
                    new InteractionTagInfoEvent(aweme).post();
                }
                intent.putExtra("tagged_user_list", new ArrayList(arrayList2));
                intent.putExtra("need_update", z);
            }
            b.setResult(-1, intent);
            b.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$aa */
    static final class C36740aa extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86729a;

        static {
            Covode.recordClassIndex(44077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36740aa(C36738n nVar) {
            super(1);
            this.f86729a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            this.f86729a.mo64312a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$v */
    static final class C36763v extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86748a;

        static {
            Covode.recordClassIndex(44100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36763v(C36738n nVar) {
            super(1);
            this.f86748a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f86748a, C367641.f86749a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo64312a(boolean z) {
        TuxButton tuxButton = this.f86723k;
        if (tuxButton == null) {
            C89219l.m154710a("button");
        }
        tuxButton.setLoading(z);
        mo64313v().f86916k = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$z */
    static final class C36768z extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86755a;

        static {
            Covode.recordClassIndex(44105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36768z(C36738n nVar) {
            super(1);
            this.f86755a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a((Object) this.f86755a.mo64314w().getEnterFrom(), (Object) "video_post_page")) {
                this.f86755a.mo64313v().mo64391l();
            } else {
                this.f86755a.mo64316y();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        VideoTagFriendsListViewModel v;
        C89219l.m154721d(view, "");
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            C12780d.m23007a(this, new C36763v(this));
            LinearLayout linearLayout = (LinearLayout) mo20528t().findViewById(R.id.v7);
            C89219l.m154716b(linearLayout, "");
            this.f86722j = linearLayout;
            TuxButton tuxButton = (TuxButton) mo20528t().findViewById(R.id.ano);
            tuxButton.setOnClickListener(new View$OnClickListenerC36762u(this));
            C89219l.m154716b(tuxButton, "");
            this.f86723k = tuxButton;
            if (mo64315x()) {
                View view2 = this.f86722j;
                if (view2 == null) {
                    C89219l.m154710a("widget");
                }
                view2.setVisibility(0);
            }
            mo20508a(v, C12856l.m23102a(mo64313v().f31149c), null, new C36765w(this));
            AbstractC12818f.C12819a.m23063a(this, mo64313v(), C36770p.f86757a, (C12854k) null, new C36766x(this, b), 6);
            AbstractC12818f.C12819a.m23063a(this, mo64313v(), C36771q.f86758a, (C12854k) null, new C36767y(this, b), 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$u */
    static final class View$OnClickListenerC36762u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36738n f86747a;

        static {
            Covode.recordClassIndex(44099);
        }

        View$OnClickListenerC36762u(C36738n nVar) {
            this.f86747a = nVar;
        }

        public final void onClick(View view) {
            long j;
            String aid;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 500)) {
                C36738n nVar = this.f86747a;
                if (!nVar.mo64313v().f86916k) {
                    nVar.mo64312a(true);
                    VideoTagFriendsListViewModel v = nVar.mo64313v();
                    if (v.mo64388i().isEmpty()) {
                        v.mo20662a(VideoTagFriendsListViewModel.C36913i.f86936a);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (v.mo23342g().getTagged().isEmpty()) {
                        Iterator<T> it = v.mo64388i().iterator();
                        while (it.hasNext()) {
                            String uid = it.next().getUid();
                            C89219l.m154716b(uid, "");
                            arrayList.add(uid);
                        }
                    } else {
                        for (T t : v.mo64388i()) {
                            if (!v.mo23342g().getTagged().contains(t) && !TextUtils.isEmpty(t.getUid())) {
                                String uid2 = t.getUid();
                                C89219l.m154716b(uid2, "");
                                arrayList.add(uid2);
                            }
                        }
                    }
                    boolean a = true ^ C89219l.m154714a((Object) v.mo23342g().getEnterFrom(), (Object) "video_post_page");
                    if (C13603b.m24435a((Collection) arrayList)) {
                        v.mo20662a(new VideoTagFriendsListViewModel.C36914j(a));
                        return;
                    }
                    AbstractC36857g a2 = v.f86921p.mo20458a();
                    String obj = arrayList.toString();
                    String str = "[" + EnumC36856f.VIDEO_TAG.getType() + ']';
                    Aweme aweme = v.mo23342g().getAweme();
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        j = 0;
                    } else {
                        j = Long.parseLong(aid);
                    }
                    AbstractC88412b a3 = a2.mo64356a(obj, str, a, j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new VideoTagFriendsListViewModel.C36915k(v, a), new VideoTagFriendsListViewModel.C36919l(v));
                    C89219l.m154716b(a3, "");
                    v.mo20659a(a3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$y */
    static final class C36767y extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86753a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f86754b;

        static {
            Covode.recordClassIndex(44104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36767y(C36738n nVar, ActivityC0945e eVar) {
            super(2);
            this.f86753a = nVar;
            this.f86754b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends String> aVar) {
            T t;
            C12776a<? extends String> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || !(!TextUtils.isEmpty(t)))) {
                this.f86753a.mo64312a(false);
                new C23144b(this.f86754b).mo37635a(t).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$w */
    static final class C36765w extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C36943d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86750a;

        static {
            Covode.recordClassIndex(44102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36765w(C36738n nVar) {
            super(2);
            this.f86750a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C36943d dVar) {
            String string;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(dVar, "");
            C36738n nVar = this.f86750a;
            if (!nVar.mo64315x()) {
                View view = nVar.f86722j;
                if (view == null) {
                    C89219l.m154710a("widget");
                }
                view.postDelayed(new RunnableC36741ab(nVar), 50);
            }
            TuxButton tuxButton = nVar.f86723k;
            if (tuxButton == null) {
                C89219l.m154710a("button");
            }
            if (!tuxButton.f54417a) {
                TuxButton tuxButton2 = nVar.f86723k;
                if (tuxButton2 == null) {
                    C89219l.m154710a("button");
                }
                if (nVar.mo64313v().mo64388i().size() > 0) {
                    Context context = nVar.mo20528t().getContext();
                    C89219l.m154716b(context, "");
                    String string2 = context.getResources().getString(R.string.c7t, Integer.valueOf(nVar.mo64313v().mo64388i().size()));
                    C89219l.m154716b(string2, "");
                    string = C1764a.m5928a(string2, Arrays.copyOf(new Object[0], 0));
                    C89219l.m154716b(string, "");
                } else {
                    Context context2 = nVar.mo20528t().getContext();
                    C89219l.m154716b(context2, "");
                    string = context2.getResources().getString(R.string.g_5);
                }
                tuxButton2.setText(string);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$x */
    static final class C36766x extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends EnumC36941b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36738n f86751a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f86752b;

        static {
            Covode.recordClassIndex(44103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36766x(C36738n nVar, ActivityC0945e eVar) {
            super(2);
            this.f86751a = nVar;
            this.f86752b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends EnumC36941b> aVar) {
            T t;
            C12776a<? extends EnumC36941b> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                int i = C36769o.f86756a[t.ordinal()];
                if (i == 1) {
                    this.f86751a.mo64312a(true);
                    this.f86751a.mo64313v().mo64391l();
                } else if (i == 2) {
                    C36738n nVar = this.f86751a;
                    Context az_ = nVar.az_();
                    if (az_ != null) {
                        C23025b bVar = new C23025b(az_);
                        bVar.mo37420c(R.string.g_6, new C36768z(nVar));
                        bVar.mo37418b(R.string.g_4, new C36740aa(nVar));
                        ((C23023b) ((C23023b) C23013a.C23015a.m43405a(az_).mo37479a(R.string.g_8).mo37483b(R.string.g_7)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                    }
                } else if (i == 3) {
                    this.f86751a.mo64316y();
                } else if (i == 4 || i == 5) {
                    this.f86751a.mo64312a(false);
                    new C23144b(this.f86752b).mo37640e(R.string.g__).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }
}
