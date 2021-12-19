package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ILocalSettings {
    static {
        Covode.recordClassIndex(25539);
    }

    void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar);

    void unregisterValChanged(AbstractC21887a aVar);
}
