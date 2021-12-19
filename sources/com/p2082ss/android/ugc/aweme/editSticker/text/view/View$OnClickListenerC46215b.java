package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.b */
final /* synthetic */ class View$OnClickListenerC46215b implements View.OnClickListener {

    /* renamed from: a */
    private final ColorSelectLayout f107653a;

    /* renamed from: b */
    private final C46214a f107654b;

    static {
        Covode.recordClassIndex(54777);
    }

    View$OnClickListenerC46215b(ColorSelectLayout colorSelectLayout, C46214a aVar) {
        this.f107653a = colorSelectLayout;
        this.f107654b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ColorSelectLayout colorSelectLayout = this.f107653a;
        C46214a aVar = this.f107654b;
        colorSelectLayout.mo78437a();
        ColorSelectLayout.m89127a(view, false);
        ((C46214a) view).f107650c = true;
        if (colorSelectLayout.f107623a != null) {
            colorSelectLayout.f107623a.mo78443a(((Integer) view.getTag()).intValue());
        }
        colorSelectLayout.f107624b.mo78470a(aVar);
    }
}
