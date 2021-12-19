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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0242i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.AbstractC16590ab;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16569d;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.popup.anim.AbstractC16927d;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
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
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a */
public abstract class AbstractC16876a extends C0242i implements AbstractC16569d, AbstractC16576j, AbstractC16590ab {

    /* renamed from: m */
    public static final List<AbstractC16876a> f40100m = new ArrayList();

    /* renamed from: n */
    public static final List<AbstractC16876a> f40101n = new ArrayList();

    /* renamed from: o */
    public static final C16877a f40102o = new C16877a((byte) 0);

    /* renamed from: a */
    public C16974g f40103a;

    /* renamed from: b */
    public AbstractC16915g f40104b;

    /* renamed from: c */
    public AbstractC16917i f40105c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f40106d;

    /* renamed from: e */
    public View f40107e;

    /* renamed from: f */
    public boolean f40108f;

    /* renamed from: g */
    public EnumC16879c f40109g;

    /* renamed from: h */
    public Activity f40110h;

    /* renamed from: i */
    public C16939c f40111i;

    /* renamed from: j */
    BottomSheetBehavior.AbstractC16922a f40112j;

    /* renamed from: k */
    public EnumC16925b f40113k;

    /* renamed from: l */
    public Throwable f40114l;

    /* renamed from: p */
    private final AbstractC89244h f40115p;

    /* renamed from: q */
    private EnumC16926c f40116q;

    /* renamed from: r */
    private final AbstractC89244h f40117r;

    /* renamed from: s */
    private AbstractC16570e f40118s;

    /* renamed from: t */
    private Boolean f40119t;

    /* renamed from: u */
    private Boolean f40120u;

    /* renamed from: v */
    private final AbstractC89244h f40121v;

    /* renamed from: w */
    private HashMap f40122w;

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$b */
    public interface AbstractC16878b {
        static {
            Covode.recordClassIndex(19318);
        }

        /* renamed from: a */
        boolean mo26672a();
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$c */
    public enum EnumC16879c {
        UNKNOWN,
        TAP_MASK,
        GESTURE,
        JSB;

        static {
            Covode.recordClassIndex(19319);
        }
    }

    /* renamed from: g */
    public final FrameLayout mo26667g() {
        return (FrameLayout) this.f40115p.getValue();
    }

    /* renamed from: h */
    public final AbstractC16927d mo26668h() {
        return (AbstractC16927d) this.f40117r.getValue();
    }

    /* renamed from: i */
    public final AbstractC16878b mo26669i() {
        return (AbstractC16878b) this.f40121v.getValue();
    }

    /* renamed from: j */
    public abstract String mo26670j();

    /* renamed from: k */
    public abstract View mo26671k();

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$a */
    public static final class C16877a {
        static {
            Covode.recordClassIndex(19317);
        }

        private C16877a() {
        }

        public /* synthetic */ C16877a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC16876a m31119a(String str) {
            T t;
            C89219l.m154719c(str, "");
            Iterator<T> it = AbstractC16876a.f40100m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.mo26670j(), (Object) str)) {
                    break;
                }
            }
            return t;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$h */
    public static final class DialogC16884h extends DialogC16941d {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40132a;

        static {
            Covode.recordClassIndex(19324);
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.a$h$a */
        static final class C16885a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ DialogC16884h f40133a;

            static {
                Covode.recordClassIndex(19325);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16885a(DialogC16884h hVar) {
                super(0);
                this.f40133a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                DialogC16884h.super.dismiss();
                return C89391z.f203057a;
            }
        }

        public final void dismiss() {
            this.f40132a.mo26666a(new C16885a(this));
        }

        public final void onBackPressed() {
            if (this.f40132a.f40108f) {
                C16939c cVar = this.f40132a.f40111i;
                if (cVar == null) {
                    C89219l.m154710a("config");
                }
                if (!cVar.f40322o) {
                    AbstractC16876a aVar = this.f40132a;
                    EnumC16879c cVar2 = EnumC16879c.GESTURE;
                    C89219l.m154719c(cVar2, "");
                    aVar.f40109g = cVar2;
                    super.onBackPressed();
                    return;
                }
                new JSONObject().put("containerID", this.f40132a.mo26670j());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC16884h(AbstractC16876a aVar, Context context) {
            super(context, (byte) 0);
            this.f40132a = aVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$k */
    static final class C16888k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40137a;

        /* renamed from: b */
        final /* synthetic */ View f40138b;

        static {
            Covode.recordClassIndex(19328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16888k(AbstractC16876a aVar, View view) {
            super(0);
            this.f40137a = aVar;
            this.f40138b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40137a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: l */
    private final void m31111l() {
        AbstractC16917i iVar = this.f40105c;
        if (iVar != null) {
            iVar.mo26690c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a$g */
    public static final class C16883g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40130a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40131b;

        static {
            Covode.recordClassIndex(19323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16883g(AbstractC16876a aVar, AbstractC89171a aVar2) {
            super(0);
            this.f40130a = aVar;
            this.f40131b = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f40130a.f40113k = EnumC16925b.DONE;
            this.f40131b.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$n */
    static final class C16891n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40143a;

        /* renamed from: b */
        final /* synthetic */ View f40144b;

        static {
            Covode.recordClassIndex(19331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16891n(AbstractC16876a aVar, View view) {
            super(0);
            this.f40143a = aVar;
            this.f40144b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC16927d h = this.f40143a.mo26668h();
            if (h != null) {
                h.mo26753b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismiss() {
        mo26666a(new C16882f(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f40122w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f40120u = true;
        C89219l.m154714a((Object) this.f40119t, (Object) true);
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$i */
    static final class RunnableC16886i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40134a;

        static {
            Covode.recordClassIndex(19326);
        }

        RunnableC16886i(AbstractC16876a aVar) {
            this.f40134a = aVar;
        }

        public final void run() {
            C16974g gVar = this.f40134a.f40103a;
            if (gVar != null) {
                gVar.mo26804a();
            }
            C16974g gVar2 = this.f40134a.f40103a;
            if (gVar2 != null) {
                gVar2.mo26804a();
            }
            AbstractC16876a aVar = this.f40134a;
            C89219l.m154719c(aVar, "");
            AbstractC16876a.f40101n.remove(aVar);
        }
    }

    static {
        Covode.recordClassIndex(19316);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismissAllowingStateLoss() {
        EnumC16879c cVar = EnumC16879c.UNKNOWN;
        C89219l.m154719c(cVar, "");
        if (cVar == EnumC16879c.JSB) {
            this.f40109g = cVar;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f40120u = false;
        C89219l.m154714a((Object) this.f40119t, (Object) true);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            getDialog().show();
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$e */
    public static final class C16881e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40126a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40127b;

        /* renamed from: c */
        private boolean f40128c;

        static {
            Covode.recordClassIndex(19321);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private final void m31122a() {
            if (!this.f40128c) {
                try {
                    this.f40127b.invoke();
                } catch (Exception e) {
                    this.f40126a.f40114l = e;
                    AbstractC16576j.C16578b.m30778a(this.f40126a, "dismiss failed on onAnimationEnd with: " + e.getMessage(), null, "popup", 2);
                }
                this.f40128c = true;
            }
        }

        public final void onAnimationCancel(Animator animator) {
            m31122a();
        }

        public final void onAnimationEnd(Animator animator) {
            m31122a();
        }

        C16881e(AbstractC16876a aVar, AbstractC89171a aVar2) {
            this.f40126a = aVar;
            this.f40127b = aVar2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$f */
    static final class C16882f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40129a;

        static {
            Covode.recordClassIndex(19322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16882f(AbstractC16876a aVar) {
            super(0);
            this.f40129a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Window window;
            Object a;
            MethodCollector.m26663i(1741);
            Dialog dialog = this.f40129a.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                AbstractC16876a aVar = this.f40129a;
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
                Context context = aVar.getContext();
                if (context == null || (a = AbstractC16876a.m31108a(context, "input_method")) == null) {
                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(1741);
                    throw wVar;
                }
                ((InputMethodManager) a).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            AbstractC16876a.super.dismiss();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(1741);
            return zVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f40110h != null && this.f40111i != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerID", mo26670j());
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "onClosePanel");
            new Handler().postDelayed(new RunnableC16886i(this), 100);
            C89219l.m154719c(this, "");
            List<AbstractC16876a> list = f40100m;
            list.remove(this);
            AbstractC16876a aVar = (AbstractC16876a) C89070n.m154588i((List) list);
            if (aVar != null) {
                C16939c cVar = aVar.f40111i;
                if (cVar == null) {
                    C89219l.m154710a("config");
                }
                if (cVar.f40311d == 3) {
                    aVar.m31111l();
                }
            }
            f40101n.add(this);
            C16939c cVar2 = this.f40111i;
            if (cVar2 == null) {
                C89219l.m154710a("config");
            }
            if (cVar2.f40311d == 1) {
                C16939c cVar3 = this.f40111i;
                if (cVar3 == null) {
                    C89219l.m154710a("config");
                }
                AbstractC16876a a = C16877a.m31119a(cVar3.f40324q);
                if (a != null) {
                    a.m31111l();
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$j */
    static final class RunnableC16887j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40135a;

        /* renamed from: b */
        final /* synthetic */ View f40136b;

        static {
            Covode.recordClassIndex(19327);
        }

        RunnableC16887j(AbstractC16876a aVar, View view) {
            this.f40135a = aVar;
            this.f40136b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            if (r6 != 3) goto L_0x0044;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 774
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.AbstractC16876a.RunnableC16887j.run():void");
        }
    }

    /* renamed from: b */
    private final Animator.AnimatorListener m31110b(AbstractC89171a<C89391z> aVar) {
        return new C16881e(this, aVar);
    }

    /* renamed from: a */
    public final void mo26665a(EnumC16926c cVar) {
        C89219l.m154719c(cVar, "");
        this.f40116q = cVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$m */
    static final class C16890m extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40141a;

        /* renamed from: b */
        final /* synthetic */ View f40142b;

        static {
            Covode.recordClassIndex(19330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16890m(AbstractC16876a aVar, View view) {
            super(1);
            this.f40141a = aVar;
            this.f40142b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            new JSONObject().put("status", str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$l */
    static final class C16889l extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40139a;

        /* renamed from: b */
        final /* synthetic */ View f40140b;

        static {
            Covode.recordClassIndex(19329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16889l(AbstractC16876a aVar, View view) {
            super(1);
            this.f40139a = aVar;
            this.f40140b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f40139a.dismiss();
            } else {
                AbstractC89171a<C89391z> aVar = this.f40139a.f40106d;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f40139a.f40106d = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$o */
    static final class C16892o extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16876a f40145a;

        /* renamed from: b */
        final /* synthetic */ View f40146b;

        static {
            Covode.recordClassIndex(19332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16892o(AbstractC16876a aVar, View view) {
            super(1);
            this.f40145a = aVar;
            this.f40146b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f40145a.dismiss();
            } else {
                AbstractC89171a<C89391z> aVar = this.f40145a.f40106d;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f40145a.f40106d = null;
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154707a();
        }
        C89219l.m154709a((Object) context, "");
        DialogC16884h hVar = new DialogC16884h(this, context);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            hVar.setOwnerActivity(activity);
        }
        return hVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f40109g == EnumC16879c.UNKNOWN) {
            this.f40109g = EnumC16879c.TAP_MASK;
        }
        AbstractC16570e eVar = this.f40118s;
        if (eVar != null) {
            eVar.mo26332b(this);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$d */
    public static final class C16880d implements C16930a.AbstractC16931a {

        /* renamed from: a */
        final /* synthetic */ Window f40124a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16876a f40125b;

        static {
            Covode.recordClassIndex(19320);
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16930a.AbstractC16931a
        /* renamed from: a */
        public final void mo26673a(int i) {
            boolean z;
            AbstractC16915g gVar = this.f40125b.f40104b;
            boolean z2 = true;
            if (gVar != null) {
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Window window = this.f40124a;
                C89219l.m154709a((Object) window, "");
                View decorView = window.getDecorView();
                C89219l.m154709a((Object) decorView, "");
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                gVar.mo26687a(z, i, Integer.valueOf(rect.bottom));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerID", this.f40125b.mo26670j());
            if (i <= 0) {
                z2 = false;
            }
            jSONObject.put("keyboardShow", z2);
        }

        C16880d(Window window, AbstractC16876a aVar) {
            this.f40124a = window;
            this.f40125b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo26666a(AbstractC89171a<C89391z> aVar) {
        Animator animator;
        String str;
        try {
            if (this.f40107e == null || this.f40116q == EnumC16926c.NONE || this.f40113k == EnumC16925b.DONE) {
                aVar.invoke();
            } else if (this.f40114l != null) {
                StringBuilder sb = new StringBuilder("reAnimEnd with msg:");
                Throwable th = this.f40114l;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                AbstractC16576j.C16578b.m30778a(this, sb.append(str).toString(), null, "popup", 2);
                aVar.invoke();
            } else if (this.f40113k != EnumC16925b.DOING) {
                this.f40113k = EnumC16925b.DOING;
                C16883g gVar = new C16883g(this, aVar);
                int i = C16929b.f40258a[this.f40116q.ordinal()];
                if (i == 1) {
                    View view = this.f40107e;
                    if (view == null) {
                        C89219l.m154707a();
                    }
                    view.animate().translationX((float) mo26667g().getWidth()).setDuration(300).setListener(m31110b(gVar)).start();
                } else if (i == 2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(m31110b(gVar));
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(new animationInterpolatorC16924a((byte) 0));
                    Animator[] animatorArr = new Animator[1];
                    View view2 = this.f40107e;
                    float[] fArr = new float[2];
                    if (view2 == null) {
                        C89219l.m154707a();
                    }
                    fArr[0] = view2.getTranslationY();
                    fArr[1] = (float) mo26667g().getHeight();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", fArr);
                    C89219l.m154709a((Object) ofFloat, "");
                    animatorArr[0] = ofFloat;
                    List c = C89070n.m154524c(animatorArr);
                    if (mo26668h() != null) {
                        AbstractC16927d h = mo26668h();
                        if (h == null) {
                            C89219l.m154707a();
                        }
                        c.add(h.mo26754c());
                    }
                    animatorSet.playTogether(c);
                    animatorSet.start();
                } else if (i != 3) {
                    gVar.invoke();
                } else {
                    AbstractC16927d h2 = mo26668h();
                    if (h2 != null) {
                        animator = h2.mo26754c();
                    } else {
                        animator = null;
                    }
                    if (mo26668h() == null || animator == null) {
                        gVar.invoke();
                        return;
                    }
                    animator.setDuration(300);
                    animator.addListener(m31110b(gVar));
                    animator.start();
                }
            }
        } catch (Exception e) {
            AbstractC16576j.C16578b.m30778a(this, "dismiss failed with: " + e.getMessage(), null, "popup", 2);
        }
    }

    /* renamed from: a */
    public static Object m31108a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC16917i iVar;
        Dialog dialog;
        Window window;
        C89219l.m154719c(view, "");
        super.onViewCreated(view, bundle);
        if (this.f40110h == null || this.f40111i == null) {
            AbstractC16576j.C16578b.m30778a(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
            dismissAllowingStateLoss();
            return;
        }
        C16939c cVar = this.f40111i;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        this.f40108f = cVar.f40333z;
        view.post(new RunnableC16887j(this, view));
        C16939c cVar2 = this.f40111i;
        if (cVar2 == null) {
            C89219l.m154710a("config");
        }
        view.setBackgroundColor(Color.parseColor(cVar2.f40317j));
        AbstractC16927d h = mo26668h();
        if (h != null) {
            h.mo26752a();
        }
        C16939c cVar3 = this.f40111i;
        if (cVar3 == null) {
            C89219l.m154710a("config");
        }
        if (!(!cVar3.f40323p || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            C89219l.m154709a((Object) window, "");
            Context context = window.getContext();
            C89219l.m154709a((Object) context, "");
            C16930a.m31197a(window, context, new C16880d(window, this));
        }
        C16939c cVar4 = this.f40111i;
        if (cVar4 == null) {
            C89219l.m154710a("config");
        }
        int i = cVar4.f40311d;
        if (i == 0) {
            C16939c cVar5 = this.f40111i;
            if (cVar5 == null) {
                C89219l.m154710a("config");
            }
            AbstractC16876a a = C16877a.m31119a(cVar5.f40324q);
            if (!(a == null || (iVar = a.f40105c) == null)) {
                iVar.mo26691d();
            }
        } else if (i == 3) {
            C16939c cVar6 = this.f40111i;
            if (cVar6 == null) {
                C89219l.m154710a("config");
            }
            AbstractC16876a a2 = C16877a.m31119a(cVar6.f40324q);
            if (a2 != null) {
                a2.f40106d = null;
                AbstractC16917i iVar2 = a2.f40105c;
                if (iVar2 != null) {
                    iVar2.mo26692e();
                }
            }
        }
        AbstractC16570e eVar = this.f40118s;
        if (eVar != null) {
            eVar.mo26330a(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154719c(layoutInflater, "");
        return mo26667g();
    }
}
