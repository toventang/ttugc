package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.p2475a.C36002a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.p2475a.C36003b;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41897c;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.h */
public final class C35712h extends C41897c<MusicSearchHistory> implements AbstractC35831a.AbstractC35834a {

    /* renamed from: a */
    public static final C35713a f84244a = new C35713a((byte) 0);

    /* renamed from: b */
    private RecyclerView f84245b;

    static {
        Covode.recordClassIndex(42944);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.a.h$a */
    public static final class C35713a {
        static {
            Covode.recordClassIndex(42945);
        }

        private C35713a() {
        }

        public /* synthetic */ C35713a(byte b) {
            this();
        }
    }

    public C35712h() {
        mo71056a(new C36003b());
        mo71056a(new C36002a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f84245b = recyclerView;
        C35836c g = C35836c.m73228g();
        if (g.f84594c == null) {
            g.f84594c = new ArrayList();
        }
        g.f84594c.add(new WeakReference<>(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f84245b = null;
        C35836c g = C35836c.m73228g();
        if (g.f84594c != null) {
            Iterator<WeakReference<AbstractC35831a.AbstractC35834a>> it = g.f84594c.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC35831a.AbstractC35834a> next = it.next();
                if (next != null && next.get() == this) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a.AbstractC35834a
    /* renamed from: a */
    public final void mo62759a(List<MusicSearchHistory> list) {
        C89219l.m154721d(list, "");
        this.f97749j.clear();
        for (MusicSearchHistory musicSearchHistory : list) {
            this.f97749j.add(musicSearchHistory);
            if (this.f97749j.size() >= 10) {
                break;
            }
        }
        if (this.f97749j.size() == 0) {
            RecyclerView recyclerView = this.f84245b;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        } else if (this.f97749j.size() >= 3) {
            this.f97749j.add(new MusicSearchHistory("", Integer.MAX_VALUE));
        }
        notifyDataSetChanged();
    }
}
