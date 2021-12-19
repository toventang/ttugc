package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58262u;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3394d.C58205b;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58219c;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.s */
public abstract class AbstractC58131s implements AbstractC81916a {

    /* renamed from: b */
    public final ThreadLocal<List<String>> f132390b = new C58132a();

    static {
        Covode.recordClassIndex(68197);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public void mo95599b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.s$a */
    public static final class C58132a extends ThreadLocal<List<String>> {
        static {
            Covode.recordClassIndex(68198);
        }

        C58132a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<String> initialValue() {
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95627a(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        if (C58205b.f132531a || C58205b.m105117a(nVar)) {
            String h = nVar.mo28608h();
            C58219c cVar = C58221f.f132580d;
            C89219l.m154716b(h, "");
            C89219l.m154721d(h, "");
            C89219l.m154721d(nVar, "");
            if (!cVar.f132571b.containsKey(h)) {
                cVar.f132571b.put(h, nVar);
            }
            List<String> list = this.f132390b.get();
            if (list != null) {
                list.add(h);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final AbstractC58252n mo95628b(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        C58219c cVar = C58221f.f132580d;
        String h = nVar.mo28608h();
        C89219l.m154716b(h, "");
        C89219l.m154721d(h, "");
        AbstractC58262u uVar = cVar.f132570a.get(h);
        if (uVar == null) {
            uVar = cVar.mo95684a(h);
        }
        return uVar;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        List<String> list2 = this.f132390b.get();
        if (list2 == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList(list2);
        List<String> list3 = this.f132390b.get();
        if (list3 != null) {
            list3.clear();
        }
        C58219c cVar = C58221f.f132580d;
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoService");
        EnumC58151ae b = ((AbstractC58262u) obj).mo95709b();
        C89219l.m154716b(b, "");
        C89219l.m154721d(b, "");
        C89219l.m154721d(arrayList, "");
        synchronized (cVar.f132572c) {
            List<String> list4 = cVar.f132572c.get(b);
            if (list4 == null) {
                C89219l.m154715b();
            }
            list4.addAll(arrayList);
        }
    }
}
