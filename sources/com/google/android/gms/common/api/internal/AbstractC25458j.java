package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.j */
public interface AbstractC25458j {
    static {
        Covode.recordClassIndex(30857);
    }

    /* renamed from: a */
    Activity mo41669a();

    /* renamed from: a */
    <T extends LifecycleCallback> T mo41670a(String str, Class<T> cls);

    /* renamed from: a */
    void mo41671a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
