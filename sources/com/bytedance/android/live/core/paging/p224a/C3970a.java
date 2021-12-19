package com.bytedance.android.live.core.paging.p224a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.core.paging.a.a */
public final class C3970a extends AbstractC10937b<Object> {

    /* renamed from: a */
    private ViewGroup f10881a;

    static {
        Covode.recordClassIndex(4501);
    }

    public C3970a(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        MethodCollector.m26663i(13515);
        this.f10881a = viewGroup;
        MethodCollector.m26664o(13515);
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final void mo9329a(Object obj, int i) {
        this.itemView.setLayoutParams(new RecyclerView.C1367j(this.f10881a.getMeasuredWidth(), 1));
    }
}
