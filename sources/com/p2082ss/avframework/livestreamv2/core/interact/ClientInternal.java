package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.IInputVideoStream;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory;
import com.p2082ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientInternal */
public class ClientInternal extends ClientExt {
    private final Object clientStartFence = new Object();
    public InteractEngineImpl mInteractEngineImpl;
    private boolean seiCleared = false;

    static {
        Covode.recordClassIndex(100320);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$null$0$ClientInternal() {
        this.mInteractEngineImpl.start(this);
    }

    private void superDispose() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858411 */

            static {
                Covode.recordClassIndex(100324);
            }

            public void run() {
                ClientInternal.super.dispose();
                if (ClientInternal.this.isGuest()) {
                    ClientInternal.this.mInteractEngineImpl.checkReleaseRtcEngine();
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void disableRtcPhoneListener() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585522 */

            static {
                Covode.recordClassIndex(100338);
            }

            public void run() {
                ClientInternal.super.disableRtcPhoneListener();
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void enableRtcPhoneListener() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585421 */

            static {
                Covode.recordClassIndex(100337);
            }

            public void run() {
                ClientInternal.super.enableRtcPhoneListener();
            }
        });
    }

    public void clearSei() {
        this.seiCleared = true;
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null) {
            liveCore.addSeiField("app_data", null, -1);
            liveCore.addSeiField("canvas", null, -1);
            liveCore.addSeiField("source", null, -1);
        }
    }

    private boolean checkAudioCaptureCert() {
        PrivacyCertManager.CertUnit popCert = PrivacyCertManager.getInstance().popCert(1);
        if (popCert == null) {
            return true;
        }
        try {
            popCert.check();
            return true;
        } catch (Exception e) {
            AVLog.logToIODevice(6, "ClientInternal", "Method \"" + popCert.methodName + "\" check audio cert failed.", e);
            return false;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void dispose() {
        AVLog.ioi("ClientInternal", "dispose ".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("dispose", this + " ,TimeStamp:" + System.currentTimeMillis());
        if (this.mInteractEngineImpl.removeClient(this)) {
            superDispose();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void pause() {
        AVLog.ioi("ClientInternal", "pause ".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("pause", this + " ,TimeStamp:" + System.currentTimeMillis());
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584311 */

            static {
                Covode.recordClassIndex(100326);
            }

            public void run() {
                ClientInternal.super.pause();
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void resume() {
        AVLog.ioi("ClientInternal", " resume ".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("resume", this + " ,TimeStamp:" + System.currentTimeMillis());
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584210 */

            static {
                Covode.recordClassIndex(100325);
            }

            public void run() {
                ClientInternal.super.resume();
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r6.seiCleared = false;
        r0 = r6.mInteractEngineImpl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r0.joinChannel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        r6.mLogService.onCallJoinChannel();
        r6.mBuilder.getWorkThreadHandler().post(new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858633(r6));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1078);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        return;
     */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void joinChannel() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.joinChannel():void");
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void startInteract() {
        MethodCollector.m26663i(1241);
        AVLog.ioi("ClientInternal", "startInteract()".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("startInteract", this + " ,TimeStamp:" + System.currentTimeMillis());
        synchronized (this.clientStartFence) {
            try {
                if (!this.clientStarted) {
                    AVLog.iow("ClientInternal", "client not joinChannel before startInteract!");
                    return;
                }
                this.mInteractStatics.setInteractStartTime();
                checkAudioCaptureCert();
                this.mInteractEngineImpl.startInteract(this);
                this.mBuilder.getWorkThreadHandler().post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858665 */

                    static {
                        Covode.recordClassIndex(100349);
                    }

                    public void run() {
                        ClientInternal.super.startInteract();
                    }
                });
                MethodCollector.m26664o(1241);
            } finally {
                MethodCollector.m26664o(1241);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r6.needPublishFrame == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        com.p2082ss.avframework.utils.AVLog.iow("ClientInternal", "client already push data, need not call again");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1213);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        r6.mInteractEngineImpl.startPushData(r6);
        r6.mBuilder.getWorkThreadHandler().post(new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858654(r6));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1213);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        return;
     */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startPushData() {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.startPushData():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r7.mInteractStatics.setInteractStartTime();
        r7.seiCleared = false;
        checkAudioCaptureCert();
        r7.mLogService.onCallJoinChannel();
        r2 = new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858687(r7);
        r3 = new java.lang.StringBuilder("optimize open: ").append(r7.mBuilder.getPushStreamSwitchAfterServerMixStream()).append(" mixStreamType: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0083, code lost:
        if (r7.mBuilder.getMixStreamType() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.SERVER_MIX) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0085, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r3 = r3.append(r0).append(" capture type : ").append(r7.mBuilder.mKeepLiveCoreCapture).append(" isAnchor: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a6, code lost:
        if (r7.mConfig.getCharacter() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a8, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", r3.append(r5).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b9, code lost:
        if (r7.mBuilder.getPushStreamSwitchAfterServerMixStream() == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (r7.mBuilder.getMixStreamType() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.SERVER_MIX) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        if (r7.mBuilder.mKeepLiveCoreCapture == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d3, code lost:
        if (r7.mConfig.getCharacter() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d5, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", "start interact with optimize");
        r7.mBuilder.getWorkThreadHandler().post(new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal$$Lambda$0(r7, r2));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1388);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", "start interact without optimize");
        r7.mInteractEngineImpl.start(r7);
        r7.mBuilder.getWorkThreadHandler().post(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1388);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        return;
     */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.start():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        r8.mInteractStatics.setInteractStopTime();
        checkAudioCaptureCert();
        r3 = new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858698(r8);
        r6 = new java.lang.StringBuilder("optimize open: ").append(r8.mBuilder.getPushStreamSwitchAfterServerMixStream()).append(" mixStreamType: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        if (r8.mBuilder.getMixStreamType() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.SERVER_MIX) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        r2 = r6.append(r0).append(" capture type : ").append(r8.mBuilder.mKeepLiveCoreCapture).append(" isAnchor : ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (r8.mConfig.getCharacter() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", r2.append(r5).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00be, code lost:
        if (r8.mBuilder.getPushStreamSwitchAfterServerMixStream() == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        if (r8.mBuilder.getMixStreamType() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.SERVER_MIX) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ce, code lost:
        if (r8.mBuilder.mKeepLiveCoreCapture == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d8, code lost:
        if (r8.mConfig.getCharacter() != com.p2082ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", "stop interact with optimize");
        r8.mInteractEngineImpl.stop(r8, r8.mConfig, new com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858709(r8));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f3, code lost:
        com.p2082ss.avframework.utils.AVLog.iod("ClientInternal", "stop interact without optimize");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0105, code lost:
        if (r8.mBuilder.getWorkThreadHandler().post(r3) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        com.p2082ss.avframework.utils.AVLog.logKibana(6, "ClientInternal", "post stopInteract to work thread failed, memory leak!", null);
        com.p2082ss.avframework.utils.AVLog.ioe("ClientInternal", "post stopInteract to work thread failed, memory leak!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0114, code lost:
        r8.mInteractEngineImpl.stop(r8, r8.mConfig, null);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        return;
     */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.stop():void");
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt
    public void onUserJoined(String str) {
        super.onUserJoined(str);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt
    public void onUserLeaved(String str) {
        super.onUserLeaved(str);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void enableAllRemoteRender(boolean z) {
        enableAllRemoteRender(z, true);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteAllRemoteAudioStreams(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8586027 */

            static {
                Covode.recordClassIndex(100343);
            }

            public void run() {
                ClientInternal.super.muteAllRemoteAudioStreams(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteAllRemoteVideoStreams(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8586128 */

            static {
                Covode.recordClassIndex(100344);
            }

            public void run() {
                ClientInternal.super.muteAllRemoteVideoStreams(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteLocalAudio(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584917 */

            static {
                Covode.recordClassIndex(100332);
            }

            public void run() {
                ClientInternal.super.muteLocalAudio(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void setAudioScenario(final int i) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584614 */

            static {
                Covode.recordClassIndex(100329);
            }

            public void run() {
                ClientInternal.super.setAudioScenario(i);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void switchAudio(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584715 */

            static {
                Covode.recordClassIndex(100330);
            }

            public void run() {
                ClientInternal.super.switchAudio(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void switchInteractMode(final Config.InteractMode interactMode) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585926 */

            static {
                Covode.recordClassIndex(100342);
            }

            public void run() {
                ClientInternal.this.mConfig.setInteractMode(interactMode);
                if (ClientInternal.this.mInteractEngineImpl.needChangeInteractModeWhenSwitchMode()) {
                    ClientInternal.super.switchMixType(!ClientInternal.this.mInteractEngineImpl.checkVendorClientMixPercentage());
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void switchMixType(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585018 */

            static {
                Covode.recordClassIndex(100333);
            }

            public void run() {
                ClientInternal.super.switchMixType(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void updateRtcExtInfo(final String str) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585724 */

            static {
                Covode.recordClassIndex(100340);
            }

            public void run() {
                ClientInternal.super.updateRtcExtInfo(str);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void updateSdkParams(final String str) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585825 */

            static {
                Covode.recordClassIndex(100341);
            }

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("PushBase");
                    if (!jSONObject.isNull("mixOnClient") && ClientInternal.this.mInteractEngineImpl != null) {
                        ClientInternal.this.mInteractEngineImpl.setMixOnClientParams(jSONObject.getJSONObject("mixOnClient"));
                    }
                } catch (JSONException unused) {
                }
                ClientInternal.super.updateSdkParams(str);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$start$1$ClientInternal(Runnable runnable) {
        this.mTaskOnStreamPublished = new PrivacyCertManager.RunnableWithCert(new ClientInternal$$Lambda$2(this), new int[]{1});
        runnable.run();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteLocalVideo(final boolean z) {
        this.mMuteLocalVideoStreamStat = z;
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584816 */

            static {
                Covode.recordClassIndex(100331);
            }

            public void run() {
                ClientInternal.super.muteLocalVideo(z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public long sendRoomMessage(final String str) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8586430 */

            static {
                Covode.recordClassIndex(100347);
            }

            public void run() {
                ClientInternal.super.sendRoomMessage(str);
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void start(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "ClientInternal.start");
        start();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void startInteract(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "ClientInternal.startInteract");
        startInteract();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void stop(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "ClientInternal.stop");
        stop();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void setOnlyConsumeAllRemoteSei(final boolean z) {
        AVLog.ioi("ClientInternal", "setOnlyConsumeAllRemoteSei ".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("setOnlyConsumeAllRemoteSei", this + "onlyConsumeSei" + z);
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584513 */

            static {
                Covode.recordClassIndex(100328);
            }

            public void run() {
                ClientInternal.super.setOnlyConsumeAllRemoteSei(z);
            }
        });
    }

    private void composeSei(String str) {
        String str2;
        try {
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore != null) {
                if (this.seiCleared) {
                    AVLog.ioe("ClientInternal", "Interact sei already cleared, don't add again!");
                    return;
                }
                if (this.mConfig.getUpdateTalkSeiAB()) {
                    if (str != null) {
                        str2 = str;
                    } else {
                        str2 = "";
                    }
                    liveCore.addSeiField("app_data", str2, 1, false, false);
                    liveCore.addSeiField("ts", Long.valueOf(System.currentTimeMillis()), 1, false, true);
                }
                if (this.mConfig.getMixStreamConfig() != null) {
                    liveCore.addSeiField("canvas", new JSONObject().put("w", this.mConfig.getMixStreamConfig().getVideoWidth()).put("h", this.mConfig.getMixStreamConfig().getVideoHeight()).put("bgnd", this.mConfig.getMixStreamConfig().getBackgroundColorString()), -1);
                }
                if (str == null) {
                    str = "";
                }
                liveCore.addSeiField("app_data", str, -1);
                liveCore.addSeiField("source", "LiveCore_Android_MixStream_" + this.mRtcEngine.getRtcExtInfo().vendorName, -1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteRemoteAudioStream(final String str, final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585119 */

            static {
                Covode.recordClassIndex(100334);
            }

            public void run() {
                ClientInternal.super.muteRemoteAudioStream(str, z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void muteRemoteVideoStream(final String str, final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585320 */

            static {
                Covode.recordClassIndex(100336);
            }

            public void run() {
                ClientInternal.super.muteRemoteVideoStream(str, z);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt
    public void onLogMonitor(final String str, final JSONObject jSONObject) {
        this.mBuilder.getLogUploadThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858522 */

            static {
                Covode.recordClassIndex(100335);
            }

            public void run() {
                LiveCore.Builder.ILogMonitor iLogMonitor;
                InteractEngineImpl interactEngineImpl = ClientInternal.this.mInteractEngineImpl;
                if (interactEngineImpl != null && (iLogMonitor = interactEngineImpl.mLogMonitor) != null) {
                    iLogMonitor.onLogMonitor(str, jSONObject);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void setRemoteAudioPlaybackVolume(final String str, final float f) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8585623 */

            static {
                Covode.recordClassIndex(100339);
            }

            public void run() {
                ClientInternal.super.setRemoteAudioPlaybackVolume(str, f);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public long sendUserMessage(final String str, final String str2) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8586229 */

            static {
                Covode.recordClassIndex(100345);
            }

            public void run() {
                ClientInternal.super.sendUserMessage(str, str2);
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void enableAllRemoteRender(final boolean z, final boolean z2) {
        AVLog.ioi("ClientInternal", "enableAllRemoteRender, canRender: " + z + ", enableAllSubscribeRemoteVideo: " + z2 + this);
        this.mLogService.onEngineAPICall("enableAllRemoteRender", "canRender: " + z + " , enableAllSubscribeRemoteVideo: " + z2 + this + " ,TimeStamp:" + System.currentTimeMillis());
        if (this.mBuilder != null) {
            this.mBuilder.getWorkThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC858676 */

                static {
                    Covode.recordClassIndex(100350);
                }

                public void run() {
                    ClientInternal.super.enableAllRemoteRender(z, z2);
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt, com.p2082ss.avframework.livestreamv2.core.Client
    public void setOnlyConsumeRemoteSei(final String str, final boolean z) {
        AVLog.ioi("ClientInternal", "setOnlyConsumeRemoteSei ".concat(String.valueOf(this)));
        this.mLogService.onEngineAPICall("setOnlyConsumeRemoteSei", this + " ,interactId:" + str + ",onlyConsumeSei" + z);
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientInternal.RunnableC8584412 */

            static {
                Covode.recordClassIndex(100327);
            }

            public void run() {
                ClientInternal.super.setOnlyConsumeRemoteSei(str, z);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.interact.ClientExt
    /* renamed from: mixStream */
    public void lambda$mixStream$2$ClientInternal(List<Region> list, String str, boolean z) {
        boolean z2;
        VideoMixer.VideoMixerDescription mixerDescription;
        super.mixStream(list, str, z);
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (!(this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && liveCore != null)) {
            return;
        }
        if (Thread.currentThread() != this.mBuilder.getWorkThreadHandler().getLooper().getThread()) {
            this.mBuilder.getWorkThreadHandler().post(new ClientInternal$$Lambda$1(this, list, str, z));
        } else if (!this.mConfig.checkInvalidateSei() || (!this.stopped && !this.disposed)) {
            AVLog.debugTrace(list, str);
            composeSei(str);
            if (z) {
                InteractEngineImpl interactEngineImpl = this.mInteractEngineImpl;
                if (interactEngineImpl != null) {
                    interactEngineImpl.onRegionChanged(list.size());
                }
                IInputVideoStream iInputVideoStream = null;
                boolean z3 = false;
                for (Region region : list) {
                    if (region.getInteractId().equals(this.mSelfInteractId)) {
                        iInputVideoStream = liveCore.getOriginInputVideoStream();
                        z3 = true;
                        z2 = true;
                    } else {
                        InteractVideoSink videoSink = ((InteractVideoSinkFactory) this.mVideoSinkFactory).getVideoSink(region.getInteractId());
                        if (videoSink != null) {
                            iInputVideoStream = videoSink.getOutVideoStream();
                        }
                        z2 = false;
                    }
                    if (!(iInputVideoStream == null || (mixerDescription = iInputVideoStream.getMixerDescription()) == null)) {
                        mixerDescription.left = (float) region.getX();
                        mixerDescription.top = (float) region.getY();
                        mixerDescription.right = mixerDescription.left + ((float) region.getWidth());
                        mixerDescription.bottom = mixerDescription.top + ((float) region.getHeight());
                        mixerDescription.zOrder = region.getZorder();
                        mixerDescription.setMode(2);
                        mixerDescription.setVisibility(!region.isMuteVideo());
                        iInputVideoStream.setMixerDescription(mixerDescription);
                        if (z2) {
                            this.mSelfVideoMixerDescription = mixerDescription;
                        }
                    }
                }
                if (!z3) {
                    AVLog.ioe("ClientInternal", "Didn't find my region.");
                }
                this.mLogService.onRtcUpdateLayout(convertMixStreamLayout(list));
            }
        } else {
            AVLog.ioe("ClientInternal", "don't need invalidateSei after stopped");
        }
    }

    public ClientInternal(LiveRTCEngine liveRTCEngine, LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, VideoSinkFactory videoSinkFactory, AudioClientFactory audioClientFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine) {
        super(liveRTCEngine, interactConfig, videoClientFactory, videoSinkFactory, audioClientFactory, audioSinkFactory, interactEngine);
        this.mInteractEngineImpl = (InteractEngineImpl) interactEngine;
    }
}
