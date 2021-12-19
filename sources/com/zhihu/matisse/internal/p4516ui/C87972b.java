package com.zhihu.matisse.internal.p4516ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4514b.C87947b;
import com.zhihu.matisse.internal.p4514b.C87949c;
import com.zhihu.matisse.internal.p4516ui.p4517a.C87961a;
import com.zhihu.matisse.internal.p4516ui.widget.C87986c;

/* renamed from: com.zhihu.matisse.internal.ui.b */
public class C87972b extends Fragment implements C87947b.AbstractC87948a, C87961a.AbstractC87964b, C87961a.AbstractC87966d {

    /* renamed from: a */
    public C87961a f199803a;

    /* renamed from: b */
    private final C87947b f199804b = new C87947b();

    /* renamed from: c */
    private RecyclerView f199805c;

    /* renamed from: d */
    private AbstractC87973a f199806d;

    /* renamed from: e */
    private C87961a.AbstractC87964b f199807e;

    /* renamed from: f */
    private C87961a.AbstractC87966d f199808f;

    /* renamed from: com.zhihu.matisse.internal.ui.b$a */
    public interface AbstractC87973a {
        static {
            Covode.recordClassIndex(103992);
        }

        /* renamed from: c */
        C87949c mo142508c();
    }

    static {
        Covode.recordClassIndex(103991);
    }

    @Override // com.zhihu.matisse.internal.p4514b.C87947b.AbstractC87948a
    /* renamed from: a */
    public final void mo142452a() {
        this.f199803a.mo142507b(null);
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.AbstractC87964b
    /* renamed from: b */
    public final void mo142500b() {
        C87961a.AbstractC87964b bVar = this.f199807e;
        if (bVar != null) {
            bVar.mo142500b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f199804b.mo142451b();
    }

    @Override // com.zhihu.matisse.internal.p4514b.C87947b.AbstractC87948a
    /* renamed from: a */
    public final void mo142453a(Cursor cursor) {
        this.f199803a.mo142507b(cursor);
    }

    /* renamed from: a */
    public static C87972b m153039a(Album album) {
        C87972b bVar = new C87972b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC87973a) {
            this.f199806d = (AbstractC87973a) context;
            if (context instanceof C87961a.AbstractC87964b) {
                this.f199807e = (C87961a.AbstractC87964b) context;
            }
            if (context instanceof C87961a.AbstractC87966d) {
                this.f199808f = (C87961a.AbstractC87966d) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Album album = (Album) getArguments().getParcelable("extra_album");
        C87961a aVar = new C87961a(getContext(), this.f199806d.mo142508c(), this.f199805c);
        this.f199803a = aVar;
        aVar.f199788a = this;
        this.f199803a.f199789b = this;
        int i = 1;
        this.f199805c.setHasFixedSize(true);
        C87956c cVar = C87956c.C87957a.f199768a;
        if (cVar.f199760n > 0) {
            int round = Math.round(((float) getContext().getResources().getDisplayMetrics().widthPixels) / ((float) cVar.f199760n));
            if (round != 0) {
                i = round;
            }
        } else {
            i = cVar.f199759m;
        }
        RecyclerView recyclerView = this.f199805c;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(i));
        this.f199805c.mo4402a(new C87986c(i, getResources().getDimensionPixelSize(R.dimen.ol)));
        this.f199805c.setAdapter(this.f199803a);
        this.f199804b.mo142449a(getActivity(), this);
        this.f199804b.mo142450a(album, cVar.f199757k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f199805c = (RecyclerView) view.findViewById(R.id.dgz);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a13, viewGroup, false);
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.AbstractC87966d
    /* renamed from: a */
    public final void mo142501a(Album album, Item item, int i) {
        C87961a.AbstractC87966d dVar = this.f199808f;
        if (dVar != null) {
            dVar.mo142501a((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }
}
