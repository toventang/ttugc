package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50037ab;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget */
public class FeedLiveWindowWidget extends AbsFeedWidget {

    /* renamed from: a */
    public View f113935a;

    /* renamed from: h */
    private C50037ab f113936h;

    static {
        Covode.recordClassIndex(58359);
    }

    /* renamed from: e */
    public final FrameLayout mo81272e() {
        C50037ab abVar = this.f113936h;
        if (abVar == null) {
            return null;
        }
        return abVar.f115501m;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC50304g mo81269b(View view) {
        C50037ab abVar = new C50037ab(view);
        this.f113936h = abVar;
        this.f113935a = abVar.f116157h;
        return this.f113936h;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        super.mo60180a(bVar);
        if (bVar != null && bVar.mo60212a() != null && (bVar.mo60212a() instanceof VideoItemParams) && "awesome_update_data".equals(bVar.f80277a)) {
            mo81270b(bVar);
        }
    }
}
