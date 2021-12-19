package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.C18156a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView */
public final class FakeUserAdTagView extends C38857c {

    /* renamed from: b */
    public AwemeRawAd f91603b;

    /* renamed from: c */
    private final int f91604c;

    /* renamed from: d */
    private final int f91605d;

    /* renamed from: e */
    private final AbstractC89244h f91606e;

    /* renamed from: f */
    private final AbstractC89244h f91607f;

    /* renamed from: g */
    private Animator f91608g;

    /* renamed from: h */
    private Animator f91609h;

    static {
        Covode.recordClassIndex(46343);
    }

    public FakeUserAdTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDefaultBgColor() {
        return ((Number) this.f91607f.getValue()).intValue();
    }

    public final int getDefaultTextColor() {
        return ((Number) this.f91606e.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView$a */
    static final class C38795a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f91610a;

        static {
            Covode.recordClassIndex(46344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38795a(Context context) {
            super(0);
            this.f91610a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f91610a, R.color.j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView$b */
    static final class C38796b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f91611a;

        static {
            Covode.recordClassIndex(46345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38796b(Context context) {
            super(0);
            this.f91611a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f91611a, R.color.c5));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView$c */
    static final class RunnableC38797c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FakeUserAdTagView f91612a;

        static {
            Covode.recordClassIndex(46346);
        }

        RunnableC38797c(FakeUserAdTagView fakeUserAdTagView) {
            this.f91612a = fakeUserAdTagView;
        }

        public final void run() {
            FakeUserAdTagView fakeUserAdTagView = this.f91612a;
            fakeUserAdTagView.setTopMargin(-fakeUserAdTagView.getMeasuredHeight());
        }
    }

    public final int getTopMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f91608g;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f91609h;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AwemeRawAd awemeRawAd = this.f91603b;
        if (awemeRawAd != null) {
            if (awemeRawAd.getShowLabelSeconds() <= 0) {
                setTopMargin(0);
                setAlpha(1.0f);
                return;
            }
            setTopMargin(-C34728n.m70946a(24.0d));
            setAlpha(0.0f);
            post(new RunnableC38797c(this));
        }
    }

    public final void setTopMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        setLayoutParams(marginLayoutParams);
    }

    private /* synthetic */ FakeUserAdTagView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FakeUserAdTagView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f91604c = C34728n.m70946a(2.0d);
        int a = C34728n.m70946a(4.0d);
        this.f91605d = a;
        this.f91606e = C89250i.m154773a((AbstractC89171a) new C38796b(context));
        this.f91607f = C89250i.m154773a((AbstractC89171a) new C38795a(context));
        setSpaceH(a);
    }

    /* renamed from: a */
    public final void mo67376a(String str, int i, int i2) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        RichTagView richTagView = new RichTagView(context, (AttributeSet) null, 4);
        addView(richTagView);
        C23163i.m43668b(richTagView, 0, 0, Integer.valueOf(this.f91604c), 0, false, 16);
        C18156a.C18157a a = C18156a.C18157a.C18158a.m33791a();
        C18156a.C18157a a2 = a.mo28942a(str).mo28943b(81).mo28941a(i).mo28944c(i2).mo28940a((float) C34728n.m70946a(2.0d));
        C18156a aVar = a2.f43256a;
        if (aVar != null) {
            aVar.f43243i = -2;
        }
        int a3 = C34728n.m70946a(16.0d);
        C18156a aVar2 = a2.f43256a;
        if (aVar2 != null) {
            aVar2.f43244j = Integer.valueOf(a3);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        C89219l.m154719c(truncateAt, "");
        C18156a aVar3 = a2.f43256a;
        if (aVar3 != null) {
            aVar3.f43239e = truncateAt;
        }
        C18156a aVar4 = a2.f43256a;
        if (aVar4 != null) {
            aVar4.f43240f = 1;
        }
        int i3 = this.f91605d;
        C18156a aVar5 = a2.f43256a;
        if (aVar5 != null) {
            aVar5.f43245k = Integer.valueOf(i3);
        }
        int i4 = this.f91605d;
        C18156a aVar6 = a2.f43256a;
        if (aVar6 != null) {
            aVar6.f43246l = Integer.valueOf(i4);
        }
        C18156a aVar7 = a.f43256a;
        if (aVar7 != null) {
            richTagView.mo28933a(aVar7);
        }
    }
}
