package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.C13341b;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.core.checker.p871a.AbstractC13370a;
import com.bytedance.bpea.core.p868a.C13355b;
import com.bytedance.bpea.core.p868a.C13359f;
import com.bytedance.bpea.core.p868a.EnumC13356c;
import com.bytedance.bpea.core.p868a.EnumC13357d;
import com.bytedance.bpea.core.p869b.C13360a;
import com.bytedance.bpea.core.p870c.C13361a;
import com.bytedance.bpea.core.p870c.C13362b;
import com.bytedance.bpea.core.p870c.EnumC13366d;
import com.bytedance.bpea.core.p870c.EnumC13368f;
import com.bytedance.bpea.core.p872d.C13382a;
import com.bytedance.bpea.core.p872d.C13384b;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.b */
public final class C13378b extends AbstractC13369a {

    /* renamed from: a */
    private final String f32679a = "ConditionChecker";

    static {
        Covode.recordClassIndex(15375);
    }

    public C13378b() {
        super(EnumC13368f.START_CONDITION_CHECK, EnumC13368f.END_CONDITION_CHECK);
    }

    @Override // com.bytedance.bpea.core.checker.AbstractC13379c
    /* renamed from: b */
    public final C13347h mo21621b(AbstractC13343d dVar, C13345f fVar) {
        String certToken;
        String certToken2;
        C89219l.m154719c(fVar, "");
        if (dVar == null || (certToken = dVar.certToken()) == null || certToken.length() == 0) {
            C13341b.m24022a(this.f32679a, "certToken is empty,skip condition check");
            return C13382a.C13383a.m24069b();
        }
        JSONObject jSONObject = new JSONObject();
        if (!(dVar == null || (certToken2 = dVar.certToken()) == null)) {
            C13360a<List<AbstractC13370a>> b = C13359f.m24040b(certToken2);
            if (b.f32647a < 0) {
                C13341b.m24025d(this.f32679a, "parse conditions combine dynamic and default failed,try to parse from default config");
                b = C13359f.m24041c(certToken2);
            }
            if (b.f32647a < 0) {
                EnumC13356c a = C13355b.m24035a(fVar, EnumC13357d.NO_MATCHED_LIMIT);
                String str = "limit parse failed";
                if (a == EnumC13356c.WARNING) {
                    mo21616a(EnumC13366d.WARN);
                    int i = b.f32647a;
                    String str2 = b.f32648b;
                    if (str2 != null) {
                        str = str2;
                    }
                    return new C13347h(i, str);
                } else if (a == EnumC13356c.ERROR) {
                    mo21616a(EnumC13366d.ERROR);
                    int i2 = b.f32647a;
                    String str3 = b.f32648b;
                    if (str3 != null) {
                        str = str3;
                    }
                    throw new C13340a(i2, str);
                }
            }
            T<AbstractC13370a> t = b.f32649c;
            if (t == null || t.isEmpty()) {
                C13341b.m24022a(this.f32679a, "conditions is empty");
            } else {
                for (AbstractC13370a aVar : t) {
                    C13341b.m24022a(this.f32679a, "start check condition:".concat(String.valueOf(aVar)));
                    C13347h a2 = aVar.mo21619a(fVar);
                    C13341b.m24022a(this.f32679a, "check condition result:".concat(String.valueOf(a2)));
                    if (a2.f32619b == 0) {
                        C13384b.C13385a.m24070a(jSONObject, (JSONObject) a2.f32618a.get("translationResult"));
                    } else {
                        int i3 = a2.f32619b;
                        String str4 = a2.f32620c;
                        System.currentTimeMillis();
                        C89219l.m154719c(str4, "");
                        C13362b.m24045a(new C13361a(null, null, EnumC13368f.WARN, i3, str4));
                        C13384b.C13385a.m24070a(jSONObject, (JSONObject) a2.f32618a.get("translationResult"));
                    }
                }
            }
        }
        C13341b.m24022a(this.f32679a, "translateResult:".concat(String.valueOf(jSONObject)));
        return C13382a.C13383a.m24068a(jSONObject);
    }
}
