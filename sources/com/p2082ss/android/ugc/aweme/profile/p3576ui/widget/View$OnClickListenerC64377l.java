package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56248b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56250c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l */
public final class View$OnClickListenerC64377l extends RecyclerView.ViewHolder implements View.OnClickListener, AbstractC63854r {

    /* renamed from: a */
    AvatarImageWithVerify f145960a;

    /* renamed from: b */
    TextView f145961b;

    /* renamed from: c */
    TextView f145962c;

    /* renamed from: d */
    TextView f145963d;

    /* renamed from: e */
    public User f145964e;

    /* renamed from: f */
    int f145965f;

    /* renamed from: g */
    AbstractC64378a f145966g;

    /* renamed from: h */
    AbstractC64379b f145967h;

    /* renamed from: i */
    C64357h.AbstractC64362b f145968i;

    /* renamed from: j */
    final View f145969j;

    /* renamed from: k */
    String f145970k;

    /* renamed from: l */
    int f145971l;

    /* renamed from: m */
    private View f145972m;

    /* renamed from: n */
    private Context f145973n;

    /* renamed from: o */
    private AbstractC51754w f145974o;

    /* renamed from: p */
    private View f145975p;

    /* renamed from: q */
    private ImageView f145976q;

    /* renamed from: r */
    private Object f145977r;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l$a */
    public interface AbstractC64378a {
        static {
            Covode.recordClassIndex(75832);
        }

        /* renamed from: a */
        void mo103919a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.l$b */
    public interface AbstractC64379b {
        static {
            Covode.recordClassIndex(75833);
        }

        /* renamed from: a */
        void mo103899a();
    }

    static {
        Covode.recordClassIndex(75831);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
    }

    /* renamed from: b */
    private void m116268b() {
        this.f145963d.setPadding(0, 0, 0, 0);
        this.f145963d.setGravity(17);
        this.f145963d.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: c */
    private String m116270c() {
        int i = this.f145971l;
        if (i == 1) {
            return "homepage_follow";
        }
        if (i == 2) {
            return "homepage_friends";
        }
        return "others_homepage";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103927a() {
        AbstractC64379b bVar;
        Activity activity = null;
        if (!C31575b.m65865g().isLogin()) {
            C58957c.m108320a(C17873f.m33102j(), "homepage_follow", "click_follow_tab", (Bundle) null, new C64380m(this));
            return;
        }
        if (this.f145964e.getFollowStatus() == 0 && (bVar = this.f145967h) != null) {
            bVar.mo103899a();
        }
        Context context = this.f145973n;
        if (context != null && (context instanceof Activity)) {
            activity = (Activity) context;
        }
        int i = 2;
        if (this.f145964e.getFollowStatus() != 0) {
            i = 0;
        } else if (this.f145964e.isSecret()) {
            i = 4;
        } else if (this.f145964e.getFollowerStatus() != 1) {
            i = 1;
        }
        if (this.f145964e.getFollowStatus() == 4) {
            if (activity == null) {
                return;
            }
        } else if (i == 4) {
            if (activity != null) {
                m116267a(activity);
            } else {
                return;
            }
        }
        m116269b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        C39143l.m79438a(C34729o.m70950a(this.f145973n), exc);
        int followStatus = this.f145964e.getFollowStatus();
        this.f145964e.getFollowerStatus();
        mo103928a(followStatus);
    }

    /* renamed from: c */
    private void m116271c(int i) {
        C56248b.m102215a(C34729o.m70962d(this.itemView)).mo93283a(this.f145977r).mo93284a(m116270c()).mo93280a((View) this.f145963d).mo93281a(this.f145963d).mo93282a(this.f145964e).mo93279a(i).mo93286a((AbstractC89172b<? super C56250c, C89391z>) new C64381n(this));
    }

    /* renamed from: a */
    private static void m116267a(Activity activity) {
        C33594aj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = privacyAccountFollowCount.mo59941c().intValue();
        if (intValue == 0) {
            new C17197a.C17200a(activity).mo27194b(R.string.esu).mo27190a(R.string.cbc, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
        } else if (intValue > 0 && intValue < 4) {
            new C79459a(activity).mo123050a(R.string.esv).mo123053a();
        }
        privacyAccountFollowCount.mo59940b(Integer.valueOf(intValue + 1));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f145964e.getUid())) {
            this.f145964e.setFollowStatus(followStatus.followStatus);
            AbstractC81915c.m141874a(new C35503c(followStatus.followStatus, this.f145964e));
            mo103928a(followStatus.followStatus);
            Context context = this.f145973n;
            if ((!(context instanceof AbstractC1204m) || ((AbstractC1204m) context).getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) && followStatus.followStatus == 0 && !TextUtils.isEmpty(this.f145964e.getRemarkName())) {
                this.f145964e.setRemarkName("");
                mo103929a(this.f145964e);
            }
        }
    }

    /* renamed from: b */
    private void m116269b(int i) {
        int i2;
        String str;
        C56248b.m102215a(C34729o.m70962d(this.itemView)).mo93283a(this.f145977r).mo93282a(this.f145964e).mo93279a(i).mo93285a();
        this.f145964e.getFollowerStatus();
        mo103928a(i);
        boolean z = false;
        if (this.f145964e.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        AbstractC51754w wVar = this.f145974o;
        C63847n.C63848a b = new C63847n.C63848a().mo103320a(this.f145964e.getUid()).mo103325b(this.f145964e.getSecUid());
        if (this.f145964e.isSecret() || this.f145964e.isPrivateAccount()) {
            z = true;
        }
        C63847n.C63848a a = b.mo103322a(z).mo103318a(i2);
        if (this.f145971l == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        wVar.mo87469a(a.mo103327c(str).mo103324b(12).mo103328d(this.f145964e.getFollowerStatus()).mo103323a());
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.a6q) {
            AbstractC64378a aVar = this.f145966g;
            if (aVar != null) {
                aVar.mo103919a(this.f145964e, this.f145965f);
            }
        } else if (id == R.id.nz) {
            C64357h.AbstractC64362b bVar = this.f145968i;
            if (bVar != null) {
                bVar.mo81342c(this.f145964e);
            }
            if (this.f145964e != null) {
                SmartRouter.buildRoute(this.f145973n, "//user/profile").withParam("uid", this.f145964e.getUid()).withParam("from_recommend_card", 1).withParam("sec_user_id", this.f145964e.getSecUid()).withParam("enter_from", m116270c()).withParam("enter_from_request_id", this.f145970k).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", this.f145964e.getRecommendReason()).withParam("recommend_from_type", "card").open();
            }
        } else if (id == R.id.b6a) {
            C64357h.AbstractC64362b bVar2 = this.f145968i;
            if (bVar2 != null) {
                bVar2.mo81341b(this.f145964e);
            }
            mo103927a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103928a(int i) {
        this.f145963d.setVisibility(0);
        Resources resources = this.f145973n.getResources();
        if (i == 0) {
            this.f145963d.setText(resources.getText(R.string.bxs));
            this.f145963d.setBackgroundResource(R.drawable.na);
            TextView textView = this.f145963d;
            textView.setTextColor(C0643b.m2378c(textView.getContext(), R.color.a9));
            m116268b();
        } else if (i == 1 || i == 2) {
            m116268b();
            int i2 = R.string.bz9;
            if (i == 2) {
                i2 = R.string.baw;
            }
            this.f145963d.setText(i2);
            TextView textView2 = this.f145963d;
            textView2.setTextColor(C0643b.m2378c(textView2.getContext(), R.color.bx));
            this.f145963d.setBackgroundResource(R.drawable.bbn);
        } else if (i == 4) {
            TextView textView3 = this.f145963d;
            textView3.setTextColor(C0643b.m2378c(textView3.getContext(), R.color.bx));
            this.f145963d.setBackgroundResource(R.drawable.bbn);
            this.f145963d.setText(this.f145973n.getString(R.string.byz));
        }
        m116271c(i);
    }

    /* renamed from: a */
    public final void mo103929a(User user) {
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f145961b.setText(this.f145964e.getNickname());
            this.f145972m.setContentDescription(this.f145964e.getNickname());
            this.f145960a.setContentDescription(this.f145964e.getNickname());
            return;
        }
        this.f145961b.setText(this.f145964e.getRemarkName());
        this.f145972m.setContentDescription(this.f145964e.getRemarkName());
        this.f145960a.setContentDescription(this.f145964e.getNickname());
    }

    public View$OnClickListenerC64377l(View view, int i, Object obj) {
        super(view);
        this.f145973n = view.getContext();
        View findViewById = view.findViewById(R.id.f_s);
        this.f145972m = findViewById;
        C0792v.m2740a(findViewById, 1);
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) view.findViewById(R.id.nz);
        this.f145960a = avatarImageWithVerify;
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        this.f145969j = view.findViewById(R.id.dnb);
        this.f145961b = (TextView) view.findViewById(R.id.fa1);
        this.f145962c = (TextView) view.findViewById(R.id.dfk);
        this.f145963d = (TextView) view.findViewById(R.id.b6a);
        this.f145975p = view.findViewById(R.id.bv7);
        ImageView imageView = (ImageView) view.findViewById(R.id.a6q);
        this.f145976q = imageView;
        imageView.setOnClickListener(this);
        this.f145972m.setOnClickListener(this);
        this.f145960a.setOnClickListener(this);
        this.f145963d.setOnClickListener(this);
        if (this.f145974o == null) {
            AbstractC51754w i2 = FriendsServiceImpl.m96115u().mo87329i();
            this.f145974o = i2;
            i2.mo87468a(this);
        }
        this.f145971l = i;
        this.f145977r = obj;
    }
}
