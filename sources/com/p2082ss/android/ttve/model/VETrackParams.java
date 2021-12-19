package com.p2082ss.android.ttve.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.model.VETrackParams */
public class VETrackParams implements Parcelable {
    public static final Parcelable.Creator<VETrackParams> CREATOR = new Parcelable.Creator<VETrackParams>() {
        /* class com.p2082ss.android.ttve.model.VETrackParams.C306701 */

        static {
            Covode.recordClassIndex(37237);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VETrackParams[] newArray(int i) {
            return new VETrackParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VETrackParams createFromParcel(Parcel parcel) {
            return new VETrackParams(parcel);
        }
    };

    /* renamed from: a */
    public List<String> f73346a;

    /* renamed from: b */
    public List<Integer> f73347b;

    /* renamed from: c */
    public List<Integer> f73348c;

    /* renamed from: d */
    public List<Integer> f73349d;

    /* renamed from: e */
    public List<Integer> f73350e;

    /* renamed from: f */
    public List<Double> f73351f;

    /* renamed from: g */
    public int f73352g;

    /* renamed from: h */
    public EnumC30672b f73353h;

    /* renamed from: i */
    public int f73354i;

    /* renamed from: com.ss.android.ttve.model.VETrackParams$a */
    public static class C30671a {

        /* renamed from: a */
        public VETrackParams f73355a = new VETrackParams((byte) 0);

        static {
            Covode.recordClassIndex(37238);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37236);
    }

    private VETrackParams() {
        this.f73352g = -1;
        this.f73353h = EnumC30672b.DEFAULT;
    }

    /* renamed from: com.ss.android.ttve.model.VETrackParams$b */
    public enum EnumC30672b {
        DEFAULT,
        HOST,
        External;

        static {
            Covode.recordClassIndex(37239);
        }
    }

    public String toString() {
        return "VETrackParams{paths=" + this.f73346a + ", trimIns=" + this.f73347b + ", trimOuts=" + this.f73348c + ", seqIns=" + this.f73349d + ", seqOuts=" + this.f73350e + ", speeds=" + this.f73351f + ", layer=" + this.f73352g + ", trackPriority=" + this.f73353h + ", extFlag=" + this.f73354i + '}';
    }

    /* synthetic */ VETrackParams(byte b) {
        this();
    }

    protected VETrackParams(Parcel parcel) {
        EnumC30672b bVar;
        this.f73352g = -1;
        this.f73353h = EnumC30672b.DEFAULT;
        this.f73346a = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        this.f73347b = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f73348c = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.f73349d = arrayList3;
        parcel.readList(arrayList3, Integer.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.f73350e = arrayList4;
        parcel.readList(arrayList4, Integer.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.f73351f = arrayList5;
        parcel.readList(arrayList5, Double.class.getClassLoader());
        this.f73352g = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            bVar = null;
        } else {
            bVar = EnumC30672b.values()[readInt];
        }
        this.f73353h = bVar;
        this.f73354i = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeStringList(this.f73346a);
        parcel.writeList(this.f73347b);
        parcel.writeList(this.f73348c);
        parcel.writeList(this.f73349d);
        parcel.writeList(this.f73350e);
        parcel.writeList(this.f73351f);
        parcel.writeInt(this.f73352g);
        EnumC30672b bVar = this.f73353h;
        if (bVar == null) {
            ordinal = -1;
        } else {
            ordinal = bVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.f73354i);
    }
}
