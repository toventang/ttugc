package com.bytedance.android.live.liveinteract.multilive.p341a.p344c;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5388d;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5393i;
import com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5438l;
import com.bytedance.android.live.liveinteract.multilive.p341a.p345d.C5420j;
import com.bytedance.android.live.liveinteract.multilive.p341a.p345d.View$OnClickListenerC5408a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b */
public final class C5400b extends AbstractC5438l {

    /* renamed from: e */
    public static final C5401a f13909e = new C5401a((byte) 0);

    /* renamed from: a */
    public C5134a.AbstractC5135a f13910a;

    /* renamed from: b */
    public C5300c f13911b;

    /* renamed from: c */
    public DialogC5211a.EnumC5215a f13912c;

    /* renamed from: d */
    public C5393i f13913d;

    /* renamed from: f */
    private Fragment f13914f;

    /* renamed from: g */
    private final AbstractC89244h f13915g;

    /* renamed from: h */
    private final AbstractC89244h f13916h;

    /* renamed from: i */
    private HashMap f13917i;

    static {
        Covode.recordClassIndex(5995);
    }

    /* renamed from: e */
    private final C5420j m11876e() {
        return (C5420j) this.f13915g.getValue();
    }

    /* renamed from: f */
    private final View$OnClickListenerC5408a m11877f() {
        return (View$OnClickListenerC5408a) this.f13916h.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5438l, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f13917i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5438l, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f13917i == null) {
            this.f13917i = new HashMap();
        }
        View view = (View) this.f13917i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f13917i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5438l, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$a */
    public static final class C5401a {
        static {
            Covode.recordClassIndex(5996);
        }

        private C5401a() {
        }

        public /* synthetic */ C5401a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C5400b m11886a(DataChannel dataChannel, C5134a.AbstractC5135a aVar, C5300c cVar, DialogC5211a.EnumC5215a aVar2, C5393i iVar) {
            C89219l.m154721d(dataChannel, "");
            C5400b bVar = new C5400b((byte) 0);
            bVar.f27010p = dataChannel;
            bVar.f13910a = aVar;
            bVar.f13911b = cVar;
            bVar.f13912c = aVar2;
            bVar.f13913d = iVar;
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$b */
    static final class RunnableC5402b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5400b f13918a;

        static {
            Covode.recordClassIndex(5997);
        }

        RunnableC5402b(C5400b bVar) {
            this.f13918a = bVar;
        }

        public final void run() {
            C5400b.super.dismiss();
        }
    }

    /* renamed from: d */
    public final boolean mo9929d() {
        if (this.f13912c == DialogC5211a.EnumC5215a.GO_LIVE) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$c */
    static final class C5403c extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC5408a> {

        /* renamed from: a */
        final /* synthetic */ C5400b f13919a;

        static {
            Covode.recordClassIndex(5998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5403c(C5400b bVar) {
            super(0);
            this.f13919a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC5408a invoke() {
            C5400b bVar = this.f13919a;
            DataChannel dataChannel = bVar.f27010p;
            C5134a.AbstractC5135a aVar = this.f13919a.f13910a;
            DialogC5211a.EnumC5215a aVar2 = this.f13919a.f13912c;
            View$OnClickListenerC5408a aVar3 = new View$OnClickListenerC5408a();
            aVar3.f13935e = bVar;
            aVar3.f13940j = dataChannel;
            aVar3.f13936f = aVar;
            aVar3.f13942l = aVar2;
            return aVar3;
        }
    }

    private C5400b() {
        this.f13915g = C89250i.m154773a((AbstractC89171a) new C5404d(this));
        this.f13916h = C89250i.m154773a((AbstractC89171a) new C5403c(this));
    }

    /* renamed from: g */
    private final Fragment m11878g() {
        Fragment e;
        if (mo9929d()) {
            e = m11877f();
            C89219l.m154716b(e, "");
        } else {
            e = m11876e();
        }
        return e;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        View$OnClickListenerC5408a f = m11877f();
        C89219l.m154716b(f, "");
        if (!f.mStatusActive) {
            return super.mo10398i();
        }
        m11877f().mo11215c();
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$d */
    static final class C5404d extends AbstractC89220m implements AbstractC89171a<C5420j> {

        /* renamed from: a */
        final /* synthetic */ C5400b f13920a;

        static {
            Covode.recordClassIndex(5999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5404d(C5400b bVar) {
            super(0);
            this.f13920a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5420j invoke() {
            C5400b bVar = this.f13920a;
            DataChannel dataChannel = bVar.f27010p;
            C5134a.AbstractC5135a aVar = this.f13920a.f13910a;
            C5300c cVar = this.f13920a.f13911b;
            DialogC5211a.EnumC5215a aVar2 = this.f13920a.f13912c;
            C5393i iVar = this.f13920a.f13913d;
            C5420j jVar = new C5420j((byte) 0);
            jVar.f13969a = bVar;
            jVar.f13972d = dataChannel;
            jVar.f13974f = aVar;
            jVar.f13975g = cVar;
            jVar.f13973e = aVar2;
            jVar.f13976h = iVar;
            return jVar;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6r);
        bVar.f27015b = R.style.a2c;
        bVar.mo18055a(new ColorDrawable(0));
        bVar.f27020g = 80;
        bVar.f27022i = -1;
        bVar.f27018e = !mo9929d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismiss() {
        Fragment fragment = this.f13914f;
        if (fragment instanceof View$OnClickListenerC5408a) {
            Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment");
            View$OnClickListenerC5408a aVar = (View$OnClickListenerC5408a) fragment;
            if (aVar.f13933c != null) {
                aVar.f13933c.setVisibility(0);
            }
            if (aVar.f13932b != null) {
                ((View) aVar.f13932b).setVisibility(4);
            }
            Fragment fragment2 = this.f13914f;
            Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment");
            View view = ((View$OnClickListenerC5408a) fragment2).f13933c;
            if (view != null) {
                view.post(new RunnableC5402b(this));
                return;
            }
            return;
        }
        super.dismiss();
    }

    public /* synthetic */ C5400b(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$e */
    static final class View$OnClickListenerC5405e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5400b f13921a;

        static {
            Covode.recordClassIndex(6000);
        }

        View$OnClickListenerC5405e(C5400b bVar) {
            this.f13921a = bVar;
        }

        public final void onClick(View view) {
            if (!this.f13921a.mo9929d()) {
                this.f13921a.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$f */
    static final /* synthetic */ class C5406f extends C89217j implements AbstractC89172b<EnumC5399a, C89391z> {
        static {
            Covode.recordClassIndex(6001);
        }

        C5406f(C5400b bVar) {
            super(1, bVar, C5400b.class, "switchPage", "switchPage(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC5399a aVar) {
            EnumC5399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            ((C5400b) this.receiver).mo11209a(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo11209a(EnumC5399a aVar) {
        Fragment e;
        int i = C5407c.f13922a[aVar.ordinal()];
        if (i == 1) {
            m11876e().mo11226a(this.f13912c, this.f13913d);
            e = m11876e();
        } else if (i == 2) {
            e = m11877f();
        } else {
            throw new C89376n();
        }
        this.f13914f = e;
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        if (aVar.getGoNextPage()) {
            a.mo3451a(R.anim.er, R.anim.en);
        } else {
            a.mo3451a(R.anim.em, R.anim.es);
        }
        Fragment fragment = this.f13914f;
        if (fragment != null) {
            a.mo3469b(R.id.b82, fragment).mo3467b();
        }
    }

    /* renamed from: a */
    public final void mo11208a(DialogC5211a.EnumC5215a aVar, C5393i iVar) {
        this.f13912c = aVar;
        this.f13913d = iVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        if (!m11878g().isAdded()) {
            try {
                super.show(iVar, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo8166a_(R.id.cy6).setOnClickListener(new View$OnClickListenerC5405e(this));
        Fragment g = m11878g();
        this.f13914f = g;
        if (g instanceof C5420j) {
            ((C5420j) g).mo11226a(this.f13912c, this.f13913d);
        }
        getChildFragmentManager().mo3552a().mo3453a(R.id.b82, g).mo3467b();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C5388d.class, (AbstractC89172b) new C5406f(this));
        }
    }
}
