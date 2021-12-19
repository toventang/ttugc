package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.c */
public final class C64349c implements AbstractC12779c {

    /* renamed from: a */
    public final String f145882a;

    /* renamed from: b */
    public final String f145883b;

    /* renamed from: c */
    public Fragment f145884c;

    static {
        Covode.recordClassIndex(75803);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64349c)) {
            return false;
        }
        C64349c cVar = (C64349c) obj;
        return C89219l.m154714a(this.f145882a, cVar.f145882a) && C89219l.m154714a(this.f145883b, cVar.f145883b) && C89219l.m154714a(this.f145884c, cVar.f145884c);
    }

    public final int hashCode() {
        String str = this.f145882a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f145883b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Fragment fragment = this.f145884c;
        if (fragment != null) {
            i = fragment.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MyVideoListInitData(userId=" + this.f145882a + ", secUid=" + this.f145883b + ", attachedFragment=" + this.f145884c + ")";
    }

    public C64349c(String str, String str2, Fragment fragment) {
        this.f145882a = str;
        this.f145883b = str2;
        this.f145884c = fragment;
    }
}
