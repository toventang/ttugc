package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16255g;
import com.bytedance.ies.bullet.p1129c.C16139a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17020d;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a.C35216a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33118a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView */
public final class CommonBizWebView extends BulletContainerView implements AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C35199a f83122m = new C35199a((byte) 0);

    /* renamed from: l */
    public SSWebView f83123l;

    /* renamed from: n */
    private C35216a f83124n;

    /* renamed from: o */
    private AbstractC35200b f83125o;

    /* renamed from: p */
    private C35222b f83126p;

    /* renamed from: q */
    private Activity f83127q;

    /* renamed from: r */
    private AbstractC16239d.AbstractC16241b f83128r;

    /* renamed from: s */
    private AbstractC1204m f83129s;

    /* renamed from: t */
    private Map<String, String> f83130t;

    /* renamed from: u */
    private View f83131u;

    /* renamed from: v */
    private String f83132v;

    /* renamed from: w */
    private HashMap f83133w;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$b */
    public interface AbstractC35200b {
        static {
            Covode.recordClassIndex(42362);
        }

        /* renamed from: a */
        void mo62078a(int i, int i2);
    }

    static {
        Covode.recordClassIndex(42360);
    }

    public CommonBizWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    /* renamed from: f */
    public final View mo26849f() {
        if (this.f83133w == null) {
            this.f83133w = new HashMap();
        }
        View view = (View) this.f83133w.get(Integer.valueOf((int) R.id.zn));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.zn);
        this.f83133w.put(Integer.valueOf((int) R.id.zn), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(42, new RunnableC90250g(CommonBizWebView.class, "onJsBroadcast", C33118a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$a */
    public static final class C35199a {
        static {
            Covode.recordClassIndex(42361);
        }

        private C35199a() {
        }

        public /* synthetic */ C35199a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$c */
    public static final class C35201c implements AbstractC16191p {

        /* renamed from: a */
        final /* synthetic */ JSONObject f83134a;

        /* renamed from: b */
        private final String f83135b = "notification";

        /* renamed from: c */
        private final Object f83136c;

        static {
            Covode.recordClassIndex(42363);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f83135b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final Object mo25700b() {
            return this.f83136c;
        }

        C35201c(JSONObject jSONObject) {
            this.f83134a = jSONObject;
            this.f83136c = jSONObject;
        }
    }

    public final Activity getActivity() {
        return this.f83127q;
    }

    public final C35222b getRootContainer() {
        return this.f83126p;
    }

    public final AbstractC35200b getScrollListener() {
        return this.f83125o;
    }

    public final SSWebView getWebView() {
        return this.f83123l;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        super.mo25855a(list, uri, iVar, z);
        if (iVar instanceof AbstractC16494c) {
            AbstractC16494c cVar = (AbstractC16494c) iVar;
            cVar.mo26208a(this.f83130t);
            WebView n = cVar.mo26210n();
            SSWebView sSWebView = null;
            if (!(n instanceof SSWebView)) {
                n = null;
            }
            SSWebView sSWebView2 = (SSWebView) n;
            if (sSWebView2 != null) {
                sSWebView2.setWebScrollListener(new C35202d(this));
                C35216a aVar = new C35216a(sSWebView2, (byte) 0);
                this.f83124n = aVar;
                sSWebView2.setWebViewEventDelegate(aVar);
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a = C33113b.m67826a();
                if (a != null) {
                    a.mo58952c(this.f83126p, sSWebView2);
                }
                sSWebView = sSWebView2;
            }
            this.f83123l = sSWebView;
        }
    }

    /* renamed from: g */
    public final void mo62062g() {
        SSWebView sSWebView = this.f83123l;
        if (sSWebView != null && sSWebView.mo26120b()) {
            sSWebView.goBack();
        }
    }

    /* renamed from: h */
    public final boolean mo62067h() {
        SSWebView sSWebView = this.f83123l;
        if (sSWebView != null) {
            return sSWebView.mo26120b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a, com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    /* renamed from: a */
    public final void mo25721a() {
        AbstractC17017a aVar;
        super.mo25721a();
        AbstractC1204m mVar = this.f83129s;
        if (mVar != null) {
            C35222b bVar = this.f83126p;
            if (bVar != null) {
                aVar = bVar.mo26899b();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof CommonBizActivityDelegate)) {
                aVar = null;
            }
            CommonBizActivityDelegate commonBizActivityDelegate = (CommonBizActivityDelegate) aVar;
            if (commonBizActivityDelegate != null) {
                mVar.getLifecycle().mo4013b(commonBizActivityDelegate);
                commonBizActivityDelegate.f83121b = null;
            }
        }
    }

    public final void setActivity(Activity activity) {
        this.f83127q = activity;
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
        setAutoReleasableWhenDetached(z);
    }

    public final void setRootContainer(C35222b bVar) {
        this.f83126p = bVar;
    }

    public final void setScrollListener(AbstractC35200b bVar) {
        this.f83125o = bVar;
    }

    public final void setWebView(SSWebView sSWebView) {
        this.f83123l = sSWebView;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$d */
    public static final class C35202d implements SSWebView.AbstractC16469b {

        /* renamed from: a */
        final /* synthetic */ CommonBizWebView f83137a;

        static {
            Covode.recordClassIndex(42364);
        }

        C35202d(CommonBizWebView commonBizWebView) {
            this.f83137a = commonBizWebView;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16469b
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            AbstractC35200b scrollListener = this.f83137a.getScrollListener();
            if (scrollListener != null) {
                scrollListener.mo62078a(i2, i4);
            }
        }
    }

    public final void setCanScrollVertically(boolean z) {
        C35216a aVar = this.f83124n;
        if (aVar != null) {
            aVar.f83184b = z;
        }
    }

    public final void setEnableScrollControl(boolean z) {
        C35216a aVar = this.f83124n;
        if (aVar != null) {
            aVar.f83185c = z;
        }
    }

    public final void setOutTouchDelegate(View.OnTouchListener onTouchListener) {
        C35216a aVar = this.f83124n;
        if (aVar != null) {
            aVar.f83186d = onTouchListener;
        }
    }

    @AbstractC90264r
    public final void onJsBroadcast(C33118a aVar) {
        C89219l.m154721d(aVar, "");
        C35216a aVar2 = this.f83124n;
        if (aVar2 != null) {
            aVar2.mo62106a(aVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d.AbstractC16240a, com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    /* renamed from: a */
    public final void mo25820a(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo25820a(bVar);
        this.f83128r = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m72053a(CommonBizWebView commonBizWebView, Uri uri) {
        C89219l.m154721d(uri, "");
        if (!C89219l.m154714a((Object) commonBizWebView.f83132v, (Object) uri.toString())) {
            commonBizWebView.f83132v = uri.toString();
            commonBizWebView.mo26838a(uri, (Bundle) null, (AbstractC17046h.AbstractC17048b) null);
        }
    }

    /* renamed from: a */
    public final void mo62061a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (getReactId().length() > 0) {
            jSONObject2.put("reactId", getReactId());
        }
        jSONObject2.put("data", jSONObject);
        onEvent(new C35201c(jSONObject2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonBizWebView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setAutoReleasableWhenDetached(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonBizWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.BulletContainerView, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public final void mo26838a(Uri uri, Bundle bundle, AbstractC17046h.AbstractC17048b bVar) {
        C89219l.m154721d(uri, "");
        if (this.f83131u == null) {
            IBulletService f = BulletService.m71938f();
            Context context = getContext();
            C89219l.m154716b(context, "");
            View a = f.mo61849a(context);
            mo26839a(a, 17, 0, 0, 0, 0);
            this.f83131u = a;
        }
        super.mo26838a(uri, bundle, bVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.BulletContainerView
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        super.mo25854a(iVar, uri, qVar);
        C35222b bVar = this.f83126p;
        if (bVar != null) {
            bVar.mo25854a(iVar, uri, qVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m72054a(CommonBizWebView commonBizWebView, Uri uri, Map map, Bundle bundle) {
        C89219l.m154721d(uri, "");
        commonBizWebView.f83130t = map;
        commonBizWebView.mo26838a(uri, bundle, (AbstractC17046h.AbstractC17048b) null);
    }

    /* renamed from: a */
    public final void mo62060a(AbstractC16239d.AbstractC16241b bVar, C16481e eVar, AbstractC17045g gVar, AbstractC1204m mVar, String str) {
        AbstractC17019c cVar;
        C16248b c;
        AbstractC17020d dVar;
        C89219l.m154721d(bVar, "");
        mo25820a(bVar);
        AbstractC16239d a = bVar.mo25656a();
        CommonBizActivityDelegate commonBizActivityDelegate = null;
        if (!(a instanceof C16139a)) {
            a = null;
        }
        C16139a aVar = (C16139a) a;
        if (aVar != null) {
            AbstractC16255g gVar2 = aVar.f38837i.get(str);
            if (gVar2 == null || (c = gVar2.mo25844c()) == null || (dVar = (AbstractC17020d) c.mo25832c(AbstractC17020d.class)) == null) {
                cVar = null;
            } else {
                cVar = dVar.mo25662a().invoke(aVar.f38831c);
            }
            if (!(cVar instanceof C35222b)) {
                cVar = null;
            }
            C35222b bVar2 = (C35222b) cVar;
            this.f83126p = bVar2;
            if (bVar2 != null) {
                bVar2.f83163x = eVar;
            }
        }
        this.f83129s = mVar;
        setActivityWrapper(gVar);
        Activity a2 = gVar.mo26816a();
        if (a2 != null) {
            if ((a2 instanceof AbstractC1204m) && this.f83129s == null) {
                this.f83129s = (AbstractC1204m) a2;
            }
            C35222b bVar3 = this.f83126p;
            if (bVar3 != null) {
                C89219l.m154721d(a2, "");
                bVar3.f83157r = a2;
                bVar3.f83165z.mo61973a(a2);
            }
        } else {
            a2 = null;
        }
        this.f83127q = a2;
        C35222b bVar4 = this.f83126p;
        if (bVar4 != null) {
            getProviderFactory().mo25828a(AbstractC17019c.class, bVar4);
        }
        C35222b bVar5 = this.f83126p;
        if (bVar5 != null) {
            AbstractC17017a b = bVar5.mo26899b();
            AbstractC1204m mVar2 = this.f83129s;
            if (mVar2 != null) {
                if (b instanceof CommonBizActivityDelegate) {
                    commonBizActivityDelegate = b;
                }
                CommonBizActivityDelegate commonBizActivityDelegate2 = commonBizActivityDelegate;
                if (commonBizActivityDelegate2 != null) {
                    commonBizActivityDelegate2.f83121b = this.f83127q;
                    mVar2.getLifecycle().mo4012a((AbstractC1203l) b);
                }
            }
            gVar.mo26824a(b);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.BulletContainerView, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public final void mo26839a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(view, "");
        this.f83131u = view;
        super.mo26839a(view, i, i2, i3, i4, i5);
    }
}
