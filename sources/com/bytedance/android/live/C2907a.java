package com.bytedance.android.live;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.a */
public class C2907a extends DialogInterface$OnCancelListenerC0944d {
    static {
        Covode.recordClassIndex(3337);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismiss() {
        if (getFragmentManager() == null) {
            C3854a.m9453a(3, "BaseDialogFragmentV2", "dismiss:${this} not associate with a fragment manager");
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            C3854a.m9453a(3, "BaseDialogFragmentV2", "dismissAllowingStateLoss:${this} not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    private void mo13267a(String str, Object obj) {
        try {
            Field declaredField = C2907a.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        mo13267a("mDismissed", false);
        mo13267a("mShownByMe", true);
        AbstractC0976n a = iVar.mo3552a();
        a.mo3456a(this, str);
        a.mo3473c();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public int show(AbstractC0976n nVar, String str) {
        mo13267a("mDismissed", false);
        mo13267a("mShownByMe", true);
        nVar.mo3456a(this, str);
        mo13267a("mViewDestroyed", false);
        int c = nVar.mo3473c();
        mo13267a("mBackStackId", Integer.valueOf(c));
        return c;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void showNow(AbstractC0952i iVar, String str) {
        mo13267a("mDismissed", false);
        mo13267a("mShownByMe", true);
        AbstractC0976n a = iVar.mo3552a();
        a.mo3456a(this, str);
        try {
            a.mo3478e();
        } catch (Throwable unused) {
            a.mo3473c();
        }
    }
}
