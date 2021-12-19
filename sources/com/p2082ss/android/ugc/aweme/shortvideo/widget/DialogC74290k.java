package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.k */
public final class DialogC74290k extends Dialog {

    /* renamed from: a */
    public DmtStatusView f167055a;

    static {
        Covode.recordClassIndex(87062);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f167055a;
            if (dmtStatusView == null) {
                C89219l.m154710a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f167055a;
            if (dmtStatusView == null) {
                C89219l.m154710a("mDmtStatusView");
            }
            dmtStatusView.mo27382d();
            DmtStatusView dmtStatusView2 = this.f167055a;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mDmtStatusView");
            }
            dmtStatusView2.mo27384f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC74290k(Activity activity) {
        super(activity, R.style.vc);
        C89219l.m154721d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ahn);
        View findViewById = findViewById(R.id.e7i);
        C89219l.m154716b(findViewById, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById;
        this.f167055a = dmtStatusView;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        }
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
    }
}
