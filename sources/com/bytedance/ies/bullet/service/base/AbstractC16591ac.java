package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.ac */
public interface AbstractC16591ac {

    /* renamed from: com.bytedance.ies.bullet.service.base.ac$a */
    public static class C16592a implements AbstractC16591ac {
        static {
            Covode.recordClassIndex(19029);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16591ac
        /* renamed from: a */
        public final void mo26358a(Uri uri) {
            C89219l.m154719c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16591ac
        /* renamed from: a */
        public final void mo26359a(Uri uri, Uri uri2) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(uri2, "");
        }
    }

    static {
        Covode.recordClassIndex(19028);
    }

    /* renamed from: a */
    void mo26358a(Uri uri);

    /* renamed from: a */
    void mo26359a(Uri uri, Uri uri2);
}
