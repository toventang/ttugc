package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50207df;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDuetWidget */
public final class VideoDuetWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    public final Bundle f113947a;

    /* renamed from: i */
    private C50207df f113948i;

    static {
        Covode.recordClassIndex(58372);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        C50207df dfVar = this.f113948i;
        if (dfVar != null) {
            dfVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    public VideoDuetWidget(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f113947a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: b */
    public final AbstractC49544a mo81271b(View view) {
        if (this.f113948i == null) {
            this.f113948i = new C50207df(view, this.f113947a);
        }
        C50207df dfVar = this.f113948i;
        Objects.requireNonNull(dfVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.VideoDuetView");
        return dfVar;
    }
}
