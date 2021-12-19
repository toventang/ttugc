package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53110d;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
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
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell */
public final class StorySidebarListCell extends PowerCell<C53296l> implements View.OnClickListener, AbstractC20527q, IStoryPublishAnimateListener {

    /* renamed from: b */
    public static final int f122205b;

    /* renamed from: j */
    public static final int f122206j;

    /* renamed from: k */
    public static final int f122207k;

    /* renamed from: l */
    public static final C53196s f122208l = new C53196s((byte) 0);

    /* renamed from: a */
    public C53296l f122209a;

    /* renamed from: m */
    private final AbstractC89244h f122210m = C89250i.m154773a((AbstractC89171a) new C53202v(this));

    /* renamed from: n */
    private final C12642a f122211n;

    /* renamed from: o */
    private final AbstractC89244h f122212o;

    /* renamed from: p */
    private AnimatorSet f122213p;

    /* renamed from: q */
    private Context f122214q;

    /* renamed from: r */
    private final AbstractC89244h f122215r;

    /* renamed from: s */
    private final AbstractC89244h f122216s;

    /* renamed from: t */
    private final C12814b f122217t;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$g */
    public static final class C53184g extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {
        public static final C53184g INSTANCE = new C53184g();

        static {
            Covode.recordClassIndex(62733);
        }

        public C53184g() {
            super(1);
        }

        public final C53110d invoke(C53110d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$o */
    public static final class C53192o extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {
        public static final C53192o INSTANCE = new C53192o();

        static {
            Covode.recordClassIndex(62741);
        }

        public C53192o() {
            super(1);
        }

        public final C53297m invoke(C53297m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$x */
    static final class C53204x extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C53204x f122234a = new C53204x();

        static {
            Covode.recordClassIndex(62753);
        }

        C53204x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    /* renamed from: e */
    private final AbstractC76506d m98181e() {
        return (AbstractC76506d) this.f122212o.getValue();
    }

    /* renamed from: a */
    public final StoryBrandView mo89672a() {
        return (StoryBrandView) this.f122210m.getValue();
    }

    /* renamed from: b */
    public final StorySidebarListVM mo89675b() {
        return (StorySidebarListVM) this.f122211n.getValue();
    }

    /* renamed from: c */
    public final DrawerViewModel mo89676c() {
        return (DrawerViewModel) this.f122216s.getValue();
    }

    /* renamed from: d */
    public final StorySidebarFeedVM mo23351d() {
        return (StorySidebarFeedVM) this.f122217t.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$q */
    public static final class C53194q extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f122226a;

        static {
            Covode.recordClassIndex(62743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53194q(AbstractC1204m mVar) {
            super(0);
            this.f122226a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f122226a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$s */
    public static final class C53196s {
        static {
            Covode.recordClassIndex(62745);
        }

        private C53196s() {
        }

        public /* synthetic */ C53196s(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$b */
    public static final class C53179b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53179b INSTANCE = new C53179b();

        static {
            Covode.recordClassIndex(62728);
        }

        public C53179b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$c */
    public static final class C53180c extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53180c INSTANCE = new C53180c();

        static {
            Covode.recordClassIndex(62729);
        }

        public C53180c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$h */
    public static final class C53185h extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53185h INSTANCE = new C53185h();

        static {
            Covode.recordClassIndex(62734);
        }

        public C53185h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$k */
    public static final class C53188k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53188k INSTANCE = new C53188k();

        static {
            Covode.recordClassIndex(62737);
        }

        public C53188k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$l */
    public static final class C53189l extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53189l INSTANCE = new C53189l();

        static {
            Covode.recordClassIndex(62738);
        }

        public C53189l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$p */
    public static final class C53193p extends AbstractC89220m implements AbstractC89171a<C12874b<C53297m>> {
        public static final C53193p INSTANCE = new C53193p();

        static {
            Covode.recordClassIndex(62742);
        }

        public C53193p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53297m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$r */
    public static final class C53195r extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53195r INSTANCE = new C53195r();

        static {
            Covode.recordClassIndex(62744);
        }

        public C53195r() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateStart() {
        onAnimateUpdate(0.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (mo89675b().f122237n != null) {
            mo89675b().f122237n = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$a */
    public static final class C53178a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f122218a;

        static {
            Covode.recordClassIndex(62727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53178a(AbstractC89277c cVar) {
            super(0);
            this.f122218a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f122218a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$u */
    static final class C53199u extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarListCell f122229a;

        static {
            Covode.recordClassIndex(62748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53199u(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.f122229a = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76506d invoke() {
            AbstractC76506d a;
            AbstractC76504c d = C77260g.f173332a.mo120156d();
            if (d == null || (a = d.mo120228a(new AbstractC76508e(this) {
                /* class com.p2082ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell.C53199u.C532001 */

                /* renamed from: a */
                final /* synthetic */ C53199u f122230a;

                static {
                    Covode.recordClassIndex(62749);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: d */
                public final boolean mo80540d() {
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: c */
                public final EnumC76586o mo80539c() {
                    return EnumC76586o.WESTWINDOW;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: b */
                public final /* bridge */ /* synthetic */ AbstractC1204m mo80538b() {
                    return this.f122230a.f122229a;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final StoryBrandView mo80534a() {
                    return this.f122230a.f122229a.mo89672a();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f122230a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: a */
                public final void mo80536a(boolean z, EnumC79475a aVar) {
                    int i;
                    C89219l.m154721d(aVar, "");
                    View view = this.f122230a.f122229a.itemView;
                    C89219l.m154716b(view, "");
                    ImageView imageView = (ImageView) view.findViewById(R.id.bvi);
                    if (imageView != null) {
                        if (aVar == EnumC79475a.RED_RING) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        imageView.setVisibility(i);
                    }
                    if (!z) {
                        StorySidebarListVM b = this.f122230a.f122229a.mo89675b();
                        T t = this.f122230a.f122229a.f42160d;
                        if (t == null) {
                            C89219l.m154715b();
                        }
                        b.mo23336a((AbstractC17641a) t);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final void mo80535a(SmartRoute smartRoute, Aweme aweme) {
                    C89219l.m154721d(smartRoute, "");
                    C89219l.m154721d(aweme, "");
                    View view = this.f122230a.f122229a.itemView;
                    C89219l.m154716b(view, "");
                    C0576b b = C0576b.m2193b(view, view.getWidth(), view.getHeight());
                    C89219l.m154716b(b, "");
                    T t = this.f122230a.f122229a.f42160d;
                    if (t == null) {
                        C89219l.m154715b();
                    }
                    smartRoute.withParam("id", ((C53296l) t).f122331a.getAid()).withParam("story_req_id", this.f122230a.f122229a.mo23351d().f122083m.f122126c).withParam("impr_id", this.f122230a.f122229a.mo23351d().f122083m.f122126c).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
                /* renamed from: a */
                public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
                    Boolean bool;
                    C53296l lVar;
                    Aweme aweme;
                    User author;
                    String uid;
                    String str2;
                    C1213t<Boolean> tVar;
                    String str3 = "";
                    C89219l.m154721d(str, str3);
                    C89219l.m154721d(hashMap, str3);
                    DrawerViewModel c = this.f122230a.f122229a.mo89676c();
                    if (c == null || (tVar = c.f121918b) == null) {
                        bool = null;
                    } else {
                        bool = tVar.getValue();
                    }
                    if ((!C89219l.m154714a((Object) bool, (Object) true)) || (lVar = (C53296l) this.f122230a.f122229a.f42160d) == null || (aweme = lVar.f122331a) == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                        return false;
                    }
                    if (C89219l.m154714a((Object) str, (Object) "story_show")) {
                        if (this.f122230a.f122229a.mo89675b().f122238o.contains(uid)) {
                            return false;
                        }
                        this.f122230a.f122229a.mo89675b().f122238o.add(uid);
                    }
                    int adapterPosition = this.f122230a.f122229a.getAdapterPosition() + 1;
                    DrawerViewModel c2 = this.f122230a.f122229a.mo89676c();
                    if (!(c2 == null || (str2 = c2.f121924h) == null)) {
                        str3 = str2;
                    }
                    hashMap.put("num", String.valueOf(adapterPosition));
                    hashMap.put("enter_method", str3);
                    hashMap.put("enter_from", "westwindow");
                    hashMap.put("req_id", this.f122230a.f122229a.mo23351d().f122083m.f122126c);
                    return true;
                }
            })) == null) {
                return null;
            }
            a.mo120242a(new C53201a(this));
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$u$a */
        static final class C53201a extends AbstractC89220m implements AbstractC89172b<Aweme, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C53199u f122231a;

            static {
                Covode.recordClassIndex(62750);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C53201a(C53199u uVar) {
                super(1);
                this.f122231a = uVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Aweme aweme) {
                Aweme aweme2;
                Aweme aweme3 = aweme;
                if (C50545m.m94762a(aweme3)) {
                    C53296l lVar = this.f122231a.f122229a.f122209a;
                    if (lVar != null) {
                        aweme2 = lVar.f122331a;
                    } else {
                        aweme2 = null;
                    }
                    if (!(!C50545m.m94762a(aweme2) || this.f122231a.f122229a.getBindingAdapterPosition() == -1 || aweme3 == null)) {
                        StorySidebarListVM b = this.f122231a.f122229a.mo89675b();
                        int bindingAdapterPosition = this.f122231a.f122229a.getBindingAdapterPosition();
                        C53296l lVar2 = new C53296l(aweme3);
                        C89219l.m154719c(lVar2, "");
                        b.mo20667b((AbstractC89172b) new AssemListViewModel.C14507e(b, bindingAdapterPosition, lVar2));
                    }
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$v */
    static final class C53202v extends AbstractC89220m implements AbstractC89171a<StoryBrandView> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarListCell f122232a;

        static {
            Covode.recordClassIndex(62751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53202v(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.f122232a = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryBrandView invoke() {
            View view = this.f122232a.itemView;
            C89219l.m154716b(view, "");
            return view.findViewById(R.id.bz_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$w */
    static final class C53203w extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarListCell f122233a;

        static {
            Covode.recordClassIndex(62752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53203w(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.f122233a = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            View view = this.f122233a.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                return DrawerViewModel.C53032a.m97961a(eVar);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$d */
    public static final class C53181d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122219a;

        static {
            Covode.recordClassIndex(62730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53181d(PowerCell powerCell) {
            super(0);
            this.f122219a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f122219a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f122219a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$e */
    public static final class C53182e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122220a;

        static {
            Covode.recordClassIndex(62731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53182e(PowerCell powerCell) {
            super(0);
            this.f122220a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f122220a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f122220a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$f */
    public static final class C53183f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122221a;

        static {
            Covode.recordClassIndex(62732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53183f(PowerCell powerCell) {
            super(0);
            this.f122221a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f122221a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f122221a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$t */
    static final class C53197t extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarListCell f122227a;

        static {
            Covode.recordClassIndex(62746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53197t(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.f122227a = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ValueAnimator invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(C22971a.m43307c());
            ofFloat.addUpdateListener(new C53198a(this));
            return ofFloat;
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$t$a */
        static final class C53198a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C53197t f122228a;

            static {
                Covode.recordClassIndex(62747);
            }

            C53198a(C53197t tVar) {
                this.f122228a = tVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this.f122228a.f122227a.mo89673a(((Float) animatedValue).floatValue());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateFinish() {
        if (this.f122213p == null) {
            this.f122213p = new AnimatorSet();
        }
        AnimatorSet animatorSet = this.f122213p;
        if (animatorSet != null) {
            animatorSet.cancel();
            animatorSet.play((ValueAnimator) this.f122215r.getValue());
            animatorSet.start();
            C77283a.m135111b("StorySidebarListCell", "onAnimateFinish: start self avatar animation");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$i */
    public static final class C53186i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122222a;

        static {
            Covode.recordClassIndex(62735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53186i(PowerCell powerCell) {
            super(0);
            this.f122222a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f122222a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f122222a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f122222a.itemView;
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
                View view4 = this.f122222a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$j */
    public static final class C53187j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122223a;

        static {
            Covode.recordClassIndex(62736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53187j(PowerCell powerCell) {
            super(0);
            this.f122223a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f122223a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f122223a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f122223a.itemView;
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
                View view4 = this.f122223a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$m */
    public static final class C53190m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122224a;

        static {
            Covode.recordClassIndex(62739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53190m(PowerCell powerCell) {
            super(0);
            this.f122224a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f122224a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f122224a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f122224a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell$n */
    public static final class C53191n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f122225a;

        static {
            Covode.recordClassIndex(62740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53191n(PowerCell powerCell) {
            super(0);
            this.f122225a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f122225a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f122225a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f122225a.mo28070i();
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

    static {
        Covode.recordClassIndex(62726);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f122205b = C89241a.m154730a(TypedValue.applyDimension(1, 68.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        f122206j = C89241a.m154730a(TypedValue.applyDimension(1, 58.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        f122207k = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()));
    }

    public StorySidebarListCell() {
        C12814b bVar;
        C53204x xVar = C53204x.f122234a;
        this.f122211n = new C12642a(C89204ab.m154669a(StorySidebarListVM.class), xVar, C53193p.INSTANCE, new C53194q(this), C53195r.INSTANCE, C53192o.INSTANCE, null, null);
        this.f122212o = C89250i.m154773a((AbstractC89171a) new C53199u(this));
        this.f122215r = C89250i.m154773a((AbstractC89171a) new C53197t(this));
        this.f122216s = C89250i.m154773a((AbstractC89171a) new C53203w(this));
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(StorySidebarFeedVM.class);
        C53178a aVar2 = new C53178a(a);
        C53184g gVar = C53184g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C53185h.INSTANCE, new C53186i(this), new C53187j(this), C53188k.INSTANCE, gVar);
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C53189l.INSTANCE, new C53190m(this), new C53191n(this), C53179b.INSTANCE, gVar);
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C53180c.INSTANCE, new C53181d(this), new C53182e(this), new C53183f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f122217t = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        mo89672a().performClick();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        this.f122214q = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a3o, viewGroup, false);
        a.setOnClickListener(this);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateUpdate(float f) {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b3h);
        C89219l.m154716b(frameLayout, "");
        if (frameLayout.getAlpha() != 0.0f) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.b3h);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setAlpha(0.0f);
        }
    }

    /* renamed from: a */
    public final void mo89673a(float f) {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b3h);
        C89219l.m154716b(frameLayout, "");
        frameLayout.setAlpha(f);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        AvatarImageView avatarImageView = (AvatarImageView) view2.findViewById(R.id.bsr);
        C89219l.m154716b(avatarImageView, "");
        m98180a(avatarImageView, (int) (((float) f122206j) * f));
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        StoryBrandView storyBrandView = (StoryBrandView) view3.findViewById(R.id.bz_);
        C89219l.m154716b(storyBrandView, "");
        m98180a((View) storyBrandView, (int) (f * ((float) f122205b)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C53296l lVar) {
        String str;
        UrlModel urlModel;
        Aweme aweme;
        C53296l lVar2 = lVar;
        C89219l.m154721d(lVar2, "");
        if (!C89219l.m154714a(lVar2, this.f122209a)) {
            this.f122209a = lVar2;
            Aweme aweme2 = lVar2.f122331a;
            User author = aweme2.getAuthor();
            if (author == null || (str = author.getUid()) == null) {
                str = "";
            }
            String b = C63770ai.m139684b(aweme2.getAuthor());
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ((SimpleDraweeView) view.findViewById(R.id.bsr)).setActualImageResource(R.raw.icon_color_default_avatar);
            User author2 = aweme2.getAuthor();
            if (author2 != null) {
                urlModel = author2.getAvatarThumb();
            } else {
                urlModel = null;
            }
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.ezz);
            C89219l.m154716b(tuxTextView, "");
            UserStory userStory = aweme2.getUserStory();
            if (userStory != null) {
                aweme = UserStoryKt.currentStory(userStory);
            } else {
                aweme = null;
            }
            if (C76706a.m134280f(aweme)) {
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                b = view3.getContext().getString(R.string.g6o);
            } else if (C53031b.m97957a(str)) {
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                b = view4.getContext().getString(R.string.g6k);
            }
            tuxTextView.setText(b);
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            C34577e.m70592a((RemoteImageView) view5.findViewById(R.id.bsr), urlModel);
            AbstractC76506d e = m98181e();
            if (e != null) {
                T t = this.f42160d;
                if (t == null) {
                    C89219l.m154715b();
                }
                e.mo120240a(((C53296l) t).f122331a);
            }
            if (C53031b.m97957a(str)) {
                mo89675b().f122237n = this;
            } else {
                if (C89219l.m154714a(mo89675b().f122237n, this)) {
                    mo89675b().f122237n = null;
                }
                AnimatorSet animatorSet = this.f122213p;
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
            }
            mo89673a(1.0f);
            C77283a.m135111b("StorySidebarListCell", "onBind: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    public final void mo89674a(String str) {
        C89219l.m154721d(str, "");
        AbstractC76506d e = m98181e();
        if (e != null) {
            e.mo120243a(str);
        }
    }

    /* renamed from: a */
    private static void m98180a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
