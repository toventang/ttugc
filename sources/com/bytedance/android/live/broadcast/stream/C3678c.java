package com.bytedance.android.live.broadcast.stream;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b;
import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3665b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreCameraLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableVeCamera2Setting;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEffectNewEngineConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCameraCaptureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePushStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableStreamPreviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestStreamConfigSetting;
import com.bytedance.android.livesdk.model.C9593l;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.LiveStreamReport;
import com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.ILayerControl;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.filter.FilterManager;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.stream.c */
public final class C3678c implements AbstractC3055a {

    /* renamed from: k */
    public static final C3679a f10117k = new C3679a((byte) 0);

    /* renamed from: s */
    private static final float[] f10118s = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public ILiveStream.ILiveStreamErrorListener f10119a;

    /* renamed from: b */
    public ILiveStream.ILiveStreamInfoListener f10120b;

    /* renamed from: c */
    public LiveCore f10121c;

    /* renamed from: d */
    public AbstractC3057b f10122d;

    /* renamed from: e */
    public int f10123e = -1;

    /* renamed from: f */
    public boolean f10124f;

    /* renamed from: g */
    public long f10125g;

    /* renamed from: h */
    public final Handler f10126h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public boolean f10127i;

    /* renamed from: j */
    public final C3704d f10128j;

    /* renamed from: l */
    private final AbstractC3055a.C3056a f10129l = new AbstractC3055a.C3056a();

    /* renamed from: m */
    private boolean f10130m;

    /* renamed from: n */
    private boolean f10131n;

    /* renamed from: o */
    private final Runnable f10132o = new RunnableC3680b(this);

    /* renamed from: p */
    private final Runnable f10133p = new RunnableC3683d(this);

    /* renamed from: q */
    private final ILiveStream.ILiveStreamErrorListener f10134q;

    /* renamed from: r */
    private final ILiveStream.ILiveStreamInfoListener f10135r;

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$a */
    public static final class C3679a {
        static {
            Covode.recordClassIndex(4191);
        }

        private C3679a() {
        }

        public /* synthetic */ C3679a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: e */
    public final LiveCore mo8302e() {
        return this.f10121c;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8291a(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        C89219l.m154721d(iLiveStreamInfoListener, "");
        this.f10120b = iLiveStreamInfoListener;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8290a(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        C89219l.m154721d(iLiveStreamErrorListener, "");
        this.f10119a = iLiveStreamErrorListener;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8287a(SurfaceView surfaceView) {
        LiveCore liveCore;
        C89219l.m154721d(surfaceView, "");
        if (!TestDisableStreamPreviewSetting.INSTANCE.getValue() && (liveCore = this.f10121c) != null) {
            liveCore.setDisplay(surfaceView);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8292a(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        C89219l.m154721d(iTextureFrameAvailableListener, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.addTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8293a(String str) {
        if (!TestDisablePushStreamSetting.INSTANCE.getValue()) {
            if (str == null || str.length() == 0) {
                str = this.f10128j.f10208b;
            }
            AbstractC3057b bVar = this.f10122d;
            if (bVar != null) {
                bVar.beforeLiveCoreStartStream();
            }
            LiveCore liveCore = this.f10121c;
            if (liveCore != null) {
                liveCore.start(str);
            }
            this.f10126h.postDelayed(this.f10133p, 3000);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8294a(List<String> list) {
        if (!TestDisablePushStreamSetting.INSTANCE.getValue()) {
            if (list == null || list.size() <= 0) {
                mo8293a(this.f10128j.f10208b);
                return;
            }
            AbstractC3057b bVar = this.f10122d;
            if (bVar != null) {
                bVar.beforeLiveCoreStartStream();
            }
            LiveCore liveCore = this.f10121c;
            if (liveCore != null) {
                liveCore.start(list);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8289a(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.resume(privacyCert);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.setAudioMute(this.f10130m, privacyCert);
        }
        this.f10126h.removeCallbacks(this.f10132o);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8295a(boolean z, PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        this.f10130m = z;
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.setAudioMute(z, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8286a(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(catchVideoCallback, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.catchVideo(bundle, catchVideoCallback);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$b */
    static final class RunnableC3680b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3678c f10136a;

        static {
            Covode.recordClassIndex(4192);
        }

        RunnableC3680b(C3678c cVar) {
            this.f10136a = cVar;
        }

        public final void run() {
            this.f10136a.f10123e = 10008;
            this.f10136a.mo8281a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: c */
    public final void mo8298c() {
        boolean z = !this.f10131n;
        this.f10131n = z;
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.enableMirror(z, true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: b */
    public final IFilterManager mo8296b() {
        if (TestDisableEffectSetting.INSTANCE.getValue()) {
            return FilterManager.createDummy();
        }
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            return liveCore.getVideoFilterMgr();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: d */
    public final int mo8300d() {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.f10121c;
        if (liveCore == null || (videoCapturerControl = liveCore.getVideoCapturerControl()) == null) {
            return -1;
        }
        return videoCapturerControl.queryZoomAbility(true, false);
    }

    static {
        Covode.recordClassIndex(4190);
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$d */
    static final class RunnableC3683d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3678c f10142a;

        static {
            Covode.recordClassIndex(4195);
        }

        RunnableC3683d(C3678c cVar) {
            this.f10142a = cVar;
        }

        public final void run() {
            ILayerControl layerControl;
            C3678c cVar = this.f10142a;
            if (cVar.f10122d != null) {
                LiveStreamReport liveStreamReport = new LiveStreamReport();
                LiveCore liveCore = cVar.f10121c;
                if (liveCore != null && liveCore.getLiveStreamInfo(liveStreamReport)) {
                    LivePerformanceManager.getInstance().setStreamFps(liveStreamReport.getVideoTransportRealFps());
                    LiveCore liveCore2 = cVar.f10121c;
                    if (!(liveCore2 == null || (layerControl = liveCore2.getLayerControl()) == null)) {
                        LivePerformanceManager.getInstance().setPreviewFps(layerControl.getRealRenderFps());
                    }
                    AbstractC3057b bVar = cVar.f10122d;
                    if (bVar != null) {
                        bVar.onInfo(((float) liveStreamReport.getVideoTransportRealBps()) / 1000.0f);
                    }
                }
                liveStreamReport.release();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8281a() {
        if (this.f10123e != 10008) {
            this.f10123e = 0;
        }
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.stop();
        }
        this.f10126h.removeCallbacks(this.f10133p);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8288a(AbstractC3057b bVar) {
        this.f10122d = bVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: e */
    public final void mo8303e(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.stopVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: f */
    public final void mo8304f(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.startVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: g */
    public final void mo8305g(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.stopVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: h */
    public final void mo8306h(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.startAudioCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: i */
    public final void mo8307i(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.stopAudioCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final int mo8279a(float f) {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.f10121c;
        if (liveCore == null || (videoCapturerControl = liveCore.getVideoCapturerControl()) == null) {
            return -1;
        }
        return videoCapturerControl.startZoom(true, f);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: j */
    public final void mo8308j(PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        int i = 1;
        if (!(liveCore == null || (builder = liveCore.getBuilder()) == null || builder.getVideoCaptureDevice() != 1)) {
            i = 2;
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.switchVideoCapture(i, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: b */
    public final void mo8297b(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        this.f10126h.postDelayed(this.f10132o, this.f10128j.f10221o);
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.setAudioMute(true, privacyCert);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.pause(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: c */
    public final void mo8299c(PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.enableMixer(true, false);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.enableMixer(false, false);
        }
        LiveCore liveCore3 = this.f10121c;
        if (liveCore3 != null) {
            liveCore3.stop();
        }
        LiveCore liveCore4 = this.f10121c;
        if (liveCore4 != null) {
            liveCore4.release(privacyCert);
        }
        this.f10121c = null;
        this.f10126h.removeCallbacksAndMessages(null);
        this.f10122d = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: d */
    public final void mo8301d(PrivacyCert privacyCert) {
        LiveCore liveCore;
        C89219l.m154721d(privacyCert, "");
        if (!TestDisableCameraCaptureSetting.INSTANCE.getValue() && (liveCore = this.f10121c) != null) {
            liveCore.startVideoCapture(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: k */
    public final void mo8309k(PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (!(liveCore == null || (builder = liveCore.getBuilder()) == null)) {
            builder.setBgMode(2);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.resume(privacyCert);
        }
        LiveCore liveCore3 = this.f10121c;
        if (liveCore3 != null) {
            liveCore3.setAudioMute(this.f10130m, privacyCert);
        }
        this.f10129l.f8891a = 2;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final Client mo8280a(LiveCore.InteractConfig interactConfig) {
        C89219l.m154721d(interactConfig, "");
        AbstractC2953a a = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a, "");
        interactConfig.setAppChannel(((IHostContext) a).getChannel());
        AbstractC2953a a2 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a2, "");
        interactConfig.setDeviceId(((IHostContext) a2).getServerDeviceId());
        interactConfig.setAppId(String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId()));
        AbstractC2953a a3 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a3, "");
        interactConfig.setAppVersion(((IHostContext) a3).getVersionCode());
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            return liveCore.create(interactConfig);
        }
        return null;
    }

    public C3678c(C3704d dVar) {
        int i;
        String str;
        C89219l.m154721d(dVar, "");
        this.f10128j = dVar;
        C3681c cVar = new C3681c(this);
        this.f10134q = cVar;
        C3684e eVar = new C3684e(this);
        this.f10135r = eVar;
        LiveCore.Builder builder = new LiveCore.Builder();
        builder.setUsingExternAudioCaptureOnServerInteractMode(dVar.f10206O);
        builder.setEnableVideoEncodeAccelera(dVar.f10218l);
        builder.setVideoProfile(dVar.f10219m);
        builder.setLogMonitor(new C3706e(dVar));
        builder.setContext(dVar.f10207a);
        builder.setProjectKey(dVar.f10198G);
        builder.setUploadLogInterval(5000);
        builder.setVideoFps(dVar.f10213g);
        builder.setVideoBitrate(dVar.f10210d * 1000);
        builder.setVideoMaxBitrate(dVar.f10212f * 1000);
        builder.setVideoMinBitrate(dVar.f10211e * 1000);
        builder.setVideoWidth(dVar.f10216j);
        builder.setVideoHeight(dVar.f10217k);
        builder.setVideoCaptureDevice(dVar.f10228v);
        builder.setUsingVECamera2API(LiveEnableVeCamera2Setting.INSTANCE.enable());
        builder.setAudioChannel(2);
        builder.setAudioProfile(dVar.f10223q);
        if (dVar.f10223q == 1) {
            i = 128000;
        } else {
            i = 64000;
        }
        builder.setAudioBitrate(i);
        builder.setAudioCaptureChannel(2);
        builder.setAudioSampleHZ(dVar.f10222p);
        builder.setAudioCaptureDevice(dVar.f10229w);
        if (dVar.f10230x != null) {
            C9593l lVar = dVar.f10230x;
            C89219l.m154716b(lVar, "");
            if (lVar.f23270a >= 0) {
                C9593l lVar2 = dVar.f10230x;
                C89219l.m154716b(lVar2, "");
                String str2 = lVar2.f23271b;
                C89219l.m154716b(str2, "");
                if (str2.length() > 0) {
                    C9593l lVar3 = dVar.f10230x;
                    C89219l.m154716b(lVar3, "");
                    JSONObject jSONObject = new JSONObject(lVar3.f23271b);
                    C9593l lVar4 = dVar.f10230x;
                    C89219l.m154716b(lVar4, "");
                    builder.setAdmType(lVar4.f23270a, jSONObject);
                }
            }
        }
        builder.setUsingLiveStreamAudioCapture(dVar.f10197F);
        builder.setRtmpReconnectCounts(dVar.f10220n);
        builder.setRtmpReconnectIntervalSeconds(5);
        builder.setVideoEncoder(dVar.f10193B);
        builder.setEnableVideoBFrame(dVar.f10192A);
        builder.setVideoGopSec(dVar.f10232z);
        builder.setBitrateAdaptStrategy(dVar.f10231y);
        builder.setRoiOn(dVar.f10194C ? 1 : 0, true);
        builder.setRoiOn(dVar.f10195D ? 1 : 0, false);
        if (dVar.f10196E == null) {
            str = "";
        } else {
            str = dVar.f10196E;
        }
        builder.setRoiAssetDir(str);
        builder.setBgMode(dVar.f10204M);
        if (TestStreamConfigSetting.INSTANCE.getValue() != null && TestStreamConfigSetting.INSTANCE.getValue().mEnable) {
            Map<String, String> stringMap = TestStreamConfigSetting.INSTANCE.getValue().getStringMap();
            C89219l.m154716b(stringMap, "");
            String str3 = dVar.f10199H;
            C89219l.m154716b(str3, "");
            dVar.f10199H = m9109a(stringMap, str3);
        }
        builder.setupSdkParams(dVar.f10199H);
        builder.setAssetManager(dVar.f10200I);
        builder.setEffectModePath(dVar.f10202K);
        builder.setEffectResourceFinder(dVar.f10201J);
        builder.setVideoCaptureWidth(dVar.f10214h);
        builder.setVideoCaptureHeight(dVar.f10215i);
        builder.setEffectAlgorithmAB(dVar.f10203L);
        builder.setUseNewEffectEngine(LiveEnableEffectNewEngineSetting.INSTANCE.getValue());
        builder.setEffectPlatformConfig(LiveEffectNewEngineConfigSetting.INSTANCE.getValue());
        builder.setLiveAuthString(dVar.f10205N);
        builder.setCameraLogLevel(LiveCoreCameraLogLevelSetting.INSTANCE.getValue());
        C3854a.m9453a(6, "LiveStream4", "builder.isEnableForceGlFinish: " + builder.isEnableForceGlFinish());
        if (dVar.f10227u != null) {
            builder.setScreenCaptureIntent(dVar.f10227u);
        }
        LiveCore create = builder.create();
        this.f10121c = create;
        if (create != null) {
            create.setErrorListener(cVar);
        }
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.setInfoListener(eVar);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.enableMixer(true, true);
        }
        LiveCore liveCore3 = this.f10121c;
        if (liveCore3 != null) {
            liveCore3.enableMixer(false, true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8285a(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.catchMediaData(bundle, catchPicCallback);
        }
    }

    /* renamed from: a */
    private static String m9109a(Map<String, String> map, String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("PushBase"));
        for (T t : map.entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        jSONObject.put("PushBase", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        C89219l.m154716b(jSONObject3, "");
        return jSONObject3;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8283a(int i, PrivacyCert privacyCert) {
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.switchVideoCapture(i, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8284a(Bitmap bitmap, PrivacyCert privacyCert) {
        LiveCore.Builder builder;
        C89219l.m154721d(bitmap, "");
        C89219l.m154721d(privacyCert, "");
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.setAudioMute(true, privacyCert);
        }
        LiveCore liveCore2 = this.f10121c;
        if (liveCore2 != null) {
            liveCore2.setBackGroundPhotoPath(bitmap);
        }
        LiveCore liveCore3 = this.f10121c;
        if (!(liveCore3 == null || (builder = liveCore3.getBuilder()) == null)) {
            builder.setBgMode(3);
        }
        LiveCore liveCore4 = this.f10121c;
        if (liveCore4 != null) {
            liveCore4.pause(privacyCert);
        }
        this.f10129l.f8891a = 6;
    }

    /* renamed from: a */
    public final void mo8950a(int i, int i2, String str) {
        this.f10126h.removeCallbacksAndMessages(null);
        AbstractC3057b bVar = this.f10122d;
        if (bVar != null) {
            bVar.onStreamEnd(i, i2, str);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$c */
    static final class C3681c implements ILiveStream.ILiveStreamErrorListener {

        /* renamed from: a */
        final /* synthetic */ C3678c f10137a;

        static {
            Covode.recordClassIndex(4193);
        }

        C3681c(C3678c cVar) {
            this.f10137a = cVar;
        }

        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
        public final void onError(final int i, final int i2, final Exception exc) {
            this.f10137a.f10126h.post(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.stream.C3678c.C3681c.RunnableC36821 */

                /* renamed from: a */
                final /* synthetic */ C3681c f10138a;

                static {
                    Covode.recordClassIndex(4194);
                }

                {
                    this.f10138a = r1;
                }

                public final void run() {
                    String str;
                    if (this.f10138a.f10137a.f10123e == -1) {
                        this.f10138a.f10137a.f10123e = i;
                    }
                    Exception exc = exc;
                    String str2 = "";
                    if (exc != null) {
                        str = exc.getMessage();
                    } else {
                        str = str2;
                    }
                    if (this.f10138a.f10137a.f10122d != null) {
                        C3678c cVar = this.f10138a.f10137a;
                        int i = this.f10138a.f10137a.f10123e;
                        int i2 = i2;
                        if (str != null) {
                            str2 = str;
                        }
                        cVar.mo8950a(i, i2, str2);
                    }
                    this.f10138a.f10137a.f10123e = -1;
                }
            });
            this.f10137a.f10128j.f10226t.mo8574a("code1:" + i + ",code2:" + i2, exc);
            ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener = this.f10137a.f10119a;
            if (iLiveStreamErrorListener != null) {
                iLiveStreamErrorListener.onError(i, i2, exc);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$e */
    static final class C3684e implements ILiveStream.ILiveStreamInfoListener {

        /* renamed from: a */
        final /* synthetic */ C3678c f10143a;

        static {
            Covode.recordClassIndex(4196);
        }

        C3684e(C3678c cVar) {
            this.f10143a = cVar;
        }

        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener
        public final void onInfo(final int i, final int i2, final int i3) {
            String str;
            this.f10143a.f10126h.post(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.stream.C3678c.C3684e.RunnableC36851 */

                /* renamed from: a */
                final /* synthetic */ C3684e f10144a;

                static {
                    Covode.recordClassIndex(4197);
                }

                {
                    this.f10144a = r1;
                }

                public final void run() {
                    AbstractC3057b bVar;
                    int i = i;
                    if (i == 2) {
                        AbstractC3057b bVar2 = this.f10144a.f10143a.f10122d;
                        if (bVar2 != null) {
                            bVar2.onStreamStart();
                        }
                    } else if (i == 3) {
                        if (this.f10144a.f10143a.f10123e != -1) {
                            this.f10144a.f10143a.mo8950a(this.f10144a.f10143a.f10123e, i2, "");
                            this.f10144a.f10143a.f10123e = -1;
                        }
                    } else if (i == 15) {
                        this.f10144a.f10143a.f10124f = true;
                        AbstractC3057b bVar3 = this.f10144a.f10143a.f10122d;
                        if (bVar3 != null) {
                            bVar3.onReconnect();
                        }
                    } else if (i == 11) {
                        if (this.f10144a.f10143a.f10124f) {
                            this.f10144a.f10143a.f10124f = false;
                            AbstractC3057b bVar4 = this.f10144a.f10143a.f10122d;
                            if (bVar4 != null) {
                                bVar4.onReconnected();
                            }
                        } else {
                            AbstractC3057b bVar5 = this.f10144a.f10143a.f10122d;
                            if (bVar5 != null) {
                                bVar5.connected();
                            }
                        }
                        if (!this.f10144a.f10143a.f10127i) {
                            this.f10144a.f10143a.f10127i = true;
                            AbstractC3057b bVar6 = this.f10144a.f10143a.f10122d;
                            if (bVar6 != null) {
                                bVar6.onFirstRTMPConnect();
                            }
                        }
                        if (System.currentTimeMillis() - this.f10144a.f10143a.f10125g > 5000) {
                            this.f10144a.f10143a.f10125g = System.currentTimeMillis();
                            AbstractC3057b bVar7 = this.f10144a.f10143a.f10122d;
                            if (bVar7 != null) {
                                bVar7.onNetworkLow();
                            }
                        }
                    } else if (i == 13) {
                        if (System.currentTimeMillis() - this.f10144a.f10143a.f10125g > 5000) {
                            this.f10144a.f10143a.f10125g = System.currentTimeMillis();
                            AbstractC3057b bVar8 = this.f10144a.f10143a.f10122d;
                            if (bVar8 != null) {
                                bVar8.onNetworkLow();
                            }
                        }
                    } else if (i == 30) {
                        AbstractC3057b bVar9 = this.f10144a.f10143a.f10122d;
                        if (bVar9 != null) {
                            bVar9.onCaptureFirstFrame();
                        }
                    } else if (i == 101 && (bVar = this.f10144a.f10143a.f10122d) != null) {
                        bVar.onNetworkStatus(i3);
                    }
                }
            });
            AbstractC3665b bVar = this.f10143a.f10128j.f10226t;
            String str2 = "INFO (" + i + ',' + i2 + ',' + i3 + ") ";
            switch (i) {
                case 1:
                    str = str2 + "starting_publish";
                    break;
                case 2:
                    str = str2 + "started_publish";
                    break;
                case 3:
                    str = str2 + "stoped_publish";
                    break;
                case 4:
                    str = str2 + "video_starting_capture";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    str = str2 + "video_started_capture";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    str = str2 + "video_stoped_capture";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    str = str2 + "audio_starting_capture";
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    str = str2 + "audio_started_capture";
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    str = str2 + "audio_stoped_capture";
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    str = str2 + "rtmp_connecting";
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    str = str2 + "rtmp_connected";
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    str = str2 + "rtmp_connect_fail";
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    str = str2 + "network too weak";
                    break;
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    str = str2 + "rtmp_disconnected";
                    break;
                case 15:
                    str = str2 + "rtmp_reconnecting";
                    break;
                case 16:
                    str = str2 + "video_encoder_format_changed";
                    break;
                default:
                    str = str2 + "UNKONW???";
                    break;
            }
            bVar.mo8573a(str);
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.f10143a.f10120b;
            if (iLiveStreamInfoListener != null) {
                iLiveStreamInfoListener.onInfo(i, i2, i3);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a
    /* renamed from: a */
    public final void mo8282a(int i, int i2, int i3, long j) {
        LiveCore liveCore = this.f10121c;
        if (liveCore != null) {
            liveCore.pushVideoFrame(i, false, i2, i3, LiveFeedRefreshTimeSetting.DEFAULT, f10118s, j * 1000);
        }
    }
}
