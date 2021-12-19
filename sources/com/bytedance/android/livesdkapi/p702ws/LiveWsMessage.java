package com.bytedance.android.livesdkapi.p702ws;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.ws.LiveWsMessage */
public class LiveWsMessage implements Parcelable {
    public static final Parcelable.Creator<LiveWsMessage> CREATOR = new Parcelable.Creator<LiveWsMessage>() {
        /* class com.bytedance.android.livesdkapi.p702ws.LiveWsMessage.C118811 */

        static {
            Covode.recordClassIndex(13603);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LiveWsMessage[] newArray(int i) {
            return new LiveWsMessage[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LiveWsMessage createFromParcel(Parcel parcel) {
            return new LiveWsMessage(parcel);
        }
    };

    /* renamed from: a */
    public static LiveWsMessage f28420a = new LiveWsMessage();

    /* renamed from: b */
    public long f28421b;

    /* renamed from: c */
    public long f28422c;

    /* renamed from: d */
    public int f28423d;

    /* renamed from: e */
    public int f28424e;

    /* renamed from: f */
    public List<MsgHeader> f28425f;

    /* renamed from: g */
    public String f28426g;

    /* renamed from: h */
    public String f28427h;

    /* renamed from: i */
    public byte[] f28428i;

    /* renamed from: j */
    public ComponentName f28429j;

    /* renamed from: k */
    public int f28430k;

    public int describeContents() {
        return 0;
    }

    private LiveWsMessage() {
    }

    /* renamed from: com.bytedance.android.livesdkapi.ws.LiveWsMessage$a */
    public static final class C11883a {

        /* renamed from: a */
        public Map<String, String> f28433a = new HashMap();

        /* renamed from: b */
        public long f28434b;

        /* renamed from: c */
        public int f28435c;

        /* renamed from: d */
        public int f28436d;

        /* renamed from: e */
        public byte[] f28437e;

        /* renamed from: f */
        public String f28438f = "";

        /* renamed from: g */
        public String f28439g = "";

        /* renamed from: h */
        public long f28440h;

        /* renamed from: i */
        public ComponentName f28441i;

        /* renamed from: j */
        private final int f28442j;

        static {
            Covode.recordClassIndex(13606);
        }

        /* renamed from: a */
        public static C11883a m20974a() {
            return new C11883a(10001);
        }

        /* renamed from: b */
        public final LiveWsMessage mo19041b() {
            if (this.f28442j <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f28435c <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f28436d <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f28437e != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : this.f28433a.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f28431a = entry.getKey();
                    msgHeader.f28432b = entry.getValue();
                    arrayList.add(msgHeader);
                }
                return new LiveWsMessage(this.f28442j, this.f28440h, this.f28434b, this.f28435c, this.f28436d, arrayList, this.f28439g, this.f28438f, this.f28437e, this.f28441i);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        public C11883a(int i) {
            this.f28442j = i;
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader */
    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new Parcelable.Creator<MsgHeader>() {
            /* class com.bytedance.android.livesdkapi.p702ws.LiveWsMessage.MsgHeader.C118821 */

            static {
                Covode.recordClassIndex(13605);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MsgHeader[] newArray(int i) {
                return new MsgHeader[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MsgHeader createFromParcel(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f28431a = parcel.readString();
                msgHeader.f28432b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a */
        public String f28431a;

        /* renamed from: b */
        public String f28432b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(13604);
        }

        public String toString() {
            return "MsgHeader{key='" + this.f28431a + '\'' + ", value='" + this.f28432b + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f28431a);
            parcel.writeString(this.f28432b);
        }
    }

    /* renamed from: a */
    public final byte[] mo19030a() {
        if (this.f28428i == null) {
            this.f28428i = new byte[1];
        }
        return this.f28428i;
    }

    static {
        Covode.recordClassIndex(13602);
    }

    public String toString() {
        return "LiveWsMessage{, channelId = " + this.f28430k + ", logId=" + this.f28422c + ", service=" + this.f28423d + ", method=" + this.f28424e + ", msgHeaders=" + this.f28425f + ", payloadEncoding='" + this.f28426g + '\'' + ", payloadType='" + this.f28427h + '\'' + ", payload=" + Arrays.toString(this.f28428i) + ", replayToComponentName=" + this.f28429j + '}';
    }

    protected LiveWsMessage(Parcel parcel) {
        this.f28421b = parcel.readLong();
        this.f28422c = parcel.readLong();
        this.f28423d = parcel.readInt();
        this.f28424e = parcel.readInt();
        this.f28425f = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f28426g = parcel.readString();
        this.f28427h = parcel.readString();
        this.f28428i = parcel.createByteArray();
        this.f28429j = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f28430k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f28421b);
        parcel.writeLong(this.f28422c);
        parcel.writeInt(this.f28423d);
        parcel.writeInt(this.f28424e);
        parcel.writeTypedList(this.f28425f);
        parcel.writeString(this.f28426g);
        parcel.writeString(this.f28427h);
        parcel.writeByteArray(this.f28428i);
        parcel.writeParcelable(this.f28429j, i);
        parcel.writeInt(this.f28430k);
    }

    public LiveWsMessage(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f28430k = i;
        this.f28421b = j;
        this.f28422c = j2;
        this.f28423d = i2;
        this.f28424e = i3;
        this.f28425f = list;
        this.f28426g = str;
        this.f28427h = str2;
        this.f28428i = bArr;
        this.f28429j = componentName;
    }
}
