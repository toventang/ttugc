package com.bytedance.android.live.p385p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.p.n */
public final class C5849n extends AbstractC11293v {

    /* renamed from: a */
    public static final C5850a f14708a = new C5850a((byte) 0);

    /* renamed from: b */
    private final List<EnumC5847l> f14709b;

    /* renamed from: c */
    private final DataChannel f14710c;

    /* renamed from: d */
    private HashMap f14711d;

    static {
        Covode.recordClassIndex(6456);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f14711d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f14711d == null) {
            this.f14711d = new HashMap();
        }
        View view = (View) this.f14711d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14711d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.p.n$a */
    public static final class C5850a {
        static {
            Covode.recordClassIndex(6457);
        }

        private C5850a() {
        }

        public /* synthetic */ C5850a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6n);
        bVar.f27014a = 2;
        bVar.f27015b = R.style.a2l;
        bVar.f27020g = 80;
        bVar.f27023j = 50;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.p.n$b */
    static final class C5851b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5849n f14712a;

        static {
            Covode.recordClassIndex(6458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5851b(C5849n nVar) {
            super(1);
            this.f14712a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f14712a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        EnumC5852o.POPUP.release(this.f27010p);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14710c.mo28309a((AbstractC1204m) this, C5839d.class, (AbstractC89172b) new C5851b(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.p.l> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5849n(List<? extends EnumC5847l> list, DataChannel dataChannel) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dataChannel, "");
        this.f14709b = list;
        this.f14710c = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EnumC5852o oVar = EnumC5852o.POPUP;
        DataChannel dataChannel = this.f14710c;
        LinearLayout linearLayout = (LinearLayout) mo8166a_(R.id.ek7);
        if (linearLayout != null) {
            oVar.createHolder(dataChannel, linearLayout, this.f14709b, EnumC5854q.ICON_TITLE_HORIZONTAL);
        }
    }
}
