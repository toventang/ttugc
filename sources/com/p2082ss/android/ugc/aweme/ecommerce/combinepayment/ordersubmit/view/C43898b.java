package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.b */
public final class C43898b extends C44294a {

    /* renamed from: a */
    public final String f102325a;

    /* renamed from: b */
    public final String f102326b;

    /* renamed from: c */
    private SparseArray f102327c;

    static {
        Covode.recordClassIndex(52180);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f102327c == null) {
            this.f102327c = new SparseArray();
        }
        View view = (View) this.f102327c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102327c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f102327c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.b$a */
    public static final class C43899a implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C43898b f102328a;

        static {
            Covode.recordClassIndex(52181);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
        }

        C43899a(C43898b bVar) {
            this.f102328a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            Dialog dialog = this.f102328a.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43898b(String str, String str2) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f102325a = str;
        this.f102326b = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        NormalTitleBar normalTitleBar = (NormalTitleBar) mo74087a(R.id.eiz);
        ImageView startBtn = normalTitleBar.getStartBtn();
        C89219l.m154716b(startBtn, "");
        startBtn.setVisibility(8);
        normalTitleBar.setTitle(this.f102325a);
        normalTitleBar.setOnTitleBarClickListener(new C43899a(this));
        BulletContainerView bulletContainerView = (BulletContainerView) mo74087a(R.id.zu);
        bulletContainerView.mo25820a(BulletService.m71938f().mo61850a());
        IBulletService f = BulletService.m71938f();
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        bulletContainerView.mo26839a(f.mo61849a(requireContext), 17, 0, 0, 0, 0);
        AbstractC17046h.C17047a.m31518a(bulletContainerView, C35301c.m72246a(this.f102326b), null, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.p5, viewGroup, false);
    }
}
