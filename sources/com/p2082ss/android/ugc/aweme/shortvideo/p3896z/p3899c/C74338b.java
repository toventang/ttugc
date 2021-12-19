package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.b */
public final class C74338b {

    /* renamed from: a */
    final DmtStatusView f167174a;

    /* renamed from: b */
    final ActivityC0945e f167175b;

    /* renamed from: c */
    final AbstractC1204m f167176c;

    /* renamed from: d */
    final C74363a f167177d;

    /* renamed from: e */
    private final RecyclerView f167178e;

    /* renamed from: f */
    private final View f167179f;

    /* renamed from: g */
    private final View f167180g;

    static {
        Covode.recordClassIndex(87110);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.b$a */
    static final class C74339a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74338b f167181a;

        static {
            Covode.recordClassIndex(87111);
        }

        C74339a(C74338b bVar) {
            this.f167181a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                if (list.isEmpty()) {
                    this.f167181a.mo116962a(false, false);
                } else {
                    this.f167181a.mo116962a(true, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.b$b */
    static final class C74340b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74338b f167182a;

        static {
            Covode.recordClassIndex(87112);
        }

        C74340b(C74338b bVar) {
            this.f167182a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                if (list.isEmpty()) {
                    this.f167182a.mo116962a(false, true);
                } else {
                    this.f167182a.mo116962a(true, true);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: com.bytedance.ies.dmt.ui.widget.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo116962a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        TuxStatusView tuxStatusView;
        RecyclerView recyclerView = this.f167178e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        View view = this.f167179f;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = this.f167180g;
        if (z || z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        if (z) {
            this.f167174a.setVisibility(8);
            return;
        }
        if (z2) {
            C17273d dVar = new C17273d.C17274a(this.f167175b).mo27462b(R.string.gzz).mo27464c(R.string.h00).mo27457a(2131232925).f41365a;
            C17275e eVar = new C17275e(this.f167175b);
            eVar.setStatus(dVar);
            tuxStatusView = eVar;
        } else {
            TuxStatusView tuxStatusView2 = new TuxStatusView(this.f167175b, null, 0, 6);
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37876a(0, 2131230976);
            String string = this.f167175b.getResources().getString(R.string.frq);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a2 = a.mo37879a(string);
            String string2 = this.f167175b.getResources().getString(R.string.frr);
            C89219l.m154716b(string2, "");
            TuxStatusView.C23263c a3 = a2.mo37878a((CharSequence) string2);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            tuxStatusView2.setStatus(a3.mo37880b(a4, C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics()))));
            tuxStatusView = tuxStatusView2;
        }
        this.f167174a.setBuilder(new DmtStatusView.C17269a(this.f167175b).mo27406b(tuxStatusView));
        this.f167174a.mo27382d();
        this.f167174a.mo27385g();
        this.f167174a.setVisibility(0);
    }

    public C74338b(DmtStatusView dmtStatusView, RecyclerView recyclerView, View view, View view2, ActivityC0945e eVar, AbstractC1204m mVar, C74363a aVar) {
        C89219l.m154721d(dmtStatusView, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        this.f167174a = dmtStatusView;
        this.f167178e = recyclerView;
        this.f167179f = view;
        this.f167180g = view2;
        this.f167175b = eVar;
        this.f167176c = mVar;
        this.f167177d = aVar;
    }
}
