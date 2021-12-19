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
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bp */
public final class C73531bp extends PopupWindow implements AbstractC17242a, AbstractC73762p {

    /* renamed from: a */
    public final View f165199a;

    /* renamed from: b */
    private RelativeLayout f165200b;

    /* renamed from: c */
    private PullUpLayout f165201c;

    /* renamed from: d */
    private AbstractC73761o f165202d;

    /* renamed from: e */
    private boolean f165203e;

    /* renamed from: f */
    private final ActivityC0945e f165204f;

    /* renamed from: g */
    private final C43223c f165205g;

    /* renamed from: h */
    private final boolean f165206h;

    /* renamed from: i */
    private final boolean f165207i;

    static {
        Covode.recordClassIndex(86268);
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
        return this.f165204f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bp$a */
    static final class RunnableC73532a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73531bp f165208a;

        /* renamed from: b */
        final /* synthetic */ boolean f165209b;

        static {
            Covode.recordClassIndex(86269);
        }

        RunnableC73532a(C73531bp bpVar, boolean z) {
            this.f165208a = bpVar;
            this.f165209b = z;
        }

        public final void run() {
            int i;
            if (this.f165209b) {
                i = 0;
            } else {
                i = 8;
            }
            this.f165208a.f165199a.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    public final void dismiss() {
        if (isShowing() && !this.f165204f.isFinishing()) {
            PullUpLayout pullUpLayout = this.f165201c;
            if (pullUpLayout == null) {
                C89219l.m154715b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f165201c;
                if (pullUpLayout2 == null) {
                    C89219l.m154715b();
                }
                pullUpLayout2.mo27262a(0.0f, true);
            }
        }
        AbstractC73761o oVar = this.f165202d;
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
        if (!this.f165204f.isFinishing()) {
            AbstractC73761o oVar = this.f165202d;
            if (oVar != null) {
                oVar.mo116110a();
            }
            PullUpLayout pullUpLayout = this.f165201c;
            if (pullUpLayout == null) {
                C89219l.m154715b();
            }
            pullUpLayout.mo27261a();
            try {
                Window window = this.f165204f.getWindow();
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
        AbstractC73761o oVar = this.f165202d;
        if (oVar != null) {
            oVar.mo116111a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73762p
    /* renamed from: a */
    public final void mo116122a(boolean z) {
        this.f165199a.post(new RunnableC73532a(this, z));
    }

    /* renamed from: a */
    private static Object m129656a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10190);
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
                    MethodCollector.m26664o(10190);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73531bp(ActivityC0945e eVar, C43223c cVar, boolean z, boolean z2) {
        super(eVar);
        int i;
        AbstractC73761o boVar;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        MethodCollector.m26663i(10037);
        this.f165204f = eVar;
        this.f165205g = cVar;
        this.f165206h = z;
        this.f165207i = z2;
        Object a = m129656a(C40963b.m82473a(), "layout_inflater");
        if (a != null) {
            LayoutInflater layoutInflater = (LayoutInflater) a;
            boolean a2 = C39223a.m79589c().mo68606a(1);
            this.f165203e = a2;
            if (a2) {
                i = R.layout.ail;
            } else {
                i = R.layout.ain;
            }
            View inflate = layoutInflater.inflate(i, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            this.f165199a = inflate;
            View findViewById = inflate.findViewById(R.id.dlx);
            if (findViewById != null) {
                this.f165200b = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.dat);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f165201c = pullUpLayout;
                    if (pullUpLayout == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout.mo27263a(this.f165200b);
                    PullUpLayout pullUpLayout2 = this.f165201c;
                    if (pullUpLayout2 == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    if (this.f165203e) {
                        RelativeLayout relativeLayout = this.f165200b;
                        if (relativeLayout == null) {
                            C89219l.m154715b();
                        }
                        boVar = new C73518bn(eVar, cVar, this, relativeLayout);
                    } else {
                        RelativeLayout relativeLayout2 = this.f165200b;
                        if (relativeLayout2 == null) {
                            C89219l.m154715b();
                        }
                        boVar = new C73524bo(eVar, cVar, this, relativeLayout2, z2);
                    }
                    this.f165202d = boVar;
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(C13628n.m24504a(C40963b.m82473a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a16);
                    MethodCollector.m26664o(10037);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.m26664o(10037);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.m26664o(10037);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(10037);
        throw nullPointerException3;
    }
}
