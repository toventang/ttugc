package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.a */
public final class C75116a {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public String f168855a;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: b */
    public String f168856b;
    @AbstractC27891c(mo46611a = "task_infos")

    /* renamed from: c */
    public List<C75125j> f168857c;

    static {
        Covode.recordClassIndex(87989);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75116a)) {
            return false;
        }
        C75116a aVar = (C75116a) obj;
        return C89219l.m154714a(this.f168855a, aVar.f168855a) && C89219l.m154714a(this.f168856b, aVar.f168856b) && C89219l.m154714a(this.f168857c, aVar.f168857c);
    }

    public final int hashCode() {
        String str = this.f168855a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168856b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C75125j> list = this.f168857c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Body(title=" + this.f168855a + ", desc=" + this.f168856b + ", taskInfos=" + this.f168857c + ")";
    }

    private /* synthetic */ C75116a() {
        this("", "", new ArrayList());
    }

    private C75116a(String str, String str2, List<C75125j> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        this.f168855a = str;
        this.f168856b = str2;
        this.f168857c = list;
    }
}
