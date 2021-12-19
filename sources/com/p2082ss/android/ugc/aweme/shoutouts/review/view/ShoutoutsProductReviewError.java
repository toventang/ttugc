package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError */
public final class ShoutoutsProductReviewError extends ConstraintLayout {

    /* renamed from: g */
    private final AbstractC89244h f167700g;

    static {
        Covode.recordClassIndex(87387);
    }

    public ShoutoutsProductReviewError(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final LinearLayout getLlRetry() {
        return (LinearLayout) this.f167700g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError$a */
    static final class C74577a extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductReviewError f167701a;

        static {
            Covode.recordClassIndex(87388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74577a(ShoutoutsProductReviewError shoutoutsProductReviewError) {
            super(0);
            this.f167701a = shoutoutsProductReviewError;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f167701a.findViewById(R.id.ce_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError$b */
    static final class View$OnClickListenerC74578b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f167702a;

        static {
            Covode.recordClassIndex(87389);
        }

        View$OnClickListenerC74578b(AbstractC89171a aVar) {
            this.f167702a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f167702a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setRetryListener(AbstractC89171a<C89391z> aVar) {
        getLlRetry().setOnClickListener(new View$OnClickListenerC74578b(aVar));
    }

    private /* synthetic */ ShoutoutsProductReviewError(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsProductReviewError(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f167700g = C89250i.m154773a((AbstractC89171a) new C74577a(this));
    }
}
