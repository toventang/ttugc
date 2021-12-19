package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7071a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7077ad;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7078ae;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7079af;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7080ag;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7084ah;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7092al;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7093am;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7094an;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7095ao;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7096ap;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7099ar;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7100as;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7102at;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7110az;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7115ba;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7118bc;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7119bd;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7165ca;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7167cb;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7170e;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7171f;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7173g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7175h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7177i;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7186n;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenFirstRechargeDialogMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SendRedEnvelopSuccessMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7046a;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7052c;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7053d;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7055e;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7056f;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7058h;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.p474a.C7049b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6954b;
import com.bytedance.android.livesdk.browser.p464e.C7008a;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.livesetting.hybrid.JsbEnablePermissionCheckSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableXBridgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveJsbEnableHostSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveJsbAllowedListSetting;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18304a;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.AbstractC18354n;
import com.bytedance.ies.web.jsbridge2.C18345k;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.webx.monitor.p1776a.C23656a;
import com.google.gson.C28022o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.b */
public final class C7038b implements AbstractC6953a, AbstractC6954b {

    /* renamed from: d */
    private static List<String> f17641d;

    /* renamed from: e */
    private static List<String> f17642e;

    /* renamed from: a */
    int f17643a;

    /* renamed from: b */
    public C18364w f17644b;

    /* renamed from: c */
    public C18368x f17645c;

    /* renamed from: f */
    private WeakReference<Context> f17646f;

    /* renamed from: g */
    private Activity f17647g;

    /* renamed from: h */
    private String f17648h;

    static {
        Covode.recordClassIndex(7777);
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6953a
    /* renamed from: a */
    public final C18364w mo13236a() {
        return this.f17644b;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6953a
    /* renamed from: c */
    public final C18368x mo13239c() {
        return this.f17645c;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6954b
    /* renamed from: d */
    public final String mo13240d() {
        return this.f17648h;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6953a
    /* renamed from: b */
    public final void mo13238b() {
        this.f17644b.mo29403a();
        this.f17645c.f43940a.mo29247a();
    }

    /* renamed from: e */
    public static List<String> m14993e() {
        List<String> list = f17641d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f17641d = arrayList;
        arrayList.add("tiktokv.com");
        f17641d.add("tiktok.com");
        f17641d.add("s16a.tiktokcdn.com");
        String[] value = LiveJsbAllowedListSetting.INSTANCE.getValue();
        if (value.length > 0) {
            for (String str : value) {
                if (!f17641d.contains(str)) {
                    f17641d.add(str);
                }
            }
        }
        AbstractC11816k kVar = (AbstractC11816k) C6193a.m13435a(AbstractC11816k.class);
        if (kVar != null) {
            f17641d.addAll(kVar.mo18884a());
        }
        return f17641d;
    }

    /* renamed from: f */
    private static List<String> m14994f() {
        List<String> list = f17642e;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f17642e = arrayList;
        arrayList.add("config");
        f17642e.add("login");
        f17642e.add("logout");
        f17642e.add("close");
        f17642e.add("gallery");
        f17642e.add("toggleGalleryBars");
        f17642e.add("slideShow");
        f17642e.add("relatedShow");
        f17642e.add("toast");
        f17642e.add("slideDownload");
        f17642e.add("requestChangeOrientation");
        f17642e.add("adInfo");
        return f17642e;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6953a
    /* renamed from: a */
    public final void mo13237a(String str) {
        this.f17648h = str;
    }

    /* renamed from: a */
    public final <T> void mo13332a(String str, T t) {
        this.f17644b.mo29404a(str, (Object) t);
    }

    /* renamed from: a */
    public static C7038b m14992a(Activity activity, final AbstractC18329b bVar) {
        C70402 r2 = new AbstractC18304a() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.C7038b.C70402 */

            static {
                Covode.recordClassIndex(7779);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18304a
            /* renamed from: a */
            public final View mo13335a() {
                return bVar.mo16240b();
            }
        };
        C18345k kVar = new C18345k(r2);
        kVar.f43890f = activity;
        kVar.f43887c = bVar;
        C18345k a = kVar.mo29367a(new AbstractC18354n() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.C7038b.C70413 */

            static {
                Covode.recordClassIndex(7780);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
            /* renamed from: a */
            public final <T> String mo13334a(T t) {
                if (t instanceof C28022o) {
                    return t.toString();
                }
                if (t instanceof String) {
                    return t.toString();
                }
                return C4139e.C4140a.f11575b.mo46674b(t);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
            /* renamed from: a */
            public final <T> T mo13333a(String str, Type type) {
                return (T) C4139e.C4140a.f11575b.mo46671a(str, type);
            }
        });
        a.f43891g = false;
        a.f43892h = true;
        C18345k a2 = a.mo29371a(m14993e());
        a2.f43893i = JsbEnablePermissionCheckSetting.INSTANCE.getValue();
        a2.f43896l = "webcast";
        C18345k b = a2.mo29374b(new C7008a(r2));
        b.f43888d = "ToutiaoJSBridge";
        if (TextUtils.equals(((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel(), "local_test")) {
            b.f43900p = true;
        }
        C18364w d = b.mo29377d();
        C7038b bVar2 = new C7038b(activity, d, C18368x.m34194a((WebView) null, d), 1);
        C7024a.m14980a(bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public static C7038b m14991a(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        C18364w wVar;
        C18345k a = C18364w.m34179a(webView);
        a.f43890f = activity;
        C18345k a2 = a.mo29367a(new AbstractC18354n() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.C7038b.C70391 */

            static {
                Covode.recordClassIndex(7778);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
            /* renamed from: a */
            public final <T> String mo13334a(T t) {
                return C4139e.C4140a.f11575b.mo46674b(t);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
            /* renamed from: a */
            public final <T> T mo13333a(String str, Type type) {
                return (T) C4139e.C4140a.f11575b.mo46671a(str, type);
            }
        });
        a2.f43891g = false;
        a2.f43892h = true;
        C18345k b = a2.mo29371a(m14993e()).mo29374b(new C23656a(webView));
        b.f43896l = "webcast";
        b.f43888d = "ToutiaoJSBridge";
        C18364w d = b.mo29377d();
        C18368x a3 = C18368x.m34194a(webView, d).mo29412b("bytedance").mo29409a(webViewClient).mo29408a(webChromeClient).mo29413b(m14993e()).mo29411a(m14994f());
        if (LiveJsbEnableHostSetting.INSTANCE.getValue() && (wVar = (C18364w) ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18882a(activity, d)) != null) {
            d.mo29402a("host", wVar);
        }
        C7038b bVar = new C7038b(activity, d, a3, 0);
        C7024a.m14980a(bVar);
        return bVar;
    }

    private C7038b(Activity activity, C18364w wVar, C18368x xVar, int i) {
        this.f17647g = activity;
        this.f17646f = new WeakReference<>(activity);
        this.f17644b = wVar;
        this.f17645c = xVar;
        this.f17643a = i;
        C7055e eVar = new C7055e(this.f17646f, this);
        C18364w wVar2 = this.f17644b;
        wVar2.f43934d = this.f17645c;
        wVar2.mo29405b("appInfo", new C7171f()).mo29405b("getXTtToken", new C7077ad()).mo29405b("userInfo", new C7165ca()).mo29405b("apiParam", new C7170e()).mo29405b("toast", new ToastMethod()).mo29405b("sendRedEnvelopSuccess", new SendRedEnvelopSuccessMethod()).mo29405b("sendLogV3", new C7118bc()).mo29405b("sendLogV1", new C7119bd()).mo29405b("sendMonitor", new C7093am()).mo29405b("setBannerVisibility", new C7175h()).mo29405b("baseInfo", new C7177i()).mo29405b("close", new C7186n(this.f17647g)).mo29405b("getLiveHouseRoomStatus", new C7092al()).mo29405b("isTeenMode", new C7079af()).mo29405b("sendPokemon", new C7084ah()).mo29405b("statusNotification", new C7094an()).mo29400a("sendGift", C7043c.f17650a).mo29405b("payPanel", new C7100as()).mo29405b("registerMessage", new C7110az()).mo29400a("cashdesk", C7045d.f17651a).mo29400a("liveLoading", C7068n.f17677a).mo29400a("iapForSubscription", C7227o.f18001a).mo29405b("openStoreSubscribePage", new C7099ar()).mo29400a("userAction", C7228p.f18002a).mo29400a("fetch", (AbstractC18334e.AbstractC18336b) new C7229q(this)).mo29400a("fetchPb", C7230r.f18004a).mo29400a("app.showModal", C7231s.f18005a).mo29400a("login", C7232t.f18006a).mo29400a("setFansStatus", C7233u.f18007a).mo29400a("lotteryAction", C7059e.f17668a).mo29400a("dialog", C7060f.f17669a).mo29400a(UGCMonitor.EVENT_COMMENT, C7061g.f17670a).mo29400a("downloadMediaToSystem", C7062h.f17671a).mo29405b("openFirstRechargeDialog", new LiveOpenFirstRechargeDialogMethod()).mo29405b("saveLocalData", new C7115ba()).mo29405b("openKoiRedpacket", new C7096ap()).mo29405b("addRedDot", new C7071a()).mo29405b("viewController", new C7173g()).mo29405b("notifyBoxOpened", new C7095ao()).mo29400a("copyToClipboard", C7063i.f17672a).mo29400a("liveOpenExchangeCoinsDialog", C7064j.f17673a).mo29400a("uploadImage", C7065k.f17674a).mo29405b("webviewNavigation", new C7167cb(this.f17644b.f43933c)).mo29400a("openRegionListPage", C7066l.f17675a).mo29405b("getLinkMicStatus", new C7078ae()).mo29405b("webviewNavigation", new C7167cb(this.f17644b.f43933c)).mo29405b("prefetchSchema", new C7102at()).mo29400a("queryCachedGifts", C7067m.f17676a);
        if (LiveEnableXBridgeSetting.INSTANCE.getValue()) {
            C7234v.m15144a(this.f17647g, this.f17644b, this.f17643a);
        }
        this.f17644b.mo29405b("setStorage", new C7080ag.C7083c()).mo29405b("getStorage", new C7080ag.C7081a()).mo29405b("removeStorage", new C7080ag.C7082b());
        this.f17645c.mo29410a("openHotsoon", eVar).mo29410a("openLive", eVar).mo29410a("userStatusChange", new C7058h()).mo29410a("livePay", new C7052c(this.f17646f)).mo29410a("startLive", new C7049b(this.f17646f)).mo29410a("liveCashVerify", new C7046a(this.f17646f, this.f17645c)).mo29410a("openLiveRecharge", new C7056f());
        this.f17645c.mo29410a("openBindPhone", new C7053d(this.f17646f));
    }
}
