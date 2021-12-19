package com.p2082ss.android.p2092ad.splash.core.p2102g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.p2109f.C29642e;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.splash.core.g.b */
public final class C29488b {

    /* renamed from: a */
    public final Context f70163a;

    /* renamed from: b */
    public final C29455b f70164b;

    /* renamed from: c */
    public final RelativeLayout f70165c;

    /* renamed from: d */
    public LinearLayout f70166d;

    /* renamed from: e */
    public final AbstractC29494a f70167e;

    /* renamed from: f */
    public final PointF f70168f = new PointF();

    /* renamed from: g */
    public final int f70169g;

    /* renamed from: com.ss.android.ad.splash.core.g.b$a */
    public interface AbstractC29494a {
        static {
            Covode.recordClassIndex(35888);
        }

        /* renamed from: a */
        void mo51476a();
    }

    static {
        Covode.recordClassIndex(35882);
    }

    /* renamed from: b */
    private boolean m59091b() {
        if (this.f70164b.f69996U == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m59092c() {
        if (this.f70164b.f69996U == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo51577a() {
        if (m59092c() || m59091b()) {
            return true;
        }
        return false;
    }

    public C29488b(Context context, C29455b bVar, RelativeLayout relativeLayout, AbstractC29494a aVar) {
        final ObjectAnimator objectAnimator;
        MethodCollector.m26663i(13444);
        this.f70163a = context;
        this.f70164b = bVar;
        this.f70165c = relativeLayout;
        this.f70167e = aVar;
        this.f70169g = ViewConfiguration.get(context).getScaledTouchSlop();
        if (mo51577a()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.f70166d = linearLayout;
            linearLayout.setOrientation(1);
            this.f70166d.setBackgroundResource(R.drawable.bkp);
            this.f70166d.setGravity(81);
            if (m59091b()) {
                final ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131233887);
                imageView.setClickable(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = (int) C29661o.m59767a(context, 4.0f);
                this.f70166d.addView(imageView, layoutParams);
                imageView.post(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b.RunnableC294891 */

                    static {
                        Covode.recordClassIndex(35883);
                    }

                    public final void run() {
                        int a = (int) C29661o.m59767a(C29488b.this.f70163a, 8.0f);
                        C29488b.this.f70166d.setTouchDelegate(new C29642e(new Rect(imageView.getLeft() - a, imageView.getTop() - a, imageView.getRight() + a, imageView.getBottom() + a), imageView));
                    }
                });
            }
            TextView textView = new TextView(context);
            textView.setText(bVar.f69997V);
            textView.setTextColor(ColorStateList.valueOf(-1));
            textView.setTextSize(1, 15.0f);
            float a = (float) ((int) C29661o.m59767a(context, 1.0f));
            textView.setShadowLayer(a, 0.0f, a, Color.argb(31, 0, 0, 0));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = (int) C29661o.m59767a(context, 54.0f);
            this.f70166d.addView(textView, layoutParams2);
            if (bVar.f69998W > 0) {
                this.f70166d.setVisibility(8);
                relativeLayout.postDelayed(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b.RunnableC294902 */

                    static {
                        Covode.recordClassIndex(35884);
                    }

                    public final void run() {
                        C29488b.this.f70166d.setAlpha(0.0f);
                        C29488b.this.f70166d.setVisibility(0);
                        ObjectAnimator.ofFloat(C29488b.this.f70166d, "alpha", 0.0f, 1.0f).setDuration(300L).start();
                    }
                }, bVar.f69998W);
            }
            if (m59092c()) {
                objectAnimator = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -C29661o.m59767a(context, 8.0f), 0.0f);
                objectAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                objectAnimator.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b.C294934 */

                    static {
                        Covode.recordClassIndex(35887);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        animator.setStartDelay(1000);
                        animator.start();
                    }
                });
            } else {
                objectAnimator = null;
            }
            this.f70166d.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b.View$OnAttachStateChangeListenerC294913 */

                static {
                    Covode.recordClassIndex(35885);
                }

                public final void onViewDetachedFromWindow(View view) {
                    Animator animator = objectAnimator;
                    if (animator != null) {
                        animator.removeAllListeners();
                        objectAnimator.cancel();
                    }
                }

                public final void onViewAttachedToWindow(View view) {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("refer", "tips");
                    C29446b.m58971a();
                    C29446b.m58973a(C29488b.this.f70164b, 0, "othershow", hashMap, null);
                    if (objectAnimator != null) {
                        C29488b.this.f70165c.postDelayed(new Runnable() {
                            /* class com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b.View$OnAttachStateChangeListenerC294913.RunnableC294921 */

                            static {
                                Covode.recordClassIndex(35886);
                            }

                            public final void run() {
                                objectAnimator.start();
                            }
                        }, C29488b.this.f70164b.f69998W);
                    }
                }
            });
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) C29661o.m59767a(context, 114.0f));
            layoutParams3.addRule(12);
            relativeLayout.addView(this.f70166d, layoutParams3);
        }
        MethodCollector.m26664o(13444);
    }
}
