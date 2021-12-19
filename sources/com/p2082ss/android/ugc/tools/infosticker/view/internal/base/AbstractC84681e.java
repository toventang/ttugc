package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84630a;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84634e;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
public abstract class AbstractC84681e<CATEGORY, DATA> implements AbstractC84634e<CATEGORY, DATA> {

    /* renamed from: a */
    private AbstractC84630a<CATEGORY, DATA> f189193a;

    /* renamed from: b */
    private int f189194b = -1;

    /* renamed from: c */
    public final List<C89378p<CATEGORY, List<DATA>>> f189195c = new ArrayList();

    /* renamed from: d */
    public final TabLayout f189196d;

    /* renamed from: e */
    private final AbstractC88969g<CATEGORY> f189197e;

    /* renamed from: f */
    private C88411a f189198f;

    static {
        Covode.recordClassIndex(98648);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo128391a(Context context, CATEGORY category);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo128394a(View view, CATEGORY category, int i, int i2) {
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84634e
    /* renamed from: a */
    public final AbstractC88979t<CATEGORY> mo129542a() {
        AbstractC88979t<CATEGORY> c = this.f189197e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.e$c */
    public static final class RunnableC84684c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC84681e f189201a;

        /* renamed from: b */
        final /* synthetic */ List f189202b;

        static {
            Covode.recordClassIndex(98651);
        }

        RunnableC84684c(AbstractC84681e eVar, List list) {
            this.f189201a = eVar;
            this.f189202b = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            Object obj;
            AbstractC84681e eVar = this.f189201a;
            C89378p pVar = (C89378p) C89070n.m154583g(this.f189202b);
            if (pVar != null) {
                obj = pVar.getFirst();
            } else {
                obj = null;
            }
            eVar.mo129598a(obj, false);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.e$b */
    static final class C84683b<T> implements AbstractC88433f<List<? extends C89378p<? extends CATEGORY, ? extends List<? extends DATA>>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84681e f189200a;

        static {
            Covode.recordClassIndex(98650);
        }

        C84683b(AbstractC84681e eVar) {
            this.f189200a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<? extends C89378p<? extends CATEGORY, ? extends List<? extends DATA>>> list = (List) obj;
            AbstractC84681e eVar = this.f189200a;
            C89219l.m154716b(list, "");
            eVar.mo128395a((List) list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.e$d */
    public static final class View$OnClickListenerC84685d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84681e f189203a;

        /* renamed from: b */
        final /* synthetic */ Object f189204b;

        static {
            Covode.recordClassIndex(98652);
        }

        View$OnClickListenerC84685d(AbstractC84681e eVar, Object obj) {
            this.f189203a = eVar;
            this.f189204b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f189203a.mo129596a(this.f189204b);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.e$a */
    static final class C84682a<T> implements AbstractC88433f<C89378p<? extends DATA, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84681e f189199a;

        static {
            Covode.recordClassIndex(98649);
        }

        C84682a(AbstractC84681e eVar) {
            this.f189199a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            this.f189199a.mo129597a(pVar.component1(), ((Number) pVar.component2()).intValue());
        }
    }

    /* renamed from: a */
    public final void mo129596a(CATEGORY category) {
        this.f189197e.onNext(category);
        mo129598a((Object) category, true);
    }

    public AbstractC84681e(TabLayout tabLayout) {
        C89219l.m154721d(tabLayout, "");
        this.f189196d = tabLayout;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f189197e = cVar;
        tabLayout.setVisibility(8);
        tabLayout.setTabMargin(0);
    }

    /* renamed from: b */
    private void m145517b(List<? extends CATEGORY> list) {
        C89219l.m154721d(list, "");
        this.f189196d.mo115533b();
        int i = 0;
        for (T t : list) {
            Context context = this.f189196d.getContext();
            C89219l.m154716b(context, "");
            View a = mo128391a(context, t);
            TabLayout.C73104f a2 = this.f189196d.mo115519a().mo115584a(a);
            C89219l.m154716b(a2, "");
            this.f189196d.mo115525a(a2);
            a.setOnClickListener(new View$OnClickListenerC84685d(this, t));
            View c = this.f189196d.mo115536c(i);
            C89219l.m154716b(c, "");
            mo128394a(c, t, i, list.size());
            i++;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84634e
    /* renamed from: a */
    public final void mo129543a(AbstractC84630a<CATEGORY, DATA> aVar) {
        C89219l.m154721d(aVar, "");
        C88411a aVar2 = this.f189198f;
        if (aVar2 != null) {
            aVar2.dispose();
        }
        C88411a aVar3 = new C88411a();
        this.f189198f = aVar3;
        aVar3.mo142945a(aVar.mo129535i().mo143254a(new C84682a(this), C84909p.f189747a));
        C88411a aVar4 = this.f189198f;
        if (aVar4 != null) {
            aVar4.mo142945a(aVar.mo129529a().mo143254a(new C84683b(this), C84909p.f189747a));
        }
        this.f189193a = aVar;
    }

    /* renamed from: a */
    public void mo128395a(List<? extends C89378p<? extends CATEGORY, ? extends List<? extends DATA>>> list) {
        int i;
        C89219l.m154721d(list, "");
        this.f189195c.clear();
        this.f189195c.addAll(list);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        m145517b(arrayList);
        this.f189196d.post(new RunnableC84684c(this, list));
        TabLayout tabLayout = this.f189196d;
        if (list.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        tabLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo128396b(View view, int i) {
        TabLayout.C73104f a;
        if (this.f189196d.getSelectedTabPosition() != i && (a = this.f189196d.mo115520a(i)) != null) {
            a.mo115586a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo128392a(View view, int i) {
        if (this.f189196d.getCurSelectedTab() != null) {
            TabLayout.C73104f curSelectedTab = this.f189196d.getCurSelectedTab();
            C89219l.m154716b(curSelectedTab, "");
            View view2 = curSelectedTab.f164125f;
            if (view2 != null) {
                view2.setSelected(false);
            }
        }
        this.f189196d.mo115539d();
    }

    /* renamed from: a */
    public final void mo129597a(DATA data, int i) {
        int size = this.f189195c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C89378p<CATEGORY, List<DATA>> pVar = this.f189195c.get(i3);
            CATEGORY component1 = pVar.component1();
            List<DATA> component2 = pVar.component2();
            i2 += component2.size();
            if (i2 >= i && component2.contains(data)) {
                mo129598a((Object) component1, false);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.ss.android.ugc.tools.infosticker.view.a.a<CATEGORY, DATA> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo129598a(CATEGORY category, boolean z) {
        View view;
        C89378p pVar;
        List list;
        Object g;
        AbstractC84630a<CATEGORY, DATA> aVar;
        int i = -1;
        if (category != null) {
            int i2 = 0;
            Iterator<C89378p<CATEGORY, List<DATA>>> it = this.f189195c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C89219l.m154714a((Object) it.next().getFirst(), (Object) category)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!(!z || i < 0 || (pVar = (C89378p) C89070n.m154561b((List) this.f189195c, i)) == null || (list = (List) pVar.getSecond()) == null || (g = C89070n.m154583g(list)) == null || (aVar = this.f189193a) == 0)) {
            aVar.mo129530a(g, i);
        }
        int i3 = this.f189194b;
        View view2 = null;
        if (i3 != i && i3 >= 0) {
            this.f189196d.mo115520a(i3);
            TabLayout.C73104f a = this.f189196d.mo115520a(this.f189194b);
            if (a != null) {
                view = a.f164125f;
            } else {
                view = null;
            }
            mo128392a(view, this.f189194b);
        }
        if (i >= 0 && this.f189194b != i) {
            TabLayout.C73104f a2 = this.f189196d.mo115520a(i);
            if (a2 != null) {
                view2 = a2.f164125f;
            }
            mo128396b(view2, i);
            this.f189196d.mo115538c(a2);
        }
        this.f189194b = i;
    }
}
