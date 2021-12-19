package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.MarqueeView2;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.detail.h.y */
public abstract class AbstractC41220y extends C41178b {

    /* renamed from: F */
    protected View f96327F;

    /* renamed from: G */
    protected boolean f96328G;

    /* renamed from: H */
    Drawable f96329H;

    /* renamed from: I */
    Drawable f96330I;

    /* renamed from: a */
    private RelativeLayout f96331a;

    static {
        Covode.recordClassIndex(49103);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo70386a(RelativeLayout relativeLayout);

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(214, new RunnableC90250g(AbstractC41220y.class, "onCancelVideoCoverMaskEvent", C49674b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo70388n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo70389o();

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: H */
    public final void mo70402H() {
        super.mo70402H();
        mo70394ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        super.mo70407p();
        mo70394ab();
    }

    /* renamed from: ab */
    private void mo70394ab() {
        if (C80635y.m139811f(mo81109aD())) {
            C34729o.m70955a(this.f96327F, 4);
        } else {
            C34729o.m70955a(this.f96327F, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33409e, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    public void bs_() {
        super.bs_();
        View view = this.f96327F;
        if (view != null) {
            view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f96327F.getLayoutParams();
            int i = C33403c.f79378n;
            int a = C33403c.m68502a();
            if (i == 0) {
                i = a;
            }
            layoutParams.height = i;
            this.f96327F.setLayoutParams(layoutParams);
            if (!C33403c.C33406b.f79409a.f79388q) {
                this.f96328G = true;
                View view2 = this.f96327F;
                View findViewById = view2.findViewById(R.id.b0j);
                View findViewById2 = view2.findViewById(R.id.b10);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public void mo70387m() {
        if (this.f183419bv != null && !this.f183419bv.isFinishing() && aH_() != null && this.f96331a == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f183419bv);
            this.f96331a = relativeLayout;
            ((ViewGroup) aH_().getView()).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
            View a = mo70386a(this.f96331a);
            this.f96327F = a;
            View findViewById = a.findViewById(R.id.ui);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                TextView textView = (TextView) viewGroup.findViewById(R.id.dgf);
                if (textView != null) {
                    textView.setText(mo70389o());
                    viewGroup.post(new RunnableC41139aa(this, viewGroup, textView));
                }
                findViewById.setOnClickListener(new View$OnClickListenerC41222z(this));
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.f96331a.addView(this.f96327F, layoutParams);
            View view = new View(this.f183419bv);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) C13628n.m24520b(this.f183419bv, 12.0f));
            layoutParams2.addRule(6, this.f96327F.getId());
            this.f96331a.addView(view, layoutParams2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    @AbstractC90264r
    public void onCancelVideoCoverMaskEvent(C49674b bVar) {
        C34729o.m70955a(this.f96327F, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70549a(final MarqueeView2 marqueeView2, final String str) {
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a != null) {
            marqueeView2.getPaint().setTypeface(a);
        }
        marqueeView2.setText(str);
        marqueeView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y.ViewTreeObserver$OnGlobalLayoutListenerC412211 */

            static {
                Covode.recordClassIndex(49104);
            }

            public final void onGlobalLayout() {
                marqueeView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = marqueeView2.getMeasuredWidth();
                if (((float) measuredWidth) < marqueeView2.getPaint().measureText(str)) {
                    if (!AbstractC41220y.this.f96328G && AbstractC41220y.this.f96327F != null) {
                        AbstractC41220y yVar = AbstractC41220y.this;
                        View view = yVar.f96327F;
                        View findViewById = view.findViewById(R.id.b0j);
                        View findViewById2 = view.findViewById(R.id.b10);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                        }
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(0);
                        }
                        if (!(!C80471gb.m139483a(yVar.f183419bv) || findViewById2 == null || findViewById == null)) {
                            if (yVar.f96329H == null) {
                                yVar.f96329H = findViewById.getBackground();
                            }
                            if (yVar.f96330I == null) {
                                yVar.f96330I = findViewById2.getBackground();
                            }
                            findViewById.setBackground(yVar.f96330I);
                            findViewById2.setBackground(yVar.f96329H);
                        }
                    }
                    marqueeView2.mo85788a();
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m83084a(TextView textView, int i, int i2, int i3) {
        textView.setTextSize(1, (float) i3);
        if (((int) textView.getPaint().measureText(textView.getText().toString())) + i2 > i) {
            return true;
        }
        return false;
    }
}
