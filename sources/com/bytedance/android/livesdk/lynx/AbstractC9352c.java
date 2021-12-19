package com.bytedance.android.livesdk.lynx;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.lynx.c */
public interface AbstractC9352c extends AbstractC2953a {
    static {
        Covode.recordClassIndex(10857);
    }

    AbstractC9341b create(Activity activity, Integer num, String str, AbstractC9353d dVar, String str2);

    AbstractC9341b createAndLoad(Activity activity, String str, Integer num, String str2, String str3, AbstractC9353d dVar);

    Fragment createLynxFragment(Context context, Bundle bundle);

    void tryInitEnvIfNeeded();
}
