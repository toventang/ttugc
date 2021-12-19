package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEUtils;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.q */
public final class C71514q extends AbstractC70984d {

    /* renamed from: c */
    public int f160271c;

    /* renamed from: d */
    public int f160272d;

    /* renamed from: e */
    public final VideoPublishEditModel f160273e;

    /* renamed from: f */
    private int f160274f;

    /* renamed from: g */
    private int f160275g;

    static {
        Covode.recordClassIndex(84055);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final int mo112106a() {
        m126386e();
        return this.f160274f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: b */
    public final int mo112109b() {
        m126386e();
        return this.f160275g;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: c */
    public final int mo112111c() {
        m126386e();
        if (this.f158885a) {
            return this.f160274f;
        }
        return this.f160271c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: d */
    public final int mo112112d() {
        m126386e();
        if (this.f158885a) {
            return this.f160275g;
        }
        return this.f160272d;
    }

    /* renamed from: e */
    private void m126386e() {
        int i;
        int a;
        int ceil;
        int videoWidth;
        int videoHeight;
        if (this.f158886b) {
            this.f160271c = 0;
            this.f160274f = 0;
            this.f158886b = false;
        }
        if (this.f160271c == 0 || this.f160272d == 0) {
            if (!this.f160273e.isFastImport) {
                this.f160271c = this.f160273e.videoWidth();
                this.f160272d = this.f160273e.videoHeight();
            } else {
                VESize calcTargetRes = VEUtils.calcTargetRes(new int[]{mo112107a(true)}, new int[]{mo112110b(true)}, new ROTATE_DEGREE[]{ROTATE_DEGREE.ROTATE_NONE}, this.f160273e.getPreviewInfo().getPreviewWidth());
                this.f160271c = calcTargetRes.width;
                this.f160272d = calcTargetRes.height;
            }
        }
        if (this.f160274f != 0 && this.f160275g != 0) {
            return;
        }
        if (!this.f160273e.mIsFromDraft || !this.f160273e.hasStickers()) {
            boolean a2 = C70635dg.m124827a(this.f160273e.videoWidth(), this.f160273e.videoHeight());
            if (a2) {
                a = this.f160273e.videoWidth();
            } else {
                int[] h = C65357b.m117052h();
                if (h != null) {
                    i = h[0];
                } else {
                    i = 720;
                }
                a = m125340a(C89271h.m154772c(this.f160273e.videoWidth(), i));
            }
            this.f160274f = a;
            if (a2) {
                ceil = this.f160273e.videoHeight();
            } else {
                double d = (double) a;
                Double.isNaN(d);
                ceil = (int) (Math.ceil(d / 9.0d) * 16.0d);
            }
            this.f160275g = ceil;
            return;
        }
        if (this.f160273e.mVideoCanvasWidth > 0) {
            videoWidth = this.f160273e.mVideoCanvasWidth;
        } else {
            videoWidth = this.f160273e.videoWidth();
        }
        this.f160274f = videoWidth;
        if (this.f160273e.mVideoCanvasHeight > 0) {
            videoHeight = this.f160273e.mVideoCanvasHeight;
        } else {
            videoHeight = this.f160273e.videoHeight();
        }
        this.f160275g = videoHeight;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71514q(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        C89219l.m154721d(videoPublishEditModel, "");
        this.f160273e = videoPublishEditModel;
    }
}
