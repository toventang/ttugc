package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.k */
public final class C75964k {

    /* renamed from: a */
    C75971q f170622a;

    /* renamed from: b */
    C75971q f170623b;

    /* renamed from: c */
    private SparseArray<C75972r> f170624c;

    /* renamed from: d */
    private final AbstractC75655o f170625d;

    static {
        Covode.recordClassIndex(88906);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119640a(C75971q qVar) {
        C75972r rVar = this.f170624c.get(qVar.f170642c);
        if (qVar.f170640a == 32) {
            Effect value = this.f170625d.mo119302n().mo119323b().getValue();
            if ((C75466g.m132359k(value) || C75466g.m132361m(value) || C75466g.m132363o(value)) && rVar != null) {
                rVar.f170647d = this.f170622a;
                rVar.mo119620a(qVar.f170641b, qVar.f170643d);
                rVar.mo119654b();
                String str = qVar.f170643d;
                int i = qVar.f170641b;
                if (!TextUtils.isEmpty(str) && rVar.f170644a != null) {
                    if (i == 0) {
                        rVar.f170644a.setText(str);
                    } else {
                        rVar.f170644a.setHintText(str);
                    }
                }
            }
        } else if (qVar.f170640a == 33 && rVar.f170644a != null) {
            rVar.f170644a.mo119644e();
        }
    }

    public C75964k(AbstractC75655o oVar, SparseArray<C75972r> sparseArray, ActivityC0945e eVar) {
        this.f170625d = oVar;
        if (eVar != null) {
            this.f170624c = sparseArray;
            ((ARTextResultModule) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ARTextResultModule.class)).mo119610a().observe(eVar, new C75965l(this));
            ((ARTextResultModule) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ARTextResultModule.class)).mo119611b().observe(eVar, new C75966m(this));
        }
    }
}
