package com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a */
public abstract class AbstractC17929a extends FrameLayout {

    /* renamed from: a */
    public View f42741a;

    /* renamed from: b */
    public TextView f42742b;

    /* renamed from: c */
    public ImageView f42743c;

    /* renamed from: d */
    public Runnable f42744d;

    /* renamed from: e */
    public Runnable f42745e;

    /* renamed from: f */
    public AwemeRawAd f42746f;

    /* renamed from: g */
    public AwemeSearchAdModel f42747g;

    /* renamed from: h */
    public boolean f42748h;

    /* renamed from: i */
    public int f42749i;

    /* renamed from: j */
    private final Context f42750j;

    static {
        Covode.recordClassIndex(20543);
    }

    public AbstractC17929a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public abstract void mo28583a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo28584a();

    public abstract int getLayoutId$commercialize_search_impl_release();

    public abstract void setTransformButtonVisibility$commercialize_search_impl_release(int i);

    public final ImageView getArrow$commercialize_search_impl_release() {
        return this.f42743c;
    }

    public final int getDefaultBackgroundColor() {
        return this.f42749i;
    }

    public final AwemeSearchAdModel getMAmemeSearchAdInfo$commercialize_search_impl_release() {
        return this.f42747g;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_search_impl_release() {
        return this.f42746f;
    }

    private final float getColorChangeMillSeconds() {
        float f;
        AwemeSearchAdModel awemeSearchAdModel = this.f42747g;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getButtonColorShowSeconds();
        } else {
            f = 0.0f;
        }
        return f * 1000.0f;
    }

    private final float getShowMillSeconds() {
        float f;
        AwemeSearchAdModel awemeSearchAdModel = this.f42747g;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        return f * 1000.0f;
    }

    public final int getBackGroundColor() {
        int i = this.f42749i;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public final String getBgColor() {
        String searchAdTransformButtonColor;
        AwemeSearchAdModel awemeSearchAdModel = this.f42747g;
        if (awemeSearchAdModel == null || (searchAdTransformButtonColor = awemeSearchAdModel.getSearchAdTransformButtonColor()) == null || searchAdTransformButtonColor.length() <= 0) {
            return getResources().getString(R.color.bh);
        }
        return searchAdTransformButtonColor;
    }

    public final String getTransformButtonText() {
        String searchAdTransformButtonText;
        AwemeSearchAdModel awemeSearchAdModel = this.f42747g;
        if (awemeSearchAdModel == null || (searchAdTransformButtonText = awemeSearchAdModel.getSearchAdTransformButtonText()) == null || searchAdTransformButtonText.length() <= 0) {
            return "";
        }
        return searchAdTransformButtonText;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a$a */
    public static final class RunnableC17930a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17929a f42751a;

        static {
            Covode.recordClassIndex(20544);
        }

        public RunnableC17930a(AbstractC17929a aVar) {
            this.f42751a = aVar;
        }

        public final void run() {
            AbstractC17929a aVar = this.f42751a;
            aVar.mo28583a(Color.parseColor(aVar.getBgColor()), 300);
            this.f42751a.animate().alpha(1.0f).setDuration(150).start();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a$b */
    public static final class RunnableC17931b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17929a f42752a;

        static {
            Covode.recordClassIndex(20545);
        }

        public RunnableC17931b(AbstractC17929a aVar) {
            this.f42752a = aVar;
        }

        public final void run() {
            AbstractC17929a aVar = this.f42752a;
            if (aVar != null) {
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int i = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
                if (i < 0) {
                    ValueAnimator a = C80595j.m139737a(aVar, i, 22, 300);
                    C89219l.m154716b(a, "");
                    a.start();
                }
            }
        }
    }

    public final void setArrow$commercialize_search_impl_release(ImageView imageView) {
        this.f42743c = imageView;
    }

    public final void setDefaultBackgroundColor(int i) {
        this.f42749i = i;
    }

    public final void setMAmemeSearchAdInfo$commercialize_search_impl_release(AwemeSearchAdModel awemeSearchAdModel) {
        this.f42747g = awemeSearchAdModel;
    }

    public final void setMAwemeRawAd$commercialize_search_impl_release(AwemeRawAd awemeRawAd) {
        this.f42746f = awemeRawAd;
    }

    private /* synthetic */ AbstractC17929a(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC17929a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f42750j = context;
    }
}
