package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.a.c */
public final class C39534c {

    /* renamed from: a */
    public static final C39534c f93238a = new C39534c();

    private C39534c() {
    }

    static {
        Covode.recordClassIndex(47240);
    }

    /* renamed from: a */
    public static final void m80328a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            String[] stringArray = C17867d.m33078a().getResources().getStringArray(R.array.h);
            C89219l.m154716b(stringArray, "");
            List i = C89064i.m154508i(stringArray);
            if (!C13603b.m24435a((Collection) i)) {
                List<String> j = C39608b.m80424j();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && (!i.contains(tag) || j.contains(tag))) {
                            childAt.setVisibility(8);
                        }
                    }
                }
            }
        }
    }
}
