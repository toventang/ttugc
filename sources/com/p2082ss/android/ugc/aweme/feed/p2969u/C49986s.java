package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p122a.C2541b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51079a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.u.s */
public final class C49986s extends C39101b<C51079a> {

    /* renamed from: a */
    public boolean f115319a;

    /* renamed from: b */
    public AbstractC49992x f115320b;

    /* renamed from: c */
    public boolean f115321c;

    /* renamed from: d */
    public boolean f115322d;

    /* renamed from: e */
    private boolean f115323e;

    /* renamed from: f */
    private AbstractC39103d f115324f;

    static {
        Covode.recordClassIndex(59098);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    public final void ck_() {
        super.ck_();
        this.f115324f = null;
    }

    /* renamed from: d */
    private void m93847d() {
        if (this.f115319a) {
            this.f115319a = false;
            ((C51079a) this.f92286h).f117820c = false;
        }
        if (this.f115322d) {
            AbstractC81915c.m141874a(new C49698y("DISCOVER"));
        } else {
            AbstractC81915c.m141874a(new C49698y());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        boolean z;
        C2541b.m7437b("feed", "follow");
        m93847d();
        AbstractC49992x xVar = this.f115320b;
        boolean z2 = true;
        if (xVar != null) {
            if (!this.f115323e || this.f115321c) {
                z = true;
            } else {
                z = false;
            }
            xVar.mo70483c(z);
        }
        this.f115323e = false;
        this.f115321c = false;
        if (this.f92286h != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 4 && this.f92287i != null) {
                        AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                        List<Aweme> b = ((C51079a) this.f92286h).mo86489b();
                        if (!((AbstractC39100a) this.f92286h).isHasMore() || ((AbstractC39100a) this.f92286h).isNewDataEmpty()) {
                            z2 = false;
                        }
                        cVar.mo59517b(b, z2);
                    }
                } else if (this.f92287i != null) {
                    ((AbstractC39102c) this.f92287i).mo59523c(((C51079a) this.f92286h).mo86489b(), true ^ ((AbstractC39100a) this.f92286h).isNewDataEmpty());
                }
            } else if (((AbstractC39100a) this.f92286h).isDataEmpty()) {
                if (this.f92287i != null) {
                    ((AbstractC39102c) this.f92287i).mo59525f();
                }
            } else if (this.f92287i != null) {
                ((AbstractC39102c) this.f92287i).mo59512a(((C51079a) this.f92286h).mo86489b(), ((AbstractC39100a) this.f92286h).isHasMore());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a */
    public final void mo67865a(AbstractC39103d dVar) {
        this.f115324f = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59498a(int i) {
        AbstractC39103d dVar = this.f115324f;
        if (dVar != null) {
            dVar.mo62671b(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        AbstractC49992x xVar = this.f115320b;
        if (xVar != null) {
            xVar.mo70483c(this.f115321c);
        }
        return super.mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a */
    public final boolean mo67866a(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((AbstractC39100a) this.f92286h).getItems();
            if (!C13603b.m24435a((Collection) items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    AbstractC61496a aVar = (AbstractC61496a) items.get(i);
                    if (TextUtils.equals(((Aweme) obj).getAid(), C59208ac.m108771e(aVar.getAweme()))) {
                        ((AbstractC39100a) this.f92286h).deleteItem(aVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        boolean z;
        C2541b.m7435a("feed", "follow", C16105a.m29902a(C17867d.m33078a(), exc));
        m93847d();
        AbstractC49992x xVar = this.f115320b;
        if (xVar != null) {
            if (!this.f115323e || this.f115321c) {
                z = true;
            } else {
                z = false;
            }
            xVar.mo70483c(z);
        }
        this.f115323e = false;
        this.f115321c = false;
        if (this.f92286h != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 4 && this.f92287i != null) {
                        ((AbstractC39102c) this.f92287i).mo59522c(exc);
                    }
                } else if (this.f92287i != null) {
                    ((AbstractC39102c) this.f92287i).mo59511a(exc);
                }
            } else if (this.f92287i != null) {
                ((AbstractC39102c) this.f92287i).mo59516b(exc);
            }
            if (exc instanceof C34485a) {
                C39162r.m79460a("homepage_follow_monitor", new C33744d().mo59983a("error_type", "follow_feed_error").mo59980a("error_code", ((C34480a) exc).getErrorCode()).f79943a);
            } else {
                C39162r.m79460a("homepage_follow_monitor", new C33744d().mo59983a("error_type", "follow_feed_error").mo59980a("error_code", 4).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59499a(List list, int i) {
        AbstractC39103d dVar = this.f115324f;
        if (dVar != null) {
            dVar.mo62668a(list, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a */
    public final boolean mo67867a(Object obj, int i) {
        List items = ((AbstractC39100a) this.f92286h).getItems();
        if (C13603b.m24435a((Collection) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, obj);
        ((AbstractC39100a) this.f92286h).setItems(items);
        if (this.f92287i == null) {
            return true;
        }
        if (((AbstractC39100a) this.f92286h).isDataEmpty()) {
            ((AbstractC39102c) this.f92287i).mo59525f();
            return true;
        }
        mo59499a((List) ((C51079a) this.f92286h).mo86489b(), i);
        return true;
    }
}
