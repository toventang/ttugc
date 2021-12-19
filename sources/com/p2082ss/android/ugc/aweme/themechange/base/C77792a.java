package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.a */
public final class C77792a extends FrameLayout {

    /* renamed from: a */
    private SimpleDraweeView f174503a;

    /* renamed from: b */
    private AVDmtTextView f174504b;

    /* renamed from: c */
    private View f174505c;

    /* renamed from: d */
    private int f174506d;

    /* renamed from: e */
    private int f174507e;

    /* renamed from: f */
    private boolean f174508f;

    static {
        Covode.recordClassIndex(90870);
    }

    public final int getSelectColor() {
        return this.f174506d;
    }

    public final int getUnSelectColor() {
        return this.f174507e;
    }

    /* renamed from: a */
    public final void mo121366a(boolean z) {
        int i;
        View view = this.f174505c;
        if (view == null) {
            C89219l.m154710a("dotView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setText(int i) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(i);
        C89219l.m154716b(string, "");
        setText(string);
    }

    public final void setTextPaddingLR(float f) {
        int b = (int) C13628n.m24520b(getContext(), f);
        AVDmtTextView aVDmtTextView = this.f174504b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("textView");
        }
        aVDmtTextView.setPadding(b, aVDmtTextView.getPaddingTop(), b, aVDmtTextView.getPaddingBottom());
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f174504b;
            if (aVDmtTextView == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView.setVisibility(0);
            SimpleDraweeView simpleDraweeView = this.f174503a;
            if (simpleDraweeView == null) {
                C89219l.m154710a("iconImgView");
            }
            simpleDraweeView.setVisibility(8);
            AVDmtTextView aVDmtTextView2 = this.f174504b;
            if (aVDmtTextView2 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView2.setText(str);
        }
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.f174506d;
        } else {
            i = this.f174507e;
        }
        AVDmtTextView aVDmtTextView = this.f174504b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("textView");
        }
        aVDmtTextView.setTextColor(i);
        SimpleDraweeView simpleDraweeView = this.f174503a;
        if (simpleDraweeView == null) {
            C89219l.m154710a("iconImgView");
        }
        simpleDraweeView.setImageAlpha(Color.alpha(i));
        if (!C84370a.f188623l.f188627c) {
            return;
        }
        if (z) {
            AVDmtTextView aVDmtTextView2 = this.f174504b;
            if (aVDmtTextView2 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView2.mo121359b();
            AVDmtTextView aVDmtTextView3 = this.f174504b;
            if (aVDmtTextView3 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(1));
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f174504b;
        if (aVDmtTextView4 == null) {
            C89219l.m154710a("textView");
        }
        aVDmtTextView4.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C77792a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9960);
        this.f174506d = -1;
        this.f174507e = -1;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a9h, this, true);
        View findViewById = a.findViewById(R.id.ee3);
        C89219l.m154716b(findViewById, "");
        this.f174503a = (SimpleDraweeView) findViewById;
        View findViewById2 = a.findViewById(R.id.ee5);
        C89219l.m154716b(findViewById2, "");
        this.f174504b = (AVDmtTextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.ee2);
        C89219l.m154716b(findViewById3, "");
        this.f174505c = findViewById3;
        int c = C0643b.m2378c(context, R.color.b9);
        View view = this.f174505c;
        if (view == null) {
            C89219l.m154710a("dotView");
        }
        view.setBackground(C84916a.m145946a(c, c, 0));
        AVDmtTextView aVDmtTextView = this.f174504b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (C84370a.f188623l.f188626b) {
            AVDmtTextView aVDmtTextView2 = this.f174504b;
            if (aVDmtTextView2 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView2.mo121359b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f174504b;
            if (aVDmtTextView3 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f174504b;
        if (aVDmtTextView4 == null) {
            C89219l.m154710a("textView");
        }
        aVDmtTextView4.setSingleLine();
        if (!AVUIUXBugsExperimentServiceDiff.m103001b().mo93971a()) {
            AVDmtTextView aVDmtTextView5 = this.f174504b;
            if (aVDmtTextView5 == null) {
                C89219l.m154710a("textView");
            }
            aVDmtTextView5.setEllipsize(TextUtils.TruncateAt.END);
        }
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        MethodCollector.m26664o(9960);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C77792a(Context context, byte b) {
        this(context);
        C89219l.m154721d(context, "");
        this.f174508f = false;
        int i = C77795c.f174518a;
        this.f174506d = i;
        this.f174507e = (i & 16777215) | Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void mo121365a(int i, int i2) {
        if (!C84370a.f188623l.f188628d) {
            setLayoutParams(new FrameLayout.LayoutParams((int) (((float) C13628n.m24504a(getContext())) / 4.5f), -2));
        } else if (i == 0) {
            setPadding((int) C13628n.m24520b(getContext(), 6.0f), 0, 0, 0);
        } else if (i == i2 - 1) {
            setPadding(0, 0, (int) C13628n.m24520b(getContext(), 6.0f), 0);
        }
    }
}
