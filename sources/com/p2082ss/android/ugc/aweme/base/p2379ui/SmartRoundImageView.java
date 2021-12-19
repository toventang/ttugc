package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartRoundImageView */
public class SmartRoundImageView extends SmartImageView {
    static {
        Covode.recordClassIndex(41646);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    /* renamed from: a */
    public final void mo34192a() {
        super.mo34192a();
        C24250e eVar = new C24250e();
        eVar.mo39978a(C13628n.m24520b(getContext(), 2.0f));
        ((C24246a) getHierarchy()).mo39959a(eVar);
        ((C24246a) getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57458h);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
