package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.TagInfo */
public final class TagInfo {
    private final String tag;

    static {
        Covode.recordClassIndex(102550);
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.tag;
        }
        return tagInfo.copy(str);
    }

    public final String component1() {
        return this.tag;
    }

    public final TagInfo copy(String str) {
        C89219l.m154719c(str, "");
        return new TagInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TagInfo) && C89219l.m154714a(this.tag, ((TagInfo) obj).tag);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TagInfo(tag=" + this.tag + ")";
    }

    public final String getTag() {
        return this.tag;
    }

    public TagInfo(String str) {
        C89219l.m154719c(str, "");
        this.tag = str;
    }
}
