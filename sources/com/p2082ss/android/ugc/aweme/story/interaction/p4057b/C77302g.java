package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.g */
public final class C77302g {

    /* renamed from: a */
    public final Aweme f173419a;

    /* renamed from: b */
    public final String f173420b;

    /* renamed from: c */
    public final String f173421c;

    /* renamed from: d */
    public final int f173422d;

    /* renamed from: e */
    public final String f173423e;

    /* renamed from: f */
    public final String f173424f;

    static {
        Covode.recordClassIndex(90321);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77302g)) {
            return false;
        }
        C77302g gVar = (C77302g) obj;
        return C89219l.m154714a(this.f173419a, gVar.f173419a) && C89219l.m154714a(this.f173420b, gVar.f173420b) && C89219l.m154714a(this.f173421c, gVar.f173421c) && this.f173422d == gVar.f173422d && C89219l.m154714a(this.f173423e, gVar.f173423e) && C89219l.m154714a(this.f173424f, gVar.f173424f);
    }

    public final int hashCode() {
        Aweme aweme = this.f173419a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f173420b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f173421c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f173422d) * 31;
        String str3 = this.f173423e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f173424f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "StoryReactionBubbleMobEventParam(aweme=" + this.f173419a + ", enterFrom=" + this.f173420b + ", groupId=" + this.f173421c + ", followStatus=" + this.f173422d + ", storyType=" + this.f173423e + ", storyCollectionId=" + this.f173424f + ")";
    }

    public C77302g(Aweme aweme, String str, String str2, int i, String str3, String str4) {
        this.f173419a = aweme;
        this.f173420b = str;
        this.f173421c = str2;
        this.f173422d = i;
        this.f173423e = str3;
        this.f173424f = str4;
    }
}
