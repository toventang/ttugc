package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.e */
public class C51188e extends AbstractC39060f<IMUser> {

    /* renamed from: a */
    public static final String f118070a = C51188e.class.getSimpleName();

    /* renamed from: b */
    public String f118071b = "";

    static {
        Covode.recordClassIndex(60391);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.e$a */
    public class C51189a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        AvatarImageWithVerify f118072a;

        /* renamed from: b */
        TextView f118073b;

        /* renamed from: c */
        TextView f118074c;

        /* renamed from: d */
        FollowUserBtn f118075d;

        /* renamed from: e */
        View f118076e;

        /* renamed from: f */
        View f118077f;

        /* renamed from: g */
        C51086a f118078g;

        static {
            Covode.recordClassIndex(60392);
        }

        /* renamed from: a */
        public final void mo86610a(IMUser iMUser) {
            final User user = IMUser.toUser(iMUser);
            if (user.getFollowStatus() == 2) {
                user.setFollowerStatus(1);
            }
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.C51188e.C51189a.View$OnClickListenerC511912 */

                static {
                    Covode.recordClassIndex(60394);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C51189a.this.itemView.getContext() != null) {
                        SmartRouter.buildRoute(C51189a.this.itemView.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "following").withParam("profile_enterprise_type", C63419ae.f143971a.mo101949a(user)).open();
                    }
                    C59252q qVar = new C59252q();
                    qVar.f135314q = user.getUid();
                    C59252q o = qVar.mo96825o("following");
                    o.f135285Y = "personal_homepage";
                    o.f135284X = "1044";
                    o.mo96792f();
                }
            });
            this.f118072a.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            C51188e.m95597a(this.f118073b, iMUser);
            C51188e.m95598b(this.f118074c, iMUser);
            this.f118078g.f117877c = new C51192f(this, iMUser);
            this.f118078g.mo86508a(user);
            this.f118077f.getLayoutParams().width = 0;
            this.f118072a.mo61285a();
            C80581io.m139704a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f118073b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ void mo86611a(IMUser iMUser, FollowStatus followStatus) {
            if (followStatus != null) {
                C51188e.m95597a(this.f118073b, iMUser);
                C51188e.m95598b(this.f118074c, iMUser);
                if (followStatus.isFollowSucess) {
                    iMUser.setFollowStatus(followStatus.followStatus);
                }
            }
        }

        C51189a(View view) {
            super(view);
            this.f118072a = (AvatarImageWithVerify) view.findViewById(R.id.bsr);
            this.f118073b = (TextView) view.findViewById(R.id.f8p);
            this.f118074c = (TextView) view.findViewById(R.id.f82);
            this.f118075d = (FollowUserBtn) view.findViewById(R.id.f87);
            this.f118076e = view.findViewById(R.id.bv7);
            this.f118077f = view.findViewById(R.id.cld);
            this.f118078g = new C51086a(this.f118075d, new C51086a.C51094g(C51188e.this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.C51188e.C51189a.C511901 */

                static {
                    Covode.recordClassIndex(60393);
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
                /* renamed from: a */
                public final void mo63346a(int i, User user) {
                    String str;
                    String str2;
                    super.mo63346a(i, user);
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    C59260v vVar = new C59260v(str);
                    vVar.f135402b = "others_homepage";
                    C59260v a = vVar.mo96847a("common_relation");
                    a.f135409s = "follow_button";
                    int i2 = 1;
                    if (i == 1) {
                        str2 = "1007";
                    } else {
                        str2 = "1036";
                    }
                    a.f135372a = str2;
                    a.f135405e = user.getUid();
                    a.f135376aa = user.isSecret() ? 1 : 0;
                    if (user.getFollowStatus() == 0) {
                        i2 = -1;
                    } else if (user.getFollowStatus() == 4) {
                        i2 = 0;
                    }
                    a.f135377ab = i2;
                    a.mo96846a(user).mo96792f();
                }
            });
        }
    }

    /* renamed from: a */
    protected static void m95597a(TextView textView, IMUser iMUser) {
        textView.setText(iMUser.getDisplayId());
    }

    /* renamed from: b */
    protected static void m95598b(TextView textView, IMUser iMUser) {
        textView.setText(iMUser.getNickName());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        ((C51189a) viewHolder).mo86610a((IMUser) this.f92236l.get(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C51189a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anu, viewGroup, false));
    }
}
