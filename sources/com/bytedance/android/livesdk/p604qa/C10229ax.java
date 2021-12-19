package com.bytedance.android.livesdk.p604qa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ax */
public final class C10229ax extends AbstractC11293v {

    /* renamed from: a */
    private HashMap f24762a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.ax$e */
    public static final class C10236e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10236e f24769a = new C10236e();

        static {
            Covode.recordClassIndex(11802);
        }

        C10236e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11795);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24762a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24762a == null) {
            this.f24762a = new HashMap();
        }
        View view = (View) this.f24762a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24762a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b7o);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: d */
    public final void mo9929d() {
        long j;
        if (C5762c.m12633b(this.f27010p)) {
            C6501b.C6502a.m13948a("livesdk_anchor_qa_entrance_close").mo12643a(this.f27010p).mo12655b();
        }
        QAApi qAApi = (QAApi) C5805e.m12718a().mo11572a(QAApi.class);
        if (C5762c.m12633b(this.f27010p)) {
            j = 0;
        } else {
            j = 1;
        }
        qAApi.switchOn(j).mo143271a(new C11191f()).mo143254a(new C10235d(this), C10236e.f24769a);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ax$c */
    static final class View$OnClickListenerC10234c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10229ax f24767a;

        static {
            Covode.recordClassIndex(11800);
        }

        View$OnClickListenerC10234c(C10229ax axVar) {
            this.f24767a = axVar;
        }

        public final void onClick(View view) {
            this.f24767a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ax$a */
    static final class C10230a extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10229ax f24763a;

        static {
            Covode.recordClassIndex(11796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10230a(C10229ax axVar) {
            super(1);
            this.f24763a = axVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24763a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C10230a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.ax$d */
    public static final class C10235d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10229ax f24768a;

        static {
            Covode.recordClassIndex(11801);
        }

        C10235d(C10229ax axVar) {
            this.f24768a = axVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C10175aa.m18672a(this.f24768a.f27010p, !C5762c.m12633b(this.f24768a.f27010p));
            DataChannel dataChannel = this.f24768a.f27010p;
            if (dataChannel != null) {
                dataChannel.mo28319c(C10174a.class);
            }
            if (!C5762c.m12633b(this.f24768a.f27010p)) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.els);
            }
            this.f24768a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ax$b */
    static final class View$OnClickListenerC10231b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10229ax f24764a;

        static {
            Covode.recordClassIndex(11797);
        }

        View$OnClickListenerC10231b(C10229ax axVar) {
            this.f24764a = axVar;
        }

        public final void onClick(View view) {
            C6805b<Boolean> bVar = AbstractC6804a.f17031ce;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue() || !C5762c.m12633b(this.f24764a.f27010p)) {
                this.f24764a.mo9929d();
                return;
            }
            this.f24764a.dismiss();
            C6805b<Boolean> bVar2 = AbstractC6804a.f17031ce;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.f24764a.getContext());
            aVar.f22256m = true;
            aVar.mo15243a(R.string.emp).mo15248b(R.string.emq).mo15244a(R.string.emp, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.bytedance.android.livesdk.p604qa.C10229ax.View$OnClickListenerC10231b.DialogInterface$OnClickListenerC102321 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC10231b f24765a;

                static {
                    Covode.recordClassIndex(11798);
                }

                {
                    this.f24765a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f24765a.f24764a.mo9929d();
                    dialogInterface.dismiss();
                }
            }, false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC102332.f24766a, false).mo15247a().show();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (C5762c.m12633b(this.f27010p)) {
            ((LiveTextView) mo8166a_(R.id.eqo)).setText(R.string.emp);
        } else {
            ((LiveTextView) mo8166a_(R.id.eqo)).setText(R.string.emw);
        }
        ((LiveTextView) mo8166a_(R.id.eqo)).setOnClickListener(new View$OnClickListenerC10231b(this));
        ((LiveTextView) mo8166a_(R.id.a0w)).setOnClickListener(new View$OnClickListenerC10234c(this));
    }
}
