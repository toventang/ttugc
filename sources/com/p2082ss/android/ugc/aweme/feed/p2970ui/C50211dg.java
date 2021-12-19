package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80316cv;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dg */
public class C50211dg extends AbstractC49544a implements AbstractC63854r, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    View f115950a;

    /* renamed from: b */
    int f115951b = 0;

    /* renamed from: c */
    SmartAvatarImageView f115952c;

    /* renamed from: d */
    TextView f115953d;

    /* renamed from: e */
    public View f115954e;

    /* renamed from: f */
    View f115955f;

    /* renamed from: g */
    public boolean f115956g = false;

    /* renamed from: h */
    public boolean f115957h = false;

    /* renamed from: i */
    AbstractC51754w f115958i;

    /* renamed from: j */
    public ExposeSharer f115959j;

    /* renamed from: k */
    private View f115960k;

    /* renamed from: l */
    private TuxTextView f115961l;

    static {
        Covode.recordClassIndex(59337);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(81, new RunnableC90250g(C50211dg.class, "onEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(13, new RunnableC90250g(C50211dg.class, "onProfileFollowEvent", C35503c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        AbstractC51754w wVar = this.f115958i;
        if (wVar != null) {
            wVar.ck_();
            this.f115958i = null;
        }
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        super.mo81280e(bVar);
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo81277b(VideoItemParams videoItemParams) {
        super.mo81277b(videoItemParams);
        mo85376a(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("show_expose_sharer_info_view", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) this);
        }
    }

    public C50211dg(View view) {
        super(view, ((Boolean) C46759bu.f108956b.getValue()).booleanValue());
    }

    /* renamed from: b */
    public final void mo85379b(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f115953d.getLayoutParams();
        marginLayoutParams.setMarginEnd(i);
        this.f115953d.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50221dk(this, bVar.f80277a, bVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        ExposeSharer exposeSharer;
        if (this.f113953L != null && (exposeSharer = this.f115959j) != null && exposeSharer.getUid() != null) {
            C39143l.m79438a(C34729o.m70950a(this.f113959R), exc);
            this.f115955f.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m94230a(ExposeSharer exposeSharer) {
        if (exposeSharer == null) {
            return false;
        }
        if (exposeSharer.getUid() != null && exposeSharer.getUid().equals(C31575b.m65865g().getCurUserId())) {
            return true;
        }
        if (exposeSharer.getSecUid() == null || !exposeSharer.getSecUid().equals(C31575b.m65865g().getCurSecUserId())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(5447);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
            this.f115950a = (View) this.f113961T.getParent().getParent();
        }
        MethodCollector.m26664o(5447);
    }

    @AbstractC90264r
    public void onEvent(FollowStatusEvent followStatusEvent) {
        if (followStatusEvent.status.followStatus == 0 && this.f115959j.getUid().equals(followStatusEvent.status.userId)) {
            this.f115959j.setFollowStatus(followStatusEvent.status.followStatus);
            this.f115959j.setFollowerStatus(followStatusEvent.status.followerStatus);
            this.f115954e.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.RunnableC502176 */

                static {
                    Covode.recordClassIndex(59343);
                }

                public final void run() {
                    C50211dg.this.mo85378a(false);
                }
            }, 550);
        }
    }

    @AbstractC90264r
    public void onProfileFollowEvent(C35503c cVar) {
        if (cVar != null && (cVar.f83729b instanceof User) && this.f115959j != null && ((User) cVar.f83729b).getUid().equals(this.f115959j.getUid())) {
            this.f115959j.setFollowStatus(cVar.f83728a);
            mo85378a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85376a(int i) {
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50222dl(this, i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        ExposeSharer exposeSharer;
        if (this.f113953L != null && (exposeSharer = this.f115959j) != null && exposeSharer.getUid() != null && this.f115959j.getUid().equals(followStatus.userId)) {
            this.f115959j.setFollowStatus(followStatus.followStatus);
            mo85378a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.ais);
        this.f113961T.setVisibility(8);
        this.f115952c = (SmartAvatarImageView) this.f113961T.findViewById(R.id.dzc);
        this.f115953d = (TextView) this.f113961T.findViewById(R.id.f3u);
        this.f115954e = this.f113961T.findViewById(R.id.ewb);
        this.f115961l = (TuxTextView) this.f113961T.findViewById(R.id.b6h);
        this.f115955f = this.f113961T.findViewById(R.id.cpb);
        this.f115960k = this.f113961T.findViewById(R.id.ay0);
        this.f115954e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.View$OnClickListenerC502121 */

            static {
                Covode.recordClassIndex(59338);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C50211dg.this.f113953L != null && C50211dg.this.f115959j != null && !C50211dg.this.f113953L.isDelete() && !TextUtils.equals(C50211dg.this.f115959j.getUid(), C31575b.m65865g().getCurUserId())) {
                    if (C37699a.m76314s(C50211dg.this.f113953L) && !C37699a.m76222Y(C50211dg.this.f113953L)) {
                        C38000g.m77050a().mo65877a(C50211dg.this.f113960S.getContext(), C50211dg.this.f113953L);
                        C18129a.m33746a("draw_ad", "follow", C50211dg.this.f113953L.getAwemeRawAd()).mo28902c();
                    }
                    if (C37699a.m76255aa(C50211dg.this.f113953L) || C37699a.m76222Y(C50211dg.this.f113953L)) {
                        C38000g.m77050a().mo65880a(C50211dg.this.f113959R, C50211dg.this.f113953L, "plus_sign");
                    }
                    if (!C34719f.C34720a.f82009a.mo61395c()) {
                        new C79459a(C50211dg.this.f113959R).mo123050a(R.string.dcq).mo123053a();
                        return;
                    }
                    C50211dg dgVar = C50211dg.this;
                    if (!C31575b.m65865g().isLogin()) {
                        C58957c.m108320a((Activity) dgVar.f113959R, dgVar.f113954M, "click_follow", new C80222ap().mo123649a("group_id", dgVar.f113953L.getAid()).mo123649a("log_pb", C59208ac.m108768c(dgVar.f113953L.getAid())).f179700a, new C50218dh(dgVar));
                    } else {
                        dgVar.mo85377a(dgVar.f115959j, dgVar.f113954M, true);
                    }
                }
            }
        });
        this.f115960k.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.View$OnClickListenerC502132 */

            static {
                Covode.recordClassIndex(59339);
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (C50211dg.this.f113953L != null && C50211dg.this.f115959j != null && C50211dg.this.f115959j.getUid() != null && !C58956a.m108315a(C50211dg.this.f113953L)) {
                    if (C50211dg.this.f113953L == null || (C50211dg.this.f113953L.isCanPlay() && !C50211dg.this.f113953L.isDelete())) {
                        C50211dg dgVar = C50211dg.this;
                        C33744d a = new C33744d().mo59983a("enter_from", "share_user_info_card");
                        if (dgVar.f113957P == 0) {
                            str = "homepage_hot";
                        } else {
                            str = "server_push";
                        }
                        C39162r.m79460a("enter_personal_detail", a.mo59983a("previous_page", str).mo59983a("group_id", dgVar.f113953L.getAid()).mo59983a("author_id", dgVar.f113953L.getAuthorUid()).mo59983a("to_user_id", dgVar.f115959j.getUid()).f79943a);
                        SmartRouter.buildRoute(dgVar.f113959R, "aweme://user/profile/").withParam("uid", dgVar.f115959j.getUid()).withParam("sec_user_id", dgVar.f115959j.getSecUid()).withParam("extra_from_pre_page", "share_user_info_card").withParam("enter_from", "others_homepage").open();
                    } else if (C50211dg.this.f113953L.isImage()) {
                        new C79459a(C50211dg.this.f113959R).mo123050a(R.string.civ).mo123053a();
                    } else {
                        new C79459a(C50211dg.this.f113959R).mo123050a(R.string.h8k).mo123053a();
                    }
                }
            }
        });
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85378a(boolean z) {
        int followStatus = this.f115959j.getFollowStatus();
        int followerStatus = this.f115959j.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                this.f115961l.setText(R.string.bz9);
            } else if (followStatus == 2) {
                this.f115961l.setText(R.string.baw);
            } else if (followStatus == 4) {
                this.f115961l.setText(R.string.byz);
            }
        } else if (followerStatus == 1) {
            this.f115961l.setText(R.string.bxw);
        } else {
            this.f115961l.setText(R.string.bxs);
        }
        if (followStatus == 0) {
            int b = (int) C13628n.m24520b(this.f113959R, 92.0f);
            this.f115954e.setVisibility(0);
            this.f115954e.setAlpha(1.0f);
            this.f115955f.setAlpha(0.0f);
            mo85379b(b);
            if (this.f115959j.getFollowerStatus() == 1) {
                this.f115961l.setText(R.string.bxw);
            } else {
                this.f115961l.setText(R.string.bxs);
            }
        } else if (!this.f115957h) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50220dj(this, z, (int) C13628n.m24520b(this.f113959R, 30.0f))));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, new C50219di(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85377a(ExposeSharer exposeSharer, String str, boolean z) {
        boolean z2;
        String str2;
        int a;
        AbstractC51754w wVar = this.f115958i;
        if (wVar != null && wVar.mo87471i()) {
            C63847n.C63848a b = new C63847n.C63848a().mo103320a(exposeSharer.getUid()).mo103325b(exposeSharer.getSecUid());
            int i = 0;
            if (exposeSharer.isPrivateAccount() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C63847n.C63848a d = b.mo103322a(z2).mo103318a(1).mo103327c(str).mo103324b(C80316cv.C80317a.m139240a(str, null)).mo103328d(exposeSharer.getFollowStatus()).mo103328d(exposeSharer.getFollowerStatus());
            String str3 = "homepage_hot";
            if (z) {
                if (TextUtils.equals(this.f113954M, str3)) {
                    a = -1;
                } else {
                    a = C80316cv.C80317a.m139239a(this.f113954M);
                }
                d.mo103326c(a);
            } else {
                d.mo103326c(C80316cv.C80317a.m139239a(str));
            }
            this.f115958i.mo87469a(d.mo103323a());
            C33744d a2 = new C33744d().mo59983a("enter_from", "share_user_info_card");
            if (this.f113957P != 0) {
                str3 = "server_push";
            }
            C33744d a3 = a2.mo59983a("previous_page", str3).mo59983a("group_id", this.f113953L.getAid()).mo59983a("author_id", this.f113953L.getAuthorUid()).mo59983a("to_user_id", this.f115959j.getUid());
            if (this.f115959j.getFollowerStatus() == 1) {
                str2 = "mutual";
            } else {
                str2 = "single";
            }
            C33744d a4 = a3.mo59983a("follow_type", str2);
            if (this.f115959j.isPrivateAccount() == 1) {
                i = 1;
            }
            C39162r.m79460a("follow", a4.mo59980a("is_private", i).f79943a);
        }
    }
}
