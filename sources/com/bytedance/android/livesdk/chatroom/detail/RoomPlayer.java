package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.utils.C11260d;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.android.p149d.AbstractC2721d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class RoomPlayer implements AbstractC2717b {
    private C11690a entranceParam = null;
    private boolean isBackground;
    private C7428a mAudioFocusController;
    private final AbstractC2717b.AbstractC2718a mCallback;
    private final Context mContext;
    private int mDecodeStatus;
    private String mDefaultResolution;
    private AbstractC5777j mLivePlayController;
    private final AbstractC2721d mLogger = new C7434e();
    private String mMediaErrorMessage;
    private String mPullStreamData;
    private AbstractC11876d mRenderView;
    private final C11738s.C11739a mSrConfig;
    private boolean mStopOnPlayingOther;
    private final EnumC11728i mStreamType;
    private String mStreamUrl;
    private boolean openSEI = true;
    private String sdkParams;

    static {
        Covode.recordClassIndex(8191);
    }

    public long getPlayerFirstFrameTime() {
        return 0;
    }

    public long getPlayerStartTime() {
        return 0;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public long getStartTime() {
        return 0;
    }

    public boolean hasWarmedUp() {
        return false;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean pipResumePlay() {
        return false;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void recycle() {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setEnterRoomScene(String str) {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setReusePlayer(boolean z, String str) {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void tryToStartAudioDevice() {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void tryToUploadFirstScreenTime() {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public AbstractC2721d getLogger() {
        return this.mLogger;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public long getAudioLostFocusTime() {
        C7428a aVar = this.mAudioFocusController;
        if (aVar == null) {
            return -1;
        }
        return aVar.f18424d;
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
    public void onForeground() {
        this.isBackground = false;
        C7428a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.mo13644a(false);
            this.mAudioFocusController.mo11509a(this.mContext);
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
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

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
            return true;
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            doStartPlayByStreamUrl();
            return true;
        }
    }

    private void doStartPlayByMultiPullStreamData() {
        AbstractC11643g.C11647d dVar;
        this.isBackground = false;
        C3854a.m9453a(3, "RoomPlayer", "play stream data: " + this.mPullStreamData + ", streamType: " + this.mStreamType);
        this.mAudioFocusController.mo11509a(this.mContext);
        try {
            AbstractC5777j jVar = this.mLivePlayController;
            String str = this.mPullStreamData;
            String str2 = this.mDefaultResolution;
            AbstractC11876d dVar2 = this.mRenderView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                dVar = null;
            } else {
                AbstractC11643g.C11647d.C11648a aVar = new AbstractC11643g.C11647d.C11648a();
                aVar.f27786a = this.mSrConfig.f28114a;
                aVar.f27787b = this.mSrConfig.f28115b;
                aVar.f27788c = this.mSrConfig.f28116c;
                dVar = aVar.mo18426a();
            }
            jVar.mo12912a(str, str2, dVar2, ordinal, dVar, new C7461t(this));
        } catch (Exception e) {
            e.printStackTrace();
            this.mCallback.mo7279a(e);
        }
    }

    private void doStartPlayByStreamUrl() {
        AbstractC11643g.C11647d dVar;
        C3854a.m9453a(3, "RoomPlayer", "play url: " + this.mStreamUrl + ", streamType: " + this.mStreamType);
        this.mAudioFocusController.mo11509a(this.mContext);
        try {
            AbstractC5777j jVar = this.mLivePlayController;
            String str = this.mStreamUrl;
            AbstractC11876d dVar2 = this.mRenderView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                dVar = null;
            } else {
                AbstractC11643g.C11647d.C11648a aVar = new AbstractC11643g.C11647d.C11648a();
                aVar.f27786a = this.mSrConfig.f28114a;
                aVar.f27787b = this.mSrConfig.f28115b;
                aVar.f27788c = this.mSrConfig.f28116c;
                dVar = aVar.mo18426a();
            }
            jVar.mo12911a(str, dVar2, ordinal, dVar, new C7460s(this), this.sdkParams);
        } catch (Exception e) {
            e.printStackTrace();
            this.mCallback.mo7279a(e);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean start() {
        if (this.mLivePlayController != null) {
            return true;
        }
        setLivePlayEntranceParamFromConfig();
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            AbstractC5777j livePlayController = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
            this.mLivePlayController = livePlayController;
            livePlayController.mo11539c(this.openSEI);
            this.mAudioFocusController = new C7428a(this.mLivePlayController);
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            AbstractC5777j livePlayController2 = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
            this.mLivePlayController = livePlayController2;
            livePlayController2.mo11539c(this.openSEI);
            this.mAudioFocusController = new C7428a(this.mLivePlayController);
            doStartPlayByStreamUrl();
        }
        return true;
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mPullStreamData) && TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        }
        this.mLivePlayController = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
        C7572d.m15561a("RoomPlayer", "release player -> release the internal LivePlayer, it will be recreated when you start");
        this.mLivePlayController.mo12926j();
        this.mLivePlayController.mo11539c(true);
        this.mAudioFocusController = new C7428a(this.mLivePlayController);
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer$1 */
    static /* synthetic */ class C74231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18415a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer.C74231.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setSeiOpen(boolean z) {
        this.openSEI = z;
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

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void setMute(boolean z) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo12914a(z, this.mContext);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stopWhenJoinInteract(Context context) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11534b(context);
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stopWhenPlayingOther(Context context) {
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo12919f(context);
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

    @Override // com.bytedance.android.p149d.AbstractC2717b
    public void stop(boolean z) {
        C7428a aVar = this.mAudioFocusController;
        if (aVar != null) {
            if (z) {
                aVar.mo13646b(this.mContext);
            } else {
                C11260d.m19954b(aVar.f18422b);
            }
            this.mAudioFocusController = null;
        }
        AbstractC5777j jVar = this.mLivePlayController;
        if (jVar != null) {
            jVar.mo11522a(this.mContext);
            if (z) {
                this.mLivePlayController.mo12918e(this.mContext);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(AbstractC11643g.EnumC11645b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (C74231.f18415a[bVar.ordinal()]) {
                case 1:
                    this.mCallback.mo7282k();
                    return;
                case 2:
                    this.mCallback.mo7282k();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo7278a(AbstractC11643g.EnumC11645b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    return;
                case 3:
                    this.mDecodeStatus = 1;
                    if (!this.isBackground) {
                        this.mAudioFocusController.mo11509a(this.mContext);
                    }
                    this.mCallback.mo7283l();
                    return;
                case 4:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo13646b(this.mContext);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    this.mStopOnPlayingOther = true;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    this.mCallback.mo7280a(obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.mCallback.mo7284m();
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                default:
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo7277a(65535 & parseInt, parseInt >> 16);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    this.mCallback.mo7285n();
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    this.mCallback.mo7286o();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (obj != null) {
                        this.mCallback.mo7281a(obj.toString());
                        return;
                    }
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doStartPlayByStreamUrl$0$RoomPlayer(AbstractC11643g.EnumC11645b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (C74231.f18415a[bVar.ordinal()]) {
                case 1:
                    this.mCallback.mo7282k();
                    return;
                case 2:
                    this.mCallback.mo7282k();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo7278a(AbstractC11643g.EnumC11645b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    return;
                case 3:
                    this.mDecodeStatus = 1;
                    this.mAudioFocusController.mo11509a(this.mContext);
                    this.mCallback.mo7283l();
                    return;
                case 4:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo13646b(this.mContext);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    this.mStopOnPlayingOther = true;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    this.mCallback.mo7280a(obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.mCallback.mo7284m();
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                default:
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo7277a(65535 & parseInt, parseInt >> 16);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    this.mCallback.mo7286o();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (obj != null) {
                        this.mCallback.mo7281a(obj.toString());
                        return;
                    }
                    return;
            }
        }
    }

    public RoomPlayer(String str, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context, String str2) {
        this.mStreamUrl = str;
        this.mSrConfig = aVar;
        this.mStreamType = iVar;
        this.mRenderView = dVar;
        this.mCallback = aVar2;
        this.mContext = context;
        this.sdkParams = str2;
    }

    public RoomPlayer(String str, String str2, EnumC11728i iVar, C11738s.C11739a aVar, AbstractC11876d dVar, AbstractC2717b.AbstractC2718a aVar2, Context context) {
        this.mPullStreamData = str;
        this.mDefaultResolution = str2;
        this.mSrConfig = aVar;
        this.mStreamType = iVar;
        this.mRenderView = dVar;
        this.mCallback = aVar2;
        this.mContext = context;
    }
}
