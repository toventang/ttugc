package com.p2082ss.android.ugc.aweme.widgetcompat;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.widgetcompat.a */
public final class ProgressDialogC81636a extends ProgressDialogC84958b {
    static {
        Covode.recordClassIndex(95037);
    }

    private ProgressDialogC81636a(Context context) {
        super(context);
        this.f189856d = false;
    }

    /* renamed from: a */
    public static ProgressDialogC81636a m141497a(Context context, String str) {
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return null;
        }
        ProgressDialogC81636a aVar = new ProgressDialogC81636a(context);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        aVar.show();
        aVar.setContentView(R.layout.e3);
        aVar.setMessage(str);
        aVar.mo129720a();
        return aVar;
    }
}
