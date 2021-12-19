package com.bytedance.assem.arch.extensions;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12749b;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.b */
public final class C12777b {
    static {
        Covode.recordClassIndex(14605);
    }

    /* renamed from: com.bytedance.assem.arch.extensions.b$a */
    public static final class C12778a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f31086a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31087b;

        /* renamed from: c */
        final /* synthetic */ C12749b f31088c;

        /* renamed from: d */
        final /* synthetic */ Intent f31089d;

        /* renamed from: e */
        final /* synthetic */ int f31090e = 1;

        /* renamed from: f */
        final /* synthetic */ Bundle f31091f = null;

        /* renamed from: g */
        final /* synthetic */ AbstractC89187q f31092g;

        static {
            Covode.recordClassIndex(14606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12778a(ActivityC0945e eVar, AbstractC1204m mVar, C12749b bVar, Intent intent, AbstractC89187q qVar) {
            super(0);
            this.f31086a = eVar;
            this.f31087b = mVar;
            this.f31088c = bVar;
            this.f31089d = intent;
            this.f31092g = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C12790l.m23013a(this.f31086a, this.f31087b)) {
                this.f31088c.mo20600a(this.f31087b, this.f31089d, this.f31090e, this.f31091f, this.f31092g);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final AssemSupervisor m23000a(Fragment fragment) {
        C89219l.m154719c(fragment, "");
        AbstractC1174ac a = C1181ae.m3881a(fragment.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        return ((Assembler) a).mo20573a(fragment);
    }

    /* renamed from: a */
    public static final Fragment m22999a(AbstractC1204m mVar) {
        while (true) {
            C89219l.m154719c(mVar, "");
            if (mVar instanceof Fragment) {
                return (Fragment) mVar;
            }
            if (mVar instanceof ActivityC0945e) {
                return null;
            }
            if (mVar instanceof AbstractC12748a) {
                mVar = ((AbstractC12748a) mVar).bE_();
            } else if (mVar instanceof AbstractC12656g) {
                mVar = ((AbstractC12656g) mVar).aN_();
                if (mVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner for find.");
            }
        }
    }

    /* renamed from: b */
    public static final ActivityC0945e m23004b(AbstractC1204m mVar) {
        while (true) {
            C89219l.m154719c(mVar, "");
            if (mVar instanceof Fragment) {
                return ((Fragment) mVar).getActivity();
            }
            if (mVar instanceof AbstractC12656g) {
                return ((AbstractC12656g) mVar).aL_();
            }
            if (mVar instanceof ActivityC0945e) {
                return (ActivityC0945e) mVar;
            }
            if (mVar instanceof AbstractC12748a) {
                mVar = ((AbstractC12748a) mVar).bE_();
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner for find.");
            }
        }
    }

    /* renamed from: a */
    public static final AssemSupervisor m23001a(ActivityC0945e eVar) {
        C89219l.m154719c(eVar, "");
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        return ((Assembler) a).mo20573a(eVar);
    }

    /* renamed from: a */
    public static final AssemSupervisor m23002a(AbstractC12656g gVar) {
        C89219l.m154719c(gVar, "");
        ActivityC0945e aL_ = gVar.aL_();
        if (aL_ == null) {
            return null;
        }
        AbstractC1174ac a = C1181ae.m3881a(aL_, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        return ((Assembler) a).mo20573a(gVar);
    }

    /* renamed from: a */
    public static final AssemSupervisor m23003a(AbstractC12748a aVar) {
        C89219l.m154719c(aVar, "");
        ActivityC0945e b = m23004b(aVar);
        if (b == null) {
            return null;
        }
        AbstractC1174ac a = C1181ae.m3881a(b, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        return ((Assembler) a).mo20573a(aVar);
    }
}
