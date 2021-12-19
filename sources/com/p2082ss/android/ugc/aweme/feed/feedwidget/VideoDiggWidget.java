package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50188cv;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget */
public class VideoDiggWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    private final Bundle f113944a;

    /* renamed from: i */
    private final AbstractC49543a f113945i;

    /* renamed from: j */
    private C50188cv f113946j;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget$a */
    public interface AbstractC49543a {
        static {
            Covode.recordClassIndex(58371);
        }

        /* renamed from: a */
        long mo80546a();
    }

    static {
        Covode.recordClassIndex(58370);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("awesome_update_data", (AbstractC1214u<C33942b>) this).mo60189a("awesome_update_backup_data", (AbstractC1214u<C33942b>) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        this.f113946j.onChanged(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: b */
    public final AbstractC49544a mo81271b(View view) {
        C50188cv cvVar = new C50188cv(view, this.f113944a, this.f113945i);
        this.f113946j = cvVar;
        return cvVar;
    }

    public VideoDiggWidget(Bundle bundle, AbstractC49543a aVar) {
        this.f113944a = bundle;
        this.f113945i = aVar;
    }
}
