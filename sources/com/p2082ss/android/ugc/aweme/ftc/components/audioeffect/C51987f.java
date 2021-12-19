package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.filter.C50634a;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51990g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.C70826a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.f */
public final class C51987f extends AbstractC23520b<FTCEditAudioEffectViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f119755a;

    /* renamed from: b */
    public final int f119756b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f119757c = C89250i.m154773a((AbstractC89171a) new C51988a(this));

    /* renamed from: d */
    private final AbstractC89171a<FTCEditAudioEffectViewModel> f119758d = new C51989b(this);

    /* renamed from: e */
    private final C21582f f119759e;

    static {
        Covode.recordClassIndex(61359);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditAudioEffectViewModel> mo23031b() {
        return this.f119758d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f119755a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119759e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.f$b */
    static final class C51989b extends AbstractC89220m implements AbstractC89171a<FTCEditAudioEffectViewModel> {

        /* renamed from: a */
        final /* synthetic */ C51987f f119761a;

        static {
            Covode.recordClassIndex(61361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51989b(C51987f fVar) {
            super(0);
            this.f119761a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditAudioEffectViewModel invoke() {
            return new FTCEditAudioEffectViewModel(this.f119761a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.f$a */
    static final class C51988a extends AbstractC89220m implements AbstractC89171a<C51990g> {

        /* renamed from: a */
        final /* synthetic */ C51987f f119760a;

        static {
            Covode.recordClassIndex(61360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51988a(C51987f fVar) {
            super(0);
            this.f119760a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51990g invoke() {
            C51990g gVar = new C51990g(this.f119760a.getDiContainer());
            this.f119760a.f119755a.mo36387a(this.f119760a.f119756b, gVar, "FTCEditAudioEffectScene");
            return gVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        TextView textView;
        MethodCollector.m26663i(11908);
        C51990g gVar = (C51990g) this.f119757c.getValue();
        AbstractC22219j jVar = gVar.f52551o;
        FrameLayout frameLayout = null;
        if (!(jVar instanceof AbstractC22186b)) {
            jVar = null;
        }
        AbstractC22186b bVar = (AbstractC22186b) jVar;
        if (bVar != null) {
            bVar.mo36417e(gVar);
        }
        gVar.f119778u = gVar.mo87717b().mo114778C().getValue();
        FrameLayout frameLayout2 = gVar.f119779v;
        if (frameLayout2 == null) {
            C89219l.m154710a("parentLayout");
        }
        frameLayout2.removeAllViews();
        Activity activity = gVar.f52549m;
        if (activity != null) {
            ActivityC0218d dVar = (ActivityC0218d) activity;
            FrameLayout frameLayout3 = gVar.f119779v;
            if (frameLayout3 == null) {
                C89219l.m154710a("parentLayout");
            }
            if (gVar.f119767c == null) {
                gVar.f119767c = C1764a.m5927a(LayoutInflater.from(dVar), R.layout.eg, frameLayout3, false);
                View view = gVar.f119767c;
                if (view != null) {
                    textView = (TextView) view.findViewById(R.id.evn);
                } else {
                    textView = null;
                }
                gVar.f119768d = textView;
                View view2 = gVar.f119767c;
                if (view2 != null) {
                    frameLayout = (FrameLayout) view2.findViewById(R.id.c5o);
                }
                gVar.f119777t = new C70826a(frameLayout);
                View view3 = gVar.f119767c;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                gVar.f119769e = view3.findViewById(R.id.fgx);
                View view4 = gVar.f119767c;
                if (view4 == null) {
                    C89219l.m154715b();
                }
                view4.findViewById(R.id.fh1).setOnClickListener(new C51990g.View$OnClickListenerC51998g(gVar));
                View view5 = gVar.f119767c;
                if (view5 == null) {
                    C89219l.m154715b();
                }
                gVar.f119770f = (RecyclerView) view5.findViewById(R.id.fgz);
                gVar.f119774j = new LinearLayoutManager(0, false);
                RecyclerView recyclerView = gVar.f119770f;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gVar.f119774j);
                }
                Activity activity2 = gVar.f52549m;
                if (activity2 != null) {
                    gVar.f119773i = new C51976c((ActivityC0218d) activity2, gVar.f119778u, gVar.mo87714a(), gVar.mo87714a().veAudioEffectParam, gVar.mo87717b());
                    C51976c cVar = gVar.f119773i;
                    if (cVar != null) {
                        cVar.f119728c = gVar;
                    }
                    RecyclerView recyclerView2 = gVar.f119770f;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(gVar.f119773i);
                    }
                    gVar.mo87718d();
                    View view6 = gVar.f119767c;
                    if (view6 == null) {
                        C89219l.m154715b();
                    }
                    View view7 = gVar.f119769e;
                    if (view7 == null) {
                        C89219l.m154715b();
                    }
                    gVar.f119771g = new C50634a(frameLayout3, view6, view7);
                    C50634a aVar = gVar.f119771g;
                    if (aVar != null) {
                        aVar.f116956a = new C51990g.C51997f(gVar);
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    MethodCollector.m26664o(11908);
                    throw nullPointerException;
                }
            } else {
                gVar.mo87718d();
            }
            View view8 = gVar.f119767c;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            C50634a aVar2 = gVar.f119771g;
            if (aVar2 != null) {
                aVar2.mo70110a(new C51990g.C52002k(gVar));
                MethodCollector.m26664o(11908);
                return;
            }
            MethodCollector.m26664o(11908);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.m26664o(11908);
        throw nullPointerException2;
    }

    public C51987f(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f119759e = fVar;
        this.f119755a = bVar;
    }
}
