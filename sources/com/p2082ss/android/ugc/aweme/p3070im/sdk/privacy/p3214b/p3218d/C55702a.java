package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3218d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.EnumC23277b;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a */
public final class C55702a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TuxTextCell f127056a;

    static {
        Covode.recordClassIndex(65485);
    }

    /* renamed from: a */
    public final void mo92579a(boolean z) {
        AbstractC23293c.AbstractC23296b accessory = this.f127056a.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AbstractC23293c.AbstractC23299e) accessory).mo37959c(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55702a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view;
        this.f127056a = tuxTextCell;
        tuxTextCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tuxTextCell.setInset(EnumC23277b.PADDING_16);
        Context context = tuxTextCell.getContext();
        C89219l.m154716b(context, "");
        tuxTextCell.setAccessory(new AbstractC23293c.C23308i(context));
    }
}
