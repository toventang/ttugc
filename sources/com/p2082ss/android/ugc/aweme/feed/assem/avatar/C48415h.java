package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.h */
public final class C48415h implements AbstractC12853j {

    /* renamed from: a */
    public final int f112135a;

    /* renamed from: b */
    public final String f112136b;

    static {
        Covode.recordClassIndex(57189);
    }

    /* renamed from: a */
    public static C48415h m91853a(int i, String str) {
        return new C48415h(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48415h)) {
            return false;
        }
        C48415h hVar = (C48415h) obj;
        return this.f112135a == hVar.f112135a && C89219l.m154714a(this.f112136b, hVar.f112136b);
    }

    public final int hashCode() {
        int i = this.f112135a * 31;
        String str = this.f112136b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedAvatarDefaultState(followViewVisibility=" + this.f112135a + ", profileWidgetBadgeUrl=" + this.f112136b + ")";
    }

    public /* synthetic */ C48415h() {
        this(0, null);
    }

    private C48415h(int i, String str) {
        this.f112135a = i;
        this.f112136b = str;
    }
}
