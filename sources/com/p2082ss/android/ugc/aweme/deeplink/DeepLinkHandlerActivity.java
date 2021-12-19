package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.app.C0569a;
import androidx.core.app.C0576b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.AbstractC35326bx;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33796j;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38693bn;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.p2082ss.android.ugc.aweme.main.AbstractC59053bc;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80219an;
import com.p2082ss.android.ugc.tiktok.deeplink.C84298a;
import com.p2082ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity */
public class DeepLinkHandlerActivity extends ActivityC17312a {

    /* renamed from: a */
    protected C41058p f95838a = new C41058p();

    /* renamed from: b */
    protected Uri f95839b;

    /* renamed from: c */
    protected boolean f95840c = false;

    /* renamed from: d */
    protected boolean f95841d = false;

    /* renamed from: e */
    public String f95842e = null;

    /* renamed from: f */
    protected boolean f95843f = false;

    /* renamed from: g */
    protected boolean f95844g = false;

    /* renamed from: h */
    private long f95845h = 0;

    /* renamed from: i */
    private boolean f95846i = false;

    /* renamed from: j */
    private boolean f95847j = false;

    /* renamed from: k */
    private boolean f95848k = false;

    /* renamed from: l */
    private boolean f95849l = false;

    /* renamed from: m */
    private ArrayList<String> f95850m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<Intent> f95851n = new ArrayList<>();

    /* renamed from: o */
    private Intent f95852o = null;

    /* renamed from: p */
    private Intent f95853p = null;

    /* renamed from: q */
    private boolean f95854q = false;

    /* renamed from: r */
    private boolean f95855r = false;

    /* renamed from: s */
    private IAccountUserService f95856s = AccountService.m65215a().mo57069e();

    /* renamed from: t */
    private IDeepLinkService f95857t = DeepLinkServiceImpl.m82568g();

    /* renamed from: u */
    private String f95858u = "";

    static {
        Covode.recordClassIndex(48846);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70183a(String str, String str2, Context context, DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
            C39162r.m79460a("2131828424", new C33744d().mo59983a("rule_id", this.f95842e).mo59983a("push_label", this.f95858u).mo59983a("anchor_id", str).mo59983a("room_id", str2).f79943a);
        }
        m82560c();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70184a(String str, String str2, DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            C39162r.m79460a("2131828423", new C33744d().mo59983a("rule_id", this.f95842e).mo59983a("push_label", this.f95858u).mo59983a("anchor_id", str).mo59983a("room_id", str2).f79943a);
            dialogInterface.dismiss();
        }
        C41039c.m82668a("live_dialog", 2010, this.f95839b, "user is in live");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f95843f = false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        finish();
    }

    /* renamed from: b */
    private boolean m82558b() {
        String[] strArr;
        String a = C58071d.m104907a();
        try {
            strArr = (String[]) SettingsManager.m29616a().mo25396a("app_action_allowlist", String[].class);
            if (strArr == null) {
                strArr = new String[]{"US"};
            }
        } catch (Throwable unused) {
            strArr = new String[]{"US"};
        }
        for (String str : strArr) {
            if (TextUtils.equals(a, str)) {
                return false;
            }
        }
        if (!m82555a()) {
            Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            mainActivityIntent.putExtra("app_action_restricted", true);
            m82552a(this, mainActivityIntent);
        } else {
            new C23144b(this).mo37640e(R.string.bu1).mo37637b();
        }
        return true;
    }

    /* renamed from: c */
    private void m82560c() {
        Intent intent = getIntent();
        this.f95850m = intent.getStringArrayListExtra("pre_o_urls");
        try {
            if (m82559b(intent)) {
                if (!this.f95855r) {
                    m82551a(this.f95852o, this.f95853p, this.f95851n);
                }
                C41039c.m82668a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, this.f95839b, "");
                C33796j.m69147a().f80040a = false;
                this.f95857t.mo70172a(m82550a(this.f95839b, this.f95850m), true, "");
                C34671a.f81927a.mo61327a(this.f95839b, this.f95841d);
                if (this.f95841d && this.f95849l) {
                    int isPushVideoPreload = C29902a.m60273a().isPushVideoPreload(this.f95845h);
                    if (m82555a()) {
                        C80219an.m139047b(System.currentTimeMillis(), this.f95858u, isPushVideoPreload);
                    } else {
                        C80219an.m139046a(System.currentTimeMillis(), this.f95858u, isPushVideoPreload);
                    }
                }
            }
        } catch (Exception e) {
            this.f95857t.mo70172a(m82550a(this.f95839b, this.f95850m), false, e.getMessage());
            C41039c.m82668a("Transfer", 2014, this.f95839b, e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    protected static boolean m82555a() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, android.view.ContextThemeWrapper, androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m82559b(Intent intent) {
        String str;
        Uri uri;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3 = "";
        if (intent != null) {
            str = m82549a(intent, "rule_id");
        } else {
            str = str3;
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        List<String> allUidList = this.f95856s.allUidList();
        String curUserId = this.f95856s.getCurUserId();
        if (uri != null) {
            str2 = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        boolean isLogin = C31575b.m65865g().isLogin();
        boolean equals = TextUtils.equals(str2, curUserId);
        boolean contains = allUidList.contains(str2);
        if (C58071d.m104909c() && !isEmpty && isLogin && !equals) {
            this.f95855r = true;
            if (AVExternalServiceImpl.m113114a().publishService().isPublishing()) {
                new Handler().post(new RunnableC41045h(this));
                C41039c.m82668a("Transfer", 2011, this.f95839b, "uploading video");
                return false;
            }
            m82557b(contains, intent);
        }
        if (intent == null || !intent.getBooleanExtra("second_jump", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!C13603b.m24435a((Collection) this.f95850m)) {
            if (!C31575b.m65865g().isLogin() || TextUtils.isEmpty(str2) || TextUtils.equals(str2, this.f95856s.getCurUserId())) {
                if (!m82555a() || z) {
                    Iterator<String> it = this.f95850m.iterator();
                    while (it.hasNext()) {
                        Uri parse = Uri.parse(it.next());
                        if (this.f95853p != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Intent a = mo70167a(parse, z3, false);
                        if (a != null) {
                            a.putExtra("is_have_intents", true);
                            a.putExtra("rule_id", str);
                            this.f95851n.add(0, a);
                        }
                    }
                }
            } else if (m82555a()) {
                this.f95857t.mo70172a(this.f95850m.toString(), false, "abs isAppHot == true");
                return false;
            } else {
                this.f95852o = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            }
        }
        if (this.f95852o == null) {
            Uri uri2 = this.f95839b;
            if (this.f95853p != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f95852o = mo70167a(uri2, z2, true);
        }
        Intent intent2 = this.f95852o;
        if (intent2 == null) {
            if (!this.f95854q) {
                IDeepLinkService iDeepLinkService = this.f95857t;
                Uri uri3 = this.f95839b;
                if (uri3 != null) {
                    str3 = uri3.toString();
                }
                iDeepLinkService.mo70172a(str3, false, "abs intent == null");
            }
            if (!m82555a() && this.f95843f) {
                Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
                this.f95852o = mainActivityIntent;
                C0569a.m2372a(this, mainActivityIntent, (Bundle) null);
            }
            return false;
        }
        intent2.putExtra("from_notification", this.f95841d);
        this.f95852o.putExtra("from_notification_uuid", this.f95842e);
        this.f95852o.putExtra("rule_id", str);
        if (!this.f95840c) {
            this.f95852o.addFlags(268435456);
        }
        if (this.f95851n.size() > 0) {
            if (this.f95852o.getComponent() == null || (!TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass().getName(), this.f95852o.getComponent().getClassName()) && !TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSplashActivityClass().getName(), this.f95852o.getComponent().getClassName()))) {
                this.f95852o.putExtra("is_have_intents", true);
                this.f95851n.add(this.f95852o);
            } else {
                this.f95851n.clear();
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m82556a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!C13627m.m24498a(action) && action.indexOf("com.ss.android.sdk.") == 0) {
            String a = m82549a(intent, "open_url");
            if (!C13627m.m24498a(a)) {
                try {
                    this.f95839b = Uri.parse(a);
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        if (this.f95839b == null) {
            this.f95839b = intent.getData();
        }
        Uri uri = this.f95839b;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x033d  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 903
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m82549a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m82552a(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent) {
        C84349a.m145093a(intent, deepLinkHandlerActivity);
        deepLinkHandlerActivity.startActivity(intent);
    }

    /* renamed from: a */
    private static String m82550a(Uri uri, ArrayList<String> arrayList) {
        if (uri != null) {
            return uri.toString();
        }
        if (!C13603b.m24435a((Collection) arrayList)) {
            return arrayList.toString();
        }
        return "";
    }

    /* renamed from: a */
    private void m82554a(String str, final Bundle bundle) {
        C80053c findSignificanUserInfo = C31575b.m65865g().findSignificanUserInfo(str);
        if (findSignificanUserInfo != null) {
            C31575b.m65860b().switchAccount(findSignificanUserInfo, bundle, new AbstractC35326bx() {
                /* class com.p2082ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.C409901 */

                static {
                    Covode.recordClassIndex(48847);
                }

                @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
                /* renamed from: a */
                public final void mo57675a() {
                    C39162r.m79460a("switch_account_result", new C33744d().mo59980a("status", 1).f79943a);
                }

                @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
                /* renamed from: a */
                public final void mo57676a(Integer num, String str) {
                    if (!DeepLinkHandlerActivity.m82555a()) {
                        LoginUtilsServiceImpl.m108310a().mo96439a(bundle);
                        return;
                    }
                    if (Boolean.valueOf(MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAwemeAppDataEmpty()).booleanValue()) {
                        new C23144b(C17873f.m33102j()).mo37640e(R.string.bos).mo37637b();
                    }
                    C39162r.m79460a("switch_account_result", new C33744d().mo59980a("status", 0).mo59982a("fail_info", num).f79943a);
                }
            });
        }
    }

    /* renamed from: b */
    private void m82557b(boolean z, Intent intent) {
        Activity previousActivity = ActivityStack.getPreviousActivity();
        if (previousActivity != null) {
            String canonicalName = previousActivity.getClass().getCanonicalName();
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
            if (arrayList.contains(canonicalName)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(previousActivity, R.style.u4);
                builder.setMessage(R.string.ezk);
                builder.setNegativeButton(R.string.a8y, DialogInterface$OnClickListenerC41046i.f95951a);
                builder.setPositiveButton(R.string.as0, new DialogInterface$OnClickListenerC41047j(this, z, intent));
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.setCancelable(false);
                try {
                    create.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                arrayList.clear();
                return;
            }
            arrayList.clear();
        }
        mo70185a(z, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo70185a(boolean z, Intent intent) {
        Uri uri;
        String str;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_intent", intent);
        bundle.putBoolean("mFromNotification", this.f95841d);
        bundle.putString("from_notification_uuid", this.f95842e);
        bundle.putBoolean("cancelRestoreOnMain", true);
        if (z) {
            bundle.putBoolean("switch_jump", true);
            m82554a(str, bundle);
            return;
        }
        Intent intent2 = new Intent(C51427a.f118503a, AccountService.m65215a().mo57071g().getPushLoginActivityClass());
        intent2.putExtra("multi_account_push_uid", str);
        intent2.putExtra("multi_account", bundle);
        if (m82555a()) {
            m82552a(this, intent2);
            return;
        }
        C0569a.m2373a(this, new Intent[]{MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this), intent2}, (Bundle) null);
    }

    /* renamed from: a */
    private static void m82553a(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent, Bundle bundle) {
        C84349a.m145093a(intent, deepLinkHandlerActivity);
        deepLinkHandlerActivity.startActivity(intent, bundle);
    }

    /* renamed from: a */
    private void m82551a(Intent intent, Intent intent2, ArrayList<Intent> arrayList) {
        String str;
        C0576b a;
        if (getIntent() != null) {
            str = m82549a(getIntent(), "rule_id");
        } else {
            str = "";
        }
        boolean equals = TextUtils.equals(intent.getComponent().getClassName(), DetailFeedServiceImpl.m65254b().mo57058a().getName());
        this.f95848k = equals;
        Bundle bundle = null;
        if (equals && (a = C0576b.m2191a(this)) != null) {
            bundle = a.mo2564a();
        }
        if (intent2 != null) {
            if (arrayList.size() > 1) {
                intent2.putExtra("next_steps", arrayList);
            } else {
                intent2.putExtra("next_step", intent);
            }
            intent2.putExtra("rule_id", str);
            if (m82555a()) {
                m82553a(this, intent2, bundle);
                return;
            }
            Intent[] intentArr = new Intent[2];
            intentArr[0] = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            intentArr[0].putExtra("rule_id", str);
            intentArr[1] = intent2;
            C0569a.m2373a(this, intentArr, bundle);
        } else if (arrayList.size() > 1) {
            C0569a.m2373a(this, (Intent[]) arrayList.toArray(new Intent[arrayList.size()]), bundle);
        } else if (intent.getBooleanExtra("need_post", false)) {
            new Handler().post(new RunnableC41048k(this, intent, bundle));
        } else {
            C0569a.m2372a(this, intent, bundle);
        }
    }

    /* renamed from: a */
    public Intent mo70167a(Uri uri, boolean z, boolean z2) {
        String path;
        boolean z3;
        String str;
        String scheme = uri.getScheme();
        Intent intent = null;
        if (TextUtils.isEmpty(scheme)) {
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        if (DeeplinkPrefetchImpl.m144998a().mo129325a(new C84298a(uri, Boolean.valueOf(this.f95841d))).f188508i) {
            String str2 = "";
            if (uri.getPath() == null) {
                path = str2;
            } else {
                path = uri.getPath();
            }
            String a = m82549a(getIntent(), "from_token");
            if (!TextUtils.isEmpty(a)) {
                str2 = a;
            }
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("from_token", str2);
            if (TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
                if (TextUtils.equals("token", m82549a(getIntent(), "enter_from"))) {
                    buildUpon.appendQueryParameter("enter_from", "token");
                } else {
                    if (this.f95841d) {
                        str = "push";
                    } else {
                        str = "deeplink";
                    }
                    buildUpon.appendQueryParameter("enter_from", str);
                }
            }
            Uri build = buildUpon.build();
            Iterator<AbstractC34266aw> it = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeeplinkCommands().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                AbstractC34266aw next = it.next();
                if (next.mo59964a(build, scheme, host, path)) {
                    if ((host + path).contains("aweme/detail") || (host + path).contains("aweme/push_detail")) {
                        this.f95849l = true;
                    } else {
                        this.f95849l = false;
                    }
                    this.f95838a.mo70267c(next.mo59956a(build));
                    intent = next.mo59958a(this, build, host, path, str2, this.f95841d, z);
                    if (intent != null) {
                        if (m82549a(intent, "share_url_user_id") != null) {
                            this.f95838a.mo70270f(m82549a(intent, "share_url_user_id"));
                        } else if (m82549a(intent, "share_sec_url_user_id") != null) {
                            this.f95838a.mo70270f(m82549a(intent, "share_sec_url_user_id"));
                        }
                        if (m82549a(intent, "share_url_link_id") != null) {
                            this.f95838a.mo70271g(m82549a(intent, "share_url_link_id"));
                        }
                    }
                    if (intent == null) {
                        next.mo59959a(this, build, this.f95841d);
                        C41039c.m82668a("independent_transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, this.f95839b, "business takeover");
                    }
                    if (!TextUtils.isEmpty(next.mo59960a())) {
                        C41059q.C41060a.m82716a(build, next.mo59960a());
                    } else if (intent != null) {
                        C41059q.C41060a.m82716a(build, intent.getComponent().getClassName());
                    }
                    z3 = true;
                }
            }
            if (intent != null && !m82555a() && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                String a2 = AbstractC59053bc.m108536a(build.getQueryParameter("tab_index"));
                if ((!"aweme".equals(host) || !"click_push_newvideo".equals(build.getQueryParameter("gd_label")) || !TextUtils.equals(a2, "DISCOVER")) && !TextUtils.isEmpty(a2)) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a2);
                }
                intent.putExtra("is_from_push", true);
            }
            if (intent != null) {
                String queryParameter = build.getQueryParameter("backurl");
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("backurl", queryParameter);
                }
            }
            C33796j.m69147a().f80040a = false;
            C38693bn.m78504a(build, intent);
            if (!(intent == null || build.getQueryParameter("gd_label") == null || !build.getQueryParameter("gd_label").startsWith("click_wap"))) {
                intent.putExtra("ads_app_activity_by_wap_click", true);
            }
            if (!z3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("open_url", build.toString());
                    C33830n.m69192a("service_monitor", "no_matched_deep_link", jSONObject);
                } catch (Exception unused) {
                }
            }
            if (!z3 && z2) {
                this.f95843f = true;
                this.f95838a.mo70267c("default_homepage");
            }
        }
        return intent;
    }
}
