package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import java.util.concurrent.CancellationException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.g */
public class C42082g<T extends AbstractC42081f> extends C39101b<T> {

    /* renamed from: a */
    public boolean f98122a;

    /* renamed from: b */
    AbstractC42637ac f98123b;

    static {
        Covode.recordClassIndex(50016);
    }

    /* renamed from: d */
    private void mo71327d() {
        if (this.f92286h != null && this.f98123b != null) {
            ((AbstractC42081f) this.f92286h).f98115k = this.f98123b.aY_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: h */
    public final void mo67840h() {
        if (this.f92286h != null && (this.f92286h instanceof AbstractC42081f)) {
            ((AbstractC42081f) this.f92286h).mo71279a(0, "basepresenter new request");
        }
        super.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public void mo57528c() {
        this.f98122a = true;
        super.mo57528c();
        if (((AbstractC39100a) this.f92286h).mListQueryType == 1) {
            if (((AbstractC39100a) this.f92286h).mListQueryType == 1 && (this.f92287i instanceof AbstractC42637ac)) {
                ((AbstractC42637ac) this.f92287i).mo72829a((SearchApiResult) this.f92286h.mData);
            }
            GlobalDoodleConfig globalDoodleConfig = this.f92286h.mData.globalDoodleConfig;
            AbstractC42637ac acVar = this.f98123b;
            String str = null;
            if (acVar != null) {
                m84258b(acVar);
                this.f98123b.mo71303a(this.f92286h.mData.dynamicHeader);
                AbstractC42637ac acVar2 = this.f98123b;
                C42345d dVar = this.f92286h.mData.dynamicMask;
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getUseScenario();
                }
                acVar2.mo71304a(dVar, str);
                this.f98123b.mo72828a(((AbstractC42081f) this.f92286h).mo71285f());
                this.f98123b.mo72830a(((AbstractC42081f) this.f92286h).mo71286g(), globalDoodleConfig);
                this.f98123b.mo72833b(this.f92286h.mData);
                this.f98123b.mo72834b_(((AbstractC42081f) this.f92286h).mo71287h());
            } else if (this.f92287i instanceof AbstractC42637ac) {
                m84258b((AbstractC42637ac) this.f92287i);
                ((AbstractC42637ac) this.f92287i).mo71303a(this.f92286h.mData.dynamicHeader);
                AbstractC42637ac acVar3 = (AbstractC42637ac) this.f92287i;
                C42345d dVar2 = this.f92286h.mData.dynamicMask;
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getUseScenario();
                }
                acVar3.mo71304a(dVar2, str);
                ((AbstractC42637ac) this.f92287i).mo72828a(((AbstractC42081f) this.f92286h).mo71285f());
                AbstractC42081f fVar = (AbstractC42081f) this.f92286h;
                if (fVar.mData != null) {
                    C89219l.m154716b(fVar.mData, "");
                }
                ((AbstractC42637ac) this.f92287i).mo72830a(((AbstractC42081f) this.f92286h).mo71286g(), globalDoodleConfig);
                ((AbstractC42637ac) this.f92287i).mo72833b(this.f92286h.mData);
                this.f98123b.mo72834b_(((AbstractC42081f) this.f92286h).mo71287h());
            }
        }
    }

    /* renamed from: a */
    public final void mo67839a_(AbstractC39102c cVar) {
        super.mo67839a_(cVar);
        if (cVar instanceof AbstractC42637ac) {
            mo71293a((AbstractC42637ac) cVar);
        }
    }

    /* renamed from: b */
    public final void mo71295b(int i) {
        if (this.f92286h != null) {
            ((AbstractC42081f) this.f92286h).f98118n = i;
        }
    }

    /* renamed from: a */
    public final void mo67838a(T t) {
        super.mo67838a((AbstractC39085b) t);
        mo71327d();
    }

    /* renamed from: a */
    public final void mo71293a(AbstractC42637ac acVar) {
        this.f98123b = acVar;
        mo71327d();
    }

    /* renamed from: b */
    private void m84258b(AbstractC42637ac acVar) {
        if (this.f92286h != null && ((AbstractC39100a) this.f92286h).getItems() != null) {
            C67605g.m119730a(acVar.aX_()).mo106586c(((AbstractC39100a) this.f92286h).getItems().size()).mo106587d().mo106580a(((AbstractC42081f) this.f92286h).f98119o).mo106579a((AbstractC33631g) this.f92286h.mData).mo106583b(0);
            C67606h.m119736a(acVar.aX_()).mo106608e(((AbstractC39100a) this.f92286h).getItems().size()).mo106600b().mo106599a(((AbstractC42081f) this.f92286h).f98119o).mo106598a((AbstractC33631g) this.f92286h.mData).mo106604c(0);
        }
    }

    /* renamed from: a */
    public void mo71294a(String str) {
        if (this.f92286h != null) {
            ((AbstractC42081f) this.f92286h).mo71280b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
        exc.printStackTrace();
        if (!(exc instanceof CancellationException)) {
            this.f98122a = false;
            super.mo57526a_(exc);
            AbstractC42637ac acVar = this.f98123b;
            if (acVar != null || ((this.f92287i instanceof AbstractC42637ac) && (acVar = (AbstractC42637ac) this.f92287i) != null)) {
                C67605g.m119730a(acVar.aX_()).mo106587d().mo106583b(1).mo106584b(exc.getMessage());
                C67606h.m119736a(acVar.aX_()).mo106600b().mo106604c(1).mo106602b(exc.getMessage());
                C67592a.f151370c.mo106572a(exc);
                acVar.mo72828a((QueryCorrectInfo) null);
                acVar.mo71303a((C42345d) null);
                acVar.mo71304a((C42345d) null, (String) null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        if (this.f92286h != null) {
            if (this.f98123b != null) {
                ((AbstractC42081f) this.f92286h).f98113i = this.f98123b.aX_();
            }
            ((AbstractC42081f) this.f92286h).mo71279a(1, "basePresenter new request");
        }
        AbstractC42637ac acVar = this.f98123b;
        if (acVar != null) {
            C67605g.m119730a(acVar.aX_()).mo106582b();
            C67606h.m119736a(this.f98123b.aX_()).mo106594a();
        }
        return super.mo57616a(objArr);
    }
}
