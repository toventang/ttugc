package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42289d;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.LifecycleDelegate */
public final class LifecycleDelegate extends AbstractC42218b implements View.OnAttachStateChangeListener, AbstractC33974au {

    /* renamed from: a */
    public static final C42215a f98384a = new C42215a((byte) 0);

    static {
        Covode.recordClassIndex(50155);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.LifecycleDelegate$a */
    public static final class C42215a {
        static {
            Covode.recordClassIndex(50156);
        }

        private C42215a() {
        }

        public /* synthetic */ C42215a(byte b) {
            this();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        mo71421a("viewDisappear", new JSONObject());
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.LifecycleDelegate$b */
    static final class RunnableC42216b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleDelegate f98385a;

        static {
            Covode.recordClassIndex(50157);
        }

        RunnableC42216b(LifecycleDelegate lifecycleDelegate) {
            this.f98385a = lifecycleDelegate;
        }

        public final void run() {
            LifecycleDelegate lifecycleDelegate = this.f98385a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "show");
            lifecycleDelegate.mo71421a("pageScroll", jSONObject);
            LynxView lynxView = this.f98385a.f98388b.f98322d;
            if (lynxView != null) {
                lynxView.onEnterForeground();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        BulletContainerView bulletContainerView = this.f98388b.f98336r.getBulletContainerView();
        if (bulletContainerView != null) {
            bulletContainerView.mo25721a();
        }
        C42289d dVar = this.f98388b.f98335q;
        if (dVar != null) {
            dVar.mo71479b();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f98388b.f98321c != null) {
            mo71421a("viewAppear", new JSONObject());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleDelegate(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        ActivityC0945e eVar = bVar.f98319a;
        if (eVar != null) {
            eVar.getLifecycle().mo4012a(this);
        }
        bVar.f98336r.addOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        if (this.f98388b.f98323e) {
            C67631j.m119782a(view, new RunnableC42216b(this));
        }
        this.f98388b.f98323e = false;
    }

    public final void onViewDetachedFromWindow(View view) {
        if (!this.f98388b.f98323e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "hide");
            mo71421a("pageScroll", jSONObject);
            LynxView lynxView = this.f98388b.f98322d;
            if (lynxView != null) {
                lynxView.onEnterBackground();
            }
        }
        this.f98388b.f98323e = true;
    }

    /* renamed from: a */
    public final void mo71421a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        this.f98388b.mo71386a(str, jSONObject);
    }
}
