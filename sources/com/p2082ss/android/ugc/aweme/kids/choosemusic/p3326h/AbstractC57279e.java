package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57293q;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.e */
public abstract class AbstractC57279e<T> implements AbstractC33936c<T> {

    /* renamed from: a */
    public TextTitleBar f130484a;

    /* renamed from: b */
    public RecyclerView f130485b;

    /* renamed from: c */
    public TuxStatusView f130486c;

    /* renamed from: d */
    public LinearLayout f130487d;

    /* renamed from: e */
    protected AbstractC39060f f130488e;

    /* renamed from: f */
    protected AbstractC57233a f130489f;

    /* renamed from: g */
    AbstractC57080c<C57192b> f130490g;

    /* renamed from: h */
    protected int f130491h;

    /* renamed from: i */
    public boolean f130492i;

    /* renamed from: j */
    private Context f130493j;

    /* renamed from: k */
    private AbstractC39063h.AbstractC39067a f130494k;

    /* renamed from: l */
    private int f130495l;

    /* renamed from: m */
    private int f130496m;

    static {
        Covode.recordClassIndex(67184);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC39060f mo94481d();

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: c */
    public final AbstractC39060f mo60179c() {
        return this.f130488e;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public final void mo60175a() {
        AbstractC39060f fVar = this.f130488e;
        if (fVar != null) {
            fVar.ao_();
        }
    }

    /* renamed from: g */
    private void m103845g() {
        m103846h();
        if (this.f130496m == 1) {
            m103848j();
        }
        m103847i();
    }

    /* renamed from: j */
    private void m103848j() {
        TuxStatusView tuxStatusView = this.f130486c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f130486c.mo37867a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ C89391z mo94484f() {
        m103848j();
        AbstractC57233a aVar = this.f130489f;
        if (aVar == null) {
            return null;
        }
        aVar.mo94445q();
        return null;
    }

    /* renamed from: h */
    private void m103846h() {
        this.f130484a.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e.C572801 */

            static {
                Covode.recordClassIndex(67185);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                if (AbstractC57279e.this.f130489f != null) {
                    AbstractC57279e.this.f130489f.mo94446r();
                }
            }
        });
        this.f130484a.setColorMode(0);
    }

    /* renamed from: i */
    private void m103847i() {
        AbstractC39060f d = mo94481d();
        this.f130488e = d;
        d.mo67820g(this.f130485b.getResources().getColor(R.color.c5));
        this.f130488e.mo67813a(this.f130494k);
        this.f130485b.setAdapter(this.f130488e);
        this.f130485b.setLayoutManager(new WrapLinearLayoutManager(1));
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: b */
    public final void mo60177b() {
        TuxStatusView tuxStatusView = this.f130486c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f130486c.setStatus(C79440a.m138171b(new TuxStatusView.C23263c(), new C57281f(this)));
        }
        AbstractC39060f fVar = this.f130488e;
        if (fVar != null) {
            fVar.mo62377b_(null);
        }
    }

    /* renamed from: e */
    public void mo94482e() {
        if (this.f130488e.f92274v) {
            this.f130488e.mo67829d(false);
            this.f130488e.mo62377b_(null);
            this.f130488e.ap_();
        }
        TuxStatusView tuxStatusView = this.f130486c;
        if (tuxStatusView != null && this.f130495l != 0) {
            this.f130486c.setStatus(new TuxStatusView.C23263c().mo37878a((CharSequence) tuxStatusView.getContext().getString(this.f130495l)));
            this.f130486c.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo94483a(C57293q.AbstractC57294a aVar) {
        new C57293q(aVar, 10).mo94496a(this.f130485b);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: b */
    public final void mo60178b(List<T> list, boolean z) {
        AbstractC39060f fVar = this.f130488e;
        if (fVar != null) {
            this.f130492i = z;
            if (!z) {
                fVar.mo67829d(false);
            } else {
                fVar.aq_();
            }
            if (!C13603b.m24435a((Collection) list)) {
                this.f130488e.mo62376b(list);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public void mo60176a(List<T> list, boolean z) {
        TuxStatusView tuxStatusView = this.f130486c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        if (this.f130488e != null) {
            if (C13603b.m24435a((Collection) list)) {
                mo94482e();
                return;
            }
            this.f130488e.mo67829d(true);
            this.f130492i = z;
            if (!z) {
                this.f130488e.mo67829d(false);
            } else {
                this.f130488e.aq_();
            }
            this.f130488e.mo62377b_(list);
        }
    }

    AbstractC57279e(Context context, View view, AbstractC57233a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i) {
        this.f130496m = 1;
        this.f130496m = 0;
        m103844a(context, view, aVar, R.string.cm7, aVar2, cVar, i);
    }

    AbstractC57279e(Context context, View view, AbstractC57233a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i2) {
        this.f130496m = 1;
        m103844a(context, view, aVar, i, aVar2, cVar, i2);
    }

    /* renamed from: a */
    private void m103844a(Context context, View view, AbstractC57233a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i2) {
        this.f130484a = (TextTitleBar) view.findViewById(R.id.eiz);
        this.f130485b = (RecyclerView) view.findViewById(R.id.cnt);
        this.f130486c = (TuxStatusView) view.findViewById(R.id.coc);
        this.f130487d = (LinearLayout) view.findViewById(R.id.cnu);
        this.f130493j = context;
        this.f130489f = aVar;
        this.f130494k = aVar2;
        this.f130490g = cVar;
        this.f130495l = i;
        this.f130491h = i2;
        m103845g();
    }
}
