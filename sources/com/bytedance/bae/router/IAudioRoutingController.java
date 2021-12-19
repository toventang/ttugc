package com.bytedance.bae.router;

import android.media.AudioManager;
import com.bytedance.covode.number.Covode;

public interface IAudioRoutingController {
    static {
        Covode.recordClassIndex(15042);
    }

    AudioManager getAudioManager();

    String getAudioRouteDesc(int i);

    RoutingInfo getRoutingInfo();

    boolean isBTHeadsetPlugged();

    boolean isWiredHeadsetPlugged();

    void notifyAudioRoutingChanged(int i, String str);

    int queryCurrentAudioRouting();

    void resetAudioRouting(boolean z);

    void setAudioRouting(int i);

    void stopBtSco();

    int updateBluetoothSco(int i);
}
