package com.p2082ss.android.ugc.aweme.filter;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterBean */
public class FilterBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<FilterBean> CREATOR = new Parcelable.Creator<FilterBean>() {
        /* class com.p2082ss.android.ugc.aweme.filter.FilterBean.C506321 */

        static {
            Covode.recordClassIndex(59790);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FilterBean[] newArray(int i) {
            return new FilterBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FilterBean createFromParcel(Parcel parcel) {
            return new FilterBean(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private int f116934a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private String f116935b;
    @AbstractC27891c(mo46611a = "en_name")

    /* renamed from: c */
    private String f116936c;
    @AbstractC27891c(mo46611a = "resource")

    /* renamed from: d */
    private transient ToolsUrlModel f116937d;

    /* renamed from: e */
    private transient Uri f116938e;

    /* renamed from: f */
    private transient String f116939f;
    @AbstractC27891c(mo46611a = "filter_file_path")

    /* renamed from: g */
    private String f116940g;
    @AbstractC27891c(mo46611a = "filter_folder")

    /* renamed from: h */
    private String f116941h;

    /* renamed from: i */
    private transient List<String> f116942i;

    /* renamed from: j */
    private transient String f116943j = "";

    /* renamed from: k */
    private transient float f116944k = -1.0f;

    /* renamed from: l */
    private transient boolean f116945l;

    /* renamed from: m */
    private transient boolean f116946m = true;
    public transient int mIndex;
    @AbstractC27891c(mo46611a = "resource_id")

    /* renamed from: n */
    private String f116947n = "";
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: o */
    private String f116948o = "";

    /* renamed from: p */
    private String f116949p;

    public int describeContents() {
        return 0;
    }

    public void resetCompareKey() {
        this.f116949p = null;
    }

    public String getCompareKey() {
        return this.f116949p;
    }

    public String getEnName() {
        return this.f116936c;
    }

    public boolean getExecuteSetFilterFolder() {
        return this.f116945l;
    }

    public String getExtra() {
        return this.f116948o;
    }

    public String getFilterFilePath() {
        return this.f116940g;
    }

    public String getFilterFolder() {
        return this.f116941h;
    }

    public int getId() {
        return this.f116934a;
    }

    public String getName() {
        return this.f116935b;
    }

    public String getResId() {
        return this.f116947n;
    }

    public ToolsUrlModel getResource() {
        return this.f116937d;
    }

    public String getTagUpdateAt() {
        return this.f116943j;
    }

    public String getThumbnailFilePath() {
        return this.f116939f;
    }

    public Uri getThumbnailFileUri() {
        return this.f116938e;
    }

    public boolean isSaveFilter2BeautySequence() {
        return this.f116946m;
    }

    static {
        Covode.recordClassIndex(59789);
    }

    public FilterBean() {
    }

    public List<String> getTags() {
        List<String> list = this.f116942i;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return this.f116942i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f116934a), getCompareKey());
    }

    public String toString() {
        String str;
        ToolsUrlModel toolsUrlModel = this.f116937d;
        if (toolsUrlModel != null) {
            str = toolsUrlModel.toString();
        } else {
            str = "";
        }
        return "FilterBean{mId=" + this.f116934a + ", resId:" + this.f116947n + ", mName='" + this.f116935b + '\'' + ", mEnName='" + this.f116936c + '\'' + ", mResource=" + str + ", mIndex=" + this.mIndex + ", mThumbnailFileUri=" + this.f116938e + ", mThumbnailFilePath='" + this.f116939f + '\'' + ", mFilterFilePath='" + this.f116940g + '\'' + ", mFilterFolder='" + this.f116941h + '\'' + ", tags=" + this.f116942i + ", mTagUpdateAt=" + this.f116943j + ", internalDefaultIntensity=" + this.f116944k + ", executeSetFilterFolder=" + this.f116945l + ", isSaveFilter2BeautySequence=" + this.f116946m + ", extra=" + this.f116948o + '}';
    }

    public void setCompareKey(String str) {
        this.f116949p = str;
    }

    public void setEnName(String str) {
        this.f116936c = str;
    }

    public void setExecuteSetFilterFolder(boolean z) {
        this.f116945l = z;
    }

    public void setExtra(String str) {
        this.f116948o = str;
    }

    public void setFilterFilePath(String str) {
        this.f116940g = str;
    }

    public void setFilterFolder(String str) {
        this.f116941h = str;
    }

    public void setId(int i) {
        this.f116934a = i;
    }

    public void setName(String str) {
        this.f116935b = str;
    }

    public void setResId(String str) {
        this.f116947n = str;
    }

    public void setResource(ToolsUrlModel toolsUrlModel) {
        this.f116937d = toolsUrlModel;
    }

    public void setSaveFilter2BeautySequence(boolean z) {
        this.f116946m = z;
    }

    public void setTagUpdateAt(String str) {
        this.f116943j = str;
    }

    public void setTags(List<String> list) {
        this.f116942i = list;
    }

    public void setThumbnailFilePath(String str) {
        this.f116939f = str;
    }

    public void setThumbnailFileUri(Uri uri) {
        this.f116938e = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterBean)) {
            return false;
        }
        FilterBean filterBean = (FilterBean) obj;
        if (this.f116934a != filterBean.f116934a || !TextUtils.equals(getCompareKey(), filterBean.getCompareKey())) {
            return false;
        }
        return true;
    }

    protected FilterBean(Parcel parcel) {
        this.f116934a = parcel.readInt();
        this.f116935b = parcel.readString();
        this.f116936c = parcel.readString();
        this.f116940g = parcel.readString();
        this.f116941h = parcel.readString();
        this.f116947n = parcel.readString();
        this.f116948o = parcel.readString();
        this.f116942i = parcel.createStringArrayList();
        this.f116937d = (ToolsUrlModel) parcel.readParcelable(ToolsUrlModel.class.getClassLoader());
        this.f116938e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f116934a);
        parcel.writeString(this.f116935b);
        parcel.writeString(this.f116936c);
        parcel.writeString(this.f116940g);
        parcel.writeString(this.f116941h);
        parcel.writeString(this.f116947n);
        parcel.writeString(this.f116948o);
        parcel.writeStringList(this.f116942i);
        parcel.writeParcelable(this.f116937d, i);
        parcel.writeParcelable(this.f116938e, i);
    }
}
