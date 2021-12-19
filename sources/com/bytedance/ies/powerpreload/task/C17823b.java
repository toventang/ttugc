package com.bytedance.ies.powerpreload.task;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17776a;
import com.bytedance.ies.powerpreload.C17807d;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.task.b */
public final class C17823b {

    /* renamed from: a */
    public final C17834g f42529a;

    static {
        Covode.recordClassIndex(20388);
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.b$a */
    public final class C17824a extends AbstractC0952i.AbstractC0954b {
        static {
            Covode.recordClassIndex(20389);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C17824a() {
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
            Bundle arguments;
            String b;
            Set<C17838h> a;
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            C17834g gVar = C17823b.this.f42529a;
            String name = fragment.getClass().getName();
            C89219l.m154709a((Object) name, "");
            C17807d b2 = gVar.mo28298b(name);
            if (!(b2 == null || !b2.f42493b || (arguments = fragment.getArguments()) == null || (b = C17776a.m32982b(arguments)) == null || (a = C17823b.this.f42529a.mo28296a(b2)) == null)) {
                for (T t : a) {
                    AbstractRunnableC17828f<?> fVar = t.f42548a;
                    if (fVar != null && t.mo28301a(null, b)) {
                        fVar.mo28286b();
                    }
                }
            }
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentPreCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
            Bundle arguments;
            String b;
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            C17834g gVar = C17823b.this.f42529a;
            String name = fragment.getClass().getName();
            C89219l.m154709a((Object) name, "");
            C17807d b2 = gVar.mo28298b(name);
            if (!(b2 == null || !b2.f42492a || (arguments = fragment.getArguments()) == null || (b = C17776a.m32982b(arguments)) == null)) {
                b2.f42493b = true;
                Set<C17838h> a = C17823b.this.f42529a.mo28296a(b2);
                if (a != null) {
                    for (T t : a) {
                        AbstractRunnableC17828f<?> fVar = t.f42548a;
                        if (fVar != null && t.mo28301a(null, b)) {
                            fVar.mo28290a(fragment.getActivity());
                            fVar.mo28291a(fragment);
                        }
                    }
                }
            }
        }
    }

    public C17823b(C17834g gVar) {
        C89219l.m154719c(gVar, "");
        this.f42529a = gVar;
    }
}
