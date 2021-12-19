package com.bytedance.ies.bullet.p1184ui.common;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.C16257i;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16149b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16197b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16202c;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1139f.AbstractC16254a;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17035b;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17040e;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.AbstractC16699y;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16583n;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16639c;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView */
public class BulletContainerView extends FrameLayout implements AbstractC16576j, AbstractC17046h, AbstractC17046h.AbstractC17048b {

    /* renamed from: a */
    public AbstractC17046h.AbstractC17048b f40455a;

    /* renamed from: b */
    public AbstractC16208i f40456b;

    /* renamed from: c */
    public boolean f40457c;

    /* renamed from: d */
    public View f40458d;

    /* renamed from: e */
    public Timer f40459e;

    /* renamed from: f */
    public TimerTask f40460f;

    /* renamed from: g */
    public boolean f40461g;

    /* renamed from: h */
    public boolean f40462h;

    /* renamed from: i */
    public C16149b f40463i;

    /* renamed from: j */
    public AbstractC16652m f40464j;

    /* renamed from: k */
    public final AtomicInteger f40465k;

    /* renamed from: l */
    private final AbstractC17049i f40466l;

    /* renamed from: m */
    private List<? extends C17029d<? extends View>> f40467m;

    /* renamed from: n */
    private long f40468n;

    /* renamed from: o */
    private View f40469o;

    /* renamed from: p */
    private Uri f40470p;

    /* renamed from: q */
    private C16721b f40471q;

    /* renamed from: r */
    private String f40472r;

    /* renamed from: s */
    private String f40473s;

    /* renamed from: t */
    private boolean f40474t;

    /* renamed from: u */
    private long f40475u;

    /* renamed from: v */
    private final AbstractC89244h f40476v;

    /* renamed from: w */
    private HashMap f40477w;

    static {
        Covode.recordClassIndex(19434);
    }

    public BulletContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* renamed from: f */
    public View mo26849f() {
        if (this.f40477w == null) {
            this.f40477w = new HashMap();
        }
        View view = (View) this.f40477w.get(Integer.valueOf((int) R.id.zn));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.zn);
        this.f40477w.put(Integer.valueOf((int) R.id.zn), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return (C16587q) this.f40476v.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$a */
    public static final class C16987a implements AbstractC16254a<Bundle> {

        /* renamed from: a */
        public final Bundle f40478a;

        /* renamed from: b */
        final /* synthetic */ BulletContainerView f40479b;

        /* renamed from: c */
        final /* synthetic */ Bundle f40480c;

        static {
            Covode.recordClassIndex(19435);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1139f.AbstractC16254a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Bundle mo25838a() {
            return this.f40478a;
        }

        C16987a(BulletContainerView bulletContainerView, Bundle bundle) {
            this.f40479b = bulletContainerView;
            this.f40480c = bundle;
            this.f40478a = bundle;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1139f.AbstractC16254a
        /* renamed from: a */
        public final void mo25839a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(qVar, "");
            this.f40479b.mo25854a(iVar, uri, qVar);
            AbstractC17046h.AbstractC17048b bVar = this.f40479b.f40455a;
            if (bVar != null) {
                bVar.mo25854a(iVar, uri, qVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d.AbstractC16240a
    /* renamed from: a */
    public void mo25820a(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(bVar, "");
        this.f40474t = false;
        this.f40466l.mo25820a(bVar);
        C16248b b = bVar.mo25656a().mo25688b();
        C16148a aVar = (C16148a) b.mo25832c(C16148a.class);
        if (aVar != null) {
            this.f40463i = aVar.f38892b;
            this.f40472r = aVar.f38891a;
        }
        AbstractC16652m mVar = (AbstractC16652m) b.mo25832c(AbstractC16652m.class);
        if (mVar != null) {
            this.f40464j = mVar;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public void mo26838a(Uri uri, Bundle bundle, AbstractC17046h.AbstractC17048b bVar) {
        C89219l.m154719c(uri, "");
        m31326a(bundle);
        m31332b(uri, bundle, bVar);
        m31331b(uri);
    }

    /* renamed from: a */
    public final void mo26837a(Uri uri, Bundle bundle, C16248b bVar, AbstractC17046h.AbstractC17048b bVar2) {
        C89219l.m154719c(uri, "");
        m31326a(bundle);
        m31332b(uri, bundle, bVar2);
        if (bVar != null) {
            getProviderFactory().mo25825a(bVar);
        }
        m31331b(uri);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        AbstractC16725d<C16746t> dVar;
        C16746t b;
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(qVar, "");
        AbstractC16576j.C16578b.m30778a(this, "view onLoadParamsSuccess", null, null, 6);
        if (!(qVar instanceof C16721b)) {
            qVar = null;
        }
        C16721b bVar = (C16721b) qVar;
        if (bVar != null) {
            C17035b.m31493a(bVar);
            C17035b.m31494b(bVar);
            this.f40471q = bVar;
            if (C89219l.m154714a((Object) bVar.f39938n.mo26550b(), (Object) true)) {
                this.f40461g = false;
                Boolean b2 = bVar.f39938n.mo26550b();
                if (b2 == null) {
                    C89219l.m154707a();
                }
                m31329a(b2.booleanValue(), 0);
            } else {
                View view = this.f40458d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            C16721b bVar2 = this.f40471q;
            if (bVar2 != null && (dVar = bVar2.f39935k) != null && (b = dVar.mo26550b()) != null && b.f39989a != -2) {
                setBackgroundColor(b.f39989a);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(iVar, "");
        AbstractC16576j.C16578b.m30778a(this, "view onLoadKitInstanceSuccess kit: " + iVar.mo25769b(), null, null, 6);
        this.f40456b = iVar;
        this.f40467m = list;
        m31328a(list, new C16996h(this, iVar));
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(iVar, "");
        AbstractC16576j.C16578b.m30778a(this, "view onLoadUriSuccess kit: " + iVar.mo25769b() + " uri=" + uri, null, null, 6);
        this.f40465k.getAndSet(EnumC17055m.SUCCESS.ordinal());
        this.f40461g = true;
        TimerTask timerTask = this.f40460f;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f40459e;
        if (timer != null) {
            timer.cancel();
        }
        View view2 = this.f40458d;
        if (!(view2 instanceof AbstractC16650k)) {
            view2 = null;
        }
        AbstractC16650k kVar = (AbstractC16650k) view2;
        if (kVar != null) {
            kVar.mo26413b();
        }
        View view3 = this.f40469o;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        m31330a(true, (Throwable) null);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        AbstractC16725d<Boolean> dVar;
        Boolean b;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(th, "");
        AbstractC16576j.C16578b.m30778a(this, "view onLoadFail e: " + th.getMessage(), null, null, 6);
        this.f40465k.getAndSet(EnumC17055m.FAIL.ordinal());
        this.f40461g = true;
        TimerTask timerTask = this.f40460f;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f40459e;
        if (timer != null) {
            timer.cancel();
        }
        View view = this.f40458d;
        if (!(view instanceof AbstractC16650k)) {
            view = null;
        }
        AbstractC16650k kVar = (AbstractC16650k) view;
        if (kVar != null) {
            kVar.mo26413b();
        }
        C16721b bVar = this.f40471q;
        if (!(bVar == null || (dVar = bVar.f39939o) == null || (b = dVar.mo26550b()) == null || !b.booleanValue())) {
            b.booleanValue();
            View view2 = this.f40469o;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        m31330a(false, th);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    /* renamed from: a */
    public void mo26839a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154719c(view, "");
        View view2 = this.f40458d;
        if (view2 != null) {
            removeView(view2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.f40458d = view;
    }

    /* renamed from: a */
    public final void mo26840a(View view, FrameLayout.LayoutParams layoutParams) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(layoutParams, "");
        View view2 = this.f40458d;
        if (view2 != null) {
            removeView(view2);
        }
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.f40458d = view;
    }

    /* renamed from: a */
    public final void mo26841a(C16248b bVar, AbstractC17046h.AbstractC17048b bVar2) {
        List<? extends C17029d<? extends View>> list;
        AbstractC16576j.C16578b.m30778a(this, "reload " + this.f40470p, null, null, 6);
        if (this.f40470p != null && this.f40456b != null && (list = this.f40467m) != null && !list.isEmpty()) {
            this.f40455a = bVar2;
            if (bVar2 != null) {
                Uri uri = this.f40470p;
                if (uri == null) {
                    C89219l.m154707a();
                }
                bVar2.mo25851a(uri);
            }
            this.f40466l.mo26916b().mo25825a(bVar);
            mo62062g();
            AbstractC16208i iVar = this.f40456b;
            if (iVar == null) {
                C89219l.m154707a();
            }
            iVar.mo25777l();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$g */
    static final class C16995g extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40491a;

        static {
            Covode.recordClassIndex(19443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16995g(BulletContainerView bulletContainerView) {
            super(0);
            this.f40491a = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q(this.f40491a.f40464j, "View");
        }
    }

    /* renamed from: g */
    private final void mo62062g() {
        List<? extends C17029d<? extends View>> list = this.f40467m;
        if (list != null) {
            m31328a(list, new C16998i(this));
        }
    }

    /* renamed from: c */
    public final void mo26846c() {
        View view = this.f40458d;
        if (!(view instanceof AbstractC16650k)) {
            view = null;
        }
        AbstractC16650k kVar = (AbstractC16650k) view;
        if (kVar != null) {
            kVar.mo26412a();
        }
    }

    /* renamed from: d */
    public final void mo26847d() {
        View view = this.f40458d;
        if (!(view instanceof AbstractC16650k)) {
            view = null;
        }
        AbstractC16650k kVar = (AbstractC16650k) view;
        if (kVar != null) {
            kVar.mo26413b();
        }
    }

    public C16248b getProviderFactory() {
        C16248b b = this.f40466l.mo26916b();
        b.mo25828a(BulletContainerView.class, this);
        return b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo26848e();
        if (this.f40462h) {
            mo25721a();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$b */
    public static final class C16988b extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40481a;

        /* renamed from: b */
        final /* synthetic */ long f40482b;

        static {
            Covode.recordClassIndex(19436);
        }

        public final void run() {
            Activity a = C17040e.m31504a((Context) this.f40481a.getProviderFactory().mo25832c(Context.class));
            if (a instanceof Activity) {
                a.runOnUiThread(new RunnableC16989a(this));
            }
        }

        /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$b$a */
        static final class RunnableC16989a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C16988b f40483a;

            static {
                Covode.recordClassIndex(19437);
            }

            RunnableC16989a(C16988b bVar) {
                this.f40483a = bVar;
            }

            public final void run() {
                View view;
                AbstractC16650k kVar = null;
                this.f40483a.f40481a.f40459e = null;
                this.f40483a.f40481a.f40460f = null;
                if (!this.f40483a.f40481a.f40461g) {
                    View view2 = this.f40483a.f40481a.f40458d;
                    if (!(view2 instanceof AbstractC16650k)) {
                        view2 = null;
                    }
                    AbstractC16650k kVar2 = (AbstractC16650k) view2;
                    if (kVar2 != null) {
                        kVar2.mo26412a();
                    }
                    if (this.f40483a.f40482b != 0) {
                        View view3 = this.f40483a.f40481a.f40458d;
                        if (view3 instanceof AbstractC16650k) {
                            kVar = view3;
                        }
                        AbstractC16650k kVar3 = kVar;
                        if (kVar3 != null && (view = kVar3.getView()) != null) {
                            view.postDelayed(new Runnable(this) {
                                /* class com.bytedance.ies.bullet.p1184ui.common.BulletContainerView.C16988b.RunnableC16989a.RunnableC169901 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC16989a f40484a;

                                static {
                                    Covode.recordClassIndex(19438);
                                }

                                {
                                    this.f40484a = r1;
                                }

                                public final void run() {
                                    View view = this.f40484a.f40483a.f40481a.f40458d;
                                    if (!(view instanceof AbstractC16650k)) {
                                        view = null;
                                    }
                                    AbstractC16650k kVar = (AbstractC16650k) view;
                                    if (kVar != null) {
                                        kVar.mo26413b();
                                    }
                                }
                            }, this.f40483a.f40482b);
                        }
                    }
                }
            }
        }

        C16988b(BulletContainerView bulletContainerView, long j) {
            this.f40481a = bulletContainerView;
            this.f40482b = j;
        }
    }

    /* renamed from: h */
    private boolean mo62067h() {
        if (this.f40465k.get() == EnumC17055m.LOADING.ordinal()) {
            return true;
        }
        return false;
    }

    public String getReactId() {
        C16238z a;
        String str;
        AbstractC16208i iVar = this.f40456b;
        if (iVar == null || (a = iVar.mo25762a()) == null || (str = a.f39033a) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final void mo26842b() {
        Uri uri;
        AbstractC16576j.C16578b.m30778a(this, "reLoadUri " + this.f40470p, null, null, 6);
        if (!mo62067h() && (uri = this.f40470p) != null) {
            AbstractC17046h.AbstractC17048b bVar = this.f40455a;
            if (bVar != null) {
                bVar.mo25851a(uri);
            }
            mo62062g();
            m31331b(uri);
        }
    }

    /* renamed from: e */
    public final void mo26848e() {
        String str;
        if (!this.f40474t) {
            long currentTimeMillis = System.currentTimeMillis() - this.f40475u;
            int i = this.f40465k.get();
            if (i == EnumC17055m.SUCCESS.ordinal()) {
                str = "success";
            } else if (i == EnumC17055m.FAIL.ordinal()) {
                str = "failure";
            } else {
                str = "cancel";
            }
            AbstractC16654o oVar = (AbstractC16654o) getProviderFactory().mo25832c(AbstractC16654o.class);
            if (oVar != null) {
                C16607an anVar = new C16607an("bdx_monitor_container_exit", null, null, 254);
                anVar.f39738c = (AbstractC16640d) getProviderFactory().mo25832c(AbstractC16640d.class);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", str);
                anVar.f39742g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("stay_duration", currentTimeMillis);
                anVar.f39743h = jSONObject2;
                oVar.mo26319a(anVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public void mo25721a() {
        AbstractC16576j.C16578b.m30778a(this, "view release", null, null, 6);
        this.f40466l.mo25721a();
        getProviderFactory().mo25832c(AbstractC16197b.class);
        getProviderFactory().mo25826a(AbstractC17045g.class);
        getProviderFactory().mo25826a(AbstractC16254a.class);
        getProviderFactory().mo25826a(AbstractC16197b.class);
        View view = this.f40458d;
        if (view instanceof AbstractC16246a) {
            if (view != null) {
                ((AbstractC16246a) view).mo25721a();
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        View view2 = this.f40469o;
        if (view2 instanceof AbstractC16246a) {
            if (view2 != null) {
                ((AbstractC16246a) view2).mo25721a();
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        this.f40455a = null;
        this.f40474t = true;
    }

    public final void setAutoReleasableWhenDetached(boolean z) {
        this.f40462h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$h */
    public static final class C16996h extends AbstractC89220m implements AbstractC89172b<C17029d<View>, C169971> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40492a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16208i f40493b;

        static {
            Covode.recordClassIndex(19444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16996h(BulletContainerView bulletContainerView, AbstractC16208i iVar) {
            super(1);
            this.f40492a = bulletContainerView;
            this.f40493b = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C169971 invoke(C17029d<View> dVar) {
            final C17029d<View> dVar2 = dVar;
            C89219l.m154719c(dVar2, "");
            return new AbstractC17030e<View>(this) {
                /* class com.bytedance.ies.bullet.p1184ui.common.BulletContainerView.C16996h.C169971 */

                /* renamed from: a */
                final /* synthetic */ C16996h f40494a;

                static {
                    Covode.recordClassIndex(19445);
                }

                {
                    this.f40494a = r1;
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: a */
                public final void mo26861a(C17029d<View> dVar, Uri uri) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                    this.f40494a.f40492a.f40457c = false;
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: b */
                public final void mo26863b(C17029d<View> dVar, Uri uri) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                    if (!this.f40494a.f40492a.f40457c) {
                        this.f40494a.f40492a.f40457c = true;
                        this.f40494a.f40492a.mo25853a(dVar.f40551a, uri, this.f40494a.f40493b);
                        AbstractC17046h.AbstractC17048b bVar = this.f40494a.f40492a.f40455a;
                        if (bVar != null) {
                            bVar.mo25853a(dVar.f40551a, uri, this.f40494a.f40493b);
                        }
                    }
                    dVar2.mo26907b(this);
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: a */
                public final void mo26862a(C17029d<View> dVar, Uri uri, Throwable th) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                    C89219l.m154719c(th, "");
                    if (!this.f40494a.f40492a.f40457c) {
                        this.f40494a.f40492a.f40457c = true;
                        this.f40494a.f40492a.mo26843b(uri, th);
                        AbstractC17046h.AbstractC17048b bVar = this.f40494a.f40492a.f40455a;
                        if (bVar != null) {
                            bVar.mo25852a(uri, th);
                        }
                    }
                    dVar2.mo26907b(this);
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$i */
    public static final class C16998i extends AbstractC89220m implements AbstractC89172b<C17029d<View>, registerDelegatesForViewComponents.1.1.1> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40496a;

        static {
            Covode.recordClassIndex(19446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16998i(BulletContainerView bulletContainerView) {
            super(1);
            this.f40496a = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ registerDelegatesForViewComponents.1.1.1 invoke(C17029d<View> dVar) {
            final C17029d<View> dVar2 = dVar;
            C89219l.m154719c(dVar2, "");
            return new AbstractC17030e<View>(this) {
                /* class com.bytedance.ies.bullet.p1184ui.common.BulletContainerView.C16998i.C169991 */

                /* renamed from: a */
                final /* synthetic */ C16998i f40497a;

                static {
                    Covode.recordClassIndex(19447);
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: a */
                public final void mo26861a(C17029d<View> dVar, Uri uri) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                }

                {
                    this.f40497a = r1;
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: b */
                public final void mo26863b(C17029d<View> dVar, Uri uri) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                    AbstractC17046h.AbstractC17048b bVar = this.f40497a.f40496a.f40455a;
                    if (bVar != null) {
                        T t = dVar.f40551a;
                        AbstractC16208i iVar = this.f40497a.f40496a.f40456b;
                        if (iVar == null) {
                            C89219l.m154707a();
                        }
                        bVar.mo25853a(t, uri, iVar);
                    }
                    dVar2.mo26907b(this);
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17030e
                /* renamed from: a */
                public final void mo26862a(C17029d<View> dVar, Uri uri, Throwable th) {
                    C89219l.m154719c(dVar, "");
                    C89219l.m154719c(uri, "");
                    C89219l.m154719c(th, "");
                    AbstractC17046h.AbstractC17048b bVar = this.f40497a.f40496a.f40455a;
                    if (bVar != null) {
                        bVar.mo25852a(uri, th);
                    }
                    dVar2.mo26907b(this);
                }
            };
        }
    }

    /* renamed from: b */
    public final void mo26845b(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(bVar, "");
        mo25820a(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h
    public void onEvent(AbstractC16191p pVar) {
        C89219l.m154719c(pVar, "");
        AbstractC16208i iVar = this.f40456b;
        if (iVar != null) {
            iVar.onEvent(pVar);
        }
    }

    public void setActivityWrapper(AbstractC17045g gVar) {
        C89219l.m154719c(gVar, "");
        getProviderFactory().mo25831b(AbstractC17045g.class, gVar);
    }

    public final void setLoadingDelay(long j) {
        if (j >= 0) {
            this.f40468n = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$f */
    public static final class C16994f extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40489a;

        /* renamed from: b */
        final /* synthetic */ Uri f40490b;

        static {
            Covode.recordClassIndex(19442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16994f(BulletContainerView bulletContainerView, Uri uri) {
            super(1);
            this.f40489a = bulletContainerView;
            this.f40490b = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f40489a.mo26843b(this.f40490b, th2);
            AbstractC17046h.AbstractC17048b bVar = this.f40489a.f40455a;
            if (bVar != null) {
                bVar.mo25852a(this.f40490b, th2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final String m31326a(Bundle bundle) {
        String str;
        if (bundle == null || (str = bundle.getString("__x_session_id")) == null || str.length() == 0) {
            str = C16583n.m30793a();
        }
        this.f40473s = str;
        return str;
    }

    public final void setLoadingViewInternal$bullet_ui_common_release(View view) {
        C89219l.m154719c(view, "");
        View view2 = this.f40458d;
        if (view2 != null) {
            removeView(view2);
        }
        view.setVisibility(0);
        addView(view);
        this.f40458d = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$c */
    public static final class C16991c extends AbstractC89220m implements AbstractC89172b<C16248b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40485a;

        static {
            Covode.recordClassIndex(19439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16991c(BulletContainerView bulletContainerView) {
            super(1);
            this.f40485a = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16248b bVar) {
            MethodCollector.m26663i(5455);
            C89219l.m154719c(bVar, "");
            if (this.f40485a.mo26849f() == null) {
                AbstractC16576j.C16578b.m30778a(this.f40485a, "Remove views failed: bullet_container is null", EnumC16586p.E, null, 4);
            } else {
                FrameLayout frameLayout = (FrameLayout) this.f40485a.mo26849f();
                C89219l.m154709a((Object) frameLayout, "");
                if (frameLayout.getChildCount() != 0) {
                    ((FrameLayout) this.f40485a.mo26849f()).removeAllViews();
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(5455);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$d */
    public static final class C16992d extends AbstractC89220m implements AbstractC89172b<C17029d<? extends View>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40486a;

        static {
            Covode.recordClassIndex(19440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16992d(BulletContainerView bulletContainerView) {
            super(1);
            this.f40486a = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C17029d<? extends View> dVar) {
            MethodCollector.m26663i(5077);
            C17029d<? extends View> dVar2 = dVar;
            C89219l.m154719c(dVar2, "");
            if (this.f40486a.mo26849f() == null) {
                AbstractC16576j.C16578b.m30778a(this.f40486a, "Add view failed: bullet_container is null", EnumC16586p.E, null, 4);
            } else {
                ((FrameLayout) this.f40486a.mo26849f()).addView(dVar2.f40551a, dVar2.f40552b);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(5077);
            return zVar;
        }
    }

    /* renamed from: b */
    private final void m31331b(Uri uri) {
        String str;
        Long a;
        AbstractC16559e<String, Object> b;
        String str2 = this.f40473s;
        if (str2 == null || (b = C16622e.C16623a.m30858a().mo26341b(str2)) == null) {
            str = null;
        } else {
            str = b.getString("__x_monitor_router_open_start_time");
        }
        this.f40475u = System.currentTimeMillis();
        if (!(str == null || (a = C16639c.m30884a(str)) == null)) {
            this.f40475u = a.longValue();
        }
        C89219l.m154719c(uri, "");
        C17056n<C17054l> nVar = C17044f.f40594a;
        C17054l lVar = new C17054l(uri, System.currentTimeMillis());
        if (nVar.f40599a.size() >= nVar.f40600b) {
            nVar.f40599a.pop();
        }
        nVar.f40599a.add(lVar);
        C16248b bVar = new C16248b();
        C16257i iVar = new C16257i();
        iVar.f39048a = this.f40473s;
        iVar.f39049b = Long.valueOf(this.f40475u);
        bVar.mo25831b(C16257i.class, iVar);
        AbstractC16576j.C16578b.m30778a(this, "loadUri: ".concat(String.valueOf(uri)), null, null, 6);
        this.f40465k.getAndSet(EnumC17055m.LOADING.ordinal());
        this.f40466l.mo26915a(uri, bVar, new C16991c(this), new C16992d(this), new C16993e(this, uri), new C16994f(this, uri));
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        return this.f40466l.mo25682a(cls);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        return this.f40466l.mo25683a(str);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154719c(uri, "");
        AbstractC16576j.C16578b.m30778a(this, "view onLoadStart", null, null, 6);
        String queryParameter = uri.getQueryParameter("url");
        long j = 0;
        boolean z = true;
        if (queryParameter != null) {
            try {
                Uri parse = Uri.parse(queryParameter);
                if (parse != null) {
                    z = parse.getBooleanQueryParameter("show_loading", true);
                    String queryParameter2 = parse.getQueryParameter("loading_duration");
                    if (queryParameter2 != null) {
                        j = Long.parseLong(queryParameter2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.f40461g = false;
        m31329a(z, j);
    }

    /* renamed from: b */
    public final void mo26843b(Uri uri, Throwable th) {
        mo25852a(uri, th);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* renamed from: b */
    public final void mo26844b(View view, FrameLayout.LayoutParams layoutParams) {
        C89219l.m154719c(view, "");
        View view2 = this.f40469o;
        if (view2 != null) {
            removeView(view2);
        }
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.f40469o = view;
    }

    /* renamed from: a */
    private static void m31328a(List<? extends C17029d<? extends View>> list, AbstractC89172b<? super C17029d<View>, ? extends AbstractC17030e<View>> bVar) {
        for (T t : list) {
            if (t != null) {
                t.mo26905a((AbstractC17030e) bVar.invoke(t));
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* renamed from: a */
    private final void m31329a(boolean z, long j) {
        if (this.f40459e == null && z && !this.f40457c) {
            this.f40459e = new Timer();
            TimerTask timerTask = this.f40460f;
            if (timerTask != null) {
                timerTask.cancel();
            }
            C16988b bVar = new C16988b(this, j);
            this.f40460f = bVar;
            Timer timer = this.f40459e;
            if (timer != null) {
                timer.schedule(bVar, this.f40468n);
            }
        }
    }

    /* renamed from: a */
    private final void m31330a(boolean z, Throwable th) {
        Boolean bool;
        boolean z2;
        String str;
        String str2;
        String str3;
        C16202c cVar;
        C16257i iVar = (C16257i) getProviderFactory().mo25832c(C16257i.class);
        if (iVar != null) {
            bool = Boolean.valueOf(iVar.mo25845a());
        } else {
            bool = null;
        }
        boolean z3 = true;
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C16257i iVar2 = (C16257i) getProviderFactory().mo25832c(C16257i.class);
        if (iVar2 == null || (cVar = iVar2.f39050c) == null) {
            str = null;
        } else {
            str = cVar.f38977c;
        }
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        C16257i iVar3 = (C16257i) getProviderFactory().mo25832c(C16257i.class);
        if (iVar3 == null || (str3 = iVar3.f39055h) == null) {
            if (th != null) {
                str3 = th.getMessage();
            } else {
                str3 = null;
            }
        }
        AbstractC16654o oVar = (AbstractC16654o) getProviderFactory().mo25832c(AbstractC16654o.class);
        if (oVar != null) {
            C16607an anVar = new C16607an("bdx_monitor_container_load_url", null, null, 254);
            anVar.f39738c = (AbstractC16640d) getProviderFactory().mo25832c(AbstractC16640d.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", str2);
            jSONObject.put("fail_reason", str3);
            jSONObject.put("fallback", z2);
            if (this.f40469o == null) {
                z3 = false;
            }
            jSONObject.put("has_error_view", String.valueOf(z3));
            jSONObject.put("fallback_reason", str);
            anVar.f39742g = jSONObject;
            oVar.mo26319a(anVar);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    /* renamed from: b */
    private final void m31332b(Uri uri, Bundle bundle, AbstractC17046h.AbstractC17048b bVar) {
        mo25851a(uri);
        this.f40470p = uri;
        this.f40455a = bVar;
        if (bVar != null) {
            bVar.mo25851a(uri);
        }
        getProviderFactory().mo25831b(AbstractC16254a.class, new C16987a(this, bundle));
        AbstractC16699y yVar = (AbstractC16699y) C16622e.C16623a.m30858a().mo26347a(this.f40472r, AbstractC16699y.class);
        if (yVar != null) {
            yVar.mo26538b(uri);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(5860);
        this.f40466l = new C17041e(context);
        this.f40468n = 500;
        this.f40472r = "default_bid";
        try {
            C89379q.m157068constructorimpl(LayoutInflater.from(context).inflate(R.layout.m3, this));
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        this.f40465k = new AtomicInteger(EnumC17055m.INIT.ordinal());
        this.f40475u = System.currentTimeMillis();
        this.f40476v = C89250i.m154773a((AbstractC89171a) new C16995g(this));
        MethodCollector.m26664o(5860);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$e */
    public static final class C16993e extends AbstractC89220m implements AbstractC89187q<AbstractC16208i, List<? extends C17029d<? extends View>>, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f40487a;

        /* renamed from: b */
        final /* synthetic */ Uri f40488b;

        static {
            Covode.recordClassIndex(19441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16993e(BulletContainerView bulletContainerView, Uri uri) {
            super(3);
            this.f40487a = bulletContainerView;
            this.f40488b = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
            if (r2 != null) goto L_0x0094;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i r10, java.util.List<? extends com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d<? extends android.view.View>> r11, java.lang.Boolean r12) {
            /*
            // Method dump skipped, instructions count: 259
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p1184ui.common.BulletContainerView.C16993e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BulletContainerView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
