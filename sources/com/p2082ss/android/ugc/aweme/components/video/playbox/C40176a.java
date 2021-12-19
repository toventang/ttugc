package com.p2082ss.android.ugc.aweme.components.video.playbox;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.components.video.playbox.a */
public final class C40176a {

    /* renamed from: a */
    public View f94335a;

    /* renamed from: b */
    public boolean f94336b;

    /* renamed from: c */
    public RelativeLayout f94337c;

    /* renamed from: d */
    private Context f94338d;

    /* renamed from: e */
    private final ViewGroup f94339e;

    static {
        Covode.recordClassIndex(47964);
    }

    /* renamed from: b */
    private final ViewGroup m81262b() {
        Activity a = m81260a(this.f94338d);
        if (a != null) {
            return (ViewGroup) a.findViewById(16908290);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo69352a() {
        Activity a;
        Window window;
        MethodCollector.m26663i(4159);
        if (!this.f94336b) {
            MethodCollector.m26664o(4159);
            return false;
        }
        this.f94336b = false;
        Context context = this.f94338d;
        m81261a(context, true);
        Activity a2 = m81260a(context);
        if (!(a2 == null || (window = a2.getWindow()) == null)) {
            window.clearFlags(1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                int i = Build.VERSION.SDK_INT;
                decorView.setSystemUiVisibility(1792);
            }
        }
        if (m81263b(this.f94338d) && (a = m81260a(this.f94338d)) != null) {
            a.setRequestedOrientation(-1);
        }
        ViewGroup b = m81262b();
        if (b != null) {
            b.removeView(this.f94337c);
        }
        this.f94337c.removeAllViews();
        this.f94339e.addView(this.f94335a, new ViewGroup.LayoutParams(-1, -1));
        this.f94339e.requestLayout();
        MethodCollector.m26664o(4159);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.a$b */
    public static final class View$OnClickListenerC40178b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40176a f94341a;

        /* renamed from: b */
        final /* synthetic */ Activity f94342b;

        static {
            Covode.recordClassIndex(47966);
        }

        View$OnClickListenerC40178b(C40176a aVar, Activity activity) {
            this.f94341a = aVar;
            this.f94342b = activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94341a.mo69352a();
        }
    }

    /* renamed from: a */
    private static Activity m81260a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    private boolean m81263b(Context context) {
        Activity a = m81260a(context);
        if (a == null) {
            return false;
        }
        try {
            PackageManager packageManager = a.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo activityInfo = packageManager.getActivityInfo(a.getComponentName(), 128);
            C89219l.m154716b(activityInfo, "");
            if (activityInfo == null || (activityInfo.configChanges & 128) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo69353a(View view) {
        Activity activity;
        ImageView imageView;
        Activity a;
        Window window;
        MethodCollector.m26663i(4152);
        if (this.f94336b) {
            MethodCollector.m26664o(4152);
            return false;
        }
        this.f94336b = true;
        this.f94335a = view;
        this.f94337c.setFocusableInTouchMode(true);
        this.f94337c.requestFocus();
        Context context = this.f94338d;
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        activity = null;
        m81261a(activity, false);
        Activity a2 = m81260a(activity);
        if (!(a2 == null || (window = a2.getWindow()) == null)) {
            window.setFlags(1024, 1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                int i = Build.VERSION.SDK_INT;
                int i2 = Build.VERSION.SDK_INT;
                decorView.setSystemUiVisibility(5894);
            }
        }
        try {
            if (m81263b(activity) && (a = m81260a(activity)) != null) {
                a.setRequestedOrientation(0);
            }
            this.f94339e.removeView(this.f94335a);
            ViewGroup b = m81262b();
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (b != null) {
                b.addView(this.f94337c, layoutParams);
            }
            this.f94337c.addView(this.f94335a, new FrameLayout.LayoutParams(-1, -1));
            this.f94337c.setBackgroundColor(-16777216);
            LayoutInflater.from(activity).inflate(R.layout.v9, this.f94337c);
            if (!(activity == null || (imageView = (ImageView) activity.findViewById(R.id.x2)) == null)) {
                imageView.setOnClickListener(new View$OnClickListenerC40178b(this, activity));
            }
            MethodCollector.m26664o(4152);
            return true;
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            MethodCollector.m26664o(4152);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.a$c */
    public static final class C40179c extends RelativeLayout {

        /* renamed from: a */
        final /* synthetic */ Context f94343a;

        static {
            Covode.recordClassIndex(47967);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40179c(Context context, Context context2) {
            super(context2);
            this.f94343a = context;
            MethodCollector.m26663i(3925);
            MethodCollector.m26664o(3925);
        }
    }

    public C40176a(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C40179c cVar = new C40179c(context, context);
        cVar.setOnKeyListener(new View$OnKeyListenerC40177a(this));
        this.f94337c = cVar;
        this.f94338d = context;
        this.f94339e = viewGroup;
    }

    /* renamed from: a */
    private final void m81261a(Context context, boolean z) {
        Method method;
        String str;
        try {
            Activity a = m81260a(context);
            if (a != null && (method = a.getClass().getMethod("getSupportActionBar", new Class[0])) != null) {
                method.setAccessible(true);
                Object invoke = method.invoke(a, new Object[0]);
                if (invoke != null) {
                    Method method2 = invoke.getClass().getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                    C89219l.m154716b(method2, "");
                    method2.setAccessible(true);
                    method2.invoke(invoke, false);
                    Class<?> cls = invoke.getClass();
                    if (z) {
                        str = "show";
                    } else {
                        str = "hide";
                    }
                    Method method3 = cls.getMethod(str, new Class[0]);
                    C89219l.m154716b(method3, "");
                    method3.setAccessible(true);
                    method3.invoke(invoke, new Object[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.a$a */
    static final class View$OnKeyListenerC40177a implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C40176a f94340a;

        static {
            Covode.recordClassIndex(47965);
        }

        View$OnKeyListenerC40177a(C40176a aVar) {
            this.f94340a = aVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (!this.f94340a.f94336b) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 1 || i != 4) {
                return false;
            }
            this.f94340a.mo69352a();
            return true;
        }
    }
}
