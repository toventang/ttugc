package dagger.hilt.p4541b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.p4539b.C88098a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: dagger.hilt.b.a */
public final class C88120a {
    static {
        Covode.recordClassIndex(104148);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dagger.hilt.b.a$a */
    public static final class C88121a extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ Fragment f200021a;

        static {
            Covode.recordClassIndex(104149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88121a(Fragment fragment) {
            super(0);
            this.f200021a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Fragment fragment = this.f200021a;
            C89219l.m154719c(fragment, "");
            C1175ad.AbstractC1177b a = C88098a.m153168a(fragment.requireActivity());
            if (a == null) {
                return new C1175ad.C1179d();
            }
            return a;
        }
    }

    /* renamed from: a */
    public static final <VM extends AbstractC1174ac> AbstractC89244h<VM> m153193a(Fragment fragment, AbstractC89277c<VM> cVar, AbstractC89171a<? extends C1182af> aVar) {
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        return new C88122b(cVar, aVar, new C88121a(fragment));
    }
}
