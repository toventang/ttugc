package com.p2082ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.AbstractC15295a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.internal.C20919d;
import com.bytedance.p1007g.C14853c;
import com.bytedance.p1734ug.sdk.region.data.p1737b.C23462a;
import com.bytedance.ttnet.p1701b.C22931b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.newmedia.redbadge.p2170b.C30179a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32849b;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34576g;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.challenge.p2446b.C35493a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49667ab;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.live.AbstractC58646i;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.money.growth.C60186g;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60808d;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import com.p2082ss.android.ugc.aweme.p3070im.p3071a.C53589a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66402d;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67194f;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68769a;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68776g;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3742e.C68802a;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import com.p2082ss.android.ugc.aweme.shortcut.C69712e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74047y;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80625r;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.p4373c.p4374a.CallableC85080b;
import java.util.Collections;
import java.util.Objects;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.login.d */
public final class C58958d {

    /* renamed from: a */
    public static boolean f134197a;

    static {
        Covode.recordClassIndex(69285);
    }

    /* renamed from: b */
    private static void m108332b() {
        new YoutubeRefreshTask().mo28600a(C17867d.m33078a());
    }

    /* renamed from: c */
    private static void m108334c() {
        IWalletService iWalletService = (IWalletService) C6193a.m13435a(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.walletCenter().mo12377c();
        }
    }

    /* renamed from: d */
    private static void m108335d() {
        AbstractC58646i k = LiveOuterService.m107269s().mo95837k();
        if (k != null && k.mo95881b() != null) {
            k.mo95881b().mo96122a(C17867d.m33078a());
        }
    }

    /* renamed from: a */
    private static void m108327a() {
        if (C16083j.m29874a().mo25538c()) {
            C58221f.m105153e().mo95704a(new C67136e(1)).mo95706a();
        } else {
            AbstractC68041bz.f152407a.mo108656a((Context) null);
            C68765a.m121209b();
            C68769a.m121238a();
            C14853c.m27281b();
        }
        C58221f.m105153e().mo95704a(new C68776g()).mo95706a();
    }

    /* renamed from: a */
    public static void m108328a(Bundle bundle) {
        Intent mainActivityIntent = MainActivity.getMainActivityIntent(C17867d.m33078a());
        mainActivityIntent.putExtras(bundle);
        mainActivityIntent.setFlags(268468224);
        Activity j = C17873f.m33102j();
        if (j != null) {
            C84349a.m145093a(mainActivityIntent, j);
            j.startActivity(mainActivityIntent);
            if (j.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                j.finishAndRemoveTask();
            } else {
                j.finish();
            }
        } else if (C17867d.m33078a() != null) {
            Context a = C17867d.m33078a();
            C84349a.m145093a(mainActivityIntent, a);
            a.startActivity(mainActivityIntent);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Bundle m108330b(Bundle bundle) {
        m108329a("Switch Account", C31575b.m65865g().getCurUserId());
        int i = 1;
        f134197a = true;
        bundle.putBoolean("is_start_by_switch_account", true);
        C33048q.m67695d(false);
        SharePrefCache.inst().clearCache();
        C61542b.m111468c();
        C61542b.m111464a(false, 5);
        C20919d.m39339a().mo34367a(Collections.singletonList("kakaotalk"), 3);
        C1731i.m5640b(CallableC85080b.f190362a, C1731i.f5562a);
        C39608b.f93371b.mo69026a(0);
        if (C39608b.f93371b.mo69035d() != 0) {
            C33830n.m69192a("not_clear_old_settings", "", (JSONObject) null);
        }
        C68802a.m121273a(null, false);
        C53589a.m98816c();
        C67446h.f151111a.mo106209b();
        m108327a();
        C31575b.m65865g().checkIn();
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (!TextUtils.isEmpty(accountRegion)) {
                C29803q.m60032a("account_region", accountRegion);
            }
        } else {
            C58955b.m108313b();
        }
        C69712e.m123124a(false);
        Context a = C17867d.m33078a();
        if (!C31575b.m65865g().isChildrenMode() || C31575b.m65865g().allUidList().size() <= 1) {
            bundle.putString("switch_account_success_toast_text", a.getString(R.string.hch, C31575b.m65865g().getCurUser().getNickname()));
        } else {
            C31575b.m65865g().logoutAllBackgroundUser();
            C30179a.m61024a(a).mo53584a(false);
            bundle.putString("switch_account_success_toast_text", a.getString(R.string.bv2));
        }
        IMService.createIIMServicebyMonsterPlugin(false).resetLoginState();
        m108334c();
        C39223a.m79601o().mo68708e();
        C39223a.m79589c().mo68610e();
        if (!C80580in.m139687c()) {
            C39223a.m79589c().mo68609d();
            C39223a.m79601o().mo68702a(null);
            C39223a.m79604r().mo68635a(1);
        } else {
            C39223a.m79604r().mo68638b(2);
        }
        C74047y.f166199a = null;
        bundle.putBoolean("need_restart", true);
        LiveOuterService.m107269s().mo95830d().mo95862z();
        m108332b();
        AnchorListManager.m70432a();
        m108335d();
        C80580in.m139678a();
        C31575b.m65861c().saveSharedAccount(null);
        C60186g.f137196b.f137198a.mo97863a();
        SpecActServiceImpl.m131497i().mo118032d();
        C39223a.m79604r().mo68641d();
        C60808d.f138187a.mo2093a();
        C60808d.f138188b.mo2093a();
        C35493a.f83716b.mo2093a();
        C35493a.f83717c.mo2093a();
        ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), C80580in.m139689d());
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        C50418a.f116413i = curUserId;
        C50418a.f116406b.erase("progress_bar_data");
        C50418a.f116406b.erase("response_caching_complete");
        C50418a.f116406b.erase("response_received");
        C50418a.C50419a.m94573b();
        if (C50418a.f116407c.containsKey(C50418a.f116413i)) {
            Object obj = C50418a.f116407c.get(C50418a.f116413i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            C50418a.f116414j = ((Integer) obj).intValue();
        } else {
            C50418a.f116407c.put(C50418a.f116413i, 5);
            C50418a.f116414j = 5;
        }
        if (C50418a.f116408d.containsKey(C50418a.f116413i)) {
            Keva keva = C50418a.f116406b;
            Object obj2 = C50418a.f116408d.get(C50418a.f116413i);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            keva.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            C50418a.f116406b.storeBoolean("progress_dismissed_by_user", false);
        }
        if (C50418a.f116409e.containsKey(C50418a.f116413i)) {
            Keva keva2 = C50418a.f116406b;
            Object obj3 = C50418a.f116409e.get(C50418a.f116413i);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            keva2.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            C50418a.f116406b.storeInt("milestone_progress_reported", -1);
        }
        C50418a.f116406b.storeString("progress_map_key", new JSONObject(C50418a.f116407c).toString());
        C63332a.C63333a.m114832a();
        C63332a.m114825c();
        C80034a.f179347a.mo123486c();
        if (!C80064f.m138815a(C80061e.f179403k.mo123508a()) || !C80580in.m139689d()) {
            i = 2;
        }
        C23462a.m44155a(i);
        return bundle;
    }

    /* renamed from: c */
    static final /* synthetic */ Bundle m108333c(Bundle bundle) {
        boolean z;
        m108329a("Login", C31575b.m65865g().getCurUserId());
        AppLog.setUserId(Long.parseLong(C31575b.m65865g().getCurUserId()));
        AppLog.setSessionKey(C31575b.m65865g().getSessionKey());
        C33048q.m67695d(false);
        AbstractC68041bz.f152407a.mo108658a(C58965k.f134206a);
        m108327a();
        C31575b.m65865g().checkIn();
        C40203j a = C40203j.C40204a.m81323a();
        String b = a.f94395a.mo69426b();
        int d = VPAServiceImpl.m80316h().mo68729d();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(b)) {
            jSONObject.put("content_language_not_login", b);
        }
        if (d != 0) {
            jSONObject.put("vpa_content_choice_not_login", d);
        }
        int i = 1;
        if (jSONObject.length() > 0) {
            ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(LanguageApi.class)).setUnloginContentPreference("settings_not_login", jSONObject.toString()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40203j.C40211g());
            z = true;
        } else {
            z = false;
        }
        a.f94395a.mo69424a(false);
        a.f94395a.mo69423a("");
        a.f94396b = false;
        a.mo69410d();
        if (!z) {
            C68802a.m121273a(null, false);
        }
        if (!C80580in.m139687c() && C16048b.m29633a().mo25421a(true, "inbox_has_top_msg", false)) {
            new C58221f.C58223b().mo95701b((AbstractC58259r) new C67194f()).mo95706a();
        }
        C53589a.m98816c();
        AbstractC81915c.m141874a(new C49667ab());
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (!TextUtils.isEmpty(accountRegion)) {
                C29803q.m60032a("account_region", accountRegion);
            }
        }
        IMService.createIIMServicebyMonsterPlugin(false).refreshLoginState();
        SharePrefCache.inst().getTodayVideoPlayTime().mo59940b(0L);
        if (C39223a.m79601o().mo68703a() && bundle != null) {
            bundle.putBoolean("need_restart", true);
        }
        if (SharePrefCache.inst().getIsFirstLaunch().mo59941c().booleanValue()) {
            SharePrefCache.inst().getIsFirstLaunch().mo59940b(false);
        }
        if (!C80580in.m139687c()) {
            C39223a.m79589c().mo68609d();
            C39223a.m79601o().mo68702a(null);
            C39223a.m79604r().mo68635a(1);
        }
        C61542b.m111464a(false, 5);
        LiveOuterService.m107269s().mo95830d().mo95862z();
        AnchorListManager.m70432a();
        m108332b();
        m108335d();
        C80580in.m139678a();
        C31575b.m65861c().saveSharedAccount(null);
        bundle.putBoolean("is_start_by_login", true);
        C51648a.f118980a.mo87313b();
        C32849b.m67443a(2);
        if (C80580in.m139687c()) {
            C39223a.m79604r().mo68638b(2);
            C30179a.m61024a(C17867d.m33078a()).mo53584a(false);
        }
        C39223a.m79604r().mo68641d();
        C60186g.f137196b.f137198a.mo97863a();
        SpecActServiceImpl.m131497i();
        SecApiImpl.m119993a().updateCollectMode(null);
        ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), C80580in.m139689d());
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        C50418a.f116413i = curUserId;
        C50418a.f116406b.erase("progress_bar_data");
        C50418a.f116406b.erase("response_caching_complete");
        C50418a.f116406b.erase("response_received");
        C50418a.C50419a.m94573b();
        if (C50418a.f116407c.containsKey(C50418a.f116413i)) {
            Object obj = C50418a.f116407c.get(C50418a.f116413i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            C50418a.f116414j = ((Integer) obj).intValue();
        } else {
            C50418a.f116407c.put(C50418a.f116413i, Integer.valueOf(C50418a.f116414j));
        }
        if (C50418a.f116408d.containsKey(C50418a.f116413i)) {
            Keva keva = C50418a.f116406b;
            Object obj2 = C50418a.f116408d.get(C50418a.f116413i);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            keva.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            C50418a.f116406b.storeBoolean("progress_dismissed_by_user", false);
        }
        if (C50418a.f116409e.containsKey(C50418a.f116413i)) {
            Keva keva2 = C50418a.f116406b;
            Object obj3 = C50418a.f116409e.get(C50418a.f116413i);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            keva2.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            C50418a.f116406b.storeInt("milestone_progress_reported", -1);
        }
        C50418a.f116406b.storeString("progress_map_key", new JSONObject(C50418a.f116407c).toString());
        C80625r.m139793a();
        C63332a.C63333a.m114832a();
        C63332a.m114825c();
        if (!C80064f.m138815a(C80061e.f179403k.mo123508a()) || !C80580in.m139689d()) {
            i = 2;
        }
        C23462a.m44155a(i);
        return bundle;
    }

    /* renamed from: a */
    static final /* synthetic */ Bundle m108326a(Bundle bundle, C31366b bVar) {
        m108329a("Logout", C80580in.m139683b().getUid());
        Activity j = C17873f.m33102j();
        C33048q.m67695d(true);
        SharePrefCache.inst().clearCache();
        C1731i.m5640b(CallableC85080b.f190362a, C1731i.f5562a);
        C39223a.m79591e().mo68730e();
        C53589a.m98817d();
        m108327a();
        C39223a.m79601o().mo68708e();
        bundle.putBoolean("restart_from_logout", true);
        bundle.putBoolean("is_logout_from_ftc_user", bVar.f75142a);
        C39223a.m79599m().mo68659c();
        C39223a.m79596j().mo68695a();
        C39223a.m79599m().mo68658b();
        new Handler().postDelayed(new RunnableC58963i(j), 500);
        AVExternalServiceImpl.m113114a().configService().userAction(2);
        C80580in.m139678a();
        C31575b.m65861c().clearSharedAccount(null);
        C58955b.m108312a();
        C39223a.m79604r().mo68641d();
        ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), C80580in.m139689d());
        C39223a.m79604r().mo68638b(5);
        C50418a.m94565a();
        C63332a.C63333a.m114832a();
        C63332a.m114825c();
        C80034a.f179347a.mo123486c();
        return bundle;
    }

    /* renamed from: a */
    private static void m108329a(String str, String str2) {
        C0484a aVar = new C0484a();
        aVar.put("operation", str);
        aVar.put("uid", str2);
        aVar.put("region_source", C22931b.f54197c);
        aVar.put("region_code", C22931b.f54196b);
        aVar.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        AbstractC15295a.get().recordRegionEvent(aVar);
    }

    /* renamed from: b */
    static final /* synthetic */ Bundle m108331b(Bundle bundle, C31366b bVar) {
        m108329a("Logout", C80580in.m139683b().getUid());
        C33048q.m67695d(true);
        SharePrefCache.inst().clearCache();
        C61542b.m111468c();
        C20919d.m39339a().mo34367a(Collections.singletonList("kakaotalk"), 2);
        C1731i.m5640b(CallableC85080b.f190362a, C1731i.f5562a);
        C39223a.m79591e().mo68730e();
        C53589a.m98817d();
        C61504e.C61505a.f139616a.mo99161b();
        C67446h.f151111a.mo106209b();
        m108327a();
        m108334c();
        C39223a.m79601o().mo68708e();
        C39223a.m79589c().mo68610e();
        C66402d.m118105d(0);
        C66402d.m118105d(1);
        C74047y.f166199a = null;
        bundle.putBoolean("restart_from_logout", true);
        bundle.putBoolean("is_logout_from_ftc_user", bVar.f75142a);
        C39223a.m79596j().mo68695a();
        C39223a.m79599m().mo68658b();
        m108335d();
        new Handler().postDelayed(new RunnableC58964j(bundle), 500);
        IMService.createIIMServicebyMonsterPlugin(false).refreshLoginState();
        AVExternalServiceImpl.m113114a().configService().userAction(2);
        C34597d.m70636c().mo61057b("last_share_type", (String) null);
        LiveOuterService.m107269s().mo95830d().mo95862z();
        AbstractC81915c.m141874a(new C34576g());
        C80580in.m139678a();
        C31575b.m65861c().clearSharedAccount(null);
        AnchorListManager.m70432a();
        C58955b.m108312a();
        C30179a.m61024a(C17867d.m33078a()).mo53584a(true);
        SpecActServiceImpl.m131497i().mo118030c();
        C39223a.m79604r().mo68641d();
        C39223a.m79604r().mo68635a(4);
        SecApiImpl.m119993a().updateCollectMode(null);
        ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), C80580in.m139689d());
        C50418a.m94565a();
        C63332a.C63333a.m114832a();
        C63332a.m114825c();
        C80034a.f179347a.mo123486c();
        return bundle;
    }
}
