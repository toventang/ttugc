package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30972p;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.d */
public final class C30864d extends AbstractC30857b {

    /* renamed from: a */
    ImageReader f73939a;

    static {
        Covode.recordClassIndex(37489);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final void mo55874a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: b */
    public final SurfaceTexture mo55875b() {
        return null;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: c */
    public final int mo55876c() {
        return 2;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: d */
    public final void mo55877d() {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final Surface mo55873a() {
        ImageReader imageReader = this.f73939a;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: e */
    public final void mo55882e() {
        super.mo55882e();
        ImageReader imageReader = this.f73939a;
        if (imageReader != null) {
            imageReader.close();
            this.f73939a = null;
        }
    }

    public C30864d(C30862c.C30863a aVar, AbstractC30825g gVar) {
        super(aVar, gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo55879a(android.hardware.camera2.params.StreamConfigurationMap r6, com.p2082ss.android.ttvecamera.TEFrameSizei r7) {
        /*
            r5 = this;
            int[] r4 = r6.getOutputFormats()
            com.ss.android.ttvecamera.i$b r0 = r5.f73921g
            int r3 = com.p2082ss.android.ttvecamera.C30844i.m63552a(r0)
            int r2 = r4.length
            r0 = 0
            r0 = 0
        L_0x000d:
            if (r0 >= r2) goto L_0x0015
            r1 = r4[r0]
            if (r1 != r3) goto L_0x0028
            if (r1 != 0) goto L_0x001b
        L_0x0015:
            r1 = 35
            com.ss.android.ttvecamera.i$b r0 = com.p2082ss.android.ttvecamera.C30844i.EnumC30847b.PIXEL_FORMAT_YUV420
            r5.f73921g = r0
        L_0x001b:
            android.util.Size[] r0 = r6.getOutputSizes(r1)
            java.util.List r0 = m63568a(r0)
            int r0 = r5.mo55872a(r0, r7)
            return r0
        L_0x0028:
            int r0 = r0 + 1
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2201j.C30864d.mo55879a(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f73922h = C30956m.m63661a(list, this.f73922h);
        }
        ImageReader imageReader = this.f73939a;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.f73922h.f73616a, this.f73922h.f73617b, C30844i.m63552a(this.f73921g), 1);
        this.f73939a = newInstance;
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.p2082ss.android.ttvecamera.p2201j.C30864d.C308651 */

            static {
                Covode.recordClassIndex(37490);
            }

            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    try {
                        C30844i iVar = new C30844i(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.mo55867a(new C30972p(acquireLatestImage.getPlanes()), C30864d.this.f73923i.mo55844G(), C30864d.this.f73921g, C30864d.this.f73923i.f73853u);
                        C30864d.this.mo55880a(iVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        acquireLatestImage.close();
                    }
                }
            }
        }, this.f73923i.f73850r);
        return 0;
    }
}
