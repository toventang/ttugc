package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.t */
public final class C6486t extends AbstractC11293v {

    /* renamed from: b */
    public static final C6487a f16122b = new C6487a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super C3265j, C89391z> f16123a;

    /* renamed from: c */
    private final AbstractC89244h f16124c = C89250i.m154773a((AbstractC89171a) new C6488b(this));

    /* renamed from: d */
    private HashMap f16125d;

    static {
        Covode.recordClassIndex(7222);
    }

    /* renamed from: d */
    private final boolean m13879d() {
        return ((Boolean) this.f16124c.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f16125d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f16125d == null) {
            this.f16125d = new HashMap();
        }
        View view = (View) this.f16125d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16125d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.a.t$a */
    public static final class C6487a {
        static {
            Covode.recordClassIndex(7223);
        }

        private C6487a() {
        }

        public /* synthetic */ C6487a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.t$b */
    static final class C6488b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C6486t f16126a;

        static {
            Covode.recordClassIndex(7224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6488b(C6486t tVar) {
            super(0);
            this.f16126a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Resources resources;
            Configuration configuration;
            ActivityC0945e activity = this.f16126a.getActivity();
            boolean z = true;
            if (activity == null || (resources = activity.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        int i2;
        int i3;
        int a;
        if (m13879d()) {
            i = R.layout.b7c;
        } else {
            i = R.layout.b7d;
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
        if (m13879d()) {
            i2 = R.style.a2c;
        } else {
            i2 = R.style.a2d;
        }
        bVar.f27015b = i2;
        bVar.f27017d = m13879d();
        bVar.mo18055a(new ColorDrawable(0));
        if (m13879d()) {
            i3 = 80;
        } else {
            i3 = 8388613;
        }
        bVar.f27020g = i3;
        int i4 = -1;
        if (m13879d()) {
            a = -1;
        } else {
            a = C3966y.m9653a(375.0f);
        }
        bVar.f27021h = a;
        if (m13879d()) {
            i4 = -2;
        }
        bVar.f27022i = i4;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.a.t$e */
    static final class C6492e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6486t f16131a;

        static {
            Covode.recordClassIndex(7228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6492e(C6486t tVar) {
            super(1);
            this.f16131a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f16131a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.t$d */
    static final class View$OnClickListenerC6491d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6486t f16129a;

        /* renamed from: b */
        final /* synthetic */ C6493u f16130b;

        static {
            Covode.recordClassIndex(7227);
        }

        View$OnClickListenerC6491d(C6486t tVar, C6493u uVar) {
            this.f16129a = tVar;
            this.f16130b = uVar;
        }

        public final void onClick(View view) {
            C3265j jVar = this.f16130b.f16134c;
            if (jVar != null) {
                AbstractC89172b<? super C3265j, C89391z> bVar = this.f16129a.f16123a;
                if (bVar != null) {
                    bVar.invoke(jVar);
                }
                this.f16129a.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.t$c */
    static final class C6489c extends AbstractC89220m implements AbstractC89172b<List<? extends C3265j>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6493u f16127a;

        static {
            Covode.recordClassIndex(7225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6489c(C6493u uVar) {
            super(1);
            this.f16127a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.android.livesdk.a.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C3265j> list) {
            List<? extends C3265j> list2 = list;
            C89219l.m154721d(list2, "");
            this.f16127a.mo12621a((List<C3265j>) list2);
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.p424a.C6486t.C6489c.C64901 */

                /* renamed from: a */
                final /* synthetic */ C6489c f16128a;

                static {
                    Covode.recordClassIndex(7226);
                }

                {
                    this.f16128a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C3265j jVar = (C3265j) obj;
                    C6493u uVar = this.f16128a.f16127a;
                    C89219l.m154716b(jVar, "");
                    uVar.mo12620a(jVar);
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo8166a_(R.id.aqc);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C6493u uVar = new C6493u(context, m13879d());
        RecyclerView recyclerView2 = (RecyclerView) mo8166a_(R.id.aqc);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(uVar);
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).fetchMuteDurationList(new C6489c(uVar));
        ((LiveButton) mo8166a_(R.id.aby)).setOnClickListener(new View$OnClickListenerC6491d(this, uVar));
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C6492e(this));
        }
    }
}
