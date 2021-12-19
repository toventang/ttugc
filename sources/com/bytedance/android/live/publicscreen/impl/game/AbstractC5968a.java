package com.bytedance.android.live.publicscreen.impl.game;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.a */
public abstract class AbstractC5968a<MESSAGE extends AbstractC5873h> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(6578);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5968a(int i, ViewGroup viewGroup) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false));
        C89219l.m154721d(viewGroup, "");
    }
}
