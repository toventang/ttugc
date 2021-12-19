package com.bytedance.ies.bullet.p1184ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16255g;
import com.bytedance.ies.bullet.p1129c.C16139a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17020d;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17021e;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17034a;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17035b;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17036c;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17039d;
import com.bytedance.ies.bullet.p1184ui.common.view.AutoRTLImageView;
import com.bytedance.ies.bullet.p1184ui.common.view.C17064c;
import com.bytedance.ies.bullet.service.base.AbstractC16590ab;
import com.bytedance.ies.bullet.service.base.AbstractC16647h;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16656q;
import com.bytedance.ies.bullet.service.base.AbstractC16668s;
import com.bytedance.ies.bullet.service.base.C16615b;
import com.bytedance.ies.bullet.service.base.EnumC16605al;
import com.bytedance.ies.bullet.service.base.EnumC16626c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16633c;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16718a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16735l;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16742r;
import com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a;
import com.gyf.barlibrary.ImmersionBar;
import com.p2082ss.android.ugc.trill.R;
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
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.a */
public abstract class AbstractActivityC17000a extends AbstractActivityC18232a implements AbstractC16576j, AbstractC16590ab, AbstractC17018b, AbstractC17021e, AbstractC17046h.AbstractC17048b, AbstractC17050j, AbstractC17051k {

    /* renamed from: a */
    public final AbstractC17045g f40499a = new C17001a(this, this);

    /* renamed from: b */
    public C16248b f40500b;

    /* renamed from: c */
    public Uri f40501c;

    /* renamed from: d */
    public Bundle f40502d;

    /* renamed from: e */
    protected BulletContainerView f40503e;

    /* renamed from: f */
    protected ViewGroup f40504f;

    /* renamed from: g */
    public AbstractC17019c f40505g;

    /* renamed from: h */
    public Boolean f40506h;

    /* renamed from: l */
    private String f40507l;

    /* renamed from: m */
    private View f40508m;

    /* renamed from: n */
    private AbstractC17051k.AbstractC17053b f40509n;

    /* renamed from: o */
    private C16721b f40510o = new C16721b();

    /* renamed from: p */
    private boolean f40511p;

    /* renamed from: q */
    private final AbstractC89244h f40512q = C89250i.m154773a((AbstractC89171a) new C17008h(this));

    /* renamed from: r */
    private final AbstractC89244h f40513r = C89250i.m154773a((AbstractC89171a) new C17011k(this));

    /* renamed from: s */
    private final C17036c f40514s = new C17036c();

    /* renamed from: t */
    private ImmersionBar f40515t;

    /* renamed from: u */
    private int f40516u = 1;

    /* renamed from: v */
    private HashMap f40517v;

    static {
        Covode.recordClassIndex(19449);
    }

    /* renamed from: v */
    private final AbstractC16668s mo61827v() {
        return (AbstractC16668s) this.f40513r.getValue();
    }

    /* renamed from: a */
    public View mo26864a(int i) {
        if (this.f40517v == null) {
            this.f40517v = new HashMap();
        }
        View view = (View) this.f40517v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f40517v.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public View mo26865a(ViewGroup viewGroup, Uri uri) {
        C89219l.m154719c(viewGroup, "");
        C89219l.m154719c(uri, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return (C16587q) this.f40512q.getValue();
    }

    /* renamed from: j */
    public AbstractC17051k.AbstractC17053b mo26874j() {
        return null;
    }

    /* renamed from: k */
    public View mo26875k() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
    /* renamed from: p */
    public final boolean mo26883p() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
    /* renamed from: q */
    public final boolean mo26884q() {
        return false;
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$i */
    public static final class C17009i implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40526a;

        /* renamed from: b */
        private final String f40527b = "bulletOnBackPressAction";

        /* renamed from: c */
        private final Object f40528c;

        static {
            Covode.recordClassIndex(19458);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f40527b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f40528c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17009i(AbstractActivityC17000a aVar) {
            this.f40526a = aVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerID", aVar.mo26871g().getReactId());
            this.f40528c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: d */
    public final void mo26355d() {
        finish();
    }

    /* renamed from: i */
    public CharSequence mo26873i() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25855a(java.util.List<? extends com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d<? extends android.view.View>> r10, android.net.Uri r11, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a.mo25855a(java.util.List, android.net.Uri, com.bytedance.ies.bullet.c.c.i, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.a$m */
    public static final class C17013m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16656q f40533a;

        /* renamed from: b */
        final /* synthetic */ AbstractActivityC17000a f40534b;

        /* renamed from: c */
        final /* synthetic */ BulletContainerView f40535c;

        static {
            Covode.recordClassIndex(19462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17013m(AbstractC16656q qVar, AbstractActivityC17000a aVar, BulletContainerView bulletContainerView) {
            super(0);
            this.f40533a = qVar;
            this.f40534b = aVar;
            this.f40535c = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40534b.finish();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.a$n */
    public static final class C17014n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16656q f40536a;

        /* renamed from: b */
        final /* synthetic */ AbstractActivityC17000a f40537b;

        /* renamed from: c */
        final /* synthetic */ BulletContainerView f40538c;

        static {
            Covode.recordClassIndex(19463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17014n(AbstractC16656q qVar, AbstractActivityC17000a aVar, BulletContainerView bulletContainerView) {
            super(0);
            this.f40536a = qVar;
            this.f40537b = aVar;
            this.f40538c = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f40538c.mo26842b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.a$l */
    public static final class RunnableC17012l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40532a;

        static {
            Covode.recordClassIndex(19461);
        }

        RunnableC17012l(AbstractActivityC17000a aVar) {
            this.f40532a = aVar;
        }

        public final void run() {
            this.f40532a.mo26872h().setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: e */
    public final String mo26356e() {
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView.getReactId();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final BulletContainerView mo26871g() {
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final ViewGroup mo26872h() {
        ViewGroup viewGroup = this.f40504f;
        if (viewGroup == null) {
            C89219l.m154710a("rootLayout");
        }
        return viewGroup;
    }

    /* renamed from: l */
    public boolean mo26876l() {
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.mo26846c();
        return true;
    }

    /* renamed from: m */
    public boolean mo26877m() {
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.mo26847d();
        return true;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    /* renamed from: n */
    public void mo26878n() {
        ImmersionBar immersionBar = this.f40515t;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        this.f40515t = null;
    }

    /* renamed from: o */
    public final void mo26879o() {
        m31368x();
        C17039d.m31498a(this, 0);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public void onPause() {
        super.onPause();
        this.f40499a.mo26223c(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public void onResume() {
        super.onResume();
        this.f40499a.mo26222b(this);
        m31367w();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        super.onStart();
        this.f40499a.mo26829e(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        super.onStop();
        this.f40499a.mo26830f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.a$b */
    public static final class RunnableC17002b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40519a;

        static {
            Covode.recordClassIndex(19451);
        }

        RunnableC17002b(AbstractActivityC17000a aVar) {
            this.f40519a = aVar;
        }

        public final void run() {
            this.f40519a.mo26872h().setPadding(0, C17039d.m31496a((Context) this.f40519a), 0, 0);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$h */
    static final class C17008h extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40525a;

        static {
            Covode.recordClassIndex(19457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17008h(AbstractActivityC17000a aVar) {
            super(0);
            this.f40525a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) this.f40525a.mo26917s().mo25656a().mo25688b().mo25832c(AbstractC16652m.class), "Activity");
        }
    }

    /* renamed from: x */
    private void m31368x() {
        ViewGroup viewGroup = this.f40504f;
        if (viewGroup == null) {
            C89219l.m154710a("rootLayout");
        }
        viewGroup.post(new RunnableC17012l(this));
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: a */
    public final String mo26352a() {
        String str;
        C16148a aVar = (C16148a) mo26917s().mo25656a().mo25688b().mo25832c(C16148a.class);
        if (aVar == null || (str = aVar.f38891a) == null) {
            return "default_bid";
        }
        return str;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: b */
    public final String mo26353b() {
        AbstractC16559e<String, Object> a;
        String string;
        String str = this.f40507l;
        if (str == null || (a = C16622e.C16623a.m30858a().mo26339a(str)) == null || (string = a.getString("__x_param_channel")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: c */
    public final String mo26354c() {
        AbstractC16559e<String, Object> a;
        String string;
        String str = this.f40507l;
        if (str == null || (a = C16622e.C16623a.m30858a().mo26339a(str)) == null || (string = a.getString("__x_param_bundle")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16590ab
    /* renamed from: f */
    public final Uri mo26357f() {
        if (this.f40501c == null) {
            return null;
        }
        Uri uri = this.f40501c;
        if (uri == null) {
            C89219l.m154710a("uri");
        }
        return uri;
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$k */
    static final class C17011k extends AbstractC89220m implements AbstractC89171a<AbstractC16668s> {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40531a;

        static {
            Covode.recordClassIndex(19460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17011k(AbstractActivityC17000a aVar) {
            super(0);
            this.f40531a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16668s invoke() {
            String str;
            C16148a aVar = (C16148a) this.f40531a.mo26917s().mo25656a().mo25688b().mo25832c(C16148a.class);
            if (aVar == null || (str = aVar.f38891a) == null) {
                str = "default_bid";
            }
            return C16622e.C16623a.m30858a().mo26347a(str, AbstractC16668s.class);
        }
    }

    public void finish() {
        super.finish();
        EnumC16735l b = this.f40510o.f39937m.mo26550b();
        if (b != null) {
            int i = C17016b.f40540b[b.ordinal()];
            if (i == 1) {
                super.overridePendingTransition(0, R.anim.al);
            } else if (i == 2) {
                super.overridePendingTransition(0, R.anim.an);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        if (C89219l.m154714a((Object) this.f40510o.f39949y.mo26550b(), (Object) true)) {
            onEvent(new C17009i(this));
        } else if (!this.f40499a.mo26064a(this)) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17021e
    /* renamed from: r */
    public final void mo26885r() {
        int requestedOrientation = getRequestedOrientation();
        int i = this.f40516u;
        if (requestedOrientation != i) {
            setRequestedOrientation(i);
        }
        C89219l.m154719c(this, "");
        getWindow().clearFlags(1024);
        m31367w();
        Window window = getWindow();
        C89219l.m154709a((Object) window, "");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.zq);
            if (viewGroup2 != null) {
                viewGroup.removeView(viewGroup2);
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: w */
    private final void m31367w() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        if (C17039d.m31502a()) {
            C17039d.m31500a(getWindow());
            ImmersionBar with = ImmersionBar.with(this);
            Window window = getWindow();
            C89219l.m154709a((Object) window, "");
            ImmersionBar statusBarColorInt = with.statusBarColorInt(window.getStatusBarColor());
            Boolean b = this.f40510o.f39945u.mo26550b();
            if (b != null) {
                z = b.booleanValue();
            } else {
                z = true;
            }
            ImmersionBar keyboardEnable = statusBarColorInt.keyboardEnable(z);
            keyboardEnable.init();
            this.f40515t = keyboardEnable;
            EnumC16742r b2 = this.f40510o.f39930f.mo26550b();
            if (b2 == null || (i = C17016b.f40539a[b2.ordinal()]) == 1 || i != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17039d.m31499a(this, getWindow(), z2);
            if (C89219l.m154714a((Object) this.f40510o.f39927c.mo26550b(), (Object) true)) {
                mo26879o();
            }
            if (!C89219l.m154714a((Object) this.f40510o.f39925a.mo26550b(), (Object) true) || (C17034a.m31489a(this) && !C89219l.m154714a((Object) this.f40510o.f39927c.mo26550b(), (Object) true))) {
                z3 = false;
            } else {
                z3 = true;
                C17039d.m31497a((Activity) this);
                m31368x();
            }
            if ((!C89219l.m154714a((Object) this.f40510o.f39927c.mo26550b(), (Object) true)) && !z3) {
                if (this.f40504f != null) {
                    ViewGroup viewGroup = this.f40504f;
                    if (viewGroup == null) {
                        C89219l.m154710a("rootLayout");
                    }
                    viewGroup.post(new RunnableC17002b(this));
                }
                C16746t b3 = this.f40510o.f39929e.mo26550b();
                if (b3 != null && b3.f39989a != -2) {
                    C17039d.m31498a(this, b3.f39989a);
                }
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        Object obj;
        AbstractC16668s v;
        super.onDestroy();
        C16633c a = C16633c.C16634a.m30876a();
        C89219l.m154719c(this, "");
        try {
            obj = C89379q.m157068constructorimpl(Boolean.valueOf(a.f39797a.remove(this)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        C89379q.m157071exceptionOrNullimpl(obj);
        ImmersionBar immersionBar = this.f40515t;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        C17036c cVar = this.f40514s;
        C89219l.m154719c(this, "");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = cVar.f40572b;
        if (onGlobalLayoutListener != null) {
            Window window = getWindow();
            C89219l.m154709a((Object) window, "");
            View decorView = window.getDecorView();
            C89219l.m154709a((Object) decorView, "");
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f40499a.mo26224d(this);
        if (this.f40503e != null) {
            EnumC16605al alVar = null;
            if (this.f40511p && (v = mo61827v()) != null) {
                Uri uri = this.f40501c;
                if (uri == null) {
                    C89219l.m154710a("uri");
                }
                BulletContainerView bulletContainerView = this.f40503e;
                if (bulletContainerView == null) {
                    C89219l.m154710a("bulletContainerView");
                }
                alVar = v.mo25873a(uri, bulletContainerView);
            }
            if (alVar != EnumC16605al.SUCCESS) {
                BulletContainerView bulletContainerView2 = this.f40503e;
                if (bulletContainerView2 == null) {
                    C89219l.m154710a("bulletContainerView");
                }
                bulletContainerView2.mo26848e();
                BulletContainerView bulletContainerView3 = this.f40503e;
                if (bulletContainerView3 == null) {
                    C89219l.m154710a("bulletContainerView");
                }
                bulletContainerView3.mo25721a();
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$c */
    static final class View$OnClickListenerC17003c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40520a;

        static {
            Covode.recordClassIndex(19452);
        }

        View$OnClickListenerC17003c(AbstractActivityC17000a aVar) {
            this.f40520a = aVar;
        }

        public final void onClick(View view) {
            this.f40520a.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$d */
    static final class View$OnClickListenerC17004d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40521a;

        static {
            Covode.recordClassIndex(19453);
        }

        View$OnClickListenerC17004d(AbstractActivityC17000a aVar) {
            this.f40521a = aVar;
        }

        public final void onClick(View view) {
            this.f40521a.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$e */
    static final class View$OnClickListenerC17005e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40522a;

        static {
            Covode.recordClassIndex(19454);
        }

        View$OnClickListenerC17005e(AbstractActivityC17000a aVar) {
            this.f40522a = aVar;
        }

        public final void onClick(View view) {
            this.f40522a.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$f */
    static final class View$OnClickListenerC17006f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40523a;

        static {
            Covode.recordClassIndex(19455);
        }

        View$OnClickListenerC17006f(AbstractActivityC17000a aVar) {
            this.f40523a = aVar;
        }

        public final void onClick(View view) {
            this.f40523a.finish();
        }
    }

    /* renamed from: a */
    private static Bundle m31365a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$j */
    static final class View$OnClickListenerC17010j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40529a;

        /* renamed from: b */
        final /* synthetic */ Boolean f40530b;

        static {
            Covode.recordClassIndex(19459);
        }

        View$OnClickListenerC17010j(AbstractActivityC17000a aVar, Boolean bool) {
            this.f40529a = aVar;
            this.f40530b = bool;
        }

        public final void onClick(View view) {
            this.f40529a.mo26871g().mo26842b();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        C89219l.m154719c(configuration, "");
        super.onConfigurationChanged(configuration);
        this.f40499a.mo26819a(this, configuration);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154719c(bundle, "");
        super.onRestoreInstanceState(bundle);
        this.f40499a.mo26828c(this, bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        C89219l.m154719c(bundle, "");
        super.onSaveInstanceState(bundle);
        this.f40499a.mo26826b(this, bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f40499a.mo26821a(this, z);
    }

    public final void onEvent(AbstractC16191p pVar) {
        C89219l.m154719c(pVar, "");
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.onEvent(pVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154719c(uri, "");
        AbstractC17019c cVar = this.f40505g;
        if (cVar != null) {
            cVar.mo25851a(uri);
        }
    }

    /* renamed from: b */
    public final void mo26868b(BulletContainerView bulletContainerView) {
        View k = mo26875k();
        if (k != null) {
            BulletContainerView bulletContainerView2 = this.f40503e;
            if (bulletContainerView2 == null) {
                C89219l.m154710a("bulletContainerView");
            }
            bulletContainerView2.mo26839a(k, 17, 0, 0, 0, 0);
        }
        AbstractC16656q qVar = (AbstractC16656q) C16622e.C16623a.m30858a().mo26347a(mo26352a(), AbstractC16656q.class);
        if (qVar != null) {
            AbstractC16650k a = qVar.mo26334a(this);
            if (a != null) {
                View view = a.getView();
                FrameLayout.LayoutParams d = qVar.mo26337d();
                if (d != null) {
                    bulletContainerView.mo26840a(view, d);
                } else {
                    bulletContainerView.mo26839a(view, 17, 0, 0, 0, 0);
                }
            }
            AbstractC16647h b = qVar.mo26336b(this);
            if (b != null) {
                new C17013m(qVar, this, bulletContainerView);
                new C17014n(qVar, this, bulletContainerView);
                View a2 = b.mo26407a();
                FrameLayout.LayoutParams e = qVar.mo26338e();
                if (e != null) {
                    bulletContainerView.mo26844b(a2, e);
                } else {
                    bulletContainerView.mo26844b((BulletContainerView) a2, (View) new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17021e
    public void enterFullScreen(View view) {
        C89219l.m154719c(view, "");
        this.f40516u = getRequestedOrientation();
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(11);
        C17039d.m31497a((Activity) this);
        Window window = getWindow();
        C89219l.m154709a((Object) window, "");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.zq);
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(this);
                viewGroup2.setId(R.id.zq);
                viewGroup.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup2.setVisibility(0);
            viewGroup2.addView(view, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        Object obj;
        String str2;
        boolean a;
        String str3;
        AbstractC17019c cVar;
        C16248b c;
        AbstractC17020d dVar;
        AbstractC17019c cVar2;
        C16248b c2;
        AbstractC17020d dVar2;
        Uri data;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            C89219l.m154709a((Object) data, "");
            this.f40501c = data;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle2 = m31365a(intent2);
        } else {
            bundle2 = null;
        }
        this.f40502d = bundle2;
        if (bundle2 != null) {
            str = bundle2.getString("__x_session_id");
        } else {
            str = null;
        }
        this.f40507l = str;
        if (this.f40501c == null) {
            finish();
            return;
        }
        supportRequestWindowFeature(10);
        AbstractC16239d a2 = mo26917s().mo25656a();
        if (!(a2 instanceof C16139a)) {
            a2 = null;
        }
        C16139a aVar = (C16139a) a2;
        if (aVar != null) {
            Boolean bool = this.f40506h;
            if (bool != null) {
                a = bool.booleanValue();
            } else {
                Bundle bundle3 = this.f40502d;
                if (bundle3 != null) {
                    str2 = bundle3.getString("prerender");
                } else {
                    str2 = null;
                }
                a = C89219l.m154714a((Object) str2, (Object) "1");
            }
            this.f40506h = Boolean.valueOf(a);
            Bundle bundle4 = this.f40502d;
            if (bundle4 != null) {
                str3 = bundle4.getString("reuse");
            } else {
                str3 = null;
            }
            this.f40511p = C89219l.m154714a((Object) str3, (Object) "1");
            C16718a aVar2 = new C16718a();
            Uri uri = this.f40501c;
            if (uri == null) {
                C89219l.m154710a("uri");
            }
            aVar2.mo26572a(Uri.class, uri, null);
            List<String> b = aVar2.f39906a.mo26550b();
            if (b != null) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    AbstractC16255g gVar = aVar.f38837i.get(it.next());
                    if (gVar == null || (c2 = gVar.mo25844c()) == null || (dVar2 = (AbstractC17020d) c2.mo25832c(AbstractC17020d.class)) == null || (cVar2 = dVar2.mo25662a().invoke(aVar.f38831c)) == null) {
                        cVar2 = this.f40505g;
                    }
                    this.f40505g = cVar2;
                }
            }
            if (this.f40505g == null) {
                AbstractC16255g gVar2 = aVar.f38836h;
                if (gVar2 == null || (c = gVar2.mo25844c()) == null || (dVar = (AbstractC17020d) c.mo25832c(AbstractC17020d.class)) == null) {
                    cVar = null;
                } else {
                    cVar = dVar.mo25662a().invoke(aVar.f38831c);
                }
                this.f40505g = cVar;
            }
        }
        AbstractC17019c cVar3 = this.f40505g;
        boolean z = false;
        if (cVar3 != null) {
            ViewGroup a3 = cVar3.mo26896a(this);
            setContentView(a3);
            this.f40503e = new BulletContainerView(this, null, 6, (byte) 0);
            this.f40504f = a3;
            ViewGroup a4 = cVar3.mo26895a();
            BulletContainerView bulletContainerView = this.f40503e;
            if (bulletContainerView == null) {
                C89219l.m154710a("bulletContainerView");
            }
            a4.addView(bulletContainerView);
            this.f40499a.mo26824a(cVar3.mo26899b());
            C89219l.m154719c(cVar3, "");
        }
        if (this.f40505g == null) {
            setContentView(R.layout.m2);
            BulletContainerView bulletContainerView2 = (BulletContainerView) mo26864a(R.id.zp);
            C89219l.m154709a((Object) bulletContainerView2, "");
            this.f40503e = bulletContainerView2;
            LinearLayout linearLayout = (LinearLayout) mo26864a(R.id.dnh);
            C89219l.m154709a((Object) linearLayout, "");
            this.f40504f = linearLayout;
        }
        if (this.f40503e == null) {
            AbstractC16576j.C16578b.m30778a(this, "Load uri failed: bulletContainerView has not been initialized, finish bullet activity", EnumC16586p.E, null, 4);
            finish();
        } else {
            BulletContainerView bulletContainerView3 = this.f40503e;
            if (bulletContainerView3 == null) {
                C89219l.m154710a("bulletContainerView");
            }
            C17007g gVar3 = new C17007g(this);
            AbstractC16668s v = mo61827v();
            if (v != null) {
                Uri uri2 = this.f40501c;
                if (uri2 == null) {
                    C89219l.m154710a("uri");
                }
                Boolean bool2 = this.f40506h;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                }
                C16615b a5 = v.mo25874a(uri2, z, this.f40511p, bulletContainerView3);
                if (a5 != null) {
                    View view = a5.f39770c;
                    if (view != null) {
                        gVar3.invoke(view, a5.f39771d);
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
            }
            gVar3.invoke(bulletContainerView3, EnumC16626c.NONE);
        }
        this.f40499a.mo26820a(this, bundle);
        C16633c a6 = C16633c.C16634a.m30876a();
        C89219l.m154719c(this, "");
        try {
            obj = C89379q.m157068constructorimpl(Boolean.valueOf(a6.f39797a.add(this)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        C89379q.m157071exceptionOrNullimpl(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26867a(BulletContainerView bulletContainerView) {
        C89219l.m154719c(bulletContainerView, "");
        this.f40503e = bulletContainerView;
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$a */
    public static final class C17001a extends BulletActivityWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40518a;

        static {
            Covode.recordClassIndex(19450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17001a(AbstractActivityC17000a aVar, Activity activity) {
            super(activity);
            this.f40518a = aVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$g */
    static final class C17007g extends AbstractC89220m implements AbstractC89183m<BulletContainerView, EnumC16626c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC17000a f40524a;

        static {
            Covode.recordClassIndex(19456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17007g(AbstractActivityC17000a aVar) {
            super(2);
            this.f40524a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(BulletContainerView bulletContainerView, EnumC16626c cVar) {
            C16248b bVar;
            BulletContainerView bulletContainerView2 = bulletContainerView;
            C89219l.m154719c(bulletContainerView2, "");
            C89219l.m154719c(cVar, "");
            this.f40524a.mo26867a(bulletContainerView2);
            BulletContainerView g = this.f40524a.mo26871g();
            this.f40524a.f40500b = g.getProviderFactory();
            AbstractC17019c cVar2 = this.f40524a.f40505g;
            if (cVar2 != null) {
                g.getProviderFactory().mo25828a(AbstractC17019c.class, cVar2);
            }
            g.getProviderFactory().mo25828a(AbstractC17021e.class, this.f40524a);
            g.getProviderFactory().mo25828a(AbstractC17018b.class, this.f40524a);
            g.getProviderFactory().mo25828a(EnumC16626c.class, cVar);
            g.mo26845b(this.f40524a.mo26917s());
            g.setActivityWrapper(this.f40524a.f40499a);
            this.f40524a.mo26868b(g);
            if (cVar == EnumC16626c.NONE) {
                AbstractActivityC17000a aVar = this.f40524a;
                Uri uri = aVar.f40501c;
                if (uri == null) {
                    C89219l.m154710a("uri");
                }
                AbstractC17019c cVar3 = this.f40524a.f40505g;
                if (cVar3 != null) {
                    bVar = cVar3.mo26898b(this.f40524a);
                } else {
                    bVar = null;
                }
                aVar.mo26866a(uri, bVar, this.f40524a.f40502d);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25852a(Uri uri, Throwable th) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(th, "");
        AbstractC16576j.C16578b.m30778a(this, "activity onLoadFail e: " + th.getMessage(), null, null, 6);
        AbstractC17019c cVar = this.f40505g;
        if (cVar != null) {
            cVar.mo25852a(uri, th);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f40499a.mo26817a(this, i, i2, intent);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f40499a.mo26818a(this, i, strArr, iArr);
    }

    /* renamed from: a */
    public final void mo26866a(Uri uri, C16248b bVar, Bundle bundle) {
        C89219l.m154719c(uri, "");
        if (this.f40503e == null) {
            AbstractC16576j.C16578b.m30778a(this, "Load uri inner failed: bulletContainerView has not been initialized, finish bullet activity", EnumC16586p.E, null, 4);
            finish();
            return;
        }
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.mo26837a(uri, bundle, bVar, this);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(iVar, "");
        InputMethodManager inputMethodManager = null;
        AbstractC16576j.C16578b.m30778a(this, "activity onLoadUriSuccess", null, null, 6);
        AbstractC17019c cVar = this.f40505g;
        if (cVar != null) {
            cVar.mo25853a(view, uri, iVar);
        }
        if (!C89219l.m154714a(this.f40510o.f39940p.mo26550b(), (Object) true)) {
            return;
        }
        if (this.f40503e == null) {
            AbstractC16576j.C16578b.m30778a(this, "show soft key board failed! bullet container view hasn't been initialized!", null, null, 6);
            return;
        }
        BulletContainerView bulletContainerView = this.f40503e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        C89219l.m154719c(bulletContainerView, "");
        bulletContainerView.requestFocus();
        Object a = C17036c.m31495a(bulletContainerView.getContext(), "input_method");
        if (a instanceof InputMethodManager) {
            inputMethodManager = a;
        }
        InputMethodManager inputMethodManager2 = inputMethodManager;
        if (inputMethodManager2 != null) {
            inputMethodManager2.toggleSoftInput(0, 2);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(qVar, "");
        if (qVar instanceof C16721b) {
            C16721b bVar = (C16721b) qVar;
            this.f40510o = bVar;
            C17035b.m31493a(bVar);
            C17035b.m31494b(this.f40510o);
            if (C89219l.m154714a((Object) this.f40510o.f39915F.mo26550b(), (Object) true)) {
                super.overridePendingTransition(R.anim.am, 0);
            }
            if (C89219l.m154714a((Object) this.f40510o.f39944t.mo26550b(), (Object) true)) {
                getWindow().setSoftInputMode(32);
            }
            C16746t b = this.f40510o.f39935k.mo26550b();
            if (b != null) {
                Integer valueOf = Integer.valueOf(b.f39989a);
                if (!(valueOf.intValue() == -2 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup = this.f40504f;
                    if (viewGroup == null) {
                        C89219l.m154710a("rootLayout");
                    }
                    viewGroup.setBackgroundColor(intValue);
                }
            }
            C16746t b2 = this.f40510o.f39936l.mo26550b();
            if (b2 != null) {
                Integer valueOf2 = Integer.valueOf(b2.f39989a);
                if (!(valueOf2.intValue() == -2 || valueOf2 == null)) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup2 = this.f40504f;
                    if (viewGroup2 == null) {
                        C89219l.m154710a("rootLayout");
                    }
                    viewGroup2.setBackgroundColor(intValue2);
                }
            }
            if (this.f40505g == null) {
                if (C89219l.m154714a((Object) this.f40510o.f39926b.mo26550b(), (Object) true)) {
                    FrameLayout frameLayout = (FrameLayout) mo26864a(R.id.ej3);
                    C89219l.m154709a((Object) frameLayout, "");
                    frameLayout.setVisibility(8);
                } else {
                    if (this.f40508m == null) {
                        FrameLayout frameLayout2 = (FrameLayout) mo26864a(R.id.ej3);
                        C89219l.m154709a((Object) frameLayout2, "");
                        Uri uri2 = this.f40501c;
                        if (uri2 == null) {
                            C89219l.m154710a("uri");
                        }
                        this.f40508m = mo26865a(frameLayout2, uri2);
                    }
                    if (this.f40508m == null) {
                        AbstractC17051k.AbstractC17053b j = mo26874j();
                        this.f40509n = j;
                        if (j == null) {
                            C17064c cVar = new C17064c(this, (byte) 0);
                            C16721b bVar2 = this.f40510o;
                            if (bVar2 != null) {
                                C16746t b3 = bVar2.f39928d.mo26550b();
                                if (!(b3 == null || b3.f39989a == -2)) {
                                    ((FrameLayout) cVar.mo26937a(R.id.ejs)).setBackgroundColor(b3.f39989a);
                                }
                                TextView textView = (TextView) cVar.mo26937a(R.id.f63);
                                C89219l.m154709a((Object) textView, "");
                                String b4 = bVar2.f39931g.mo26550b();
                                if (b4 == null) {
                                    b4 = "";
                                }
                                textView.setText(b4);
                                C16746t b5 = bVar2.f39932h.mo26550b();
                                if (!(b5 == null || b5.f39989a == -2)) {
                                    ((TextView) cVar.mo26937a(R.id.f63)).setTextColor(b5.f39989a);
                                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) cVar.mo26937a(R.id.bsy);
                                    Context context = cVar.getContext();
                                    C89219l.m154709a((Object) context, "");
                                    Resources resources = context.getResources();
                                    Context context2 = cVar.getContext();
                                    C89219l.m154709a((Object) context2, "");
                                    C1261i a = C1261i.m4015a(resources, R.drawable.ajd, context2.getTheme());
                                    if (a != null) {
                                        a.setTint(b5.f39989a);
                                    } else {
                                        a = null;
                                    }
                                    autoRTLImageView.setImageDrawable(a);
                                }
                                if (C89219l.m154714a((Object) bVar2.f39943s.mo26550b(), (Object) true)) {
                                    AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) cVar.mo26937a(R.id.bu6);
                                    C89219l.m154709a((Object) autoRTLImageView2, "");
                                    autoRTLImageView2.setVisibility(0);
                                }
                            }
                            cVar.setTitleIfMissing(mo26873i());
                            cVar.setBackListener(new View$OnClickListenerC17003c(this));
                            cVar.setCloseAllListener(new View$OnClickListenerC17004d(this));
                            this.f40508m = cVar;
                            ((FrameLayout) mo26864a(R.id.ej3)).addView(this.f40508m, -1, -2);
                        } else {
                            FrameLayout frameLayout3 = (FrameLayout) mo26864a(R.id.ej3);
                            Uri uri3 = this.f40501c;
                            if (uri3 == null) {
                                C89219l.m154710a("uri");
                            }
                            frameLayout3.addView(j.mo26927a(this, uri3, this.f40510o), -1, -2);
                            j.mo26929a(mo26873i());
                            j.mo26928a(new View$OnClickListenerC17005e(this));
                            j.mo26930b(new View$OnClickListenerC17006f(this));
                            C16248b bVar3 = this.f40500b;
                            if (bVar3 != null) {
                                bVar3.mo25831b(AbstractC17051k.AbstractC17053b.class, this.f40509n);
                            }
                        }
                    } else {
                        FrameLayout frameLayout4 = (FrameLayout) mo26864a(R.id.ej3);
                        C89219l.m154709a((Object) frameLayout4, "");
                        if (frameLayout4.getChildCount() == 0) {
                            ((FrameLayout) mo26864a(R.id.ej3)).addView(this.f40508m, -1, -2);
                        }
                    }
                    FrameLayout frameLayout5 = (FrameLayout) mo26864a(R.id.ej3);
                    C89219l.m154709a((Object) frameLayout5, "");
                    frameLayout5.setVisibility(0);
                }
            }
            m31367w();
        }
        AbstractC17019c cVar2 = this.f40505g;
        if (cVar2 != null) {
            cVar2.mo25854a(iVar, uri, qVar);
        }
    }
}
