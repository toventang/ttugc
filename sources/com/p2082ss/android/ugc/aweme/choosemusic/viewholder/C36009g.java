package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.g */
public final /* synthetic */ class C36009g implements AbstractC89172b {

    /* renamed from: a */
    private final AbstractC35998a f85039a;

    static {
        Covode.recordClassIndex(43255);
    }

    C36009g(AbstractC35998a aVar) {
        this.f85039a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        MethodCollector.m26663i(2);
        AbstractC35998a aVar = this.f85039a;
        View view = (View) obj;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        boolean a = C80471gb.m139483a(aVar.f85020p.getContext());
        if (a) {
            layoutParams.addRule(7, aVar.f85005a.getId());
        } else {
            layoutParams.addRule(5, aVar.f85005a.getId());
        }
        layoutParams.addRule(6, aVar.f85005a.getId());
        aVar.f85020p.addView(view, layoutParams);
        Integer valueOf = Integer.valueOf(a ? 1 : 0);
        MethodCollector.m26664o(2);
        return valueOf;
    }
}
