package com.bytedance.android.live.broadcast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.bgbroadcast.C3161c;
import com.bytedance.android.live.broadcast.p192c.C3216c;
import com.bytedance.android.live.broadcast.p192c.p193a.C3198f;
import com.bytedance.android.live.broadcast.p195d.C3223d;
import com.bytedance.android.live.broadcast.p195d.C3224e;
import com.bytedance.android.live.broadcast.p195d.C3225f;
import com.bytedance.android.live.broadcast.p198g.C3241b;
import com.bytedance.android.live.broadcast.preview.C3365a;
import com.bytedance.android.live.broadcast.preview.C3378ak;
import com.bytedance.android.live.broadcast.preview.C3379b;
import com.bytedance.android.live.broadcast.preview.C3537p;
import com.bytedance.android.live.broadcast.preview.p204d.C3497b;
import com.bytedance.android.live.broadcast.preview.p204d.C3502d;
import com.bytedance.android.live.broadcast.stream.C3678c;
import com.bytedance.android.live.broadcast.stream.C3704d;
import com.bytedance.android.live.broadcast.widget.C3779a;
import com.bytedance.android.live.broadcast.widget.C3780b;
import com.bytedance.android.live.broadcast.widget.C3788i;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.broadcast.widget.StickerTipWidget;
import com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.chatroom.end.C7520f;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p561j.C9103do;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.b */
public class C3072b implements IBroadcastService {
    private static Activity currentActivity;
    private C3378ak startLiveManager;

    static {
        Covode.recordClassIndex(3552);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        return "10.5.0.11-a";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean haveNewFilter() {
        return false;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Activity getBroadcastActivity() {
        return currentActivity;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractBinderC11605a createBgBroadcastBinder() {
        return new BgBroadcastServiceImpl();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveComposerFilePath() {
        return EnumC3338p.INST.getLiveComposerFilePath();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3054d getSubscribeEntranceHelper() {
        return new C3497b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment getSubscribeSettingFragment() {
        return C3502d.C3503a.m8930a("creator_tools_page");
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
        C3251m.m8741a().mo8583b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showEndPageForPaidEvent() {
        DataChannelGlobal.f42558d.mo28329d(C9103do.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Map<String, String> getRoomInfo() {
        return (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC88979t<Integer> loadShortVideoRes() {
        C3251m.m8741a();
        return AbstractC88979t.m154310b((Object) 1);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11687h startLiveManager() {
        if (this.startLiveManager == null) {
            this.startLiveManager = new C3378ak();
        }
        return this.startLiveManager;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3022a stickerPresenter() {
        return C3216c.m8707a().mo8569b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setBroadcastActivity(Activity activity) {
        currentActivity = activity;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public C11672a convertStickerBean(Effect effect) {
        return C3198f.m8684a(effect);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setApplyLivePermission(C11825a aVar) {
        DataChannelGlobal.f42558d.mo28321a(C9115e.class, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setDetailLivePermission(C11826b bVar) {
        DataChannelGlobal.f42558d.mo28321a(C9012af.class, bVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC5776i createLiveBroadcastEndFragment(Bundle bundle) {
        C7520f fVar = new C7520f();
        fVar.setArguments(bundle);
        return fVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i) {
        if (i == 1) {
            return StickerTipWidget.class;
        }
        if (i != 2) {
            return null;
        }
        return TaskFinishAnimationWidget.class;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11685f createStartLiveFragment(AbstractC11821a aVar) {
        C3379b bVar = (C3379b) C3379b.f9602a.getValue();
        if (bVar == null) {
            return null;
        }
        C3241b.f9296a = aVar;
        return bVar.mo8702a();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void onLiveTabShow(Context context) {
        C89219l.m154721d(context, "");
        C2690b.m7788a(context);
        C6204h.m13473a();
        if (C6204h.f15478a) {
            C6204h.m13479b(C3365a.RunnableC3366a.f9582a);
            C2690b.m7787a((int) R.layout.b8l);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3063c createCoverController(Fragment fragment, Room room) {
        return new C3788i(fragment, room);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC7600a createLinkVideoView(Context context, AbstractC3060a.C3061a aVar) {
        return new LinkVideo2View(context, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11677a createBgBroadcastFragment(AbstractC11678b bVar, Bundle bundle) {
        C3161c cVar = new C3161c();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        cVar.setArguments(bundle2);
        cVar.f9148a = bVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig) {
        C3704d.C3705a aVar = new C3704d.C3705a(context);
        aVar.f10269v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getProjectKey();
        aVar.f10237E = new C3224e();
        aVar.f10267t = new C3225f();
        aVar.f10264q = 0;
        aVar.f10238F = new C3223d();
        return new C3678c(aVar.mo9021a()).mo8280a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11679c createLiveBroadcastFragment(AbstractC11678b bVar, Bundle bundle) {
        C89219l.m154721d(bVar, "");
        LivePerformanceManager instance = LivePerformanceManager.getInstance();
        instance.monitorPerformance("create_live");
        instance.startTimerMonitor();
        instance.onEnterRoom();
        if (bundle != null) {
            bundle.putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", System.currentTimeMillis());
        }
        C3276o oVar = new C3276o();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        oVar.setArguments(bundle2);
        oVar.f9412d = bVar;
        return oVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3062b createLinkInRoomView(AbstractC3055a aVar, Context context, int i) {
        if (i == 1) {
            return new C3779a(context);
        }
        if (i == 0) {
            return new C3780b(aVar, context);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showGuideBirthdayEditDialog(Activity activity, String str, String str2, IBroadcastService.AbstractC3017a aVar) {
        C3537p.m8941a(activity, str, str2, aVar);
    }
}
