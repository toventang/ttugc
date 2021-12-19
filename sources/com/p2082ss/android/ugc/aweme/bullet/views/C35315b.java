package com.p2082ss.android.ugc.aweme.bullet.views;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.views.b */
public final class C35315b extends DmtStatusView implements AbstractC16650k {
    static {
        Covode.recordClassIndex(42483);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16650k
    /* renamed from: a */
    public final void mo26412a() {
        mo27384f();
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16650k
    /* renamed from: b */
    public final void mo26413b() {
        mo27382d();
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16650k
    public final View getView() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C35315b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        setBuilder(DmtStatusView.C17269a.m31905a(context));
    }

    public /* synthetic */ C35315b(Context context, byte b) {
        this(context);
    }
}
