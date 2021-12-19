package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.C17299b;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.utils.C80594ix;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ar */
final /* synthetic */ class C42686ar implements AbstractC1214u {

    /* renamed from: a */
    private final C42681ap f99560a;

    static {
        Covode.recordClassIndex(50790);
    }

    C42686ar(C42681ap apVar) {
        this.f99560a = apVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C42681ap apVar = this.f99560a;
        C67782c cVar = (C67782c) obj;
        C67782c.C67783a aVar = cVar.f151913d;
        if (aVar != null) {
            apVar.f99543l = TextUtils.equals("dark", cVar.f151910a);
            int i = aVar.f151915a;
            if (i == 1) {
                Integer a = C80594ix.m139734a(apVar.f99540e);
                if (a != null) {
                    apVar.f99544m = a.intValue();
                }
                Integer a2 = C80594ix.m139734a(apVar.f99539d);
                if (a2 != null) {
                    apVar.f99545n = a2.intValue();
                }
            } else if (i == 2 && aVar.f151916b != null) {
                float floatValue = aVar.f151916b.floatValue();
                apVar.f99540e.setBackgroundColor(((Integer) apVar.f99546o.evaluate(floatValue, Integer.valueOf(apVar.f99544m), Integer.valueOf(apVar.mo72889a(cVar)))).intValue());
                apVar.f99539d.setBackgroundColor(((Integer) apVar.f99546o.evaluate(floatValue, Integer.valueOf(apVar.f99545n), Integer.valueOf(cVar.f151911b))).intValue());
                if (floatValue >= 0.5f && floatValue <= 1.0f) {
                    apVar.f99539d.setSelectedTabIndicatorColor(apVar.mo72888a());
                    apVar.f99539d.setCustomTabViewResId(apVar.mo72892b());
                    apVar.f99539d.setupWithViewPager(apVar.f99538c);
                    C17299b.m32026a(apVar.f99539d);
                }
            }
        }
    }
}
