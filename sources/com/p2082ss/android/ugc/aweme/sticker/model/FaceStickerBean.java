package com.p2082ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.FaceStickerBean */
public class FaceStickerBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerBean> CREATOR = new Parcelable.Creator<FaceStickerBean>() {
        /* class com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean.C754371 */

        static {
            Covode.recordClassIndex(88357);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceStickerBean[] newArray(int i) {
            return new FaceStickerBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceStickerBean createFromParcel(Parcel parcel) {
            return new FaceStickerBean(parcel);
        }
    };
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static String sCurPropSource;
    public static String sCurPropSourceKey;
    @AbstractC27891c(mo46611a = "ad_raw_data")
    private String adRawData;
    @AbstractC27891c(mo46611a = "children")
    List<String> children;
    @AbstractC27891c(mo46611a = "designer_id")
    private String designerId;
    @AbstractC27891c(mo46611a = "effect_type")
    int effectType;
    @AbstractC27891c(mo46611a = "extra")
    private String extra;
    FaceStickerCommerceBean faceStickerCommerceBean;
    @AbstractC27891c(mo46611a = "file_url")
    UrlModel fileUrl;
    @AbstractC27891c(mo46611a = "force_bind_music_path")
    private String forceBindMusicPath;
    @AbstractC27891c(mo46611a = "grade_key")
    private String gradeKey;
    @AbstractC27891c(mo46611a = "hint")
    String hint;
    @AbstractC27891c(mo46611a = "hint_icon")
    UrlModel hintIcon;
    @AbstractC27891c(mo46611a = "icon_url")
    UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    String f169517id;
    @AbstractC27891c(mo46611a = "is_busi")
    private boolean isBusi;
    @AbstractC27891c(mo46611a = "is_force_bind_music")
    private boolean isForceBind;
    public boolean isSelected;
    public String mLocalPath;
    List<String> musicIds;
    @AbstractC27891c(mo46611a = StringSet.name)
    String name;
    @AbstractC27891c(mo46611a = "parent")
    String parentId;
    String propSource;
    @AbstractC27891c(mo46611a = "rec_id")
    String recId;
    @AbstractC27891c(mo46611a = "requirements")
    private List<String> requirements;
    @AbstractC27891c(mo46611a = "schema")
    private String schema;
    @AbstractC27891c(mo46611a = "sdk_extra")
    private String sdkExtra;
    @AbstractC27891c(mo46611a = "source")
    private int source;
    @AbstractC27891c(mo46611a = "sticker_id")
    long stickerId;
    List<String> tags;
    @AbstractC27891c(mo46611a = StringSet.type)
    long type;
    List<String> types;
    @AbstractC27891c(mo46611a = "usage_scenario")
    int usageScenario;

    public int describeContents() {
        return 0;
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    public FaceStickerCommerceBean getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public String getForceBindMusicPath() {
        return this.forceBindMusicPath;
    }

    public String getGradeKey() {
        return this.gradeKey;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.f169517id;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getRecId() {
        return this.recId;
    }

    public List<String> getRequirements() {
        return this.requirements;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public long getStickerId() {
        return this.stickerId;
    }

    public long getType() {
        return this.type;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isForceBind() {
        return this.isForceBind;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public String getPropSource() {
        String str = this.propSource;
        if (str == null) {
            return "";
        }
        return str;
    }

    public FaceStickerBean() {
        this.requirements = new ArrayList();
        this.isSelected = false;
    }

    public int hashCode() {
        long j = this.stickerId;
        return (int) (j ^ (j >>> 32));
    }

    public boolean suportLive() {
        int i = this.usageScenario;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    public boolean supportVideo() {
        int i = this.usageScenario;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(88356);
    }

    public List<String> getTags() {
        if (C84892d.m145850a(this.tags)) {
            return new ArrayList();
        }
        return this.tags;
    }

    public List<String> getTypes() {
        if (C84892d.m145850a(this.types)) {
            return new ArrayList();
        }
        return this.types;
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setEffectType(int i) {
        this.effectType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(FaceStickerCommerceBean faceStickerCommerceBean2) {
        this.faceStickerCommerceBean = faceStickerCommerceBean2;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setForceBind(boolean z) {
        this.isForceBind = z;
    }

    public void setForceBindMusicPath(String str) {
        this.forceBindMusicPath = str;
    }

    public void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(String str) {
        this.f169517id = str;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStickerId(long j) {
        this.stickerId = j;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setType(long j) {
        this.type = j;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FaceStickerBean) && this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    protected FaceStickerBean(Parcel parcel) {
        boolean z;
        this.requirements = new ArrayList();
        boolean z2 = false;
        this.isSelected = false;
        this.f169517id = parcel.readString();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.adRawData = parcel.readString();
        this.forceBindMusicPath = parcel.readString();
        this.isForceBind = parcel.readByte() != 0 ? true : z2;
        this.gradeKey = parcel.readString();
        this.recId = parcel.readString();
        this.requirements = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f169517id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeString(this.adRawData);
        parcel.writeString(this.forceBindMusicPath);
        parcel.writeByte(this.isForceBind ? (byte) 1 : 0);
        parcel.writeString(this.gradeKey);
        parcel.writeString(this.recId);
        parcel.writeStringList(this.requirements);
    }
}
