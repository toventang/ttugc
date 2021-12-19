package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.a.q */
public final class C51473q extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(60732);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51473q(ViewGroup viewGroup) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2i, viewGroup, false));
        C89219l.m154721d(viewGroup, "");
    }

    /* renamed from: a */
    public final void mo86957a(int i) {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((TuxTextView) view.findViewById(R.id.f63)).setText(i);
    }
}
