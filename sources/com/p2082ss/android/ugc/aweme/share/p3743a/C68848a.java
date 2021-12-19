package com.p2082ss.android.ugc.aweme.share.p3743a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.experiment.C46971gf;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56014g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.a.a */
public final class C68848a extends C55974b {

    /* renamed from: b */
    private final Context f153970b;

    /* renamed from: c */
    private final SharePanelViewModel f153971c;

    static {
        Covode.recordClassIndex(81149);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return super.getItemCount();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68848a(Context context, SharePanelViewModel sharePanelViewModel) {
        super(sharePanelViewModel);
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePanelViewModel, "");
        this.f153970b = context;
        this.f153971c = sharePanelViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int dimensionPixelOffset;
        C89219l.m154721d(viewHolder, "");
        super.onBindViewHolder(viewHolder, i);
        int i2 = 0;
        if (!C46971gf.m90249b() || i != 0) {
            dimensionPixelOffset = this.f153970b.getResources().getDimensionPixelOffset(R.dimen.sf);
            if (viewHolder instanceof C56014g) {
                i2 = this.f153970b.getResources().getDimensionPixelOffset(R.dimen.sa);
            }
        } else {
            dimensionPixelOffset = this.f153970b.getResources().getDimensionPixelOffset(R.dimen.sc);
        }
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        C23163i.m43668b(view, Integer.valueOf(dimensionPixelOffset), 0, Integer.valueOf(i2), 0, false, 16);
    }
}
