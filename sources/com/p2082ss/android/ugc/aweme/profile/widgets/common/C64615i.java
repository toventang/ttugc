package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.i */
public final class C64615i implements AbstractC12798a {

    /* renamed from: a */
    public final User f146329a;

    /* renamed from: b */
    public final C12776a<User> f146330b;

    /* renamed from: c */
    public final boolean f146331c;

    /* renamed from: d */
    public final C12776a<User> f146332d;

    /* renamed from: e */
    public final EnumC64592g f146333e;

    static {
        Covode.recordClassIndex(76081);
    }

    /* renamed from: a */
    private static C64615i m116528a(User user, C12776a<? extends User> aVar, boolean z, C12776a<? extends User> aVar2, EnumC64592g gVar) {
        C89219l.m154721d(gVar, "");
        return new C64615i(user, aVar, z, aVar2, gVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C64615i m116529a(C64615i iVar, User user, C12776a aVar, boolean z, C12776a aVar2, EnumC64592g gVar, int i) {
        if ((i & 1) != 0) {
            user = iVar.f146329a;
        }
        if ((i & 2) != 0) {
            aVar = iVar.f146330b;
        }
        if ((i & 4) != 0) {
            z = iVar.f146331c;
        }
        if ((i & 8) != 0) {
            aVar2 = iVar.f146332d;
        }
        if ((i & 16) != 0) {
            gVar = iVar.f146333e;
        }
        return m116528a(user, aVar, z, aVar2, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64615i)) {
            return false;
        }
        C64615i iVar = (C64615i) obj;
        return C89219l.m154714a(this.f146329a, iVar.f146329a) && C89219l.m154714a(this.f146330b, iVar.f146330b) && this.f146331c == iVar.f146331c && C89219l.m154714a(this.f146332d, iVar.f146332d) && C89219l.m154714a(this.f146333e, iVar.f146333e);
    }

    public final int hashCode() {
        User user = this.f146329a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        C12776a<User> aVar = this.f146330b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f146331c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        C12776a<User> aVar2 = this.f146332d;
        int hashCode3 = (i5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        EnumC64592g gVar = this.f146333e;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProfileInfoData(user=" + this.f146329a + ", userUpdateEvent=" + this.f146330b + ", fromSetSimpleUser=" + this.f146331c + ", onUserLoadEvent=" + this.f146332d + ", action=" + this.f146333e + ")";
    }

    public /* synthetic */ C64615i() {
        this(null, null, false, null, EnumC64592g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64615i(User user, C12776a<? extends User> aVar, boolean z, C12776a<? extends User> aVar2, EnumC64592g gVar) {
        C89219l.m154721d(gVar, "");
        this.f146329a = user;
        this.f146330b = aVar;
        this.f146331c = z;
        this.f146332d = aVar2;
        this.f146333e = gVar;
    }
}
