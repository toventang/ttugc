package com.p2082ss.android.ugc.aweme.sticker.p3957e;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46403b;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b.AbstractC75759f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75690ab;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.e */
public final class C75325e implements AbstractC75759f {
    static {
        Covode.recordClassIndex(88242);
    }

    /* renamed from: b */
    private static boolean m132127b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m132126a();
        C58029j.f132253e = a;
        return a;
    }

    /* renamed from: a */
    private static boolean m132126a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static JSONObject m132124a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private static void m132125a(C75690ab abVar, Effect effect) {
        if (abVar != null && abVar.f170121c != 0) {
            C46403b.m89552a(effect, abVar.f170121c);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k
    /* renamed from: a */
    public final /* synthetic */ void mo118903a(C75691ac acVar, Long l, C75690ab abVar) {
        long j;
        C75691ac acVar2 = acVar;
        C75690ab abVar2 = abVar;
        C89219l.m154721d(acVar2, "");
        Effect effect = acVar2.f170122a;
        m132125a(abVar2, effect);
        if (m132127b()) {
            boolean k = C75466g.m132359k(effect);
            C63244g.m114602a().mo73263I().mo101629a("sticker_download_error_rate", 0, new C69840ar().mo110189a(StringSet.type, String.valueOf(k ? 1 : 0)).mo110189a("url", C63244g.m114602a().mo73261G().mo46674b(effect.getFileUrl())).mo110187a("zip_model", (Integer) 0).mo110189a("duration", String.valueOf(l)).mo110191a());
            AbstractC63190ap I = C63244g.m114602a().mo73263I();
            C69840ar a = new C69840ar().mo110188a("duration", l);
            boolean z = true;
            if (!k) {
                z = false;
            }
            I.mo101635a("type_av_sticker_download_time", a.mo110185a("isAr", Boolean.valueOf(z)).mo110191a());
            C63244g.m114602a().mo73263I().mo101630a("ttlive_download_sticker_all", 0, new C69840ar().mo110188a("duration", l).mo110191a(), m132124a(null));
            long j2 = 0;
            if (abVar2 != null) {
                j = abVar2.f170121c;
            } else {
                j = 0;
            }
            if (l != null) {
                j2 = l.longValue();
            }
            C46403b.m89553a(effect, j, j2, 0, null);
        }
        C80322d.m139251a("tool_performance_resource_download", new C84425b().mo129406a("resource_type", "effect").mo129405a("duration", l).mo129403a("status", 0).mo129406a("resource_id", effect.getEffectId()).mo129407a("is_auto_download", acVar2.f170123b).f188764a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Exception, java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k
    /* renamed from: a */
    public final /* synthetic */ void mo118902a(C75691ac acVar, Long l, Exception exc, C75690ab abVar) {
        long j;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        StackTraceElement[] stackTraceElementArr;
        String str4;
        Integer num3;
        Integer num4;
        C75691ac acVar2 = acVar;
        C75690ab abVar2 = abVar;
        C89219l.m154721d(acVar2, "");
        Effect effect = acVar2.f170122a;
        m132125a(abVar2, effect);
        if (m132127b()) {
            if (abVar2 != null) {
                str3 = abVar2.f170120b;
                Integer num5 = abVar2.f170119a;
                stackTraceElementArr = "";
                if (num5 != null) {
                    stackTraceElementArr = "";
                    if (num5.intValue() == -1) {
                        stackTraceElementArr = exc != null ? exc.getStackTrace() : null;
                    }
                }
            } else {
                str3 = null;
                stackTraceElementArr = "";
            }
            String a = C89219l.m154704a(str3, (Object) stackTraceElementArr);
            AbstractC63190ap I = C63244g.m114602a().mo73263I();
            C69840ar a2 = new C69840ar().mo110189a("sticker_id", effect.getEffectId());
            if (abVar2 == null || (num4 = abVar2.f170119a) == null) {
                str4 = null;
            } else {
                str4 = String.valueOf(num4.intValue());
            }
            I.mo101629a("sticker_download_error_rate", 1, a2.mo110189a("errorCode", str4).mo110189a("errorMsg", a).mo110187a("zip_model", (Integer) 0).mo110189a("url", C63244g.m114602a().mo73261G().mo46674b(effect.getFileUrl())).mo110191a());
            C69840ar arVar = new C69840ar();
            if (abVar2 != null) {
                num3 = abVar2.f170119a;
            } else {
                num3 = null;
            }
            JSONObject a3 = arVar.mo110187a("error_code", num3).mo110189a("error_msg", a).mo110191a();
            C63244g.m114602a().mo73263I().mo101630a("ttlive_download_sticker_all", 1, null, m132124a(a3));
            C63244g.m114602a().mo73263I().mo101629a("ttlive_download_sticker_error", 1, a3);
        }
        Effect effect2 = acVar2.f170122a;
        long j2 = 0;
        if (abVar2 != null) {
            j = abVar2.f170121c;
        } else {
            j = 0;
        }
        if (l != null) {
            j2 = l.longValue();
        }
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        if (abVar2 != null) {
            str = abVar2.f170120b;
        } else {
            str = null;
        }
        exceptionResult.setMsg(str);
        if (!(abVar2 == null || (num2 = abVar2.f170119a) == null)) {
            exceptionResult.setErrorCode(num2.intValue());
        }
        C46403b.m89553a(effect2, j, j2, -1, exceptionResult);
        C84425b a4 = new C84425b().mo129406a("resource_type", "effect").mo129405a("duration", l).mo129403a("status", 1).mo129406a("resource_id", effect.getEffectId()).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0));
        if (abVar2 != null) {
            num = abVar2.f170119a;
        } else {
            num = null;
        }
        C84425b a5 = a4.mo129405a("error_code", num);
        if (abVar2 == null || (str2 = abVar2.f170120b) == null) {
            str2 = "empty_error_msg";
        }
        C80322d.m139251a("tool_performance_resource_download", a5.mo129406a("error_msg", str2).mo129407a("is_auto_download", acVar2.f170123b).f188764a);
    }
}
