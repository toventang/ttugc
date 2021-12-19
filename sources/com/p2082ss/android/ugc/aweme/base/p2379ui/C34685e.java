package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.e */
public class C34685e extends AbstractC34586a {

    /* renamed from: a */
    private HashMap f81942a;

    static {
        Covode.recordClassIndex(41672);
    }

    /* renamed from: a */
    public View mo61343a(int i) {
        if (this.f81942a == null) {
            this.f81942a = new HashMap();
        }
        View view = (View) this.f81942a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f81942a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public void mo61344e() {
        HashMap hashMap = this.f81942a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }
}
