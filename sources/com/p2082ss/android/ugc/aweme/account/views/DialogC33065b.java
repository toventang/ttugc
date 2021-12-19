package com.p2082ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.views.b */
public class DialogC33065b extends Dialog {

    /* renamed from: a */
    private static final int f78619a = ((int) C13628n.m24520b(C31291a.f74991a, 20.0f));

    /* renamed from: b */
    private int f78620b = (C13628n.m24504a(getContext()) - (f78619a * 2));

    /* renamed from: c */
    private int f78621c = -2;

    static {
        Covode.recordClassIndex(39874);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f78620b, this.f78621c);
        }
    }

    public DialogC33065b(Context context) {
        super(context, R.style.ue);
        requestWindowFeature(1);
    }
}
