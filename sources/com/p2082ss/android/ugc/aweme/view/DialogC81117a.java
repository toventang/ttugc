package com.p2082ss.android.ugc.aweme.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.view.a */
public final class DialogC81117a extends Dialog {

    /* renamed from: a */
    DmtStatusView f181276a;

    static {
        Covode.recordClassIndex(94445);
    }

    public final void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f181276a;
            if (dmtStatusView != null) {
                dmtStatusView.mo27384f();
            }
        }
    }

    public final void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f181276a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
                this.f181276a.setStatus(-1);
            }
        }
    }

    public DialogC81117a(Activity activity) {
        super(activity, R.style.uy);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cy);
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.e7i);
        this.f181276a = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
    }
}
