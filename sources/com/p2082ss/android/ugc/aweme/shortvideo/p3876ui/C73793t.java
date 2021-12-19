package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.t */
public final class C73793t extends PopupWindow implements AbstractC17242a, AbstractC73762p {

    /* renamed from: a */
    public final View f165667a;

    /* renamed from: b */
    private RelativeLayout f165668b;

    /* renamed from: c */
    private PullUpLayout f165669c;

    /* renamed from: d */
    private AbstractC73761o f165670d;

    /* renamed from: e */
    private boolean f165671e;

    /* renamed from: f */
    private final ActivityC0945e f165672f;

    /* renamed from: g */
    private final Aweme f165673g;

    static {
        Covode.recordClassIndex(86532);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: b */
    public final void mo27279b() {
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: a */
    public final void mo27278a() {
        dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    /* renamed from: c */
    public final ActivityC0945e mo116123c() {
        return this.f165672f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.t$a */
    static final class RunnableC73794a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73793t f165674a;

        /* renamed from: b */
        final /* synthetic */ boolean f165675b;

        static {
            Covode.recordClassIndex(86533);
        }

        RunnableC73794a(C73793t tVar, boolean z) {
            this.f165674a = tVar;
            this.f165675b = z;
        }

        public final void run() {
            int i;
            if (this.f165675b) {
                i = 0;
            } else {
                i = 8;
            }
            this.f165674a.f165667a.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    public final void dismiss() {
        if (isShowing() && !this.f165672f.isFinishing()) {
            PullUpLayout pullUpLayout = this.f165669c;
            if (pullUpLayout == null) {
                C89219l.m154715b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f165669c;
                if (pullUpLayout2 == null) {
                    C89219l.m154715b();
                }
                pullUpLayout2.mo27262a(0.0f, true);
            }
        }
        AbstractC73761o oVar = this.f165670d;
        if (oVar != null) {
            oVar.mo116112b();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    /* renamed from: d */
    public final void mo116124d() {
        if (!this.f165672f.isFinishing()) {
            AbstractC73761o oVar = this.f165670d;
            if (oVar != null) {
                oVar.mo116110a();
            }
            PullUpLayout pullUpLayout = this.f165669c;
            if (pullUpLayout == null) {
                C89219l.m154715b();
            }
            pullUpLayout.mo27261a();
            try {
                Window window = this.f165672f.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                int i = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -C13628n.m24525e(C40963b.m82473a()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    /* renamed from: a */
    public final void mo116121a(String str) {
        C89219l.m154721d(str, "");
        AbstractC73761o oVar = this.f165670d;
        if (oVar != null) {
            oVar.mo116111a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    /* renamed from: a */
    public final void mo116122a(boolean z) {
        this.f165667a.post(new RunnableC73794a(this, z));
    }

    /* renamed from: a */
    private static Object m129852a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9703);
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
                    MethodCollector.m26664o(9703);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73793t(ActivityC0945e eVar, Aweme aweme) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        MethodCollector.m26663i(9553);
        this.f165672f = eVar;
        this.f165673g = aweme;
        Object a = m129852a(C40963b.m82473a(), "layout_inflater");
        if (a != null) {
            this.f165671e = C39223a.m79589c().mo68606a(1);
            View inflate = ((LayoutInflater) a).inflate(R.layout.aii, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            this.f165667a = inflate;
            View findViewById = inflate.findViewById(R.id.dlx);
            if (findViewById != null) {
                this.f165668b = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.dat);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f165669c = pullUpLayout;
                    if (pullUpLayout == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout.mo27263a(this.f165668b);
                    PullUpLayout pullUpLayout2 = this.f165669c;
                    if (pullUpLayout2 == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    RelativeLayout relativeLayout = this.f165668b;
                    if (relativeLayout == null) {
                        C89219l.m154715b();
                    }
                    this.f165670d = new C73790s(eVar, aweme, this, relativeLayout);
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(C13628n.m24504a(C40963b.m82473a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a16);
                    MethodCollector.m26664o(9553);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.m26664o(9553);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.m26664o(9553);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(9553);
        throw nullPointerException3;
    }
}
