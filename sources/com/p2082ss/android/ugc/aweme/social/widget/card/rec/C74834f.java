package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74752a;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74764h;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74809a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.f */
public final class C74834f extends AbstractC1483t<AbstractC17641a, RecyclerView.ViewHolder> implements AbstractC74841h {

    /* renamed from: d */
    public static final C74835a f168197d = new C74835a((byte) 0);

    /* renamed from: b */
    public final C74743a f168198b;

    /* renamed from: c */
    public final C74765i f168199c;

    /* renamed from: e */
    private final AbstractC89244h f168200e = C89250i.m154773a((AbstractC89171a) new C74838d(this));

    /* renamed from: f */
    private final Map<Integer, Class<? extends PowerCell<?>>> f168201f = new LinkedHashMap();

    /* renamed from: g */
    private View f168202g;

    static {
        Covode.recordClassIndex(87692);
    }

    /* renamed from: a */
    private final C74842i m131403a() {
        return (C74842i) this.f168200e.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m131402a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.f$a */
    public static final class C74835a {
        static {
            Covode.recordClassIndex(87693);
        }

        private C74835a() {
        }

        public /* synthetic */ C74835a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.f$d */
    static final class C74838d extends AbstractC89220m implements AbstractC89171a<C74842i> {

        /* renamed from: a */
        final /* synthetic */ C74834f f168205a;

        static {
            Covode.recordClassIndex(87696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74838d(C74834f fVar) {
            super(0);
            this.f168205a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74842i invoke() {
            return new C74842i(this.f168205a.f168198b, this.f168205a.f168199c, this.f168205a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: a */
    public final void mo117894a(View view) {
        C89219l.m154721d(view, "");
        this.f168202g = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) mo5017a(i).hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: a */
    public final void mo117895a(Map<Integer, Class<? extends PowerCell<?>>> map) {
        C89219l.m154721d(map, "");
        this.f168201f.putAll(map);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C74832e) {
            ((C74832e) viewHolder).f168196a.mo28073l();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: b */
    public final void mo117896b(List<? extends AbstractC17641a> list) {
        C89219l.m154721d(list, "");
        C74764h hVar = this.f168199c.f168054c;
        if (hVar != null && hVar.f168048a == EnumC74754a.RECTANGLE) {
            list = C89070n.m154585g((Collection) list);
            list.add(new C74752a(-2));
        }
        mo5018a(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        AbstractC17641a aVar = (AbstractC17641a) mo5017a(i);
        if (aVar instanceof C74808c) {
            C74808c cVar = (C74808c) aVar;
            return C74783e.m131298a(cVar.f168131a, cVar.mo117859a()).hashCode();
        } else if (aVar instanceof C74825a) {
            C74764h hVar = this.f168199c.f168054c;
            if (hVar == null) {
                C89219l.m154715b();
            }
            return C74783e.m131299a(hVar).hashCode();
        } else if (aVar instanceof C74752a) {
            return ((C74752a) aVar).f168025a;
        } else {
            return -996;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.f$b */
    public static final class C74836b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C74834f f168203a;

        static {
            Covode.recordClassIndex(87694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74836b(C74834f fVar, View view) {
            super(view);
            this.f168203a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.f$c */
    public static final class C74837c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f168204a;

        static {
            Covode.recordClassIndex(87695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74837c(ViewGroup viewGroup, View view) {
            super(view);
            this.f168204a = viewGroup;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74834f(C74743a aVar, C74765i iVar) {
        super(new C74814c());
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        this.f168198b = aVar;
        this.f168199c = iVar;
        m131403a().mo117899c();
        m131403a().mo117897a().mo117909a((AbstractC89124d<? super AbstractC17700f<Integer>>) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        AbstractC17641a aVar = (AbstractC17641a) mo5017a(i);
        if ((viewHolder instanceof C74832e) && (aVar instanceof C74825a)) {
            C74825a aVar2 = (C74825a) aVar;
            C89219l.m154721d(aVar2, "");
            RecommendUserCell<? extends C74825a> recommendUserCell = ((C74832e) viewHolder).f168196a;
            C89219l.m154721d(aVar2, "");
            recommendUserCell.mo23350a((Object) aVar2);
        } else if ((viewHolder instanceof C74812b) && (aVar instanceof C74808c)) {
            C89219l.m154721d(aVar, "");
            ((C74812b) viewHolder).f168141a.mo117854b(aVar);
        } else if (viewHolder instanceof C74809a) {
            C74809a aVar3 = (C74809a) viewHolder;
            aVar3.mo117866a().mo37867a();
            AbstractC89568bz unused = C89624i.m155555a(aVar3.f168134a, null, null, new C74809a.C74811b(aVar3, null), 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7 A[Catch:{ Exception -> 0x010d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.RecyclerView.ViewHolder m131402a(com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74834f r6, android.view.ViewGroup r7, int r8) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74834f.m131402a(com.ss.android.ugc.aweme.social.widget.card.rec.f, android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
