package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new Parcelable.Creator<SsWsApp>() {
        /* class com.bytedance.common.wschannel.model.SsWsApp.C137641 */

        static {
            Covode.recordClassIndex(15809);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SsWsApp[] newArray(int i) {
            return new SsWsApp[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SsWsApp createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }
    };

    /* renamed from: a */
    List<String> f33445a;

    /* renamed from: b */
    int f33446b;

    /* renamed from: c */
    String f33447c;

    /* renamed from: d */
    int f33448d;

    /* renamed from: e */
    String f33449e;

    /* renamed from: f */
    String f33450f;

    /* renamed from: g */
    int f33451g;

    /* renamed from: h */
    int f33452h;

    /* renamed from: i */
    int f33453i;

    /* renamed from: j */
    String f33454j;

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: a */
    public final int mo21927a() {
        return this.f33446b;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: b */
    public final int mo21928b() {
        return this.f33448d;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: c */
    public final String mo21929c() {
        return this.f33449e;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: d */
    public final String mo21930d() {
        return this.f33450f;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: e */
    public final int mo21931e() {
        return this.f33451g;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: f */
    public final int mo21932f() {
        return this.f33452h;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: h */
    public final String mo21934h() {
        return this.f33454j;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: i */
    public final int mo21935i() {
        return this.f33453i;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: j */
    public final String mo21936j() {
        return this.f33447c;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: k */
    public final List<String> mo21937k() {
        return this.f33445a;
    }

    static {
        Covode.recordClassIndex(15808);
    }

    protected SsWsApp() {
        this.f33445a = new ArrayList();
    }

    /* renamed from: com.bytedance.common.wschannel.model.SsWsApp$a */
    public static class C13765a {

        /* renamed from: a */
        public int f33455a;

        /* renamed from: b */
        public String f33456b;

        /* renamed from: c */
        public String f33457c;

        /* renamed from: d */
        public int f33458d;

        /* renamed from: e */
        public int f33459e;

        /* renamed from: f */
        public int f33460f;

        /* renamed from: g */
        public String f33461g;

        /* renamed from: h */
        public String f33462h;

        /* renamed from: i */
        public int f33463i;

        /* renamed from: j */
        public List<String> f33464j;

        static {
            Covode.recordClassIndex(15810);
        }

        /* renamed from: a */
        public final SsWsApp mo22158a() {
            return new SsWsApp(this.f33463i, this.f33455a, this.f33456b, this.f33457c, this.f33464j, this.f33458d, this.f33459e, this.f33460f, this.f33461g, this.f33462h, (byte) 0);
        }

        /* renamed from: a */
        public static SsWsApp m24827a(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            if (jSONObject != null) {
                ssWsApp.f33446b = jSONObject.optInt("channel_id");
                ssWsApp.f33448d = jSONObject.optInt("app_id");
                ssWsApp.f33449e = jSONObject.optString("device_id");
                ssWsApp.f33450f = jSONObject.optString("install_id");
                ssWsApp.f33451g = jSONObject.optInt("app_version");
                ssWsApp.f33452h = jSONObject.optInt("platform");
                ssWsApp.f33453i = jSONObject.optInt("fpid");
                ssWsApp.f33454j = jSONObject.optString("app_kay");
                ssWsApp.f33447c = jSONObject.optString("extra");
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                ssWsApp.f33445a.clear();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        ssWsApp.f33445a.add(optJSONArray.optString(i));
                    }
                }
            }
            return ssWsApp;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = ((this.f33448d * 31) + this.f33446b) * 31;
        String str = this.f33449e;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f33450f;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f33447c;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + this.f33451g) * 31) + this.f33452h;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    /* renamed from: g */
    public final JSONObject mo21933g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.f33446b);
        jSONObject.put("app_id", this.f33448d);
        jSONObject.put("device_id", this.f33449e);
        jSONObject.put("install_id", this.f33450f);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f33445a;
        if (list != null) {
            for (String str : list) {
                jSONArray.put(str);
            }
        }
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.f33451g);
        jSONObject.put("platform", this.f33452h);
        jSONObject.put("fpid", this.f33453i);
        jSONObject.put("app_kay", this.f33454j);
        jSONObject.put("extra", this.f33447c);
        return jSONObject;
    }

    protected SsWsApp(Parcel parcel) {
        this.f33445a = new ArrayList();
        this.f33445a = parcel.createStringArrayList();
        this.f33446b = parcel.readInt();
        this.f33447c = parcel.readString();
        this.f33448d = parcel.readInt();
        this.f33449e = parcel.readString();
        this.f33450f = parcel.readString();
        this.f33451g = parcel.readInt();
        this.f33452h = parcel.readInt();
        this.f33453i = parcel.readInt();
        this.f33454j = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (!(this.f33446b == ssWsApp.f33446b && this.f33448d == ssWsApp.f33448d && this.f33451g == ssWsApp.f33451g && this.f33452h == ssWsApp.f33452h)) {
            return false;
        }
        String str = this.f33449e;
        if (str == null ? ssWsApp.f33449e != null : !str.equals(ssWsApp.f33449e)) {
            return false;
        }
        String str2 = this.f33450f;
        if (str2 == null ? ssWsApp.f33450f != null : !str2.equals(ssWsApp.f33450f)) {
            return false;
        }
        if (this.f33453i != ssWsApp.f33453i) {
            return false;
        }
        String str3 = this.f33454j;
        if (str3 == null ? ssWsApp.f33454j != null : !str3.equals(ssWsApp.f33454j)) {
            return false;
        }
        if (this.f33445a.size() != ssWsApp.f33445a.size()) {
            return false;
        }
        for (String str4 : this.f33445a) {
            if (!ssWsApp.f33445a.contains(str4)) {
                return false;
            }
        }
        return C13627m.m24499a(this.f33447c, ssWsApp.f33447c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f33445a);
        parcel.writeInt(this.f33446b);
        parcel.writeString(this.f33447c);
        parcel.writeInt(this.f33448d);
        parcel.writeString(this.f33449e);
        parcel.writeString(this.f33450f);
        parcel.writeInt(this.f33451g);
        parcel.writeInt(this.f33452h);
        parcel.writeInt(this.f33453i);
        parcel.writeString(this.f33454j);
    }

    private SsWsApp(int i, int i2, String str, String str2, List<String> list, int i3, int i4, int i5, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f33445a = arrayList;
        this.f33448d = i2;
        this.f33446b = i;
        this.f33449e = str;
        this.f33450f = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f33451g = i3;
        this.f33452h = i4;
        this.f33453i = i5;
        this.f33454j = str3;
        this.f33447c = str4;
    }

    /* synthetic */ SsWsApp(int i, int i2, String str, String str2, List list, int i3, int i4, int i5, String str3, String str4, byte b) {
        this(i, i2, str, str2, list, i3, i4, i5, str3, str4);
    }
}
