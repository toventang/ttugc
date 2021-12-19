package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b */
public final class C54610b {

    /* renamed from: a */
    public final int f125172a;

    /* renamed from: b */
    public final boolean f125173b;

    /* renamed from: c */
    public final boolean f125174c;

    /* renamed from: d */
    public final C54612d f125175d;

    /* renamed from: e */
    public final boolean f125176e;

    /* renamed from: f */
    public final List<C54006a> f125177f;

    /* renamed from: g */
    public final C54613e f125178g;

    static {
        Covode.recordClassIndex(64323);
    }

    public C54610b() {
        this(0, false, false, (C54612d) null, false, (List) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54610b)) {
            return false;
        }
        C54610b bVar = (C54610b) obj;
        return this.f125172a == bVar.f125172a && this.f125173b == bVar.f125173b && this.f125174c == bVar.f125174c && C89219l.m154714a(this.f125175d, bVar.f125175d) && this.f125176e == bVar.f125176e && C89219l.m154714a(this.f125177f, bVar.f125177f) && C89219l.m154714a(this.f125178g, bVar.f125178g);
    }

    public final int hashCode() {
        int i = this.f125172a * 31;
        boolean z = this.f125173b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.f125174c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        C54612d dVar = this.f125175d;
        int i11 = 0;
        int hashCode = (i10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        if (!this.f125176e) {
            i2 = 0;
        }
        int i12 = (hashCode + i2) * 31;
        List<C54006a> list = this.f125177f;
        int hashCode2 = (i12 + (list != null ? list.hashCode() : 0)) * 31;
        C54613e eVar = this.f125178g;
        if (eVar != null) {
            i11 = eVar.hashCode();
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        return "GroupChatDetailModel(groupMemberShowCount=" + this.f125172a + ", muted=" + this.f125173b + ", pined=" + this.f125174c + ", groupNameInfo=" + this.f125175d + ", requireApprovalToJoin=" + this.f125176e + ", members=" + this.f125177f + ", requestInfo=" + this.f125178g + ")";
    }

    private C54610b(int i, boolean z, boolean z2, C54612d dVar, boolean z3, List<C54006a> list, C54613e eVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(list, "");
        this.f125172a = i;
        this.f125173b = z;
        this.f125174c = z2;
        this.f125175d = dVar;
        this.f125176e = z3;
        this.f125177f = list;
        this.f125178g = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54610b(int i, boolean z, boolean z2, C54612d dVar, boolean z3, List list, int i2) {
        this((i2 & 1) != 0 ? 12 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? new C54612d(null, false, 15) : dVar, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? C89086z.INSTANCE : list, (C54613e) null);
    }

    /* renamed from: a */
    public static /* synthetic */ C54610b m100122a(C54610b bVar, int i, boolean z, boolean z2, C54612d dVar, boolean z3, List list, C54613e eVar, int i2) {
        C54613e eVar2 = eVar;
        List list2 = list;
        boolean z4 = z3;
        int i3 = i;
        boolean z5 = z;
        boolean z6 = z2;
        C54612d dVar2 = dVar;
        if ((i2 & 1) != 0) {
            i3 = bVar.f125172a;
        }
        if ((i2 & 2) != 0) {
            z5 = bVar.f125173b;
        }
        if ((i2 & 4) != 0) {
            z6 = bVar.f125174c;
        }
        if ((i2 & 8) != 0) {
            dVar2 = bVar.f125175d;
        }
        if ((i2 & 16) != 0) {
            z4 = bVar.f125176e;
        }
        if ((i2 & 32) != 0) {
            list2 = bVar.f125177f;
        }
        if ((i2 & 64) != 0) {
            eVar2 = bVar.f125178g;
        }
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(list2, "");
        return new C54610b(i3, z5, z6, dVar2, z4, list2, eVar2);
    }
}
