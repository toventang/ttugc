package com.p2082ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.o */
public class DialogC81459o extends Dialog {

    /* renamed from: a */
    private static final int f182107a = ((int) C13628n.m24520b(C17867d.m33078a(), 20.0f));

    /* renamed from: l */
    protected int f182108l;

    /* renamed from: m */
    protected int f182109m;

    public void ar_() {
    }

    static {
        Covode.recordClassIndex(94831);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f182108l, this.f182109m);
        }
    }

    public DialogC81459o(Context context) {
        super(context, R.style.ze);
        this.f182108l = C13628n.m24504a(getContext()) + 0;
        this.f182109m = C13628n.m24521b(getContext()) + 0;
        requestWindowFeature(1);
        ar_();
    }

    public DialogC81459o(Context context, int i, boolean z, boolean z2) {
        this(context, i, z, z2, false);
    }

    public DialogC81459o(Context context, int i, boolean z, boolean z2, boolean z3) {
        super(context, i);
        int a;
        requestWindowFeature(1);
        int i2 = -1;
        if (z3) {
            a = -2;
        } else if (z) {
            a = -1;
        } else {
            a = C13628n.m24504a(getContext()) - (f182107a * 2);
        }
        this.f182108l = a;
        if (!z) {
            if (z2) {
                i2 = -2;
            } else {
                i2 = C13628n.m24521b(getContext()) - (f182107a * 4);
            }
        }
        this.f182109m = i2;
        ar_();
    }
}
