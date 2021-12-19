package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;

public final class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new Parcelable.Creator<AuthResult>() {
        /* class com.bytedance.lobby.auth.AuthResult.C208821 */

        static {
            Covode.recordClassIndex(24470);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i) {
            return new AuthResult[0];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public boolean f49367a;

    /* renamed from: b */
    public transient boolean f49368b;

    /* renamed from: c */
    public C20891c f49369c;

    /* renamed from: d */
    public String f49370d;

    /* renamed from: e */
    public String f49371e;

    /* renamed from: f */
    public String f49372f;

    /* renamed from: g */
    public String f49373g;

    /* renamed from: h */
    public long f49374h;

    /* renamed from: i */
    public int f49375i;

    /* renamed from: j */
    public Bundle f49376j;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.lobby.auth.AuthResult$a */
    public static final class C20883a {

        /* renamed from: a */
        public boolean f49377a;

        /* renamed from: b */
        public C20891c f49378b;

        /* renamed from: c */
        public String f49379c;

        /* renamed from: d */
        public String f49380d = "";

        /* renamed from: e */
        public String f49381e = "";

        /* renamed from: f */
        public String f49382f = "";

        /* renamed from: g */
        public long f49383g;

        /* renamed from: h */
        public int f49384h;

        /* renamed from: i */
        public Bundle f49385i;

        static {
            Covode.recordClassIndex(24471);
        }

        /* renamed from: a */
        public final AuthResult mo34319a() {
            return new AuthResult(this, (byte) 0);
        }

        public C20883a(String str, int i) {
            this.f49379c = str;
            this.f49384h = i;
        }
    }

    public final String toString() {
        return super.toString();
    }

    static {
        Covode.recordClassIndex(24469);
    }

    private AuthResult(Parcel parcel) {
        this.f49370d = "";
        this.f49371e = "";
        this.f49372f = "";
        this.f49373g = "";
        boolean z = parcel.readInt() != 1 ? false : true;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        C20883a aVar = new C20883a(readString, readInt);
        aVar.f49377a = z;
        aVar.f49378b = (C20891c) parcel.readSerializable();
        aVar.f49380d = readString2;
        aVar.f49381e = readString3;
        aVar.f49382f = readString4;
        aVar.f49383g = readLong;
        aVar.f49385i = readBundle;
        aVar.mo34319a();
    }

    private AuthResult(C20883a aVar) {
        Bundle bundle;
        this.f49370d = "";
        this.f49371e = "";
        this.f49372f = "";
        this.f49373g = "";
        boolean z = aVar.f49377a;
        this.f49367a = z;
        boolean z2 = true;
        if (!z) {
            if (aVar.f49378b == null) {
                this.f49369c = new C20891c(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.f49369c = aVar.f49378b;
            }
        }
        C20891c cVar = this.f49369c;
        if (cVar == null || (!cVar.isCancelled() && this.f49369c.getErrorCode() != 4)) {
            z2 = false;
        }
        this.f49368b = z2;
        this.f49370d = aVar.f49379c;
        this.f49371e = aVar.f49380d;
        this.f49372f = aVar.f49381e;
        this.f49373g = aVar.f49382f;
        this.f49374h = aVar.f49383g;
        this.f49375i = aVar.f49384h;
        if (aVar.f49385i == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f49385i;
        }
        this.f49376j = bundle;
    }

    /* synthetic */ AuthResult(Parcel parcel, byte b) {
        this(parcel);
    }

    /* synthetic */ AuthResult(C20883a aVar, byte b) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f49367a ? 1 : 0);
        parcel.writeSerializable(this.f49369c);
        parcel.writeString(this.f49370d);
        parcel.writeString(this.f49373g);
        parcel.writeString(this.f49371e);
        parcel.writeString(this.f49372f);
        parcel.writeLong(this.f49374h);
        parcel.writeInt(this.f49375i);
        parcel.writeBundle(this.f49376j);
    }
}
