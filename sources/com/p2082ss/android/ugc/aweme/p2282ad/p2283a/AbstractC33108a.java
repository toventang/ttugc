package com.p2082ss.android.ugc.aweme.p2282ad.p2283a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.button.AbstractC33213d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.a.a */
public abstract class AbstractC33108a extends FrameLayout implements AbstractC33213d {

    /* renamed from: b */
    public static final C33109a f78681b = new C33109a((byte) 0);

    /* renamed from: s */
    private static final String f78682s = AbstractC33108a.class.getSimpleName();

    /* renamed from: a */
    public boolean f78683a;

    /* renamed from: c */
    private View f78684c;

    /* renamed from: d */
    private TextView f78685d;

    /* renamed from: e */
    private TextView f78686e;

    /* renamed from: f */
    private View f78687f;

    /* renamed from: g */
    private View f78688g;

    /* renamed from: h */
    private ImageView f78689h;

    /* renamed from: i */
    private ObjectAnimator f78690i;

    /* renamed from: j */
    private ObjectAnimator f78691j;

    /* renamed from: k */
    private Runnable f78692k;

    /* renamed from: l */
    private Runnable f78693l;

    /* renamed from: m */
    private EnumC33110b f78694m;

    /* renamed from: n */
    private Aweme f78695n;

    /* renamed from: o */
    private AwemeRawAd f78696o;

    /* renamed from: p */
    private boolean f78697p;

    /* renamed from: q */
    private int f78698q;

    /* renamed from: r */
    private final Context f78699r;

    /* renamed from: com.ss.android.ugc.aweme.ad.a.a$b */
    public enum EnumC33110b {
        LINK,
        DOWNLOAD_IDLE,
        DOWNLOADING,
        INSTALL,
        INSTALLED;

        static {
            Covode.recordClassIndex(39923);
        }
    }

    public AbstractC33108a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public abstract void mo58888a(int i);

    public abstract int getLayoutId$c_feed_impl_tiktokI18nRelease();

    public abstract void setLabelVisibility$c_feed_impl_tiktokI18nRelease(int i);

    /* renamed from: com.ss.android.ugc.aweme.ad.a.a$a */
    public static final class C33109a {
        static {
            Covode.recordClassIndex(39922);
        }

        private C33109a() {
        }

        public /* synthetic */ C33109a(byte b) {
            this();
        }
    }

    public final ImageView getArrow$c_feed_impl_tiktokI18nRelease() {
        return this.f78689h;
    }

    public final EnumC33110b getCurrentStyle() {
        return this.f78694m;
    }

    public final int getDefaultBackgroundColor() {
        return this.f78698q;
    }

    public final Aweme getMAweme$c_feed_impl_tiktokI18nRelease() {
        return this.f78695n;
    }

    public final AwemeRawAd getMAwemeRawAd$c_feed_impl_tiktokI18nRelease() {
        return this.f78696o;
    }

    static {
        Covode.recordClassIndex(39921);
    }

    private final long getShowSeconds() {
        int i;
        if (getInDownloadMode()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = this.f78696o;
        if (awemeRawAd != null) {
            i = awemeRawAd.getShowButtonSeconds();
        } else {
            i = 0;
        }
        return ((long) i) * 1000;
    }

    public final int getBackGroundColor() {
        int i = this.f78698q;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public final String getBgColor() {
        String learnMoreBgColor;
        AwemeRawAd awemeRawAd = this.f78696o;
        if (awemeRawAd == null || (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) == null || learnMoreBgColor.length() <= 0) {
            return getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    public final boolean getInDownloadMode() {
        return C89064i.m154489a(new EnumC33110b[]{EnumC33110b.DOWNLOADING, EnumC33110b.INSTALL, EnumC33110b.INSTALLED}, this.f78694m);
    }

    /* renamed from: b */
    private final void m67823b() {
        ObjectAnimator objectAnimator = this.f78690i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.f78687f;
        if (view != null) {
            view.clearAnimation();
        }
        ObjectAnimator objectAnimator2 = this.f78691j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View view2 = this.f78688g;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.f78687f;
        if (view3 != null) {
            view3.setBackgroundDrawable(null);
        }
        View view4 = this.f78688g;
        if (view4 != null) {
            view4.setBackgroundDrawable(null);
        }
    }

    private final long getColorChangeSeconds() {
        int i;
        AwemeRawAd awemeRawAd = this.f78696o;
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 3) {
            return getShowSeconds();
        }
        long showSeconds = getShowSeconds();
        AwemeRawAd awemeRawAd2 = this.f78696o;
        if (awemeRawAd2 != null) {
            i = awemeRawAd2.getShowButtonColorSeconds();
        } else {
            i = 0;
        }
        return Math.max(showSeconds, ((long) i) * 1000);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        String str;
        AwemeRawAd awemeRawAd;
        String downloadUrl;
        m67823b();
        this.f78683a = false;
        removeCallbacks(this.f78692k);
        removeCallbacks(this.f78693l);
        AwemeRawAd awemeRawAd2 = this.f78696o;
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getType();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) str, (Object) "app") || (awemeRawAd = this.f78696o) == null || (downloadUrl = awemeRawAd.getDownloadUrl()) == null)) {
            downloadUrl.length();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m67822a() {
        View view;
        View view2;
        TextView textView;
        TextView textView2;
        if (!this.f78697p) {
            View inflate = View.inflate(getContext(), getLayoutId$c_feed_impl_tiktokI18nRelease(), this);
            this.f78684c = inflate;
            ImageView imageView = null;
            if (inflate != null) {
                view = inflate.findViewById(R.id.ao7);
            } else {
                view = null;
            }
            this.f78687f = view;
            View view3 = this.f78684c;
            if (view3 != null) {
                view2 = view3.findViewById(R.id.ao8);
            } else {
                view2 = null;
            }
            this.f78688g = view2;
            View view4 = this.f78684c;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.cfx);
            } else {
                textView = null;
            }
            this.f78685d = textView;
            View view5 = this.f78684c;
            if (view5 != null) {
                textView2 = (TextView) view5.findViewById(R.id.cfu);
            } else {
                textView2 = null;
            }
            this.f78686e = textView2;
            View view6 = this.f78684c;
            if (view6 != null) {
                imageView = (ImageView) view6.findViewById(R.id.ao6);
            }
            this.f78689h = imageView;
            C38545a.m78162a(this);
            this.f78697p = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3.equals("counsel") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r3.equals("web") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r3.equals("app") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        r0 = getContext().getString(com.p2082ss.android.ugc.trill.R.string.ok);
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getButtonText() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.p2283a.AbstractC33108a.getButtonText():java.lang.String");
    }

    public final void setArrow$c_feed_impl_tiktokI18nRelease(ImageView imageView) {
        this.f78689h = imageView;
    }

    public final void setCurrentStyle(EnumC33110b bVar) {
        this.f78694m = bVar;
    }

    public final void setDefaultBackgroundColor$c_feed_impl_tiktokI18nRelease(int i) {
        this.f78698q = i;
    }

    public final void setMAweme$c_feed_impl_tiktokI18nRelease(Aweme aweme) {
        this.f78695n = aweme;
    }

    public final void setMAwemeRawAd$c_feed_impl_tiktokI18nRelease(AwemeRawAd awemeRawAd) {
        this.f78696o = awemeRawAd;
    }

    public final void setDownloadIdleUI(String str) {
        C89219l.m154721d(str, "");
        m67822a();
        m67823b();
        this.f78694m = EnumC33110b.DOWNLOAD_IDLE;
        View view = this.f78687f;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f78688g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f78686e;
        if (textView != null) {
            textView.setTextColor(C0643b.m2378c(this.f78699r, R.color.l));
        }
        TextView textView2 = this.f78686e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f78685d;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ImageView imageView = this.f78689h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void setDownloadPauseUI(String str) {
        C89219l.m154721d(str, "");
        m67822a();
        this.f78694m = EnumC33110b.DOWNLOADING;
        mo58888a(this.f78698q);
        View view = this.f78687f;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f78688g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f78686e;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f78686e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f78686e;
        if (textView3 != null) {
            textView3.setTextColor(C0643b.m2378c(this.f78699r, R.color.nq));
        }
        TextView textView4 = this.f78685d;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        ImageView imageView = this.f78689h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private /* synthetic */ AbstractC33108a(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC33108a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f78699r = context;
    }
}
