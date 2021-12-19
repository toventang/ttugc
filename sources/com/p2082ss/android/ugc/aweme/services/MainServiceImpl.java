package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.android.play.core.p1965d.C26975a;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.task.CookieMonitorTask;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;
import com.p2082ss.android.ugc.aweme.app.C33659b;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.app.C33860x;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.p2331i.C33795a;
import com.p2082ss.android.ugc.aweme.base.component.DialogC34545h;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.commerce.p2515d.C37493a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38636an;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38866ab;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.p2082ss.android.ugc.aweme.commercialize.views.form.C38934a;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.deeplink.AppLinkHandler;
import com.p2082ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.p2082ss.android.ugc.aweme.deeplink.C41015b;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.p2082ss.android.ugc.aweme.experiment.C46852dt;
import com.p2082ss.android.ugc.aweme.experiment.C46993gt;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoPlayActivity;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.lancet.I18nLancet;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LegoRequestTask;
import com.p2082ss.android.ugc.aweme.login.C58958d;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.MainPageFragment;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61515c;
import com.p2082ss.android.ugc.aweme.p2431bz.C35332a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47962l;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67189c;
import com.p2082ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;
import com.p2082ss.android.ugc.aweme.settingsrequest.RegisterStorageTask;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3739b.C68783a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69800b;
import com.p2082ss.android.ugc.aweme.splash.SplashActivity;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.share.base.ShareCacheRegisterTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl */
public class MainServiceImpl implements IMainService {
    static {
        Covode.recordClassIndex(79687);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isUseJediAwemelistFragment() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean openAdTestUrl(Context context, String str, int i) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public String getApiUrlPrefix() {
        return Api.f79771d;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getMainActivityClass() {
        return MainActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getPreloadInstanceTask() {
        return ColdBootPreloadInstanceTask.f132827a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58259r getAnchorListRequest() {
        return new C67189c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public int getAppVersionCode() {
        return (int) C17867d.m33087h();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getCookieMonitorTask() {
        return new CookieMonitorTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getFetchImUnder16RequestTask() {
        return new FetchImUnder16RequestTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getLegoRequestTask() {
        return new LegoRequestTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58258q getMainInflate() {
        return new X2CAdWebPage();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getRegisterStorageTask() {
        return new RegisterStorageTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getShareCacheRegisterTask() {
        return new ShareCacheRegisterTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Class[] getFixFragmentManagerWhiteList() {
        return new Class[]{C38866ab.class, C38934a.class};
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void initLegoInflate() {
        C58221f.f132590n.mo95697a(X2CAdWebPage.class, new X2CAdWebPage());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isAppHot() {
        return C33836o.m69201a().f80094a.mo89311a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isAwemeAppDataEmpty() {
        if (AwemeAppData.m60956a() != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isContainsKeyWithLruEntries() {
        C68765a.m121209b();
        return C16048b.m29633a().mo25421a(true, "contains_key_with_lruEntries", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isReplaceAwemeCache() {
        C68765a.m121209b();
        return C16048b.m29633a().mo25421a(true, "is_replace_aweme_manager_with_lrucache", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Fragment getFollowFragmentCache() {
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = (ColdBootPreloadInstanceTask) C58221f.m105142a((AbstractC58252n) ColdBootPreloadInstanceTask.f132827a);
        if (coldBootPreloadInstanceTask.f132829c == null) {
            return null;
        }
        Fragment fragment = coldBootPreloadInstanceTask.f132829c;
        coldBootPreloadInstanceTask.f132829c = null;
        return fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Fragment getRecommendFragmentCache() {
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = (ColdBootPreloadInstanceTask) C58221f.m105142a((AbstractC58252n) ColdBootPreloadInstanceTask.f132827a);
        if (coldBootPreloadInstanceTask.f132828b == null) {
            return null;
        }
        Fragment fragment = coldBootPreloadInstanceTask.f132828b;
        coldBootPreloadInstanceTask.f132828b = null;
        return fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Fragment obtainFriendTabFragment() {
        if (MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return new C61515c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Fragment obtainMainPageFragment() {
        if (!MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return null;
        }
        Bundle bundle = new Bundle();
        MainPageFragment mainPageFragment = new MainPageFragment();
        mainPageFragment.setArguments(bundle);
        return mainPageFragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isLimitAdTrackingEnabled() {
        if (((Boolean) C38636an.f91298c.getValue()).booleanValue()) {
            return true;
        }
        if (!C38636an.f91297b) {
            C38636an.f91297b = true;
            if (C58195d.m105112e()) {
                C1731i.m5640b(C38636an.CallableC38637a.f91300a, C40780g.m82241a());
            } else {
                C1731i.m5640b(C38636an.CallableC38638b.f91301a, C1731i.f5562a);
            }
        }
        return C38636an.f91296a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public List<AbstractC34266aw> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C33659b.C33666af());
        arrayList2.add(new C33860x.C33888y());
        arrayList2.add(new C33860x.C33876p());
        arrayList2.add(new C33860x.C33880q());
        arrayList2.add(new C33860x.C33884u());
        arrayList2.add(new C33860x.C33868h());
        arrayList2.add(new C33860x.C33886w());
        arrayList2.add(new C33860x.C33885v());
        arrayList2.add(new C33860x.C33864d());
        arrayList2.add(new C33860x.C33870j());
        arrayList2.add(new C33860x.C33889z());
        arrayList2.add(new C33860x.C33887x());
        arrayList2.add(new C33860x.C33881r());
        arrayList2.add(new C33860x.C33865e());
        arrayList2.add(new C33860x.C33883t());
        arrayList2.add(new C33860x.C33882s());
        arrayList2.add(new C33860x.C33867g());
        arrayList2.add(new C33860x.C33862b());
        arrayList2.add(new C33860x.C33869i());
        arrayList2.add(new C33860x.C33866f());
        arrayList2.add(new C33860x.C33875o());
        arrayList2.add(new C33860x.C33872l());
        arrayList2.add(new C33860x.C33871k());
        arrayList2.add(new C33860x.C33874n());
        arrayList2.add(new C33860x.C33861a());
        arrayList2.add(new C33860x.C33873m());
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C33659b.C33665ae());
        arrayList3.add(new C33659b.C33706r());
        arrayList3.add(new C33659b.C33701m());
        arrayList3.add(new C33659b.C33663ac());
        arrayList3.add(new C33659b.C33695i());
        arrayList3.add(new C33659b.C33664ad());
        arrayList3.add(new C33659b.C33680ap());
        arrayList3.add(new C33659b.C33682ar());
        arrayList3.add(new C33659b.C33660a());
        arrayList3.add(new C33659b.C33688c());
        arrayList3.add(new C33659b.C33709u());
        arrayList3.add(new C33659b.C33661aa());
        arrayList3.add(new C33659b.C33669ah());
        arrayList3.add(new C33659b.C33692f());
        arrayList3.add(new C33659b.C33715z());
        arrayList3.add(new C33659b.C33670ai());
        arrayList3.add(new C33659b.C33704p());
        arrayList3.add(new C33659b.C33705q());
        arrayList3.add(new C33659b.C33675am());
        arrayList3.add(new C33659b.C33712w());
        arrayList3.add(new C33659b.C33700l());
        arrayList3.add(new C33659b.C33662ab());
        arrayList3.add(new C33659b.C33686av());
        arrayList3.add(new C33659b.C33713x());
        arrayList3.add(new C33659b.C33702n());
        arrayList3.add(new C33659b.C33691e());
        arrayList3.add(new C33659b.C33693g());
        arrayList3.add(new C33659b.C33681aq());
        arrayList3.add(new C33659b.C33674al());
        arrayList3.add(new C33659b.C33683as());
        arrayList3.add(new C33659b.C33678ao());
        arrayList3.add(new C33659b.C33671aj());
        arrayList3.add(new C33659b.C33707s());
        arrayList3.add(new C33659b.C33676an());
        arrayList3.add(new C33659b.C33685au());
        arrayList3.add(new C33659b.C33668ag());
        arrayList3.add(new C33659b.C33684at());
        arrayList3.add(new C33659b.C33708t());
        arrayList3.add(new C33659b.C33687b());
        arrayList3.add(new C33659b.C33714y());
        arrayList3.add(new C33659b.C33703o());
        arrayList3.add(new C33659b.C33690d());
        arrayList3.add(new C33659b.C33673ak());
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void restartApp(Bundle bundle) {
        C58958d.m108328a(bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public C69905c avMusicApply(MusicModel musicModel) {
        return C69800b.m123327a(musicModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public AbstractC58264w getAmeActivityResumeRunTask(Activity activity) {
        return new I18nLancet.AmeActivityResumeRun(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z) {
        if (z) {
            return AppLinkHandlerV2.class;
        }
        return AppLinkHandler.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z) {
        if (z) {
            return DeepLinkActivityV2.class;
        }
        return DeepLinkHandlerActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Long getFeedCount(Integer num) {
        return C37493a.m75594a(num);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Intent getMainActivityIntent(Context context) {
        return C80186c.m139003a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public String getSecurityUrl(String str) {
        return C33795a.m69146a(str, "qrcode");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean handleLiveSchema(String str) {
        return C47962l.m90956c(str);
    }

    private JSONArray jsonArrayToJSONArray(C27919i iVar) {
        return new JSONArray(iVar.toString());
    }

    private JSONObject jsonObjectToJSONObject(C28022o oVar) {
        return new JSONObject(oVar.toString());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Context interceptActivityAttachBaseContext(Context context) {
        C35332a.m72316a(context);
        Context b = C53457c.m98656b(context);
        C26975a.m53596a(b, false);
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isDeepLinkHandlerActivity(Context context) {
        if ((context instanceof DeepLinkHandlerActivity) || (context instanceof DeepLinkActivityV2)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void pendingDeepLinkLog(AbstractC89172b<Boolean, C89391z> bVar) {
        bVar.getClass();
        C38767w.m78630a(MainServiceImpl$$Lambda$2.get$Lambda(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void updateIMUserFollowStatus(User user) {
        IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(C53588a.m98833a(user));
    }

    public static IMainService createIMainServicebyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(IMainService.class, z);
        if (a != null) {
            return (IMainService) a;
        }
        return new MainServiceImpl();
    }

    private List<String> mergeKeys(List<String> list) {
        HashSet hashSet = new HashSet();
        for (String str : list) {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                hashSet.add(split[0]);
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean isOnFollowPage(Activity activity) {
        if (activity == null || !(activity instanceof MainActivity)) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (!mainActivity.isUnderMainTab() || !(mainActivity.getCurFragment() instanceof C59014ae)) {
            return false;
        }
        C59014ae aeVar = (C59014ae) mainActivity.getCurFragment();
        if (!aeVar.getUserVisibleHint() || !aeVar.mo96549n()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean shouldChangeToHandle(String str) {
        C89219l.m154721d(str, "");
        int a = C16048b.m29633a().mo25412a(true, "nickname_to_username", 0);
        if (a == 1) {
            return true;
        }
        if (a == 2) {
            return !C89219l.m154714a((Object) str, (Object) "Message");
        }
        if (a == 3) {
            return C89219l.m154714a((Object) str, (Object) "Message");
        }
        if (a != 4) {
            return false;
        }
        if (C89219l.m154714a((Object) str, (Object) "Comment") || C89219l.m154714a((Object) str, (Object) "Notification")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Map<String, Object> getSettings(List<String> list) {
        try {
            Map<String, Object> a = C68783a.m121253a(mergeKeys(list));
            Map<String, Object> hashMap = new HashMap<>();
            for (Map.Entry<String, Object> entry : a.entrySet()) {
                if (entry.getValue() != null) {
                    if (entry.getValue() instanceof C28022o) {
                        hashMap.put(entry.getKey(), jsonObjectToJSONObject((C28022o) entry.getValue()));
                    } else if (entry.getValue() instanceof C27919i) {
                        hashMap.put(entry.getKey(), jsonArrayToJSONArray((C27919i) entry.getValue()));
                    } else {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : list) {
                Object retrieveSettingValue = retrieveSettingValue(str, hashMap);
                if (retrieveSettingValue != null) {
                    hashMap2.put(str, retrieveSettingValue);
                }
            }
            return hashMap2;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void trackAppsFlyerEvent(String str, String str2) {
        C77717b.m135748a(str, str2);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_MainServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120115x1482f180(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public String getFeedOrder(Aweme aweme, Integer num) {
        return C37493a.m75595a(aweme, num);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean openSystemBrowser(Context context, String str) {
        return C38767w.m78651b(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num) {
        num.intValue();
        return false;
    }

    static final /* synthetic */ void lambda$downloadStickerHelper$1$MainServiceImpl(IMainService.DownLoadFinishListener downLoadFinishListener, int i) {
        boolean z;
        if (i == 2006) {
            z = true;
        } else {
            z = false;
        }
        downLoadFinishListener.doAfterDownLoad(i, Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void openDeepLinkActivity(Context context, String str) {
        Intent intent = new Intent(context, DeepLinkActivityV2.class);
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        m120115x1482f180(context, intent);
    }

    private Object retrieveSettingValue(String str, Map<String, Object> map) {
        Object opt;
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        int i = 0;
        Map<String, Object> map2 = map;
        while (map2 != null && i < split.length) {
            String str2 = split[i];
            if (map2 instanceof Map) {
                Map<String, Object> map3 = map2;
                if (map3.containsKey(str2)) {
                    opt = map3.get(str2);
                    i++;
                    map2 = opt;
                }
            }
            if (map2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) map2;
                if (jSONObject.opt(str2) != null) {
                    opt = jSONObject.opt(str2);
                    i++;
                    map2 = opt;
                }
            }
            return null;
        }
        return map2;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2) {
        C41015b.m82628a();
        return C41015b.m82629a(activity, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean openAdOpenUrl(Context context, String str, boolean z) {
        return C38767w.m78643a(context, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return C38767w.m78639a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean startAdsAppActivity(Context context, String str, String str2) {
        return C33722d.C33723a.m69045a(context, str, str2, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2) {
        C89219l.m154721d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        Activity j = C17873f.m33102j();
        if (C39223a.m79589c().mo68606a(4) || C46993gt.m90271a() || j == null) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            return false;
        }
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        User curUser = g2.getCurUser();
        IAccountUserService g3 = C31575b.m65865g();
        C89219l.m154716b(g3, "");
        String curUserId = g3.getCurUserId();
        C89219l.m154716b(curUserId, "");
        long j2 = currentTimeMillis - C46852dt.f109162c.getLong("last_illegal_dialog_show_".concat(String.valueOf(curUserId)), -1);
        int a = C16048b.m29633a().mo25412a(true, "username_modify_tip_interval_2", 0);
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    if (a != 4 || j2 <= 604800000) {
                        return false;
                    }
                    if (!C89219l.m154714a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !C89219l.m154714a((Object) str, (Object) "publish") && !C89219l.m154714a((Object) str, (Object) "profile")) {
                        return false;
                    }
                } else if (j2 <= 172800000) {
                    return false;
                } else {
                    if (!C89219l.m154714a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !C89219l.m154714a((Object) str, (Object) "publish") && !C89219l.m154714a((Object) str, (Object) "profile")) {
                        return false;
                    }
                }
            } else if (j2 <= 172800000) {
                return false;
            } else {
                if (!C89219l.m154714a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !C89219l.m154714a((Object) str, (Object) "publish")) {
                    return false;
                }
            }
        } else if (j2 <= 172800000) {
            return false;
        } else {
            if (!C89219l.m154714a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !C89219l.m154714a((Object) str, (Object) "profile")) {
                return false;
            }
        }
        DialogC34545h hVar = new DialogC34545h(j, curUser);
        C46852dt.f109160a = currentTimeMillis;
        C46852dt.f109161b = str;
        hVar.setOnDismissListener(new C46852dt.DialogInterface$OnDismissListenerC46853a(runnable2, hVar, str, currentTimeMillis));
        if (runnable != null) {
            runnable.run();
        }
        hVar.show();
        C39162r.m79460a("notify_username", new C33744d().mo59983a("enter_from", str).f79943a);
        C46852dt.f109162c.storeLong("last_illegal_dialog_show_".concat(String.valueOf(curUserId)), currentTimeMillis);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void startBulletActivity(Context context, String str, String str2, Bundle bundle) {
        C34963b.m71413a(context, str, str2, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C33722d.C33723a.m69042a(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C33722d.C33723a.m69042a(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void downloadStickerHelper(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener) {
        C60104a.C60105a a = new C60104a.C60105a().mo97710a("scan");
        a.f136996f = false;
        C60104a.C60105a a2 = a.mo97709a(new MainServiceImpl$$Lambda$0(str));
        MainServiceImpl$$Lambda$1 mainServiceImpl$$Lambda$1 = new MainServiceImpl$$Lambda$1(downLoadFinishListener);
        C89219l.m154721d(mainServiceImpl$$Lambda$1, "");
        a2.f136998h = mainServiceImpl$$Lambda$1;
        C89219l.m154721d("qrcode", "");
        a2.f136995e = "qrcode";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        PropReuseServiceImpl.m116994c().mo104484a(activity, arrayList, a2.mo97711a(), z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        Intent intent = new Intent(context, VideoPlayActivity.class);
        intent.putExtra("play_addr_string", str);
        intent.putExtra("cover_image_string", str2);
        intent.putExtra("loop", z);
        intent.putExtra("video_id", str3);
        intent.putExtra("video_md5", str4);
        intent.putExtra("enter_from", str5);
        intent.putExtra("video_type", str6);
        intent.putExtra("progress", f);
        intent.putExtra("tag_line", "");
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService
    public boolean showAdPopUpWebPageWidget(Context context, AwemeRawAd awemeRawAd, Integer num, Integer num2, String str, String str2, Boolean bool, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel) {
        return AdPopUpWebPageWidget.f92172n.mo67716a(new C37977b(context, awemeRawAd, num.intValue(), num2.intValue(), str, str2, bool.booleanValue(), str3, aweme, anchorLynxModel));
    }
}
