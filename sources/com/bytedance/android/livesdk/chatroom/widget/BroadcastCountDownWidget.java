package com.bytedance.android.livesdk.chatroom.widget;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public final class BroadcastCountDownWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public CountDownView.AbstractC8132a f20142a;

    static {
        Covode.recordClassIndex(8932);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b4p;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (getView() instanceof CountDownView) {
            View view = getView();
            if (!(view instanceof CountDownView)) {
                view = null;
            }
            CountDownView countDownView = (CountDownView) view;
            if (countDownView != null) {
                countDownView.setCountDownListener(this.f20142a);
                countDownView.setVisibility(0);
                new CountDownTimer((long) countDownView.f20164d) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.CountDownTimerC81291 */

                    static {
                        Covode.recordClassIndex(8940);
                    }

                    public final void onFinish() {
                        CountDownView.this.post(new Runnable() {
                            /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.CountDownTimerC81291.RunnableC81312 */

                            static {
                                Covode.recordClassIndex(8942);
                            }

                            public final void run() {
                                MethodCollector.m26663i(8924);
                                ViewGroup viewGroup = (ViewGroup) CountDownView.this.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(CountDownView.this);
                                }
                                MethodCollector.m26664o(8924);
                            }
                        });
                        CountDownView.this.setVisibility(8);
                        if (CountDownView.this.f20163c != null) {
                            CountDownView.this.f20163c.mo14239a();
                        }
                    }

                    public final void onTick(long j) {
                        long j2 = j / 1000;
                        CountDownView.this.f20162b.setText(String.valueOf(j2));
                        if (j2 < 2) {
                            CountDownView.this.f20161a.setAnimationListener(new Animation.AnimationListener() {
                                /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.CountDownTimerC81291.animationAnimation$AnimationListenerC81301 */

                                static {
                                    Covode.recordClassIndex(8941);
                                }

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    CountDownView.this.setVisibility(8);
                                }
                            });
                        }
                        CountDownView.this.f20161a.reset();
                        CountDownView.this.f20162b.startAnimation(CountDownView.this.f20161a);
                    }
                }.start();
            }
        }
    }
}
