package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCategory */
public final class MusicCategory {
    public final String categoryId;
    public final String categoryName;

    static {
        Covode.recordClassIndex(71401);
    }

    public MusicCategory() {
        this(null, null, 3, null);
    }

    public MusicCategory(String str) {
        this(str, null, 2, null);
    }

    public static /* synthetic */ MusicCategory copy$default(MusicCategory musicCategory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicCategory.categoryName;
        }
        if ((i & 2) != 0) {
            str2 = musicCategory.categoryId;
        }
        return musicCategory.copy(str, str2);
    }

    public final MusicCategory copy(String str, String str2) {
        return new MusicCategory(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicCategory)) {
            return false;
        }
        MusicCategory musicCategory = (MusicCategory) obj;
        return C89219l.m154714a(this.categoryName, musicCategory.categoryName) && C89219l.m154714a(this.categoryId, musicCategory.categoryId);
    }

    public final int hashCode() {
        String str = this.categoryName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.categoryId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MusicCategory(categoryName=" + this.categoryName + ", categoryId=" + this.categoryId + ")";
    }

    public MusicCategory(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicCategory(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
