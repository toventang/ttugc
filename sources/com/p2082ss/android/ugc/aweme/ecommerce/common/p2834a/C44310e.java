package com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.e */
public class C44310e extends C26614b {

    /* renamed from: a */
    private SparseArray f103331a;

    static {
        Covode.recordClassIndex(52624);
    }

    /* renamed from: a */
    public View mo74087a(int i) {
        if (this.f103331a == null) {
            this.f103331a = new SparseArray();
        }
        View view = (View) this.f103331a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103331a.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo74088a() {
        SparseArray sparseArray = this.f103331a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: e */
    public AbstractC45271m mo75221e() {
        return null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.google.android.material.bottomsheet.C26614b, androidx.appcompat.app.C0242i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        DialogC44308d dVar = new DialogC44308d(context, getTheme());
        AbstractC45271m e = mo75221e();
        if (e != null) {
            dVar.mo75219a(e);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        if (!iVar.mo3566g() && !iVar.mo3567h()) {
            super.show(iVar, str);
        }
    }
}
