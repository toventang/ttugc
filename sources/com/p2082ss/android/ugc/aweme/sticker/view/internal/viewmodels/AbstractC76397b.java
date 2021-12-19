package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89386u;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b */
public interface AbstractC76397b<DATA> {
    static {
        Covode.recordClassIndex(89357);
    }

    /* renamed from: a */
    C89378p<EnumC84444c, Integer> mo120095a(DATA data);

    /* renamed from: a */
    void mo119126a(String str);

    /* renamed from: b */
    int mo120097b(DATA data);

    /* renamed from: b */
    void mo120098b(C76401f<DATA> fVar);

    /* renamed from: k */
    LiveData<C89386u<DATA, EnumC84444c, Integer>> mo120099k();

    /* renamed from: l */
    LiveData<List<DATA>> mo120100l();

    /* renamed from: m */
    LiveData<EnumC85026a> mo120101m();

    /* renamed from: n */
    LiveData<C20391d<DATA>> mo120102n();
}
