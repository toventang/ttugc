package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58220d;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.v */
public abstract class AbstractC58137v implements AbstractC81916a {

    /* renamed from: b */
    public final ThreadLocal<List<AbstractC58264w>> f132397b = new C58138a();

    static {
        Covode.recordClassIndex(68203);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95627a(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final AbstractC58252n mo95628b(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        return nVar;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public void mo95599b() {
    }

    /* renamed from: c */
    public abstract EnumC58151ae mo95603c();

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.v$a */
    public static final class C58138a extends ThreadLocal<List<AbstractC58264w>> {
        static {
            Covode.recordClassIndex(68204);
        }

        C58138a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<AbstractC58264w> initialValue() {
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        C58220d dVar = C58221f.f132578b;
        EnumC58151ae c = mo95603c();
        C89219l.m154721d(c, "");
        C89219l.m154721d(list, "");
        synchronized (dVar.f132574a) {
            List<AbstractC58252n> list2 = dVar.f132574a.get(c);
            if (list2 == null) {
                C89219l.m154715b();
            }
            list2.addAll(list);
        }
    }
}
