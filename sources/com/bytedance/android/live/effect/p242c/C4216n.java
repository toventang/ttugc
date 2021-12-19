package com.bytedance.android.live.effect.p242c;

import android.text.TextUtils;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.live.effect.c.n */
final /* synthetic */ class C4216n implements AbstractC88983w {

    /* renamed from: a */
    private final C4208j f11695a;

    /* renamed from: b */
    private final FilterModel f11696b;

    static {
        Covode.recordClassIndex(4786);
    }

    C4216n(C4208j jVar, FilterModel filterModel) {
        this.f11695a = jVar;
        this.f11696b = filterModel;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C4208j jVar = this.f11695a;
        FilterModel filterModel = this.f11696b;
        C4208j jVar2 = C4208j.C4212b.f11691a;
        String id = filterModel.getEffect().getId();
        String tagsUpdatedAt = filterModel.getEffect().getTagsUpdatedAt();
        C4208j.C42091 r2 = new IIsTagNeedUpdatedListener(filterModel, vVar) {
            /* class com.bytedance.android.live.effect.p242c.C4208j.C42091 */

            /* renamed from: a */
            final /* synthetic */ FilterModel f11685a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f11686b;

            static {
                Covode.recordClassIndex(4779);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
                this.f11685a.setNew(false);
                this.f11686b.mo143023a();
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
                this.f11685a.setNew(true);
                this.f11686b.mo143023a();
            }

            {
                this.f11685a = r2;
                this.f11686b = r3;
            }
        };
        if (jVar2.f11680b == null || id == null || tagsUpdatedAt == null || TextUtils.equals("NULL", tagsUpdatedAt.toUpperCase())) {
            r2.onTagNeedNotUpdate();
        } else {
            jVar2.f11680b.isTagUpdated(id, tagsUpdatedAt, r2);
        }
    }
}
