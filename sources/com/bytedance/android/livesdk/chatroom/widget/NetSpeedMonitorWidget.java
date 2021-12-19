package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorNetworkMonitorDurationSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p436af.C6639a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class NetSpeedMonitorWidget extends LiveRecyclableWidget implements AbstractC18511d, AbstractC33974au {

    /* renamed from: g */
    public static final C8147b f20206g = new C8147b((byte) 0);

    /* renamed from: a */
    public int f20207a;

    /* renamed from: b */
    public int f20208b;

    /* renamed from: c */
    final AbstractC89244h f20209c = C89250i.m154773a((AbstractC89171a) new C8159l(this));

    /* renamed from: d */
    final AbstractC89244h f20210d = C89250i.m154773a((AbstractC89171a) C8152f.f20226a);

    /* renamed from: e */
    public NetworkUtils.EnumC29835h f20211e = m16263a(C3966y.m9669e());

    /* renamed from: f */
    public NetworkUtils.EnumC29835h f20212f = m16263a(C3966y.m9669e());

    /* renamed from: h */
    private final AbstractC89244h f20213h = C89250i.m154773a((AbstractC89171a) new C8158k(this));

    /* renamed from: i */
    private final AbstractC89244h f20214i = C89250i.m154773a((AbstractC89171a) C8153g.f20227a);

    /* renamed from: j */
    private final AbstractC89244h f20215j = C89250i.m154773a((AbstractC89171a) C8154h.f20228a);

    /* renamed from: k */
    private final AbstractC89244h f20216k = C89250i.m154773a((AbstractC89171a) C8155i.f20229a);

    /* renamed from: l */
    private final C6639a.AbstractC6640a f20217l = new C8156j(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$a */
    static final class C8145a {

        /* renamed from: c */
        public static final C8146a f20218c = new C8146a((byte) 0);

        /* renamed from: a */
        long f20219a;

        /* renamed from: b */
        long f20220b;

        static {
            Covode.recordClassIndex(8963);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$a$a */
        public static final class C8146a {
            static {
                Covode.recordClassIndex(8964);
            }

            private C8146a() {
            }

            public /* synthetic */ C8146a(byte b) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(8962);
    }

    /* renamed from: c */
    private final C6639a m16264c() {
        return (C6639a) this.f20216k.getValue();
    }

    /* renamed from: a */
    public final Handler mo14383a() {
        return (Handler) this.f20214i.getValue();
    }

    /* renamed from: b */
    public final C8148c mo14384b() {
        return (C8148c) this.f20215j.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$b */
    public static final class C8147b {
        static {
            Covode.recordClassIndex(8965);
        }

        private C8147b() {
        }

        public /* synthetic */ C8147b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$f */
    static final class C8152f extends AbstractC89220m implements AbstractC89171a<C8145a> {

        /* renamed from: a */
        public static final C8152f f20226a = new C8152f();

        static {
            Covode.recordClassIndex(8970);
        }

        C8152f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C8145a invoke() {
            return new C8145a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$h */
    static final class C8154h extends AbstractC89220m implements AbstractC89171a<C8148c> {

        /* renamed from: a */
        public static final C8154h f20228a = new C8154h();

        static {
            Covode.recordClassIndex(8972);
        }

        C8154h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C8148c invoke() {
            return new C8148c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$i */
    static final class C8155i extends AbstractC89220m implements AbstractC89171a<C6639a> {

        /* renamed from: a */
        public static final C8155i f20229a = new C8155i();

        static {
            Covode.recordClassIndex(8973);
        }

        C8155i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6639a invoke() {
            return new C6639a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$k */
    static final class C8158k extends AbstractC89220m implements AbstractC89171a<RunnableC8149d> {

        /* renamed from: a */
        final /* synthetic */ NetSpeedMonitorWidget f20232a;

        static {
            Covode.recordClassIndex(8976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8158k(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            super(0);
            this.f20232a = netSpeedMonitorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC8149d invoke() {
            return new RunnableC8149d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$l */
    static final class C8159l extends AbstractC89220m implements AbstractC89171a<RunnableC8151e> {

        /* renamed from: a */
        final /* synthetic */ NetSpeedMonitorWidget f20233a;

        static {
            Covode.recordClassIndex(8977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8159l(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            super(0);
            this.f20233a = netSpeedMonitorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC8151e invoke() {
            return new RunnableC8151e();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$g */
    static final class C8153g extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C8153g f20227a = new C8153g();

        static {
            Covode.recordClassIndex(8971);
        }

        C8153g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        C6639a c = m16264c();
        c.mo12788b(this.f20217l);
        c.mo12785a();
        mo14383a().removeCallbacksAndMessages(null);
        C18494b.m34422b("anchor_center_net_quality_request", this);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$d */
    public final class RunnableC8149d implements Runnable {
        static {
            Covode.recordClassIndex(8967);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$d$a */
        static final class C8150a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ RunnableC8149d f20224a;

            static {
                Covode.recordClassIndex(8968);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8150a(RunnableC8149d dVar) {
                super(0);
                this.f20224a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C8148c b = NetSpeedMonitorWidget.this.mo14384b();
                int i = NetSpeedMonitorWidget.this.f20207a;
                b.f20221a = System.currentTimeMillis();
                C6501b.C6502a.m13948a("livesdk_netspeed_stuck_show").mo12639a().mo12651a("net_speed", C8148c.m16268a(i)).mo12655b();
                return C89391z.f203057a;
            }
        }

        public final void run() {
            NetSpeedMonitorWidget.this.mo14384b();
            C6501b.C6502a.m13948a("livesdk_netspeed_show").mo12639a().mo12651a("net_speed", C8148c.m16268a(NetSpeedMonitorWidget.this.f20207a)).mo12655b();
            C8145a aVar = (C8145a) NetSpeedMonitorWidget.this.f20210d.getValue();
            int i = NetSpeedMonitorWidget.this.f20207a;
            C8150a aVar2 = new C8150a(this);
            C89219l.m154721d(aVar2, "");
            if (i != 3) {
                aVar.f20220b = 0;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.f20220b == 0) {
                    aVar.f20220b = currentTimeMillis;
                }
                if (currentTimeMillis - aVar.f20220b >= 9000 && currentTimeMillis - aVar.f20219a >= TimeUnit.MINUTES.toMillis(1)) {
                    aVar.f20219a = currentTimeMillis;
                    aVar.f20220b = 0;
                    Context e = C3966y.m9669e();
                    if (!(e == null && (e = C3966y.m9669e()) == null)) {
                        C11226ao.m19883a(e, e.getString(R.string.eea), 0);
                    }
                    aVar2.invoke();
                }
            }
            NetSpeedMonitorWidget.this.mo14383a().postDelayed(this, 3000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC8149d() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$e */
    public final class RunnableC8151e implements Runnable {
        static {
            Covode.recordClassIndex(8969);
        }

        public final void run() {
            NetSpeedMonitorWidget.this.mo14384b();
            C6501b.C6502a.m13948a("livesdk_anchor_change_netspeed_show").mo12639a().mo12651a("net_speed", C8148c.m16268a(NetSpeedMonitorWidget.this.f20207a)).mo12655b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC8151e() {
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        C18494b.m34417a("anchor_center_net_quality_request", this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$c */
    public static final class C8148c {

        /* renamed from: a */
        public long f20221a;

        /* renamed from: b */
        public long f20222b;

        static {
            Covode.recordClassIndex(8966);
        }

        /* renamed from: a */
        static String m16268a(int i) {
            return i != 2 ? i != 3 ? "good" : "stuck" : "bad";
        }

        /* renamed from: a */
        static String m16269a(NetworkUtils.EnumC29835h hVar) {
            int i = C8194t.f20319a[hVar.ordinal()];
            if (i == 1) {
                return "3g";
            }
            if (i == 2) {
                return "4g";
            }
            if (i != 3) {
                return "none";
            }
            return "wifi";
        }
    }

    /* renamed from: a */
    private static NetworkUtils.EnumC29835h m16263a(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C6639a c = m16264c();
        c.mo12786a(this.context);
        c.mo12787a(this.f20217l);
        mo14383a().postDelayed((RunnableC8149d) this.f20213h.getValue(), 3000);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C89219l.m154721d(cVar, "");
        if (C89219l.m154714a((Object) cVar.f44153a, (Object) "anchor_center_net_quality_request")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(C6544e.m13995i()));
            jSONObject.put("quality", this.f20207a);
            C18494b.m34415a(new C18484a("anchor_center_net_quality_changed", currentTimeMillis, new C18738d(jSONObject)));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$j */
    static final class C8156j implements C6639a.AbstractC6640a {

        /* renamed from: a */
        final /* synthetic */ NetSpeedMonitorWidget f20230a;

        static {
            Covode.recordClassIndex(8974);
        }

        C8156j(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            this.f20230a = netSpeedMonitorWidget;
        }

        @Override // com.bytedance.android.livesdk.p436af.C6639a.AbstractC6640a
        /* renamed from: a */
        public final void mo12790a(NetworkUtils.EnumC29835h hVar) {
            if (hVar != NetworkUtils.EnumC29835h.NONE) {
                C8148c b = this.f20230a.mo14384b();
                NetworkUtils.EnumC29835h hVar2 = this.f20230a.f20212f;
                C89219l.m154716b(hVar2, "");
                C89219l.m154716b(hVar, "");
                int i = this.f20230a.f20207a;
                C81571 r3 = new AbstractC89171a<C89391z>(this) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget.C8156j.C81571 */

                    /* renamed from: a */
                    final /* synthetic */ C8156j f20231a;

                    static {
                        Covode.recordClassIndex(8975);
                    }

                    {
                        this.f20231a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f20231a.f20230a.mo14383a().postDelayed((RunnableC8151e) this.f20231a.f20230a.f20209c.getValue(), 9000);
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(hVar2, "");
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(r3, "");
                if (System.currentTimeMillis() - b.f20221a < ((long) LiveAnchorNetworkMonitorDurationSetting.INSTANCE.getValue()) * 1000) {
                    C89219l.m154721d(hVar2, "");
                    C89219l.m154721d(hVar, "");
                    C6501b.C6502a.m13948a("livesdk_anchor_change_network").mo12639a().mo12651a("before_net_status", C8148c.m16269a(hVar2)).mo12651a("after_net_status", C8148c.m16269a(hVar)).mo12651a("before_net_speed", C8148c.m16268a(i)).mo12655b();
                    b.f20222b = System.currentTimeMillis();
                    r3.invoke();
                }
                this.f20230a.f20212f = hVar;
            }
            this.f20230a.f20211e = hVar;
        }
    }
}
