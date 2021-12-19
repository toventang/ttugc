package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70435a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView */
public final class StickPointModeChangeView extends FrameLayout {

    /* renamed from: h */
    public static final C70486a f157511h = new C70486a((byte) 0);

    /* renamed from: a */
    public AVDmtTextView f157512a;

    /* renamed from: b */
    public AVDmtTextView f157513b;

    /* renamed from: c */
    public DmtThreeAngleView f157514c;

    /* renamed from: d */
    public final int[] f157515d;

    /* renamed from: e */
    public final int[] f157516e;

    /* renamed from: f */
    public int f157517f;

    /* renamed from: g */
    public int f157518g;

    /* renamed from: i */
    private AbstractC70435a f157519i;

    /* renamed from: j */
    private final Runnable f157520j;

    static {
        Covode.recordClassIndex(82931);
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$a */
    public static final class C70486a {
        static {
            Covode.recordClassIndex(82932);
        }

        private C70486a() {
        }

        public /* synthetic */ C70486a(byte b) {
            this();
        }
    }

    public final int getCurrentMode() {
        return this.f157517f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$d */
    static final class RunnableC70489d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f157523a;

        static {
            Covode.recordClassIndex(82935);
        }

        RunnableC70489d(StickPointModeChangeView stickPointModeChangeView) {
            this.f157523a = stickPointModeChangeView;
        }

        public final void run() {
            StickPointModeChangeView.m124339b(this.f157523a).getLocationOnScreen(this.f157523a.f157515d);
            StickPointModeChangeView.m124340c(this.f157523a).getLocationOnScreen(this.f157523a.f157516e);
            ViewGroup.LayoutParams layoutParams = StickPointModeChangeView.m124338a(this.f157523a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (this.f157523a.f157517f == 1) {
                layoutParams2.leftMargin = (this.f157523a.f157515d[0] + (StickPointModeChangeView.m124339b(this.f157523a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m124338a(this.f157523a).getMeasuredWidth() / 2);
            } else {
                layoutParams2.leftMargin = (this.f157523a.f157516e[0] + (StickPointModeChangeView.m124340c(this.f157523a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m124338a(this.f157523a).getMeasuredWidth() / 2);
            }
            StickPointModeChangeView.m124338a(this.f157523a).setLayoutParams(layoutParams2);
            StickPointModeChangeView stickPointModeChangeView = this.f157523a;
            stickPointModeChangeView.f157518g = (stickPointModeChangeView.f157516e[0] - this.f157523a.f157515d[0]) + ((StickPointModeChangeView.m124340c(this.f157523a).getMeasuredWidth() - StickPointModeChangeView.m124339b(this.f157523a).getMeasuredWidth()) / 2);
        }
    }

    public final void setStickPointModeChangeListener(AbstractC70435a aVar) {
        C89219l.m154721d(aVar, "");
        this.f157519i = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$b */
    public static final class C70487b extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f157521a;

        static {
            Covode.recordClassIndex(82933);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70487b(StickPointModeChangeView stickPointModeChangeView) {
            super(500, false, 2);
            this.f157521a = stickPointModeChangeView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            C89219l.m154721d(view, "");
            StickPointModeChangeView.m124338a(this.f157521a).animate().translationX(0.0f).setDuration(200).start();
            this.f157521a.mo111057a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$c */
    public static final class C70488c extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f157522a;

        static {
            Covode.recordClassIndex(82934);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70488c(StickPointModeChangeView stickPointModeChangeView) {
            super(500, false, 2);
            this.f157522a = stickPointModeChangeView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            C89219l.m154721d(view, "");
            StickPointModeChangeView.m124338a(this.f157522a).animate().translationX((float) this.f157522a.f157518g).setDuration(200).start();
            this.f157522a.mo111057a(2);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtThreeAngleView m124338a(StickPointModeChangeView stickPointModeChangeView) {
        DmtThreeAngleView dmtThreeAngleView = stickPointModeChangeView.f157514c;
        if (dmtThreeAngleView == null) {
            C89219l.m154710a("angleView");
        }
        return dmtThreeAngleView;
    }

    /* renamed from: b */
    public static final /* synthetic */ AVDmtTextView m124339b(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f157512a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("stickPointModeView");
        }
        return aVDmtTextView;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m124340c(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f157513b;
        if (aVDmtTextView == null) {
            C89219l.m154710a("normalModeView");
        }
        return aVDmtTextView;
    }

    /* renamed from: a */
    public final void mo111057a(int i) {
        this.f157517f = i;
        if (i == 1) {
            AVDmtTextView aVDmtTextView = this.f157512a;
            if (aVDmtTextView == null) {
                C89219l.m154710a("stickPointModeView");
            }
            aVDmtTextView.setSelected(true);
            AVDmtTextView aVDmtTextView2 = this.f157513b;
            if (aVDmtTextView2 == null) {
                C89219l.m154710a("normalModeView");
            }
            aVDmtTextView2.setSelected(false);
            AVDmtTextView aVDmtTextView3 = this.f157513b;
            if (aVDmtTextView3 == null) {
                C89219l.m154710a("normalModeView");
            }
            aVDmtTextView3.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            AVDmtTextView aVDmtTextView4 = this.f157513b;
            if (aVDmtTextView4 == null) {
                C89219l.m154710a("normalModeView");
            }
            TextPaint paint = aVDmtTextView4.getPaint();
            C89219l.m154716b(paint, "");
            paint.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView5 = this.f157512a;
            if (aVDmtTextView5 == null) {
                C89219l.m154710a("stickPointModeView");
            }
            aVDmtTextView5.mo121359b();
            AVDmtTextView aVDmtTextView6 = this.f157512a;
            if (aVDmtTextView6 == null) {
                C89219l.m154710a("stickPointModeView");
            }
            TextPaint paint2 = aVDmtTextView6.getPaint();
            C89219l.m154716b(paint2, "");
            paint2.setFakeBoldText(true);
        } else {
            AVDmtTextView aVDmtTextView7 = this.f157512a;
            if (aVDmtTextView7 == null) {
                C89219l.m154710a("stickPointModeView");
            }
            aVDmtTextView7.setSelected(false);
            AVDmtTextView aVDmtTextView8 = this.f157513b;
            if (aVDmtTextView8 == null) {
                C89219l.m154710a("normalModeView");
            }
            aVDmtTextView8.setSelected(true);
            AVDmtTextView aVDmtTextView9 = this.f157512a;
            if (aVDmtTextView9 == null) {
                C89219l.m154710a("stickPointModeView");
            }
            aVDmtTextView9.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            AVDmtTextView aVDmtTextView10 = this.f157512a;
            if (aVDmtTextView10 == null) {
                C89219l.m154710a("stickPointModeView");
            }
            TextPaint paint3 = aVDmtTextView10.getPaint();
            C89219l.m154716b(paint3, "");
            paint3.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView11 = this.f157513b;
            if (aVDmtTextView11 == null) {
                C89219l.m154710a("normalModeView");
            }
            aVDmtTextView11.mo121359b();
            AVDmtTextView aVDmtTextView12 = this.f157513b;
            if (aVDmtTextView12 == null) {
                C89219l.m154710a("normalModeView");
            }
            TextPaint paint4 = aVDmtTextView12.getPaint();
            C89219l.m154716b(paint4, "");
            paint4.setFakeBoldText(true);
        }
        AbstractC70435a aVar = this.f157519i;
        if (aVar != null) {
            aVar.mo110829a(i);
        }
    }

    private /* synthetic */ StickPointModeChangeView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointModeChangeView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11841);
        this.f157515d = new int[2];
        this.f157516e = new int[2];
        this.f157517f = 1;
        RunnableC70489d dVar = new RunnableC70489d(this);
        this.f157520j = dVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ai6, this);
        View findViewById = inflate.findViewById(R.id.e82);
        C89219l.m154716b(findViewById, "");
        this.f157512a = (AVDmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ctm);
        C89219l.m154716b(findViewById2, "");
        this.f157513b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.jt);
        C89219l.m154716b(findViewById3, "");
        DmtThreeAngleView dmtThreeAngleView = (DmtThreeAngleView) findViewById3;
        this.f157514c = dmtThreeAngleView;
        if (dmtThreeAngleView == null) {
            C89219l.m154710a("angleView");
        }
        dmtThreeAngleView.setBgColor(C77795c.m135910a(true, true, false, false));
        DmtThreeAngleView dmtThreeAngleView2 = this.f157514c;
        if (dmtThreeAngleView2 == null) {
            C89219l.m154710a("angleView");
        }
        C89219l.m154716b(inflate, "");
        dmtThreeAngleView2.setRoundRadius((int) C13628n.m24520b(inflate.getContext(), 4.0f));
        AVDmtTextView aVDmtTextView = this.f157512a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("stickPointModeView");
        }
        aVDmtTextView.setOnClickListener(new C70487b(this));
        AVDmtTextView aVDmtTextView2 = this.f157513b;
        if (aVDmtTextView2 == null) {
            C89219l.m154710a("normalModeView");
        }
        aVDmtTextView2.setOnClickListener(new C70488c(this));
        this.f157517f = 1;
        AVDmtTextView aVDmtTextView3 = this.f157512a;
        if (aVDmtTextView3 == null) {
            C89219l.m154710a("stickPointModeView");
        }
        aVDmtTextView3.post(dVar);
        mo111057a(this.f157517f);
        MethodCollector.m26664o(11841);
    }
}
