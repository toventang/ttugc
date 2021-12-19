package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.powerpage.b */
public interface AbstractC17736b {
    static {
        Covode.recordClassIndex(20298);
    }

    void onActivityResult_Activity(int i, int i2, Intent intent);

    void onBackPressed_Activity();

    void onBeforeActivityCreated(Activity activity);

    void onNewIntent(Intent intent);
}
