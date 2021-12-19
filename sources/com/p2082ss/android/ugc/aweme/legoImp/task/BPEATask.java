package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.p789q.C12593n;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13351l;
import com.bytedance.bpea.basics.EnumC13348i;
import com.bytedance.bpea.core.C13353a;
import com.bytedance.bpea.core.p868a.AbstractC13354a;
import com.bytedance.bpea.core.p868a.C13359f;
import com.bytedance.bpea.core.p868a.EnumC13356c;
import com.bytedance.bpea.core.p868a.EnumC13357d;
import com.bytedance.bpea.core.p870c.AbstractC13367e;
import com.bytedance.bpea.core.p870c.C13361a;
import com.bytedance.bpea.core.p870c.EnumC13368f;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.AbstractC15295a;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.p1097d.C15397d;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.settings.C68735c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask */
public final class BPEATask implements AbstractC58264w {

    /* renamed from: a */
    public final String f132813a = "BPEA";

    /* renamed from: b */
    public String f132814b = "";

    static {
        Covode.recordClassIndex(68413);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask$b */
    public static final class C58320b implements AbstractC13354a {
        static {
            Covode.recordClassIndex(68416);
        }

        C58320b() {
        }

        @Override // com.bytedance.bpea.core.p868a.AbstractC13354a
        /* renamed from: b */
        public final EnumC13356c mo21599b(C13345f fVar) {
            C89219l.m154721d(fVar, "");
            return EnumC13356c.WARNING;
        }

        @Override // com.bytedance.bpea.core.p868a.AbstractC13354a
        /* renamed from: a */
        public final boolean mo21598a(C13345f fVar) {
            String[] strArr;
            String[] strArr2;
            String[] strArr3;
            String[] strArr4;
            C89219l.m154721d(fVar, "");
            String[] strArr5 = fVar.f32612b;
            if ((strArr5 == null || !C89064i.m154489a(strArr5, "clipboard")) && (((strArr = fVar.f32612b) == null || !C89064i.m154489a(strArr, "latitudeAndLongitude")) && (((strArr2 = fVar.f32612b) == null || !C89064i.m154489a(strArr2, "locationSDK")) && (((strArr3 = fVar.f32612b) == null || !C89064i.m154489a(strArr3, "video")) && ((strArr4 = fVar.f32612b) == null || !C89064i.m154489a(strArr4, DataType.AUDIO)))))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask$c */
    public static final class C58321c implements AbstractC13354a {
        static {
            Covode.recordClassIndex(68417);
        }

        C58321c() {
        }

        @Override // com.bytedance.bpea.core.p868a.AbstractC13354a
        /* renamed from: b */
        public final EnumC13356c mo21599b(C13345f fVar) {
            C89219l.m154721d(fVar, "");
            return EnumC13356c.WARNING;
        }

        @Override // com.bytedance.bpea.core.p868a.AbstractC13354a
        /* renamed from: a */
        public final boolean mo21598a(C13345f fVar) {
            String[] strArr;
            String[] strArr2;
            String[] strArr3;
            String[] strArr4;
            C89219l.m154721d(fVar, "");
            String[] strArr5 = fVar.f32612b;
            if ((strArr5 == null || !C89064i.m154489a(strArr5, "clipboard")) && (((strArr = fVar.f32612b) == null || !C89064i.m154489a(strArr, "latitudeAndLongitude")) && (((strArr2 = fVar.f32612b) == null || !C89064i.m154489a(strArr2, "locationSDK")) && (((strArr3 = fVar.f32612b) == null || !C89064i.m154489a(strArr3, "video")) && ((strArr4 = fVar.f32612b) == null || !C89064i.m154489a(strArr4, DataType.AUDIO)))))) {
                return false;
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask$a */
    static final class C58318a implements AbstractC16082i {

        /* renamed from: a */
        final /* synthetic */ BPEATask f132815a;

        static {
            Covode.recordClassIndex(68414);
        }

        C58318a(BPEATask bPEATask) {
            this.f132815a = bPEATask;
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.legoImp.task.BPEATask.C58318a.CallableC583191 */

                /* renamed from: a */
                final /* synthetic */ C58318a f132816a;

                static {
                    Covode.recordClassIndex(68415);
                }

                {
                    this.f132816a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Thread currentThread = Thread.currentThread();
                    C89219l.m154716b(currentThread, "");
                    currentThread.getName();
                    BPEATask.m105487c();
                    return C89391z.f203057a;
                }
            }, C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static void m105487c() {
        try {
            C28022o a = C68735c.m121168a();
            if (a != null) {
                AbstractC28019l c = a.mo46803c("maxAppVersion");
                C89219l.m154716b(c, "");
                String c2 = c.mo46689c();
                C89219l.m154716b(c2, "");
                if (C17867d.m33083d() <= ((long) Integer.parseInt(c2))) {
                    String oVar = a.toString();
                    C89219l.m154716b(oVar, "");
                    C13359f.m24039a(oVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask$d */
    public static final class C58322d implements AbstractC13367e {

        /* renamed from: a */
        final /* synthetic */ BPEATask f132817a;

        static {
            Covode.recordClassIndex(68418);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58322d(BPEATask bPEATask) {
            this.f132817a = bPEATask;
        }

        @Override // com.bytedance.bpea.core.p870c.AbstractC13367e
        public final void onEvent(C13361a aVar) {
            String str;
            C89219l.m154721d(aVar, "");
            if (aVar.f32654e == EnumC13368f.END_CHECK) {
                StringBuilder sb = new StringBuilder("bpea_end_check_cert|");
                AbstractC13343d dVar = aVar.f32652c;
                String str2 = null;
                if (dVar != null) {
                    str = dVar.certToken();
                } else {
                    str = null;
                }
                StringBuilder append = sb.append(str).append('|');
                C13345f fVar = aVar.f32653d;
                if (fVar != null) {
                    str2 = fVar.f32611a;
                }
                ALog.m59869i(this.f132817a.f132813a, append.append(str2).append("|timeAnchor:").append(aVar.f32650a).toString());
            }
            if (aVar.f32654e == EnumC13368f.END_CHECK || aVar.f32654e == EnumC13368f.END_LEGAL_CHECK || aVar.f32654e == EnumC13368f.END_CONDITION_CHECK) {
                this.f132817a.mo95739a(aVar, aVar.f32654e.toString());
            }
            if (aVar.f32654e != EnumC13368f.END_CHECK) {
                return;
            }
            if (!AbstractC15295a.C15296a.m28204a().isEnabled()) {
                AbstractC15295a.C15296a.m28204a().isEnabled();
            } else {
                this.f132817a.mo95739a(aVar, "ORIGIN_COMPARE");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BPEATask$e */
    public static final class C58323e implements AbstractC13367e {

        /* renamed from: a */
        final /* synthetic */ BPEATask f132818a;

        static {
            Covode.recordClassIndex(68419);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58323e(BPEATask bPEATask) {
            this.f132818a = bPEATask;
        }

        @Override // com.bytedance.bpea.core.p870c.AbstractC13367e
        public final void onEvent(C13361a aVar) {
            Integer num;
            AbstractC13343d dVar;
            String certToken;
            String str;
            int i;
            String str2;
            String str3;
            String str4;
            C89219l.m154721d(aVar, "");
            if (aVar.f32654e == EnumC13368f.END_CHECK) {
                C13345f fVar = aVar.f32653d;
                JSONObject jSONObject = null;
                if (fVar != null) {
                    num = fVar.f32613c;
                } else {
                    num = null;
                }
                int type = EnumC13348i.BPEA_ENTRY.getType();
                if (num != null && num.intValue() == type && (dVar = aVar.f32652c) != null && (certToken = dVar.certToken()) != null && certToken.equals("bpea-742")) {
                    new StringBuilder("auto locate :").append(aVar.f32652c).append(' ').append(aVar.f32653d);
                    if (AbstractC15295a.C15296a.m28204a().isEnabled()) {
                        C13345f fVar2 = aVar.f32653d;
                        if (fVar2 == null || (str4 = fVar2.f32611a) == null || !str4.equals("location_getLastKnownLocation")) {
                            C13345f fVar3 = aVar.f32653d;
                            if (fVar3 == null || (str3 = fVar3.f32611a) == null || !str3.equals("location_requestLocationUpdates")) {
                                C13345f fVar4 = aVar.f32653d;
                                if (fVar4 == null || (str2 = fVar4.f32611a) == null || !str2.equals("location_requestSingleUpdate")) {
                                    C13345f fVar5 = aVar.f32653d;
                                    if (fVar5 != null && (str = fVar5.f32611a) != null && str.equals("location_getCurrentLocation")) {
                                        i = 200004;
                                    } else {
                                        return;
                                    }
                                } else {
                                    i = 200002;
                                }
                            } else {
                                i = 200001;
                            }
                        } else {
                            i = 200000;
                        }
                        long j = aVar.f32650a.f32629a.f32632a;
                        Thread currentThread = Thread.currentThread();
                        C89219l.m154716b(currentThread, "");
                        String name = currentThread.getName();
                        C89219l.m154716b(name, "");
                        C15318n a = new C15397d((Object) null, (Object[]) null, i, j, false, (String) null, (String) null, name, 128).mo25140a(new Throwable());
                        Map<String, Object> map = a.f37368n;
                        AbstractC13343d dVar2 = aVar.f32652c;
                        if (dVar2 != null) {
                            jSONObject = dVar2.toJSON();
                        }
                        map.put("certificate", jSONObject);
                        C15320o.m28228a(a, false);
                        ALog.m59869i("BPEA_Helios", "report >>>> " + a + ",eventTime=" + aVar.f32650a.f32629a.f32632a);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C13351l lVar = new C13351l();
        String a = C12593n.m22697a();
        if (a == null) {
            a = "";
        }
        this.f132814b = a;
        C13353a.m24032a(new C58322d(this));
        C13353a.m24032a(new C58323e(this));
        C13353a.m24031a(EnumC13357d.EMPTY_CERT, new C58320b());
        C13353a.m24031a(EnumC13357d.CONTENT_ILLEGAL, new C58321c());
        C13351l lVar2 = new C13351l();
        m105487c();
        SettingsManager.m29616a().mo25399a(new C58318a(this));
        lVar2.mo21594a();
        lVar.mo21594a();
        m105486a(((float) lVar.f32630b.mo21596a()) / 1000000.0f, ((float) lVar2.f32630b.mo21596a()) / 1000000.0f, "bpea_performance_init");
        m105486a((float) lVar.f32631c.mo21596a(), (float) lVar2.f32631c.mo21596a(), "bpea_performance_init_thread");
    }

    /* renamed from: a */
    public final void mo95739a(C13361a aVar, String str) {
        Integer num;
        String str2;
        JSONObject jSONObject;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject2 = new JSONObject();
        C13345f fVar = aVar.f32653d;
        if (fVar != null) {
            num = fVar.f32613c;
        } else {
            num = null;
        }
        jSONObject2.put("entryCategory", num);
        jSONObject2.put("eventLevel", aVar.f32651b.getValue());
        C13345f fVar2 = aVar.f32653d;
        if (fVar2 != null) {
            str2 = fVar2.f32611a;
        } else {
            str2 = null;
        }
        jSONObject2.put("entryToken", str2);
        jSONObject2.put("eventType", str);
        jSONObject2.put("processName", this.f132814b);
        jSONObject2.put("status", aVar.f32655f);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("costTime", Float.valueOf(((float) aVar.f32650a.f32630b.mo21596a()) / 1000000.0f));
        jSONObject3.put("threadCostTime", aVar.f32650a.f32631c.mo21596a());
        JSONObject jSONObject4 = new JSONObject();
        AbstractC13343d dVar = aVar.f32652c;
        if (dVar != null) {
            jSONObject = dVar.toJSON();
        } else {
            jSONObject = null;
        }
        jSONObject4.put("cert", jSONObject);
        AbstractC13343d dVar2 = aVar.f32652c;
        if (dVar2 != null) {
            str3 = dVar2.certToken();
        } else {
            str3 = null;
        }
        jSONObject4.put("certToken", str3);
        C13345f fVar3 = aVar.f32653d;
        if (fVar3 != null) {
            num2 = fVar3.f32613c;
        } else {
            num2 = null;
        }
        jSONObject4.put("entryCategory", num2);
        C13345f fVar4 = aVar.f32653d;
        if (fVar4 != null) {
            str4 = fVar4.f32611a;
        } else {
            str4 = null;
        }
        jSONObject4.put("entryToken", str4);
        jSONObject4.put("eventLevel", aVar.f32651b.getValue());
        jSONObject4.put("costTime", Float.valueOf(((float) aVar.f32650a.f32630b.mo21596a()) / 1000000.0f));
        jSONObject4.put("threadCostTime", aVar.f32650a.f32631c.mo21596a());
        jSONObject4.put("eventType", str);
        jSONObject4.put("processName", this.f132814b);
        jSONObject4.put("status", aVar.f32655f);
        jSONObject4.put("msg", aVar.f32656g);
        C13345f fVar5 = aVar.f32653d;
        if (!(fVar5 == null || (str6 = fVar5.f32611a) == null)) {
            if (C89361p.m154874b(str6, "locationSDK", false)) {
                str5 = "bpea_event_locationSDK";
            } else if (C89361p.m154874b(str6, "LiveCore", false)) {
                str5 = "bpea_event_LiveCore";
            } else if (C89361p.m154874b(str6, "camera", false)) {
                str5 = "bpea_event_camera";
            } else if (C89361p.m154874b(str6, DataType.AUDIO, false)) {
                str5 = "bpea_event_microphone";
            } else if (C89361p.m154874b(str6, "media", false)) {
                str5 = "bpea_event_media";
            } else if (C89361p.m154874b(str6, "permission", false)) {
                str5 = "bpea_event_permission";
            } else if (C89361p.m154874b(str6, "clipboard", false)) {
                str5 = "bpea_event_clipboard";
            } else if (C89361p.m154874b(str6, "location", false)) {
                str5 = "bpea_event_location";
            }
            C12290b.m22066a(str5, jSONObject2, jSONObject3, jSONObject4);
        }
        str5 = "bpea_event";
        C12290b.m22066a(str5, jSONObject2, jSONObject3, jSONObject4);
    }

    /* renamed from: a */
    private final void m105486a(float f, float f2, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("initCost", Float.valueOf(f));
        jSONObject.put("loadConfigCost", Float.valueOf(f2));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("processName", this.f132814b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("initCost", Float.valueOf(f));
        jSONObject3.put("loadConfigCost", Float.valueOf(f2));
        jSONObject3.put("processName", this.f132814b);
        C12290b.m22066a(str, jSONObject2, jSONObject, jSONObject3);
    }
}
