package com.bytedance.hybrid.spark.p1109c;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.c.a */
public class DialogC15533a extends DialogC0240h {
    static {
        Covode.recordClassIndex(17795);
    }

    public void show() {
        Window window;
        View decorView;
        View decorView2;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setFlags(8, 8);
        }
        super.show();
        Activity ownerActivity = getOwnerActivity();
        if (!(ownerActivity == null || (window = ownerActivity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window3 = getWindow();
            if (!(window3 == null || (decorView2 = window3.getDecorView()) == null)) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.clearFlags(8);
        }
    }

    /* renamed from: b */
    private final void m28667b() {
        Activity ownerActivity;
        Window window;
        View decorView;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
            window2.setSoftInputMode(16);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            m28666a(getWindow());
            View decorView2 = window2.getDecorView();
            decorView2.setPadding(0, 0, 0, 0);
            Activity ownerActivity2 = getOwnerActivity();
            if (!(ownerActivity2 == null || (window = ownerActivity2.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                C89219l.m154709a((Object) decorView, "");
                decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility());
            }
            if (Build.VERSION.SDK_INT >= 21 && (ownerActivity = getOwnerActivity()) != null) {
                C89219l.m154709a((Object) ownerActivity, "");
                Window window3 = ownerActivity.getWindow();
                C89219l.m154709a((Object) window3, "");
                window2.setNavigationBarColor(window3.getNavigationBarColor());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DialogC15533a(Context context) {
        super(context, R.style.fh);
        C89219l.m154719c(context, "");
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(int i) {
        cn_();
        super.setContentView(i);
        m28667b();
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(View view) {
        C89219l.m154719c(view, "");
        cn_();
        super.setContentView(view);
        view.setFitsSystemWindows(false);
        m28667b();
    }

    /* renamed from: a */
    private static void m28666a(Window window) {
        View findViewById;
        if (Build.VERSION.SDK_INT >= 23) {
            if (window != null) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                if (window != null && (findViewById = window.findViewById(16908290)) != null) {
                    findViewById.setForeground(null);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 21 && window != null) {
            window.setStatusBarColor(0);
        }
    }

    public /* synthetic */ DialogC15533a(Context context, byte b) {
        this(context);
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154719c(view, "");
        cn_();
        super.setContentView(view, layoutParams);
        m28667b();
    }
}
