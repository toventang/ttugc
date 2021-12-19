package com.bytedance.android.live.publicscreen.impl.game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.model.C6015e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.d */
public final class C5971d extends AbstractC5968a<C6015e> {

    /* renamed from: a */
    TextView f14999a;

    static {
        Covode.recordClassIndex(6581);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5971d(ViewGroup viewGroup) {
        super(R.layout.b9z, viewGroup);
        C89219l.m154721d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.baa);
        C89219l.m154716b(findViewById, "");
        this.f14999a = (TextView) findViewById;
    }
}
