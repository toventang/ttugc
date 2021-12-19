package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

public class AssetsModel {
    @AbstractC27891c(mo46611a = "describe")
    private String describe;
    @AbstractC27891c(mo46611a = "download_type")
    private int downloadType;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f21655id;
    @AbstractC27891c(mo46611a = "md5")
    private String md5;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "resource_url")
    private C8786c resourceModel;
    @AbstractC27891c(mo46611a = "resource_type")
    private int resourceType;
    @AbstractC27891c(mo46611a = "resource_uri")
    private String resourceUri;
    @AbstractC27891c(mo46611a = "size")
    private long size;

    static {
        Covode.recordClassIndex(9661);
    }

    public String getDescribe() {
        return this.describe;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getId() {
        return this.f21655id;
    }

    public String getMD5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public C8786c getResourceModel() {
        return this.resourceModel;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f21655id;
        int i5 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        String str2 = this.describe;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.md5;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (((i8 + i3) * 31) + this.resourceType) * 31;
        String str4 = this.resourceUri;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        C8786c cVar = this.resourceModel;
        if (cVar != null) {
            i6 = cVar.hashCode();
        }
        long j2 = this.size;
        return ((((i10 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.downloadType;
    }

    @AbstractC27891c(mo46611a = "describe")
    public void setDescribe(String str) {
        this.describe = str;
    }

    @AbstractC27891c(mo46611a = "download_type")
    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    @AbstractC27891c(mo46611a = "id")
    public void setId(long j) {
        this.f21655id = j;
    }

    @AbstractC27891c(mo46611a = "md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @AbstractC27891c(mo46611a = StringSet.name)
    public void setName(String str) {
        this.name = str;
    }

    @AbstractC27891c(mo46611a = "resource_url")
    public void setResourceModel(C8786c cVar) {
        this.resourceModel = cVar;
    }

    @AbstractC27891c(mo46611a = "resource_type")
    public void setResourceType(int i) {
        this.resourceType = i;
    }

    @AbstractC27891c(mo46611a = "resource_uri")
    public void setResourceUri(String str) {
        this.resourceUri = str;
    }

    @AbstractC27891c(mo46611a = "size")
    public void setSize(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        }
        AssetsModel assetsModel = (AssetsModel) obj;
        if (this.f21655id == assetsModel.f21655id && this.md5.equals(assetsModel.getMD5()) && this.name.equals(assetsModel.getName()) && this.describe.equals(assetsModel.getDescribe()) && this.resourceType == assetsModel.getResourceType() && this.resourceUri.equals(assetsModel.getResourceUri()) && this.size == assetsModel.getSize() && this.downloadType == assetsModel.getDownloadType()) {
            return true;
        }
        return false;
    }
}
