package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.bc */
public final /* synthetic */ class C37041bc implements AbstractC1214u {

    /* renamed from: a */
    private final C37157k f87259a;

    static {
        Covode.recordClassIndex(44395);
    }

    C37041bc(C37157k kVar) {
        this.f87259a = kVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C37157k kVar = this.f87259a;
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            kVar.f87632p.setEnabled(true);
            kVar.f87632p.setTextColor(C0643b.m2378c(kVar.getContext(), R.color.bd));
            kVar.f87632p.setText(kVar.getContext().getString(R.string.ajj) + " (" + num + ")");
            kVar.f87633q.setEnabled(true);
            kVar.f87633q.setTextColor(C0643b.m2378c(kVar.getContext(), R.color.bx));
            if (num.intValue() == 1 && !kVar.f87566H) {
                kVar.f87566H = true;
                C39162r.onEventV3("comment_batch_management_select_ck");
                return;
            }
            return;
        }
        kVar.mo64726s();
    }
}
