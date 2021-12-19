package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.k */
final /* synthetic */ class RunnableC78968k implements Runnable {

    /* renamed from: a */
    private final MvTemplateView f177480a;

    /* renamed from: b */
    private final int f177481b;

    /* renamed from: c */
    private final List f177482c;

    static {
        Covode.recordClassIndex(92117);
    }

    RunnableC78968k(MvTemplateView mvTemplateView, int i, List list) {
        this.f177480a = mvTemplateView;
        this.f177481b = i;
        this.f177482c = list;
    }

    public final void run() {
        MvTemplateView mvTemplateView = this.f177480a;
        int i = this.f177481b;
        List list = this.f177482c;
        if (i == 0) {
            mvTemplateView.f177164q.notifyDataSetChanged();
        } else {
            mvTemplateView.f177164q.notifyItemRangeInserted(i + 1, list.size());
        }
    }
}
