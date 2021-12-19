package com.bytedance.ies.bullet.service.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0242i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16389b;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17039d;
import com.bytedance.ies.bullet.service.base.AbstractC16590ab;
import com.bytedance.ies.bullet.service.base.AbstractC16647h;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16670u;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16569d;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16852d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import com.bytedance.ies.bullet.service.popup.anim.AbstractC16927d;
import com.bytedance.ies.bullet.service.popup.anim.C16928e;
import com.bytedance.ies.bullet.service.popup.anim.EnumC16925b;
import com.bytedance.ies.bullet.service.popup.anim.EnumC16926c;
import com.bytedance.ies.bullet.service.popup.anim.animationInterpolatorC16924a;
import com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16915g;
import com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i;
import com.bytedance.ies.bullet.service.popup.p1183b.C16930a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.e */
public final class C16942e extends C0242i implements AbstractC16569d, AbstractC16576j, AbstractC16590ab {

    /* renamed from: u */
    public static final List<C16942e> f40334u = new ArrayList();

    /* renamed from: v */
    public static final List<C16942e> f40335v = new ArrayList();

    /* renamed from: w */
    public static final C16943a f40336w = new C16943a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f40337A = C89250i.m154773a((AbstractC89171a) new C16961p(this));

    /* renamed from: B */
    private final AbstractC89244h f40338B = C89250i.m154773a((AbstractC89171a) new C16945c(this));

    /* renamed from: C */
    private HashMap f40339C;

    /* renamed from: a */
    public C16248b f40340a;

    /* renamed from: b */
    public BulletContainerView f40341b;

    /* renamed from: c */
    public AbstractC16915g f40342c;

    /* renamed from: d */
    public AbstractC16208i f40343d;

    /* renamed from: e */
    AbstractC16917i f40344e;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f40345f;

    /* renamed from: g */
    View f40346g;

    /* renamed from: h */
    public boolean f40347h = true;

    /* renamed from: i */
    public boolean f40348i;

    /* renamed from: j */
    public String f40349j;

    /* renamed from: k */
    public Boolean f40350k;

    /* renamed from: l */
    public Boolean f40351l;

    /* renamed from: m */
    public EnumC16944b f40352m = EnumC16944b.UNKNOWN;

    /* renamed from: n */
    public Activity f40353n;

    /* renamed from: o */
    public AbstractC16239d.AbstractC16241b f40354o;

    /* renamed from: p */
    public C16939c f40355p;

    /* renamed from: q */
    public AbstractC16570e f40356q;

    /* renamed from: r */
    String f40357r = "default_bid";

    /* renamed from: s */
    public EnumC16925b f40358s = EnumC16925b.NONE;

    /* renamed from: t */
    public Throwable f40359t;

    /* renamed from: x */
    private final AbstractC89244h f40360x = C89250i.m154773a((AbstractC89171a) new C16962q(this));

    /* renamed from: y */
    private EnumC16926c f40361y = EnumC16926c.NONE;

    /* renamed from: z */
    private final AbstractC89244h f40362z = C89250i.m154773a((AbstractC89171a) new C16963r(this));

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$b */
    public enum EnumC16944b {
        UNKNOWN,
        TAP_MASK,
        GESTURE,
        JSB;

        static {
            Covode.recordClassIndex(19386);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$s */
    public static final class DialogC16964s extends DialogC16941d {

        /* renamed from: a */
        final /* synthetic */ C16942e f40402a;

        static {
            Covode.recordClassIndex(19406);
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.e$s$b */
        public static final class C16966b implements AbstractC16191p {

            /* renamed from: a */
            final /* synthetic */ DialogC16964s f40404a;

            /* renamed from: b */
            private final String f40405b = "bulletOnBackPressAction";

            /* renamed from: c */
            private final Object f40406c;

            static {
                Covode.recordClassIndex(19408);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return this.f40405b;
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final Object mo25700b() {
                return this.f40406c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C16966b(DialogC16964s sVar) {
                this.f40404a = sVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("containerID", sVar.f40402a.mo26792k());
                this.f40406c = jSONObject;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.e$s$a */
        static final class C16965a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ DialogC16964s f40403a;

            static {
                Covode.recordClassIndex(19407);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16965a(DialogC16964s sVar) {
                super(0);
                this.f40403a = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                DialogC16964s.super.dismiss();
                return C89391z.f203057a;
            }
        }

        public final void dismiss() {
            this.f40402a.mo26787a(new C16965a(this));
        }

        public final void onBackPressed() {
            if (!this.f40402a.f40347h) {
                return;
            }
            if (!this.f40402a.mo26790i().f40322o) {
                this.f40402a.f40352m = EnumC16944b.GESTURE;
                super.onBackPressed();
                return;
            }
            AbstractC16208i iVar = this.f40402a.f40343d;
            if (iVar != null) {
                iVar.onEvent(new C16966b(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC16964s(C16942e eVar, Context context) {
            super(context, (byte) 0);
            this.f40402a = eVar;
        }
    }

    /* renamed from: g */
    public final FrameLayout mo26788g() {
        return (FrameLayout) this.f40360x.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f40337A.getValue();
    }

    /* renamed from: h */
    public final AbstractC16927d mo26789h() {
        return (AbstractC16927d) this.f40362z.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final AbstractC16876a.AbstractC16878b mo26791j() {
        return (AbstractC16876a.AbstractC16878b) this.f40338B.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$a */
    public static final class C16943a {
        static {
            Covode.recordClassIndex(19385);
        }

        private C16943a() {
        }

        public /* synthetic */ C16943a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16942e m31263a(String str) {
            T t;
            C89219l.m154719c(str, "");
            Iterator<T> it = C16942e.f40334u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.mo26792k(), (Object) str)) {
                    break;
                }
            }
            return t;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$t */
    public static final class C16967t implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ C16942e f40407a;

        /* renamed from: b */
        private final String f40408b = "notification";

        /* renamed from: c */
        private final Object f40409c;

        static {
            Covode.recordClassIndex(19409);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f40408b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f40409c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16967t(C16942e eVar) {
            this.f40407a = eVar;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerID", eVar.mo26792k());
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "onClosePanel");
            this.f40409c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: d */
    public final void mo26355d() {
        dismissAllowingStateLoss();
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$c */
    static final class C16945c extends AbstractC89220m implements AbstractC89171a<C169461> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40364a;

        static {
            Covode.recordClassIndex(19387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16945c(C16942e eVar) {
            super(0);
            this.f40364a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C169461 invoke() {
            return new AbstractC16876a.AbstractC16878b(this) {
                /* class com.bytedance.ies.bullet.service.popup.C16942e.C16945c.C169461 */

                /* renamed from: a */
                final /* synthetic */ C16945c f40365a;

                static {
                    Covode.recordClassIndex(19388);
                }

                @Override // com.bytedance.ies.bullet.service.popup.AbstractC16876a.AbstractC16878b
                /* renamed from: a */
                public final boolean mo26672a() {
                    if (!this.f40365a.f40364a.mo26790i().f40318k || !this.f40365a.f40364a.mo26790i().f40332y) {
                        return this.f40365a.f40364a.mo26790i().f40318k;
                    }
                    return this.f40365a.f40364a.f40348i;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f40365a = r1;
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$h */
    static final class C16952h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40375a;

        /* renamed from: b */
        final /* synthetic */ int f40376b;

        /* renamed from: c */
        final /* synthetic */ int f40377c;

        static {
            Covode.recordClassIndex(19394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16952h(C16942e eVar, int i, int i2) {
            super(0);
            this.f40375a = eVar;
            this.f40376b = i;
            this.f40377c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40375a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.e$x */
    public static final class C16971x extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16670u f40415a;

        /* renamed from: b */
        final /* synthetic */ C16942e f40416b;

        /* renamed from: c */
        final /* synthetic */ BulletContainerView f40417c;

        static {
            Covode.recordClassIndex(19413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16971x(AbstractC16670u uVar, C16942e eVar, BulletContainerView bulletContainerView) {
            super(0);
            this.f40415a = uVar;
            this.f40416b = eVar;
            this.f40417c = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40416b.dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.e$y */
    public static final class C16972y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16670u f40418a;

        /* renamed from: b */
        final /* synthetic */ C16942e f40419b;

        /* renamed from: c */
        final /* synthetic */ BulletContainerView f40420c;

        static {
            Covode.recordClassIndex(19414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16972y(AbstractC16670u uVar, C16942e eVar, BulletContainerView bulletContainerView) {
            super(0);
            this.f40418a = uVar;
            this.f40419b = eVar;
            this.f40420c = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40420c.mo26842b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: m */
    private final void m31247m() {
        AbstractC16917i iVar = this.f40344e;
        if (iVar != null) {
            iVar.mo26690c();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: a */
    public final String mo26352a() {
        return this.f40357r;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: e */
    public final String mo26356e() {
        return mo26792k();
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$j */
    static final class C16954j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40381a;

        /* renamed from: b */
        final /* synthetic */ int f40382b;

        /* renamed from: c */
        final /* synthetic */ int f40383c;

        static {
            Covode.recordClassIndex(19396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16954j(C16942e eVar, int i, int i2) {
            super(0);
            this.f40381a = eVar;
            this.f40382b = i;
            this.f40383c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC16927d h = this.f40381a.mo26789h();
            if (h != null) {
                h.mo26753b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.e$o */
    public static final class C16960o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40397a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40398b;

        static {
            Covode.recordClassIndex(19402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16960o(C16942e eVar, AbstractC89171a aVar) {
            super(0);
            this.f40397a = eVar;
            this.f40398b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f40397a.f40358s = EnumC16925b.DONE;
            this.f40398b.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$r */
    static final class C16963r extends AbstractC89220m implements AbstractC89171a<C16928e> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40401a;

        static {
            Covode.recordClassIndex(19405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16963r(C16942e eVar) {
            super(0);
            this.f40401a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16928e invoke() {
            return new C16928e(this.f40401a.mo26788g());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        mo26787a(new C16959n(this));
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: f */
    public final Uri mo26357f() {
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        return cVar.f40312e;
    }

    /* renamed from: i */
    public final C16939c mo26790i() {
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        return cVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f40339C;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.e$u */
    public static final class RunnableC16968u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C16942e f40410a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16208i f40411b;

        static {
            Covode.recordClassIndex(19410);
        }

        RunnableC16968u(C16942e eVar, AbstractC16208i iVar) {
            this.f40410a = eVar;
            this.f40411b = iVar;
        }

        public final void run() {
            AbstractC16208i iVar;
            if (C89219l.m154714a((Object) this.f40410a.f40351l, (Object) true) && (iVar = this.f40411b) != null) {
                iVar.mo25775j();
            }
            this.f40410a.f40350k = true;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$w */
    static final class RunnableC16970w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C16942e f40414a;

        static {
            Covode.recordClassIndex(19412);
        }

        RunnableC16970w(C16942e eVar) {
            this.f40414a = eVar;
        }

        public final void run() {
            BulletContainerView bulletContainerView = this.f40414a.f40341b;
            if (bulletContainerView != null) {
                bulletContainerView.mo25721a();
            }
            C16942e eVar = this.f40414a;
            C89219l.m154719c(eVar, "");
            C16942e.f40335v.remove(eVar);
        }
    }

    static {
        Covode.recordClassIndex(19384);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: b */
    public final String mo26353b() {
        String string;
        AbstractC16580l a = C16622e.C16623a.m30858a();
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        AbstractC16559e<String, Object> a2 = a.mo26339a(cVar.f40308a);
        if (a2 == null || (string = a2.getString("__x_param_channel")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: c */
    public final String mo26354c() {
        String string;
        AbstractC16580l a = C16622e.C16623a.m30858a();
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        AbstractC16559e<String, Object> a2 = a.mo26339a(cVar.f40308a);
        if (a2 == null || (string = a2.getString("__x_param_bundle")) == null) {
            return "";
        }
        return string;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismissAllowingStateLoss() {
        EnumC16944b bVar = EnumC16944b.UNKNOWN;
        C89219l.m154719c(bVar, "");
        if (bVar == EnumC16944b.JSB) {
            this.f40352m = bVar;
        }
        super.dismissAllowingStateLoss();
    }

    /* renamed from: k */
    public final String mo26792k() {
        C16238z a;
        String str;
        AbstractC16208i iVar = this.f40343d;
        if (iVar == null || (a = iVar.mo25762a()) == null || (str = a.f39033a) == null) {
            return "";
        }
        return str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        AbstractC16208i iVar;
        super.onPause();
        this.f40351l = false;
        if (C89219l.m154714a((Object) this.f40350k, (Object) true) && (iVar = this.f40343d) != null) {
            iVar.mo25776k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC16208i iVar;
        super.onResume();
        this.f40351l = true;
        if (C89219l.m154714a((Object) this.f40350k, (Object) true) && (iVar = this.f40343d) != null) {
            iVar.mo25775j();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        try {
            getDialog().show();
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$m */
    public static final class C16958m implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C16942e f40393a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40394b;

        /* renamed from: c */
        private boolean f40395c;

        static {
            Covode.recordClassIndex(19400);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private final void m31277a() {
            if (!this.f40395c) {
                try {
                    this.f40394b.invoke();
                } catch (Exception e) {
                    this.f40393a.f40359t = e;
                    AbstractC16576j.C16578b.m30778a(this.f40393a, "dismiss failed on onAnimationEnd with: " + e.getMessage(), null, "popup", 2);
                }
                this.f40395c = true;
            }
        }

        public final void onAnimationCancel(Animator animator) {
            m31277a();
        }

        public final void onAnimationEnd(Animator animator) {
            m31277a();
        }

        C16958m(C16942e eVar, AbstractC89171a aVar) {
            this.f40393a = eVar;
            this.f40394b = aVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$p */
    static final class C16961p extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40399a;

        static {
            Covode.recordClassIndex(19403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16961p(C16942e eVar) {
            super(0);
            this.f40399a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            AbstractC16239d.AbstractC16241b bVar = this.f40399a.f40354o;
            if (bVar == null) {
                C89219l.m154710a("coreProvider");
            }
            return new C16587q((AbstractC16652m) bVar.mo25656a().mo25688b().mo25832c(AbstractC16652m.class), "PopUp");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$q */
    static final class C16962q extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40400a;

        static {
            Covode.recordClassIndex(19404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16962q(C16942e eVar) {
            super(0);
            this.f40400a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.m26663i(558);
            Context context = this.f40400a.getContext();
            if (context == null) {
                C89219l.m154707a();
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            MethodCollector.m26664o(558);
            return frameLayout;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$n */
    static final class C16959n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40396a;

        static {
            Covode.recordClassIndex(19401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16959n(C16942e eVar) {
            super(0);
            this.f40396a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Window window;
            Object a;
            MethodCollector.m26663i(1685);
            Dialog dialog = this.f40396a.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                C16942e eVar = this.f40396a;
                C89219l.m154709a((Object) window, "");
                View currentFocus = window.getCurrentFocus();
                if (currentFocus == null) {
                    View decorView = window.getDecorView();
                    C89219l.m154709a((Object) decorView, "");
                    currentFocus = decorView.findViewWithTag("keyboardTagView");
                    if (currentFocus == null) {
                        currentFocus = new EditText(window.getContext());
                        currentFocus.setTag("keyboardTagView");
                        ((ViewGroup) decorView).addView(currentFocus, 0, 0);
                    }
                    currentFocus.requestFocus();
                }
                Context context = eVar.getContext();
                if (context == null || (a = C16942e.m31244a(context, "input_method")) == null) {
                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(1685);
                    throw wVar;
                }
                ((InputMethodManager) a).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            C16942e.super.dismiss();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(1685);
            return zVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.f40353n != null && this.f40355p != null) {
            AbstractC16208i iVar = this.f40343d;
            if (iVar != null) {
                iVar.onEvent(new C16967t(this));
            }
            AbstractC16570e eVar = this.f40356q;
            if (eVar != null) {
                eVar.mo26332b(this);
            }
            new Handler().postDelayed(new RunnableC16970w(this), 100);
            C89219l.m154719c(this, "");
            List<C16942e> list = f40334u;
            list.remove(this);
            C16942e eVar2 = (C16942e) C89070n.m154588i((List) list);
            if (eVar2 != null) {
                C16939c cVar = eVar2.f40355p;
                if (cVar == null) {
                    C89219l.m154710a("config");
                }
                if (cVar.f40311d == 3) {
                    eVar2.m31247m();
                }
            }
            f40335v.add(this);
            C16939c cVar2 = this.f40355p;
            if (cVar2 == null) {
                C89219l.m154710a("config");
            }
            if (cVar2.f40311d == 1) {
                C16939c cVar3 = this.f40355p;
                if (cVar3 == null) {
                    C89219l.m154710a("config");
                }
                C16942e a = C16943a.m31263a(cVar3.f40324q);
                if (a != null) {
                    a.m31247m();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final BulletContainerView mo26793l() {
        Activity activity = this.f40353n;
        if (activity == null) {
            C89219l.m154710a("act");
        }
        BulletContainerView bulletContainerView = new BulletContainerView(activity, null, 6, (byte) 0);
        this.f40340a = bulletContainerView.getProviderFactory();
        AbstractC16239d.AbstractC16241b bVar = this.f40354o;
        if (bVar == null) {
            C89219l.m154710a("coreProvider");
        }
        bulletContainerView.mo26845b(bVar);
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        Bundle bundle = cVar.f40313f;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C16939c cVar2 = this.f40355p;
        if (cVar2 == null) {
            C89219l.m154710a("config");
        }
        Uri uri = cVar2.f40312e;
        Context context = bulletContainerView.getContext();
        C89219l.m154709a((Object) context, "");
        C17039d.m31496a(context);
        AbstractC16670u uVar = (AbstractC16670u) C16622e.C16623a.m30858a().mo26347a(this.f40357r, AbstractC16670u.class);
        if (uVar != null) {
            Activity activity2 = this.f40353n;
            if (activity2 == null) {
                C89219l.m154710a("act");
            }
            AbstractC16650k a = uVar.mo26334a(activity2);
            if (a != null) {
                View view = a.getView();
                FrameLayout.LayoutParams d = uVar.mo26337d();
                if (d != null) {
                    bulletContainerView.mo26840a(view, d);
                } else {
                    bulletContainerView.mo26839a(view, 17, 0, 0, 0, 0);
                }
            }
            Activity activity3 = this.f40353n;
            if (activity3 == null) {
                C89219l.m154710a("act");
            }
            AbstractC16647h b = uVar.mo26336b(activity3);
            if (b != null) {
                new C16971x(uVar, this, bulletContainerView);
                new C16972y(uVar, this, bulletContainerView);
                View a2 = b.mo26407a();
                FrameLayout.LayoutParams e = uVar.mo26338e();
                if (e != null) {
                    bulletContainerView.mo26844b(a2, e);
                } else {
                    bulletContainerView.mo26844b((BulletContainerView) a2, (View) new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
        C16939c cVar3 = this.f40355p;
        if (cVar3 == null) {
            C89219l.m154710a("config");
        }
        C89219l.m154719c(cVar3, "");
        if (cVar3.f40314g <= 0 && cVar3.f40315h <= 0) {
            C16939c cVar4 = this.f40355p;
            if (cVar4 == null) {
                C89219l.m154710a("config");
            }
            Integer num = cVar4.f40326s;
            if (num != null) {
                bundle.putInt("lynxview_width", num.intValue());
            }
            C16939c cVar5 = this.f40355p;
            if (cVar5 == null) {
                C89219l.m154710a("config");
            }
            Integer num2 = cVar5.f40327t;
            if (num2 != null) {
                bundle.putInt("lynxview_height", num2.intValue());
            }
        }
        try {
            C16939c cVar6 = this.f40355p;
            if (cVar6 == null) {
                C89219l.m154710a("config");
            }
            Bundle bundle2 = cVar6.f40325r;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C16949e eVar = new C16949e(this);
        C16248b bVar2 = new C16248b();
        bVar2.mo25828a(AbstractC16370a.class, new C16950f(this));
        bVar2.mo25828a(C16481e.class, new C16951g(this));
        bulletContainerView.mo26837a(uri, bundle, bVar2, eVar);
        return bulletContainerView;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$v */
    static final class RunnableC16969v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C16942e f40412a;

        /* renamed from: b */
        final /* synthetic */ View f40413b;

        static {
            Covode.recordClassIndex(19411);
        }

        RunnableC16969v(C16942e eVar, View view) {
            this.f40412a = eVar;
            this.f40413b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
            if (r5 != 3) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 651
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.C16942e.RunnableC16969v.run():void");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$e */
    public static final class C16949e implements AbstractC17046h.AbstractC17048b {

        /* renamed from: a */
        final /* synthetic */ C16942e f40372a;

        static {
            Covode.recordClassIndex(19391);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25851a(Uri uri) {
            C89219l.m154719c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
            C89219l.m154719c(list, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(iVar, "");
        }

        C16949e(C16942e eVar) {
            this.f40372a = eVar;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25852a(Uri uri, Throwable th) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(th, "");
            AbstractC16570e eVar = this.f40372a.f40356q;
            if (eVar != null) {
                eVar.mo26331a(this.f40372a, th);
            }
            this.f40372a.f40348i = true;
            if (!this.f40372a.mo26790i().f40330w) {
                this.f40372a.dismiss();
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(qVar, "");
            if (qVar instanceof C16852d) {
                this.f40372a.f40349j = ((C16852d) qVar).f40025Q.mo26550b();
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(iVar, "");
            this.f40372a.f40343d = iVar;
            this.f40372a.f40348i = true;
            C16942e eVar = this.f40372a;
            C89219l.m154719c(eVar, "");
            C16942e.f40334u.add(eVar);
            AbstractC16570e eVar2 = this.f40372a.f40356q;
            if (eVar2 != null) {
                eVar2.mo26333c(this.f40372a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$f */
    public static final class C16950f extends AbstractC16370a.AbstractC16371a {

        /* renamed from: a */
        final /* synthetic */ C16942e f40373a;

        static {
            Covode.recordClassIndex(19392);
        }

        C16950f(C16942e eVar) {
            this.f40373a = eVar;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: f */
        public final void mo25962f(AbstractC16387b bVar) {
            C89219l.m154719c(bVar, "");
            C16942e eVar = this.f40373a;
            eVar.mo26785a(eVar.mo26788g(), bVar);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: a */
        public final void mo25955a(AbstractC16387b bVar, C16389b bVar2) {
            C89219l.m154719c(bVar, "");
            super.mo25955a(bVar, bVar2);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$g */
    public static final class C16951g extends C16481e {

        /* renamed from: a */
        final /* synthetic */ C16942e f40374a;

        static {
            Covode.recordClassIndex(19393);
        }

        C16951g(C16942e eVar) {
            this.f40374a = eVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            C16942e eVar = this.f40374a;
            eVar.mo26785a(eVar.mo26788g(), this.f39535d);
        }
    }

    /* renamed from: b */
    private final Animator.AnimatorListener m31246b(AbstractC89171a<C89391z> aVar) {
        return new C16958m(this, aVar);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f40352m == EnumC16944b.UNKNOWN) {
            this.f40352m = EnumC16944b.TAP_MASK;
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$i */
    static final class C16953i extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40378a;

        /* renamed from: b */
        final /* synthetic */ int f40379b;

        /* renamed from: c */
        final /* synthetic */ int f40380c;

        static {
            Covode.recordClassIndex(19395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16953i(C16942e eVar, int i, int i2) {
            super(1);
            this.f40378a = eVar;
            this.f40379b = i;
            this.f40380c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f40378a.dismiss();
            } else {
                AbstractC89171a<C89391z> aVar = this.f40378a.f40345f;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f40378a.f40345f = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$k */
    static final class C16955k extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40384a;

        /* renamed from: b */
        final /* synthetic */ int f40385b;

        /* renamed from: c */
        final /* synthetic */ int f40386c;

        static {
            Covode.recordClassIndex(19397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16955k(C16942e eVar, int i, int i2) {
            super(1);
            this.f40384a = eVar;
            this.f40385b = i;
            this.f40386c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            AbstractC16208i iVar = this.f40384a.f40343d;
            if (iVar != null) {
                iVar.onEvent(new AbstractC16191p(str2) {
                    /* class com.bytedance.ies.bullet.service.popup.C16942e.C16955k.C169561 */

                    /* renamed from: a */
                    final /* synthetic */ String f40387a;

                    /* renamed from: b */
                    private final String f40388b = "popupStatusChange";

                    /* renamed from: c */
                    private final Object f40389c;

                    static {
                        Covode.recordClassIndex(19398);
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                    /* renamed from: a */
                    public final String mo25699a() {
                        return this.f40388b;
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                    /* renamed from: b */
                    public final Object mo25700b() {
                        return this.f40389c;
                    }

                    {
                        this.f40387a = r3;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", r3);
                        this.f40389c = jSONObject;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$l */
    static final class C16957l extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16942e f40390a;

        /* renamed from: b */
        final /* synthetic */ int f40391b;

        /* renamed from: c */
        final /* synthetic */ int f40392c;

        static {
            Covode.recordClassIndex(19399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16957l(C16942e eVar, int i, int i2) {
            super(1);
            this.f40390a = eVar;
            this.f40391b = i;
            this.f40392c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f40390a.dismiss();
            } else {
                AbstractC89171a<C89391z> aVar = this.f40390a.f40345f;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f40390a.f40345f = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo26786a(EnumC16926c cVar) {
        C89219l.m154719c(cVar, "");
        this.f40361y = cVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154707a();
        }
        C89219l.m154709a((Object) context, "");
        DialogC16964s sVar = new DialogC16964s(this, context);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            sVar.setOwnerActivity(activity);
        }
        return sVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$d */
    public static final class C16947d implements C16930a.AbstractC16931a {

        /* renamed from: a */
        final /* synthetic */ Window f40366a;

        /* renamed from: b */
        final /* synthetic */ C16942e f40367b;

        static {
            Covode.recordClassIndex(19389);
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16930a.AbstractC16931a
        /* renamed from: a */
        public final void mo26673a(int i) {
            boolean z;
            AbstractC16915g gVar = this.f40367b.f40342c;
            if (gVar != null) {
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Window window = this.f40366a;
                C89219l.m154709a((Object) window, "");
                View decorView = window.getDecorView();
                C89219l.m154709a((Object) decorView, "");
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                gVar.mo26687a(z, i, Integer.valueOf(rect.bottom));
            }
            AbstractC16208i iVar = this.f40367b.f40343d;
            if (iVar != null) {
                iVar.onEvent(new AbstractC16191p(this, i) {
                    /* class com.bytedance.ies.bullet.service.popup.C16942e.C16947d.C169481 */

                    /* renamed from: a */
                    final /* synthetic */ C16947d f40368a;

                    /* renamed from: b */
                    final /* synthetic */ int f40369b;

                    /* renamed from: c */
                    private final String f40370c = "bulletOnSoftInputChangedAction";

                    /* renamed from: d */
                    private final Object f40371d;

                    static {
                        Covode.recordClassIndex(19390);
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                    /* renamed from: a */
                    public final String mo25699a() {
                        return this.f40370c;
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                    /* renamed from: b */
                    public final Object mo25700b() {
                        return this.f40371d;
                    }

                    {
                        boolean z;
                        this.f40368a = r4;
                        this.f40369b = r5;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("containerID", r4.f40367b.mo26792k());
                        if (r5 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jSONObject.put("keyboardShow", z);
                        this.f40371d = jSONObject;
                    }
                });
            }
        }

        C16947d(Window window, C16942e eVar) {
            this.f40366a = window;
            this.f40367b = eVar;
        }
    }

    /* renamed from: a */
    public final void mo26787a(AbstractC89171a<C89391z> aVar) {
        Animator animator;
        String str;
        try {
            if (this.f40346g == null || this.f40361y == EnumC16926c.NONE || this.f40358s == EnumC16925b.DONE) {
                aVar.invoke();
            } else if (this.f40359t != null) {
                StringBuilder sb = new StringBuilder("reAnimEnd with msg:");
                Throwable th = this.f40359t;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                AbstractC16576j.C16578b.m30778a(this, sb.append(str).toString(), null, "popup", 2);
                aVar.invoke();
            } else if (this.f40358s != EnumC16925b.DOING) {
                this.f40358s = EnumC16925b.DOING;
                C16960o oVar = new C16960o(this, aVar);
                int i = C16973f.f40421a[this.f40361y.ordinal()];
                if (i == 1) {
                    View view = this.f40346g;
                    if (view == null) {
                        C89219l.m154707a();
                    }
                    view.animate().translationX((float) mo26788g().getWidth()).setDuration(300).setListener(m31246b(oVar)).start();
                } else if (i == 2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(m31246b(oVar));
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(new animationInterpolatorC16924a((byte) 0));
                    Animator[] animatorArr = new Animator[1];
                    View view2 = this.f40346g;
                    float[] fArr = new float[2];
                    if (view2 == null) {
                        C89219l.m154707a();
                    }
                    fArr[0] = view2.getTranslationY();
                    fArr[1] = (float) mo26788g().getHeight();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", fArr);
                    C89219l.m154709a((Object) ofFloat, "");
                    animatorArr[0] = ofFloat;
                    List c = C89070n.m154524c(animatorArr);
                    if (mo26789h() != null) {
                        AbstractC16927d h = mo26789h();
                        if (h == null) {
                            C89219l.m154707a();
                        }
                        c.add(h.mo26754c());
                    }
                    animatorSet.playTogether(c);
                    animatorSet.start();
                } else if (i != 3) {
                    oVar.invoke();
                } else {
                    AbstractC16927d h2 = mo26789h();
                    if (h2 != null) {
                        animator = h2.mo26754c();
                    } else {
                        animator = null;
                    }
                    if (mo26789h() == null || animator == null) {
                        oVar.invoke();
                        return;
                    }
                    animator.setDuration(300);
                    animator.addListener(m31246b(oVar));
                    animator.start();
                }
            }
        } catch (Exception e) {
            AbstractC16576j.C16578b.m30778a(this, "dismiss failed with: " + e.getMessage(), null, "popup", 2);
        }
    }

    /* renamed from: a */
    public final void mo26785a(View view, AbstractC16208i iVar) {
        if (view != null) {
            view.post(new RunnableC16968u(this, iVar));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* renamed from: a */
    public static Object m31244a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1136);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1136);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC16917i iVar;
        Dialog dialog;
        Window window;
        C89219l.m154719c(view, "");
        super.onViewCreated(view, bundle);
        if (this.f40353n == null || this.f40355p == null) {
            AbstractC16576j.C16578b.m30778a(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
            dismissAllowingStateLoss();
            return;
        }
        C16939c cVar = this.f40355p;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        this.f40347h = cVar.f40333z;
        view.post(new RunnableC16969v(this, view));
        C16939c cVar2 = this.f40355p;
        if (cVar2 == null) {
            C89219l.m154710a("config");
        }
        view.setBackgroundColor(Color.parseColor(cVar2.f40317j));
        AbstractC16927d h = mo26789h();
        if (h != null) {
            h.mo26752a();
        }
        C16939c cVar3 = this.f40355p;
        if (cVar3 == null) {
            C89219l.m154710a("config");
        }
        if (!(!cVar3.f40323p || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            C89219l.m154709a((Object) window, "");
            Context context = window.getContext();
            C89219l.m154709a((Object) context, "");
            C16930a.m31197a(window, context, new C16947d(window, this));
        }
        C16939c cVar4 = this.f40355p;
        if (cVar4 == null) {
            C89219l.m154710a("config");
        }
        int i = cVar4.f40311d;
        if (i == 0) {
            C16939c cVar5 = this.f40355p;
            if (cVar5 == null) {
                C89219l.m154710a("config");
            }
            C16942e a = C16943a.m31263a(cVar5.f40324q);
            if (a != null && (iVar = a.f40344e) != null) {
                iVar.mo26691d();
            }
        } else if (i == 3) {
            C16939c cVar6 = this.f40355p;
            if (cVar6 == null) {
                C89219l.m154710a("config");
            }
            C16942e a2 = C16943a.m31263a(cVar6.f40324q);
            if (a2 != null) {
                a2.f40345f = null;
                AbstractC16917i iVar2 = a2.f40344e;
                if (iVar2 != null) {
                    iVar2.mo26692e();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154719c(layoutInflater, "");
        return mo26788g();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }
}
