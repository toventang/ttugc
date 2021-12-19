package com.p2082ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.widget.FlowLayout;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterGroup */
public final class ReviewFilterGroup extends FrameLayout {

    /* renamed from: a */
    public final FlowLayout f105383a;

    /* renamed from: b */
    private C45211c f105384b;

    /* renamed from: c */
    private AbstractC89183m<? super Integer, ? super ReviewFilterStruct, C89391z> f105385c;

    static {
        Covode.recordClassIndex(53649);
    }

    public ReviewFilterGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final FlowLayout getFlow() {
        return this.f105383a;
    }

    public final C45211c getLastClickView() {
        return this.f105384b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super java.lang.Integer, ? super com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct, h.z>, h.f.a.m<java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct, h.z> */
    public final AbstractC89183m<Integer, ReviewFilterStruct, C89391z> getListener() {
        return this.f105385c;
    }

    public final void setLastClickView(C45211c cVar) {
        this.f105384b = cVar;
    }

    public final void setListener(AbstractC89183m<? super Integer, ? super ReviewFilterStruct, C89391z> mVar) {
        this.f105385c = mVar;
    }

    public final void setOnSelectedChangeListener(AbstractC89183m<? super Integer, ? super ReviewFilterStruct, C89391z> mVar) {
        this.f105385c = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterGroup$a */
    public static final class View$OnClickListenerC45205a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f105386a;

        /* renamed from: b */
        final /* synthetic */ ReviewFilterGroup f105387b;

        static {
            Covode.recordClassIndex(53650);
        }

        public View$OnClickListenerC45205a(int i, ReviewFilterGroup reviewFilterGroup) {
            this.f105386a = i;
            this.f105387b = reviewFilterGroup;
        }

        public final void onClick(View view) {
            C45211c lastClickView;
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterItemView");
            if ((!C89219l.m154714a(this.f105387b.getLastClickView(), view)) && (lastClickView = this.f105387b.getLastClickView()) != null) {
                lastClickView.mo76321a();
            }
            C45211c cVar = (C45211c) view;
            this.f105387b.setLastClickView(cVar);
            if (cVar.f105405c) {
                cVar.mo76321a();
            } else {
                cVar.f105405c = true;
                cVar.setBackgroundResource(R.drawable.zg);
                cVar.f105403a.setTextColor(C0643b.m2378c(cVar.getContext(), R.color.bh));
                cVar.f105404b.setTextColor(C0643b.m2378c(cVar.getContext(), R.color.bh));
            }
            if (cVar.f105405c) {
                AbstractC89183m<Integer, ReviewFilterStruct, C89391z> listener = this.f105387b.getListener();
                if (listener != null) {
                    Integer valueOf = Integer.valueOf(this.f105386a);
                    Object tag = cVar.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct");
                    listener.invoke(valueOf, tag);
                    return;
                }
                return;
            }
            AbstractC89183m<Integer, ReviewFilterStruct, C89391z> listener2 = this.f105387b.getListener();
            if (listener2 != null) {
                listener2.invoke(-1, null);
            }
        }
    }

    private /* synthetic */ ReviewFilterGroup(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReviewFilterGroup(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8150);
        FlowLayout flowLayout = new FlowLayout(context, (AttributeSet) null, 6);
        flowLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        flowLayout.setGravity(-1);
        this.f105383a = flowLayout;
        addView(flowLayout);
        MethodCollector.m26664o(8150);
    }
}
