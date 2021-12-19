package com.lynx.tasm.behavior;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.behavior.i */
public class DialogC28519i extends Dialog {

    /* renamed from: a */
    private static final String f67059a = DialogC28519i.class.getSimpleName();

    static {
        Covode.recordClassIndex(34517);
    }

    /* renamed from: a */
    public final View mo49026a() {
        return getWindow().getDecorView();
    }

    /* renamed from: b */
    public final void mo49028b() {
        if (!isShowing()) {
            try {
                if (!m56987a(getContext()).isFinishing()) {
                    show();
                }
            } catch (WindowManager.BadTokenException e) {
                LLog.m56856a(5, f67059a, e.toString());
            } catch (RuntimeException e2) {
                LLog.m56856a(5, f67059a, e2.toString());
            }
        }
    }

    /* renamed from: c */
    public final void mo49030c() {
        if (isShowing()) {
            try {
                dismiss();
            } catch (WindowManager.BadTokenException e) {
                LLog.m56856a(5, f67059a, e.toString());
            } catch (RuntimeException e2) {
                LLog.m56856a(5, f67059a, e2.toString());
            }
        }
    }

    public DialogC28519i(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo49029b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    private static Activity m56987a(Context context) {
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                throw new IllegalArgumentException();
            }
        }
        return (Activity) context;
    }

    /* renamed from: a */
    public final void mo49027a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(2, -1);
        getWindow().setSoftInputMode(16);
        getWindow().addFlags(32);
        getWindow().addFlags(8);
        getWindow().addFlags(131072);
        getWindow().clearFlags(2);
    }
}
