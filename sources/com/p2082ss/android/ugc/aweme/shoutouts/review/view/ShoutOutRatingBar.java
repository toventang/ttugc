package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar */
public class ShoutOutRatingBar extends LinearLayout {

    /* renamed from: a */
    LinearLayout f167681a;

    /* renamed from: b */
    boolean f167682b;

    /* renamed from: c */
    float f167683c;

    /* renamed from: d */
    Drawable f167684d;

    /* renamed from: e */
    EnumC74574c f167685e;

    /* renamed from: f */
    private Context f167686f;

    /* renamed from: g */
    private int f167687g;

    /* renamed from: h */
    private AbstractC74572a f167688h;

    /* renamed from: i */
    private AbstractC74573b f167689i;

    /* renamed from: j */
    private float f167690j;

    /* renamed from: k */
    private float f167691k;

    /* renamed from: l */
    private Drawable f167692l;

    /* renamed from: m */
    private Drawable f167693m;

    /* renamed from: n */
    private Drawable f167694n;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar$a */
    public interface AbstractC74572a {
        static {
            Covode.recordClassIndex(87381);
        }

        /* renamed from: a */
        void mo117196a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar$b */
    public interface AbstractC74573b {
        static {
            Covode.recordClassIndex(87382);
        }
    }

    static {
        Covode.recordClassIndex(87380);
    }

    public float getStarStep() {
        return this.f167683c;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar$c */
    public enum EnumC74574c {
        Half(0),
        Full(1);
        

        /* renamed from: a */
        int f167696a;

        static {
            Covode.recordClassIndex(87383);
        }

        public static EnumC74574c fromStep(int i) {
            EnumC74574c[] values = values();
            for (EnumC74574c cVar : values) {
                if (cVar.f167696a == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException();
        }

        private EnumC74574c(int i) {
            this.f167696a = i;
        }
    }

    private ImageView getStarImageView() {
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.f167690j), Math.round(this.f167690j));
        layoutParams.setMargins(0, 0, Math.round(this.f167691k), 0);
        autoRTLImageView.setLayoutParams(layoutParams);
        autoRTLImageView.setAdjustViewBounds(true);
        autoRTLImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        autoRTLImageView.setImageDrawable(this.f167692l);
        autoRTLImageView.setMinimumWidth(10);
        autoRTLImageView.setMaxHeight(10);
        return autoRTLImageView;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        MethodCollector.m26663i(2053);
        super.onFinishInflate();
        if (this.f167686f != null) {
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(this.f167686f);
            this.f167681a = linearLayout;
            linearLayout.setGravity(17);
            for (int i = 0; i < this.f167687g; i++) {
                ImageView starImageView = getStarImageView();
                starImageView.setImageDrawable(this.f167692l);
                starImageView.setOnClickListener(new View$OnClickListenerC74584a(this, starImageView));
                this.f167681a.addView(starImageView);
            }
            setStar(this.f167683c);
            addView(this.f167681a, new LinearLayout.LayoutParams(-1, -2));
        }
        MethodCollector.m26664o(2053);
    }

    public void setClickable(boolean z) {
        this.f167682b = z;
    }

    public void setOnRatingChangeListener(AbstractC74572a aVar) {
        this.f167688h = aVar;
    }

    public void setStarCount(int i) {
        this.f167687g = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f167692l = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f167693m = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f167684d = drawable;
    }

    public void setStarIdleDrawable(Drawable drawable) {
        this.f167694n = drawable;
    }

    public void setStarImageSize(float f) {
        this.f167690j = f;
    }

    public void setStarPadding(float f) {
        this.f167691k = f;
    }

    public void setStarStep(float f) {
        this.f167683c = f;
    }

    public void setUnClickableClickListener(AbstractC74573b bVar) {
        this.f167689i = bVar;
    }

    public void setStepSize(int i) {
        this.f167685e = EnumC74574c.fromStep(i);
    }

    public void setStar(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        int i = this.f167687g;
        if (f > ((float) i)) {
            f = (float) i;
        }
        AbstractC74572a aVar = this.f167688h;
        if (aVar != null) {
            aVar.mo117196a(f);
        }
        int i2 = 0;
        if (f == 0.0f) {
            while (i2 < this.f167687g) {
                ((ImageView) this.f167681a.getChildAt(i2)).setImageDrawable(this.f167694n);
                i2++;
            }
            return;
        }
        this.f167683c = f;
        int i3 = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i3))).floatValue();
        while (i2 < i3) {
            ((ImageView) this.f167681a.getChildAt(i2)).setImageDrawable(this.f167693m);
            i2++;
        }
        for (int i4 = i3; i4 < this.f167687g; i4++) {
            ((ImageView) this.f167681a.getChildAt(i4)).setImageDrawable(this.f167692l);
        }
        if (floatValue > 0.0f) {
            ((ImageView) this.f167681a.getChildAt(i3)).setImageDrawable(this.f167684d);
        }
    }

    public ShoutOutRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(2044);
        this.f167686f = context;
        setOrientation(0);
        if (attributeSet == null) {
            MethodCollector.m26664o(2044);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ns, R.attr.aew, R.attr.aex, R.attr.aey, R.attr.aez, R.attr.af0, R.attr.af1, R.attr.af2, R.attr.af3, R.attr.af4});
        this.f167690j = obtainStyledAttributes.getDimension(5, 20.0f);
        this.f167691k = obtainStyledAttributes.getDimension(6, 10.0f);
        this.f167683c = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f167687g = obtainStyledAttributes.getInteger(1, 5);
        this.f167692l = obtainStyledAttributes.getDrawable(2);
        this.f167693m = obtainStyledAttributes.getDrawable(3);
        this.f167684d = obtainStyledAttributes.getDrawable(4);
        this.f167694n = obtainStyledAttributes.getDrawable(9);
        this.f167682b = obtainStyledAttributes.getBoolean(0, true);
        this.f167685e = EnumC74574c.fromStep(obtainStyledAttributes.getInt(8, 1));
        if (this.f167694n == null) {
            this.f167694n = getResources().getDrawable(2131233845);
        }
        if (this.f167692l == null) {
            this.f167692l = getResources().getDrawable(2131233842);
        }
        if (this.f167693m == null) {
            this.f167693m = getResources().getDrawable(2131233843);
        }
        if (this.f167684d == null) {
            this.f167684d = getResources().getDrawable(2131233844);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(2044);
    }
}
