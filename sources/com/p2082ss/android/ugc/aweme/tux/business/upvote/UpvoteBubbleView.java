package com.p2082ss.android.ugc.aweme.tux.business.upvote;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView */
public final class UpvoteBubbleView extends ConstraintLayout {

    /* renamed from: g */
    public static final C79478a f178409g = new C79478a((byte) 0);

    /* renamed from: h */
    private final AbstractC89244h f178410h;

    /* renamed from: i */
    private final AbstractC89244h f178411i;

    /* renamed from: j */
    private final AbstractC89244h f178412j;

    /* renamed from: k */
    private final AbstractC89244h f178413k;

    /* renamed from: l */
    private final AbstractC89244h f178414l;

    /* renamed from: m */
    private final AbstractC89244h f178415m;

    /* renamed from: n */
    private final AbstractC89244h f178416n;

    /* renamed from: o */
    private final int f178417o;

    static {
        Covode.recordClassIndex(92678);
    }

    public UpvoteBubbleView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public UpvoteBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final TuxIconView getArrowIcon() {
        return (TuxIconView) this.f178414l.getValue();
    }

    private final AvatarImageView getAvatarEnd() {
        return (AvatarImageView) this.f178412j.getValue();
    }

    private final AvatarImageView getAvatarMiddle() {
        return (AvatarImageView) this.f178411i.getValue();
    }

    private final AvatarImageView getAvatarStart() {
        return (AvatarImageView) this.f178410h.getValue();
    }

    private final Drawable getBubbleBG() {
        return (Drawable) this.f178416n.getValue();
    }

    private final View getTouchArea() {
        return (View) this.f178415m.getValue();
    }

    private final TuxTextView getUpvoteTV() {
        return (TuxTextView) this.f178413k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$a */
    public static final class C79478a {
        static {
            Covode.recordClassIndex(92679);
        }

        private C79478a() {
        }

        public /* synthetic */ C79478a(byte b) {
            this();
        }
    }

    public final View getBubbleTouchArea() {
        return getTouchArea();
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$b */
    static final class C79479b extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178418a;

        static {
            Covode.recordClassIndex(92680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79479b(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178418a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f178418a.findViewById(R.id.bgh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$c */
    static final class C79480c extends AbstractC89220m implements AbstractC89171a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178419a;

        static {
            Covode.recordClassIndex(92681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79480c(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178419a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.f178419a.findViewById(R.id.c10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$d */
    static final class C79481d extends AbstractC89220m implements AbstractC89171a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178420a;

        static {
            Covode.recordClassIndex(92682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79481d(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178420a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.f178420a.findViewById(R.id.c11);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$e */
    static final class C79482e extends AbstractC89220m implements AbstractC89171a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178421a;

        static {
            Covode.recordClassIndex(92683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79482e(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178421a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.f178421a.findViewById(R.id.c12);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$f */
    static final class C79483f extends AbstractC89220m implements AbstractC89171a<Drawable> {

        /* renamed from: a */
        final /* synthetic */ Context f178422a;

        static {
            Covode.recordClassIndex(92684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79483f(Context context) {
            super(0);
            this.f178422a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Drawable invoke() {
            return C23009f.m43397a(C794841.f178423a).mo37389a(this.f178422a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$g */
    static final class C79485g extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178424a;

        static {
            Covode.recordClassIndex(92686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79485g(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178424a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f178424a.findViewById(R.id.fb3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView$h */
    static final class C79486h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ UpvoteBubbleView f178425a;

        static {
            Covode.recordClassIndex(92687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79486h(UpvoteBubbleView upvoteBubbleView) {
            super(0);
            this.f178425a = upvoteBubbleView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f178425a.findViewById(R.id.f6o);
        }
    }

    public final void setAvatar(AbstractC89187q<? super AvatarImageView, ? super AvatarImageView, ? super AvatarImageView, C89391z> qVar) {
        C89219l.m154721d(qVar, "");
        qVar.invoke(getAvatarStart(), getAvatarMiddle(), getAvatarEnd());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ UpvoteBubbleView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UpvoteBubbleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        this.f178410h = C89250i.m154773a((AbstractC89171a) new C79482e(this));
        this.f178411i = C89250i.m154773a((AbstractC89171a) new C79481d(this));
        this.f178412j = C89250i.m154773a((AbstractC89171a) new C79480c(this));
        this.f178413k = C89250i.m154773a((AbstractC89171a) new C79486h(this));
        this.f178414l = C89250i.m154773a((AbstractC89171a) new C79479b(this));
        this.f178415m = C89250i.m154773a((AbstractC89171a) new C79485g(this));
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bgz, this, true);
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        i = displayMetrics != null ? displayMetrics.widthPixels : i;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = i - C89241a.m154730a(TypedValue.applyDimension(1, 95.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        setMaxWidth(a - C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        this.f178416n = C89250i.m154773a((AbstractC89171a) new C79483f(context));
        this.f178417o = C0643b.m2378c(context, R.color.iu);
    }

    /* renamed from: a */
    public final void mo123068a(boolean z, String str, String str2) {
        String str3 = str;
        String str4 = null;
        if (z) {
            getUpvoteTV().setBackground(getBubbleBG());
            getUpvoteTV().setTuxFont(61);
            TuxTextView upvoteTV = getUpvoteTV();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.5f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C23163i.m43660a((View) upvoteTV, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.5f, system4.getDisplayMetrics()))), false, 16);
            TuxTextView upvoteTV2 = getUpvoteTV();
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            C23163i.m43668b(upvoteTV2, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system5.getDisplayMetrics()))), null, null, null, false, 30);
            getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            getArrowIcon().setVisibility(8);
        } else {
            getUpvoteTV().setBackground(null);
            getUpvoteTV().setTuxFont(62);
            C23163i.m43660a((View) getUpvoteTV(), (Integer) 0, (Integer) 0, (Integer) 0, (Integer) 0, false, 16);
            TuxTextView upvoteTV3 = getUpvoteTV();
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            C23163i.m43668b(upvoteTV3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system6.getDisplayMetrics()))), null, null, null, false, 30);
            getUpvoteTV().setShadowLayer(1.0f, 0.0f, 1.0f, this.f178417o);
            getArrowIcon().setVisibility(0);
        }
        TuxTextView upvoteTV4 = getUpvoteTV();
        if (str2 == null) {
            if (str3 != null) {
                int length = str3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!C89064i.m154489a(new Character[]{'\n', '\r'}, Character.valueOf(str3.charAt(i)))) {
                        i++;
                    } else if (i > 0) {
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                        str3 = str3.substring(0, i);
                        C89219l.m154716b(str3, "");
                    }
                }
            }
            str3 = str4;
        } else if (str3 != null) {
            str4 = C1764a.m5928a(str3, Arrays.copyOf(new Object[]{str2}, 1));
            C89219l.m154716b(str4, "");
            float measureText = getUpvoteTV().getPaint().measureText(str4);
            int maxWidth = getMaxWidth();
            Resources system7 = Resources.getSystem();
            C89219l.m154709a((Object) system7, "");
            int a = maxWidth - C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system7.getDisplayMetrics()));
            Resources system8 = Resources.getSystem();
            C89219l.m154709a((Object) system8, "");
            int a2 = a - C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system8.getDisplayMetrics()));
            Resources system9 = Resources.getSystem();
            C89219l.m154709a((Object) system9, "");
            float a3 = (float) (a2 - C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system9.getDisplayMetrics())));
            if (measureText >= a3) {
                float measureText2 = getUpvoteTV().getPaint().measureText("...".concat(String.valueOf(str3)));
                Resources system10 = Resources.getSystem();
                C89219l.m154709a((Object) system10, "");
                str3 = C1764a.m5928a(str3, Arrays.copyOf(new Object[]{C80471gb.m139481a(m138196a(str2, 0, str2.length(), (int) (a3 - ((float) Math.ceil((double) (measureText2 + ((float) C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system10.getDisplayMetrics()))))))))) + "..."}, 1));
                C89219l.m154716b(str3, "");
            }
            str3 = str4;
        }
        upvoteTV4.setText(str3);
    }

    /* renamed from: a */
    private final String m138196a(String str, int i, int i2, int i3) {
        while (i + 1 < i2) {
            int i4 = (i2 + i) / 2;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, i4);
            C89219l.m154716b(substring, "");
            if (getUpvoteTV().getPaint().measureText(substring) < ((float) i3)) {
                i = i4;
            } else {
                i2 = i4;
            }
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str.substring(0, i);
        C89219l.m154716b(substring2, "");
        return substring2;
    }
}
