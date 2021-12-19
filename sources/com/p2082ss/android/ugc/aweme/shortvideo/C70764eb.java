package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14182g;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72742a;
import com.p2082ss.android.ugc.tools.C84401c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eb */
public final class C70764eb {

    /* renamed from: a */
    public final C74172g<?> f158412a;

    /* renamed from: b */
    public final SafeHandler f158413b;

    /* renamed from: c */
    private final ASCameraView f158414c;

    /* renamed from: d */
    private final CameraComponentModel f158415d;

    /* renamed from: e */
    private final C74172g.C74180b f158416e;

    /* renamed from: f */
    private final AbstractC72742a f158417f;

    static {
        Covode.recordClassIndex(83235);
    }

    /* renamed from: a */
    public final void mo111583a(C14207x xVar) {
        C84401c.f188722f.mo123658a("stopRecord() called");
        this.f158412a.mo116669e(xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.eb$a */
    public static final class C70765a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70764eb f158418a;

        /* renamed from: b */
        final /* synthetic */ boolean f158419b;

        /* renamed from: c */
        final /* synthetic */ C14207x f158420c;

        static {
            Covode.recordClassIndex(83236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70765a(C70764eb ebVar, boolean z, C14207x xVar) {
            super(1);
            this.f158418a = ebVar;
            this.f158419b = z;
            this.f158420c = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue <= 0) {
                this.f158418a.f158412a.mo116657a(new AbstractC14182g.C14186d((long) intValue));
            }
            this.f158418a.f158413b.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.C70764eb.C70765a.RunnableC707661 */

                /* renamed from: a */
                final /* synthetic */ C70765a f158421a;

                static {
                    Covode.recordClassIndex(83237);
                }

                {
                    this.f158421a = r1;
                }

                public final void run() {
                    this.f158421a.f158418a.f158412a.mo116672h(true);
                }
            });
            if (!this.f158419b) {
                this.f158418a.f158413b.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.C70764eb.C70765a.RunnableC707672 */

                    /* renamed from: a */
                    final /* synthetic */ C70765a f158422a;

                    static {
                        Covode.recordClassIndex(83238);
                    }

                    {
                        this.f158422a = r1;
                    }

                    public final void run() {
                        this.f158422a.f158418a.mo111583a(this.f158422a.f158420c);
                    }
                });
            }
            this.f158418a.f158412a.mo116650O();
            Runnable runnable = this.f158420c.f34490f;
            if (runnable != null) {
                this.f158418a.f158413b.post(runnable);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.bytedance.creativex.recorder.p940b.p941a.C14207x r11) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C70764eb.onEvent(com.bytedance.creativex.recorder.b.a.x):void");
    }

    public C70764eb(AbstractC14177d dVar, C74172g<?> gVar, C74172g.C74180b bVar, SafeHandler safeHandler, AbstractC72742a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(safeHandler, "");
        C89219l.m154721d(aVar, "");
        this.f158412a = gVar;
        this.f158416e = bVar;
        this.f158413b = safeHandler;
        this.f158417f = aVar;
        this.f158414c = dVar.mo22747A();
        this.f158415d = dVar.mo22803b();
    }
}
