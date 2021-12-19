package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76147c;
import com.p2082ss.android.ugc.tools.view.widget.View$OnTouchListenerC85048f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.h */
public final class C76187h implements AbstractC76147c {

    /* renamed from: a */
    private final View f171154a;

    static {
        Covode.recordClassIndex(89137);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76147c
    /* renamed from: a */
    public final void mo119902a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f171154a.setOnClickListener(onClickListener);
        C89219l.m154721d(this.f171154a, "");
    }

    public C76187h(View view) {
        C89219l.m154721d(view, "");
        this.f171154a = view;
        view.setOnTouchListener(new View$OnTouchListenerC85048f());
    }
}
