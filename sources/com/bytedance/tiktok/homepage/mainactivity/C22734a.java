package com.bytedance.tiktok.homepage.mainactivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.C22724a;
import com.bytedance.tiktok.homepage.DialogInterface$OnClickListenerC22728b;
import com.bytedance.tiktok.homepage.DialogInterface$OnClickListenerC22729c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34575f;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.login.C58958d;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65711b;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65714e;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e;
import com.p2082ss.android.ugc.aweme.services.IAccountHelperService;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68071f;
import com.p2082ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68776g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80586is;
import com.p2082ss.android.ugc.awemepushapi.IPushApi;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.a */
public final class C22734a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C22735a f53705e = new C22735a((byte) 0);

    /* renamed from: a */
    public boolean f53706a = true;

    /* renamed from: b */
    public C22737c f53707b = new C22737c();

    /* renamed from: c */
    public final MainActivity f53708c;

    /* renamed from: d */
    public final C22724a f53709d;

    /* renamed from: f */
    private final DataCenter f53710f;

    /* renamed from: g */
    private final AtomicBoolean f53711g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(26627);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(264, new RunnableC90250g(C22734a.class, "onUserLogicDeleteEvent", C34575f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(265, new RunnableC90250g(C22734a.class, "onUserLoginStateChange", C33491f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(266, new RunnableC90250g(C22734a.class, "onSwitchAccountSuccess", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.a$a */
    public static final class C22735a {
        static {
            Covode.recordClassIndex(26628);
        }

        private C22735a() {
        }

        public /* synthetic */ C22735a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.a$c */
    public static final class C22737c implements IAccountService.AbstractC31272b {
        static {
            Covode.recordClassIndex(26630);
        }

        C22737c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            if (C65714e.m117626a(C17867d.m33078a())) {
                C65711b.f148061a = false;
                C65711b.m117624a();
            } else {
                IPushApi a = C29902a.m60273a();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                a.initPushAccountService(g.isLogin());
            }
            C80586is.m139726c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.a$b */
    public static final class RunnableC22736b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22734a f53712a;

        /* renamed from: b */
        final /* synthetic */ String f53713b;

        static {
            Covode.recordClassIndex(26629);
        }

        RunnableC22736b(C22734a aVar, String str) {
            this.f53712a = aVar;
            this.f53713b = str;
        }

        public final void run() {
            new C23144b(this.f53712a.f53708c).mo37635a(this.f53713b).mo37637b();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUserLogicDeleteEvent(C34575f fVar) {
        C89219l.m154721d(fVar, "");
        if (this.f53711g.compareAndSet(false, true)) {
            new C23144b(this.f53708c).mo37635a(fVar.f81613a).mo37637b();
            C31575b.m65860b().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @AbstractC90264r
    public final void onUserLoginStateChange(C33491f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar.f79560a == 0) {
            AbstractC79589c a = UgCommonServiceImpl.m138290j().mo123092a();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C89219l.m154716b(curUserId, "");
            a.mo123113a("login", curUserId);
        }
    }

    /* renamed from: a */
    public final void mo37055a(Bundle bundle) {
        if (bundle != null) {
            Uri uri = null;
            if (C80580in.m139687c() && C31575b.m65865g().allUidList().size() > 1) {
                C33830n.m69192a("child_mode_multi_account", "", (JSONObject) null);
            }
            C58958d.f134197a = false;
            C39223a.m79594h().mo68583b();
            if (bundle.getBoolean("is_start_by_switch_account", false)) {
                C39223a.m79600n().mo68670a(this.f53708c);
            }
            if (!TextUtils.isEmpty(bundle.getString("switch_account_success_toast_text", null))) {
                new Handler().post(new RunnableC22736b(this, bundle.getString("switch_account_success_toast_text", null)));
            }
            boolean z = bundle.getBoolean("login_jump");
            boolean z2 = bundle.getBoolean("switch_jump");
            boolean z3 = bundle.getBoolean("cancelRestoreOnMain");
            Intent intent = (Intent) bundle.getParcelable("push_intent");
            if (intent != null) {
                uri = intent.getData();
            }
            if (z3) {
                AVExternalServiceImpl.m113114a().publishService().cancelRestoreOnMain();
            }
            if (intent == null) {
                return;
            }
            if (z || z2) {
                intent.putExtra("second_jump", true);
                intent.setClass(this.f53708c, DeepLinkActivityV2.class);
                intent.putExtra("inner_from", "switch_account");
                if (uri != null) {
                    intent.setData(uri.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
                }
                MainActivity mainActivity = this.f53708c;
                C84349a.m145093a(intent, mainActivity);
                mainActivity.startActivity(intent);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchAccountSuccess(C47959j jVar) {
        String str;
        String str2 = "";
        C89219l.m154721d(jVar, str2);
        if (jVar.f111077b != null) {
            Integer num = null;
            if (!TextUtils.equals(jVar.f111077b.optString("eventName"), "account_switch_success")) {
                JSONObject optJSONObject = jVar.f111077b.optJSONObject("data");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("eventName");
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, "account_switch_success")) {
                    return;
                }
            }
            if (C16083j.m29874a().mo25538c()) {
                C58221f.m105153e().mo95704a(new C67136e(1)).mo95706a();
            } else {
                AbstractC68041bz.f152407a.mo108656a((Context) this.f53708c);
            }
            C58221f.m105153e().mo95704a(new C68776g()).mo95706a();
            C31575b.m65865g().updateCurUser(C31575b.m65865g().queryUser(((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).selfUserApi(), false));
            JSONObject optJSONObject2 = jVar.f111077b.optJSONObject("data");
            if (optJSONObject2 != null) {
                int optInt = optJSONObject2.optInt("account_type");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("data");
                if (optJSONObject3 != null) {
                    num = Integer.valueOf(optJSONObject3.optInt("account_type"));
                }
                if (optInt == 2) {
                    SmartRouter.buildRoute(this.f53708c, "//setting").addFlags(67108864).addFlags(536870912).withParam("from_switch_creator_success", true).open();
                    C39223a.m79605s().mo68678a();
                    AbstractC81915c.m141874a(new C68071f());
                } else if (optInt == 3 || (num != null && num.intValue() == 3)) {
                    this.f53710f.mo60191a("performClickTab", "USER");
                    if (C16083j.m29874a().mo25538c()) {
                        SettingManagerServiceImpl.m121205b().mo108578a(1);
                    } else {
                        SettingManagerServiceImpl.m121205b().mo108579a(this.f53708c);
                    }
                    SettingManagerServiceImpl.m121205b().mo108577a();
                    if (this.f53709d != null) {
                        MainActivity mainActivity = this.f53708c;
                        User curUser = C31575b.m65865g().getCurUser();
                        C17197a.C17200a aVar = new C17197a.C17200a(mainActivity);
                        aVar.f41059E = true;
                        StringBuilder append = new StringBuilder().append(mainActivity.getResources().getString(R.string.a1p)).append(" ");
                        if (curUser.getNickname() != null) {
                            str2 = curUser.getNickname();
                        }
                        aVar.f41070a = append.append(str2).toString();
                        aVar.f41071b = mainActivity.getResources().getString(R.string.ghv);
                        aVar.mo27192a(mainActivity.getResources().getString(R.string.a1r), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC22728b(mainActivity), false).mo27197c(mainActivity.getResources().getString(R.string.a1s), DialogInterface$OnClickListenerC22729c.f53694a, false).mo27193a().mo27185c();
                    }
                    C39223a.m79605s().mo68678a();
                    AbstractC81915c.m141874a(new C68070e());
                }
            }
        }
    }

    public C22734a(MainActivity mainActivity, DataCenter dataCenter, C22724a aVar) {
        C89219l.m154721d(mainActivity, "");
        C89219l.m154721d(dataCenter, "");
        this.f53708c = mainActivity;
        this.f53709d = aVar;
        this.f53710f = dataCenter;
        EventBus.m156966a(EventBus.m156962a(), this);
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(this.f53707b);
    }
}
