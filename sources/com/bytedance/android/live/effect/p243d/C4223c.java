package com.bytedance.android.live.effect.p243d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.effect.C4142a;
import com.bytedance.android.live.effect.C4175b;
import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.C4302j;
import com.bytedance.android.live.effect.C4307m;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4156i;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.live.effect.p241b.C4187e;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.live.effect.p244e.C4251c;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9082cu;
import com.bytedance.android.livesdk.p561j.C9110dv;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d.c */
public final class C4223c extends AbstractC11293v {

    /* renamed from: g */
    public static final C4224a f11710g = new C4224a((byte) 0);

    /* renamed from: a */
    public C4219a f11711a;

    /* renamed from: b */
    public C4238g f11712b;

    /* renamed from: c */
    public C4236e f11713c;

    /* renamed from: d */
    public String f11714d;

    /* renamed from: e */
    public C4222b f11715e;

    /* renamed from: f */
    public C4312b f11716f;

    /* renamed from: h */
    private final C11221ak.EnumC11222a f11717h = C11221ak.EnumC11222a.PANEL_BEAUTY_FILTER;

    /* renamed from: i */
    private HashMap f11718i;

    static {
        Covode.recordClassIndex(4793);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f11718i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f11718i == null) {
            this.f11718i = new HashMap();
        }
        View view = (View) this.f11718i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f11718i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$a */
    public static final class C4224a {
        static {
            Covode.recordClassIndex(4794);
        }

        private C4224a() {
        }

        public /* synthetic */ C4224a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f11717h;
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$f */
    static final class C4229f implements StateLayout.AbstractC4030a {

        /* renamed from: a */
        final /* synthetic */ C4223c f11723a;

        static {
            Covode.recordClassIndex(4799);
        }

        C4229f(C4223c cVar) {
            this.f11723a = cVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.AbstractC4030a
        /* renamed from: a */
        public final void mo9424a() {
            this.f11723a.mo9929d();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6e);
        bVar.f27015b = R.style.a36;
        bVar.f27020g = 80;
        bVar.f27022i = -1;
        bVar.f27025l = 3;
        return bVar;
    }

    /* renamed from: d */
    public final void mo9929d() {
        ((StateLayout) mo8166a_(R.id.at8)).mo9406a("LOADING");
        C4208j.C4212b.f11691a.mo9920a(this.f27010p);
        C4284g.m10389a(this.f27010p);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 21) {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.addFlags(Integer.MIN_VALUE);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                window.setStatusBarColor(0);
            }
        }
    }

    /* renamed from: e */
    public final void mo9930e() {
        ImageView imageView = (ImageView) mo8166a_(R.id.dj4);
        C89219l.m154716b(imageView, "");
        List<C11672a> b = C4180c.C4181a.m10258a().mo9847b(C4147a.f11586d);
        C89219l.m154716b(b, "");
        ArrayList arrayList = new ArrayList();
        for (T t : b) {
            if (C89219l.m154714a((Object) t.f27886B, (Object) this.f11714d)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        boolean z = true;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11672a aVar = (C11672a) it.next();
                if (!aVar.f27888D) {
                    if (C4180c.C4181a.m10258a().mo9862a(aVar)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            imageView.setEnabled(z);
        }
        z = false;
        imageView.setEnabled(z);
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$b */
    public static final class C4225b extends AdjustPercentBar.C11339c {

        /* renamed from: a */
        final /* synthetic */ C4223c f11719a;

        static {
            Covode.recordClassIndex(4795);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4225b(C4223c cVar) {
            this.f11719a = cVar;
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b, com.bytedance.android.livesdk.widget.AdjustPercentBar.C11339c
        /* renamed from: a */
        public final void mo9931a(int i) {
            String str;
            if (C89219l.m154714a((Object) this.f11719a.f11714d, (Object) C4147a.f11588f)) {
                FilterModel filterModel = C4223c.m10328a(this.f11719a).f11702b;
                if (filterModel != null) {
                    float a = C4187e.m10262a(filterModel.filterConfig.f11842a, filterModel.filterConfig.f11843b, i);
                    C4208j jVar = C4208j.C4212b.f11691a;
                    Float valueOf = Float.valueOf(a);
                    jVar.f11681c.put(filterModel.getFilterId(), Double.valueOf(valueOf.doubleValue()));
                    for (AbstractC4170f.AbstractC4171a aVar : jVar.f11682d) {
                        aVar.mo8671a(filterModel, valueOf.floatValue());
                    }
                    return;
                }
                return;
            }
            C4238g b = C4223c.m10329b(this.f11719a);
            C11672a aVar2 = b.f11734c;
            if (aVar2 != null) {
                AbstractC4156i iVar = b.f11740i;
                String str2 = C4147a.f11586d;
                String str3 = "";
                C89219l.m154716b(str2, str3);
                C11672a.C11674b a2 = aVar2.mo18439a();
                if (!(a2 == null || (str = a2.f27921c) == null)) {
                    str3 = str;
                }
                iVar.mo9860a(str2, aVar2, str3, C4187e.m10264a(aVar2, i));
            }
            this.f11719a.mo9930e();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$c */
    static final class View$OnClickListenerC4226c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4223c f11720a;

        static {
            Covode.recordClassIndex(4796);
        }

        View$OnClickListenerC4226c(C4223c cVar) {
            this.f11720a = cVar;
        }

        public final void onClick(View view) {
            this.f11720a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$d */
    public static final class C4227d extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C4223c f11721a;

        static {
            Covode.recordClassIndex(4797);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4227d(C4223c cVar) {
            this.f11721a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            CharSequence charSequence;
            T t;
            List<T> list;
            C4223c cVar = this.f11721a;
            C4222b bVar = cVar.f11715e;
            C11672a aVar = null;
            if (bVar != null) {
                charSequence = bVar.getPageTitle(i);
            } else {
                charSequence = null;
            }
            cVar.f11714d = String.valueOf(charSequence);
            if (C89219l.m154714a((Object) this.f11721a.f11714d, (Object) C4147a.f11588f)) {
                C4219a a = C4223c.m10328a(this.f11721a);
                a.mo9926a(a.f11702b);
                C11279p.m20006a(this.f11721a.mo8166a_(R.id.dj4));
            } else {
                C4238g b = C4223c.m10329b(this.f11721a);
                String str = this.f11721a.f11714d;
                b.f11733b = str;
                C11672a aVar2 = b.f11735d.get(str);
                if (aVar2 == null) {
                    Iterator<T> it = b.f11737f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C89219l.m154714a((Object) t.f11861a, (Object) b.f11733b)) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (!(t2 == null || (list = t2.f11862b) == null)) {
                        aVar = (C11672a) C89070n.m154561b((List) list, C4278b.m10377a(b.f11733b, list));
                    }
                } else {
                    aVar = aVar2;
                }
                b.mo9942b(aVar);
                b.mo9940a(b.f11734c);
                C11279p.m20017b(this.f11721a.mo8166a_(R.id.dj4));
            }
            this.f11721a.mo9930e();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$j */
    static final class C4233j extends AbstractC89220m implements AbstractC89172b<C11672a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4223c f11727a;

        static {
            Covode.recordClassIndex(4803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4233j(C4223c cVar) {
            super(1);
            this.f11727a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C11672a aVar) {
            C89219l.m154721d(aVar, "");
            this.f11727a.mo9930e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C4219a m10328a(C4223c cVar) {
        C4219a aVar = cVar.f11711a;
        if (aVar == null) {
            C89219l.m154710a("filterHandler");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C4238g m10329b(C4223c cVar) {
        C4238g gVar = cVar.f11712b;
        if (gVar == null) {
            C89219l.m154710a("smallItemBeautyHandler");
        }
        return gVar;
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$e */
    static final class View$OnClickListenerC4228e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4223c f11722a;

        static {
            Covode.recordClassIndex(4798);
        }

        View$OnClickListenerC4228e(C4223c cVar) {
            this.f11722a = cVar;
        }

        public final void onClick(View view) {
            C4223c cVar = this.f11722a;
            new DialogC9148b.C9149a(cVar.getContext()).mo15244a(R.string.dvn, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC4230g(cVar), false).mo15249b(R.string.dvm, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC4231h.f11725a, false).mo15243a(R.string.dvk).mo15248b(R.string.dvl).mo15247a().show();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$k */
    static final class C4234k extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4223c f11728a;

        static {
            Covode.recordClassIndex(4804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4234k(C4223c cVar) {
            super(1);
            this.f11728a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            C11279p.m20006a(this.f11728a.mo8166a_(R.id.e37));
            ((StateLayout) this.f11728a.mo8166a_(R.id.at8)).mo9406a("ERROR");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$i */
    static final class C4232i extends AbstractC89220m implements AbstractC89172b<List<? extends C4315e<C11672a>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4223c f11726a;

        static {
            Covode.recordClassIndex(4802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4232i(C4223c cVar) {
            super(1);
            this.f11726a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C4315e<C11672a>> list) {
            String str;
            List<? extends C4315e<C11672a>> list2 = list;
            C89219l.m154721d(list2, "");
            if (this.f11726a.f11714d == null) {
                C4223c cVar = this.f11726a;
                C4315e eVar = (C4315e) C89070n.m154583g((List) list2);
                if (eVar != null) {
                    str = eVar.f11861a;
                } else {
                    str = null;
                }
                cVar.f11714d = str;
            }
            C4236e eVar2 = this.f11726a.f11713c;
            if (eVar2 == null) {
                C89219l.m154710a("liveEffectTabHandler");
            }
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f11861a);
            }
            ArrayList arrayList2 = arrayList;
            if (!C89219l.m154714a(eVar2.f11729a, arrayList2)) {
                eVar2.f11730b.removeAllTabs();
                int i = 0;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    TabLayout tabLayout = eVar2.f11730b;
                    TabLayout.C26722f a = eVar2.mo9938a((String) obj, false);
                    if (i == 0) {
                        C4237f.m10342b(a);
                    } else {
                        C4237f.m10341a(a);
                    }
                    tabLayout.addTab(a);
                    i = i2;
                }
                TabLayout tabLayout2 = eVar2.f11730b;
                String str2 = C4147a.f11588f;
                C89219l.m154716b(str2, "");
                TabLayout.C26722f a2 = eVar2.mo9938a(str2, C4208j.C4212b.f11691a.mo9899c());
                C4237f.m10341a(a2);
                tabLayout2.addTab(a2);
                eVar2.f11729a.addAll(arrayList2);
            }
            this.f11726a.mo9930e();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String filterId;
        if (this.f11711a == null) {
            C89219l.m154710a("filterHandler");
        }
        C6806c.m14603a(AbstractC6804a.f17023cS, C4208j.C4212b.f11691a.f11681c);
        C6806c.m14603a(AbstractC6804a.f17022cR, Long.valueOf(System.currentTimeMillis()));
        if (this.f11712b == null) {
            C89219l.m154710a("smallItemBeautyHandler");
        }
        super.onDismiss(dialogInterface);
        C4175b.f11604a.mo9875a(this.f27010p, false);
        C4219a aVar = this.f11711a;
        if (aVar == null) {
            C89219l.m154710a("filterHandler");
        }
        FilterModel filterModel = aVar.f11702b;
        String str2 = "";
        if (filterModel == null || (str = filterModel.getFilterId()) == null) {
            str = str2;
        }
        C4175b bVar = C4175b.f11604a;
        DataChannel dataChannel = this.f27010p;
        C6805b<Integer> bVar2 = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar2, str2);
        bVar.mo9876a(dataChannel, false, str, true, bVar2.mo13066a().intValue() + 1);
        C4219a aVar2 = this.f11711a;
        if (aVar2 == null) {
            C89219l.m154710a("filterHandler");
        }
        FilterModel filterModel2 = aVar2.f11702b;
        if (!(filterModel2 == null || (filterId = filterModel2.getFilterId()) == null)) {
            str2 = filterId;
        }
        C4175b.m10180b(str2);
        if (C4175b.m10179a(str)) {
            DataChannelGlobal.f42558d.mo28321a(C9082cu.class, new C89386u(str, Float.valueOf(C4208j.C4212b.f11691a.mo9919a(str)), Long.valueOf(System.currentTimeMillis())));
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$h */
    static final class DialogInterface$OnClickListenerC4231h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC4231h f11725a = new DialogInterface$OnClickListenerC4231h();

        static {
            Covode.recordClassIndex(4801);
        }

        DialogInterface$OnClickListenerC4231h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$g */
    static final class DialogInterface$OnClickListenerC4230g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4223c f11724a;

        static {
            Covode.recordClassIndex(4800);
        }

        DialogInterface$OnClickListenerC4230g(C4223c cVar) {
            this.f11724a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Object obj;
            String str;
            int i2;
            C4223c cVar = this.f11724a;
            if (!C89219l.m154714a((Object) cVar.f11714d, (Object) C4147a.f11588f)) {
                C4238g gVar = cVar.f11712b;
                if (gVar == null) {
                    C89219l.m154710a("smallItemBeautyHandler");
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
                AbstractC4156i iVar = gVar.f11740i;
                String str2 = C4147a.f11586d;
                C89219l.m154716b(str2, "");
                List<C11672a> e = iVar.mo9865e(str2);
                ArrayList arrayList = new ArrayList();
                for (T t : e) {
                    if (C89219l.m154714a((Object) t.f27886B, (Object) gVar.f11733b)) {
                        arrayList.add(t);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    int i3 = 0;
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C11672a aVar = (C11672a) it.next();
                    AbstractC4156i iVar2 = gVar.f11740i;
                    String str3 = C4147a.f11586d;
                    C89219l.m154716b(str3, "");
                    C11672a.C11674b a = aVar.mo18439a();
                    if (a == null || (str = a.f27921c) == null) {
                        str = "";
                    }
                    C11672a.C11674b a2 = aVar.mo18439a();
                    if (a2 != null) {
                        i2 = a2.f27920b;
                    } else {
                        i2 = 0;
                    }
                    iVar2.mo9860a(str3, aVar, str, C4187e.m10264a(aVar, i2));
                    if (aVar.f27888D) {
                        AbstractC4156i iVar3 = gVar.f11740i;
                        String str4 = C4147a.f11586d;
                        C89219l.m154716b(str4, "");
                        iVar3.mo9864b(str4, aVar);
                    }
                    String str5 = aVar.f27895c;
                    C11672a aVar2 = gVar.f11734c;
                    if (aVar2 != null) {
                        obj = aVar2.f27895c;
                    }
                    if (C89219l.m154714a((Object) str5, obj)) {
                        AdjustPercentBar adjustPercentBar = gVar.f11743l;
                        C11672a.C11674b a3 = aVar.mo18439a();
                        if (a3 != null) {
                            i3 = a3.f27920b;
                        }
                        adjustPercentBar.setPercent(i3);
                    }
                }
                C4222b bVar = gVar.f11742k;
                Object obj2 = bVar != null ? bVar.f11708a : null;
                if (obj2 instanceof C4251c) {
                    obj = obj2;
                }
                C4251c cVar2 = (C4251c) obj;
                if (cVar2 != null) {
                    cVar2.f11765b.mo9943a();
                }
                if (!gVar.f11735d.values().contains(gVar.f11734c)) {
                    gVar.f11734c = gVar.f11735d.get(gVar.f11733b);
                }
                ImageView imageView = (ImageView) cVar.mo8166a_(R.id.dj4);
                C89219l.m154716b(imageView, "");
                imageView.setEnabled(false);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C4147a.f11588f = C3966y.m9657a((int) R.string.e7_);
        mo8166a_(R.id.am8).setOnClickListener(new View$OnClickListenerC4226c(this));
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        this.f11715e = new C4222b(childFragmentManager);
        ViewPager viewPager = (ViewPager) mo8166a_(R.id.at4);
        C89219l.m154716b(viewPager, "");
        viewPager.setAdapter(this.f11715e);
        ((ViewPager) mo8166a_(R.id.at4)).addOnPageChangeListener(new C4227d(this));
        TabLayout tabLayout = (TabLayout) mo8166a_(R.id.at9);
        C89219l.m154716b(tabLayout, "");
        ViewPager viewPager2 = (ViewPager) mo8166a_(R.id.at4);
        C89219l.m154716b(viewPager2, "");
        this.f11713c = new C4236e(tabLayout, viewPager2);
        ((ImageView) mo8166a_(R.id.dj4)).setOnClickListener(new View$OnClickListenerC4228e(this));
        ((StateLayout) mo8166a_(R.id.at8)).setErrorClickListener(new C4229f(this));
        ((AdjustPercentBar) mo8166a_(R.id.e37)).mo18118a(C3966y.m9663b((int) R.color.v2), C3966y.m9663b((int) R.color.v0), C3966y.m9663b((int) R.color.v1));
        ((AdjustPercentBar) mo8166a_(R.id.e37)).setOnLevelChangeListener(new C4225b(this));
        mo9929d();
        DataChannel dataChannel = this.f27010p;
        AdjustPercentBar adjustPercentBar = (AdjustPercentBar) mo8166a_(R.id.e37);
        C89219l.m154716b(adjustPercentBar, "");
        this.f11711a = new C4219a(dataChannel, this, adjustPercentBar);
        DataChannel dataChannel2 = this.f27010p;
        ViewPager viewPager3 = (ViewPager) mo8166a_(R.id.at4);
        C89219l.m154716b(viewPager3, "");
        C4222b bVar = this.f11715e;
        AdjustPercentBar adjustPercentBar2 = (AdjustPercentBar) mo8166a_(R.id.e37);
        C89219l.m154716b(adjustPercentBar2, "");
        StateLayout stateLayout = (StateLayout) mo8166a_(R.id.at8);
        C89219l.m154716b(stateLayout, "");
        this.f11712b = new C4238g(dataChannel2, this, viewPager3, bVar, adjustPercentBar2, stateLayout);
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 != null) {
            dataChannel3.mo28309a((AbstractC1204m) this, C4142a.class, (AbstractC89172b) new C4232i(this)).mo28309a((AbstractC1204m) this, C4307m.class, (AbstractC89172b) new C4233j(this)).mo28309a((AbstractC1204m) this, C4302j.class, (AbstractC89172b) new C4234k(this));
        }
    }
}
