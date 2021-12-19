package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e */
public final class C53392e extends LinearLayout {

    /* renamed from: a */
    public TuxTextView f122596a;

    /* renamed from: b */
    public View f122597b;

    /* renamed from: c */
    public C43044dj f122598c;

    static {
        Covode.recordClassIndex(62955);
    }

    /* renamed from: a */
    public final void mo89980a() {
        View view = this.f122597b;
        if (view == null) {
            C89219l.m154710a("mHotDot");
        } else {
            view.setVisibility(8);
        }
    }

    public final C43044dj getIconData() {
        C43044dj djVar = this.f122598c;
        if (djVar == null) {
            C89219l.m154710a("iconData");
        }
        return djVar;
    }

    public final View getMHotDot() {
        View view = this.f122597b;
        if (view == null) {
            C89219l.m154710a("mHotDot");
        }
        return view;
    }

    public final TuxTextView getMTextView() {
        TuxTextView tuxTextView = this.f122596a;
        if (tuxTextView == null) {
            C89219l.m154710a("mTextView");
        }
        return tuxTextView;
    }

    public final float getTextWidth() {
        TuxTextView tuxTextView = this.f122596a;
        if (tuxTextView == null) {
            C89219l.m154710a("mTextView");
            return 0.0f;
        }
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            return paint.measureText(getIconData().f100355i);
        }
        return 0.0f;
    }

    public final void setIconData(C43044dj djVar) {
        C89219l.m154721d(djVar, "");
        this.f122598c = djVar;
    }

    public final void setMHotDot(View view) {
        C89219l.m154721d(view, "");
        this.f122597b = view;
    }

    public final void setMTextView(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f122596a = tuxTextView;
    }

    public final void setTextSize(float f) {
        TuxTextView tuxTextView = this.f122596a;
        if (tuxTextView == null) {
            C89219l.m154710a("mTextView");
        } else {
            tuxTextView.setTextSize(1, f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53392e(C43044dj djVar) {
        super(djVar.f100353g, null, 0);
        C89219l.m154721d(djVar, "");
        MethodCollector.m26663i(2034);
        setIconData(djVar);
        setOrientation(0);
        Context context = getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        this.f122596a = tuxTextView;
        tuxTextView.setTuxFont(32);
        TuxTextView tuxTextView2 = this.f122596a;
        if (tuxTextView2 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView2.setGravity(17);
        TuxTextView tuxTextView3 = this.f122596a;
        if (tuxTextView3 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView3.setPadding(C34728n.m70946a(12.0d), 0, C34728n.m70946a(12.0d), 0);
        TuxTextView tuxTextView4 = this.f122596a;
        if (tuxTextView4 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView4.setLines(1);
        TuxTextView tuxTextView5 = this.f122596a;
        if (tuxTextView5 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView5.setTextColor(C0643b.m2378c(getContext(), R.color.l));
        TuxTextView tuxTextView6 = this.f122596a;
        if (tuxTextView6 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView6.setAlpha(0.6f);
        TuxTextView tuxTextView7 = this.f122596a;
        if (tuxTextView7 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView7.setMinWidth(C34728n.m70946a(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C34728n.m70946a(58.0d));
        layoutParams.gravity = 17;
        TuxTextView tuxTextView8 = this.f122596a;
        if (tuxTextView8 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView8.setLayoutParams(layoutParams);
        TuxTextView tuxTextView9 = this.f122596a;
        if (tuxTextView9 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView9.setId(16908308);
        TuxTextView tuxTextView10 = this.f122596a;
        if (tuxTextView10 == null) {
            C89219l.m154710a("mTextView");
        }
        addView(tuxTextView10);
        View view = new View(getContext());
        this.f122597b = view;
        view.setId(R.id.f5_);
        View view2 = this.f122597b;
        if (view2 == null) {
            C89219l.m154710a("mHotDot");
        }
        view2.setBackgroundResource(R.drawable.a_l);
        View view3 = this.f122597b;
        if (view3 == null) {
            C89219l.m154710a("mHotDot");
        }
        view3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C34728n.m70946a(8.0d), C34728n.m70946a(8.0d));
        layoutParams2.setMargins(C34728n.m70946a(-12.0d), C34728n.m70946a(-12.0d), 0, 0);
        int i = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(C34728n.m70946a(-12.0d));
        View view4 = this.f122597b;
        if (view4 == null) {
            C89219l.m154710a("mHotDot");
        }
        view4.setLayoutParams(layoutParams2);
        View view5 = this.f122597b;
        if (view5 == null) {
            C89219l.m154710a("mHotDot");
        }
        addView(view5);
        TuxTextView tuxTextView11 = this.f122596a;
        if (tuxTextView11 == null) {
            C89219l.m154710a("mTextView");
        }
        tuxTextView11.setText(djVar.f100355i);
        View view6 = this.f122597b;
        if (view6 == null) {
            C89219l.m154710a("mHotDot");
        }
        if (C16048b.m29633a().mo25421a(true, "following_red_dot_reverse", false)) {
            if (view6 != null) {
                view6.setBackgroundResource(R.drawable.a_o);
            }
        } else if (view6 != null) {
            view6.setBackgroundResource(R.drawable.a_l);
        }
        TuxTextView tuxTextView12 = this.f122596a;
        if (tuxTextView12 == null) {
            C89219l.m154710a("mTextView");
            MethodCollector.m26664o(2034);
            return;
        }
        tuxTextView12.setShadowLayer(C13628n.m24520b(C17867d.m33078a(), 2.0f), 0.0f, C13628n.m24520b(C17867d.m33078a(), 2.0f), Color.parseColor("#26000000"));
        MethodCollector.m26664o(2034);
    }
}
