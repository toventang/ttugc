package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.b */
public interface AbstractC74163b {
    static {
        Covode.recordClassIndex(86922);
    }

    /* renamed from: a */
    long mo116636a(CameraComponentModel cameraComponentModel);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.b$a */
    public static final class C74164a implements AbstractC74163b {

        /* renamed from: a */
        private final AbstractC89172b<Boolean, Long> f166565a;

        static {
            Covode.recordClassIndex(86923);
        }

        public /* synthetic */ C74164a() {
            this(C741651.f166566a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Boolean, java.lang.Long> */
        /* JADX WARN: Multi-variable type inference failed */
        private C74164a(AbstractC89172b<? super Boolean, Long> bVar) {
            C89219l.m154721d(bVar, "");
            this.f166565a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74163b
        /* renamed from: a */
        public final long mo116636a(CameraComponentModel cameraComponentModel) {
            C89219l.m154721d(cameraComponentModel, "");
            return this.f166565a.invoke(Boolean.valueOf(cameraComponentModel.f155664t)).longValue() - cameraComponentModel.f155651g;
        }
    }
}
