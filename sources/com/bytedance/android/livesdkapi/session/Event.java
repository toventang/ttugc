package com.bytedance.android.livesdkapi.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() {
        /* class com.bytedance.android.livesdkapi.session.Event.C118641 */

        static {
            Covode.recordClassIndex(13581);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Event[] newArray(int i) {
            return new Event[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }
    };

    /* renamed from: a */
    public JSONObject f28395a = new JSONObject();

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(13580);
    }

    /* renamed from: a */
    public final Event mo19002a() {
        m20949a(this.f28395a, "has_warmed_up", "true");
        return this;
    }

    /* renamed from: a */
    public final Event mo19003a(String str) {
        m20949a(this.f28395a, "status_msg", str);
        return this;
    }

    protected Event(Parcel parcel) {
        try {
            this.f28395a = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            this.f28395a = new JSONObject();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28395a.toString());
    }

    /* renamed from: a */
    public static void m20949a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C3854a.m9453a(6, "Event", e.getMessage());
        }
    }

    public Event(String str, int i, EnumC11866b bVar) {
        m20949a(this.f28395a, "service", !str.startsWith("ttlive_") ? "ttlive_".concat(String.valueOf(str)) : str);
        m20949a(this.f28395a, "timestamp", String.valueOf(SystemClock.elapsedRealtime()));
        m20949a(this.f28395a, "event_module", "enter_room");
        m20949a(this.f28395a, "status_code", String.valueOf(i));
        m20949a(this.f28395a, "event_type", bVar.getType());
    }
}
