package com.bytedance.android.livesdk.drawerfeed;

import android.app.Activity;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.livesdk.AbstractC10135q;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.drawerfeed.f */
public final class C8422f {

    /* renamed from: a */
    private static List<DrawerLayout.AbstractC0843c> f20837a;

    static {
        Covode.recordClassIndex(9267);
    }

    /* renamed from: a */
    public static void m16638a(Activity activity, boolean z) {
        if (activity != null && (activity instanceof AbstractC10135q)) {
            AbstractC10135q qVar = (AbstractC10135q) activity;
            if (qVar.mo16975a() != null && !activity.isFinishing()) {
                qVar.mo16975a().mo14738a(z, true);
            }
        }
    }

    /* renamed from: a */
    public static void m16636a(Activity activity, Boolean bool) {
        if (activity != null && (activity instanceof AbstractC10135q)) {
            AbstractC10135q qVar = (AbstractC10135q) activity;
            if (qVar.mo16975a() != null && !activity.isFinishing()) {
                qVar.mo16975a().mo14737a(bool.booleanValue());
            }
        }
    }

    /* renamed from: a */
    public static void m16637a(Activity activity, Boolean bool, Bundle bundle, String str) {
        if (activity instanceof ActivityC0945e) {
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
            if (bool.booleanValue()) {
                if (supportFragmentManager.mo3551a("LiveDrawerDialog") instanceof C8412a) {
                    DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) supportFragmentManager.mo3551a("LiveDrawerDialog");
                    if (!dVar.isAdded()) {
                        dVar.showNow(supportFragmentManager, "LiveDrawerDialog");
                        return;
                    }
                    return;
                }
                C8412a.m16618a(f20837a, bundle, str).showNow(supportFragmentManager, "LiveDrawerDialog");
            } else if (supportFragmentManager.mo3551a("LiveDrawerDialog") instanceof C8412a) {
                DialogInterface$OnCancelListenerC0944d dVar2 = (DialogInterface$OnCancelListenerC0944d) supportFragmentManager.mo3551a("LiveDrawerDialog");
                if (dVar2.isAdded()) {
                    dVar2.dismiss();
                }
            }
        }
    }
}
