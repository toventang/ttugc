package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.C19175b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.impl.AbstractC19205d;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.C19221b;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.C19242a;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a */
public final class C19211a extends AbstractC19174a {

    /* renamed from: b */
    public C19221b f45380b;

    /* renamed from: c */
    public C19242a f45381c;

    /* renamed from: d */
    public final Context f45382d;

    /* renamed from: e */
    private final AbstractC89244h f45383e = C89250i.m154773a((AbstractC89171a) new C19215c(this));

    /* renamed from: f */
    private final AbstractC89244h f45384f = C89250i.m154773a((AbstractC89171a) new C19212a(this));

    /* renamed from: g */
    private final AbstractC89244h f45385g = C89250i.m154773a((AbstractC89171a) new C19214b(this));

    /* renamed from: h */
    private boolean f45386h;

    /* renamed from: i */
    private final AbstractC19205d f45387i;

    /* renamed from: j */
    private final AbstractC18997c f45388j;

    /* renamed from: k */
    private final int f45389k;

    static {
        Covode.recordClassIndex(21978);
    }

    /* renamed from: c */
    private final C19215c.C192161 m35909c() {
        return (C19215c.C192161) this.f45383e.getValue();
    }

    /* renamed from: f */
    private final C19212a.C192131 m35910f() {
        return (C19212a.C192131) this.f45384f.getValue();
    }

    /* renamed from: g */
    private final ComponentName m35911g() {
        return (ComponentName) this.f45385g.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a$a */
    static final class C19212a extends AbstractC89220m implements AbstractC89171a<C192131> {

        /* renamed from: a */
        final /* synthetic */ C19211a f45390a;

        static {
            Covode.recordClassIndex(21979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19212a(C19211a aVar) {
            super(0);
            this.f45390a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C192131 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.C19211a.C19212a.C192131 */

                /* renamed from: a */
                final /* synthetic */ C19212a f45391a;

                static {
                    Covode.recordClassIndex(21980);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f45391a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    AbstractC19158c cVar;
                    C19175b bVar = this.f45391a.f45390a.f45324a;
                    if (bVar != null && (cVar = bVar.f45329e) != null) {
                        cVar.mo30397d(new C19194c("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a$c */
    static final class C19215c extends AbstractC89220m implements AbstractC89171a<C192161> {

        /* renamed from: a */
        final /* synthetic */ C19211a f45393a;

        static {
            Covode.recordClassIndex(21982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19215c(C19211a aVar) {
            super(0);
            this.f45393a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C192161 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.C19211a.C19215c.C192161 */

                /* renamed from: a */
                final /* synthetic */ C19215c f45394a;

                static {
                    Covode.recordClassIndex(21983);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f45394a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2;
                    if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
                        C19221b bVar = this.f45394a.f45393a.f45380b;
                        if (bVar != null) {
                            bVar.mo30573a(intent2);
                        }
                        C19242a aVar = this.f45394a.f45393a.f45381c;
                        if (aVar != null) {
                            aVar.mo30594a(intent2);
                        }
                    }
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30490a() {
        super.mo30490a();
        m35913i();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: d */
    public final void mo30462d() {
        C19242a aVar = this.f45381c;
        if (aVar != null) {
            aVar.mo30598b();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a$b */
    static final class C19214b extends AbstractC89220m implements AbstractC89171a<ComponentName> {

        /* renamed from: a */
        final /* synthetic */ C19211a f45392a;

        static {
            Covode.recordClassIndex(21981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19214b(C19211a aVar) {
            super(0);
            this.f45392a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ComponentName invoke() {
            return new ComponentName(this.f45392a.f45382d, MediaSessionReceiver.class);
        }
    }

    /* renamed from: h */
    private final void m35912h() {
        EnumC19170o oVar;
        AbstractC19158c cVar;
        C19242a aVar = this.f45381c;
        if (aVar != null) {
            aVar.mo30600d();
        }
        C19221b bVar = this.f45380b;
        if (bVar != null) {
            C19175b bVar2 = this.f45324a;
            if (bVar2 == null || (cVar = bVar2.f45329e) == null || (oVar = cVar.mo30387b()) == null) {
                oVar = EnumC19170o.PLAYBACK_STATE_STOPPED;
            }
            bVar.mo30575a(oVar);
        }
    }

    /* renamed from: i */
    private final void m35913i() {
        AbstractC19205d dVar = this.f45387i;
        if (dVar != null) {
            dVar.mo30554a();
        }
        try {
            C0998a.m3454a(this.f45382d).mo3692a(m35909c());
            this.f45382d.unregisterReceiver(m35910f());
        } catch (Throwable unused) {
        }
        C19221b bVar = this.f45380b;
        if (bVar != null) {
            bVar.mo30373a();
        }
        this.f45380b = null;
        C19242a aVar = this.f45381c;
        if (aVar != null) {
            aVar.mo30373a();
        }
        this.f45381c = null;
        this.f45386h = false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30453a(long j) {
        C19242a aVar = this.f45381c;
        if (aVar != null) {
            aVar.mo30600d();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a$d */
    static final class C19217d extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19211a f45395a;

        static {
            Covode.recordClassIndex(21984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19217d(C19211a aVar) {
            super(1);
            this.f45395a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C19242a aVar = this.f45395a.f45381c;
            if (aVar != null) {
                aVar.mo30595a(bitmap2);
            }
            C19221b bVar = this.f45395a.f45380b;
            if (bVar != null) {
                bVar.mo30574a(bitmap2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30457a(EnumC19170o oVar) {
        boolean z;
        C89219l.m154719c(oVar, "");
        if (oVar != EnumC19170o.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        C19242a aVar = this.f45381c;
        if (aVar != null) {
            aVar.mo30597a(z);
        }
        C19221b bVar = this.f45380b;
        if (bVar != null) {
            bVar.mo30578a(z);
        }
        m35912h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30458a(EnumC19172q qVar) {
        C89219l.m154719c(qVar, "");
        m35912h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30499a(AbstractC19186f fVar) {
        if (fVar == null) {
            m35913i();
            return;
        }
        if (!this.f45386h) {
            C19175b bVar = this.f45324a;
            if (bVar != null) {
                C19242a aVar = new C19242a(this.f45382d, bVar.f45329e, bVar.f45330f, bVar.f45331g, m35911g());
                this.f45380b = new C19221b(this.f45382d, aVar.mo30599c(), bVar.f45330f, m35911g(), this.f45388j, this.f45389k);
                this.f45381c = aVar;
            }
            C0998a.m3454a(this.f45382d).mo3693a(m35909c(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
            m35908b(this.f45382d, m35910f(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f45386h = true;
        }
        C19242a aVar2 = this.f45381c;
        if (aVar2 != null) {
            aVar2.mo30596a(fVar);
        }
        C19221b bVar2 = this.f45380b;
        if (bVar2 != null) {
            bVar2.mo30576a(fVar);
        }
        AbstractC19205d dVar = this.f45387i;
        if (dVar != null) {
            dVar.mo30555a(fVar.getCoverUrl(), new C19217d(this));
        }
        m35912h();
    }

    /* renamed from: a */
    private static Intent m35907a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m35908b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m35907a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.C19211a.m35908b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public C19211a(Context context, AbstractC19205d dVar, AbstractC18997c cVar, int i) {
        C89219l.m154719c(context, "");
        this.f45382d = context;
        this.f45387i = dVar;
        this.f45388j = cVar;
        this.f45389k = i;
    }
}
