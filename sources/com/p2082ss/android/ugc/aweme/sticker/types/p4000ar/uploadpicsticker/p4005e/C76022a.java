package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a */
public final class C76022a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final ImageView f170802a;

    /* renamed from: b */
    public final SimpleDraweeView f170803b;

    /* renamed from: c */
    public final TextView f170804c;

    /* renamed from: d */
    public final TextView f170805d;

    static {
        Covode.recordClassIndex(88966);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76022a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bvh);
        C89219l.m154716b(findViewById, "");
        this.f170802a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bvg);
        C89219l.m154716b(findViewById2, "");
        this.f170803b = (SimpleDraweeView) findViewById2;
        View findViewById3 = view.findViewById(R.id.evh);
        C89219l.m154716b(findViewById3, "");
        this.f170804c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ex5);
        C89219l.m154716b(findViewById4, "");
        this.f170805d = (TextView) findViewById4;
    }
}
