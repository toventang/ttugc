package com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.c.b */
public final class DialogC68579b extends Dialog {

    /* renamed from: a */
    public TuxDualBallView f153444a;

    static {
        Covode.recordClassIndex(80832);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            TuxDualBallView tuxDualBallView = this.f153444a;
            if (tuxDualBallView == null) {
                C89219l.m154710a("mDualBallView");
            }
            tuxDualBallView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            TuxDualBallView tuxDualBallView = this.f153444a;
            if (tuxDualBallView == null) {
                C89219l.m154710a("mDualBallView");
            }
            tuxDualBallView.setVisibility(0);
            TuxDualBallView tuxDualBallView2 = this.f153444a;
            if (tuxDualBallView2 == null) {
                C89219l.m154710a("mDualBallView");
            }
            tuxDualBallView2.mo37884b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC68579b(Activity activity) {
        super(activity, R.style.wt);
        C89219l.m154721d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.axt);
        View findViewById = findViewById(R.id.ap_);
        C89219l.m154716b(findViewById, "");
        this.f153444a = (TuxDualBallView) findViewById;
    }
}
