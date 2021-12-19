package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.r */
public abstract class AbstractC58129r implements AbstractC81916a {

    /* renamed from: a */
    private boolean f132388a;

    /* renamed from: c */
    public final ThreadLocal<List<AbstractC58259r>> f132389c = new C58130a();

    static {
        Covode.recordClassIndex(68195);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public void mo95597a() {
        this.f132388a = true;
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
    public final void mo95599b() {
        this.f132388a = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.r$a */
    public static final class C58130a extends ThreadLocal<List<AbstractC58259r>> {
        static {
            Covode.recordClassIndex(68196);
        }

        C58130a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<AbstractC58259r> initialValue() {
            return new ArrayList();
        }
    }
}
