package com.p2082ss.android.ugc.aweme.cell;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.cell.DisclosureCell */
public final class DisclosureCell extends TuxCell<C34796d, AbstractC23293c.C23302f> {

    /* renamed from: b */
    private TuxSpinner f83622b;

    /* renamed from: j */
    private View f83623j;

    static {
        Covode.recordClassIndex(42632);
    }

    /* renamed from: a */
    private final View m72496a() {
        View view;
        C34796d dVar = (C34796d) this.f42160d;
        if ((dVar == null || (view = dVar.f82157e) == null) && (view = this.f83622b) == null) {
            C89219l.m154710a("spinner");
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        View findViewById = ((TuxTextCell) view.findViewById(R.id.a2u)).findViewById(R.id.er9).findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById, "");
        this.f83623j = findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.DisclosureCell$a */
    static final class View$OnClickListenerC35453a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisclosureCell f83624a;

        static {
            Covode.recordClassIndex(42633);
        }

        View$OnClickListenerC35453a(DisclosureCell disclosureCell) {
            this.f83624a = disclosureCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34796d dVar = (C34796d) this.f83624a.f42160d;
            if (dVar != null && (onClickListener = dVar.f82155c) != null) {
                View view2 = this.f83624a.itemView;
                C89219l.m154716b(view2, "");
                onClickListener.onClick(view2.findViewById(R.id.a2u));
            }
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.cell.TuxCell
    /* renamed from: a */
    public final /* synthetic */ AbstractC23293c.C23302f mo62347a(Context context) {
        C89219l.m154721d(context, "");
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 0, 6);
        tuxSpinner.mo37899a(R.raw.icon_spinner_thin, R.attr.bj);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        layoutParams.gravity = 17;
        tuxSpinner.setLayoutParams(layoutParams);
        tuxSpinner.setVisibility(8);
        this.f83622b = tuxSpinner;
        AbstractC23293c.C23302f fVar = new AbstractC23293c.C23302f(context);
        fVar.mo37962a(new View$OnClickListenerC35453a(this));
        return fVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x0082;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62348a(com.p2082ss.android.ugc.aweme.p2386be.C34796d r6) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.cell.DisclosureCell.mo62348a(com.ss.android.ugc.aweme.be.d):void");
    }
}
