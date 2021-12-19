package com.bytedance.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new Parcelable.Creator<PushBody>() {
        /* class com.bytedance.push.PushBody.C217561 */

        static {
            Covode.recordClassIndex(25405);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PushBody[] newArray(int i) {
            return new PushBody[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PushBody createFromParcel(Parcel parcel) {
            return new PushBody(parcel);
        }
    };

    /* renamed from: a */
    public long f51542a;

    /* renamed from: b */
    public long f51543b;

    /* renamed from: c */
    public final String f51544c;

    /* renamed from: d */
    public final boolean f51545d;

    /* renamed from: e */
    public final String f51546e;

    /* renamed from: f */
    public final boolean f51547f;

    /* renamed from: g */
    public String f51548g;

    /* renamed from: h */
    public String f51549h;

    /* renamed from: i */
    public boolean f51550i;

    /* renamed from: j */
    public JSONObject f51551j;

    /* renamed from: k */
    public String f51552k;

    /* renamed from: l */
    public String f51553l;

    /* renamed from: m */
    public String f51554m;

    /* renamed from: n */
    public int f51555n;

    /* renamed from: o */
    public String f51556o;

    /* renamed from: p */
    public boolean f51557p;

    /* renamed from: q */
    public boolean f51558q;

    /* renamed from: r */
    public boolean f51559r;

    /* renamed from: s */
    public int f51560s;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(25404);
    }

    /* renamed from: a */
    public final String mo35387a() {
        JSONObject jSONObject = this.f51551j;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    public String toString() {
        return "PushBody{groupId='" + this.f51544c + '\'' + ", extra='" + this.f51548g + '\'' + ", mNotificationChannelId='" + this.f51549h + '\'' + ", mIsPassThough=" + this.f51550i + ", msgData=" + this.f51551j + ", text='" + this.f51552k + '\'' + ", title='" + this.f51553l + '\'' + ", imageUrl='" + this.f51554m + '\'' + ", imageType=" + this.f51555n + ", id=" + this.f51542a + ", open_url='" + this.f51556o + '\'' + ", useLED=" + this.f51557p + ", useSound=" + this.f51558q + ", useVibrator=" + this.f51559r + ", messageType=" + this.f51560s + '}';
    }

    protected PushBody(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f51542a = parcel.readLong();
        this.f51543b = parcel.readLong();
        this.f51544c = parcel.readString();
        boolean z6 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f51545d = z;
        this.f51546e = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51547f = z2;
        this.f51548g = parcel.readString();
        this.f51549h = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f51550i = z3;
        try {
            this.f51551j = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f51552k = parcel.readString();
        this.f51553l = parcel.readString();
        this.f51554m = parcel.readString();
        this.f51555n = parcel.readInt();
        this.f51556o = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f51557p = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f51558q = z5;
        this.f51559r = parcel.readByte() == 0 ? false : z6;
        this.f51560s = parcel.readInt();
    }

    public PushBody(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.f51551j = jSONObject;
        this.f51556o = jSONObject.optString("open_url");
        this.f51552k = jSONObject.optString("text");
        this.f51553l = jSONObject.optString("title");
        this.f51554m = jSONObject.optString("image_url");
        this.f51542a = jSONObject.optLong("id", 0);
        this.f51543b = jSONObject.optLong("rid64", 0);
        this.f51557p = m40725a(jSONObject, "use_led");
        this.f51558q = m40725a(jSONObject, "sound");
        this.f51559r = m40725a(jSONObject, "use_vibrator");
        boolean z3 = false;
        this.f51555n = jSONObject.optInt("image_type", 0);
        if (jSONObject.optInt("pass_through", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f51550i = z;
        this.f51549h = jSONObject.optString("notify_channel");
        this.f51560s = jSONObject.optInt("msg_from");
        this.f51544c = jSONObject.optString("group_id_str");
        if (jSONObject.optInt("st", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51545d = z2;
        this.f51546e = jSONObject.optString("ttpush_sec_target_uid");
        this.f51547f = jSONObject.optInt("ttpush_need_filter_uid", 0) > 0 ? true : z3;
        this.f51548g = jSONObject.optString("extra_str");
    }

    /* renamed from: a */
    private static boolean m40725a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return false;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f51542a);
        parcel.writeLong(this.f51543b);
        parcel.writeString(this.f51544c);
        parcel.writeByte(this.f51545d ? (byte) 1 : 0);
        parcel.writeString(this.f51546e);
        parcel.writeByte(this.f51547f ? (byte) 1 : 0);
        parcel.writeString(this.f51548g);
        parcel.writeString(this.f51549h);
        parcel.writeByte(this.f51550i ? (byte) 1 : 0);
        parcel.writeString(this.f51551j.toString());
        parcel.writeString(this.f51552k);
        parcel.writeString(this.f51553l);
        parcel.writeString(this.f51554m);
        parcel.writeInt(this.f51555n);
        parcel.writeString(this.f51556o);
        parcel.writeByte(this.f51557p ? (byte) 1 : 0);
        parcel.writeByte(this.f51558q ? (byte) 1 : 0);
        parcel.writeByte(this.f51559r ? (byte) 1 : 0);
        parcel.writeInt(this.f51560s);
    }
}
