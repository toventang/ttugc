package com.p2082ss.android.ugc.gamora.editor.toolbar.p4292a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.a.a */
public final class C83132a extends PopupWindow implements AbstractC17242a {

    /* renamed from: a */
    public PullUpLayout f185761a;

    /* renamed from: b */
    public final ActivityC0945e f185762b;

    /* renamed from: c */
    public final boolean f185763c;

    /* renamed from: d */
    public final String f185764d;

    /* renamed from: e */
    public final ReplaceMusicRequest f185765e;

    /* renamed from: f */
    private final View f185766f;

    /* renamed from: g */
    private RelativeLayout f185767g;

    /* renamed from: h */
    private View f185768h;

    /* renamed from: i */
    private View f185769i;

    /* renamed from: j */
    private SmartImageView f185770j;

    /* renamed from: k */
    private TuxTextView f185771k;

    static {
        Covode.recordClassIndex(97016);
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

    public final void dismiss() {
        if (isShowing() && !this.f185762b.isFinishing()) {
            PullUpLayout pullUpLayout = this.f185761a;
            if (pullUpLayout == null) {
                C89219l.m154715b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f185761a;
                if (pullUpLayout2 == null) {
                    C89219l.m154715b();
                }
                pullUpLayout2.mo27262a(0.0f, true);
            }
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.a.a$a */
    static final class View$OnClickListenerC83133a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83132a f185772a;

        static {
            Covode.recordClassIndex(97017);
        }

        View$OnClickListenerC83133a(C83132a aVar) {
            this.f185772a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f185772a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.a.a$b */
    static final class View$OnClickListenerC83134b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83132a f185773a;

        static {
            Covode.recordClassIndex(97018);
        }

        View$OnClickListenerC83134b(C83132a aVar) {
            this.f185773a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f185773a.dismiss();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getApplicationService().mo93764a(this.f185773a.f185762b);
            new C23144b(this.f185773a.f185762b).mo37640e(R.string.faw).mo37637b();
            ReplaceMusicServiceImpl.m143543a().doRequest(this.f185773a.f185764d, this.f185773a.f185765e, this.f185773a.f185762b);
        }
    }

    /* renamed from: a */
    private static Object m143547a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11292);
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
                    MethodCollector.m26664o(11292);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83132a(ActivityC0945e eVar, boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
        super(eVar);
        View view;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(11148);
        this.f185762b = eVar;
        this.f185763c = z;
        this.f185764d = str;
        this.f185765e = replaceMusicRequest;
        Object a = m143547a(C40963b.m82473a(), "layout_inflater");
        if (a != null) {
            View inflate = ((LayoutInflater) a).inflate(R.layout.aio, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            this.f185766f = inflate;
            View findViewById = inflate.findViewById(R.id.dlx);
            if (findViewById != null) {
                this.f185767g = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.dat);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f185761a = pullUpLayout;
                    if (pullUpLayout == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout.mo27263a(this.f185767g);
                    PullUpLayout pullUpLayout2 = this.f185761a;
                    if (pullUpLayout2 == null) {
                        C89219l.m154715b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    RelativeLayout relativeLayout = this.f185767g;
                    if (relativeLayout == null) {
                        C89219l.m154715b();
                    }
                    this.f185768h = relativeLayout.findViewById(R.id.bu5);
                    RelativeLayout relativeLayout2 = this.f185767g;
                    if (relativeLayout2 == null) {
                        C89219l.m154715b();
                    }
                    this.f185769i = relativeLayout2.findViewById(R.id.fdg);
                    RelativeLayout relativeLayout3 = this.f185767g;
                    if (relativeLayout3 == null) {
                        C89219l.m154715b();
                    }
                    this.f185770j = (SmartImageView) relativeLayout3.findViewById(R.id.buj);
                    RelativeLayout relativeLayout4 = this.f185767g;
                    if (relativeLayout4 == null) {
                        C89219l.m154715b();
                    }
                    this.f185771k = (TuxTextView) relativeLayout4.findViewById(R.id.f62);
                    View view2 = this.f185768h;
                    if (view2 != null) {
                        view2.setOnClickListener(new View$OnClickListenerC83133a(this));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C84402a.m145174a(this.f185770j, str, (int) C13628n.m24520b(eVar, 48.0f), (int) C13628n.m24520b(eVar, 62.0f));
                    }
                    if (z) {
                        View view3 = this.f185769i;
                        if (view3 != null) {
                            view3.setVisibility(4);
                        }
                        TuxTextView tuxTextView = this.f185771k;
                        if (tuxTextView != null) {
                            tuxTextView.setText(R.string.fak);
                        }
                    } else {
                        TuxTextView tuxTextView2 = this.f185771k;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(R.string.fan);
                        }
                        if (!(replaceMusicRequest == null || (view = this.f185769i) == null)) {
                            view.setOnClickListener(new View$OnClickListenerC83134b(this));
                        }
                    }
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(C13628n.m24504a(C40963b.m82473a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a16);
                    MethodCollector.m26664o(11148);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.m26664o(11148);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.m26664o(11148);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(11148);
        throw nullPointerException3;
    }
}
