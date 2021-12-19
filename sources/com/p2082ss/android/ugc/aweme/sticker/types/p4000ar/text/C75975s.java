package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.s */
public final class C75975s {

    /* renamed from: a */
    private SparseArray<C75972r> f170656a;

    /* renamed from: b */
    private C75964k f170657b;

    static {
        Covode.recordClassIndex(88917);
    }

    /* renamed from: a */
    public final void mo119657a() {
        for (int i = 0; i < this.f170656a.size(); i++) {
            int keyAt = this.f170656a.keyAt(i);
            this.f170656a.get(keyAt).mo119655c();
            this.f170656a.get(keyAt).f170654k = false;
        }
    }

    /* renamed from: b */
    public final void mo119660b() {
        for (int i = 0; i < this.f170656a.size(); i++) {
            C75972r rVar = this.f170656a.get(this.f170656a.keyAt(i));
            if (rVar != null && rVar.f170654k) {
                rVar.mo119637a();
            }
        }
    }

    /* renamed from: a */
    public final void mo119659a(Effect effect) {
        if (!effect.getTags().contains("AR")) {
            effect.getTags().contains("text2d");
        }
        C75964k kVar = this.f170657b;
        if (kVar.f170623b != null) {
            kVar.f170622a = kVar.f170623b;
            kVar.f170623b = null;
            kVar.mo119640a(kVar.f170622a);
        }
    }

    public C75975s(ActivityC0945e eVar, AbstractC75655o oVar, AbstractC75955e eVar2, AbstractC84903j jVar) {
        SparseArray<C75972r> sparseArray = new SparseArray<>();
        this.f170656a = sparseArray;
        C75951b bVar = new C75951b(eVar, eVar2, jVar);
        bVar.f170651h = 0;
        sparseArray.put(0, bVar);
        SparseArray<C75972r> sparseArray2 = this.f170656a;
        C75960h hVar = new C75960h(eVar, eVar2, jVar);
        hVar.f170651h = 1;
        sparseArray2.put(1, hVar);
        this.f170657b = new C75964k(oVar, this.f170656a, eVar);
    }

    /* renamed from: a */
    public final void mo119658a(C75972r.AbstractC75974b bVar, Activity activity, ViewGroup viewGroup, AbstractC89171a<Integer> aVar) {
        C75967n aVar2;
        MethodCollector.m26663i(6457);
        for (int i = 0; i < this.f170656a.size(); i++) {
            int keyAt = this.f170656a.keyAt(i);
            if (keyAt == 0) {
                aVar2 = new C75949a((Context) activity, (char) 0);
            } else if (keyAt != 1) {
                aVar2 = new C75967n(activity);
            } else {
                aVar2 = new C75957g((Context) activity, (char) 0);
            }
            aVar2.setTopMarginSupplier(aVar);
            viewGroup.addView(aVar2);
            C75972r rVar = this.f170656a.get(keyAt);
            rVar.mo119621a(aVar2);
            rVar.mo119652a(bVar);
            rVar.mo119656d();
            rVar.f170654k = true;
        }
        MethodCollector.m26664o(6457);
    }
}
