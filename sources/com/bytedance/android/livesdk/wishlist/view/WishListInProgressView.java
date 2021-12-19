package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishListInProgressView extends ConstraintLayout {

    /* renamed from: g */
    public List<? extends C8860x.C8861a> f27692g;

    /* renamed from: h */
    public int f27693h;

    /* renamed from: i */
    private final AbstractC89244h f27694i;

    /* renamed from: j */
    private final AbstractC89244h f27695j;

    /* renamed from: k */
    private final AbstractC89244h f27696k;

    static {
        Covode.recordClassIndex(13230);
    }

    public WishListInProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final HSImageView getMGiftIcon() {
        return (HSImageView) this.f27694i.getValue();
    }

    public final ProgressBar getMWishListProgressView() {
        return (ProgressBar) this.f27696k.getValue();
    }

    public final LiveTextView getMWishesProgressText() {
        return (LiveTextView) this.f27695j.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListInProgressView$a */
    static final class C11569a extends AbstractC89220m implements AbstractC89171a<HSImageView> {

        /* renamed from: a */
        final /* synthetic */ WishListInProgressView f27697a;

        static {
            Covode.recordClassIndex(13231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11569a(WishListInProgressView wishListInProgressView) {
            super(0);
            this.f27697a = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HSImageView invoke() {
            return this.f27697a.findViewById(R.id.bkx);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListInProgressView$b */
    static final class C11570b extends AbstractC89220m implements AbstractC89171a<ProgressBar> {

        /* renamed from: a */
        final /* synthetic */ WishListInProgressView f27698a;

        static {
            Covode.recordClassIndex(13232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11570b(WishListInProgressView wishListInProgressView) {
            super(0);
            this.f27698a = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProgressBar invoke() {
            return this.f27698a.findViewById(R.id.fjf);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListInProgressView$c */
    static final class C11571c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ WishListInProgressView f27699a;

        static {
            Covode.recordClassIndex(13233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11571c(WishListInProgressView wishListInProgressView) {
            super(0);
            this.f27699a = wishListInProgressView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f27699a.findViewById(R.id.f7a);
        }
    }

    private /* synthetic */ WishListInProgressView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListInProgressView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bfk, this, true);
        this.f27694i = C89250i.m154773a((AbstractC89171a) new C11569a(this));
        this.f27695j = C89250i.m154773a((AbstractC89171a) new C11571c(this));
        this.f27696k = C89250i.m154773a((AbstractC89171a) new C11570b(this));
        this.f27692g = new ArrayList();
        this.f27693h = -1;
    }
}
