package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView */
public class AudioControlView extends View {

    /* renamed from: a */
    int f131147a;

    /* renamed from: b */
    int f131148b;

    /* renamed from: c */
    public AbstractC57505b f131149c;

    /* renamed from: d */
    public ValueAnimator f131150d;

    /* renamed from: e */
    public HandlerC57504a f131151e;

    /* renamed from: f */
    volatile boolean f131152f;

    /* renamed from: g */
    private Paint f131153g;

    /* renamed from: h */
    private int f131154h;

    /* renamed from: i */
    private float f131155i;

    /* renamed from: j */
    private boolean f131156j;

    /* renamed from: k */
    private HandlerThread f131157k;

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView$b */
    public interface AbstractC57505b {
        static {
            Covode.recordClassIndex(67441);
        }

        /* renamed from: a */
        void mo94705a();

        /* renamed from: b */
        void mo94706b();
    }

    static {
        Covode.recordClassIndex(67437);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView$a */
    public static class HandlerC57504a extends Handler {

        /* renamed from: a */
        final WeakReference<AudioControlView> f131160a;

        /* renamed from: b */
        int f131161b;

        /* renamed from: c */
        int f131162c;

        /* renamed from: d */
        public boolean f131163d;

        /* renamed from: e */
        private AudioManager f131164e;

        /* renamed from: f */
        private int f131165f;

        static {
            Covode.recordClassIndex(67440);
        }

        /* renamed from: b */
        private void m104173b() {
            m104175d();
            m104174c();
        }

        /* renamed from: c */
        private void m104174c() {
            C1731i.m5640b(new CallableC57532a(this), C1731i.f5564c);
        }

        /* renamed from: a */
        private void m104172a() {
            try {
                this.f131162c = this.f131164e.getStreamVolume(3);
                C51423a.m95791b(4, "VoiceAdjust", "currentVolume(syncCurrentVolume) = " + this.f131162c);
            } catch (NullPointerException e) {
                C51423a.m95790a((Throwable) e);
                this.f131163d = true;
            }
        }

        /* renamed from: d */
        private void m104175d() {
            try {
                C51423a.m95791b(4, "VoiceAdjust", "currentVolume(setVolume) = " + this.f131162c);
                this.f131164e.setStreamVolume(3, this.f131162c, 8);
            } catch (SecurityException e) {
                C51423a.m95790a((Throwable) e);
            }
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C51423a.m95784a(4, "VoiceAdjust", "initVolume");
                int streamMaxVolume = this.f131164e.getStreamMaxVolume(3);
                this.f131161b = streamMaxVolume;
                int i2 = streamMaxVolume / 15;
                this.f131165f = i2;
                if (i2 == 0) {
                    this.f131165f = 1;
                }
                m104172a();
            } else if (i == 2) {
                C51423a.m95784a(4, "VoiceAdjust", "execAddVolume");
                m104172a();
                int i3 = this.f131162c + this.f131165f;
                this.f131162c = i3;
                int i4 = this.f131161b;
                if (i3 > i4) {
                    this.f131162c = i4;
                }
                m104173b();
            } else if (i == 3) {
                C51423a.m95784a(4, "VoiceAdjust", "execCutVolume");
                m104172a();
                int i5 = this.f131162c - this.f131165f;
                this.f131162c = i5;
                if (i5 < 0) {
                    this.f131162c = 0;
                }
                m104173b();
            }
        }

        private HandlerC57504a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f131160a = new WeakReference<>(audioControlView);
            this.f131164e = (AudioManager) m104171a(audioControlView.getContext(), DataType.AUDIO);
            sendEmptyMessage(1);
        }

        /* renamed from: a */
        private static Object m104171a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(6571);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(6571);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* synthetic */ HandlerC57504a(Looper looper, AudioControlView audioControlView, byte b) {
            this(looper, audioControlView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f131152f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo94749b() {
        ValueAnimator valueAnimator = this.f131150d;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f131150d.cancel();
            this.f131150d = null;
        }
    }

    /* renamed from: a */
    public final void mo94748a() {
        if (this.f131157k == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.f131157k = handlerThread;
            handlerThread.start();
            this.f131151e = new HandlerC57504a(this.f131157k.getLooper(), this, (byte) 0);
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo94749b();
        this.f131149c = null;
        HandlerThread handlerThread = this.f131157k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f131157k = null;
            this.f131151e = null;
        }
        this.f131152f = true;
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.AudioControlView.C575032 */

            static {
                Covode.recordClassIndex(67439);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.mo94748a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(AbstractC57505b bVar) {
        this.f131149c = bVar;
    }

    public void setProgress(float f) {
        this.f131155i = f;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f131154h = i;
        this.f131153g.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6111);
        super.onDraw(canvas);
        if (this.f131156j) {
            int i = this.f131147a;
            int i2 = this.f131148b;
            canvas.drawLine((float) i, (float) (i2 / 2), ((float) i) - (((float) i) * this.f131155i), (float) (i2 / 2), this.f131153g);
            MethodCollector.m26664o(6111);
            return;
        }
        int i3 = this.f131148b;
        canvas.drawLine(0.0f, (float) (i3 / 2), ((float) this.f131147a) * this.f131155i, (float) (i3 / 2), this.f131153g);
        MethodCollector.m26664o(6111);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5955);
        super.onMeasure(i, i2);
        this.f131147a = getMeasuredWidth();
        this.f131148b = getMeasuredHeight();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f131156j = z;
        MethodCollector.m26664o(5955);
    }

    private AudioControlView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5823);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jb, R.attr.uu});
        this.f131154h = obtainStyledAttributes.getColor(1, C0643b.m2378c(context, R.color.np));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f131153g = paint;
        paint.setAntiAlias(true);
        this.f131153g.setColor(this.f131154h);
        this.f131153g.setStyle(Paint.Style.FILL);
        this.f131153g.setStrokeWidth(2.0f);
        MethodCollector.m26664o(5823);
    }
}
