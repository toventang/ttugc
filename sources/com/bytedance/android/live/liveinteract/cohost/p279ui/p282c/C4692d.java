package com.bytedance.android.live.liveinteract.cohost.p279ui.p282c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d */
public final class C4692d extends AbstractC4475e.AbstractC4477b {

    /* renamed from: j */
    public static EnumC4694b f12408j = EnumC4694b.FOR_STRANGER_HEIGHT;

    /* renamed from: k */
    public static final C4693a f12409k = new C4693a((byte) 0);

    /* renamed from: m */
    private static final String f12410m;

    /* renamed from: d */
    public boolean f12411d;

    /* renamed from: e */
    public boolean f12412e;

    /* renamed from: f */
    public boolean f12413f;

    /* renamed from: g */
    public boolean f12414g;

    /* renamed from: h */
    public boolean f12415h;

    /* renamed from: i */
    public int f12416i;

    /* renamed from: l */
    private C4480f.C4481a f12417l;

    /* renamed from: n */
    private HashMap f12418n;

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e.AbstractC4477b
    /* renamed from: a */
    public final void mo10262a() {
        HashMap hashMap = this.f12418n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e.AbstractC4477b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo10262a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$a */
    public static final class C4693a {
        static {
            Covode.recordClassIndex(5270);
        }

        private C4693a() {
        }

        public /* synthetic */ C4693a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$b */
    public enum EnumC4694b {
        FOR_FRIEND_HEIGHT(310),
        FOR_STRANGER_HEIGHT(360);
        

        /* renamed from: b */
        private final int f12420b;

        public final int getHeight() {
            return this.f12420b;
        }

        static {
            Covode.recordClassIndex(5271);
        }

        private EnumC4694b(int i) {
            this.f12420b = i;
        }
    }

    private C4692d() {
        this.f12416i = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$c */
    public static final class C4695c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C4692d f12421a;

        static {
            Covode.recordClassIndex(5272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4695c(C4692d dVar) {
            super(0);
            this.f12421a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(mo10432a());
        }

        /* renamed from: a */
        public final boolean mo10432a() {
            if (this.f12421a.f12411d || this.f12421a.f12412e || this.f12421a.f12413f || this.f12421a.f12414g || this.f12421a.f12415h) {
                return false;
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(5269);
        String a = C3966y.m9657a((int) R.string.dvp);
        C89219l.m154716b(a, "");
        f12410m = a;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        C4480f.C4481a a = new C4480f.C4481a().mo10263a(f12410m);
        a.f12063b = f12408j.getHeight();
        a.f12067f = true;
        this.f12417l = a;
        return a;
    }

    public /* synthetic */ C4692d(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$h */
    static final class View$OnClickListenerC4700h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4692d f12426a;

        static {
            Covode.recordClassIndex(5277);
        }

        View$OnClickListenerC4700h(C4692d dVar) {
            this.f12426a = dVar;
        }

        public final void onClick(View view) {
            AbstractC4475e.AbstractC4476a aVar = (AbstractC4475e.AbstractC4476a) this.f12426a.f12056b;
            if (aVar != null) {
                aVar.mo10261a(this.f12426a.f12411d, this.f12426a.f12412e, this.f12426a.f12413f, this.f12426a.f12414g, this.f12426a.f12415h);
            }
            C4469d.AbstractC4474e eVar = this.f12426a.f12055a;
            if (eVar != null) {
                eVar.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$d */
    static final class C4696d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4692d f12422a;

        static {
            Covode.recordClassIndex(5273);
        }

        C4696d(C4692d dVar) {
            this.f12422a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4692d dVar = this.f12422a;
            C89219l.m154716b(compoundButton, "");
            dVar.mo10430a(compoundButton, z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$e */
    static final class C4697e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4692d f12423a;

        static {
            Covode.recordClassIndex(5274);
        }

        C4697e(C4692d dVar) {
            this.f12423a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4692d dVar = this.f12423a;
            C89219l.m154716b(compoundButton, "");
            dVar.mo10430a(compoundButton, z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$f */
    static final class C4698f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4692d f12424a;

        static {
            Covode.recordClassIndex(5275);
        }

        C4698f(C4692d dVar) {
            this.f12424a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4692d dVar = this.f12424a;
            C89219l.m154716b(compoundButton, "");
            dVar.mo10430a(compoundButton, z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$g */
    static final class C4699g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4692d f12425a;

        static {
            Covode.recordClassIndex(5276);
        }

        C4699g(C4692d dVar) {
            this.f12425a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4692d dVar = this.f12425a;
            C89219l.m154716b(compoundButton, "");
            dVar.mo10430a(compoundButton, z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.d$i */
    static final class C4701i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f12427a;

        /* renamed from: b */
        final /* synthetic */ C4692d f12428b;

        static {
            Covode.recordClassIndex(5278);
        }

        C4701i(View view, C4692d dVar) {
            this.f12427a = view;
            this.f12428b = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4692d dVar = this.f12428b;
            C89219l.m154716b(compoundButton, "");
            dVar.mo10430a(compoundButton, z);
        }
    }

    /* renamed from: a */
    public final void mo10430a(CompoundButton compoundButton, boolean z) {
        C4695c cVar = new C4695c(this);
        int id = compoundButton.getId();
        if (id == R.id.a2d) {
            this.f12411d = z;
        } else if (id == R.id.a2g) {
            this.f12412e = z;
        } else if (id == R.id.a2f) {
            this.f12413f = z;
        } else if (id == R.id.a2h) {
            this.f12414g = z;
        } else if (id == R.id.a2e) {
            this.f12415h = z;
        }
        C4469d.AbstractC4474e eVar = this.f12055a;
        C4480f.C4481a aVar = this.f12417l;
        if (aVar == null) {
            C89219l.m154710a("dialogParams");
        }
        boolean a = cVar.mo10432a();
        C4480f.C4481a a2 = new C4480f.C4481a().mo10263a(aVar.f12062a);
        a2.f12063b = aVar.f12063b;
        a2.f12064c = aVar.f12064c;
        a2.f12065d = aVar.f12065d;
        a2.f12066e = aVar.f12066e;
        a2.f12067f = aVar.f12067f;
        a2.f12068g = aVar.f12068g;
        a2.f12067f = a;
        eVar.mo10257a(a2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b82, viewGroup, false);
        ((LiveCheckBox) a.findViewById(R.id.a2d)).setOnCheckedChangeListener(new C4696d(this));
        ((LiveCheckBox) a.findViewById(R.id.a2g)).setOnCheckedChangeListener(new C4697e(this));
        ((LiveCheckBox) a.findViewById(R.id.a2f)).setOnCheckedChangeListener(new C4698f(this));
        ((LiveCheckBox) a.findViewById(R.id.a2h)).setOnCheckedChangeListener(new C4699g(this));
        ((LiveButton) a.findViewById(R.id.wd)).setOnClickListener(new View$OnClickListenerC4700h(this));
        LiveCheckBox liveCheckBox = (LiveCheckBox) a.findViewById(R.id.a2e);
        if (this.f12416i == 1) {
            C89219l.m154716b(liveCheckBox, "");
            liveCheckBox.setVisibility(8);
            View findViewById = a.findViewById(R.id.bfr);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        } else {
            C89219l.m154716b(liveCheckBox, "");
            liveCheckBox.setVisibility(0);
            liveCheckBox.setOnCheckedChangeListener(new C4701i(a, this));
        }
        return a;
    }
}
