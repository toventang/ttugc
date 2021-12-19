package com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38225ak;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38226al;
import com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.C38838b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c */
public final class DialogC38841c extends AbstractDialogC38837a {

    /* renamed from: e */
    public static final C38843b f91719e = new C38843b((byte) 0);

    /* renamed from: a */
    public final List<RecyclerView> f91720a = new ArrayList();

    /* renamed from: b */
    public final List<C38838b> f91721b = new ArrayList();

    /* renamed from: c */
    public AbstractC38842a f91722c;

    /* renamed from: d */
    public final C38226al f91723d;

    /* renamed from: f */
    private final AbstractC89244h f91724f = C89250i.m154773a((AbstractC89171a) new C38851j(this));

    /* renamed from: g */
    private final AbstractC89244h f91725g = C89250i.m154773a((AbstractC89171a) new C38850i(this));

    /* renamed from: h */
    private final AbstractC89244h f91726h = C89250i.m154773a((AbstractC89171a) new C38849h(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$a */
    public interface AbstractC38842a {
        static {
            Covode.recordClassIndex(46396);
        }

        /* renamed from: a */
        void mo67445a();

        /* renamed from: a */
        void mo67446a(List<Integer> list);
    }

    static {
        Covode.recordClassIndex(46395);
    }

    /* renamed from: c */
    private final LinearLayout m78787c() {
        return (LinearLayout) this.f91724f.getValue();
    }

    /* renamed from: b */
    public final AdBottomDialogConfirmView mo9590b() {
        return (AdBottomDialogConfirmView) this.f91725g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$b */
    public static final class C38843b {
        static {
            Covode.recordClassIndex(46397);
        }

        private C38843b() {
        }

        public /* synthetic */ C38843b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$h */
    static final class C38849h extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91734a;

        static {
            Covode.recordClassIndex(46403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38849h(DialogC38841c cVar) {
            super(0);
            this.f91734a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f91734a.findViewById(R.id.a0w);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$i */
    static final class C38850i extends AbstractC89220m implements AbstractC89171a<AdBottomDialogConfirmView> {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91735a;

        static {
            Covode.recordClassIndex(46404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38850i(DialogC38841c cVar) {
            super(0);
            this.f91735a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AdBottomDialogConfirmView invoke() {
            return this.f91735a.findViewById(R.id.abv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$j */
    static final class C38851j extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91736a;

        static {
            Covode.recordClassIndex(46405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38851j(DialogC38841c cVar) {
            super(0);
            this.f91736a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f91736a.findViewById(R.id.cx3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$e */
    static final class DialogInterface$OnCancelListenerC38846e implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91731a;

        static {
            Covode.recordClassIndex(46400);
        }

        DialogInterface$OnCancelListenerC38846e(DialogC38841c cVar) {
            this.f91731a = cVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC38842a aVar = this.f91731a.f91722c;
            if (aVar != null) {
                aVar.mo67445a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$g */
    static final class View$OnClickListenerC38848g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91733a;

        static {
            Covode.recordClassIndex(46402);
        }

        View$OnClickListenerC38848g(DialogC38841c cVar) {
            this.f91733a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC38842a aVar = this.f91733a.f91722c;
            if (aVar != null) {
                aVar.mo67445a();
            }
            this.f91733a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$f */
    static final class View$OnClickListenerC38847f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91732a;

        static {
            Covode.recordClassIndex(46401);
        }

        View$OnClickListenerC38847f(DialogC38841c cVar) {
            this.f91732a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            List<C38838b> list = this.f91732a.f91721b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().f91715a));
            }
            List<Integer> j = C89070n.m154590j(arrayList);
            AbstractC38842a aVar = this.f91732a.f91722c;
            if (aVar != null) {
                aVar.mo67446a(j);
            }
            this.f91732a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$c */
    public static final class C38844c implements C38838b.AbstractC38839a {

        /* renamed from: a */
        final /* synthetic */ C38838b f91727a;

        /* renamed from: b */
        final /* synthetic */ DialogC38841c f91728b;

        /* renamed from: c */
        final /* synthetic */ int f91729c;

        static {
            Covode.recordClassIndex(46398);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.C38838b.AbstractC38839a
        /* renamed from: a */
        public final void mo67452a(int i) {
            if (this.f91729c != this.f91728b.f91721b.size() - 1 || i == -1) {
                AdBottomDialogConfirmView b = this.f91728b.mo9590b();
                if (b != null) {
                    b.setClickable(false);
                }
                int i2 = this.f91728b.f91723d.f90312b;
                for (int i3 = this.f91729c + 1; i3 < i2; i3++) {
                    C38838b bVar = this.f91728b.f91721b.get(i3);
                    bVar.f91717c.clear();
                    bVar.f91715a = -1;
                    if (i3 != this.f91729c + 1 || i == -1) {
                        this.f91728b.f91720a.get(i3).setVisibility(4);
                    } else {
                        List<C38225ak> list = bVar.f91717c;
                        Collection<? extends C38225ak> collection = this.f91727a.f91717c.get(i).f90310b;
                        if (collection == null) {
                            collection = C89086z.INSTANCE;
                        }
                        list.addAll(collection);
                        this.f91728b.f91720a.get(i3).setVisibility(0);
                    }
                    bVar.notifyDataSetChanged();
                }
                return;
            }
            AdBottomDialogConfirmView b2 = this.f91728b.mo9590b();
            if (b2 != null) {
                b2.setClickable(true);
            }
        }

        C38844c(C38838b bVar, DialogC38841c cVar, int i) {
            this.f91727a = bVar;
            this.f91728b = cVar;
            this.f91729c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$d */
    static final class DialogInterface$OnShowListenerC38845d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DialogC38841c f91730a;

        static {
            Covode.recordClassIndex(46399);
        }

        DialogInterface$OnShowListenerC38845d(DialogC38841c cVar) {
            this.f91730a = cVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            DialogC38841c cVar = this.f91730a;
            C38838b bVar = cVar.f91721b.get(0);
            bVar.f91717c.addAll(cVar.f91723d.f90313c);
            bVar.notifyDataSetChanged();
            cVar.f91720a.get(0).setVisibility(0);
            DialogC38841c cVar2 = this.f91730a;
            List<Integer> list = cVar2.f91723d.f90314d;
            if (list != null && (!list.isEmpty())) {
                int min = Math.min(list.size(), cVar2.f91721b.size());
                for (int i = 0; i < min; i++) {
                    if (list.get(i).intValue() >= 0 && list.get(i).intValue() < cVar2.f91721b.get(i).f91717c.size()) {
                        cVar2.f91721b.get(i).mo67451a(list.get(i).intValue());
                        cVar2.f91720a.get(i).mo4413b(list.get(i).intValue());
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.AbstractDialogC38837a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(4523);
        super.onCreate(bundle);
        AdBottomDialogConfirmView b = mo9590b();
        if (b != null) {
            b.setOnClickListener(new View$OnClickListenerC38847f(this));
            b.setClickable(false);
        }
        TextView textView = (TextView) this.f91726h.getValue();
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC38848g(this));
        }
        int i = this.f91723d.f90312b;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                View view = new View(getContext());
                view.setBackgroundColor(Color.parseColor("#1e000000"));
                view.setLayoutParams(new LinearLayout.LayoutParams(C34728n.m70946a(0.5d), -1));
                LinearLayout c = m78787c();
                if (c != null) {
                    c.addView(view);
                }
            }
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setVisibility(4);
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            if (this.f91723d.f90312b != 1) {
                z = false;
            }
            C38838b bVar = new C38838b(arrayList, z);
            bVar.f91716b = new C38844c(bVar, this, i2);
            recyclerView.setAdapter(bVar);
            LinearLayout c2 = m78787c();
            if (c2 != null) {
                c2.addView(recyclerView);
            }
            this.f91720a.add(recyclerView);
            this.f91721b.add(bVar);
        }
        setOnShowListener(new DialogInterface$OnShowListenerC38845d(this));
        setOnCancelListener(new DialogInterface$OnCancelListenerC38846e(this));
        MethodCollector.m26664o(4523);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC38841c(Context context, C38226al alVar) {
        super(context);
        C89219l.m154721d(alVar, "");
        this.f91723d = alVar;
    }
}
