package com.p2082ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34801i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.TuxCell */
public class TuxCell<T extends C34801i, S extends AbstractC23293c.AbstractC23296b> extends BaseCell<T> {

    /* renamed from: a */
    public S f83635a;

    static {
        Covode.recordClassIndex(42645);
    }

    /* renamed from: a */
    public S mo62347a(Context context) {
        C89219l.m154721d(context, "");
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.TuxCell$a */
    static final class C35461a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxCell f83636a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f83637b;

        static {
            Covode.recordClassIndex(42646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35461a(TuxCell tuxCell, ViewGroup viewGroup) {
            super(0);
            this.f83636a = tuxCell;
            this.f83637b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View.OnClickListener j;
            C34801i iVar = (C34801i) this.f83636a.f42160d;
            if (!(iVar == null || (j = iVar.mo61515j()) == null)) {
                j.onClick(this.f83636a.itemView);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return mo62345b(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.lp, viewGroup, false);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        S a2 = mo62347a(context);
        this.f83635a = a2;
        if (a2 != null) {
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
            ((TuxTextCell) a).setAccessory(a2);
        }
        S s = this.f83635a;
        if (s != null) {
            s.f55218a = new C35461a(this, viewGroup);
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public void mo62344a(T t) {
        C89219l.m154721d(t, "");
        super.mo23350a((AbstractC34793a) t);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.a2u);
        tuxTextCell.setVariant(t.mo61504e());
        tuxTextCell.setTitle(t.mo61503d());
        tuxTextCell.setSubtitle(t.mo61507g());
        C22999a f = t.mo61506f();
        if (f != null) {
            tuxTextCell.setIcon(f);
        }
        tuxTextCell.setCellEnabled(t.mo61508h());
        tuxTextCell.setWithSeparator(t.mo61500a());
        tuxTextCell.setLoading(t.mo61510i());
    }
}
