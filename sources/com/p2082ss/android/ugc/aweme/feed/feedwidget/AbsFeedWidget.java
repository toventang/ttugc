package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget */
public abstract class AbsFeedWidget extends GenericWidget implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    private AbstractC50304g f113934a;

    static {
        Covode.recordClassIndex(58357);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC50304g mo81269b(View view);

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC50304g gVar = this.f113934a;
        if (gVar != null) {
            gVar.mo85143a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("video_params", (AbstractC1214u<C33942b>) this).mo60189a("on_viewpager_page_selected", (AbstractC1214u<C33942b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81270b(C33942b bVar) {
        VideoItemParams videoItemParams = (VideoItemParams) bVar.mo60212a();
        AbstractC50304g gVar = this.f113934a;
        if (gVar != null) {
            gVar.mo85146a(videoItemParams);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        AbstractC50304g b = mo81269b(view);
        this.f113934a = b;
        b.mo85469b(this.f80273e);
        VideoItemParams videoItemParams = (VideoItemParams) this.f80273e.mo60192a("video_params");
        if (videoItemParams != null) {
            this.f113934a.mo85146a(videoItemParams);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: a */
    public void mo60180a(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                AbstractC50304g gVar = this.f113934a;
                if (gVar != null) {
                    gVar.mo85147b();
                }
            } else if (str.equals("video_params")) {
                mo81270b(bVar);
            }
        }
    }
}
