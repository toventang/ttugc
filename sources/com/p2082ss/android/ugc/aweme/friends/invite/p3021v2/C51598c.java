package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.c */
public final class C51598c implements AbstractC1214u<Boolean> {

    /* renamed from: a */
    private final DmtStatusView f118904a;

    static {
        Covode.recordClassIndex(60873);
    }

    public C51598c(DmtStatusView dmtStatusView) {
        C89219l.m154721d(dmtStatusView, "");
        this.f118904a = dmtStatusView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            this.f118904a.mo27384f();
        } else if (this.f118904a.mo27389j()) {
            this.f118904a.mo27382d();
        }
    }
}
