package com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.C62020a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.a.a */
public final class C62005a extends C39088c<C62020a, AbstractC62006b> {
    static {
        Covode.recordClassIndex(72754);
    }

    /* renamed from: d */
    private final boolean m112142d() {
        if (this.f92286h == null || this.f92287i == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m112143e() {
        T t;
        AbstractC39085b bVar = this.f92286h;
        if (bVar == null || (t = bVar.mData) == null) {
            return false;
        }
        return t.hasMore;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        if (m112142d()) {
            if (((C62020a) this.f92286h).f140756c) {
                ((AbstractC62006b) this.f92287i).mo99812b(true);
            } else {
                ((AbstractC62006b) this.f92287i).mo99812b(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        boolean z;
        if (m112142d()) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            List<User> list = bVar.mData.userRequestList;
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((C62020a) this.f92286h).f140756c) {
                AbstractC62006b bVar2 = (AbstractC62006b) this.f92287i;
                C89219l.m154716b(list, "");
                if (m112143e() && !z) {
                    z2 = true;
                }
                bVar2.mo99810a(list, true, z2);
            } else if (z) {
                ((AbstractC62006b) this.f92287i).mo99808a();
            } else if (((C62020a) this.f92286h).f140757d) {
                C89219l.m154716b(list, "");
                AbstractC39085b bVar3 = this.f92286h;
                C89219l.m154716b(bVar3, "");
                ((AbstractC62006b) this.f92287i).mo99809a(list, bVar3.mData.total);
            } else {
                C89219l.m154716b(list, "");
                ((AbstractC62006b) this.f92287i).mo99810a(list, false, m112143e());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (m112142d()) {
            if (((C62020a) this.f92286h).f140756c) {
                ((AbstractC62006b) this.f92287i).mo99811a(true);
            } else {
                ((AbstractC62006b) this.f92287i).mo99811a(false);
            }
        }
    }
}
