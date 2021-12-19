package com.p2082ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.themechange.base.C77792a;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import dmt.p4542av.video.C88292p;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.au */
final /* synthetic */ class View$OnClickListenerC46293au implements View.OnClickListener {

    /* renamed from: a */
    private final C46267ac f107928a;

    /* renamed from: b */
    private final List f107929b;

    /* renamed from: c */
    private final C77792a f107930c;

    static {
        Covode.recordClassIndex(54870);
    }

    View$OnClickListenerC46293au(C46267ac acVar, List list, C77792a aVar) {
        this.f107928a = acVar;
        this.f107929b = list;
        this.f107930c = aVar;
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        ClickAgent.onClick(view);
        C46267ac acVar = this.f107928a;
        List list = this.f107929b;
        C77792a aVar = this.f107930c;
        C88292p value = acVar.f107876d.getValue();
        if (value == null || value.f200341g != 0) {
            int intValue = ((Integer) view.getTag()).intValue();
            ((EffectCategoryResponse) list.get(intValue)).getKey();
            if (acVar.f107874b.captionStruct == null || intValue != acVar.f107849J.getCount() - 1 || !acVar.mo78751a()) {
                acVar.f107893u.setCurrentItem(intValue);
                if (acVar.f107849J.f108067a != null && (acVar.f107849J.f108067a instanceof C46392y)) {
                    if (acVar.f107874b.captionStruct == null) {
                        z = true;
                        if (acVar.f107862W.f107781b) {
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    ((C46392y) acVar.f107849J.f108067a).mo78879a(z2, z);
                }
                if (C89219l.m154714a((Object) "motion", (Object) ((EffectCategoryResponse) list.get(intValue)).getKey()) && acVar.f107867ab && acVar.mo78760e(true).booleanValue()) {
                    aVar.mo121366a(false);
                    acVar.f107867ab = false;
                    return;
                }
                return;
            }
            C85041d.m146229c(acVar.f107851L, R.string.xs).mo129984b();
        }
    }
}
