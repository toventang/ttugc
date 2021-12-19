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
import com.p2082ss.android.ugc.aweme.setting.page.base.C68261c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.base.RightTextCell */
public abstract class RightTextCell<T extends C68261c> extends PowerCell<T> implements View.OnClickListener {

    /* renamed from: a */
    public Activity f152793a;

    static {
        Covode.recordClassIndex(80458);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    public void mo108752a() {
        C68261c cVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (cVar = (C68261c) this.f42160d) != null && cVar.f152807b != -1) {
            commonItemView.mo27132a(commonItemView.getContext().getText(cVar.f152807b), 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f152793a = (Activity) context;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.axn, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        C68261c cVar;
        C68261c cVar2;
        C89219l.m154721d(aVar, "");
        mo108752a();
        View view = this.itemView;
        CommonItemView commonItemView = null;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView2 = (CommonItemView) view;
        if (!(commonItemView2 == null || (cVar2 = (C68261c) this.f42160d) == null || cVar2.f152808c == -1)) {
            commonItemView2.setDesc(commonItemView2.getContext().getText(cVar2.f152808c));
        }
        View view2 = this.itemView;
        if (view2 instanceof CommonItemView) {
            commonItemView = view2;
        }
        CommonItemView commonItemView3 = commonItemView;
        if (!(commonItemView3 == null || (cVar = (C68261c) this.f42160d) == null)) {
            if (cVar.f152806a != -1) {
                commonItemView3.setLeftText(commonItemView3.getContext().getText(cVar.f152806a));
            }
            if (cVar.f152809d != -1) {
                commonItemView3.setLeftIcon(cVar.f152809d);
            }
        }
        this.itemView.setOnClickListener(this);
    }
}
