package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout */
public final class AVDmtHorizontalImageTextLayout extends AVDmtPanelLinearLayout {

    /* renamed from: a */
    public AVDmtTextView f174432a;

    /* renamed from: b */
    private AVDmtImageView f174433b;

    /* renamed from: c */
    private String f174434c;

    /* renamed from: d */
    private Drawable f174435d;

    /* renamed from: e */
    private int f174436e;

    /* renamed from: f */
    private boolean f174437f;

    /* renamed from: g */
    private boolean f174438g;

    static {
        Covode.recordClassIndex(90855);
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AVDmtTextView getAvDmtTextView() {
        AVDmtTextView aVDmtTextView = this.f174432a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("avDmtTextView");
        }
        return aVDmtTextView;
    }

    public final void setAvDmtTextView(AVDmtTextView aVDmtTextView) {
        C89219l.m154721d(aVDmtTextView, "");
        this.f174432a = aVDmtTextView;
    }

    public final void setChangeColor(boolean z) {
        AVDmtImageView aVDmtImageView = this.f174433b;
        if (aVDmtImageView == null) {
            C89219l.m154710a("avDmtImageView");
        }
        aVDmtImageView.setChangeColor(z);
    }

    public final void setTextSize(int i) {
        AVDmtTextView aVDmtTextView = this.f174432a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView.setTextSize((float) i);
    }

    public final void setImageRes(int i) {
        AVDmtImageView aVDmtImageView = this.f174433b;
        if (aVDmtImageView == null) {
            C89219l.m154710a("avDmtImageView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        aVDmtImageView.setImageDrawable(context.getResources().getDrawable(i));
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f174432a;
            if (aVDmtTextView == null) {
                C89219l.m154710a("avDmtTextView");
            }
            aVDmtTextView.setText(str);
        }
    }

    private /* synthetic */ AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f174438g = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f174434c = obtainStyledAttributes.getString(42);
            this.f174435d = obtainStyledAttributes.getDrawable(24);
            this.f174436e = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.f174437f = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f174437f) {
            this.f174438g = C84370a.f188623l.f188625a;
        }
        this.f174432a = new AVDmtTextView(context, (AttributeSet) null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) C84912r.m145930a(context, 4.0f);
        layoutParams.gravity = 16;
        AVDmtTextView aVDmtTextView = this.f174432a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView.setLayoutParams(layoutParams);
        this.f174433b = new AVDmtImageView(context, null, 6, (byte) 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.f174438g) {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            int a = (int) C84912r.m145930a(context2, 12.0f);
            layoutParams2.rightMargin = a;
            layoutParams2.leftMargin = a;
        }
        AVDmtImageView aVDmtImageView = this.f174433b;
        if (aVDmtImageView == null) {
            C89219l.m154710a("avDmtImageView");
        }
        aVDmtImageView.setLayoutParams(layoutParams2);
        AVDmtImageView aVDmtImageView2 = this.f174433b;
        if (aVDmtImageView2 == null) {
            C89219l.m154710a("avDmtImageView");
        }
        addView(aVDmtImageView2);
        AVDmtTextView aVDmtTextView2 = this.f174432a;
        if (aVDmtTextView2 == null) {
            C89219l.m154710a("avDmtTextView");
        }
        addView(aVDmtTextView2);
        int i = this.f174436e;
        setPadding(i, i, i, i);
        setGravity(17);
        AVDmtTextView aVDmtTextView3 = this.f174432a;
        if (aVDmtTextView3 == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView3.setTextSize(13.0f);
        AVDmtTextView aVDmtTextView4 = this.f174432a;
        if (aVDmtTextView4 == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView4.setMaxLines(1);
        AVDmtTextView aVDmtTextView5 = this.f174432a;
        if (aVDmtTextView5 == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView5.setEllipsize(TextUtils.TruncateAt.END);
        AVDmtTextView aVDmtTextView6 = this.f174432a;
        if (aVDmtTextView6 == null) {
            C89219l.m154710a("avDmtTextView");
        }
        aVDmtTextView6.setVisibility(8);
        AVDmtImageView aVDmtImageView3 = this.f174433b;
        if (aVDmtImageView3 == null) {
            C89219l.m154710a("avDmtImageView");
        }
        aVDmtImageView3.setChangeColor(false);
        if (!TextUtils.isEmpty(this.f174434c)) {
            AVDmtTextView aVDmtTextView7 = this.f174432a;
            if (aVDmtTextView7 == null) {
                C89219l.m154710a("avDmtTextView");
            }
            aVDmtTextView7.setText(this.f174434c);
        }
        if (this.f174435d != null) {
            AVDmtImageView aVDmtImageView4 = this.f174433b;
            if (aVDmtImageView4 == null) {
                C89219l.m154710a("avDmtImageView");
            }
            aVDmtImageView4.setImageDrawable(this.f174435d);
        }
        if (this.f174438g) {
            AVDmtTextView aVDmtTextView8 = this.f174432a;
            if (aVDmtTextView8 == null) {
                C89219l.m154710a("avDmtTextView");
            }
            aVDmtTextView8.setVisibility(0);
        }
    }
}
