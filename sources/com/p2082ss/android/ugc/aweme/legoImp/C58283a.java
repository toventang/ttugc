package com.p2082ss.android.ugc.aweme.legoImp;

import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58193e;
import com.p2082ss.android.ugc.aweme.lego.component.C58192d;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import com.p2082ss.android.ugc.aweme.p2433ca.C35340a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.a */
public final class C58283a implements AbstractC58142d {

    /* renamed from: a */
    public ThreadLocal<C58192d> f132734a = new C58284a();

    /* renamed from: b */
    public final AbstractC58193e<C58192d> f132735b;

    static {
        Covode.recordClassIndex(68360);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.a$a */
    public static final class C58284a extends ThreadLocal<C58192d> {
        static {
            Covode.recordClassIndex(68361);
        }

        C58284a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ C58192d initialValue() {
            C58192d dVar = new C58192d();
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            dVar.f132504b = currentThread.getId();
            String name = currentThread.getName();
            C89219l.m154716b(name, "");
            C89219l.m154721d(name, "");
            dVar.f132503a = name;
            return dVar;
        }
    }

    public C58283a(AbstractC58193e<C58192d> eVar) {
        this.f132735b = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d
    /* renamed from: b */
    public final void mo95651b(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        C58192d dVar = this.f132734a.get();
        if (dVar == null) {
            C89219l.m154715b();
        }
        AbstractC58193e<C58192d> eVar = this.f132735b;
        if (eVar != null) {
            eVar.mo60051b(dVar);
        }
        if ((nVar instanceof AbstractC58258q) && C35340a.m72328a()) {
            C35340a.m72329b(Process.myTid());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d
    /* renamed from: a */
    public final void mo95650a(AbstractC58252n nVar) {
        C89219l.m154721d(nVar, "");
        C58192d dVar = this.f132734a.get();
        if (dVar == null) {
            C89219l.m154715b();
        }
        C58192d dVar2 = dVar;
        String str = nVar.mo28607g() + nVar.mo28608h();
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            str = "main_".concat(String.valueOf(str));
        }
        C89219l.m154721d(str, "");
        dVar2.f132505c = str;
        AbstractC58193e<C58192d> eVar = this.f132735b;
        if (eVar != null) {
            eVar.mo60050a(dVar2);
        }
        if ((nVar instanceof AbstractC58258q) && C35340a.m72328a()) {
            C35340a.m72327a(Process.myTid());
        }
    }
}
