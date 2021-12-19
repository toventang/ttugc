package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bg */
public final class View$OnClickListenerC50111bg extends PopupWindow implements View.OnClickListener, AbstractC17242a, AbstractC68903b {

    /* renamed from: a */
    public int f115673a = 4000;

    /* renamed from: b */
    public boolean f115674b = false;

    /* renamed from: c */
    public RunnableC50113a f115675c;

    /* renamed from: d */
    public long f115676d = 0;

    /* renamed from: e */
    public View f115677e;

    /* renamed from: f */
    public Activity f115678f;

    /* renamed from: g */
    public RelativeLayout f115679g;

    /* renamed from: h */
    public RemoteImageView f115680h;

    /* renamed from: i */
    public Aweme f115681i;

    /* renamed from: j */
    private PullUpLayout f115682j;

    static {
        Covode.recordClassIndex(59237);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: b */
    public final void mo27279b() {
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: a */
    public final void mo27278a() {
        this.f115674b = false;
        mo85245d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bg$a */
    public class RunnableC50113a implements Runnable {

        /* renamed from: a */
        boolean f115684a;

        static {
            Covode.recordClassIndex(59239);
        }

        public final void run() {
            if (!this.f115684a && System.currentTimeMillis() >= View$OnClickListenerC50111bg.this.f115676d) {
                View$OnClickListenerC50111bg.this.mo85245d();
            }
        }

        private RunnableC50113a() {
        }

        /* synthetic */ RunnableC50113a(View$OnClickListenerC50111bg bgVar, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: d */
    public final void mo85245d() {
        if (isShowing() && !this.f115674b) {
            try {
                Activity activity = this.f115678f;
                if (activity != null && !activity.isFinishing()) {
                    this.f115682j.mo27262a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f115678f = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: c */
    public final void mo85244c() {
        MethodCollector.m26663i(5982);
        this.f115682j.mo27261a();
        Activity activity = this.f115678f;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = this.f115673a;
            this.f115676d = currentTimeMillis + ((long) i);
            this.f115682j.postDelayed(this.f115675c, (long) i);
            if (this.f115677e.getParent() != null) {
                ((ViewGroup) this.f115677e.getParent()).removeView(this.f115677e);
            }
            try {
                View decorView = this.f115678f.getWindow().getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -C13628n.m24525e(C17867d.m33078a()));
                MethodCollector.m26664o(5982);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MethodCollector.m26664o(5982);
    }

    public View$OnClickListenerC50111bg() {
        super(C17867d.m33078a());
        MethodCollector.m26663i(5976);
        View inflate = ((LayoutInflater) m94064a(C17867d.m33078a(), "layout_inflater")).inflate(R.layout.az6, (ViewGroup) null);
        this.f115677e = inflate;
        this.f115680h = (RemoteImageView) inflate.findViewById(R.id.bwr);
        this.f115679g = (RelativeLayout) inflate.findViewById(R.id.dlx);
        PullUpLayout pullUpLayout = (PullUpLayout) inflate.findViewById(R.id.dat);
        this.f115682j = pullUpLayout;
        pullUpLayout.mo27263a(this.f115679g);
        this.f115682j.setPullUpListener(this);
        this.f115680h.setOnClickListener(this);
        this.f115682j.setInternalTouchEventListener(new PullUpLayout.AbstractC17241b() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50111bg.C501121 */

            static {
                Covode.recordClassIndex(59238);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout.AbstractC17241b
            /* renamed from: a */
            public final void mo27277a(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    View$OnClickListenerC50111bg.this.f115674b = true;
                    if (View$OnClickListenerC50111bg.this.f115675c != null) {
                        View$OnClickListenerC50111bg.this.f115675c.f115684a = true;
                    }
                } else if (action == 1) {
                    View$OnClickListenerC50111bg.this.f115674b = false;
                    View$OnClickListenerC50111bg.this.f115676d = System.currentTimeMillis() + ((long) View$OnClickListenerC50111bg.this.f115673a);
                    View$OnClickListenerC50111bg.this.f115675c.f115684a = false;
                    View$OnClickListenerC50111bg.this.f115679g.postDelayed(View$OnClickListenerC50111bg.this.f115675c, (long) View$OnClickListenerC50111bg.this.f115673a);
                } else if (action == 2) {
                    View$OnClickListenerC50111bg.this.f115674b = true;
                }
            }
        });
        this.f115675c = new RunnableC50113a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f115677e);
        setWidth(C13628n.m24504a(C17867d.m33078a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a16);
        MethodCollector.m26664o(5976);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view.getId() == R.id.bwr) {
            C36125t.m73596a(C36125t.m73591a(), this.f115678f, C36131u.m73602a("aweme://aweme/detail/" + this.f115681i.getAid()).mo63248a("refer", "upload").mo63249a());
            AVExternalServiceImpl.m113114a().publishService().setPublishStatus(11);
            mo85245d();
        }
    }

    /* renamed from: a */
    private static Object m94064a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5980);
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
                    MethodCollector.m26664o(5980);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
