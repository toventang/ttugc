package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.l */
public final class DialogC44817l extends Dialog {

    /* renamed from: a */
    TuxDualBallView f104540a;

    static {
        Covode.recordClassIndex(53203);
    }

    public final void dismiss() {
        super.dismiss();
        this.f104540a.mo37885c();
    }

    public final void show() {
        super.show();
        this.f104540a.mo37884b();
    }

    public DialogC44817l(Context context) {
        super(context, R.style.fe);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.px);
        this.f104540a = (TuxDualBallView) findViewById(R.id.eqw);
        setCanceledOnTouchOutside(false);
    }
}
