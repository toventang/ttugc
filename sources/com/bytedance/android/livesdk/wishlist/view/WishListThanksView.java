package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.wishlist.p665c.C11540a;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishListThanksView extends ConstraintLayout {

    /* renamed from: g */
    public EnumC11574a f27703g;

    /* renamed from: h */
    private final AbstractC89244h f27704h;

    /* renamed from: i */
    private final AbstractC89244h f27705i;

    /* renamed from: j */
    private final AbstractC89244h f27706j;

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListThanksView$a */
    public enum EnumC11574a {
        FULFILLED,
        THANKS;

        static {
            Covode.recordClassIndex(13239);
        }
    }

    static {
        Covode.recordClassIndex(13238);
    }

    public WishListThanksView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final ImageView getMAvatarView() {
        return (ImageView) this.f27704h.getValue();
    }

    public final ConstraintLayout getMFulfilledLayout() {
        return (ConstraintLayout) this.f27705i.getValue();
    }

    public final ConstraintLayout getMThanksLayout() {
        return (ConstraintLayout) this.f27706j.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListThanksView$b */
    static final class C11575b extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ WishListThanksView f27710a;

        static {
            Covode.recordClassIndex(13240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11575b(WishListThanksView wishListThanksView) {
            super(0);
            this.f27710a = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f27710a.findViewById(R.id.fj4);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListThanksView$c */
    static final class C11576c extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ WishListThanksView f27711a;

        static {
            Covode.recordClassIndex(13241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11576c(WishListThanksView wishListThanksView) {
            super(0);
            this.f27711a = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f27711a.findViewById(R.id.c47);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListThanksView$d */
    static final class C11577d extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ WishListThanksView f27712a;

        static {
            Covode.recordClassIndex(13242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11577d(WishListThanksView wishListThanksView) {
            super(0);
            this.f27712a = wishListThanksView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f27712a.findViewById(R.id.c7a);
        }
    }

    private /* synthetic */ WishListThanksView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListThanksView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5104);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bfi, this, true);
        Bitmap a = C11540a.m20372a(BitmapFactory.decodeResource(C3966y.m9655a(), 2131234292), C3966y.m9653a(6.0f));
        C89219l.m154716b(a, "");
        ((ImageView) findViewById(R.id.bku)).setImageBitmap(a);
        this.f27703g = EnumC11574a.FULFILLED;
        this.f27704h = C11831d.m20835a(new C11575b(this));
        this.f27705i = C11831d.m20835a(new C11576c(this));
        this.f27706j = C11831d.m20835a(new C11577d(this));
        MethodCollector.m26664o(5104);
    }
}
