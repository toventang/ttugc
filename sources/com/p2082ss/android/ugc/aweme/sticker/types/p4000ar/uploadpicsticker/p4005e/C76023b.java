package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b */
public final class C76023b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public ObjectAnimator f170806a;

    /* renamed from: b */
    public final ImageView f170807b;

    static {
        Covode.recordClassIndex(88967);
    }

    /* renamed from: a */
    public final void mo119719a() {
        ObjectAnimator objectAnimator = this.f170806a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76023b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bxi);
        C89219l.m154716b(findViewById, "");
        this.f170807b = (ImageView) findViewById;
    }
}
