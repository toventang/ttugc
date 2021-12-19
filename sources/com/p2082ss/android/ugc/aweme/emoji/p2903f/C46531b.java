package com.p2082ss.android.ugc.aweme.emoji.p2903f;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46514m;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46517n;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46451e;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.f.b */
public final class C46531b extends AbstractC46451e implements AbstractC46453g {

    /* renamed from: c */
    private RecyclerView f108481c;

    /* renamed from: d */
    private C46527a f108482d;

    /* renamed from: e */
    private C46533d f108483e;

    /* renamed from: f */
    private RecyclerView.AbstractC1362i f108484f = this.f108484f;

    /* renamed from: g */
    private View f108485g = this.f108485g;

    /* renamed from: h */
    private final AbstractC46454h f108486h;

    static {
        Covode.recordClassIndex(55118);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final C46514m mo78983a() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final void mo78984a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: b */
    public final C46517n mo78985b() {
        return null;
    }

    public C46531b(AbstractC46454h hVar, ViewGroup viewGroup, List<String> list, RecyclerView.AbstractC1361h hVar2, int i) {
        super(viewGroup);
        this.f108486h = hVar;
        View view = this.f108227b;
        this.f108481c = (RecyclerView) view.findViewById(R.id.auh);
        this.f108483e = new C46533d(viewGroup.getContext());
        C46527a aVar = new C46527a(hVar, this.f108485g);
        this.f108482d = aVar;
        this.f108481c.setAdapter(aVar);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C46447a aVar2 = new C46447a();
            aVar2.f108223c = str;
            arrayList.add(aVar2);
        }
        C46527a aVar3 = this.f108482d;
        aVar3.f108468a.clear();
        aVar3.f108468a.addAll(arrayList);
        aVar3.notifyDataSetChanged();
        RecyclerView.AbstractC1362i iVar = this.f108484f;
        if (iVar == null) {
            view.getContext();
            iVar = new GridLayoutManager(i);
        }
        this.f108481c.mo4415b(hVar2);
        this.f108481c.setLayoutManager(iVar);
    }
}
