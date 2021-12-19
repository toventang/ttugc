package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36544e;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36890g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36942c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.EnumC36946g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89036ab;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell */
public class BaseFriendsListCell<T extends C36890g> extends PowerCell<T> implements AbstractC12846h {

    /* renamed from: a */
    public boolean f86545a;

    /* renamed from: b */
    public EnumC36946g f86546b;

    /* renamed from: j */
    private final C12814b f86547j;

    /* renamed from: k */
    private final C12814b f86548k;

    /* renamed from: l */
    private final AbstractC89244h f86549l;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$h */
    public static final class C36565h extends AbstractC89220m implements AbstractC89172b<C36942c, C36942c> {
        public static final C36565h INSTANCE = new C36565h();

        static {
            Covode.recordClassIndex(43895);
        }

        public C36565h() {
            super(1);
        }

        public final C36942c invoke(C36942c cVar) {
            C89219l.m154719c(cVar, "");
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$l */
    public static final class C36569l extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36569l INSTANCE = new C36569l();

        static {
            Covode.recordClassIndex(43899);
        }

        public C36569l() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(43881);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final VideoTagFriendsListViewModel mo64270a() {
        return (VideoTagFriendsListViewModel) this.f86547j.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final VideoTagSearchListViewModel mo64274b() {
        return (VideoTagSearchListViewModel) this.f86548k.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo64273a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        return mo64270a().mo64386c(iMUser);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64272a(boolean z) {
        if (this.f86545a != z) {
            this.f86545a = z;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.b8x);
            C89219l.m154716b(tuxCheckBox, "");
            tuxCheckBox.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$af */
    static final class C36558af extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C36558af f86557a = new C36558af();

        static {
            Covode.recordClassIndex(43888);
        }

        C36558af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$b */
    public static final class C36559b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36559b INSTANCE = new C36559b();

        static {
            Covode.recordClassIndex(43889);
        }

        public C36559b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$c */
    public static final class C36560c extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36560c INSTANCE = new C36560c();

        static {
            Covode.recordClassIndex(43890);
        }

        public C36560c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$i */
    public static final class C36566i extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36566i INSTANCE = new C36566i();

        static {
            Covode.recordClassIndex(43896);
        }

        public C36566i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$m */
    public static final class C36570m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36570m INSTANCE = new C36570m();

        static {
            Covode.recordClassIndex(43900);
        }

        public C36570m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$n */
    public static final class C36571n extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36571n INSTANCE = new C36571n();

        static {
            Covode.recordClassIndex(43901);
        }

        public C36571n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$q */
    public static final class C36574q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36574q INSTANCE = new C36574q();

        static {
            Covode.recordClassIndex(43904);
        }

        public C36574q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$r */
    public static final class C36575r extends AbstractC89220m implements AbstractC89171a<C12874b<C36942c>> {
        public static final C36575r INSTANCE = new C36575r();

        static {
            Covode.recordClassIndex(43905);
        }

        public C36575r() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36942c> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$v */
    public static final class C36579v extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36579v INSTANCE = new C36579v();

        static {
            Covode.recordClassIndex(43909);
        }

        public C36579v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$y */
    public static final class C36582y extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36582y INSTANCE = new C36582y();

        static {
            Covode.recordClassIndex(43912);
        }

        public C36582y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$z */
    public static final class C36583z extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36583z INSTANCE = new C36583z();

        static {
            Covode.recordClassIndex(43913);
        }

        public C36583z() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$a */
    public static final class C36552a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86550a;

        static {
            Covode.recordClassIndex(43882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36552a(AbstractC89277c cVar) {
            super(0);
            this.f86550a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86550a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$g */
    public static final class C36564g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86561a;

        static {
            Covode.recordClassIndex(43894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36564g(AbstractC89277c cVar) {
            super(0);
            this.f86561a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86561a).getName();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        this.itemView.setOnClickListener(new View$OnClickListenerC36556ad(this));
        AbstractC12818f.C12819a.m23063a(this, mo64270a(), C36860b.f86847a, C12856l.m23100a(), new C36557ae(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$d */
    public static final class C36561d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86558a;

        static {
            Covode.recordClassIndex(43891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36561d(PowerCell powerCell) {
            super(0);
            this.f86558a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f86558a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86558a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$e */
    public static final class C36562e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86559a;

        static {
            Covode.recordClassIndex(43892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36562e(PowerCell powerCell) {
            super(0);
            this.f86559a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f86559a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86559a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$f */
    public static final class C36563f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86560a;

        static {
            Covode.recordClassIndex(43893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36563f(PowerCell powerCell) {
            super(0);
            this.f86560a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f86560a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86560a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$s */
    public static final class C36576s extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86566a;

        static {
            Covode.recordClassIndex(43906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36576s(PowerCell powerCell) {
            super(0);
            this.f86566a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f86566a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86566a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$t */
    public static final class C36577t extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86567a;

        static {
            Covode.recordClassIndex(43907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36577t(PowerCell powerCell) {
            super(0);
            this.f86567a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f86567a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86567a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$u */
    public static final class C36578u extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86568a;

        static {
            Covode.recordClassIndex(43908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36578u(PowerCell powerCell) {
            super(0);
            this.f86568a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f86568a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86568a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$aa */
    public static final class C36553aa extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86551a;

        static {
            Covode.recordClassIndex(43883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36553aa(PowerCell powerCell) {
            super(0);
            this.f86551a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f86551a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86551a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86551a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$ab */
    public static final class C36554ab extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86552a;

        static {
            Covode.recordClassIndex(43884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36554ab(PowerCell powerCell) {
            super(0);
            this.f86552a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f86552a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86552a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86552a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$j */
    public static final class C36567j extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86562a;

        static {
            Covode.recordClassIndex(43897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36567j(PowerCell powerCell) {
            super(0);
            this.f86562a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f86562a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86562a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f86562a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f86562a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$k */
    public static final class C36568k extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86563a;

        static {
            Covode.recordClassIndex(43898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36568k(PowerCell powerCell) {
            super(0);
            this.f86563a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f86563a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86563a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f86563a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f86563a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$o */
    public static final class C36572o extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86564a;

        static {
            Covode.recordClassIndex(43902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36572o(PowerCell powerCell) {
            super(0);
            this.f86564a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f86564a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86564a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86564a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$p */
    public static final class C36573p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86565a;

        static {
            Covode.recordClassIndex(43903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36573p(PowerCell powerCell) {
            super(0);
            this.f86565a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f86565a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86565a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86565a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$w */
    public static final class C36580w extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86569a;

        static {
            Covode.recordClassIndex(43910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36580w(PowerCell powerCell) {
            super(0);
            this.f86569a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f86569a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86569a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f86569a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f86569a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$x */
    public static final class C36581x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86570a;

        static {
            Covode.recordClassIndex(43911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36581x(PowerCell powerCell) {
            super(0);
            this.f86570a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f86570a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86570a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f86570a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f86570a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public BaseFriendsListCell() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36552a aVar = new C36552a(a);
        C36569l lVar = C36569l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36579v.INSTANCE, new C36580w(this), new C36581x(this), C36582y.INSTANCE, lVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36583z.INSTANCE, new C36553aa(this), new C36554ab(this), C36559b.INSTANCE, lVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36560c.INSTANCE, new C36561d(this), new C36562e(this), new C36563f(this), lVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f86547j = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a2 = C89204ab.m154669a(VideoTagSearchListViewModel.class);
        C36564g gVar = new C36564g(a2);
        C36565h hVar = C36565h.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, gVar, C36566i.INSTANCE, new C36567j(this), new C36568k(this), C36570m.INSTANCE, hVar);
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, gVar, C36571n.INSTANCE, new C36572o(this), new C36573p(this), C36574q.INSTANCE, hVar);
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, gVar, C36575r.INSTANCE, new C36576s(this), new C36577t(this), new C36578u(this), hVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar2 + " there");
        }
        this.f86548k = bVar2;
        this.f86549l = C89250i.m154773a((AbstractC89171a) C36558af.f86557a);
        this.f86546b = EnumC36946g.NONE;
    }

    /* renamed from: a */
    private void m74414a(EnumC36946g gVar) {
        boolean z;
        float f;
        C89219l.m154721d(gVar, "");
        this.f86546b = gVar;
        if (gVar != EnumC36946g.NONE) {
            z = true;
        } else {
            z = false;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    /* renamed from: c */
    private final boolean m74415c(IMUser iMUser) {
        if (mo64270a().mo23343h() == 1 || ((mo64270a().mo23343h() == 2 && iMUser.getFollowStatus() != 2) || (mo64270a().mo64389j() && iMUser.getFollowStatus() != 2 && iMUser.getFollowerStatus() != 1))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.j5, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public final void mo64275b(IMUser iMUser) {
        if (!this.f86545a) {
            if (iMUser.getVideoTagBlockStatus() != 3 && !mo64270a().f86917l.contains(iMUser.getUid())) {
                Set<String> set = mo64270a().f86918m.get(3);
                if (set == null) {
                    set = C89036ab.INSTANCE;
                }
                if (!set.contains(iMUser.getUid())) {
                    if (!(iMUser.getVideoTagBlockStatus() == 1 || iMUser.getVideoTagBlockStatus() == 2 || m74415c(iMUser))) {
                        Set<String> set2 = mo64270a().f86918m.get(1);
                        if (set2 == null) {
                            set2 = C89036ab.INSTANCE;
                        }
                        if (!set2.contains(iMUser.getUid())) {
                            Set<String> set3 = mo64270a().f86918m.get(2);
                            if (set3 == null) {
                                set3 = C89036ab.INSTANCE;
                            }
                            if (!set3.contains(iMUser.getUid())) {
                                if (mo64270a().mo64392m()) {
                                    m74414a(EnumC36946g.EXCEED_SIZE);
                                    return;
                                } else {
                                    m74414a(EnumC36946g.NONE);
                                    return;
                                }
                            }
                        }
                    }
                    m74414a(EnumC36946g.PRIVACY);
                    return;
                }
            }
            m74414a(EnumC36946g.SELF_REMOVE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$ac */
    public static final class View$OnAttachStateChangeListenerC36555ac implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ BaseFriendsListCell f86553a;

        /* renamed from: b */
        final /* synthetic */ C36890g f86554b;

        static {
            Covode.recordClassIndex(43885);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            String str;
            String str2;
            C36890g gVar = this.f86554b;
            String str3 = "";
            if (gVar instanceof C36893j) {
                VideoTagSearchListViewModel b = this.f86553a.mo64274b();
                IMUser iMUser = this.f86554b.f86884a;
                C89219l.m154721d(iMUser, str3);
                if (!b.f86961n.contains(iMUser.getUid())) {
                    Set<String> set = b.f86961n;
                    String uid = iMUser.getUid();
                    C89219l.m154716b(uid, str3);
                    set.add(uid);
                    C33744d a = new C33744d().mo59983a("previous_page", b.mo64395j().getEnterFrom()).mo59983a("to_user_id", iMUser.getUid());
                    if (b.f86958k.contains(iMUser)) {
                        str2 = "following";
                    } else {
                        str2 = "all_user";
                    }
                    C39162r.m79460a("tag_mention_head_show", a.mo59983a("user_type", str2).mo59983a("search_keyword", b.f86960m).mo59983a("function", "tag").f79943a);
                }
                C36892i iVar = ((C36893j) this.f86554b).f86892d;
                if (iVar != null) {
                    VideoTagSearchListViewModel b2 = this.f86553a.mo64274b();
                    String str4 = iVar.f86888a;
                    C67679e eVar = iVar.f86889b;
                    int absoluteAdapterPosition = this.f86553a.getAbsoluteAdapterPosition();
                    C89219l.m154721d(eVar, str3);
                    int size = (absoluteAdapterPosition - b2.f86959l.size()) - 1;
                    C33744d a2 = new C33744d().mo59983a("search_position", "tag_user").mo59983a("new_sug_session_id", C36544e.f86527a);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    C33744d a3 = a2.mo59983a("impr_id", str3).mo59983a("raw_query", b2.f86960m).mo59983a("sug_user_id", eVar.f151672g.getUserId()).mo59983a("user_tag", eVar.f151672g.getUserRelationType());
                    if (size < 0) {
                        size = 0;
                    }
                    C33744d a4 = a3.mo59980a("words_position", size);
                    Word word = eVar.f151671f;
                    String str5 = null;
                    if (word != null) {
                        str = word.getWordSource();
                    } else {
                        str = null;
                    }
                    C33744d a5 = a4.mo59983a("words_source", str);
                    Word word2 = eVar.f151671f;
                    if (word2 != null) {
                        str5 = word2.getId();
                    }
                    C39162r.m79460a("trending_words_show", a5.mo59983a("group_id", str5).f79943a);
                }
            } else if (gVar instanceof C36890g) {
                VideoTagFriendsListViewModel a6 = this.f86553a.mo64270a();
                IMUser iMUser2 = this.f86554b.f86884a;
                C89219l.m154721d(iMUser2, str3);
                if (!a6.f86920o.contains(iMUser2.getUid())) {
                    Set<String> set2 = a6.f86920o;
                    String uid2 = iMUser2.getUid();
                    C89219l.m154716b(uid2, str3);
                    set2.add(uid2);
                    C39162r.m79460a("tag_mention_head_show", new C33744d().mo59983a("previous_page", a6.mo23342g().getEnterFrom()).mo59983a("to_user_id", iMUser2.getUid()).mo59983a("user_type", a6.mo64387d(iMUser2)).mo59983a("search_keyword", str3).mo59983a("function", "tag").f79943a);
                }
            }
        }

        View$OnAttachStateChangeListenerC36555ac(BaseFriendsListCell baseFriendsListCell, C36890g gVar) {
            this.f86553a = baseFriendsListCell;
            this.f86554b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$ad */
    static final class View$OnClickListenerC36556ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseFriendsListCell f86555a;

        static {
            Covode.recordClassIndex(43886);
        }

        View$OnClickListenerC36556ad(BaseFriendsListCell baseFriendsListCell) {
            this.f86555a = baseFriendsListCell;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            String str;
            String str2;
            int i;
            ClickAgent.onClick(view);
            String str3 = "";
            if (this.f86555a.f86545a || this.f86555a.f86546b == EnumC36946g.NONE) {
                C36890g gVar = (C36890g) this.f86555a.f42160d;
                if (gVar != null && (iMUser = gVar.f86884a) != null) {
                    if (C80580in.m139681a(iMUser.getUid())) {
                        View view2 = this.f86555a.itemView;
                        C89219l.m154716b(view2, str3);
                        C23144b bVar = new C23144b(view2);
                        View view3 = this.f86555a.itemView;
                        C89219l.m154716b(view3, str3);
                        bVar.mo37635a(view3.getContext().getString(R.string.g_9)).mo37637b();
                        return;
                    }
                    this.f86555a.mo64270a().mo64384a(iMUser, !this.f86555a.f86545a);
                    String str4 = "choose";
                    if (this.f86555a.f42160d instanceof C36893j) {
                        VideoTagSearchListViewModel b = this.f86555a.mo64274b();
                        boolean z = !this.f86555a.f86545a;
                        C89219l.m154721d(iMUser, str3);
                        C33744d a = new C33744d().mo59983a("previous_page", b.mo64395j().getEnterFrom()).mo59983a("to_user_id", iMUser.getUid());
                        if (!z) {
                            str4 = "cancel_choose";
                        }
                        C33744d a2 = a.mo59983a("click_type", str4);
                        if (b.f86958k.contains(iMUser)) {
                            str = "following";
                        } else {
                            str = "all_user";
                        }
                        C39162r.m79460a("tag_mention_head_click", a2.mo59983a("user_type", str).mo59983a("search_keyword", b.f86960m).mo59983a("function", "tag").f79943a);
                        T t = this.f86555a.f42160d;
                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.page.tag.SearchResultItem");
                        C36892i iVar = ((C36893j) t).f86892d;
                        if (iVar != null) {
                            VideoTagSearchListViewModel b2 = this.f86555a.mo64274b();
                            String str5 = iVar.f86888a;
                            C67679e eVar = iVar.f86889b;
                            int absoluteAdapterPosition = this.f86555a.getAbsoluteAdapterPosition();
                            C89219l.m154721d(eVar, str3);
                            int size = (absoluteAdapterPosition - b2.f86959l.size()) - 1;
                            C33744d a3 = new C33744d().mo59983a("search_position", "tag_user").mo59983a("new_sug_session_id", C36544e.f86527a);
                            if (str5 != null) {
                                str3 = str5;
                            }
                            C33744d a4 = a3.mo59983a("impr_id", str3).mo59983a("raw_query", b2.f86960m).mo59983a("sug_user_id", eVar.f151672g.getUserId()).mo59983a("user_tag", eVar.f151672g.getUserRelationType());
                            if (size < 0) {
                                size = 0;
                            }
                            C33744d a5 = a4.mo59980a("words_position", size);
                            Word word = eVar.f151671f;
                            String str6 = null;
                            if (word != null) {
                                str2 = word.getWordSource();
                            } else {
                                str2 = null;
                            }
                            C33744d a6 = a5.mo59983a("words_source", str2);
                            Word word2 = eVar.f151671f;
                            if (word2 != null) {
                                str6 = word2.getId();
                            }
                            C39162r.m79460a("trending_words_click", a6.mo59983a("group_id", str6).f79943a);
                        }
                    } else if (this.f86555a.f42160d instanceof C36890g) {
                        VideoTagFriendsListViewModel a7 = this.f86555a.mo64270a();
                        if (this.f86555a.f86545a) {
                            str4 = "cancel_choose";
                        }
                        a7.mo64383a(iMUser, str4);
                    }
                }
            } else {
                View view4 = this.f86555a.itemView;
                C89219l.m154716b(view4, str3);
                C23144b bVar2 = new C23144b(view4);
                int i2 = C36651a.f86642a[this.f86555a.f86546b.ordinal()];
                if (i2 == 1) {
                    i = R.string.g_b;
                } else if (i2 == 2) {
                    i = R.string.d26;
                } else if (i2 != 3) {
                    i = R.string.g__;
                } else {
                    i = R.string.g_d;
                }
                bVar2.mo37640e(i).mo37637b();
            }
        }
    }

    /* renamed from: a */
    public void mo23350a(T t) {
        C89219l.m154721d(t, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setAlpha(1.0f);
        View view2 = this.itemView;
        C34577e.m70592a((RemoteImageView) view2.findViewById(R.id.on), t.f86884a.getDisplayAvatar());
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.cpq);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(mo64270a().mo64382a(t.f86884a));
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        C80581io.m139704a(view3.getContext(), t.f86884a.getCustomVerify(), t.f86884a.getEnterpriseVerifyReason(), (TextView) view2.findViewById(R.id.cpq));
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.akb);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(mo64270a().mo64385b(t.f86884a));
        if (!((ISearchUserService) this.f86549l.getValue()).mo106817a() || t.f86884a.getFollowStatus() != 2) {
            TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.dhj);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) view2.findViewById(R.id.dhj);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
        }
        view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC36555ac(this, t));
        mo64272a(mo64273a(t.f86884a));
        mo64275b(t.f86884a);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.BaseFriendsListCell$ae */
    static final class C36557ae extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseFriendsListCell f86556a;

        static {
            Covode.recordClassIndex(43887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36557ae(BaseFriendsListCell baseFriendsListCell) {
            super(2);
            this.f86556a = baseFriendsListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends IMUser> aVar) {
            T t;
            C36890g gVar;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || (gVar = (C36890g) this.f86556a.f42160d) == null)) {
                if (C89219l.m154714a((Object) gVar.f86884a, (Object) t)) {
                    BaseFriendsListCell baseFriendsListCell = this.f86556a;
                    baseFriendsListCell.mo64272a(baseFriendsListCell.mo64273a((IMUser) t));
                }
                this.f86556a.mo64275b(gVar.f86884a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
