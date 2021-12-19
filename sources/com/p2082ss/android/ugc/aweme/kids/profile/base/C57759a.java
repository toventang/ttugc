package com.p2082ss.android.ugc.aweme.kids.profile.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.C23669c;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.base.a */
public class C57759a extends AbstractC34586a {

    /* renamed from: a */
    private HashMap f131770a;

    /* renamed from: d */
    public C23669c f131771d;

    static {
        Covode.recordClassIndex(67746);
    }

    /* renamed from: a */
    public View mo95084a(int i) {
        if (this.f131770a == null) {
            this.f131770a = new HashMap();
        }
        View view = (View) this.f131770a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f131770a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo95085b() {
        HashMap hashMap = this.f131770a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo95085b();
    }
}
