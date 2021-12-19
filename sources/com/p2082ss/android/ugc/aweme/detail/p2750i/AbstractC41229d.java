package com.p2082ss.android.ugc.aweme.detail.p2750i;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41228c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.i.d */
public abstract class AbstractC41229d<T extends AbstractC41228c, DATA> extends C39101b<T> {

    /* renamed from: a */
    public AbstractC49992x f96343a;

    /* renamed from: b */
    public boolean f96344b;

    /* renamed from: c */
    private boolean f96345c;

    /* renamed from: d */
    private AbstractC39103d f96346d;

    static {
        Covode.recordClassIndex(49112);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo70554b(DATA data);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<DATA> mo70555d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract List<Aweme> mo70556e();

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    public final void ck_() {
        super.ck_();
        this.f96346d = null;
    }

    /* renamed from: f */
    private boolean m83096f() {
        if (!this.f96345c || this.f96344b) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        AbstractC49992x xVar = this.f96343a;
        if (xVar != null) {
            xVar.mo70483c(m83096f());
        }
        boolean z = false;
        this.f96345c = false;
        this.f96344b = false;
        if (this.f92286h != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 4 && this.f92287i != null) {
                        AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                        List<Aweme> e = mo70556e();
                        if (((AbstractC39100a) this.f92286h).isHasMore() && !((AbstractC39100a) this.f92286h).isNewDataEmpty()) {
                            z = true;
                        }
                        cVar.mo59517b(e, z);
                    }
                } else if (this.f92287i != null) {
                    ((AbstractC39102c) this.f92287i).mo59523c(mo70556e(), true ^ ((AbstractC39100a) this.f92286h).isNewDataEmpty());
                }
            } else if (((AbstractC39100a) this.f92286h).isDataEmpty()) {
                if (this.f92287i != null) {
                    ((AbstractC39102c) this.f92287i).mo59525f();
                }
            } else if (this.f92287i != null) {
                ((AbstractC39102c) this.f92287i).mo59512a(mo70556e(), ((AbstractC39100a) this.f92286h).isHasMore());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a */
    public final void mo67865a(AbstractC39103d dVar) {
        this.f96346d = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59498a(int i) {
        AbstractC39103d dVar = this.f96346d;
        if (dVar != null) {
            dVar.mo62671b(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        AbstractC49992x xVar = this.f96343a;
        if (xVar != null) {
            xVar.mo70483c(this.f96344b);
        }
        return super.mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        AbstractC49992x xVar = this.f96343a;
        if (xVar != null) {
            xVar.mo70483c(m83096f());
        }
        this.f96345c = false;
        this.f96344b = false;
        super.mo57526a_(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a */
    public final boolean mo67866a(Object obj) {
        List<DATA> d;
        int i = 0;
        if (obj instanceof Aweme) {
            List<Aweme> e = mo70556e();
            if (!C13603b.m24435a((Collection) e)) {
                int size = e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), C50545m.m94769f(e.get(i2)))) {
                        String aid = aweme.getAid();
                        if (this.f92286h != null && (d = mo70555d()) != null) {
                            int size2 = d.size();
                            while (true) {
                                if (i >= size2) {
                                    break;
                                }
                                DATA data = d.get(i);
                                String b = mo70554b(data);
                                if (!TextUtils.isEmpty(b) && TextUtils.equals(aid, b)) {
                                    d.remove(data);
                                    break;
                                }
                                i++;
                            }
                        }
                        mo59498a(i2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final void mo59499a(List list, int i) {
        AbstractC39103d dVar = this.f96346d;
        if (dVar != null) {
            dVar.mo62668a(list, i);
        }
    }
}
