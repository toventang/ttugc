package android.support.p010v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* class android.support.p010v4.media.session.PlaybackStateCompat.C01451 */

        static {
            Covode.recordClassIndex(167);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };

    /* renamed from: a */
    public final int f425a;

    /* renamed from: b */
    public final long f426b;

    /* renamed from: c */
    public final long f427c;

    /* renamed from: d */
    public final float f428d;

    /* renamed from: e */
    public final long f429e;

    /* renamed from: f */
    public final int f430f;

    /* renamed from: g */
    public final CharSequence f431g;

    /* renamed from: h */
    public final long f432h;

    /* renamed from: i */
    public List<CustomAction> f433i;

    /* renamed from: j */
    public final long f434j;

    /* renamed from: k */
    public final Bundle f435k;

    /* renamed from: l */
    Object f436l;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static final class C0147a {

        /* renamed from: a */
        private final List<CustomAction> f442a;

        /* renamed from: b */
        private int f443b;

        /* renamed from: c */
        private long f444c;

        /* renamed from: d */
        private long f445d;

        /* renamed from: e */
        private float f446e;

        /* renamed from: f */
        private long f447f;

        /* renamed from: g */
        private int f448g;

        /* renamed from: h */
        private CharSequence f449h;

        /* renamed from: i */
        private long f450i;

        /* renamed from: j */
        private long f451j;

        /* renamed from: k */
        private Bundle f452k;

        static {
            Covode.recordClassIndex(170);
        }

        /* renamed from: a */
        public final C0147a mo288a() {
            this.f447f = 822;
            return this;
        }

        public C0147a() {
            this.f442a = new ArrayList();
            this.f451j = -1;
        }

        /* renamed from: b */
        public final PlaybackStateCompat mo291b() {
            return new PlaybackStateCompat(this.f443b, this.f444c, this.f445d, this.f446e, this.f447f, this.f448g, this.f449h, this.f450i, this.f442a, this.f451j, this.f452k);
        }

        public C0147a(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f442a = arrayList;
            this.f451j = -1;
            this.f443b = playbackStateCompat.f425a;
            this.f444c = playbackStateCompat.f426b;
            this.f446e = playbackStateCompat.f428d;
            this.f450i = playbackStateCompat.f432h;
            this.f445d = playbackStateCompat.f427c;
            this.f447f = playbackStateCompat.f429e;
            this.f448g = playbackStateCompat.f430f;
            this.f449h = playbackStateCompat.f431g;
            if (playbackStateCompat.f433i != null) {
                arrayList.addAll(playbackStateCompat.f433i);
            }
            this.f451j = playbackStateCompat.f434j;
            this.f452k = playbackStateCompat.f435k;
        }

        /* renamed from: a */
        public final C0147a mo289a(int i, long j) {
            return mo290a(i, j, 1.0f, SystemClock.elapsedRealtime());
        }

        /* renamed from: a */
        public final C0147a mo290a(int i, long j, float f, long j2) {
            this.f443b = i;
            this.f444c = j;
            this.f450i = j2;
            this.f446e = f;
            return this;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* class android.support.p010v4.media.session.PlaybackStateCompat.CustomAction.C01461 */

            static {
                Covode.recordClassIndex(169);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };

        /* renamed from: a */
        public final String f437a;

        /* renamed from: b */
        public final CharSequence f438b;

        /* renamed from: c */
        public final int f439c;

        /* renamed from: d */
        public final Bundle f440d;

        /* renamed from: e */
        Object f441e;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(168);
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f438b) + ", mIcon=" + this.f439c + ", mExtras=" + this.f440d;
        }

        CustomAction(Parcel parcel) {
            this.f437a = parcel.readString();
            this.f438b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f439c = parcel.readInt();
            this.f440d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f437a);
            TextUtils.writeToParcel(this.f438b, parcel, i);
            parcel.writeInt(this.f439c);
            parcel.writeBundle(this.f440d);
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f437a = str;
            this.f438b = charSequence;
            this.f439c = i;
            this.f440d = bundle;
        }
    }

    static {
        Covode.recordClassIndex(166);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f425a);
        sb.append(", position=").append(this.f426b);
        sb.append(", buffered position=").append(this.f427c);
        sb.append(", speed=").append(this.f428d);
        sb.append(", updated=").append(this.f432h);
        sb.append(", actions=").append(this.f429e);
        sb.append(", error code=").append(this.f430f);
        sb.append(", error message=").append(this.f431g);
        sb.append(", custom actions=").append(this.f433i);
        sb.append(", active item id=").append(this.f434j);
        sb.append("}");
        return sb.toString();
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f425a = parcel.readInt();
        this.f426b = parcel.readLong();
        this.f428d = parcel.readFloat();
        this.f432h = parcel.readLong();
        this.f427c = parcel.readLong();
        this.f429e = parcel.readLong();
        this.f431g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f433i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f434j = parcel.readLong();
        this.f435k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f430f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f425a);
        parcel.writeLong(this.f426b);
        parcel.writeFloat(this.f428d);
        parcel.writeLong(this.f432h);
        parcel.writeLong(this.f427c);
        parcel.writeLong(this.f429e);
        TextUtils.writeToParcel(this.f431g, parcel, i);
        parcel.writeTypedList(this.f433i);
        parcel.writeLong(this.f434j);
        parcel.writeBundle(this.f435k);
        parcel.writeInt(this.f430f);
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f425a = i;
        this.f426b = j;
        this.f427c = j2;
        this.f428d = f;
        this.f429e = j3;
        this.f430f = i2;
        this.f431g = charSequence;
        this.f432h = j4;
        this.f433i = new ArrayList(list);
        this.f434j = j5;
        this.f435k = bundle;
    }
}
