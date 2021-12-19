package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.cc */
public final /* synthetic */ class View$OnClickListenerC64089cc implements View.OnClickListener {

    /* renamed from: a */
    private final C64048bm f145407a;

    /* renamed from: b */
    private final String f145408b;

    /* renamed from: c */
    private final TuxTextCell f145409c;

    static {
        Covode.recordClassIndex(75533);
    }

    View$OnClickListenerC64089cc(C64048bm bmVar, String str, TuxTextCell tuxTextCell) {
        this.f145407a = bmVar;
        this.f145408b = str;
        this.f145409c = tuxTextCell;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f145407a.mo103619a(this.f145408b, this.f145409c);
    }
}
