package com.bytedance.android.livesdkapi;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdkapi.a */
public abstract class AbstractBinderC11605a extends Binder {

    /* renamed from: com.bytedance.android.livesdkapi.a$a */
    public interface AbstractC11606a {
        static {
            Covode.recordClassIndex(13273);
        }

        /* renamed from: a */
        void mo8469a();
    }

    static {
        Covode.recordClassIndex(13272);
    }

    public abstract void bindService(Service service);

    public abstract boolean isLiveFinished();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate();

    public abstract void onDestroy();

    public void setData(Intent intent, boolean z, DataChannel dataChannel) {
    }

    public abstract void setLiveStatusListener(AbstractC11606a aVar);

    public abstract void startAudio();

    public abstract void startBgActivity();

    public abstract boolean startStream(boolean z, PrivacyCert privacyCert);

    public abstract void stopAudio();

    public abstract void stopService();

    public abstract void stopStream(int i, PrivacyCert privacyCert);

    public abstract void unBindService(Service service);
}
