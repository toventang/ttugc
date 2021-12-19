package com.p2082ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.SwitchCell */
public final class SwitchCell extends BaseCell<C34800h> {

    /* renamed from: a */
    public CommonItemView f83630a;

    static {
        Covode.recordClassIndex(42641);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cell.SwitchCell$c */
    public static final class RunnableC35460c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SwitchCell f83633a;

        /* renamed from: b */
        final /* synthetic */ C34800h f83634b;

        static {
            Covode.recordClassIndex(42644);
        }

        RunnableC35460c(SwitchCell switchCell, C34800h hVar) {
            this.f83633a = switchCell;
            this.f83634b = hVar;
        }

        public final void run() {
            CommonItemView commonItemView = this.f83633a.f83630a;
            if (commonItemView != null) {
                commonItemView.setChecked(this.f83634b.f82200c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cell.SwitchCell$a */
    public static final class View$OnClickListenerC35458a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SwitchCell f83631a;

        static {
            Covode.recordClassIndex(42642);
        }

        View$OnClickListenerC35458a(SwitchCell switchCell) {
            this.f83631a = switchCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34800h hVar = (C34800h) this.f83631a.f42160d;
            if (hVar != null && (onClickListener = hVar.f82202e) != null) {
                onClickListener.onClick(this.f83631a.itemView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cell.SwitchCell$b */
    public static final class View$OnClickListenerC35459b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SwitchCell f83632a;

        static {
            Covode.recordClassIndex(42643);
        }

        View$OnClickListenerC35459b(SwitchCell switchCell) {
            this.f83632a = switchCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34800h hVar = (C34800h) this.f83632a.f42160d;
            if (hVar != null && (onClickListener = hVar.f82205h) != null) {
                onClickListener.onClick(this.f83632a.itemView);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.lo, viewGroup, false);
        this.f83630a = (CommonItemView) a.findViewById(R.id.abk);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C34800h hVar) {
        float f;
        C89219l.m154721d(hVar, "");
        super.mo23350a((AbstractC34793a) hVar);
        CommonItemView commonItemView = this.f83630a;
        if (commonItemView != null) {
            commonItemView.setLeftText(hVar.f82201d);
            commonItemView.setRightText(hVar.f82208k);
            commonItemView.setDesc(hVar.f82206i);
            if (hVar.f82207j) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            commonItemView.setAlpha(f);
            commonItemView.setEnabled(hVar.f82207j);
        }
        if (hVar.f82207j) {
            this.itemView.setOnClickListener(new View$OnClickListenerC35458a(this));
        } else {
            this.itemView.setOnClickListener(new View$OnClickListenerC35459b(this));
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (view.getWindowToken() == null) {
            this.itemView.post(new RunnableC35460c(this, hVar));
        } else {
            CommonItemView commonItemView2 = this.f83630a;
            if (commonItemView2 != null) {
                commonItemView2.setChecked(hVar.f82200c);
            }
        }
        CommonItemView commonItemView3 = this.f83630a;
        if (commonItemView3 != null) {
            commonItemView3.setOnCheckedChangeListener(hVar.f82203f);
        }
    }
}
