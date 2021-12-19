package com.bytedance.push.third;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.push.third.b */
public interface AbstractC21918b {
    static {
        Covode.recordClassIndex(25583);
    }

    boolean checkThirdPushConfig(String str, Context context);

    boolean isPushAvailable(Context context, int i);

    void registerPush(Context context, int i);

    void setAlias(Context context, String str, int i);

    void trackPush(Context context, int i, Object obj);

    void unregisterPush(Context context, int i);
}
