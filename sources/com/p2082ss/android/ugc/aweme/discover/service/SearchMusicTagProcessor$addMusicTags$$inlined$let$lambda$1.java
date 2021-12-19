package com.p2082ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.service.SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 */
public final class SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f99147a;

    /* renamed from: b */
    final /* synthetic */ Context f99148b;

    /* renamed from: c */
    final /* synthetic */ View.OnClickListener f99149c;

    /* renamed from: d */
    final /* synthetic */ List f99150d;

    static {
        Covode.recordClassIndex(50614);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        super.mo4363e(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4347a(int i, int i2) {
        super.mo4347a(i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        return super.mo4312a(i, oVar, sVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(RecyclerView recyclerView, Context context, View.OnClickListener onClickListener, List list) {
        super(0, false);
        this.f99147a = recyclerView;
        this.f99148b = context;
        this.f99149c = onClickListener;
        this.f99150d = list;
    }
}
