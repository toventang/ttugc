package com.bytedance.android.live.liveinteract.multilive.p341a.p345d;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.m */
public abstract class AbstractC5439m extends C10935a {

    /* renamed from: a */
    private HashMap f14005a;

    static {
        Covode.recordClassIndex(6034);
    }

    /* renamed from: j */
    public void mo11235j() {
        HashMap hashMap = this.f14005a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo11235j();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }
}
