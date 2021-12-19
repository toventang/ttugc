package com.p2082ss.android.ugc.aweme.discover.p2774i;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41743r;
import com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42123b;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42779bn;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50129bl;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51054c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80314ct;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.i.c */
public final class C42071c extends AbstractC42068a implements AbstractC39097c<AbstractC42474a>, AbstractC39103d, AbstractC49992x, AbstractC49992x {

    /* renamed from: i */
    protected AbstractC34638b f98085i;

    /* renamed from: j */
    public AbstractC49764q f98086j;

    /* renamed from: k */
    protected String f98087k;

    /* renamed from: l */
    protected boolean f98088l;

    /* renamed from: m */
    public int f98089m = 9;

    /* renamed from: n */
    protected C67678d f98090n;

    /* renamed from: o */
    public AbstractC51043a f98091o;

    /* renamed from: p */
    public View$OnAttachStateChangeListenerC41864g f98092p;

    /* renamed from: q */
    protected boolean f98093q;

    /* renamed from: r */
    private DoubleBallSwipeRefreshLayout f98094r;

    static {
        Covode.recordClassIndex(50005);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final void mo62668a(List list, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a
    /* renamed from: a */
    public final RecyclerView.AbstractC1362i mo71246a() {
        return new WrapGridLayoutManager(2, 1);
    }

    public final void aW_() {
        if (mo84730bE()) {
            this.f98078f.ao_();
        }
    }

    public final void bl_() {
        if (mo84730bE() && !this.f98088l) {
            this.f98085i.setRefreshing(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a
    /* renamed from: d */
    public final C41743r mo71251d() {
        if (this.f98078f != null) {
            return this.f98078f;
        }
        return new C41743r(this, this.f98087k, this.f98073a, this, this.f98089m);
    }

    /* renamed from: f */
    public final void mo71267f() {
        if (mo84730bE()) {
            this.f98085i.setRefreshing(false);
            this.f98076d.setVisibility(0);
            this.f98076d.mo27385g();
        }
    }

    /* renamed from: b */
    public final void mo71261b() {
        if (mo84730bE()) {
            if (this.f98078f.getItemCount() == 0) {
                this.f98085i.setRefreshing(false);
                if (this.f98076d != null) {
                    this.f98076d.setVisibility(0);
                    this.f98076d.mo27384f();
                    return;
                }
                return;
            }
            this.f98085i.setRefreshing(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a
    /* renamed from: c */
    public final RecyclerView.AbstractC1361h mo71250c() {
        if (this.f98089m != 9) {
            return new C42779bn((int) C13628n.m24520b(this.f183419bv, 1.0f));
        }
        if (C41554x.m83488a()) {
            return new C42123b((int) C13628n.m24520b(this.f183419bv, 8.0f), true);
        }
        return new C50129bl();
    }

    /* renamed from: k */
    public final void mo71268k() {
        AbstractC42474a aVar;
        if (mo84730bE()) {
            int childCount = this.f98077e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder a = this.f98077e.mo4393a(this.f98077e.getChildAt(i));
                if (a.getItemViewType() == 0 && (aVar = (AbstractC42474a) a) != null && !aVar.mo72621C()) {
                    aVar.mo72622D();
                    aVar.mo72623E();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x
    /* renamed from: c */
    public final void mo70483c(boolean z) {
        this.f98088l = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c
    /* renamed from: a */
    public final /* synthetic */ void mo67855a(AbstractC42474a aVar) {
        if (aVar != null) {
            mo84730bE();
        }
    }

    /* renamed from: c */
    public final void mo71265c(Exception exc) {
        if (mo84730bE()) {
            this.f98078f.mo67823i();
        }
    }

    /* renamed from: a */
    public final void mo71255a(C67678d dVar) {
        this.f98090n = dVar;
        if (this.f98078f != null) {
            this.f98078f.f97373f = dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
        if (mo84730bE()) {
            this.f98078f.notifyItemRemoved(i);
            if (i != 0) {
                this.f98078f.notifyItemChanged(i, Boolean.FALSE);
                this.f98078f.notifyItemChanged(i + 1, Boolean.FALSE);
                this.f98078f.notifyItemChanged(i + 2, Boolean.FALSE);
            }
        }
    }

    /* renamed from: a */
    public final void mo71256a(Exception exc) {
        if (mo84730bE()) {
            this.f98085i.setRefreshing(false);
            if (!this.f98088l) {
                new C79459a(this.f183419bv).mo123050a(R.string.cxf).mo123053a();
            }
        }
    }

    /* renamed from: b */
    public final void mo71262b(Exception exc) {
        if (mo84730bE()) {
            this.f98085i.setRefreshing(false);
            if (!this.f98093q) {
                this.f98076d.setVisibility(0);
                this.f98076d.mo27387h();
                return;
            }
            new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo71257a(String str) {
        if (this.f98077e != null && (this.f98077e instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.f98077e).setLabel(str);
        }
        C80330da.C80331a.m139266a(str).mo123698a(this.f98077e);
        if (this.f98078f != null && (this.f98078f instanceof AbstractC39063h)) {
            this.f98078f.f92244p = str;
        }
    }

    /* renamed from: a */
    public final void mo71259a(boolean z) {
        if (z) {
            this.f98078f.aq_();
        } else {
            this.f98078f.ap_();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a
    /* renamed from: a */
    public final void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        this.f98094r = (DoubleBallSwipeRefreshLayout) view.findViewById(R.id.dhb);
        this.f98085i = new C42072d(this.f98094r);
    }

    /* renamed from: b */
    public final void mo71263b(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            this.f98085i.setRefreshing(false);
            this.f98078f.mo62376b(list);
            mo71259a(z);
        }
    }

    /* renamed from: c */
    public final void mo71266c(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            if (z || this.f98088l) {
                this.f98078f.mo67809d(list);
                if (!this.f98088l && mo84911bW()) {
                    mo71252j();
                }
            } else if (this.f114989bu && this.f183419bv != null) {
                new C79459a(this.f183419bv).mo123050a(R.string.b3f).mo123053a();
                mo71252j();
            }
            this.f98085i.setRefreshing(false);
        }
    }

    /* renamed from: a */
    public final void mo71258a(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            this.f98076d.mo27382d();
            this.f98076d.setVisibility(8);
            this.f98085i.setRefreshing(false);
            this.f98093q = true;
            this.f98078f.mo67829d(true);
            this.f98078f.mo62377b_(list);
            mo71259a(z);
            AbstractC49764q qVar = this.f98086j;
            if (qVar != null) {
                qVar.mo71309d();
            }
        }
    }

    public C42071c(String str, AbstractC67364c cVar, AbstractC49762o oVar) {
        super(cVar, oVar);
        this.f98087k = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a
    /* renamed from: a */
    public final void mo71248a(C49672ag agVar, int i, Aweme aweme) {
        String str;
        int i2;
        super.mo71248a(agVar, i, aweme);
        View$OnAttachStateChangeListenerC41864g gVar = this.f98092p;
        if (gVar != null) {
            gVar.mo71032a(aweme.getAid());
            if (agVar.f114321g > 0) {
                AbstractC51043a aVar = this.f98091o;
                if (aVar != null) {
                    str = aVar.mo60500d();
                } else {
                    str = "";
                }
                String a = C51053b.m95442a(str, aweme.getAid());
                C51053b a2 = C51054c.C51055a.f117767a.mo86392a(a);
                if (a2 == null) {
                    a2 = new C51053b(aweme, new C80314ct(), a);
                }
                a2.f117762f = C49625h.m93072a().f114189a;
                C49625h.m93072a().f114189a = null;
                if (agVar.f114326l) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                a2.f117758b = i2;
                C51054c.C51055a.f117767a.mo86393a(a, a2);
            }
        }
    }
}
