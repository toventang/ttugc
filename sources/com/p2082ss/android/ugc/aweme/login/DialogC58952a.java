package com.p2082ss.android.ugc.aweme.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.login.a */
public final class DialogC58952a extends Dialog {
    static {
        Covode.recordClassIndex(69279);
    }

    public final void onBackPressed() {
        super.onBackPressed();
    }

    public DialogC58952a(Context context) {
        super(context, R.style.z4);
        MethodCollector.m26663i(12732);
        setContentView(LayoutInflater.from(context).inflate(R.layout.aiy, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C13628n.m24520b(context, 57.0f);
        attributes.width = (int) C13628n.m24520b(context, 57.0f);
        window.setAttributes(attributes);
        MethodCollector.m26664o(12732);
    }
}
