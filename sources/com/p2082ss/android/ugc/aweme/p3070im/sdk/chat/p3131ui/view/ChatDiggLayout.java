package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0778h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatDiggLayout */
public class ChatDiggLayout extends FrameLayout {

    /* renamed from: f */
    private static Drawable f124723f;

    /* renamed from: a */
    Queue<ImageView> f124724a;

    /* renamed from: b */
    int f124725b;

    /* renamed from: c */
    int f124726c;

    /* renamed from: d */
    Random f124727d;

    /* renamed from: e */
    private Context f124728e;

    static {
        Covode.recordClassIndex(64153);
    }

    /* renamed from: a */
    private void m99787a(final ImageView imageView) {
        float nextInt = (float) (this.f124727d.nextInt(20) - 10);
        imageView.setRotation(nextInt);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(500);
        animationSet2.setStartOffset(500);
        animationSet2.setFillAfter(true);
        animationSet2.setInterpolator(new DecelerateInterpolator());
        float nextInt2 = (((float) this.f124727d.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int b = (int) C13628n.m24520b(this.f124728e, 50.0f);
        float f = (float) (-(this.f124727d.nextInt(b) + b));
        double d = (double) f;
        double d2 = (double) nextInt;
        Double.isNaN(d2);
        double tan = Math.tan((d2 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d * tan), 0.0f, f);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        imageView.startAnimation(animationSet);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatDiggLayout.animationAnimation$AnimationListenerC544481 */

            static {
                Covode.recordClassIndex(64154);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                ChatDiggLayout.this.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatDiggLayout.animationAnimation$AnimationListenerC544481.RunnableC544491 */

                    static {
                        Covode.recordClassIndex(64155);
                    }

                    public final void run() {
                        if (ChatDiggLayout.this.f124724a.size() < 3) {
                            ChatDiggLayout.this.f124724a.add(imageView);
                        }
                        imageView.setImageDrawable(null);
                        imageView.clearAnimation();
                        ChatDiggLayout.this.removeView(imageView);
                    }
                });
            }
        });
    }

    public ChatDiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo91514a(float f, float f2) {
        ImageView poll;
        MethodCollector.m26663i(3457);
        if (this.f124724a.isEmpty()) {
            poll = new ImageView(this.f124728e);
            if (f124723f == null) {
                f124723f = C0643b.m2369a(this.f124728e, 2131232820);
            }
        } else {
            poll = this.f124724a.poll();
        }
        poll.setImageDrawable(f124723f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f124726c, this.f124725b);
        layoutParams.setMargins(0, (int) (f2 - ((float) this.f124725b)), 0, 0);
        C0778h.m2703a(layoutParams, (int) (f - ((float) (this.f124726c / 2))));
        poll.setLayoutParams(layoutParams);
        if (poll.getParent() == null) {
            addView(poll);
        }
        m99787a(poll);
        MethodCollector.m26664o(3457);
    }

    private ChatDiggLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3448);
        this.f124724a = new LinkedList();
        this.f124725b = -1;
        this.f124726c = -1;
        this.f124728e = context;
        this.f124727d = new Random();
        this.f124726c = (int) C13628n.m24520b(context, 72.0f);
        this.f124725b = (int) C13628n.m24520b(context, 79.0f);
        MethodCollector.m26664o(3448);
    }
}
