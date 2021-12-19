package com.p2082ss.android.ugc.aweme.mix.addfeed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.addfeed.b */
public final class C59377b extends AddFeedToMixFragment.C59338d {

    /* renamed from: a */
    public String f135649a;

    /* renamed from: b */
    boolean f135650b;

    /* renamed from: c */
    public boolean f135651c;

    static {
        Covode.recordClassIndex(69763);
    }

    public /* synthetic */ C59377b() {
        this("");
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59338d
    /* renamed from: a */
    public final boolean mo97010a() {
        return this.f135650b;
    }

    public final int hashCode() {
        int i;
        String str = this.f135649a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        boolean z = this.f135650b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f135651c) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "DefaultMixListItem(mixId=" + this.f135649a + ", select=" + this.f135650b + ", isNameValid=" + this.f135651c + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59338d
    /* renamed from: a */
    public final void mo97009a(boolean z) {
        this.f135650b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C59377b(String str) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        this.f135649a = str;
        this.f135650b = false;
        this.f135651c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59377b)) {
            return false;
        }
        C59377b bVar = (C59377b) obj;
        if (C89219l.m154714a((Object) this.f135649a, (Object) bVar.f135649a) && this.f135650b == bVar.f135650b && this.f135651c == bVar.f135651c) {
            return true;
        }
        return false;
    }
}
