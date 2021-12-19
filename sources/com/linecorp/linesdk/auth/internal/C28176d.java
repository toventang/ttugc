package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.p2028a.C28162f;

/* access modifiers changed from: package-private */
/* renamed from: com.linecorp.linesdk.auth.internal.d */
public final class C28176d implements Parcelable {
    public static final Parcelable.Creator<C28176d> CREATOR = new Parcelable.Creator<C28176d>() {
        /* class com.linecorp.linesdk.auth.internal.C28176d.C281771 */

        static {
            Covode.recordClassIndex(34123);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C28176d[] newArray(int i) {
            return new C28176d[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C28176d createFromParcel(Parcel parcel) {
            return new C28176d(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    C28162f f65949a;

    /* renamed from: b */
    String f65950b;

    /* renamed from: c */
    String f65951c;

    /* renamed from: d */
    int f65952d;

    public final int describeContents() {
        return 0;
    }

    C28176d() {
        this.f65952d = EnumC28178a.f65953a;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: package-private */
    /* renamed from: com.linecorp.linesdk.auth.internal.d$a */
    public static final class EnumC28178a extends Enum<EnumC28178a> {

        /* renamed from: a */
        public static final int f65953a = 1;

        /* renamed from: b */
        public static final int f65954b = 2;

        /* renamed from: c */
        public static final int f65955c = 3;

        /* renamed from: d */
        public static final int f65956d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f65957e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m56279a() {
            return (int[]) f65957e.clone();
        }

        static {
            Covode.recordClassIndex(34124);
        }
    }

    static {
        Covode.recordClassIndex(34122);
    }

    private C28176d(Parcel parcel) {
        C28162f fVar;
        this.f65952d = EnumC28178a.f65953a;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (TextUtils.isEmpty(readString) || TextUtils.isEmpty(readString2)) {
            fVar = null;
        } else {
            fVar = new C28162f(readString, readString2);
        }
        this.f65949a = fVar;
        this.f65950b = parcel.readString();
        this.f65952d = EnumC28178a.m56279a()[parcel.readByte()];
        this.f65951c = parcel.readString();
    }

    /* synthetic */ C28176d(Parcel parcel, byte b) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C28162f fVar = this.f65949a;
        String str2 = null;
        if (fVar == null) {
            str = null;
        } else {
            str = fVar.f65897a;
        }
        parcel.writeString(str);
        C28162f fVar2 = this.f65949a;
        if (fVar2 != null) {
            str2 = fVar2.f65898b;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f65950b);
        parcel.writeByte((byte) (this.f65952d - 1));
        parcel.writeString(this.f65951c);
    }
}
