package com.p2082ss.android.ugc.asve.recorder.effect.composer;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo */
public final class ComposerInfo implements Parcelable {
    public static final C31202a CREATOR = new C31202a((byte) 0);

    /* renamed from: a */
    public String f74790a;

    /* renamed from: b */
    public final String f74791b;

    /* renamed from: c */
    public final String f74792c;

    static {
        Covode.recordClassIndex(37847);
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.f74790a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74791b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f74792c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ComposerInfo(nodePath=" + this.f74790a + ", extra=" + this.f74791b + ", effectId=" + this.f74792c + ")";
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a */
    public static final class C31202a implements Parcelable.Creator<ComposerInfo> {
        static {
            Covode.recordClassIndex(37848);
        }

        private C31202a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComposerInfo[] newArray(int i) {
            return new ComposerInfo[i];
        }

        public /* synthetic */ C31202a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComposerInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ComposerInfo(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ComposerInfo(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            java.lang.String r2 = r5.readString()
            if (r2 != 0) goto L_0x000e
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x000e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
            java.lang.String r1 = r5.readString()
            if (r1 != 0) goto L_0x001a
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001a:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x0026
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0026:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposerInfo) {
            ComposerInfo composerInfo = (ComposerInfo) obj;
            if (C89219l.m154714a((Object) this.f74790a, (Object) composerInfo.f74790a)) {
                return true;
            }
            List<String> b = C89361p.m154915b(this.f74790a, new String[]{":"});
            List<String> b2 = C89361p.m154915b(composerInfo.f74790a, new String[]{":"});
            if (b.size() < 2 || b2.size() < 2 || !C89219l.m154714a((Object) b.get(0), (Object) b2.get(0)) || !C89219l.m154714a((Object) b.get(1), (Object) b2.get(1))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ ComposerInfo(String str, String str2) {
        this(str, str2, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f74790a);
        parcel.writeString(this.f74791b);
        parcel.writeString(this.f74792c);
    }

    public ComposerInfo(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f74790a = str;
        this.f74791b = str2;
        this.f74792c = str3;
    }
}
