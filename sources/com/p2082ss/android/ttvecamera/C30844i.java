package com.p2082ss.android.ttvecamera;

import android.hardware.camera2.TotalCaptureResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.android.ttvecamera.i */
public class C30844i {

    /* renamed from: a */
    public long f73880a;

    /* renamed from: b */
    public C30848c f73881b;

    /* renamed from: c */
    public C30850e f73882c;

    /* renamed from: d */
    private int f73883d;

    /* renamed from: e */
    private int f73884e;

    /* renamed from: com.ss.android.ttvecamera.i$c */
    public static class C30848c {

        /* renamed from: a */
        public int f73889a = -1;

        /* renamed from: b */
        public int f73890b = -1;

        /* renamed from: c */
        public long f73891c = -1;

        /* renamed from: d */
        public TotalCaptureResult f73892d;

        /* renamed from: e */
        public int f73893e;

        /* renamed from: f */
        public int f73894f;

        static {
            Covode.recordClassIndex(37473);
        }
    }

    static {
        Covode.recordClassIndex(37469);
    }

    /* renamed from: com.ss.android.ttvecamera.i$e */
    public static class C30850e {

        /* renamed from: c */
        public TEFrameSizei f73897c;

        /* renamed from: d */
        public EnumC30847b f73898d;

        /* renamed from: e */
        public int f73899e;

        /* renamed from: f */
        public int f73900f;

        /* renamed from: g */
        public long f73901g;

        /* renamed from: h */
        public int f73902h;

        static {
            Covode.recordClassIndex(37475);
        }

        public C30850e() {
            this(0, 0, 0, 0);
        }

        public C30850e(int i, int i2, long j, int i3) {
            this.f73897c = new TEFrameSizei(i, i2);
            this.f73901g = j;
            this.f73902h = i3;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$1 */
    static /* synthetic */ class C308451 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73885a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30844i.C308451.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$b */
    public enum EnumC30847b {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder;

        static {
            Covode.recordClassIndex(37472);
        }
    }

    /* renamed from: a */
    public static int m63552a(EnumC30847b bVar) {
        switch (C308451.f73885a[bVar.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 39;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 41;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 42;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 256;
            default:
                return 0;
        }
    }

    public C30844i(int i, int i2, long j) {
        this.f73882c = new C30850e();
        this.f73883d = i;
        this.f73884e = i2;
        this.f73880a = j;
    }

    /* renamed from: a */
    public final void mo55867a(C30972p pVar, int i, EnumC30847b bVar, int i2) {
        this.f73882c = new C30851f(this.f73883d, this.f73884e, this.f73880a, pVar, i, bVar, i2);
    }

    /* renamed from: a */
    public final void mo55868a(byte[] bArr, int i, EnumC30847b bVar, int i2) {
        this.f73882c = new C30846a(this.f73883d, this.f73884e, this.f73880a, bArr, i, bVar, i2);
    }

    public C30844i(C30972p pVar, EnumC30847b bVar, int i, int i2, int i3) {
        this(i, i2, 0);
        mo55867a(pVar, i3, bVar, 0);
    }

    /* renamed from: a */
    public final void mo55866a(int i, int i2, float[] fArr, EnumC30847b bVar, int i3) {
        this.f73882c = new C30849d(this.f73883d, this.f73884e, this.f73880a, i, i2, fArr, bVar, i3);
    }

    public C30844i(byte[] bArr, EnumC30847b bVar, int i, int i2, int i3) {
        this(i, i2, 0);
        mo55868a(bArr, i3, bVar, 0);
    }

    /* renamed from: com.ss.android.ttvecamera.i$a */
    public static class C30846a extends C30850e {

        /* renamed from: a */
        public int f73886a;

        /* renamed from: b */
        public byte[] f73887b;

        static {
            Covode.recordClassIndex(37471);
        }

        public C30846a(int i, int i2, long j, byte[] bArr, int i3, EnumC30847b bVar, int i4) {
            super(i, i2, j, i4);
            this.f73899e = 2;
            this.f73900f = i3;
            this.f73898d = bVar;
            this.f73887b = bArr;
            this.f73886a = i * i2 * 4;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$f */
    public static class C30851f extends C30850e {

        /* renamed from: a */
        public C30972p f73903a;

        static {
            Covode.recordClassIndex(37476);
        }

        public C30851f(int i, int i2, long j, C30972p pVar, int i3, EnumC30847b bVar, int i4) {
            super(i, i2, j, i4);
            this.f73899e = 3;
            this.f73900f = i3;
            this.f73898d = bVar;
            this.f73903a = pVar;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$d */
    public static class C30849d extends C30850e {

        /* renamed from: a */
        public int f73895a;

        /* renamed from: b */
        public float[] f73896b;

        static {
            Covode.recordClassIndex(37474);
        }

        public C30849d(int i, int i2, long j, int i3, int i4, float[] fArr, EnumC30847b bVar, int i5) {
            super(i, i2, j, i5);
            this.f73899e = 1;
            this.f73895a = i3;
            this.f73900f = i4;
            this.f73896b = fArr;
            this.f73898d = bVar;
        }
    }
}
