package com.bytedance.geckox.model;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.statistic.model.C15042d;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import org.json.JSONObject;

public class UpdatePackage {
    @AbstractC27891c(mo46611a = "access_key")
    private String accessKey;
    private String apiVersion;
    @AbstractC27891c(mo46611a = "channel")
    private String channel;
    @AbstractC27891c(mo46611a = "channel_index")
    private int channelIndex;
    @AbstractC27891c(mo46611a = "content")
    private Content content;
    @AbstractC27891c(mo46611a = "from")
    private List<String> from;
    @AbstractC27891c(mo46611a = "group_name")
    private String groupName;
    @AbstractC27891c(mo46611a = "is_zstd")
    private boolean isZstd;
    private boolean isZstdFallback;
    private long localVersion;
    private long localVersionOld;
    private String logId;
    private int notUsePatchReason;
    @AbstractC27891c(mo46611a = "package_type")
    private int packageType;
    private C15042d statisticModel;
    private boolean updateWithPatch;
    private boolean usePatched;
    @AbstractC27891c(mo46611a = "package_version")
    private long version;

    public static final class FileType {
        static {
            Covode.recordClassIndex(17109);
        }
    }

    static {
        Covode.recordClassIndex(17106);
    }

    public static class Content {
        @AbstractC27891c(mo46611a = "package")
        public Package fullPackage;
        @AbstractC27891c(mo46611a = "patch")
        public Package patch;
        @AbstractC27891c(mo46611a = "strategies")
        public Strategy strategy;

        static {
            Covode.recordClassIndex(17107);
        }

        public Strategy getStrategy() {
            return this.strategy;
        }
    }

    /* access modifiers changed from: package-private */
    public static class Fallback {
        @AbstractC27891c(mo46611a = "md5")
        String md5;
        @AbstractC27891c(mo46611a = "url_list")
        List<String> urlList;

        static {
            Covode.recordClassIndex(17108);
        }

        private Fallback() {
        }

        public String getMd5() {
            return this.md5;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }
    }

    public static class Package {
        @AbstractC27891c(mo46611a = "decompress_md5")
        String decompressMd5;
        @AbstractC27891c(mo46611a = "fallback")
        Fallback fallback;
        @AbstractC27891c(mo46611a = "id")

        /* renamed from: id */
        long f36581id;
        @AbstractC27891c(mo46611a = "size")
        long length;
        @AbstractC27891c(mo46611a = "md5")
        String md5;
        String url;
        @AbstractC27891c(mo46611a = "url_list")
        List<String> urlList;

        static {
            Covode.recordClassIndex(17110);
        }

        public Package() {
        }

        public String getDecompressMd5() {
            return this.decompressMd5;
        }

        public Fallback getFallback() {
            return this.fallback;
        }

        public long getId() {
            return this.f36581id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public String toString() {
            return "Package{url='" + this.url + '\'' + ", md5='" + this.md5 + '\'' + '}';
        }

        public void setId(int i) {
            this.f36581id = (long) i;
        }

        public void setLength(long j) {
            this.length = j;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(int i, List<String> list, String str) {
            this.f36581id = (long) i;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        @AbstractC27891c(mo46611a = "del_if_download_failed")
        private int deleteIfFail;
        @AbstractC27891c(mo46611a = "del_old_pkg_before_download")
        private int deleteOldPackageBeforeDownload;
        @AbstractC27891c(mo46611a = "need_unzip")
        private int needUnzip;

        static {
            Covode.recordClassIndex(17111);
        }

        public int getDeleteIfFail() {
            return this.deleteIfFail;
        }

        public int getDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public int getNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(int i) {
            this.deleteIfFail = i;
        }

        public void setDeleteOldPackageBeforeDownload(int i) {
            this.deleteOldPackageBeforeDownload = i;
        }

        public void setNeedUnzip(int i) {
            this.needUnzip = i;
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Content getContent() {
        return this.content;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public boolean getIsZstd() {
        return this.isZstd;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public C15042d getStatisticModel() {
        return this.statisticModel;
    }

    public boolean getUpdateWithPatch() {
        return this.updateWithPatch;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean getZstdFallback() {
        return this.isZstdFallback;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public UpdatePackage() {
        this.content = new Content();
        this.groupName = "default";
    }

    public Package getPackage() {
        if (this.updateWithPatch) {
            return this.content.patch;
        }
        return this.content.fullPackage;
    }

    public boolean hasFallback() {
        if (this.content.fullPackage.fallback != null) {
            return true;
        }
        return false;
    }

    public boolean isFullUpdate() {
        if (getFullPackage() == null || getFullPackage().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isLastStep() {
        if (this.isZstdFallback) {
            return true;
        }
        if (!isPatchUpdate() && !hasFallback()) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() == null || getPatch().getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return C1764a.m5928a("ak:%s, channel:%s, version:%d, packageType:%d, isZstd:%b, updateWithPatch:%b", new Object[]{this.accessKey, this.channel, Long.valueOf(this.version), Integer.valueOf(this.packageType), Boolean.valueOf(this.isZstd), Boolean.valueOf(this.updateWithPatch)});
    }

    public UpdatePackage fallbackInstance() {
        UpdatePackage updatePackage = new UpdatePackage();
        updatePackage.groupName = this.groupName;
        updatePackage.channelIndex = this.channelIndex;
        updatePackage.version = this.version;
        updatePackage.channel = this.channel;
        updatePackage.accessKey = this.accessKey;
        updatePackage.from = this.from;
        updatePackage.packageType = this.packageType;
        updatePackage.statisticModel = this.statisticModel;
        updatePackage.apiVersion = this.apiVersion;
        updatePackage.logId = this.logId;
        updatePackage.localVersion = this.localVersion;
        updatePackage.localVersionOld = this.localVersionOld;
        updatePackage.notUsePatchReason = this.notUsePatchReason;
        updatePackage.usePatched = this.usePatched;
        updatePackage.isZstd = false;
        updatePackage.isZstdFallback = true;
        Content content2 = new Content();
        updatePackage.content = content2;
        content2.strategy = this.content.strategy;
        Package r3 = this.content.fullPackage;
        Package r2 = new Package();
        r2.f36581id = r3.f36581id;
        r2.urlList = r3.fallback.urlList;
        r2.md5 = r3.fallback.md5;
        updatePackage.content.fullPackage = r2;
        return updatePackage;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFrom(List<String> list) {
        this.from = list;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setLocalVersionOld(long j) {
        this.localVersionOld = j;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setNotUsePatchReason(int i) {
        this.notUsePatchReason = i;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setStatisticModel(C15042d dVar) {
        this.statisticModel = dVar;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setZstdFallback(boolean z) {
        this.isZstdFallback = z;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setUpdateWithPatch(boolean z) {
        this.updateWithPatch = z;
        if (z) {
            this.usePatched = true;
        }
    }

    public void putStatisticModelToJson(JSONObject jSONObject) {
        int i;
        jSONObject.put("access_key", this.accessKey);
        jSONObject.put("group_name", this.groupName);
        jSONObject.put("channel", this.channel);
        jSONObject.put("id", getFullPackage().getId());
        if (this.isZstd || this.isZstdFallback) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_zstd", i);
        jSONObject.put("api_version", this.apiVersion);
        if (!TextUtils.isEmpty(this.logId)) {
            jSONObject.put("x_tt_logid", this.logId);
        }
        long j = this.localVersion;
        if (j != 0) {
            jSONObject.put("local_version", j);
        }
        if (getPatch() != null) {
            jSONObject.put("patch_id", getPatch().getId());
        }
        long j2 = this.localVersionOld;
        if (j2 != 0) {
            jSONObject.put("local_version_old", j2);
        }
        C15042d dVar = this.statisticModel;
        if (dVar != null) {
            jSONObject.put("req_type", dVar.f36744b);
            jSONObject.put("update_priority", dVar.f36743a);
            jSONObject.put("update_result", !dVar.f36746d ? 1 : 0);
            if (dVar.f36745c != 0) {
                jSONObject.put("sync_task_id", dVar.f36745c);
            }
            if (dVar.f36747e) {
                jSONObject.put("create_by_error", dVar.f36747e);
            }
            if (dVar.f36748f > 0) {
                jSONObject.put("dur_total", dVar.f36748f);
            }
            if (dVar.f36749g > 0) {
                jSONObject.put("dur_last_stage", dVar.f36749g);
            }
            if (dVar.f36750h > 0) {
                jSONObject.put("dur_download", dVar.f36750h);
            }
            if (dVar.f36751i > 0) {
                jSONObject.put("dur_download_last_time", dVar.f36751i);
            }
            if (dVar.f36752j > 0) {
                jSONObject.put("dur_active", dVar.f36752j);
            }
            if (dVar.f36753k > 0) {
                jSONObject.put("dur_unzip", dVar.f36753k);
            }
            if (dVar.f36754l > 0) {
                jSONObject.put("dur_decompress_zstd", dVar.f36754l);
            }
            if (dVar.f36755m > 0) {
                jSONObject.put("dur_bytepatch", dVar.f36755m);
            }
            if (dVar.f36756n > 0) {
                jSONObject.put("dur_zip_patch", dVar.f36756n);
            }
            for (C15042d.C15043a aVar : dVar.f36763u.values()) {
                jSONObject.put(aVar.f36764a + "result", !aVar.f36765b ? 1 : 0);
                jSONObject.put(aVar.f36764a + "url", aVar.f36768e);
                if (!TextUtils.isEmpty(aVar.f36767d)) {
                    jSONObject.put(aVar.f36764a + "err_msg", aVar.f36767d);
                }
                if (aVar.f36766c != 0) {
                    jSONObject.put(aVar.f36764a + "err_code", aVar.f36766c);
                }
                if (aVar.f36769f > 0) {
                    jSONObject.put(aVar.f36764a + "download_failed_times", aVar.f36769f);
                }
                if (aVar.f36770g) {
                    jSONObject.put(aVar.f36764a + "create_by_error", 1);
                }
            }
        }
        int i2 = this.notUsePatchReason;
        if (i2 != 0) {
            jSONObject.put("not_use_patch_reason", i2);
        } else if (this.localVersion != 0 && !this.usePatched) {
            jSONObject.put("not_use_patch_reason", 10);
        }
    }

    public UpdatePackage(long j, String str, Package r5, Package r6) {
        this.version = j;
        this.channel = str;
        Content content2 = new Content();
        this.content = content2;
        content2.fullPackage = r5;
        this.content.patch = r6;
        this.groupName = "default";
    }
}
