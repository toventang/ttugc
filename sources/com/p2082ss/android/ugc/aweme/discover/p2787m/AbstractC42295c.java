package com.p2082ss.android.ugc.aweme.discover.p2787m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj;

/* renamed from: com.ss.android.ugc.aweme.discover.m.c */
public abstract class AbstractC42295c extends AbstractC42662aj {

    /* renamed from: a */
    private int f98525a;

    /* renamed from: b */
    private int f98526b;

    /* renamed from: c */
    private long f98527c;

    /* renamed from: d */
    private HandlerC42299a f98528d = new HandlerC42299a(new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c.RunnableC422961 */

        static {
            Covode.recordClassIndex(50239);
        }

        public final void run() {
            AbstractC42295c.this.mo70884a();
            AbstractC42295c.this.f98529g = true;
        }
    });

    /* renamed from: g */
    public boolean f98529g;

    static {
        Covode.recordClassIndex(50238);
    }

    /* renamed from: a */
    public abstract void mo70884a();

    /* renamed from: com.ss.android.ugc.aweme.discover.m.c$a */
    static class HandlerC42299a extends Handler {

        /* renamed from: a */
        private Runnable f98537a;

        static {
            Covode.recordClassIndex(50242);
        }

        HandlerC42299a(Runnable runnable) {
            this.f98537a = runnable;
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                this.f98537a.run();
            }
            super.handleMessage(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b = mo64559b(view);
            b.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c.C422972 */

                static {
                    Covode.recordClassIndex(50240);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b.start();
            this.f98525a = (int) motionEvent.getX();
            this.f98526b = (int) motionEvent.getY();
            this.f98527c = System.currentTimeMillis();
            this.f98529g = false;
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f98528d.sendMessageDelayed(obtain, 500);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f98525a) > 50 || Math.abs(y - this.f98526b) > 50) {
                this.f98528d.removeCallbacksAndMessages(null);
            }
        } else if (motionEvent.getAction() == 1) {
            Animator c = mo64560c(view);
            if ((!this.f98528d.hasMessages(1) && !this.f98529g) || System.currentTimeMillis() - this.f98527c < 500) {
                c.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c.C422983 */

                    static {
                        Covode.recordClassIndex(50241);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AbstractC42295c.this.mo70824a(view);
                    }
                });
            }
            c.start();
            this.f98528d.removeCallbacksAndMessages(null);
            return true;
        } else if (motionEvent.getAction() == 3) {
            mo64560c(view).start();
            this.f98528d.removeCallbacksAndMessages(null);
        }
        return false;
    }
}
