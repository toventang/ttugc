package com.bytedance.ies.bullet.p1184ui.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16255g;
import com.bytedance.ies.bullet.p1129c.C16139a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17020d;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16718a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.d */
public final class C17031d extends AbstractC18234b implements AbstractC16576j, AbstractC17046h, AbstractC17046h.AbstractC17048b {

    /* renamed from: a */
    AbstractC17045g f40554a;

    /* renamed from: b */
    AbstractC17019c f40555b;

    /* renamed from: c */
    public AbstractC16239d.AbstractC16241b f40556c;

    /* renamed from: d */
    String f40557d;

    /* renamed from: e */
    public BulletContainerView f40558e;

    /* renamed from: j */
    private Uri f40559j;

    /* renamed from: k */
    private Bundle f40560k;

    /* renamed from: l */
    private View f40561l;

    /* renamed from: m */
    private final AbstractC89244h f40562m = C89250i.m154773a((AbstractC89171a) new C17033b(this));

    /* renamed from: n */
    private HashMap f40563n;

    static {
        Covode.recordClassIndex(19480);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f40562m.getValue();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(qVar, "");
        AbstractC16576j.C16578b.m30778a(this, "fragment onLoadParamsSuccess", null, null, 6);
        AbstractC17019c cVar = this.f40555b;
        if (cVar != null) {
            cVar.mo25854a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(iVar, "");
        AbstractC16576j.C16578b.m30778a(this, "fragment onLoadKitInstanceSuccess", null, null, 6);
        AbstractC17019c cVar = this.f40555b;
        if (cVar != null) {
            cVar.mo25855a(list, uri, iVar, z);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(iVar, "");
        AbstractC16576j.C16578b.m30778a(this, "fragment onLoadUriSuccess", null, null, 6);
        AbstractC17019c cVar = this.f40555b;
        if (cVar != null) {
            cVar.mo25853a(view, uri, iVar);
        }
    }

    /* renamed from: b */
    public final AbstractC17019c mo26909b() {
        if (this.f40555b == null) {
            AbstractC16576j.C16578b.m30778a(this, "fragment init rootContainer failed!!!", null, null, 6);
        }
        return this.f40555b;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f40563n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    private final void m31469c() {
        View view = this.f40561l;
        if (view != null) {
            BulletContainerView bulletContainerView = this.f40558e;
            if (bulletContainerView == null) {
                C89219l.m154710a("bulletContainerView");
            }
            bulletContainerView.setLoadingViewInternal$bullet_ui_common_release(view);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC17045g gVar;
        super.onDestroy();
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (gVar = this.f40554a) == null)) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26224d(activity);
        }
        mo25721a();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        AbstractC17045g gVar;
        super.onPause();
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26223c(activity);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC17045g gVar;
        super.onResume();
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26222b(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        AbstractC17045g gVar;
        super.onStart();
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26829e(activity);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        AbstractC17045g gVar;
        super.onStop();
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26830f(activity);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d$b */
    static final class C17033b extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C17031d f40568a;

        static {
            Covode.recordClassIndex(19482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17033b(C17031d dVar) {
            super(0);
            this.f40568a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            AbstractC16652m mVar;
            AbstractC16239d a;
            C16248b b;
            AbstractC16239d.AbstractC16241b bVar = this.f40568a.f40556c;
            if (bVar == null || (a = bVar.mo25656a()) == null || (b = a.mo25688b()) == null) {
                mVar = null;
            } else {
                mVar = (AbstractC16652m) b.mo25832c(AbstractC16652m.class);
            }
            return new C16587q(mVar, "Fragment");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d$a */
    public static final class C17032a {

        /* renamed from: a */
        public final C17031d f40564a;

        /* renamed from: b */
        private AbstractC16239d.AbstractC16241b f40565b;

        /* renamed from: c */
        private AbstractC17045g f40566c;

        /* renamed from: d */
        private String f40567d;

        static {
            Covode.recordClassIndex(19481);
        }

        /* renamed from: a */
        public final void mo26913a() {
            AbstractC16239d dVar;
            C16248b c;
            AbstractC17020d dVar2;
            if (this.f40565b != null && this.f40566c != null && !TextUtils.isEmpty(this.f40567d)) {
                C17031d dVar3 = this.f40564a;
                String str = this.f40567d;
                if (str == null) {
                    C89219l.m154707a();
                }
                AbstractC16239d.AbstractC16241b bVar = dVar3.f40556c;
                AbstractC17019c cVar = null;
                if (bVar != null) {
                    dVar = bVar.mo25656a();
                } else {
                    dVar = null;
                }
                if (!(dVar instanceof C16139a)) {
                    dVar = null;
                }
                C16139a aVar = (C16139a) dVar;
                if (aVar != null) {
                    AbstractC16255g gVar = aVar.f38837i.get(str);
                    if (!(gVar == null || (c = gVar.mo25844c()) == null || (dVar2 = (AbstractC17020d) c.mo25832c(AbstractC17020d.class)) == null)) {
                        cVar = dVar2.mo25662a().invoke(aVar.f38831c);
                    }
                    dVar3.f40555b = cVar;
                }
            }
        }

        public C17032a(C17031d dVar) {
            C89219l.m154719c(dVar, "");
            this.f40564a = dVar;
        }

        /* renamed from: a */
        public final C17032a mo26910a(AbstractC16239d.AbstractC16241b bVar) {
            C89219l.m154719c(bVar, "");
            this.f40565b = bVar;
            this.f40564a.mo25820a(bVar);
            return this;
        }

        /* renamed from: a */
        public final C17032a mo26911a(AbstractC17045g gVar) {
            C89219l.m154719c(gVar, "");
            this.f40566c = gVar;
            C17031d dVar = this.f40564a;
            C89219l.m154719c(gVar, "");
            dVar.f40554a = gVar;
            return this;
        }

        /* renamed from: a */
        public final C17032a mo26912a(String str) {
            C89219l.m154719c(str, "");
            this.f40567d = str;
            C17031d dVar = this.f40564a;
            C89219l.m154719c(str, "");
            dVar.f40557d = str;
            return this;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        if (this.f40558e != null) {
            BulletContainerView bulletContainerView = this.f40558e;
            if (bulletContainerView == null) {
                C89219l.m154710a("bulletContainerView");
            }
            bulletContainerView.mo25721a();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d.AbstractC16240a
    /* renamed from: a */
    public final void mo25820a(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(bVar, "");
        this.f40556c = bVar;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        BulletContainerView bulletContainerView = this.f40558e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView.mo25682a(cls);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        AbstractC17045g gVar;
        super.onActivityCreated(bundle);
        Uri uri = this.f40559j;
        if (uri != null) {
            mo26838a(uri, this.f40560k, this);
        }
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26820a(activity, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC17045g gVar;
        super.onConfigurationChanged(configuration);
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26819a(activity, configuration);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    public final void onEvent(AbstractC16191p pVar) {
        C89219l.m154719c(pVar, "");
        BulletContainerView bulletContainerView = this.f40558e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.onEvent(pVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        BulletContainerView bulletContainerView = this.f40558e;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView.mo25683a(str);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154719c(uri, "");
        AbstractC16576j.C16578b.m30778a(this, "fragment onLoadStart", null, null, 6);
        AbstractC17019c cVar = this.f40555b;
        if (cVar != null) {
            cVar.mo25851a(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(th, "");
        AbstractC16576j.C16578b.m30778a(this, "fragment onLoadFail", null, null, 6);
        AbstractC17019c cVar = this.f40555b;
        if (cVar != null) {
            cVar.mo25852a(uri, th);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC17045g gVar;
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26817a(activity, i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC17045g gVar;
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityC0945e activity = getActivity();
        if (activity != null && (gVar = this.f40554a) != null) {
            C89219l.m154709a((Object) activity, "");
            gVar.mo26818a(activity, i, strArr, iArr);
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC16741q> T mo26908a(Uri uri, Bundle bundle, T t) {
        Uri uri2;
        Uri uri3;
        C89219l.m154719c(t, "");
        C89219l.m154719c(t, "");
        if (uri != null) {
            C16718a aVar = new C16718a();
            aVar.mo26572a(Uri.class, uri, null);
            uri2 = aVar.f39907b.mo26550b();
            if (uri2 != null) {
                C16778c cVar = new C16778c();
                cVar.mo26572a(Uri.class, uri2, null);
                uri3 = cVar.f39997P.mo26550b();
            } else {
                uri3 = null;
            }
        } else {
            uri2 = null;
            uri3 = null;
        }
        if (bundle != null) {
            t.mo26572a(Bundle.class, bundle, null);
        }
        if (uri2 != null) {
            t.mo26572a(Uri.class, uri2, null);
        }
        if (uri3 != null) {
            t.mo26572a(Uri.class, uri3, null);
        }
        AbstractC17019c cVar2 = this.f40555b;
        if (cVar2 != null) {
            cVar2.mo26897a(t);
        }
        return t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(5621);
        C89219l.m154719c(layoutInflater, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            if (this.f40554a == null) {
                C89219l.m154709a((Object) activity, "");
                this.f40554a = new BulletActivityWrapper(activity);
            }
            AbstractC17019c cVar = this.f40555b;
            if (cVar != null) {
                C89219l.m154709a((Object) activity, "");
                ViewGroup a = cVar.mo26896a(activity);
                C89219l.m154709a((Object) activity, "");
                this.f40558e = new BulletContainerView(activity, null, 6, (byte) 0);
                ViewGroup a2 = cVar.mo26895a();
                BulletContainerView bulletContainerView = this.f40558e;
                if (bulletContainerView == null) {
                    C89219l.m154710a("bulletContainerView");
                }
                a2.addView(bulletContainerView);
                AbstractC17045g gVar = this.f40554a;
                if (gVar != null) {
                    gVar.mo26824a(cVar.mo26899b());
                }
                m31469c();
                MethodCollector.m26664o(5621);
                return a;
            }
        }
        View a3 = C1764a.m5927a(layoutInflater, R.layout.m6, viewGroup, false);
        BulletContainerView bulletContainerView2 = (BulletContainerView) a3.findViewById(R.id.zp);
        C89219l.m154709a((Object) bulletContainerView2, "");
        this.f40558e = bulletContainerView2;
        m31469c();
        MethodCollector.m26664o(5621);
        return a3;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public final void mo26838a(Uri uri, Bundle bundle, AbstractC17046h.AbstractC17048b bVar) {
        AbstractC17045g gVar;
        C89219l.m154719c(uri, "");
        AbstractC16239d.AbstractC16241b bVar2 = this.f40556c;
        if (bVar2 != null && (gVar = this.f40554a) != null) {
            BulletContainerView bulletContainerView = this.f40558e;
            if (bulletContainerView == null) {
                C89219l.m154710a("bulletContainerView");
            }
            AbstractC17019c cVar = this.f40555b;
            if (cVar != null) {
                bulletContainerView.getProviderFactory().mo25828a(AbstractC17019c.class, cVar);
            }
            bulletContainerView.mo25820a(bVar2);
            bulletContainerView.setActivityWrapper(gVar);
            AbstractC17019c cVar2 = this.f40555b;
            if (cVar2 != null) {
                Context context = bulletContainerView.getContext();
                C89219l.m154709a((Object) context, "");
                cVar2.mo26898b(context);
            }
            bulletContainerView.mo26837a(uri, bundle, (C16248b) null, bVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public final void mo26839a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154719c(view, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
        this.f40561l = view;
    }
}
