package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.C63677b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell */
public final class PronounCell extends PowerCell<C63661a> {

    /* renamed from: a */
    final C12814b f144337a;

    /* renamed from: b */
    public Context f144338b;

    /* renamed from: j */
    private TuxTextView f144339j;

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$g */
    public static final class C63652g extends AbstractC89220m implements AbstractC89172b<C63677b, C63677b> {
        public static final C63652g INSTANCE = new C63652g();

        static {
            Covode.recordClassIndex(74969);
        }

        public C63652g() {
            super(1);
        }

        public final C63677b invoke(C63677b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(74962);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$b */
    public static final class C63647b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63647b INSTANCE = new C63647b();

        static {
            Covode.recordClassIndex(74964);
        }

        public C63647b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$c */
    public static final class C63648c extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63648c INSTANCE = new C63648c();

        static {
            Covode.recordClassIndex(74965);
        }

        public C63648c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$h */
    public static final class C63653h extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63653h INSTANCE = new C63653h();

        static {
            Covode.recordClassIndex(74970);
        }

        public C63653h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$k */
    public static final class C63656k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63656k INSTANCE = new C63656k();

        static {
            Covode.recordClassIndex(74973);
        }

        public C63656k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$l */
    public static final class C63657l extends AbstractC89220m implements AbstractC89171a<C12874b<C63677b>> {
        public static final C63657l INSTANCE = new C63657l();

        static {
            Covode.recordClassIndex(74974);
        }

        public C63657l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63677b> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        this.itemView.setOnClickListener(new View$OnClickListenerC63660o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$a */
    public static final class C63646a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f144340a;

        static {
            Covode.recordClassIndex(74963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63646a(AbstractC89277c cVar) {
            super(0);
            this.f144340a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f144340a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$d */
    public static final class C63649d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144341a;

        static {
            Covode.recordClassIndex(74966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63649d(PowerCell powerCell) {
            super(0);
            this.f144341a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f144341a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144341a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$e */
    public static final class C63650e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144342a;

        static {
            Covode.recordClassIndex(74967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63650e(PowerCell powerCell) {
            super(0);
            this.f144342a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f144342a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144342a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$f */
    public static final class C63651f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144343a;

        static {
            Covode.recordClassIndex(74968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63651f(PowerCell powerCell) {
            super(0);
            this.f144343a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f144343a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144343a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$i */
    public static final class C63654i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144344a;

        static {
            Covode.recordClassIndex(74971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63654i(PowerCell powerCell) {
            super(0);
            this.f144344a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f144344a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f144344a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f144344a.itemView;
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
                View view4 = this.f144344a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$j */
    public static final class C63655j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144345a;

        static {
            Covode.recordClassIndex(74972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63655j(PowerCell powerCell) {
            super(0);
            this.f144345a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f144345a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f144345a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f144345a.itemView;
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
                View view4 = this.f144345a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$m */
    public static final class C63658m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144346a;

        static {
            Covode.recordClassIndex(74975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63658m(PowerCell powerCell) {
            super(0);
            this.f144346a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f144346a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f144346a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f144346a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$n */
    public static final class C63659n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144347a;

        static {
            Covode.recordClassIndex(74976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63659n(PowerCell powerCell) {
            super(0);
            this.f144347a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f144347a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f144347a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f144347a.mo28070i();
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

    public PronounCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ProfileEditPronounsSearchAndDisplayViewModel.class);
        C63646a aVar = new C63646a(a);
        C63652g gVar = C63652g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C63653h.INSTANCE, new C63654i(this), new C63655j(this), C63656k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C63657l.INSTANCE, new C63658m(this), new C63659n(this), C63647b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C63648c.INSTANCE, new C63649d(this), new C63650e(this), new C63651f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f144337a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C63661a aVar) {
        C63661a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        TuxTextView tuxTextView = this.f144339j;
        if (tuxTextView == null) {
            C89219l.m154710a("pronounTuxTuxTextView");
        }
        tuxTextView.setText(aVar2.f144349a);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        this.f144338b = context;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ape, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.d_v);
        C89219l.m154716b(findViewById, "");
        this.f144339j = (TuxTextView) findViewById;
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell$o */
    static final class View$OnClickListenerC63660o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PronounCell f144348a;

        static {
            Covode.recordClassIndex(74977);
        }

        View$OnClickListenerC63660o(PronounCell pronounCell) {
            this.f144348a = pronounCell;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel = (ProfileEditPronounsSearchAndDisplayViewModel) this.f144348a.f144337a.getValue();
            Context context = this.f144348a.f144338b;
            if (context == null) {
                C89219l.m154710a("parentContext");
            }
            C63661a aVar = (C63661a) this.f144348a.f42160d;
            if (aVar == null || (str = aVar.f144349a) == null) {
                str = "";
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str) && profileEditPronounsSearchAndDisplayViewModel.f144359j.length() < profileEditPronounsSearchAndDisplayViewModel.f144363n) {
                profileEditPronounsSearchAndDisplayViewModel.mo102251a(context, C89361p.m154915b(str, new String[]{"/"}));
                profileEditPronounsSearchAndDisplayViewModel.mo20667b(new ProfileEditPronounsSearchAndDisplayViewModel.C63669b(profileEditPronounsSearchAndDisplayViewModel));
            }
        }
    }
}
