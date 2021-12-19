package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.cell.BasicTuxCell;
import com.p2082ss.android.ugc.aweme.cell.ButtonCell;
import com.p2082ss.android.ugc.aweme.cell.DisclosureCell;
import com.p2082ss.android.ugc.aweme.cell.DividerCell;
import com.p2082ss.android.ugc.aweme.cell.LabelCell;
import com.p2082ss.android.ugc.aweme.cell.RadioCell;
import com.p2082ss.android.ugc.aweme.cell.SwitchCell;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dm */
public final class C43047dm {

    /* renamed from: a */
    public final PowerList f100359a;

    /* renamed from: b */
    private final List<AbstractC40931a<?>> f100360b = new ArrayList();

    static {
        Covode.recordClassIndex(51197);
    }

    /* renamed from: a */
    public final List<AbstractC40931a<?>> mo73245a() {
        return C89070n.m154590j(this.f100360b);
    }

    public C43047dm(PowerList powerList) {
        C89219l.m154721d(powerList, "");
        this.f100359a = powerList;
        powerList.mo28083a(DividerCell.class, BasicTuxCell.class, SwitchCell.class, ButtonCell.class, RadioCell.class, LabelCell.class, DisclosureCell.class);
    }

    /* renamed from: a */
    public final void mo73247a(AbstractC40931a<?> aVar) {
        C89219l.m154721d(aVar, "");
        List<AbstractC40931a<?>> list = this.f100360b;
        C17656f<AbstractC17641a> state = this.f100359a.getState();
        C89219l.m154716b(state, "");
        aVar.mo70125a(state);
        list.add(aVar);
        this.f100359a.getState().mo28132a(aVar.mo70131d());
    }

    /* renamed from: a */
    public final void mo73246a(int i, List<? extends AbstractC40931a<?>> list) {
        C89219l.m154721d(list, "");
        List<AbstractC40931a<?>> list2 = this.f100360b;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C17656f<AbstractC17641a> state = this.f100359a.getState();
            C89219l.m154716b(state, "");
            it.next().mo70125a(state);
        }
        list2.addAll(list);
        C17656f<AbstractC17641a> state2 = this.f100359a.getState();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().mo70131d());
        }
        state2.mo28131a(i, arrayList);
    }
}
