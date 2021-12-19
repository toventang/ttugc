package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new Parcelable.Creator<SocketState>() {
        /* class com.bytedance.common.wschannel.model.SocketState.C137631 */

        static {
            Covode.recordClassIndex(15807);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SocketState[] newArray(int i) {
            return new SocketState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SocketState createFromParcel(Parcel parcel) {
            return new SocketState(parcel);
        }
    };

    /* renamed from: a */
    public int f33438a;

    /* renamed from: b */
    public int f33439b;

    /* renamed from: c */
    public String f33440c;

    /* renamed from: d */
    public int f33441d;

    /* renamed from: e */
    public int f33442e;

    /* renamed from: f */
    public String f33443f;

    /* renamed from: g */
    public int f33444g;

    public int describeContents() {
        return 0;
    }

    public SocketState() {
    }

    static {
        Covode.recordClassIndex(15806);
    }

    /* renamed from: a */
    public final JSONObject mo22146a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.f33441d);
            jSONObject.put(StringSet.type, this.f33438a);
            jSONObject.put("state", this.f33439b);
            jSONObject.put("url", this.f33440c);
            jSONObject.put("channel_type", this.f33442e);
            jSONObject.put("error", this.f33443f);
            jSONObject.put("error_code", this.f33444g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "SocketState{connectionType=" + this.f33438a + ", connectionState=" + this.f33439b + ", connectionUrl='" + this.f33440c + '\'' + ", channelId=" + this.f33441d + ", channelType=" + this.f33442e + ", error='" + this.f33443f + '\'' + '}';
    }

    protected SocketState(Parcel parcel) {
        this.f33438a = parcel.readInt();
        this.f33439b = parcel.readInt();
        this.f33440c = parcel.readString();
        this.f33441d = parcel.readInt();
        this.f33442e = parcel.readInt();
        this.f33443f = parcel.readString();
        this.f33444g = parcel.readInt();
    }

    /* renamed from: a */
    public static SocketState m24814a(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.f33441d = jSONObject.optInt("channel_id", Integer.MIN_VALUE);
        socketState.f33438a = jSONObject.optInt(StringSet.type, -1);
        socketState.f33439b = jSONObject.optInt("state", -1);
        socketState.f33440c = jSONObject.optString("url", "");
        socketState.f33442e = jSONObject.optInt("channel_type");
        socketState.f33443f = jSONObject.optString("error", "");
        socketState.f33444g = jSONObject.optInt("error_code");
        return socketState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33438a);
        parcel.writeInt(this.f33439b);
        parcel.writeString(this.f33440c);
        parcel.writeInt(this.f33441d);
        parcel.writeInt(this.f33442e);
        parcel.writeString(this.f33443f);
        parcel.writeInt(this.f33444g);
    }
}
