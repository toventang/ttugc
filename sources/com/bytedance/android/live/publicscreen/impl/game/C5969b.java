package com.bytedance.android.live.publicscreen.impl.game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.b */
public final class C5969b extends AbstractC5968a<C5993b> {

    /* renamed from: a */
    TextView f14996a;

    /* renamed from: b */
    TextView f14997b;

    /* renamed from: c */
    HSImageView f14998c;

    static {
        Covode.recordClassIndex(6579);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5969b(ViewGroup viewGroup) {
        super(R.layout.b9x, viewGroup);
        C89219l.m154721d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.a48);
        C89219l.m154716b(findViewById, "");
        this.f14996a = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.fa1);
        C89219l.m154716b(findViewById2, "");
        this.f14997b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.f__);
        C89219l.m154716b(findViewById3, "");
        this.f14998c = (HSImageView) findViewById3;
    }
}
