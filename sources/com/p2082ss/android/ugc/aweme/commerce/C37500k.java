package com.p2082ss.android.ugc.aweme.commerce;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.p2415c.C35130a;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.influencer.ECommerceRNToLynxConfigService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commerce.k */
public final class C37500k extends AbstractC64118co implements AbstractC17046h.AbstractC17048b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f88510a = {new C89225r(C37500k.class, "currentVisibleState", "getCurrentVisibleState()Lcom/ss/android/ugc/aweme/commerce/ShopTabFragment$VisibleState;", 0), new C89225r(C37500k.class, "secUserId", "getSecUserId()Ljava/lang/String;", 0)};

    /* renamed from: e */
    public static final C37503c f88511e = new C37503c((byte) 0);

    /* renamed from: b */
    public boolean f88512b;

    /* renamed from: c */
    LynxView f88513c;

    /* renamed from: d */
    public BulletContainerView f88514d;

    /* renamed from: j */
    private boolean f88515j;

    /* renamed from: k */
    private FrameLayout f88516k;

    /* renamed from: l */
    private boolean f88517l;

    /* renamed from: m */
    private boolean f88518m;

    /* renamed from: n */
    private final AbstractC89249e f88519n;

    /* renamed from: o */
    private final AbstractC89249e f88520o = new C37502b("", "", this);

    /* renamed from: p */
    private String f88521p = "";

    /* renamed from: q */
    private String f88522q = "";

    /* renamed from: r */
    private String f88523r = ECommerceRNToLynxConfigService.m102576b().mo93515a();

    /* renamed from: s */
    private String f88524s = "";

    /* renamed from: t */
    private int f88525t;

    /* renamed from: u */
    private View f88526u;

    /* renamed from: v */
    private SparseArray f88527v;

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$d */
    public enum EnumC37504d {
        INIT,
        SHOW_BY_RESUME,
        SHOW_BY_USER_VISIBLE_HINT,
        HIDE;

        static {
            Covode.recordClassIndex(44891);
        }
    }

    static {
        Covode.recordClassIndex(44887);
    }

    /* renamed from: a */
    private final void m75607a(EnumC37504d dVar) {
        this.f88519n.mo143655a(f88510a[0], dVar);
    }

    /* renamed from: b */
    private final void m75608b(String str) {
        this.f88520o.mo143655a(f88510a[1], str);
    }

    /* renamed from: i */
    private final EnumC37504d m75610i() {
        return (EnumC37504d) this.f88519n.mo23374a(this, f88510a[0]);
    }

    /* renamed from: j */
    private final String m75611j() {
        return (String) this.f88520o.mo23374a(this, f88510a[1]);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(78, new RunnableC90250g(C37500k.class, "onJsBroadcastEvent", C35130a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(36, new RunnableC90250g(C37500k.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$c */
    public static final class C37503c {
        static {
            Covode.recordClassIndex(44890);
        }

        private C37503c() {
        }

        public /* synthetic */ C37503c(byte b) {
            this();
        }

        /* renamed from: a */
        public static C37500k m75626a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C37500k kVar = new C37500k();
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$e */
    public static final class C37505e implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f88533a;

        /* renamed from: b */
        private final String f88534b = "profile_ios_on_show_event";

        /* renamed from: c */
        private final Object f88535c;

        static {
            Covode.recordClassIndex(44892);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f88534b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f88535c;
        }

        C37505e(C89233z.C89238e eVar) {
            this.f88533a = eVar;
            this.f88535c = eVar.element;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$f */
    public static final class C37506f implements AbstractC17018b {
        static {
            Covode.recordClassIndex(44893);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
        /* renamed from: p */
        public final boolean mo26883p() {
            return true;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
        /* renamed from: q */
        public final boolean mo26884q() {
            return true;
        }

        C37506f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$g */
    public static final class C37507g implements AbstractC16191p {

        /* renamed from: a */
        private final String f88536a = "profile_ios_on_hide_event";

        /* renamed from: b */
        private final Object f88537b;

        static {
            Covode.recordClassIndex(44894);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f88536a;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f88537b;
        }

        C37507g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$i */
    public static final class C37509i implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ FollowStatus f88540a;

        /* renamed from: b */
        private final String f88541b = "follow_status_update";

        /* renamed from: c */
        private final Object f88542c;

        static {
            Covode.recordClassIndex(44896);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f88541b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f88542c;
        }

        C37509i(FollowStatus followStatus) {
            this.f88540a = followStatus;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("follow_status", followStatus.followStatus);
            this.f88542c = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$j */
    public static final class C37510j implements AbstractC16191p {

        /* renamed from: a */
        private final String f88543a = "viewAppeared";

        /* renamed from: b */
        private final Object f88544b;

        static {
            Covode.recordClassIndex(44897);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f88543a;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f88544b;
        }

        C37510j() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    public final void mo65249a(String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            m75608b(str2);
        }
        if (str != null && str.length() != 0) {
            this.f88524s = str;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        if (iVar.mo25769b() == EnumC16723b.LYNX) {
            Object g = C89070n.m154583g((List) list);
            C17029d dVar = (C17029d) g;
            LynxView lynxView = null;
            if (!((dVar != null ? dVar.f40551a : null) instanceof LynxView)) {
                g = null;
            }
            C17029d dVar2 = (C17029d) g;
            if (dVar2 != null) {
                T t = dVar2.f40551a;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
                lynxView = (LynxView) t;
            }
            this.f88513c = lynxView;
            if (m75609h() && !this.f88517l) {
                mo65247a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f88527v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        m75607a(EnumC37504d.HIDE);
    }

    /* renamed from: h */
    private final boolean m75609h() {
        if (m75610i() == EnumC37504d.SHOW_BY_USER_VISIBLE_HINT || m75610i() == EnumC37504d.SHOW_BY_RESUME) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65247a() {
        LynxView lynxView = this.f88513c;
        if (lynxView != null) {
            this.f88517l = true;
            lynxView.onEnterForeground();
        }
    }

    /* renamed from: c */
    public final boolean mo65252c() {
        String j = m75611j();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
        C89219l.m154716b(currentUser, "");
        return C89219l.m154714a((Object) j, (Object) currentUser.getSecUid());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BulletContainerView bulletContainerView = this.f88514d;
        if (bulletContainerView != null) {
            bulletContainerView.onEvent(new C37510j());
        }
        if (getUserVisibleHint()) {
            m75607a(EnumC37504d.SHOW_BY_RESUME);
        }
    }

    public C37500k() {
        EnumC37504d dVar = EnumC37504d.INIT;
        this.f88519n = new C37501a(dVar, dVar, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65250b() {
        BulletContainerView bulletContainerView = this.f88514d;
        if (bulletContainerView != null) {
            int i = 1;
            this.f88518m = true;
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) new JSONObject();
            T t = eVar.element;
            int i2 = C37511l.f88545a[m75610i().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
            t.put("show_from", i);
            bulletContainerView.onEvent(new C37505e(eVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
        BulletContainerView bulletContainerView;
        EnumC37504d dVar;
        if (this.f88515j) {
            if (getUserVisibleHint()) {
                dVar = EnumC37504d.SHOW_BY_USER_VISIBLE_HINT;
            } else {
                dVar = EnumC37504d.HIDE;
            }
            m75607a(dVar);
        }
        if (!this.f88515j && getUserVisibleHint() && (bulletContainerView = this.f88514d) != null) {
            mo65248a(bulletContainerView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        View view;
        View view2 = this.f88526u;
        if (view2 != null) {
            return view2;
        }
        FrameLayout frameLayout = this.f88516k;
        if (frameLayout != null) {
            view = frameLayout.getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof BulletContainerView)) {
            view = null;
        }
        BulletContainerView bulletContainerView = (BulletContainerView) view;
        if (bulletContainerView == null) {
            return null;
        }
        View a = m75605a((View) bulletContainerView);
        this.f88526u = a;
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$h */
    static final class RunnableC37508h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f88538a;

        /* renamed from: b */
        final /* synthetic */ C37500k f88539b;

        static {
            Covode.recordClassIndex(44895);
        }

        RunnableC37508h(FrameLayout frameLayout, C37500k kVar) {
            this.f88538a = frameLayout;
            this.f88539b = kVar;
        }

        public final void run() {
            int height = this.f88538a.getHeight();
            BulletContainerView bulletContainerView = (BulletContainerView) this.f88538a.findViewWithTag("bullet_tag");
            if (this.f88539b.mo65252c()) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                bulletContainerView.setPadding(0, 0, 0, C89241a.m154730a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics())));
            }
            C89219l.m154716b(bulletContainerView, "");
            bulletContainerView.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        EnumC37504d dVar;
        super.setUserVisibleHint(z);
        if (z) {
            dVar = EnumC37504d.SHOW_BY_USER_VISIBLE_HINT;
        } else {
            dVar = EnumC37504d.HIDE;
        }
        m75607a(dVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        BulletContainerView bulletContainerView;
        C89219l.m154721d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (C89219l.m154714a((Object) followStatus.secUserId, (Object) m75611j()) && (bulletContainerView = this.f88514d) != null) {
            bulletContainerView.onEvent(new C37509i(followStatus));
        }
    }

    /* renamed from: a */
    private View m75605a(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof LynxView) {
                childAt = ((LynxView) childAt).findViewByName("profile-shop-tab-list");
            } else if (!(childAt instanceof RecyclerView) && !(childAt instanceof WebView)) {
                if (childAt instanceof ViewGroup) {
                    childAt = m75605a(childAt);
                } else {
                    continue;
                }
            }
            if (childAt != null) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        super.onCreate(bundle);
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str = arguments.getString("sec_user_id", str4)) == null) {
            str = str4;
        }
        m75608b(str);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("enter_from", str4)) == null) {
            str2 = str4;
        }
        this.f88521p = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("author_id", str4)) == null) {
            str3 = str4;
        }
        this.f88524s = str3;
        Bundle arguments4 = getArguments();
        if (!(arguments4 == null || (string = arguments4.getString("show_window_source", str4)) == null)) {
            str4 = string;
        }
        this.f88522q = str4;
        Bundle arguments5 = getArguments();
        int i = 0;
        if (arguments5 != null) {
            i = arguments5.getInt("follow_status", 0);
        }
        this.f88525t = i;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C35130a aVar) {
        String string;
        JSONObject jSONObject;
        String optString;
        C89219l.m154721d(aVar, "");
        try {
            JSONObject jSONObject2 = aVar.f82923b;
            if (jSONObject2 != null && (string = jSONObject2.getString("eventName")) != null) {
                Integer num = null;
                if (C89219l.m154714a((Object) string, (Object) "mp_tab_page_height")) {
                    JSONObject jSONObject3 = aVar.f82923b;
                    if (jSONObject3 != null && jSONObject3.has("data") && (jSONObject = aVar.f82923b) != null && (optString = jSONObject.optString("data")) != null) {
                        JSONObject jSONObject4 = new JSONObject(optString);
                        if (C89219l.m154714a((Object) m75611j(), (Object) jSONObject4.get("sec_uid").toString())) {
                            Object obj = jSONObject4.get("height");
                            if (obj instanceof Integer) {
                                num = obj;
                            }
                            Integer num2 = num;
                            if (num2 != null) {
                                m75606a(this.f88514d, num2.intValue());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo65248a(BulletContainerView bulletContainerView) {
        String str;
        String str2 = this.f88523r;
        if (mo65252c()) {
            str = "1";
        } else {
            str = "0";
        }
        String a = C89361p.m154869a(C89361p.m154869a(C89361p.m154869a(C89361p.m154869a(C89361p.m154869a(str2, "{is_host_profile}", str, false), "{target_sec_uid}", m75611j(), false), "{enter_from}", this.f88521p, false), "{author_id}", this.f88524s, false), "{follow_status}", String.valueOf(this.f88525t), false);
        if (!C87007u.m150697a(this.f88522q)) {
            a = (a + "&show_window_source=") + this.f88522q;
        }
        bulletContainerView.mo26838a(C35301c.m72246a(a), (Bundle) null, this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_my_profile", mo65252c());
        jSONObject.put("sec_user_id", m75611j());
        jSONObject.put("enter_from", this.f88521p);
        jSONObject.put("author_id", this.f88524s);
        jSONObject.put("shop_tab_url", str2);
        C12290b.m22060a("shop_tab_fragment_url", 0, jSONObject);
    }

    /* renamed from: a */
    private final void m75606a(View view, int i) {
        if (view != null) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) C13628n.m24520b(C17867d.m33078a(), (float) i);
                }
                webView.setLayoutParams(layoutParams);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    m75606a(viewGroup.getChildAt(i2), i);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        this.f88515j = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$a */
    public static final class C37501a extends AbstractC89247c<EnumC37504d> {

        /* renamed from: a */
        final /* synthetic */ Object f88528a;

        /* renamed from: b */
        final /* synthetic */ C37500k f88529b;

        static {
            Covode.recordClassIndex(44888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37501a(Object obj, Object obj2, C37500k kVar) {
            super(obj2);
            this.f88528a = obj;
            this.f88529b = kVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, EnumC37504d dVar, EnumC37504d dVar2) {
            C37500k kVar;
            LynxView lynxView;
            C89219l.m154721d(iVar, "");
            EnumC37504d dVar3 = dVar2;
            if (dVar != dVar3) {
                int i = C37511l.f88546b[dVar3.ordinal()];
                if (i == 2 || i == 3) {
                    if (this.f88529b.getUserVisibleHint() && this.f88529b.isResumed() && this.f88529b.f88512b) {
                        BulletContainerView bulletContainerView = this.f88529b.f88514d;
                        if (bulletContainerView != null) {
                            this.f88529b.mo65248a(bulletContainerView);
                        }
                        this.f88529b.f88512b = false;
                    }
                    C37500k kVar2 = this.f88529b;
                    kVar2.mo65247a();
                    kVar2.mo65250b();
                } else if (i == 4 && (lynxView = (kVar = this.f88529b).f88513c) != null) {
                    lynxView.onEnterBackground();
                    BulletContainerView bulletContainerView2 = kVar.f88514d;
                    if (bulletContainerView2 != null) {
                        bulletContainerView2.onEvent(new C37507g());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.k$b */
    public static final class C37502b extends AbstractC89247c<String> {

        /* renamed from: a */
        final /* synthetic */ Object f88530a;

        /* renamed from: b */
        final /* synthetic */ C37500k f88531b;

        static {
            Covode.recordClassIndex(44889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37502b(Object obj, Object obj2, C37500k kVar) {
            super(obj2);
            this.f88530a = obj;
            this.f88531b = kVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, String str, String str2) {
            C89219l.m154721d(iVar, "");
            String str3 = str2;
            if (!C89361p.m154870a((CharSequence) str3) && !C89219l.m154714a((Object) str, (Object) str3)) {
                this.f88531b.f88512b = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(10183);
        C89219l.m154721d(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.post(new RunnableC37508h(frameLayout, this));
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        BulletContainerView bulletContainerView = new BulletContainerView(requireContext, null, 6, (byte) 0);
        bulletContainerView.setTag("bullet_tag");
        bulletContainerView.getProviderFactory().mo25831b(AbstractC17018b.class, new C37506f());
        bulletContainerView.mo25820a(BulletService.m71938f().mo61850a());
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper(activity);
            bulletActivityWrapper.mo26823a((AbstractC1204m) activity);
            bulletContainerView.setActivityWrapper(bulletActivityWrapper);
        }
        this.f88514d = bulletContainerView;
        frameLayout.addView(bulletContainerView, -1, -1);
        this.f88516k = frameLayout;
        if (m75609h() && !this.f88518m) {
            mo65250b();
        }
        MethodCollector.m26664o(10183);
        return frameLayout;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        this.f88515j = true;
    }
}
