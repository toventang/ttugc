package com.p2082ss.android.ugc.aweme.music.p3481ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ax */
final /* synthetic */ class C61130ax implements AbstractC1214u {

    /* renamed from: a */
    private final C61100ah f138808a;

    static {
        Covode.recordClassIndex(71735);
    }

    C61130ax(C61100ah ahVar) {
        this.f138808a = ahVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C61100ah ahVar = this.f138808a;
        Boolean bool = (Boolean) obj;
        if (ahVar.f138754q != null) {
            ahVar.f138754q.setImageResource(bool.booleanValue() ? R.drawable.b2e : 2131233168);
        }
        if (ahVar.f138756s != null) {
            ahVar.f138756s.setText(bool.booleanValue() ? R.string.pf : R.string.p_);
            if (ahVar.f138753p != null && ahVar.f138753p.getVisibility() == 0) {
                ahVar.mo98651a(ahVar.getActivity());
            }
        }
        if (!bool.booleanValue() && ahVar.f138724ao != null && ahVar.f138724ao.isShowing()) {
            ahVar.f138724ao.dismiss();
        }
    }
}
