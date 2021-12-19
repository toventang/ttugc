package com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.a */
public final class DialogC57857a extends Dialog {
    static {
        Covode.recordClassIndex(67865);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById(R.id.ap_);
            C89219l.m154716b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById(R.id.ap_);
            C89219l.m154716b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(0);
            ((TuxDualBallView) findViewById(R.id.ap_)).mo37884b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC57857a(Activity activity) {
        super(activity, R.style.yy);
        C89219l.m154721d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.adr);
    }
}
