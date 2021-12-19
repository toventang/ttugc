package com.bytedance.android.livesdk.p604qa;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p604qa.C10262i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.qa.r */
final /* synthetic */ class View$OnLongClickListenerC10280r implements View.OnLongClickListener {

    /* renamed from: a */
    private final C10262i.C10271f f24867a;

    static {
        Covode.recordClassIndex(11846);
    }

    View$OnLongClickListenerC10280r(C10262i.C10271f fVar) {
        this.f24867a = fVar;
    }

    public final boolean onLongClick(View view) {
        C10262i.C10271f fVar = this.f24867a;
        C10262i.this.f24819n.mo28311a(C10178ad.class, fVar.f24840a);
        C10262i.this.f24819n.mo28311a(C10225au.class, "qa_board");
        C10262i.this.f24821p = new C10220at();
        AbstractC0952i iVar = (AbstractC0952i) C10262i.this.f24819n.mo28318b(C9021ao.class);
        if (iVar == null) {
            return false;
        }
        C10262i.this.f24821p.show(iVar, fVar.f24843d);
        return false;
    }
}
