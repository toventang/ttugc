package com.p2082ss.android.ugc.aweme.dependence.beauty.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo */
public final class BeautyComposerInfo implements Parcelable {
    public static final C41100a CREATOR = new C41100a((byte) 0);

    /* renamed from: a */
    public String f96060a;

    /* renamed from: b */
    public final String f96061b;

    /* renamed from: c */
    public final String f96062c;

    static {
        Covode.recordClassIndex(48972);
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.f96060a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96061b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96062c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BeautyComposerInfo(nodePath=" + this.f96060a + ", extra=" + this.f96061b + ", effectId=" + this.f96062c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo$a */
    public static final class C41100a implements Parcelable.Creator<BeautyComposerInfo> {
        static {
            Covode.recordClassIndex(48973);
        }

        private C41100a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeautyComposerInfo[] newArray(int i) {
            return new BeautyComposerInfo[i];
        }

        public /* synthetic */ C41100a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeautyComposerInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new BeautyComposerInfo(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeautyComposerInfo(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            java.lang.String r2 = r5.readString()
            if (r2 != 0) goto L_0x000c
            r2 = r3
        L_0x000c:
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
            java.lang.String r1 = r5.readString()
            if (r1 != 0) goto L_0x0016
            r1 = r3
        L_0x0016:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x0020
            r0 = r3
        L_0x0020:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeautyComposerInfo) {
            BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) obj;
            if (C89219l.m154714a((Object) this.f96060a, (Object) beautyComposerInfo.f96060a)) {
                return true;
            }
            List<String> b = C89361p.m154915b(this.f96060a, new String[]{":"});
            List<String> b2 = C89361p.m154915b(beautyComposerInfo.f96060a, new String[]{":"});
            if (b.size() < 2 || b2.size() < 2 || !C89219l.m154714a((Object) b.get(0), (Object) b2.get(0)) || !C89219l.m154714a((Object) b.get(1), (Object) b2.get(1))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f96060a);
        parcel.writeString(this.f96061b);
        parcel.writeString(this.f96062c);
    }

    public BeautyComposerInfo(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f96060a = str;
        this.f96061b = str2;
        this.f96062c = str3;
    }
}
