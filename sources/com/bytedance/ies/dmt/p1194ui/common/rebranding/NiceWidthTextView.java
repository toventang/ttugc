package com.bytedance.ies.dmt.p1194ui.common.rebranding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView */
public class NiceWidthTextView extends DmtTextView {

    /* renamed from: a */
    public AbstractC17181b f40923a;

    static {
        Covode.recordClassIndex(19637);
    }

    public NiceWidthTextView(Context context) {
        super(context);
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        int a;
        AbstractC17181b bVar = this.f40923a;
        if (bVar != null) {
            C17179a.C17180a a2 = C17179a.m31713a(bVar.getClass());
            if (a2 == null || !a2.f40925a) {
                a = this.f40923a.mo27129a(this);
                C17179a.m31715a(this.f40923a.getClass(), new C17179a.C17180a(a));
            } else {
                a = a2.f40926b;
            }
            i = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
