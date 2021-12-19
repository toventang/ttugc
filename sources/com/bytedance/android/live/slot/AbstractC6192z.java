package com.bytedance.android.live.slot;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.slot.z */
public interface AbstractC6192z {
    static {
        Covode.recordClassIndex(6898);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    void onCreate();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    void onDestroy();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    void onPause();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    void onResume();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    void onStart();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    void onStop();
}
