package com.p2082ss.android.ugc.aweme.photo.p3546a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.a.a */
public final class C62855a implements Serializable {

    /* renamed from: a */
    private final int f142546a;

    /* renamed from: b */
    private final List<User> f142547b;

    /* renamed from: c */
    private final int f142548c;

    static {
        Covode.recordClassIndex(73686);
    }

    public C62855a() {
        this(0, null, 0, 7, null);
    }

    public C62855a(int i) {
        this(i, null, 0, 6, null);
    }

    public C62855a(int i, List<? extends User> list) {
        this(i, list, 0, 4, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m113270x8db769e8(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.photo.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C62855a copy$default(C62855a aVar, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f142546a;
        }
        if ((i3 & 2) != 0) {
            list = aVar.f142547b;
        }
        if ((i3 & 4) != 0) {
            i2 = aVar.f142548c;
        }
        return aVar.copy(i, list, i2);
    }

    public final int component1() {
        return this.f142546a;
    }

    public final List<User> component2() {
        return this.f142547b;
    }

    public final int component3() {
        return this.f142548c;
    }

    public final C62855a copy(int i, List<? extends User> list, int i2) {
        return new C62855a(i, list, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62855a)) {
            return false;
        }
        C62855a aVar = (C62855a) obj;
        return this.f142546a == aVar.f142546a && C89219l.m154714a(this.f142547b, aVar.f142547b) && this.f142548c == aVar.f142548c;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m113270x8db769e8(this.f142546a) * 31;
        List<User> list = this.f142547b;
        return ((com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + m113270x8db769e8(this.f142548c);
    }

    public final String toString() {
        return "PermissionWrapper(permission=" + this.f142546a + ", excludeUserList=" + this.f142547b + ", allowRecommend=" + this.f142548c + ")";
    }

    public final int getAllowRecommend() {
        return this.f142548c;
    }

    public final List<User> getExcludeUserList() {
        return this.f142547b;
    }

    public final int getPermission() {
        return this.f142546a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C62855a(int i, List<? extends User> list, int i2) {
        this.f142546a = i;
        this.f142547b = list;
        this.f142548c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62855a(int i, List list, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? 0 : i2);
    }
}
