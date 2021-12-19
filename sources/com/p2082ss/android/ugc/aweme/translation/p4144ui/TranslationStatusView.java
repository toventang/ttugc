package com.p2082ss.android.ugc.aweme.translation.p4144ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView */
public class TranslationStatusView extends FrameLayout {

    /* renamed from: a */
    public LinearLayout f177646a;

    /* renamed from: b */
    public AbstractC79037b f177647b;

    /* renamed from: c */
    public ObjectAnimator f177648c;

    /* renamed from: d */
    private TuxTextView f177649d;

    /* renamed from: e */
    private TuxTextView f177650e;

    /* renamed from: f */
    private AbstractC79036a f177651f;

    /* renamed from: g */
    private ImageView f177652g;

    /* renamed from: h */
    private TuxTextView f177653h;

    /* renamed from: i */
    private int f177654i;

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$a */
    public interface AbstractC79036a {
        static {
            Covode.recordClassIndex(92210);
        }

        /* renamed from: a */
        void mo85293a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b */
    public interface AbstractC79037b {
        static {
            Covode.recordClassIndex(92211);
        }

        /* renamed from: a */
        void mo85302a();

        /* renamed from: b */
        void mo85303b();
    }

    static {
        Covode.recordClassIndex(92206);
    }

    public int getStatus() {
        return this.f177654i;
    }

    public AbstractC79036a getmUploadMobListener() {
        return this.f177651f;
    }

    /* renamed from: c */
    private static FrameLayout.LayoutParams m137868c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f177648c.cancel();
    }

    /* renamed from: b */
    private TuxTextView m137867b() {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        return tuxTextView;
    }

    /* renamed from: a */
    public final void mo122861a() {
        this.f177654i = 0;
        this.f177649d.setAlpha(1.0f);
        this.f177649d.setVisibility(0);
        this.f177646a.setVisibility(8);
        this.f177650e.setVisibility(8);
    }

    public void setOnTranslationViewClickListener(AbstractC79037b bVar) {
        this.f177647b = bVar;
    }

    public void setmUploadMobListener(AbstractC79036a aVar) {
        this.f177651f = aVar;
    }

    public TranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoadingDrawable(int i) {
        this.f177652g.setImageResource(i);
    }

    /* renamed from: a */
    private View m137866a(int i) {
        TuxTextView tuxTextView = this.f177649d;
        if (i == 0) {
            return tuxTextView;
        }
        if (i == 1) {
            return this.f177646a;
        }
        if (i != 2) {
            return tuxTextView;
        }
        return this.f177650e;
    }

    public void setStatusWithoutAnim(int i) {
        int i2 = this.f177654i;
        if (i2 != i) {
            View a = m137866a(i2);
            View a2 = m137866a(i);
            a.setVisibility(8);
            a2.setVisibility(0);
            a2.setAlpha(1.0f);
            this.f177654i = i;
            AbstractC79036a aVar = this.f177651f;
            if (aVar != null) {
                aVar.mo85293a(i);
            }
        }
    }

    public void setTextColor(int i) {
        this.f177653h.setTextColor(getContext().getResources().getColor(i));
        this.f177649d.setTextColor(getContext().getResources().getColor(i));
        this.f177650e.setTextColor(getContext().getResources().getColor(i));
    }

    public void setStatus(int i) {
        AbstractC79036a aVar = this.f177651f;
        if (aVar != null) {
            aVar.mo85293a(i);
        }
        int i2 = this.f177654i;
        if (i2 != i) {
            final View a = m137866a(i2);
            final View a2 = m137866a(i);
            ObjectAnimator duration = ObjectAnimator.ofFloat(a, "alpha", 0.0f).setDuration(150L);
            duration.setInterpolator(new LinearInterpolator());
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(a2, "alpha", 0.0f, 1.0f).setDuration(150L);
            duration2.setInterpolator(new LinearInterpolator());
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView.C790353 */

                static {
                    Covode.recordClassIndex(92209);
                }

                public final void onAnimationEnd(Animator animator) {
                    a.setVisibility(8);
                    a2.setVisibility(0);
                    if (a == TranslationStatusView.this.f177646a) {
                        TranslationStatusView.this.f177648c.cancel();
                    }
                    if (a2 == TranslationStatusView.this.f177646a) {
                        TranslationStatusView.this.f177648c.start();
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
            this.f177654i = i;
        }
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TranslationStatusView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7616);
        TuxTextView b2 = m137867b();
        this.f177649d = b2;
        b2.setText(R.string.fhh);
        this.f177649d.setLayoutParams(m137868c());
        this.f177649d.setGravity(16);
        C17235c.m31810a(this.f177649d, 0.5f);
        this.f177649d.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView.View$OnClickListenerC790331 */

            static {
                Covode.recordClassIndex(92207);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TranslationStatusView.this.setStatus(1);
                if (TranslationStatusView.this.f177647b != null) {
                    TranslationStatusView.this.f177647b.mo85302a();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f177646a = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f177646a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        this.f177652g = imageView;
        imageView.setImageResource(2131231553);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f177652g, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.f177648c = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f177648c.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.f177652g.setLayoutParams(layoutParams);
        this.f177646a.addView(this.f177652g);
        TuxTextView b3 = m137867b();
        this.f177653h = b3;
        b3.setText(R.string.xn);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C13628n.m24520b(getContext(), 6.0f);
        layoutParams2.gravity = 16;
        this.f177653h.setLayoutParams(layoutParams2);
        this.f177646a.addView(this.f177653h);
        TuxTextView b4 = m137867b();
        this.f177650e = b4;
        b4.setText(R.string.fhg);
        this.f177650e.setLayoutParams(m137868c());
        this.f177650e.setGravity(16);
        C17235c.m31810a(this.f177650e, 0.5f);
        this.f177650e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView.View$OnClickListenerC790342 */

            static {
                Covode.recordClassIndex(92208);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TranslationStatusView.this.setStatus(0);
                if (TranslationStatusView.this.f177647b != null) {
                    TranslationStatusView.this.f177647b.mo85303b();
                }
            }
        });
        mo122861a();
        addView(this.f177650e);
        addView(this.f177646a);
        addView(this.f177649d);
        MethodCollector.m26664o(7616);
    }
}
