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
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55062b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55597b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55618a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89376n;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell */
public class BaseContactListCell<T extends C55597b> extends PowerCell<T> implements AbstractC12846h {

    /* renamed from: a */
    public boolean f126799a;

    /* renamed from: b */
    public boolean f126800b;

    /* renamed from: j */
    private final C12814b f126801j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$g */
    public static final class C55568g extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55568g INSTANCE = new C55568g();

        static {
            Covode.recordClassIndex(65340);
        }

        public C55568g() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65333);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContactListViewModel mo92490a() {
        return (ContactListViewModel) this.f126801j.getValue();
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
    public final boolean mo92492a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        return mo92490a().mo92513a(iMUser);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$b */
    public static final class C55563b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55563b INSTANCE = new C55563b();

        static {
            Covode.recordClassIndex(65335);
        }

        public C55563b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$c */
    public static final class C55564c extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55564c INSTANCE = new C55564c();

        static {
            Covode.recordClassIndex(65336);
        }

        public C55564c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$h */
    public static final class C55569h extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55569h INSTANCE = new C55569h();

        static {
            Covode.recordClassIndex(65341);
        }

        public C55569h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$k */
    public static final class C55572k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55572k INSTANCE = new C55572k();

        static {
            Covode.recordClassIndex(65344);
        }

        public C55572k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$l */
    public static final class C55573l extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55573l INSTANCE = new C55573l();

        static {
            Covode.recordClassIndex(65345);
        }

        public C55573l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: b */
    public final void mo92493b() {
        if (!this.f126799a) {
            m101243c(mo92490a().mo92523n());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$a */
    public static final class C55562a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126802a;

        static {
            Covode.recordClassIndex(65334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55562a(AbstractC89277c cVar) {
            super(0);
            this.f126802a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126802a).getName();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        this.itemView.setOnClickListener(new View$OnClickListenerC55576o(this));
        AbstractC12818f.C12819a.m23063a(this, mo92490a(), C55596a.f126827a, C12856l.m23100a(), new C55577p(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$d */
    public static final class C55565d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126803a;

        static {
            Covode.recordClassIndex(65337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55565d(PowerCell powerCell) {
            super(0);
            this.f126803a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f126803a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126803a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$e */
    public static final class C55566e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126804a;

        static {
            Covode.recordClassIndex(65338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55566e(PowerCell powerCell) {
            super(0);
            this.f126804a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f126804a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126804a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$f */
    public static final class C55567f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126805a;

        static {
            Covode.recordClassIndex(65339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55567f(PowerCell powerCell) {
            super(0);
            this.f126805a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f126805a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f126805a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$i */
    public static final class C55570i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126806a;

        static {
            Covode.recordClassIndex(65342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55570i(PowerCell powerCell) {
            super(0);
            this.f126806a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f126806a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f126806a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f126806a.itemView;
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
                View view4 = this.f126806a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$j */
    public static final class C55571j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126807a;

        static {
            Covode.recordClassIndex(65343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55571j(PowerCell powerCell) {
            super(0);
            this.f126807a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f126807a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f126807a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f126807a.itemView;
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
                View view4 = this.f126807a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$m */
    public static final class C55574m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126808a;

        static {
            Covode.recordClassIndex(65346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55574m(PowerCell powerCell) {
            super(0);
            this.f126808a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f126808a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f126808a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f126808a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$n */
    public static final class C55575n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f126809a;

        static {
            Covode.recordClassIndex(65347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55575n(PowerCell powerCell) {
            super(0);
            this.f126809a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f126809a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f126809a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f126809a.mo28070i();
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

    public BaseContactListCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55562a aVar = new C55562a(a);
        C55568g gVar = C55568g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55569h.INSTANCE, new C55570i(this), new C55571j(this), C55572k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55573l.INSTANCE, new C55574m(this), new C55575n(this), C55563b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55564c.INSTANCE, new C55565d(this), new C55566e(this), new C55567f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f126801j = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92494b(boolean z) {
        this.f126800b = z;
        m101243c(z);
    }

    /* renamed from: c */
    private final void m101243c(boolean z) {
        float f;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a57, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo92495b(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        return mo92490a().mo92516b(iMUser);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$o */
    static final class View$OnClickListenerC55576o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseContactListCell f126810a;

        static {
            Covode.recordClassIndex(65348);
        }

        View$OnClickListenerC55576o(BaseContactListCell baseContactListCell) {
            this.f126810a = baseContactListCell;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            int a;
            ClickAgent.onClick(view);
            if (this.f126810a.f42160d != null && !this.f126810a.f126800b) {
                if (this.f126810a.f126799a || !this.f126810a.mo92490a().mo92523n()) {
                    C55597b bVar = (C55597b) this.f126810a.f42160d;
                    if (bVar != null && (iMUser = bVar.f126828a) != null) {
                        this.f126810a.mo92490a().mo92509a(iMUser, true ^ this.f126810a.f126799a);
                        return;
                    }
                    return;
                }
                View view2 = this.f126810a.itemView;
                C89219l.m154716b(view2, "");
                C23144b bVar2 = new C23144b(view2);
                ContactListViewModel a2 = this.f126810a.mo92490a();
                int i = C55618a.f126867b[a2.mo23342g().getEntry().ordinal()];
                if (i == 1) {
                    C19638h h = a2.mo23343h();
                    if (h != null) {
                        a = C55080c.m100733d(h);
                    } else {
                        a = C55062b.m100702a();
                    }
                } else if (i == 2) {
                    a = C55062b.m100702a();
                } else {
                    throw new C89376n();
                }
                bVar2.mo37635a(C55339a.m101147a(a)).mo37637b();
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
        C34577e.m70592a((RemoteImageView) view2.findViewById(R.id.on), t.f126828a.getDisplayAvatar());
        View findViewById = view2.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById, "");
        ((TextView) findViewById).setText(t.f126828a.getDisplayName());
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.akb);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(t.f126828a.getUniqueId());
        mo64272a(mo92492a(t.f126828a));
        mo92494b(mo92495b(t.f126828a));
        mo92493b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64272a(boolean z) {
        if (this.f126799a != z) {
            this.f126799a = z;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.acb);
            C89219l.m154716b(tuxCheckBox, "");
            tuxCheckBox.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell$p */
    static final class C55577p extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseContactListCell f126811a;

        static {
            Covode.recordClassIndex(65349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55577p(BaseContactListCell baseContactListCell) {
            super(2);
            this.f126811a = baseContactListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends IMUser> aVar) {
            T t;
            IMUser iMUser;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (!(this.f126811a.f42160d == null || aVar2 == null || (t = aVar2.f31085a) == null)) {
                C55597b bVar = (C55597b) this.f126811a.f42160d;
                if (bVar != null) {
                    iMUser = bVar.f126828a;
                } else {
                    iMUser = null;
                }
                if (C89219l.m154714a((Object) iMUser, (Object) t)) {
                    BaseContactListCell baseContactListCell = this.f126811a;
                    baseContactListCell.mo64272a(baseContactListCell.mo92492a((IMUser) t));
                    BaseContactListCell baseContactListCell2 = this.f126811a;
                    baseContactListCell2.mo92494b(baseContactListCell2.mo92495b(t));
                }
                this.f126811a.mo92493b();
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
