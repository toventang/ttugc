package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.d */
public final class C33946d {
    static {
        Covode.recordClassIndex(40871);
    }

    /* renamed from: a */
    public static Activity m69512a(Fragment fragment) {
        ActivityC0945e activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    public static Application m69513a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: a */
    public static C1175ad m69514a(Fragment fragment, AbstractC1183ag agVar) {
        return new C1175ad(agVar.getViewModelStore(), C1175ad.C1176a.m3873a(m69513a(m69512a(fragment))));
    }

    /* renamed from: a */
    public static C1175ad m69515a(ActivityC0945e eVar, AbstractC1183ag agVar, C1175ad.AbstractC1177b bVar) {
        m69513a(eVar);
        return new C1175ad(agVar.getViewModelStore(), bVar);
    }
}
