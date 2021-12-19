package com.bytedance.android.livesdk.p447ak;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2930g;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p255l.AbstractC4374a;
import com.bytedance.android.live.p255l.AbstractC4375b;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.api.LiveEventApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.broadcast.Live3dtouchOptimizeEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportOptimizeUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSharePanelShowDislikeSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p441ah.C6682a;
import com.bytedance.android.livesdk.p450an.C6797b;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9037bd;
import com.bytedance.android.livesdk.p561j.C9069ch;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.watch.AbstractC11321b;
import com.bytedance.android.livesdk.watch.AbstractC11322c;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11641e;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11655j;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.android.livesdkapi.p690f.AbstractC11758b;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.android.livesdkapi.service.AbstractC11847e;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.ak.b */
public final class C6765b implements AbstractC11846d {

    /* renamed from: c */
    private static volatile C6765b f16805c;

    /* renamed from: a */
    private final AbstractC11758b f16806a = C6767c.f16810a;

    /* renamed from: b */
    private AbstractC11687h f16807b;

    /* renamed from: d */
    private final AbstractC11847e f16808d = new AbstractC11847e() {
        /* class com.bytedance.android.livesdk.p447ak.C6765b.C67661 */

        static {
            Covode.recordClassIndex(7504);
        }
    };

    static {
        Covode.recordClassIndex(7503);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12970a(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final Fragment mo13009b(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: l */
    public final int mo13031l() {
        return R.drawable.ca_;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: m */
    public final int mo13032m() {
        return R.string.e_b;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12988a(Activity activity) {
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).setBroadcastActivity(activity);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13004a(Context context, Uri uri) {
        return ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handleWithoutHost(context, uri.toString());
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11685f mo12980a(AbstractC11821a aVar) {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createStartLiveFragment(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13001a(String str, AbstractC5777j jVar) {
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11551a(str, jVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12989a(Context context) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).preloadWatchResource(context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11650h mo12978a(EnterRoomConfig enterRoomConfig) {
        return ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).createLiveRoomFragment(enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11679c mo12979a(AbstractC11678b bVar, Bundle bundle) {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createLiveBroadcastFragment(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12986a(long j, AbstractC11843a aVar) {
        if (aVar != null) {
            ((RoomStatApi) C5805e.m12718a().mo11572a(RoomStatApi.class)).checkRoom(String.valueOf(j)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C6768d(aVar), new C6769e(aVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12987a(long j, AbstractC11844b bVar) {
        C7307f.m15215a(j, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12991a(Context context, C11666c cVar) {
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(context, cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final String mo12982a(long j, EnterRoomConfig enterRoomConfig, Context context) {
        AbstractC2719c warmUp = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).warmUp(j, enterRoomConfig, context);
        if (warmUp != null) {
            return warmUp.getPlayerTag();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13006a(String str, Context context) {
        return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).preCreatedSurface(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12996a(AbstractC11636c cVar) {
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12370a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12997a(AbstractC11641e eVar) {
        if (Live3dtouchOptimizeEnableSetting.INSTANCE.enable()) {
            DataChannelGlobal.f42558d.mo28321a(C9037bd.class, new C6770f(eVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13003a(Map<String, Class> map, Map<Class, AbstractC2724b> map2) {
        C5809h.m12739a().mo11587a(map2);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Class> entry : map.entrySet()) {
            if (AbstractC6571a.class.isAssignableFrom(entry.getValue())) {
                hashMap.put(entry.getKey(), entry.getValue());
            } else {
                throw new IllegalArgumentException("Class must extend from BaseLiveMessage");
            }
        }
        ((IMessageService) C6193a.m13435a(IMessageService.class)).registerMessageClass(hashMap);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12985a(int i) {
        ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).preloadInboxTopLivesFeedAction(i);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12994a(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar) {
        ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).onLongPress(context, z, room, cVar, iHostLongPressCallback, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12992a(Context context, C11838d dVar) {
        AbstractC6956d webViewManager;
        C4031a a;
        ActivityC0945e a2 = C11279p.m20001a(context);
        if (a2 != null) {
            String value = LiveReportOptimizeUrlSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                C6497a a3 = C3051c.C3052a.m8362d("ttlive_report_user_error").mo12627a("error_code", (Integer) -1).mo12629a("error_msg", "live report url is empty");
                a3.f16147c = true;
                a3.mo12632a();
                return;
            }
            AbstractC6956d.C6958b a4 = AbstractC6963e.m14871a(dVar.mo18911a(value)).mo13259a(8, 8, 0, 0);
            a4.f17407k = -1;
            a4.f17415s = true;
            a4.f17399c = (int) C3966y.m9668e(C3966y.m9662b());
            a4.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
            a4.f17396J = true;
            a4.f17406j = 80;
            AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a = webViewManager.mo13245a(a4)) != null) {
                C4031a.m9839a(a2, a);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12993a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        AbstractC6956d webViewManager;
        C4031a a;
        ActivityC0945e a2 = C11279p.m20001a(context);
        if (a2 != null) {
            float f = bundle.getFloat("bundle_dialog_screen_size", 0.95f);
            AbstractC6956d.C6958b a3 = AbstractC6963e.m14871a(Uri.parse(LiveEventDetailSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("event_id", str).appendQueryParameter("user_id", str2).appendQueryParameter("aid", String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId())).build().toString() + bundle.getString("bundle_url_extra_param", "")).mo13259a(8, 8, 0, 0);
            a3.f17407k = -1;
            a3.f17415s = true;
            a3.f17399c = (int) C3966y.m9668e((int) (((float) C3966y.m9662b()) * f));
            a3.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
            a3.f17406j = 80;
            AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a = webViewManager.mo13245a(a3)) != null) {
                if (onDismissListener != null) {
                    a.f11065d = onDismissListener;
                }
                C4031a.m9839a(a2, a);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Map<String, Object> mo12983a(long j) {
        return ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).getFeedTab(j);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12995a(AbstractC7258b.EnumC7259a aVar, AbstractC7258b bVar) {
        if (aVar == AbstractC7258b.EnumC7259a.AUDIENCE_LIVE_PLAY_DURATION) {
            ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).addLiveDurationTask(bVar);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Map<String, AbstractC18293d> mo12984a(WeakReference<Context> weakReference, C18288a aVar) {
        return ((IWalletService) C6193a.m13435a(IWalletService.class)).getLiveWalletJSB(weakReference, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12998a(C11666c cVar) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).dislikeLiveFromSharePanel(cVar.f27801H, cVar.f27836z, cVar.f27794A);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13017b(C11666c cVar) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).logDislikeLiveFromSharePanel(cVar.f27801H, cVar.f27836z, cVar.f27794A);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12999a(Room room, String str, String str2) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).logDislikeLiveFromLongPressSharePanel(room, str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13000a(Room room, String str, String str2, String str3) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).logReportLiveFromSharePanel(room, str, str2, str3);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13007a(String str, String str2) {
        return ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).shouldDislikeActionShow(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13005a(Context context, Uri uri, Map<String, String> map) {
        return ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handleWithoutHost(context, uri, map);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12990a(Context context, int i) {
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).preloadToolbarView(context, i, ToolBarButtonWithTextExperiment.hasText() ? EnumC5854q.ICON_WITH_TEXT : EnumC5854q.ICON);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13002a(Locale locale) {
        C3854a.m9453a(3, "i18n_translation", "notify I18nDataCenter when locale changed");
        C8983b.m17319a().mo15220a(locale);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: e */
    public final void mo13023e() {
        DataChannelGlobal.f42558d.mo28329d(C9069ch.class);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: h */
    public final Fragment mo13027h() {
        return new C6797b();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: p */
    public final JSONObject mo13035p() {
        return C6802e.m14594a();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: r */
    public final AbstractC11642f mo13037r() {
        return C6764a.m14478a();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: s */
    public final AbstractC11655j mo13038s() {
        return C6772h.m14558b();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: w */
    public final boolean mo13042w() {
        return LiveSharePanelShowDislikeSetting.INSTANCE.getValue();
    }

    private C6765b() {
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: d */
    public final Fragment mo13021d() {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getSubscribeSettingFragment();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: f */
    public final AbstractC11643g mo13025f() {
        return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: g */
    public final AbstractC11630b mo13026g() {
        return ((IGiftService) C6193a.m13435a(IGiftService.class)).giftPlayControllerManager();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: j */
    public final Context mo13029j() {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getBroadcastActivity();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: k */
    public final Map<String, String> mo13030k() {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getRoomInfo();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: n */
    public final void mo13033n() {
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: o */
    public final AbstractC11660n mo13034o() {
        return ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).getStartLiveRoomInterceptor();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: t */
    public final void mo13039t() {
        IBroadcastService iBroadcastService = (IBroadcastService) C6193a.m13435a(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.showEndPageForPaidEvent();
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: u */
    public final AbstractC3054d mo13040u() {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getSubscribeEntranceHelper();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: x */
    public final AbstractC4374a mo13043x() {
        return ((AbstractC4375b) C6193a.m13435a(AbstractC4375b.class)).getINegativeTest();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: y */
    public final void mo13044y() {
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).releaseToolbarView();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: i */
    public final AbstractC11687h mo13028i() {
        if (this.f16807b == null) {
            this.f16807b = ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager();
        }
        return this.f16807b;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: q */
    public final String mo13036q() {
        IBroadcastService iBroadcastService = (IBroadcastService) C6193a.m13435a(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getLiveCoreVersion();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: v */
    public final boolean mo13041v() {
        AbstractC10336c rankOptOutPresenter = ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankOptOutPresenter();
        if (C6682a.m14197b()) {
            return true;
        }
        if (rankOptOutPresenter == null || !rankOptOutPresenter.mo17119d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C6765b m14482a() {
        MethodCollector.m26663i(7209);
        if (f16805c == null) {
            synchronized (C6765b.class) {
                try {
                    if (f16805c == null) {
                        f16805c = new C6765b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7209);
                    throw th;
                }
            }
        }
        C6765b bVar = f16805c;
        MethodCollector.m26664o(7209);
        return bVar;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11322c mo13011b() {
        return ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).getPreFetchManager();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final void mo13020c() {
        C3854a.m9453a(4, "LiveIconGeneratorLog", "LiveServiceApiImpl#requestTabListForyouPage");
        ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).requestTabListForyouPage();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final int mo13008b(String str) {
        str.hashCode();
        if (str.equals("share_setting")) {
            return R.drawable.caa;
        }
        if (!str.equals("moderator_setting_action")) {
            return 0;
        }
        return 2131234724;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final int mo13018c(String str) {
        str.hashCode();
        if (str.equals("share_setting")) {
            return R.string.efd;
        }
        if (!str.equals("moderator_setting_action")) {
            return 0;
        }
        return R.string.egp;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: d */
    public final void mo13022d(String str) {
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).stopRoomPlayer(str, false);
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: e */
    public final void mo13024e(String str) {
        long id;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        LiveEventApi liveEventApi = (LiveEventApi) C5805e.m12718a().mo11572a(LiveEventApi.class);
        if (room == null) {
            id = 0;
        } else {
            id = room.getId();
        }
        liveEventApi.bindLiveEvent(id, C11115u.m19743a().mo17915b().mo13161c(), Long.parseLong(str)).mo143289d(C6771g.f16814a);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11614d mo13012b(Bundle bundle) {
        return ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLiveBrowserFragment(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC5776i mo12974a(Bundle bundle) {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createLiveBroadcastEndFragment(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final String mo13014b(int i) {
        return ((IHostShare) C6193a.m13435a(IHostShare.class)).getBundleKey(i);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13015b(long j) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).addLiveDuration(j);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11643g mo12977a(String str) {
        return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11549a(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13016b(Activity activity) {
        ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).openShareSettingsDialog(activity, "live_page");
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final <T> T mo12981a(String str, T t) {
        return (T) C6802e.m14593a(str, t);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12971a(Context context, String str) {
        return ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).getSubscribeInfoListFragment(context, str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC8220c mo13010b(Context context, Uri uri) {
        return ((AbstractC2930g) C6193a.m13435a(AbstractC2930g.class)).createHybridView(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final Fragment mo13019c(Context context, Bundle bundle) {
        return ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLynxFragment(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12972a(Uri uri, Context context) {
        return ((AbstractC2930g) C6193a.m13435a(AbstractC2930g.class)).createPageFragment(uri, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11677a mo13013b(AbstractC11678b bVar, Bundle bundle) {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createBgBroadcastFragment(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11321b mo12975a(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).createDrawerFeedFragment(fullDraggableContainer, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11633b mo12976a(Context context, ViewGroup viewGroup) {
        return ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getBarrageLauncher(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final DialogInterface$OnCancelListenerC0944d mo12973a(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar) {
        return ((IWalletService) C6193a.m13435a(IWalletService.class)).createRechargeDialogFragment(eVar, bVar, bundle, dVar);
    }
}
