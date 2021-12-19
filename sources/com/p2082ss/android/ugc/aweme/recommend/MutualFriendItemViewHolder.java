package com.p2082ss.android.ugc.aweme.recommend;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51695at;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.FansFollowUserBtn;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder */
public final class MutualFriendItemViewHolder extends JediSimpleViewHolder<C51108g> implements AbstractC33974au {

    /* renamed from: f */
    private FansFollowUserBtn f149705f;

    /* renamed from: g */
    private C51086a f149706g;

    /* renamed from: j */
    private final C51695at f149707j;

    static {
        Covode.recordClassIndex(78139);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder$a */
    public static final class C66589a extends C51086a.C51094g {
        static {
            Covode.recordClassIndex(78140);
        }

        C66589a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            String str;
            String str2;
            if (user != null) {
                if (i == 1) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                C59260v vVar = new C59260v(str);
                vVar.f135402b = "others_homepage";
                C59260v a = vVar.mo96847a("mutual_list");
                a.f135409s = "follow_button";
                C59260v a2 = a.mo96846a(user);
                if (i == 1) {
                    str2 = "1007";
                } else {
                    str2 = "1036";
                }
                a2.f135372a = str2;
                a2.f135405e = user.getUid();
                a2.mo96792f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder$b */
    public static final class C66590b implements C51086a.AbstractC51091d {
        static {
            Covode.recordClassIndex(78141);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        C66590b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutualFriendItemViewHolder(C51695at atVar) {
        super(atVar);
        C89219l.m154721d(atVar, "");
        this.f149707j = atVar;
        this.f149705f = atVar.getMFollowUserBtn();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C51108g gVar) {
        C51108g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        User user = gVar2.f117934b;
        this.f149707j.setNeedRecommendReason(false);
        C51695at atVar = this.f149707j;
        if (user != null) {
            atVar.f119159a.setOnClickListener(new C51695at.View$OnClickListenerC51697b(atVar));
            if (!TextUtils.isEmpty(user.getUniqueId())) {
                atVar.f119160b.setText(user.getUniqueId());
            }
            atVar.f119160b.setOnClickListener(new C51695at.View$OnClickListenerC51698c(atVar));
            if (!atVar.f119165g) {
                atVar.f119164f.setVisibility(8);
            } else if (!TextUtils.isEmpty(user.getRecommendReason())) {
                atVar.f119164f.setVisibility(0);
                atVar.f119164f.setText(user.getRecommendReason());
            }
            if (!TextUtils.isEmpty(user.getNickname())) {
                atVar.f119162d.setText(user.getNickname());
            }
            atVar.f119163e.mo73175a(user.getFollowStatus(), user.getFollowerStatus());
            ViewGroup.LayoutParams buttonLayoutParams = atVar.f119163e.getButtonLayoutParams();
            buttonLayoutParams.height = C34728n.m70946a(28.0d);
            buttonLayoutParams.width = C34728n.m70946a(88.0d);
            atVar.f119163e.setButtonLayoutParams(buttonLayoutParams);
            atVar.requestLayout();
            C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb()));
            a.f49092E = atVar.f119161c;
            a.mo34179a("RecommendFriendsItemView").mo34186c();
            atVar.f119163e.setOnClickListener(new C51695at.View$OnClickListenerC51699d(atVar));
            C80581io.m139704a(atVar.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), atVar.f119160b);
        }
        C51086a aVar = new C51086a(this.f149705f, new C66589a());
        this.f149706g = aVar;
        aVar.mo86508a(user);
        C51086a aVar2 = this.f149706g;
        if (aVar2 != null) {
            aVar2.f117878d = new C66590b();
        }
        this.f149707j.setActionEventListener(new C66591c(this, user));
        mo105598a(gVar2.f117934b, 5);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder$c */
    static final class C66591c extends AbstractC89220m implements AbstractC89183m<Integer, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MutualFriendItemViewHolder f149708a;

        /* renamed from: b */
        final /* synthetic */ User f149709b;

        static {
            Covode.recordClassIndex(78142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66591c(MutualFriendItemViewHolder mutualFriendItemViewHolder, User user) {
            super(2);
            this.f149708a = mutualFriendItemViewHolder;
            this.f149709b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, String str) {
            int intValue = num.intValue();
            C89219l.m154721d(str, "");
            this.f149708a.mo105598a(this.f149709b, intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105598a(User user, int i) {
        user.setRequestId(((C51108g) aQ_()).f117936d);
        if (i != C51700au.f119172d && i == C51700au.f119171c) {
            C59252q qVar = new C59252q();
            qVar.f135314q = user.getUid();
            qVar.mo96825o("mutual_list").mo96792f();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (context != null) {
                SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "mutual_list").withParam("enter_from_request_id", user.getRequestId()).open();
            }
        }
    }
}
