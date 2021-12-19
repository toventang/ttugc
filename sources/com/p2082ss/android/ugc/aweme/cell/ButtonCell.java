package com.p2082ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.p2082ss.android.ugc.aweme.p2386be.C34795c;
import com.p2082ss.android.ugc.aweme.p2386be.C34801i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.ButtonCell */
public final class ButtonCell extends TuxCell<C34795c, AbstractC23293c.C23297c> {
    static {
        Covode.recordClassIndex(42630);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62348a(C34795c cVar) {
        C89219l.m154721d(cVar, "");
        super.mo62344a((C34801i) cVar);
        AbstractC23293c.C23297c cVar2 = (AbstractC23293c.C23297c) ((TuxCell) this).f83635a;
        if (cVar2 != null) {
            cVar2.mo37955a(cVar.f82145c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.ButtonCell$a */
    static final class View$OnClickListenerC35452a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ButtonCell f83621a;

        static {
            Covode.recordClassIndex(42631);
        }

        View$OnClickListenerC35452a(ButtonCell buttonCell) {
            this.f83621a = buttonCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34795c cVar = (C34795c) this.f83621a.f42160d;
            if (cVar != null && (onClickListener = cVar.f82146d) != null) {
                View view2 = this.f83621a.itemView;
                C89219l.m154716b(view2, "");
                onClickListener.onClick(view2.findViewById(R.id.a2u));
            }
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.cell.TuxCell
    /* renamed from: a */
    public final /* synthetic */ AbstractC23293c.C23297c mo62347a(Context context) {
        C89219l.m154721d(context, "");
        AbstractC23293c.C23297c cVar = new AbstractC23293c.C23297c(context);
        cVar.f55220c.setOnClickListener(new View$OnClickListenerC35452a(this));
        return cVar;
    }
}
