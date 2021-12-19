package com.p2082ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34794b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.BasicTuxCell */
public final class BasicTuxCell extends BaseCell<C34794b> {

    /* renamed from: a */
    private CommonItemView f83619a;

    static {
        Covode.recordClassIndex(42628);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.itemView.setOnClickListener(new View$OnClickListenerC35451a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.cell.BasicTuxCell$a */
    static final class View$OnClickListenerC35451a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BasicTuxCell f83620a;

        static {
            Covode.recordClassIndex(42629);
        }

        View$OnClickListenerC35451a(BasicTuxCell basicTuxCell) {
            this.f83620a = basicTuxCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34794b bVar = (C34794b) this.f83620a.f42160d;
            if (bVar != null && (onClickListener = bVar.f82139f) != null) {
                onClickListener.onClick(this.f83620a.itemView);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C34794b bVar) {
        float f;
        C89219l.m154721d(bVar, "");
        super.mo23350a((AbstractC34793a) bVar);
        CommonItemView commonItemView = this.f83619a;
        if (commonItemView != null) {
            commonItemView.setLeftText(bVar.f82136c);
            commonItemView.setDesc(bVar.f82137d);
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (bVar.f82138e) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            view.setAlpha(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ll, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        this.f83619a = (CommonItemView) a;
        C89219l.m154716b(a, "");
        return a;
    }
}
