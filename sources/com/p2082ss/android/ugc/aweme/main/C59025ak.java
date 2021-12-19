package com.p2082ss.android.ugc.aweme.main;

import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.experiment.C59086g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89386u;

/* renamed from: com.ss.android.ugc.aweme.main.ak */
final /* synthetic */ class C59025ak implements AbstractC1214u {

    /* renamed from: a */
    private final C59014ae f134397a;

    static {
        Covode.recordClassIndex(69370);
    }

    C59025ak(C59014ae aeVar) {
        this.f134397a = aeVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        ActivityC0945e activity;
        C59014ae aeVar = this.f134397a;
        if (((Integer) ((C89386u) obj).getThird()).intValue() != 0) {
            aeVar.f134368e = 2;
        }
        try {
            if (C59086g.m108563a() && (activity = aeVar.getActivity()) != null && activity.getWindow() != null) {
                View decorView = activity.getWindow().getDecorView();
                if (decorView.getBackground() == null) {
                    decorView.setBackgroundColor(C0643b.m2378c(aeVar.getContext(), R.color.l));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
