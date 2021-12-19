package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.jedi.C42135b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u;
import com.p2082ss.android.ugc.aweme.discover.model.GradientBgData;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67603e;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.theme.C67778b;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.ui.a */
public final class C42441a extends C39088c<C42439u, C42135b> implements AbstractC42442b {

    /* renamed from: a */
    public String f98915a;

    static {
        Covode.recordClassIndex(50388);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: l */
    public final void mo71653l() {
        if (this.f92287i != null) {
            ((AbstractC42690av) this.f92287i).mo72919b(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: e */
    public final void mo71649e() {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39144m mVar = this.f92287i;
            C89219l.m154716b(mVar, "");
            if (((AbstractC18234b) mVar).af_()) {
                ((C42135b) this.f92287i).mo71352p();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: g */
    public final void mo71651g() {
        if (this.f92286h != null && this.f92287i != null) {
            SearchRecyclerView searchRecyclerView = ((C42135b) this.f92287i).f98239l;
            if (searchRecyclerView == null) {
                C89219l.m154715b();
            }
            searchRecyclerView.f98913Q.tryLock();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: h */
    public final void mo67840h() {
        if (this.f92286h != null) {
            ((AbstractC42081f) this.f92286h).mo71279a(0, "search grid unBindModel");
        }
        super.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: k */
    public final void mo71652k() {
        if (this.f92286h != null && this.f92287i != null) {
            SearchRecyclerView searchRecyclerView = ((C42135b) this.f92287i).f98239l;
            if (searchRecyclerView == null) {
                C89219l.m154715b();
            }
            try {
                searchRecyclerView.f98913Q.unlock();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            int i = ((AbstractC39100a) bVar).mListQueryType;
            if (i == 1) {
                ((AbstractC42690av) this.f92287i).mo59515b();
            } else if (i == 2) {
                ((AbstractC42690av) this.f92287i).bl_();
            } else if (i == 4) {
                ((AbstractC42690av) this.f92287i).aW_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: f */
    public final void mo71650f() {
        if (this.f92286h != null && this.f92287i != null) {
            SearchRecyclerView searchRecyclerView = ((C42135b) this.f92287i).f98239l;
            if (searchRecyclerView == null) {
                C89219l.m154715b();
            }
            searchRecyclerView.f98914R.mo106612a().clear();
            searchRecyclerView.f98912P = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: d */
    public final void mo71648d() {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39144m mVar = this.f92287i;
            C89219l.m154716b(mVar, "");
            if (((AbstractC18234b) mVar).af_()) {
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                ((AbstractC42690av) this.f92287i).mo72829a((SearchApiResult) bVar.mData);
                C42135b bVar2 = (C42135b) this.f92287i;
                AbstractC39085b bVar3 = this.f92286h;
                C89219l.m154716b(bVar3, "");
                T t = bVar3.mData;
                C89219l.m154716b(t, "");
                C89219l.m154721d(t, "");
                bVar2.mo71342a(t.globalDoodleConfig);
                SearchRecyclerView searchRecyclerView = bVar2.f98239l;
                if (searchRecyclerView == null) {
                    C89219l.m154715b();
                }
                searchRecyclerView.f98911O = false;
                bVar2.mo72900A().mo67810f();
                bVar2.mo72900A().mo62377b_(t.f98850c);
                bVar2.mo72900A().mo67829d(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        super.mo57528c();
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39144m mVar = this.f92287i;
            C89219l.m154716b(mVar, "");
            if (((AbstractC18234b) mVar).af_()) {
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                int i = ((AbstractC39100a) bVar).mListQueryType;
                if (i == 1) {
                    AbstractC39085b bVar2 = this.f92286h;
                    C89219l.m154716b(bVar2, "");
                    if (bVar2.mData == null) {
                        ((AbstractC42690av) this.f92287i).mo59525f();
                        return;
                    }
                    AbstractC39144m mVar2 = this.f92287i;
                    C89219l.m154716b(mVar2, "");
                    C67603e a = C67605g.m119730a(((AbstractC42670am) mVar2).f99508s);
                    AbstractC39085b bVar3 = this.f92286h;
                    C89219l.m154716b(bVar3, "");
                    C67603e a2 = a.mo106586c(((AbstractC39100a) bVar3).getItems().size()).mo106580a(((AbstractC42081f) this.f92286h).f98119o);
                    AbstractC39085b bVar4 = this.f92286h;
                    C89219l.m154716b(bVar4, "");
                    a2.mo106579a((AbstractC33631g) bVar4.mData);
                    AbstractC39085b bVar5 = this.f92286h;
                    C89219l.m154716b(bVar5, "");
                    T t = bVar5.mData;
                    C89219l.m154716b(t, "");
                    AbstractC39085b bVar6 = this.f92286h;
                    C89219l.m154716b(bVar6, "");
                    t.f98850c = ((AbstractC39100a) bVar6).getItems();
                    AbstractC39085b bVar7 = this.f92286h;
                    C89219l.m154716b(bVar7, "");
                    ((C42135b) this.f92287i).mo71345b((C42426m) bVar7.mData);
                } else if (i == 4) {
                    AbstractC39085b bVar8 = this.f92286h;
                    C89219l.m154716b(bVar8, "");
                    T t2 = bVar8.mData;
                    C89219l.m154716b(t2, "");
                    AbstractC39085b bVar9 = this.f92286h;
                    C89219l.m154716b(bVar9, "");
                    t2.f98850c = ((AbstractC39100a) bVar9).getItems();
                    AbstractC39085b bVar10 = this.f92286h;
                    C89219l.m154716b(bVar10, "");
                    T t3 = bVar10.mData;
                    C89219l.m154716b(t3, "");
                    ((C42135b) this.f92287i).mo71341a((C42426m) t3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67838a(C42439u uVar) {
        super.mo67838a((AbstractC39085b) uVar);
        if (this.f92286h != null && this.f92287i != null) {
            ((AbstractC42081f) this.f92286h).f98115k = ((AbstractC42690av) this.f92287i).aY_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (this.f92286h == null || this.f92287i == null) {
            return false;
        }
        ((AbstractC42081f) this.f92286h).mo71279a(1, "new Request");
        AbstractC39144m mVar = this.f92287i;
        C89219l.m154716b(mVar, "");
        ((AbstractC42081f) this.f92286h).f98113i = ((AbstractC42670am) mVar).f99508s;
        return super.mo57616a(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39144m mVar = this.f92287i;
            C89219l.m154716b(mVar, "");
            if (((AbstractC18234b) mVar).af_()) {
                super.mo57526a_(exc);
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                int i = ((AbstractC39100a) bVar).mListQueryType;
                if (i == 1) {
                    C42135b bVar2 = (C42135b) this.f92287i;
                    if (exc == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154721d(exc, "");
                    if (!(exc instanceof CancellationException)) {
                        if (exc instanceof Exception) {
                            bVar2.mo59516b(exc);
                        } else {
                            bVar2.mo59516b(new Exception(exc));
                        }
                        C67778b bVar3 = bVar2.f98238k;
                        if (bVar3 != null) {
                            bVar3.mo106869a((GradientBgData) null);
                        }
                        bVar2.mo72828a((QueryCorrectInfo) null);
                        bVar2.mo71303a((C42345d) null);
                        bVar2.mo71304a((C42345d) null, (String) null);
                    }
                } else if (i == 4) {
                    AbstractC42690av avVar = (AbstractC42690av) this.f92287i;
                    if (exc == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154721d(exc, "");
                    if (!(exc instanceof CancellationException)) {
                        avVar.mo59522c(new Exception(exc));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.AbstractC42442b
    /* renamed from: a */
    public final void mo71646a(int i, Exception exc) {
        if (this.f92287i != null) {
            if (i == 0) {
                ((AbstractC42690av) this.f92287i).mo72919b(true);
                ((C42135b) this.f92287i).mo71349n();
            } else if (i != 1) {
                if (i == 2) {
                    ((AbstractC42690av) this.f92287i).mo59525f();
                }
            } else if (exc != null) {
                ((AbstractC42690av) this.f92287i).mo59516b(exc);
            }
        }
    }
}
