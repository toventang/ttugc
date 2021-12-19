package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableSmoothEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableFeedLiveCardReusePlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowBackgroundBelowVideoExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.utils.C11260d;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class RoomPlayer2 implements AbstractC2719c {
    public String enterRoomScene;
    private C11690a entranceParam = null;
    public boolean isBackground;
    private boolean isReusePlayer = false;
    private boolean isReusePlayerWithFirstFrame = true;
    public C7428a mAudioFocusController;
    private WeakReference<AbstractC2717b.AbstractC2718a> mCallbackRef;
    private AbstractC2719c.C2720a mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached = false;
    private boolean mHasWarmedUp = false;
    public AbstractC5777j mLivePlayController;
    public C7463v mLogger = new C7463v();
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public String mMediaErrorMessage;
    public List<C7427a> mPendingCallbacks = new ArrayList();
    private Runnable mPendingMessageRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.RunnableC74241 */

        static {
            Covode.recordClassIndex(8194);
        }

        public final void run() {
            if (RoomPlayer2.this.mPendingCallbacks != null && RoomPlayer2.this.mPendingCallbacks.size() > 0) {
                for (C7427a aVar : RoomPlayer2.this.mPendingCallbacks) {
                    RoomPlayer2.this.mPlayMessageListener.mo12871a(aVar.f18419a, aVar.f18420b);
                    C7572d.m15561a("RoomPlayer2", "execute pending message runnable -> message = " + aVar.f18419a.name());
                }
                RoomPlayer2.this.mPendingCallbacks.clear();
            }
        }
    };
    public AbstractC11643g.AbstractC11646c mPlayMessageListener = new AbstractC11643g.AbstractC11649e() {
        /* class com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.C74252 */

        static {
            Covode.recordClassIndex(8195);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11649e
        /* renamed from: a */
        public final void mo13641a() {
            RoomPlayer2.this.playerStartTime = System.currentTimeMillis();
            RoomPlayer2.this.mLogger.mo13694a("sdk_player_start", Long.valueOf(RoomPlayer2.this.playerStartTime));
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11649e
        /* renamed from: b */
        public final void mo13642b() {
            RoomPlayer2.this.playerFirstFrameTime = System.currentTimeMillis();
            RoomPlayer2.this.mLogger.mo13694a("sdk_player_first_frame", Long.valueOf(RoomPlayer2.this.playerFirstFrameTime));
            if (ShowBackgroundBelowVideoExperiment.INSTANCE.isEnable() && !TextUtils.equals(RoomPlayer2.this.enterRoomScene, "inner_draw")) {
                RoomPlayer2.this.mLogger.mo13694a("first_frame", Long.valueOf(RoomPlayer2.this.playerFirstFrameTime));
            }
            C3854a.m9453a(4, "RoomPlayer2", " first frame ");
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11646c
        /* renamed from: a */
        public final void mo12871a(AbstractC11643g.EnumC11645b bVar, Object obj) {
            if (RoomPlayer2.this.mAudioFocusController != null && RoomPlayer2.this.mLivePlayController != null) {
                AbstractC2717b.AbstractC2718a callback = RoomPlayer2.this.getCallback();
                C7572d.m15561a("RoomPlayer2", "onPlayerMessage -> message is " + bVar.name());
                if (callback != null) {
                    switch (C74263.f18418a[bVar.ordinal()]) {
                        case 1:
                            callback.mo7282k();
                            return;
                        case 2:
                            callback.mo7282k();
                            if (obj != null) {
                                RoomPlayer2.this.mMediaErrorMessage = obj.toString();
                            }
                            if (RoomPlayer2.this.mDecodeStatus != 1) {
                                RoomPlayer2.this.mDecodeStatus = 2;
                                callback.mo7278a(AbstractC11643g.EnumC11645b.MEDIA_ERROR.ordinal(), RoomPlayer2.this.mMediaErrorMessage);
                                return;
                            }
                            return;
                        case 3:
                            RoomPlayer2.this.mDecodeStatus = 1;
                            if (!RoomPlayer2.this.isBackground) {
                                if (!RoomPlayer2.this.multiPlayer) {
                                    RoomPlayer2.this.mAudioFocusController.mo13643a(RoomPlayer2.this.getTagContext(), RoomPlayer2.this.mPlayerTag);
                                } else if (((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11548a() == RoomPlayer2.this.mLivePlayController) {
                                    RoomPlayer2.this.mAudioFocusController.mo13643a(RoomPlayer2.this.getTagContext(), RoomPlayer2.this.mPlayerTag);
                                }
                            }
                            RoomPlayer2.this.mLogger.mo13693a("first_frame");
                            RoomPlayer2.this.mLogger.mo13693a("on_display_callback");
                            RoomPlayer2.this.mLogger.mo13692a();
                            C3854a.m9453a(4, "RoomPlayer2", "DISPLAYED_PLAY");
                            callback.mo7283l();
                            return;
                        case 4:
                            RoomPlayer2.this.mStopOnPlayingOther = true;
                            RoomPlayer2.this.mAudioFocusController.mo13647b(null, RoomPlayer2.this.mPlayerTag);
                            return;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            RoomPlayer2.this.mStopOnPlayingOther = true;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            callback.mo7280a(obj);
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            callback.mo7284m();
                            return;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        default:
                            return;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            int parseInt = Integer.parseInt((String) obj);
                            callback.mo7277a(65535 & parseInt, parseInt >> 16);
                            return;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            callback.mo7285n();
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            callback.mo7286o();
                            return;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            if (obj != null) {
                                callback.mo7281a(obj.toString());
                                return;
                            }
                            return;
                    }
                } else if (!RoomPlayer2.this.mHasAttached) {
                    for (C7427a aVar : RoomPlayer2.this.mPendingCallbacks) {
                        if (aVar.f18419a == bVar) {
                            aVar.f18420b = obj;
                            C7572d.m15561a("RoomPlayer2", "onPlayerMessage -> replace pending message: " + bVar.toString());
                            return;
                        }
                    }
                    if (bVar == AbstractC11643g.EnumC11645b.DISPLAYED_PLAY) {
                        RoomPlayer2.this.mPendingCallbacks.add(0, new C7427a(bVar, obj));
                    } else {
                        RoomPlayer2.this.mPendingCallbacks.add(new C7427a(bVar, obj));
                    }
                    C7572d.m15561a("RoomPlayer2", "onPlayerMessage -> add pending message: " + bVar.name());
                }
            }
        }
    };
    public String mPlayerTag;
    private WeakReference<AbstractC11876d> mRenderViewRef;
    public boolean mStopOnPlayingOther;
    private WeakReference<Context> mTagContextRef;
    public boolean multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    public long playerFirstFrameTime;
    public long playerStartTime;
    private String reusePlayerTag = null;
    private long roomId;
    private long startTime;

    static {
        Covode.recordClassIndex(8193);
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setSeiOpen(boolean z) {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public C7463v getLogger() {
        return this.mLogger;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getPlayerFirstFrameTime() {
        return this.playerFirstFrameTime;
    }

    public long getPlayerStartTime() {
        return this.playerStartTime;
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public String getPlayerTag() {
        return this.mPlayerTag;
    }

    public long getRoomId() {
        return this.roomId;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public long getStartTime() {
        return this.startTime;
    }

    public boolean hasWarmedUp() {
        return this.mHasWarmedUp;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean pipResumePlay() {
        return doStart();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void recycle() {
        C7465x.m15380a().mo13702a(this);
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public boolean warmUp() {
        this.mHasWarmedUp = true;
        return start();
    }

    private AbstractC11876d getRenderView() {
        WeakReference<AbstractC11876d> weakReference = this.mRenderViewRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public long getAudioLostFocusTime() {
        C7428a aVar = this.mAudioFocusController;
        if (aVar == null) {
            return -1;
        }
        return aVar.f18424d;
    }

    public AbstractC2717b.AbstractC2718a getCallback() {
        WeakReference<AbstractC2717b.AbstractC2718a> weakReference = this.mCallbackRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Context getTagContext() {
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public boolean isPlaying() {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar == null || !jVar.mo12928l()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean isVideoHorizontal() {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar == null || !jVar.mo11532a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void onBackground() {
        this.isBackground = true;
        C7428a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.mo13644a(true);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void tryToStartAudioDevice() {
        C7428a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.mo13643a(getTagContext(), this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void onForeground() {
        this.isBackground = false;
        C7428a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.mo13644a(false);
            this.mAudioFocusController.mo13643a(getTagContext(), this.mPlayerTag);
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
        if (this.mLivePlayController != null) {
            EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
            String str = enterRoomConfig.f28233c.f28293J;
            String str2 = enterRoomConfig.f28233c.f28295L;
            String str3 = enterRoomConfig.f28233c.f28296M;
            if (C13627m.m24498a(str3)) {
                if (enterRoomConfig.f28232b.f28279w > 0) {
                    str3 = "draw";
                } else {
                    str3 = "click";
                }
            }
            C11690a aVar = new C11690a(str, str2, str3);
            this.entranceParam = aVar;
            this.mLivePlayController.mo12909a(aVar);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.f8129i == 0) {
            return false;
        }
        this.mLivePlayController = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
        C7572d.m15561a("RoomPlayer2", "release player -> release the internal LivePlayer, it will be recreated when you start");
        this.mLivePlayController.mo12926j();
        this.mLivePlayController.mo11539c(true);
        this.mAudioFocusController = new C7428a(this.mLivePlayController);
        return doStart();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void tryToUploadFirstScreenTime() {
        if (this.mLogger.mo13697c("first_frame")) {
            C7463v vVar = this.mLogger;
            vVar.mo13694a("player_first_frame_render_end", Long.valueOf(vVar.mo13696b("start")));
            C7463v vVar2 = this.mLogger;
            vVar2.mo13694a("sdk_player_first_frame", Long.valueOf(vVar2.mo13696b("start")));
            C7463v vVar3 = this.mLogger;
            vVar3.mo13694a("first_frame", Long.valueOf(vVar3.mo13696b("start")));
        }
        this.mLogger.mo13692a();
    }

    private void doStartPlayByMultiPullStreamData() {
        if (this.mConfig != null) {
            C7572d.m15561a("RoomPlayer2", "play stream data: " + this.mConfig.f8122b + ", streamType: " + this.mConfig.f8126f);
            AbstractC11643g.C11647d dVar = null;
            try {
                if (this.mConfig.f8127g != null) {
                    AbstractC11643g.C11647d.C11648a aVar = new AbstractC11643g.C11647d.C11648a();
                    aVar.f27786a = this.mConfig.f8127g.f28114a;
                    aVar.f27787b = this.mConfig.f8127g.f28115b;
                    aVar.f27788c = this.mConfig.f8127g.f28116c;
                    dVar = aVar.mo18426a();
                }
                this.mLivePlayController.mo11527a(this.mConfig.f8122b, this.mConfig.f8123c, getRenderView(), this.mConfig.f8126f.ordinal(), dVar, this.mPlayMessageListener, this.mPlayerTag);
            } catch (Exception e) {
                e.printStackTrace();
                AbstractC2717b.AbstractC2718a callback = getCallback();
                if (callback != null) {
                    callback.mo7279a(e);
                }
            }
        }
    }

    private void doStartPlayByStreamUrl() {
        if (this.mConfig != null) {
            C7572d.m15561a("RoomPlayer2", "play url: " + this.mConfig.f8124d + ", streamType: " + this.mConfig.f8126f);
            AbstractC11643g.C11647d dVar = null;
            try {
                if (this.mConfig.f8127g != null) {
                    AbstractC11643g.C11647d.C11648a aVar = new AbstractC11643g.C11647d.C11648a();
                    aVar.f27786a = this.mConfig.f8127g.f28114a;
                    aVar.f27787b = this.mConfig.f8127g.f28115b;
                    aVar.f27788c = this.mConfig.f8127g.f28116c;
                    dVar = aVar.mo18426a();
                }
                this.mLivePlayController.mo11526a(this.mConfig.f8124d, getRenderView(), this.mConfig.f8126f.ordinal(), dVar, this.mPlayMessageListener, this.mConfig.f8125e, this.mPlayerTag);
            } catch (Exception e) {
                e.printStackTrace();
                AbstractC2717b.AbstractC2718a callback = getCallback();
                if (callback != null) {
                    callback.mo7279a(e);
                }
            }
        }
    }

    private void reusePlayerAndBgOptRecordFirstFrame() {
        if (!this.isReusePlayer) {
            return;
        }
        if (EnableFeedLiveCardReusePlayerSetting.INSTANCE.getValue() && !this.isReusePlayerWithFirstFrame) {
            return;
        }
        if (EnableSmoothEnterRoomSetting.INSTANCE.getValue() == 1) {
            C7463v vVar = this.mLogger;
            vVar.mo13694a("player_first_frame_render_end", Long.valueOf(vVar.mo13696b("start")));
            C7463v vVar2 = this.mLogger;
            vVar2.mo13694a("sdk_player_first_frame", Long.valueOf(vVar2.mo13696b("start")));
            C7463v vVar3 = this.mLogger;
            vVar3.mo13694a("first_frame", Long.valueOf(vVar3.mo13696b("start")));
        } else if (EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue()) {
            this.mLogger.mo13694a("first_frame", Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public void release() {
        C7572d.m15561a("RoomPlayer2", "release -> roomPlayer release and reset param");
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.reusePlayerTag = null;
        this.isReusePlayerWithFirstFrame = true;
        this.startTime = 0;
        this.playerStartTime = 0;
        this.playerFirstFrameTime = 0;
        this.mPlayerTag = null;
        this.roomId = 0;
        this.entranceParam = null;
        this.enterRoomScene = null;
        C7463v vVar = this.mLogger;
        vVar.f18551a.clear();
        vVar.f18553c = null;
        vVar.f18552b = null;
        vVar.f18554d = false;
        vVar.f18557g = false;
        vVar.f18555e = false;
        vVar.f18556f = false;
        this.mConfig = null;
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference != null) {
            weakReference.clear();
            this.mTagContextRef = null;
        }
        WeakReference<AbstractC2717b.AbstractC2718a> weakReference2 = this.mCallbackRef;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.mCallbackRef = null;
        }
        WeakReference<AbstractC11876d> weakReference3 = this.mRenderViewRef;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.mRenderViewRef = null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$3 */
    static /* synthetic */ class C74263 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.C74263.<clinit>():void");
        }
    }

    private boolean doStart() {
        boolean z;
        this.mLogger.f18554d = this.mHasWarmedUp;
        this.mLogger.f18555e = this.isReusePlayer;
        setLivePlayEntranceParamFromConfig();
        if (this.isReusePlayer && this.mLivePlayController != null && EnableFeedLiveCardReusePlayerSetting.INSTANCE.getValue()) {
            this.isReusePlayerWithFirstFrame = this.mLivePlayController.mo11546f();
        }
        if (this.multiPlayer && this.mLivePlayController != null) {
            ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11551a(this.mPlayerTag, this.mLivePlayController);
        }
        if (this.mConfig.f8129i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            this.startTime = currentTimeMillis;
            this.mLogger.mo13694a("room_player_start", Long.valueOf(currentTimeMillis));
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByMultiPullStreamData();
        } else if (this.mConfig.f8129i != 2) {
            return false;
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.startTime = currentTimeMillis2;
            this.mLogger.mo13694a("room_player_start", Long.valueOf(currentTimeMillis2));
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByStreamUrl();
        }
        return true;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean start() {
        if (TestDisablePullStreamSetting.INSTANCE.getValue()) {
            return true;
        }
        if (this.mConfig == null || this.mLivePlayController != null) {
            reusePlayerAndBgOptRecordFirstFrame();
            return true;
        }
        if (this.multiPlayer && this.isReusePlayer && !C13627m.m24498a(this.reusePlayerTag)) {
            ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11552a(this.reusePlayerTag, this.mPlayerTag);
        }
        AbstractC5777j a = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11549a(this.mPlayerTag);
        this.mLivePlayController = a;
        a.mo11523a(new C7462u(((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayerLog(), this));
        this.mLivePlayController.mo11539c(this.mConfig.f8128h);
        if (this.mHasWarmedUp) {
            HashMap hashMap = new HashMap();
            hashMap.put("has_warmed_up", "1");
            this.mLivePlayController.mo11528a(hashMap);
        }
        this.mAudioFocusController = new C7428a(this.mLivePlayController);
        return doStart();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void changeSRSupportScene(boolean z) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11542d(z);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setAnchorInteractMode(boolean z) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11530a(z);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setEnterRoomScene(String str) {
        if (str != null) {
            this.enterRoomScene = str;
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setScreenOrientation(boolean z) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11536b(z);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void switchResolution(String str) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo12920f(str);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public boolean preCreatedSurface(Context context) {
        boolean g = this.mLivePlayController.mo12924g(context);
        this.mLogger.f18556f = g;
        return g;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setMute(boolean z) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11531a(z, this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stopWhenJoinInteract(Context context) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11544e(this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stopWhenPlayingOther(Context context) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11538c(this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void getVideoSize(int[] iArr) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null && iArr != null) {
            int k = jVar.mo12927k();
            iArr[0] = 65535 & k;
            iArr[1] = k >> 16;
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlayerLog(JSONObject jSONObject) {
        C7463v vVar = this.mLogger;
        if (jSONObject != null && TextUtils.equals(jSONObject.optString("event_key"), "first_frame")) {
            for (int i = 0; i < C7463v.f18549h.length; i++) {
                String str = C7463v.f18549h[i];
                long optLong = jSONObject.optLong(C7463v.f18550i[i], 0);
                if (optLong != 0) {
                    vVar.f18551a.put(str, Long.valueOf(optLong));
                }
            }
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stop(boolean z) {
        C7572d.m15561a("RoomPlayer2", "stop -> playerTag=" + this.mPlayerTag + ", needRelease: " + z);
        String str = this.mPlayerTag;
        if (str != null) {
            C7428a aVar = this.mAudioFocusController;
            if (aVar != null) {
                if (z) {
                    aVar.mo13647b(null, str);
                } else {
                    C11260d.m19954b(aVar.f18422b);
                }
                this.mAudioFocusController = null;
            }
            AbstractC5777j jVar = this.mLivePlayController;
            if (jVar != null) {
                jVar.mo11541d(this.mPlayerTag);
                if (z) {
                    this.mLivePlayController.mo11535b(this.mPlayerTag);
                }
                this.mLivePlayController = null;
            }
            this.mDecodeStatus = 0;
            this.mMediaErrorMessage = null;
            this.mStopOnPlayingOther = false;
            this.mMainHandler.removeCallbacks(this.mPendingMessageRunnable);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$a */
    static class C7427a {

        /* renamed from: a */
        AbstractC11643g.EnumC11645b f18419a;

        /* renamed from: b */
        Object f18420b;

        static {
            Covode.recordClassIndex(8197);
        }

        C7427a(AbstractC11643g.EnumC11645b bVar, Object obj) {
            this.f18419a = bVar;
            this.f18420b = obj;
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setReusePlayer(boolean z, String str) {
        this.isReusePlayer = z;
        this.reusePlayerTag = str;
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public void initialize(long j, AbstractC2719c.C2720a aVar) {
        this.roomId = j;
        this.mConfig = aVar;
        this.mPlayerTag = this.roomId + "_" + SystemClock.uptimeMillis();
    }

    RoomPlayer2(long j, AbstractC2719c.C2720a aVar) {
        initialize(j, aVar);
    }

    @Override // com.bytedance.android.p149d.AbstractC2719c
    public void attach(Context context, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(aVar);
        this.mRenderViewRef = new WeakReference<>(dVar);
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11524a(dVar);
        }
        C7428a aVar2 = this.mAudioFocusController;
        if (aVar2 != null) {
            aVar2.mo13643a(context, this.mPlayerTag);
        }
        this.mHasAttached = true;
        if (aVar == null) {
            return;
        }
        if (LivePreCreateSurfaceSetting.INSTANCE.getValue() || (this.isReusePlayer && EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue())) {
            this.mMainHandler.postAtFrontOfQueue(this.mPendingMessageRunnable);
        } else {
            this.mMainHandler.post(this.mPendingMessageRunnable);
        }
    }
}
