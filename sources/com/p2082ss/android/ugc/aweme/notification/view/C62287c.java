package com.p2082ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61850i;
import com.p2082ss.android.ugc.aweme.notification.adapter.FilterViewModel;
import com.p2082ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.c */
public final class C62287c extends PopupWindow {

    /* renamed from: a */
    public final AbstractC61850i f141380a;

    /* renamed from: b */
    private PowerList f141381b;

    /* renamed from: c */
    private View f141382c;

    /* renamed from: d */
    private FilterViewModel f141383d;

    /* renamed from: e */
    private final Context f141384e;

    static {
        Covode.recordClassIndex(73067);
    }

    /* renamed from: b */
    public final void mo100279b() {
        PowerList powerList = this.f141381b;
        if (powerList == null) {
            C89219l.m154710a("mRecyclerView");
        }
        powerList.f42167O.mo28060i();
    }

    /* renamed from: a */
    public final void mo100277a() {
        this.f141383d.mo99882a().postValue(Integer.valueOf(C61530a.C61532b.m111445a()));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.c$a */
    static final class View$OnClickListenerC62289a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62287c f141386a;

        static {
            Covode.recordClassIndex(73069);
        }

        View$OnClickListenerC62289a(C62287c cVar) {
            this.f141386a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f141386a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo100278a(List<C61631f> list) {
        C89219l.m154721d(list, "");
        PowerList powerList = this.f141381b;
        if (powerList == null) {
            C89219l.m154710a("mRecyclerView");
        }
        powerList.getState().mo28138b(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62287c(Context context, AbstractC61850i iVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f141384e = context;
        this.f141380a = iVar;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.lh, null, false);
        setContentView(a);
        View findViewById = a.findViewById(R.id.b22);
        C89219l.m154716b(findViewById, "");
        this.f141381b = (PowerList) findViewById;
        View findViewById2 = a.findViewById(R.id.sw);
        C89219l.m154716b(findViewById2, "");
        this.f141382c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(context, R.color.c9)));
        setFocusable(true);
        setAnimationStyle(R.style.a1e);
        View view = this.f141382c;
        if (view == null) {
            C89219l.m154710a("mBlankView");
        }
        view.setOnClickListener(new View$OnClickListenerC62289a(this));
        PowerList powerList = this.f141381b;
        if (powerList == null) {
            C89219l.m154710a("mRecyclerView");
        }
        powerList.mo28083a(GroupFilterViewHolder.class);
        Activity a2 = C34729o.m70950a(context);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) a2;
        AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FilterViewModel.class);
        C89219l.m154716b(a3, "");
        FilterViewModel filterViewModel = (FilterViewModel) a3;
        this.f141383d = filterViewModel;
        filterViewModel.mo99883b().observe(eVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.view.C62287c.C622881 */

            /* renamed from: a */
            final /* synthetic */ C62287c f141385a;

            static {
                Covode.recordClassIndex(73068);
            }

            {
                this.f141385a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C61631f fVar = (C61631f) obj;
                AbstractC61850i iVar = this.f141385a.f141380a;
                C89219l.m154716b(fVar, "");
                iVar.mo99818a(fVar);
            }
        });
    }
}
