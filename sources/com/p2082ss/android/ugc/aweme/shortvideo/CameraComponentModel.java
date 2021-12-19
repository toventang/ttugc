package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.CameraComponentModel */
public class CameraComponentModel implements Parcelable {
    public static final Parcelable.Creator<CameraComponentModel> CREATOR = new Parcelable.Creator<CameraComponentModel>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel.C697222 */

        static {
            Covode.recordClassIndex(82104);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraComponentModel[] newArray(int i) {
            return new CameraComponentModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraComponentModel createFromParcel(Parcel parcel) {
            return new CameraComponentModel(parcel, (byte) 0);
        }
    };

    /* renamed from: A */
    public float f155636A;

    /* renamed from: B */
    public boolean f155637B;

    /* renamed from: C */
    public int f155638C;

    /* renamed from: D */
    public String f155639D;

    /* renamed from: E */
    public Map<String, Object> f155640E;

    /* renamed from: F */
    public boolean f155641F;

    /* renamed from: G */
    public RecordContext f155642G;

    /* renamed from: H */
    public boolean f155643H;

    /* renamed from: I */
    private C70650dt f155644I;

    /* renamed from: a */
    public final int f155645a;

    /* renamed from: b */
    public long f155646b;

    /* renamed from: c */
    public int f155647c;

    /* renamed from: d */
    public int f155648d;

    /* renamed from: e */
    public int f155649e;

    /* renamed from: f */
    public C70650dt f155650f;

    /* renamed from: g */
    public long f155651g;

    /* renamed from: h */
    public Workspace f155652h;

    /* renamed from: i */
    public boolean f155653i;

    /* renamed from: j */
    public long f155654j;

    /* renamed from: k */
    public long f155655k;

    /* renamed from: l */
    public boolean f155656l;

    /* renamed from: m */
    public boolean f155657m;

    /* renamed from: n */
    public ClientCherEffectParam f155658n;

    /* renamed from: o */
    public DuetContext f155659o;

    /* renamed from: p */
    public ReactionContext f155660p;

    /* renamed from: q */
    public int f155661q;

    /* renamed from: r */
    public C75439a f155662r;

    /* renamed from: s */
    public boolean f155663s;

    /* renamed from: t */
    public boolean f155664t;

    /* renamed from: u */
    public int f155665u;

    /* renamed from: v */
    public GameDuetResource f155666v;

    /* renamed from: w */
    public ExtractFramesModel f155667w;

    /* renamed from: x */
    public AbstractC69885bi f155668x;

    /* renamed from: y */
    public String f155669y;

    /* renamed from: z */
    public boolean f155670z;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(82102);
    }

    /* renamed from: d */
    public final C70650dt mo109891d() {
        if (this.f155653i) {
            return this.f155644I;
        }
        return this.f155650f;
    }

    /* renamed from: e */
    public final String mo109893e() {
        if (mo109888a()) {
            return this.f155652h.mo110093c();
        }
        return null;
    }

    /* renamed from: h */
    public final long mo109896h() {
        if (this.f155653i) {
            return this.f155654j;
        }
        return this.f155651g;
    }

    /* renamed from: k */
    public final long mo109899k() {
        if (this.f155653i) {
            return this.f155655k;
        }
        return this.f155646b;
    }

    /* renamed from: a */
    public final boolean mo109888a() {
        if (this.f155652h.mo110093c() == null || mo109889b() || mo109890c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo109889b() {
        if (TextUtils.isEmpty(this.f155659o.f155681c) || TextUtils.isEmpty(this.f155659o.f155682d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final long mo109895g() {
        if (this.f155653i) {
            return this.f155668x.mo109992a() + ((long) this.f155661q);
        }
        return (long) this.f155661q;
    }

    /* renamed from: i */
    public final boolean mo109897i() {
        Iterator it = this.f155650f.iterator();
        while (it.hasNext()) {
            if (((TimeSpeedModelExtension) it.next()).getBackgroundVideo() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo109900l() {
        if (!this.f155643H || mo109889b() || mo109890c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo109890c() {
        if (this.f155660p.f155723a == null || TextUtils.isEmpty(this.f155660p.f155723a.videoPath) || TextUtils.isEmpty(this.f155660p.f155723a.wavPath)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo109894f() {
        String e = mo109893e();
        if (e != null) {
            return e;
        }
        if (this.f155659o.f155682d != null) {
            return this.f155659o.f155682d;
        }
        if (this.f155660p.f155723a != null) {
            return this.f155660p.f155723a.wavPath;
        }
        return null;
    }

    /* renamed from: j */
    public final C70650dt mo109898j() {
        if (!this.f155653i || C84892d.m145850a(this.f155644I)) {
            return this.f155650f;
        }
        C70650dt dtVar = new C70650dt(this.f155650f);
        dtVar.remove(this.f155668x.mo109994b());
        dtVar.addAll(this.f155668x.mo109994b(), this.f155644I);
        return dtVar;
    }

    /* renamed from: a */
    public final void mo109887a(long j) {
        if (this.f155653i) {
            this.f155654j = j;
        } else {
            this.f155651g = j;
        }
    }

    /* renamed from: a */
    public static ArrayList<TimeSpeedModelExtension> m123137a(String str) {
        try {
            ArrayList arrayList = (ArrayList) C84401c.f188719c.mo46671a(str, new C27895a<ArrayList<C28022o>>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel.C697211 */

                static {
                    Covode.recordClassIndex(82103);
                }
            }.type);
            ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(TimeSpeedModelExtension.fromJson(C84401c.f188719c, (C28022o) it.next()));
            }
            return arrayList2;
        } catch (Exception unused) {
            return m123138b(str);
        }
    }

    public CameraComponentModel(int i) {
        this.f155650f = new C70650dt();
        this.f155644I = new C70650dt();
        this.f155651g = 0;
        this.f155654j = 0;
        this.f155656l = false;
        this.f155657m = false;
        this.f155659o = new DuetContext((byte) 0);
        this.f155660p = new ReactionContext((byte) 0);
        this.f155663s = true;
        this.f155664t = true;
        this.f155636A = -1.0f;
        this.f155641F = false;
        this.f155642G = new RecordContext();
        this.f155643H = false;
        this.f155645a = i;
    }

    /* renamed from: b */
    private static ArrayList<TimeSpeedModelExtension> m123138b(String str) {
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split("\\$");
        if (split.length > 0) {
            for (String str2 : split) {
                String[] split2 = str2.split(",");
                if (split2.length == 2) {
                    try {
                        arrayList.add(new TimeSpeedModelExtension(Integer.parseInt(split2[0]), (double) Float.parseFloat(split2[1]), null, null, null));
                    } catch (Exception unused) {
                    }
                }
                if (split2.length == 3) {
                    try {
                        arrayList.add(new TimeSpeedModelExtension(Integer.parseInt(split2[0]), (double) Float.parseFloat(split2[1]), split2[2], null, null));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    private CameraComponentModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f155650f = new C70650dt();
        this.f155644I = new C70650dt();
        this.f155651g = 0;
        this.f155654j = 0;
        boolean z5 = false;
        this.f155656l = false;
        this.f155657m = false;
        this.f155659o = new DuetContext((byte) 0);
        this.f155660p = new ReactionContext((byte) 0);
        this.f155663s = true;
        this.f155664t = true;
        this.f155636A = -1.0f;
        this.f155641F = false;
        this.f155642G = new RecordContext();
        this.f155643H = false;
        this.f155645a = parcel.readInt();
        this.f155646b = parcel.readLong();
        this.f155669y = parcel.readString();
        this.f155661q = parcel.readInt();
        this.f155647c = parcel.readInt();
        this.f155648d = parcel.readInt();
        this.f155652h = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.f155650f = new C70650dt(m123137a(parcel.readString()));
        this.f155651g = parcel.readLong();
        this.f155649e = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f155637B = z;
        this.f155638C = parcel.readInt();
        this.f155659o = (DuetContext) parcel.readParcelable(DuetContext.class.getClassLoader());
        this.f155642G = (RecordContext) parcel.readParcelable(RecordContext.class.getClassLoader());
        this.f155660p = (ReactionContext) parcel.readParcelable(ReactionContext.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f155663s = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f155664t = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f155656l = z4;
        this.f155665u = parcel.readInt();
        this.f155666v = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.f155667w = (ExtractFramesModel) parcel.readSerializable();
        this.f155658n = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.f155670z = parcel.readByte() != 0 ? true : z5;
        this.f155636A = parcel.readFloat();
    }

    /* synthetic */ CameraComponentModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f155645a);
        parcel.writeLong(this.f155646b);
        parcel.writeString(this.f155669y);
        parcel.writeInt(this.f155661q);
        parcel.writeInt(this.f155647c);
        parcel.writeInt(this.f155648d);
        parcel.writeParcelable(this.f155652h, i);
        parcel.writeString(C70651du.m124878a(this.f155650f));
        parcel.writeLong(this.f155651g);
        parcel.writeInt(this.f155649e);
        parcel.writeInt(this.f155637B ? 1 : 0);
        parcel.writeInt(this.f155638C);
        parcel.writeParcelable(this.f155659o, i);
        parcel.writeParcelable(this.f155642G, i);
        parcel.writeParcelable(this.f155660p, i);
        parcel.writeByte(this.f155663s ? (byte) 1 : 0);
        parcel.writeByte(this.f155664t ? (byte) 1 : 0);
        parcel.writeByte(this.f155656l ? (byte) 1 : 0);
        parcel.writeInt(this.f155665u);
        parcel.writeParcelable(this.f155666v, i);
        parcel.writeSerializable(this.f155667w);
        parcel.writeParcelable(this.f155658n, i);
        parcel.writeByte(this.f155670z ? (byte) 1 : 0);
        parcel.writeFloat(this.f155636A);
    }
}
