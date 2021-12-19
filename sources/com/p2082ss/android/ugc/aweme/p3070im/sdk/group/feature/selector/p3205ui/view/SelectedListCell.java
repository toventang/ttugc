package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

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
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell */
public final class SelectedListCell extends PowerCell<C55597b> {

    /* renamed from: a */
    final C12814b f126817a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$g */
    public static final class C55587g extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55587g INSTANCE = new C55587g();

        static {
            Covode.recordClassIndex(65365);
        }

        public C55587g() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65358);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$b */
    public static final class C55582b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55582b INSTANCE = new C55582b();

        static {
            Covode.recordClassIndex(65360);
        }

        public C55582b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$c */
    public static final class C55583c extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55583c INSTANCE = new C55583c();

        static {
            Covode.recordClassIndex(65361);
        }

        public C55583c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$h */
    public static final class C55588h extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55588h INSTANCE = new C55588h();

        static {
            Covode.recordClassIndex(65366);
        }

        public C55588h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$k */
    public static final class C55591k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55591k INSTANCE = new C55591k();

        static {
            Covode.recordClassIndex(65369);
        }

        public C55591k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$l */
    public static final class C55592l extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55592l INSTANCE = new C55592l();

        static {
            Covode.recordClassIndex(65370);
        }

        public C55592l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$a */
    public static final class C55581a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126818a;

        static {
            Covode.recordClassIndex(65359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55581a(AbstractC89277c cVar) {
            super(0);
            this.f126818a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126818a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$d */
    public static final class C55584d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126819a;

        static {
            Covode.recordClassIndex(65362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55584d(PowerCell powerCell) {
            super(0);
            this.f126819a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f126819a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126819a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$e */
    public static final class C55585e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126820a;

        static {
            Covode.recordClassIndex(65363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55585e(PowerCell powerCell) {
            super(0);
            this.f126820a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f126820a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126820a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$f */
    public static final class C55586f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126821a;

        static {
            Covode.recordClassIndex(65364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55586f(PowerCell powerCell) {
            super(0);
            this.f126821a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f126821a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126821a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        View$OnClickListenerC55595o oVar = new View$OnClickListenerC55595o(this);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((CircleImageView) view.findViewById(R.id.a77)).setOnClickListener(oVar);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ((AvatarImageView) view2.findViewById(R.id.ob)).setOnClickListener(oVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$i */
    public static final class C55589i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126822a;

        static {
            Covode.recordClassIndex(65367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55589i(PowerCell powerCell) {
            super(0);
            this.f126822a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f126822a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f126822a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f126822a.itemView;
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
                View view4 = this.f126822a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$j */
    public static final class C55590j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126823a;

        static {
            Covode.recordClassIndex(65368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55590j(PowerCell powerCell) {
            super(0);
            this.f126823a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f126823a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f126823a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f126823a.itemView;
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
                View view4 = this.f126823a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$m */
    public static final class C55593m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126824a;

        static {
            Covode.recordClassIndex(65371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55593m(PowerCell powerCell) {
            super(0);
            this.f126824a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f126824a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f126824a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f126824a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$n */
    public static final class C55594n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126825a;

        static {
            Covode.recordClassIndex(65372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55594n(PowerCell powerCell) {
            super(0);
            this.f126825a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f126825a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f126825a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f126825a.mo28070i();
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

    public SelectedListCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55581a aVar = new C55581a(a);
        C55587g gVar = C55587g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55588h.INSTANCE, new C55589i(this), new C55590j(this), C55591k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55592l.INSTANCE, new C55593m(this), new C55594n(this), C55582b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55583c.INSTANCE, new C55584d(this), new C55585e(this), new C55586f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f126817a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell$o */
    static final class View$OnClickListenerC55595o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectedListCell f126826a;

        static {
            Covode.recordClassIndex(65373);
        }

        View$OnClickListenerC55595o(SelectedListCell selectedListCell) {
            this.f126826a = selectedListCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C55597b bVar = (C55597b) this.f126826a.f42160d;
            if (bVar != null) {
                ((ContactListViewModel) this.f126826a.f126817a.getValue()).mo92509a(bVar.f126828a, false);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a4z, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C55597b bVar) {
        C55597b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        View view = this.itemView;
        C34577e.m70592a((RemoteImageView) view.findViewById(R.id.ob), bVar2.f126828a.getDisplayAvatar());
        View findViewById = view.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById, "");
        ((TextView) findViewById).setText(bVar2.f126828a.getDisplayName());
    }
}
