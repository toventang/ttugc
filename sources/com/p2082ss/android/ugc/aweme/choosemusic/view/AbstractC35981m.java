package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35958ab;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.m */
public abstract class AbstractC35981m<T> implements AbstractC33936c<T> {

    /* renamed from: a */
    public NormalTitleBar f84950a;

    /* renamed from: b */
    public RecyclerView f84951b;

    /* renamed from: c */
    public TuxStatusView f84952c;

    /* renamed from: d */
    public LinearLayout f84953d;

    /* renamed from: e */
    protected Context f84954e;

    /* renamed from: f */
    protected AbstractC39060f f84955f;

    /* renamed from: g */
    protected AbstractC35826a f84956g;

    /* renamed from: h */
    AbstractC60731k<C35757c> f84957h;

    /* renamed from: i */
    protected int f84958i;

    /* renamed from: j */
    public boolean f84959j;

    /* renamed from: k */
    public TuxStatusView.C23263c f84960k;

    /* renamed from: l */
    protected boolean f84961l;

    /* renamed from: m */
    private AbstractC39063h.AbstractC39067a f84962m;

    /* renamed from: n */
    private int f84963n;

    /* renamed from: o */
    private int f84964o;

    static {
        Covode.recordClassIndex(43227);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC39060f mo63133d();

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: c */
    public final AbstractC39060f mo60179c() {
        return this.f84955f;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public final void mo60175a() {
        AbstractC39060f fVar = this.f84955f;
        if (fVar != null) {
            fVar.ao_();
        }
    }

    /* renamed from: h */
    private void m73380h() {
        m73381i();
        if (this.f84964o == 1) {
            mo63136f();
        }
        m73382j();
    }

    /* renamed from: f */
    public final void mo63136f() {
        TuxStatusView tuxStatusView = this.f84952c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f84952c.mo37867a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ C89391z mo63137g() {
        mo63136f();
        AbstractC35826a aVar = this.f84956g;
        if (aVar == null) {
            return null;
        }
        aVar.mo62850u();
        return null;
    }

    /* renamed from: i */
    private void m73381i() {
        this.f84950a.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m.C359821 */

            static {
                Covode.recordClassIndex(43228);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                if (AbstractC35981m.this.f84956g != null) {
                    AbstractC35981m.this.f84956g.mo62851v();
                }
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                if (AbstractC35981m.this.f84956g != null) {
                    AbstractC35981m.this.f84956g.mo62849t();
                }
            }
        });
        this.f84950a.setColorMode(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: b */
    public final void mo60177b() {
        TuxStatusView tuxStatusView = this.f84952c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f84952c.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C35983n(this)));
        }
        AbstractC39060f fVar = this.f84955f;
        if (fVar != null) {
            fVar.mo62377b_(null);
        }
    }

    /* renamed from: j */
    private void m73382j() {
        AbstractC39060f d = mo63133d();
        this.f84955f = d;
        d.mo67820g(this.f84951b.getResources().getColor(R.color.c5));
        this.f84955f.mo67813a(this.f84962m);
        this.f84951b.setAdapter(this.f84955f);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        wrapLinearLayoutManager.f4342r = C68027bm.m120329a();
        this.f84951b.setLayoutManager(wrapLinearLayoutManager);
        this.f84951b.setRecycledViewPool(MusicRecyclerViewPoolViewModel.C36027a.m73455a(this.f84954e));
    }

    /* renamed from: e */
    public void mo63134e() {
        if (this.f84955f.f92274v) {
            this.f84955f.mo67829d(false);
            this.f84955f.mo62377b_(null);
            this.f84955f.ap_();
        }
        RecyclerView recyclerView = this.f84951b;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        TuxStatusView tuxStatusView = this.f84952c;
        if (tuxStatusView != null) {
            TuxStatusView.C23263c cVar = this.f84960k;
            if (cVar != null) {
                tuxStatusView.setStatus(cVar);
                this.f84952c.setVisibility(0);
            } else if (this.f84963n != 0) {
                String string = tuxStatusView.getContext().getString(this.f84963n);
                C22999a aVar = new C22999a();
                aVar.f54431a = R.raw.icon_large_error_robot;
                aVar.f54435e = Integer.valueOf((int) R.attr.bd);
                this.f84952c.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(this.f84954e.getString(R.string.aiq)).mo37878a((CharSequence) string));
                this.f84952c.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo63135a(C35958ab.AbstractC35959a aVar) {
        new C35958ab(aVar, 10).mo63094a(this.f84951b);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: b */
    public final void mo60178b(List<T> list, boolean z) {
        AbstractC39060f fVar = this.f84955f;
        if (fVar != null) {
            this.f84959j = z;
            if (!z) {
                C35699a.m72866a(fVar);
            } else {
                fVar.aq_();
            }
            if (!C13603b.m24435a((Collection) list)) {
                this.f84955f.mo62376b(list);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public void mo60176a(List<T> list, boolean z) {
        TuxStatusView tuxStatusView = this.f84952c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        if (this.f84955f != null) {
            if (C13603b.m24435a((Collection) list)) {
                mo63134e();
                return;
            }
            this.f84955f.mo67829d(true);
            this.f84959j = z;
            if (!z) {
                C35699a.m72866a(this.f84955f);
            } else {
                this.f84955f.aq_();
            }
            this.f84955f.mo62377b_(list);
            RecyclerView recyclerView = this.f84951b;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
        }
    }

    AbstractC35981m(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, int i) {
        this.f84964o = 1;
        this.f84961l = true;
        m73379a(context, view, aVar, R.string.dg4, aVar2, null, i);
    }

    AbstractC35981m(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i) {
        this.f84964o = 1;
        this.f84964o = 0;
        m73379a(context, view, aVar, R.string.db2, aVar2, kVar, i);
    }

    AbstractC35981m(Context context, View view, AbstractC35826a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i2) {
        this.f84964o = 1;
        m73379a(context, view, aVar, i, aVar2, kVar, i2);
    }

    /* renamed from: a */
    private void m73379a(Context context, View view, AbstractC35826a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i2) {
        this.f84950a = (NormalTitleBar) view.findViewById(R.id.eiz);
        this.f84951b = (RecyclerView) view.findViewById(R.id.cnt);
        this.f84952c = (TuxStatusView) view.findViewById(R.id.coc);
        this.f84953d = (LinearLayout) view.findViewById(R.id.cnu);
        this.f84954e = context;
        this.f84956g = aVar;
        this.f84962m = aVar2;
        this.f84957h = kVar;
        this.f84963n = i;
        this.f84958i = i2;
        m73380h();
    }
}
