package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.c */
public final class DialogC45013c extends DialogC0240h {
    static {
        Covode.recordClassIndex(53437);
    }

    private DialogC45013c(Context context) {
        super(context, R.style.vo);
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public final void setContentView(int i) {
        View findViewById;
        cn_();
        super.setContentView(i);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(16908335)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public final void setContentView(View view) {
        View findViewById;
        C89219l.m154721d(view, "");
        cn_();
        super.setContentView(view);
        view.setFitsSystemWindows(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(16908335)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public /* synthetic */ DialogC45013c(Context context, byte b) {
        this(context);
    }
}
