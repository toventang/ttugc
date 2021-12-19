package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58216a;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.k */
public final class C58112k implements AbstractC81916a {

    /* renamed from: a */
    private C58114b f132372a = new C58114b();

    static {
        Covode.recordClassIndex(68178);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.k$b */
    public static final class C58114b extends ThreadLocal<List<String>> {
        static {
            Covode.recordClassIndex(68180);
        }

        C58114b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<String> initialValue() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.k$a */
    static final class RunnableC58113a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f132373a;

        static {
            Covode.recordClassIndex(68179);
        }

        RunnableC58113a(String str) {
            this.f132373a = str;
        }

        public final void run() {
            C58216a aVar = C58221f.f132581e;
            String str = this.f132373a;
            C89219l.m154716b(str, "");
            aVar.mo95671b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final AbstractC58252n mo95628b(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        C58216a aVar = C58221f.f132581e;
        String h = nVar.mo28608h();
        C89219l.m154716b(h, "");
        return (AbstractC58252n) aVar.mo95669a(h);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95627a(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        String h = nVar.mo28608h();
        C58216a aVar = C58221f.f132581e;
        C89219l.m154716b(h, "");
        C89219l.m154721d(h, "");
        if (!aVar.f132564b.containsKey(h)) {
            C58221f.f132581e.mo95670a(h, (AbstractC58258q) nVar);
            List list = (List) this.f132372a.get();
            if (list != null) {
                list.add(h);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        Object obj = this.f132372a.get();
        if (obj == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        List list2 = (List) this.f132372a.get();
        if (list2 != null) {
            list2.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C58254p.f132679a.post(new RunnableC58113a((String) it.next()));
        }
    }
}
