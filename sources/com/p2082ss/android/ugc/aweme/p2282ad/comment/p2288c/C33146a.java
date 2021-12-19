package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2288c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33148d;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33136a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33151b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.c.a */
public final class C33146a extends AbstractC39047b<C33148d> {

    /* renamed from: a */
    public C33151b f78735a;

    /* renamed from: b */
    private WeakReference<AbstractC33136a> f78736b;

    static {
        Covode.recordClassIndex(39964);
    }

    public C33146a(View view, AbstractC33136a aVar) {
        super(view);
        this.f78735a = (C33151b) view;
        this.f78736b = new WeakReference<>(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, com.ss.android.ugc.aweme.commercialize_ad_api.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b
    /* renamed from: a */
    public final /* synthetic */ void mo59005a(Context context, C33148d dVar) {
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        C33148d dVar2 = dVar;
        this.f78735a.setData(dVar2.f78742e);
        Rect rect = dVar2.f78743f;
        C33151b bVar = this.f78735a;
        if (rect != null) {
            if (rect.top >= 0) {
                paddingTop = rect.top;
            } else {
                paddingTop = bVar.getPaddingTop();
            }
            if (rect.bottom >= 0) {
                paddingBottom = rect.bottom;
            } else {
                paddingBottom = bVar.getPaddingBottom();
            }
            int i = Build.VERSION.SDK_INT;
            if (rect.left >= 0) {
                paddingStart = rect.left;
            } else {
                paddingStart = bVar.getPaddingStart();
            }
            if (rect.right >= 0) {
                paddingEnd = rect.right;
            } else {
                paddingEnd = bVar.getPaddingEnd();
            }
            bVar.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
        if (this.f78736b.get() != null) {
            this.f78735a.setOnInternalEventListener(this.f78736b.get());
        }
    }
}
