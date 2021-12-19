package com.p2082ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.vesdk.C85568t;

/* renamed from: com.ss.android.vesdk.VECameraSettings */
public class VECameraSettings implements Parcelable {
    public static final Parcelable.Creator<VECameraSettings> CREATOR = new Parcelable.Creator<VECameraSettings>() {
        /* class com.p2082ss.android.vesdk.VECameraSettings.C852031 */

        static {
            Covode.recordClassIndex(99261);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VECameraSettings[] newArray(int i) {
            return new VECameraSettings[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VECameraSettings createFromParcel(Parcel parcel) {
            return new VECameraSettings(parcel);
        }
    };

    /* renamed from: a */
    public static final String f190669a = VECameraSettings.class.getSimpleName();

    /* renamed from: d */
    public static final String[] f190670d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};

    /* renamed from: A */
    public boolean f190671A;

    /* renamed from: B */
    public float f190672B;

    /* renamed from: C */
    public boolean f190673C;

    /* renamed from: D */
    public boolean f190674D;

    /* renamed from: E */
    public int f190675E;

    /* renamed from: F */
    public int f190676F;

    /* renamed from: G */
    public boolean f190677G;

    /* renamed from: H */
    public boolean f190678H;

    /* renamed from: I */
    public String f190679I;

    /* renamed from: J */
    public int f190680J;

    /* renamed from: K */
    public Bundle f190681K;

    /* renamed from: L */
    public CAMERA_CAPTURE_FLASH_STRATEGY f190682L;

    /* renamed from: M */
    public boolean f190683M;

    /* renamed from: N */
    public boolean f190684N;

    /* renamed from: O */
    public boolean f190685O;

    /* renamed from: P */
    public boolean f190686P;

    /* renamed from: Q */
    public boolean f190687Q;

    /* renamed from: R */
    public boolean f190688R;

    /* renamed from: S */
    public boolean f190689S;

    /* renamed from: T */
    public boolean f190690T;

    /* renamed from: U */
    private CAMERA_TYPE f190691U;

    /* renamed from: V */
    private boolean f190692V;

    /* renamed from: W */
    private boolean f190693W;

    /* renamed from: X */
    private boolean f190694X;

    /* renamed from: Y */
    private boolean f190695Y;

    /* renamed from: Z */
    private boolean f190696Z;

    /* renamed from: aa */
    private int f190697aa;

    /* renamed from: ab */
    private int f190698ab;

    /* renamed from: ac */
    private int f190699ac;

    /* renamed from: ad */
    private boolean f190700ad;

    /* renamed from: ae */
    private boolean f190701ae;

    /* renamed from: b */
    int[] f190702b;

    /* renamed from: c */
    int[] f190703c;

    /* renamed from: e */
    public int f190704e;

    /* renamed from: f */
    public VESize f190705f;

    /* renamed from: g */
    public int[] f190706g;

    /* renamed from: h */
    public CAMERA_HW_LEVEL f190707h;

    /* renamed from: i */
    public CAMERA_TYPE f190708i;

    /* renamed from: j */
    public boolean f190709j;

    /* renamed from: k */
    public CAMERA_TYPE f190710k;

    /* renamed from: l */
    public CAMERA_FACING_ID f190711l;

    /* renamed from: m */
    public String f190712m;

    /* renamed from: n */
    public String f190713n;

    /* renamed from: o */
    public boolean f190714o;

    /* renamed from: p */
    public EnumC85212b f190715p;

    /* renamed from: q */
    public int f190716q;

    /* renamed from: r */
    public boolean f190717r;

    /* renamed from: s */
    public boolean f190718s;

    /* renamed from: t */
    public int f190719t;

    /* renamed from: u */
    public boolean f190720u;

    /* renamed from: v */
    public byte f190721v;

    /* renamed from: w */
    public VESize f190722w;

    /* renamed from: x */
    public CAMERA_OUTPUT_MODE f190723x;

    /* renamed from: y */
    public boolean f190724y;

    /* renamed from: z */
    public CAMERA_MODE_TYPE f190725z;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$a */
    public static class C85211a {

        /* renamed from: a */
        public VECameraSettings f190733a;

        static {
            Covode.recordClassIndex(99276);
        }

        /* renamed from: a */
        public final C85211a mo130233a() {
            this.f190733a.f190709j = true;
            return this;
        }

        /* renamed from: b */
        public final C85211a mo130242b() {
            this.f190733a.f190672B = 1.0f;
            return this;
        }

        public C85211a() {
            this.f190733a = new VECameraSettings((byte) 0);
        }

        public C85211a(VECameraSettings vECameraSettings) {
            this.f190733a = vECameraSettings;
        }

        /* renamed from: a */
        public final C85211a mo130234a(byte b) {
            this.f190733a.f190721v = b;
            return this;
        }

        /* renamed from: b */
        public final C85211a mo130243b(int i) {
            this.f190733a.f190676F = i;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130235a(int i) {
            this.f190733a.f190675E = i;
            return this;
        }

        /* renamed from: b */
        public final C85211a mo130244b(boolean z) {
            this.f190733a.f190724y = z;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130237a(CAMERA_FACING_ID camera_facing_id) {
            this.f190733a.f190712m = (String) C85568t.m147473a().mo131557a("wide_camera_id", "-1");
            this.f190733a.f190711l = camera_facing_id;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130238a(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.f190733a.f190723x = camera_output_mode;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130239a(CAMERA_TYPE camera_type) {
            this.f190733a.f190708i = camera_type;
            this.f190733a.f190709j = false;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130240a(boolean z) {
            this.f190733a.f190714o = z;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130241a(int[] iArr) {
            this.f190733a.f190706g = iArr;
            this.f190733a.f190715p = EnumC85212b.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            return this;
        }

        /* renamed from: a */
        public final C85211a mo130236a(int i, int i2) {
            this.f190733a.f190705f = new VESize(i, i2);
            return this;
        }
    }

    /* renamed from: a */
    public final CAMERA_TYPE mo130183a() {
        if (!this.f190709j) {
            return this.f190708i;
        }
        if (this.f190691U == CAMERA_TYPE.NULL) {
            this.f190691U = m146512w();
        }
        return this.f190691U;
    }

    /* renamed from: h */
    public final boolean mo130187h() {
        if (this.f190700ad || ((Boolean) C85568t.m147473a().mo131557a("ve_camera_scene_diff_fps_opt", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int mo130188i() {
        int intValue = ((Integer) C85568t.m147473a().mo131557a("ve_retry_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.f190675E = intValue;
        }
        return this.f190675E;
    }

    /* renamed from: j */
    public final int mo130189j() {
        int intValue = ((Integer) C85568t.m147473a().mo131557a("ve_retry_start_preview_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.f190676F = intValue;
        }
        return this.f190676F;
    }

    /* renamed from: k */
    public final boolean mo130190k() {
        boolean z = false;
        if (this.f190688R || ((Boolean) C85568t.m147473a().mo131557a("ve_enable_refactor_camera_focus", (Object) false)).booleanValue()) {
            z = true;
        }
        this.f190688R = z;
        return z;
    }

    /* renamed from: p */
    public final boolean mo130195p() {
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("is_use_setrecordinghint", Boolean.valueOf(this.f190693W))).booleanValue();
        this.f190693W = booleanValue;
        return booleanValue;
    }

    /* renamed from: q */
    public final boolean mo130196q() {
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_camera_open_close_sync", Boolean.valueOf(this.f190694X))).booleanValue();
        this.f190694X = booleanValue;
        return booleanValue;
    }

    /* renamed from: r */
    public final boolean mo130197r() {
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_force_close_camera_when_timeout", Boolean.valueOf(this.f190695Y))).booleanValue();
        this.f190695Y = booleanValue;
        return booleanValue;
    }

    /* renamed from: s */
    public final boolean mo130198s() {
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_vboost", Boolean.valueOf(this.f190696Z))).booleanValue();
        this.f190696Z = booleanValue;
        return booleanValue;
    }

    /* renamed from: t */
    public final int mo130199t() {
        int intValue = ((Integer) C85568t.m147473a().mo131557a("ve_vboost_timeout", (Object) 500)).intValue();
        this.f190697aa = intValue;
        return intValue;
    }

    /* renamed from: u */
    public final int mo130200u() {
        int intValue = ((Integer) C85568t.m147473a().mo131557a("ve_camera_focus_timeout", (Object) 2500)).intValue();
        this.f190698ab = intValue;
        return intValue;
    }

    /* renamed from: v */
    public final int mo130201v() {
        int intValue = ((Integer) C85568t.m147473a().mo131557a("ve_enable_gc_for_camera_metadata", (Object) 0)).intValue();
        this.f190699ac = intValue;
        return intValue;
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_MODE_TYPE */
    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE,
        AR_MODE;
        
        public static final Parcelable.Creator<CAMERA_MODE_TYPE> CREATOR = new Parcelable.Creator<CAMERA_MODE_TYPE>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_MODE_TYPE.C852081 */

            static {
                Covode.recordClassIndex(99271);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_MODE_TYPE[] newArray(int i) {
                return new CAMERA_MODE_TYPE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_MODE_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_MODE_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99270);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$b */
    public enum EnumC85212b {
        DYNAMIC_FRAMERATE,
        FIXED_FRAMERATE_FOR_ALL,
        FIXED_FRAMERATE_FOR_REAR,
        DYNAMIC_FRAMERATE_WITHOUT_SELECT;

        static {
            Covode.recordClassIndex(99277);
        }
    }

    static {
        Covode.recordClassIndex(99260);
    }

    /* renamed from: b */
    public static boolean m146508b() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_disable_camera_hdr");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a.f191742b).booleanValue();
    }

    /* renamed from: c */
    public static boolean m146509c() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_enable_camera_noise_reduce");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a.f191742b).booleanValue();
    }

    /* renamed from: d */
    public static boolean m146510d() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_enable_camera_vendor_stable");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a.f191742b).booleanValue();
    }

    /* renamed from: e */
    public static boolean m146511e() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_enable_camera_metadata");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a.f191742b).booleanValue();
    }

    /* renamed from: g */
    public final int mo130186g() {
        C85568t.C85573d a;
        if (this.f190716q == 30 && (a = C85568t.m147473a().mo131556a("ve_camera_fps_max")) != null && (a.f191742b instanceof Integer)) {
            this.f190716q = ((Integer) a.f191742b).intValue();
        }
        return this.f190716q;
    }

    /* renamed from: l */
    public final boolean mo130191l() {
        C85568t.C85573d a;
        if (!this.f190717r && (a = C85568t.m147473a().mo131556a("ve_enable_yuv_buffer_capture")) != null && a.f191742b != null && (a.f191742b instanceof Boolean) && ((Boolean) a.f191742b).booleanValue()) {
            this.f190717r = true;
        }
        return this.f190717r;
    }

    /* renamed from: m */
    public final boolean mo130192m() {
        if (!this.f190720u) {
            boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_face_detection", Boolean.valueOf(this.f190720u))).booleanValue();
            this.f190720u = booleanValue;
            this.f190681K.putBoolean("useCameraFaceDetect", booleanValue);
        }
        return this.f190720u;
    }

    /* renamed from: n */
    public final boolean mo130193n() {
        this.f190692V = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_wide_fov_for_samsung", Boolean.valueOf(this.f190692V))).booleanValue();
        C85315al.m146639b(f190669a, "getWideFOV: " + this.f190692V);
        return this.f190692V;
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_CAPTURE_FLASH_STRATEGY */
    public enum CAMERA_CAPTURE_FLASH_STRATEGY implements Parcelable {
        PreAndMainStrategy,
        TorchFakeStrategy,
        FlashOnRealStrategy,
        FlashOnSimulatedStrategy;
        
        public static final Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY> CREATOR = new Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY.C852041 */

            static {
                Covode.recordClassIndex(99263);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_CAPTURE_FLASH_STRATEGY[] newArray(int i) {
                return new CAMERA_CAPTURE_FLASH_STRATEGY[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_CAPTURE_FLASH_STRATEGY createFromParcel(Parcel parcel) {
                return CAMERA_CAPTURE_FLASH_STRATEGY.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99262);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID */
    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD;
        
        public static final Parcelable.Creator<CAMERA_FACING_ID> CREATOR = new Parcelable.Creator<CAMERA_FACING_ID>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID.C852051 */

            static {
                Covode.recordClassIndex(99265);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_FACING_ID[] newArray(int i) {
                return new CAMERA_FACING_ID[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_FACING_ID createFromParcel(Parcel parcel) {
                return CAMERA_FACING_ID.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99264);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_FLASH_MODE */
    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Parcelable.Creator<CAMERA_FLASH_MODE> CREATOR = new Parcelable.Creator<CAMERA_FLASH_MODE>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE.C852061 */

            static {
                Covode.recordClassIndex(99267);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_FLASH_MODE[] newArray(int i) {
                return new CAMERA_FLASH_MODE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_FLASH_MODE createFromParcel(Parcel parcel) {
                return CAMERA_FLASH_MODE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99266);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_HW_LEVEL */
    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Parcelable.Creator<CAMERA_HW_LEVEL> CREATOR = new Parcelable.Creator<CAMERA_HW_LEVEL>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_HW_LEVEL.C852071 */

            static {
                Covode.recordClassIndex(99269);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_HW_LEVEL[] newArray(int i) {
                return new CAMERA_HW_LEVEL[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_HW_LEVEL createFromParcel(Parcel parcel) {
                return CAMERA_HW_LEVEL.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99268);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE */
    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME,
        TWO_SURFACES;
        
        public static final Parcelable.Creator<CAMERA_OUTPUT_MODE> CREATOR = new Parcelable.Creator<CAMERA_OUTPUT_MODE>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.C852091 */

            static {
                Covode.recordClassIndex(99273);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_OUTPUT_MODE[] newArray(int i) {
                return new CAMERA_OUTPUT_MODE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_OUTPUT_MODE createFromParcel(Parcel parcel) {
                return CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99272);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: w */
    private CAMERA_TYPE m146512w() {
        int i;
        CAMERA_TYPE camera_type = this.f190710k;
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_camera_type");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Integer)) {
            i = -1;
        } else {
            i = ((Integer) a.f191742b).intValue();
            if (i == 0) {
                C85568t.C85573d a2 = C85568t.m147473a().mo131556a("ve_is_in_camera2_blocklist");
                if (!(a2 == null || a2.f191742b == null || !(a2.f191742b instanceof Boolean))) {
                    camera_type = ((Boolean) a2.f191742b).booleanValue() ? CAMERA_TYPE.TYPE1 : CAMERA_TYPE.TYPE2;
                }
            } else {
                camera_type = m146507a(i);
            }
        }
        C85315al.m146637a(f190669a, "getCameraTypeFromConfigCenter, cameraType = " + i + ", realCameraType = " + camera_type);
        return camera_type;
    }

    /* renamed from: f */
    public final int[] mo130185f() {
        int intValue;
        if (!(this.f190715p == EnumC85212b.DYNAMIC_FRAMERATE_WITHOUT_SELECT || this.f190706g[0] != 7 || (intValue = ((Integer) C85568t.m147473a().mo131557a("ve_camera_fps_range", (Object) 7)).intValue()) == 0)) {
            this.f190706g[0] = intValue;
        }
        C85315al.m146637a(f190669a, "Camera FpsRange:[" + this.f190706g[0] + ", " + this.f190706g[1] + "]");
        return this.f190706g;
    }

    /* renamed from: o */
    public final EnumC85212b mo130194o() {
        if (this.f190715p == EnumC85212b.DYNAMIC_FRAMERATE) {
            Integer num = (Integer) C85568t.m147473a().mo131557a("frame_rate_strategy", (Object) 0);
            if (num.intValue() == 1) {
                this.f190715p = EnumC85212b.FIXED_FRAMERATE_FOR_ALL;
            } else if (num.intValue() == 2) {
                this.f190715p = EnumC85212b.FIXED_FRAMERATE_FOR_REAR;
            } else if (num.intValue() == 3) {
                this.f190715p = EnumC85212b.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            } else {
                this.f190715p = EnumC85212b.DYNAMIC_FRAMERATE;
            }
        }
        return this.f190715p;
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE */
    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_OGXM,
        TYPE_GNOB,
        TYPE_CamKit,
        TYPE_BEWO,
        TYPE_GNOB_Unit,
        TYPE_OGXM_V2,
        TYPE_GNOB_MEDIA,
        TYPE_VENDOR_RDHW,
        TYPE_VENDOR_GNOB;
        
        public static final Parcelable.Creator<CAMERA_TYPE> CREATOR = new Parcelable.Creator<CAMERA_TYPE>() {
            /* class com.p2082ss.android.vesdk.VECameraSettings.CAMERA_TYPE.C852101 */

            static {
                Covode.recordClassIndex(99275);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_TYPE[] newArray(int i) {
                return new CAMERA_TYPE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99274);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    private VECameraSettings() {
        this.f190702b = new int[]{2, 0, 1, 3};
        this.f190703c = new int[]{1, 2, 0, 3};
        this.f190704e = 30;
        this.f190705f = new VESize(720, 1280);
        this.f190706g = new int[]{7, 30};
        this.f190707h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f190708i = CAMERA_TYPE.TYPE1;
        this.f190691U = CAMERA_TYPE.NULL;
        this.f190709j = false;
        this.f190710k = CAMERA_TYPE.TYPE2;
        this.f190711l = CAMERA_FACING_ID.FACING_FRONT;
        this.f190712m = "-1";
        this.f190713n = "auto";
        this.f190714o = false;
        this.f190715p = EnumC85212b.DYNAMIC_FRAMERATE;
        this.f190692V = false;
        this.f190693W = false;
        this.f190694X = true;
        this.f190695Y = false;
        this.f190696Z = false;
        this.f190697aa = 50;
        this.f190698ab = 2500;
        this.f190699ac = 0;
        this.f190716q = 30;
        this.f190700ad = false;
        this.f190717r = false;
        this.f190718s = false;
        this.f190719t = 0;
        this.f190720u = false;
        this.f190721v = 1;
        this.f190722w = new VESize(-1, -1);
        this.f190723x = CAMERA_OUTPUT_MODE.SURFACE;
        this.f190724y = true;
        this.f190725z = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f190671A = false;
        this.f190672B = -1.0f;
        this.f190673C = false;
        this.f190674D = true;
        this.f190675E = 0;
        this.f190676F = 0;
        this.f190677G = false;
        this.f190678H = false;
        this.f190679I = "";
        this.f190680J = 1;
        this.f190682L = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.f190683M = false;
        this.f190684N = false;
        this.f190685O = false;
        this.f190686P = false;
        this.f190687Q = false;
        this.f190688R = false;
        this.f190689S = false;
        this.f190690T = false;
        this.f190701ae = false;
        this.f190708i = CAMERA_TYPE.TYPE1;
        this.f190711l = CAMERA_FACING_ID.FACING_FRONT;
        this.f190704e = 30;
        this.f190705f.width = 720;
        this.f190705f.height = 1280;
        this.f190681K = new Bundle();
    }

    /* synthetic */ VECameraSettings(byte b) {
        this();
    }

    /* renamed from: a */
    private static CAMERA_TYPE m146507a(int i) {
        switch (i) {
            case 1:
                return CAMERA_TYPE.TYPE_OGXM;
            case 2:
                return CAMERA_TYPE.TYPE_GNOB;
            case 3:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            default:
                return CAMERA_TYPE.TYPE2;
            case 4:
                return CAMERA_TYPE.TYPE_BEWO;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return CAMERA_TYPE.TYPE_GNOB_MEDIA;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return CAMERA_TYPE.TYPE_VENDOR_RDHW;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return CAMERA_TYPE.TYPE_VENDOR_GNOB;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return CAMERA_TYPE.TYPE_OGXM_V2;
        }
    }

    protected VECameraSettings(Parcel parcel) {
        CAMERA_HW_LEVEL camera_hw_level;
        CAMERA_TYPE camera_type;
        CAMERA_TYPE camera_type2;
        boolean z;
        CAMERA_FACING_ID camera_facing_id;
        boolean z2;
        EnumC85212b bVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        CAMERA_OUTPUT_MODE camera_output_mode;
        boolean z10;
        CAMERA_MODE_TYPE camera_mode_type;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        this.f190702b = new int[]{2, 0, 1, 3};
        this.f190703c = new int[]{1, 2, 0, 3};
        this.f190704e = 30;
        this.f190705f = new VESize(720, 1280);
        this.f190706g = new int[]{7, 30};
        this.f190707h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f190708i = CAMERA_TYPE.TYPE1;
        this.f190691U = CAMERA_TYPE.NULL;
        boolean z21 = false;
        this.f190709j = false;
        this.f190710k = CAMERA_TYPE.TYPE2;
        this.f190711l = CAMERA_FACING_ID.FACING_FRONT;
        this.f190712m = "-1";
        this.f190713n = "auto";
        this.f190714o = false;
        this.f190715p = EnumC85212b.DYNAMIC_FRAMERATE;
        this.f190692V = false;
        this.f190693W = false;
        this.f190694X = true;
        this.f190695Y = false;
        this.f190696Z = false;
        this.f190697aa = 50;
        this.f190698ab = 2500;
        this.f190699ac = 0;
        this.f190716q = 30;
        this.f190700ad = false;
        this.f190717r = false;
        this.f190718s = false;
        this.f190719t = 0;
        this.f190720u = false;
        this.f190721v = 1;
        this.f190722w = new VESize(-1, -1);
        this.f190723x = CAMERA_OUTPUT_MODE.SURFACE;
        this.f190724y = true;
        this.f190725z = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f190671A = false;
        this.f190672B = -1.0f;
        this.f190673C = false;
        this.f190674D = true;
        this.f190675E = 0;
        this.f190676F = 0;
        this.f190677G = false;
        this.f190678H = false;
        this.f190679I = "";
        this.f190680J = 1;
        this.f190682L = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.f190683M = false;
        this.f190684N = false;
        this.f190685O = false;
        this.f190686P = false;
        this.f190687Q = false;
        this.f190688R = false;
        this.f190689S = false;
        this.f190690T = false;
        this.f190701ae = false;
        this.f190702b = parcel.createIntArray();
        this.f190703c = parcel.createIntArray();
        this.f190704e = parcel.readInt();
        this.f190705f = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f190706g = parcel.createIntArray();
        int readInt = parcel.readInt();
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = null;
        if (readInt == -1) {
            camera_hw_level = null;
        } else {
            camera_hw_level = CAMERA_HW_LEVEL.values()[readInt];
        }
        this.f190707h = camera_hw_level;
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            camera_type = null;
        } else {
            camera_type = CAMERA_TYPE.values()[readInt2];
        }
        this.f190708i = camera_type;
        int readInt3 = parcel.readInt();
        if (readInt3 == -1) {
            camera_type2 = null;
        } else {
            camera_type2 = CAMERA_TYPE.values()[readInt3];
        }
        this.f190691U = camera_type2;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f190709j = z;
        int readInt4 = parcel.readInt();
        if (readInt4 == -1) {
            camera_facing_id = null;
        } else {
            camera_facing_id = CAMERA_FACING_ID.values()[readInt4];
        }
        this.f190711l = camera_facing_id;
        this.f190712m = parcel.readString();
        this.f190713n = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f190714o = z2;
        int readInt5 = parcel.readInt();
        if (readInt5 == -1) {
            bVar = null;
        } else {
            bVar = EnumC85212b.values()[readInt5];
        }
        this.f190715p = bVar;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f190692V = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f190693W = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f190694X = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f190695Y = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f190696Z = z7;
        this.f190697aa = parcel.readInt();
        this.f190698ab = parcel.readInt();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f190718s = z8;
        this.f190719t = parcel.readInt();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f190720u = z9;
        this.f190721v = parcel.readByte();
        this.f190722w = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        int readInt6 = parcel.readInt();
        if (readInt6 == -1) {
            camera_output_mode = null;
        } else {
            camera_output_mode = CAMERA_OUTPUT_MODE.values()[readInt6];
        }
        this.f190723x = camera_output_mode;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f190724y = z10;
        int readInt7 = parcel.readInt();
        if (readInt7 == -1) {
            camera_mode_type = null;
        } else {
            camera_mode_type = CAMERA_MODE_TYPE.values()[readInt7];
        }
        this.f190725z = camera_mode_type;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f190671A = z11;
        this.f190672B = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f190673C = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f190674D = z13;
        this.f190675E = parcel.readInt();
        this.f190676F = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f190677G = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f190678H = z15;
        this.f190679I = parcel.readString();
        this.f190680J = parcel.readInt();
        this.f190681K = parcel.readBundle();
        int readInt8 = parcel.readInt();
        this.f190682L = readInt8 != -1 ? CAMERA_CAPTURE_FLASH_STRATEGY.values()[readInt8] : camera_capture_flash_strategy;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.f190683M = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.f190684N = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.f190688R = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.f190689S = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.f190690T = z20;
        this.f190717r = parcel.readByte() != 0 ? true : z21;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        parcel.writeIntArray(this.f190702b);
        parcel.writeIntArray(this.f190703c);
        parcel.writeInt(this.f190704e);
        parcel.writeParcelable(this.f190705f, i);
        parcel.writeIntArray(this.f190706g);
        CAMERA_HW_LEVEL camera_hw_level = this.f190707h;
        int i2 = -1;
        if (camera_hw_level == null) {
            ordinal = -1;
        } else {
            ordinal = camera_hw_level.ordinal();
        }
        parcel.writeInt(ordinal);
        CAMERA_TYPE camera_type = this.f190708i;
        if (camera_type == null) {
            ordinal2 = -1;
        } else {
            ordinal2 = camera_type.ordinal();
        }
        parcel.writeInt(ordinal2);
        CAMERA_TYPE camera_type2 = this.f190691U;
        if (camera_type2 == null) {
            ordinal3 = -1;
        } else {
            ordinal3 = camera_type2.ordinal();
        }
        parcel.writeInt(ordinal3);
        parcel.writeByte(this.f190709j ? (byte) 1 : 0);
        CAMERA_FACING_ID camera_facing_id = this.f190711l;
        if (camera_facing_id == null) {
            ordinal4 = -1;
        } else {
            ordinal4 = camera_facing_id.ordinal();
        }
        parcel.writeInt(ordinal4);
        parcel.writeString(this.f190712m);
        parcel.writeString(this.f190713n);
        parcel.writeByte(this.f190714o ? (byte) 1 : 0);
        EnumC85212b bVar = this.f190715p;
        if (bVar == null) {
            ordinal5 = -1;
        } else {
            ordinal5 = bVar.ordinal();
        }
        parcel.writeInt(ordinal5);
        parcel.writeByte(this.f190692V ? (byte) 1 : 0);
        parcel.writeByte(this.f190693W ? (byte) 1 : 0);
        parcel.writeByte(this.f190694X ? (byte) 1 : 0);
        parcel.writeByte(this.f190695Y ? (byte) 1 : 0);
        parcel.writeByte(this.f190696Z ? (byte) 1 : 0);
        parcel.writeInt(this.f190697aa);
        parcel.writeInt(this.f190698ab);
        parcel.writeByte(this.f190718s ? (byte) 1 : 0);
        parcel.writeInt(this.f190719t);
        parcel.writeByte(this.f190720u ? (byte) 1 : 0);
        parcel.writeByte(this.f190721v);
        parcel.writeParcelable(this.f190722w, i);
        CAMERA_OUTPUT_MODE camera_output_mode = this.f190723x;
        if (camera_output_mode == null) {
            ordinal6 = -1;
        } else {
            ordinal6 = camera_output_mode.ordinal();
        }
        parcel.writeInt(ordinal6);
        parcel.writeByte(this.f190724y ? (byte) 1 : 0);
        CAMERA_MODE_TYPE camera_mode_type = this.f190725z;
        if (camera_mode_type == null) {
            ordinal7 = -1;
        } else {
            ordinal7 = camera_mode_type.ordinal();
        }
        parcel.writeInt(ordinal7);
        parcel.writeByte(this.f190671A ? (byte) 1 : 0);
        parcel.writeFloat(this.f190672B);
        parcel.writeByte(this.f190673C ? (byte) 1 : 0);
        parcel.writeByte(this.f190674D ? (byte) 1 : 0);
        parcel.writeInt(this.f190675E);
        parcel.writeInt(this.f190676F);
        parcel.writeByte(this.f190677G ? (byte) 1 : 0);
        parcel.writeByte(this.f190678H ? (byte) 1 : 0);
        parcel.writeString(this.f190679I);
        parcel.writeInt(this.f190680J);
        parcel.writeBundle(this.f190681K);
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = this.f190682L;
        if (camera_capture_flash_strategy != null) {
            i2 = camera_capture_flash_strategy.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeByte(this.f190683M ? (byte) 1 : 0);
        parcel.writeByte(this.f190684N ? (byte) 1 : 0);
        parcel.writeByte(this.f190688R ? (byte) 1 : 0);
        parcel.writeByte(this.f190689S ? (byte) 1 : 0);
        parcel.writeByte(this.f190690T ? (byte) 1 : 0);
        parcel.writeByte(this.f190717r ? (byte) 1 : 0);
    }
}
