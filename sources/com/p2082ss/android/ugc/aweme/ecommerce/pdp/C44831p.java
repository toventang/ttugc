package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.ecommerce.common.C44315c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.C44997c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.p */
public final class C44831p extends C44315c implements AbstractC23185a {

    /* renamed from: a */
    public static AbstractC89124d<? super C89391z> f104564a;

    /* renamed from: b */
    public static final C44832a f104565b = new C44832a((byte) 0);

    /* renamed from: c */
    private SparseArray f104566c;

    static {
        Covode.recordClassIndex(53217);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.C44315c
    /* renamed from: c */
    public final View mo75223c() {
        if (this.f104566c == null) {
            this.f104566c = new SparseArray();
        }
        View view = (View) this.f104566c.get(R.id.dq7);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dq7);
        this.f104566c.put(R.id.dq7, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.C44315c
    /* renamed from: d */
    public final void mo75224d() {
        SparseArray sparseArray = this.f104566c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.ecommerce.common.C44315c, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo75224d();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.p$a */
    public static final class C44832a {
        static {
            Covode.recordClassIndex(53218);
        }

        private C44832a() {
        }

        public /* synthetic */ C44832a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.p$b */
    static final class C44833b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44831p f104567a;

        static {
            Covode.recordClassIndex(53219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44833b(C44831p pVar) {
            super(0);
            this.f104567a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.ecommerce.pdp.p r0 = r1.f104567a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44831p.C44833b.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC89124d<? super C89391z> dVar = f104564a;
        if (dVar != null) {
            dVar.resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
        }
        f104564a = null;
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.bg3);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a2.f54930b = true;
        return a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new C44833b(this)));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        C44720k a = C44720k.C44721a.m87476a(getActivity());
        if (a != null) {
            long b = mo75222b();
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            a.mo75860a("specifications", b, str);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(7838);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Specification[] specificationArr = null;
        Parcelable[] parcelableArray = arguments != null ? arguments.getParcelableArray("data") : null;
        if (parcelableArray instanceof Specification[]) {
            specificationArr = parcelableArray;
        }
        Specification[] specificationArr2 = specificationArr;
        if (specificationArr2 != null) {
            ArrayList<C44997c> arrayList = new ArrayList(specificationArr2.length);
            for (Specification specification : specificationArr2) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                C44997c cVar = new C44997c(context, (byte) 0);
                int i = C45563h.f106109e;
                cVar.setTitle(specification.f104714a);
                cVar.setDesc(specification.f104715b);
                cVar.setPadding(i, i, i, i);
                arrayList.add(cVar);
            }
            for (C44997c cVar2 : arrayList) {
                ((LinearLayout) mo75223c()).addView(cVar2);
            }
        }
        C44720k a = C44720k.C44721a.m87476a(getActivity());
        if (a != null) {
            a.mo75862a((C44720k) "specifications", (String) ((Boolean) null));
            MethodCollector.m26664o(7838);
            return;
        }
        MethodCollector.m26664o(7838);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C44766a.m87492a(getContext(), R.layout.ph, viewGroup, false);
    }
}
