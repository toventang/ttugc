package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new Parcelable.Creator<WsChannelMsg>() {
        /* class com.bytedance.common.wschannel.model.WsChannelMsg.C137661 */

        static {
            Covode.recordClassIndex(15812);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WsChannelMsg[] newArray(int i) {
            return new WsChannelMsg[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WsChannelMsg createFromParcel(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }
    };

    /* renamed from: c */
    public static WsChannelMsg f33465c = new WsChannelMsg();

    /* renamed from: d */
    public long f33466d;

    /* renamed from: e */
    public long f33467e;

    /* renamed from: f */
    public int f33468f;

    /* renamed from: g */
    public int f33469g;

    /* renamed from: h */
    public List<MsgHeader> f33470h;

    /* renamed from: i */
    public String f33471i;

    /* renamed from: j */
    public String f33472j;

    /* renamed from: k */
    public byte[] f33473k;

    /* renamed from: l */
    public ComponentName f33474l;

    /* renamed from: m */
    public int f33475m;

    /* renamed from: n */
    public NewMsgTimeHolder f33476n;

    /* renamed from: o */
    public transient long f33477o;

    public int describeContents() {
        return 0;
    }

    public WsChannelMsg() {
    }

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new Parcelable.Creator<MsgHeader>() {
            /* class com.bytedance.common.wschannel.model.WsChannelMsg.MsgHeader.C137671 */

            static {
                Covode.recordClassIndex(15814);
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
                msgHeader.f33478a = parcel.readString();
                msgHeader.f33479b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a */
        public String f33478a;

        /* renamed from: b */
        public String f33479b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(15813);
        }

        public String toString() {
            return "MsgHeader{key='" + this.f33478a + '\'' + ", value='" + this.f33479b + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f33478a);
            parcel.writeString(this.f33479b);
        }
    }

    /* renamed from: a */
    public final byte[] mo22159a() {
        if (this.f33473k == null) {
            this.f33473k = new byte[1];
        }
        return this.f33473k;
    }

    static {
        Covode.recordClassIndex(15811);
    }

    /* renamed from: com.bytedance.common.wschannel.model.WsChannelMsg$a */
    public static final class C13768a {

        /* renamed from: a */
        public long f33480a;

        /* renamed from: b */
        public int f33481b;

        /* renamed from: c */
        public int f33482c;

        /* renamed from: d */
        public byte[] f33483d;

        /* renamed from: e */
        public String f33484e = "";

        /* renamed from: f */
        public String f33485f = "";

        /* renamed from: g */
        public long f33486g;

        /* renamed from: h */
        public ComponentName f33487h;

        /* renamed from: i */
        private final int f33488i;

        /* renamed from: j */
        private Map<String, String> f33489j = new HashMap();

        static {
            Covode.recordClassIndex(15815);
        }

        /* renamed from: a */
        public final WsChannelMsg mo22171a() {
            if (this.f33488i <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f33481b <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f33482c <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f33483d != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : this.f33489j.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f33478a = entry.getKey();
                    msgHeader.f33479b = entry.getValue();
                    arrayList.add(msgHeader);
                }
                return new WsChannelMsg(this.f33488i, this.f33486g, this.f33480a, this.f33481b, this.f33482c, arrayList, this.f33485f, this.f33484e, this.f33483d, this.f33487h);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        /* renamed from: a */
        public static C13768a m24830a(int i) {
            return new C13768a(i);
        }

        public C13768a(int i) {
            this.f33488i = i;
        }

        /* renamed from: a */
        public final C13768a mo22170a(String str, String str2) {
            this.f33489j.put(str, str2);
            return this;
        }
    }

    public String toString() {
        return "WsChannelMsg{, channelId = " + this.f33475m + ", logId=" + this.f33467e + ", service=" + this.f33468f + ", method=" + this.f33469g + ", msgHeaders=" + this.f33470h + ", payloadEncoding='" + this.f33471i + '\'' + ", payloadType='" + this.f33472j + '\'' + ", payload=" + Arrays.toString(this.f33473k) + ", replayToComponentName=" + this.f33474l + '}';
    }

    public WsChannelMsg(WsChannelMsg wsChannelMsg) {
        this.f33466d = wsChannelMsg.f33466d;
        this.f33467e = wsChannelMsg.f33467e;
        this.f33468f = wsChannelMsg.f33468f;
        this.f33469g = wsChannelMsg.f33469g;
        this.f33470h = wsChannelMsg.f33470h;
        this.f33473k = wsChannelMsg.mo22159a();
        this.f33471i = wsChannelMsg.f33471i;
        this.f33472j = wsChannelMsg.f33472j;
        this.f33475m = wsChannelMsg.f33475m;
        this.f33474l = wsChannelMsg.f33474l;
        this.f33476n = wsChannelMsg.f33476n;
    }

    protected WsChannelMsg(Parcel parcel) {
        this.f33466d = parcel.readLong();
        this.f33467e = parcel.readLong();
        this.f33468f = parcel.readInt();
        this.f33469g = parcel.readInt();
        this.f33470h = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f33471i = parcel.readString();
        this.f33472j = parcel.readString();
        this.f33473k = parcel.createByteArray();
        this.f33474l = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f33475m = parcel.readInt();
        this.f33476n = (NewMsgTimeHolder) parcel.readParcelable(NewMsgTimeHolder.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f33466d);
        parcel.writeLong(this.f33467e);
        parcel.writeInt(this.f33468f);
        parcel.writeInt(this.f33469g);
        parcel.writeTypedList(this.f33470h);
        parcel.writeString(this.f33471i);
        parcel.writeString(this.f33472j);
        parcel.writeByteArray(this.f33473k);
        parcel.writeParcelable(this.f33474l, i);
        parcel.writeInt(this.f33475m);
        parcel.writeParcelable(this.f33476n, i);
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f33475m = i;
        this.f33466d = j;
        this.f33467e = j2;
        this.f33468f = i2;
        this.f33469g = i3;
        this.f33470h = list;
        this.f33471i = str;
        this.f33472j = str2;
        this.f33473k = bArr;
        this.f33474l = componentName;
    }
}
