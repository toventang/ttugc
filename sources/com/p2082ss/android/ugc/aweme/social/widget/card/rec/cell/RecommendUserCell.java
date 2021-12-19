package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74777c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.p2082ss.android.ugc.aweme.social.widget.p3918a.C74744a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell */
public abstract class RecommendUserCell<T extends C74825a> extends PowerCell<T> {

    /* renamed from: a */
    private final AbstractC89244h f168159a = C89250i.m154773a((AbstractC89171a) new C74824e(this));

    /* renamed from: l */
    public SocialCardVM f168160l;

    /* renamed from: m */
    public T f168161m;

    /* renamed from: n */
    protected View f168162n;

    /* renamed from: o */
    protected SmartAvatarImageView f168163o;

    /* renamed from: p */
    protected TuxTextView f168164p;

    /* renamed from: q */
    protected TuxTextView f168165q;

    /* renamed from: r */
    protected MutualRelationView f168166r;

    /* renamed from: s */
    protected FollowButtonWithBlock f168167s;

    /* renamed from: t */
    protected TuxIconView f168168t;

    static {
        Covode.recordClassIndex(87677);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo117868a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117875a(View view) {
        C89219l.m154721d(view, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117870a(FollowButtonWithBlock followButtonWithBlock, FollowStatus followStatus) {
        C89219l.m154721d(followButtonWithBlock, "");
        C89219l.m154721d(followStatus, "");
    }

    /* renamed from: b */
    public final SocialCardVM mo117878b() {
        return (SocialCardVM) this.f168159a.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final FollowButtonWithBlock mo117879c() {
        FollowButtonWithBlock followButtonWithBlock = this.f168167s;
        if (followButtonWithBlock == null) {
            C89219l.m154710a("followButton");
        }
        return followButtonWithBlock;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final TuxIconView mo23351d() {
        TuxIconView tuxIconView = this.f168168t;
        if (tuxIconView == null) {
            C89219l.m154710a("deleteIconView");
        }
        return tuxIconView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        SocialCardVM b = mo117878b();
        T t = this.f168161m;
        if (t == null) {
            C89219l.m154710a("mItem");
        }
        b.mo117911a(t);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell$e */
    static final class C74824e extends AbstractC89220m implements AbstractC89171a<SocialCardVM> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f168174a;

        static {
            Covode.recordClassIndex(87682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74824e(RecommendUserCell recommendUserCell) {
            super(0);
            this.f168174a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialCardVM invoke() {
            Object obj = this.f168174a.f168160l;
            if (obj != null || (obj = PowerCell.m32713b(this.f168174a, SocialCardVM.class)) != null || (obj = PowerCell.m32711a(this.f168174a, SocialCardVM.class)) != null) {
                return obj;
            }
            throw new IllegalStateException("Where am I? the activity is null!");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C74825a m131379a(RecommendUserCell recommendUserCell) {
        T t = recommendUserCell.f168161m;
        if (t == null) {
            C89219l.m154710a("mItem");
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell$b */
    public static final class C74821b extends AbstractC89220m implements AbstractC89172b<FollowStatus, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f168171a;

        static {
            Covode.recordClassIndex(87679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74821b(RecommendUserCell recommendUserCell) {
            super(1);
            this.f168171a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            C89219l.m154721d(followStatus2, "");
            RecommendUserCell recommendUserCell = this.f168171a;
            recommendUserCell.mo117870a(recommendUserCell.mo117879c(), followStatus2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell$d */
    public static final class View$OnClickListenerC74823d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f168173a;

        static {
            Covode.recordClassIndex(87681);
        }

        View$OnClickListenerC74823d(RecommendUserCell recommendUserCell) {
            this.f168173a = recommendUserCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f168173a.mo117878b().mo117916b(RecommendUserCell.m131379a(this.f168173a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell$a */
    public static final class View$OnClickListenerC74820a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f168169a;

        /* renamed from: b */
        final /* synthetic */ User f168170b;

        static {
            Covode.recordClassIndex(87678);
        }

        View$OnClickListenerC74820a(RecommendUserCell recommendUserCell, User user) {
            this.f168169a = recommendUserCell;
            this.f168170b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            RecommendUserCell recommendUserCell = this.f168169a;
            User user = this.f168170b;
            Map<String, String> map = recommendUserCell.mo117878b().f168281v.f168055d;
            View view2 = recommendUserCell.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            String str = map.get("enter_from");
            if (str == null) {
                str = "";
            }
            String str2 = map.get("homepage_uid");
            String str3 = map.get("previous_page");
            if (str3 == null) {
                str3 = "";
            }
            C74744a.m131229a(user, context, str, str2, str3, null, 16);
            SocialCardVM b = recommendUserCell.mo117878b();
            T t = recommendUserCell.f168161m;
            if (t == null) {
                C89219l.m154710a("mItem");
            }
            C89219l.m154721d(t, "");
            AbstractC74788j jVar = b.f168264e;
            if (jVar != null) {
                jVar.mo86627a(t.f168175a);
            }
            C74777c.m131287a(t.f168175a, C59256u.EnumC59259c.CARD, Integer.valueOf(b.f168271l.indexOf(t)), b.f168265f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), mo117868a(), viewGroup, false);
        C89219l.m154716b(a, "");
        this.f168162n = a;
        if (a == null) {
            C89219l.m154710a("container");
        }
        View findViewById = a.findViewById(R.id.o4);
        C89219l.m154716b(findViewById, "");
        this.f168163o = (SmartAvatarImageView) findViewById;
        View view = this.f168162n;
        if (view == null) {
            C89219l.m154710a("container");
        }
        View findViewById2 = view.findViewById(R.id.csi);
        C89219l.m154716b(findViewById2, "");
        this.f168164p = (TuxTextView) findViewById2;
        View view2 = this.f168162n;
        if (view2 == null) {
            C89219l.m154710a("container");
        }
        View findViewById3 = view2.findViewById(R.id.df4);
        C89219l.m154716b(findViewById3, "");
        this.f168165q = (TuxTextView) findViewById3;
        View view3 = this.f168162n;
        if (view3 == null) {
            C89219l.m154710a("container");
        }
        View findViewById4 = view3.findViewById(R.id.cp2);
        C89219l.m154716b(findViewById4, "");
        this.f168166r = (MutualRelationView) findViewById4;
        View view4 = this.f168162n;
        if (view4 == null) {
            C89219l.m154710a("container");
        }
        View findViewById5 = view4.findViewById(R.id.b6b);
        C89219l.m154716b(findViewById5, "");
        this.f168167s = (FollowButtonWithBlock) findViewById5;
        View view5 = this.f168162n;
        if (view5 == null) {
            C89219l.m154710a("container");
        }
        View findViewById6 = view5.findViewById(R.id.aix);
        C89219l.m154716b(findViewById6, "");
        this.f168168t = (TuxIconView) findViewById6;
        View view6 = this.f168162n;
        if (view6 == null) {
            C89219l.m154710a("container");
        }
        return view6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell$c */
    public static final class C74822c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f168172a;

        static {
            Covode.recordClassIndex(87680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74822c(RecommendUserCell recommendUserCell) {
            super(1);
            this.f168172a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            C59256u.EnumC59257a aVar;
            Integer num2;
            if (num.intValue() == 1) {
                SocialCardVM b = this.f168172a.mo117878b();
                C74825a a = RecommendUserCell.m131379a(this.f168172a);
                C89219l.m154721d(a, "");
                AbstractC74788j jVar = b.f168264e;
                if (jVar != null) {
                    jVar.mo86627a(a.f168175a);
                }
                List<AbstractC17641a> value = b.f168272m.getValue();
                if (value != null) {
                    num2 = Integer.valueOf(value.indexOf(a));
                } else {
                    num2 = null;
                }
                b.f168273n.postValue(num2);
            }
            SocialCardVM b2 = this.f168172a.mo117878b();
            C74825a a2 = RecommendUserCell.m131379a(this.f168172a);
            C89219l.m154721d(a2, "");
            User user = a2.f168175a;
            int indexOf = b2.f168271l.indexOf(a2);
            Map<String, String> map = b2.f168265f;
            C89219l.m154721d(user, "");
            C89219l.m154721d(map, "");
            String str = map.get("previous_page");
            String str2 = map.get("homepage_uid");
            String str3 = map.get("position");
            String a3 = C74777c.m131285a(user);
            C33744d a4 = new C33744d().mo59983a("enter_method", "follow_button").mo59983a("enter_from", map.get("enter_from")).mo59983a("previous_page", str).mo59983a("rec_type", user.getRecType()).mo59983a("to_user_id", user.getUid()).mo59980a("impr_order", indexOf).mo59983a("req_id", user.getRequestId()).mo59983a("relation_type", user.getFriendTypeStr());
            new C59256u();
            C39162r.m79460a(a3, a4.mo59983a("follow_type", C59256u.m108931b(user).getType()).f79943a);
            C59256u a5 = new C59256u().mo96834a(map.get("enter_from"));
            a5.f135350a = C59256u.EnumC59259c.CARD;
            if (user.getFollowStatus() == 0) {
                aVar = C59256u.EnumC59257a.FOLLOW;
            } else {
                aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
            }
            a5.f135352b = aVar;
            a5.mo96832a(user).mo96841s(user.getRequestId()).mo96838p(str3).mo96842t(str2).mo96839q(str).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo23350a(T t) {
        C89219l.m154721d(t, "");
        super.mo23350a((AbstractC17641a) t);
        this.f168161m = t;
        User user = t.f168175a;
        View view = this.f168162n;
        if (view == null) {
            C89219l.m154710a("container");
        }
        view.setOnClickListener(new View$OnClickListenerC74820a(this, user));
        FollowButtonWithBlock followButtonWithBlock = this.f168167s;
        if (followButtonWithBlock == null) {
            C89219l.m154710a("followButton");
        }
        followButtonWithBlock.setOnClickListener(new C74821b(this));
        FollowButtonWithBlock followButtonWithBlock2 = this.f168167s;
        if (followButtonWithBlock2 == null) {
            C89219l.m154710a("followButton");
        }
        followButtonWithBlock2.setMobListener(new C74822c(this));
        TuxIconView tuxIconView = this.f168168t;
        if (tuxIconView == null) {
            C89219l.m154710a("deleteIconView");
        }
        tuxIconView.setOnClickListener(new View$OnClickListenerC74823d(this));
        SmartAvatarImageView smartAvatarImageView = this.f168163o;
        if (smartAvatarImageView == null) {
            C89219l.m154710a("avatarView");
        }
        C89219l.m154721d(user, "");
        C89219l.m154721d(smartAvatarImageView, "");
        UrlModel avatarThumb = user.getAvatarThumb();
        C89219l.m154716b(avatarThumb, "");
        C74744a.m131227a(smartAvatarImageView, avatarThumb);
        TuxTextView tuxTextView = this.f168164p;
        if (tuxTextView == null) {
            C89219l.m154710a("usernameView");
        }
        C89219l.m154721d(user, "");
        C89219l.m154721d(tuxTextView, "");
        C74744a.m131226a(tuxTextView, user);
        TuxTextView tuxTextView2 = this.f168165q;
        if (tuxTextView2 == null) {
            C89219l.m154710a("reasonView");
        }
        MutualRelationView mutualRelationView = this.f168166r;
        if (mutualRelationView == null) {
            C89219l.m154710a("mutualView");
        }
        mo117876a(t, tuxTextView2, mutualRelationView);
        FollowButtonWithBlock followButtonWithBlock3 = this.f168167s;
        if (followButtonWithBlock3 == null) {
            C89219l.m154710a("followButton");
        }
        mo117869a(user, followButtonWithBlock3);
        TuxIconView tuxIconView2 = this.f168168t;
        if (tuxIconView2 == null) {
            C89219l.m154710a("deleteIconView");
        }
        C89219l.m154721d(user, "");
        C89219l.m154721d(tuxIconView2, "");
        if (user.getFollowStatus() == 0) {
            tuxIconView2.setVisibility(0);
        } else {
            tuxIconView2.setVisibility(8);
        }
        View view2 = this.f168162n;
        if (view2 == null) {
            C89219l.m154710a("container");
        }
        mo117875a(view2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117869a(User user, FollowButtonWithBlock followButtonWithBlock) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(followButtonWithBlock, "");
        if (C80580in.m139687c()) {
            followButtonWithBlock.setVisibility(8);
            return;
        }
        C89219l.m154721d(user, "");
        followButtonWithBlock.getFollowBlock().mo86508a(user);
        followButtonWithBlock.mo73175a(user.getFollowStatus(), user.getFollowerStatus());
        followButtonWithBlock.setListener(user);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo117876a(T t, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        C89219l.m154721d(t, "");
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(mutualRelationView, "");
        C74744a.m131230a(t.f168175a, tuxTextView, mutualRelationView);
    }
}
