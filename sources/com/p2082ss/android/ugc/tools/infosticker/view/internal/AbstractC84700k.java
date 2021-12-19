package com.p2082ss.android.ugc.tools.infosticker.view.internal;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.k */
public interface AbstractC84700k<DATA> {
    static {
        Covode.recordClassIndex(98667);
    }

    /* renamed from: a */
    void mo129567a(DATA data);

    /* renamed from: j */
    LiveData<Map<DATA, C89378p<EnumC84444c, Integer>>> mo129569j();

    /* renamed from: k */
    LiveData<C20391d<List<DATA>>> mo129570k();

    /* renamed from: l */
    LiveData<C20391d<List<DATA>>> mo129571l();
}
