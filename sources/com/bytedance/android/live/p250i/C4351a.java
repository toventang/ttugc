package com.bytedance.android.live.p250i;

import android.content.Context;
import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p250i.p251a.AbstractC4356c;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p250i.p252b.C4365d;
import com.bytedance.android.live.p379n.AbstractC5770d;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5778k;
import com.bytedance.android.live.p379n.AbstractC5779l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.detail.C7428a;
import com.bytedance.android.livesdk.chatroom.detail.C7465x;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdk.p442ai.C6737k;
import com.bytedance.android.livesdk.p442ai.p445c.C6715a;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.AbstractC11874c;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.android.p149d.AbstractC2722e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.i.a */
public class C4351a implements AbstractC4357d {
    private static final String TAG = C4351a.class.getSimpleName();

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC5778k getLivePlayControllerManager() {
        return C6737k.f16717b;
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2722e getIRoomPlayerManager() {
        return C7465x.m15380a();
    }

    static {
        Covode.recordClassIndex(4925);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC4352a getCpuInfoFetcher() {
        return C4365d.m10462g().mo10115f();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC5771e getDnsOptimizer() {
        return C4365d.m10462g().mo10112c();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC4354b getGpuInfoFetcher() {
        return C4365d.m10462g().mo10114e();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC5777j getLivePlayController() {
        return C4365d.m10462g().mo10110a();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC4356c getLivePlayerLog() {
        return C4365d.m10462g().mo10111b();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC5779l getLiveStreamStrategy() {
        return C4365d.m10462g().mo10113d();
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public String getProjectKey() {
        if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
            return "musically_live";
        }
        return "tiktok_live";
    }

    public AbstractC5770d getAudioFocusController(AbstractC11643g gVar) {
        return new C7428a(gVar);
    }

    public AbstractC11874c getLivePlayerView(Context context) {
        return new C6715a(context);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public void recycleRoomPlayer(String str) {
        AbstractC2719c a;
        C7465x a2 = C7465x.m15380a();
        C7572d.m15561a(C7465x.f18559a, "recycle() -> playerTag=".concat(String.valueOf(str)));
        if (str != null && (a = a2.mo13701a(str)) != null) {
            a2.mo13702a(a);
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public boolean preCreatedSurface(String str, Context context) {
        AbstractC2719c a;
        C7465x a2 = C7465x.m15380a();
        if (!LivePreCreateSurfaceSetting.INSTANCE.getValue() || (a = a2.mo13701a(str)) == null) {
            return false;
        }
        C7572d.m15561a(C7465x.f18559a, "preCreatedSurface() -> playerTag is ".concat(String.valueOf(str)));
        return a.preCreatedSurface(context);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public void stopRoomPlayer(String str, boolean z) {
        AbstractC2719c a;
        C7465x a2 = C7465x.m15380a();
        C7572d.m15561a(C7465x.f18559a, "stop() -> playerTag=" + str + "; needRelease: " + z);
        if (str != null && (a = a2.mo13701a(str)) != null) {
            a.stop(z);
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2719c warmUp(Room room, Context context) {
        C7572d.m15561a(TAG, "warmUp -> roomId=" + room.getId());
        C7465x a = C7465x.m15380a();
        if (C7465x.m15383b()) {
            return null;
        }
        return a.mo13700a(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().f28106n, room.getStreamType(), false, null, C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28320aa);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2719c warmUp(long j, EnterRoomConfig enterRoomConfig, Context context) {
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        C7572d.m15561a(TAG, "warmUp -> roomId=".concat(String.valueOf(j)));
        C7465x a = C7465x.m15380a();
        if (C7465x.m15383b() || enterRoomConfig2 == null) {
            return null;
        }
        EnterRoomConfig enterRoomConfig3 = enterRoomConfig2.f28233c.f28286C;
        if (enterRoomConfig3 != null) {
            enterRoomConfig2.f28233c.f28286C = null;
            enterRoomConfig2 = enterRoomConfig3;
        }
        String str = enterRoomConfig2.f28231a.f28375b;
        String str2 = enterRoomConfig2.f28231a.f28377d;
        String str3 = enterRoomConfig2.f28231a.f28378e;
        boolean a2 = C13627m.m24498a(str3);
        if (a2) {
            str3 = str2;
        }
        return a.mo13700a(j, context, str, enterRoomConfig2.f28231a.f28376c, str3, enterRoomConfig2.f28231a.f28379f, new C11738s.C11739a(enterRoomConfig2.f28231a.f28380g, enterRoomConfig2.f28231a.f28381h, enterRoomConfig2.f28231a.f28382i), EnumC11728i.valueOf(enterRoomConfig2.f28231a.f28383j), !a2, enterRoomConfig2.f28233c.f28288E, enterRoomConfig2.f28233c.f28320aa);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2717b createRoomPlayer(String str, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context, String str2) {
        return new RoomPlayer(str, iVar, aVar, dVar, aVar2, context, str2);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2717b createRoomPlayer(String str, String str2, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context) {
        return new RoomPlayer(str, str2, iVar, aVar, dVar, aVar2, context);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2717b ensureRoomPlayer(long j, String str, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context, String str2, String str3) {
        C7572d.m15561a(TAG, "ensureRoomPlayer -> roomId=" + j + ", playerTag=" + str3);
        C7465x a = C7465x.m15380a();
        if (C7465x.m15383b()) {
            return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).createRoomPlayer(str, iVar, aVar, dVar, aVar2, context, str2);
        }
        AbstractC2719c a2 = a.mo13701a(str3);
        if (a2 != null) {
            a2.attach(context, dVar, aVar2);
            return a2;
        }
        AbstractC2719c a3 = a.mo13699a(j, context, str, str2, null, null, aVar, iVar);
        C7465x.m15381a(a3, context, dVar, aVar2);
        return a3;
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4357d
    public AbstractC2717b ensureRoomPlayer(long j, String str, String str2, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context, String str3) {
        C7572d.m15561a(TAG, "ensureRoomPlayer -> roomId=" + j + ", playerTag=" + str3);
        C7465x a = C7465x.m15380a();
        if (C7465x.m15383b()) {
            return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).createRoomPlayer(str, str2, iVar, aVar, dVar, aVar2, context);
        }
        AbstractC2719c a2 = a.mo13701a(str3);
        if (a2 != null) {
            a2.attach(context, dVar, aVar2);
            return a2;
        }
        AbstractC2719c a3 = a.mo13699a(j, context, null, null, str, str2, aVar, iVar);
        C7465x.m15381a(a3, context, dVar, aVar2);
        return a3;
    }
}
