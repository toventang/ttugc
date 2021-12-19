package com.bytedance.android.p149d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.d.b */
public interface AbstractC2717b {

    /* renamed from: com.bytedance.android.d.b$a */
    public interface AbstractC2718a {
        static {
            Covode.recordClassIndex(3108);
        }

        /* renamed from: a */
        void mo7277a(int i, int i2);

        /* renamed from: a */
        void mo7278a(int i, String str);

        /* renamed from: a */
        void mo7279a(Exception exc);

        /* renamed from: a */
        void mo7280a(Object obj);

        /* renamed from: a */
        void mo7281a(String str);

        /* renamed from: k */
        void mo7282k();

        /* renamed from: l */
        void mo7283l();

        /* renamed from: m */
        void mo7284m();

        /* renamed from: n */
        void mo7285n();

        /* renamed from: o */
        void mo7286o();
    }

    static {
        Covode.recordClassIndex(3107);
    }

    void changeSRSupportScene(boolean z);

    long getAudioLostFocusTime();

    int getDecodeStatus();

    AbstractC2721d getLogger();

    String getMediaErrorMessage();

    long getStartTime();

    void getVideoSize(int[] iArr);

    boolean isVideoHorizontal();

    void onBackground();

    void onForeground();

    boolean pipResumePlay();

    void recycle();

    void setAnchorInteractMode(boolean z);

    void setEnterRoomScene(String str);

    void setMute(boolean z);

    void setReusePlayer(boolean z, String str);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    boolean start();

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    void stopWhenJoinInteract(Context context);

    void stopWhenPlayingOther(Context context);

    void switchResolution(String str);

    boolean tryResumePlay();

    void tryToStartAudioDevice();

    void tryToUploadFirstScreenTime();
}
