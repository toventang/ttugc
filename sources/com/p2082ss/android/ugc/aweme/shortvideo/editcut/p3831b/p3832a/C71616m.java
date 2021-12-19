package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m */
public final class C71616m extends AbstractC71586a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160471a = {new C89232y(C71616m.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new C89232y(C71616m.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};

    /* renamed from: b */
    AVStatusView f160472b;

    /* renamed from: c */
    final AbstractC89248d f160473c = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);

    /* renamed from: d */
    private final AbstractC89248d f160474d = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: e */
    private final String f160475e = "StickPointStatusScene";

    static {
        Covode.recordClassIndex(84161);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160475e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m$b */
    static final class View$OnClickListenerC71618b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71616m f160477a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f160478b;

        static {
            Covode.recordClassIndex(84163);
        }

        View$OnClickListenerC71618b(C71616m mVar, ViewGroup viewGroup) {
            this.f160477a = mVar;
            this.f160478b = viewGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C71616m mVar = this.f160477a;
            ((AbstractC71775m) mVar.f160473c.mo23374a(mVar, C71616m.f160471a[0])).mo113409x();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        AbstractC88412b unused = ((EditAdjustClipsBottomViewModel) this.f160474d.mo23374a(this, f160471a[1])).mo33677a(this, C71619n.f160479a, new C20370ah(), new C71617a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m$a */
    static final class C71617a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71616m f160476a;

        static {
            Covode.recordClassIndex(84162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71617a(C71616m mVar) {
            super(1);
            this.f160476a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == -1) {
                AVStatusView aVStatusView = this.f160476a.f160472b;
                if (aVStatusView == null) {
                    C89219l.m154710a("statusView");
                }
                aVStatusView.mo129848d();
            } else if (intValue == 0) {
                AVStatusView aVStatusView2 = this.f160476a.f160472b;
                if (aVStatusView2 == null) {
                    C89219l.m154710a("statusView");
                }
                aVStatusView2.mo129846b();
            } else if (intValue == 1) {
                C71616m mVar = this.f160476a;
                AVStatusView aVStatusView3 = mVar.f160472b;
                if (aVStatusView3 == null) {
                    C89219l.m154710a("statusView");
                }
                aVStatusView3.mo129845a();
                mVar.mo113332d();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71616m(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar, R.id.b3l);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(12457);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        AVStatusView aVStatusView = new AVStatusView(viewGroup.getContext());
        aVStatusView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(this.f52549m).inflate(R.layout.eq, (ViewGroup) null);
        inflate.findViewById(R.id.f2l).setOnClickListener(new View$OnClickListenerC71618b(this, viewGroup));
        ((TextView) inflate.findViewById(R.id.f2m)).setText(R.string.dck);
        AVStatusView.C84988a a = AVStatusView.C84988a.m146075a(viewGroup.getContext()).mo129851a(R.string.dck).mo129852a(inflate);
        a.f190052g = 1;
        aVStatusView.setBuilder(a);
        this.f160472b = aVStatusView;
        MethodCollector.m26664o(12457);
        return aVStatusView;
    }
}
