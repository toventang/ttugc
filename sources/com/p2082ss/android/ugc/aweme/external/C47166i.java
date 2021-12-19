package com.p2082ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.filter.IFilterService;

/* renamed from: com.ss.android.ugc.aweme.external.i */
public class C47166i implements IFilterService {
    static {
        Covode.recordClassIndex(55770);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.filter.IFilterService
    public void refreshData() {
        C63238c.f143570H.mo101685a(new AbstractC63212bb.AbstractC63213a() {
            /* class com.p2082ss.android.ugc.aweme.external.C47166i.C471671 */

            static {
                Covode.recordClassIndex(55771);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
            public final void onSuccess() {
                C63238c.f143565C.mo73290r().mo86005c().mo86020a();
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.services.filter.IFilterService
    public FilterBean getFilter(int i) {
        return C63238c.f143565C.mo73290r().mo86005c().mo86019a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.filter.IFilterService
    public String getFilterEnName(int i) {
        return C63238c.f143565C.mo73290r().mo86005c().mo86022c(i);
    }
}
