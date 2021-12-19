package com.p2082ss.android.ugc.aweme.common.p2633e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.e.b */
public class C39101b<T extends AbstractC39100a> extends C39088c<T, AbstractC39102c> implements AbstractC39105f {

    /* renamed from: k */
    protected AbstractC39103d f92299k;

    static {
        Covode.recordClassIndex(46717);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public boolean mo59500a(C39108i iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    public void ck_() {
        super.ck_();
        this.f92299k = null;
        if (this.f92286h != null) {
            ((AbstractC39100a) this.f92286h).mListAdapter = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public void mo57527b() {
        if (this.f92286h != null && this.f92287i != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i == 1) {
                ((AbstractC39102c) this.f92287i).mo59515b();
            } else if (i == 2) {
                ((AbstractC39102c) this.f92287i).bl_();
            } else if (i == 4) {
                ((AbstractC39102c) this.f92287i).aW_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public void mo57528c() {
        if (this.f92286h != null && this.f92287i != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    ((AbstractC39102c) this.f92287i).mo59523c(((AbstractC39100a) this.f92286h).getItems(), true ^ ((AbstractC39100a) this.f92286h).isNewDataEmpty());
                } else if (i == 4) {
                    AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                    List items = ((AbstractC39100a) this.f92286h).getItems();
                    if (!((AbstractC39100a) this.f92286h).isHasMore() || ((AbstractC39100a) this.f92286h).isNewDataEmpty()) {
                        z = false;
                    }
                    cVar.mo59517b(items, z);
                }
            } else if (((AbstractC39100a) this.f92286h).isDataEmpty()) {
                ((AbstractC39102c) this.f92287i).mo59525f();
            } else {
                ((AbstractC39102c) this.f92287i).mo59512a(((AbstractC39100a) this.f92286h).getItems(), ((AbstractC39100a) this.f92286h).isHasMore());
            }
        }
    }

    /* renamed from: a */
    public void mo67865a(AbstractC39103d dVar) {
        this.f92299k = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public void mo59498a(int i) {
        AbstractC39103d dVar = this.f92299k;
        if (dVar != null) {
            dVar.mo62671b(i);
        }
    }

    /* renamed from: a */
    public boolean mo67866a(Object obj) {
        if (this.f92286h == null || !((AbstractC39100a) this.f92286h).deleteItem(obj)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
        if (this.f92286h != null && this.f92287i != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i == 1) {
                ((AbstractC39102c) this.f92287i).mo59516b(exc);
            } else if (i == 2) {
                ((AbstractC39102c) this.f92287i).mo59511a(exc);
            } else if (i == 4) {
                ((AbstractC39102c) this.f92287i).mo59522c(exc);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public void mo59499a(List list, int i) {
        AbstractC39103d dVar = this.f92299k;
        if (dVar != null) {
            dVar.mo62668a(list, i);
        }
    }

    /* renamed from: a */
    public boolean mo67867a(Object obj, int i) {
        if (this.f92286h == null || !((AbstractC39100a) this.f92286h).insertItem(obj, i)) {
            return false;
        }
        return true;
    }
}
