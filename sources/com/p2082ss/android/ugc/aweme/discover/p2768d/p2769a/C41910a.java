package com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41597aa;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.d.a.a */
public final class C41910a extends AbstractC39056b<List<? extends Object>> {

    /* renamed from: b */
    public static final C41911a f97776b = new C41911a((byte) 0);

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97777a;

    /* renamed from: com.ss.android.ugc.aweme.discover.d.a.a$b */
    public enum EnumC41912b {
        TYPE_NULL,
        TYPE_NONE,
        TYPE_CLEAR_ALL;

        static {
            Covode.recordClassIndex(49838);
        }
    }

    static {
        Covode.recordClassIndex(49836);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.d.a.a$a */
    public static final class C41911a {
        static {
            Covode.recordClassIndex(49837);
        }

        private C41911a() {
        }

        public /* synthetic */ C41911a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C41597aa aaVar = new C41597aa(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.auu, viewGroup, false), this.f97777a);
        C89219l.m154716b(aaVar, "");
        return aaVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends Object> list, int i) {
        List<? extends Object> list2 = list;
        C89219l.m154721d(list2, "");
        return list2.get(i) instanceof EnumC41912b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends Object> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends Object> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        Object obj = list3.get(i);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryAdditionDelegate.HistoryAddition");
        EnumC41912b bVar = (EnumC41912b) obj;
        C41597aa aaVar = (C41597aa) viewHolder;
        aaVar.f97021b = bVar;
        if (C41597aa.C415992.f97025a[bVar.ordinal()] != 1) {
            aaVar.itemView.setVisibility(8);
        } else {
            aaVar.itemView.setVisibility(0);
        }
    }
}
