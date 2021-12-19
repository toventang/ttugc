package com.p2082ss.android.socialbase.downloader.downloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.impls.C30502o;
import com.p2082ss.android.socialbase.downloader.impls.ServiceConnectionC30501n;
import com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f;

/* renamed from: com.ss.android.socialbase.downloader.downloader.x */
final class C30433x implements C30399c.AbstractC30403a {
    static {
        Covode.recordClassIndex(36952);
    }

    C30433x() {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30399c.AbstractC30403a
    /* renamed from: a */
    public final AbstractC30425q mo54045a() {
        return new ServiceConnectionC30501n();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30399c.AbstractC30403a
    /* renamed from: b */
    public final AbstractC30423o mo54047b() {
        return new C30502o();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.C30399c.AbstractC30403a
    /* renamed from: a */
    public final AbstractC30430v mo54046a(C30399c.AbstractC30403a.AbstractC30404a aVar) {
        ServiceConnectionC30317f fVar = new ServiceConnectionC30317f();
        fVar.f72324g = aVar;
        return fVar;
    }
}
