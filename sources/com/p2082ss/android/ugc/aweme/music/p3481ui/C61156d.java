package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d */
public final class C61156d {

    /* renamed from: a */
    public static final C61156d f138855a = new C61156d();

    private C61156d() {
    }

    static {
        Covode.recordClassIndex(71761);
    }

    /* renamed from: a */
    public static final Dialog m110775a(Activity activity, View view, int i) {
        Display display;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        Dialog dialog = new Dialog(activity, R.style.xn);
        dialog.setCancelable(true);
        dialog.setContentView(view);
        WindowManager windowManager = activity.getWindowManager();
        WindowManager.LayoutParams layoutParams = null;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Window window = dialog.getWindow();
        if (!(window == null || (layoutParams = window.getAttributes()) == null)) {
            layoutParams.x = 0;
            layoutParams.gravity = 80;
            layoutParams.windowAnimations = i;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        if (layoutParams != null) {
            layoutParams.width = point.x;
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
