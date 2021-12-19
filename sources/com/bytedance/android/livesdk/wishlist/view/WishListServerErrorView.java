package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.livesdk.wishlist.p663a.C11513a;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishListServerErrorView extends ConstraintLayout {

    /* renamed from: g */
    private final AbstractC89244h f27700g;

    static {
        Covode.recordClassIndex(13235);
    }

    public WishListServerErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LinearLayout getMRefreshLayout() {
        return (LinearLayout) this.f27700g.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView$b */
    static final class C11573b extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ WishListServerErrorView f27702a;

        static {
            Covode.recordClassIndex(13237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11573b(WishListServerErrorView wishListServerErrorView) {
            super(0);
            this.f27702a = wishListServerErrorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f27702a.findViewById(R.id.ce7);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView$a */
    public static final class View$OnClickListenerC11572a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11513a.AbstractC11516c f27701a;

        static {
            Covode.recordClassIndex(13236);
        }

        public View$OnClickListenerC11572a(C11513a.AbstractC11516c cVar) {
            this.f27701a = cVar;
        }

        public final void onClick(View view) {
            this.f27701a.mo18333c();
        }
    }

    private /* synthetic */ WishListServerErrorView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListServerErrorView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.beu, this, true);
        this.f27700g = C11831d.m20835a(new C11573b(this));
    }
}
