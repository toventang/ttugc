package com.bytedance.bdturing;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.h */
public final class C13286h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    Activity f32488a;

    /* renamed from: b */
    private int f32489b = 1;

    static {
        Covode.recordClassIndex(15248);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    C13286h(Activity activity) {
        this.f32488a = activity;
    }

    public final void onActivityResumed(Activity activity) {
        if (activity == this.f32488a) {
            this.f32489b++;
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f32488a) {
            int i = this.f32489b - 1;
            this.f32489b = i;
            if (i == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("key", "background");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C13270e.m23849a("turing_verify_sdk", jSONObject);
            }
        }
    }
}
