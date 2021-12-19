package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p2082ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51462j;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51465k;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51524f;
import com.p2082ss.android.ugc.aweme.friends.widget.IndexView;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63849o;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.p2082ss.android.ugc.aweme.utils.C80227au;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ContactsActivity */
public class ContactsActivity extends ActivityC17312a implements AbstractC2597b, AbstractC39063h.AbstractC39067a, AbstractC39102c, AbstractC63854r, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    RecyclerView f118986a;

    /* renamed from: b */
    TextTitleBar f118987b;

    /* renamed from: c */
    DmtStatusView f118988c;

    /* renamed from: d */
    SwipeRefreshLayout f118989d;

    /* renamed from: e */
    ImageView f118990e;

    /* renamed from: f */
    RelativeLayout f118991f;

    /* renamed from: g */
    IndexView f118992g;

    /* renamed from: h */
    TextView f118993h;

    /* renamed from: i */
    public C51462j<Friend> f118994i;

    /* renamed from: j */
    C39101b<ThirdPartyFriendModel> f118995j;

    /* renamed from: k */
    public C63849o f118996k;

    /* renamed from: l */
    C51453d f118997l;

    /* renamed from: m */
    boolean f118998m;

    /* renamed from: n */
    public LinearLayoutManager f118999n;

    /* renamed from: o */
    public String f119000o = "";

    /* renamed from: p */
    public C51492c f119001p;

    /* renamed from: q */
    private int f119002q = 1;

    /* renamed from: r */
    private InviteContactFriendsModel f119003r;

    /* renamed from: s */
    private final C88411a f119004s = new C88411a();

    /* renamed from: t */
    private List<Friend> f119005t = new ArrayList();

    /* renamed from: u */
    private AbstractC51481b f119006u = new AbstractC51481b() {
        /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity.C516532 */

        static {
            Covode.recordClassIndex(61006);
        }

        /* renamed from: a */
        private static boolean m96318a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86985a(Friend friend) {
            C51465k kVar;
            ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            friend.setInvited(true);
            int a = ContactsActivity.this.f118994i.mo86939a(contactModel);
            if (!(a == -1 || (kVar = (C51465k) ContactsActivity.this.f118986a.mo4451f(a)) == null)) {
                kVar.mo86949c();
            }
            ContactsActivity.this.f119001p.mo87006a(C51492c.m95945a(ContactsActivity.this.f119001p.mo87007b(), "", "invitesinglesms", "find_contact_friends", true), new C51748s(this, C31575b.m65865g().getCurUser(), contactModel));
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86986a(String str, String str2, int i, int i2, boolean z) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m96318a();
            }
            if (!C58029j.f132256h) {
                new C79459a(ContactsActivity.this).mo123050a(R.string.dcq).mo123053a();
                return false;
            } else if (ContactsActivity.this.f118996k == null || ContactsActivity.this.f118996k.mo67842j()) {
                return false;
            } else {
                ContactsActivity.this.f118996k.mo87469a(new C63847n.C63848a().mo103320a(str).mo103325b(str2).mo103322a(z).mo103318a(i2).mo103324b(4).mo103327c(ContactsActivity.this.f119000o).mo103328d(i).mo103323a());
                return true;
            }
        }
    };

    static {
        Covode.recordClassIndex(61004);
    }

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

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "2474";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new RunnableC90250g(ContactsActivity.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        isDestroyed();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (!isDestroyed()) {
            this.f118994i.ao_();
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C65691a.m117584a(this);
        this.f119004s.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (!isDestroyed()) {
            this.f118989d.setRefreshing(false);
            this.f118994i.mo62377b_(null);
            this.f118994i.aq_();
            this.f118988c.mo27385g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        this.f118995j.mo57616a(4);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        C39101b<ThirdPartyFriendModel> bVar = this.f118995j;
        if (bVar != null) {
            bVar.ck_();
        }
        C63849o oVar = this.f118996k;
        if (oVar != null) {
            oVar.ck_();
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", true);
        super.onResume();
        if (this.f118998m) {
            if (C79519c.C79520a.f178475a.mo86983b()) {
                ((AbstractC51435a) C34505b.m70490a(this, AbstractC51435a.class)).mo60945a(false);
                if (C79519c.C79520a.f178475a.mo86982a()) {
                    mo87362d();
                } else {
                    C79519c.C79520a.m138231a(true);
                    this.f119004s.mo142945a(AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, true).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C51742m(this), C51743n.f119250a));
                }
            }
            this.f118998m = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo87362d() {
        C13628n.m24510a(this.f118988c, 0);
        this.f118988c.mo27384f();
        C51462j<Friend> jVar = new C51462j<>(this.f119006u);
        this.f118994i = jVar;
        jVar.f118620d = true;
        this.f118994i.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f118994i.mo67820g(C0643b.m2378c(this, R.color.c5));
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        this.f118999n = wrapLinearLayoutManager;
        wrapLinearLayoutManager.mo4356b(1);
        this.f118986a.setLayoutManager(this.f118999n);
        this.f118986a.setOverScrollMode(2);
        C51453d dVar = new C51453d(C0643b.m2378c(this, R.color.l), (int) C13628n.m24520b(this, 0.5f), 1, C13628n.m24520b(this, 20.0f), C13628n.m24520b(this, 20.0f));
        this.f118997l = dVar;
        this.f118986a.mo4402a(dVar);
        this.f118986a.setAdapter(this.f118994i);
        this.f119001p.mo87005a();
        this.f118989d.setEnabled(true);
        this.f118989d.setOnRefreshListener(new C51744o(this));
        C39101b<ThirdPartyFriendModel> bVar = new C39101b<>();
        this.f118995j = bVar;
        bVar.mo67839a_(this);
        ThirdPartyFriendModel thirdPartyFriendModel = new ThirdPartyFriendModel("contact", this.f119002q);
        thirdPartyFriendModel.isNewStyle = true;
        this.f118995j.mo67838a((AbstractC39085b) thirdPartyFriendModel);
        this.f118995j.mo57616a(1);
        C63849o oVar = new C63849o();
        this.f118996k = oVar;
        oVar.mo67839a_(this);
    }

    /* renamed from: a */
    private void m96301a(boolean z) {
        if (!z) {
            this.f118994i.mo67829d(false);
            this.f118994i.mo67813a((AbstractC39063h.AbstractC39067a) null);
            return;
        }
        this.f118994i.aq_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (!isDestroyed()) {
            this.f118989d.setRefreshing(false);
            if (this.f118994i.mo63369e() == null) {
                this.f118988c.mo27385g();
            }
        }
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
        C51465k kVar;
        if (!isDestroyed() && this.f118996k != null && this.f118994i != null) {
            C39143l.m79438a(C34729o.m70950a((Context) this), exc);
            int a = this.f118994i.mo86940a(this.f118996k.f144782d);
            if (a >= 0 && (kVar = (C51465k) this.f118986a.mo4451f(a)) != null) {
                kVar.mo86948b();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C51465k kVar;
        FollowStatus followStatus = followStatusEvent.status;
        if (!isDestroyed()) {
            this.f118994i.mo86942a(followStatus);
            int a = this.f118994i.mo86940a(followStatus.userId);
            if (a != -1 && (kVar = (C51465k) this.f118986a.mo4451f(a)) != null) {
                kVar.mo86948b();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C51736g(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.a1w);
        this.f118986a = (RecyclerView) findViewById(R.id.c_f);
        this.f118987b = (TextTitleBar) findViewById(R.id.eiz);
        this.f118988c = (DmtStatusView) findViewById(R.id.e7i);
        this.f118989d = (SwipeRefreshLayout) findViewById(R.id.dhb);
        this.f118990e = (ImageView) findViewById(R.id.a6x);
        this.f118991f = (RelativeLayout) findViewById(R.id.avz);
        this.f118992g = (IndexView) findViewById(R.id.bmt);
        this.f118993h = (TextView) findViewById(R.id.bmn);
        View findViewById = findViewById(R.id.aw0);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC51737h(this));
        }
        View findViewById2 = findViewById(R.id.a6x);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC51740k(this));
        }
        ContactsActivityArgs contactsActivityArgs = (ContactsActivityArgs) RouteArgExtension.INSTANCE.navArg(this, C51741l.f119248a).getValue();
        EventBus.m156966a(EventBus.m156962a(), this);
        if (contactsActivityArgs != null) {
            this.f119000o = contactsActivityArgs.getEnterFrom();
        }
        this.f119002q = getIntent().getIntExtra("scene", this.f119002q);
        User curUser = C31575b.m65865g().getCurUser();
        if (SharePrefCache.inst().getHasEnterBindPhone().mo59941c().booleanValue() || curUser.isPhoneBinded()) {
            this.f118991f.setVisibility(8);
        } else {
            this.f118991f.setVisibility(0);
        }
        this.f118987b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity.C516521 */

            static {
                Covode.recordClassIndex(61005);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                ContactsActivity.this.onBackPressed();
            }
        });
        this.f118987b.setTitle(getText(R.string.d46));
        TextTitleBar textTitleBar = this.f118987b;
        textTitleBar.setTitleColor(C0643b.m2378c(textTitleBar.getContext(), R.color.bx));
        if (C61542b.m111469c(4)) {
            C61542b.m111470d(4);
            AbstractC81915c.m141874a(new C61561m(4));
        }
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(this).mo27397a();
        MtEmptyView a2 = MtEmptyView.m31926a(this);
        a2.setStatus(new C17273d.C17274a(this).mo27457a(2131232651).mo27462b(R.string.cvn).mo27464c(R.string.bmp).f41365a);
        a.mo27406b(a2);
        this.f118988c.setBuilder(a);
        this.f119003r = new InviteContactFriendsModel("contact", this.f119002q);
        this.f119001p = new C51492c(this.f119003r, null);
        if (C79519c.C79520a.f178475a.mo86984c()) {
            mo87362d();
        } else {
            this.f119004s.mo142945a(C79515b.m138229a(this, ContactUFR.class, C80580in.m139683b().getUid(), "find_friends_page", "click", true, true, null).mo143289d(new C51745p(this)));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m96300a(List<Friend> list, int i) {
        for (int i2 = i; i2 < list.size(); i2++) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    if (TextUtils.equals(list.get(i2).getSection(), list.get(i3).getSection())) {
                        list.get(i2).setSection("");
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List list, boolean z) {
        if (!isDestroyed()) {
            this.f118994i.aq_();
            this.f118994i.mo62376b(list);
            this.f118988c.setVisibility(4);
            m96301a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List list, boolean z) {
        if (!isDestroyed()) {
            final int i = 0;
            this.f118989d.setRefreshing(false);
            if (list == null || list.isEmpty()) {
                this.f118988c.mo27385g();
                return;
            }
            this.f118994i.mo67829d(true);
            this.f118994i.aq_();
            this.f118988c.mo27382d();
            if (this.f118994i.f118620d) {
                C51524f fVar = new C51524f();
                C89219l.m154721d(list, "");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (!TextUtils.isEmpty(user.getUid())) {
                        arrayList.add(user);
                        it.remove();
                    }
                }
                fVar.f118735a = arrayList.size();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Friend friend = (Friend) it2.next();
                    friend.setSection(C80227au.m139057a(friend.getNickname()));
                }
                fVar.mo87025a(list);
                list.addAll(0, arrayList);
                this.f118994i.mo86941a((SectionIndexer) fVar.mo87024a());
                this.f118994i.f118621e = fVar.f118735a;
                m96300a(list, fVar.f118735a);
                List<String> list2 = fVar.f118736b;
                List<Integer> list3 = fVar.f118737c;
                int i2 = fVar.f118735a;
                if (C80398en.m139371b()) {
                    this.f118992g.setVisibility(0);
                    IndexView indexView = this.f118992g;
                    indexView.f119286a.clear();
                    indexView.f119287b.clear();
                    indexView.f119286a.addAll(list2);
                    indexView.f119287b.addAll(list3);
                    indexView.requestLayout();
                    this.f118992g.setIndexLetterTv(this.f118993h);
                    if (i2 > 0) {
                        i = 0 + i2 + 2;
                    }
                    this.f118992g.setOnLetterTouchListener(new C51746q(this, i));
                    this.f118986a.mo4452f();
                    this.f118986a.mo4405a(new RecyclerView.AbstractC1371n() {
                        /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity.C516543 */

                        static {
                            Covode.recordClassIndex(61007);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                        /* renamed from: a */
                        public final void mo4753a(RecyclerView recyclerView, int i) {
                            super.mo4753a(recyclerView, i);
                            ContactsActivity.this.f118992g.setRecycleViewPos(ContactsActivity.this.f118999n.mo4371k() - i);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                        /* renamed from: a */
                        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                            super.mo4754a(recyclerView, i, i2);
                        }
                    });
                } else {
                    this.f118992g.setVisibility(8);
                }
            }
            this.f118994i.mo62377b_(list);
            this.f118988c.setVisibility(8);
            m96301a(z);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C80611a.m139766a(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
