package com.p2082ss.android.ugc.awemepushlib.p4252g;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.C0607l;
import androidx.customview.p040a.C0827a;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81867i;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.g.a */
public final class View$OnClickListenerC81836a extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    final C0827a f182972a;

    /* renamed from: b */
    final ViewConfiguration f182973b;

    /* renamed from: c */
    View f182974c;

    /* renamed from: d */
    final Handler f182975d;

    /* renamed from: e */
    final long f182976e;

    /* renamed from: f */
    final int f182977f;

    /* renamed from: g */
    final long f182978g;

    /* renamed from: h */
    final boolean f182979h;

    /* renamed from: i */
    final ImageView f182980i;

    /* renamed from: j */
    final boolean f182981j;

    /* renamed from: k */
    int f182982k;

    /* renamed from: l */
    JSONObject f182983l;

    /* renamed from: m */
    final Runnable f182984m;

    /* renamed from: n */
    final Runnable f182985n;

    /* renamed from: o */
    AbstractC81842a f182986o;

    /* renamed from: p */
    private boolean f182987p;

    /* renamed from: q */
    private final Intent f182988q;

    /* renamed from: r */
    private final C81823b f182989r;

    /* renamed from: s */
    private float f182990s;

    /* renamed from: t */
    private float f182991t;

    /* renamed from: u */
    private RunnableC81843b f182992u;

    /* renamed from: com.ss.android.ugc.awemepushlib.g.a$a */
    public interface AbstractC81842a {
        static {
            Covode.recordClassIndex(95255);
        }
    }

    static {
        Covode.recordClassIndex(95249);
    }

    public final void computeScroll() {
        if (this.f182972a.mo3027c()) {
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            this.f182972a.mo3024b();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f182987p) {
            this.f182975d.post(new Runnable() {
                /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.RunnableC818393 */

                static {
                    Covode.recordClassIndex(95252);
                }

                public final void run() {
                    View$OnClickListenerC81836a.this.f182974c.setTranslationY((float) (-View$OnClickListenerC81836a.this.f182974c.getHeight()));
                    View$OnClickListenerC81836a.this.f182974c.animate().translationY(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(300).start();
                    View$OnClickListenerC81836a.this.f182975d.postDelayed(View$OnClickListenerC81836a.this.f182984m, View$OnClickListenerC81836a.this.f182978g);
                    C81867i.m141777a(View$OnClickListenerC81836a.this.getContext(), "news_notify_anim_push_show", View$OnClickListenerC81836a.this.f182976e, (long) View$OnClickListenerC81836a.this.f182977f, View$OnClickListenerC81836a.this.f182983l);
                }
            });
            this.f182987p = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo125505a() {
        this.f182974c.animate().translationY((float) (-this.f182974c.getHeight())).setDuration(300).start();
        this.f182975d.postDelayed(this.f182985n, 300);
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.g.a$b */
    final class RunnableC81843b implements Runnable {
        static {
            Covode.recordClassIndex(95256);
        }

        public final void run() {
            if (!View$OnClickListenerC81836a.this.f182979h || !View$OnClickListenerC81836a.this.f182981j) {
                View$OnClickListenerC81836a.this.performClick();
                return;
            }
            ViewGroup.LayoutParams layoutParams = View$OnClickListenerC81836a.this.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                try {
                    ((WindowManager.LayoutParams) layoutParams).flags = 128;
                    ((WindowManager) m141742a(View$OnClickListenerC81836a.this.getContext(), "window")).updateViewLayout(View$OnClickListenerC81836a.this, layoutParams);
                    View$OnClickListenerC81836a.this.f182975d.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.RunnableC81843b.RunnableC818441 */

                        static {
                            Covode.recordClassIndex(95257);
                        }

                        public final void run() {
                            View$OnClickListenerC81836a.this.performClick();
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }

        private RunnableC81843b() {
        }

        /* synthetic */ RunnableC81843b(View$OnClickListenerC81836a aVar, byte b) {
            this();
        }

        /* renamed from: a */
        private static Object m141742a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(11226);
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
                        MethodCollector.m26664o(11226);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void setDismissListener(AbstractC81842a aVar) {
        this.f182986o = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f182972a.mo3021a(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo125506a(int i) {
        C0607l.m2289a(getContext()).mo2638a("app_notify_ame", i);
    }

    /* renamed from: b */
    private static String m141733b(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return "0".concat(String.valueOf(i));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Context context = getContext();
        Intent intent = this.f182988q;
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        mo125506a(C81823b.getShortMsgID(this.f182976e));
        this.f182975d.removeCallbacks(this.f182984m);
        mo125505a();
        C81867i.m141777a(getContext(), "news_notify_anim_push_click", this.f182976e, (long) this.f182977f, this.f182983l);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f182975d.removeCallbacks(this.f182984m);
        this.f182972a.mo3026b(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f182990s = x;
            this.f182991t = y;
            this.f182992u = new RunnableC81843b(this, (byte) 0);
        } else if (actionMasked == 1) {
            if (Math.abs(x - this.f182990s) >= ((float) this.f182973b.getScaledTouchSlop()) || Math.abs(y - this.f182991t) >= ((float) this.f182973b.getScaledTouchSlop())) {
                this.f182992u = null;
            } else {
                RunnableC81843b bVar = this.f182992u;
                if (bVar != null) {
                    bVar.run();
                }
            }
            this.f182992u = null;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f182992u = null;
            }
        } else if (Math.abs(x - this.f182990s) >= ((float) this.f182973b.getScaledTouchSlop()) || Math.abs(y - this.f182991t) >= ((float) this.f182973b.getScaledTouchSlop())) {
            this.f182992u = null;
        }
        return true;
    }

    public View$OnClickListenerC81836a(Context context, int i, C81823b bVar, Bitmap bitmap, Intent intent, long j, int i2) {
        this(context, i, bVar, bitmap, intent, j, i2, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private View$OnClickListenerC81836a(Context context, int i, C81823b bVar, Bitmap bitmap, Intent intent, long j, int i2, byte b) {
        super(context);
        int i3;
        int i4;
        int i5;
        long j2 = j;
        MethodCollector.m26663i(10596);
        this.f182987p = true;
        this.f182975d = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
            /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.C818371 */

            static {
                Covode.recordClassIndex(95250);
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
            }
        });
        this.f182984m = new Runnable() {
            /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.RunnableC818404 */

            static {
                Covode.recordClassIndex(95253);
            }

            public final void run() {
                View$OnClickListenerC81836a.this.mo125505a();
            }
        };
        this.f182985n = new Runnable() {
            /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.RunnableC818415 */

            static {
                Covode.recordClassIndex(95254);
            }

            public final void run() {
                try {
                    if (View$OnClickListenerC81836a.this.f182980i != null) {
                        View$OnClickListenerC81836a.this.f182980i.setImageDrawable(null);
                    }
                } catch (Throwable unused) {
                }
                if (View$OnClickListenerC81836a.this.f182981j) {
                    try {
                        Context applicationContext = View$OnClickListenerC81836a.this.getContext().getApplicationContext();
                        if (C58003a.f132201c) {
                            if (applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                        }
                        WindowManager windowManager = (WindowManager) m141741a(applicationContext, "window");
                        View$OnClickListenerC81836a aVar = View$OnClickListenerC81836a.this;
                        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{aVar}, 102801, "void", false, null).first).booleanValue()) {
                            windowManager.removeView(aVar);
                            C15346a.m28240a(null, windowManager, new Object[]{aVar}, 102801, "com_ss_android_ugc_awemepushlib_widget_AnimatablePushView$5_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }

            /* renamed from: a */
            private static Object m141741a(Context context, String str) {
                Object obj;
                MethodCollector.m26663i(11377);
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
                            MethodCollector.m26664o(11377);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }
        };
        this.f182988q = intent;
        this.f182977f = i;
        this.f182989r = bVar;
        this.f182982k = i2;
        this.f182976e = bVar.f182958id;
        this.f182978g = j2 <= 0 ? 5000 : j2;
        this.f182979h = "oppo".equalsIgnoreCase(Build.BRAND);
        this.f182981j = true;
        try {
            JSONObject jSONObject = new JSONObject();
            this.f182983l = jSONObject;
            jSONObject.put("isWindowMode", 1);
            JSONObject jSONObject2 = this.f182983l;
            if (intent.getBooleanExtra("message_with_pic", false)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject2.put("with_pic", i4);
            JSONObject jSONObject3 = this.f182983l;
            if (intent.getBooleanExtra("message_download_pic", false)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject3.put("download_pic", i5);
        } catch (Throwable unused) {
        }
        String str = bVar.title;
        str = TextUtils.isEmpty(str) ? context.getString(R.string.u8) : str;
        if (!this.f182979h || C81900a.m141823a().f183095j > 0) {
            int i6 = this.f182982k;
            if ((i6 == 11 || i6 == 21) && bitmap != null && !bVar.functionalPush) {
                Calendar instance = Calendar.getInstance();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.f182982k == 11) {
                    i3 = R.layout.aq0;
                } else {
                    i3 = R.layout.aq1;
                }
                View a = C1764a.m5927a(from, i3, this, false);
                this.f182974c = a;
                if (this.f182982k == 21) {
                    ((TextView) a.findViewById(R.id.title)).setText(str);
                }
                ((TextView) this.f182974c.findViewById(R.id.time)).setText(m141733b(instance.get(11)) + ":" + m141733b(instance.get(12)));
                ((TextView) this.f182974c.findViewById(R.id.f7v)).setText(bVar.text);
                ((TextView) this.f182974c.findViewById(R.id.title)).setText(str);
            } else {
                View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.alm, this, false);
                this.f182974c = a2;
                ((TextView) a2.findViewById(R.id.title)).setText(str);
                ((TextView) this.f182974c.findViewById(R.id.ajd)).setText(bVar.text);
            }
        } else {
            this.f182974c = C1764a.m5927a(LayoutInflater.from(context), R.layout.aly, this, false);
            ((TextView) this.f182974c.findViewById(R.id.time)).setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date()));
            ((TextView) this.f182974c.findViewById(R.id.title)).setText(str);
            ((TextView) this.f182974c.findViewById(R.id.ajd)).setText(bVar.text);
        }
        addView(this.f182974c);
        ImageView imageView = (ImageView) findViewById(R.id.ble);
        this.f182980i = imageView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.ao0);
        }
        this.f182972a = C0827a.m2924a(this, new C0827a.AbstractC0830a() {
            /* class com.p2082ss.android.ugc.awemepushlib.p4252g.View$OnClickListenerC81836a.C818382 */

            static {
                Covode.recordClassIndex(95251);
            }

            @Override // androidx.customview.p040a.C0827a.AbstractC0830a
            /* renamed from: c */
            public final int mo3040c(View view, int i) {
                return i;
            }

            @Override // androidx.customview.p040a.C0827a.AbstractC0830a
            /* renamed from: a */
            public final int mo3030a(View view) {
                return view.getWidth();
            }

            @Override // androidx.customview.p040a.C0827a.AbstractC0830a
            /* renamed from: b */
            public final boolean mo3039b(View view, int i) {
                if (view == View$OnClickListenerC81836a.this.f182974c) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.p040a.C0827a.AbstractC0830a
            /* renamed from: a */
            public final void mo3035a(View view, float f, float f2) {
                int i;
                if (Math.abs(f) > ((float) (View$OnClickListenerC81836a.this.f182973b.getScaledMaximumFlingVelocity() / 5)) || ((float) Math.abs(view.getLeft())) >= ((float) View$OnClickListenerC81836a.this.getWidth()) * 0.2f) {
                    C0827a aVar = View$OnClickListenerC81836a.this.f182972a;
                    if (f > 0.0f) {
                        i = View$OnClickListenerC81836a.this.getWidth();
                    } else {
                        i = -View$OnClickListenerC81836a.this.getWidth();
                    }
                    aVar.mo3022a(view, i, 0);
                    View$OnClickListenerC81836a aVar2 = View$OnClickListenerC81836a.this;
                    aVar2.mo125506a(C81823b.getShortMsgID(aVar2.f182976e));
                    View$OnClickListenerC81836a.this.f182975d.postDelayed(View$OnClickListenerC81836a.this.f182985n, 300);
                } else {
                    View$OnClickListenerC81836a.this.f182972a.mo3022a(view, 0, 0);
                    View$OnClickListenerC81836a.this.f182975d.postDelayed(View$OnClickListenerC81836a.this.f182984m, 5000);
                }
                View$OnClickListenerC81836a.this.postInvalidate();
            }

            @Override // androidx.customview.p040a.C0827a.AbstractC0830a
            /* renamed from: a */
            public final void mo3037a(View view, int i, int i2, int i3, int i4) {
                View$OnClickListenerC81836a.this.setAlpha(1.0f - (((float) Math.abs(i)) / ((float) View$OnClickListenerC81836a.this.getWidth())));
            }
        });
        this.f182973b = ViewConfiguration.get(context);
        setOnClickListener(this);
        MethodCollector.m26664o(10596);
    }
}
