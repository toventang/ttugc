package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VERecordData */
public class VERecordData implements Parcelable {
    public static final Parcelable.Creator<VERecordData> CREATOR = new Parcelable.Creator<VERecordData>() {
        /* class com.p2082ss.android.vesdk.VERecordData.C852631 */

        static {
            Covode.recordClassIndex(99354);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VERecordData[] newArray(int i) {
            return new VERecordData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VERecordData createFromParcel(Parcel parcel) {
            return new VERecordData(parcel);
        }
    };

    /* renamed from: a */
    static final String f190791a = VERecordData.class.getSimpleName();

    /* renamed from: f */
    public static final String[] f190792f = {"counts", "audioLengths", "speeds", "musicStartTime", "encodeMode", "offset", "videoQuality", "random", "duatStartTime", "audioEffects", "newSync", "encodeMethod", "videoLengths"};

    /* renamed from: g */
    public static final String[] f190793g = {"_frag_v", "_frag_a"};

    /* renamed from: b */
    public List<VERecordSegmentData> f190794b;

    /* renamed from: c */
    public boolean f190795c;

    /* renamed from: d */
    public String f190796d;

    /* renamed from: e */
    public String f190797e;

    public int describeContents() {
        return 0;
    }

    private VERecordData() {
    }

    /* renamed from: com.ss.android.vesdk.VERecordData$VERecordSegmentData */
    public static final class VERecordSegmentData implements Parcelable {
        public static final Parcelable.Creator<VERecordSegmentData> CREATOR = new Parcelable.Creator<VERecordSegmentData>() {
            /* class com.p2082ss.android.vesdk.VERecordData.VERecordSegmentData.C852641 */

            static {
                Covode.recordClassIndex(99356);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VERecordSegmentData[] newArray(int i) {
                return new VERecordSegmentData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VERecordSegmentData createFromParcel(Parcel parcel) {
                return new VERecordSegmentData(parcel);
            }
        };

        /* renamed from: a */
        public String f190798a;

        /* renamed from: b */
        public String f190799b;

        /* renamed from: c */
        public long f190800c;

        /* renamed from: d */
        public long f190801d;

        /* renamed from: e */
        public float f190802e;

        /* renamed from: f */
        public float f190803f = 1.0f;

        /* renamed from: g */
        public ROTATE_DEGREE f190804g;

        /* renamed from: h */
        public long f190805h;

        /* renamed from: i */
        public long f190806i;

        /* renamed from: j */
        public boolean f190807j;

        /* renamed from: k */
        public long f190808k;

        /* renamed from: l */
        public long f190809l;

        /* renamed from: m */
        public boolean f190810m;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99355);
        }

        protected VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.f190798a = parcel.readString();
            this.f190799b = parcel.readString();
            this.f190800c = parcel.readLong();
            this.f190801d = parcel.readLong();
            this.f190803f = parcel.readFloat();
            this.f190802e = parcel.readFloat();
            this.f190804g = (ROTATE_DEGREE) parcel.readParcelable(ROTATE_DEGREE.class.getClassLoader());
            this.f190805h = parcel.readLong();
            this.f190806i = parcel.readLong();
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f190807j = z;
            this.f190808k = parcel.readLong();
            this.f190809l = parcel.readLong();
            this.f190810m = parcel.readByte() == 0 ? false : z2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f190798a);
            parcel.writeString(this.f190799b);
            parcel.writeLong(this.f190800c);
            parcel.writeLong(this.f190801d);
            parcel.writeFloat(this.f190803f);
            parcel.writeFloat(this.f190802e);
            parcel.writeParcelable(this.f190804g, i);
            parcel.writeLong(this.f190805h);
            parcel.writeLong(this.f190806i);
            parcel.writeByte(this.f190807j ? (byte) 1 : 0);
            parcel.writeLong(this.f190808k);
            parcel.writeLong(this.f190809l);
            parcel.writeByte(this.f190810m ? (byte) 1 : 0);
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, long j3, long j4, boolean z) {
            this.f190798a = str;
            this.f190799b = str2;
            this.f190800c = j;
            this.f190801d = j2;
            this.f190802e = f;
            this.f190805h = j3;
            this.f190808k = j3;
            this.f190806i = j4;
            this.f190809l = j4;
            this.f190807j = z;
        }
    }

    static {
        Covode.recordClassIndex(99353);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo130358a() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VERecordData.mo130358a():boolean");
    }

    protected VERecordData(Parcel parcel) {
        boolean z;
        this.f190794b = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f190795c = z;
        this.f190796d = parcel.readString();
        this.f190797e = parcel.readString();
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.f190794b = list;
        this.f190795c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f190794b);
        parcel.writeByte(this.f190795c ? (byte) 1 : 0);
        parcel.writeString(this.f190796d);
        parcel.writeString(this.f190797e);
    }

    /* renamed from: a */
    public final VERecordSegmentData mo130357a(int i, VERecordData vERecordData) {
        List<VERecordSegmentData> list;
        String str = f190791a;
        C85315al.m146637a(str, "replaceSegmentData...");
        if (i < 0 || i >= this.f190794b.size() || (list = vERecordData.f190794b) == null || list.size() == 0) {
            C85315al.m146642d(str, "Parameter error");
            return null;
        }
        VERecordSegmentData remove = this.f190794b.remove(i);
        long j = remove.f190800c;
        Iterator<VERecordSegmentData> it = vERecordData.f190794b.iterator();
        long j2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VERecordSegmentData next = it.next();
            if ((next.f190800c + j2) - j >= 0) {
                long j3 = j - j2;
                next.f190801d = j3;
                next.f190800c = j3;
                next.f190809l = j3;
                next.f190806i = j3;
                this.f190794b.add(i, next);
                break;
            }
            this.f190794b.add(i, next);
            j2 += next.f190800c;
            i++;
        }
        return remove;
    }

    /* renamed from: a */
    public final int mo130356a(long j, long j2) {
        C85315al.m146637a(f190791a, "setTimeRange, start: " + j + " end: " + j2);
        if (j2 <= j) {
            return -100;
        }
        long j3 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.f190794b) {
            long j4 = vERecordSegmentData.f190806i - vERecordSegmentData.f190805h;
            if (j3 < j || j3 + j4 > j2) {
                if (j3 + j4 <= j || j3 >= j2) {
                    vERecordSegmentData.f190808k = 0;
                    vERecordSegmentData.f190809l = 0;
                    vERecordSegmentData.f190807j = false;
                } else {
                    long j5 = (j - j3) + vERecordSegmentData.f190805h;
                    long j6 = (j2 - j3) + vERecordSegmentData.f190805h;
                    if (j5 <= vERecordSegmentData.f190805h) {
                        j5 = vERecordSegmentData.f190805h;
                    }
                    vERecordSegmentData.f190808k = j5;
                    if (j6 > vERecordSegmentData.f190806i) {
                        j6 = vERecordSegmentData.f190806i;
                    }
                    vERecordSegmentData.f190809l = j6;
                }
            }
            j3 += j4;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0180, code lost:
        if (r0 <= 0) goto L_0x0182;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.vesdk.VERecordData m146578a(com.p2082ss.android.vesdk.runtime.AbstractC85556e r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 544
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VERecordData.m146578a(com.ss.android.vesdk.runtime.e, boolean):com.ss.android.vesdk.VERecordData");
    }
}
