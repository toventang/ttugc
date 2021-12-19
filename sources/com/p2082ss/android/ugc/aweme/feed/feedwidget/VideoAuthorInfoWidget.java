package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50253dz;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50293ev;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget */
public final class VideoAuthorInfoWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    private final HashMap<String, String> f113940a = new HashMap<>();

    /* renamed from: i */
    private final View.OnTouchListener f113941i;

    /* renamed from: j */
    private final String f113942j;

    static {
        Covode.recordClassIndex(58366);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        this.f113949h.onChanged(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: b */
    public final AbstractC49544a mo81271b(View view) {
        if (!C47008he.m90283b() || !TextUtils.equals(this.f113942j, "homepage_hot")) {
            return new C50293ev(view, this.f113941i, aj_(), this.f113940a);
        }
        return new C50253dz(view, this.f113941i, aj_(), this.f113940a);
    }

    public VideoAuthorInfoWidget(View.OnTouchListener onTouchListener, String str) {
        this.f113941i = onTouchListener;
        this.f113942j = str;
    }
}
