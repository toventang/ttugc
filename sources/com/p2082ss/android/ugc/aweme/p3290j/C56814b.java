package com.p2082ss.android.ugc.aweme.p3290j;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.j.b */
public class C56814b extends C56815c {

    /* renamed from: b */
    private HashMap f129385b;

    static {
        Covode.recordClassIndex(66694);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public View mo93985a(int i) {
        if (this.f129385b == null) {
            this.f129385b = new HashMap();
        }
        View view = (View) this.f129385b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129385b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public void mo93986a() {
        HashMap hashMap = this.f129385b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo93986a();
    }
}
