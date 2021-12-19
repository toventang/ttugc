package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.AbstractC15295a;
import com.bytedance.helios.api.config.AbstractC15331b;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.C15330a;
import com.bytedance.helios.settings.C15489a;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ttnet.p1701b.C22931b;
import com.google.gson.C27910f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.experiment.C46857dw;
import com.p2082ss.android.ugc.aweme.experiment.C46899ep;
import com.p2082ss.android.ugc.aweme.experiment.C46975gj;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67177b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask */
public final class SkyEyeTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68603);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask$d */
    public static final class C58393d extends AbstractC15331b {
        static {
            Covode.recordClassIndex(68607);
        }

        C58393d() {
        }

        @Override // com.bytedance.helios.api.config.AbstractC15331b
        /* renamed from: c */
        public final AbstractSettingsModel mo25055c() {
            return C15489a.m28507a();
        }

        @Override // com.bytedance.helios.api.config.AbstractC15331b
        /* renamed from: b */
        public final String mo25054b() {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                return "";
            }
            return serverDeviceId;
        }

        @Override // com.bytedance.helios.api.config.AbstractC15331b
        /* renamed from: a */
        public final String mo25053a() {
            String str = C22931b.f54196b;
            if (str == null) {
                return null;
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            return lowerCase;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask$b */
    static final class C58391b implements AbstractC16082i {

        /* renamed from: a */
        final /* synthetic */ SkyEyeTask f132947a;

        static {
            Covode.recordClassIndex(68605);
        }

        C58391b(SkyEyeTask skyEyeTask) {
            this.f132947a = skyEyeTask;
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            SkyEyeTask.m106554c().put("operation", "Switch Settings");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask$e */
    static final class CallableC58394e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC58394e f132949a = new CallableC58394e();

        static {
            Covode.recordClassIndex(68608);
        }

        CallableC58394e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new C27910f().mo46674b(C15489a.m28507a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C46899ep.m90197a() || C46857dw.m90170b()) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    /* renamed from: c */
    public static C0484a<String, Object> m106554c() {
        C0484a<String, Object> aVar = new C0484a<>();
        aVar.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        User b = C80580in.m139683b();
        String str = "";
        C89219l.m154716b(b, str);
        String uid = b.getUid();
        if (uid == null) {
            uid = str;
        }
        aVar.put("uid", uid);
        aVar.put("region_source", C22931b.f54197c);
        String str2 = C22931b.f54196b;
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            C89219l.m154716b(lowerCase, str);
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        aVar.put("region_code", str);
        aVar.put("request_location_permission", Integer.valueOf(LocationServiceImpl.m145036c().mo129343b()));
        for (Map.Entry<String, Object> entry : C63134c.m114157a().mo101466h().entrySet()) {
            aVar.put(entry.getKey(), entry.getValue());
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask$c */
    public static final class C58392c implements AbstractC67177b {

        /* renamed from: a */
        final /* synthetic */ SkyEyeTask f132948a;

        static {
            Covode.recordClassIndex(68606);
        }

        C58392c(SkyEyeTask skyEyeTask) {
            this.f132948a = skyEyeTask;
        }

        @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67177b
        /* renamed from: a */
        public final void mo95778a(Map<String, String> map) {
            String str;
            int a;
            AbstractC15295a a2 = AbstractC15295a.C15296a.m28204a();
            C0484a<String, Object> c = SkyEyeTask.m106554c();
            String str2 = null;
            if (map != null) {
                str = map.get("url");
                if (str != null && (a = C89361p.m154888a((CharSequence) str, "?", 0, false, 6)) > 0) {
                    if (str != null) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        str = str.substring(0, a);
                        C89219l.m154716b(str, "");
                    } else {
                        str = null;
                    }
                }
            } else {
                str = null;
            }
            c.put("operation", "Settings Fetch");
            if (map != null) {
                str2 = map.get("x-tt-logid");
            }
            c.put("logid", str2);
            c.put("url", str);
            a2.recordRegionEvent(c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
            if (C58003a.f132201c && context2 == null) {
                context2 = C58003a.f132199a;
            }
        } else {
            context2 = null;
        }
        Application application = (Application) context2;
        if (application != null) {
            AbstractC15295a a = AbstractC15295a.C15296a.m28204a();
            C58393d dVar = new C58393d();
            Boolean a2 = C49907s.m93685a();
            C89219l.m154716b(a2, "");
            a.init(dVar, new C15330a(application, C17867d.f42595s, a2.booleanValue()));
            if (C58227a.m105170a(application)) {
                AbstractC15295a a3 = AbstractC15295a.C15296a.m28204a();
                C0484a<String, Object> c = m106554c();
                c.put("operation", "Initial Region");
                a3.recordRegionEvent(c);
                C22931b.m43215a().addObserver(new C58390a(this));
                SettingsManager.m29616a().mo25399a(new C58391b(this));
                SettingRequestExtraInfoImpl.m118789a().mo106071a(new C58392c(this));
            }
        }
        if (((Boolean) C46975gj.f109469b.getValue()).booleanValue()) {
            C1731i.m5640b(CallableC58394e.f132949a, C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask$a */
    static final class C58390a implements Observer {

        /* renamed from: a */
        final /* synthetic */ SkyEyeTask f132946a;

        static {
            Covode.recordClassIndex(68604);
        }

        C58390a(SkyEyeTask skyEyeTask) {
            this.f132946a = skyEyeTask;
        }

        public final void update(Observable observable, Object obj) {
            String str;
            String obj2;
            if (observable != null && obj != null && (observable instanceof C22931b)) {
                HashMap hashMap = (HashMap) obj;
                Object obj3 = hashMap.get("store_region");
                String str2 = "";
                String str3 = null;
                if (obj3 == null || (obj2 = obj3.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                    str = obj2.toLowerCase();
                    C89219l.m154716b(str, str2);
                }
                Object obj4 = hashMap.get("region_source");
                if (obj4 != null) {
                    str3 = obj4.toString();
                }
                AbstractC15295a a = AbstractC15295a.C15296a.m28204a();
                C0484a<String, Object> c = SkyEyeTask.m106554c();
                c.put("operation", "Switch Region");
                c.put("region_source", str3);
                if (str != null) {
                    str2 = str;
                }
                c.put("region_code", str2);
                a.recordRegionEvent(c);
            }
        }
    }
}
