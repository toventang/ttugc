package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39114d;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49557n;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2483co.C36148b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.m */
public class C50339m extends AbstractC49544a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    ViewGroup f116248a;

    /* renamed from: b */
    AnimationImageView f116249b;

    /* renamed from: c */
    public View$OnClickListenerC50326l f116250c;

    /* renamed from: d */
    public boolean f116251d;

    /* renamed from: e */
    C50524a f116252e = new C50524a();

    /* renamed from: f */
    private C36148b f116253f;

    static {
        Covode.recordClassIndex(59467);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(67, new RunnableC90250g(C50339m.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: c */
    private C36148b m94442c() {
        if (this.f116253f == null) {
            this.f116253f = new C36148b();
        }
        return this.f116253f;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: g */
    public final void mo81283g() {
        super.mo81283g();
        View$OnClickListenerC50326l lVar = this.f116250c;
        if (lVar != null) {
            lVar.mo85502b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
        View$OnClickListenerC50326l lVar = this.f116250c;
        if (lVar != null) {
            EventBus.m156962a().mo145395b(lVar);
            lVar.f116216m.mo57240b(lVar.f116217n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo85516b() {
        if (!this.f116251d) {
            this.f116249b.setAnimation("common_feed_anim_follow_people.json");
            this.f116249b.mo5826a();
            this.f116249b.mo5828a(new Animator.AnimatorListener() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50339m.C503412 */

                static {
                    Covode.recordClassIndex(59469);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    C50339m.this.f116251d = false;
                }
            });
            this.f116251d = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    public C50339m(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("update_ad_user_follow_ui", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("bind_follow_view", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @AbstractC90264r
    public void onFollowEvent(FollowStatusEvent followStatusEvent) {
        RunnableC50402o oVar = new RunnableC50402o(this, followStatusEvent.status, this.f113953L);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            oVar.run();
            return;
        }
        AnimationImageView animationImageView = this.f116249b;
        if (animationImageView != null) {
            animationImageView.post(oVar);
        } else {
            C51423a.m95784a(3, null, "onFollowEvent mFollowView is null!");
        }
    }

    /* renamed from: a */
    public static String m94440a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    /* renamed from: b */
    public static String m94441b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().f114485id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.sk);
        this.f116248a = (ViewGroup) this.f113961T.findViewById(R.id.b6j);
        this.f116249b = (AnimationImageView) this.f113961T.findViewById(R.id.b6a);
        View findViewById = this.f113961T.findViewById(R.id.b6j);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC50401n(this));
        }
        this.f116250c = new View$OnClickListenerC50326l(this.f113961T);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50339m.RunnableC503401 */

            static {
                Covode.recordClassIndex(59468);
            }

            public final void run() {
                DataCenter a;
                DataCenter a2;
                DataCenter a3;
                if (C50339m.this.f116250c != null) {
                    View$OnClickListenerC50326l lVar = C50339m.this.f116250c;
                    DataCenter dataCenter = C50339m.this.f113958Q;
                    GenericWidget genericWidget = C50339m.this.f113951J;
                    C89219l.m154721d(genericWidget, "");
                    lVar.f116209f = dataCenter;
                    if (dataCenter != null && (a = dataCenter.mo60189a("startPlayAnimation", (AbstractC1214u<C33942b>) genericWidget)) != null && (a2 = a.mo60189a("stopPlayAnimation", (AbstractC1214u<C33942b>) genericWidget)) != null && (a3 = a2.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) genericWidget)) != null) {
                        a3.mo60189a("image_pause", (AbstractC1214u<C33942b>) genericWidget);
                    }
                }
            }
        }));
        if (C56216k.m102131a()) {
            C39114d.m79408a(this.f116248a, 8);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
        C36148b c = m94442c();
        c.f85383a = this.f113960S;
        c.f85384b = this.f113961T;
        c.f85385c = this.f116248a;
        c.f85386d = this.f116249b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        AnimationImageView animationImageView;
        MethodCollector.m26663i(5758);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(5758);
            return;
        }
        HashMap<String, Object> hashMap = (HashMap) bVar.mo60212a();
        if (hashMap.get("aweme_state") == null) {
            MethodCollector.m26664o(5758);
            return;
        }
        Aweme aweme = (Aweme) hashMap.get("aweme_state");
        this.f116249b.mo5836d();
        this.f116251d = false;
        this.f116248a.setVisibility(0);
        int i = 8;
        if (C38701br.m78512a(aweme, 3)) {
            animationImageView = this.f116249b;
        } else if (C80580in.m139680a(aweme)) {
            animationImageView = this.f116249b;
            i = 4;
        } else {
            animationImageView = this.f116249b;
            if (!C37699a.m76219V(aweme) && !aweme.isDelete()) {
                i = 0;
            }
        }
        animationImageView.setVisibility(i);
        if (C37699a.m76271aq(aweme)) {
            this.f116249b.setVisibility(4);
        }
        this.f116250c.mo85499a(aweme.getAuthor(), hashMap);
        m94442c().mo63274b();
        MethodCollector.m26664o(5758);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        User user = null;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!TextUtils.equals(bVar.f80277a, "video_params")) {
            return null;
        }
        Aweme aweme = this.f113953L;
        HashMap<String, Object> hashMap = new HashMap<>();
        C33942b bVar2 = new C33942b("ui_state", hashMap);
        hashMap.put("aweme_state", aweme);
        View$OnClickListenerC50326l lVar = this.f116250c;
        VideoItemParams videoItemParams = (VideoItemParams) bVar.mo60212a();
        C89219l.m154721d(hashMap, "");
        if (videoItemParams != null) {
            lVar.f116204a = videoItemParams.mAweme;
            lVar.f116208e = videoItemParams.mPageType;
            lVar.f116205b = videoItemParams.mEventType;
            lVar.f116206c = videoItemParams.mRequestId;
            lVar.f116207d = videoItemParams.isMyProfile;
        }
        Aweme aweme2 = lVar.f116204a;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        }
        lVar.f116211h = user;
        lVar.mo85501a(hashMap, lVar.f116211h);
        if (this.f113953L.getAuthor() != null) {
            String nickname = this.f113953L.getAuthor().getNickname();
            try {
                this.f116249b.setContentDescription(this.f113959R.getString(R.string.kl, nickname));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bVar2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2.equals("bind_follow_view") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r0.getStreamUrlModel() != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r2.equals("stopPlayAnimation") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        if (r2.equals("image_pause") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r3.mo85502b();
     */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80938c(final com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r9) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50339m.mo80938c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    /* renamed from: a */
    public final void mo85515a(int i, Map<String, Object> map) {
        Aweme aweme;
        String str;
        if (map == null) {
            aweme = this.f113953L;
            str = this.f113954M;
        } else {
            aweme = (Aweme) map.get("aweme_state");
            str = (String) map.get("event_type_state");
        }
        if (aweme == null) {
            C51423a.m95793c(4, "FeedAvatarView", "aweme is null. FollowStatus is :".concat(String.valueOf(i)));
        } else if (aweme.getAuthor() == null) {
            C51423a.m95793c(4, "FeedAvatarView", "author is null. AwemeId is :" + aweme.getAid() + ", FollowStatus is :" + i);
        } else {
            C51423a.m95793c(4, "FeedAvatarView", "AuthorUid is: " + aweme.getAuthorUid() + ", AwemeId is :" + aweme.getAid() + ", FollowStatus is :" + i);
            if (aweme.isDelete()) {
                this.f116249b.setVisibility(4);
                this.f116248a.setVisibility(4);
                C51423a.m95793c(4, "FeedAvatarView", "aweme is delete!updateFollowView!");
                return;
            }
            this.f116249b.clearAnimation();
            User author = aweme.getAuthor();
            int i2 = 8;
            if (C13627m.m24499a(author.getUid(), C31575b.m65865g().getCurUserId()) || C13627m.m24499a(str, "homepage_follow") || !aweme.isCanPlay()) {
                if (!C13627m.m24499a(str, "homepage_follow") || C13627m.m24499a(author.getUid(), C31575b.m65865g().getCurUserId()) || !aweme.isCanPlay() || i != 0) {
                    this.f116249b.setVisibility(4);
                } else {
                    this.f116249b.setAnimation("common_feed_anim_follow_people.json");
                    if (!C37699a.m76271aq(aweme)) {
                        AnimationImageView animationImageView = this.f116249b;
                        if (!C37699a.m76219V(aweme) && !aweme.isDelete()) {
                            i2 = 0;
                        }
                        animationImageView.setVisibility(i2);
                    }
                    this.f116249b.setProgress(0.0f);
                }
                if (!C37699a.m76320y(aweme) && (!author.isLive() || !C76657c.m134240a() || author.isBlock())) {
                    View$OnClickListenerC50326l lVar = this.f116250c;
                    if (lVar != null && lVar.f116212i != null) {
                        ((RelativeLayout.LayoutParams) this.f116250c.f116212i.getLayoutParams()).bottomMargin = (int) C13628n.m24520b(this.f113959R, 10.0f);
                        return;
                    }
                    return;
                }
                View$OnClickListenerC50326l lVar2 = this.f116250c;
                if (lVar2 != null && lVar2.f116213j != null) {
                    ((RelativeLayout.LayoutParams) this.f116250c.f116213j.getLayoutParams()).bottomMargin = (int) C13628n.m24520b(this.f113959R, 12.5f);
                    return;
                }
                return;
            }
            if (i == 0) {
                try {
                    if (this.f113953L == null || !this.f113953L.isImage()) {
                        if (C49557n.m92870b(aweme)) {
                        }
                    }
                    if (!C37699a.m76271aq(aweme)) {
                        this.f116249b.setImageDrawable(C0643b.m2369a(this.f113959R, 2131231735));
                        AnimationImageView animationImageView2 = this.f116249b;
                        if (!C37699a.m76219V(aweme) && !aweme.isDelete()) {
                            i2 = 0;
                        }
                        animationImageView2.setVisibility(i2);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (!this.f116251d) {
                this.f116249b.setVisibility(4);
            }
        }
    }
}
