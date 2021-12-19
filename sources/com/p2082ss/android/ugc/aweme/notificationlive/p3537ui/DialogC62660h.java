package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.h */
public final class DialogC62660h extends Dialog {
    static {
        Covode.recordClassIndex(73463);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC62660h(Context context) {
        super(context, R.style.wb);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(8108);
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.apx, (ViewGroup) null));
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) findViewById(R.id.cfa);
        if (dmtLoadingLayout != null) {
            dmtLoadingLayout.setVisibility(0);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
            MethodCollector.m26664o(8108);
            return;
        }
        MethodCollector.m26664o(8108);
    }
}
