package com.bytedance.android.live.liveinteract.multilive.p341a.p348g;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3933f;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.multilive.p341a.p346e.C5440a;
import com.bytedance.android.live.liveinteract.p256a.p258b.p259a.AbstractC4380b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.b */
public final class C5446b extends AbstractC4380b<C5440a> {

    /* renamed from: a */
    private final LiveTextView f14019a;

    static {
        Covode.recordClassIndex(6041);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5446b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ejq);
        C89219l.m154716b(findViewById, "");
        this.f14019a = (LiveTextView) findViewById;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.p256a.p258b.p259a.AbstractC4380b
    /* renamed from: a */
    public final /* synthetic */ void mo10141a(C5440a aVar) {
        C5440a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        this.f14019a.setText(C3933f.m9582a(R.string.e3b, Integer.valueOf(aVar2.f14006a)));
    }
}
