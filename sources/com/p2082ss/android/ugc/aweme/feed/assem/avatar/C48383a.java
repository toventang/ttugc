package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39114d;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48391b;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48416i;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49497ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2483co.C36148b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a */
public final class C48383a extends AbstractC48491a<C48383a> {

    /* renamed from: u */
    public static final C48384a f112089u = new C48384a((byte) 0);

    /* renamed from: v */
    private final AbstractC89244h f112090v = C89250i.m154773a((AbstractC89171a) new C48385b(this));

    /* renamed from: w */
    private final AbstractC89244h f112091w = C89250i.m154773a((AbstractC89171a) new C48386c(this));

    /* renamed from: x */
    private final AbstractC89244h f112092x = C89250i.m154773a((AbstractC89171a) new C48390g(this));

    /* renamed from: y */
    private C36148b f112093y;

    /* renamed from: z */
    private SparseArray f112094z;

    static {
        Covode.recordClassIndex(57157);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.sk;
    }

    /* renamed from: G */
    public final C48391b mo80507G() {
        return (C48391b) this.f112090v.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112094z == null) {
            this.f112094z = new SparseArray();
        }
        View view = (View) this.f112094z.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112094z.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final C48416i mo80508I() {
        return (C48416i) this.f112091w.getValue();
    }

    /* renamed from: J */
    public final C48438o mo80509J() {
        return (C48438o) this.f112092x.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$a */
    public static final class C48384a {
        static {
            Covode.recordClassIndex(57158);
        }

        private C48384a() {
        }

        public /* synthetic */ C48384a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m91839a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            return C38701br.m78512a(aweme, 3);
        }

        /* renamed from: b */
        public static boolean m91840b(Aweme aweme) {
            if (aweme == null) {
                return false;
            }
            LiveOuterService.m107269s();
            if (C37699a.m76320y(aweme)) {
                return true;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isLive() || !C76657c.m134240a() || author.isBlock() || C80580in.m139687c()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$g */
    static final class C48390g extends AbstractC89220m implements AbstractC89171a<C48438o> {

        /* renamed from: a */
        final /* synthetic */ C48383a f112103a;

        static {
            Covode.recordClassIndex(57164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48390g(C48383a aVar) {
            super(0);
            this.f112103a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C48438o invoke() {
            return new C48438o(this.f112103a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$d */
    static final class RunnableC48387d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48383a f112097a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112098b;

        static {
            Covode.recordClassIndex(57161);
        }

        RunnableC48387d(C48383a aVar, VideoItemParams videoItemParams) {
            this.f112097a = aVar;
            this.f112098b = videoItemParams;
        }

        public final void run() {
            this.f112097a.mo80507G().mo80514a(this.f112098b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$e */
    static final class RunnableC48388e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48383a f112099a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112100b;

        static {
            Covode.recordClassIndex(57162);
        }

        RunnableC48388e(C48383a aVar, VideoItemParams videoItemParams) {
            this.f112099a = aVar;
            this.f112100b = videoItemParams;
        }

        public final void run() {
            this.f112099a.mo80508I().mo80526a(this.f112100b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$f */
    static final class RunnableC48389f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48383a f112101a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112102b;

        static {
            Covode.recordClassIndex(57163);
        }

        RunnableC48389f(C48383a aVar, VideoItemParams videoItemParams) {
            this.f112101a = aVar;
            this.f112102b = videoItemParams;
        }

        public final void run() {
            this.f112101a.mo80509J().mo80531a(this.f112102b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$b */
    static final class C48385b extends AbstractC89220m implements AbstractC89171a<C48391b> {

        /* renamed from: a */
        final /* synthetic */ C48383a f112095a;

        static {
            Covode.recordClassIndex(57159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48385b(C48383a aVar) {
            super(0);
            this.f112095a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C48391b invoke() {
            Context az_ = this.f112095a.az_();
            if (az_ == null) {
                C89219l.m154715b();
            }
            return new C48391b(az_, this.f112095a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$c */
    static final class C48386c extends AbstractC89220m implements AbstractC89171a<C48416i> {

        /* renamed from: a */
        final /* synthetic */ C48383a f112096a;

        static {
            Covode.recordClassIndex(57160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48386c(C48383a aVar) {
            super(0);
            this.f112096a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C48416i invoke() {
            Context az_ = this.f112096a.az_();
            if (az_ == null) {
                C89219l.m154715b();
            }
            return new C48416i(az_, this.f112096a);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: F */
    public final void mo20549F() {
        super.mo20549F();
        ProfileBadgeServiceImpl.m67562b().mo57240b(mo80507G().f112111h);
        mo80508I();
        mo80509J();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        C48391b G = mo80507G();
        AbstractC12818f.C12819a.m23063a(G, G.mo80516b(), C48410c.f112130a, (C12854k) null, new C48391b.C48403l(G), 6);
        AbstractC12818f.C12819a.m23063a(G, G.mo80516b(), C48411d.f112131a, (C12854k) null, new C48391b.C48404m(G), 6);
        mo80508I();
        mo80509J();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(videoItemParams2, "");
        C36148b bVar = this.f112093y;
        if (bVar != null) {
            bVar.mo63274b();
        }
        mo20546C().setVisibility(0);
        if (C48342a.f112042a) {
            C58254p.m105190a().post(new RunnableC48387d(this, videoItemParams2));
            C58254p.m105190a().post(new RunnableC48388e(this, videoItemParams2));
            C58254p.m105190a().post(new RunnableC48389f(this, videoItemParams2));
            return;
        }
        mo80507G().mo80514a(videoItemParams2);
        mo80508I().mo80526a(videoItemParams2);
        mo80509J().mo80531a(videoItemParams2);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        Aweme aweme;
        ViewGroup.LayoutParams layoutParams;
        C89219l.m154721d(view, "");
        mo20546C().setVisibility(8);
        C36148b bVar = new C36148b();
        this.f112093y = bVar;
        bVar.f85383a = mo20528t();
        bVar.f85384b = view;
        bVar.f85387e = view.findViewById(R.id.ob);
        bVar.f85388f = view.findViewById(R.id.f__);
        bVar.f85389g = mo20546C().findViewById(R.id.f_b);
        bVar.f85390h = view.findViewById(R.id.d9u);
        bVar.f85391i = mo20546C().findViewById(R.id.f_g);
        bVar.f85392j = view.findViewById(R.id.oc);
        bVar.f85385c = view.findViewById(R.id.b6j);
        bVar.f85386d = view.findViewById(R.id.b6a);
        bVar.f85393k = mo20546C().findViewById(R.id.fa_);
        C48391b G = mo80507G();
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.b6a);
        C89219l.m154716b(findViewById, "");
        G.f112105b = (AnimationImageView) findViewById;
        AnimationImageView animationImageView = G.f112105b;
        if (animationImageView == null) {
            C89219l.m154710a("followView");
        }
        animationImageView.setAnimation("common_feed_anim_follow_people.json");
        View findViewById2 = view.findViewById(R.id.b6j);
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        if (C49497ac.m92736a()) {
            C89219l.m154716b(viewGroup, "");
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (C56216k.m102131a()) {
            C89219l.m154716b(viewGroup, "");
            C39114d.m79408a(viewGroup, 8);
        }
        viewGroup.setOnClickListener(new C48391b.View$OnClickListenerC48405n(G));
        C89219l.m154716b(findViewById2, "");
        G.f112106c = viewGroup;
        View findViewById3 = view.findViewById(R.id.f__);
        SmartAvatarBorderView smartAvatarBorderView = (SmartAvatarBorderView) findViewById3;
        smartAvatarBorderView.setOnTouchListener(new View$OnTouchListenerC17271b());
        C89219l.m154716b(smartAvatarBorderView, "");
        ViewGroup.LayoutParams layoutParams3 = smartAvatarBorderView.getLayoutParams();
        if (layoutParams3 != null) {
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            } else {
                layoutParams = layoutParams3;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                marginLayoutParams.bottomMargin = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics()));
            }
        } else {
            layoutParams3 = null;
        }
        smartAvatarBorderView.setLayoutParams(layoutParams3);
        C89219l.m154716b(findViewById3, "");
        G.f112107d = smartAvatarBorderView;
        SmartAvatarBorderView smartAvatarBorderView2 = G.f112107d;
        if (smartAvatarBorderView2 == null) {
            C89219l.m154710a("avatarView");
        }
        smartAvatarBorderView2.setBorderColor(R.color.l);
        View findViewById4 = view.findViewById(R.id.d9u);
        C89219l.m154716b(findViewById4, "");
        G.f112108e = (SmartImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bvk);
        C89219l.m154716b(findViewById5, "");
        G.f112109f = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.oc);
        C89219l.m154716b(findViewById6, "");
        G.f112110g = (RemoteImageView) findViewById6;
        ProfileBadgeServiceImpl.m67562b().mo57238a(G.f112111h);
        AbstractC12818f.C12819a.m23063a(G, G.mo80513a(), C48412e.f112132a, (C12854k) null, new C48391b.C48406o(G), 6);
        AbstractC12818f.C12819a.m23063a(G, G.mo80513a(), C48413f.f112133a, (C12854k) null, new C48391b.C48408p(G), 6);
        AbstractC12818f.C12819a.m23063a(G, G.mo80513a(), C48414g.f112134a, (C12854k) null, new C48391b.C48409q(G), 6);
        C48416i I = mo80508I();
        C89219l.m154721d(view, "");
        View findViewById7 = view.findViewById(R.id.f__);
        C89219l.m154716b(findViewById7, "");
        I.f112137a = (SmartAvatarBorderView) findViewById7;
        View findViewById8 = view.findViewById(R.id.f_g);
        C89219l.m154716b(findViewById8, "");
        I.f112138b = (AvatarImageWithLive) findViewById8;
        AvatarImageWithLive avatarImageWithLive = I.f112138b;
        if (avatarImageWithLive == null) {
            C89219l.m154710a("avatarLiveView");
        }
        avatarImageWithLive.setBorderColor(R.color.ur);
        View findViewById9 = view.findViewById(R.id.f_b);
        C89219l.m154716b(findViewById9, "");
        I.f112139c = (LiveCircleView) findViewById9;
        AvatarImageWithLive avatarImageWithLive2 = I.f112138b;
        if (avatarImageWithLive2 == null) {
            C89219l.m154710a("avatarLiveView");
        }
        avatarImageWithLive2.setOnTouchListener(new View$OnTouchListenerC17271b());
        VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(I.f112144h);
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        boolean b = C48384a.m91840b(aweme);
        AvatarImageWithLive avatarImageWithLive3 = I.f112138b;
        if (avatarImageWithLive3 == null) {
            C89219l.m154710a("avatarLiveView");
        }
        SmartAvatarBorderView smartAvatarBorderView3 = I.f112137a;
        if (smartAvatarBorderView3 == null) {
            C89219l.m154710a("avatarView");
        }
        LiveCircleView liveCircleView = I.f112139c;
        if (liveCircleView == null) {
            C89219l.m154710a("avatarBorderView");
        }
        I.f112140d = new C50196d(b, avatarImageWithLive3, smartAvatarBorderView3, liveCircleView);
        AvatarImageWithLive avatarImageWithLive4 = I.f112138b;
        if (avatarImageWithLive4 == null) {
            C89219l.m154710a("avatarLiveView");
        }
        avatarImageWithLive4.setVisibility(8);
        LiveCircleView liveCircleView2 = I.f112139c;
        if (liveCircleView2 == null) {
            C89219l.m154710a("avatarBorderView");
        }
        liveCircleView2.setVisibility(8);
        AbstractC12818f.C12819a.m23063a(I, I.mo80525a(), C48433j.f112161a, (C12854k) null, new C48416i.C48428k(I), 6);
        AbstractC12818f.C12819a.m23063a(I, I.mo80525a(), C48434k.f112162a, (C12854k) null, new C48416i.C48430l(I), 6);
        AbstractC12818f.C12819a.m23063a(I, I.mo80525a(), C48435l.f112163a, (C12854k) null, new C48416i.C48431m(I), 6);
        AbstractC12818f.C12819a.m23063a(I, I.mo80527b(), C48436m.f112164a, (C12854k) null, new C48416i.C48432n(I), 6);
        AbstractC12818f.C12819a.m23063a(I, I.mo80527b(), C48437n.f112165a, (C12854k) null, new C48416i.C48427j(I), 6);
        C48438o J = mo80509J();
        C89219l.m154721d(view, "");
        View findViewById10 = J.f112171f.mo20546C().findViewById(R.id.fa_);
        C89219l.m154716b(findViewById10, "");
        J.f112167b = (StoryBrandView) findViewById10;
        View findViewById11 = J.f112171f.mo20546C().findViewById(R.id.f_g);
        C89219l.m154716b(findViewById11, "");
        J.f112168c = (AvatarImageWithLive) findViewById11;
        View findViewById12 = J.f112171f.mo20546C().findViewById(R.id.f_b);
        C89219l.m154716b(findViewById12, "");
        J.f112169d = (LiveCircleView) findViewById12;
        View findViewById13 = J.f112171f.mo20546C().findViewById(R.id.f__);
        C89219l.m154716b(findViewById13, "");
        J.f112166a = (SmartAvatarBorderView) findViewById13;
    }
}
