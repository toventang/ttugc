package com.bytedance.scene;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.s */
public final class C22267s {
    static {
        Covode.recordClassIndex(26079);
    }

    /* renamed from: a */
    public static C1175ad m41933a(AbstractC22219j jVar) {
        Activity activity = jVar.f52549m;
        if (activity != null) {
            Application application = activity.getApplication();
            if (application != null) {
                return new C1175ad(jVar.getViewModelStore(), C1175ad.C1176a.m3873a(application));
            }
            throw new IllegalStateException("Your activity is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for removed scene");
    }

    /* renamed from: a */
    public static C1175ad m41934a(AbstractC22219j jVar, C1175ad.AbstractC1177b bVar) {
        return new C1175ad(jVar.getViewModelStore(), bVar);
    }
}
