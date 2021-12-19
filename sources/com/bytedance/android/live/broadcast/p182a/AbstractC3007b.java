package com.bytedance.android.live.broadcast.p182a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.a.b */
public abstract class AbstractC3007b extends C10935a {

    /* renamed from: a */
    private HashMap f8821a;

    static {
        Covode.recordClassIndex(3469);
    }

    /* renamed from: a */
    public View mo8167a(int i) {
        if (this.f8821a == null) {
            this.f8821a = new HashMap();
        }
        View view = (View) this.f8821a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f8821a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo8168a() {
        HashMap hashMap = this.f8821a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8168a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }
}
