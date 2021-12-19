package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views.PronounsEditText;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c */
public final class ViewTreeObserver$OnGlobalLayoutListenerC63560c extends AbstractC64098cl implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC63558a {

    /* renamed from: d */
    public static final C63561a f144240d = new C63561a((byte) 0);

    /* renamed from: a */
    public String f144241a = "";

    /* renamed from: b */
    public String f144242b = "";

    /* renamed from: c */
    public AbstractC63562b f144243c;

    /* renamed from: f */
    private SparseArray f144244f;

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$b */
    public interface AbstractC63562b {
        static {
            Covode.recordClassIndex(74878);
        }

        /* renamed from: a */
        void mo102219a(String str);
    }

    static {
        Covode.recordClassIndex(74876);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public final View mo102214a(int i) {
        if (this.f144244f == null) {
            this.f144244f = new SparseArray();
        }
        View view = (View) this.f144244f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f144244f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void cj_() {
        SparseArray sparseArray = this.f144244f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    /* renamed from: d */
    public final void mo102217d() {
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cj_();
    }

    public final void onGlobalLayout() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$a */
    public static final class C63561a {
        static {
            Covode.recordClassIndex(74877);
        }

        private C63561a() {
        }

        public /* synthetic */ C63561a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo102215c() {
        m115156k();
        ch_();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C63559b mo20658e() {
        return new C63559b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63558a
    /* renamed from: b */
    public final void mo102213b() {
        ((TuxStatusView) mo102214a(R.id.da7)).setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63558a
    /* renamed from: a */
    public final void mo102210a() {
        TuxStatusView tuxStatusView = (TuxStatusView) mo102214a(R.id.da7);
        tuxStatusView.setVisibility(0);
        tuxStatusView.mo37867a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$c */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC63563c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC63560c f144245a;

        /* renamed from: b */
        final /* synthetic */ View f144246b;

        static {
            Covode.recordClassIndex(74879);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC63563c(ViewTreeObserver$OnGlobalLayoutListenerC63560c cVar, View view) {
            this.f144245a = cVar;
            this.f144246b = view;
        }

        public final void onGlobalLayout() {
            ViewTreeObserver$OnGlobalLayoutListenerC63560c cVar = this.f144245a;
            View view = this.f144246b;
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            ((AbstractC63643n) C12801d.m23017a(this.f144245a, C89204ab.m154669a(AbstractC63643n.class))).mo102233b((C34723i.m70924a(cVar.getActivity()) - C34723i.m70932e(cVar.getActivity())) - rect.bottom);
        }
    }

    /* renamed from: k */
    private final void m115156k() {
        Context context = getContext();
        if (context != null) {
            Object a = m115155a(context, "input_method");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            PronounsEditText pronounsEditText = (PronounsEditText) mo102214a(R.id.d_z);
            C89219l.m154716b(pronounsEditText, "");
            ((InputMethodManager) a).hideSoftInputFromWindow(pronounsEditText.getWindowToken(), 2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63558a
    /* renamed from: a */
    public final void mo102211a(String str) {
        C89219l.m154721d(str, "");
        mo102215c();
        AbstractC63562b bVar = this.f144243c;
        if (bVar != null) {
            bVar.mo102219a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$d */
    static final class C63564d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC63560c f144247a;

        static {
            Covode.recordClassIndex(74880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63564d(ViewTreeObserver$OnGlobalLayoutListenerC63560c cVar) {
            super(1);
            this.f144247a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.b77, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.ViewTreeObserver$OnGlobalLayoutListenerC63560c.C63564d.C635651 */

                /* renamed from: a */
                final /* synthetic */ C63564d f144248a;

                static {
                    Covode.recordClassIndex(74881);
                }

                {
                    this.f144248a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f144248a.f144247a.mo102215c();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$e */
    static final class C63566e extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC63560c f144249a;

        static {
            Covode.recordClassIndex(74882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63566e(ViewTreeObserver$OnGlobalLayoutListenerC63560c cVar) {
            super(1);
            this.f144249a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f144249a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.ViewTreeObserver$OnGlobalLayoutListenerC63560c.C63566e.C635671 */

                /* renamed from: a */
                final /* synthetic */ C63566e f144250a;

                static {
                    Covode.recordClassIndex(74883);
                }

                {
                    this.f144250a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C63570d(this.f144250a.f144249a.f144241a, this.f144250a.f144249a.f144242b));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f144249a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.ViewTreeObserver$OnGlobalLayoutListenerC63560c.C63566e.C635682 */

                /* renamed from: a */
                final /* synthetic */ C63566e f144251a;

                static {
                    Covode.recordClassIndex(74884);
                }

                {
                    this.f144251a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C63571e.class));
                    qVar2.f31050b = new C63571e();
                    qVar2.f31053e = (TuxNavBar) this.f144251a.f144249a.mo102214a(R.id.da5);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f144249a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.ViewTreeObserver$OnGlobalLayoutListenerC63560c.C63566e.C635693 */

                /* renamed from: a */
                final /* synthetic */ C63566e f144252a;

                static {
                    Covode.recordClassIndex(74885);
                }

                {
                    this.f144252a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C63603k.class));
                    qVar2.f31050b = new C63603k();
                    qVar2.f31053e = (LinearLayout) this.f144252a.f144249a.mo102214a(R.id.da6);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f144241a = String.valueOf(arguments.getString("content_name"));
            this.f144242b = String.valueOf(arguments.getString("content_value"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3573b.AbstractC63558a
    /* renamed from: a */
    public final void mo102212a(boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                C89219l.m154716b(context, "");
                C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.exo).mo37483b(R.string.exn), new C63564d(this)).mo37405a().mo37396b().show();
                return;
            }
            return;
        }
        mo102215c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C63566e(this));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC63563c(this, view));
    }

    /* renamed from: a */
    private static Object m115155a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7623);
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
                    MethodCollector.m26664o(7623);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C89219l.m154721d(layoutInflater, "");
        ActivityC0945e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C80533hg.m139603a(activity, window, true);
        return C1764a.m5927a(layoutInflater, R.layout.anc, viewGroup, false);
    }
}
