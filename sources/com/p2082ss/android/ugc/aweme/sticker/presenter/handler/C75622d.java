package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.d */
public final class C75622d implements AbstractC75576l, AbstractC75633m {

    /* renamed from: a */
    public final List<AbstractC75517h> f170033a = new ArrayList();

    /* renamed from: b */
    private C75618a f170034b;

    static {
        Covode.recordClassIndex(88553);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    /* renamed from: b */
    private final void m132681b() {
        Iterator<T> it = this.f170033a.iterator();
        while (it.hasNext()) {
            it.next().mo119171b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m132680a(com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a r3) {
        /*
            r2 = this;
            r2.m132681b()
            java.util.List<com.ss.android.ugc.aweme.sticker.panel.c.h> r0 = r2.f170033a
            java.util.Iterator r1 = r0.iterator()
        L_0x0009:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.sticker.panel.c.h r0 = (com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h) r0
            boolean r0 = r0.mo119170a(r3)
            if (r0 == 0) goto L_0x0009
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75622d.m132680a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE) {
            for (AbstractC75517h hVar : this.f170033a) {
                if (hVar instanceof View$OnClickListenerC75500b) {
                    View$OnClickListenerC75500b bVar = (View$OnClickListenerC75500b) hVar;
                    if (bVar.f169663E) {
                        bVar.f169672N.mo119204c();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        Iterator<T> it = this.f170033a.iterator();
        while (it.hasNext()) {
            it.next().mo119169a(view);
        }
        C75618a aVar = this.f170034b;
        if (aVar != null) {
            m132680a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo119356a(AbstractC75517h hVar) {
        C89219l.m154721d(hVar, "");
        if (!this.f170033a.contains(hVar)) {
            this.f170033a.add(hVar);
        }
        List<AbstractC75517h> list = this.f170033a;
        if (list.size() > 1) {
            C89070n.m154530a((List) list, (Comparator) new C75623a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC75576l.EnumC75577a.BEFORE_ANIMATE) {
            for (AbstractC75517h hVar : this.f170033a) {
                if (hVar instanceof View$OnClickListenerC75500b) {
                    View$OnClickListenerC75500b bVar = (View$OnClickListenerC75500b) hVar;
                    if (bVar.f169663E) {
                        bVar.f169672N.mo119203b();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.d$a */
    public static final class C75623a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(88554);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.mo119168a().ordinal()), Integer.valueOf(t2.mo119168a().ordinal()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            m132680a(aVar2);
            this.f170034b = aVar2;
        } else {
            this.f170034b = null;
            m132681b();
        }
        return a;
    }
}
