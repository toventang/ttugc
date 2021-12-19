package com.p2082ss.android.ugc.aweme.port.p3561in;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.port.in.f */
public final /* synthetic */ class C63243f implements DownloadableModelSupportLibraryLoader {

    /* renamed from: a */
    static final DownloadableModelSupportLibraryLoader f143603a = new C63243f();

    static {
        Covode.recordClassIndex(74516);
    }

    private C63243f() {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
    public final void loadLibrary(String str) {
        AVServiceImpl.m113116a().loadLibrary(str, C63238c.f143574a);
    }
}
