package com.bytedance.android.livesdkapi.session;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class EnterRoomConfig implements Parcelable {
    public static final Parcelable.Creator<EnterRoomConfig> CREATOR = new C11862b();

    /* renamed from: f */
    public static final C11861a f28230f = new C11861a((byte) 0);

    /* renamed from: a */
    public StreamData f28231a;

    /* renamed from: b */
    public LogData f28232b;

    /* renamed from: c */
    public RoomsData f28233c;

    /* renamed from: d */
    public FeedCoverData f28234d;

    /* renamed from: e */
    public SearchWrapData f28235e;

    public static final class FeedCoverData implements Parcelable {
        public static final Parcelable.Creator<FeedCoverData> CREATOR = new C11849b();

        /* renamed from: c */
        public static final C11848a f28236c = new C11848a((byte) 0);

        /* renamed from: a */
        public boolean f28237a;

        /* renamed from: b */
        public List<String> f28238b;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$FeedCoverData$a */
        public static final class C11848a {
            static {
                Covode.recordClassIndex(13557);
            }

            private C11848a() {
            }

            public /* synthetic */ C11848a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$FeedCoverData$b */
        public static final class C11849b implements Parcelable.Creator<FeedCoverData> {
            static {
                Covode.recordClassIndex(13558);
            }

            C11849b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FeedCoverData[] newArray(int i) {
                return new FeedCoverData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FeedCoverData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new FeedCoverData(parcel);
            }
        }

        public FeedCoverData() {
        }

        static {
            Covode.recordClassIndex(13556);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public FeedCoverData(Parcel parcel) {
            this();
            C89219l.m154721d(parcel, "");
            this.f28237a = 1 != parcel.readInt() ? false : true;
            this.f28238b = parcel.createStringArrayList();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeInt(this.f28237a ? 1 : 0);
            parcel.writeStringList(this.f28238b);
        }
    }

    public static final class GuestUser implements Parcelable {
        public static final C11850a CREATOR = new C11850a((byte) 0);

        /* renamed from: a */
        public long f28239a;

        /* renamed from: b */
        public String f28240b;

        /* renamed from: c */
        public int f28241c;

        /* renamed from: d */
        public String f28242d;

        static {
            Covode.recordClassIndex(13559);
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$GuestUser$a */
        public static final class C11850a implements Parcelable.Creator<GuestUser> {
            static {
                Covode.recordClassIndex(13560);
            }

            private C11850a() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ GuestUser[] newArray(int i) {
                return new GuestUser[i];
            }

            public /* synthetic */ C11850a(byte b) {
                this();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ GuestUser createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new GuestUser(parcel);
            }
        }

        public GuestUser() {
            this.f28242d = "";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public GuestUser(Parcel parcel) {
            this();
            C89219l.m154721d(parcel, "");
            this.f28239a = parcel.readLong();
            this.f28240b = parcel.readString();
            this.f28241c = parcel.readInt();
            this.f28242d = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeLong(this.f28239a);
                parcel.writeString(this.f28240b);
                parcel.writeInt(this.f28241c);
                parcel.writeString(this.f28242d);
            }
        }
    }

    public static final class LogData implements Parcelable {
        public static final Parcelable.Creator<LogData> CREATOR = new C11852b();

        /* renamed from: N */
        public static final C11851a f28243N = new C11851a((byte) 0);

        /* renamed from: A */
        public String f28244A;

        /* renamed from: B */
        public String f28245B;

        /* renamed from: C */
        public String f28246C;

        /* renamed from: D */
        public String f28247D;

        /* renamed from: E */
        public String f28248E;

        /* renamed from: F */
        public String f28249F;

        /* renamed from: G */
        public String f28250G;

        /* renamed from: H */
        public String f28251H;

        /* renamed from: I */
        public String f28252I;

        /* renamed from: J */
        public String f28253J;

        /* renamed from: K */
        public String f28254K;

        /* renamed from: L */
        public String f28255L;

        /* renamed from: M */
        public int f28256M;

        /* renamed from: a */
        public String f28257a;

        /* renamed from: b */
        public String f28258b;

        /* renamed from: c */
        public String f28259c;

        /* renamed from: d */
        public String f28260d;

        /* renamed from: e */
        public String f28261e;

        /* renamed from: f */
        public String f28262f;

        /* renamed from: g */
        public String f28263g;

        /* renamed from: h */
        public String f28264h;

        /* renamed from: i */
        public String f28265i;

        /* renamed from: j */
        public String f28266j;

        /* renamed from: k */
        public long f28267k;

        /* renamed from: l */
        public boolean f28268l;

        /* renamed from: m */
        public String f28269m;

        /* renamed from: n */
        public long f28270n;

        /* renamed from: o */
        public String f28271o;

        /* renamed from: p */
        public String f28272p;

        /* renamed from: q */
        public String f28273q;

        /* renamed from: r */
        public String f28274r;

        /* renamed from: s */
        public String f28275s;

        /* renamed from: t */
        public String f28276t;

        /* renamed from: u */
        public long f28277u;

        /* renamed from: v */
        public long f28278v;

        /* renamed from: w */
        public long f28279w;

        /* renamed from: x */
        public String f28280x;

        /* renamed from: y */
        public String f28281y;

        /* renamed from: z */
        public String f28282z;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData$a */
        public static final class C11851a {
            static {
                Covode.recordClassIndex(13562);
            }

            private C11851a() {
            }

            public /* synthetic */ C11851a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData$b */
        public static final class C11852b implements Parcelable.Creator<LogData> {
            static {
                Covode.recordClassIndex(13563);
            }

            C11852b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LogData[] newArray(int i) {
                return new LogData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LogData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new LogData(parcel);
            }
        }

        public LogData() {
            this.f28265i = "";
            this.f28266j = "";
            this.f28276t = "";
            this.f28256M = -1;
        }

        static {
            Covode.recordClassIndex(13561);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public LogData(Parcel parcel) {
            this();
            C89219l.m154721d(parcel, "");
            this.f28257a = parcel.readString();
            this.f28258b = parcel.readString();
            this.f28259c = parcel.readString();
            this.f28262f = parcel.readString();
            this.f28263g = parcel.readString();
            this.f28264h = parcel.readString();
            this.f28265i = parcel.readString();
            this.f28266j = parcel.readString();
            this.f28267k = parcel.readLong();
            this.f28268l = 1 != parcel.readInt() ? false : true;
            this.f28269m = parcel.readString();
            this.f28270n = parcel.readLong();
            this.f28271o = parcel.readString();
            this.f28272p = parcel.readString();
            this.f28273q = parcel.readString();
            this.f28274r = parcel.readString();
            this.f28275s = parcel.readString();
            this.f28276t = parcel.readString();
            this.f28277u = parcel.readLong();
            this.f28278v = parcel.readLong();
            this.f28279w = parcel.readLong();
            this.f28280x = parcel.readString();
            this.f28281y = parcel.readString();
            this.f28282z = parcel.readString();
            this.f28244A = parcel.readString();
            this.f28245B = parcel.readString();
            this.f28246C = parcel.readString();
            this.f28247D = parcel.readString();
            this.f28248E = parcel.readString();
            this.f28249F = parcel.readString();
            this.f28250G = parcel.readString();
            this.f28251H = parcel.readString();
            this.f28252I = parcel.readString();
            this.f28253J = parcel.readString();
            this.f28254K = parcel.readString();
            this.f28255L = parcel.readString();
            this.f28256M = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f28257a);
            parcel.writeString(this.f28258b);
            parcel.writeString(this.f28259c);
            parcel.writeString(this.f28262f);
            parcel.writeString(this.f28263g);
            parcel.writeString(this.f28264h);
            parcel.writeString(this.f28265i);
            parcel.writeString(this.f28266j);
            parcel.writeLong(this.f28267k);
            parcel.writeInt(this.f28268l ? 1 : 0);
            parcel.writeString(this.f28269m);
            parcel.writeLong(this.f28270n);
            parcel.writeString(this.f28271o);
            parcel.writeString(this.f28272p);
            parcel.writeString(this.f28273q);
            parcel.writeString(this.f28274r);
            parcel.writeString(this.f28275s);
            parcel.writeString(this.f28276t);
            parcel.writeLong(this.f28277u);
            parcel.writeLong(this.f28278v);
            parcel.writeLong(this.f28279w);
            parcel.writeString(this.f28280x);
            parcel.writeString(this.f28281y);
            parcel.writeString(this.f28282z);
            parcel.writeString(this.f28244A);
            parcel.writeString(this.f28245B);
            parcel.writeString(this.f28246C);
            parcel.writeString(this.f28247D);
            parcel.writeString(this.f28248E);
            parcel.writeString(this.f28249F);
            parcel.writeString(this.f28250G);
            parcel.writeString(this.f28251H);
            parcel.writeString(this.f28252I);
            parcel.writeString(this.f28253J);
            parcel.writeString(this.f28254K);
            parcel.writeString(this.f28255L);
            parcel.writeInt(this.f28256M);
        }
    }

    public static final class RoomsData implements Parcelable {
        public static final Parcelable.Creator<RoomsData> CREATOR = new C11854b();

        /* renamed from: aJ */
        public static final C11853a f28283aJ = new C11853a((byte) 0);

        /* renamed from: A */
        public String f28284A;

        /* renamed from: B */
        public SparseArray<EnterRoomConfig> f28285B;

        /* renamed from: C */
        public EnterRoomConfig f28286C;

        /* renamed from: D */
        public String f28287D;

        /* renamed from: E */
        public String f28288E;

        /* renamed from: F */
        public String f28289F;

        /* renamed from: G */
        public Rect f28290G;

        /* renamed from: H */
        public long[] f28291H;

        /* renamed from: I */
        public String f28292I;

        /* renamed from: J */
        public String f28293J;

        /* renamed from: K */
        public boolean f28294K;

        /* renamed from: L */
        public String f28295L;

        /* renamed from: M */
        public String f28296M;

        /* renamed from: N */
        public String f28297N;

        /* renamed from: O */
        public boolean f28298O;

        /* renamed from: P */
        public String f28299P;

        /* renamed from: Q */
        public String f28300Q;

        /* renamed from: R */
        public long f28301R;

        /* renamed from: S */
        public EnumC11728i f28302S;

        /* renamed from: T */
        public String f28303T;

        /* renamed from: U */
        public boolean f28304U;

        /* renamed from: V */
        public int f28305V;

        /* renamed from: W */
        public String f28306W;

        /* renamed from: X */
        public String f28307X;

        /* renamed from: Y */
        public long f28308Y;

        /* renamed from: Z */
        public String f28309Z;

        /* renamed from: a */
        public String f28310a;

        /* renamed from: aA */
        public long f28311aA;

        /* renamed from: aB */
        public int f28312aB;

        /* renamed from: aC */
        public HashMap<Long, String> f28313aC;

        /* renamed from: aD */
        public MaskLayer f28314aD;

        /* renamed from: aE */
        public WarningTag f28315aE;

        /* renamed from: aF */
        public String f28316aF;

        /* renamed from: aG */
        public String f28317aG;

        /* renamed from: aH */
        public long f28318aH;

        /* renamed from: aI */
        public long f28319aI;

        /* renamed from: aa */
        public String f28320aa;

        /* renamed from: ab */
        public String f28321ab;

        /* renamed from: ac */
        public String f28322ac;

        /* renamed from: ad */
        public String f28323ad;

        /* renamed from: ae */
        public long f28324ae;

        /* renamed from: af */
        public TimeStamp f28325af;

        /* renamed from: ag */
        public boolean f28326ag;

        /* renamed from: ah */
        public int f28327ah;

        /* renamed from: ai */
        public String f28328ai;

        /* renamed from: aj */
        public long f28329aj;

        /* renamed from: ak */
        public boolean f28330ak;

        /* renamed from: al */
        public boolean f28331al;

        /* renamed from: am */
        public boolean f28332am;

        /* renamed from: an */
        public long f28333an;

        /* renamed from: ao */
        public long f28334ao;

        /* renamed from: ap */
        public boolean f28335ap;

        /* renamed from: aq */
        public boolean f28336aq;

        /* renamed from: ar */
        public boolean f28337ar;

        /* renamed from: as */
        public String f28338as;

        /* renamed from: at */
        public String f28339at;

        /* renamed from: au */
        public GuestUser f28340au;

        /* renamed from: av */
        public String f28341av;

        /* renamed from: aw */
        public boolean f28342aw;

        /* renamed from: ax */
        public String f28343ax;

        /* renamed from: ay */
        public ImageModel f28344ay;

        /* renamed from: az */
        public boolean f28345az;

        /* renamed from: b */
        public boolean f28346b;

        /* renamed from: c */
        public boolean f28347c;

        /* renamed from: d */
        public String f28348d;

        /* renamed from: e */
        public boolean f28349e;

        /* renamed from: f */
        public boolean f28350f;

        /* renamed from: g */
        public long f28351g;

        /* renamed from: h */
        public boolean f28352h;

        /* renamed from: i */
        public String f28353i;

        /* renamed from: j */
        public String f28354j;

        /* renamed from: k */
        public String f28355k;

        /* renamed from: l */
        public HashMap<String, String> f28356l;

        /* renamed from: m */
        public HashMap<String, String> f28357m;

        /* renamed from: n */
        public String f28358n;

        /* renamed from: o */
        public boolean f28359o;

        /* renamed from: p */
        public String f28360p;

        /* renamed from: q */
        public String f28361q;

        /* renamed from: r */
        public int f28362r;

        /* renamed from: s */
        public String f28363s;

        /* renamed from: t */
        public int f28364t;

        /* renamed from: u */
        public long f28365u;

        /* renamed from: v */
        public String f28366v;

        /* renamed from: w */
        public long f28367w;

        /* renamed from: x */
        public Boolean f28368x;

        /* renamed from: y */
        public ArrayList<String> f28369y;

        /* renamed from: z */
        public String f28370z;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData$a */
        public static final class C11853a {
            static {
                Covode.recordClassIndex(13565);
            }

            private C11853a() {
            }

            public /* synthetic */ C11853a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData$b */
        public static final class C11854b implements Parcelable.Creator<RoomsData> {
            static {
                Covode.recordClassIndex(13566);
            }

            C11854b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RoomsData[] newArray(int i) {
                return new RoomsData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RoomsData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new RoomsData(parcel);
            }
        }

        static {
            Covode.recordClassIndex(13564);
        }

        public RoomsData() {
            this.f28310a = "";
            this.f28356l = new HashMap<>();
            this.f28357m = new HashMap<>();
            this.f28361q = "0";
            this.f28363s = "";
            this.f28364t = -1;
            this.f28366v = "";
            this.f28367w = -1;
            this.f28287D = "0";
            this.f28299P = "";
            this.f28300Q = "";
            this.f28301R = -1;
            this.f28302S = EnumC11728i.VIDEO;
            this.f28306W = "";
            this.f28307X = "";
            this.f28320aa = "inner_draw";
            this.f28324ae = -1;
            this.f28325af = new TimeStamp();
            this.f28340au = new GuestUser();
            this.f28316aF = "";
            this.f28318aH = -1;
            this.f28319aI = -1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public RoomsData(Parcel parcel) {
            this();
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            C89219l.m154721d(parcel, "");
            boolean z15 = false;
            if (1 == parcel.readInt()) {
                z = true;
            } else {
                z = false;
            }
            this.f28347c = z;
            this.f28348d = parcel.readString();
            if (1 == parcel.readInt()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f28349e = z2;
            if (1 == parcel.readInt()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f28350f = z3;
            if (1 == parcel.readInt()) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f28352h = z4;
            this.f28353i = parcel.readString();
            this.f28354j = parcel.readString();
            this.f28355k = parcel.readString();
            Serializable readSerializable = parcel.readSerializable();
            Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            this.f28356l = (HashMap) readSerializable;
            Serializable readSerializable2 = parcel.readSerializable();
            Objects.requireNonNull(readSerializable2, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            this.f28357m = (HashMap) readSerializable2;
            this.f28358n = parcel.readString();
            if (1 == parcel.readInt()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f28359o = z5;
            this.f28360p = parcel.readString();
            this.f28361q = parcel.readString();
            this.f28362r = parcel.readInt();
            this.f28363s = parcel.readString();
            this.f28364t = parcel.readInt();
            this.f28365u = parcel.readLong();
            this.f28366v = parcel.readString();
            this.f28367w = parcel.readLong();
            this.f28368x = (Boolean) parcel.readValue(Boolean.TYPE.getClassLoader());
            this.f28369y = parcel.createStringArrayList();
            this.f28370z = parcel.readString();
            this.f28284A = parcel.readString();
            this.f28285B = parcel.readSparseArray(EnterRoomConfig.class.getClassLoader());
            this.f28286C = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
            this.f28287D = parcel.readString();
            this.f28288E = parcel.readString();
            this.f28289F = parcel.readString();
            this.f28290G = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            this.f28291H = parcel.createLongArray();
            this.f28293J = parcel.readString();
            this.f28295L = parcel.readString();
            this.f28297N = parcel.readString();
            if (1 == parcel.readInt()) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f28298O = z6;
            this.f28299P = parcel.readString();
            this.f28300Q = parcel.readString();
            this.f28301R = parcel.readLong();
            this.f28303T = parcel.readString();
            if (1 == parcel.readInt()) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f28304U = z7;
            this.f28305V = parcel.readInt();
            this.f28306W = parcel.readString();
            this.f28307X = parcel.readString();
            this.f28308Y = parcel.readLong();
            this.f28309Z = parcel.readString();
            this.f28321ab = parcel.readString();
            this.f28322ac = parcel.readString();
            this.f28323ad = parcel.readString();
            this.f28324ae = parcel.readLong();
            this.f28325af = (TimeStamp) parcel.readParcelable(TimeStamp.class.getClassLoader());
            if (parcel.readInt() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f28326ag = z8;
            this.f28327ah = parcel.readInt();
            this.f28328ai = parcel.readString();
            this.f28329aj = parcel.readLong();
            if (parcel.readInt() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f28330ak = z9;
            if (parcel.readInt() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f28331al = z10;
            if (parcel.readInt() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f28332am = z11;
            this.f28333an = parcel.readLong();
            this.f28334ao = parcel.readLong();
            if (parcel.readInt() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f28335ap = z12;
            this.f28292I = parcel.readString();
            if (parcel.readInt() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f28337ar = z13;
            this.f28338as = parcel.readString();
            this.f28339at = parcel.readString();
            this.f28340au = (GuestUser) parcel.readParcelable(GuestUser.class.getClassLoader());
            this.f28341av = parcel.readString();
            if (parcel.readInt() == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f28342aw = z14;
            this.f28344ay = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f28345az = parcel.readInt() == 1 ? true : z15;
            this.f28311aA = parcel.readLong();
            this.f28312aB = parcel.readInt();
            this.f28316aF = parcel.readString();
            this.f28317aG = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeInt(this.f28347c ? 1 : 0);
            parcel.writeString(this.f28348d);
            parcel.writeInt(this.f28349e ? 1 : 0);
            parcel.writeInt(this.f28350f ? 1 : 0);
            parcel.writeInt(this.f28352h ? 1 : 0);
            parcel.writeString(this.f28353i);
            parcel.writeString(this.f28354j);
            parcel.writeString(this.f28355k);
            parcel.writeSerializable(this.f28356l);
            parcel.writeSerializable(this.f28357m);
            parcel.writeString(this.f28358n);
            parcel.writeInt(this.f28359o ? 1 : 0);
            parcel.writeString(this.f28360p);
            parcel.writeString(this.f28361q);
            parcel.writeInt(this.f28362r);
            parcel.writeString(this.f28363s);
            parcel.writeInt(this.f28364t);
            parcel.writeLong(this.f28365u);
            parcel.writeString(this.f28366v);
            parcel.writeLong(this.f28367w);
            parcel.writeValue(this.f28368x);
            parcel.writeStringList(this.f28369y);
            parcel.writeString(this.f28370z);
            parcel.writeString(this.f28284A);
            parcel.writeSparseArray(this.f28285B);
            parcel.writeParcelable(this.f28286C, 0);
            parcel.writeString(this.f28287D);
            parcel.writeString(this.f28288E);
            parcel.writeString(this.f28289F);
            parcel.writeParcelable(this.f28290G, 0);
            parcel.writeLongArray(this.f28291H);
            parcel.writeString(this.f28293J);
            parcel.writeString(this.f28295L);
            parcel.writeString(this.f28297N);
            parcel.writeInt(this.f28298O ? 1 : 0);
            parcel.writeString(this.f28299P);
            parcel.writeString(this.f28300Q);
            parcel.writeLong(this.f28301R);
            parcel.writeString(this.f28303T);
            parcel.writeInt(this.f28304U ? 1 : 0);
            parcel.writeInt(this.f28305V);
            parcel.writeString(this.f28306W);
            parcel.writeString(this.f28307X);
            parcel.writeLong(this.f28308Y);
            parcel.writeString(this.f28309Z);
            parcel.writeString(this.f28321ab);
            parcel.writeString(this.f28322ac);
            parcel.writeString(this.f28323ad);
            parcel.writeLong(this.f28324ae);
            parcel.writeParcelable(this.f28325af, 0);
            parcel.writeInt(this.f28326ag ? 1 : 0);
            parcel.writeInt(this.f28327ah);
            parcel.writeString(this.f28328ai);
            parcel.writeLong(this.f28329aj);
            parcel.writeInt(this.f28330ak ? 1 : 0);
            parcel.writeInt(this.f28331al ? 1 : 0);
            parcel.writeInt(this.f28332am ? 1 : 0);
            parcel.writeLong(this.f28333an);
            parcel.writeLong(this.f28334ao);
            parcel.writeInt(this.f28335ap ? 1 : 0);
            parcel.writeString(this.f28292I);
            parcel.writeInt(this.f28337ar ? 1 : 0);
            parcel.writeString(this.f28338as);
            parcel.writeString(this.f28339at);
            parcel.writeParcelable(this.f28340au, 0);
            parcel.writeString(this.f28341av);
            parcel.writeInt(this.f28342aw ? 1 : 0);
            parcel.writeParcelable(this.f28344ay, 0);
            parcel.writeInt(this.f28345az ? 1 : 0);
            parcel.writeLong(this.f28311aA);
            parcel.writeInt(this.f28312aB);
            parcel.writeString(this.f28316aF);
            parcel.writeString(this.f28317aG);
        }
    }

    public static final class SearchWrapData implements Parcelable {
        public static final Parcelable.Creator<SearchWrapData> CREATOR = new C11856b();

        /* renamed from: b */
        public static final C11855a f28371b = new C11855a((byte) 0);

        /* renamed from: a */
        public String f28372a;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$SearchWrapData$a */
        public static final class C11855a {
            static {
                Covode.recordClassIndex(13568);
            }

            private C11855a() {
            }

            public /* synthetic */ C11855a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$SearchWrapData$b */
        public static final class C11856b implements Parcelable.Creator<SearchWrapData> {
            static {
                Covode.recordClassIndex(13569);
            }

            C11856b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SearchWrapData[] newArray(int i) {
                return new SearchWrapData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SearchWrapData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new SearchWrapData(parcel);
            }
        }

        public SearchWrapData() {
            this.f28372a = "";
        }

        static {
            Covode.recordClassIndex(13567);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public SearchWrapData(Parcel parcel) {
            this();
            C89219l.m154721d(parcel, "");
            this.f28372a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f28372a);
        }
    }

    public static final class StreamData implements Parcelable {
        public static final Parcelable.Creator<StreamData> CREATOR = new C11858b();

        /* renamed from: n */
        public static final C11857a f28373n = new C11857a((byte) 0);

        /* renamed from: a */
        public boolean f28374a;

        /* renamed from: b */
        public String f28375b;

        /* renamed from: c */
        public String f28376c;

        /* renamed from: d */
        public String f28377d;

        /* renamed from: e */
        public String f28378e;

        /* renamed from: f */
        public String f28379f;

        /* renamed from: g */
        public boolean f28380g;

        /* renamed from: h */
        public boolean f28381h;

        /* renamed from: i */
        public int f28382i;

        /* renamed from: j */
        public int f28383j;

        /* renamed from: k */
        public boolean f28384k;

        /* renamed from: l */
        public long f28385l;

        /* renamed from: m */
        public boolean f28386m;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData$a */
        public static final class C11857a {
            static {
                Covode.recordClassIndex(13571);
            }

            private C11857a() {
            }

            public /* synthetic */ C11857a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData$b */
        public static final class C11858b implements Parcelable.Creator<StreamData> {
            static {
                Covode.recordClassIndex(13572);
            }

            C11858b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ StreamData[] newArray(int i) {
                return new StreamData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ StreamData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new StreamData(parcel);
            }
        }

        public StreamData() {
            this.f28385l = -1;
        }

        static {
            Covode.recordClassIndex(13570);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public StreamData(Parcel parcel) {
            this();
            boolean z;
            boolean z2;
            boolean z3;
            C89219l.m154721d(parcel, "");
            this.f28375b = parcel.readString();
            this.f28376c = parcel.readString();
            this.f28377d = parcel.readString();
            this.f28378e = parcel.readString();
            this.f28379f = parcel.readString();
            boolean z4 = false;
            if (1 == parcel.readInt()) {
                z = true;
            } else {
                z = false;
            }
            this.f28380g = z;
            if (1 == parcel.readInt()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f28381h = z2;
            this.f28382i = parcel.readInt();
            this.f28383j = parcel.readInt();
            if (1 == parcel.readInt()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f28384k = z3;
            this.f28385l = parcel.readLong();
            this.f28386m = 1 == parcel.readInt() ? true : z4;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f28375b);
            parcel.writeString(this.f28376c);
            parcel.writeString(this.f28377d);
            parcel.writeString(this.f28378e);
            parcel.writeString(this.f28379f);
            parcel.writeInt(this.f28380g ? 1 : 0);
            parcel.writeInt(this.f28381h ? 1 : 0);
            parcel.writeInt(this.f28382i);
            parcel.writeInt(this.f28383j);
            parcel.writeInt(this.f28384k ? 1 : 0);
            parcel.writeLong(this.f28385l);
            parcel.writeInt(this.f28386m ? 1 : 0);
        }
    }

    public static final class TimeStamp implements Parcelable {
        public static final Parcelable.Creator<TimeStamp> CREATOR = new C11860b();

        /* renamed from: c */
        public static final C11859a f28387c = new C11859a((byte) 0);

        /* renamed from: a */
        public long f28388a;

        /* renamed from: b */
        public Long f28389b;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$TimeStamp$a */
        public static final class C11859a {
            static {
                Covode.recordClassIndex(13574);
            }

            private C11859a() {
            }

            public /* synthetic */ C11859a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$TimeStamp$b */
        public static final class C11860b implements Parcelable.Creator<TimeStamp> {
            static {
                Covode.recordClassIndex(13575);
            }

            C11860b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ TimeStamp[] newArray(int i) {
                return new TimeStamp[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ TimeStamp createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new TimeStamp(parcel);
            }
        }

        public TimeStamp() {
            this.f28389b = 0L;
        }

        static {
            Covode.recordClassIndex(13573);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public TimeStamp(Parcel parcel) {
            this();
            C89219l.m154721d(parcel, "");
            this.f28388a = parcel.readLong();
            this.f28389b = (Long) parcel.readValue(Long.TYPE.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeLong(this.f28388a);
            parcel.writeValue(this.f28389b);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$a */
    public static final class C11861a {
        static {
            Covode.recordClassIndex(13576);
        }

        private C11861a() {
        }

        public /* synthetic */ C11861a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.session.EnterRoomConfig$b */
    public static final class C11862b implements Parcelable.Creator<EnterRoomConfig> {
        static {
            Covode.recordClassIndex(13577);
        }

        C11862b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EnterRoomConfig[] newArray(int i) {
            return new EnterRoomConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnterRoomConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EnterRoomConfig(parcel);
        }
    }

    static {
        Covode.recordClassIndex(13555);
    }

    public EnterRoomConfig() {
        this.f28231a = new StreamData();
        this.f28232b = new LogData();
        this.f28233c = new RoomsData();
        this.f28234d = new FeedCoverData();
        this.f28235e = new SearchWrapData();
    }

    /* renamed from: a */
    public final ActivityC0945e mo18961a(Context context) {
        while (!(context instanceof ActivityC0945e)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ActivityC0945e) context;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnterRoomConfig(Parcel parcel) {
        this();
        C89219l.m154721d(parcel, "");
        Parcelable readParcelable = parcel.readParcelable(StreamData.class.getClassLoader());
        if (readParcelable == null) {
            C89219l.m154715b();
        }
        this.f28231a = (StreamData) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(LogData.class.getClassLoader());
        if (readParcelable2 == null) {
            C89219l.m154715b();
        }
        this.f28232b = (LogData) readParcelable2;
        Parcelable readParcelable3 = parcel.readParcelable(RoomsData.class.getClassLoader());
        if (readParcelable3 == null) {
            C89219l.m154715b();
        }
        this.f28233c = (RoomsData) readParcelable3;
        Parcelable readParcelable4 = parcel.readParcelable(SearchWrapData.class.getClassLoader());
        if (readParcelable4 == null) {
            C89219l.m154715b();
        }
        this.f28235e = (SearchWrapData) readParcelable4;
    }

    /* renamed from: a */
    public static String m20941a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f28231a, 0);
        parcel.writeParcelable(this.f28232b, 0);
        parcel.writeParcelable(this.f28233c, 0);
        parcel.writeParcelable(this.f28235e, 0);
    }
}
