package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p2082ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51452c;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51460h;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51462j;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51465k;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
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

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity */
public class InviteFriendsActivity extends ActivityC17312a implements AbstractC2597b, AbstractC39063h.AbstractC39067a, AbstractC39102c<Friend>, C51492c.AbstractC51493a, AbstractC90252i, AbstractC90253j {

    /* renamed from: n */
    private static String f119053n = "invite_friends";

    /* renamed from: a */
    RecyclerView f119054a;

    /* renamed from: b */
    TextTitleBar f119055b;

    /* renamed from: c */
    DmtStatusView f119056c;

    /* renamed from: d */
    SwipeRefreshLayout f119057d;

    /* renamed from: e */
    View f119058e;

    /* renamed from: f */
    View f119059f;

    /* renamed from: g */
    ShareChannelBar f119060g;

    /* renamed from: h */
    C51492c f119061h;

    /* renamed from: i */
    public C51462j<Friend> f119062i;

    /* renamed from: j */
    C39101b<InviteContactFriendsModel> f119063j;

    /* renamed from: k */
    C51453d f119064k;

    /* renamed from: l */
    public boolean f119065l;

    /* renamed from: m */
    public List<Friend> f119066m = new ArrayList();

    /* renamed from: o */
    private View f119067o;

    /* renamed from: p */
    private InviteContactFriendsModel f119068p;

    /* renamed from: q */
    private int f119069q = 1;

    /* renamed from: r */
    private C51460h f119070r;

    /* renamed from: s */
    private float f119071s;

    /* renamed from: t */
    private ValueAnimator f119072t;

    /* renamed from: u */
    private AbstractC51481b f119073u = new AbstractC51481b() {
        /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteFriendsActivity.C516684 */

        static {
            Covode.recordClassIndex(61026);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86986a(String str, String str2, int i, int i2, boolean z) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b
        /* renamed from: a */
        public final boolean mo86985a(Friend friend) {
            C51465k kVar;
            if (InviteFriendsActivity.this.f119066m.contains(friend)) {
                return false;
            }
            InviteFriendsActivity.this.f119066m.add(friend);
            ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            InviteFriendsActivity inviteFriendsActivity = InviteFriendsActivity.this;
            inviteFriendsActivity.f119061h.mo87006a(C51492c.m95945a(inviteFriendsActivity.f119061h.mo87007b(), "", "invitesinglesms", "invite_friends", true), new C51676ad(inviteFriendsActivity, C31575b.m65865g().getCurUser(), contactModel));
            friend.setInvited(true);
            InviteFriendsActivity.this.f119066m.remove(friend);
            int a = InviteFriendsActivity.this.f119062i.mo86939a(contactModel) + 1;
            if (!(a == -1 || (kVar = (C51465k) InviteFriendsActivity.this.f119054a.mo4451f(a)) == null)) {
                kVar.mo86949c();
            }
            C39162r.m79460a("invite_friend_click", new C33744d().mo59983a("enter_from", "invite_friends").f79943a);
            return true;
        }
    };

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "6234";
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
    public final void mo59523c(List<Friend> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(287, new RunnableC90250g(InviteFriendsActivity.class, "onSyncContactStatusEvent", SyncContactStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(233, new RunnableC90250g(InviteFriendsActivity.class, "onBackFromPermissionSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        isDestroyed();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C65691a.m117584a(this);
    }

    static {
        Covode.recordClassIndex(61022);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (!isDestroyed()) {
            this.f119062i.ao_();
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        ValueAnimator valueAnimator = this.f119072t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f119072t.cancel();
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

    /* renamed from: d */
    public final void mo87401d() {
        C13628n.m24510a(this.f119059f, 0);
        C13628n.m24510a(this.f119058e, 0);
        C13628n.m24510a(this.f119060g, 0);
        InviteFriendSharePackage a = InviteFriendSharePackage.C68820a.m121291a(this.f119061h);
        C69684e.C69686b bVar = new C69684e.C69686b();
        C68863ah.f154027a.mo109409a(bVar, (Activity) this, true);
        bVar.mo109824a(a).mo109823a(new C69109b());
        C69684e a2 = bVar.mo109831a();
        if (a2.f155552d) {
            Iterator<AbstractC69581b> it = a2.f155549a.iterator();
            while (it.hasNext()) {
                if (!it.next().mo109557b(this)) {
                    it.remove();
                }
            }
        }
        this.f119060g.mo109818a(a2.f155549a);
        this.f119060g.mo109817a(new C51674ab(this, a));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (!isDestroyed()) {
            this.f119057d.setRefreshing(false);
            this.f119062i.mo62377b_(null);
            this.f119062i.aq_();
            this.f119056c.setVisibility(0);
            this.f119056c.mo27385g();
            if (this.f119060g.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f119056c.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C13628n.m24520b(this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f119056c.setLayoutParams(marginLayoutParams);
            }
            C13628n.m24510a(this.f119057d, 0);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", true);
        super.onResume();
        if (this.f119065l) {
            this.f119065l = false;
            if (C80241be.m139079a(this)) {
                ((AbstractC51435a) C34505b.m70490a(this, AbstractC51435a.class)).mo60945a(false);
                if (C51648a.f118980a.mo87325e()) {
                    mo87402h();
                    mo87401d();
                } else {
                    C51648a.f118980a.mo87308a("invite_friends", true);
                }
            } else {
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", false);
    }

    /* renamed from: h */
    public final void mo87402h() {
        int i;
        C13628n.m24510a(this.f119056c, 0);
        this.f119056c.mo27384f();
        C51462j<Friend> jVar = new C51462j<>(this.f119073u);
        this.f119062i = jVar;
        jVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f119062i.mo67820g(C0643b.m2378c(this, R.color.c5));
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        this.f119054a.setLayoutManager(wrapLinearLayoutManager);
        this.f119054a.setOverScrollMode(2);
        View a = C1764a.m5927a(LayoutInflater.from(this), R.layout.a28, this.f119054a, false);
        this.f119067o = a;
        this.f119062i.mo61480a(a);
        this.f119058e = this.f119067o.findViewById(R.id.bpx);
        this.f119059f = this.f119067o.findViewById(R.id.bq6);
        this.f119060g = (ShareChannelBar) this.f119067o.findViewById(R.id.cej);
        C51453d dVar = new C51453d(C0643b.m2378c(this, R.color.l), (int) C13628n.m24520b(this, 0.5f), 1, C13628n.m24520b(this, 20.0f), C13628n.m24520b(this, 20.0f));
        this.f119064k = dVar;
        this.f119054a.mo4402a(dVar);
        this.f119054a.setAdapter(this.f119062i);
        View view = this.f119058e;
        Resources resources = getResources();
        if (C17175b.m31708b(null)) {
            i = R.color.b2;
        } else {
            i = R.color.a0;
        }
        view.setBackgroundColor(resources.getColor(i));
        this.f119057d.setOnRefreshListener(new C51675ac(this));
        C39101b<InviteContactFriendsModel> bVar = new C39101b<>();
        this.f119063j = bVar;
        bVar.mo67839a_(this);
        this.f119063j.mo67838a((AbstractC39085b) this.f119068p);
        this.f119063j.mo57616a(1);
        this.f119061h.mo87005a();
        this.f119071s = C13628n.m24520b(this, 84.0f);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onBackFromPermissionSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        if ("invite_friends".equals(backFromSettingEvent.enterFrom)) {
            this.f119065l = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onSyncContactStatusEvent(SyncContactStatusEvent syncContactStatusEvent) {
        if ("invite_friends".equals(syncContactStatusEvent.enterFrom) && syncContactStatusEvent.isSuccess && !syncContactStatusEvent.lastValue) {
            mo87402h();
            mo87401d();
        }
    }

    /* renamed from: a */
    private void m96333a(boolean z) {
        if (!z) {
            this.f119062i.mo67829d(false);
            this.f119062i.mo67813a((AbstractC39063h.AbstractC39067a) null);
            return;
        }
        this.f119062i.aq_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (!isDestroyed()) {
            this.f119057d.setRefreshing(false);
            if (this.f119062i.mo63369e() == null) {
                this.f119056c.setVisibility(0);
                this.f119056c.mo27385g();
                if (this.f119060g.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f119056c.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C13628n.m24520b(this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.f119056c.setLayoutParams(marginLayoutParams);
                }
            }
            C13628n.m24510a(this.f119057d, 0);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(android.os.Bundle r22) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteFriendsActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m96332a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m96331a(Context context, String str) {
        Intent intent = new Intent(context, InviteFriendsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            this.f119062i.aq_();
            this.f119062i.mo62376b(list);
            this.f119056c.setVisibility(4);
            m96333a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            this.f119057d.setRefreshing(false);
            if (list == null) {
                this.f119056c.setVisibility(0);
            } else {
                this.f119062i.aq_();
                List<String> list2 = ((InviteContactFriendsModel) this.f119063j.f92286h).mIndexLetters;
                List<Integer> list3 = ((InviteContactFriendsModel) this.f119063j.f92286h).mIndexCounts;
                C51460h hVar = this.f119070r;
                if (hVar != null) {
                    this.f119054a.mo4425c(hVar);
                    this.f119070r = null;
                }
                if (!list2.isEmpty() && !list3.isEmpty()) {
                    int[] iArr = new int[list3.size()];
                    for (int i = 0; i < list3.size(); i++) {
                        iArr[i] = list3.get(i).intValue();
                    }
                    String[] strArr = new String[list2.size()];
                    list2.toArray(strArr);
                    C51452c cVar = new C51452c(strArr, iArr);
                    C51460h hVar2 = new C51460h(this, cVar, this.f119062i.mo61484d());
                    this.f119070r = hVar2;
                    this.f119054a.mo4402a(hVar2);
                    this.f119062i.mo86941a((SectionIndexer) cVar);
                }
                this.f119062i.mo62377b_(list);
                this.f119056c.mo27382d();
                this.f119056c.setVisibility(4);
                m96333a(z);
            }
            C13628n.m24510a(this.f119057d, 0);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C80611a.m139766a(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
