package com.p2082ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.p2082ss.android.ugc.aweme.p2386be.C34799g;
import com.p2082ss.android.ugc.aweme.p2386be.C34801i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.RadioCell */
public final class RadioCell extends TuxCell<C34799g, AbstractC23293c.C23308i> {
    static {
        Covode.recordClassIndex(42638);
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.RadioCell$b */
    static final class C35457b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RadioCell f83629a;

        static {
            Covode.recordClassIndex(42640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35457b(RadioCell radioCell) {
            super(0);
            this.f83629a = radioCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            View.OnClickListener onClickListener;
            C34799g gVar = (C34799g) this.f83629a.f42160d;
            if (!(gVar == null || (onClickListener = gVar.f82199m) == null)) {
                View view = this.f83629a.itemView;
                C89219l.m154716b(view, "");
                onClickListener.onClick(view.findViewById(R.id.a2u));
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62348a(C34799g gVar) {
        C89219l.m154721d(gVar, "");
        super.mo62344a((C34801i) gVar);
        AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) ((TuxCell) this).f83635a;
        if (eVar != null) {
            eVar.mo37959c(gVar.f82189c);
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.cell.TuxCell
    /* renamed from: a */
    public final /* synthetic */ AbstractC23293c.C23308i mo62347a(Context context) {
        C89219l.m154721d(context, "");
        AbstractC23293c.C23308i iVar = new AbstractC23293c.C23308i(context);
        iVar.mo37957a(new C35456a(this));
        iVar.mo37958a(new C35457b(this));
        return iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.RadioCell$a */
    static final class C35456a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ RadioCell f83628a;

        static {
            Covode.recordClassIndex(42639);
        }

        C35456a(RadioCell radioCell) {
            this.f83628a = radioCell;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
            C34799g gVar = (C34799g) this.f83628a.f42160d;
            if (gVar != null && (onCheckedChangeListener = gVar.f82190d) != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }
}
