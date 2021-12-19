package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.n */
final class BinderC26869n extends BinderC26868m<ParcelFileDescriptor> {
    static {
        Covode.recordClassIndex(32344);
    }

    BinderC26869n(C26873r rVar, C27071m<ParcelFileDescriptor> mVar) {
        super(rVar, mVar);
    }

    @Override // com.google.android.play.core.assetpacks.BinderC26868m, com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: b */
    public final void mo44552b(Bundle bundle, Bundle bundle2) {
        super.mo44552b(bundle, bundle2);
        this.f63743a.mo44783a(bundle.getParcelable("chunk_file_descriptor"));
    }
}
