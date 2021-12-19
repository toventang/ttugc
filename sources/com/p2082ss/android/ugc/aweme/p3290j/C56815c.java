package com.p2082ss.android.ugc.aweme.p3290j;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.j.c */
public class C56815c extends Fragment {

    /* renamed from: a */
    public boolean f129386a;

    /* renamed from: b */
    private HashMap f129387b;

    static {
        Covode.recordClassIndex(66695);
    }

    /* renamed from: a */
    public View mo93985a(int i) {
        if (this.f129387b == null) {
            this.f129387b = new HashMap();
        }
        View view = (View) this.f129387b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129387b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo93986a() {
        HashMap hashMap = this.f129387b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f129386a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f129386a = false;
        mo93986a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f129386a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f129386a = true;
    }
}
