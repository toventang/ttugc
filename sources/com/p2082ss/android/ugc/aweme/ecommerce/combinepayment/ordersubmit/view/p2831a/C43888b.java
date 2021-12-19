package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityC0580d;
import androidx.core.content.C0643b;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.common.utility.C13598c;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43861o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43862p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43864r;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b */
public final class C43888b {

    /* renamed from: a */
    public C23226a f102288a;

    /* renamed from: b */
    public final List<C43897c> f102289b = new ArrayList();

    /* renamed from: c */
    public final List<C43885a> f102290c = new ArrayList();

    /* renamed from: d */
    public String f102291d;

    /* renamed from: e */
    public int f102292e;

    /* renamed from: f */
    public boolean f102293f;

    /* renamed from: g */
    public boolean f102294g = true;

    /* renamed from: h */
    public int f102295h;

    /* renamed from: i */
    public final Context f102296i;

    /* renamed from: j */
    public final AbstractC89171a<C89391z> f102297j;

    /* renamed from: k */
    public final AbstractC89172b<C43864r, C89391z> f102298k;

    /* renamed from: l */
    public final HashMap<String, Object> f102299l;

    /* renamed from: m */
    private TuxButton f102300m;

    /* renamed from: n */
    private KeyBoardVisibilityUtil f102301n;

    /* renamed from: o */
    private final C43860n f102302o;

    static {
        Covode.recordClassIndex(52170);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$b */
    public static final class C43890b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102308a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f102309b;

        /* renamed from: c */
        final /* synthetic */ C43888b f102310c;

        static {
            Covode.recordClassIndex(52172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43890b(View view, LinearLayout linearLayout, C43888b bVar) {
            super(0);
            this.f102308a = view;
            this.f102309b = linearLayout;
            this.f102310c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f102310c.mo74813b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$c */
    public static final class C43891c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43861o f102311a;

        /* renamed from: b */
        final /* synthetic */ View f102312b;

        /* renamed from: c */
        final /* synthetic */ LinearLayout f102313c;

        /* renamed from: d */
        final /* synthetic */ C43888b f102314d;

        static {
            Covode.recordClassIndex(52173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43891c(C43861o oVar, View view, LinearLayout linearLayout, C43888b bVar) {
            super(0);
            this.f102311a = oVar;
            this.f102312b = view;
            this.f102313c = linearLayout;
            this.f102314d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str = this.f102311a.f102231b;
            if (str == null) {
                str = "";
            }
            HashMap<String, Object> hashMap = this.f102314d.f102299l;
            int i = 0;
            Boolean bool = false;
            if (this.f102314d.f102292e > 0) {
                i = 1;
            }
            C89219l.m154721d("quit_pay_reason", "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(hashMap, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C43732h.f101921a);
            linkedHashMap.put("page_name", "quit_pay_reason");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("option_name", str);
            linkedHashMap.put("is_input_content", Integer.valueOf(i));
            linkedHashMap.putAll(hashMap);
            C45544c.m88082a("tiktokec_input_result", linkedHashMap);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$g */
    public static final class C43896g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43888b f102322a;

        static {
            Covode.recordClassIndex(52178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43896g(C43888b bVar) {
            super(0);
            this.f102322a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            T t;
            String str;
            C43862p reason;
            HashMap<String, Object> hashMap = this.f102322a.f102299l;
            Iterator<T> it = this.f102322a.f102289b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.mo74816a()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null || (reason = t2.getReason()) == null || (str = reason.f102235a) == null) {
                str = "";
            }
            C43732h.m86725a("close", "return", (HashMap) hashMap, "quit_pay_reason", str, (Boolean) false, (String) null, (Boolean) null, 192);
            C43888b.m86789a(this.f102322a).dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo74813b() {
        boolean z;
        List<C43885a> list = this.f102290c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().f102280a) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        this.f102294g = z;
        if (!z || !this.f102293f) {
            int i = Build.VERSION.SDK_INT;
            TuxButton tuxButton = this.f102300m;
            if (tuxButton != null) {
                tuxButton.setBackground(C0643b.m2369a(this.f102296i, (int) R.drawable.xt));
            }
            TuxButton tuxButton2 = this.f102300m;
            if (tuxButton2 != null) {
                tuxButton2.setTextColor(C0643b.m2378c(this.f102296i, R.color.bz));
                return;
            }
            return;
        }
        TuxButton tuxButton3 = this.f102300m;
        if (tuxButton3 != null) {
            tuxButton3.setButtonVariant(0);
        }
    }

    /* renamed from: a */
    public final void mo74812a() {
        String str;
        if (this.f102302o != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap<String, Object> hashMap = this.f102299l;
            List<C43861o> list = this.f102302o.f102229c;
            AbstractC0952i iVar = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f102231b);
                }
                str = C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
            } else {
                str = null;
            }
            C43732h.m86715a(false, hashMap, "quit_pay_reason", null, str, null, null, 96);
            View a = C1764a.m5927a(LayoutInflater.from(this.f102296i), R.layout.qh, null, false);
            this.f102300m = (TuxButton) a.findViewById(R.id.ui);
            C89219l.m154716b(a, "");
            m86790a(a);
            TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
            C23194g gVar = new C23194g();
            String str2 = this.f102302o.f102227a;
            if (str2 == null) {
                str2 = this.f102296i.getResources().getString(R.string.bgg);
                C89219l.m154716b(str2, "");
            }
            TuxNavBar.C23179a a2 = aVar.mo37731a(gVar.mo37753a(str2));
            C23187b a3 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
            a3.f54930b = true;
            TuxNavBar.C23179a b = a2.mo37733b(a3.mo37741a((AbstractC89171a<C89391z>) new C43896g(this)));
            b.f54919d = true;
            this.f102288a = new C23226a.C23227a().mo37818a(b).mo37815a(new DialogInterface$OnDismissListenerC43895f(this, elapsedRealtime)).mo37816a(a).mo37812a(0).mo37819a(true).mo37822b(false).f55057a;
            Context context = this.f102296i;
            if (!(context instanceof ActivityC0580d)) {
                context = null;
            }
            ActivityC0580d dVar = (ActivityC0580d) context;
            if (dVar != null) {
                this.f102301n = new KeyBoardVisibilityUtil(dVar, 16, new C43893e(this, a));
            }
            C23226a aVar2 = this.f102288a;
            if (aVar2 == null) {
                C89219l.m154710a("dialog");
            }
            Context context2 = this.f102296i;
            if (!(context2 instanceof ActivityC0218d)) {
                context2 = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context2;
            if (eVar != null) {
                iVar = eVar.getSupportFragmentManager();
            }
            aVar2.show(iVar, "quit_reason_dialog");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$d */
    public static final class C43892d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102315a = 700;

        /* renamed from: b */
        final /* synthetic */ C43888b f102316b;

        static {
            Covode.recordClassIndex(52174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43892d(C43888b bVar) {
            super(700);
            this.f102316b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            T t;
            C43862p reason;
            String str2;
            if (view != null && this.f102316b.f102294g && this.f102316b.f102293f) {
                List<C43897c> list = this.f102316b.f102289b;
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    if (t2.mo74816a()) {
                        arrayList.add(t2);
                    }
                }
                ArrayList<C43897c> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (C43897c cVar : arrayList2) {
                    arrayList3.add(cVar.getReason());
                }
                ArrayList arrayList4 = arrayList3;
                List<C43885a> list2 = this.f102316b.f102290c;
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    DmtEditText dmtEditText = (DmtEditText) next.mo74806a(R.id.ddn);
                    C89219l.m154716b(dmtEditText, str);
                    if (!C89219l.m154714a((Object) String.valueOf(dmtEditText.getText()), (Object) str)) {
                        arrayList5.add(next);
                    }
                }
                ArrayList<C43885a> arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList(C89070n.m154526a((Iterable) arrayList6, 10));
                for (C43885a aVar : arrayList6) {
                    arrayList7.add(aVar.getReason());
                }
                C43864r rVar = new C43864r(arrayList4, arrayList7);
                AbstractC89172b<C43864r, C89391z> bVar = this.f102316b.f102298k;
                if (bVar != null) {
                    bVar.invoke(rVar);
                }
                C43888b.m86789a(this.f102316b).dismissAllowingStateLoss();
                HashMap<String, Object> hashMap = this.f102316b.f102299l;
                Iterator<T> it2 = this.f102316b.f102289b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    if (t.mo74816a()) {
                        break;
                    }
                }
                T t3 = t;
                if (!(t3 == null || (reason = t3.getReason()) == null || (str2 = reason.f102235a) == null)) {
                    str = str2;
                }
                C43732h.m86725a("submit", "return", (HashMap) hashMap, "quit_pay_reason", str, (Boolean) false, (String) null, (Boolean) null, 192);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C23226a m86789a(C43888b bVar) {
        C23226a aVar = bVar.f102288a;
        if (aVar == null) {
            C89219l.m154710a("dialog");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$f */
    public static final class DialogInterface$OnDismissListenerC43895f implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C43888b f102320a;

        /* renamed from: b */
        final /* synthetic */ long f102321b;

        static {
            Covode.recordClassIndex(52177);
        }

        DialogInterface$OnDismissListenerC43895f(C43888b bVar, long j) {
            this.f102320a = bVar;
            this.f102321b = j;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC89171a<C89391z> aVar = this.f102320a.f102297j;
            if (aVar != null) {
                aVar.invoke();
            }
            C43732h.m86733a(true, "return", (Boolean) null, (Boolean) null, this.f102320a.f102299l, Long.valueOf(SystemClock.elapsedRealtime() - this.f102321b), "quit_pay_reason", (String) null, (Boolean) false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$a */
    public static final class C43889a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102303a = 700;

        /* renamed from: b */
        final /* synthetic */ C43897c f102304b;

        /* renamed from: c */
        final /* synthetic */ View f102305c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f102306d;

        /* renamed from: e */
        final /* synthetic */ C43888b f102307e;

        static {
            Covode.recordClassIndex(52171);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            T t;
            if (view != null && !this.f102304b.mo74816a()) {
                int a = C89070n.m154546a((List) this.f102307e.f102289b, (Object) view);
                String str = this.f102304b.getReason().f102235a;
                HashMap<String, Object> hashMap = this.f102307e.f102299l;
                Boolean bool = false;
                C89219l.m154721d("quit_pay_reason", "");
                C89219l.m154721d("quit_pay_reason", "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(hashMap, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(C43732h.f101921a);
                linkedHashMap.put("page_name", "quit_pay_reason");
                if (bool != null) {
                    bool.booleanValue();
                    linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
                }
                linkedHashMap.put("option_type", "quit_pay_reason");
                linkedHashMap.put("rank", Integer.valueOf(a));
                linkedHashMap.put("option_name", str);
                linkedHashMap.putAll(hashMap);
                C45544c.m88082a("tiktokec_select_option", linkedHashMap);
                this.f102307e.f102293f = true;
                this.f102307e.mo74813b();
                Iterator<T> it = this.f102307e.f102289b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.getReason().f102235a, (Object) this.f102307e.f102291d)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setChecked(false);
                }
                this.f102304b.setChecked(true);
                this.f102307e.f102291d = this.f102304b.getReason().f102235a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43889a(C43897c cVar, View view, LinearLayout linearLayout, C43888b bVar) {
            super(700);
            this.f102304b = cVar;
            this.f102305c = view;
            this.f102306d = linearLayout;
            this.f102307e = bVar;
        }
    }

    /* renamed from: a */
    private final void m86790a(View view) {
        LinearLayout linearLayout;
        List<C43861o> list;
        String string;
        MethodCollector.m26663i(8475);
        mo74813b();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.adu);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setMaxHeight((int) (C45563h.f106107c - C13628n.m24520b(view.getContext(), 52.0f)));
        TuxButton tuxButton = this.f102300m;
        if (tuxButton != null) {
            C43860n nVar = this.f102302o;
            if (nVar == null || (string = nVar.f102228b) == null) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                string = context.getResources().getString(R.string.bgd);
            }
            tuxButton.setText(string);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.df7);
        C89219l.m154716b(nestedScrollView, "");
        nestedScrollView.setVerticalScrollBarEnabled(false);
        NestedScrollView nestedScrollView2 = (NestedScrollView) view.findViewById(R.id.df7);
        if (nestedScrollView2 != null) {
            linearLayout = (LinearLayout) nestedScrollView2.findViewById(R.id.df6);
        } else {
            linearLayout = null;
        }
        C43860n nVar2 = this.f102302o;
        if (!(nVar2 == null || (list = nVar2.f102229c) == null)) {
            for (T t : list) {
                Integer num = t.f102230a;
                if (num != null && num.intValue() == 0) {
                    Context context2 = view.getContext();
                    C89219l.m154716b(context2, "");
                    C43897c cVar = new C43897c(context2, t, (byte) 0);
                    cVar.setOnClickListener(new C43889a(cVar, view, linearLayout, this));
                    this.f102289b.add(cVar);
                    if (linearLayout != null) {
                        linearLayout.addView(cVar);
                    }
                }
                Integer num2 = t.f102230a;
                if (num2 != null && num2.intValue() == 1) {
                    Context context3 = view.getContext();
                    C89219l.m154716b(context3, "");
                    C43885a aVar = new C43885a(context3, t, new C43890b(view, linearLayout, this), new C43891c(t, view, linearLayout, this), (byte) 0);
                    this.f102290c.add(aVar);
                    if (linearLayout != null) {
                        linearLayout.addView(aVar);
                    }
                }
            }
        }
        TuxButton tuxButton2 = this.f102300m;
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new C43892d(this));
            MethodCollector.m26664o(8475);
            return;
        }
        MethodCollector.m26664o(8475);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$e */
    public static final class C43893e extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43888b f102317a;

        /* renamed from: b */
        final /* synthetic */ View f102318b;

        static {
            Covode.recordClassIndex(52175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43893e(C43888b bVar, View view) {
            super(2);
            this.f102317a = bVar;
            this.f102318b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            Window window;
            View decorView;
            Window window2;
            boolean booleanValue = bool.booleanValue();
            int intValue = num.intValue();
            Dialog dialog = C43888b.m86789a(this.f102317a).getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.setSoftInputMode(48);
            }
            if (!booleanValue) {
                Dialog dialog2 = C43888b.m86789a(this.f102317a).getDialog();
                if (!(dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                    decorView.setPadding(0, 0, 0, 0);
                }
                View view = this.f102318b;
                if (view != null) {
                    view.clearFocus();
                }
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, (C45563h.f106106b - intValue) - this.f102317a.f102295h).setDuration(200L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a.C43888b.C43893e.C438941 */

                    /* renamed from: a */
                    final /* synthetic */ C43893e f102319a;

                    static {
                        Covode.recordClassIndex(52176);
                    }

                    {
                        this.f102319a = r1;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Window window;
                        View decorView;
                        Dialog dialog = C43888b.m86789a(this.f102319a.f102317a).getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            C89219l.m154716b(valueAnimator, "");
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            decorView.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
                        }
                    }
                });
                duration.start();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.r, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43888b(Context context, C43860n nVar, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super C43864r, C89391z> bVar, HashMap<String, Object> hashMap) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        this.f102296i = context;
        this.f102302o = nVar;
        this.f102297j = aVar;
        this.f102298k = bVar;
        this.f102299l = hashMap;
        this.f102295h = C13598c.m24429b(context);
    }
}
