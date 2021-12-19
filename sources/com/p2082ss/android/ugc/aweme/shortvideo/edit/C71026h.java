package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h */
public final class C71026h extends AbstractC70984d {

    /* renamed from: c */
    public final VideoPublishEditModel f158969c;

    /* renamed from: d */
    private int f158970d;

    /* renamed from: e */
    private int f158971e;

    static {
        Covode.recordClassIndex(83522);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final int mo112106a() {
        if (this.f158970d == 0) {
            m125386e();
        }
        return this.f158970d;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: b */
    public final int mo112109b() {
        if (this.f158971e == 0) {
            m125386e();
        }
        return this.f158971e;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: c */
    public final int mo112111c() {
        if (this.f158885a) {
            return mo112106a();
        }
        return this.f158969c.videoWidth();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: d */
    public final int mo112112d() {
        if (this.f158885a) {
            return mo112109b();
        }
        return this.f158969c.videoHeight();
    }

    /* renamed from: e */
    private final void m125386e() {
        int i;
        int a;
        int ceil;
        int videoWidth;
        int videoHeight;
        if (this.f158969c.isPhotoMvMode) {
            this.f158970d = this.f158969c.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getWidth();
            ceil = this.f158969c.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getHeight();
        } else if (!this.f158969c.mIsFromDraft || !this.f158969c.hasStickers()) {
            boolean a2 = C70635dg.m124827a(this.f158969c.videoWidth(), this.f158969c.videoHeight());
            if (a2) {
                a = this.f158969c.videoWidth();
            } else {
                int[] h = C65357b.m117052h();
                if (h != null) {
                    i = h[0];
                } else {
                    i = 720;
                }
                a = m125340a(C89271h.m154772c(this.f158969c.videoWidth(), i));
            }
            this.f158970d = a;
            if (a2) {
                ceil = this.f158969c.videoHeight();
            } else {
                double d = (double) a;
                Double.isNaN(d);
                ceil = (int) (Math.ceil(d / 9.0d) * 16.0d);
            }
        } else {
            if (this.f158969c.mVideoCanvasWidth > 0) {
                videoWidth = this.f158969c.mVideoCanvasWidth;
            } else {
                videoWidth = this.f158969c.videoWidth();
            }
            this.f158970d = videoWidth;
            if (this.f158969c.mVideoCanvasHeight > 0) {
                videoHeight = this.f158969c.mVideoCanvasHeight;
            } else {
                videoHeight = this.f158969c.videoHeight();
            }
            this.f158971e = videoHeight;
            return;
        }
        this.f158971e = ceil;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71026h(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        C89219l.m154721d(videoPublishEditModel, "");
        this.f158969c = videoPublishEditModel;
    }
}
