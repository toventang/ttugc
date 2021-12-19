package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.VEEditorModel */
public class VEEditorModel implements Parcelable {
    public static final Parcelable.Creator<VEEditorModel> CREATOR = new Parcelable.Creator<VEEditorModel>() {
        /* class com.p2082ss.android.vesdk.VEEditorModel.C852201 */

        static {
            Covode.recordClassIndex(99290);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEEditorModel[] newArray(int i) {
            return new VEEditorModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEEditorModel createFromParcel(Parcel parcel) {
            return new VEEditorModel(parcel);
        }
    };

    /* renamed from: A */
    public float f190754A;

    /* renamed from: B */
    public float f190755B;

    /* renamed from: C */
    public boolean f190756C;

    /* renamed from: D */
    public C85581w.EnumC85612k f190757D;

    /* renamed from: E */
    public C85581w.EnumC85614m f190758E;

    /* renamed from: a */
    public String f190759a;

    /* renamed from: b */
    public int f190760b;

    /* renamed from: c */
    public int f190761c;

    /* renamed from: d */
    public boolean f190762d;

    /* renamed from: e */
    public C85581w.EnumC85613l f190763e;

    /* renamed from: f */
    public boolean f190764f;

    /* renamed from: g */
    public int f190765g;

    /* renamed from: h */
    public int f190766h;

    /* renamed from: i */
    public int f190767i;

    /* renamed from: j */
    public String f190768j;

    /* renamed from: k */
    public int f190769k;

    /* renamed from: l */
    public int f190770l;

    /* renamed from: m */
    public int f190771m;

    /* renamed from: n */
    public String[] f190772n;

    /* renamed from: o */
    public String[] f190773o;

    /* renamed from: p */
    public String[] f190774p;

    /* renamed from: q */
    public int f190775q;

    /* renamed from: r */
    public int f190776r;

    /* renamed from: s */
    public String f190777s;

    /* renamed from: t */
    public String f190778t;

    /* renamed from: u */
    public double f190779u;

    /* renamed from: v */
    public double f190780v;

    /* renamed from: w */
    public double f190781w;

    /* renamed from: x */
    public double f190782x;

    /* renamed from: y */
    public String f190783y;

    /* renamed from: z */
    public String f190784z;

    public int describeContents() {
        return 0;
    }

    public VEEditorModel() {
    }

    static {
        Covode.recordClassIndex(99289);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectXML\":\"").append(this.f190759a).append('\"');
        sb.append(",\"inPoint\":").append(this.f190760b);
        sb.append(",\"outputPoint\":").append(this.f190761c);
        sb.append(",\"reverseDone\":").append(this.f190762d);
        sb.append(",\"videoOutRes\":").append(this.f190763e);
        sb.append(",\"separateAV\":").append(this.f190764f);
        sb.append(",\"masterTrackIndex\":").append(this.f190765g);
        sb.append(",\"hostTrackIndex\":").append(this.f190766h);
        sb.append(",\"audioEffectFilterIndex\":").append(this.f190767i);
        sb.append(",\"modelDir\":\"").append(this.f190768j).append('\"');
        sb.append(",\"colorFilterIndex\":").append(this.f190769k);
        sb.append(",\"effectHDRFilterIndex\":").append(this.f190770l);
        sb.append(",\"mLensHDRFilterIndex\":").append(this.f190771m);
        sb.append(",\"videoPaths\":").append(Arrays.toString(this.f190772n));
        sb.append(",\"audioPaths\":").append(Arrays.toString(this.f190773o));
        sb.append(",\"transitions\":").append(Arrays.toString(this.f190774p));
        sb.append(",\"backgroundColor\":").append(this.f190775q);
        sb.append(",\"videoBackgroundColor\":").append(this.f190776r);
        sb.append(",\"outputFile\":\"").append(this.f190777s).append('\"');
        sb.append(",\"watermarkFile\":\"").append(this.f190778t).append('\"');
        sb.append(",\"watermarkWidth\":").append(this.f190779u);
        sb.append(",\"watermarkHeight\":").append(this.f190780v);
        sb.append(",\"watermarkOffsetX\":").append(this.f190781w);
        sb.append(",\"watermarkOffsetY\":").append(this.f190782x);
        sb.append(",\"colorFilterLeftPath\":\"").append(this.f190783y).append('\"');
        sb.append(",\"colorFilterRightPath\":\"").append(this.f190784z).append('\"');
        sb.append(",\"colorFilterPosition\":").append(this.f190754A);
        sb.append(",\"colorFilterIntensity\":").append(this.f190755B);
        sb.append(",\"useColorFilterResIntensity\":").append(this.f190756C);
        sb.append(",\"videoGravity\":").append(this.f190757D);
        sb.append(",\"videoScaleType\":").append(this.f190758E);
        sb.append('}');
        return sb.toString();
    }

    protected VEEditorModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f190759a = parcel.readString();
        this.f190760b = parcel.readInt();
        this.f190761c = parcel.readInt();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f190762d = z;
        this.f190763e = C85581w.EnumC85613l.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f190764f = z2;
        this.f190765g = parcel.readInt();
        this.f190766h = parcel.readInt();
        this.f190767i = parcel.readInt();
        this.f190768j = parcel.readString();
        this.f190769k = parcel.readInt();
        this.f190770l = parcel.readInt();
        this.f190771m = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            String[] strArr = new String[readInt];
            this.f190772n = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.f190772n = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            String[] strArr2 = new String[readInt2];
            this.f190773o = strArr2;
            parcel.readStringArray(strArr2);
        } else {
            this.f190773o = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            String[] strArr3 = new String[readInt3];
            this.f190774p = strArr3;
            parcel.readStringArray(strArr3);
        } else {
            this.f190774p = null;
        }
        this.f190775q = parcel.readInt();
        this.f190777s = parcel.readString();
        this.f190778t = parcel.readString();
        this.f190779u = parcel.readDouble();
        this.f190780v = parcel.readDouble();
        this.f190781w = parcel.readDouble();
        this.f190782x = parcel.readDouble();
        this.f190783y = parcel.readString();
        this.f190784z = parcel.readString();
        this.f190754A = parcel.readFloat();
        this.f190755B = parcel.readFloat();
        this.f190756C = parcel.readInt() == 1 ? true : z3;
        this.f190757D = C85581w.EnumC85612k.values()[parcel.readInt()];
        this.f190758E = C85581w.EnumC85614m.values()[parcel.readInt()];
        this.f190776r = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f190759a);
        parcel.writeInt(this.f190760b);
        parcel.writeInt(this.f190761c);
        parcel.writeInt(this.f190762d ? 1 : 0);
        parcel.writeInt(this.f190763e.ordinal());
        parcel.writeInt(this.f190764f ? 1 : 0);
        parcel.writeInt(this.f190765g);
        parcel.writeInt(this.f190766h);
        parcel.writeInt(this.f190767i);
        parcel.writeString(this.f190768j);
        parcel.writeInt(this.f190769k);
        parcel.writeInt(this.f190770l);
        parcel.writeInt(this.f190771m);
        String[] strArr = this.f190772n;
        if (strArr != null) {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.f190772n);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr2 = this.f190773o;
        if (strArr2 != null) {
            parcel.writeInt(strArr2.length);
            parcel.writeStringArray(this.f190773o);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr3 = this.f190774p;
        if (strArr3 != null) {
            parcel.writeInt(strArr3.length);
            parcel.writeStringArray(this.f190774p);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.f190775q);
        parcel.writeString(this.f190777s);
        parcel.writeString(this.f190778t);
        parcel.writeDouble(this.f190779u);
        parcel.writeDouble(this.f190780v);
        parcel.writeDouble(this.f190781w);
        parcel.writeDouble(this.f190782x);
        parcel.writeString(this.f190783y);
        parcel.writeString(this.f190784z);
        parcel.writeFloat(this.f190754A);
        parcel.writeFloat(this.f190755B);
        parcel.writeInt(this.f190756C ? 1 : 0);
        parcel.writeInt(this.f190757D.ordinal());
        parcel.writeInt(this.f190758E.ordinal());
        parcel.writeInt(this.f190776r);
    }
}
