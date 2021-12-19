package com.p2082ss.avframework.livestreamv2.core;

import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.game.MessageBox;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine */
public interface IGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GameEventListener */
    public interface GameEventListener {
        static {
            Covode.recordClassIndex(100204);
        }

        void onGameFirstRemoteFrameAvailable();
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GameLoadCallback */
    public interface GameLoadCallback extends GamePreloadCallback {
        static {
            Covode.recordClassIndex(100205);
        }

        void onError(String str, Throwable th);

        void onSuccess(String str, IGameClient iGameClient);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GamePreloadCallback */
    public interface GamePreloadCallback {

        /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GamePreloadCallback$GamePreloadTask */
        public interface GamePreloadTask {
            static {
                Covode.recordClassIndex(100207);
            }

            boolean cancel();

            String getGameId();
        }

        static {
            Covode.recordClassIndex(100206);
        }

        void onDownloadCancel(String str);

        void onDownloadError(String str, String str2, Throwable th);

        void onDownloadStart(String str, GamePreloadTask gamePreloadTask);

        void onDownloadSuccess(String str);

        void onDownloadingProgress(String str, int i);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$IGameClient */
    public interface IGameClient {

        /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$IGameClient$Listener */
        public interface Listener {
            static {
                Covode.recordClassIndex(100209);
            }

            void onGameSetMessageHandler(boolean z);

            void onReceiveGameClientMessage(MessageBox messageBox);
        }

        static {
            Covode.recordClassIndex(100208);
        }

        void destroy();

        void pause();

        boolean postMessage(MessageBox messageBox);

        void resume();

        void setListener(Listener listener);
    }

    static {
        Covode.recordClassIndex(100203);
    }

    void clearGameResource(String str);

    void disableCameraWhenPublishGame(boolean z);

    void enablePublish(boolean z);

    String getAudioLayerName();

    GameParameter getPublishParameter();

    float getRenderFps();

    TEBundle getRtcParameter();

    String getVideoLayerName();

    void initGameEngine();

    boolean isEnablePublish();

    boolean isEnableRender();

    boolean isGamePackageDownloaded(String str);

    boolean onActivityResult(String str, int i, int i2, Intent intent);

    boolean onBackPressed(String str);

    void onMemoryWarning(String str, int i);

    void onRequestPermissionsResult(String str, int i, String[] strArr, int[] iArr);

    void preload(String str, GamePreloadCallback gamePreloadCallback);

    void setDisplay(View view);

    void setEnableRender(boolean z);

    void setGameEventListener(GameEventListener gameEventListener);

    void setPublishParameter(GameParameter gameParameter);

    void setPublishStreamWithGameResolution(boolean z);

    void setRtcParameter(TEBundle tEBundle);

    void setUseCameraMainGameMode(boolean z);

    void startGame(String str, GameLoadCallback gameLoadCallback, GameLauncherParameter gameLauncherParameter);

    void updateCameraPosition(float f, float f2, float f3, float f4, boolean z);
}
