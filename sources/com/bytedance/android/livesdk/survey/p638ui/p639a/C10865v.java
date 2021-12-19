package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.watch.AbstractC11320a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import java.util.Queue;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.v */
public final class C10865v implements AbstractC11320a {

    /* renamed from: a */
    public Boolean f26089a;

    /* renamed from: b */
    public final Queue<Runnable> f26090b = new LinkedList();

    /* renamed from: c */
    private final AbstractC89172b<Boolean, C89391z> f26091c;

    /* renamed from: d */
    private final C10837g f26092d;

    static {
        Covode.recordClassIndex(12467);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
    /* renamed from: a */
    public final void mo17744a() {
        this.f26092d.mo17743b();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
    /* renamed from: c */
    public final boolean mo17747c() {
        return this.f26092d.mo17742a();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
    /* renamed from: b */
    public final void mo17746b() {
        this.f26090b.clear();
        for (T t : this.f26092d.f26070a) {
            DataChannel dataChannel = t.f26068e;
            if (dataChannel != null) {
                dataChannel.mo28316b((Object) t);
            }
            t.f26067d.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
    /* renamed from: a */
    public final void mo17745a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        if (this.f26092d.mo17742a()) {
            runnable.run();
        } else {
            this.f26090b.offer(runnable);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.v$a */
    static final class C10866a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10865v f26093a;

        static {
            Covode.recordClassIndex(12468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10866a(C10865v vVar) {
            super(1);
            this.f26093a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if ((!C89219l.m154714a(Boolean.valueOf(booleanValue), this.f26093a.f26089a)) && booleanValue) {
                while (!this.f26093a.f26090b.isEmpty()) {
                    Runnable poll = this.f26093a.f26090b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
            }
            this.f26093a.f26089a = Boolean.valueOf(booleanValue);
            return C89391z.f203057a;
        }
    }

    public C10865v(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        C10866a aVar = new C10866a(this);
        this.f26091c = aVar;
        C10837g gVar = new C10837g(dataChannel, aVar);
        gVar.mo17740a(new C10852o());
        gVar.mo17740a(new C10840i());
        gVar.mo17740a(new C10842j());
        gVar.mo17740a(new C10861t());
        gVar.mo17740a(new C10867w());
        gVar.mo17740a(new C10856q());
        gVar.mo17740a(new C10846l());
        this.f26092d = gVar;
    }
}
