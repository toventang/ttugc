package com.p2082ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber */
public final class RatingNumber extends LinearLayout {

    /* renamed from: a */
    public static final C45196a f105367a = new C45196a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f105368b;

    /* renamed from: c */
    private final AbstractC89244h f105369c;

    /* renamed from: d */
    private final AbstractC89244h f105370d;

    static {
        Covode.recordClassIndex(53638);
    }

    public RatingNumber(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RatingNumber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final TuxTextView getDivider() {
        return (TuxTextView) this.f105369c.getValue();
    }

    public final TuxTextView getMaxScore() {
        return (TuxTextView) this.f105370d.getValue();
    }

    public final TuxTextView getScore() {
        return (TuxTextView) this.f105368b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber$a */
    public static final class C45196a {
        static {
            Covode.recordClassIndex(53639);
        }

        private C45196a() {
        }

        public /* synthetic */ C45196a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber$b */
    static final class C45197b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ RatingNumber f105371a;

        static {
            Covode.recordClassIndex(53640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45197b(RatingNumber ratingNumber) {
            super(0);
            this.f105371a = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f105371a.findViewById(R.id.amc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber$c */
    static final class C45198c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ RatingNumber f105372a;

        static {
            Covode.recordClassIndex(53641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45198c(RatingNumber ratingNumber) {
            super(0);
            this.f105372a = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f105372a.findViewById(R.id.ciy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber$d */
    static final class C45199d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ RatingNumber f105373a;

        static {
            Covode.recordClassIndex(53642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45199d(RatingNumber ratingNumber) {
            super(0);
            this.f105373a = ratingNumber;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f105373a.findViewById(R.id.dpx);
        }
    }

    public final void setStyle(int i) {
        int c = C0643b.m2378c(getContext(), R.color.c5);
        getDivider().setTextColor(c);
        getMaxScore().setTextColor(c);
        if (i == 1) {
            getScore().setTextColor(c);
            getScore().setTuxFont(51);
            getDivider().setTuxFont(81);
            getMaxScore().setTuxFont(81);
        } else if (i == 2) {
            getScore().setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            getScore().setTuxFont(42);
            getDivider().setTuxFont(81);
            getMaxScore().setTuxFont(81);
        } else if (i == 3) {
            getScore().setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            getScore().setTuxFont(12);
            getDivider().setTuxFont(71);
            getMaxScore().setTuxFont(71);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RatingNumber(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RatingNumber(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7783);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.qk, this, true);
        this.f105368b = C89250i.m154773a((AbstractC89171a) new C45199d(this));
        this.f105369c = C89250i.m154773a((AbstractC89171a) new C45197b(this));
        this.f105370d = C89250i.m154773a((AbstractC89171a) new C45198c(this));
        setOrientation(0);
        getDivider().setText("/");
        getMaxScore().setText("5");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pc});
        C89219l.m154716b(obtainStyledAttributes, "");
        int i = obtainStyledAttributes.getInt(0, 3);
        obtainStyledAttributes.recycle();
        setStyle(i);
        MethodCollector.m26664o(7783);
    }
}
