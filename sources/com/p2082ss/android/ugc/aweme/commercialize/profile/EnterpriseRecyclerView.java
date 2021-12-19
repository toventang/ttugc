package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView */
public final class EnterpriseRecyclerView extends RecyclerView implements C39211a.AbstractC39213b {

    /* renamed from: O */
    private C38454m f90708O;

    static {
        Covode.recordClassIndex(45893);
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C38454m getEnterTabManager() {
        return this.f90708O;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39213b
    /* renamed from: q */
    public final boolean mo5599q() {
        return this.f90708O.f90835a;
    }

    public final void setEnterTabManager(C38454m mVar) {
        C89219l.m154721d(mVar, "");
        this.f90708O = mVar;
    }

    private /* synthetic */ EnterpriseRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EnterpriseRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f90708O = new C38454m();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
