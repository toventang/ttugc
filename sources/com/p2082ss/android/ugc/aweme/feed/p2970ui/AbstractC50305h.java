package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.EnumC37642b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.h */
public abstract class AbstractC50305h extends AbstractC49544a {

    /* renamed from: a */
    protected View.OnClickListener f116161a = new View.OnClickListener() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h.View$OnClickListenerC503061 */

        static {
            Covode.recordClassIndex(59433);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c9, code lost:
            if (android.text.TextUtils.equals(r1.getOwnerId(), r5.getUid()) != false) goto L_0x0183;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
            // Method dump skipped, instructions count: 1375
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h.View$OnClickListenerC503061.onClick(android.view.View):void");
        }
    };

    static {
        Covode.recordClassIndex(59432);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public void mo80929a(View view) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public void mo80931a(DataCenter dataCenter) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo85402b();

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        mo85402b();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: k */
    public final boolean mo81289k() {
        if (super.mo81289k()) {
            return true;
        }
        if (this.f113953L == null || !this.f113953L.isWithPromotionalMusic()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo81277b(VideoItemParams videoItemParams) {
        super.mo81277b(videoItemParams);
    }

    public AbstractC50305h(View view) {
        super(view);
    }

    /* renamed from: a */
    public static EnumC37642b m94403a(int i) {
        if (i == R.id.coj || i == R.id.col) {
            return EnumC37642b.TITLE;
        }
        if (i == R.id.cnl) {
            return EnumC37642b.ICON;
        }
        return null;
    }
}
