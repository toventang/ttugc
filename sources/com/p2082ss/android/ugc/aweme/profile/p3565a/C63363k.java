package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63785n;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64024bj;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64039bl;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.k */
public final class C63363k extends RecyclerView.AbstractC1350a<C63365b> {

    /* renamed from: d */
    public static final C63364a f143864d = new C63364a((byte) 0);

    /* renamed from: a */
    public int f143865a = C34728n.m70946a(150.0d);

    /* renamed from: b */
    public final ArrayList<C63373m> f143866b;

    /* renamed from: c */
    final ActivityC0945e f143867c;

    static {
        Covode.recordClassIndex(74654);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C63365b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m114958a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$a */
    public static final class C63364a {
        static {
            Covode.recordClassIndex(74655);
        }

        private C63364a() {
        }

        public /* synthetic */ C63364a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$c */
    public static final class C63366c implements C64024bj.AbstractC64026b {
        static {
            Covode.recordClassIndex(74657);
        }

        C63366c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64024bj.AbstractC64026b
        /* renamed from: a */
        public final void mo102003a(String str) {
            C89219l.m154721d(str, "");
            AbstractC81915c.m141874a(new C63354d(3, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$d */
    public static final class C63367d implements C64039bl.AbstractC64041b {
        static {
            Covode.recordClassIndex(74658);
        }

        C63367d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64039bl.AbstractC64041b
        /* renamed from: a */
        public final void mo102004a(String str) {
            C89219l.m154721d(str, "");
            AbstractC81915c.m141874a(new C63354d(2, str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f143866b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$e */
    public static final class ViewTreeObserver$OnPreDrawListenerC63368e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C63363k f143873a;

        /* renamed from: b */
        final /* synthetic */ C63365b f143874b;

        static {
            Covode.recordClassIndex(74659);
        }

        public final boolean onPreDraw() {
            this.f143874b.f143872e.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = this.f143874b.f143872e.getHeight();
            if (height < this.f143873a.f143865a) {
                ViewGroup.LayoutParams layoutParams = this.f143874b.f143872e.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
                jVar.height = this.f143873a.f143865a;
                this.f143874b.f143872e.setLayoutParams(jVar);
                this.f143873a.mo102002a(this.f143874b);
                return false;
            } else if (height > this.f143873a.f143865a) {
                this.f143873a.f143865a = height;
                this.f143873a.notifyDataSetChanged();
                return false;
            } else {
                if (height == this.f143873a.f143865a) {
                    this.f143873a.mo102002a(this.f143874b);
                    this.f143874b.f143872e.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC63368e(C63363k kVar, C63365b bVar) {
            this.f143873a = kVar;
            this.f143874b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$f */
    static final class View$OnClickListenerC63369f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63363k f143875a;

        /* renamed from: b */
        final /* synthetic */ int f143876b;

        static {
            Covode.recordClassIndex(74660);
        }

        View$OnClickListenerC63369f(C63363k kVar, int i) {
            this.f143875a = kVar;
            this.f143876b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C63785n.m115347a(UGCMonitor.TYPE_PHOTO, this.f143875a.f143866b.get(this.f143876b).f143885e);
            AbstractC81915c.m141874a(new C63354d(1, ""));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$b */
    public static final class C63365b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f143868a;

        /* renamed from: b */
        public final TextView f143869b;

        /* renamed from: c */
        public final TextView f143870c;

        /* renamed from: d */
        public final TuxButton f143871d;

        /* renamed from: e */
        public final ConstraintLayout f143872e;

        static {
            Covode.recordClassIndex(74656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63365b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.bcv);
            C89219l.m154716b(findViewById, "");
            this.f143868a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.bcw);
            C89219l.m154716b(findViewById2, "");
            this.f143869b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.bcu);
            C89219l.m154716b(findViewById3, "");
            this.f143870c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.bct);
            C89219l.m154716b(findViewById4, "");
            this.f143871d = (TuxButton) findViewById4;
            View findViewById5 = view.findViewById(R.id.bcs);
            C89219l.m154716b(findViewById5, "");
            this.f143872e = (ConstraintLayout) findViewById5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$g */
    static final class View$OnClickListenerC63370g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63363k f143877a;

        /* renamed from: b */
        final /* synthetic */ int f143878b;

        static {
            Covode.recordClassIndex(74661);
        }

        View$OnClickListenerC63370g(C63363k kVar, int i) {
            this.f143877a = kVar;
            this.f143878b = i;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            C63785n.m115347a(StringSet.name, this.f143877a.f143866b.get(this.f143878b).f143885e);
            C63363k kVar = this.f143877a;
            IAccountUserService g = C31575b.m65865g();
            if (g != null) {
                user = g.getCurUser();
            } else {
                user = null;
            }
            String string = kVar.f143867c.getString(R.string.bk4);
            C89219l.m154716b(string, "");
            if (user == null || (str = user.getNickname()) == null) {
                str = "";
            }
            C64039bl a = C64039bl.C64040a.m115806a(string, str, "", 30, false);
            a.setUserVisibleHint(true);
            a.mo103607a(new C63367d());
            AbstractC0952i supportFragmentManager = kVar.f143867c.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            a.show(supportFragmentManager, "EditNicknameDialog");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.k$h */
    static final class View$OnClickListenerC63371h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63363k f143879a;

        /* renamed from: b */
        final /* synthetic */ int f143880b;

        static {
            Covode.recordClassIndex(74662);
        }

        View$OnClickListenerC63371h(C63363k kVar, int i) {
            this.f143879a = kVar;
            this.f143880b = i;
        }

        public final void onClick(View view) {
            String str;
            User curUser;
            ClickAgent.onClick(view);
            C63785n.m115347a("bio", this.f143879a.f143866b.get(this.f143880b).f143885e);
            C63363k kVar = this.f143879a;
            C89219l.m154716b(view, "");
            IAccountUserService g = C31575b.m65865g();
            if (g == null || (curUser = g.getCurUser()) == null || (str = curUser.getSignature()) == null) {
                str = "";
            }
            C64024bj a = C64024bj.C64025a.m115784a("bio", str);
            a.setUserVisibleHint(true);
            a.mo103592a(new C63366c());
            AbstractC0952i supportFragmentManager = kVar.f143867c.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            a.show(supportFragmentManager, "EditNicknameDialog");
        }
    }

    /* renamed from: a */
    public final void mo102002a(C63365b bVar) {
        int bottom = ((bVar.f143871d.getBottom() - bVar.f143870c.getBottom()) - (bVar.f143871d.getBottom() - bVar.f143871d.getTop())) + ((this.f143865a - bVar.f143871d.getBottom()) - C34728n.m70946a(16.0d));
        ViewGroup.LayoutParams layoutParams = bVar.f143871d.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        aVar.setMargins(0, bottom, 0, C34728n.m70946a(16.0d));
        bVar.f143871d.setLayoutParams(aVar);
    }

    public C63363k(ArrayList<C63373m> arrayList, ActivityC0945e eVar) {
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(eVar, "");
        this.f143866b = arrayList;
        this.f143867c = eVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m114958a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8020);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.anw, viewGroup, false);
        C89219l.m154716b(a2, "");
        C63365b bVar = new C63365b(a2);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(8020);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C63365b bVar, int i) {
        C63365b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.f143872e.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC63368e(this, bVar2));
        bVar2.f143868a.setImageResource(this.f143866b.get(i).f143881a);
        bVar2.f143869b.setText(this.f143866b.get(i).f143882b);
        bVar2.f143870c.setText(this.f143866b.get(i).f143883c);
        bVar2.f143871d.setText(this.f143866b.get(i).f143884d);
        if (this.f143866b.get(i).f143885e) {
            bVar2.f143871d.setButtonVariant(0);
        } else {
            bVar2.f143871d.setButtonVariant(1);
        }
        int i2 = this.f143866b.get(i).f143882b;
        if (i2 == R.string.cm4) {
            bVar2.f143871d.setOnClickListener(new View$OnClickListenerC63369f(this, i));
        } else if (i2 == R.string.cm0) {
            bVar2.f143871d.setOnClickListener(new View$OnClickListenerC63370g(this, i));
        } else if (i2 == R.string.clw) {
            bVar2.f143871d.setOnClickListener(new View$OnClickListenerC63371h(this, i));
        }
    }
}
