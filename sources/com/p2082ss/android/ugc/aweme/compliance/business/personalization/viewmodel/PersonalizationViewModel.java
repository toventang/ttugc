package com.p2082ss.android.ugc.aweme.compliance.business.personalization.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel */
public final class PersonalizationViewModel extends AbstractC1174ac {

    /* renamed from: b */
    public static final C39444a f93071b = new C39444a((byte) 0);

    /* renamed from: a */
    public final AbstractC89244h f93072a = C89250i.m154773a((AbstractC89171a) new C39450g(this));

    /* renamed from: c */
    private final AbstractC89244h f93073c = C89250i.m154773a((AbstractC89171a) C39448e.f93087a);

    /* renamed from: d */
    private final AbstractC89244h f93074d = C89250i.m154773a((AbstractC89171a) C39455k.f93104a);

    /* renamed from: e */
    private final AbstractC89244h f93075e = C89250i.m154773a((AbstractC89171a) C39447d.f93086a);

    /* renamed from: f */
    private final AbstractC89244h f93076f = C89250i.m154773a((AbstractC89171a) C39449f.f93088a);

    /* renamed from: g */
    private final AbstractC89244h f93077g = C89250i.m154773a((AbstractC89171a) C39452h.f93091a);

    static {
        Covode.recordClassIndex(47132);
    }

    /* renamed from: a */
    public final C1213t<Integer> mo68902a() {
        return (C1213t) this.f93073c.getValue();
    }

    /* renamed from: b */
    public final C1213t<Integer> mo68904b() {
        return (C1213t) this.f93074d.getValue();
    }

    /* renamed from: c */
    public final C1213t<Integer> mo68905c() {
        return (C1213t) this.f93075e.getValue();
    }

    /* renamed from: d */
    public final C1213t<Integer> mo68906d() {
        return (C1213t) this.f93076f.getValue();
    }

    /* renamed from: e */
    public final C1213t<Integer> mo68907e() {
        return (C1213t) this.f93077g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$a */
    public static final class C39444a {
        static {
            Covode.recordClassIndex(47133);
        }

        private C39444a() {
        }

        public /* synthetic */ C39444a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$e */
    static final class C39448e extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C39448e f93087a = new C39448e();

        static {
            Covode.recordClassIndex(47137);
        }

        C39448e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(Integer.valueOf(C39608b.m80420f()));
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$d */
    static final class C39447d extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C39447d f93086a = new C39447d();

        static {
            Covode.recordClassIndex(47136);
        }

        C39447d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            int i;
            AdPersonalitySettings adPersonalitySettings;
            Integer partnerAdMode;
            C1213t tVar = new C1213t();
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (partnerAdMode = adPersonalitySettings.getPartnerAdMode()) == null) {
                i = 0;
            } else {
                i = partnerAdMode.intValue();
            }
            tVar.setValue(Integer.valueOf(i));
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$f */
    static final class C39449f extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C39449f f93088a = new C39449f();

        static {
            Covode.recordClassIndex(47138);
        }

        C39449f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            int i;
            AdPersonalitySettings adPersonalitySettings;
            NewPersAdSettings newPersAdSettings;
            Integer mode1P;
            C1213t tVar = new C1213t();
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (newPersAdSettings = adPersonalitySettings.getNewPersAdSettings()) == null || (mode1P = newPersAdSettings.getMode1P()) == null) {
                i = 0;
            } else {
                i = mode1P.intValue();
            }
            tVar.setValue(Integer.valueOf(i));
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$g */
    static final class C39450g extends AbstractC89220m implements AbstractC89171a<LiveData<C89378p<? extends Integer, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f93089a;

        static {
            Covode.recordClassIndex(47139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39450g(PersonalizationViewModel personalizationViewModel) {
            super(0);
            this.f93089a = personalizationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveData<C89378p<? extends Integer, ? extends Integer>> invoke() {
            C1213t<Integer> d = this.f93089a.mo68906d();
            C1213t<Integer> e = this.f93089a.mo68907e();
            C394511 r2 = C394511.f93090a;
            C89219l.m154721d(d, "");
            C89219l.m154721d(e, "");
            C89219l.m154721d(r2, "");
            C1210r rVar = new C1210r();
            rVar.mo4026a(d, new C39445b(d, rVar, r2, e));
            rVar.mo4026a(e, new C39446c(d, rVar, r2, e));
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$h */
    static final class C39452h extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C39452h f93091a = new C39452h();

        static {
            Covode.recordClassIndex(47141);
        }

        C39452h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            int i;
            AdPersonalitySettings adPersonalitySettings;
            NewPersAdSettings newPersAdSettings;
            Integer mode3P;
            C1213t tVar = new C1213t();
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (newPersAdSettings = adPersonalitySettings.getNewPersAdSettings()) == null || (mode3P = newPersAdSettings.getMode3P()) == null) {
                i = 0;
            } else {
                i = mode3P.intValue();
            }
            tVar.setValue(Integer.valueOf(i));
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$i */
    public static final class C39453i implements AbstractC39626c {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f93092a;

        /* renamed from: b */
        final /* synthetic */ Integer f93093b;

        /* renamed from: c */
        final /* synthetic */ Integer f93094c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f93095d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f93096e;

        static {
            Covode.recordClassIndex(47142);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: b */
        public final void mo68909b() {
            new C79459a(C17873f.m33102j()).mo123050a(R.string.bqr).mo123053a();
            if (this.f93095d.element != null) {
                this.f93092a.mo68906d().setValue(this.f93095d.element);
            }
            if (this.f93096e.element != null) {
                this.f93092a.mo68907e().setValue(this.f93096e.element);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: a */
        public final void mo68908a() {
            NewPersAdSettings newPersAdSettings;
            ComplianceSetting complianceSetting;
            NewPersAdSettings g = C39608b.m80421g();
            NewPersAdSettings g2 = C39608b.m80421g();
            AdPersonalitySettings adPersonalitySettings = null;
            if (g2 != null) {
                Integer num = this.f93093b;
                if (num == null) {
                    if (g != null) {
                        num = g.getMode1P();
                    } else {
                        num = null;
                    }
                }
                Integer num2 = this.f93094c;
                if (num2 == null) {
                    if (g != null) {
                        num2 = g.getMode3P();
                    } else {
                        num2 = null;
                    }
                }
                newPersAdSettings = NewPersAdSettings.copy$default(g2, num, null, null, null, num2, null, null, null, 238, null);
            } else {
                newPersAdSettings = null;
            }
            AdPersonalitySettings i = C39608b.m80423i();
            if (i != null) {
                if (newPersAdSettings != null) {
                    g = newPersAdSettings;
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g, null, 393215, null);
            }
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            C39608b.m80415b(complianceSetting);
            if (C17873f.m33102j() instanceof AbstractC59103j) {
                new C79459a(C17873f.m33102j()).mo123050a(R.string.eqs).mo123053a();
            }
        }

        C39453i(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, C89233z.C89238e eVar, C89233z.C89238e eVar2) {
            this.f93092a = personalizationViewModel;
            this.f93093b = num;
            this.f93094c = num2;
            this.f93095d = eVar;
            this.f93096e = eVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$k */
    static final class C39455k extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C39455k f93104a = new C39455k();

        static {
            Covode.recordClassIndex(47144);
        }

        C39455k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            int i;
            AdPersonalitySettings adPersonalitySettings;
            Integer thirdAdMode;
            C1213t tVar = new C1213t();
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (thirdAdMode = adPersonalitySettings.getThirdAdMode()) == null) {
                i = 0;
            } else {
                i = thirdAdMode.intValue();
            }
            tVar.setValue(Integer.valueOf(i));
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$j */
    public static final class C39454j implements AbstractC39626c {

        /* renamed from: a */
        final /* synthetic */ PersonalizationViewModel f93097a;

        /* renamed from: b */
        final /* synthetic */ Integer f93098b;

        /* renamed from: c */
        final /* synthetic */ Integer f93099c;

        /* renamed from: d */
        final /* synthetic */ Integer f93100d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f93101e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89238e f93102f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89238e f93103g;

        static {
            Covode.recordClassIndex(47143);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: b */
        public final void mo68909b() {
            new C79459a(C17873f.m33102j()).mo123050a(R.string.bqr).mo123053a();
            if (this.f93101e.element != null) {
                this.f93097a.mo68902a().setValue(this.f93101e.element);
            }
            if (this.f93102f.element != null) {
                this.f93097a.mo68904b().setValue(this.f93102f.element);
            }
            if (this.f93103g.element != null) {
                this.f93097a.mo68905c().setValue(this.f93103g.element);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: a */
        public final void mo68908a() {
            ComplianceSetting complianceSetting;
            AdPersonalitySettings i = C39608b.m80423i();
            AdPersonalitySettings i2 = C39608b.m80423i();
            AdPersonalitySettings adPersonalitySettings = null;
            Integer num = null;
            if (i2 != null) {
                Integer num2 = this.f93098b;
                if (num2 == null) {
                    if (i != null) {
                        num2 = i.getMode();
                    } else {
                        num2 = null;
                    }
                }
                Integer num3 = this.f93099c;
                if (num3 == null) {
                    if (i != null) {
                        num3 = i.getThirdAdMode();
                    } else {
                        num3 = null;
                    }
                }
                Integer num4 = this.f93100d;
                if (num4 != null) {
                    num = num4;
                } else if (i != null) {
                    num = i.getPartnerAdMode();
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i2, num2, null, null, null, null, null, null, num3, num, null, null, null, null, null, null, null, null, null, null, 523902, null);
            }
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            C39608b.m80415b(complianceSetting);
            if (C17873f.m33102j() instanceof AbstractC59103j) {
                new C79459a(C17873f.m33102j()).mo123050a(R.string.eqs).mo123053a();
            }
        }

        C39454j(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, Integer num3, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3) {
            this.f93097a = personalizationViewModel;
            this.f93098b = num;
            this.f93099c = num2;
            this.f93100d = num3;
            this.f93101e = eVar;
            this.f93102f = eVar2;
            this.f93103g = eVar3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$b */
    static final class C39445b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LiveData f93078a;

        /* renamed from: b */
        final /* synthetic */ C1210r f93079b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f93080c;

        /* renamed from: d */
        final /* synthetic */ LiveData f93081d;

        static {
            Covode.recordClassIndex(47134);
        }

        C39445b(LiveData liveData, C1210r rVar, AbstractC89183m mVar, LiveData liveData2) {
            this.f93078a = liveData;
            this.f93079b = rVar;
            this.f93080c = mVar;
            this.f93081d = liveData2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.r */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(T t) {
            this.f93079b.setValue(this.f93080c.invoke(this.f93078a.getValue(), this.f93081d.getValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel$c */
    static final class C39446c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LiveData f93082a;

        /* renamed from: b */
        final /* synthetic */ C1210r f93083b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f93084c;

        /* renamed from: d */
        final /* synthetic */ LiveData f93085d;

        static {
            Covode.recordClassIndex(47135);
        }

        C39446c(LiveData liveData, C1210r rVar, AbstractC89183m mVar, LiveData liveData2) {
            this.f93082a = liveData;
            this.f93083b = rVar;
            this.f93084c = mVar;
            this.f93085d = liveData2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.r */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(K k) {
            this.f93083b.setValue(this.f93084c.invoke(this.f93082a.getValue(), this.f93085d.getValue()));
        }
    }

    /* renamed from: a */
    private void m80138a(Integer num, Integer num2) {
        String str;
        String str2;
        String str3;
        if (!C80580in.m139687c()) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = null;
            JSONArray jSONArray = new JSONArray();
            String str4 = "on";
            if (num != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_1p_mode").put("value", String.valueOf(num.intValue())));
                eVar.element = (T) mo68906d().getValue();
                mo68906d().setValue(num);
                C33744d dVar = new C33744d();
                if (num.intValue() != 1) {
                    str2 = str4;
                } else {
                    str2 = "off";
                }
                C33744d a = dVar.mo59983a("initial_status", str2);
                if (num.intValue() == 1) {
                    str3 = str4;
                } else {
                    str3 = "off";
                }
                C39162r.m79460a("pa_setting_page_toggle1p", a.mo59983a("final_status", str3).f79943a);
            }
            if (num2 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_3p_mode").put("value", String.valueOf(num2.intValue())));
                eVar2.element = (T) mo68907e().getValue();
                mo68907e().setValue(num2);
                C33744d dVar2 = new C33744d();
                if (num2.intValue() != 1) {
                    str = str4;
                } else {
                    str = "off";
                }
                C33744d a2 = dVar2.mo59983a("initial_status", str);
                if (num2.intValue() != 1) {
                    str4 = "off";
                }
                C39162r.m79460a("pa_setting_page_toggle_3", a2.mo59983a("final_status", str4).f79943a);
            }
            String jSONArray2 = jSONArray.toString();
            C89219l.m154716b(jSONArray2, "");
            C39608b.m80413a(jSONArray2, new C39453i(this, num, num2, eVar, eVar2));
        }
    }

    /* renamed from: a */
    public final void mo68903a(Integer num, Integer num2, Integer num3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!C80580in.m139687c()) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = null;
            C89233z.C89238e eVar3 = new C89233z.C89238e();
            eVar3.element = null;
            JSONArray jSONArray = new JSONArray();
            String str6 = "off";
            if (num != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(num.intValue())));
                eVar.element = (T) mo68902a().getValue();
                mo68902a().setValue(num);
                C33744d dVar = new C33744d();
                if (num.intValue() != 1) {
                    str4 = "on";
                } else {
                    str4 = str6;
                }
                C33744d a = dVar.mo59983a("initial_status", str4);
                if (num.intValue() == 1) {
                    str5 = "on";
                } else {
                    str5 = str6;
                }
                C39162r.m79460a("change_personalization_status", a.mo59983a("final_status", str5).f79943a);
                if (num.intValue() == 1) {
                    C39162r.m79460a("personalized_ads_on", new C33744d().mo59983a("enter_from", "personalization_data").f79943a);
                } else {
                    C39162r.m79460a("personalized_ads_off", new C33744d().mo59983a("enter_from", "personalization_data").f79943a);
                }
            }
            if (num2 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf(num2.intValue())));
                eVar2.element = (T) mo68904b().getValue();
                mo68904b().setValue(num2);
                C33744d dVar2 = new C33744d();
                if (num2.intValue() != 1) {
                    str2 = "on";
                } else {
                    str2 = str6;
                }
                C33744d a2 = dVar2.mo59983a("initial_status", str2);
                if (num2.intValue() == 1) {
                    str3 = "on";
                } else {
                    str3 = str6;
                }
                C39162r.m79460a("change_ad_third_party_network_status", a2.mo59983a("final_status", str3).f79943a);
            }
            if (num3 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf(num3.intValue())));
                eVar3.element = (T) mo68905c().getValue();
                mo68905c().setValue(num3);
                C33744d dVar3 = new C33744d();
                if (num != null && num.intValue() == 1) {
                    str = str6;
                } else {
                    str = "on";
                }
                C33744d a3 = dVar3.mo59983a("initial_status", str);
                if (num != null && num.intValue() == 1) {
                    str6 = "on";
                }
                C39162r.m79460a("change_ad_data_from_partner_status", a3.mo59983a("final_status", str6).f79943a);
            }
            C39617a.m80455a(num, mo68904b(), mo68905c());
            String jSONArray2 = jSONArray.toString();
            C89219l.m154716b(jSONArray2, "");
            C39608b.m80413a(jSONArray2, new C39454j(this, num, num2, num3, eVar, eVar2, eVar3));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m80137a(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        personalizationViewModel.mo68903a(null, num, num2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m80139b(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        personalizationViewModel.m80138a(num, num2);
    }
}
