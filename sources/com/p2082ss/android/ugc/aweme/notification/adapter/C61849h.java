package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.h */
public final class C61849h extends AbstractC39060f<BaseNotice> {

    /* renamed from: a */
    public int f140413a;

    /* renamed from: b */
    private final HashMap<String, BaseNotice> f140414b = new HashMap<>(this.f140413a);

    /* renamed from: c */
    private final int f140415c = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: d */
    private final AbstractC61766f f140416d;

    /* renamed from: e */
    private final AbstractC61766f f140417e;

    static {
        Covode.recordClassIndex(72585);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<BaseNotice> list) {
        if (list != null) {
            list = this.f140416d.mo99867a(list);
        }
        super.mo62376b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<BaseNotice> list) {
        if (list != null) {
            list = this.f140416d.mo99867a(list);
        }
        super.mo62377b_(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (((BaseNotice) mo63369e().get(i)).templateNotice != null) {
            return -10000;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.cf_();
        }
        C56386j.m102364b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.mo100081d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c5);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c);
        tuxTextView.setText(R.string.cer);
        Context context2 = viewGroup.getContext();
        C89219l.m154716b(context2, "");
        TuxTextView tuxTextView2 = new TuxTextView(context2, null, 0, 6);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c);
        tuxTextView2.setText(R.string.cfm);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(tuxTextView2));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i != -10000) {
            AbstractC61766f fVar = this.f140416d;
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            return fVar.mo99865a(viewGroup);
        }
        AbstractC61766f fVar2 = this.f140417e;
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        return fVar2.mo99865a(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        BaseNotice baseNotice = (BaseNotice) this.f92236l.get(i);
        int i2 = 0;
        if (i <= this.f140413a - 1) {
            this.f140414b.get(baseNotice.nid);
        }
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.leftMargin;
            if (i == 0) {
                i2 = this.f140415c;
            }
            marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        if (mo60936c(i) != -10000) {
            AbstractC61766f fVar = this.f140416d;
            if (viewHolder == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(baseNotice, "");
            fVar.mo99868a(viewHolder, baseNotice, i, this.f140414b);
            return;
        }
        AbstractC61766f fVar2 = this.f140417e;
        if (viewHolder == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(baseNotice, "");
        fVar2.mo99868a(viewHolder, baseNotice, i, this.f140414b);
    }

    public C61849h(AbstractC61766f fVar, AbstractC61766f fVar2, int i) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        this.f140416d = fVar;
        this.f140417e = fVar2;
        this.f140413a = i;
    }
}
