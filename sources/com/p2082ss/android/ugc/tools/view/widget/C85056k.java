package com.p2082ss.android.ugc.tools.view.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.k */
public final class C85056k {
    static {
        Covode.recordClassIndex(99077);
    }

    /* renamed from: c */
    private static void m146254c(Dialog dialog) {
        try {
            dialog.dismiss();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m146252a(Dialog dialog) {
        if (dialog != null) {
            Context context = dialog.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !dialog.isShowing()) {
                try {
                    dialog.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m146253b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                int i = Build.VERSION.SDK_INT;
                Activity activity = (Activity) baseContext;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            m146254c(dialog);
        }
    }

    /* renamed from: a */
    public static DialogInterfaceC0216c m146251a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(context);
        aVar.mo454b(R.string.h7k).mo455b(R.string.a8y, onClickListener).mo446a(R.string.as0, onClickListener2);
        DialogInterfaceC0216c a = aVar.mo453a();
        try {
            a.show();
        } catch (Exception unused) {
        }
        return a;
    }
}
