package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.PlayAddress */
public final class PlayAddress implements Serializable {
    @AbstractC27891c(mo46611a = "data_size")
    public Long dataSize;
    @AbstractC27891c(mo46611a = "file_cs")
    public String fileCS;
    @AbstractC27891c(mo46611a = "file_hash")
    public String fileHash;
    @AbstractC27891c(mo46611a = "height")
    public Integer height;
    @AbstractC27891c(mo46611a = "player_access_key")
    public String playerAccessKey;
    @AbstractC27891c(mo46611a = "uri")
    public String uri;
    @AbstractC27891c(mo46611a = "url_key")
    public String urlKey;
    @AbstractC27891c(mo46611a = "url_list")
    public List<String> urlList;
    @AbstractC27891c(mo46611a = "width")
    public Integer width;

    static {
        Covode.recordClassIndex(58743);
    }

    public PlayAddress() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.PlayAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayAddress copy$default(PlayAddress playAddress, String str, List list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playAddress.uri;
        }
        if ((i & 2) != 0) {
            list = playAddress.urlList;
        }
        if ((i & 4) != 0) {
            num = playAddress.width;
        }
        if ((i & 8) != 0) {
            num2 = playAddress.height;
        }
        if ((i & 16) != 0) {
            str2 = playAddress.urlKey;
        }
        if ((i & 32) != 0) {
            l = playAddress.dataSize;
        }
        if ((i & 64) != 0) {
            str3 = playAddress.fileHash;
        }
        if ((i & 128) != 0) {
            str4 = playAddress.fileCS;
        }
        if ((i & 256) != 0) {
            str5 = playAddress.playerAccessKey;
        }
        return playAddress.copy(str, list, num, num2, str2, l, str3, str4, str5);
    }

    public final String component1() {
        return this.uri;
    }

    public final List<String> component2() {
        return this.urlList;
    }

    public final Integer component3() {
        return this.width;
    }

    public final Integer component4() {
        return this.height;
    }

    public final String component5() {
        return this.urlKey;
    }

    public final Long component6() {
        return this.dataSize;
    }

    public final String component7() {
        return this.fileHash;
    }

    public final String component8() {
        return this.fileCS;
    }

    public final String component9() {
        return this.playerAccessKey;
    }

    public final PlayAddress copy(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5) {
        return new PlayAddress(str, list, num, num2, str2, l, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayAddress)) {
            return false;
        }
        PlayAddress playAddress = (PlayAddress) obj;
        return C89219l.m154714a(this.uri, playAddress.uri) && C89219l.m154714a(this.urlList, playAddress.urlList) && C89219l.m154714a(this.width, playAddress.width) && C89219l.m154714a(this.height, playAddress.height) && C89219l.m154714a(this.urlKey, playAddress.urlKey) && C89219l.m154714a(this.dataSize, playAddress.dataSize) && C89219l.m154714a(this.fileHash, playAddress.fileHash) && C89219l.m154714a(this.fileCS, playAddress.fileCS) && C89219l.m154714a(this.playerAccessKey, playAddress.playerAccessKey);
    }

    public final int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.urlList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.urlKey;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.dataSize;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        String str3 = this.fileHash;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fileCS;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.playerAccessKey;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "PlayAddress(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ", urlKey=" + this.urlKey + ", dataSize=" + this.dataSize + ", fileHash=" + this.fileHash + ", fileCS=" + this.fileCS + ", playerAccessKey=" + this.playerAccessKey + ")";
    }

    public final Long getDataSize() {
        return this.dataSize;
    }

    public final String getFileCS() {
        return this.fileCS;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPlayerAccessKey() {
        return this.playerAccessKey;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public PlayAddress(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.dataSize = l;
        this.fileHash = str3;
        this.fileCS = str4;
        this.playerAccessKey = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayAddress(String str, List list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
