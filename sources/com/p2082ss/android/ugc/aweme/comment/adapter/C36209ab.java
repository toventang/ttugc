package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34492e;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p2082ss.android.ugc.aweme.comment.util.C37208m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.ab */
public final class C36209ab extends AbstractC34492e<GifEmoji> {

    /* renamed from: d */
    private final AbstractC36212ae f85523d;

    static {
        Covode.recordClassIndex(43475);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34492e
    /* renamed from: a */
    public final JediViewHolder<? extends AbstractC20467g, GifEmoji> mo60934a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new SearchGifViewHolder(viewGroup, this.f85523d);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        Context context;
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        if (!(viewGroup == null || (context = viewGroup.getContext()) == null)) {
            View view = a_.itemView;
            if (!(view instanceof DmtStatusView)) {
                view = null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            if (dmtStatusView != null) {
                dmtStatusView.setLayoutParams(new RecyclerView.C1367j(-2, -1));
                TuxTextView a = C37208m.m75197a(context);
                a.setTextColorRes(R.attr.bg);
                a.setText(R.string.bmk);
                TuxTextView a2 = C37208m.m75197a(context);
                a2.setTextColorRes(R.attr.bg);
                a2.setText(R.string.b3f);
                dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(context).mo27406b(a2).mo27408c(a));
            }
        }
        C89219l.m154716b(a_, "");
        return a_;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C36209ab(AbstractC1204m mVar, AbstractC36212ae aeVar) {
        super(mVar, new C36210ac(), (C20438e.AbstractC20440b) null);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aeVar, "");
        this.f85523d = aeVar;
    }

    public /* synthetic */ C36209ab(AbstractC1204m mVar, AbstractC36212ae aeVar, byte b) {
        this(mVar, aeVar);
    }
}
