package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.a */
public class C30855a extends AbstractC30857b {

    /* renamed from: a */
    public static final String f73911a = C30855a.class.getSimpleName();

    /* renamed from: b */
    public Camera.PreviewCallback f73912b;

    /* renamed from: c */
    int f73913c;

    /* renamed from: d */
    public byte[][] f73914d = null;

    /* renamed from: e */
    public int f73915e;

    /* renamed from: m */
    private SurfaceTexture f73916m;

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final Surface mo55873a() {
        return null;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final void mo55874a(SurfaceTexture surfaceTexture) {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: c */
    public final int mo55876c() {
        return 4;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: d */
    public final void mo55877d() {
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: b */
    public final SurfaceTexture mo55875b() {
        return this.f73916m;
    }

    static {
        Covode.recordClassIndex(37480);
    }

    public C30855a(C30862c.C30863a aVar, AbstractC30825g gVar) {
        super(aVar, gVar);
        this.f73916m = aVar.f73934d;
    }

    @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b
    /* renamed from: a */
    public final int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f73922h = C30956m.m63661a(list, tEFrameSizei);
        }
        this.f73916m.setDefaultBufferSize(this.f73922h.f73616a, this.f73922h.f73617b);
        this.f73912b = new Camera.PreviewCallback() {
            /* class com.p2082ss.android.ttvecamera.p2201j.C30855a.C308561 */

            static {
                Covode.recordClassIndex(37481);
            }

            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                C30855a aVar = C30855a.this;
                if (bArr != null && bArr.length > 0 && aVar.f73922h != null && aVar.f73913c < 3) {
                    aVar.f73913c++;
                    int i = aVar.f73922h.f73616a * aVar.f73922h.f73617b;
                    int i2 = i / 300;
                    int i3 = i2 / 2;
                    byte b = bArr[0];
                    byte b2 = bArr[i];
                    int i4 = 0;
                    while (true) {
                        if (b != bArr[i4 * i2] || b2 != bArr[(i4 * i3) + i]) {
                            break;
                        }
                        i4++;
                        if (i4 >= 300) {
                            break;
                        }
                    }
                }
                C30844i iVar = new C30844i(C30855a.this.f73922h.f73616a, C30855a.this.f73922h.f73617b, System.currentTimeMillis() * 1000);
                iVar.mo55868a(bArr, C30855a.this.f73923i.mo55844G(), C30844i.EnumC30847b.PIXEL_FORMAT_NV21, C30855a.this.f73923i.f73847o.f74181e);
                C30855a.this.mo55880a(iVar);
                if (camera != null) {
                    camera.addCallbackBuffer(bArr);
                }
            }
        };
        return 0;
    }
}
