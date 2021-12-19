package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3290j.C56814b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.x */
public abstract class AbstractC78471x extends C56814b {

    /* renamed from: b */
    private HashMap f176349b;

    static {
        Covode.recordClassIndex(91600);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public View mo93985a(int i) {
        if (this.f176349b == null) {
            this.f176349b = new HashMap();
        }
        View view = (View) this.f176349b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f176349b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public void mo93986a() {
        HashMap hashMap = this.f176349b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public abstract void mo122087b();

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo93986a();
    }
}
