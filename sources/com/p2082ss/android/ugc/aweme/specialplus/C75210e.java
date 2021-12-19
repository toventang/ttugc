package com.p2082ss.android.ugc.aweme.specialplus;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.specialplus.C75207d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.specialplus.e */
public final class C75210e implements ISpecialPlusService {

    /* renamed from: d */
    public static final AbstractC89244h f169116d = C89250i.m154773a((AbstractC89171a) C75212b.f169126a);

    /* renamed from: e */
    public static final C75211a f169117e = new C75211a((byte) 0);

    /* renamed from: a */
    public long f169118a;

    /* renamed from: b */
    public long f169119b;

    /* renamed from: c */
    public boolean f169120c;

    /* renamed from: f */
    private final C75205c f169121f = new C75205c();

    /* renamed from: g */
    private SpecialPlusConfig f169122g;

    /* renamed from: h */
    private boolean f169123h;

    /* renamed from: i */
    private boolean f169124i;

    /* renamed from: j */
    private C40964c.C40967b f169125j;

    /* renamed from: com.ss.android.ugc.aweme.specialplus.e$a */
    public static final class C75211a {
        static {
            Covode.recordClassIndex(88094);
        }

        /* renamed from: a */
        public static C75210e m131957a() {
            return (C75210e) C75210e.f169116d.getValue();
        }

        private C75211a() {
        }

        public /* synthetic */ C75211a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isQuickPromoPlusEnabled() {
        return this.f169124i;
    }

    /* renamed from: com.ss.android.ugc.aweme.specialplus.e$b */
    static final class C75212b extends AbstractC89220m implements AbstractC89171a<C75210e> {

        /* renamed from: a */
        public static final C75212b f169126a = new C75212b();

        static {
            Covode.recordClassIndex(88095);
        }

        C75212b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75210e invoke() {
            return new C75210e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final long getQuickPromoPlusDebutTime() {
        return this.f169121f.mo118390c();
    }

    /* renamed from: com.ss.android.ugc.aweme.specialplus.e$c */
    public static final class C75213c extends C40964c.C40967b {

        /* renamed from: a */
        final /* synthetic */ C75210e f169127a;

        static {
            Covode.recordClassIndex(88096);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: b */
        public final void mo70155b() {
            this.f169127a.f169119b = System.currentTimeMillis() / 1000;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: a */
        public final void mo70154a() {
            if (this.f169127a.f169120c) {
                new SuperEntranceEvent(3, false).post();
                this.f169127a.f169118a = System.currentTimeMillis() / 1000;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75213c(C75210e eVar) {
            this.f169127a = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void initCallBack() {
        this.f169125j = new C75213c(this);
        C40964c.C40968c.f95804a.mo70143a(this.f169125j);
    }

    static {
        Covode.recordClassIndex(88093);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectId() {
        SpecialPlusLabels labels;
        String[] effectIds;
        String str;
        m131956a();
        SpecialPlusConfig specialPlusConfig = this.f169122g;
        if (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (effectIds = labels.getEffectIds()) == null || effectIds.length == 0 || (str = effectIds[0]) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final List<String> getSpecialPlusEffectList() {
        SpecialPlusLabels labels;
        String[] eligibleEffectIds;
        List<String> a;
        m131956a();
        SpecialPlusConfig specialPlusConfig = this.f169122g;
        if (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (eligibleEffectIds = labels.getEligibleEffectIds()) == null || (a = C89064i.m154463a(eligibleEffectIds)) == null) {
            return C89086z.INSTANCE;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getSpecialPlusTips() {
        SpecialPlusTips tips;
        String tryTip;
        m131956a();
        SpecialPlusConfig specialPlusConfig = this.f169122g;
        if (specialPlusConfig == null || (tips = specialPlusConfig.getTips()) == null || (tryTip = tips.getTryTip()) == null) {
            return "";
        }
        return tryTip;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusClicked() {
        int i;
        m131956a();
        C75205c cVar = this.f169121f;
        SpecialPlusConfig specialPlusConfig = this.f169122g;
        if (specialPlusConfig != null) {
            i = specialPlusConfig.getVersion();
        } else {
            i = 0;
        }
        cVar.f169109a.storeInt("special_plus_config_version", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusShowed() {
        int i;
        m131956a();
        C75205c cVar = this.f169121f;
        SpecialPlusConfig specialPlusConfig = this.f169122g;
        if (specialPlusConfig != null) {
            i = specialPlusConfig.getVersion();
        } else {
            i = 0;
        }
        cVar.f169109a.storeInt("special_plus_showed_config_version", i);
    }

    /* renamed from: a */
    private final void m131956a() {
        boolean z;
        if (this.f169122g == null) {
            this.f169122g = C75214f.m131960a();
            initCallBack();
        }
        boolean a = C75203a.m131949a();
        this.f169124i = a;
        if (a || !C75204b.m131950a()) {
            z = false;
        } else {
            z = true;
        }
        this.f169123h = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isNeedShowSpecialPlusDirect() {
        SpecialPlusConfig specialPlusConfig;
        if (C63238c.f143594u.mo93901a()) {
            return false;
        }
        m131956a();
        if ((!this.f169123h && !this.f169124i) || (specialPlusConfig = this.f169122g) == null) {
            return false;
        }
        if (this.f169121f.f169109a.getInt("special_plus_showed_config_version", 0) == specialPlusConfig.getVersion()) {
            return shouldShowSpecialPlus();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldShowSpecialPlus() {
        SpecialPlusConfig specialPlusConfig;
        SpecialPlusTimePeriod[] validTime;
        long j;
        String str;
        float f;
        if (C63238c.f143594u.mo93901a()) {
            return false;
        }
        m131956a();
        if (!(this.f169123h || this.f169124i) || (specialPlusConfig = this.f169122g) == null) {
            return false;
        }
        if (specialPlusConfig.getVersion() == this.f169121f.f169109a.getInt("special_plus_config_version", -1)) {
            if (this.f169125j != null) {
                C40964c.C40968c.f95804a.mo70146b(this.f169125j);
            }
            return false;
        }
        SpecialPlusConfig specialPlusConfig2 = this.f169122g;
        if (!(specialPlusConfig2 == null || (validTime = specialPlusConfig2.getValidTime()) == null || validTime.length == 0)) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
                long j2 = -1;
                try {
                    j = Long.parseLong(specialPlusTimePeriod.getStart());
                    try {
                        j2 = Long.parseLong(specialPlusTimePeriod.getEnd());
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    j = -1;
                }
                if (j <= currentTimeMillis && j2 >= currentTimeMillis) {
                    this.f169121f.mo118390c();
                    SpecialPlusConfig specialPlusConfig3 = this.f169122g;
                    if (specialPlusConfig3 != null) {
                        specialPlusConfig3.getAppearance_period_in_hours();
                    }
                    this.f169121f.mo118390c();
                    float f2 = 0.0f;
                    if (this.f169124i && this.f169121f.mo118390c() != 0) {
                        float c = (float) (currentTimeMillis - this.f169121f.mo118390c());
                        SpecialPlusConfig specialPlusConfig4 = this.f169122g;
                        if (specialPlusConfig4 != null) {
                            f = specialPlusConfig4.getAppearance_period_in_hours();
                        } else {
                            f = 0.0f;
                        }
                        if (c >= f * 3600.0f) {
                            if (this.f169125j != null) {
                                C40964c.C40968c.f95804a.mo70146b(this.f169125j);
                            }
                            return false;
                        }
                    }
                    SpecialPlusConfig specialPlusConfig5 = this.f169122g;
                    if (specialPlusConfig5 != null) {
                        specialPlusConfig5.getCool_down_period_in_hours();
                    }
                    if (this.f169124i) {
                        long j3 = this.f169118a;
                        if (j3 != 0) {
                            float f3 = (float) (this.f169119b - j3);
                            SpecialPlusConfig specialPlusConfig6 = this.f169122g;
                            if (specialPlusConfig6 != null) {
                                f2 = specialPlusConfig6.getCool_down_period_in_hours();
                            }
                            if (f3 <= f2 * 3600.0f) {
                                return false;
                            }
                        }
                    }
                    SpecialPlusConfig a = C75214f.m131960a();
                    if (a != null && C84902i.m145892a(C75207d.f169111b)) {
                        String a2 = C69892bn.m123461a(new File(C75207d.f169111b));
                        String md5 = a.getPlusIcon().getMd5();
                        if (!TextUtils.isEmpty(md5) && TextUtils.equals(a2, md5)) {
                            Effect a3 = C75207d.f169112c.mo118387a();
                            if (a3 == null || (str = a3.getUnzipPath()) == null) {
                                str = "";
                            }
                            if (!C84902i.m145892a(str) || C75207d.f169112c.mo118389b() != a.getVersion()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        this.f169121f.mo118388a(0);
        if (this.f169125j != null) {
            C40964c.C40968c.f95804a.mo70146b(this.f169125j);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusState(boolean z) {
        this.f169120c = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setQuickPromoPlusDebutTime(long j) {
        this.f169121f.mo118388a(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void preDownloadSuperEntranceRes(Context context) {
        String str;
        String[] effectIds;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        C73991bj.m130128a("SpecialPlus, downloadSpecialPlusRes start");
        SpecialPlusConfig a = C75214f.m131960a();
        if (a != null) {
            if (!C75207d.m131955a(a)) {
                C73991bj.m130128a("SpecialPlus, downloadSpecialPlusRes configuration is expired");
                return;
            }
            C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl start");
            String url = a.getPlusIcon().getUrl();
            String md5 = a.getPlusIcon().getMd5();
            if (TextUtils.isEmpty(url) || TextUtils.isEmpty(md5)) {
                C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl iconUrl or iconMd5 isEmpty");
            } else {
                String str3 = C75207d.f169111b;
                if (C84902i.m145892a(str3)) {
                    String a2 = C69892bn.m123461a(new File(str3));
                    if (TextUtils.isEmpty(md5) || TextUtils.equals(a2, md5)) {
                        C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl icon do not need to be downloaded");
                    }
                }
                C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl icon need download and start download");
                Downloader.with(context).url(url).name("special_plus_icon.png").savePath(C75207d.f169110a).force(true).mainThreadListener(new C75207d.C75208a()).download();
            }
            C73991bj.m130128a("SpecialPlus, downloadSticker start");
            Effect a3 = C75207d.f169112c.mo118387a();
            if (a3 == null || (str = a3.getUnzipPath()) == null) {
                str = "";
            }
            if (!C84902i.m145892a(str) || C75207d.f169112c.mo118389b() != a.getVersion()) {
                int version = a.getVersion();
                C89233z.C89237d dVar = new C89233z.C89237d();
                dVar.element = System.currentTimeMillis();
                SpecialPlusLabels labels = a.getLabels();
                if (labels != null && (effectIds = labels.getEffectIds()) != null && effectIds.length != 0 && (!false) && (str2 = effectIds[0]) != null && (!TextUtils.isEmpty(str2))) {
                    C73991bj.m130128a("SpecialPlus, downloadSticker sticker need download and start download");
                    C75207d.C75209b bVar = new C75207d.C75209b(version, dVar);
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d(bVar, "");
                    if (!TextUtils.isEmpty(str2)) {
                        Application application = C63238c.f143574a;
                        C89219l.m154716b(application, "");
                        AbstractC46415f a4 = C46404c.m89554a(application, null);
                        C63238c.m114594d();
                        C1747c.f5612a = a4;
                        IEffectService a5 = C1747c.f5613b.mo5560b();
                        if (a5 != null) {
                            a5.fetchEffectWithMusicBind(C1747c.f5612a, str2, "", bVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C73991bj.m130128a("SpecialPlus, downloadSticker sticker do not need to be downloaded");
        }
    }
}
