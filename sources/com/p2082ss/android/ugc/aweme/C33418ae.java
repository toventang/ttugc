package com.p2082ss.android.ugc.aweme;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ae */
public final class C33418ae extends C39088c<C33479ak, AbstractC34830bh> implements AbstractC39105f {

    /* renamed from: a */
    public AbstractC39103d f79449a;

    /* renamed from: b */
    public AbstractC33473aj f79450b;

    static {
        Covode.recordClassIndex(40275);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final boolean mo59500a(C39108i iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    public final void ck_() {
        super.ck_();
        this.f79449a = null;
    }

    /* renamed from: d */
    private void m68525d() {
        if (((C33479ak) this.f92286h).f79548d) {
            ((AbstractC34830bh) this.f92287i).mo59549d();
        } else {
            ((AbstractC34830bh) this.f92287i).mo59548c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        if (this.f92286h != null && this.f92287i != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i == 1) {
                ((AbstractC34830bh) this.f92287i).mo59515b();
            } else if (i == 2) {
                ((AbstractC34830bh) this.f92287i).bl_();
            } else if (i == 4) {
                ((AbstractC34830bh) this.f92287i).aW_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92287i != null) {
            m68525d();
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            boolean z = false;
            if (i == 1) {
                List<C33542a> list = ((C33479ak) this.f92286h).f79546b;
                if (list == null || list.isEmpty()) {
                    ((AbstractC34830bh) this.f92287i).mo59525f();
                } else {
                    ((AbstractC34830bh) this.f92287i).mo59512a(((AbstractC39100a) this.f92286h).getItems(), ((AbstractC39100a) this.f92286h).isHasMore());
                }
                String str = ((C33479ak) this.f92286h).f79549e;
                if (this.f79450b != null && !TextUtils.isEmpty(str)) {
                    this.f79450b.mo59546a(str);
                }
            } else if (i == 2) {
                ((AbstractC34830bh) this.f92287i).mo59523c(((AbstractC39100a) this.f92286h).getItems(), true ^ ((AbstractC39100a) this.f92286h).isNewDataEmpty());
            } else if (i == 4) {
                AbstractC34830bh bhVar = (AbstractC34830bh) this.f92287i;
                List items = ((AbstractC39100a) this.f92286h).getItems();
                if (((AbstractC39100a) this.f92286h).isHasMore() && !((AbstractC39100a) this.f92286h).isNewDataEmpty()) {
                    z = true;
                }
                bhVar.mo59517b(items, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59498a(int i) {
        AbstractC39103d dVar = this.f79449a;
        if (dVar != null) {
            dVar.mo62671b(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92286h != null && this.f92287i != null) {
            m68525d();
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i == 1) {
                ((AbstractC34830bh) this.f92287i).mo59516b(exc);
            } else if (i == 2) {
                ((AbstractC34830bh) this.f92287i).mo59511a(exc);
            } else if (i == 4) {
                ((AbstractC34830bh) this.f92287i).mo59522c(exc);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59499a(List list, int i) {
        AbstractC39103d dVar = this.f79449a;
        if (dVar != null) {
            dVar.mo62668a(list, i);
        }
    }
}
