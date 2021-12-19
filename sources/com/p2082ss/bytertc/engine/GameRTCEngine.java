package com.p2082ss.bytertc.engine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.data.AudioFormat;
import com.p2082ss.bytertc.engine.game.GameRTCEngineConfig;
import com.p2082ss.bytertc.engine.game.GameRTCPositionInfo;
import com.p2082ss.bytertc.engine.game.GameRTCReceiveRange;
import com.p2082ss.bytertc.engine.game.GameRTCRoomConfig;
import com.p2082ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.p2082ss.bytertc.engine.utils.AudioFrame;
import com.p2082ss.bytertc.engine.utils.LogUtil;

/* renamed from: com.ss.bytertc.engine.GameRTCEngine */
public abstract class GameRTCEngine {
    private static GameRTCEngineImpl mInstance;
    protected static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public abstract void DisableExternalAudioDevice();

    public abstract void EnableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2);

    public abstract int enableAudioReceive(String str, String str2, boolean z);

    public abstract int enableAudioSend(String str, boolean z);

    public abstract int enableMicrophone(String str, boolean z);

    public abstract int enableSpeakerphone(String str, boolean z);

    public abstract int joinRoom(String str, String str2, String str3, GameRTCRoomConfig gameRTCRoomConfig);

    public abstract int leaveRoom(String str);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int setPlaybackVolume(int i);

    public abstract int setRecordingVolume(int i);

    public abstract int setRemoteAudioPlaybackVolume(String str, String str2, int i);

    public abstract int updatePosition(String str, GameRTCPositionInfo gameRTCPositionInfo);

    public abstract int updateReceiveRange(String str, GameRTCReceiveRange gameRTCReceiveRange);

    public abstract int updateToken(String str, String str2);

    public static String getSdkVersion() {
        return GameRTCEngineImpl.getSDKVersion();
    }

    static {
        Covode.recordClassIndex(100879);
    }

    public static synchronized void destroy() {
        synchronized (GameRTCEngine.class) {
            GameRTCEngineImpl gameRTCEngineImpl = mInstance;
            if (gameRTCEngineImpl != null) {
                gameRTCEngineImpl.doDestroy();
                mInstance = null;
                System.gc();
            }
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.m147888i("GameRTCEngine", "set rtc native library loader".concat(String.valueOf(rTCNativeLibraryLoader)));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized GameRTCEngine create(Context context, GameRTCEngineConfig gameRTCEngineConfig, IGameRTCEventHandler iGameRTCEventHandler, String str) {
        GameRTCEngineImpl gameRTCEngineImpl;
        synchronized (GameRTCEngine.class) {
            if (mInstance == null) {
                try {
                    mInstance = new GameRTCEngineImpl(context, gameRTCEngineConfig, iGameRTCEventHandler, str);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            gameRTCEngineImpl = mInstance;
        }
        return gameRTCEngineImpl;
    }
}
