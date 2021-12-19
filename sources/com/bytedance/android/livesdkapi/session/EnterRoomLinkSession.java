package com.bytedance.android.livesdkapi.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EnterRoomLinkSession implements ILinkSession {
    public static final Parcelable.Creator<EnterRoomLinkSession> CREATOR = new Parcelable.Creator<EnterRoomLinkSession>() {
        /* class com.bytedance.android.livesdkapi.session.EnterRoomLinkSession.C118631 */

        static {
            Covode.recordClassIndex(13579);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EnterRoomLinkSession[] newArray(int i) {
            return new EnterRoomLinkSession[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnterRoomLinkSession createFromParcel(Parcel parcel) {
            return new EnterRoomLinkSession(parcel);
        }
    };

    /* renamed from: a */
    final String f28390a;

    /* renamed from: b */
    public EnterRoomConfig f28391b;

    /* renamed from: c */
    private List<Event> f28392c;

    /* renamed from: d */
    private JSONObject f28393d;

    /* renamed from: e */
    private List<String> f28394e;

    @Override // com.bytedance.android.livesdkapi.session.ILinkSession
    /* renamed from: c */
    public final String mo18997c() {
        return "ttlive_room_enter_link_monitor";
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.session.AbstractC11867c
    /* renamed from: a */
    public final String mo18995a() {
        return this.f28390a;
    }

    static {
        Covode.recordClassIndex(13578);
    }

    @Override // com.bytedance.android.livesdkapi.session.ILinkSession
    /* renamed from: b */
    public final JSONObject mo18996b() {
        m20944a(this.f28393d, "event_session_id", this.f28390a);
        EnterRoomConfig enterRoomConfig = this.f28391b;
        if (enterRoomConfig != null) {
            m20944a(this.f28393d, "enter_from", enterRoomConfig.f28233c.f28293J);
            m20944a(this.f28393d, "room_id", new StringBuilder().append(this.f28391b.f28233c.f28301R).toString());
            m20944a(this.f28393d, "user_id", this.f28391b.f28233c.f28287D);
            m20944a(this.f28393d, "anchor_id", this.f28391b.f28232b.f28258b);
            m20944a(this.f28393d, "enter_method", this.f28391b.f28233c.f28295L);
            m20944a(this.f28393d, "action_type", this.f28391b.f28233c.f28321ab);
            m20944a(this.f28393d, "live_window_mode", this.f28391b.f28233c.f28306W);
            m20944a(this.f28393d, "from_auto_jump", String.valueOf(this.f28391b.f28233c.f28330ak ? 1 : 0));
        }
        for (Event event : this.f28392c) {
            Iterator<String> keys = event.f28395a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!this.f28393d.has(next) && (!this.f28394e.contains(next))) {
                    m20944a(this.f28393d, next, event.f28395a.optString(next));
                }
            }
        }
        if (this.f28392c.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f28392c.size(); i++) {
                m20944a(this.f28392c.get(i).f28395a, "event_session_id", this.f28390a);
                try {
                    jSONArray.put(i, this.f28392c.get(i).f28395a);
                } catch (JSONException e) {
                    C3854a.m9453a(6, "EnterRoomLinkSession", e.getMessage());
                }
            }
            try {
                this.f28393d.put("event_list", jSONArray);
            } catch (JSONException e2) {
                C3854a.m9453a(6, "EnterRoomLinkSession", e2.getMessage());
            }
        }
        return this.f28393d;
    }

    /* renamed from: a */
    public static EnterRoomLinkSession m20943a(EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        C11870f.C11871a.f28404a.mo19012a(enterRoomLinkSession);
        return enterRoomLinkSession;
    }

    public EnterRoomLinkSession(EnterRoomConfig enterRoomConfig) {
        this.f28392c = new CopyOnWriteArrayList();
        this.f28393d = new JSONObject();
        this.f28394e = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.f28390a = UUID.randomUUID().toString();
        this.f28391b = enterRoomConfig;
    }

    protected EnterRoomLinkSession(Parcel parcel) {
        this.f28392c = new CopyOnWriteArrayList();
        this.f28393d = new JSONObject();
        this.f28394e = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.f28390a = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f28392c = arrayList;
        parcel.readList(arrayList, Event.class.getClassLoader());
        this.f28391b = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
        try {
            this.f28393d = new JSONObject(parcel.readString());
        } catch (Throwable unused) {
            this.f28393d = new JSONObject();
        }
        this.f28394e = parcel.createStringArrayList();
    }

    /* renamed from: a */
    public final EnterRoomLinkSession mo18994a(Event event) {
        this.f28392c.add(event);
        if (((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline()) {
            C3854a.m9453a(3, "ttlive_room_enter_link_monitor", event.f28395a.toString());
        }
        int intValue = Integer.valueOf(event.f28395a.optString("status_code")).intValue();
        if (intValue > 32768) {
            EnterRoomLinkSession a = C11870f.C11871a.f28404a.mo19010a();
            if (C11868d.m20956a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
                C6203g.m13466b(new RunnableC11869e(a, intValue));
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28390a);
        parcel.writeList(this.f28392c);
        parcel.writeParcelable(this.f28391b, i);
        parcel.writeString(this.f28393d.toString());
        parcel.writeStringList(this.f28394e);
    }

    /* renamed from: a */
    public static void m20944a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C3854a.m9453a(6, "EnterRoomLinkSession", e.getMessage());
        }
    }
}
