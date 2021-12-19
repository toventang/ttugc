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
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.e */
public final class C30866e extends AbstractC30857b {

    /* renamed from: a */
    SurfaceTexture f73941a;

    /* renamed from: b */
    float[] f73942b = new float[16];

    /* renamed from: c */
    int f73943c;

    /* renamed from: d */
    ImageReader[] f73944d;

    /* renamed from: e */
    Surface[] f73945e;

    static {
        Covode.recordClassIndex(37491);
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: c */
    public final int mo55876c() {
        return 8;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: d */
    public final void mo55877d() {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: b */
    public final SurfaceTexture mo55875b() {
        return this.f73941a;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: g */
    public final Surface[] mo55884g() {
        return this.f73945e;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final Surface mo55873a() {
        Surface[] surfaceArr = this.f73945e;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: i */
    public final int mo55886i() {
        if (this.f73941a != null) {
            return this.f73943c;
        }
        return super.mo55886i();
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: e */
    public final void mo55882e() {
        Surface[] surfaceArr;
        super.mo55882e();
        ImageReader[] imageReaderArr = this.f73944d;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                imageReader.close();
            }
            this.f73944d = null;
        }
        if (!(this.f73941a == null || (surfaceArr = this.f73945e) == null || surfaceArr[0] == null)) {
            surfaceArr[0].release();
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final void mo55874a(SurfaceTexture surfaceTexture) {
        if (this.f73941a != null) {
            Surface[] surfaceArr = this.f73945e;
            if (!(surfaceArr == null || surfaceArr[0] == null)) {
                surfaceArr[0].release();
            }
            SurfaceTexture surfaceTexture2 = this.f73941a;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            this.f73941a = surfaceTexture;
            this.f73945e[0] = new Surface(this.f73941a);
            if (this.f73920f != null && (this.f73920f instanceof AbstractC30857b.AbstractC30861b)) {
                ((AbstractC30857b.AbstractC30861b) this.f73920f).mo55889a(this.f73941a);
            }
        }
    }

    public C30866e(C30862c.C30863a aVar, AbstractC30825g gVar) {
        super(aVar, gVar);
        int i;
        this.f73941a = aVar.f73934d;
        this.f73943c = aVar.f73935e;
        this.f73944d = new ImageReader[this.f73925k];
        if (this.f73941a != null) {
            i = this.f73925k + 1;
        } else {
            i = this.f73925k;
        }
        Surface[] surfaceArr = new Surface[i];
        this.f73945e = surfaceArr;
        if (this.f73941a != null) {
            surfaceArr[0] = new Surface(this.f73941a);
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2201j.C30866e.mo55879a(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f73922h = C30956m.m63661a(list, this.f73922h);
        }
        SurfaceTexture surfaceTexture = this.f73941a;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f73922h.f73616a, this.f73922h.f73617b);
        }
        for (int i = 0; i < this.f73925k; i++) {
            this.f73944d[i] = ImageReader.newInstance(this.f73922h.f73616a, this.f73922h.f73617b, C30844i.m63552a(this.f73921g), 1);
            this.f73944d[i].setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.p2082ss.android.ttvecamera.p2201j.C30866e.C308671 */

                static {
                    Covode.recordClassIndex(37492);
                }

                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        C30844i iVar = new C30844i(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.mo55867a(new C30972p(acquireNextImage.getPlanes()), C30866e.this.f73923i.mo55844G(), C30866e.this.f73921g, C30866e.this.f73923i.f73853u);
                        C30866e.this.mo55880a(iVar);
                        acquireNextImage.close();
                    }
                }
            }, this.f73923i.f73850r);
            if (this.f73941a != null) {
                this.f73945e[i + 1] = this.f73944d[i].getSurface();
            } else {
                this.f73945e[i] = this.f73944d[i].getSurface();
            }
        }
        return 0;
    }
}
