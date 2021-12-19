package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.c */
public class C30862c {

    /* renamed from: a */
    public static final String f73929a = C30862c.class.getSimpleName();

    /* renamed from: b */
    public AbstractC30857b f73930b;

    static {
        Covode.recordClassIndex(37487);
    }

    /* renamed from: a */
    public final int mo55891a() {
        AbstractC30857b bVar = this.f73930b;
        if (bVar != null) {
            return bVar.mo55876c();
        }
        return 0;
    }

    /* renamed from: b */
    public final Surface mo55894b() {
        AbstractC30857b bVar = this.f73930b;
        if (bVar != null) {
            return bVar.mo55873a();
        }
        return null;
    }

    /* renamed from: c */
    public final Surface[] mo55895c() {
        AbstractC30857b bVar = this.f73930b;
        if (bVar != null) {
            return bVar.mo55884g();
        }
        return null;
    }

    /* renamed from: d */
    public final SurfaceTexture mo55896d() {
        AbstractC30857b bVar = this.f73930b;
        if (bVar != null) {
            return bVar.mo55875b();
        }
        return null;
    }

    /* renamed from: e */
    public final TEFrameSizei mo55897e() {
        if (this.f73930b.f73924j) {
            return this.f73930b.f73922h;
        }
        return null;
    }

    /* renamed from: f */
    public final TEFrameSizei mo55898f() {
        if (!this.f73930b.f73924j) {
            return this.f73930b.f73922h;
        }
        return new TEFrameSizei(1080, 1920);
    }

    /* renamed from: com.ss.android.ttvecamera.j.c$a */
    public static class C30863a {

        /* renamed from: a */
        public boolean f73931a = true;

        /* renamed from: b */
        public TEFrameSizei f73932b;

        /* renamed from: c */
        public AbstractC30857b.AbstractC30860a f73933c;

        /* renamed from: d */
        public SurfaceTexture f73934d;

        /* renamed from: e */
        public int f73935e;

        /* renamed from: f */
        public int f73936f;

        /* renamed from: g */
        public Surface f73937g;

        /* renamed from: h */
        public C30844i.EnumC30847b f73938h = C30844i.EnumC30847b.PIXEL_FORMAT_Count;

        static {
            Covode.recordClassIndex(37488);
        }

        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f73931a + ", mSize = " + this.f73932b + ", mListener = " + this.f73933c + ", mSurfaceTexture = " + this.f73934d + ", mTextureOES = " + this.f73935e + ", mImageReaderCount = " + this.f73936f + "]";
        }

        public C30863a(C30863a aVar) {
            this.f73931a = aVar.f73931a;
            this.f73932b = aVar.f73932b;
            this.f73933c = aVar.f73933c;
            this.f73934d = aVar.f73934d;
            this.f73935e = aVar.f73935e;
            this.f73936f = aVar.f73936f;
        }

        public C30863a(TEFrameSizei tEFrameSizei, AbstractC30857b.AbstractC30860a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f73932b = tEFrameSizei;
            this.f73933c = aVar;
            this.f73934d = surfaceTexture;
            this.f73935e = i;
            this.f73931a = z;
            this.f73938h = C30844i.EnumC30847b.PIXEL_FORMAT_OpenGL_OES;
        }

        public C30863a(TEFrameSizei tEFrameSizei, AbstractC30857b.AbstractC30860a aVar, boolean z, SurfaceTexture surfaceTexture, int i, Surface surface) {
            this.f73932b = tEFrameSizei;
            this.f73933c = aVar;
            this.f73934d = surfaceTexture;
            this.f73935e = i;
            this.f73931a = z;
            this.f73938h = C30844i.EnumC30847b.PIXEL_FORMAT_Recorder;
            this.f73937g = surface;
        }

        public C30863a(TEFrameSizei tEFrameSizei, AbstractC30857b.AbstractC30860a aVar, boolean z, SurfaceTexture surfaceTexture, C30844i.EnumC30847b bVar, int i) {
            this.f73932b = tEFrameSizei;
            this.f73933c = aVar;
            this.f73934d = surfaceTexture;
            this.f73931a = z;
            this.f73938h = bVar;
            this.f73936f = i;
        }
    }

    /* renamed from: a */
    public final int mo55892a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        AbstractC30857b bVar = this.f73930b;
        if (bVar == null) {
            return -112;
        }
        return bVar.mo55879a(streamConfigurationMap, tEFrameSizei);
    }

    /* renamed from: a */
    public final int mo55893a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        AbstractC30857b bVar = this.f73930b;
        if (bVar != null) {
            return bVar.mo55872a(list, tEFrameSizei);
        }
        return -112;
    }
}
