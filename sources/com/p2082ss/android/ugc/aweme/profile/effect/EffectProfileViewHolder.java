package com.p2082ss.android.ugc.aweme.profile.effect;

import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20717b;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50557v;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59217al;
import com.p2082ss.android.ugc.aweme.p2359ay.C34363c;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63499f;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder */
public final class EffectProfileViewHolder extends JediSimpleViewHolder<C75445g> implements AbstractC33974au {

    /* renamed from: f */
    public final boolean f144405f;

    /* renamed from: g */
    private final String f144406g = "EffectProfileViewHolder";

    /* renamed from: j */
    private final AbstractC89244h f144407j;

    static {
        Covode.recordClassIndex(75016);
    }

    /* renamed from: m */
    public final EffectProfileListViewModel mo63351m() {
        return (EffectProfileListViewModel) this.f144407j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$a */
    public static final class C63691a extends AbstractC89220m implements AbstractC89171a<EffectProfileListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f144408a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f144409b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f144410c;

        static {
            Covode.recordClassIndex(75017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63691a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f144408a = jediViewHolder;
            this.f144409b = cVar;
            this.f144410c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.C63691a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_profile_effect_EffectProfileViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m115229x4d628d99(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void ay_() {
        String str;
        int i;
        super.ay_();
        Aweme aweme = ((C75445g) aQ_()).relatedAweme;
        if (aweme != null) {
            if (this.f144405f) {
                str = "personal_homepage";
                i = 1000;
            } else {
                str = "others_homepage";
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            int i2 = i + 6;
            if (!C47039q.m90298a()) {
                C59217al c = new C59217al().mo96756a(str).mo96757c(aweme, i2);
                c.f134889q = "effect";
                c.mo96792f();
            }
            C63499f a = new C63499f().mo102134a(str);
            a.f144121p = aweme;
            a.f144116a = aweme.getAid();
            a.f144117b = AbstractC59233c.m108854c(aweme);
            a.f144120e = AbstractC59233c.m108852a(aweme, i2);
            a.f144119d = AbstractC59233c.m108855d(aweme);
            a.f144118c = AbstractC59233c.m108856e(aweme);
            C89219l.m154721d("effect", "");
            a.f144122q = "effect";
            a.mo96792f();
        }
    }

    /* renamed from: n */
    public final void mo70807n() {
        String str;
        String str2;
        C33744d dVar = new C33744d();
        if (this.f144405f) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C33744d a = dVar.mo59983a("enter_from", str).mo59983a("prop_id", ((C75445g) aQ_()).effectId).mo59983a("author_id", ((C75445g) aQ_()).ownerId);
        Aweme aweme = ((C75445g) aQ_()).relatedAweme;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        C39162r.m79460a("enter_prop_detail", a.mo59983a("group_id", str2).mo59983a("enter_method", "profile_tab_card").f79943a);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail").withParam("extra_sticker_from", "from_sticker_master_profile").withParam("extra_music_from", "from_sticker_master_profile");
        String[] strArr = new String[1];
        String str3 = ((C75445g) aQ_()).effectId;
        if (str3 == null) {
            C89219l.m154715b();
        }
        strArr[0] = str3;
        withParam.withParam("extra_stickers", C89070n.m154525d(strArr)).open();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$b */
    static final class View$OnClickListenerC63692b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectProfileViewHolder f144411a;

        static {
            Covode.recordClassIndex(75018);
        }

        View$OnClickListenerC63692b(EffectProfileViewHolder effectProfileViewHolder) {
            this.f144411a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144411a.mo70807n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$c */
    static final class View$OnClickListenerC63693c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectProfileViewHolder f144412a;

        static {
            Covode.recordClassIndex(75019);
        }

        View$OnClickListenerC63693c(EffectProfileViewHolder effectProfileViewHolder) {
            this.f144412a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144412a.mo70807n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$d */
    static final class View$OnClickListenerC63694d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectProfileViewHolder f144413a;

        static {
            Covode.recordClassIndex(75020);
        }

        View$OnClickListenerC63694d(EffectProfileViewHolder effectProfileViewHolder) {
            this.f144413a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144413a.mo70807n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$f */
    static final class View$OnClickListenerC63697f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectProfileViewHolder f144417a;

        static {
            Covode.recordClassIndex(75023);
        }

        View$OnClickListenerC63697f(EffectProfileViewHolder effectProfileViewHolder) {
            this.f144417a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144417a.mo70807n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$e */
    static final class View$OnClickListenerC63695e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectProfileViewHolder f144414a;

        /* renamed from: b */
        final /* synthetic */ C75445g f144415b;

        static {
            Covode.recordClassIndex(75021);
        }

        View$OnClickListenerC63695e(EffectProfileViewHolder effectProfileViewHolder, C75445g gVar) {
            this.f144414a = effectProfileViewHolder;
            this.f144415b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EffectProfileViewHolder effectProfileViewHolder = this.f144414a;
            effectProfileViewHolder.withState(effectProfileViewHolder.mo63351m(), new AbstractC89172b<EffectProfileState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.View$OnClickListenerC63695e.C636961 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC63695e f144416a;

                static {
                    Covode.recordClassIndex(75022);
                }

                {
                    this.f144416a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EffectProfileState effectProfileState) {
                    String str;
                    C89219l.m154721d(effectProfileState, "");
                    C50529ae.f116791b = this.f144416a.f144414a.mo63351m();
                    C50557v.f116847b = this.f144416a.f144414a.f144405f;
                    View view = this.f144416a.f144414a.itemView;
                    C89219l.m154716b(view, "");
                    SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://aweme/detail");
                    Aweme aweme = this.f144416a.f144415b.relatedAweme;
                    C89219l.m154716b(aweme, "");
                    SmartRoute withParam = buildRoute.withParam("id", aweme.getAid()).withParam("refer", "sticker_profile_detail").withParam("video_from", "from_sticker_master_profile");
                    if (this.f144416a.f144414a.f144405f) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    withParam.withParam("previous_page", str).withParam("tab_name", C80541ho.m139617a(6)).open();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C75445g gVar) {
        String str;
        C75445g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(gVar2.name);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.ajd);
        C89219l.m154716b(tuxTextView2, "");
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        tuxTextView2.setText(view3.getContext().getString(R.string.dbm, C53437b.m98615a(gVar2.userCount)));
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        ((TuxTextView) view4.findViewById(R.id.title)).setOnClickListener(new View$OnClickListenerC63692b(this));
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        ((SmartImageView) view5.findViewById(R.id.bh1)).setOnClickListener(new View$OnClickListenerC63693c(this));
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        ((SmartImageView) view6.findViewById(R.id.bhf)).setOnClickListener(new View$OnClickListenerC63694d(this));
        if (gVar2.relatedAweme != null) {
            this.itemView.setOnClickListener(new View$OnClickListenerC63695e(this, gVar2));
            C34363c cVar = C34363c.f81236a;
            View view7 = this.itemView;
            C89219l.m154716b(view7, "");
            SmartImageView smartImageView = (SmartImageView) view7.findViewById(R.id.afn);
            C89219l.m154716b(smartImageView, "");
            Aweme aweme = ((C75445g) aQ_()).relatedAweme;
            C89219l.m154716b(aweme, "");
            Video video = aweme.getVideo();
            C89219l.m154716b(video, "");
            if (C34363c.m70319a(cVar, smartImageView, video, this.f144406g, false, false, 120)) {
                View view8 = this.itemView;
                C89219l.m154716b(view8, "");
                ((SmartImageView) view8.findViewById(R.id.afn)).setAttached(true);
                View view9 = this.itemView;
                C89219l.m154716b(view9, "");
                ((SmartImageView) view9.findViewById(R.id.afn)).mo34197b();
            } else {
                Aweme aweme2 = ((C75445g) aQ_()).relatedAweme;
                C89219l.m154716b(aweme2, "");
                Video video2 = aweme2.getVideo();
                C89219l.m154716b(video2, "");
                C20766v a = C20761r.m39060a(C34735v.m70965a(video2.getCover()));
                View view10 = this.itemView;
                C89219l.m154716b(view10, "");
                a.f49092E = (SmartImageView) view10.findViewById(R.id.afn);
                a.mo34186c();
            }
            View view11 = this.itemView;
            C89219l.m154716b(view11, "");
            SmartImageView smartImageView2 = (SmartImageView) view11.findViewById(R.id.bh1);
            C89219l.m154716b(smartImageView2, "");
            smartImageView2.setVisibility(0);
            View view12 = this.itemView;
            C89219l.m154716b(view12, "");
            SmartImageView smartImageView3 = (SmartImageView) view12.findViewById(R.id.bhf);
            C89219l.m154716b(smartImageView3, "");
            smartImageView3.setVisibility(4);
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(gVar2.iconUrl));
            View view13 = this.itemView;
            C89219l.m154716b(view13, "");
            a2.f49092E = (SmartImageView) view13.findViewById(R.id.bh1);
            a2.mo34186c();
        } else {
            this.itemView.setOnClickListener(new View$OnClickListenerC63697f(this));
            C20766v a3 = C20761r.m39060a(C34735v.m70965a(gVar2.iconUrl));
            View view14 = this.itemView;
            C89219l.m154716b(view14, "");
            a3.f49092E = (SmartImageView) view14.findViewById(R.id.afn);
            a3.f49125v = EnumC20767w.CENTER_CROP;
            a3.f49127x = new C20717b(25);
            a3.mo34186c();
            View view15 = this.itemView;
            C89219l.m154716b(view15, "");
            SmartImageView smartImageView4 = (SmartImageView) view15.findViewById(R.id.bh1);
            C89219l.m154716b(smartImageView4, "");
            smartImageView4.setVisibility(4);
            View view16 = this.itemView;
            C89219l.m154716b(view16, "");
            SmartImageView smartImageView5 = (SmartImageView) view16.findViewById(R.id.bhf);
            C89219l.m154716b(smartImageView5, "");
            smartImageView5.setVisibility(0);
            C20766v a4 = C20761r.m39060a(C34735v.m70965a(gVar2.iconUrl));
            View view17 = this.itemView;
            C89219l.m154716b(view17, "");
            a4.f49092E = (SmartImageView) view17.findViewById(R.id.bhf);
            a4.mo34186c();
        }
        String str2 = gVar2.ownerId;
        String str3 = gVar2.f169545id;
        boolean z = this.f144405f;
        C33744d a5 = new C33744d().mo59983a("tab_name", "effect").mo59983a("author_id", str2).mo59983a("prop_id", str3);
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C39162r.m79460a("prop_card_show", a5.mo59983a("enter_from", str).f79943a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EffectProfileViewHolder(android.view.ViewGroup r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131560269(0x7f0d074d, float:1.8745906E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f144405f = r6
            java.lang.String r0 = "EffectProfileViewHolder"
            r4.f144406g = r0
            java.lang.Class<com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel> r0 = com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$a r0 = new com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f144407j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.<init>(android.view.ViewGroup, boolean):void");
    }
}
