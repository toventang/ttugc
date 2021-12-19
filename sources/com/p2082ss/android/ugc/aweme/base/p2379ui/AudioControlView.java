package com.p2082ss.android.ugc.aweme.base.p2379ui;

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

/* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView */
public class AudioControlView extends View {

    /* renamed from: a */
    int f81841a;

    /* renamed from: b */
    int f81842b;

    /* renamed from: c */
    public AbstractC34658b f81843c;

    /* renamed from: d */
    public ValueAnimator f81844d;

    /* renamed from: e */
    public HandlerC34657a f81845e;

    /* renamed from: f */
    volatile boolean f81846f;

    /* renamed from: g */
    private Paint f81847g;

    /* renamed from: h */
    private int f81848h;

    /* renamed from: i */
    private float f81849i;

    /* renamed from: j */
    private boolean f81850j;

    /* renamed from: k */
    private HandlerThread f81851k;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$b */
    public interface AbstractC34658b {
        static {
            Covode.recordClassIndex(41630);
        }

        /* renamed from: a */
        void mo61283a();

        /* renamed from: b */
        void mo61284b();
    }

    static {
        Covode.recordClassIndex(41626);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$a */
    public static class HandlerC34657a extends Handler {

        /* renamed from: a */
        final WeakReference<AudioControlView> f81854a;

        /* renamed from: b */
        int f81855b;

        /* renamed from: c */
        int f81856c;

        /* renamed from: d */
        public boolean f81857d;

        /* renamed from: e */
        public boolean f81858e;

        /* renamed from: f */
        private AudioManager f81859f;

        /* renamed from: g */
        private int f81860g;

        static {
            Covode.recordClassIndex(41629);
        }

        /* renamed from: b */
        private void m70771b() {
            m70773d();
            m70772c();
        }

        /* renamed from: c */
        private void m70772c() {
            C1731i.m5640b(new CallableC34683c(this), C1731i.f5564c);
        }

        /* renamed from: a */
        private void m70770a() {
            try {
                this.f81856c = this.f81859f.getStreamVolume(3);
                C51423a.m95791b(4, "VoiceAdjust", "currentVolume(syncCurrentVolume) = " + this.f81856c);
            } catch (NullPointerException e) {
                C51423a.m95790a((Throwable) e);
                this.f81857d = true;
            }
        }

        /* renamed from: d */
        private void m70773d() {
            try {
                if (this.f81858e) {
                    C51423a.m95791b(4, "VoiceAdjust", "currentVolume(setVolume) = " + this.f81856c);
                    this.f81859f.setStreamVolume(3, this.f81856c, 8);
                }
            } catch (SecurityException e) {
                C51423a.m95790a((Throwable) e);
            }
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C51423a.m95784a(4, "VoiceAdjust", "initVolume");
                int streamMaxVolume = this.f81859f.getStreamMaxVolume(3);
                this.f81855b = streamMaxVolume;
                int i2 = streamMaxVolume / 15;
                this.f81860g = i2;
                if (i2 == 0) {
                    this.f81860g = 1;
                }
                m70770a();
            } else if (i == 2) {
                C51423a.m95784a(4, "VoiceAdjust", "execAddVolume");
                m70770a();
                int i3 = this.f81856c + this.f81860g;
                this.f81856c = i3;
                int i4 = this.f81855b;
                if (i3 > i4) {
                    this.f81856c = i4;
                }
                m70771b();
            } else if (i == 3) {
                C51423a.m95784a(4, "VoiceAdjust", "execCutVolume");
                m70770a();
                int i5 = this.f81856c - this.f81860g;
                this.f81856c = i5;
                if (i5 < 0) {
                    this.f81856c = 0;
                }
                m70771b();
            }
        }

        private HandlerC34657a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f81858e = true;
            this.f81854a = new WeakReference<>(audioControlView);
            this.f81859f = (AudioManager) m70769a(audioControlView.getContext(), DataType.AUDIO);
            sendEmptyMessage(1);
        }

        /* renamed from: a */
        private static Object m70769a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(5266);
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
                        MethodCollector.m26664o(5266);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* synthetic */ HandlerC34657a(Looper looper, AudioControlView audioControlView, byte b) {
            this(looper, audioControlView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f81846f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo61268d() {
        ValueAnimator valueAnimator = this.f81844d;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f81844d.cancel();
            this.f81844d = null;
        }
    }

    /* renamed from: e */
    public final boolean mo61270e() {
        HandlerC34657a aVar = this.f81845e;
        if (aVar != null) {
            return aVar.f81857d;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo61265a() {
        if (this.f81851k == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.f81851k = handlerThread;
            handlerThread.start();
            this.f81845e = new HandlerC34657a(this.f81851k.getLooper(), this, (byte) 0);
        }
    }

    /* renamed from: b */
    public final void mo61266b() {
        mo61265a();
        C51423a.m95784a(4, "VoiceAdjust", "cutVolume");
        this.f81845e.sendEmptyMessage(3);
    }

    /* renamed from: c */
    public final void mo61267c() {
        mo61265a();
        C51423a.m95784a(4, "VoiceAdjust", "addVolume");
        this.f81845e.sendEmptyMessage(2);
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo61268d();
        this.f81843c = null;
        HandlerThread handlerThread = this.f81851k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f81851k = null;
            this.f81845e = null;
        }
        this.f81846f = true;
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.C346562 */

            static {
                Covode.recordClassIndex(41628);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.mo61265a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(AbstractC34658b bVar) {
        this.f81843c = bVar;
    }

    public void setProgress(float f) {
        this.f81849i = f;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f81848h = i;
        this.f81847g.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5295);
        super.onDraw(canvas);
        if (this.f81850j) {
            int i = this.f81841a;
            int i2 = this.f81842b;
            canvas.drawLine((float) i, (float) (i2 / 2), ((float) i) - (((float) i) * this.f81849i), (float) (i2 / 2), this.f81847g);
            MethodCollector.m26664o(5295);
            return;
        }
        int i3 = this.f81842b;
        canvas.drawLine(0.0f, (float) (i3 / 2), ((float) this.f81841a) * this.f81849i, (float) (i3 / 2), this.f81847g);
        MethodCollector.m26664o(5295);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5293);
        super.onMeasure(i, i2);
        this.f81841a = getMeasuredWidth();
        this.f81842b = getMeasuredHeight();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f81850j = z;
        MethodCollector.m26664o(5293);
    }

    private AudioControlView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5280);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jb, R.attr.uu});
        this.f81848h = obtainStyledAttributes.getColor(1, C0643b.m2378c(context, R.color.np));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f81847g = paint;
        paint.setAntiAlias(true);
        this.f81847g.setColor(this.f81848h);
        this.f81847g.setStyle(Paint.Style.FILL);
        this.f81847g.setStrokeWidth(2.0f);
        MethodCollector.m26664o(5280);
    }
}
