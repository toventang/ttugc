package com.bytedance.android.livesdk.gifttray;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4337m;
import com.bytedance.android.live.gift.C4338n;
import com.bytedance.android.livesdk.C6900ba;
import com.bytedance.android.livesdk.C6901bb;
import com.bytedance.android.livesdk.C6902bc;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a;
import com.bytedance.android.livesdk.gifttray.p556c.C8880b;
import com.bytedance.android.livesdk.gifttray.p556c.C8890c;
import com.bytedance.android.livesdk.gifttray.p557d.C8899b;
import com.bytedance.android.livesdk.gifttray.p557d.C8901d;
import com.bytedance.android.livesdk.model.AbstractC9918z;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.service.animation.AbstractC10652c;
import com.bytedance.android.livesdk.service.p625c.p634i.C10754a;
import com.bytedance.android.livesdk.service.p625c.p634i.C10755b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.b */
public final class C8873b {

    /* renamed from: a */
    public boolean f21863a = true;

    /* renamed from: b */
    public boolean f21864b;

    /* renamed from: c */
    public AbstractC8879a f21865c;

    /* renamed from: d */
    public DataChannel f21866d;

    /* renamed from: e */
    public C8871a f21867e;

    /* renamed from: f */
    public ViewGroup f21868f;

    /* renamed from: g */
    public AbstractC8870a f21869g;

    /* renamed from: h */
    public boolean f21870h;

    /* renamed from: i */
    public boolean f21871i;

    /* renamed from: j */
    public final int f21872j;

    /* renamed from: k */
    private final AbstractC10652c f21873k = new C8874a(this);

    static {
        Covode.recordClassIndex(9757);
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b$a */
    public static final class C8874a implements AbstractC10652c {

        /* renamed from: a */
        final /* synthetic */ C8873b f21874a;

        static {
            Covode.recordClassIndex(9758);
        }

        @Override // com.bytedance.android.livesdk.service.animation.AbstractC10652c
        /* renamed from: b */
        public final void mo15133b() {
            this.f21874a.f21864b = false;
        }

        @Override // com.bytedance.android.livesdk.service.animation.AbstractC10652c
        /* renamed from: a */
        public final void mo15132a() {
            this.f21874a.f21864b = true;
            C8871a aVar = this.f21874a.f21867e;
            if (aVar == null || aVar.mo15120a() <= 0) {
                AbstractC8870a aVar2 = this.f21874a.f21869g;
                if (aVar2 != null) {
                    aVar2.mo15115a(this.f21874a.f21872j);
                    return;
                }
                return;
            }
            if (C8901d.m17250a(this.f21874a.f21867e)) {
                C10755b.C10756a.C10757a.f25916a.mo17668a();
                C8871a aVar3 = this.f21874a.f21867e;
                if (aVar3 != null) {
                    aVar3.mo15124b();
                }
            } else {
                C10755b.C10756a.C10757a.f25916a.mo17668a();
                C8871a aVar4 = this.f21874a.f21867e;
                if (aVar4 != null) {
                    aVar4.mo15126c();
                }
            }
            AbstractC8879a aVar5 = this.f21874a.f21865c;
            if (aVar5 != null) {
                aVar5.mo15136a();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.AbstractC10652c
        /* renamed from: c */
        public final void mo15134c() {
            DataChannel dataChannel;
            MethodCollector.m26663i(3284);
            AbstractC8879a aVar = this.f21874a.f21865c;
            if (aVar != null) {
                C8873b.m17196a(this.f21874a).removeView(aVar);
            }
            AbstractC8879a aVar2 = this.f21874a.f21865c;
            if (aVar2 != null) {
                aVar2.mo15141b();
            }
            this.f21874a.f21865c = null;
            if (C8873b.m17196a(this.f21874a).getChildCount() == 0 && (dataChannel = this.f21874a.f21866d) != null) {
                dataChannel.mo28320c(C4338n.class, true);
            }
            this.f21874a.f21867e = null;
            this.f21874a.f21864b = false;
            this.f21874a.f21863a = true;
            this.f21874a.f21870h = false;
            this.f21874a.f21871i = false;
            AbstractC8870a aVar3 = this.f21874a.f21869g;
            if (aVar3 != null) {
                aVar3.mo15114a();
                MethodCollector.m26664o(3284);
                return;
            }
            MethodCollector.m26664o(3284);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8874a(C8873b bVar) {
            this.f21874a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo15127a() {
        ViewGroup viewGroup = this.f21868f;
        if (viewGroup == null) {
            C89219l.m154710a("mContainerView");
        }
        if (!(viewGroup instanceof LiveGiftTrayQueueView)) {
            return -1;
        }
        ViewGroup viewGroup2 = this.f21868f;
        if (viewGroup2 == null) {
            C89219l.m154710a("mContainerView");
        }
        Objects.requireNonNull(viewGroup2, "null cannot be cast to non-null type com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView");
        return ((LiveGiftTrayQueueView) viewGroup2).getQueueSize();
    }

    /* renamed from: a */
    public final void mo15128a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f21868f = viewGroup;
    }

    public C8873b(int i) {
        this.f21872j = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m17196a(C8873b bVar) {
        ViewGroup viewGroup = bVar.f21868f;
        if (viewGroup == null) {
            C89219l.m154710a("mContainerView");
        }
        return viewGroup;
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b$c */
    static final class C8876c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8873b f21877a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f21878b;

        static {
            Covode.recordClassIndex(9760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8876c(C8873b bVar, DataChannel dataChannel) {
            super(1);
            this.f21877a = bVar;
            this.f21878b = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C8871a aVar = this.f21877a.f21867e;
            if (aVar != null) {
                this.f21877a.mo15130a(aVar, Boolean.valueOf(booleanValue));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo15131a(DataChannel dataChannel) {
        if (dataChannel != null) {
            this.f21866d = dataChannel;
            dataChannel.mo28310a(C6900ba.class, (AbstractC89172b) new C8875b(this, dataChannel)).mo28310a(C6902bc.class, (AbstractC89172b) new C8876c(this, dataChannel));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b$b */
    static final class C8875b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8873b f21875a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f21876b;

        static {
            Covode.recordClassIndex(9759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8875b(C8873b bVar, DataChannel dataChannel) {
            super(1);
            this.f21875a = bVar;
            this.f21876b = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            MethodCollector.m26663i(4370);
            C89219l.m154721d(zVar, "");
            C8873b bVar = this.f21875a;
            if (bVar.f21870h) {
                ViewGroup viewGroup = bVar.f21868f;
                if (viewGroup == null) {
                    C89219l.m154710a("mContainerView");
                }
                viewGroup.removeView(bVar.f21865c);
                AbstractC8879a aVar = bVar.f21865c;
                if (aVar != null) {
                    aVar.mo15141b();
                }
                bVar.f21867e = null;
                bVar.f21863a = true;
                bVar.f21870h = false;
                bVar.f21871i = false;
                AbstractC8870a aVar2 = bVar.f21869g;
                if (aVar2 != null) {
                    aVar2.mo15114a();
                }
            }
            C89391z zVar2 = C89391z.f203057a;
            MethodCollector.m26664o(4370);
            return zVar2;
        }
    }

    /* renamed from: a */
    public final void mo15129a(C8871a aVar) {
        Boolean bool;
        MethodCollector.m26663i(3365);
        C89219l.m154721d(aVar, "");
        this.f21863a = false;
        this.f21864b = false;
        this.f21867e = aVar;
        C10755b.C10756a.C10757a.f25916a.mo17668a();
        if (C8899b.m17242a(aVar)) {
            this.f21870h = true;
            DataChannel dataChannel = this.f21866d;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4337m.class, false);
            }
            C9895y yVar = aVar.f21835C;
            if (yVar == null || !yVar.f23930a) {
                DataChannel dataChannel2 = this.f21866d;
                if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9076co.class)) == null || !bool.booleanValue()) {
                    C8871a aVar2 = this.f21867e;
                    if (aVar2 != null) {
                        mo15130a(aVar2, false);
                        MethodCollector.m26664o(3365);
                        return;
                    }
                    MethodCollector.m26664o(3365);
                    return;
                }
                C9895y yVar2 = aVar.f21835C;
                if (yVar2 != null) {
                    DataChannel dataChannel3 = this.f21866d;
                    if (dataChannel3 != null) {
                        dataChannel3.mo28320c(C6901bb.class, yVar2);
                        MethodCollector.m26664o(3365);
                        return;
                    }
                    MethodCollector.m26664o(3365);
                    return;
                }
                MethodCollector.m26664o(3365);
                return;
            }
            C9895y yVar3 = aVar.f21835C;
            DataChannel dataChannel4 = this.f21866d;
            if (dataChannel4 != null) {
                dataChannel4.mo28320c(C6901bb.class, yVar3);
                MethodCollector.m26664o(3365);
                return;
            }
            MethodCollector.m26664o(3365);
            return;
        }
        if (!C8901d.m17250a(aVar)) {
            aVar.f21840e = aVar.f21839d;
        }
        ViewGroup viewGroup = this.f21868f;
        if (viewGroup == null) {
            C89219l.m154710a("mContainerView");
        }
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C8880b bVar = new C8880b(context);
        this.f21865c = bVar;
        bVar.mo15140a(this.f21866d);
        AbstractC8879a aVar3 = this.f21865c;
        if (aVar3 != null) {
            aVar3.setTrackNum(this.f21872j);
        }
        AbstractC8879a aVar4 = this.f21865c;
        if (aVar4 != null) {
            aVar4.setGiftMessage(aVar);
        }
        AbstractC8879a aVar5 = this.f21865c;
        if (aVar5 != null) {
            ViewGroup viewGroup2 = this.f21868f;
            if (viewGroup2 == null) {
                C89219l.m154710a("mContainerView");
            }
            int i = -viewGroup2.getWidth();
            ViewGroup viewGroup3 = this.f21868f;
            if (viewGroup3 == null) {
                C89219l.m154710a("mContainerView");
            }
            aVar5.mo15137a(i, (viewGroup3.getHeight() - ((this.f21872j + 1) * C3966y.m9653a(49.0f))) + C3966y.m9653a(2.0f));
        }
        ViewGroup viewGroup4 = this.f21868f;
        if (viewGroup4 == null) {
            C89219l.m154710a("mContainerView");
        }
        viewGroup4.addView(this.f21865c);
        C10754a.m19351a(aVar, mo15127a());
        DataChannel dataChannel5 = this.f21866d;
        if (dataChannel5 != null) {
            dataChannel5.mo28320c(C4338n.class, false);
        }
        AbstractC8879a aVar6 = this.f21865c;
        if (aVar6 != null) {
            aVar6.mo15138a(this.f21873k);
            MethodCollector.m26664o(3365);
            return;
        }
        MethodCollector.m26664o(3365);
    }

    /* renamed from: a */
    public final void mo15130a(C8871a aVar, Boolean bool) {
        AbstractC8879a aVar2;
        MethodCollector.m26663i(3374);
        if (!this.f21870h) {
            MethodCollector.m26664o(3374);
        } else if (this.f21871i) {
            MethodCollector.m26664o(3374);
        } else {
            this.f21871i = true;
            C9895y yVar = aVar.f21835C;
            if (yVar == null || !yVar.f23930a) {
                ViewGroup viewGroup = this.f21868f;
                if (viewGroup == null) {
                    C89219l.m154710a("mContainerView");
                }
                C8890c cVar = new C8890c(viewGroup.getContext());
                this.f21865c = cVar;
                cVar.setTrackNum(this.f21872j);
                AbstractC8879a aVar3 = this.f21865c;
                if (aVar3 != null) {
                    aVar3.mo15140a(this.f21866d);
                }
                C8871a aVar4 = this.f21867e;
                if (!(aVar4 == null || (aVar2 = this.f21865c) == null)) {
                    aVar2.setGiftMessage(aVar4);
                }
                AbstractC8879a aVar5 = this.f21865c;
                if (aVar5 != null) {
                    ViewGroup viewGroup2 = this.f21868f;
                    if (viewGroup2 == null) {
                        C89219l.m154710a("mContainerView");
                    }
                    int i = -viewGroup2.getWidth();
                    ViewGroup viewGroup3 = this.f21868f;
                    if (viewGroup3 == null) {
                        C89219l.m154710a("mContainerView");
                    }
                    aVar5.mo15137a(i, (viewGroup3.getHeight() - ((this.f21872j + 1) * C3966y.m9653a(49.0f))) + C3966y.m9653a(2.0f));
                }
                ViewGroup viewGroup4 = this.f21868f;
                if (viewGroup4 == null) {
                    C89219l.m154710a("mContainerView");
                }
                viewGroup4.addView(this.f21865c);
                C10754a.m19351a(aVar, mo15127a());
                AbstractC8879a aVar6 = this.f21865c;
                if (aVar6 != null) {
                    aVar6.mo15139a(this.f21873k, bool);
                    MethodCollector.m26664o(3374);
                    return;
                }
                MethodCollector.m26664o(3374);
                return;
            }
            AbstractC9918z zVar = aVar.f21835C.f23931f;
            C89219l.m154716b(zVar, "");
            zVar.mo16619a();
            MethodCollector.m26664o(3374);
        }
    }
}
