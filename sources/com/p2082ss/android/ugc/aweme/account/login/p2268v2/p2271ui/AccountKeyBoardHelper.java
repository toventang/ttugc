package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper */
public final class AccountKeyBoardHelper implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC33974au {

    /* renamed from: c */
    public static final AbstractC89244h f77751c = C89250i.m154774a(EnumC89331m.NONE, C32599b.f77761a);

    /* renamed from: d */
    public static final C32598a f77752d = new C32598a((byte) 0);

    /* renamed from: a */
    public AbstractC32793k f77753a;

    /* renamed from: b */
    public final Fragment f77754b;

    /* renamed from: e */
    private final AbstractC89244h f77755e = C89250i.m154773a((AbstractC89171a) new C32601d(this));

    /* renamed from: f */
    private final AbstractC89244h f77756f = C89250i.m154773a((AbstractC89171a) new C32600c(this));

    /* renamed from: g */
    private final Rect f77757g = new Rect();

    /* renamed from: h */
    private Boolean f77758h;

    /* renamed from: i */
    private boolean f77759i = true;

    /* renamed from: j */
    private final View f77760j;

    /* renamed from: a */
    public final int mo58477a() {
        return ((Number) this.f77755e.getValue()).intValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            startListen();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            stopListen();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$a */
    public static final class C32598a {
        static {
            Covode.recordClassIndex(39372);
        }

        /* renamed from: a */
        public static boolean m67091a() {
            return ((Boolean) AccountKeyBoardHelper.f77751c.getValue()).booleanValue();
        }

        private C32598a() {
        }

        public /* synthetic */ C32598a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$c */
    static final class C32600c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f77762a;

        static {
            Covode.recordClassIndex(39374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32600c(AccountKeyBoardHelper accountKeyBoardHelper) {
            super(0);
            this.f77762a = accountKeyBoardHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f77762a.mo58477a() / 3);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void startListen() {
        this.f77760j.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void stopListen() {
        this.f77760j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$b */
    static final class C32599b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C32599b f77761a = new C32599b();

        static {
            Covode.recordClassIndex(39373);
        }

        C32599b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C13628n.m24521b(C17867d.m33078a()) >= 1183) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(39371);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$d */
    static final class C32601d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f77763a;

        static {
            Covode.recordClassIndex(39375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32601d(AccountKeyBoardHelper accountKeyBoardHelper) {
            super(0);
            this.f77763a = accountKeyBoardHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Window window;
            View decorView;
            View rootView;
            ActivityC0945e activity = this.f77763a.f77754b.getActivity();
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
                i = 0;
            } else {
                i = rootView.getHeight();
            }
            return Integer.valueOf(i);
        }
    }

    public final void onGlobalLayout() {
        Window window;
        View decorView;
        boolean z = false;
        if (this.f77759i) {
            this.f77759i = false;
            return;
        }
        this.f77757g.setEmpty();
        ActivityC0945e activity = this.f77754b.getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.getWindowVisibleDisplayFrame(this.f77757g);
        }
        if (mo58477a() - this.f77757g.bottom > ((Number) this.f77756f.getValue()).intValue()) {
            z = true;
        }
        if (!C89219l.m154714a(Boolean.valueOf(z), this.f77758h)) {
            this.f77758h = Boolean.valueOf(z);
            if (z) {
                AbstractC32793k kVar = this.f77753a;
                if (kVar != null) {
                    kVar.mo58496f();
                    return;
                }
                return;
            }
            AbstractC32793k kVar2 = this.f77753a;
            if (kVar2 != null) {
                kVar2.mo58497u();
            }
        }
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        this.f77760j = view;
        this.f77754b = fragment;
        fragment.getLifecycle().mo4012a(this);
    }
}
