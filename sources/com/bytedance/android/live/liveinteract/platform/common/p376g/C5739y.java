package com.bytedance.android.live.liveinteract.platform.common.p376g;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4703b;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.y */
public final class C5739y {

    /* renamed from: a */
    public final HashSet<String> f14560a = new HashSet<>();

    /* renamed from: b */
    private final RecyclerView f14561b;

    static {
        Covode.recordClassIndex(6337);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.y$a */
    public final class C5740a extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(6338);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C5740a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            List<?> list;
            EnumC4442m mVar;
            C89219l.m154721d(recyclerView, "");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager == null) {
                    C89219l.m154715b();
                }
                int n = linearLayoutManager.mo4374n();
                int l = linearLayoutManager.mo4372l();
                RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                if (!(adapter instanceof C89399f)) {
                    adapter = null;
                }
                C89399f fVar = (C89399f) adapter;
                if (fVar != null && (list = fVar.f203060b) != null) {
                    if (i2 == 0) {
                        if (l <= n) {
                            while (l < list.size()) {
                                Object obj = list.get(l);
                                if (!(obj instanceof C4703b)) {
                                    obj = null;
                                }
                                C4703b bVar = (C4703b) obj;
                                if (bVar != null) {
                                    mVar = bVar.f12430b;
                                } else {
                                    mVar = null;
                                }
                                if (mVar == EnumC4442m.RECOMMEND_INVITE) {
                                    C5739y.this.f14560a.add(bVar.f12429a.getIdStr());
                                }
                                if (l != n) {
                                    l++;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (n < list.size() && (list.get(n) instanceof C4703b)) {
                        Object obj2 = list.get(n);
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.InteractUserItem");
                        C4703b bVar2 = (C4703b) obj2;
                        if (bVar2.f12430b == EnumC4442m.RECOMMEND_INVITE) {
                            C5739y.this.f14560a.add(bVar2.f12429a.getIdStr());
                        }
                    }
                }
            }
        }
    }

    public C5739y(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f14561b = recyclerView;
        recyclerView.mo4405a(new C5740a());
    }
}
