package com.p2082ss.android.ugc.aweme.notification.p3525f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.notification.bean.C61868c;
import com.p2082ss.android.ugc.aweme.notification.model.LikeListModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.f.a */
public final class C62000a extends C39088c<LikeListModel, AbstractC39102c<C61868c>> {
    static {
        Covode.recordClassIndex(72749);
    }

    /* renamed from: f */
    private final boolean m112124f() {
        if (this.f92286h == null || this.f92287i == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo100050d() {
        T t;
        AbstractC39085b bVar = this.f92286h;
        if (bVar == null || (t = bVar.mData) == null) {
            return 0;
        }
        return t.f140460e;
    }

    /* renamed from: e */
    public final void mo100051e() {
        LikeListModel likeListModel = (LikeListModel) this.f92286h;
        if (likeListModel != null) {
            likeListModel.refresh();
        }
        mo57527b();
    }

    /* renamed from: g */
    private boolean m112125g() {
        T t;
        AbstractC39085b bVar = this.f92286h;
        if (bVar == null || (t = bVar.mData) == null || t.f140456a != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        if (m112124f()) {
            if (((LikeListModel) this.f92286h).isLoadMore) {
                ((AbstractC39102c) this.f92287i).aW_();
            } else {
                ((AbstractC39102c) this.f92287i).mo59515b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (m112124f()) {
            boolean z = false;
            if (((LikeListModel) this.f92286h).isLoadMore) {
                AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                List<C61868c> list = bVar.mData.f140461f;
                if (m112125g()) {
                    AbstractC39085b bVar2 = this.f92286h;
                    C89219l.m154716b(bVar2, "");
                    List<C61868c> list2 = bVar2.mData.f140461f;
                    if (list2 != null && !list2.isEmpty()) {
                        z = true;
                    }
                }
                cVar.mo59517b(list, z);
                return;
            }
            AbstractC39085b bVar3 = this.f92286h;
            C89219l.m154716b(bVar3, "");
            List<C61868c> list3 = bVar3.mData.f140461f;
            if (list3 == null || list3.isEmpty()) {
                ((AbstractC39102c) this.f92287i).mo59525f();
                return;
            }
            AbstractC39085b bVar4 = this.f92286h;
            C89219l.m154716b(bVar4, "");
            ((AbstractC39102c) this.f92287i).mo59512a(bVar4.mData.f140461f, m112125g());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (m112124f()) {
            if (((LikeListModel) this.f92286h).isLoadMore) {
                ((AbstractC39102c) this.f92287i).mo59522c(exc);
            } else {
                ((AbstractC39102c) this.f92287i).mo59516b(exc);
            }
        }
    }
}
