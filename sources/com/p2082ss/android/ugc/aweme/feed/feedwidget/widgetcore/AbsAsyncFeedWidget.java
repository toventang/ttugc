package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget */
public abstract class AbsAsyncFeedWidget extends GenericWidget {

    /* renamed from: h */
    protected AbstractC49544a f113949h;

    static {
        Covode.recordClassIndex(58384);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC49544a mo81271b(View view);

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        AbstractC49544a aVar = this.f113949h;
        if (aVar != null && aVar.f113950I) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(aVar.f113950I, new RunnableC49549f(aVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        AbstractC49544a aVar = this.f113949h;
        if (aVar != null && aVar.f113950I) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(aVar.f113950I, new RunnableC49546c(aVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStart() {
        AbstractC49544a aVar = this.f113949h;
        if (aVar != null && aVar.f113950I) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(aVar.f113950I, new RunnableC49545b(aVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStop() {
        AbstractC49544a aVar = this.f113949h;
        if (aVar == null) {
            return;
        }
        if (aVar.f113950I) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(aVar.f113950I, new RunnableC49550g(aVar)));
        } else {
            aVar.mo81283g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        AbstractC49544a aVar = this.f113949h;
        if (aVar != null) {
            aVar.f113958Q.mo60189a("video_params", (AbstractC1214u<C33942b>) aVar.f113951J).mo60189a("on_viewpager_page_selected", (AbstractC1214u<C33942b>) aVar.f113951J).mo60189a("async_widget_unsafe_data", (AbstractC1214u<C33942b>) aVar.f113951J);
            if (aVar.f113950I) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(aVar.f113950I, new RunnableC49553j(aVar)));
                return;
            }
            Object a = aVar.f113958Q.mo60192a("video_params");
            aVar.mo81282f();
            if (a != null) {
                aVar.onChanged(new C33942b("video_params", a));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        AbstractC49544a aVar = this.f113949h;
        if (aVar == null) {
            super.onDestroy();
        } else if (aVar.f113950I) {
            AbstractC49544a aVar2 = this.f113949h;
            if (aVar2.f113950I) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(aVar2.f113950I, new RunnableC49551h(aVar2)));
            } else {
                aVar2.mo81285h();
            }
            AbstractC49544a aVar3 = this.f113949h;
            if (aVar3.f113950I) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC49552i(aVar3)));
            } else {
                aVar3.mo80928a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        C49559p.f113984a.mo81307a();
        super.mo60206a(view);
        AbstractC49544a b = mo81271b(view);
        this.f113949h = b;
        b.f113951J = this;
        this.f113949h.mo81276b(this.f80273e);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: a */
    public void mo60180a(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                AbstractC49544a aVar = this.f113949h;
                if (aVar != null) {
                    aVar.mo81287i();
                }
            } else if (str.equals("video_params")) {
                VideoItemParams videoItemParams = (VideoItemParams) bVar.mo60212a();
                AbstractC49544a aVar2 = this.f113949h;
                if (aVar2 != null) {
                    aVar2.mo81273a(videoItemParams);
                }
            }
        }
    }
}
