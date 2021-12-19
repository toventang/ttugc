package com.p2082ss.android.ugc.aweme.kids.setting.base;

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

/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.a */
public final class DialogC57804a extends Dialog {
    static {
        Covode.recordClassIndex(67806);
    }

    public final void onBackPressed() {
        super.onBackPressed();
    }

    public DialogC57804a(Context context) {
        super(context, R.style.yx);
        MethodCollector.m26663i(11102);
        setContentView(LayoutInflater.from(context).inflate(R.layout.ad7, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C13628n.m24520b(context, 57.0f);
        attributes.width = (int) C13628n.m24520b(context, 57.0f);
        window.setAttributes(attributes);
        MethodCollector.m26664o(11102);
    }
}
