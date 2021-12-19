package com.p2082ss.android.ugc.aweme.setting.page.base;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.setting.page.base.C68262d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.base.SwitchCell */
public abstract class SwitchCell<T extends C68262d> extends PowerCell<T> implements View.OnClickListener {

    /* renamed from: a */
    public Activity f152794a;

    static {
        Covode.recordClassIndex(80459);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.SwitchCell$a */
    public static final class RunnableC68252a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C68262d f152795a;

        /* renamed from: b */
        final /* synthetic */ CommonItemView f152796b;

        /* renamed from: c */
        final /* synthetic */ SwitchCell f152797c;

        static {
            Covode.recordClassIndex(80460);
        }

        RunnableC68252a(C68262d dVar, CommonItemView commonItemView, SwitchCell switchCell) {
            this.f152795a = dVar;
            this.f152796b = commonItemView;
            this.f152797c = switchCell;
        }

        public final void run() {
            this.f152796b.setChecked(this.f152795a.f152812c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo108754a() {
        C68262d dVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (dVar = (C68262d) this.f42160d) != null && commonItemView.mo27138d() != dVar.f152812c) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            if (((CommonItemView) view2).getWindowToken() == null) {
                commonItemView.post(new RunnableC68252a(dVar, commonItemView, this));
            } else {
                commonItemView.setChecked(dVar.f152812c);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f152794a = (Activity) context;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.axo, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        C68262d dVar;
        C68262d dVar2;
        C89219l.m154721d(aVar, "");
        mo108754a();
        View view = this.itemView;
        CommonItemView commonItemView = null;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView2 = (CommonItemView) view;
        if (!(commonItemView2 == null || (dVar2 = (C68262d) this.f42160d) == null || dVar2.f152811b == -1)) {
            commonItemView2.setDesc(commonItemView2.getContext().getText(dVar2.f152811b));
        }
        View view2 = this.itemView;
        if (view2 instanceof CommonItemView) {
            commonItemView = view2;
        }
        CommonItemView commonItemView3 = commonItemView;
        if (!(commonItemView3 == null || (dVar = (C68262d) this.f42160d) == null || dVar.f152810a == -1)) {
            commonItemView3.setLeftText(commonItemView3.getContext().getText(dVar.f152810a));
        }
        this.itemView.setOnClickListener(this);
    }
}
