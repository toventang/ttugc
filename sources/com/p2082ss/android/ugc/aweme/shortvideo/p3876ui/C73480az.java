package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.az */
public class C73480az extends LinearLayout {

    /* renamed from: a */
    ImageView f165096a;

    /* renamed from: b */
    TextView f165097b;

    /* renamed from: c */
    TextView f165098c;

    /* renamed from: d */
    TextView f165099d;

    /* renamed from: e */
    View f165100e;

    /* renamed from: f */
    TextView f165101f;

    /* renamed from: g */
    protected View f165102g;

    /* renamed from: h */
    protected ImageView f165103h;

    /* renamed from: i */
    protected FrameLayout f165104i;

    /* renamed from: j */
    protected SmartImageView f165105j;

    /* renamed from: k */
    protected TextView f165106k;

    /* renamed from: l */
    public boolean f165107l;

    /* renamed from: m */
    private RemoteImageView f165108m;

    static {
        Covode.recordClassIndex(86217);
    }

    public int getPointColor() {
        return -1;
    }

    public ImageView getIconRight() {
        return this.f165103h;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f165108m;
    }

    public void setEnable(boolean z) {
        this.f165107l = z;
    }

    public C73480az(Context context) {
        this(context, (byte) 0);
    }

    public void setDrawableLeft(int i) {
        this.f165108m.setImageResource(i);
    }

    public void setDrawableRight(int i) {
        this.f165103h.setImageResource(i);
    }

    public void setRightIconListener(View.OnClickListener onClickListener) {
        this.f165104i.setOnClickListener(onClickListener);
    }

    public void setSubtitle(int i) {
        this.f165101f.setText(i);
    }

    public void setSubtitleAlpha(float f) {
        this.f165101f.setAlpha(f);
    }

    public void setTitle(int i) {
        this.f165097b.setText(i);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f165097b.setText(spannableString);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f165108m.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f165103h.setImageDrawable(drawable);
    }

    public final void setSubTitleTextColor(int i) {
        this.f165101f.setTextColor(C0643b.m2378c(getContext(), i));
    }

    public void setSubtitle(String str) {
        this.f165101f.setText(str);
    }

    public void setTitle(String str) {
        this.f165097b.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f165097b.setSingleLine(true);
        } else {
            this.f165097b.setSingleLine(false);
        }
        this.f165097b.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleLeftMargin(double d) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f165101f.getLayoutParams();
        layoutParams.leftMargin = C34728n.m70946a(d);
        this.f165101f.setLayoutParams(layoutParams);
        this.f165101f.setSingleLine();
        this.f165101f.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i) {
        this.f165101f.setSingleLine();
        this.f165101f.setEllipsize(TextUtils.TruncateAt.END);
        this.f165101f.setMaxWidth(i);
    }

    public void setTagText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f165098c.setVisibility(0);
            this.f165098c.setText(str);
            this.f165100e.setVisibility(0);
            return;
        }
        this.f165098c.setVisibility(8);
        this.f165100e.setVisibility(8);
    }

    public void setTextHighlight(boolean z) {
        int c;
        if (z) {
            c = C0643b.m2378c(getContext(), R.color.bx);
        } else {
            c = C0643b.m2378c(getContext(), R.color.nq);
        }
        this.f165097b.setTextColor(c);
        this.f165101f.setTextColor(c);
    }

    private C73480az(Context context, byte b) {
        this(context, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C73480az(Context context, char c) {
        super(context, null, 0);
        Drawable drawable = null;
        boolean z = false;
        MethodCollector.m26663i(11809);
        this.f165107l = true;
        this.f165102g = LayoutInflater.from(context).inflate(R.layout.aaf, this);
        this.f165108m = (RemoteImageView) findViewById(R.id.d6s);
        this.f165097b = (TextView) findViewById(R.id.d6q);
        this.f165098c = (TextView) findViewById(R.id.d6y);
        this.f165100e = findViewById(R.id.d6o);
        this.f165101f = (TextView) findViewById(R.id.d6x);
        this.f165096a = (ImageView) findViewById(R.id.d6r);
        this.f165103h = (ImageView) findViewById(R.id.bi3);
        this.f165105j = (SmartImageView) findViewById(R.id.dad);
        this.f165099d = (TextView) findViewById(R.id.d6v);
        this.f165106k = (TextView) findViewById(R.id.dae);
        this.f165104i = (FrameLayout) findViewById(R.id.dk7);
        z = getPointColor() == -1 ? true : z;
        Drawable b = C0196a.m619b(context, 2131232396);
        ImageView imageView = this.f165096a;
        if (z) {
            drawable = b;
        } else {
            int pointColor = getPointColor();
            if (b != null) {
                drawable = b.mutate();
                drawable.setColorFilter(new PorterDuffColorFilter(pointColor, PorterDuff.Mode.SRC_IN));
            }
        }
        imageView.setImageDrawable(drawable);
        MethodCollector.m26664o(11809);
    }
}
