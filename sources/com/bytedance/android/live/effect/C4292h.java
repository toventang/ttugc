package com.bytedance.android.live.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p239a.C4143a;
import com.bytedance.android.live.effect.p239a.C4145b;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p428c.C6525d;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9019am;
import com.bytedance.android.livesdk.p561j.C9081ct;
import com.bytedance.android.livesdk.p561j.C9082cu;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.h */
public final class C4292h extends AbstractC11293v {

    /* renamed from: c */
    public static final C4294b f11818c = new C4294b((byte) 0);

    /* renamed from: a */
    public AbstractC4154g f11819a;

    /* renamed from: b */
    public C4312b f11820b;

    /* renamed from: d */
    private final AbstractC89244h f11821d = C89250i.m154773a((AbstractC89171a) new C4295c(this));

    /* renamed from: e */
    private final AbstractC89244h f11822e = C89250i.m154773a((AbstractC89171a) C4296d.f11832a);

    /* renamed from: f */
    private EnumC4293a f11823f;

    /* renamed from: g */
    private int f11824g;

    /* renamed from: h */
    private float f11825h;

    /* renamed from: i */
    private float f11826i;

    /* renamed from: j */
    private float f11827j;

    /* renamed from: k */
    private final C11221ak.EnumC11222a f11828k = C11221ak.EnumC11222a.PANEL_BEAUTY_FILTER;

    /* renamed from: l */
    private HashMap f11829l;

    /* renamed from: com.bytedance.android.live.effect.h$a */
    public enum EnumC4293a {
        BEAUTY,
        FILTER;

        static {
            Covode.recordClassIndex(4863);
        }
    }

    static {
        Covode.recordClassIndex(4862);
    }

    /* renamed from: f */
    private final C4143a m10399f() {
        return (C4143a) this.f11821d.getValue();
    }

    /* renamed from: g */
    private final C4145b m10400g() {
        return (C4145b) this.f11822e.getValue();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f11829l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f11829l == null) {
            this.f11829l = new HashMap();
        }
        View view = (View) this.f11829l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f11829l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.effect.h$b */
    public static final class C4294b {
        static {
            Covode.recordClassIndex(4864);
        }

        private C4294b() {
        }

        public /* synthetic */ C4294b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f11828k;
    }

    /* renamed from: com.bytedance.android.live.effect.h$d */
    static final class C4296d extends AbstractC89220m implements AbstractC89171a<C4145b> {

        /* renamed from: a */
        public static final C4296d f11832a = new C4296d();

        static {
            Covode.recordClassIndex(4866);
        }

        C4296d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4145b invoke() {
            return new C4145b();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.h$c */
    static final class C4295c extends AbstractC89220m implements AbstractC89171a<C4143a> {

        /* renamed from: a */
        final /* synthetic */ C4292h f11831a;

        static {
            Covode.recordClassIndex(4865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4295c(C4292h hVar) {
            super(0);
            this.f11831a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4143a invoke() {
            AbstractC4154g gVar = this.f11831a.f11819a;
            C4312b bVar = this.f11831a.f11820b;
            C4143a aVar = new C4143a();
            aVar.f11578a = gVar;
            aVar.f11579b = bVar;
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6c);
        bVar.f27015b = R.style.a36;
        bVar.f27020g = 80;
        bVar.f27022i = -1;
        bVar.f27025l = 3;
        return bVar;
    }

    /* renamed from: e */
    public final void mo9957e() {
        if (C4208j.C4212b.f11691a.mo9899c()) {
            View a_ = mo8166a_(R.id.b1q);
            C89219l.m154716b(a_, "");
            a_.setVisibility(0);
            return;
        }
        View a_2 = mo8166a_(R.id.b1q);
        C89219l.m154716b(a_2, "");
        a_2.setVisibility(8);
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

    /* renamed from: d */
    public final void mo9929d() {
        EnumC4293a aVar = this.f11823f;
        if (aVar != null) {
            int i = C4301i.f11838b[aVar.ordinal()];
            if (i == 1) {
                LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.esv);
                C89219l.m154716b(liveTextView, "");
                liveTextView.setAlpha(0.9f);
                View a_ = mo8166a_(R.id.bt5);
                C89219l.m154716b(a_, "");
                a_.setAlpha(0.9f);
                View a_2 = mo8166a_(R.id.bt5);
                C89219l.m154716b(a_2, "");
                a_2.setVisibility(0);
                LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.ew4);
                C89219l.m154716b(liveTextView2, "");
                liveTextView2.setAlpha(0.5f);
                View a_3 = mo8166a_(R.id.bvo);
                C89219l.m154716b(a_3, "");
                a_3.setVisibility(8);
            } else if (i == 2) {
                LiveTextView liveTextView3 = (LiveTextView) mo8166a_(R.id.esv);
                C89219l.m154716b(liveTextView3, "");
                liveTextView3.setAlpha(0.5f);
                View a_4 = mo8166a_(R.id.bt5);
                C89219l.m154716b(a_4, "");
                a_4.setVisibility(8);
                LiveTextView liveTextView4 = (LiveTextView) mo8166a_(R.id.ew4);
                C89219l.m154716b(liveTextView4, "");
                liveTextView4.setAlpha(0.9f);
                View a_5 = mo8166a_(R.id.bt5);
                C89219l.m154716b(a_5, "");
                a_5.setAlpha(0.9f);
                View a_6 = mo8166a_(R.id.bvo);
                C89219l.m154716b(a_6, "");
                a_6.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.effect.h$g */
    static final class View$OnClickListenerC4299g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4292h f11835a;

        static {
            Covode.recordClassIndex(4869);
        }

        View$OnClickListenerC4299g(C4292h hVar) {
            this.f11835a = hVar;
        }

        public final void onClick(View view) {
            this.f11835a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.h$e */
    static final class View$OnClickListenerC4297e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4292h f11833a;

        static {
            Covode.recordClassIndex(4867);
        }

        View$OnClickListenerC4297e(C4292h hVar) {
            this.f11833a = hVar;
        }

        public final void onClick(View view) {
            this.f11833a.mo9956a(EnumC4293a.BEAUTY);
            this.f11833a.mo9929d();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        C4208j.C4212b.f11691a.mo9920a(this.f27010p);
    }

    /* renamed from: com.bytedance.android.live.effect.h$h */
    static final class C4300h extends AbstractC89220m implements AbstractC89172b<FilterModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4292h f11836a;

        static {
            Covode.recordClassIndex(4870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4300h(C4292h hVar) {
            super(1);
            this.f11836a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterModel filterModel) {
            C89219l.m154721d(filterModel, "");
            this.f11836a.mo9957e();
            C4208j jVar = C4208j.C4212b.f11691a;
            jVar.mo9921a(this.f11836a.f27010p, jVar.f11679a.indexOf(filterModel), false, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.h$f */
    static final class View$OnClickListenerC4298f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4292h f11834a;

        static {
            Covode.recordClassIndex(4868);
        }

        View$OnClickListenerC4298f(C4292h hVar) {
            this.f11834a = hVar;
        }

        public final void onClick(View view) {
            this.f11834a.mo9956a(EnumC4293a.FILTER);
            this.f11834a.mo9929d();
            View a_ = this.f11834a.mo8166a_(R.id.b1q);
            C89219l.m154716b(a_, "");
            a_.setVisibility(8);
            C6501b.C6502a.m13948a("live_take_filter_click").mo12643a(this.f11834a.f27010p).mo12656c("click").mo12654b("live_take").mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo9956a(EnumC4293a aVar) {
        if (this.f11823f != aVar) {
            AbstractC0976n a = getChildFragmentManager().mo3552a();
            C89219l.m154716b(a, "");
            int i = C4301i.f11837a[aVar.ordinal()];
            if (i == 1) {
                Fragment a2 = getChildFragmentManager().mo3551a("PreViewFilterFragment");
                if (a2 != null) {
                    a.mo3471b(a2);
                }
                Fragment a3 = getChildFragmentManager().mo3551a("PreViewBeautyFragment");
                if (a3 == null) {
                    a.mo3454a(R.id.ade, m10399f(), "PreViewBeautyFragment");
                } else {
                    a.mo3474c(a3);
                }
            } else if (i == 2) {
                Fragment a4 = getChildFragmentManager().mo3551a("PreViewBeautyFragment");
                if (a4 != null) {
                    a.mo3471b(a4);
                }
                Fragment a5 = getChildFragmentManager().mo3551a("PreViewFilterFragment");
                if (a5 == null) {
                    a.mo3454a(R.id.ade, m10400g(), "PreViewFilterFragment");
                } else {
                    a.mo3474c(a5);
                }
            }
            a.mo3478e();
            this.f11823f = aVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        User owner;
        if (C11279p.m20022c()) {
            C6805b<Integer> bVar = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar, "");
            Integer a = bVar.mo13066a();
            List<FilterModel> list = C4208j.C4212b.f11691a.f11679a;
            C89219l.m154716b(list, "");
            if (a.intValue() < list.size()) {
                C89219l.m154716b(a, "");
                FilterModel filterModel = list.get(a.intValue());
                C89219l.m154716b(filterModel, "");
                str = filterModel.getFilterId();
            } else {
                str = "";
            }
            Object b = DataChannelGlobal.f42558d.mo28324b(C9019am.class);
            if (b == null) {
                b = "";
            }
            C89386u uVar = (C89386u) DataChannelGlobal.f42558d.mo28324b(C9082cu.class);
            String str2 = null;
            if (uVar == null || uVar.getFirst() == null || !C89219l.m154714a((Object) str, uVar.getFirst())) {
                if (!C13627m.m24498a(str) && (!C89219l.m154714a((Object) str, (Object) "0")) && a.intValue() != this.f11824g) {
                    Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    C6501b a2 = C6501b.C6502a.m13948a("live_take_filter_select").mo12643a(this.f27010p).mo12654b("live_take").mo12661f("click").mo12651a("filter_id", str).mo12645a("is_live_take_default", C89219l.m154714a(b, str) ? 1 : 0).mo12645a("impr_position", a.intValue() + 1);
                    if (!(room == null || (owner = room.getOwner()) == null)) {
                        str2 = owner.getIdStr();
                    }
                    a2.mo12662g(str2).mo12655b();
                    DataChannelGlobal.f42558d.mo28327c(C9019am.class);
                    DataChannelGlobal.f42558d.mo28321a(C9082cu.class, new C89386u(str, Float.valueOf(C4208j.C4212b.f11691a.mo9919a(str)), Long.valueOf(System.currentTimeMillis())));
                    C3051c.C3052a.m8360b("ttlive_click_change_filter").mo12633b("preview").mo12629a("select_filter_id", str).mo12627a("select_filter_position", a).mo12632a();
                }
                C89219l.m154716b(str, "");
                C4175b.m10180b(str);
            }
        }
        C6805b<Float> bVar2 = AbstractC6804a.f16888Q;
        C89219l.m154716b(bVar2, "");
        Float a3 = bVar2.mo13066a();
        C6805b<Float> bVar3 = AbstractC6804a.f16889R;
        C89219l.m154716b(bVar3, "");
        Float a4 = bVar3.mo13066a();
        C6805b<Float> bVar4 = AbstractC6804a.f16890S;
        C89219l.m154716b(bVar4, "");
        Float a5 = bVar4.mo13066a();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9081ct.class);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!C89219l.m154711a(this.f11825h, a3)) {
            C4175b bVar5 = C4175b.f11604a;
            C89219l.m154716b(a3, "");
            bVar5.mo9877a("smooth", a3.floatValue(), 1, C89219l.m154712a(a3, LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23107b));
            C11672a aVar = new C11672a();
            aVar.f27893a = 1111;
            concurrentHashMap.put("smooth", new C6525d(aVar, a3.floatValue(), currentTimeMillis));
        }
        if (!C89219l.m154711a(this.f11826i, a4)) {
            C4175b bVar6 = C4175b.f11604a;
            C89219l.m154716b(a4, "");
            bVar6.mo9877a("enlarge_eyes", a4.floatValue(), 2, C89219l.m154712a(a4, LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b));
            C11672a aVar2 = new C11672a();
            aVar2.f27893a = 1112;
            concurrentHashMap.put("enlarge_eyes", new C6525d(aVar2, a4.floatValue(), currentTimeMillis));
        }
        if (!C89219l.m154711a(this.f11827j, a5)) {
            C4175b bVar7 = C4175b.f11604a;
            C89219l.m154716b(a5, "");
            bVar7.mo9877a("reshaping", a5.floatValue(), 3, C89219l.m154712a(a5, LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b));
            C11672a aVar3 = new C11672a();
            aVar3.f27893a = 1112;
            concurrentHashMap.put("reshaping", new C6525d(aVar3, a5.floatValue(), currentTimeMillis));
        }
        DataChannelGlobal.f42558d.mo28321a(C9081ct.class, concurrentHashMap);
        C6805b<Integer> bVar8 = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar8, "");
        Integer a6 = bVar8.mo13066a();
        List<FilterModel> list2 = C4208j.C4212b.f11691a.f11679a;
        C89219l.m154716b(a6, "");
        FilterModel filterModel2 = list2.get(a6.intValue());
        C89219l.m154716b(filterModel2, "");
        String filterId = filterModel2.getFilterId();
        float a7 = C4208j.C4212b.f11691a.mo9919a(filterId);
        if (C11279p.m20022c()) {
            DataChannelGlobal.f42558d.mo28321a(C9019am.class, filterId);
        }
        if (C11279p.m20026d()) {
            C89219l.m154716b(filterId, "");
            C4175b.m10180b(filterId);
        }
        DataChannelGlobal.f42558d.mo28321a(C9082cu.class, new C89386u(filterId, Float.valueOf(a7), Long.valueOf(System.currentTimeMillis())));
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C6805b<Integer> bVar = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar, "");
        Integer a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        this.f11824g = a.intValue();
        C6805b<Float> bVar2 = AbstractC6804a.f16888Q;
        C89219l.m154716b(bVar2, "");
        Float a2 = bVar2.mo13066a();
        C89219l.m154716b(a2, "");
        this.f11825h = a2.floatValue();
        C6805b<Float> bVar3 = AbstractC6804a.f16889R;
        C89219l.m154716b(bVar3, "");
        Float a3 = bVar3.mo13066a();
        C89219l.m154716b(a3, "");
        this.f11826i = a3.floatValue();
        C6805b<Float> bVar4 = AbstractC6804a.f16890S;
        C89219l.m154716b(bVar4, "");
        Float a4 = bVar4.mo13066a();
        C89219l.m154716b(a4, "");
        this.f11827j = a4.floatValue();
        ((ConstraintLayout) mo8166a_(R.id.wc)).setOnClickListener(new View$OnClickListenerC4297e(this));
        ((ConstraintLayout) mo8166a_(R.id.wf)).setOnClickListener(new View$OnClickListenerC4298f(this));
        mo8166a_(R.id.am8).setOnClickListener(new View$OnClickListenerC4299g(this));
        EnumC4293a aVar = this.f11823f;
        this.f11823f = null;
        if (aVar == null) {
            aVar = EnumC4293a.BEAUTY;
        }
        mo9956a(aVar);
        mo9929d();
        mo9957e();
        DataChannel a5 = C17846f.m33055a(this);
        if (a5 != null) {
            a5.mo28309a((AbstractC1204m) this, C4306l.class, (AbstractC89172b) new C4300h(this));
        }
    }
}
