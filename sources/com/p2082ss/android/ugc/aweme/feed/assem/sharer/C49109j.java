package com.p2082ss.android.ugc.aweme.feed.assem.sharer;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.j */
public final class C49109j implements AbstractC12853j {

    /* renamed from: a */
    public final String f113051a;

    /* renamed from: b */
    public final String f113052b;

    /* renamed from: c */
    public UrlModel f113053c;

    /* renamed from: d */
    public C12776a<Boolean> f113054d;

    /* renamed from: e */
    public C12776a<Boolean> f113055e;

    /* renamed from: f */
    public int f113056f;

    static {
        Covode.recordClassIndex(57901);
    }

    /* renamed from: a */
    public static /* synthetic */ C49109j m92228a(C49109j jVar, String str, String str2, UrlModel urlModel, C12776a aVar, C12776a aVar2, int i, int i2) {
        int i3 = i;
        C12776a aVar3 = aVar2;
        String str3 = str;
        String str4 = str2;
        UrlModel urlModel2 = urlModel;
        C12776a aVar4 = aVar;
        if ((i2 & 1) != 0) {
            str3 = jVar.f113051a;
        }
        if ((i2 & 2) != 0) {
            str4 = jVar.f113052b;
        }
        if ((i2 & 4) != 0) {
            urlModel2 = jVar.f113053c;
        }
        if ((i2 & 8) != 0) {
            aVar4 = jVar.f113054d;
        }
        if ((i2 & 16) != 0) {
            aVar3 = jVar.f113055e;
        }
        if ((i2 & 32) != 0) {
            i3 = jVar.f113056f;
        }
        return m92229a(str3, str4, urlModel2, aVar4, aVar3, i3);
    }

    /* renamed from: a */
    private static C49109j m92229a(String str, String str2, UrlModel urlModel, C12776a<Boolean> aVar, C12776a<Boolean> aVar2, int i) {
        C89219l.m154721d(str2, "");
        return new C49109j(str, str2, urlModel, aVar, aVar2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49109j)) {
            return false;
        }
        C49109j jVar = (C49109j) obj;
        return C89219l.m154714a(this.f113051a, jVar.f113051a) && C89219l.m154714a(this.f113052b, jVar.f113052b) && C89219l.m154714a(this.f113053c, jVar.f113053c) && C89219l.m154714a(this.f113054d, jVar.f113054d) && C89219l.m154714a(this.f113055e, jVar.f113055e) && this.f113056f == jVar.f113056f;
    }

    public final int hashCode() {
        String str = this.f113051a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f113052b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f113053c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar = this.f113054d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar2 = this.f113055e;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.f113056f;
    }

    public final String toString() {
        return "VideoExposeSharerState(nickName=" + this.f113051a + ", callerId=" + this.f113052b + ", avatar=" + this.f113053c + ", followAnimation=" + this.f113054d + ", unfollow=" + this.f113055e + ", followText=" + this.f113056f + ")";
    }

    public /* synthetic */ C49109j() {
        this("", "", null, null, null, R.string.d6v);
    }

    private C49109j(String str, String str2, UrlModel urlModel, C12776a<Boolean> aVar, C12776a<Boolean> aVar2, int i) {
        C89219l.m154721d(str2, "");
        this.f113051a = str;
        this.f113052b = str2;
        this.f113053c = urlModel;
        this.f113054d = aVar;
        this.f113055e = aVar2;
        this.f113056f = i;
    }
}
