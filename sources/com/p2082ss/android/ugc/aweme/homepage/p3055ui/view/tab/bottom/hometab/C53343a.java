package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.hometab;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.a */
public final class C53343a {
    static {
        Covode.recordClassIndex(62905);
    }

    /* renamed from: a */
    public static C33931ar m98412a(Context context) {
        String string;
        if (!C58071d.m104915i() || !C16048b.m29633a().mo25421a(true, "for_you_new_translations", false)) {
            string = context.getResources().getString(R.string.d0a);
        } else {
            string = context.getResources().getString(R.string.ca7);
        }
        return new C33931ar(context, "HOME", string, R.id.chx, 0, true, 0, 0);
    }
}
