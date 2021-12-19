package com.bytedance.android.livesdk.p424a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.livesdk.chatroom.p488c.C7408x;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p605r.C10330k;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.s */
public final class C6481s extends C10935a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private Dialog f16115a;

    /* renamed from: b */
    private AbstractC88412b f16116b;

    /* renamed from: c */
    private HashMap f16117c;

    static {
        Covode.recordClassIndex(7217);
    }

    /* renamed from: a */
    private View m13875a(int i) {
        if (this.f16117c == null) {
            this.f16117c = new HashMap();
        }
        View view = (View) this.f16117c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16117c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    private final void m13876b() {
        ((LiveSwitch) m13875a(R.id.a_u)).setOnCheckedChangeListener(this);
        ((LiveSwitch) m13875a(R.id.baq)).setOnCheckedChangeListener(this);
    }

    /* renamed from: c */
    private final void m13877c() {
        ((LiveSwitch) m13875a(R.id.a_u)).setOnCheckedChangeListener(null);
        ((LiveSwitch) m13875a(R.id.baq)).setOnCheckedChangeListener(null);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AbstractC88412b bVar = this.f16116b;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroyView();
        HashMap hashMap = this.f16117c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r0.booleanValue() != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12614a() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p424a.C6481s.mo12614a():void");
    }

    /* renamed from: com.bytedance.android.livesdk.a.s$a */
    static final class C6482a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6481s f16118a;

        static {
            Covode.recordClassIndex(7218);
        }

        C6482a(C6481s sVar) {
            this.f16118a = sVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f16118a.mo12614a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.s$b */
    static final class View$OnClickListenerC6483b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6481s f16119a;

        static {
            Covode.recordClassIndex(7219);
        }

        View$OnClickListenerC6483b(C6481s sVar) {
            this.f16119a = sVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16119a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.s$c */
    static final class DialogInterface$OnClickListenerC6484c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6481s f16120a;

        static {
            Covode.recordClassIndex(7220);
        }

        DialogInterface$OnClickListenerC6484c(C6481s sVar) {
            this.f16120a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C10330k.m18808b(this.f16120a.getContext());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.s$d */
    static final class DialogInterface$OnClickListenerC6485d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6481s f16121a;

        static {
            Covode.recordClassIndex(7221);
        }

        DialogInterface$OnClickListenerC6485d(C6481s sVar) {
            this.f16121a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f16121a.mo12614a();
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo12614a();
        ((LinearLayout) m13875a(R.id.dn8)).setOnClickListener(new View$OnClickListenerC6483b(this));
        this.f16116b = C6779a.m14563a().mo13052a(C7408x.class).mo143289d(new C6482a(this));
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (C89219l.m154714a(compoundButton, m13875a(R.id.a_u))) {
            C6805b<Boolean> bVar = AbstractC6804a.f16932ah;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, Boolean.valueOf(z));
        } else if (C89219l.m154714a(compoundButton, m13875a(R.id.baq))) {
            C6805b<Boolean> bVar2 = AbstractC6804a.f16933ai;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, Boolean.valueOf(z));
        }
        if (z && !C10330k.m18807a(getContext())) {
            if (this.f16115a == null) {
                DialogC9148b a = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.eht).mo15248b(R.string.ehs).mo15244a(R.string.ehq, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6484c(this), false).mo15249b(R.string.ehp, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6485d(this), false).mo15247a();
                a.setCanceledOnTouchOutside(false);
                this.f16115a = a;
            }
            C11279p.m19997a(this.f16115a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7f, viewGroup, false);
    }
}
