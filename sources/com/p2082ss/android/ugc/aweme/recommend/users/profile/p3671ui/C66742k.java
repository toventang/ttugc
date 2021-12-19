package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64150c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.k */
public final class C66742k extends Fragment implements AbstractC64150c {

    /* renamed from: a */
    public User f149934a;

    /* renamed from: b */
    private SparseArray f149935b;

    static {
        Covode.recordClassIndex(78311);
    }

    /* renamed from: a */
    public final View mo105692a(int i) {
        if (this.f149935b == null) {
            this.f149935b = new SparseArray();
        }
        View view = (View) this.f149935b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f149935b.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64150c
    /* renamed from: a */
    public final RecyclerView mo103746a() {
        return (RecyclerView) mo105692a(R.id.d54);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f149935b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64150c
    /* renamed from: a */
    public final void mo103747a(User user) {
        this.f149934a = user;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.k$a */
    static final class C66743a extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66742k f149936a;

        static {
            Covode.recordClassIndex(78312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66743a(C66742k kVar) {
            super(1);
            this.f149936a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f149936a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66742k.C66743a.C667441 */

                /* renamed from: a */
                final /* synthetic */ C66743a f149937a;

                static {
                    Covode.recordClassIndex(78313);
                }

                {
                    this.f149937a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C66746l(this.f149937a.f149936a.f149934a));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f149936a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66742k.C66743a.C667452 */

                /* renamed from: a */
                final /* synthetic */ C66743a f149938a;

                static {
                    Covode.recordClassIndex(78314);
                }

                {
                    this.f149938a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C66707b.class));
                    qVar2.f31050b = new C66707b();
                    qVar2.f31053e = (RelativeLayout) this.f149938a.f149936a.mo105692a(R.id.f_y);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C66743a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a1p, viewGroup, false);
    }
}
