package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() {
        /* class com.facebook.Profile.C238632 */

        static {
            Covode.recordClassIndex(27984);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Profile[] newArray(int i) {
            return new Profile[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public static final String f56479a = Profile.class.getSimpleName();

    /* renamed from: b */
    public final String f56480b;

    /* renamed from: c */
    public final String f56481c;

    /* renamed from: d */
    public final String f56482d;

    /* renamed from: e */
    public final String f56483e;

    /* renamed from: f */
    public final String f56484f;

    /* renamed from: g */
    public final Uri f56485g;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(27982);
    }

    /* renamed from: a */
    public static void m45113a() {
        AccessToken accessToken = C24012b.m45437a().f56861b;
        if (!AccessToken.m45056a()) {
            m45114a(null);
        } else {
            C24693ad.m47254a(accessToken.f56404e, (C24693ad.AbstractC24696a) new C24693ad.AbstractC24696a() {
                /* class com.facebook.Profile.C238621 */

                static {
                    Covode.recordClassIndex(27983);
                }

                @Override // com.facebook.internal.C24693ad.AbstractC24696a
                /* renamed from: a */
                public final void mo39364a(C24798j jVar) {
                }

                @Override // com.facebook.internal.C24693ad.AbstractC24696a
                /* renamed from: a */
                public final void mo39365a(JSONObject jSONObject) {
                    Uri uri;
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        String optString3 = jSONObject.optString("first_name");
                        String optString4 = jSONObject.optString("middle_name");
                        String optString5 = jSONObject.optString("last_name");
                        String optString6 = jSONObject.optString(StringSet.name);
                        if (optString2 != null) {
                            uri = Uri.parse(optString2);
                        } else {
                            uri = null;
                        }
                        Profile.m45114a(new Profile(optString, optString3, optString4, optString5, optString6, uri));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final JSONObject mo39359b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f56480b);
            jSONObject.put("first_name", this.f56481c);
            jSONObject.put("middle_name", this.f56482d);
            jSONObject.put("last_name", this.f56483e);
            jSONObject.put(StringSet.name, this.f56484f);
            Uri uri = this.f56485g;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int hashCode() {
        int hashCode = this.f56480b.hashCode() + 527;
        String str = this.f56481c;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f56482d;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f56483e;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f56484f;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f56485g;
        if (uri != null) {
            return (hashCode * 31) + uri.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    public static void m45114a(Profile profile) {
        C25031w.m47997a().mo40922a(profile, true);
    }

    private Profile(Parcel parcel) {
        Uri parse;
        this.f56480b = parcel.readString();
        this.f56481c = parcel.readString();
        this.f56482d = parcel.readString();
        this.f56483e = parcel.readString();
        this.f56484f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            parse = null;
        } else {
            parse = Uri.parse(readString);
        }
        this.f56485g = parse;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f56480b = jSONObject.optString("id", null);
        this.f56481c = jSONObject.optString("first_name", null);
        this.f56482d = jSONObject.optString("middle_name", null);
        this.f56483e = jSONObject.optString("last_name", null);
        this.f56484f = jSONObject.optString(StringSet.name, null);
        String optString = jSONObject.optString("link_uri", null);
        this.f56485g = optString != null ? Uri.parse(optString) : uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        String str = this.f56480b;
        if (str != null ? str.equals(profile.f56480b) : profile.f56480b == null) {
            String str2 = this.f56481c;
            if (str2 != null ? str2.equals(profile.f56481c) : profile.f56481c == null) {
                String str3 = this.f56482d;
                if (str3 != null ? str3.equals(profile.f56482d) : profile.f56482d == null) {
                    String str4 = this.f56483e;
                    if (str4 != null ? str4.equals(profile.f56483e) : profile.f56483e == null) {
                        String str5 = this.f56484f;
                        if (str5 != null ? str5.equals(profile.f56484f) : profile.f56484f == null) {
                            Uri uri = this.f56485g;
                            Uri uri2 = profile.f56485g;
                            if (uri != null ? !uri.equals(uri2) : uri2 != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* synthetic */ Profile(Parcel parcel, byte b) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String uri;
        parcel.writeString(this.f56480b);
        parcel.writeString(this.f56481c);
        parcel.writeString(this.f56482d);
        parcel.writeString(this.f56483e);
        parcel.writeString(this.f56484f);
        Uri uri2 = this.f56485g;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        parcel.writeString(uri);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C24699ae.m47302a(str, "id");
        this.f56480b = str;
        this.f56481c = str2;
        this.f56482d = str3;
        this.f56483e = str4;
        this.f56484f = str5;
        this.f56485g = uri;
    }
}
