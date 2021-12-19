package com.p2082ss.android.ugc.aweme.qna;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.arg.RouteArgExtension;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qna.api.C66006c;
import com.p2082ss.android.ugc.aweme.qna.p3643a.C65885b;
import com.p2082ss.android.ugc.aweme.qna.p3643a.C65913e;
import com.p2082ss.android.ugc.aweme.qna.p3643a.C65945i;
import com.p2082ss.android.ugc.aweme.qna.p3644b.C66017b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile */
public final class QnaProfile extends C17372a {

    /* renamed from: e */
    public static final C65870a f148434e = new C65870a((byte) 0);

    /* renamed from: f */
    private final AbstractC89244h f148435f = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C65872c.f148440a, "enter_from", String.class);

    /* renamed from: g */
    private final AbstractC89244h f148436g = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C65873d.f148441a, "enter_method", String.class);

    /* renamed from: h */
    private final AbstractC89244h f148437h = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C65871b.f148439a, "to_user_id", String.class);

    /* renamed from: i */
    private SparseArray f148438i;

    static {
        Covode.recordClassIndex(77374);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148438i == null) {
            this.f148438i = new SparseArray();
        }
        View view = (View) this.f148438i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148438i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f148438i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final String mo64296c() {
        return (String) this.f148435f.getValue();
    }

    /* renamed from: d */
    public final String mo105023d() {
        return (String) this.f148436g.getValue();
    }

    /* renamed from: e */
    public final String mo105024e() {
        return (String) this.f148437h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$a */
    public static final class C65870a {
        static {
            Covode.recordClassIndex(77375);
        }

        private C65870a() {
        }

        public /* synthetic */ C65870a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$b */
    static final class C65871b extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C65871b f148439a = new C65871b();

        static {
            Covode.recordClassIndex(77376);
        }

        C65871b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$c */
    static final class C65872c extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C65872c f148440a = new C65872c();

        static {
            Covode.recordClassIndex(77377);
        }

        C65872c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$d */
    static final class C65873d extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C65873d f148441a = new C65873d();

        static {
            Covode.recordClassIndex(77378);
        }

        C65873d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$e */
    static final class C65874e extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C65874e f148442a = new C65874e();

        static {
            Covode.recordClassIndex(77379);
        }

        C65874e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C658751.f148443a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$f */
    static final class C65876f extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C65876f f148444a = new C65876f();

        static {
            Covode.recordClassIndex(77381);
        }

        C65876f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C658771.f148445a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo27717b(C65874e.f148442a);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C65876f.f148444a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.QnaProfile$g */
    static final class C65878g extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QnaProfile f148446a;

        /* renamed from: b */
        final /* synthetic */ View f148447b;

        static {
            Covode.recordClassIndex(77383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65878g(QnaProfile qnaProfile, View view) {
            super(1);
            this.f148446a = qnaProfile;
            this.f148447b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f148446a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.QnaProfile.C65878g.C658791 */

                /* renamed from: a */
                final /* synthetic */ C65878g f148448a;

                static {
                    Covode.recordClassIndex(77384);
                }

                {
                    this.f148448a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C66006c(this.f148448a.f148446a.mo64296c(), this.f148448a.f148446a.mo105023d(), this.f148448a.f148446a.mo105024e()));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f148446a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.QnaProfile.C65878g.C658802 */

                /* renamed from: a */
                final /* synthetic */ C65878g f148449a;

                static {
                    Covode.recordClassIndex(77385);
                }

                {
                    this.f148449a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f148449a.f148447b.findViewById(R.id.dbn);
                    qVar2.mo20632a(C89204ab.m154669a(C65913e.class));
                    qVar2.f31050b = new C65913e();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f148446a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.QnaProfile.C65878g.C658813 */

                /* renamed from: a */
                final /* synthetic */ C65878g f148450a;

                static {
                    Covode.recordClassIndex(77386);
                }

                {
                    this.f148450a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f148450a.f148447b.findViewById(R.id.dnh);
                    qVar2.mo20632a(C89204ab.m154669a(C65945i.class));
                    qVar2.f31050b = new C65945i();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f148446a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.QnaProfile.C65878g.C658824 */

                /* renamed from: a */
                final /* synthetic */ C65878g f148451a;

                static {
                    Covode.recordClassIndex(77387);
                }

                {
                    this.f148451a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f148451a.f148447b.findViewById(R.id.dbo);
                    qVar2.mo20632a(C89204ab.m154669a(C65885b.class));
                    qVar2.f31050b = new C65885b();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C65878g(this, view));
        if (C66017b.m117828a(mo105024e())) {
            C39162r.m79460a("enter_qa_personal_profile", new C33744d().mo59983a("enter_from", mo64296c()).mo59983a("enter_method", mo105023d()).f79943a);
            return;
        }
        C39162r.m79460a("enter_qa_others_profile", new C33744d().mo59983a("enter_method", "click_qa_entrance").mo59983a("enter_from", mo64296c()).mo59983a("to_user_id", mo105024e()).f79943a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aqi, viewGroup, false);
    }
}
