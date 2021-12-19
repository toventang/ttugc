package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSchemaSkipDeepLinkEnableSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSchemaSkipDeepLinkSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.android.livesdkapi.p676d.C11621c;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.kit.p1148a.C16350j;
import com.bytedance.ies.bullet.p1145f.C16289a;
import com.bytedance.ies.bullet.p1146g.p1147a.C16293b;
import com.bytedance.ies.bullet.service.base.AbstractC16595af;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16602ak;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1164b.C16624f;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.p1162b.C16560a;
import com.bytedance.ies.bullet.service.p1172f.C16861f;
import com.bytedance.ies.bullet.service.p1172f.C16863g;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p1436j.p1437a.C20087d;
import com.bytedance.p1436j.p1437a.p1440c.C20074b;
import com.bytedance.p1436j.p1437a.p1440c.C20083e;
import com.bytedance.p1469l.C20688a;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.LynxEnv;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.AbstractC58634g;
import com.p2082ss.android.ugc.aweme.live.LiveDummyActivity;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3410g.C58638c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36123r;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.ttlive.ILiveApi;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.e */
public final class C58680e implements IHostAction {

    /* renamed from: a */
    private ILiveApi f133592a = ((ILiveApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ILiveApi.class));

    static {
        Covode.recordClassIndex(68982);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openSignActivity(Context context, Intent intent) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openVideoDetailPage(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void switchToLiveTab(int i, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean tryShowKoiRedPackageInLive(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final List<C11836b> getLiveActivityTasksSetting() {
        return LiveHostOuterService.m107232p().mo95818j();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final String getReportUrl() {
        return LiveHostOuterService.m107232p().mo95819k();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final JSONObject getTTSetting() {
        try {
            return LiveHostOuterService.m107232p().mo95823o();
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final IHostAction.C11788c getVideoOnDemandParams() {
        IHostAction.C11788c cVar = new IHostAction.C11788c();
        double n = LiveHostOuterService.m107232p().mo95822n();
        int m = LiveHostOuterService.m107232p().mo95821m();
        cVar.f28167a = n;
        cVar.f28168b = m;
        return cVar;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void finishLivePlayActivity() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        Class c = ((AbstractC58634g) C20688a.m38943b(AbstractC58634g.class)).mo95868c();
        for (Activity activity : activityStack) {
            if (c.isInstance(activity)) {
                activity.finish();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void initLynxEnv() {
        if (!LynxEnv.m56706b().f66639f.get()) {
            C34963b.m71411a().mo61855a(ILynxKitApi.class);
        }
        AbstractC16628b bVar = (AbstractC16628b) C16622e.C16623a.m30858a().mo26347a("live", AbstractC16628b.class);
        if (bVar == null || !C89219l.m154714a((Object) bVar.mo26329c(), (Object) "live")) {
            Context a = C17867d.m33078a();
            if (!(a instanceof Application)) {
                a = null;
            }
            Application application = (Application) a;
            if (application != null) {
                C20074b.C20075a aVar = new C20074b.C20075a(application);
                AbstractC2953a a2 = C6193a.m13435a(IHostContext.class);
                C89219l.m154716b(a2, "");
                C20083e.f47807b = ((IHostContext) a2).isLocalTest();
                C20074b a3 = aVar.mo33429a();
                AbstractC16580l a4 = C16622e.C16623a.m30858a();
                C16624f.C16625a a5 = new C16624f.C16625a().mo26383a(AbstractC16628b.class, new C20087d(a3));
                C58638c.C58639a aVar2 = new C58638c.C58639a();
                C16602ak.C16603a aVar3 = new C16602ak.C16603a();
                aVar3.f39729b = "99999";
                C16624f.C16625a a6 = a5.mo26383a(AbstractC16654o.class, new C16560a(aVar2, aVar3.mo26368a()));
                C16350j jVar = new C16350j(application);
                C89219l.m154716b(C81631k.f182525a, "");
                C89219l.m154716b("gecko-sg.tiktokv.com", "");
                String a7 = C58071d.m104907a();
                C89219l.m154716b(a7, "");
                ArrayList arrayList = new ArrayList();
                for (Pattern pattern : C11621c.m20436a()) {
                    if (pattern != null) {
                        String pattern2 = pattern.toString();
                        C89219l.m154716b(pattern2, "");
                        if (pattern2.length() > 0) {
                            Uri parse = Uri.parse(pattern.toString());
                            C89219l.m154716b(parse, "");
                            String path = parse.getPath();
                            if (!(path == null || path.length() == 0)) {
                                String path2 = parse.getPath();
                                if (path2 == null) {
                                    C89219l.m154715b();
                                }
                                C89219l.m154716b(path2, "");
                                arrayList.add(path2);
                            }
                        }
                    }
                }
                String valueOf = String.valueOf(C17867d.f42590n);
                String f = C17867d.m33085f();
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                C16289a aVar4 = new C16289a();
                GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl(application);
                C81631k kVar = C81631k.f182525a;
                C89219l.m154716b(kVar, "");
                String c = kVar.mo125297c();
                C89219l.m154716b(c, "");
                jVar.init(new C16666i("gecko-sg.tiktokv.com", a7, arrayList, valueOf, f, serverDeviceId, new GeckoConfig(c, "offlineX", new C16293b(), true, false, 16, null), null, aVar4, geckoXNetImpl, 128));
                a4.mo26349a("live", a6.mo26383a(IResourceLoaderService.class, jVar).mo26383a(AbstractC16595af.class, new C16863g(new C16861f.C16862a().mo26660a())).mo26385a());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final AbstractC11769i getSearchComponent(final String str) {
        return new AbstractC11769i() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58680e.C586811 */

            static {
                Covode.recordClassIndex(68983);
            }

            @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
            /* renamed from: a */
            public final List<EnterRoomConfig> mo18716a() {
                return LiveOuterService.m107269s().mo95835i().mo105585a(str).mo18716a();
            }

            @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
            /* renamed from: b */
            public final void mo18720b() {
                LiveOuterService.m107269s().mo95835i().mo105585a(str).mo18720b();
            }

            @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
            /* renamed from: a */
            public final void mo18718a(long j) {
                LiveOuterService.m107269s().mo95835i().mo105585a(str).mo18718a(j);
            }

            @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
            /* renamed from: a */
            public final void mo18719a(Map<String, String> map) {
                LiveOuterService.m107269s().mo95835i().mo105585a(str).mo18719a(map);
            }

            @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
            /* renamed from: a */
            public final void mo18717a(int i, AbstractC11769i.AbstractC11770a aVar) {
                LiveOuterService.m107269s().mo95835i().mo105585a(str).mo18717a(i, aVar);
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void notifyShowLiveIconEntrance(boolean z) {
        LiveHostOuterService.m107232p().mo95804a(z);
    }

    /* renamed from: a */
    private static boolean m107831a(Uri uri) {
        String host = uri.getHost();
        if (!(TextUtils.equals(host, "webcast_lynxview") || TextUtils.equals(host, "webcast_webview") || TextUtils.equals(host, "webcast_lynxview_popup") || TextUtils.equals(host, "webcast_webview_popup"))) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        Uri parse = Uri.parse(queryParameter);
        for (String str : LiveSchemaSkipDeepLinkSetting.INSTANCE.getValue()) {
            if (TextUtils.equals(parse.getHost(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Object m107827a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m107829a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openRegionListPage(Activity activity, final IHostAction.AbstractC11787b bVar) {
        C31575b.m65860b().openCountryListActivity(activity, new AbstractC34292ax() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58680e.C586822 */

            static {
                Covode.recordClassIndex(68984);
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
            public final void onExit() {
                IHostAction.AbstractC11787b bVar = bVar;
                if (bVar != null) {
                    bVar.mo13358a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
            public final void onChanged(String str, String str2) {
                IHostAction.AbstractC11787b bVar = bVar;
                if (bVar != null) {
                    bVar.mo13359a(str, str2);
                }
            }
        });
    }

    /* renamed from: a */
    private static String m107828a(String str, Bundle bundle) {
        C36131u a = C36131u.m73602a(str);
        for (String str2 : bundle.keySet()) {
            Object a2 = m107827a(bundle, str2);
            if (a2 != null) {
                a.mo63248a(str2, a2.toString());
            }
        }
        return a.f85356a.mo52126a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openFeedBack(String str, Context context) {
        Intent a = LiveHostOuterService.m107232p().mo95797a(context);
        a.setData(Uri.parse("https://m.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1?enter_from=".concat(String.valueOf(str))));
        a.putExtra("hide_nav_bar", true);
        m107829a(context, a);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openUserProfilePage(long j, Map<String, String> map) {
        C36131u a = C36131u.m73602a("aweme://user/profile/".concat(String.valueOf(j)));
        if (map != null) {
            for (String str : map.keySet()) {
                a.mo63248a(str, map.get(str));
            }
        }
        C36125t.m73598a(C36125t.m73591a(), a.f85356a.mo52126a());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return handleSchema(context, str, bundle, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean openHostBrowser(String str, Bundle bundle, Context context) {
        Intent a = LiveHostOuterService.m107232p().mo95797a(context);
        a.putExtras(bundle);
        a.setData(Uri.parse(str));
        m107829a(context, a);
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString("title", str2);
        openLiveBrowser(str, bundle, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openUserProfilePage(Context context, long j, Bundle bundle) {
        C36125t.m73598a(C36125t.m73591a(), "aweme://user/profile/".concat(String.valueOf(j)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void goEditDoBAgeGatePage(Activity activity, String str, IHostAction.AbstractC11786a aVar) {
        this.f133592a.getDoBStatus().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C58683f(activity, aVar, str), new C58684g(aVar));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveLynx(String str, Bundle bundle, Context context) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            intent.putExtra("intent_type", 4);
            intent.putExtras(bundle);
            m107829a(context, intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveNewHybrid(Uri uri, Context context, Bundle bundle) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            intent.putExtra("intent_type", 5);
            bundle.putParcelable("bundle_uri", uri);
            intent.putExtras(bundle);
            m107829a(context, intent);
        }
    }

    /* renamed from: a */
    private static boolean m107830a(Context context, String str, boolean z) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("sslocal://showcaseh5")) {
            LiveHostOuterService.m107232p().mo95802a(context, str);
            return true;
        } else if (!z) {
            SmartRouter.buildRoute(context, str).open();
            return true;
        } else {
            Uri parse = Uri.parse(str);
            if (!LiveSchemaSkipDeepLinkEnableSetting.INSTANCE.getValue() || !m107831a(parse)) {
                Intent b = LiveHostOuterService.m107232p().mo95806b(context);
                b.setData(parse);
                m107829a(context, b);
                return true;
            }
            SmartRouter.buildRoute(context, str).open();
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String str, Bundle bundle, Context context) {
        Uri parse;
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            String string = bundle.getString("original_scheme");
            if (!TextUtils.isEmpty(string) && (parse = Uri.parse(string)) != null) {
                String queryParameter = parse.getQueryParameter("sec_link_scene");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("sec_link_scene", queryParameter);
                }
            }
            bundle.putBoolean("show_progress", false);
            intent.putExtra("intent_type", 1);
            intent.putExtras(bundle);
            m107829a(context, intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean openHostBrowser(String str, boolean z, String str2, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("aweme://webview/?url=").append(str);
        if (z) {
            sb.append("&title=").append(str2);
        }
        return m107830a(context, sb.toString(), true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle, boolean z) {
        Activity activity;
        if (!(context instanceof Activity)) {
            return false;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1863814380:
                if (str.equals("//report") && (activity = (Activity) context) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://www.tiktokv.com/aweme/in_app/report/");
                    try {
                        sb.append("?object_id=").append(m107827a(bundle, "reportVideo.user.id")).append("&owner_id=").append(m107827a(bundle, "reportVideo.user.id")).append("&report_type=").append(m107827a(bundle, "reportVideo.activity.type")).append("&room_id=").append(m107827a(bundle, "reportVideo.media.id"));
                    } catch (Exception unused) {
                    }
                    Intent a = LiveHostOuterService.m107232p().mo95797a((Context) activity);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("show_load_dialog", false);
                    bundle2.putBoolean("hide_nav_bar", true);
                    a.putExtras(bundle2);
                    a.setData(Uri.parse(sb.toString()));
                    C84349a.m145093a(a, activity);
                    activity.startActivity(a);
                    break;
                }
            case -1813849575:
                if (str.equals("//webview")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("aweme://webview/?url=").append(m107827a(bundle, "bundle_open_url"));
                    if (bundle.containsKey("title")) {
                        sb2.append("&title=").append(m107827a(bundle, "title"));
                    }
                    str = sb2.toString();
                    break;
                }
                break;
            case -1588030678:
                if (str.equals("//livend/submitfeedbackacitivity") && bundle != null && bundle.containsKey("roomId")) {
                    try {
                        C36131u a2 = C36131u.m73602a(C52912c.f121688a.f121689b.getFeedbackConf().getFeHelp());
                        a2.f85356a.mo52129a("roomId", bundle.getLong("roomId"));
                        C36123r rVar = C36125t.m73591a().f85349c;
                        if (rVar.f85333b == null) {
                            rVar.f85333b = new ArrayList<>();
                        }
                        rVar.f85333b.add("roomId");
                        a2.mo63248a("feedback_id", "6954");
                        a2.mo63248a("enter_from", "live_end");
                        C36125t.m73598a(C36125t.m73591a(), a2.mo63249a());
                        break;
                    } catch (C16041a unused2) {
                        break;
                    }
                }
            case -570110082:
                if (str.equals("//verify/acitivity")) {
                    str = "aweme://aweme/zhima/live";
                    break;
                }
                break;
            case -262720268:
                if (str.equals("//live/detail")) {
                    long j = bundle.getLong("live.intent.extra.ROOM_ID");
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f28233c.f28301R = j;
                    LiveOuterService.m107269s().mo95835i().mo105591a(context, enterRoomConfig, "");
                    break;
                }
                break;
            case 337200928:
                if (str.equals("//chargeDeal")) {
                    new C58686i().openWallet((Activity) context);
                    return true;
                }
                break;
            case 947267529:
                if (str.equals("//profile")) {
                    str = m107828a("aweme://user/profile/" + m107827a(bundle, "user_id"), bundle);
                    break;
                }
                break;
            case 1392218355:
                if (str.equals("//item")) {
                    str = m107828a("aweme://aweme/detail/" + m107827a(bundle, "extra_key_id"), bundle);
                    break;
                }
                break;
        }
        return m107830a(context, str, z);
    }
}
