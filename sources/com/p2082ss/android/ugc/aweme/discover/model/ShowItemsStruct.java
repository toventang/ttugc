package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ShowItemsStruct */
public final class ShowItemsStruct implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private final String desc;
    @AbstractC27891c(mo46611a = "schema")
    private final String schema;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final String type;

    static {
        Covode.recordClassIndex(50529);
    }

    public static /* synthetic */ ShowItemsStruct copy$default(ShowItemsStruct showItemsStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showItemsStruct.desc;
        }
        if ((i & 2) != 0) {
            str2 = showItemsStruct.schema;
        }
        if ((i & 4) != 0) {
            str3 = showItemsStruct.type;
        }
        return showItemsStruct.copy(str, str2, str3);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.schema;
    }

    public final String component3() {
        return this.type;
    }

    public final ShowItemsStruct copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new ShowItemsStruct(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowItemsStruct)) {
            return false;
        }
        ShowItemsStruct showItemsStruct = (ShowItemsStruct) obj;
        return C89219l.m154714a(this.desc, showItemsStruct.desc) && C89219l.m154714a(this.schema, showItemsStruct.schema) && C89219l.m154714a(this.type, showItemsStruct.type);
    }

    public final int hashCode() {
        String str = this.desc;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ShowItemsStruct(desc=" + this.desc + ", schema=" + this.schema + ", type=" + this.type + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public ShowItemsStruct(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}
