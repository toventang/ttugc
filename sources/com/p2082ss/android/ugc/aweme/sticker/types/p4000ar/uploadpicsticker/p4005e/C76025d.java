package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C75990a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4001a.C75991a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C75998a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d */
public final class C76025d {

    /* renamed from: j */
    public static final C76029b f170809j = new C76029b((byte) 0);

    /* renamed from: a */
    public C75990a f170810a;

    /* renamed from: b */
    public final View f170811b;

    /* renamed from: c */
    public final View f170812c;

    /* renamed from: d */
    public final C75991a f170813d;

    /* renamed from: e */
    public DialogC76024c f170814e;

    /* renamed from: f */
    public boolean f170815f;

    /* renamed from: g */
    public boolean f170816g;

    /* renamed from: h */
    public final Activity f170817h;

    /* renamed from: i */
    public final AbstractC84430d f170818i;

    /* renamed from: k */
    private final RecyclerView f170819k;

    /* renamed from: l */
    private final View f170820l;

    /* renamed from: m */
    private final View f170821m;

    /* renamed from: n */
    private final boolean f170822n;

    /* renamed from: o */
    private final View f170823o;

    /* renamed from: p */
    private final View f170824p;

    /* renamed from: q */
    private final View f170825q;

    /* renamed from: r */
    private final ViewGroup f170826r;

    static {
        Covode.recordClassIndex(88969);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$b */
    public static final class C76029b {
        static {
            Covode.recordClassIndex(88973);
        }

        private C76029b() {
        }

        public /* synthetic */ C76029b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final List<C75938j> mo119723a() {
        return this.f170813d.mo119688b();
    }

    /* renamed from: g */
    public final void mo119733g() {
        this.f170819k.mo4413b(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$d */
    public static final class RunnableC76031d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76025d f170834a;

        static {
            Covode.recordClassIndex(88975);
        }

        RunnableC76031d(C76025d dVar) {
            this.f170834a = dVar;
        }

        public final void run() {
            this.f170834a.mo119735i();
            this.f170834a.f170816g = false;
        }
    }

    /* renamed from: d */
    public final void mo119730d() {
        this.f170813d.f170729f = true;
        this.f170813d.notifyDataSetChanged();
    }

    /* renamed from: e */
    public final void mo119731e() {
        this.f170813d.mo119692f();
        this.f170813d.notifyDataSetChanged();
    }

    /* renamed from: f */
    public final void mo119732f() {
        this.f170815f = true;
        this.f170814e.dismiss();
    }

    /* renamed from: h */
    public final boolean mo119734h() {
        if (!this.f170817h.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final View mo119736j() {
        if (this.f170822n) {
            return this.f170823o;
        }
        return this.f170821m;
    }

    /* renamed from: b */
    public final void mo119728b() {
        this.f170811b.setVisibility(8);
        if (this.f170822n) {
            m133307k();
            return;
        }
        View view = this.f170821m;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo119729c() {
        this.f170813d.mo119691e();
        C75991a aVar = this.f170813d;
        aVar.notifyItemRemoved(aVar.getItemCount());
        if (this.f170816g) {
            this.f170819k.post(new RunnableC76031d(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$e */
    public static final class RunnableC76032e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76025d f170835a;

        static {
            Covode.recordClassIndex(88976);
        }

        public RunnableC76032e(C76025d dVar) {
            this.f170835a = dVar;
        }

        public final void run() {
            if (!this.f170835a.f170817h.isFinishing() && this.f170835a.f170815f) {
                try {
                    this.f170835a.f170814e.show();
                    this.f170835a.f170815f = false;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m133307k() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f170824p;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f170823o;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f170825q;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.f170811b.setBackgroundResource(R.drawable.h7);
        ViewGroup viewGroup = this.f170826r;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = 0;
        }
        ViewGroup viewGroup2 = this.f170826r;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(marginLayoutParams2);
        }
        this.f170816g = false;
    }

    /* renamed from: i */
    public final void mo119735i() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f170824p;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f170823o;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f170825q;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        this.f170811b.setBackgroundResource(R.drawable.h8);
        ViewGroup viewGroup = this.f170826r;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = (int) C84912r.m145930a(this.f170817h, 50.0f);
        }
        ViewGroup viewGroup2 = this.f170826r;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(marginLayoutParams2);
        }
    }

    /* renamed from: a */
    public final void mo119725a(C75998a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170813d.mo119685a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$a */
    public static final class View$OnClickListenerC76028a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f170830a;

        /* renamed from: b */
        final /* synthetic */ C76025d f170831b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76019c f170832c;

        static {
            Covode.recordClassIndex(88972);
        }

        View$OnClickListenerC76028a(View view, C76025d dVar, AbstractC76019c cVar) {
            this.f170830a = view;
            this.f170831b = dVar;
            this.f170832c = cVar;
        }

        public final void onClick(View view) {
            String str;
            AbstractC76019c cVar;
            ClickAgent.onClick(view);
            if (this.f170830a.getAlpha() == 1.0f && (cVar = this.f170832c) != null) {
                cVar.mo119578a(this.f170831b.f170813d.mo119688b());
            }
            List g = C89070n.m154585g((Collection) this.f170831b.f170813d.f170728e.keySet());
            ArrayList arrayList = new ArrayList();
            for (Object obj : g) {
                if (((C75998a) obj).f170748i == 2) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                str = UGCMonitor.TYPE_PHOTO;
            } else {
                str = "video";
            }
            if (!g.isEmpty()) {
                g.get(0);
            }
            AbstractC84430d dVar = this.f170831b.f170818i;
            if (dVar != null) {
                this.f170831b.mo119723a().size();
                dVar.mo118964a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo119726a(String str) {
        this.f170813d.mo119686a(str);
    }

    /* renamed from: a */
    public final void mo119727a(List<C75998a> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            this.f170813d.mo119687a(list);
        }
    }

    /* renamed from: a */
    private final void m133306a(String str, boolean z) {
        int i;
        AbstractC84430d dVar;
        if (UploadPicStickerARPresenter.f170658v && (dVar = this.f170818i) != null) {
            dVar.mo118968a(str, z);
        }
        View view = this.f170812c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo119724a(C75990a aVar, String str) {
        float f;
        this.f170810a = aVar;
        this.f170813d.f170725b = aVar;
        boolean z = false;
        this.f170811b.setVisibility(0);
        if (aVar == null || !aVar.f170719c) {
            if (this.f170822n) {
                m133307k();
            } else {
                View view = this.f170821m;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (aVar == null) {
                return;
            }
        } else {
            if (this.f170822n) {
                if (this.f170816g) {
                    mo119735i();
                } else {
                    z = true;
                }
                this.f170816g = z;
            } else {
                View view2 = this.f170821m;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            View j = mo119736j();
            if (j != null) {
                if (this.f170813d.mo119689c() >= aVar.f170720d) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                j.setAlpha(f);
            }
        }
        Boolean bool = aVar.f170722f;
        if (bool != null) {
            m133306a(str, bool.booleanValue());
        }
    }

    public /* synthetic */ C76025d(ViewStubCompat viewStubCompat, Activity activity, AbstractC76019c cVar) {
        this(viewStubCompat, null, false, null, null, null, null, activity, null, cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m133305a(C76025d dVar, C75990a aVar, int i) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        dVar.mo119724a(aVar, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$c */
    public static final class C76030c extends AbstractC89220m implements AbstractC89187q<Integer, Boolean, C75998a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76025d f170833a;

        static {
            Covode.recordClassIndex(88974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76030c(C76025d dVar) {
            super(3);
            this.f170833a = dVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Boolean bool, C75998a aVar) {
            int i;
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            C75998a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            View j = this.f170833a.mo119736j();
            if (j != null) {
                C75990a aVar3 = this.f170833a.f170810a;
                if (aVar3 != null) {
                    i = aVar3.f170720d;
                } else {
                    i = 0;
                }
                if (intValue >= i) {
                    j.setAlpha(1.0f);
                } else {
                    j.setAlpha(0.4f);
                }
                AbstractC84430d dVar = this.f170833a.f170818i;
                if (dVar != null) {
                    dVar.mo118967a(aVar2.f170740a, aVar2.f170745f, "media_tray");
                }
            }
            if (booleanValue) {
                Activity activity = this.f170833a.f170817h;
                String string = this.f170833a.f170817h.getString(R.string.b1l);
                C89219l.m154716b(string, "");
                String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1));
                C89219l.m154716b(a, "");
                C85052j.C85053a.m146248b(activity, a, 0).mo129996a();
            }
            return C89391z.f203057a;
        }
    }

    public C76025d(ViewStubCompat viewStubCompat, View view, boolean z, View view2, View view3, View view4, ViewGroup viewGroup, Activity activity, AbstractC84430d dVar, final AbstractC76019c cVar) {
        C89219l.m154721d(viewStubCompat, "");
        C89219l.m154721d(activity, "");
        this.f170821m = view;
        this.f170822n = z;
        this.f170823o = view2;
        this.f170824p = view3;
        this.f170825q = view4;
        this.f170826r = viewGroup;
        this.f170817h = activity;
        this.f170818i = dVar;
        View a = viewStubCompat.mo1691a();
        C89219l.m154716b(a, "");
        this.f170811b = a;
        View findViewById = a.findViewById(R.id.c61);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f170819k = recyclerView;
        C75991a aVar = new C75991a(activity, cVar, new C76030c(this));
        this.f170813d = aVar;
        this.f170814e = new DialogC76024c(activity);
        this.f170815f = true;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC1391ab) itemAnimator).f4621m = false;
        View findViewById2 = a.findViewById(R.id.bzk);
        C89219l.m154716b(findViewById2, "");
        this.f170820l = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76025d.View$OnClickListenerC760261 */

            static {
                Covode.recordClassIndex(88970);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC76019c cVar = cVar;
                if (cVar != null) {
                    cVar.mo119579b();
                }
            }
        });
        View findViewById3 = a.findViewById(R.id.bvx);
        C89219l.m154716b(findViewById3, "");
        this.f170812c = findViewById3;
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76025d.View$OnClickListenerC760272 */

            /* renamed from: a */
            final /* synthetic */ C76025d f170828a;

            static {
                Covode.recordClassIndex(88971);
            }

            {
                this.f170828a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC84430d dVar = this.f170828a.f170818i;
                if (dVar != null) {
                    dVar.mo118966a("giphy", "video_shoot_page");
                }
                AbstractC76019c cVar = cVar;
                if (cVar != null) {
                    cVar.mo119580c();
                }
            }
        });
        a.setVisibility(8);
        ((ImageView) a.findViewById(R.id.dua)).setColorFilter(-1);
        View j = mo119736j();
        if (j != null) {
            if (z) {
                m133307k();
            }
            j.setVisibility(8);
            j.setOnClickListener(new View$OnClickListenerC76028a(j, this, cVar));
        }
    }
}
