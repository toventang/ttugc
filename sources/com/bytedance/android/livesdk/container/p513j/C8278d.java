package com.bytedance.android.livesdk.container.p513j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.p222c.C3929a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2937k;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.container.AbstractC8235d;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.p505c.AbstractC8221a;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p510g.AbstractC8248b;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.container.p513j.C8258a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.container.util.C8302c;
import com.bytedance.android.livesdk.container.util.C8311h;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.j.d */
public final class C8278d extends C10935a implements AbstractC8235d, AbstractC8248b, AbstractC8249a {

    /* renamed from: c */
    public static final C8279a f20527c = new C8279a((byte) 0);

    /* renamed from: b */
    public ViewGroup f20528b;

    /* renamed from: d */
    private final AbstractC89244h f20529d = C11831d.m20835a(new C8281c(this));

    /* renamed from: e */
    private final AbstractC89244h f20530e = C11831d.m20835a(new C8282d(this));

    /* renamed from: f */
    private ViewGroup f20531f;

    /* renamed from: g */
    private View f20532g;

    /* renamed from: h */
    private View f20533h;

    /* renamed from: i */
    private View f20534i;

    /* renamed from: j */
    private TextView f20535j;

    /* renamed from: k */
    private C8258a f20536k;

    /* renamed from: l */
    private HashMap f20537l;

    static {
        Covode.recordClassIndex(9113);
    }

    /* renamed from: f */
    private final String m16429f() {
        return (String) this.f20530e.getValue();
    }

    /* renamed from: a */
    public final PageConfig mo14622a() {
        return (PageConfig) this.f20529d.getValue();
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: a */
    public final void mo14597a(String str) {
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: e */
    public final void mo14599e() {
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$a */
    public static final class C8279a {
        static {
            Covode.recordClassIndex(9114);
        }

        private C8279a() {
        }

        public /* synthetic */ C8279a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: d */
    public final void mo14598d() {
        m16430g();
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    public final String getHybridContainerId() {
        return m16429f();
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$g */
    static final class RunnableC8285g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8278d f20543a;

        static {
            Covode.recordClassIndex(9120);
        }

        RunnableC8285g(C8278d dVar) {
            this.f20543a = dVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f20543a.f20528b;
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    /* renamed from: b */
    public final void mo14465b() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f20537l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$b */
    static final class RunnableC8280b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8278d f20538a;

        static {
            Covode.recordClassIndex(9115);
        }

        RunnableC8280b(C8278d dVar) {
            this.f20538a = dVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f20538a.f20528b;
            if (viewGroup != null) {
                viewGroup.setPadding(0, C3903ac.m9533a(this.f20538a.getContext()), 0, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$c */
    static final class C8281c extends AbstractC89220m implements AbstractC89171a<PageConfig> {

        /* renamed from: a */
        final /* synthetic */ C8278d f20539a;

        static {
            Covode.recordClassIndex(9116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8281c(C8278d dVar) {
            super(0);
            this.f20539a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PageConfig invoke() {
            Bundle arguments = this.f20539a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.PageConfig");
            return serializable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$d */
    static final class C8282d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C8278d f20540a;

        static {
            Covode.recordClassIndex(9117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8282d(C8278d dVar) {
            super(0);
            this.f20540a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f20540a.mo14622a().getEngineType() == EnumC8236a.LYNX) {
                return C6952c.m14838b();
            }
            return C6952c.m14837a();
        }
    }

    /* renamed from: g */
    private final void m16430g() {
        C8258a aVar;
        AbstractC8221a aVar2;
        if (!mo14622a().getShowCloseAll() || (aVar = this.f20536k) == null || (aVar2 = aVar.f20491a) == null || !aVar2.mo14497g()) {
            View view = this.f20533h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f20533h;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo14623c() {
        AbstractC8221a aVar;
        AbstractC8221a aVar2;
        C8258a aVar3 = this.f20536k;
        if (aVar3 == null || (aVar = aVar3.f20491a) == null || !aVar.mo14497g()) {
            mo14465b();
            return;
        }
        C8258a aVar4 = this.f20536k;
        if (!(aVar4 == null || (aVar2 = aVar4.f20491a) == null)) {
            aVar2.mo14498h();
        }
        m16430g();
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$e */
    static final class View$OnClickListenerC8283e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8278d f20541a;

        static {
            Covode.recordClassIndex(9118);
        }

        View$OnClickListenerC8283e(C8278d dVar) {
            this.f20541a = dVar;
        }

        public final void onClick(View view) {
            this.f20541a.mo14623c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.d$f */
    static final class View$OnClickListenerC8284f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8278d f20542a;

        static {
            Covode.recordClassIndex(9119);
        }

        View$OnClickListenerC8284f(C8278d dVar) {
            this.f20542a = dVar;
        }

        public final void onClick(View view) {
            this.f20542a.mo14465b();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p510g.AbstractC8248b
    /* renamed from: a */
    public final boolean mo14596a(KeyEvent keyEvent) {
        AbstractC8221a aVar;
        C89219l.m154721d(keyEvent, "");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            if (mo14622a().getDisableBackPress()) {
                return true;
            }
            C8258a aVar2 = this.f20536k;
            if (!(aVar2 == null || (aVar = aVar2.f20491a) == null || !aVar.mo14497g())) {
                mo14623c();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC2928f fVar;
        AbstractC2937k hybridPageManager;
        super.onCreate(bundle);
        if (m16429f().length() > 0 && getActivity() != null && (fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)) != null && (hybridPageManager = fVar.getHybridPageManager()) != null) {
            String f = m16429f();
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            hybridPageManager.mo7678a(f, activity);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int hashCode;
        Resources resources;
        TextView textView;
        Resources resources2;
        View view2;
        ActivityC0945e activity;
        Window window;
        ActivityC0945e activity2;
        Resources resources3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C8258a a = C8258a.C8259a.m16412a(mo14622a());
        a.mo14601b(m16429f());
        a.f20493c = this;
        this.f20536k = a;
        getChildFragmentManager().mo3552a().mo3453a(R.id.bg7, a).mo3473c();
        Configuration configuration = null;
        if (!(Build.VERSION.SDK_INT < 21 || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (activity2 = getActivity()) == null)) {
            C89219l.m154716b(activity2, "");
            C23073a.C23074a.m43508a(activity2).mo37498b(window.getStatusBarColor()).f54627a.mo33415d();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (mo14622a().getHideStatusBar() || mo14622a().getTransStatusBar()) {
                ViewGroup viewGroup = this.f20528b;
                if (viewGroup != null) {
                    viewGroup.post(new RunnableC8285g(this));
                }
            } else {
                ViewGroup viewGroup2 = this.f20528b;
                if (viewGroup2 != null) {
                    viewGroup2.post(new RunnableC8280b(this));
                }
            }
            if (mo14622a().getHideStatusBar()) {
                C89219l.m154721d(activity2, "");
                activity2.getWindow().setFlags(1024, 1024);
                try {
                    Context applicationContext = activity2.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    C89219l.m154716b(applicationContext, "");
                    Class<?> loadClass = applicationContext.getClassLoader().loadClass("android.os.SystemProperties");
                    Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                        try {
                            Class[] clsArr = new Class[1];
                            Class cls = Integer.TYPE;
                            if (cls == null) {
                                C89219l.m154715b();
                            }
                            clsArr[0] = cls;
                            Window.class.getMethod("addExtraFlags", clsArr).invoke(activity2.getWindow(), 768);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            HColor statusBgColor = mo14622a().getStatusBgColor();
            if (statusBgColor != null) {
                Integer valueOf = Integer.valueOf(statusBgColor.getColor(getContext()));
                if (!(valueOf.intValue() == 0 || valueOf == null)) {
                    C8302c.m16457a(activity2, valueOf.intValue());
                }
            }
            if (mo14622a().getTransStatusBar()) {
                mo14622a().setHideNavBar(true);
                C8302c.m16457a(activity2, 0);
            }
            String statusFontMode = mo14622a().getStatusFontMode();
            if (statusFontMode != null) {
                int hashCode2 = statusFontMode.hashCode();
                if (hashCode2 != 3075958) {
                    if (hashCode2 == 102970646 && statusFontMode.equals("light")) {
                        C3929a.m9569c(window, true);
                    }
                } else if (statusFontMode.equals("dark")) {
                    C3929a.m9569c(window, false);
                }
            }
            Context context = getContext();
            if (!(context == null || (resources3 = context.getResources()) == null)) {
                configuration = resources3.getConfiguration();
            }
            if (C89219l.m154714a((Object) C8311h.m16462a(configuration), (Object) "dark")) {
                C3929a.m9569c(window, false);
            } else {
                C3929a.m9569c(window, true);
            }
        }
        if (mo14622a().getHideNavBar()) {
            ViewGroup viewGroup3 = this.f20531f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        } else {
            View view3 = this.f20532g;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC8283e(this));
            }
            if (mo14622a().getShowCloseAll() && (view2 = this.f20533h) != null) {
                view2.setOnClickListener(new View$OnClickListenerC8284f(this));
            }
            HColor navBarColor = mo14622a().getNavBarColor();
            if (navBarColor != null) {
                Integer valueOf2 = Integer.valueOf(navBarColor.getColor(getContext()));
                int intValue = valueOf2.intValue();
                Context context2 = getContext();
                if ((context2 == null || (resources2 = context2.getResources()) == null || intValue != resources2.getColor(R.color.l)) && valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup4 = this.f20531f;
                    if (viewGroup4 != null) {
                        viewGroup4.setBackgroundColor(intValue2);
                    }
                }
            }
            if (mo14622a().getTitle().length() > 0 && (textView = this.f20535j) != null) {
                textView.setText(mo14622a().getTitle());
            }
            HColor titleColor = mo14622a().getTitleColor();
            if (titleColor != null) {
                Integer valueOf3 = Integer.valueOf(titleColor.getColor(getContext()));
                int intValue3 = valueOf3.intValue();
                Context context3 = getContext();
                if ((context3 == null || (resources = context3.getResources()) == null || intValue3 != resources.getColor(R.color.bx)) && valueOf3 != null) {
                    int intValue4 = valueOf3.intValue();
                    TextView textView2 = this.f20535j;
                    if (textView2 != null) {
                        textView2.setTextColor(intValue4);
                    }
                }
            }
            String navBtnType = mo14622a().getNavBtnType();
            if (navBtnType != null && ((hashCode = navBtnType.hashCode()) == -934521548 ? navBtnType.equals("report") : !(hashCode == 109400031 ? !navBtnType.equals("share") : hashCode != 949444906 || !navBtnType.equals("collect")))) {
                View view4 = this.f20534i;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            } else {
                View view5 = this.f20534i;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
        }
        C89219l.m154721d(mo14622a(), "");
        C89219l.m154721d(this, "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bcd, viewGroup, false);
        this.f20528b = (ViewGroup) a.findViewById(R.id.dnh);
        this.f20531f = (ViewGroup) a.findViewById(R.id.eiz);
        this.f20532g = a.findViewById(R.id.ej0);
        this.f20533h = a.findViewById(R.id.ej2);
        this.f20534i = a.findViewById(R.id.ej7);
        this.f20535j = (TextView) a.findViewById(R.id.ej8);
        return a;
    }
}
