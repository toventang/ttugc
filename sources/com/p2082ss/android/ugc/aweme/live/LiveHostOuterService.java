package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.p693a.AbstractC11796a;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.AbstractC18358r;
import com.bytedance.ies.web.jsbridge2.C18345k;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.keva.Keva;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.newmedia.AbstractC30133e;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49683k;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.model.C58724c;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.net.C61402j;
import com.p2082ss.android.ugc.aweme.p2756df.C41465a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63830ag;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.C74680b;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.web.C81531b;
import com.p2082ss.android.ugc.aweme.web.C81546h;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.LiveHostOuterService */
public class LiveHostOuterService implements AbstractC11796a, ILiveHostOuterService {

    /* renamed from: a */
    private Handler f133135a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(68766);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final String mo95798a() {
        return "api.tiktokv.com";
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: l */
    public final String mo95820l() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: e */
    public final boolean mo95813e() {
        return C81631k.f182526b;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95804a(boolean z) {
        AbstractC81915c.m141874a(new C49683k(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: c */
    public final Locale mo95809c() {
        return C53438a.m98619a((String) null, (String) null, C17867d.m33078a());
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: f */
    public final String mo95814f() {
        AbstractC30133e.m60956a();
        return C81631k.f182525a.mo53730a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: g */
    public final boolean mo95815g() {
        try {
            return C52912c.f121688a.f121689b.getEnableAutoLiveState().booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: i */
    public final void mo95817i() {
        this.f133135a.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.LiveHostOuterService.RunnableC584802 */

            static {
                Covode.recordClassIndex(68768);
            }

            public final void run() {
                if (C61402j.m111178a().mo28821b() == null) {
                    new InitTTNetTask().mo28600a(C17879g.m33104a());
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: m */
    public final int mo95821m() {
        return AbstractC74616d.m131036a().mo117293e();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: b */
    public final boolean mo95808b() {
        return C39223a.m79601o().mo68703a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: d */
    public final List<String> mo95812d() {
        return C81546h.m141420a((List<String>) Arrays.asList("host", "webcast"), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: h */
    public final long mo95816h() {
        try {
            return C52912c.f121688a.f121689b.getAutoLiveStateIntervalMills().longValue();
        } catch (C16041a unused) {
            return 60000;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: k */
    public final String mo95819k() {
        try {
            return C52912c.f121688a.f121689b.getFeedbackConf().getFeHelp();
        } catch (C16041a e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: p */
    public static ILiveHostOuterService m107232p() {
        MethodCollector.m26663i(7626);
        Object a = C81908b.m141854a(ILiveHostOuterService.class, false);
        if (a != null) {
            ILiveHostOuterService iLiveHostOuterService = (ILiveHostOuterService) a;
            MethodCollector.m26664o(7626);
            return iLiveHostOuterService;
        }
        if (C81908b.f183293cq == null) {
            synchronized (ILiveHostOuterService.class) {
                try {
                    if (C81908b.f183293cq == null) {
                        C81908b.f183293cq = new LiveHostOuterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7626);
                    throw th;
                }
            }
        }
        LiveHostOuterService liveHostOuterService = (LiveHostOuterService) C81908b.f183293cq;
        MethodCollector.m26664o(7626);
        return liveHostOuterService;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: n */
    public final double mo95822n() {
        RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.f180314a.f180316b;
        if (rateSettingsResponse == null) {
            return 0.0d;
        }
        double d = C84116g.m144636e().mo124230d();
        C74680b autoBitrateSetLive = rateSettingsResponse.getAutoBitrateSetLive();
        if (d <= 0.0d || autoBitrateSetLive == null) {
            return 0.0d;
        }
        return Math.max((autoBitrateSetLive.f167865a * d * d * d) + (autoBitrateSetLive.f167866b * d * d) + (autoBitrateSetLive.f167867c * d) + autoBitrateSetLive.f167868d, autoBitrateSetLive.f167869e);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: o */
    public final JSONObject mo95823o() {
        JSONObject optJSONObject;
        Keva repo = Keva.getRepo("TTSettingData");
        if (repo == null || (optJSONObject = new JSONObject(repo.getString("settingData", "")).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("app");
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: j */
    public final List<C11836b> mo95818j() {
        ArrayList arrayList = new ArrayList();
        try {
            List<UgActivityTasks> activityTasks = C52912c.f121688a.f121689b.getAwemeActivitySetting().getActivityTasks();
            if (activityTasks != null) {
                for (UgActivityTasks ugActivityTasks : activityTasks) {
                    if (ugActivityTasks.getTaskType().intValue() == 2 || ugActivityTasks.getTaskType().intValue() == 3) {
                        C11836b bVar = new C11836b();
                        bVar.f28198a = ugActivityTasks.getTaskId();
                        bVar.f28199b = ugActivityTasks.getTaskType();
                        bVar.f28200c = Long.valueOf(ugActivityTasks.getTime().longValue());
                        bVar.f28201d = ugActivityTasks.getUrlList();
                        arrayList.add(bVar);
                    }
                }
            }
        } catch (C16041a unused) {
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final Intent mo95797a(Context context) {
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: b */
    public final Intent mo95806b(Context context) {
        return new Intent(context, DeepLinkActivityV2.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95799a(long j) {
        AbstractC81915c.m141874a(new C58724c(j));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: c */
    public final boolean mo95811c(Context context) {
        if ((context instanceof DeepLinkHandlerActivity) || (context instanceof DeepLinkActivityV2)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95800a(Activity activity) {
        C80534hh.m139605a(activity);
    }

    @Override // com.bytedance.android.livesdkapi.host.p693a.AbstractC11796a
    /* renamed from: a */
    public final Object mo18856a(Context context, Object obj) {
        C81531b bVar = new C81531b(context);
        C18364w wVar = (C18364w) obj;
        C89219l.m154719c(wVar, "");
        C30248e eVar = new C30248e(wVar);
        eVar.f72169e = false;
        eVar.f72167c = true;
        C30248e a = C30248e.m61218a(eVar.mo53710a(bVar), Arrays.asList("host", "webcast"), false, null, null, 12);
        bVar.mo53680a(a, (C30245c) null);
        return a.f72168d;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: b */
    public final void mo95807b(Context context, String str) {
        if (C58071d.m104909c() || !TextUtils.equals("amazon", C17867d.f42595s)) {
            String str2 = "";
            if (C41465a.f96715a == null) {
                str2 = SharePrefCache.inst().getSharePref().getString(str, str2);
            } else if (TextUtils.equals(str, "page_charge") && !TextUtils.isEmpty(C41465a.f96715a.mo70725a())) {
                str2 = C41465a.f96715a.mo70725a();
            } else if (TextUtils.equals(str, "page_index") && !TextUtils.isEmpty(C41465a.f96715a.mo70726b())) {
                str2 = C41465a.f96715a.mo70726b();
            }
            if (TextUtils.isEmpty(str2)) {
                if (!C58071d.m104909c()) {
                    if (!TextUtils.equals(str, "page_index")) {
                        TextUtils.equals(str, "page_charge");
                    }
                    str2 = "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
                } else if (!TextUtils.equals(str, "page_index") && TextUtils.equals(str, "page_charge")) {
                    str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Frecharge%3Fhide_nav_bar%3D1";
                } else {
                    str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
                }
            }
            Intent a = C40520b.m81719a(context, Uri.parse(str2));
            C84349a.m145093a(a, context);
            context.startActivity(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95802a(Context context, String str) {
        C38767w.m78629a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final Dialog mo95796a(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        return C68863ah.f154027a.mo109393a(activity, cVar, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: b */
    public final Dialog mo95805b(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        return C68863ah.f154027a.mo109415b(activity, cVar, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: c */
    public final void mo95810c(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        AbstractC69581b a = C68963a.C68964a.m121652a(cVar.f27811a, activity);
        if (a != null && a.mo109557b(activity)) {
            SharePackage c = C68863ah.f154027a.mo109419c(activity, cVar, bVar);
            if (a.mo61913a(c.mo87088a(a), activity)) {
                bVar.mo8903a(cVar.f27811a, "link", c.f155492i);
            } else {
                bVar.mo8904a(new Throwable());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95801a(Activity activity, boolean z, boolean z2) {
        if (z && z2 && !C33836o.m69201a().f80094a.mo89311a()) {
            Intent intent = new Intent(activity, MainActivity.class);
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService
    /* renamed from: a */
    public final void mo95803a(String str, String str2, final ILiveHostOuterService.AbstractC58469a aVar) {
        C584791 r2 = new C63830ag() {
            /* class com.p2082ss.android.ugc.aweme.live.LiveHostOuterService.C584791 */

            static {
                Covode.recordClassIndex(68767);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.profile.presenter.C63830ag
            /* renamed from: c */
            public final void mo57528c() {
                T t = this.f92286h.mData;
                if (t == null) {
                    aVar.mo95824a((User) null);
                    return;
                }
                aVar.mo95824a(t.getUser());
            }

            @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63822aa, com.p2082ss.android.ugc.aweme.profile.presenter.C63830ag
            /* renamed from: a_ */
            public final void mo57526a_(Exception exc) {
                aVar.mo95825a(exc);
                super.mo57526a_(exc);
            }
        };
        r2.mo103298d();
        r2.mo57616a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.p693a.AbstractC11796a
    /* renamed from: a */
    public final Object mo18857a(Object obj, Context context, Object obj2, View view, Object obj3) {
        if (!(obj instanceof C18364w) || !(obj3 instanceof AbstractC18329b)) {
            return null;
        }
        final C16248b bVar = new C16248b();
        C18345k a = C18364w.m34180a((C18364w) obj);
        a.f43887c = (AbstractC18329b) obj3;
        a.f43895k = new AbstractC18358r() {
            /* class com.p2082ss.android.ugc.aweme.live.LiveHostOuterService.C584813 */

            static {
                Covode.recordClassIndex(68769);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18358r
            /* renamed from: a */
            public final void mo29393a() {
                bVar.mo25824a();
            }
        };
        C18364w d = a.mo29377d();
        bVar.mo25828a(Context.class, context);
        if (obj2 instanceof AbstractC16629c) {
            bVar.mo25828a(AbstractC16629c.class, obj2);
        }
        if (view instanceof LynxView) {
            bVar.mo25828a(LynxView.class, view);
        }
        if (context instanceof Activity) {
            bVar.mo25831b(AbstractC17045g.class, new BulletActivityWrapper((Activity) context));
        }
        List<AbstractC16183k> a2 = BulletHostProxy.m71370b().mo61835a(bVar);
        for (int i = 0; i < a2.size(); i++) {
            AbstractC16183k kVar = a2.get(i);
            d.mo29400a(kVar.mo25752d(), (AbstractC18334e.AbstractC18336b) new C58491ac(this, kVar));
        }
        return d;
    }
}
