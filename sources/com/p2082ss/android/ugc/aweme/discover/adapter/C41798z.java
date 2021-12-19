package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41759c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffect;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.z */
public final class C41798z extends AbstractC39060f<SearchEffect> {

    /* renamed from: a */
    private boolean f97503a = true;

    static {
        Covode.recordClassIndex(49713);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<SearchEffect> list) {
        super.mo62377b_(list);
        aq_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        if (this.f97503a) {
            return super.mo63367c_(view);
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.auh, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41759c(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchEffectViewHolder");
        C41759c cVar = (C41759c) viewHolder;
        Object obj = this.f92236l.get(i);
        C89219l.m154716b(obj, "");
        SearchEffect searchEffect = (SearchEffect) obj;
        C89219l.m154721d(searchEffect, "");
        cVar.f97421a.setText(searchEffect.name());
        if (((long) searchEffect.useCount()) < 0) {
            cVar.f97422b.setVisibility(8);
        } else {
            String a = C53437b.m98615a((long) searchEffect.useCount());
            View view = cVar.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.hj, searchEffect.useCount(), a);
            C89219l.m154716b(quantityString, "");
            cVar.f97422b.setText(quantityString);
        }
        if (TextUtils.isEmpty(searchEffect.hint())) {
            cVar.f97423c.setVisibility(8);
        } else {
            cVar.f97423c.setText(searchEffect.hint());
        }
        UrlModel icon = searchEffect.icon();
        if (icon != null) {
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(icon));
            a2.f49092E = cVar.f97424d;
            a2.mo34186c();
        }
        cVar.itemView.setOnClickListener(new C41759c.View$OnClickListenerC41761b(cVar, searchEffect));
        cVar.f97425e.setOnClickListener(new C41759c.View$OnClickListenerC41762c(cVar, searchEffect));
    }
}
