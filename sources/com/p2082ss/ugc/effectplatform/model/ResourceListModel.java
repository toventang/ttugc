package com.p2082ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel */
public class ResourceListModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C86829a();
    private String icon_uri;
    private String params;
    private List<? extends ResourceListBean> resource_list;
    private List<String> url_prefix;

    /* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel$a */
    public static class C86829a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102549);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            C89219l.m154719c(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readParcelable(ResourceListModel.class.getClassLoader()));
                readInt--;
            }
            return new ResourceListModel(arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResourceListModel[i];
        }
    }

    static {
        Covode.recordClassIndex(102546);
    }

    public ResourceListModel() {
        this(null, null, null, null, 15, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        for (ResourceListBean resourceListBean : list) {
            parcel.writeParcelable(resourceListBean, i);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean */
    public static class ResourceListBean implements AndroidParcelable {
        public static final Parcelable.Creator CREATOR = new C86828a();
        private String name;
        private String resource_uri;
        private String value;

        /* renamed from: com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean$a */
        public static class C86828a implements Parcelable.Creator {
            static {
                Covode.recordClassIndex(102548);
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                C89219l.m154719c(parcel, "");
                return new ResourceListBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResourceListBean[i];
            }
        }

        static {
            Covode.recordClassIndex(102547);
        }

        public ResourceListBean() {
            this(null, null, null, 7, null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C89219l.m154719c(parcel, "");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public String getName() {
            return this.name;
        }

        public String getResource_uri() {
            return this.resource_uri;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBean(String str, String str2, String str3, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public String getIcon_uri() {
        return this.icon_uri;
    }

    public String getParams() {
        return this.params;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean>, java.util.List<com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean> */
    public List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResource_list(List<? extends ResourceListBean> list) {
        C89219l.m154719c(list, "");
        this.resource_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public ResourceListModel(List<? extends ResourceListBean> list, List<String> list2, String str, String str2) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.resource_list = list;
        this.url_prefix = list2;
        this.icon_uri = str;
        this.params = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModel(List list, List list2, String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
