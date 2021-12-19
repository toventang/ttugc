package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect */
public final class SimpleEffect implements Parcelable, Serializable {
    public static final Parcelable.Creator<SimpleEffect> CREATOR = new Creator();
    private final String designerUid;
    private final String extra;
    private final UrlModel iconUrl;
    private final String name;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect$Creator */
    public static class Creator implements Parcelable.Creator<SimpleEffect> {
        static {
            Covode.recordClassIndex(84620);
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleEffect createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SimpleEffect((UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleEffect[] newArray(int i) {
            return new SimpleEffect[i];
        }
    }

    static {
        Covode.recordClassIndex(84619);
    }

    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, UrlModel urlModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = simpleEffect.iconUrl;
        }
        if ((i & 2) != 0) {
            str = simpleEffect.name;
        }
        if ((i & 4) != 0) {
            str2 = simpleEffect.extra;
        }
        if ((i & 8) != 0) {
            str3 = simpleEffect.designerUid;
        }
        return simpleEffect.copy(urlModel, str, str2, str3);
    }

    public final UrlModel component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.extra;
    }

    public final String component4() {
        return this.designerUid;
    }

    public final SimpleEffect copy(UrlModel urlModel, String str, String str2, String str3) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        return new SimpleEffect(urlModel, str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEffect)) {
            return false;
        }
        SimpleEffect simpleEffect = (SimpleEffect) obj;
        return C89219l.m154714a(this.iconUrl, simpleEffect.iconUrl) && C89219l.m154714a(this.name, simpleEffect.name) && C89219l.m154714a(this.extra, simpleEffect.extra) && C89219l.m154714a(this.designerUid, simpleEffect.designerUid);
    }

    public final int hashCode() {
        UrlModel urlModel = this.iconUrl;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.extra;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.designerUid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "SimpleEffect(iconUrl=" + this.iconUrl + ", name=" + this.name + ", extra=" + this.extra + ", designerUid=" + this.designerUid + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeSerializable(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.extra);
        parcel.writeString(this.designerUid);
    }

    public final String getDesignerUid() {
        return this.designerUid;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public SimpleEffect(UrlModel urlModel, String str, String str2, String str3) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        this.iconUrl = urlModel;
        this.name = str;
        this.extra = str2;
        this.designerUid = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleEffect(UrlModel urlModel, String str, String str2, String str3, int i, C89214g gVar) {
        this(urlModel, str, str2, (i & 8) != 0 ? null : str3);
    }
}
