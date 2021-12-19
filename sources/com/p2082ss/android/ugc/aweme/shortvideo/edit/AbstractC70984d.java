package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d */
public abstract class AbstractC70984d implements AbstractC70977bq {

    /* renamed from: a */
    public boolean f158885a;

    /* renamed from: b */
    public boolean f158886b;

    /* renamed from: c */
    private final VideoPublishEditModel f158887c;

    static {
        Covode.recordClassIndex(83478);
    }

    /* renamed from: a */
    public static int m125340a(int i) {
        return ((i + 16) - 1) & -16;
    }

    public AbstractC70984d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f158887c = videoPublishEditModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final int mo112107a(boolean z) {
        if (z) {
            return this.f158887c.videoWidth();
        }
        return this.f158887c.sourceVideoWidth();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: b */
    public final int mo112110b(boolean z) {
        if (z) {
            return this.f158887c.videoHeight();
        }
        return this.f158887c.sourceVideoHeight();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final void mo112108a(boolean z, boolean z2) {
        this.f158885a = z;
        this.f158886b = z2;
        this.f158887c.getCoverPublishModel().setNeedExpandCompiledSize(z);
        this.f158887c.mVideoCanvasWidth = mo112106a();
        this.f158887c.mVideoCanvasHeight = mo112109b();
        this.f158887c.mOutVideoWidth = mo112111c();
        this.f158887c.mOutVideoHeight = mo112112d();
    }
}
