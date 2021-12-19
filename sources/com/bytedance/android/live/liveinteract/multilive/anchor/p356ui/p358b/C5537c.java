package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p357a.C5534b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.c */
public final class C5537c extends AbstractC5536b<C5534b> {

    /* renamed from: a */
    public final AbstractC5542g f14119a;

    /* renamed from: b */
    private final LiveTextView f14120b;

    static {
        Covode.recordClassIndex(6132);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.c$a */
    static final class View$OnClickListenerC5538a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5537c f14121a;

        static {
            Covode.recordClassIndex(6133);
        }

        View$OnClickListenerC5538a(C5537c cVar) {
            this.f14121a = cVar;
        }

        public final void onClick(View view) {
            this.f14121a.f14119a.mo11306b();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5536b
    /* renamed from: a */
    public final /* synthetic */ void mo11320a(C5534b bVar) {
        C5534b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        if (bVar2.f14118a == 1) {
            this.f14120b.setVisibility(8);
        } else {
            this.f14120b.setVisibility(0);
        }
        this.f14120b.setOnClickListener(new View$OnClickListenerC5538a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5537c(View view, AbstractC5542g gVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(gVar, "");
        this.f14119a = gVar;
        View findViewById = view.findViewById(R.id.y0);
        C89219l.m154716b(findViewById, "");
        this.f14120b = (LiveTextView) findViewById;
    }
}
