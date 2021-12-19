package com.bytedance.ies.dmt.p1194ui.carousel;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel */
public final class HorizontalCarousel extends RecyclerView {
    static {
        Covode.recordClassIndex(19626);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel$a */
    static final class RunnableC17169a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HorizontalCarousel f40913a;

        static {
            Covode.recordClassIndex(19627);
        }

        RunnableC17169a(HorizontalCarousel horizontalCarousel) {
            this.f40913a = horizontalCarousel;
        }

        public final void run() {
            this.f40913a.mo27122r();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel$b */
    public static final class C17170b extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ HorizontalCarousel f40914a;

        static {
            Covode.recordClassIndex(19628);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f40914a.mo5599q();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17170b(HorizontalCarousel horizontalCarousel) {
            this.f40914a = horizontalCarousel;
        }
    }

    /* renamed from: q */
    public final void mo5599q() {
        post(new RunnableC17172d(this));
    }

    /* renamed from: r */
    public final void mo27122r() {
        post(new RunnableC17173e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel$d */
    public static final class RunnableC17172d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HorizontalCarousel f40916a;

        static {
            Covode.recordClassIndex(19630);
        }

        RunnableC17172d(HorizontalCarousel horizontalCarousel) {
            this.f40916a = horizontalCarousel;
        }

        public final void run() {
            View childAt = this.f40916a.getChildAt(0);
            if (childAt != null) {
                int width = (this.f40916a.getWidth() / 2) - (childAt.getWidth() / 2);
                this.f40916a.setPadding(width, 0, width, 0);
                this.f40916a.mo4413b(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel$e */
    public static final class RunnableC17173e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HorizontalCarousel f40917a;

        static {
            Covode.recordClassIndex(19631);
        }

        RunnableC17173e(HorizontalCarousel horizontalCarousel) {
            this.f40917a = horizontalCarousel;
        }

        public final void run() {
            Iterator it = C89271h.m154766a(0, this.f40917a.getChildCount()).iterator();
            while (it.hasNext()) {
                View childAt = this.f40917a.getChildAt(((AbstractC89040af) it).mo143429a());
                C89219l.m154716b(childAt, "");
                int left = (childAt.getLeft() + childAt.getRight()) / 2;
                HorizontalCarousel horizontalCarousel = this.f40917a;
                double d = (double) left;
                double left2 = (double) ((horizontalCarousel.getLeft() + horizontalCarousel.getRight()) / 2);
                Double.isNaN(d);
                Double.isNaN(left2);
                float pow = (((float) (Math.pow(2.718281828459045d, (-Math.pow(d - left2, 2.0d)) / (Math.pow(150.0d, 2.0d) * 2.0d)) * 1.0d)) * 0.45f) + 0.55f;
                childAt.setScaleX(pow);
                childAt.setScaleY(pow);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel$c */
    public static final class C17171c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ HorizontalCarousel f40915a;

        static {
            Covode.recordClassIndex(19629);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17171c(HorizontalCarousel horizontalCarousel) {
            this.f40915a = horizontalCarousel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f40915a.mo27122r();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(RecyclerView.AbstractC1350a<?> aVar) {
        super.setAdapter(aVar);
        if (aVar != null) {
            getContext();
            setLayoutManager(new LinearLayoutManager(0, false));
            mo5599q();
            new Handler().postDelayed(new RunnableC17169a(this), 300);
            aVar.registerAdapterDataObserver(new C17170b(this));
        }
        mo4405a(new C17171c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }
}
