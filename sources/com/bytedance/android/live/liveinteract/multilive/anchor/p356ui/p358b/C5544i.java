package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4707f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.i */
public final class C5544i extends AbstractC5536b<C4707f> {

    /* renamed from: a */
    private LiveTextView f14125a;

    static {
        Covode.recordClassIndex(6139);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5536b
    /* renamed from: a */
    public final /* synthetic */ void mo11320a(C4707f fVar) {
        C4707f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        this.f14125a.setText(fVar2.f12437a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5544i(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.exh);
        C89219l.m154716b(findViewById, "");
        this.f14125a = (LiveTextView) findViewById;
    }
}
