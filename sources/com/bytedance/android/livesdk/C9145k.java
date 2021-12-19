package com.bytedance.android.livesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.boostcard.C6914b;
import com.bytedance.android.livesdk.chatroom.p488c.C7381an;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AbstractC8785b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.C8851o;
import com.bytedance.android.livesdk.gift.model.C8856t;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.model.EnumC8850n;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8782a;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8806a;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.gift.p551g.p552a.EnumC8809a;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynxFaq;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceCacheSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.AgeRestrictedConfig;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeLibraConfig;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.manage.p572a.C9481c;
import com.bytedance.android.livesdk.manage.p573b.C9482a;
import com.bytedance.android.livesdk.model.AbstractC9918z;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.EnumC9541ay;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.newvideogift.p595a.C9958e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p428c.C6537o;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p430ab.AbstractC6570b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.p655v.C11299a;
import com.bytedance.android.livesdk.service.animation.C10644a;
import com.bytedance.android.livesdk.service.assets.C10689i;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdk.toolbar.p641a.C10894b;
import com.bytedance.android.livesdk.toolbar.p641a.C10895c;
import com.bytedance.android.livesdk.toolbar.p641a.C10896d;
import com.bytedance.android.livesdk.toolbar.p641a.C10898f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdk.wishlist.widget.WishListWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.p4460a.p4461a.C87034e;
import com.p2082ss.ugc.live.p4460a.p4461a.C87040f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.k */
public class C9145k implements IGiftService {
    static {
        Covode.recordClassIndex(10049);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void resetRoomStatus() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC8785b getAssetsManager() {
        return C9462a.C9465b.f23010a;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C8729d getFirstRechargeManager() {
        return C8729d.f21542u;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getGiftWidget() {
        return new GiftWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public Widget getRedEnvelopeWidget() {
        return new RedEnvelopeWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getWishListWidget() {
        return new WishListWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC11630b giftPlayControllerManager() {
        return C9958e.m18293a();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isFirstRecharge() {
        return C8729d.f21542u.mo15007b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<GiftPage> getGiftPages() {
        return GiftManager.inst().getGiftPageList();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<C9904t> getStickerGifts() {
        return GiftManager.inst().getStickerGifts();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C8856t getBoostChartInfo() {
        C8856t tVar = new C8856t();
        tVar.f21772c = C6914b.f17303c;
        tVar.f21773d = C6914b.f17304d;
        tVar.f21771b = C6914b.f17308h;
        tVar.f21770a = C6914b.f17302b;
        tVar.f21774e = C6914b.f17301a;
        return tVar;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getLowAgeReportUrl() {
        if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onPlayFragmentCreate() {
        if (C6204h.m13482c()) {
            C2690b.m7787a((int) R.layout.bfw);
            C2690b.m7787a((int) R.layout.bdf);
            C2690b.m7787a((int) R.layout.bev);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean enableRedEnvelope() {
        boolean z;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.showRedEnvelope()) {
            z = false;
        } else {
            z = true;
        }
        if (!RedEnvelopeLibraConfig.INSTANCE.enableEnvelopeFunc() || AgeRestrictedConfig.INSTANCE.isLimit() || !z) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResource() {
        initGiftResourceManager(C3966y.m9669e());
        AbstractC88979t.m154294a(new C9161l(this)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndShow() {
        String str;
        String str2 = C6914b.f17305e;
        String str3 = C6914b.f17307g;
        String str4 = C6914b.f17306f;
        C6501b a = C6501b.C6502a.m13948a("end_live_show").mo12639a();
        Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        C6501b a2 = a.mo12651a("anchor_id", str).mo12651a("task_id", str2).mo12651a("card_id", str3);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12646a("user_id", b.mo13161c()).mo12651a("task_source", str4).mo12655b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearFastGift(long j) {
        GiftManager.inst().clearFastGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public long giftVideoResourcesClear(boolean z) {
        return C9462a.m17763b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initGiftResource$0$GiftService(AbstractC88982v vVar) {
        syncGiftList(1);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialogFromJSB(C7381an anVar) {
        C6779a.m14563a().mo13053a(anVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(int i) {
        GiftManager.inst().syncGiftList(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearAssets(String str) {
        C87040f.m150751a().f196231b.clear();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9904t findGiftById(long j) {
        return GiftManager.inst().findGiftById(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9904t getFastGift(long j) {
        return GiftManager.inst().getFastGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void exitRoom(Boolean bool) {
        Activity activity;
        Application application;
        C8729d dVar = C8729d.f21542u;
        dVar.f21560q = null;
        WeakReference<Activity> weakReference = dVar.f21557n;
        if (weakReference != null && (activity = weakReference.get()) != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(dVar.f21562s);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onTurnTableUrlEmpty(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3868c.m9491a(C6542d.m13985b("ttlive_turn_table_url_empty"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_turn_table_url_empty", hashMap);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialog(String str) {
        EnumC8809a aVar;
        C6779a a = C6779a.m14563a();
        if ("gift".equals(str)) {
            aVar = EnumC8809a.GIFT;
        } else {
            aVar = EnumC8809a.PROP;
        }
        a.mo13053a(new C7381an(aVar));
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void removeAnimationEngine(EnumC8850n nVar) {
        C10644a a = C10644a.m19200a();
        if (a.f25651a.containsKey(nVar)) {
            AbstractC8782a aVar = a.f25651a.get(nVar);
            if (aVar != null) {
                aVar.mo8560a();
            }
            a.f25651a.remove(nVar);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C6537o getSendGiftResultLog(C8859w wVar) {
        int i;
        C9904t findGiftById = GiftManager.inst().findGiftById(wVar.f21785f);
        if (findGiftById == null) {
            i = 0;
        } else {
            i = findGiftById.f24001f;
        }
        return new C6537o(wVar.f21785f, findGiftById, wVar.f21791l, wVar.f21796q, wVar.f21797r, wVar.f21789j, wVar.f21788i, wVar.f21786g, (long) i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResourceManager(Context context) {
        C87034e.C87035a aVar = new C87034e.C87035a(context);
        aVar.f196222b = new C9481c();
        aVar.f196221a = new C9482a(context);
        aVar.f196226f = 5;
        aVar.f196225e = 3;
        if (LiveGiftResourceCacheSetting.INSTANCE.getValue() != 0) {
            aVar.f196227g = LiveGiftResourceCacheSetting.INSTANCE.getValue();
        }
        C87034e a = aVar.mo140639a();
        if (C87040f.f196230a == null) {
            C87040f.f196230a = new C87040f(a);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastClicked(long j) {
        C6501b.C6502a.m13948a("announcements_click").mo12639a().mo12650a("gift_id", (Number) Long.valueOf(j)).mo12651a("reason", "gift").mo12651a("scene", C10890a.m19496b().getDesc()).mo12655b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndClick(int i) {
        String str;
        String str2;
        String str3 = C6914b.f17305e;
        String str4 = C6914b.f17307g;
        String str5 = C6914b.f17306f;
        Integer valueOf = Integer.valueOf(i);
        C6501b a = C6501b.C6502a.m13948a("end_live_click").mo12639a();
        Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        C6501b a2 = a.mo12651a("anchor_id", str).mo12651a("task_id", str3).mo12651a("card_id", str4).mo12651a("task_source", str5);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        C6501b a3 = a2.mo12646a("user_id", b.mo13161c());
        if (valueOf != null) {
            if (valueOf.intValue() == 0) {
                str2 = "think_again";
            } else if (valueOf.intValue() == 1) {
                str2 = "confirm";
            }
            a3.mo12651a("click_button", str2).mo12655b();
        }
        str2 = "no_selection";
        a3.mo12651a("click_button", str2).mo12655b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAmountString(long j) {
        if (j >= 10000 && j < 1000000) {
            double d = (double) j;
            Double.isNaN(d);
            return C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d / 1000.0d)}) + "K";
        } else if (j >= 1000000) {
            double d2 = (double) j;
            Double.isNaN(d2);
            return C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1000000.0d)}) + "M";
        } else if (j >= 1000) {
            return new StringBuffer(String.valueOf(j)).insert(1, ',').toString();
        } else {
            return String.valueOf(j);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openRechargeFAQPage(Context context) {
        String str;
        C11314c cVar;
        C11314c cVar2;
        String str2;
        Integer num;
        String str3;
        String str4;
        C8729d dVar = C8729d.f21542u;
        if (context instanceof Activity) {
            if (dVar.f21561r != null) {
                C11314c cVar3 = dVar.f21561r;
                Integer num2 = null;
                if (!(cVar3 == null || (str = cVar3.f27057c) == null || str.length() == 0 || (((cVar = dVar.f21561r) != null && cVar.f27058d == 0) || ((cVar2 = dVar.f21561r) != null && cVar2.f27059e == 0)))) {
                    C8740e.m17060a(dVar.f21558o);
                    String value = LiveFirstRechargeWebUrlLynxFaq.INSTANCE.getValue();
                    try {
                        Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                        buildUpon.appendQueryParameter("gift_enter_from", dVar.f21558o);
                        C11314c cVar4 = dVar.f21561r;
                        if (cVar4 == null || (str4 = cVar4.f27057c) == null) {
                            str2 = null;
                        } else {
                            str2 = str4.toString();
                        }
                        buildUpon.appendQueryParameter("price", str2);
                        C11314c cVar5 = dVar.f21561r;
                        if (cVar5 != null) {
                            num = Integer.valueOf(cVar5.f27058d);
                        } else {
                            num = null;
                        }
                        buildUpon.appendQueryParameter("diamond_count", String.valueOf(num));
                        C11314c cVar6 = dVar.f21561r;
                        if (cVar6 != null) {
                            num2 = Integer.valueOf(cVar6.f27059e);
                        }
                        buildUpon.appendQueryParameter("giving_count", String.valueOf(num2));
                        if (LiveFirstRechargeTitle.INSTANCE.getValue()) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        buildUpon.appendQueryParameter("title_ab", str3);
                        buildUpon.appendQueryParameter("pay_method", "google_pay");
                        String uri = buildUpon.build().toString();
                        C89219l.m154716b(uri, "");
                        value = uri;
                    } catch (Exception unused) {
                    }
                    ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, value);
                    return;
                }
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gic);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AssetsModel getAssets(String str, long j) {
        return C9462a.C9465b.f23010a.mo15073a(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAssetsPath(String str, long j) {
        return C9462a.m17766c(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC6570b getGiftInterceptor(long j, boolean z) {
        return new C11299a(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isAssetsDownloaded(String str, long j) {
        return C9462a.m17762a(C9462a.C9465b.f23010a.mo15073a(j));
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastMonitor(long j, boolean z) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("receive_announcements").mo12639a().mo12650a("gift_id", (Number) Long.valueOf(j)).mo12651a("reason", "gift").mo12651a("scene", C10890a.m19496b().getDesc());
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        a.mo12651a("is_own_send", str).mo12655b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void playGiftVideo(long j, AbstractC9918z zVar) {
        C8851o oVar = new C8851o();
        C9895y yVar = new C9895y();
        C11778b bVar = new C11778b();
        bVar.f28137c = 0;
        bVar.f28138d = C11200a.m19851a();
        yVar.f28134O = bVar;
        yVar.f23934i = j;
        yVar.f23944s = true;
        yVar.f16442c = true;
        yVar.f23930a = true;
        yVar.f23932g = C2997d.C2998a.m8305a();
        oVar.f21745a = yVar;
        oVar.f21745a.f23931f = zVar;
        C6779a.m14563a().mo13053a(oVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void setGiftAnimationEngine(EnumC8850n nVar, AbstractC8782a aVar) {
        C10644a a = C10644a.m19200a();
        if (!a.f25651a.containsKey(nVar)) {
            a.f25651a.put(nVar, aVar);
            return;
        }
        throw new Exception("GiftType " + nVar.toString() + " already has been set, or you should call release firstly.");
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void sendGiftInternal(long j, int i, AbstractC8806a aVar) {
        sendGiftLocal(j, i, aVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9895y getGiftMessage(long j, C8859w wVar, User user) {
        return C10689i.m19254a(j, wVar, null, user);
    }

    private void sendGiftLocal(long j, int i, AbstractC8806a aVar) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null && room.getOwner() != null) {
            User owner = room.getOwner();
            long id = room.getId();
            ((GiftRetrofitApi) C5805e.m12718a().mo11572a(GiftRetrofitApi.class)).send(j, room.getId(), owner.getId(), i).mo143271a(new C11191f()).mo143254a(new C9451m(aVar, id, owner, j, SystemClock.uptimeMillis()), new C9934n(aVar, j, id));
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void loadBehavior(Context context, DataChannel dataChannel, int i) {
        if (i == EnumC5847l.FAST_GIFT.ordinal()) {
            EnumC5847l.FAST_GIFT.load(dataChannel, new C10896d(context));
        } else if (i == EnumC5847l.GIFT.ordinal()) {
            EnumC5847l.GIFT.load(dataChannel, new C10898f(dataChannel));
        } else if (i == EnumC5847l.DUMMY_GIFT.ordinal()) {
            EnumC5847l.DUMMY_GIFT.load(dataChannel, new C10895c(dataChannel));
        } else if (i == EnumC5847l.DUMMY_FAST_GIFT.ordinal()) {
            C10894b bVar = new C10894b(dataChannel);
            Room room = (Room) dataChannel.mo28318b(C9093de.class);
            if (room != null && GiftManager.inst().getFastGift(room.getId()) != null) {
                EnumC5847l.DUMMY_FAST_GIFT.load(dataChannel, bVar);
            }
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void downloadAssets(String str, long j, AbstractC8784a aVar, int i) {
        C9462a.C9465b.f23010a.mo15075a(j, aVar, i);
    }

    static final /* synthetic */ void lambda$sendGiftLocal$2$GiftService(AbstractC8806a aVar, long j, long j2, Throwable th) {
        C10752a.m19347a(th);
        if (aVar != null) {
            aVar.mo13365a(th);
        }
        C10752a.m19344a(j, j2, th);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(AbstractC8807b bVar, long j, int i, boolean z) {
        GiftManager.inst().syncGiftList(bVar, j, i, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC88979t<C5832d<C8859w>> sendGift(long j, long j2, long j3, int i) {
        return ((GiftRetrofitApi) C5805e.m12718a().mo11572a(GiftRetrofitApi.class)).send(j, j2, j3, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorGiftIconShow(boolean z, EnumC9541ay ayVar, String str, String str2) {
        String str3 = "";
        C89219l.m154721d(ayVar, str3);
        C89219l.m154721d(str, str3);
        C89219l.m154721d(str2, str3);
        C6501b a = C6501b.C6502a.m13948a("gift_icon_show").mo12645a("is_click_available", z ? 1 : 0);
        if (!z) {
            str3 = ayVar.getDescription();
        }
        a.mo12651a("un_available_click_reason", str3).mo12651a("user_type", str).mo12651a("icon_show_position", str2).mo12639a().mo12655b();
    }

    static final /* synthetic */ void lambda$sendGiftLocal$1$GiftService(AbstractC8806a aVar, long j, User user, long j2, long j3, C5832d dVar) {
        if (dVar != null) {
            C10752a.m19347a((Throwable) null);
            C8859w wVar = (C8859w) dVar.data;
            if (aVar != null) {
                aVar.mo13364a(wVar);
            }
            for (C9895y yVar : C10689i.m19256b(j, wVar, user, C2997d.C2998a.m8305a())) {
                ((IMessageService) C6193a.m13435a(IMessageService.class)).get().insertMessage(yVar);
            }
            C10752a.m19343a(j2, SystemClock.uptimeMillis() - j3, null, null);
        }
    }
}
