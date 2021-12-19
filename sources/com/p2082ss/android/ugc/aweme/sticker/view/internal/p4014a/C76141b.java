package com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.b */
public final class C76141b implements AbstractC76122i {

    /* renamed from: a */
    public final AbstractC75429h f171050a;

    /* renamed from: b */
    private final Map<String, HashSet<String>> f171051b = new LinkedHashMap();

    /* renamed from: c */
    private final ExecutorService f171052c = C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70026a("default_sticker_view_mob").mo70028a());

    /* renamed from: d */
    private final AbstractC75655o f171053d;

    static {
        Covode.recordClassIndex(89089);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.b$a */
    static final class RunnableC76142a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f171054a;

        static {
            Covode.recordClassIndex(89090);
        }

        RunnableC76142a(AbstractC89171a aVar) {
            this.f171054a = aVar;
        }

        public final void run() {
            this.f171054a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.b$b */
    static final class C76143b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76141b f171055a;

        /* renamed from: b */
        final /* synthetic */ Effect f171056b;

        /* renamed from: c */
        final /* synthetic */ String f171057c;

        /* renamed from: d */
        final /* synthetic */ int f171058d;

        static {
            Covode.recordClassIndex(89091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76143b(C76141b bVar, Effect effect, String str, int i) {
            super(0);
            this.f171055a = bVar;
            this.f171056b = effect;
            this.f171057c = str;
            this.f171058d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC75429h hVar = this.f171055a.f171050a;
            Effect effect = this.f171056b;
            String str = this.f171057c;
            if (str == null) {
                str = "";
            }
            hVar.mo118952a(effect, str, "click_main_panel", this.f171058d);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119864a(String str) {
        HashSet<String> hashSet = this.f171051b.get(str);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119861a(int i) {
        if ((i != 0 || !C89219l.m154714a((Object) this.f171053d.mo119305p().f170069a, (Object) "xssticker")) && this.f171053d.mo119297i() != -1) {
            this.f171050a.mo118951a(System.currentTimeMillis() - this.f171053d.mo119297i(), i);
            this.f171053d.mo119281a(-1L);
            this.f171050a.mo118950a().mo118974c("tool_performance_open_choose_sticker", "shown_sticker");
        }
    }

    public C76141b(AbstractC75655o oVar, AbstractC75429h hVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        this.f171053d = oVar;
        this.f171050a = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119863a(int i, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        C89219l.m154721d(bVar, "");
        HashSet<String> hashSet = this.f171051b.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f171051b.put(str, hashSet);
        }
        Effect effect = (Effect) bVar.invoke(Integer.valueOf(i));
        if (effect != null && !hashSet.contains(effect.getEffectId())) {
            this.f171052c.submit(new RunnableC76142a(new C76143b(this, effect, str, i)));
            hashSet.add(effect.getEffectId());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119862a(int i, int i2, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        String str2;
        C89219l.m154721d(bVar, "");
        HashSet<String> hashSet = this.f171051b.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f171051b.put(str, hashSet);
        }
        int i3 = i2 + 1;
        for (int i4 = i + 1; i4 < i3; i4++) {
            Effect effect = (Effect) bVar.invoke(Integer.valueOf(i4));
            if (effect != null && !hashSet.contains(effect.getEffectId())) {
                String effectId = effect.getEffectId();
                AbstractC75429h hVar = this.f171050a;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                hVar.mo118952a(effect, str2, "click_main_panel", i4);
                hashSet.add(effectId);
            }
        }
    }
}
