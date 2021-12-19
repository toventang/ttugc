package com.p2082ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.depend.a */
public abstract class AbstractC30332a implements AbstractC30386t {

    /* renamed from: a */
    private boolean f72357a;

    static {
        Covode.recordClassIndex(36847);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30386t
    /* renamed from: a */
    public final boolean mo53857a() {
        return this.f72357a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30386t
    /* renamed from: a */
    public void mo53856a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f72357a = true;
        }
    }
}
