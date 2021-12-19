package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig */
public final class StickerDownloadConfig {
    public static final Companion Companion = new Companion(null);
    private int enterFromType = 10002;
    private AbstractC89172b<? super Integer, C89391z> onFail;
    private AbstractC89171a<C89391z> onSuccess;
    private final String region;
    private final String stickerId;
    private Integer type = 0;

    static {
        Covode.recordClassIndex(79882);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79883);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final int getEnterFromType() {
        return this.enterFromType;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, h.z>, h.f.a.b<java.lang.Integer, h.z> */
    public final AbstractC89172b<Integer, C89391z> getOnFail() {
        return this.onFail;
    }

    public final AbstractC89171a<C89391z> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEnterFromType(int i) {
        this.enterFromType = i;
    }

    public final void setOnFail(AbstractC89172b<? super Integer, C89391z> bVar) {
        this.onFail = bVar;
    }

    public final void setOnSuccess(AbstractC89171a<C89391z> aVar) {
        this.onSuccess = aVar;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public StickerDownloadConfig(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.stickerId = str;
        this.region = str2;
    }
}
