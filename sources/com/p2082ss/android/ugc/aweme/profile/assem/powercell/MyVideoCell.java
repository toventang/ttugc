package com.p2082ss.android.ugc.aweme.profile.assem.powercell;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.experiment.C46980gm;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63808i;
import com.p2082ss.android.ugc.aweme.profile.assem.p3566VM.C63443a;
import com.p2082ss.android.ugc.aweme.profile.assem.p3566VM.MyVideoListVM;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64347a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64382o;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell */
public final class MyVideoCell extends PowerCell<C63492a> {

    /* renamed from: a */
    public final String f144081a;

    /* renamed from: b */
    public final String f144082b;

    /* renamed from: j */
    public TuxRadio f144083j;

    /* renamed from: k */
    private final C12814b f144084k;

    /* renamed from: l */
    private final C63808i f144085l;

    /* renamed from: m */
    private TuxIconView f144086m;

    /* renamed from: n */
    private TuxTextView f144087n;

    /* renamed from: o */
    private TuxTextView f144088o;

    /* renamed from: p */
    private TuxIconView f144089p;

    /* renamed from: q */
    private ViewGroup f144090q;

    /* renamed from: r */
    private View f144091r;

    /* renamed from: s */
    private View f144092s;

    /* renamed from: t */
    private TextView f144093t;

    /* renamed from: u */
    private View f144094u;

    /* renamed from: v */
    private Drawable f144095v;

    /* renamed from: w */
    private SmartImageView f144096w;

    /* renamed from: x */
    private final AbstractC89244h f144097x;

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$g */
    public static final class C63480g extends AbstractC89220m implements AbstractC89172b<C63443a, C63443a> {
        public static final C63480g INSTANCE = new C63480g();

        static {
            Covode.recordClassIndex(74788);
        }

        public C63480g() {
            super(1);
        }

        public final C63443a invoke(C63443a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(74781);
    }

    /* renamed from: b */
    private final Context m115058b() {
        return (Context) this.f144097x.getValue();
    }

    /* renamed from: a */
    public final MyVideoListVM mo102127a() {
        return (MyVideoListVM) this.f144084k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$b */
    public static final class C63475b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63475b INSTANCE = new C63475b();

        static {
            Covode.recordClassIndex(74783);
        }

        public C63475b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$c */
    public static final class C63476c extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63476c INSTANCE = new C63476c();

        static {
            Covode.recordClassIndex(74784);
        }

        public C63476c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$h */
    public static final class C63481h extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63481h INSTANCE = new C63481h();

        static {
            Covode.recordClassIndex(74789);
        }

        public C63481h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$k */
    public static final class C63484k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63484k INSTANCE = new C63484k();

        static {
            Covode.recordClassIndex(74792);
        }

        public C63484k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$l */
    public static final class C63485l extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63485l INSTANCE = new C63485l();

        static {
            Covode.recordClassIndex(74793);
        }

        public C63485l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$o */
    static final class C63488o extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        final /* synthetic */ MyVideoCell f144106a;

        static {
            Covode.recordClassIndex(74796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63488o(MyVideoCell myVideoCell) {
            super(0);
            this.f144106a = myVideoCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Context invoke() {
            View view = this.f144106a.itemView;
            C89219l.m154716b(view, "");
            return view.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$a */
    public static final class C63474a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f144098a;

        static {
            Covode.recordClassIndex(74782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63474a(AbstractC89277c cVar) {
            super(0);
            this.f144098a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f144098a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$d */
    public static final class C63477d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144099a;

        static {
            Covode.recordClassIndex(74785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63477d(PowerCell powerCell) {
            super(0);
            this.f144099a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f144099a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144099a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$e */
    public static final class C63478e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144100a;

        static {
            Covode.recordClassIndex(74786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63478e(PowerCell powerCell) {
            super(0);
            this.f144100a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f144100a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144100a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$f */
    public static final class C63479f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144101a;

        static {
            Covode.recordClassIndex(74787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63479f(PowerCell powerCell) {
            super(0);
            this.f144101a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f144101a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f144101a.mo28070i();
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
        SmartImageView smartImageView = this.f144096w;
        if (smartImageView == null) {
            C89219l.m154710a("mCoverView");
        }
        smartImageView.setOnClickListener(new View$OnClickListenerC63489p(this));
        TuxRadio tuxRadio = this.f144083j;
        if (tuxRadio == null) {
            C89219l.m154710a("mCheckBox");
        }
        tuxRadio.setOnClickListener(new View$OnClickListenerC63490q(this));
        mo102127a().f144039m.observe(this, new C63491r(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$i */
    public static final class C63482i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144102a;

        static {
            Covode.recordClassIndex(74790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63482i(PowerCell powerCell) {
            super(0);
            this.f144102a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f144102a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f144102a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f144102a.itemView;
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
                View view4 = this.f144102a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$j */
    public static final class C63483j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144103a;

        static {
            Covode.recordClassIndex(74791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63483j(PowerCell powerCell) {
            super(0);
            this.f144103a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f144103a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f144103a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f144103a.itemView;
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
                View view4 = this.f144103a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$m */
    public static final class C63486m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144104a;

        static {
            Covode.recordClassIndex(74794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63486m(PowerCell powerCell) {
            super(0);
            this.f144104a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f144104a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f144104a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f144104a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$n */
    public static final class C63487n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f144105a;

        static {
            Covode.recordClassIndex(74795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63487n(PowerCell powerCell) {
            super(0);
            this.f144105a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f144105a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f144105a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f144105a.mo28070i();
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

    public MyVideoCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(MyVideoListVM.class);
        C63474a aVar = new C63474a(a);
        C63480g gVar = C63480g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C63481h.INSTANCE, new C63482i(this), new C63483j(this), C63484k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C63485l.INSTANCE, new C63486m(this), new C63487n(this), C63475b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C63476c.INSTANCE, new C63477d(this), new C63478e(this), new C63479f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f144084k = bVar;
        this.f144081a = "MyVideoCell";
        this.f144082b = "Preview my video";
        this.f144085l = new C63808i();
        this.f144097x = C89250i.m154773a((AbstractC89171a) new C63488o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$r */
    static final class C63491r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MyVideoCell f144109a;

        static {
            Covode.recordClassIndex(74799);
        }

        C63491r(MyVideoCell myVideoCell) {
            this.f144109a = myVideoCell;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C63492a> value = this.f144109a.mo102127a().f144039m.getValue();
            if (value == null) {
                value = C89086z.INSTANCE;
            }
            TuxRadio tuxRadio = this.f144109a.f144083j;
            if (tuxRadio == null) {
                C89219l.m154710a("mCheckBox");
            }
            tuxRadio.setChecked(C89070n.m154556a((Iterable) value, (Object) this.f144109a.f42160d));
        }
    }

    /* renamed from: a */
    private final void m115057a(Aweme aweme) {
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        if (video.getCover() != null) {
            UrlModel cover = video.getCover();
            C89219l.m154716b(cover, "");
            if (cover.getUrlList() != null) {
                UrlModel cover2 = video.getCover();
                C89219l.m154716b(cover2, "");
                if (cover2.getUrlList().size() != 0) {
                    UrlModel cover3 = video.getCover();
                    C89219l.m154716b(cover3, "");
                    if (!TextUtils.isEmpty(cover3.getUrlList().get(0))) {
                        UrlModel animatedCover = video.getAnimatedCover();
                        if (animatedCover == null) {
                            animatedCover = video.getCover();
                        }
                        m115056a(animatedCover, this.f144081a, aweme);
                        return;
                    }
                }
            }
        }
        SmartImageView smartImageView = this.f144096w;
        if (smartImageView == null) {
            C89219l.m154710a("mCoverView");
        }
        smartImageView.setImageResource(R.color.j);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$p */
    static final class View$OnClickListenerC63489p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyVideoCell f144107a;

        static {
            Covode.recordClassIndex(74797);
        }

        View$OnClickListenerC63489p(MyVideoCell myVideoCell) {
            this.f144107a = myVideoCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f144107a.f42160d != null) {
                MyVideoListVM a = this.f144107a.mo102127a();
                T t = this.f144107a.f42160d;
                if (t == null) {
                    C89219l.m154715b();
                }
                Aweme aweme = ((C63492a) t).f144110a;
                if (!C58001a.m104815a(view, 1200) && aweme != null) {
                    Fragment fragment = a.f144040n;
                    ActivityC0945e eVar = null;
                    if (fragment != null && fragment.getActivity() != null) {
                        Fragment fragment2 = a.f144040n;
                        if (fragment2 != null) {
                            fragment2.getActivity();
                        }
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = MyVideoListVM.m115031j();
                        }
                        if (!C58029j.f132256h) {
                            Fragment fragment3 = a.f144040n;
                            if (fragment3 != null) {
                                eVar = fragment3.getActivity();
                            }
                            new C79459a(eVar).mo123050a(R.string.dcq).mo123053a();
                            return;
                        }
                        if (a.f144040n != null && (a.f144040n instanceof C64382o)) {
                            Fragment fragment4 = a.f144040n;
                            Objects.requireNonNull(fragment4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.widget.SelectMyVideoFragment");
                            C64382o oVar = (C64382o) fragment4;
                            if (!(oVar == null || aweme.getAuthor() == null)) {
                                C64347a aVar = oVar.f145985d;
                                User author = aweme.getAuthor();
                                C89219l.m154716b(author, "");
                                String uniqueId = author.getUniqueId();
                                if (uniqueId == null) {
                                    User author2 = aweme.getAuthor();
                                    C89219l.m154716b(author2, "");
                                    uniqueId = author2.getShortId();
                                }
                                aVar.f145875a = uniqueId;
                                C64347a aVar2 = oVar.f145985d;
                                User author3 = aweme.getAuthor();
                                C89219l.m154716b(author3, "");
                                aVar2.f145876b = author3.getNickname();
                                oVar.f145985d.f145879e = aweme.getAid();
                                C64347a aVar3 = oVar.f145985d;
                                AwemeStatus status = aweme.getStatus();
                                C89219l.m154716b(status, "");
                                aVar3.f145880f = status.getPrivateStatus();
                                C64347a aVar4 = oVar.f145985d;
                                User author4 = aweme.getAuthor();
                                C89219l.m154716b(author4, "");
                                aVar4.f145881g = author4.isSecret() ? 1 : 0;
                            }
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("id", aweme.getAid());
                        bundle.putString("video_from", "from_publish_add_video");
                        bundle.putInt("video_type", 0);
                        bundle.putString("userid", a.f144037k);
                        bundle.putString("sec_userid", a.f144038l);
                        bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                        bundle.putString("enter_method", null);
                        bundle.putString("like_enter_method", null);
                        bundle.putString("content_source", null);
                        bundle.putString("refer", "personal_homepage");
                        bundle.putString("previous_page", null);
                        bundle.putString("from_group_id", null);
                        bundle.putString("extra_previous_page_position", null);
                        bundle.putString("tab_name", "output");
                        bundle.putString("enter_from_request_id", null);
                        bundle.putString("feeds_aweme_id", null);
                        bundle.putInt("from_post_list", 1);
                        SmartRouter.buildFragmentRoute(a.f144040n, "aweme://aweme/detail/").withParam(bundle).withParam("activity_has_activity_options", true).open(C64382o.f145980e);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell$q */
    static final class View$OnClickListenerC63490q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyVideoCell f144108a;

        static {
            Covode.recordClassIndex(74798);
        }

        View$OnClickListenerC63490q(MyVideoCell myVideoCell) {
            this.f144108a = myVideoCell;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T extends com.bytedance.ies.powerlist.b.a, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (r0 == null) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
            if (r0 == null) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
            if (r0 == null) goto L_0x00e0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell.View$OnClickListenerC63490q.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anh, viewGroup, false);
        View findViewById = a.findViewById(R.id.fd3);
        C89219l.m154716b(findViewById, "");
        this.f144086m = (TuxIconView) findViewById;
        View findViewById2 = a.findViewById(R.id.f18);
        C89219l.m154716b(findViewById2, "");
        this.f144087n = (TuxTextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.d_j);
        C89219l.m154716b(findViewById3, "");
        this.f144088o = (TuxTextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.fc0);
        C89219l.m154716b(findViewById4, "");
        this.f144089p = (TuxIconView) findViewById4;
        View findViewById5 = a.findViewById(R.id.fcx);
        C89219l.m154716b(findViewById5, "");
        this.f144090q = (ViewGroup) findViewById5;
        View findViewById6 = a.findViewById(R.id.cif);
        C89219l.m154716b(findViewById6, "");
        this.f144091r = findViewById6;
        View findViewById7 = a.findViewById(R.id.e67);
        C89219l.m154716b(findViewById7, "");
        this.f144092s = findViewById7;
        View findViewById8 = a.findViewById(R.id.e65);
        C89219l.m154716b(findViewById8, "");
        this.f144093t = (TextView) findViewById8;
        View findViewById9 = a.findViewById(R.id.fc9);
        C89219l.m154716b(findViewById9, "");
        this.f144094u = findViewById9;
        View findViewById10 = a.findViewById(R.id.afn);
        C89219l.m154716b(findViewById10, "");
        this.f144096w = (SmartImageView) findViewById10;
        View findViewById11 = a.findViewById(R.id.a4l);
        C89219l.m154716b(findViewById11, "");
        this.f144083j = (TuxRadio) findViewById11;
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b5  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23350a(com.p2082ss.android.ugc.aweme.profile.assem.powercell.C63492a r16) {
        /*
        // Method dump skipped, instructions count: 753
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell.mo23350a(com.bytedance.ies.powerlist.b.a):void");
    }

    /* renamed from: a */
    private static void m115055a(TextView textView, Drawable drawable) {
        if (textView != null) {
            int i = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: a */
    private final void m115056a(UrlModel urlModel, String str, Aweme aweme) {
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        int[] a2 = C80397em.m139369a(200);
        if (a2 != null) {
            a.mo34185b(a2);
        }
        SmartImageView smartImageView = this.f144096w;
        if (smartImageView == null) {
            C89219l.m154710a("mCoverView");
        }
        a.f49092E = smartImageView;
        a.mo34179a(str).mo34186c();
        if (aweme != null && aweme.getVideo() != null && !C46980gm.m90260a()) {
            aweme.getVideo().setCachedOuterCoverUrl(urlModel);
            aweme.getVideo().setCachedOuterCoverSize(a2);
        }
    }
}
