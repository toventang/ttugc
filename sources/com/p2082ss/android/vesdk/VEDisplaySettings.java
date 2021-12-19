package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.ss.android.vesdk.VEDisplaySettings */
public class VEDisplaySettings implements Parcelable {
    public static final Parcelable.Creator<VEDisplaySettings> CREATOR = new Parcelable.Creator<VEDisplaySettings>() {
        /* class com.p2082ss.android.vesdk.VEDisplaySettings.C852161 */

        static {
            Covode.recordClassIndex(99285);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEDisplaySettings[] newArray(int i) {
            return new VEDisplaySettings[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEDisplaySettings createFromParcel(Parcel parcel) {
            return new VEDisplaySettings(parcel);
        }
    };

    /* renamed from: a */
    public int f190736a;

    /* renamed from: b */
    public int f190737b;

    /* renamed from: c */
    public EnumC85219c f190738c;

    /* renamed from: d */
    public int f190739d;

    /* renamed from: e */
    public int f190740e;

    /* renamed from: f */
    public int f190741f;

    /* renamed from: g */
    public long f190742g;

    /* renamed from: h */
    public float f190743h;

    /* renamed from: i */
    public EnumC85321aq f190744i;

    /* renamed from: j */
    public VESize f190745j;

    /* renamed from: k */
    public VESize f190746k;

    /* renamed from: l */
    public VESize f190747l;

    /* renamed from: m */
    public boolean f190748m;

    /* renamed from: n */
    public EnumC85218b f190749n;

    /* renamed from: o */
    public float f190750o;

    /* renamed from: com.ss.android.vesdk.VEDisplaySettings$a */
    public static final class C85217a {

        /* renamed from: a */
        public final VEDisplaySettings f190751a = new VEDisplaySettings((byte) 0);

        static {
            Covode.recordClassIndex(99286);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99284);
    }

    private VEDisplaySettings() {
        this.f190738c = EnumC85219c.SCALE_MODE_CENTER_INSIDE;
        this.f190746k = new VESize(0, 0);
        this.f190747l = new VESize(0, 0);
        this.f190748m = false;
        this.f190749n = EnumC85218b.NONE;
        this.f190750o = 0.0f;
    }

    /* renamed from: com.ss.android.vesdk.VEDisplaySettings$b */
    public enum EnumC85218b {
        NONE,
        GAUSSIAN_BLUR;

        static {
            Covode.recordClassIndex(99287);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEDisplaySettings$c */
    public enum EnumC85219c {
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_FIT_FULL,
        SCALE_MODE_USER_DEF;

        static {
            Covode.recordClassIndex(99288);
        }
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f190736a), Integer.valueOf(this.f190737b), this.f190738c, Integer.valueOf(this.f190739d), Integer.valueOf(this.f190740e), Integer.valueOf(this.f190741f), Long.valueOf(this.f190742g), Float.valueOf(this.f190743h), this.f190744i, this.f190745j, this.f190746k, this.f190747l, Boolean.valueOf(this.f190748m), this.f190749n, Float.valueOf(this.f190750o));
    }

    public String toString() {
        return "VEDisplaySettings{mTranslateX=" + this.f190736a + ", mTranslateY=" + this.f190737b + ", mFitMode=" + this.f190738c + ", mRotation=" + this.f190739d + ", mBgColor=" + this.f190742g + ", mDisplayRatio=" + this.f190743h + ", mDisplayRatioMode=" + this.f190744i + ", mRenderSize=" + this.f190745j + ", mLayoutSize=" + this.f190746k + ", mEffect=" + this.f190749n + ", mEffectIntensity=" + this.f190750o + '}';
    }

    /* synthetic */ VEDisplaySettings(byte b) {
        this();
    }

    protected VEDisplaySettings(Parcel parcel) {
        EnumC85219c cVar;
        this.f190738c = EnumC85219c.SCALE_MODE_CENTER_INSIDE;
        this.f190746k = new VESize(0, 0);
        this.f190747l = new VESize(0, 0);
        this.f190748m = false;
        this.f190749n = EnumC85218b.NONE;
        this.f190750o = 0.0f;
        this.f190736a = parcel.readInt();
        this.f190737b = parcel.readInt();
        int readInt = parcel.readInt();
        EnumC85321aq aqVar = null;
        if (readInt == -1) {
            cVar = null;
        } else {
            cVar = EnumC85219c.values()[readInt];
        }
        this.f190738c = cVar;
        this.f190739d = parcel.readInt();
        this.f190740e = parcel.readInt();
        this.f190741f = parcel.readInt();
        this.f190742g = (long) parcel.readInt();
        this.f190743h = parcel.readFloat();
        int readInt2 = parcel.readInt();
        this.f190744i = readInt2 != -1 ? EnumC85321aq.values()[readInt2] : aqVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VEDisplaySettings vEDisplaySettings = (VEDisplaySettings) obj;
            if (this.f190736a == vEDisplaySettings.f190736a && this.f190737b == vEDisplaySettings.f190737b && this.f190739d == vEDisplaySettings.f190739d && this.f190740e == vEDisplaySettings.f190740e && this.f190741f == vEDisplaySettings.f190741f && this.f190742g == vEDisplaySettings.f190742g && Float.compare(vEDisplaySettings.f190743h, this.f190743h) == 0 && this.f190748m == vEDisplaySettings.f190748m && Float.compare(vEDisplaySettings.f190750o, this.f190750o) == 0 && this.f190738c == vEDisplaySettings.f190738c && this.f190744i == vEDisplaySettings.f190744i && this.f190745j.equals(vEDisplaySettings.f190745j) && this.f190746k.equals(vEDisplaySettings.f190746k) && this.f190747l.equals(vEDisplaySettings.f190747l) && this.f190749n == vEDisplaySettings.f190749n) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeInt(this.f190736a);
        parcel.writeInt(this.f190737b);
        EnumC85219c cVar = this.f190738c;
        int i2 = -1;
        if (cVar == null) {
            ordinal = -1;
        } else {
            ordinal = cVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.f190739d);
        parcel.writeInt(this.f190740e);
        parcel.writeInt(this.f190741f);
        parcel.writeLong(this.f190742g);
        parcel.writeFloat(this.f190743h);
        EnumC85321aq aqVar = this.f190744i;
        if (aqVar != null) {
            i2 = aqVar.ordinal();
        }
        parcel.writeInt(i2);
    }
}
