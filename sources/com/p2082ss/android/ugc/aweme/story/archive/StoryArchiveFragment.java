package com.p2082ss.android.ugc.aweme.story.archive;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment */
public final class StoryArchiveFragment extends C17372a {

    /* renamed from: e */
    private final AbstractC89244h f171726e = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C76454a.f171728a, "enter_from", String.class);

    /* renamed from: f */
    private SparseArray f171727f;

    static {
        Covode.recordClassIndex(89433);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f171727f == null) {
            this.f171727f = new SparseArray();
        }
        View view = (View) this.f171727f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f171727f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f171727f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment$b */
    static final class C76455b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryArchiveFragment f171729a;

        static {
            Covode.recordClassIndex(89435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76455b(StoryArchiveFragment storyArchiveFragment) {
            super(0);
            this.f171729a = storyArchiveFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ActivityC0945e activity = this.f171729a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment$a */
    static final class C76454a extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C76454a f171728a = new C76454a();

        static {
            Covode.recordClassIndex(89434);
        }

        C76454a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "profile";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment$c */
    static final class C76456c extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C76456c f171730a = new C76456c();

        static {
            Covode.recordClassIndex(89436);
        }

        C76456c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C764571.f171731a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C76456c.f171730a);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment$d */
    static final class C76458d extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryArchiveFragment f171732a;

        static {
            Covode.recordClassIndex(89438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76458d(StoryArchiveFragment storyArchiveFragment) {
            super(1);
            this.f171732a = storyArchiveFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f171732a, C764591.f171733a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.g52)) == null) {
            str = "Stories archive";
        }
        C89219l.m154716b(str, "");
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a = new C23187b().mo37738a(R.raw.icon_chevron_left_offset_ltr);
        a.f54930b = true;
        ((TuxNavBar) mo27715a(R.id.cpv)).setNavActions(aVar.mo37732a(a.mo37741a((AbstractC89171a<C89391z>) new C76455b(this))).mo37731a(new C23194g().mo37753a(str)));
        C12780d.m23005a(this, new C76458d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b1a, viewGroup, false);
    }
}
