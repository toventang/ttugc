package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.j */
public final class C77306j {

    /* renamed from: a */
    public final Aweme f173429a;

    /* renamed from: b */
    public final String f173430b;

    /* renamed from: c */
    public final String f173431c;

    /* renamed from: d */
    public final String f173432d;

    /* renamed from: e */
    public final int f173433e;

    /* renamed from: f */
    public final String f173434f;

    /* renamed from: g */
    public final String f173435g;

    static {
        Covode.recordClassIndex(90325);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77306j)) {
            return false;
        }
        C77306j jVar = (C77306j) obj;
        return C89219l.m154714a(this.f173429a, jVar.f173429a) && C89219l.m154714a(this.f173430b, jVar.f173430b) && C89219l.m154714a(this.f173431c, jVar.f173431c) && C89219l.m154714a(this.f173432d, jVar.f173432d) && this.f173433e == jVar.f173433e && C89219l.m154714a(this.f173434f, jVar.f173434f) && C89219l.m154714a(this.f173435g, jVar.f173435g);
    }

    public final int hashCode() {
        Aweme aweme = this.f173429a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f173430b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f173431c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f173432d;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f173433e) * 31;
        String str4 = this.f173434f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f173435g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "StoryViewerAndLikerMobEventParam(aweme=" + this.f173429a + ", enterFrom=" + this.f173430b + ", enterMethod=" + this.f173431c + ", groupId=" + this.f173432d + ", followStatus=" + this.f173433e + ", storyType=" + this.f173434f + ", storyCollectionId=" + this.f173435g + ")";
    }

    public C77306j(Aweme aweme, String str, String str2, String str3, int i, String str4, String str5) {
        this.f173429a = aweme;
        this.f173430b = str;
        this.f173431c = str2;
        this.f173432d = str3;
        this.f173433e = i;
        this.f173434f = str4;
        this.f173435g = str5;
    }
}
