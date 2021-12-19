package com.p2082ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.UrlModel */
public class UrlModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C86830a();
    private String uri;
    private List<String> url_list;

    /* renamed from: com.ss.ugc.effectplatform.model.UrlModel$a */
    public static class C86830a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102552);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            C89219l.m154719c(parcel, "");
            return new UrlModel(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlModel[i];
        }
    }

    static {
        Covode.recordClassIndex(102551);
    }

    public UrlModel() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public int hashCode() {
        Integer num;
        int i;
        List<String> url_list2 = getUrl_list();
        if (url_list2 != null) {
            num = Integer.valueOf(url_list2.hashCode());
        } else {
            num = null;
        }
        int intValue = num.intValue() * 31;
        String uri2 = getUri();
        if (uri2 != null) {
            i = uri2.hashCode();
        } else {
            i = 0;
        }
        return intValue + i;
    }

    public String toString() {
        return "UrlModel(url_list=" + getUrl_list() + ", uri=" + getUri() + ')';
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_list = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (!(!C89219l.m154714a(getUrl_list(), urlModel.getUrl_list())) && !(!C89219l.m154714a((Object) getUri(), (Object) urlModel.getUri()))) {
            return true;
        }
        return false;
    }

    public UrlModel(List<String> list, String str) {
        C89219l.m154719c(list, "");
        this.url_list = list;
        this.uri = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(List list, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str);
    }
}
