package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam */
public final class ClientCherEffectParam implements Parcelable, Serializable {
    public static final C69723a CREATOR = new C69723a((byte) 0);
    @AbstractC27891c(mo46611a = "matrix")

    /* renamed from: a */
    private String[] f155671a;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: b */
    private double[] f155672b;
    @AbstractC27891c(mo46611a = "segUseCher")

    /* renamed from: c */
    private boolean[] f155673c;

    static {
        Covode.recordClassIndex(82105);
    }

    public ClientCherEffectParam() {
        this(null, null, null, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam$a */
    public static final class C69723a implements Parcelable.Creator<ClientCherEffectParam> {
        static {
            Covode.recordClassIndex(82106);
        }

        private C69723a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClientCherEffectParam[] newArray(int i) {
            return new ClientCherEffectParam[i];
        }

        public /* synthetic */ C69723a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClientCherEffectParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ClientCherEffectParam(parcel);
        }
    }

    public final double[] getDuration() {
        return this.f155672b;
    }

    public final String[] getMatrix() {
        return this.f155671a;
    }

    public final boolean[] getSegUseCher() {
        return this.f155673c;
    }

    public final void setDuration(double[] dArr) {
        this.f155672b = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.f155671a = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.f155673c = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClientCherEffectParam(Parcel parcel) {
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
        C89219l.m154721d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeStringArray(this.f155671a);
        parcel.writeDoubleArray(this.f155672b);
        parcel.writeBooleanArray(this.f155673c);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f155671a = strArr;
        this.f155672b = dArr;
        this.f155673c = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : dArr, (i & 4) != 0 ? null : zArr);
    }
}
