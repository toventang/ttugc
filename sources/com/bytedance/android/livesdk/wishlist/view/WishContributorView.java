package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishContributorView extends FrameLayout {

    /* renamed from: a */
    private final AbstractC89244h f27662a;

    /* renamed from: b */
    private final AbstractC89244h f27663b;

    static {
        Covode.recordClassIndex(13213);
    }

    public WishContributorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final ImageView getMAvatar() {
        return (ImageView) this.f27663b.getValue();
    }

    private final ImageView getMBorder() {
        return (ImageView) this.f27662a.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishContributorView$b */
    static final class C11555b extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ WishContributorView f27666a;

        static {
            Covode.recordClassIndex(13215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11555b(WishContributorView wishContributorView) {
            super(0);
            this.f27666a = wishContributorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f27666a.findViewById(R.id.fj4);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishContributorView$c */
    static final class C11556c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ WishContributorView f27667a;

        static {
            Covode.recordClassIndex(13216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11556c(WishContributorView wishContributorView) {
            super(0);
            this.f27667a = wishContributorView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f27667a.findViewById(R.id.fj5);
        }
    }

    /* renamed from: a */
    public final void mo18354a(C11554a aVar) {
        C89219l.m154721d(aVar, "");
        int i = aVar.f27665b;
        int i2 = 2131234631;
        if (i != 1) {
            if (i == 2) {
                i2 = 2131234632;
            } else if (i == 3) {
                i2 = 2131234633;
            }
        }
        getMBorder().setImageResource(i2);
        C7577g.m15571a(getMAvatar(), aVar.f27664a, getMAvatar().getWidth(), getMAvatar().getHeight(), 2131234441);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishContributorView$a */
    public static final class C11554a {

        /* renamed from: a */
        public final ImageModel f27664a;

        /* renamed from: b */
        public final int f27665b;

        static {
            Covode.recordClassIndex(13214);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11554a)) {
                return false;
            }
            C11554a aVar = (C11554a) obj;
            return C89219l.m154714a(this.f27664a, aVar.f27664a) && this.f27665b == aVar.f27665b;
        }

        public final int hashCode() {
            ImageModel imageModel = this.f27664a;
            return ((imageModel != null ? imageModel.hashCode() : 0) * 31) + this.f27665b;
        }

        public final String toString() {
            return "WishListContributorInfo(avatar=" + this.f27664a + ", rank=" + this.f27665b + ")";
        }

        public C11554a(ImageModel imageModel, int i) {
            C89219l.m154721d(imageModel, "");
            this.f27664a = imageModel;
            this.f27665b = i;
        }
    }

    private /* synthetic */ WishContributorView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishContributorView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5931);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bfh, this, true);
        this.f27662a = C89250i.m154773a((AbstractC89171a) new C11556c(this));
        this.f27663b = C89250i.m154773a((AbstractC89171a) new C11555b(this));
        MethodCollector.m26664o(5931);
    }
}
