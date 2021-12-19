package com.p2082ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar */
public final class RatingStar extends LinearLayout {

    /* renamed from: a */
    public static final C45200a f105374a = new C45200a((byte) 0);

    /* renamed from: b */
    private float f105375b;

    /* renamed from: c */
    private int f105376c;

    /* renamed from: d */
    private int f105377d;

    static {
        Covode.recordClassIndex(53643);
    }

    public RatingStar(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RatingStar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar$a */
    public static final class C45200a {
        static {
            Covode.recordClassIndex(53644);
        }

        private C45200a() {
        }

        public /* synthetic */ C45200a(byte b) {
            this();
        }
    }

    public final float getRate() {
        return this.f105375b;
    }

    public final int getStarSize() {
        return this.f105377d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar$d */
    public static final class C45203d implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f105380a;

        static {
            Covode.recordClassIndex(53647);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar.C45203d.C452041 */

                /* renamed from: a */
                public int f105381a;

                /* renamed from: b */
                final /* synthetic */ C45203d f105382b;

                static {
                    Covode.recordClassIndex(53648);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f105381a < this.f105382b.f105380a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f105382b.f105380a;
                    int i = this.f105381a;
                    this.f105381a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f105382b = r1;
                }
            };
        }

        public C45203d(ViewGroup viewGroup) {
            this.f105380a = viewGroup;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar$b */
    public static final class C45201b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RatingStar f105378a;

        static {
            Covode.recordClassIndex(53645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45201b(RatingStar ratingStar) {
            super(1);
            this.f105378a = ratingStar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_star_fill;
            aVar2.f54434d = Integer.valueOf(C0643b.m2378c(this.f105378a.getContext(), R.color.a));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar$c */
    public static final class C45202c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RatingStar f105379a;

        static {
            Covode.recordClassIndex(53646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45202c(RatingStar ratingStar) {
            super(1);
            this.f105379a = ratingStar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_star_fill;
            aVar2.f54434d = Integer.valueOf(C0643b.m2378c(this.f105379a.getContext(), R.color.k));
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRate(float r11) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar.setRate(float):void");
    }

    public final void setStarSize(int i) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f105377d = C89241a.m154730a(TypedValue.applyDimension(1, (float) i, system.getDisplayMetrics()));
        if (i <= 12) {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            this.f105376c = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
        }
        if (i >= 16) {
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            this.f105376c = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        }
        for (View view : new C45203d(this)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.width = this.f105377d;
                marginLayoutParams2.height = this.f105377d;
                marginLayoutParams2.leftMargin = this.f105376c;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    private final void m87803a(ImageView imageView, int i) {
        if (i == 2) {
            C22999a a = C23005c.m43393a(new C45201b(this));
            Context context = getContext();
            C89219l.m154716b(context, "");
            imageView.setImageDrawable(a.mo37368a(context));
        } else if (i == 0) {
            C22999a a2 = C23005c.m43393a(new C45202c(this));
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            imageView.setImageDrawable(a2.mo37368a(context2));
        } else if (i == 1) {
            imageView.setImageResource(R.drawable.zi);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RatingStar(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RatingStar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        MethodCollector.m26663i(8172);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f105376c = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f105377d = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
        do {
            ImageView imageView = new ImageView(context);
            int i2 = this.f105377d;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            if (getChildCount() != 0) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = this.f105376c;
                    imageView.setLayoutParams(marginLayoutParams);
                }
            }
            addView(imageView);
            i++;
        } while (i < 5);
        if (isInEditMode()) {
            setRate((float) ((Math.random() * 10.0d) / 2.0d));
        }
        MethodCollector.m26664o(8172);
    }
}
