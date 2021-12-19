package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.p2614a.C38432b;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38549a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BottomBanner;
import com.p2082ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d */
public final class C38437d extends View$OnClickListenerC38428a {

    /* renamed from: f */
    public static final C38438a f90798f = new C38438a((byte) 0);

    /* renamed from: e */
    public final LinearLayout f90799e;

    /* renamed from: g */
    private final AbstractC89244h f90800g = C89250i.m154773a((AbstractC89171a) new C38440c(this));

    /* renamed from: h */
    private final AbstractC89244h f90801h = C89250i.m154773a((AbstractC89171a) new C38439b(this));

    /* renamed from: i */
    private final AbstractC89244h f90802i = C89250i.m154773a((AbstractC89171a) new C38441d(this));

    /* renamed from: j */
    private Runnable f90803j;

    static {
        Covode.recordClassIndex(45945);
    }

    /* renamed from: c */
    private final TextView m77868c() {
        return (TextView) this.f90800g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$a */
    public static final class C38438a {
        static {
            Covode.recordClassIndex(45946);
        }

        private C38438a() {
        }

        public /* synthetic */ C38438a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$b */
    static final class C38439b extends AbstractC89220m implements AbstractC89171a<SmartAvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ C38437d f90804a;

        static {
            Covode.recordClassIndex(45947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38439b(C38437d dVar) {
            super(0);
            this.f90804a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.f90804a.f90799e.findViewById(R.id.d40);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$c */
    static final class C38440c extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C38437d f90805a;

        static {
            Covode.recordClassIndex(45948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38440c(C38437d dVar) {
            super(0);
            this.f90805a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90805a.f90799e.findViewById(R.id.d3z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$d */
    static final class C38441d extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C38437d f90806a;

        static {
            Covode.recordClassIndex(45949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38441d(C38437d dVar) {
            super(0);
            this.f90806a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90806a.f90799e.findViewById(R.id.d41);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66983a() {
        this.f90799e.setOnClickListener(this);
        mo67011b().setOnClickListener(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$e */
    static final class RunnableC38442e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38437d f90807a;

        /* renamed from: b */
        final /* synthetic */ GradientDrawable f90808b;

        static {
            Covode.recordClassIndex(45950);
        }

        RunnableC38442e(C38437d dVar, GradientDrawable gradientDrawable) {
            this.f90807a = dVar;
            this.f90808b = gradientDrawable;
        }

        public final void run() {
            C38437d dVar = this.f90807a;
            TextView b = dVar.mo67011b();
            GradientDrawable gradientDrawable = this.f90808b;
            int color = this.f90807a.mo67011b().getResources().getColor(R.color.b3);
            int color2 = this.f90807a.mo67011b().getResources().getColor(R.color.bh);
            if (color != color2 && gradientDrawable != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2));
                Drawable mutate = C0705a.m2506e(gradientDrawable).mutate();
                C89219l.m154716b(mutate, "");
                if (mutate instanceof GradientDrawable) {
                    ((GradientDrawable) mutate).setColor(color2);
                }
                ofObject.addUpdateListener(new C38443f(dVar, b, mutate));
                C89219l.m154716b(ofObject, "");
                ofObject.setDuration(300L);
                ofObject.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$f */
    static final class C38443f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38437d f90809a;

        /* renamed from: b */
        final /* synthetic */ View f90810b;

        /* renamed from: c */
        final /* synthetic */ Drawable f90811c;

        static {
            Covode.recordClassIndex(45951);
        }

        C38443f(C38437d dVar, View view, Drawable drawable) {
            this.f90809a = dVar;
            this.f90810b = view;
            this.f90811c = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            View view = this.f90810b;
            if (view != null) {
                Drawable drawable = this.f90811c;
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setColor(intValue);
                }
                view.setBackground(drawable);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38437d(LinearLayout linearLayout) {
        super(linearLayout);
        C89219l.m154721d(linearLayout, "");
        this.f90799e = linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    public final void onClick(View view) {
        C38395d dVar;
        if (view != null) {
            int id = view.getId();
            if ((id == R.id.d41 || id == R.id.d3z || id == R.id.d40 || id == R.id.dj || id == R.id.di) && (dVar = this.f90787c) != null) {
                dVar.mo66988b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66984a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f90799e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.f90799e;
            ValueAnimator a = C38545a.m78160a(linearLayout, i2, (linearLayout.getMeasuredHeight() + 1) * -1, i);
            C89219l.m154716b(a, "");
            a.start();
        }
        if (i > 0) {
            mo67011b().setBackgroundResource(R.drawable.b6q);
        } else {
            mo67011b().setBackgroundResource(R.drawable.b6p);
        }
        mo67011b().removeCallbacks(this.f90803j);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66985a(C38396e eVar) {
        String str;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        User author;
        UrlModel avatarLarger;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        C89219l.m154721d(eVar, "");
        this.f90786b = eVar.f90717b;
        this.f90785a = eVar.f90716a;
        this.f90787c = eVar.f90719d;
        mo67011b().setText(C38549a.m78165a(this.f90785a, this.f90786b, false));
        mo67011b().setBackgroundResource(R.drawable.b6p);
        TextView textView = (TextView) this.f90802i.getValue();
        C89219l.m154716b(textView, "");
        Aweme aweme = this.f90786b;
        String str4 = null;
        if (aweme == null || (awemeRawAd5 = aweme.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd5.getHomepageBottomTextual();
        }
        textView.setText(str);
        Aweme aweme2 = this.f90786b;
        if (aweme2 == null || (awemeRawAd4 = aweme2.getAwemeRawAd()) == null) {
            str2 = null;
        } else {
            str2 = awemeRawAd4.getType();
        }
        if (TextUtils.equals(str2, "app")) {
            Aweme aweme3 = this.f90786b;
            if (!(aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null)) {
                str3 = awemeRawAd3.getAppName();
            }
            str3 = null;
        } else {
            Aweme aweme4 = this.f90786b;
            if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null)) {
                str3 = bottomBanner.getRecommendText();
            }
            str3 = null;
        }
        TextView c = m77868c();
        C89219l.m154716b(c, "");
        TextView c2 = m77868c();
        C89219l.m154716b(c2, "");
        c.setText(m77867a(str3, c2, ((float) C13628n.m24504a(this.f90785a)) - C13628n.m24520b(this.f90785a, 176.0f)));
        TextView b = mo67011b();
        Aweme aweme5 = this.f90786b;
        if (!(aweme5 == null || (awemeRawAd2 = aweme5.getAwemeRawAd()) == null)) {
            str4 = awemeRawAd2.getButtonText();
        }
        b.setText(m77867a(str4, mo67011b(), C13628n.m24520b(this.f90785a, 66.0f)));
        Aweme aweme6 = this.f90786b;
        if (aweme6 != null && (author = aweme6.getAuthor()) != null) {
            if (author.getAvatarMedium() != null) {
                avatarLarger = author.getAvatarMedium();
            } else if (author.getAvatarThumb() != null) {
                avatarLarger = author.getAvatarThumb();
            } else if (author.getAvatarLarger() != null) {
                avatarLarger = author.getAvatarLarger();
            } else {
                return;
            }
            if (avatarLarger != null) {
                C20766v a = C20761r.m39058a(new C20714a(avatarLarger.getUrlList()));
                a.f49092E = (SmartAvatarImageView) this.f90801h.getValue();
                a.mo34186c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66986a(boolean z) {
        int i;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        ViewGroup.LayoutParams layoutParams = this.f90799e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 < 0) {
            ValueAnimator a = C38545a.m78160a(this.f90799e, i2, 0, 300);
            C89219l.m154716b(a, "");
            a.start();
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C13628n.m24520b(mo67011b().getContext(), 2.0f));
            gradientDrawable.setColor(mo67011b().getResources().getColor(R.color.b3));
            Aweme aweme = this.f90786b;
            if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd2.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null) {
                i = 3;
            } else {
                i = bottomBanner.getShowButtonColorSeconds();
            }
            if (this.f90803j == null) {
                this.f90803j = new RunnableC38442e(this, gradientDrawable);
            }
            mo67011b().postDelayed(this.f90803j, TimeUnit.SECONDS.toMillis((long) i) + 300);
            Aweme aweme2 = this.f90786b;
            AwemeRawAd awemeRawAd3 = null;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C38432b.m77861a(awemeRawAd);
            Aweme aweme3 = this.f90786b;
            if (aweme3 != null) {
                awemeRawAd3 = aweme3.getAwemeRawAd();
            }
            C18129a.m33746a("homepage_ad", "button_show", awemeRawAd3).mo28902c();
        }
    }

    /* renamed from: a */
    private static String m77867a(String str, TextView textView, float f) {
        TextPaint paint = textView.getPaint();
        if (paint.measureText(str) <= f) {
            return str;
        }
        textView.setText(str);
        CharSequence text = textView.getText();
        String str2 = text + "...";
        while (paint.measureText(str2) > f) {
            C89219l.m154716b(text, "");
            if (text.length() <= 0) {
                break;
            }
            text = text.subSequence(0, text.length() - 1);
            str2 = text + "...";
        }
        return str2;
    }
}
