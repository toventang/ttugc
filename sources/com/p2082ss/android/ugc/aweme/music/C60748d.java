package com.p2082ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVMobService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.d */
public final class C60748d implements AbstractC61065b {

    /* renamed from: f */
    public static final C60749a f138042f = new C60749a((byte) 0);

    /* renamed from: a */
    public long f138043a;

    /* renamed from: b */
    public final String f138044b;

    /* renamed from: c */
    public final String f138045c;

    /* renamed from: d */
    public final AbstractC61065b f138046d;

    /* renamed from: e */
    public final String f138047e;

    /* renamed from: g */
    private final AbstractC89244h f138048g;

    static {
        Covode.recordClassIndex(71304);
    }

    /* renamed from: c */
    private final IAVMobService m110280c() {
        return (IAVMobService) this.f138048g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.d$a */
    public static final class C60749a {
        static {
            Covode.recordClassIndex(71305);
        }

        private C60749a() {
        }

        public /* synthetic */ C60749a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.d$b */
    static final class C60750b extends AbstractC89220m implements AbstractC89171a<IAVMobService> {

        /* renamed from: a */
        public static final C60750b f138049a = new C60750b();

        static {
            Covode.recordClassIndex(71306);
        }

        C60750b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVMobService invoke() {
            return AVExternalServiceImpl.m113114a().getAVMobService();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: b */
    public final void mo69328b() {
        this.f138043a = System.currentTimeMillis();
        AbstractC61065b bVar = this.f138046d;
        if (bVar != null) {
            bVar.mo69328b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69324a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f138043a;
        AbstractC61065b bVar = this.f138046d;
        if (bVar != null) {
            bVar.mo69324a();
        }
        IAVMobService c = m110280c();
        C33744d a = new C33744d().mo59983a("resource_type", "music").mo59981a("duration", currentTimeMillis).mo59980a("status", 2).mo59983a("resource_id", this.f138044b).mo59983a("error_domain", this.f138045c);
        String str = this.f138047e;
        if (str == null) {
            str = "";
        }
        c.onEventV3("tool_performance_resource_download", a.mo59983a("enter_from", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69325a(int i) {
        AbstractC61065b bVar = this.f138046d;
        if (bVar != null) {
            bVar.mo69325a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69326a(C84125a aVar) {
        String str = "";
        C89219l.m154721d(aVar, str);
        long currentTimeMillis = System.currentTimeMillis() - this.f138043a;
        AbstractC61065b bVar = this.f138046d;
        if (bVar != null) {
            bVar.mo69326a(aVar);
        }
        IAVMobService c = m110280c();
        C33744d a = new C33744d().mo59983a("resource_type", "music").mo59981a("duration", currentTimeMillis).mo59980a("status", 1).mo59983a("resource_id", this.f138044b).mo59983a("error_domain", this.f138045c).mo59980a("error_code", aVar.getErrorCode());
        String errorMsg = aVar.getErrorMsg();
        if (errorMsg == null) {
            errorMsg = "empty_error_msg";
        }
        C33744d a2 = a.mo59983a("error_msg", errorMsg);
        String str2 = this.f138047e;
        if (str2 != null) {
            str = str2;
        }
        c.onEventV3("tool_performance_resource_download", a2.mo59983a("enter_from", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        long currentTimeMillis = System.currentTimeMillis() - this.f138043a;
        AbstractC61065b bVar = this.f138046d;
        if (bVar != null) {
            bVar.mo69327a(str, musicWaveBean);
        }
        IAVMobService c = m110280c();
        C33744d a = new C33744d().mo59983a("resource_type", "music").mo59981a("duration", currentTimeMillis).mo59980a("status", 0).mo59983a("resource_id", this.f138044b);
        String str3 = this.f138047e;
        if (str3 != null) {
            str2 = str3;
        }
        c.onEventV3("tool_performance_resource_download", a.mo59983a("enter_from", str2).f79943a);
    }

    private C60748d(String str, String str2, AbstractC61065b bVar, String str3) {
        this.f138044b = str;
        this.f138045c = str2;
        this.f138046d = bVar;
        this.f138047e = str3;
        this.f138048g = C89250i.m154773a((AbstractC89171a) C60750b.f138049a);
    }

    public /* synthetic */ C60748d(String str, String str2, AbstractC61065b bVar, String str3, byte b) {
        this(str, str2, bVar, str3);
    }
}
