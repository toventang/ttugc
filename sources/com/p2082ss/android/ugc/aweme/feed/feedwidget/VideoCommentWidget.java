package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50150bt;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget */
public class VideoCommentWidget extends AbsAsyncFeedWidget {
    static {
        Covode.recordClassIndex(58368);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("awesome_update_data", (AbstractC1214u<C33942b>) this).mo60189a("awesome_update_backup_data", (AbstractC1214u<C33942b>) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        this.f113949h.onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: b */
    public final AbstractC49544a mo81271b(View view) {
        return new C50150bt(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }
}
