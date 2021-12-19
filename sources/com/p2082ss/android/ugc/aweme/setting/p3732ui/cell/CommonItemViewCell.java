package com.p2082ss.android.ugc.aweme.setting.p3732ui.cell;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.core.widget.C0820e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.cell.BaseCell;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.CommonItemViewCell */
public final class CommonItemViewCell extends BaseCell<C68546a> {

    /* renamed from: a */
    private CommonItemView f153445a;

    static {
        Covode.recordClassIndex(80833);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.itemView.setOnClickListener(new View$OnClickListenerC68580a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.CommonItemViewCell$a */
    static final class View$OnClickListenerC68580a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemViewCell f153446a;

        static {
            Covode.recordClassIndex(80834);
        }

        View$OnClickListenerC68580a(CommonItemViewCell commonItemViewCell) {
            this.f153446a = commonItemViewCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C68546a aVar = (C68546a) this.f153446a.f42160d;
            if (aVar != null && (onClickListener = aVar.f153368e) != null) {
                onClickListener.onClick(this.f153446a.itemView);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.axp, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        this.f153445a = (CommonItemView) a;
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C68546a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo23350a((AbstractC34793a) aVar);
        CommonItemView commonItemView = this.f153445a;
        if (commonItemView != null) {
            commonItemView.setLeftText(aVar.f153367d);
            commonItemView.setLeftIcon(aVar.f153366c);
            commonItemView.setRightIconRes(aVar.f153372i);
            commonItemView.setRightText(aVar.f153373j);
            if (aVar.f153374k != null) {
                commonItemView.setBackground(aVar.f153374k);
            }
            if (aVar.f153384u) {
                commonItemView.setBackgroundColor(aVar.f153375l);
            }
            if (aVar.f153371h) {
                commonItemView.mo27134b();
            } else {
                commonItemView.mo27136c();
            }
            if (aVar.f153376m) {
                C0820e.m2895a(commonItemView.getIvwLeft(), ColorStateList.valueOf(C0643b.m2378c(commonItemView.getContext(), aVar.f153377n)));
            }
            if (aVar.f153378o) {
                SimpleDraweeView ivwLeft = commonItemView.getIvwLeft();
                C89219l.m154716b(ivwLeft, "");
                ivwLeft.setVisibility(aVar.f153379p);
            }
            if (aVar.f153380q != null) {
                commonItemView.getIvwLeft().setImageDrawable(aVar.f153380q);
            }
            if (aVar.f153381r) {
                commonItemView.mo27133a(aVar.f153382s, aVar.f153383t);
            }
            if (aVar.f153369f != null) {
                commonItemView.setTag(aVar.f153369f);
            }
        }
    }
}
