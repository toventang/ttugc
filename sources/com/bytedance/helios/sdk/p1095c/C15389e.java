package com.bytedance.helios.sdk.p1095c;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.helios.api.p1088b.AbstractC15305c;
import com.bytedance.helios.api.p1088b.AbstractC15308f;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15304b;
import com.bytedance.helios.api.p1088b.C15307e;
import com.bytedance.helios.api.p1088b.C15312i;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15322p;
import com.bytedance.helios.sdk.C15427e;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1097d.C15400e;
import com.bytedance.helios.sdk.p1105g.C15475b;
import com.bytedance.helios.sdk.utils.C15480b;
import com.bytedance.helios.sdk.utils.C15481c;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.c.e */
public final class C15389e implements AbstractC15305c {

    /* renamed from: a */
    public static final C15390a f37557a = new C15390a((byte) 0);

    /* renamed from: b */
    private static final List<String> f37558b = C89070n.m154522b("0", "-1", "false", "[]", "{}");

    /* renamed from: com.bytedance.helios.sdk.c.e$a */
    public static final class C15390a {
        static {
            Covode.recordClassIndex(17642);
        }

        private C15390a() {
        }

        public /* synthetic */ C15390a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(17641);
    }

    /* renamed from: a */
    private static boolean m28288a(Map.Entry<String, String> entry) {
        if (entry.getKey().length() <= 0 || entry.getValue().length() <= 0 || f37558b.contains(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15305c
    /* renamed from: a */
    public final void mo24824a(AbstractC15308f fVar) {
        String str;
        boolean a;
        String str2;
        String str3;
        long j;
        Object obj;
        boolean z;
        Object obj2;
        String str4;
        long j2;
        boolean z2;
        String obj3;
        C15304b bVar;
        Set<String> set;
        String str5 = "";
        C89219l.m154719c(fVar, str5);
        C15318n nVar = (C15318n) fVar;
        C89219l.m154719c(nVar, str5);
        C15322p pVar = C15475b.f37716b;
        if (pVar != null) {
            if (C89361p.m154874b(nVar.f37370p, "AppOpsException_", false)) {
                nVar.mo24856h("app_ops_config");
                C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.f37369o + " enable=" + pVar.f37389a + " eventId=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                a = pVar.f37389a;
            } else if (C89219l.m154714a((Object) nVar.f37370p, (Object) "AppAutoStartException")) {
                nVar.mo24856h("auto_start_config");
                C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.f37369o + " enable=" + pVar.f37390b + " eventId=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                a = pVar.f37390b;
            } else {
                C15307e eVar = C15475b.f37718d.get(Integer.valueOf(nVar.f37356b));
                if (eVar != null) {
                    nVar.mo24856h("api_");
                    a = C15475b.m28472a(nVar, eVar);
                    C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.f37369o + " enable=" + a + " eventId=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                } else {
                    C15400e b = C15427e.m28380b(nVar.f37356b);
                    if (b == null || (str = b.f37595a) == null) {
                        str = nVar.f37355a;
                    }
                    C15307e eVar2 = C15475b.f37717c.get(str);
                    if (eVar2 != null) {
                        nVar.mo24856h("resource_");
                        a = C15475b.m28472a(nVar, eVar2);
                        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.f37369o + "  enable=" + a + " eventId=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                    } else {
                        nVar.mo24856h("default_");
                        a = C15475b.m28472a(nVar, pVar.f37392d);
                        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.f37369o + "  enable=" + a + " eventId=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                    }
                }
            }
            if (a) {
                Set<String> set2 = nVar.f37379y.f37330f;
                if (set2 == null || set2.isEmpty()) {
                    str2 = str5;
                } else {
                    str2 = C15481c.m28482a(set2);
                }
                C15312i iVar = nVar.f37380z;
                if (iVar == null || (set = iVar.f37337a) == null || set.isEmpty()) {
                    str3 = str5;
                } else {
                    str3 = C15481c.m28482a(set);
                }
                C15304b bVar2 = nVar.f37350B;
                if (bVar2 == null || bVar2.f37324b == 0 || (bVar = nVar.f37350B) == null) {
                    j = 0;
                } else {
                    j = bVar.f37324b - bVar.f37323a;
                }
                String valueOf = String.valueOf(nVar.f37356b);
                String str6 = nVar.f37370p;
                String str7 = nVar.f37358d;
                String str8 = nVar.f37357c;
                String str9 = nVar.f37364j;
                String str10 = nVar.f37363i;
                String str11 = nVar.f37361g;
                String valueOf2 = String.valueOf(nVar.f37366l);
                C15302a aVar = nVar.f37349A;
                if (aVar != null) {
                    obj = Long.valueOf(aVar.f37319b);
                } else {
                    obj = str5;
                }
                String obj4 = obj.toString();
                String str12 = nVar.f37360f;
                if (!nVar.f37377w || !C15373a.f37501b) {
                    z = false;
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(z);
                C15302a aVar2 = nVar.f37349A;
                if (aVar2 != null) {
                    obj2 = Integer.valueOf(aVar2.f37318a);
                } else {
                    obj2 = str5;
                }
                String obj5 = obj2.toString();
                String valueOf4 = String.valueOf(nVar.f37365k);
                C15302a aVar3 = nVar.f37349A;
                if (aVar3 == null || (str4 = aVar3.f37320c) == null) {
                    str4 = str5;
                }
                boolean z3 = nVar.f37372r;
                boolean z4 = nVar.f37372r;
                String str13 = nVar.f37376v;
                String a2 = C15481c.m28482a(nVar.f37368n);
                String a3 = C15480b.m28480a(nVar.f37375u);
                String str14 = nVar.f37373s;
                C15304b bVar3 = nVar.f37350B;
                if (bVar3 != null) {
                    j2 = bVar3.f37323a;
                } else {
                    j2 = 0;
                }
                if (j >= HeliosEnvImpl.INSTANCE.getApiTimeOutDuration()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String valueOf5 = String.valueOf(z2);
                boolean z5 = nVar.f37378x;
                String str15 = nVar.f37351C;
                if (str15 == null) {
                    str15 = str5;
                }
                List<? extends Object> list = nVar.f37352D;
                if (!(list == null || (obj3 = list.toString()) == null)) {
                    str5 = obj3;
                }
                m28287a(new C15387d(valueOf, str6, str8, str7, str9, str10, str11, valueOf2, obj4, a2, valueOf3, str4, obj5, valueOf4, str2, str12, z3, z4, str3, a3, str13, str14, j2, j, valueOf5, z5, str15, str5, nVar.f37353E, C15480b.m28480a(nVar.f37354F)), nVar.f37377w);
            }
        }
    }

    /* renamed from: a */
    private final void m28287a(C15387d dVar, boolean z) {
        C13866d a = C13866d.m25085a(new StackTraceElement(getClass().getName(), "", "", 0), dVar.f37548r, dVar.f37534d, dVar.f37554x, true, "EnsureNotReachHere", "helios_log_type");
        C89219l.m154709a((Object) a, "");
        C0484a aVar = new C0484a();
        aVar.put("EventId", dVar.f37531a);
        aVar.put("EventType", dVar.f37532b);
        aVar.put("EventName", dVar.f37533c);
        aVar.put("EventSubType", dVar.f37534d);
        aVar.put("EventCurrentPage", dVar.f37535e);
        aVar.put("EventTriggerScene", dVar.f37536f);
        aVar.put("EventPageStack", dVar.f37537g);
        aVar.put("EventStartedTime", dVar.f37538h);
        aVar.put("EventReportTime", dVar.f37539i);
        aVar.put("EventStartedExtraInfo", dVar.f37540j);
        aVar.put("EventStartedReflectionStatus", String.valueOf(dVar.f37549s));
        aVar.put("EventAnchorReportCount", dVar.f37544n);
        aVar.put("EventTotalAnchorTimeDelay", dVar.f37545o);
        aVar.put("EventALogIsUpload", dVar.f37542l);
        aVar.put("EventCheckType", dVar.f37543m);
        aVar.put("EventRuleNames", dVar.f37547q);
        aVar.put("EventFrequencyNames", dVar.f37551u);
        aVar.put("EventWarningTypes", dVar.f37552v);
        aVar.put("EventUserRegion", dVar.f37553w);
        aVar.put("SDKVersion", dVar.f37524A);
        aVar.put("CallCloseTime", String.valueOf(dVar.f37555y));
        aVar.put("CloseCostTime", String.valueOf(dVar.f37556z));
        aVar.put("isSystemApiTimeOut", dVar.f37525B);
        aVar.put("CrpCallingType", dVar.f37527D);
        aVar.put("CrpCallingEvents", dVar.f37528E);
        aVar.put("permissionType", dVar.f37529F);
        aVar.put("monitorScene", dVar.f37530G);
        for (Map.Entry entry : aVar.entrySet()) {
            if (m28288a(entry)) {
                a.mo22350c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C0484a aVar2 = new C0484a();
        aVar2.put("EventId", dVar.f37531a);
        aVar2.put("EventType", dVar.f37532b);
        aVar2.put("EventName", dVar.f37533c);
        aVar2.put("EventSubType", dVar.f37534d);
        aVar2.put("EventCurrentPage", dVar.f37535e);
        aVar2.put("EventTriggerScene", dVar.f37536f);
        aVar2.put("EventStartedReflectionStatus", String.valueOf(dVar.f37549s));
        aVar2.put("EventCheckType", dVar.f37543m);
        aVar2.put("EventRuleNames", dVar.f37547q);
        aVar2.put("EventFrequencyNames", dVar.f37551u);
        aVar2.put("EventWarningTypes", dVar.f37552v);
        aVar2.put("EventUserRegion", dVar.f37553w);
        aVar2.put("EventAnchorReportCount", dVar.f37544n);
        if (dVar.f37526C || C89219l.m154714a((Object) dVar.f37531a, (Object) "102600") || C89219l.m154714a((Object) dVar.f37531a, (Object) "100003") || C89219l.m154714a((Object) dVar.f37531a, (Object) "100012")) {
            aVar2.put("EventStartedExtraInfo", dVar.f37540j);
        }
        aVar2.put("isSystemApiTimeOut", dVar.f37525B);
        aVar2.put("CrpCallingType", dVar.f37527D);
        aVar2.put("permissionType", dVar.f37529F);
        aVar2.put("monitorScene", dVar.f37530G);
        for (Map.Entry entry2 : aVar2.entrySet()) {
            if (m28288a(entry2)) {
                a.mo22340a((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C13913i.m25188a(a);
        if (z) {
            C15373a.m28279b();
        }
        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth eventId=" + dVar.f37531a + " eventName=" + dVar.f37533c + ' ' + "eventStartedTime=" + dVar.f37538h + ' ' + "crpCallingType=" + dVar.f37527D + ' ' + "crpCallingEvents=" + dVar.f37528E, (String) null, 12);
        C15484f.m28495b("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth (custom)\n" + a.f33757a.get("custom"));
        C15484f.m28495b("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth (filters)\n" + a.f33757a.get("filters"));
    }
}
