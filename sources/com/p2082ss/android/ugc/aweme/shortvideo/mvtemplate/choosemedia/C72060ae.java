package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.p3290j.C56814b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68085a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72216f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ae */
public final class C72060ae extends C56814b implements View$OnClickListenerC72152av.AbstractC72154b {

    /* renamed from: b */
    static final int f161515b;

    /* renamed from: c */
    static final int f161516c;

    /* renamed from: d */
    View$OnClickListenerC72152av f161517d;

    /* renamed from: e */
    C59187c f161518e;

    /* renamed from: f */
    View f161519f;

    /* renamed from: g */
    public View$OnClickListenerC72152av.AbstractC72154b f161520g;

    /* renamed from: h */
    boolean f161521h;

    /* renamed from: i */
    boolean f161522i;

    /* renamed from: j */
    int f161523j;

    /* renamed from: k */
    int f161524k;

    /* renamed from: l */
    public boolean f161525l;

    /* renamed from: m */
    boolean f161526m;

    /* renamed from: n */
    AbstractC59178e f161527n = new C72062af(this);

    /* renamed from: o */
    private RecyclerView f161528o;

    /* renamed from: p */
    private View$OnClickListenerC72152av.AbstractC72156d f161529p = new C72063ag(this);

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    static {
        int i;
        Covode.recordClassIndex(84725);
        int i2 = 300;
        if (C68085a.m120387a() == 0) {
            i = 300;
        } else {
            i = 600;
        }
        f161515b = i;
        if (C68085a.m120387a() != 0) {
            i2 = 600;
        }
        f161516c = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f161519f = C1764a.m5927a(layoutInflater, R.layout.agh, viewGroup, false);
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("key_support_flag", -1);
            this.f161526m = arguments.getBoolean("extra_show_gif", false);
        }
        RecyclerView recyclerView = (RecyclerView) this.f161519f.findViewById(R.id.bl3);
        this.f161528o = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        View$OnClickListenerC72152av avVar = new View$OnClickListenerC72152av(getActivity(), this);
        this.f161517d = avVar;
        avVar.f161746a = this.f161529p;
        if (C59187c.f134693a == null) {
            C59187c.m108691a(C63247i.f143610a, C65348ar.m117034a());
        }
        this.f161518e = C59187c.f134693a;
        this.f161528o.setAdapter(this.f161517d);
        this.f161519f.post(new RunnableC72065ai(this));
        if (this.f161518e != null) {
            C73975b.C73976a.f166071a.step(OpenAlbumPanelPerformanceMonitor.f166158a, "loadMediaModels");
            C84911q.m145922a("MvChooseAlbumFragment", "loadData, supportFlag = ".concat(String.valueOf(i)));
            if (!((i & 1) == 0 && (i & 2) == 0)) {
                this.f161521h = true;
                this.f161523j = 0;
                if (this.f161526m) {
                    C59187c.m108690a(1, 30, 0, this.f161527n, AbstractC59174d.C59175a.f134652a);
                } else {
                    C59187c.m108690a(3, 30, 0, this.f161527n, AbstractC59174d.C59175a.f134652a);
                }
            }
            if ((i & 4) != 0) {
                this.f161522i = true;
                this.f161524k = 0;
                C59187c.m108690a(4, 30, 0, this.f161527n, AbstractC59174d.C59175a.f134652a);
            }
        } else {
            C84911q.m145922a("MvChooseAlbumFragment", "loadData, mMediaManager is null");
        }
        C72064ah ahVar = new C72064ah(this);
        C89219l.m154721d(this, "");
        C89219l.m154721d(ahVar, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC88412b unused = ((BaseJediViewModel) C20531t.m38716a(activity).mo33800a(ChooseMediaViewModel.class)).mo33677a(this, C72221j.f161903a, new C20370ah(), new C72216f.C72217a(ahVar));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f161519f.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72060ae.C720611 */

                static {
                    Covode.recordClassIndex(84726);
                }

                public final void getOutline(View view, Outline outline) {
                    outline.setRect(0, 0, 0, 0);
                }
            });
            this.f161519f.setElevation(C84912r.m145930a(requireContext(), 17.0f));
        }
        return this.f161519f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av.AbstractC72154b
    /* renamed from: a */
    public final void mo114348a(View$OnClickListenerC72152av.C72153a aVar, boolean z, int i, boolean z2) {
        View$OnClickListenerC72152av.AbstractC72154b bVar = this.f161520g;
        if (bVar != null) {
            bVar.mo114348a(aVar, z, i, z2);
        }
    }
}
