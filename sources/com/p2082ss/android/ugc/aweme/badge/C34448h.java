package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.h */
public final class C34448h extends AbstractC34436e implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final Long f81407a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private final String f81408b;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: c */
    private final String f81409c;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: d */
    private final String f81410d;
    @AbstractC27891c(mo46611a = "should_show")

    /* renamed from: e */
    private final Boolean f81411e;

    static {
        Covode.recordClassIndex(41396);
    }

    public static /* synthetic */ C34448h copy$default(C34448h hVar, Long l, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            l = hVar.getId();
        }
        if ((i & 2) != 0) {
            str = hVar.getName();
        }
        if ((i & 4) != 0) {
            str2 = hVar.getDescription();
        }
        if ((i & 8) != 0) {
            str3 = hVar.getUrl();
        }
        if ((i & 16) != 0) {
            bool = hVar.getShouldShow();
        }
        return hVar.copy(l, str, str2, str3, bool);
    }

    public final Long component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getDescription();
    }

    public final String component4() {
        return getUrl();
    }

    public final Boolean component5() {
        return getShouldShow();
    }

    public final C34448h copy(Long l, String str, String str2, String str3, Boolean bool) {
        return new C34448h(l, str, str2, str3, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34448h)) {
            return false;
        }
        AbstractC34436e eVar = (AbstractC34436e) obj;
        return C89219l.m154714a(getId(), eVar.getId()) && C89219l.m154714a(getName(), eVar.getName()) && C89219l.m154714a(getDescription(), eVar.getDescription()) && C89219l.m154714a(getUrl(), eVar.getUrl()) && C89219l.m154714a(getShouldShow(), eVar.getShouldShow());
    }

    public final int hashCode() {
        Long id = getId();
        int i = 0;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        String name = getName();
        int hashCode2 = (hashCode + (name != null ? name.hashCode() : 0)) * 31;
        String description = getDescription();
        int hashCode3 = (hashCode2 + (description != null ? description.hashCode() : 0)) * 31;
        String url = getUrl();
        int hashCode4 = (hashCode3 + (url != null ? url.hashCode() : 0)) * 31;
        Boolean shouldShow = getShouldShow();
        if (shouldShow != null) {
            i = shouldShow.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "EditProfileBadgeModel(id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ", url=" + getUrl() + ", shouldShow=" + getShouldShow() + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34436e
    public final String getDescription() {
        return this.f81409c;
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34436e
    public final Long getId() {
        return this.f81407a;
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34436e
    public final String getName() {
        return this.f81408b;
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34436e
    public final Boolean getShouldShow() {
        return this.f81411e;
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34436e
    public final String getUrl() {
        return this.f81410d;
    }

    public C34448h(Long l, String str, String str2, String str3, Boolean bool) {
        this.f81407a = l;
        this.f81408b = str;
        this.f81409c = str2;
        this.f81410d = str3;
        this.f81411e = bool;
    }
}
