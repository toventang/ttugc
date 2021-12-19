package com.p2082ss.android.ugc.aweme.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.C18513f;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1349o.C18807b;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.bytedance.ies.xbridge.platform.p1352b.p1353a.AbstractC18821a;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.attribution.AppsFlyerAttributionMethod;
import com.p2082ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.GetABTest;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.C53517a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3067c.C53556a;
import com.p2082ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.net.C61362h;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AddAnchorEventMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AppInfoMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.BdturingMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.BroadcastMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47920c;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47935d;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47937e;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ChooseArticleInfoMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.CloseMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ClosePopUpWebPageMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ComponentDidMountMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.DarkModeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.DisableGestureClose;
import com.p2082ss.android.ugc.aweme.p2929fe.method.DownloadFileMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.EnterUserPostFeedsMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.FestivalShareMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetContainerIdMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetMicroAppInfoMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetNativeItemMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetSettingsMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.p2929fe.method.HasFeedbackMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.JsAppDownloadMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.JumpToLiveMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.LaunchChatMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.LoadFeedsFlowMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.LoadFeedsMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.LoadGeckoResourcesMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.LoginMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.MiniAppPreloadMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.NoticePermissionMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OnBackPressedMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenAdLandPageLinksMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenAwemeDetailMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenBrowserMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenCalendarMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenConversationMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenFeedsFlowMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenPDFMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenRechargePanel;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenSchemaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.OpenShortVideoMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.PayMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.PreparePayMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ReportCustomEventMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.RequestAddressBookPermission;
import com.p2082ss.android.ugc.aweme.p2929fe.method.RequestPermissionMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.RoutePopMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.RoutePushMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.SendAnalyticsEventMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.SendLogMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.SendLogV3Method;
import com.p2082ss.android.ugc.aweme.p2929fe.method.SetNativeItemMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ShareRankMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ShowDmtToastMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ShowToastMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.TokenShareMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.UpdateAppVersionMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.UpdateKProjectStateMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.UploadContactsMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.UserInfoMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.cjpay.CJModalViewMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.cjpay.CJOpenH5Method;
import com.p2082ss.android.ugc.aweme.p2929fe.method.cjpay.CJPrefetchMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.FetchFeedsAwemeDataMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.OpenECommerceLegalModalMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.OpenGoodDetailMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.RefreshNavTitleMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.TaoCommandMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.commerce.VideoPublishMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.douplus.DouplusShowResultMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.p2934im.ShareWebToChatMethod;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.aweme.shortcut.p3785a.p3786a.C69707a;
import com.p2082ss.android.ugc.aweme.specact.pendant.bridge.SpecActFollowMethod;
import com.p2082ss.android.ugc.aweme.specact.pendant.bridge.SyncWatchedVideoTimeMethod;
import com.p2082ss.android.ugc.aweme.specact.popup.calendar.CheckCalendarExistMethod;
import com.p2082ss.android.ugc.aweme.specact.popup.calendar.CreateCalendarEventMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81595aa;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81596ab;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81597ac;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81599ad;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81600b;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81602c;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81604e;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81607f;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81609h;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81613k;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81614l;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81615m;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81616n;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81620r;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81623u;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81624v;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81625w;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81626x;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81629y;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81630z;
import com.p2082ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.CopyMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.p2082ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.ShowOpenAuthHalf;
import com.p2082ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import com.p2082ss.android.ugc.aweme.web.p4237a.C81530a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.b */
public final class C81531b extends AbstractC81548i implements AbstractC81544f {

    /* renamed from: A */
    public C34337k f182323A;

    /* renamed from: B */
    private AbstractC81545g f182324B;

    /* renamed from: C */
    private final C81577a.AbstractC81580c f182325C = new C81577a.AbstractC81580c() {
        /* class com.p2082ss.android.ugc.aweme.web.C81531b.C815343 */

        static {
            Covode.recordClassIndex(94912);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            if (r0 != 0) goto L_0x0057;
         */
        @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.AbstractC81580c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo61885a(com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.C81579b r6, com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a.C81581d r7) {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.C81531b.C815343.mo61885a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    };

    static {
        Covode.recordClassIndex(94909);
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a
    /* renamed from: c */
    public final boolean mo53690c() {
        if (!C58939a.C58940a.f134171a.f134170a.enableBoe() || !C58939a.C58940a.f134171a.f134170a.enableBoeJsbBypass()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a
    /* renamed from: b */
    public final List<String> mo53686b() {
        super.mo53686b();
        this.f72124d.add("sendLog");
        this.f72124d.add("openSchoolEdit");
        this.f72124d.add("formDialogClose");
        this.f72124d.add("openSchoolEdit");
        this.f72124d.add("orderResult");
        this.f72124d.add("sendAnalyticsEvent");
        return this.f72124d;
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30267k
    /* renamed from: a */
    public final void mo53726a(C34337k kVar) {
        this.f182323A = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81548i
    /* renamed from: a */
    public final void mo125256a(AbstractC81545g gVar) {
        this.f182324B = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81544f
    /* renamed from: c */
    public final void mo125257c(String str) {
        AbstractC81545g gVar = this.f182324B;
        if (gVar != null) {
            gVar.mo67254a(str);
        }
    }

    public C81531b(Context context) {
        super(context);
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a, com.p2082ss.android.sdk.webview.p2175a.C30235b.AbstractC30236a
    /* renamed from: a */
    public final void mo53684a(JSONObject jSONObject) {
        super.mo53684a(jSONObject);
        if (TextUtils.equals(this.f72135o, "1")) {
            TextUtils.isEmpty(this.f72136p);
        }
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a
    /* renamed from: a */
    public final boolean mo53685a(String str) {
        String str2;
        int indexOf;
        if (!C30128d.m60946a(str)) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                str2 = Uri.parse(str).getHost();
            } else {
                str2 = Uri.parse(str.substring(0, indexOf)).getHost();
            }
            if (str2 == null) {
                return false;
            }
            if (C61362h.m111100a(str2, "host")) {
                return true;
            }
            return super.mo53685a(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a
    /* renamed from: a */
    public final List<String> mo53678a(List<String> list, boolean z) {
        this.f72126f = C81546h.m141420a(list, z);
        return this.f72126f;
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30232a
    /* renamed from: b */
    public final void mo53687b(final C30248e eVar, C30245c cVar) {
        int i;
        Map<String, AbstractC18293d> map;
        WeakReference weakReference = this.f72123c;
        C18742c cVar2 = new C18742c();
        cVar2.mo29770a(C18288a.class, eVar.f72166b);
        cVar2.mo29770a(Context.class, weakReference.get());
        cVar2.mo29771b(AbstractC18400b.AbstractC18404d.class, new AbstractC18400b.AbstractC18404d() {
            /* class com.p2082ss.android.ugc.aweme.web.C81531b.C815321 */

            static {
                Covode.recordClassIndex(94910);
            }

            @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18404d
            /* renamed from: a */
            public final void mo13406a(String str, AbstractC18754n nVar) {
                JSONObject jSONObject = new JSONObject();
                if (nVar != null) {
                    jSONObject = C18809c.m34905a(nVar);
                }
                eVar.mo53712a(str, jSONObject);
            }
        });
        C53517a.m98737a();
        C53556a.m98767a();
        C815332 r6 = new AbstractC18821a() {
            /* class com.p2082ss.android.ugc.aweme.web.C81531b.C815332 */

            static {
                Covode.recordClassIndex(94911);
            }

            @Override // com.bytedance.ies.xbridge.platform.p1352b.p1353a.AbstractC18821a
            /* renamed from: a */
            public final Object mo29825a(String str, AbstractC18293d dVar) {
                return eVar.mo53711a(str, dVar);
            }

            @Override // com.bytedance.ies.xbridge.platform.p1352b.p1353a.AbstractC18821a
            /* renamed from: a */
            public final void mo29826a(String str, JSONObject jSONObject) {
                C18288a aVar = eVar.f72166b;
                if (aVar != null) {
                    aVar.mo29249a(str, jSONObject);
                }
            }
        };
        C89219l.m154719c(r6, "");
        EnumC18483e eVar2 = EnumC18483e.WEB;
        C89219l.m154719c(eVar2, "");
        C18513f fVar = new C18513f();
        Map map2 = C18371a.m34206a(eVar2, "DEFAULT");
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                fVar.mo29641a((String) entry.getKey(), new C18807b.C18808a(entry, fVar, eVar2, cVar2));
            }
        }
        C18822b bVar = (C18822b) C18371a.m34204a(C18822b.class);
        if (bVar != null) {
            C89219l.m154719c(r6, "");
            C89219l.m154719c(fVar, "");
            for (Map.Entry entry2 : C89041ag.m154429c(fVar.mo29640a().f44171a).entrySet()) {
                r6.mo29825a((String) entry2.getKey(), new C18822b.C18823a(bVar, r6, fVar));
            }
        }
        eVar.mo53711a("fission_withdrawal", new C69707a());
        C18288a aVar = eVar.f72166b;
        eVar.mo53711a("close", new CloseMethod(aVar).attach(this.f72123c)).mo53711a("userInfo", new UserInfoMethod(aVar).attach(this.f72123c)).mo53711a("darkMode", new DarkModeMethod(aVar).attach(this.f72123c)).mo53711a("updateAppVersion", new UpdateAppVersionMethod(aVar).attach(this.f72123c)).mo53711a("addAnchor", new AddAnchorEventMethod(aVar).attach(this.f72123c)).mo53711a("sendLog", new SendLogMethod(aVar).attach(this.f72123c)).mo53711a("sendLogV3", new SendLogV3Method(aVar).attach(this.f72123c)).mo53711a("openSchema", new OpenSchemaMethod(aVar).attach(this.f72123c)).mo53711a("x.openPDF", new OpenPDFMethod(aVar).attach(this.f72123c)).mo53711a(ShareH5Service.C68827a.m121397a().mo109374a(), ShareH5Service.C68827a.m121397a().mo109384b(aVar).attach(this.f72123c)).mo53711a(ShareH5Service.C68827a.m121397a().mo109385b(), ShareH5Service.C68827a.m121397a().mo109390c(aVar).attach(this.f72123c)).mo53711a(ShareH5Service.C68827a.m121397a().mo109391c(), ShareH5Service.C68827a.m121397a().mo109373a(aVar).attach(this.f72123c)).mo53711a("showToast", new ShowToastMethod(aVar).attach(this.f72123c)).mo53711a("openBrowser", new OpenBrowserMethod(aVar).attach(this.f72123c)).mo53711a("CJPrefetch", new CJPrefetchMethod(aVar).attach(this.f72123c)).mo53711a("CJModalView", new CJModalViewMethod(aVar).attach(this.f72123c)).mo53711a("CJOpen", new CJOpenH5Method(aVar).attach(this.f72123c)).mo53711a("appInfo", new AppInfoMethod(aVar).attach(this.f72123c)).mo53711a("componentDidMount", new ComponentDidMountMethod(aVar).attach(this.f72123c)).mo53711a("componentDidMount", new ComponentDidMountMethod(aVar).attach(this.f72123c)).mo53711a("routePush", new RoutePushMethod(aVar).attach(cVar)).mo53711a("open_short_video", new OpenShortVideoMethod(aVar).attach(this.f72123c)).mo53711a("open_long_video", new OpenLongVideoMethod(aVar).attach(this.f72123c)).mo53711a("openFeedsFlow", new OpenFeedsFlowMethod(aVar).attach(this.f72123c)).mo53711a("openAwemeDetail", new OpenAwemeDetailMethod(aVar).attach(this.f72123c)).mo53711a("loadFeeds", new LoadFeedsMethod(aVar).attach(this.f72123c)).mo53711a("loadFeedsFlow", new LoadFeedsFlowMethod(aVar).attach(this.f72123c)).mo53711a("downloadMedia", new DownloadFileMethod(aVar).attach(this.f72123c)).mo53711a("publishMedia", new VideoPublishMethod(aVar).attach(this.f72123c)).mo53711a("routePop", new RoutePopMethod(aVar).attach(cVar)).mo53711a("getContainerId", new GetContainerIdMethod(aVar).attach(cVar)).mo53711a("openAdLandPageLinks", new OpenAdLandPageLinksMethod(aVar).attach(cVar)).mo53711a("closePopUpWebPage", new ClosePopUpWebPageMethod(aVar).attach(cVar)).mo53711a("loadGeckoResources", new LoadGeckoResourcesMethod(aVar).attach(cVar)).mo53711a("calendarOperation", new OpenCalendarMethod(aVar).attach(this.f72123c)).mo53711a("popTuringVerifyView", new BdturingMethod(aVar).attach(this.f72123c)).mo53711a("reportCustomEvent", new ReportCustomEventMethod(aVar).attach(cVar));
        new C81530a(aVar, eVar, this.f72123c);
        C18288a aVar2 = eVar.f72166b;
        AbstractC18293d attach = new JsAppDownloadMethod(aVar2).attach(this.f72123c);
        eVar.mo53711a("login", new LoginMethod(aVar2, false).attach(this.f72123c)).mo53711a("loginWithPlatform", new LoginMethod(aVar2, true).attach(this.f72123c)).mo53711a("apiParam", new C81602c()).mo53711a("openAweme", new C81604e(this.f72123c, aVar2)).mo53711a("openRecord", new C81595aa(this.f72123c, aVar2)).mo53711a("publishVideo", new C81629y(this.f72123c)).mo53711a("bindPhone", new C81607f(aVar2, this.f72123c)).mo53711a("enterUserFeed", new EnterUserPostFeedsMethod(aVar2).attach(this.f72123c)).mo53711a("noticePermission", new NoticePermissionMethod(aVar2).attach(this.f72123c)).mo53711a("fetch", new C81620r(aVar2, this.f182325C)).mo53711a("openSysDialog", new C81626x(this.f72123c, aVar2)).mo53711a("uploadFile", new C47937e(this.f72123c, aVar2)).mo53711a("downloadApp", new C81616n(this.f72123c)).mo53711a("stickGame", new C81596ab()).mo53711a("formDialogClose", new C81614l()).mo53711a("dpDisableGestureClose", new DisableGestureClose(aVar2)).mo53711a("subscribe_app_ad", attach).mo53711a("unsubscribe_app_ad", attach).mo53711a("download_app_ad", attach).mo53711a("cancel_download_app_ad", attach).mo53711a("download_order", attach).mo53711a("ad_download_list", attach).mo53711a("get_download_pause_task", attach).mo53711a("get_downloading_task", attach).mo53711a("get_install_status", attach).mo53711a("accountLogout", new C81623u()).mo53711a("launchChat", new LaunchChatMethod().attach(this.f72123c)).mo53711a("showDmtToast", new ShowDmtToastMethod().attach(this.f72123c)).mo53711a("receiveCoupon", new C81630z()).mo53711a("getThirdLoginToken", new OpenThirdLoginVerifyMethod(aVar2).attach(this.f72123c)).mo53711a("scan", new C81624v(this.f72123c)).mo53711a("copy", new CopyMethod(this.f72121a.f72166b, this.f72123c)).mo53711a("gallery", new GalleryPreviewMethod(aVar2).attach(this.f72123c)).mo53711a("openSchoolEdit", new C81625w(this.f72123c)).mo53711a("broadcast", new BroadcastMethod(aVar2).attach(this.f72123c)).mo53711a("openLiveRoom", new LiveMethod(this.f72123c, aVar2)).mo53711a("setNativeItem", new SetNativeItemMethod(aVar2)).mo53711a("getNativeItem", new GetNativeItemMethod(aVar2)).mo53711a("getABTestParams", new GetABTest(aVar2)).mo53711a("getSettings", new GetSettingsMethod(aVar2)).mo53711a("captureWebView", new C81609h(this.f72123c, aVar2)).mo53711a("isAppInstall", new IsAppInstalledMethod(aVar2)).mo53711a("shareRank", new ShareRankMethod(aVar2).attach(this.f72123c)).mo53711a("appSetting", new C81599ad(this.f72123c, aVar2)).mo53711a("closeKrCopyright", new C81615m()).mo53711a("miniGamePayResult", new C81613k(this.f72123c)).mo53711a("uploadALog", new FeedbackUploadALog(aVar2)).mo53711a("monitorLog", new MonitorLogMethod()).mo53711a("mpinfo", new GetMicroAppInfoMethod(aVar2)).mo53711a("setTitle", new RefreshNavTitleMethod(this).attach(this.f72123c)).mo53711a("jumpToLive", new JumpToLiveMethod()).mo53711a("chooseArticleWithInfo", new ChooseArticleInfoMethod(aVar2).attach(this.f72123c)).mo53711a("updateNavBar", new UpdateNavBarMethod()).mo53711a("fileSelection", new C47920c(this.f72123c, aVar2)).mo53711a("internationalRegionalSelection", new C47935d(this.f72123c)).mo53711a("preloadMiniApp", new MiniAppPreloadMethod().attach(this.f72123c)).mo53711a("tokenShare", new TokenShareMethod().attach(this.f72123c)).mo53711a("donationShare", new FestivalShareMethod(aVar2).attach(this.f72123c)).mo53711a("onBackPressed", new OnBackPressedMethod(aVar2).attach(this.f72123c)).mo53711a("requestPermission", new RequestPermissionMethod(aVar2).attach(this.f72123c)).mo53711a("preparePay", new PreparePayMethod(aVar2).attach(this.f72123c)).mo53711a("uploadAddressBook", new UploadContactsMethod(aVar2).attach(this.f72123c)).mo53711a("updateCampaginKStatus", new UpdateKProjectStateMethod(aVar2).attach(this.f72123c)).mo53711a("requestAddressBookPermission", new RequestAddressBookPermission(aVar2).attach(this.f72123c)).mo53711a("choosePhoneArea", new OpenPhoneAreaMethod(aVar2).attach(this.f72123c)).mo53711a("shareWebToChat", new ShareWebToChatMethod(aVar2)).mo53711a("syncWatchVideoTime", new SyncWatchedVideoTimeMethod(aVar2).attach(this.f72123c)).mo53711a("syncSpecActFollowStatus", new SpecActFollowMethod(aVar2).attach(this.f72123c)).mo53711a("hasFeedback", new HasFeedbackMethod(aVar2).attach(this.f72123c)).mo53711a("appsflyer_attribution", new AppsFlyerAttributionMethod(aVar2).attach(this.f72123c)).mo53711a("createCalendarEvent", new CreateCalendarEventMethod(aVar2).attach(this.f72123c)).mo53711a("isCalendarEventExist", new CheckCalendarExistMethod(aVar2).attach(this.f72123c)).mo53711a("sendAnalyticsEvent", new SendAnalyticsEventMethod(aVar2).attach(this.f72123c));
        C18364w wVar = eVar.f72168d;
        if (wVar != null) {
            wVar.mo29405b("testSecure", new C81597ac());
        }
        eVar.mo53711a("openConversation", new OpenConversationMethod(eVar.f72166b).attach(this.f72123c));
        C18288a aVar3 = eVar.f72166b;
        eVar.mo53711a("launchWXMiniPro", new WXMiniPayMethod(aVar3).attach(this.f72123c)).mo53711a("pay", new PayMethod(aVar3).attach(this.f72123c)).mo53711a("asyncGoodsEditInfo", new AsyncGoodsEditInfoMethod().attach(this.f72123c)).mo53711a("fetchTaoCommand", new TaoCommandMethod(aVar3).attach(this.f72123c)).mo53711a("purchasePlatformGoods", new OpenGoodDetailMethod().attach(this.f72123c)).mo53711a("openECommerceLegalModal", new OpenECommerceLegalModalMethod().attach(this.f72123c)).mo53711a("fetchFeedsAwemeData", new FetchFeedsAwemeDataMethod().attach(this.f72123c));
        ECommerceLiveBridgeMethodServiceImpl.m102573a().mo93514a(eVar, this.f72123c);
        C81570a aVar4 = new C81570a(this.f72123c);
        C89219l.m154721d(eVar, "");
        eVar.mo53711a("getPageData", aVar4).mo53711a("cardClick", aVar4).mo53711a("cardStatus", aVar4).mo53711a("closeCardDialog", aVar4).mo53711a("openHalfScreenForm", aVar4).mo53711a("callNativePhone", aVar4).mo53711a("download_click", aVar4).mo53711a("setCard", aVar4).mo53711a("closeAdModal", aVar4).mo53711a("modalInteractionURL", aVar4).mo53711a("showModalPage", aVar4).mo53711a("setModalSize", aVar4).mo53711a("cardInteriorShow", aVar4).mo53711a("getLiveRoomInfo", aVar4).mo53711a("dontCloseMaskOnResume", aVar4);
        aVar4.f182410a = eVar.f72173i.hashCode();
        eVar.mo53711a("closeLoading", new CloseWebViewLoadingMethod(eVar.f72166b)).mo53711a("closeJuStickerWindow", new CloseJuStickerWindowMethod(eVar.f72166b)).mo53711a("didFinishLoad", new DidLoadFinishMethod(eVar.f72166b)).mo53711a("sendThirdTrack", new AdThirdTrackMethod(eVar.f72166b)).mo53711a("getWebViewInfo", new GetWebViewInfo(eVar.f72166b)).mo53711a("openRechargePanel", new OpenRechargePanel(eVar.f72166b).attach(this.f72123c)).mo53711a("openPanel", new C81600b(eVar.f72166b)).mo53711a("openLightLandingPage", new C81600b(eVar.f72166b)).mo53711a("closeLightLandingPage", new C81600b(eVar.f72166b));
        if (this.f72123c != null) {
            WeakReference weakReference2 = this.f72123c;
            C89219l.m154721d(weakReference2, "");
            C89219l.m154721d(eVar, "");
            new AdCommonJsMethod(weakReference2, eVar, (byte) 0);
        }
        AbstractC58593c d = LiveOuterService.m107269s().mo95830d();
        if (d != null) {
            i = 5;
            map = d.mo12984a(this.f72123c, eVar.f72166b);
        } else {
            i = 4;
            map = null;
        }
        C12290b.m22060a("ttlive_wallet_to_live", i, (JSONObject) null);
        if (map != null) {
            for (Map.Entry<String, AbstractC18293d> entry3 : map.entrySet()) {
                eVar.mo53711a(entry3.getKey(), entry3.getValue());
            }
        }
        eVar.mo53711a("dpShowResult", new DouplusShowResultMethod().attach(this.f72123c));
        Map<String, AbstractC18293d> javaMethods = C31575b.m65866h().getJavaMethods(this.f72123c, eVar.f72166b);
        if (javaMethods != null) {
            for (Map.Entry<String, AbstractC18293d> entry4 : javaMethods.entrySet()) {
                eVar.mo53711a(entry4.getKey(), entry4.getValue());
            }
        }
        C18288a aVar5 = eVar.f72166b;
        eVar.mo53711a("showOpenAuth", new ShowOpenAuthHalf(aVar5).attach(cVar).attach(this.f72123c)).mo53711a("jumpOpenAuthPage", new OpenAuthPageMethod(aVar5).attach(cVar).attach(this.f72123c)).mo53711a("shareOpenPlatform", new ShareOpenPlatformMethod(aVar5).attach(cVar).attach(this.f72123c));
        eVar.mo53711a("componentDidMount", new ComponentDidMountMethod(eVar.f72166b));
        C67446h.f151111a.mo106200a(eVar, this.f72123c);
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).addJSMethods(eVar, this.f72123c);
    }
}
