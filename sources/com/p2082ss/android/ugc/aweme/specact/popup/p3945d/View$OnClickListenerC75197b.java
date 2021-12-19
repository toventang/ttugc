package com.p2082ss.android.ugc.aweme.specact.popup.p3945d;

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
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3946e.C75202a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b */
public final class View$OnClickListenerC75197b extends PopupWindow implements View.OnClickListener, AbstractC17242a {

    /* renamed from: i */
    public static boolean f169086i;

    /* renamed from: j */
    public static final C75199b f169087j = new C75199b((byte) 0);

    /* renamed from: a */
    public int f169088a = 5000;

    /* renamed from: b */
    public boolean f169089b;

    /* renamed from: c */
    public long f169090c;

    /* renamed from: d */
    public AbstractRunnableC75198a f169091d;

    /* renamed from: e */
    public View f169092e;

    /* renamed from: f */
    public PullUpLayout f169093f;

    /* renamed from: g */
    public View f169094g;

    /* renamed from: h */
    public final Activity f169095h;

    /* renamed from: k */
    private ImageView f169096k;

    /* renamed from: l */
    private TextView f169097l;

    /* renamed from: m */
    private TextView f169098m;

    /* renamed from: n */
    private ImageView f169099n;

    /* renamed from: o */
    private TextView f169100o;

    /* renamed from: p */
    private final C75196a f169101p;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b$a */
    public interface AbstractRunnableC75198a extends Runnable {
        static {
            Covode.recordClassIndex(88076);
        }

        /* renamed from: a */
        void mo118354a();

        /* renamed from: b */
        void mo118355b();
    }

    static {
        Covode.recordClassIndex(88075);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: b */
    public final void mo27279b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b$b */
    public static final class C75199b {
        static {
            Covode.recordClassIndex(88077);
        }

        private C75199b() {
        }

        public /* synthetic */ C75199b(byte b) {
            this();
        }
    }

    public final void dismiss() {
        f169086i = false;
        super.dismiss();
    }

    /* renamed from: d */
    private final void m131936d() {
        C75202a.m131946a(this.f169095h, this.f169101p.f169084d);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b$c */
    public static final class C75200c implements AbstractRunnableC75198a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75197b f169102a;

        /* renamed from: b */
        private boolean f169103b;

        static {
            Covode.recordClassIndex(88078);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.popup.p3945d.View$OnClickListenerC75197b.AbstractRunnableC75198a
        /* renamed from: a */
        public final void mo118354a() {
            this.f169103b = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.popup.p3945d.View$OnClickListenerC75197b.AbstractRunnableC75198a
        /* renamed from: b */
        public final void mo118355b() {
            this.f169103b = false;
        }

        public final void run() {
            if (!this.f169103b && System.currentTimeMillis() >= this.f169102a.f169090c && this.f169102a.isShowing()) {
                this.f169102a.mo118351c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75200c(View$OnClickListenerC75197b bVar) {
            this.f169102a = bVar;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: a */
    public final void mo27278a() {
        this.f169089b = false;
        if (isShowing()) {
            C39162r.m79460a("watch_task_push_click", new C33744d().mo59983a("button_name", "close").f79943a);
            mo118351c();
        }
    }

    /* renamed from: c */
    public final void mo118351c() {
        if (isShowing() && !this.f169089b) {
            try {
                if (!this.f169095h.isFinishing()) {
                    PullUpLayout pullUpLayout = this.f169093f;
                    if (pullUpLayout == null) {
                        C89219l.m154710a("mPullUpLayout");
                    }
                    pullUpLayout.mo27262a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b$d */
    static final class C75201d implements PullUpLayout.AbstractC17241b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75197b f169104a;

        static {
            Covode.recordClassIndex(88079);
        }

        C75201d(View$OnClickListenerC75197b bVar) {
            this.f169104a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout.AbstractC17241b
        /* renamed from: a */
        public final void mo27277a(MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f169104a.f169089b = true;
                this.f169104a.f169091d.mo118354a();
            } else if (action == 1) {
                this.f169104a.f169089b = false;
                this.f169104a.f169090c = System.currentTimeMillis() + ((long) this.f169104a.f169088a);
                this.f169104a.f169091d.mo118355b();
                View view = this.f169104a.f169094g;
                if (view == null) {
                    C89219l.m154710a("mRootView");
                }
                view.postDelayed(this.f169104a.f169091d, (long) this.f169104a.f169088a);
            } else if (action == 2) {
                this.f169104a.f169089b = true;
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.dnh) {
            if (!C58001a.m104815a(view, 1200)) {
                C39162r.m79460a("watch_task_push_click", new C33744d().mo59983a("button_name", "ok").f79943a);
                m131936d();
                mo118351c();
            }
        } else if (id == R.id.bbh) {
            C39162r.m79460a("watch_task_push_click", new C33744d().mo59983a("button_name", "ok").f79943a);
            m131936d();
            mo118351c();
        } else if (id == R.id.a76) {
            C39162r.m79460a("watch_task_push_click", new C33744d().mo59983a("button_name", "close").f79943a);
            mo118351c();
        }
    }

    /* renamed from: a */
    private static Object m131935a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6715);
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
                    MethodCollector.m26664o(6715);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC75197b(Activity activity, C75196a aVar) {
        super(activity);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(6713);
        this.f169095h = activity;
        this.f169101p = aVar;
        Object a = m131935a(C17867d.m33078a(), "layout_inflater");
        if (a != null) {
            View inflate = ((LayoutInflater) a).inflate(R.layout.b0i, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            this.f169092e = inflate;
            View findViewById = inflate.findViewById(R.id.dat);
            C89219l.m154716b(findViewById, "");
            this.f169093f = (PullUpLayout) findViewById;
            View findViewById2 = inflate.findViewById(R.id.dnh);
            C89219l.m154716b(findViewById2, "");
            this.f169094g = findViewById2;
            View findViewById3 = inflate.findViewById(R.id.bhr);
            C89219l.m154716b(findViewById3, "");
            this.f169096k = (ImageView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.title_tv);
            C89219l.m154716b(findViewById4, "");
            this.f169097l = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(R.id.message_tv);
            C89219l.m154716b(findViewById5, "");
            this.f169098m = (TextView) findViewById5;
            View findViewById6 = inflate.findViewById(R.id.a76);
            C89219l.m154716b(findViewById6, "");
            this.f169099n = (ImageView) findViewById6;
            View findViewById7 = inflate.findViewById(R.id.bbh);
            C89219l.m154716b(findViewById7, "");
            TextView textView = (TextView) findViewById7;
            this.f169100o = textView;
            if (textView == null) {
                C89219l.m154710a("mGoTv");
            }
            textView.setOnClickListener(this);
            ImageView imageView = this.f169099n;
            if (imageView == null) {
                C89219l.m154710a("mCloseTv");
            }
            imageView.setOnClickListener(this);
            View view = this.f169094g;
            if (view == null) {
                C89219l.m154710a("mRootView");
            }
            view.setOnClickListener(this);
            PullUpLayout pullUpLayout = this.f169093f;
            if (pullUpLayout == null) {
                C89219l.m154710a("mPullUpLayout");
            }
            View view2 = this.f169094g;
            if (view2 == null) {
                C89219l.m154710a("mRootView");
            }
            pullUpLayout.mo27263a(view2);
            PullUpLayout pullUpLayout2 = this.f169093f;
            if (pullUpLayout2 == null) {
                C89219l.m154710a("mPullUpLayout");
            }
            pullUpLayout2.setPullUpListener(this);
            PullUpLayout pullUpLayout3 = this.f169093f;
            if (pullUpLayout3 == null) {
                C89219l.m154710a("mPullUpLayout");
            }
            pullUpLayout3.setInternalTouchEventListener(new C75201d(this));
            TextView textView2 = this.f169097l;
            if (textView2 == null) {
                C89219l.m154710a("mTitleTv");
            }
            textView2.setText(aVar.f169081a);
            TextView textView3 = this.f169098m;
            if (textView3 == null) {
                C89219l.m154710a("mMessageTv");
            }
            textView3.setText(aVar.f169082b);
            if (aVar.f169083c) {
                TextView textView4 = this.f169100o;
                if (textView4 == null) {
                    C89219l.m154710a("mGoTv");
                }
                textView4.setVisibility(0);
                ImageView imageView2 = this.f169099n;
                if (imageView2 == null) {
                    C89219l.m154710a("mCloseTv");
                }
                imageView2.setVisibility(8);
            } else {
                TextView textView5 = this.f169100o;
                if (textView5 == null) {
                    C89219l.m154710a("mGoTv");
                }
                textView5.setVisibility(8);
                ImageView imageView3 = this.f169099n;
                if (imageView3 == null) {
                    C89219l.m154710a("mCloseTv");
                }
                imageView3.setVisibility(0);
            }
            if (aVar.f169085e != -1) {
                ImageView imageView4 = this.f169096k;
                if (imageView4 == null) {
                    C89219l.m154710a("mIconImg");
                }
                imageView4.setImageResource(aVar.f169085e);
            }
            this.f169091d = new C75200c(this);
            setBackgroundDrawable(new ColorDrawable(0));
            setContentView(this.f169092e);
            setWidth(C13628n.m24504a(C17867d.m33078a()));
            setHeight(-2);
            update();
            setAnimationStyle(R.style.a16);
            MethodCollector.m26664o(6713);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(6713);
        throw nullPointerException;
    }
}
