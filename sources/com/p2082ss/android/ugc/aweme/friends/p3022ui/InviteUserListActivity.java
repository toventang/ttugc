package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.friends.model.FacebookFriends;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51462j;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51465k;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63849o;
import com.p2082ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.p4373c.p4374a.C85079a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity */
public class InviteUserListActivity extends ActivityC17312a implements AbstractC20884a, AbstractC39063h.AbstractC39067a, AbstractC39102c<Friend>, C51492c.AbstractC51493a, AbstractC63854r, AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public static final Float f119078d = Float.valueOf(88.0f);

    /* renamed from: p */
    private static final boolean f119079p = false;

    /* renamed from: a */
    public boolean f119080a;

    /* renamed from: b */
    public C39101b<AbstractC51490a> f119081b;

    /* renamed from: c */
    public C63849o f119082c;

    /* renamed from: e */
    ButtonTitleBar f119083e;

    /* renamed from: f */
    TextView f119084f;

    /* renamed from: g */
    DmtStatusView f119085g;

    /* renamed from: h */
    SwipeRefreshLayout f119086h;

    /* renamed from: i */
    RecyclerView f119087i;

    /* renamed from: j */
    TextView f119088j;

    /* renamed from: k */
    View f119089k;

    /* renamed from: l */
    int f119090l = 3;

    /* renamed from: m */
    public String f119091m;

    /* renamed from: n */
    String f119092n;

    /* renamed from: o */
    String f119093o = "";

    /* renamed from: q */
    private C51462j f119094q;

    /* renamed from: r */
    private C51453d f119095r;

    /* renamed from: s */
    private C20919d f119096s;

    /* renamed from: t */
    private C88411a f119097t = new C88411a();

    /* renamed from: u */
    private String f119098u = "";

    /* renamed from: v */
    private int f119099v = 1;

    /* renamed from: w */
    private String f119100w;

    /* renamed from: x */
    private C69684e f119101x;

    /* renamed from: y */
    private InviteFriendSharePackage f119102y;

    /* renamed from: z */
    private AbstractC51481b f119103z = new AbstractC51481b() {
        /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteUserListActivity.C516702 */

        static {
            Covode.recordClassIndex(61029);
        }

        /* renamed from: a */
        private static boolean m96376a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        private static boolean m96377b() {
            if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132256h;
            }
            boolean a = m96376a();
            C58029j.f132256h = a;
            return a;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86985a(Friend friend) {
            if (!m96377b()) {
                new C79459a(InviteUserListActivity.this).mo123050a(R.string.dcq).mo123053a();
                return false;
            } else if (InviteUserListActivity.this.f119080a) {
                return false;
            } else {
                InviteUserListActivity.this.f119080a = true;
                return true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86986a(String str, String str2, int i, int i2, boolean z) {
            if (!m96377b()) {
                new C79459a(InviteUserListActivity.this).mo123050a(R.string.dcq).mo123053a();
                return false;
            } else if (InviteUserListActivity.this.f119081b == null || InviteUserListActivity.this.f119082c.mo67842j()) {
                return false;
            } else {
                InviteUserListActivity.this.f119082c.mo87469a(new C63847n.C63848a().mo103320a(str).mo103325b(str2).mo103322a(z).mo103318a(i2).mo103327c(InviteUserListActivity.this.f119091m).mo103328d(i).mo103323a());
                return true;
            }
        }
    };

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Friend> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new RunnableC90250g(InviteUserListActivity.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (!isDestroyed()) {
            this.f119094q.ao_();
        }
    }

    static {
        Covode.recordClassIndex(61027);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        if (!isDestroyed()) {
            this.f119081b.mo57616a(4);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C39101b<AbstractC51490a> bVar = this.f119081b;
        if (bVar != null) {
            bVar.ck_();
        }
        C63849o oVar = this.f119082c;
        if (oVar != null) {
            oVar.ck_();
        }
        this.f119097t.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87405a() {
        C69684e eVar = this.f119101x;
        if (eVar != null && this.f119102y != null && eVar.f155549a.size() > 0) {
            AbstractC69581b bVar = this.f119101x.f155549a.get(0);
            if (!this.f119102y.mo109321a(bVar, this)) {
                bVar.mo61913a(this.f119102y.mo87088a(bVar), this);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (!isDestroyed()) {
            if (this.f119094q.mo60933c() == 0) {
                this.f119086h.setRefreshing(false);
                this.f119085g.setVisibility(0);
                this.f119085g.mo27384f();
                return;
            }
            this.f119086h.setRefreshing(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (!isDestroyed()) {
            this.f119085g.setVisibility(0);
            this.f119085g.mo27385g();
            this.f119086h.setRefreshing(false);
            if (this.f119094q.f92274v) {
                this.f119094q.mo67829d(false);
                this.f119094q.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C36125t.m73596a(C36125t.m73591a(), this, C36131u.m73602a("aweme://main").mo63248a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").f85356a.mo52126a());
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: h */
    private C69652m m96357h() {
        User curUser = C31575b.m65865g().getCurUser();
        String a = C1764a.m5928a(getString(R.string.cnm), new Object[]{C80580in.m139684b(curUser)});
        return new C69652m(a + " " + ("https://tiktokv.com/invitef/download"), (byte) 0);
    }

    /* renamed from: c */
    public final void mo87406c() {
        int i = this.f119090l;
        if (i == 3) {
            ThirdPartyFriendModel thirdPartyFriendModel = new ThirdPartyFriendModel("facebook", this.f119092n, null, Long.valueOf(C79519c.C79521b.f178476a.mo86995d(this.f119093o)), this.f119099v);
            thirdPartyFriendModel.isNewStyle = true;
            this.f119081b.mo67838a((AbstractC39085b) thirdPartyFriendModel);
        } else if (i == 2) {
            ThirdPartyFriendModel thirdPartyFriendModel2 = new ThirdPartyFriendModel("twitter", this.f119092n, this.f119100w);
            thirdPartyFriendModel2.isNewStyle = true;
            this.f119081b.mo67838a((AbstractC39085b) thirdPartyFriendModel2);
        } else if (i == 4) {
            ThirdPartyFriendModel thirdPartyFriendModel3 = new ThirdPartyFriendModel("vk", this.f119092n, this.f119100w);
            thirdPartyFriendModel3.isNewStyle = true;
            this.f119081b.mo67838a((AbstractC39085b) thirdPartyFriendModel3);
        } else {
            return;
        }
        this.f119081b.mo57616a(1);
        C63849o oVar = new C63849o();
        this.f119082c = oVar;
        oVar.mo67839a_(this);
        this.f119080a = false;
    }

    /* renamed from: d */
    private void m96356d() {
        int i = this.f119090l;
        if (i == 2) {
            C39162r.m79460a("friend_list_notify_show", new C33744d().mo59983a("enter_from", "twitter").f79943a);
            C20886c.C20887a aVar = new C20886c.C20887a(this);
            aVar.f49390a = "twitter";
            aVar.f49392c = this;
            C20919d.m39340a(aVar.mo34322a());
        } else if (i == 3) {
            C39162r.m79460a("friend_list_notify_show", new C33744d().mo59983a("enter_from", "facebook").f79943a);
            this.f119097t.mo142945a(C79515b.m138229a(this, C79496a.class, this.f119093o, "find_friends_page", "click", true, false, null).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C51685am(this)));
        } else if (i == 4) {
            C39162r.m79460a("friend_list_notify_show", new C33744d().mo59983a("enter_from", "vk").f79943a);
            C20886c.C20887a aVar2 = new C20886c.C20887a(this);
            aVar2.f49390a = "vk";
            aVar2.f49392c = this;
            C20919d.m39340a(aVar2.mo34322a());
        }
    }

    /* renamed from: a */
    private void m96355a(boolean z) {
        if (!z) {
            this.f119094q.mo67829d(false);
            this.f119094q.mo67813a((AbstractC39063h.AbstractC39067a) null);
            return;
        }
        this.f119094q.aq_();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("to_user_id", followStatus.userId).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("to_user_id", followStatus.userId).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        if (!isDestroyed() && this.f119082c != null && this.f119094q != null) {
            C39143l.m79438a(C34729o.m70950a((Context) this), exc);
            int b = this.f119094q.mo86943b(this.f119082c.f144782d);
            if (b >= 0) {
                try {
                    C51465k kVar = (C51465k) this.f119087i.mo4451f(b);
                    if (kVar != null) {
                        kVar.mo86948b();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus = followStatusEvent.status;
        if (!isDestroyed()) {
            this.f119094q.mo86942a(followStatus);
            int b = this.f119094q.mo86943b(followStatus.userId);
            if (b != -1) {
                try {
                    C51465k kVar = (C51465k) this.f119087i.mo4451f(b);
                    if (kVar != null) {
                        kVar.mo86948b();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 3002047) {
            C51648a.f118980a.mo87327g().mo86992b(this.f119093o);
        }
        if (!isDestroyed()) {
            this.f119085g.setVisibility(0);
            this.f119085g.mo27385g();
            if (this.f119094q.f92274v) {
                this.f119094q.mo67829d(false);
                this.f119094q.notifyDataSetChanged();
            }
            this.f119086h.setRefreshing(false);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.bpt) {
            int i = this.f119090l;
            if (i == 3) {
                C39162r.m79460a("invite_friend", new C33744d().mo59983a("enter_from", "facebook").f79943a);
                mo87405a();
            } else if (i == 2) {
                C39162r.m79460a("invite_friend", new C33744d().mo59983a("enter_from", "twitter").f79943a);
                AbstractC69581b a = C69583c.m122807a("twitter", null);
                if (a != null) {
                    a.mo109551a(m96357h(), (Context) this);
                }
            } else if (i == 4) {
                C39162r.m79460a("invite_friend", new C33744d().mo59983a("enter_from", "vk").f79943a);
                AbstractC69581b a2 = C69583c.m122807a("vk", null);
                if (a2 != null) {
                    a2.mo109551a(m96357h(), (Context) this);
                }
            }
        } else if (view.getId() == R.id.dk5) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20884a
    /* renamed from: a */
    public final void mo34320a(AuthResult authResult) {
        if (!isDestroyed()) {
            if (!authResult.f49367a) {
                if (!authResult.f49368b) {
                    new C23144b(this).mo37640e(R.string.cnj).mo37637b();
                }
                this.f119086h.setRefreshing(false);
                finish();
                return;
            }
            String str = authResult.f49370d;
            str.hashCode();
            if (!str.equals("twitter")) {
                if (str.equals("vk")) {
                    this.f119092n = authResult.f49372f;
                    mo87406c();
                }
            } else if (TextUtils.isEmpty(authResult.f49372f) || TextUtils.isEmpty(authResult.f49373g)) {
                new C23144b(this).mo37640e(R.string.cnj).mo37637b();
            } else {
                C39162r.m79460a("friend_list_notify_confirm", new C33744d().mo59983a("enter_from", "twitter").f79943a);
                this.f119092n = authResult.f49372f;
                String str2 = authResult.f49373g;
                this.f119100w = str2;
                C85079a.m146284c(this.f119092n, str2);
                mo87406c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (!isDestroyed()) {
            this.f119094q.mo67823i();
            if (exc != null && (exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 101) {
                m96356d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x024d  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
        // Method dump skipped, instructions count: 779
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteUserListActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m96354a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            m96355a(z);
            this.f119094q.mo62376b(list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            this.f119085g.mo27382d();
            this.f119085g.setVisibility(8);
            this.f119086h.setRefreshing(false);
            this.f119094q.mo67829d(true);
            if (!list.isEmpty()) {
                list.add(0, new FacebookFriends(1));
                list.add(new FacebookFriends(2));
            }
            this.f119094q.mo62377b_(list);
            m96355a(z);
        }
    }
}
