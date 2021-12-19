package com.bytedance.android.livesdk.p446aj;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdk.p446aj.AbstractC6760a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.aj.a */
public abstract class AbstractC6760a<T extends AbstractC6760a> implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public PopupWindow f16795a;

    /* renamed from: b */
    public PopupWindow.OnDismissListener f16796b;

    /* renamed from: c */
    private boolean f16797c;

    /* renamed from: d */
    private ViewGroup f16798d;

    static {
        Covode.recordClassIndex(7498);
    }

    /* renamed from: a */
    private View m14473a() {
        PopupWindow popupWindow = this.f16795a;
        if (popupWindow != null) {
            return popupWindow.getContentView();
        }
        return null;
    }

    public void onDismiss() {
        ActivityC0945e a;
        PopupWindow.OnDismissListener onDismissListener = this.f16796b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f16797c) {
            ViewGroup viewGroup = this.f16798d;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
            } else if (!(m14473a() == null || (a = C11279p.m20001a(m14473a().getContext())) == null)) {
                ((ViewGroup) a.getWindow().getDecorView().getRootView()).getOverlay().clear();
            }
        }
        PopupWindow popupWindow = this.f16795a;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f16795a.dismiss();
        }
    }
}
