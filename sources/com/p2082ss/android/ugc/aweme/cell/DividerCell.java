package com.p2082ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.setting.Divider;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.DividerCell */
public final class DividerCell extends BaseCell<C34797e> {
    static {
        Covode.recordClassIndex(42634);
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.lm, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C34797e eVar) {
        C89219l.m154721d(eVar, "");
        super.mo23350a((AbstractC34793a) eVar);
        Divider divider = (Divider) this.itemView.findViewById(R.id.c93);
        if (divider != null) {
            if (eVar.f82173d) {
                divider.setVisibility(0);
            } else {
                divider.setVisibility(8);
            }
        }
        com.p2082ss.android.ugc.aweme.setting.p3732ui.Divider divider2 = (com.p2082ss.android.ugc.aweme.setting.p3732ui.Divider) this.itemView.findViewById(R.id.text);
        if (divider2 != null) {
            divider2.setLeftText(eVar.f82172c);
        }
    }
}
