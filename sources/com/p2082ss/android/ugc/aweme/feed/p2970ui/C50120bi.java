package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49647n;
import com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49650q;
import com.p2082ss.android.ugc.trill.R;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bi */
public final class C50120bi extends LinearLayout implements AbstractC49647n {

    /* renamed from: a */
    LinearLayout f115696a;

    /* renamed from: b */
    boolean f115697b;

    /* renamed from: c */
    float f115698c;

    /* renamed from: d */
    Drawable f115699d;

    /* renamed from: e */
    EnumC50123c f115700e;

    /* renamed from: f */
    private Context f115701f;

    /* renamed from: g */
    private int f115702g;

    /* renamed from: h */
    private AbstractC50121a f115703h;

    /* renamed from: i */
    private AbstractC50122b f115704i;

    /* renamed from: j */
    private float f115705j;

    /* renamed from: k */
    private float f115706k;

    /* renamed from: l */
    private Drawable f115707l;

    /* renamed from: m */
    private Drawable f115708m;

    /* renamed from: n */
    private TuxTextView f115709n;

    /* renamed from: o */
    private AbstractC49650q f115710o;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bi$a */
    public interface AbstractC50121a {
        static {
            Covode.recordClassIndex(59247);
        }

        /* renamed from: a */
        void mo81429a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bi$b */
    public interface AbstractC50122b {
        static {
            Covode.recordClassIndex(59248);
        }
    }

    static {
        Covode.recordClassIndex(59246);
    }

    public final AbstractC49650q getOptionClickListener() {
        return this.f115710o;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo85253a();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bi$c */
    public enum EnumC50123c {
        Half(0),
        Full(1);
        

        /* renamed from: a */
        int f115712a;

        static {
            Covode.recordClassIndex(59249);
        }

        public static EnumC50123c fromStep(int i) {
            EnumC50123c[] values = values();
            for (EnumC50123c cVar : values) {
                if (cVar.f115712a == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException();
        }

        private EnumC50123c(int i) {
            this.f115712a = i;
        }
    }

    private ImageView getStarImageView() {
        MethodCollector.m26663i(3596);
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.f115705j), Math.round(this.f115705j));
        layoutParams.setMargins(0, 0, Math.round(this.f115706k), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.f115707l);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        MethodCollector.m26664o(3596);
        return imageView;
    }

    /* renamed from: a */
    public final void mo85253a() {
        MethodCollector.m26663i(3466);
        if (this.f115701f == null) {
            MethodCollector.m26664o(3466);
            return;
        }
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.f115701f);
        this.f115696a = linearLayout;
        linearLayout.setGravity(17);
        for (int i = 0; i < this.f115702g; i++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.f115707l);
            starImageView.setOnClickListener(new View$OnClickListenerC50124bj(this, starImageView));
            this.f115696a.addView(starImageView);
        }
        setStar(this.f115698c);
        addView(this.f115696a, new LinearLayout.LayoutParams(-1, -2));
        if (this.f115701f != null) {
            TuxTextView tuxTextView = new TuxTextView(this.f115701f);
            this.f115709n = tuxTextView;
            tuxTextView.setTextColor(C0643b.m2378c(this.f115701f, R.color.c5));
            this.f115709n.setTuxFont(61);
            this.f115709n.setGravity(17);
            this.f115709n.setPadding(0, (int) C13628n.m24520b(this.f115701f, 4.0f), 0, 0);
            addView(this.f115709n, new LinearLayout.LayoutParams(-1, -2));
        }
        MethodCollector.m26664o(3466);
    }

    public final void setClickable(boolean z) {
        this.f115697b = z;
    }

    public final void setOnRatingChangeListener(AbstractC50121a aVar) {
        this.f115703h = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49647n
    public final void setOptionListener(AbstractC49650q qVar) {
        this.f115710o = qVar;
    }

    public final void setStarCount(int i) {
        this.f115702g = i;
    }

    public final void setStarEmptyDrawable(Drawable drawable) {
        this.f115707l = drawable;
    }

    public final void setStarFillDrawable(Drawable drawable) {
        this.f115708m = drawable;
    }

    public final void setStarHalfDrawable(Drawable drawable) {
        this.f115699d = drawable;
    }

    public final void setStarImageSize(float f) {
        this.f115705j = f;
    }

    public final void setStarPadding(float f) {
        this.f115706k = f;
    }

    public final void setStarStep(float f) {
        this.f115698c = f;
    }

    public final void setUnClickableClickListener(AbstractC50122b bVar) {
        this.f115704i = bVar;
    }

    public C50120bi(Context context) {
        this(context, (byte) 0);
        this.f115701f = context;
    }

    public final void setOption(String str) {
        TuxTextView tuxTextView = this.f115709n;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setStepSize(int i) {
        this.f115700e = EnumC50123c.fromStep(i);
    }

    public final void setStar(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        int i = this.f115702g;
        if (f > ((float) i)) {
            f = (float) i;
        }
        AbstractC50121a aVar = this.f115703h;
        if (aVar != null) {
            aVar.mo81429a(f);
        }
        this.f115698c = f;
        int i2 = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i2))).floatValue();
        for (int i3 = 0; i3 < i2; i3++) {
            ((ImageView) this.f115696a.getChildAt(i3)).setImageDrawable(this.f115708m);
        }
        for (int i4 = i2; i4 < this.f115702g; i4++) {
            ((ImageView) this.f115696a.getChildAt(i4)).setImageDrawable(this.f115707l);
        }
        if (floatValue > 0.0f) {
            ((ImageView) this.f115696a.getChildAt(i2)).setImageDrawable(this.f115699d);
        }
    }

    private C50120bi(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(3398);
        this.f115701f = context;
        setOrientation(0);
        MethodCollector.m26664o(3398);
    }
}
