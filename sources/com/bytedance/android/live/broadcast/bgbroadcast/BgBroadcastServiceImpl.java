package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b;
import com.bytedance.android.live.broadcast.api.p186d.C3058c;
import com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3096b;
import com.bytedance.android.live.broadcast.bgbroadcast.p191b.C3154a;
import com.bytedance.android.live.broadcast.p195d.C3221b;
import com.bytedance.android.live.broadcast.p199h.C3244b;
import com.bytedance.android.live.broadcast.stream.p207c.C3687b;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p489d.C7417b;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9108dt;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public class BgBroadcastServiceImpl extends AbstractBinderC11605a implements AbstractC3057b {
    private static MediaProjection sProjection;
    private static Intent sProjectionIntent;
    private C3183g liveDurationSpentStat;
    private boolean mIsFirstPushStream = true;
    private EnumC3088a mLiveStatus;
    private AbstractC3057b mLiveStreamCallback;
    private Room mRoom;
    private C3244b mStatusReport;
    private C3687b mStatusService;
    private AbstractC3089a mStrategy;
    private Service mStub;
    private AbstractBinderC11605a.AbstractC11606a mUiListener;

    static {
        Covode.recordClassIndex(3568);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void connected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onCaptureFirstFrame() {
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onFirstRTMPConnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onNetworkLow() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onNetworkStatus(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onReconnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onReconnected() {
    }

    public void onStreamEnd(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onStreamEnd(int i, int i2, String str) {
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public static Intent getProjectionIntent() {
        return sProjectionIntent;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void startAudio() {
        AbstractC3089a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.mo8385a();
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void stopAudio() {
        AbstractC3089a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.mo8388b();
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void stopService() {
        this.mStub.stopSelf();
    }

    private long getRoomId() {
        Room room = this.mRoom;
        if (room != null) {
            return room.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void beforeLiveCoreStartStream() {
        C3183g gVar = this.liveDurationSpentStat;
        if (gVar != null) {
            gVar.f9191b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public boolean isLiveFinished() {
        if (this.mLiveStatus == EnumC3088a.FINISHED) {
            return true;
        }
        return false;
    }

    private long getUserId() {
        if (C11115u.m19743a().mo17915b() != null) {
            return C11115u.m19743a().mo17915b().mo13161c();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl$a */
    public enum EnumC3088a {
        IDLE,
        LIVING,
        FINISHED;

        static {
            Covode.recordClassIndex(3569);
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void startBgActivity() {
        if (this.mStub != null) {
            Intent intent = new Intent(this.mStub, ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostActivity(6));
            intent.addFlags(268435456);
            m8428xb7497e99(C3966y.m9669e(), intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void onCreate() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        this.mRoom = room;
        if (!Room.isValid(room)) {
            this.mStub.stopSelf();
            return;
        }
        C3244b bVar = new C3244b(this.mRoom);
        this.mStatusReport = bVar;
        bVar.f9297a = new C3180d(this);
        this.mStatusService = new C3687b(this.mStatusReport);
        this.mLiveStatus = EnumC3088a.IDLE;
        if (this.mRoom.isScreenshot) {
            C3096b bVar2 = new C3096b(this.mStub, this.mRoom);
            this.mStrategy = bVar2;
            bVar2.f8988d = this;
            sProjection = null;
        } else {
            this.mStrategy = new C3154a();
        }
        this.mStrategy.f8976a = new C3181e(this);
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void onDestroy() {
        C3244b bVar = this.mStatusReport;
        if (bVar != null) {
            bVar.mo8581a();
        }
        stopStream(1, true, PrivacyCert.Builder.with("bpea-415").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.mRoom = null;
        DataChannelGlobal.f42558d.mo28327c(C9009ac.class);
        this.mStatusService = null;
        this.mLiveStatus = EnumC3088a.IDLE;
        AbstractC3089a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.mo8390c();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
        this.mLiveStreamCallback = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onStreamStart() {
        Room room;
        this.mIsFirstPushStream = false;
        C3183g gVar = this.liveDurationSpentStat;
        if (gVar != null) {
            gVar.f9192c = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                jSONObject.put("user_id", b.mo13161c());
                C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
                if (!(hVar == null || (room = hVar.f16310b) == null)) {
                    jSONObject.put("room_id", room.getId());
                    jSONObject.put("anchor_id", room.getOwnerUserId());
                    jSONObject.put("live_mode", room.liveRoomMode);
                    jSONObject.put("game_label", room.getLabels());
                }
                jSONObject.put("stream_push_room_success", gVar.f9190a);
                jSONObject.put("stream_push_core_start", gVar.f9191b);
                jSONObject.put("stream_push_accessed", gVar.f9192c);
            } catch (JSONException e) {
                C3868c.m9496a(e, String.valueOf(e));
            }
            C11868d.m20958a("livesdk_gamelive_spend", null, null, jSONObject);
        }
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public static void setProjectionIntent(Intent intent) {
        sProjectionIntent = intent;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void bindService(Service service) {
        this.mStub = service;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void setLiveStatusListener(AbstractBinderC11605a.AbstractC11606a aVar) {
        this.mUiListener = aVar;
    }

    public void setLiveStreamCallback(AbstractC3057b bVar) {
        this.mLiveStreamCallback = bVar;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void unBindService(Service service) {
        this.mStub = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public void onInfo(float f) {
        AbstractC3057b bVar = this.mLiveStreamCallback;
        if (bVar != null) {
            bVar.onInfo(f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(int i) {
        stopStream(i, false, PrivacyCert.Builder.with("bpea-414").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            C3221b.m8715a(i, getUserId(), getRoomId(), this.mIsFirstPushStream);
            stopStream(1, false, PrivacyCert.Builder.with("bpea-413").usage("").tag("stop video/audio capture when error occurs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            AbstractBinderC11605a.AbstractC11606a aVar = this.mUiListener;
            if (aVar != null) {
                aVar.mo8469a();
            }
        }
    }

    /* renamed from: com_bytedance_android_live_broadcast_bgbroadcast_BgBroadcastServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m8428xb7497e99(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void stopStream(int i, PrivacyCert privacyCert) {
        stopStream(i, false, privacyCert);
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public boolean startStream(boolean z, PrivacyCert privacyCert) {
        if (this.mLiveStatus == EnumC3088a.LIVING) {
            return true;
        }
        if (this.mStrategy == null || this.mStatusService == null) {
            return false;
        }
        this.liveDurationSpentStat = new C3183g();
        if (!this.mStrategy.mo8387a(privacyCert)) {
            return false;
        }
        this.mStatusService.mo8956a();
        this.mLiveStatus = EnumC3088a.LIVING;
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a
    public void setData(Intent intent, boolean z, DataChannel dataChannel) {
        super.setData(intent, z, dataChannel);
        AbstractC3089a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.mo8386a(intent, z);
            new C7417b(dataChannel, this.mStrategy.mo8391d(), this.mStatusService);
        }
    }

    private void stopStream(int i, boolean z, PrivacyCert privacyCert) {
        if (this.mLiveStatus == EnumC3088a.LIVING) {
            AbstractC3089a aVar = this.mStrategy;
            if (aVar != null) {
                aVar.mo8389b(privacyCert);
            }
            int b = DataChannelGlobal.f42558d.mo28324b(C9108dt.class);
            if (b == null) {
                b = 0;
            }
            if (this.mStatusService != null && !C3058c.f8898a.contains(b)) {
                this.mStatusService.mo8957a(i);
            }
            this.mLiveStatus = EnumC3088a.FINISHED;
        }
    }
}
