package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetContext */
public final class DuetContext implements Parcelable {
    public static final Parcelable.Creator<DuetContext> CREATOR = new C69729b();

    /* renamed from: w */
    public static final int f155675w = 1;

    /* renamed from: x */
    public static final int f155676x = 2;

    /* renamed from: y */
    public static final String f155677y = "horizontal";

    /* renamed from: z */
    public static final C69728a f155678z = new C69728a((byte) 0);

    /* renamed from: a */
    public String f155679a;

    /* renamed from: b */
    public String f155680b;

    /* renamed from: c */
    public String f155681c;

    /* renamed from: d */
    public String f155682d;

    /* renamed from: e */
    public float f155683e;

    /* renamed from: f */
    public float f155684f;

    /* renamed from: g */
    public boolean f155685g;

    /* renamed from: h */
    public int f155686h;

    /* renamed from: i */
    public int f155687i;

    /* renamed from: j */
    public String f155688j;

    /* renamed from: k */
    public String f155689k;

    /* renamed from: l */
    public List<EmbaddedWindowInfo> f155690l;

    /* renamed from: m */
    public boolean f155691m;

    /* renamed from: n */
    public int f155692n;

    /* renamed from: o */
    public String f155693o;

    /* renamed from: p */
    public int f155694p;

    /* renamed from: q */
    public Effect f155695q;

    /* renamed from: r */
    public String f155696r;

    /* renamed from: s */
    public boolean f155697s;

    /* renamed from: t */
    public boolean f155698t;

    /* renamed from: u */
    public int f155699u;

    /* renamed from: v */
    public String f155700v;

    public DuetContext(byte b) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetContext)) {
            return false;
        }
        DuetContext duetContext = (DuetContext) obj;
        return C89219l.m154714a(this.f155679a, duetContext.f155679a) && C89219l.m154714a(this.f155680b, duetContext.f155680b) && C89219l.m154714a(this.f155681c, duetContext.f155681c) && C89219l.m154714a(this.f155682d, duetContext.f155682d) && Float.compare(this.f155683e, duetContext.f155683e) == 0 && Float.compare(this.f155684f, duetContext.f155684f) == 0 && this.f155685g == duetContext.f155685g && this.f155686h == duetContext.f155686h && this.f155687i == duetContext.f155687i && C89219l.m154714a(this.f155688j, duetContext.f155688j) && C89219l.m154714a(this.f155689k, duetContext.f155689k) && C89219l.m154714a(this.f155690l, duetContext.f155690l) && this.f155691m == duetContext.f155691m && this.f155692n == duetContext.f155692n && C89219l.m154714a(this.f155693o, duetContext.f155693o) && this.f155694p == duetContext.f155694p && C89219l.m154714a(this.f155695q, duetContext.f155695q) && C89219l.m154714a(this.f155696r, duetContext.f155696r) && this.f155697s == duetContext.f155697s && this.f155698t == duetContext.f155698t && this.f155699u == duetContext.f155699u && C89219l.m154714a(this.f155700v, duetContext.f155700v);
    }

    public final int hashCode() {
        String str = this.f155679a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f155680b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f155681c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f155682d;
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f155683e)) * 31) + Float.floatToIntBits(this.f155684f)) * 31;
        boolean z = this.f155685g;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((((hashCode4 + i3) * 31) + this.f155686h) * 31) + this.f155687i) * 31;
        String str5 = this.f155688j;
        int hashCode5 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f155689k;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<EmbaddedWindowInfo> list = this.f155690l;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z2 = this.f155691m;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (((hashCode7 + i7) * 31) + this.f155692n) * 31;
        String str7 = this.f155693o;
        int hashCode8 = (((i10 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f155694p) * 31;
        Effect effect = this.f155695q;
        int hashCode9 = (hashCode8 + (effect != null ? effect.hashCode() : 0)) * 31;
        String str8 = this.f155696r;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z3 = this.f155697s;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode10 + i11) * 31;
        if (!this.f155698t) {
            i2 = 0;
        }
        int i15 = (((i14 + i2) * 31) + this.f155699u) * 31;
        String str9 = this.f155700v;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i15 + i;
    }

    public final String toString() {
        return "DuetContext(duetFromChallengeName=" + this.f155679a + ", duetFromAwemeId=" + this.f155680b + ", duetVideoPath=" + this.f155681c + ", duetAudioPath=" + this.f155682d + ", veSuggestHumanVolume=" + this.f155683e + ", veSuggestVideoVolume=" + this.f155684f + ", successEnableAEC=" + this.f155685g + ", duetVideoWidth=" + this.f155686h + ", duetVideoHeight=" + this.f155687i + ", duetLayout=" + this.f155688j + ", duetLayoutInfoJson=" + this.f155689k + ", windowInfoList=" + this.f155690l + ", micDefaultState=" + this.f155691m + ", isFromDuetSticker=" + this.f155692n + ", duetLayoutMode=" + this.f155693o + ", layoutDirection=" + this.f155694p + ", defaultDuetLayout=" + this.f155695q + ", duetOriginId=" + this.f155696r + ", isDuetSing=" + this.f155697s + ", isDuetUpload=" + this.f155698t + ", duetUploadType=" + this.f155699u + ", chorusMethod=" + this.f155700v + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f155679a);
        parcel.writeString(this.f155680b);
        parcel.writeString(this.f155681c);
        parcel.writeString(this.f155682d);
        parcel.writeFloat(this.f155683e);
        parcel.writeFloat(this.f155684f);
        parcel.writeInt(this.f155685g ? 1 : 0);
        parcel.writeInt(this.f155686h);
        parcel.writeInt(this.f155687i);
        parcel.writeString(this.f155688j);
        parcel.writeString(this.f155689k);
        List<EmbaddedWindowInfo> list = this.f155690l;
        parcel.writeInt(list.size());
        for (EmbaddedWindowInfo embaddedWindowInfo : list) {
            parcel.writeParcelable(embaddedWindowInfo, i);
        }
        parcel.writeInt(this.f155691m ? 1 : 0);
        parcel.writeInt(this.f155692n);
        parcel.writeString(this.f155693o);
        parcel.writeInt(this.f155694p);
        parcel.writeParcelable(this.f155695q, i);
        parcel.writeString(this.f155696r);
        parcel.writeInt(this.f155697s ? 1 : 0);
        parcel.writeInt(this.f155698t ? 1 : 0);
        parcel.writeInt(this.f155699u);
        parcel.writeString(this.f155700v);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetContext$a */
    public static final class C69728a {
        static {
            Covode.recordClassIndex(82114);
        }

        private C69728a() {
        }

        public /* synthetic */ C69728a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetContext$b */
    public static class C69729b implements Parcelable.Creator<DuetContext> {
        static {
            Covode.recordClassIndex(82115);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetContext[] newArray(int i) {
            return new DuetContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(parcel.readParcelable(DuetContext.class.getClassLoader()));
                readInt3--;
            }
            return new DuetContext(readString, readString2, readString3, readString4, readFloat, readFloat2, z, readInt, readInt2, readString5, readString6, arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), (Effect) parcel.readParcelable(DuetContext.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }
    }

    static {
        Covode.recordClassIndex(82113);
    }

    private /* synthetic */ DuetContext() {
        this(null, null, null, null, 1.0f, 1.0f, false, 0, 0, null, null, new ArrayList(), false, 0, "", 0, null, null, false, false, 0, null);
    }

    public DuetContext(String str, String str2, String str3, String str4, float f, float f2, boolean z, int i, int i2, String str5, String str6, List<EmbaddedWindowInfo> list, boolean z2, int i3, String str7, int i4, Effect effect, String str8, boolean z3, boolean z4, int i5, String str9) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str7, "");
        this.f155679a = str;
        this.f155680b = str2;
        this.f155681c = str3;
        this.f155682d = str4;
        this.f155683e = f;
        this.f155684f = f2;
        this.f155685g = z;
        this.f155686h = i;
        this.f155687i = i2;
        this.f155688j = str5;
        this.f155689k = str6;
        this.f155690l = list;
        this.f155691m = z2;
        this.f155692n = i3;
        this.f155693o = str7;
        this.f155694p = i4;
        this.f155695q = effect;
        this.f155696r = str8;
        this.f155697s = z3;
        this.f155698t = z4;
        this.f155699u = i5;
        this.f155700v = str9;
    }
}
