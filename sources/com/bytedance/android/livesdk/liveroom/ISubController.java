package com.bytedance.android.livesdk.liveroom;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;

public interface ISubController extends AbstractC1203l {
    static {
        Covode.recordClassIndex(10238);
    }

    void init();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    void onCreate();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    void onDestory();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    void onResume();
}
