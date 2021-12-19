package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41790w;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bd */
public final class C42748bd extends AbstractC42751bf<SearchChallenge> implements C42741ba.AbstractC42742a<SearchChallenge> {

    /* renamed from: a */
    public int f99715a;

    /* renamed from: j */
    private final boolean f99716j = false;

    static {
        Covode.recordClassIndex(50852);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba.AbstractC42742a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo73011a(ViewGroup viewGroup) {
        return C41790w.m83742a(viewGroup, "challenge");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba.AbstractC42742a
    /* renamed from: a */
    public final void mo73012a(RecyclerView.ViewHolder viewHolder, C42680ao<SearchChallenge> aoVar) {
        C41790w wVar = (C41790w) viewHolder;
        wVar.f97483h = "general_search";
        wVar.mo70880a(this.f99725g);
        wVar.mo70947a((SearchChallenge) aoVar.f99533a, aoVar.f99534b.f151311f);
        wVar.f97487o = this.f99715a;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf
    /* renamed from: a */
    public final void mo73020a(List<SearchChallenge> list, C67568r rVar, boolean z) {
        super.mo73020a(list, rVar, z);
        mo73025b(list, rVar, z);
    }

    public C42748bd(View view, Context context, boolean z, AbstractC42751bf.AbstractC42753a aVar) {
        super(view, context, aVar);
        this.f99722d.setText(R.string.a_r);
        mo73023a(new C42741ba(this));
    }
}
