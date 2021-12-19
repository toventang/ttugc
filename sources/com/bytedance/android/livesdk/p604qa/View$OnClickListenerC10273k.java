package com.bytedance.android.livesdk.p604qa;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p604qa.C10262i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.qa.k */
final /* synthetic */ class View$OnClickListenerC10273k implements View.OnClickListener {

    /* renamed from: a */
    private final C10262i.C10271f f24850a;

    /* renamed from: b */
    private final C10188af f24851b;

    static {
        Covode.recordClassIndex(11839);
    }

    View$OnClickListenerC10273k(C10262i.C10271f fVar, C10188af afVar) {
        this.f24850a = fVar;
        this.f24851b = afVar;
    }

    public final void onClick(View view) {
        C10262i.C10271f fVar = this.f24850a;
        C10188af afVar = this.f24851b;
        C6501b.C6502a.m13948a("livesdk_anchor_qa_more_click").mo12643a(C10262i.this.f24819n).mo12655b();
        AbstractC0952i iVar = (AbstractC0952i) C10262i.this.f24819n.mo28318b(C9021ao.class);
        if (iVar != null) {
            C10262i.this.f24819n.mo28311a(C10225au.class, "qa_board");
            C10262i.this.f24819n.mo28311a(C10189ag.class, afVar);
            C10262i.this.f24819n.mo28311a(C10204ao.class, (Object) true);
            new C10208as().show(iVar, fVar.f24843d);
        }
    }
}
