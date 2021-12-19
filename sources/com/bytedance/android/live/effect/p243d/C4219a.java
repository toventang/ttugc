package com.bytedance.android.live.effect.p243d;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.effect.C4242e;
import com.bytedance.android.live.effect.C4306l;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p241b.C4187e;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d.a */
public final class C4219a {

    /* renamed from: a */
    public final List<FilterModel> f11701a = new ArrayList();

    /* renamed from: b */
    public FilterModel f11702b;

    /* renamed from: c */
    private final Fragment f11703c;

    /* renamed from: d */
    private final AdjustPercentBar f11704d;

    static {
        Covode.recordClassIndex(4789);
    }

    /* renamed from: a */
    public final void mo9926a(FilterModel filterModel) {
        if (filterModel == null) {
            C11279p.m20006a(this.f11704d);
        } else if (filterModel.isNone()) {
            C11279p.m20006a(this.f11704d);
        } else {
            C11279p.m20017b(this.f11704d);
            this.f11704d.setPercent(C4187e.m10265a(filterModel.filterConfig.f11842a, filterModel.filterConfig.f11843b, C4208j.C4212b.f11691a.mo9901d(filterModel)));
            this.f11704d.mo18119a(100, 0, filterModel.filterConfig.f11844c, true);
        }
    }

    public C4219a(final DataChannel dataChannel, Fragment fragment, AdjustPercentBar adjustPercentBar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(adjustPercentBar, "");
        this.f11703c = fragment;
        this.f11704d = adjustPercentBar;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) fragment, C4242e.class, (AbstractC89172b) new AbstractC89172b<List<? extends FilterModel>, C89391z>(this) {
                /* class com.bytedance.android.live.effect.p243d.C4219a.C42201 */

                /* renamed from: a */
                final /* synthetic */ C4219a f11705a;

                static {
                    Covode.recordClassIndex(4790);
                }

                {
                    this.f11705a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(List<? extends FilterModel> list) {
                    List<? extends FilterModel> list2 = list;
                    C89219l.m154721d(list2, "");
                    this.f11705a.f11701a.addAll(list2);
                    C4219a aVar = this.f11705a;
                    List<FilterModel> list3 = aVar.f11701a;
                    C6805b<Integer> bVar = AbstractC6804a.f16886O;
                    C89219l.m154716b(bVar, "");
                    Integer a = bVar.mo13066a();
                    C89219l.m154716b(a, "");
                    aVar.f11702b = (FilterModel) C89070n.m154561b((List) list3, a.intValue());
                    return C89391z.f203057a;
                }
            }).mo28309a((AbstractC1204m) fragment, C4306l.class, (AbstractC89172b) new AbstractC89172b<FilterModel, C89391z>(this) {
                /* class com.bytedance.android.live.effect.p243d.C4219a.C42212 */

                /* renamed from: a */
                final /* synthetic */ C4219a f11706a;

                static {
                    Covode.recordClassIndex(4791);
                }

                {
                    this.f11706a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FilterModel filterModel) {
                    FilterModel filterModel2 = filterModel;
                    C89219l.m154721d(filterModel2, "");
                    this.f11706a.f11702b = filterModel2;
                    C4208j.C4212b.f11691a.mo9921a(dataChannel, this.f11706a.f11701a.indexOf(filterModel2), false, true);
                    this.f11706a.mo9926a(filterModel2);
                    return C89391z.f203057a;
                }
            });
        }
    }
}
