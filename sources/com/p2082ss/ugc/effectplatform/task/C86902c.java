package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import com.p2082ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4450g.C86791c;
import com.p2082ss.ugc.effectplatform.p4454k.AbstractC86823c;
import com.p2082ss.ugc.effectplatform.p4454k.C86822b;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86999m;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.HashMap;
import java.util.Map;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.c */
public final class C86902c extends AbstractC86851a<Boolean, EffectCheckUpdateResponse> {

    /* renamed from: c */
    public static final C86903a f195926c = new C86903a((byte) 0);

    /* renamed from: d */
    private C87991a<String> f195927d = new C87991a<>(null);

    /* renamed from: f */
    private final C86687a f195928f;

    /* renamed from: g */
    private final String f195929g;

    /* renamed from: h */
    private final String f195930h;

    /* renamed from: i */
    private final int f195931i;

    /* renamed from: j */
    private final Map<String, String> f195932j;

    static {
        Covode.recordClassIndex(102667);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.c$a */
    public static final class C86903a {
        static {
            Covode.recordClassIndex(102668);
        }

        private C86903a() {
        }

        public /* synthetic */ C86903a(byte b) {
            this();
        }
    }

    /* renamed from: g */
    private final boolean m150533g() {
        String str;
        String str2;
        int i = this.f195931i;
        if (i == 0) {
            str = "effect_version" + this.f195929g;
        } else if (i == 1) {
            str = C86989g.m150651b(this.f195929g, this.f195930h);
        } else if (i == 2) {
            str = C86989g.m150647a(this.f195929g);
        } else if (i != 3) {
            str = "effect_version" + this.f195929g;
        } else {
            str = this.f195929g + C88045d.f199951a + "info_sticker_version";
        }
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f195928f.f195467w);
        if (fVar != null) {
            str2 = fVar.mo140007b(str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return false;
        }
        try {
            C86695b bVar = this.f195928f.f195461q;
            if (bVar != null) {
                CheckUpdateVersionModel checkUpdateVersionModel = (CheckUpdateVersionModel) bVar.f195508a.convertJsonToObj(str2, CheckUpdateVersionModel.class);
                if (checkUpdateVersionModel != null) {
                    C87993b.m153065a(this.f195927d, checkUpdateVersionModel.getVersion());
                    return true;
                }
            }
        } catch (Exception e) {
            C88060b.m153136a("CheckUpdateTask", "Json Parse Exception: ".concat(String.valueOf(e)), null);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a, com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C86702f fetchFromNetwork;
        if (!m150533g()) {
            mo140548a(0, 0, 0, new EffectCheckUpdateResponse(true, null, 0, 6, null));
        } else if (!this.f195913e) {
            try {
                C86701e c = mo140550c();
                V v = this.f195928f.f195462r.f199870a;
                if (!(v == null || (fetchFromNetwork = v.fetchFromNetwork(c)) == null)) {
                    String a = C86791c.m150338a(fetchFromNetwork.f195518b);
                    if (!C87007u.m150697a(a) && this.f195928f.f195461q != null) {
                        C86695b bVar = this.f195928f.f195461q;
                        if (bVar != null) {
                            EffectCheckUpdateResponse b = m150532b(bVar, a);
                            if (b != null) {
                                mo140548a(0, 0, 0, b);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo140549a(null, null, new C86840e(10002));
            } catch (Exception e) {
                mo140549a(null, null, new C86840e(e));
                C88060b.m153136a("CheckUpdateTask", "checkUpdate Failed: ".concat(String.valueOf(e)), null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        String str;
        if (C87007u.m150697a(C86999m.m150683a(this.f195928f))) {
            str = "version";
        } else {
            str = C86999m.m150683a(this.f195928f) + C88045d.f199951a + "version";
        }
        AbstractC86823c a = C86822b.m150392a(str, this.f195928f.f195435C);
        String str2 = "";
        boolean z = !C89219l.m154714a((Object) a.mo140057b("app_version", str2), (Object) this.f195928f.f195448d);
        if (z) {
            String str3 = this.f195928f.f195448d;
            if (str3 == null) {
                str3 = str2;
            }
            a.mo140056a("app_version", str3);
        }
        HashMap a2 = C86992i.m150656a(this.f195928f);
        String str4 = this.f195929g;
        if (str4 == null) {
            str4 = str2;
        }
        a2.put("panel", str4);
        int i = this.f195931i;
        String str5 = "/panel/check";
        if (i != 0) {
            if (i == 1) {
                String str6 = this.f195930h;
                if (str6 == null) {
                    str6 = str2;
                }
                a2.put("category", str6);
                str5 = "/category/check";
            } else if (i != 2 && i == 3) {
                str5 = "/sticker/checkUpdate";
            }
        }
        if (z) {
            a2.put("version", str2);
        } else {
            V v = this.f195927d.f199870a;
            if (v != null) {
                str2 = v;
            }
            a2.put("version", str2);
        }
        Map<String, String> map = this.f195932j;
        if (map != null) {
            a2.putAll(map);
        }
        String str7 = this.f195928f.f195469y;
        if (str7 != null) {
            a2.put("test_status", str7);
        }
        return new C86701e(C87002p.m150693a(a2, this.f195928f.f195433A + this.f195928f.f195445a + str5), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ EffectCheckUpdateResponse mo140547a(C86695b bVar, String str) {
        return m150532b(bVar, str);
    }

    /* renamed from: b */
    private static EffectCheckUpdateResponse m150532b(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (EffectCheckUpdateResponse) bVar.f195508a.convertJsonToObj(str, EffectCheckUpdateResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86902c(C86687a aVar, String str, String str2, String str3, int i, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195928f = aVar;
        this.f195929g = str2;
        this.f195930h = str3;
        this.f195931i = i;
        this.f195932j = map;
    }
}
