package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.ae */
public final class C1181ae {
    static {
        Covode.recordClassIndex(1288);
    }

    /* renamed from: a */
    public static C1175ad m3880a(ActivityC0945e eVar) {
        return m3881a(eVar, (C1175ad.AbstractC1177b) null);
    }

    /* renamed from: a */
    private static Application m3878a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: a */
    public static C1175ad m3881a(ActivityC0945e eVar, C1175ad.AbstractC1177b bVar) {
        Application a = m3878a((Activity) eVar);
        if (bVar == null) {
            bVar = C1175ad.C1176a.m3873a(a);
        }
        return new C1175ad(eVar.getViewModelStore(), bVar);
    }

    /* renamed from: a */
    public static C1175ad m3879a(Fragment fragment, C1175ad.AbstractC1177b bVar) {
        ActivityC0945e activity = fragment.getActivity();
        if (activity != null) {
            Application a = m3878a((Activity) activity);
            if (bVar == null) {
                bVar = C1175ad.C1176a.m3873a(a);
            }
            return new C1175ad(fragment.getViewModelStore(), bVar);
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
