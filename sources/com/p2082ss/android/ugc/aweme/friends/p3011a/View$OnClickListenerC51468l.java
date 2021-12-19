package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.a.l */
public final /* synthetic */ class View$OnClickListenerC51468l implements View.OnClickListener {

    /* renamed from: a */
    private final C51465k f118652a;

    static {
        Covode.recordClassIndex(60727);
    }

    View$OnClickListenerC51468l(C51465k kVar) {
        this.f118652a = kVar;
    }

    public final void onClick(View view) {
        Friend a;
        C59256u.EnumC59257a aVar;
        boolean z;
        ClickAgent.onClick(view);
        C51465k kVar = this.f118652a;
        if (kVar.f118635c != null) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = C51465k.m95865a();
            }
            if (!C58029j.f132256h && kVar.f118633a) {
                new C79459a(kVar.f118634b).mo123050a(R.string.dcq).mo123053a();
            } else if (kVar.f118641i.f118778a && kVar.f118635c.getFollowStatus() == 2) {
                T t = kVar.f118635c;
                NoticeServiceImpl.m112566f().mo99377a(kVar.f118634b, t, "message", null, true);
                C59256u q = new C59256u().mo96834a("find_friends_page").mo96839q(kVar.f118648p);
                q.f135350a = C59256u.EnumC59259c.CARD;
                q.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                q.mo96832a(t).mo96841s(t.getRequestId()).mo96792f();
            } else if (!TextUtils.isEmpty(kVar.f118635c.getUid())) {
                if (kVar.f118635c.getFollowStatus() == 0) {
                    C39162r.onEvent(MobClick.obtain().setEventName("follow").setLabelName(C51465k.m95864a(kVar.f118636d)).setValue(kVar.f118635c.getUid()).setJsonObject(new C39163s().mo67941a("nt", "4").mo67942a()));
                    C51488a.m95928b(kVar.f118635c, kVar.f118646n, "", kVar.mo86950d());
                } else if (kVar.f118635c.getFollowStatus() == 1 || kVar.f118635c.getFollowStatus() == 4) {
                    C39162r.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(C51465k.m95864a(kVar.f118636d)).setValue(kVar.f118635c.getUid()));
                    C51488a.m95936c(kVar.f118635c, kVar.f118646n, "", kVar.mo86950d());
                }
                C59256u q2 = new C59256u().mo96834a("find_friends_page").mo96839q(kVar.f118648p);
                q2.f135350a = C59256u.EnumC59259c.CARD;
                if (kVar.f118635c.getFollowStatus() == 0) {
                    aVar = C59256u.EnumC59257a.FOLLOW;
                } else {
                    aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
                }
                q2.f135352b = aVar;
                q2.mo96832a(kVar.f118635c).mo96841s(kVar.f118635c.getRequestId()).mo96792f();
                if (kVar.f118637e != null) {
                    AbstractC51481b bVar = kVar.f118637e;
                    String uid = kVar.f118635c.getUid();
                    String secUid = kVar.f118635c.getSecUid();
                    int followerStatus = kVar.f118635c.getFollowerStatus();
                    int i = kVar.f118635c.getFollowStatus() == 0 ? 1 : 0;
                    if (kVar.f118635c.isSecret() || kVar.f118635c.isPrivateAccount()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo86986a(uid, secUid, followerStatus, i, z);
                }
            } else if (kVar.f118636d == 0 && (a = C51465k.m95863a(kVar.f118635c)) != null && !a.isInvited()) {
                C39162r.m79460a("invite_friend", new C33744d().mo59983a("enter_from", C51465k.m95864a(kVar.f118636d)).f79943a);
                C51488a.m95914a("find_friends_page", "contact", (String) null, (String) null);
                kVar.f118637e.mo86985a(a);
            }
        }
    }
}
