package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.f */
public final class C47196f {
    @AbstractC27891c(mo46611a = "operation")

    /* renamed from: a */
    public final int f109854a;
    @AbstractC27891c(mo46611a = "item_archive_id")

    /* renamed from: b */
    public final String f109855b;
    @AbstractC27891c(mo46611a = "item_archive_name")

    /* renamed from: c */
    public final String f109856c;
    @AbstractC27891c(mo46611a = "item_archive_id_from")

    /* renamed from: d */
    public final String f109857d;
    @AbstractC27891c(mo46611a = "item_archive_id_to")

    /* renamed from: e */
    public final String f109858e;
    @AbstractC27891c(mo46611a = "add_ids")

    /* renamed from: f */
    public final List<String> f109859f;
    @AbstractC27891c(mo46611a = "remove_ids")

    /* renamed from: g */
    public final List<String> f109860g;
    @AbstractC27891c(mo46611a = "move_ids")

    /* renamed from: h */
    public final List<String> f109861h;

    static {
        Covode.recordClassIndex(55806);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47196f)) {
            return false;
        }
        C47196f fVar = (C47196f) obj;
        return this.f109854a == fVar.f109854a && C89219l.m154714a(this.f109855b, fVar.f109855b) && C89219l.m154714a(this.f109856c, fVar.f109856c) && C89219l.m154714a(this.f109857d, fVar.f109857d) && C89219l.m154714a(this.f109858e, fVar.f109858e) && C89219l.m154714a(this.f109859f, fVar.f109859f) && C89219l.m154714a(this.f109860g, fVar.f109860g) && C89219l.m154714a(this.f109861h, fVar.f109861h);
    }

    public final int hashCode() {
        int i = this.f109854a * 31;
        String str = this.f109855b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f109856c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f109857d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f109858e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f109859f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f109860g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f109861h;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "CollectionManageRequest(operation=" + this.f109854a + ", collectionId=" + this.f109855b + ", collectionName=" + this.f109856c + ", moveFromCollectionId=" + this.f109857d + ", moveToCollectionId=" + this.f109858e + ", addIds=" + this.f109859f + ", removeIds=" + this.f109860g + ", moveIds=" + this.f109861h + ")";
    }

    public C47196f(int i, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3) {
        this.f109854a = i;
        this.f109855b = str;
        this.f109856c = str2;
        this.f109857d = str3;
        this.f109858e = str4;
        this.f109859f = list;
        this.f109860g = list2;
        this.f109861h = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C47196f(int i, String str, String str2, String str3, String str4, List list, List list2, List list3, int i2) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) == 0 ? list3 : null);
    }
}
