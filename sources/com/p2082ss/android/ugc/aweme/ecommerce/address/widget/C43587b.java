package com.p2082ss.android.ugc.aweme.ecommerce.address.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a.C45620e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b */
public final class C43587b extends C44294a {

    /* renamed from: e */
    public static final C43588a f101624e = new C43588a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super List<Region>, C89391z> f101625a = C43593e.f101634a;

    /* renamed from: b */
    public AbstractC89172b<? super List<Region>, C89391z> f101626b = C43592d.f101633a;

    /* renamed from: c */
    public AbstractC89171a<C89391z> f101627c = C43590b.f101631a;

    /* renamed from: d */
    public C45620e f101628d;

    /* renamed from: m */
    private SparseArray f101629m;

    static {
        Covode.recordClassIndex(51830);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f101629m == null) {
            this.f101629m = new SparseArray();
        }
        View view = (View) this.f101629m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f101629m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f101629m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$a */
    public static final class C43588a {
        static {
            Covode.recordClassIndex(51831);
        }

        private C43588a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$a$a */
        public static final class C43589a extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

            /* renamed from: a */
            public static final C43589a f101630a = new C43589a();

            static {
                Covode.recordClassIndex(51832);
            }

            C43589a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
                C89219l.m154721d(list, "");
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C43588a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m86625a(boolean z, String str, int i, AbstractC0952i iVar, String str2, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super List<Region>, C89391z> bVar, AbstractC89172b<? super List<Region>, C89391z> bVar2) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            if (iVar != null) {
                C43587b bVar3 = new C43587b();
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString("geo_name_id", str);
                }
                bundle.putBoolean("needs_dim", z);
                if (i <= 0) {
                    i = Integer.MAX_VALUE;
                }
                bundle.putInt("level_count", i);
                bundle.putString("page_info", str2);
                bVar3.setArguments(bundle);
                bVar3.f101625a = bVar;
                bVar3.f101626b = bVar2;
                bVar3.f101627c = aVar;
                bVar3.show(iVar, "");
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m86626a(boolean z, String str, int i, AbstractC0952i iVar, String str2, AbstractC89171a aVar, AbstractC89172b bVar, AbstractC89172b bVar2, int i2) {
            boolean z2 = z;
            String str3 = str;
            AbstractC89172b bVar3 = bVar2;
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            String str4 = null;
            if ((i2 & 2) != 0) {
                str3 = null;
            }
            if ((i2 & 16) == 0) {
                str4 = str2;
            }
            if ((i2 & 128) != 0) {
                bVar3 = C43589a.f101630a;
            }
            m86625a(z2, str3, i, iVar, str4, aVar, bVar, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$b */
    static final class C43590b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C43590b f101631a = new C43590b();

        static {
            Covode.recordClassIndex(51833);
        }

        C43590b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$g */
    static final class C43595g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43587b f101636a;

        static {
            Covode.recordClassIndex(51838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43595g(C43587b bVar) {
            super(0);
            this.f101636a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Dialog dialog = this.f101636a.getDialog();
            if (dialog != null) {
                this.f101636a.onCancel(dialog);
            }
            this.f101636a.dismiss();
            return C89391z.f203057a;
        }
    }

    public C43587b() {
        super((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$c */
    public static final class DialogInterface$OnKeyListenerC43591c implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C43587b f101632a;

        static {
            Covode.recordClassIndex(51834);
        }

        DialogInterface$OnKeyListenerC43591c(C43587b bVar) {
            this.f101632a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                return false;
            }
            C45620e eVar = this.f101632a.f101628d;
            if (eVar == null) {
                C89219l.m154710a("regionPickerWrapper");
            }
            return eVar.mo76831b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$d */
    static final class C43592d extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C43592d f101633a = new C43592d();

        static {
            Covode.recordClassIndex(51835);
        }

        C43592d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$e */
    static final class C43593e extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        public static final C43593e f101634a = new C43593e();

        static {
            Covode.recordClassIndex(51836);
        }

        C43593e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$h */
    static final class C43596h extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43587b f101637a;

        static {
            Covode.recordClassIndex(51839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43596h(C43587b bVar) {
            super(1);
            this.f101637a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            this.f101637a.f101626b.invoke(list);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onCancel(DialogInterface dialogInterface) {
        C89219l.m154721d(dialogInterface, "");
        super.onCancel(dialogInterface);
        this.f101627c.invoke();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$f */
    static final class C43594f extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43587b f101635a;

        static {
            Covode.recordClassIndex(51837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43594f(C43587b bVar) {
            super(1);
            this.f101635a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            C89219l.m154721d(list, "");
            this.f101635a.dismiss();
            this.f101635a.f101625a.invoke(list);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        onCreateDialog.setOnKeyListener(new DialogInterface$OnKeyListenerC43591c(this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("geo_name_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("level_count");
        } else {
            i = Integer.MAX_VALUE;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("page_info");
        }
        this.f101628d = C45620e.C45625d.m88158a(str, null, i, true, str2, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C45620e eVar = this.f101628d;
        if (eVar == null) {
            C89219l.m154710a("regionPickerWrapper");
        }
        C45620e.m88151a(eVar, null, new C43595g(this), new C43594f(this), new C43596h(this), 1);
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        FrameLayout frameLayout = (FrameLayout) mo74087a(R.id.b80);
        C89219l.m154716b(frameLayout, "");
        int id = frameLayout.getId();
        C45620e eVar2 = this.f101628d;
        if (eVar2 == null) {
            C89219l.m154710a("regionPickerWrapper");
        }
        a.mo3453a(id, eVar2).mo3473c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.on, viewGroup, false);
    }
}
