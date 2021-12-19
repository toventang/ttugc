package com.p2082ss.ugc.live.sdk.msg.p4472c;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.p2082ss.ugc.live.sdk.msg.C87075a;
import com.p2082ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87083f;
import com.p2082ss.ugc.live.sdk.msg.p4471b.EnumC87080d;
import com.p2082ss.ugc.live.sdk.msg.p4472c.EnumC87101g;
import com.p2082ss.ugc.live.sdk.msg.p4473d.AbstractC87110f;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87104a;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87106c;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87108e;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87114g;
import com.p2082ss.ugc.live.sdk.msg.p4473d.HandlerC87115h;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import p4600h.C89376n;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.ugc.live.sdk.msg.c.a */
public final class C87087a implements HandlerC87115h.AbstractC87116a {

    /* renamed from: j */
    public static final int f196319j = 12345;

    /* renamed from: k */
    public static final int f196320k = 12346;

    /* renamed from: l */
    public static final int f196321l = 12347;

    /* renamed from: m */
    public static final int f196322m = 12348;

    /* renamed from: n */
    public static final int f196323n = 12349;

    /* renamed from: o */
    public static final C87088a f196324o = new C87088a((byte) 0);

    /* renamed from: r */
    private static int f196325r;

    /* renamed from: a */
    public HandlerThread f196326a;

    /* renamed from: b */
    public HandlerC87115h f196327b;

    /* renamed from: c */
    public HandlerC87115h f196328c;

    /* renamed from: d */
    public HandlerC87115h f196329d;

    /* renamed from: e */
    public final C87099e f196330e;

    /* renamed from: f */
    public final C87090c f196331f;

    /* renamed from: g */
    public final C87075a f196332g;

    /* renamed from: h */
    public final IMessageWsClient f196333h;

    /* renamed from: i */
    public final AbstractC87076a f196334i;

    /* renamed from: p */
    private EnumC87101g f196335p;

    /* renamed from: q */
    private final IMessageClient f196336q;

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$a */
    public static final class C87088a {
        static {
            Covode.recordClassIndex(102884);
        }

        private C87088a() {
        }

        public /* synthetic */ C87088a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$d */
    public static final class RunnableC87091d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C87098d f196341a;

        /* renamed from: b */
        final /* synthetic */ AbstractC87110f f196342b;

        static {
            Covode.recordClassIndex(102887);
        }

        RunnableC87091d(C87098d dVar, AbstractC87110f fVar) {
            this.f196341a = dVar;
            this.f196342b = fVar;
        }

        public final void run() {
            this.f196341a.f196361j.mo13086a(this.f196342b);
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$c */
    public static final class C87090c {

        /* renamed from: a */
        public final AtomicLong f196339a;

        /* renamed from: b */
        private final long f196340b;

        static {
            Covode.recordClassIndex(102886);
        }

        C87090c() {
            long nextLong = AbstractC89255c.Default.nextLong(0, 10000);
            this.f196340b = nextLong;
            this.f196339a = new AtomicLong(nextLong);
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$h */
    public static final class HandlerThreadC87095h extends HandlerThread {

        /* renamed from: a */
        final /* synthetic */ C87087a f196349a;

        static {
            Covode.recordClassIndex(102891);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f196349a.f196327b = new HandlerC87115h(getLooper(), this.f196349a);
            this.f196349a.f196328c = new HandlerC87115h(getLooper(), this.f196349a);
            this.f196349a.f196329d = new HandlerC87115h(getLooper(), this.f196349a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerThreadC87095h(C87087a aVar, String str) {
            super(str);
            this.f196349a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(102883);
        f196325r = 12345;
        f196325r = 12346;
        f196325r = 12347;
        f196325r = 12348;
        f196325r = 12349;
        f196325r = 12350;
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$b */
    final class RunnableC87089b implements Runnable {

        /* renamed from: a */
        public final long f196337a;

        static {
            Covode.recordClassIndex(102885);
        }

        public final void run() {
            C87098d a = C87087a.this.f196330e.mo140811a(this.f196337a);
            if (a != null) {
                C87104a.m150852a(C87087a.this.f196332g, "ws uplink timeout, serviceId: " + a.f196358g + ", uniqueId: " + a.f196357f);
                a.mo140809a(new C87097c(-2, "ws timeout", null, 4, null), EnumC87101g.WS_MSG_ORIGIN, C87087a.this.f196333h.isWsConnected());
                C87087a.this.mo140802a(a);
            }
        }

        public RunnableC87089b(long j) {
            this.f196337a = j;
        }
    }

    /* renamed from: a */
    private final void m150833a() {
        try {
            for (Map.Entry<Long, C87098d> entry : this.f196330e.f196365a.entrySet()) {
                entry.getValue().mo140809a(new C87097c(-4, "released", null, 4, null), this.f196335p, this.f196333h.isWsConnected());
                mo140802a(entry.getValue());
            }
            this.f196330e.f196365a.clear();
            HandlerThread handlerThread = this.f196326a;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$e */
    public static final class C87092e implements AbstractC87079c {

        /* renamed from: a */
        final /* synthetic */ C87087a f196343a;

        /* renamed from: b */
        final /* synthetic */ C87098d f196344b;

        static {
            Covode.recordClassIndex(102888);
        }

        @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c
        /* renamed from: a */
        public final void mo13086a(AbstractC87110f<C87083f, ? extends Exception> fVar) {
            Message obtainMessage;
            C89219l.m154719c(fVar, "");
            this.f196344b.f196353b = fVar;
            HandlerC87115h hVar = this.f196343a.f196328c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(C87087a.f196322m, this.f196344b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        C87092e(C87087a aVar, C87098d dVar) {
            this.f196343a = aVar;
            this.f196344b = dVar;
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$f */
    public static final class C87093f implements AbstractC87079c {

        /* renamed from: a */
        final /* synthetic */ C87087a f196345a;

        /* renamed from: b */
        final /* synthetic */ C87098d f196346b;

        static {
            Covode.recordClassIndex(102889);
        }

        @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c
        /* renamed from: a */
        public final void mo13086a(AbstractC87110f<C87083f, ? extends Exception> fVar) {
            Message obtainMessage;
            C89219l.m154719c(fVar, "");
            this.f196346b.f196353b = fVar;
            HandlerC87115h hVar = this.f196345a.f196328c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(C87087a.f196322m, this.f196346b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        C87093f(C87087a aVar, C87098d dVar) {
            this.f196345a = aVar;
            this.f196346b = dVar;
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$g */
    public static final class C87094g implements AbstractC87079c {

        /* renamed from: a */
        final /* synthetic */ C87087a f196347a;

        /* renamed from: b */
        final /* synthetic */ C87098d f196348b;

        static {
            Covode.recordClassIndex(102890);
        }

        @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c
        /* renamed from: a */
        public final void mo13086a(AbstractC87110f<C87083f, ? extends Exception> fVar) {
            Message obtainMessage;
            C89219l.m154719c(fVar, "");
            this.f196348b.f196352a = fVar;
            HandlerC87115h hVar = this.f196347a.f196328c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(C87087a.f196321l, this.f196348b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        C87094g(C87087a aVar, C87098d dVar) {
            this.f196347a = aVar;
            this.f196348b = dVar;
        }
    }

    /* renamed from: a */
    public final void mo140802a(C87098d dVar) {
        AbstractC87110f<C87083f, Exception> fVar;
        HandlerC87115h hVar;
        C87104a.m150852a(this.f196332g, "uplink request finished, serviceId: " + dVar.f196358g + ", uniqueId: " + dVar.f196357f);
        this.f196330e.mo140812a(dVar);
        Runnable runnable = dVar.f196356e;
        if (!(runnable == null || (hVar = this.f196327b) == null)) {
            hVar.removeCallbacks(runnable);
        }
        dVar.f196355d.mo140813a(this.f196332g);
        try {
            fVar = dVar.mo140810b();
        } catch (Exception e) {
            fVar = AbstractC87110f.C87111a.m150860a(e);
        }
        C87108e.m150857a(new RunnableC87091d(dVar, fVar));
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4473d.HandlerC87115h.AbstractC87116a
    /* renamed from: a */
    public final void mo140801a(Message message) {
        byte[] bArr;
        if (message != null) {
            int i = message.what;
            if (i == f196319j) {
                Object obj = message.obj;
                if (obj != null) {
                    C87098d dVar = (C87098d) obj;
                    C87099e eVar = this.f196330e;
                    C89219l.m154719c(dVar, "");
                    eVar.f196365a.put(Long.valueOf(dVar.f196357f), dVar);
                    EnumC87101g gVar = this.f196335p;
                    boolean isWsConnected = this.f196333h.isWsConnected();
                    C89219l.m154719c(gVar, "");
                    C87100f fVar = dVar.f196355d;
                    C89219l.m154719c(gVar, "");
                    fVar.f196370e = System.currentTimeMillis();
                    fVar.f196366a = gVar;
                    fVar.f196368c = isWsConnected;
                    if ((this.f196335p == EnumC87101g.WS_MSG_ORIGIN || this.f196335p == EnumC87101g.WS_ORIGIN) && this.f196333h.isWsConnected()) {
                        try {
                            C87104a.m150852a(this.f196332g, "send uplink packet by ws, serviceId: " + dVar.f196358g + ", uniqueId: " + dVar.f196357f);
                            SdkUplinkPacket a = dVar.mo140807a();
                            RunnableC87089b bVar = new RunnableC87089b(dVar.f196357f);
                            dVar.f196356e = bVar;
                            byte[] encode = a.encode();
                            C89219l.m154709a((Object) encode, "");
                            Long l = a.uniqueID;
                            C89219l.m154709a((Object) l, "");
                            long longValue = l.longValue();
                            Long l2 = a.uniqueID;
                            C89219l.m154709a((Object) l2, "");
                            long longValue2 = l2.longValue();
                            C89219l.m154719c("pb", "");
                            C89219l.m154719c("uplink_im_gateway", "");
                            C89219l.m154719c(encode, "");
                            if (this.f196333h.isWsConnected()) {
                                this.f196333h.sendUplinkPacket(new PayloadItem("uplink_im_gateway", "pb", encode, new ArrayList(), longValue, longValue2));
                            }
                            C87075a aVar = this.f196332g;
                            String str = "post ws timeout task, timeout: " + dVar.f196359h;
                            C89219l.m154719c(aVar, "");
                            C89219l.m154719c(str, "");
                            if (aVar.supportDebugInfo()) {
                                aVar.log("MessageManagerV2", str);
                            }
                            HandlerC87115h hVar = this.f196327b;
                            if (hVar != null) {
                                hVar.postDelayed(bVar, dVar.f196359h);
                            }
                        } catch (Exception e) {
                            m150836a(dVar, dVar.f196358g, this.f196335p, this.f196333h.isWsConnected(), e);
                        }
                    } else if (this.f196335p == EnumC87101g.WS_MSG_ORIGIN) {
                        try {
                            C87104a.m150852a(this.f196332g, "send uplink packet by uplink http, serviceId: " + dVar.f196358g + ", uniqueId: " + dVar.f196357f);
                            String a2 = this.f196334i.mo13090a();
                            C89219l.m154719c(a2, "");
                            C87081e a3 = new C87081e.C87082a().mo140794b("application/protobuf").mo140791a(a2).mo140792a(dVar.mo140807a().encode()).mo140793a();
                            C89219l.m154709a((Object) a3, "");
                            this.f196336q.mo14436a(a3, new C87094g(this, dVar));
                        } catch (Exception e2) {
                            m150836a(dVar, dVar.f196358g, this.f196335p, this.f196333h.isWsConnected(), e2);
                        }
                    } else {
                        try {
                            C87104a.m150852a(this.f196332g, "send uplink packet by origin http, serviceId: " + dVar.f196358g + ", uniqueId: " + dVar.f196357f);
                            EnumC87080d dVar2 = dVar.f196360i.f196301a;
                            if (dVar2 == null) {
                                dVar2 = EnumC87080d.POST;
                            }
                            int i2 = C87096b.f196350a[dVar2.ordinal()];
                            if (i2 == 1) {
                                this.f196336q.mo14436a(dVar.f196360i, new C87092e(this, dVar));
                            } else if (i2 == 2) {
                                this.f196336q.mo14437b(dVar.f196360i, new C87093f(this, dVar));
                            }
                        } catch (Exception e3) {
                            m150836a(dVar, dVar.f196358g, this.f196335p, this.f196333h.isWsConnected(), e3);
                        }
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                String str2 = "server error";
                if (i == f196320k) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        PayloadItem payloadItem = (PayloadItem) obj2;
                        if (payloadItem == null) {
                            try {
                                bArr = new byte[1];
                            } catch (Exception e4) {
                                C87104a.m150852a(this.f196332g, "receive uplink packet by ws error");
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                String message2 = e4.getMessage();
                                if (message2 == null) {
                                    message2 = "Unknown exception";
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("error", message2);
                                jSONObject3.put("log_id", payloadItem.getLogId());
                                this.f196332g.monitor("uplink_receive_ws_packet_error", jSONObject, jSONObject2, jSONObject3);
                                C87104a.m150852a(this.f196332g, "receive ws uplink packet error: ".concat(String.valueOf(message2)));
                                return;
                            }
                        } else {
                            bArr = payloadItem.getPayload();
                            if (C89219l.m154714a((Object) C87114g.m150862a(payloadItem), (Object) "gzip")) {
                                bArr = C87106c.m150855a(bArr);
                                C89219l.m154709a((Object) bArr, "");
                            } else {
                                C89219l.m154709a((Object) bArr, "");
                            }
                        }
                        SdkUplinkPacket decode = SdkUplinkPacket.ADAPTER.decode(bArr);
                        C87104a.m150852a(this.f196332g, "receive uplink packet by ws, logId: " + C87114g.m150863a(decode));
                        C87099e eVar2 = this.f196330e;
                        Long l3 = decode.uniqueID;
                        C89219l.m154709a((Object) l3, "");
                        C87098d a4 = eVar2.mo140811a(l3.longValue());
                        if (a4 == null) {
                            Long l4 = decode.serviceID;
                            C89219l.m154709a((Object) l4, "");
                            long longValue3 = l4.longValue();
                            Long l5 = decode.uniqueID;
                            C89219l.m154709a((Object) l5, "");
                            m150834a(longValue3, l5.longValue(), payloadItem.getLogId(), "receiveWSPayload");
                            return;
                        }
                        Integer num = decode.uplinkStrategy;
                        C89219l.m154709a((Object) num, "");
                        this.f196335p = EnumC87101g.C87102a.m150851a(num.intValue());
                        Integer num2 = decode.statusCode;
                        if (num2 != null && num2.intValue() == 0) {
                            C89219l.m154709a((Object) decode, "");
                            a4.mo140808a(decode, EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected(), true);
                        } else {
                            Integer num3 = decode.statusCode;
                            C89219l.m154709a((Object) num3, "");
                            int intValue = num3.intValue();
                            String str3 = decode.statusMessage;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            a4.mo140809a(new C87097c(intValue, str2, null, 4, null), EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected());
                        }
                        mo140802a(a4);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                } else if (i == f196321l) {
                    Object obj3 = message.obj;
                    if (obj3 != null) {
                        C87098d dVar3 = (C87098d) obj3;
                        C87098d a5 = this.f196330e.mo140811a(dVar3.f196357f);
                        if (a5 == null) {
                            m150834a(dVar3.f196358g, dVar3.f196357f, 0, "receiveMsgHttpResult");
                            return;
                        }
                        try {
                            AbstractC87110f<C87083f, ? extends Exception> fVar2 = a5.f196352a;
                            if (fVar2 != null) {
                                if (fVar2 instanceof AbstractC87110f.C87113c) {
                                    SdkUplinkPacket decode2 = SdkUplinkPacket.ADAPTER.decode(((AbstractC87110f.C87113c) fVar2).f196386b.f196315d);
                                    C87104a.m150852a(this.f196332g, "receive uplink packet by msg http, logId: " + C87114g.m150863a(decode2));
                                    Integer num4 = decode2.uplinkStrategy;
                                    C89219l.m154709a((Object) num4, "");
                                    this.f196335p = EnumC87101g.C87102a.m150851a(num4.intValue());
                                    Integer num5 = decode2.statusCode;
                                    if (num5 != null && num5.intValue() == 0) {
                                        C89219l.m154709a((Object) decode2, "");
                                        a5.mo140808a(decode2, EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected(), false);
                                    } else {
                                        Integer num6 = decode2.statusCode;
                                        C89219l.m154709a((Object) num6, "");
                                        int intValue2 = num6.intValue();
                                        String str4 = decode2.statusMessage;
                                        if (str4 != null) {
                                            str2 = str4;
                                        }
                                        a5.mo140809a(new C87097c(intValue2, str2, null, 4, null), EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected());
                                    }
                                } else if (fVar2 instanceof AbstractC87110f.C87112b) {
                                    E e5 = ((AbstractC87110f.C87112b) fVar2).f196385b;
                                    C87104a.m150852a(this.f196332g, "receive uplink packet by msg error");
                                    a5.mo140809a(e5, EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected());
                                } else {
                                    throw new C89376n();
                                }
                            }
                        } catch (Exception e6) {
                            a5.mo140809a(e6, EnumC87101g.WS_MSG_ORIGIN, this.f196333h.isWsConnected());
                        }
                        mo140802a(a5);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                } else if (i == f196322m) {
                    Object obj4 = message.obj;
                    if (obj4 != null) {
                        C87098d dVar4 = (C87098d) obj4;
                        C87104a.m150852a(this.f196332g, "receive uplink packet by origin http");
                        C87098d a6 = this.f196330e.mo140811a(dVar4.f196357f);
                        if (a6 == null) {
                            m150834a(dVar4.f196358g, dVar4.f196357f, 0, "receiveOriginHttpResult");
                            return;
                        }
                        try {
                            AbstractC87110f<C87083f, ? extends Exception> fVar3 = a6.f196353b;
                            if (fVar3 != null) {
                                if (fVar3 instanceof AbstractC87110f.C87113c) {
                                    V v = ((AbstractC87110f.C87113c) fVar3).f196386b;
                                    EnumC87101g gVar2 = EnumC87101g.ORIGIN;
                                    boolean isWsConnected2 = this.f196333h.isWsConnected();
                                    C89219l.m154719c(v, "");
                                    C89219l.m154719c(gVar2, "");
                                    a6.f196354c = v;
                                    C87100f fVar4 = a6.f196355d;
                                    C89219l.m154719c(v, "");
                                    C89219l.m154719c(gVar2, "");
                                    fVar4.f196371f = System.currentTimeMillis();
                                    fVar4.f196367b = gVar2;
                                    fVar4.f196369d = isWsConnected2;
                                    fVar4.f196372g = true;
                                    fVar4.f196373h = v.f196312a;
                                    String str5 = v.f196313b;
                                    C89219l.m154709a((Object) str5, "");
                                    fVar4.f196374i = str5;
                                } else if (fVar3 instanceof AbstractC87110f.C87112b) {
                                    a6.mo140809a(((AbstractC87110f.C87112b) fVar3).f196385b, EnumC87101g.ORIGIN, this.f196333h.isWsConnected());
                                } else {
                                    throw new C89376n();
                                }
                            }
                        } catch (Exception e7) {
                            a6.mo140809a(e7, EnumC87101g.ORIGIN, this.f196333h.isWsConnected());
                        }
                        mo140802a(a6);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                } else if (i == f196323n) {
                    m150833a();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m150834a(long j, long j2, long j3, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receive_type", str);
        jSONObject.put("service_id", j);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("log_id", j3);
        jSONObject3.put("unique_id", j2);
        this.f196332g.monitor("uplink_receive_request_no_item_found_error", jSONObject, jSONObject2, jSONObject3);
        C87104a.m150852a(this.f196332g, "no request item found");
    }

    public C87087a(C87075a aVar, IMessageWsClient iMessageWsClient, IMessageClient iMessageClient, AbstractC87076a aVar2) {
        EnumC87101g gVar;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(iMessageWsClient, "");
        C89219l.m154719c(iMessageClient, "");
        C89219l.m154719c(aVar2, "");
        this.f196332g = aVar;
        this.f196333h = iMessageWsClient;
        this.f196336q = iMessageClient;
        this.f196334i = aVar2;
        if (aVar2.mo13091b() && aVar2.mo13092c()) {
            gVar = EnumC87101g.WS_MSG_ORIGIN;
        } else if (aVar2.mo13091b()) {
            gVar = EnumC87101g.WS_ORIGIN;
        } else {
            gVar = EnumC87101g.ORIGIN;
        }
        this.f196335p = gVar;
        this.f196330e = new C87099e();
        this.f196331f = new C87090c();
    }

    /* renamed from: a */
    private final void m150835a(long j, EnumC87101g gVar, boolean z, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_id", j);
        jSONObject.put("send_uplink_strategy", gVar.getStrategy(z));
        jSONObject.put("ws_connected", z);
        JSONObject jSONObject2 = new JSONObject();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown exception";
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error", message);
        this.f196332g.monitor("uplink_send_error", jSONObject, jSONObject2, jSONObject3);
        C87104a.m150852a(this.f196332g, "uplink send error, use strategy: " + gVar.getStrategy(z) + ", ws connect: " + z + ", error: " + message);
    }

    /* renamed from: a */
    private final void m150836a(C87098d dVar, long j, EnumC87101g gVar, boolean z, Exception exc) {
        dVar.mo140809a(new C87097c(-5, "sendRequestError", null, 4, null), this.f196335p, this.f196333h.isWsConnected());
        mo140802a(dVar);
        m150835a(j, gVar, z, exc);
    }
}
