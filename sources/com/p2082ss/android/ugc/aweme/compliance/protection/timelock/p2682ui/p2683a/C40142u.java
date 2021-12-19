package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.u */
final /* synthetic */ class C40142u implements AbstractC1214u {

    /* renamed from: a */
    private final C40139s f94246a;

    /* renamed from: b */
    private final AbstractC23293c.C23302f f94247b;

    static {
        Covode.recordClassIndex(47925);
    }

    C40142u(C40139s sVar, AbstractC23293c.C23302f fVar) {
        this.f94246a = sVar;
        this.f94247b = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        MethodCollector.m26663i(446);
        C40139s sVar = this.f94246a;
        AbstractC23293c.C23302f fVar = this.f94247b;
        C40128l.C40131a aVar = (C40128l.C40131a) obj;
        for (int i = 0; i < sVar.f94241a.getChildCount(); i++) {
            TuxTextCell tuxTextCell = (TuxTextCell) sVar.f94241a.getChildAt(i);
            if (aVar.f94225b == ((Integer) tuxTextCell.getTag()).intValue()) {
                ViewParent parent = fVar.f55228c.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(fVar.f55228c);
                }
                tuxTextCell.setAccessory(fVar);
            } else {
                tuxTextCell.setAccessory(null);
            }
        }
        MethodCollector.m26664o(446);
    }
}
