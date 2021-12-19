package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bf */
public class C64020bf extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    private SparseArray f145179a;

    /* renamed from: e */
    public AbstractC64019be f145180e;

    static {
        Covode.recordClassIndex(75464);
    }

    /* renamed from: a */
    public View mo102214a(int i) {
        if (this.f145179a == null) {
            this.f145179a = new SparseArray();
        }
        View view = (View) this.f145179a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145179a.put(i, findViewById);
        return findViewById;
    }

    public void cj_() {
        SparseArray sparseArray = this.f145179a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cj_();
    }

    /* renamed from: a */
    public final void mo103590a(AbstractC64019be beVar) {
        C89219l.m154721d(beVar, "");
        this.f145180e = beVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        try {
            super.show(iVar, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
