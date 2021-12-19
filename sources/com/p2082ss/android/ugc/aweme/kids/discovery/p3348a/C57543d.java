package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.d */
public final class C57543d extends C57536a {

    /* renamed from: b */
    public final C57544e f131367b;

    static {
        Covode.recordClassIndex(67493);
    }

    public C57543d(C57544e eVar) {
        C89219l.m154721d(eVar, "");
        this.f131367b = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57536a, com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e.AbstractC57547b
    /* renamed from: a */
    public final void mo94889a(int i) {
        super.mo94889a(i);
        if (i == 2) {
            DmtStatusView dmtStatusView = this.f131345a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
            C57544e eVar = this.f131367b;
            DmtStatusView dmtStatusView2 = this.f131345a;
            if (dmtStatusView2 != null) {
                int i2 = 0;
                for (C57552g gVar : eVar.f131356b) {
                    if (!C89219l.m154714a(gVar.itemView, dmtStatusView2)) {
                        i2++;
                    } else if (i2 >= 0 && i2 < eVar.f131356b.size()) {
                        C57552g remove = eVar.f131356b.remove(i2);
                        C89219l.m154716b(remove, "");
                        C57552g gVar2 = remove;
                        eVar.f131357c.mo2185b(gVar2.f131384a);
                        gVar2.setIsRecyclable(false);
                        eVar.f131358d.f131387b.addLast(Integer.valueOf(gVar2.f131384a));
                        eVar.notifyItemRemoved(i2);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
