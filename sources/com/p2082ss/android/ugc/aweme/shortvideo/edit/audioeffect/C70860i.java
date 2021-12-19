package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

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
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.filter.C50634a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70864k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.C70826a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i */
public final class C70860i extends AbstractC23520b<EditAudioEffectViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f158638a;

    /* renamed from: b */
    public final int f158639b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f158640c = C89250i.m154773a((AbstractC89171a) new C70861a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditAudioEffectViewModel> f158641d = C70862b.f158644a;

    /* renamed from: e */
    private final C21582f f158642e;

    static {
        Covode.recordClassIndex(83351);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditAudioEffectViewModel> mo23031b() {
        return this.f158641d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f158638a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158642e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$b */
    static final class C70862b extends AbstractC89220m implements AbstractC89171a<EditAudioEffectViewModel> {

        /* renamed from: a */
        public static final C70862b f158644a = new C70862b();

        static {
            Covode.recordClassIndex(83353);
        }

        C70862b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditAudioEffectViewModel invoke() {
            return new EditAudioEffectViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$a */
    static final class C70861a extends AbstractC89220m implements AbstractC89171a<C70864k> {

        /* renamed from: a */
        final /* synthetic */ C70860i f158643a;

        static {
            Covode.recordClassIndex(83352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70861a(C70860i iVar) {
            super(0);
            this.f158643a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70864k invoke() {
            C70864k kVar = new C70864k(this.f158643a.getDiContainer());
            this.f158643a.f158638a.mo36387a(this.f158643a.f158639b, kVar, "EditAudioEffectScene");
            return kVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        TextView textView;
        MethodCollector.m26663i(11391);
        C70864k kVar = (C70864k) this.f158640c.getValue();
        AbstractC22186b bVar = (AbstractC22186b) kVar.f52551o;
        if (bVar != null) {
            bVar.mo36417e(kVar);
        }
        kVar.f158662u = kVar.mo112032b().mo114778C().getValue();
        FrameLayout frameLayout = kVar.f158663v;
        if (frameLayout == null) {
            C89219l.m154710a("parentLayout");
        }
        frameLayout.removeAllViews();
        Activity activity = kVar.f52549m;
        if (activity != null) {
            ActivityC0218d dVar = (ActivityC0218d) activity;
            FrameLayout frameLayout2 = kVar.f158663v;
            if (frameLayout2 == null) {
                C89219l.m154710a("parentLayout");
            }
            if (kVar.f158651c == null) {
                kVar.f158651c = C1764a.m5927a(LayoutInflater.from(dVar), R.layout.ex, frameLayout2, false);
                View view = kVar.f158651c;
                FrameLayout frameLayout3 = null;
                if (view != null) {
                    textView = (TextView) view.findViewById(R.id.evn);
                } else {
                    textView = null;
                }
                kVar.f158652d = textView;
                View view2 = kVar.f158651c;
                if (view2 != null) {
                    frameLayout3 = (FrameLayout) view2.findViewById(R.id.c5o);
                }
                kVar.f158661t = new C70826a(frameLayout3);
                View view3 = kVar.f158651c;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                kVar.f158653e = view3.findViewById(R.id.fgx);
                View view4 = kVar.f158651c;
                if (view4 == null) {
                    C89219l.m154715b();
                }
                view4.findViewById(R.id.fh1).setOnClickListener(new C70864k.View$OnClickListenerC70872g(kVar));
                View view5 = kVar.f158651c;
                if (view5 == null) {
                    C89219l.m154715b();
                }
                kVar.f158654f = (RecyclerView) view5.findViewById(R.id.fgz);
                kVar.f158658j = new LinearLayoutManager(0, false);
                RecyclerView recyclerView = kVar.f158654f;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(kVar.f158658j);
                }
                Activity activity2 = kVar.f52549m;
                if (activity2 != null) {
                    kVar.f158657i = new C70845d((ActivityC0218d) activity2, kVar.f158662u, kVar.mo112030a(), kVar.mo112030a().veAudioEffectParam, kVar.mo112032b());
                    C70845d dVar2 = kVar.f158657i;
                    if (dVar2 != null) {
                        dVar2.f158607c = kVar;
                    }
                    RecyclerView recyclerView2 = kVar.f158654f;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(kVar.f158657i);
                    }
                    kVar.mo112033d();
                    View view6 = kVar.f158651c;
                    if (view6 == null) {
                        C89219l.m154715b();
                    }
                    View view7 = kVar.f158653e;
                    if (view7 == null) {
                        C89219l.m154715b();
                    }
                    kVar.f158655g = new C50634a(frameLayout2, view6, view7);
                    C50634a aVar = kVar.f158655g;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f116956a = new C70864k.C70871f(kVar);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    MethodCollector.m26664o(11391);
                    throw nullPointerException;
                }
            } else {
                kVar.mo112033d();
            }
            View view8 = kVar.f158651c;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            C50634a aVar2 = kVar.f158655g;
            if (aVar2 != null) {
                aVar2.mo70110a(new C70864k.C70876k(kVar));
                MethodCollector.m26664o(11391);
                return;
            }
            MethodCollector.m26664o(11391);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.m26664o(11391);
        throw nullPointerException2;
    }

    public C70860i(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f158642e = fVar;
        this.f158638a = bVar;
    }
}
