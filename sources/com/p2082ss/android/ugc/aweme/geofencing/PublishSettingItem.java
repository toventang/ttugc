package com.p2082ss.android.ugc.aweme.geofencing;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.geofencing.PublishSettingItem */
public class PublishSettingItem extends LinearLayout {

    /* renamed from: a */
    private RemoteImageView f121605a;

    /* renamed from: d */
    public ImageView f121606d;

    /* renamed from: e */
    public TextView f121607e;

    /* renamed from: f */
    public TextView f121608f;

    /* renamed from: g */
    public TextView f121609g;

    /* renamed from: h */
    protected View f121610h;

    /* renamed from: i */
    protected ImageView f121611i;

    /* renamed from: j */
    protected SmartImageView f121612j;

    /* renamed from: k */
    protected TextView f121613k;

    /* renamed from: l */
    protected TextView f121614l;

    /* renamed from: m */
    public boolean f121615m;

    static {
        Covode.recordClassIndex(62267);
    }

    public int getPointColor() {
        return -1;
    }

    public TextView getBottomHintTextView() {
        return this.f121614l;
    }

    public ImageView getIconRight() {
        return this.f121611i;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f121605a;
    }

    /* renamed from: c */
    public final void mo88513c() {
        this.f121605a.setVisibility(8);
    }

    public void setEnable(boolean z) {
        this.f121615m = z;
    }

    public void setBottomHintText(int i) {
        this.f121614l.setText(i);
    }

    public void setBottomHintTextVisibility(int i) {
        this.f121614l.setVisibility(i);
    }

    public void setDrawableLeft(int i) {
        this.f121605a.setImageResource(i);
    }

    public void setDrawableRight(int i) {
        this.f121611i.setImageResource(i);
    }

    public void setSubtitle(int i) {
        this.f121609g.setText(i);
    }

    public void setSubtitleAlpha(float f) {
        this.f121609g.setAlpha(f);
    }

    public void setTitle(int i) {
        this.f121607e.setText(i);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f121607e.setText(spannableString);
    }

    /* renamed from: a */
    public final void mo88512a(boolean z) {
        int i;
        ImageView imageView = this.f121606d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setBottomHintText(String str) {
        this.f121614l.setText(str);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f121605a.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f121611i.setImageDrawable(drawable);
    }

    public final void setSubTitleTextColor(int i) {
        this.f121609g.setTextColor(C0643b.m2378c(getContext(), i));
    }

    public void setSubtitle(String str) {
        this.f121609g.setText(str);
    }

    public void setTitle(String str) {
        this.f121607e.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f121607e.setSingleLine(true);
        } else {
            this.f121607e.setSingleLine(false);
        }
        this.f121607e.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleLeftMargin(double d) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f121609g.getLayoutParams();
        layoutParams.leftMargin = C34728n.m70946a(d);
        this.f121609g.setLayoutParams(layoutParams);
        this.f121609g.setSingleLine();
        this.f121609g.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i) {
        this.f121609g.setSingleLine();
        this.f121609g.setEllipsize(TextUtils.TruncateAt.END);
        this.f121609g.setMaxWidth(i);
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PublishSettingItem(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        boolean z = false;
        MethodCollector.m26663i(7581);
        this.f121615m = true;
        this.f121610h = LayoutInflater.from(context).inflate(R.layout.f205084do, this);
        this.f121605a = (RemoteImageView) findViewById(R.id.d6s);
        this.f121607e = (TextView) findViewById(R.id.d6q);
        this.f121609g = (TextView) findViewById(R.id.d6x);
        this.f121606d = (ImageView) findViewById(R.id.d6r);
        this.f121611i = (ImageView) findViewById(R.id.bi3);
        this.f121612j = (SmartImageView) findViewById(R.id.dad);
        this.f121608f = (TextView) findViewById(R.id.d6v);
        this.f121613k = (TextView) findViewById(R.id.dae);
        this.f121614l = (TextView) findViewById(R.id.us);
        z = getPointColor() == -1 ? true : z;
        Drawable b2 = C0196a.m619b(context, 2131232396);
        ImageView imageView = this.f121606d;
        if (!z) {
            int pointColor = getPointColor();
            if (b2 == null) {
                b2 = null;
            } else {
                b2 = b2.mutate();
                b2.setColorFilter(new PorterDuffColorFilter(pointColor, PorterDuff.Mode.SRC_IN));
            }
        }
        imageView.setImageDrawable(b2);
        MethodCollector.m26664o(7581);
    }
}
