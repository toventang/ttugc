package com.p2082ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.LabelCell */
public final class LabelCell extends BaseCell<C34798f> {

    /* renamed from: a */
    private CommonItemView f83625a;

    static {
        Covode.recordClassIndex(42635);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cell.LabelCell$a */
    public static final class View$OnClickListenerC35454a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LabelCell f83626a;

        static {
            Covode.recordClassIndex(42636);
        }

        View$OnClickListenerC35454a(LabelCell labelCell) {
            this.f83626a = labelCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34798f fVar = (C34798f) this.f83626a.f42160d;
            if (fVar != null && (onClickListener = fVar.f82183j) != null) {
                onClickListener.onClick(this.f83626a.itemView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cell.LabelCell$b */
    public static final class View$OnClickListenerC35455b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LabelCell f83627a;

        static {
            Covode.recordClassIndex(42637);
        }

        View$OnClickListenerC35455b(LabelCell labelCell) {
            this.f83627a = labelCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C34798f fVar = (C34798f) this.f83627a.f42160d;
            if (fVar != null && (onClickListener = fVar.f82184k) != null) {
                onClickListener.onClick(this.f83627a.itemView);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ln, viewGroup, false);
        this.f83625a = (CommonItemView) a.findViewById(R.id.abk);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C34798f fVar) {
        float f;
        SimpleDraweeView ivwLeft;
        C22999a aVar;
        C89219l.m154721d(fVar, "");
        super.mo23350a((AbstractC34793a) fVar);
        CommonItemView commonItemView = this.f83625a;
        if (commonItemView != null) {
            commonItemView.setLeftText(fVar.f82179f);
            commonItemView.mo27132a(fVar.f82176c, 0);
            commonItemView.setDesc(fVar.f82181h);
            if (fVar.f82182i) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            commonItemView.setAlpha(f);
            commonItemView.setEnabled(fVar.f82182i);
            if (fVar.f82178e != null) {
                commonItemView.setLeftIconImageUrl(fVar.f82178e);
            } else {
                CommonItemView commonItemView2 = this.f83625a;
                if (!(commonItemView2 == null || (ivwLeft = commonItemView2.getIvwLeft()) == null || (aVar = fVar.f82180g) == null)) {
                    Context context = ivwLeft.getContext();
                    C89219l.m154716b(context, "");
                    C23001b a = aVar.mo37368a(context);
                    ivwLeft.setVisibility(0);
                    ivwLeft.setImageDrawable(a);
                }
            }
        }
        if (fVar.f82182i) {
            this.itemView.setOnClickListener(new View$OnClickListenerC35454a(this));
        } else {
            this.itemView.setOnClickListener(new View$OnClickListenerC35455b(this));
        }
        if (fVar.f82177d) {
            CommonItemView commonItemView3 = this.f83625a;
            if (commonItemView3 != null) {
                commonItemView3.mo27134b();
                return;
            }
            return;
        }
        CommonItemView commonItemView4 = this.f83625a;
        if (commonItemView4 != null) {
            commonItemView4.mo27136c();
        }
    }
}
