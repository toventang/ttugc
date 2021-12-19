package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData */
public class MvThemeData implements Parcelable {
    public static final Parcelable.Creator<MvThemeData> CREATOR = new Parcelable.Creator<MvThemeData>() {
        /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData.C788362 */

        static {
            Covode.recordClassIndex(91983);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvThemeData[] newArray(int i) {
            return new MvThemeData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvThemeData createFromParcel(Parcel parcel) {
            return new MvThemeData(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "effect")

    /* renamed from: a */
    public Effect f177184a;
    @AbstractC27891c(mo46611a = "urlPrefixList")

    /* renamed from: b */
    public List<String> f177185b;
    @AbstractC27891c(mo46611a = "minCount")

    /* renamed from: c */
    public int f177186c;
    @AbstractC27891c(mo46611a = "maxCount")

    /* renamed from: d */
    public int f177187d;
    @AbstractC27891c(mo46611a = "videoMd5")

    /* renamed from: e */
    public String f177188e;
    @AbstractC27891c(mo46611a = "resFillMode")

    /* renamed from: f */
    public String f177189f;
    @AbstractC27891c(mo46611a = "resWidth")

    /* renamed from: g */
    public int f177190g;
    @AbstractC27891c(mo46611a = "resHeight")

    /* renamed from: h */
    public int f177191h;
    @AbstractC27891c(mo46611a = "isDefaultType")

    /* renamed from: i */
    public boolean f177192i;
    @AbstractC27891c(mo46611a = "mvType")

    /* renamed from: j */
    public int f177193j;
    @AbstractC27891c(mo46611a = "needServerExecute")

    /* renamed from: k */
    public boolean f177194k;
    @AbstractC27891c(mo46611a = "mvAlgorithmHint")

    /* renamed from: l */
    String f177195l;
    @AbstractC27891c(mo46611a = "mvAutoSaveToast")

    /* renamed from: m */
    public String f177196m;
    @AbstractC27891c(mo46611a = "algorithmKeyForSave")

    /* renamed from: n */
    public List<String> f177197n;
    @AbstractC27891c(mo46611a = "srcLimitWidth")

    /* renamed from: o */
    public int f177198o;
    @AbstractC27891c(mo46611a = "srcLimitHeight")

    /* renamed from: p */
    public int f177199p;
    @AbstractC27891c(mo46611a = "srcLimitToast")

    /* renamed from: q */
    public String f177200q;
    @AbstractC27891c(mo46611a = "hasCommerceMusic")

    /* renamed from: r */
    public boolean f177201r;
    @AbstractC27891c(mo46611a = "imgMd5")

    /* renamed from: s */
    private String f177202s;

    public int describeContents() {
        return 0;
    }

    public MvThemeData() {
    }

    static {
        Covode.recordClassIndex(91981);
    }

    /* renamed from: a */
    public final String mo122665a() {
        Effect effect = this.f177184a;
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    /* renamed from: b */
    public final List<String> mo122667b() {
        Effect effect = this.f177184a;
        if (effect != null) {
            return effect.getMusic();
        }
        return null;
    }

    /* renamed from: d */
    public final String mo122669d() {
        Effect effect = this.f177184a;
        if (effect != null) {
            return effect.getUnzipPath();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo122674h() {
        Effect effect = this.f177184a;
        if (effect != null) {
            return effect.getHint();
        }
        return "";
    }

    /* renamed from: i */
    public final String mo122675i() {
        Effect effect = this.f177184a;
        if (effect != null) {
            return effect.getId();
        }
        return null;
    }

    /* renamed from: f */
    public final String mo122672f() {
        Effect effect = this.f177184a;
        if (effect == null || effect.getName() == null) {
            return "";
        }
        return this.f177184a.getName();
    }

    /* renamed from: c */
    public final String mo122668c() {
        UrlModel fileUrl;
        Effect effect = this.f177184a;
        if (effect == null || (fileUrl = effect.getFileUrl()) == null || C84904k.m145909a(fileUrl.getUrlList())) {
            return null;
        }
        return fileUrl.getUrlList().get(0);
    }

    /* renamed from: e */
    public final String mo122671e() {
        if (!TextUtils.isEmpty(this.f177188e) && !C84904k.m145909a(this.f177185b)) {
            return this.f177185b.get(0) + this.f177188e;
        }
        return null;
    }

    /* renamed from: g */
    public final String mo122673g() {
        if (!TextUtils.isEmpty(this.f177202s) && !C84904k.m145909a(this.f177185b)) {
            return this.f177185b.get(0) + this.f177202s;
        }
        return null;
    }

    /* renamed from: j */
    private void m137611j() {
        if (this.f177184a != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f177184a.getExtra());
                this.f177186c = jSONObject.optInt("template_min_material", 0);
                this.f177187d = jSONObject.optInt("template_max_material", 0);
                this.f177188e = jSONObject.optString("template_video_cover", "");
                this.f177202s = jSONObject.optString("template_picture_cover", "");
                this.f177189f = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.f177190g = jSONObject.optInt("template_pic_input_width", 720);
                this.f177191h = jSONObject.optInt("template_pic_input_height", 1280);
                this.f177193j = jSONObject.optInt("template_type", 0);
                this.f177195l = jSONObject.optString("mv_algorithm_hint");
                this.f177196m = jSONObject.optString("mv_auto_save_toast");
                this.f177200q = jSONObject.optString("mv_resolution_limited_toast");
                this.f177198o = jSONObject.optInt("mv_resolution_limited_width");
                this.f177199p = jSONObject.optInt("mv_resolution_limited_height");
                this.f177197n = (List) C63238c.f143575b.mo46671a(jSONObject.optString("mv_server_algorithm_result_save_keys"), new C27895a<List<String>>() {
                    /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData.C788351 */

                    static {
                        Covode.recordClassIndex(91982);
                    }
                }.type);
                this.f177201r = jSONObject.optBoolean("is_commerce_music", false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo122666a(Effect effect) {
        this.f177184a = effect;
        m137611j();
    }

    protected MvThemeData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f177184a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f177185b = parcel.createStringArrayList();
        this.f177186c = parcel.readInt();
        this.f177187d = parcel.readInt();
        this.f177188e = parcel.readString();
        this.f177202s = parcel.readString();
        this.f177189f = parcel.readString();
        this.f177190g = parcel.readInt();
        this.f177191h = parcel.readInt();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f177192i = z;
        this.f177193j = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f177194k = z2;
        this.f177195l = parcel.readString();
        this.f177196m = parcel.readString();
        this.f177197n = parcel.createStringArrayList();
        this.f177201r = parcel.readByte() == 0 ? false : z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f177184a, i);
        parcel.writeStringList(this.f177185b);
        parcel.writeInt(this.f177186c);
        parcel.writeInt(this.f177187d);
        parcel.writeString(this.f177188e);
        parcel.writeString(this.f177202s);
        parcel.writeString(this.f177189f);
        parcel.writeInt(this.f177190g);
        parcel.writeInt(this.f177191h);
        parcel.writeByte(this.f177192i ? (byte) 1 : 0);
        parcel.writeInt(this.f177193j);
        parcel.writeByte(this.f177194k ? (byte) 1 : 0);
        parcel.writeString(this.f177195l);
        parcel.writeString(this.f177196m);
        parcel.writeStringList(this.f177197n);
        parcel.writeByte(this.f177201r ? (byte) 1 : 0);
    }
}
