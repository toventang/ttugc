package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;
import java.io.File;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.w */
public final /* synthetic */ class C72822w implements VEListener.AbstractC85241j {

    /* renamed from: a */
    private final C72809t f163408a;

    /* renamed from: b */
    private final List f163409b;

    /* renamed from: c */
    private final File f163410c;

    static {
        Covode.recordClassIndex(85508);
    }

    C72822w(C72809t tVar, List list, File file) {
        this.f163408a = tVar;
        this.f163409b = list;
        this.f163410c = file;
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
    /* renamed from: a */
    public final void mo56563a(int i) {
        this.f163408a.mo115107a(this.f163409b, this.f163410c, i);
    }
}
