package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23688g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.n */
public final /* synthetic */ class View$OnClickListenerC37922n implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89563a;

    static {
        Covode.recordClassIndex(45374);
    }

    View$OnClickListenerC37922n(C37899g gVar) {
        this.f89563a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37899g gVar = this.f89563a;
        C23684c a = C38701br.m78510a(gVar.f89514o, "AdChoices");
        if (!(a == null || C13603b.m24435a((Collection) a.clickList))) {
            C38703bs.m78519a(a);
            for (C23688g gVar2 : a.clickList) {
                if (!TextUtils.isEmpty(gVar2.clickThrough)) {
                    C38767w.m78635a(gVar.f89467ae, gVar.f89514o, gVar2.clickThrough, (String) null);
                    return;
                }
            }
        }
    }
}
