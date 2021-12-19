package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.au */
public final class C51700au extends RelativeLayout {

    /* renamed from: b */
    public static final int f119170b = 0;

    /* renamed from: c */
    public static final int f119171c = 1;

    /* renamed from: d */
    public static final int f119172d = 2;

    /* renamed from: e */
    public static final int f119173e = 3;

    /* renamed from: f */
    public static final int f119174f = 4;

    /* renamed from: g */
    public static final int f119175g = 5;

    /* renamed from: h */
    public static final int f119176h = 6;

    /* renamed from: i */
    public static final int f119177i = 7;

    /* renamed from: j */
    public static final int f119178j = 8;

    /* renamed from: k */
    public static final C51701a f119179k = new C51701a((byte) 0);

    /* renamed from: a */
    public AbstractC89183m<? super Integer, ? super String, C89391z> f119180a;

    /* renamed from: l */
    private SmartAvatarImageView f119181l;

    /* renamed from: m */
    private TikTokFollowUserBtn f119182m;

    private final int getLayoutResId() {
        return R.layout.mg;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.au$a */
    public static final class C51701a {
        static {
            Covode.recordClassIndex(61064);
        }

        private C51701a() {
        }

        public /* synthetic */ C51701a(byte b) {
            this();
        }
    }

    public final TikTokFollowUserBtn getMFollowUserBtn() {
        return this.f119182m;
    }

    static {
        Covode.recordClassIndex(61063);
    }

    public final void setActionEventListener(AbstractC89183m<? super Integer, ? super String, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f119180a = mVar;
    }

    public final void setMFollowUserBtn(TikTokFollowUserBtn tikTokFollowUserBtn) {
        C89219l.m154721d(tikTokFollowUserBtn, "");
        this.f119182m = tikTokFollowUserBtn;
    }

    public final void setAvatarSize(int i) {
        SmartAvatarImageView smartAvatarImageView = this.f119181l;
        ViewGroup.LayoutParams layoutParams = smartAvatarImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        smartAvatarImageView.setLayoutParams(layoutParams);
    }
}
