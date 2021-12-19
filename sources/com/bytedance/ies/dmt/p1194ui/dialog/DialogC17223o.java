package com.bytedance.ies.dmt.p1194ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.o */
public final class DialogC17223o extends Dialog {

    /* renamed from: a */
    DmtStatusView f41136a;

    static {
        Covode.recordClassIndex(19684);
    }

    public final void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f41136a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    public final void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f41136a;
            if (dmtStatusView != null) {
                dmtStatusView.mo27382d();
                this.f41136a.mo27384f();
            }
        }
    }

    public DialogC17223o(Activity activity) {
        super(activity, R.style.wt);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.x7);
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.e7i);
        this.f41136a = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
    }
}
