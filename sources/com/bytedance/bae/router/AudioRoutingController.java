package com.bytedance.bae.router;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.router.controller.EventDispatcher;
import com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager;
import com.bytedance.bae.router.device.EarpieceDeviceManager;
import com.bytedance.bae.router.device.SpeakerphoneDeviceManager;
import com.bytedance.bae.router.device.WiredHeadsetDeviceManager;
import com.bytedance.bae.webrtc.WebRtcAudioUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class AudioRoutingController extends BaseAudioRoutingController {
    private BluetoothHeadsetScoDeviceManager mBTScoDeviceManager;
    private WeakReference<Context> mContext = new WeakReference<>(ContextUtils.getApplicationContext());
    private EarpieceDeviceManager mEarpieceDeviceManager;
    public EventHandler mEventHandler;
    private int mLastAudioRouting = -1;
    private long mNativeByteRtcEngine;
    public EventDispatcher mRoutingControl;
    private SpeakerphoneDeviceManager mSpeakerphoneDeviceManager;
    private WiredHeadsetDeviceManager mWiredHeadsetDeviceManager;

    static {
        Covode.recordClassIndex(15031);
    }

    /* renamed from: com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m23642xb0cc5bec(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m23643xb0cc5bfe(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public String getAudioRouteDesc(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "HeadsetBluetooth" : "Speakerphone" : "Earpiece" : "Headset" : "Default";
    }

    public int GetCurrentRouting() {
        return queryCurrentAudioRouting();
    }

    public void startMonitoring() {
        this.mRoutingControl.changeRouteState(1);
    }

    public void stopMonitoring() {
        this.mRoutingControl.changeRouteState(2);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isBTHeadsetPlugged() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            return bluetoothHeadsetScoDeviceManager.isDevicePlugged();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isWiredHeadsetPlugged() {
        WiredHeadsetDeviceManager wiredHeadsetDeviceManager = this.mWiredHeadsetDeviceManager;
        if (wiredHeadsetDeviceManager != null) {
            return wiredHeadsetDeviceManager.isActive();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) m23641x1101848f(context, DataType.AUDIO);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void stopBtSco() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            bluetoothHeadsetScoDeviceManager.inactiveDevice();
            this.mBTScoDeviceManager.resetScoConnectionAttempts();
            this.mBTScoDeviceManager.cancelBluetoothSCOConnTimer();
        }
    }

    public void uninitialize() {
        BaeLogging.m23630w("AudioRoutingController", "uninitialize");
        this.mWiredHeadsetDeviceManager.destory();
        this.mBTScoDeviceManager.destory();
        this.mLastAudioRouting = -1;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int queryCurrentAudioRouting() {
        if (this.mSpeakerphoneDeviceManager.isActive()) {
            return 3;
        }
        if (this.mBTScoDeviceManager.isActive() || this.mBTScoDeviceManager.isDevicePlugged()) {
            return 4;
        }
        if (this.mWiredHeadsetDeviceManager.isActive()) {
            return 1;
        }
        if (this.mEarpieceDeviceManager.isActive()) {
            return 2;
        }
        return 0;
    }

    public String GetSessionInfo() {
        AudioManager audioManager = getAudioManager();
        return "{ Audio State: audio_mode:" + WebRtcAudioUtils.modeToString(audioManager.getMode()) + ", has_mic:" + WebRtcAudioUtils.hasMicrophone() + ", mic_muted:" + audioManager.isMicrophoneMute() + ", music_active:" + audioManager.isMusicActive() + ", speakerphone:" + audioManager.isSpeakerphoneOn() + ", headset:" + audioManager.isWiredHeadsetOn() + ", bt_sco:" + audioManager.isBluetoothScoOn() + ", music_actived:" + audioManager.isMusicActive() + ", permission:" + WebRtcAudioUtils.isPermissionGranted() + " }";
    }

    public int initialize() {
        m23643xb0cc5bfe("AudioRoutingController", "initialize begin");
        Context context = this.mContext.get();
        if (context == null) {
            m23642xb0cc5bec("AudioRoutingController", "context has been GCed");
            return -1;
        } else if (getAudioManager() == null) {
            m23642xb0cc5bec("AudioRoutingController", "invalid context: can't get AudioManager");
            return -1;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mEventHandler = new EventHandler(myLooper);
                m23643xb0cc5bfe("AudioRoutingController", "looper of mEventHandler is Looper.myLooper");
            } else {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    this.mEventHandler = new EventHandler(mainLooper);
                    m23643xb0cc5bfe("AudioRoutingController", "looper of mEventHandler is Looper.getMainLooper");
                } else {
                    this.mEventHandler = null;
                    m23643xb0cc5bfe("AudioRoutingController", "mEventHandler is null");
                }
            }
            this.mRoutingControl = new EventDispatcher(this);
            this.mSpeakerphoneDeviceManager = new SpeakerphoneDeviceManager(context, new AudioRoutingController$$Lambda$0(this));
            this.mEarpieceDeviceManager = new EarpieceDeviceManager(context, new AudioRoutingController$$Lambda$1(this));
            this.mWiredHeadsetDeviceManager = new WiredHeadsetDeviceManager(context, new WiredHeadsetDeviceManager.OnDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.C131411 */

                static {
                    Covode.recordClassIndex(15034);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    AudioRoutingController.this.sendEvent(1, 0);
                }

                @Override // com.bytedance.bae.router.device.WiredHeadsetDeviceManager.OnDeviceCallback
                public void reportHeadsetType(int i) {
                    if (i == 0 || i == 1 || i == 2) {
                        AudioRoutingController.this.sendEvent(1, 1);
                    }
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    BaeLogging.m23630w("AudioRoutingController", "WiredHeadset error:" + i + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            this.mBTScoDeviceManager = new BluetoothHeadsetScoDeviceManager(context, this.mEventHandler, new BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.C131422 */

                static {
                    Covode.recordClassIndex(15035);
                }

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoConnected() {
                    BaeLogging.m23630w("AudioRoutingController", "BTHeadset w/o mic connected");
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    BaeLogging.m23630w("AudioRoutingController", "BTHeadset disconnected");
                    AudioRoutingController.this.sendEvent(2, 0);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                    BaeLogging.m23630w("AudioRoutingController", "BTHeadset Device connected");
                    AudioRoutingController.this.sendEvent(2, 1);
                }

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoDisconnected() {
                    BaeLogging.m23630w("AudioRoutingController", "BTHeadset w/o mic disconnected and post recovery task in 4s");
                    AudioRoutingController.this.mEventHandler.postDelayed(new Runnable() {
                        /* class com.bytedance.bae.router.AudioRoutingController.C131422.RunnableC131431 */

                        static {
                            Covode.recordClassIndex(15036);
                        }

                        public void run() {
                            AudioRoutingController.this.sendEvent(2, 0);
                        }
                    }, 4000);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    BaeLogging.m23630w("AudioRoutingController", "BTHeadset error:" + i + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            m23643xb0cc5bfe("AudioRoutingController", "initialize end");
            return 0;
        }
    }

    private static AudioRoutingController create(long j) {
        return new AudioRoutingController(j);
    }

    /* access modifiers changed from: package-private */
    public class EventHandler extends Handler {
        static {
            Covode.recordClassIndex(15037);
        }

        public void handleMessage(Message message) {
            AudioRoutingController.this.mRoutingControl.onEvent(message.what, message.arg1);
        }

        EventHandler(Looper looper) {
            super(looper);
        }
    }

    public AudioRoutingController(long j) {
        this.mNativeByteRtcEngine = j;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void setAudioRouting(int i) {
        BaeLogging.m23630w("AudioRoutingController", "set audio output routing from " + getAudioRouteDesc(queryCurrentAudioRouting()) + " to " + getAudioRouteDesc(i) + " mLastAudioRouting:" + getAudioRouteDesc(this.mLastAudioRouting));
        if (4 == i) {
            try {
                updateBluetoothSco(i);
            } catch (Exception e) {
                BaeLogging.m23626e("AudioRoutingController", "set audio routing error : " + e.toString());
            }
        } else {
            updateBluetoothSco(i);
            if (1 == i) {
                this.mWiredHeadsetDeviceManager.activeDevice();
            } else if (3 == i) {
                this.mSpeakerphoneDeviceManager.activeDevice();
            } else {
                this.mEarpieceDeviceManager.activeDevice();
            }
        }
        int i2 = this.mLastAudioRouting;
        this.mLastAudioRouting = i;
        if (i != i2) {
            notifyAudioRoutingChanged(i, i2, "setAudioRouting");
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int updateBluetoothSco(int i) {
        BaeLogging.m23630w("AudioRoutingController", "updateBluetoothSco sco targetRouting:" + getAudioRouteDesc(i) + " scoEnabled:" + getRoutingInfo().getBTScoEnabled());
        if (i != 4) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (!getRoutingInfo().getBTScoEnabled()) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (1 == this.mBTScoDeviceManager.getActiveState()) {
            return 0;
        } else {
            this.mBTScoDeviceManager.activeDevice();
            return 0;
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void resetAudioRouting(boolean z) {
        int i = 1;
        if (getRoutingInfo().getForceSpeakerphone() != 1 || !z) {
            if (this.mBTScoDeviceManager.isDevicePlugged()) {
                i = 4;
            } else if (!this.mWiredHeadsetDeviceManager.isDevicePlugged()) {
                if (getRoutingInfo().getForceSpeakerphone() == 0) {
                    i = 2;
                } else {
                    i = getRoutingInfo().getDefaultRouting();
                }
            }
            BaeLogging.m23630w("AudioRoutingController", "reset audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (queryCurrentAudioRouting() != i || this.mLastAudioRouting != i || i == 4) {
                setAudioRouting(i);
                return;
            }
            return;
        }
        BaeLogging.m23630w("AudioRoutingController", "reset(force) audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (queryCurrentAudioRouting() != 3) {
            setAudioRouting(3);
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void notifyAudioRoutingChanged(int i, String str) {
        notifyAudioRoutingChanged(i, this.mLastAudioRouting, str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initialize$0$AudioRoutingController(int i, String str) {
        BaeLogging.m23630w("AudioRoutingController", "SpeakerphoneDevice error:" + i + " msg:" + str);
        resetAudioRouting(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initialize$1$AudioRoutingController(int i, String str) {
        BaeLogging.m23630w("AudioRoutingController", "EarpieceDevice error:" + i + " msg:" + str);
        resetAudioRouting(true);
    }

    public void sendEvent(int i, int i2) {
        BaeLogging.m23630w("AudioRoutingController", "sendEvent: [" + i + "], extra arg: " + i2 + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, 0));
        }
    }

    /* renamed from: com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m23641x1101848f(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2281);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2281);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void notifyAudioRoutingChanged(int i, int i2, String str) {
        MethodCollector.m26663i(2386);
        ByteAudioRouterNativeFunctions.nativeOnAudioRoutingChanged(this.mNativeByteRtcEngine, i, i2, str);
        MethodCollector.m26664o(2386);
    }
}
