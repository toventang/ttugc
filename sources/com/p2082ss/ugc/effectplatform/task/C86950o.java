package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectQRCode;
import com.p2082ss.ugc.effectplatform.model.PlatformEffect;
import com.p2082ss.ugc.effectplatform.model.net.ScanQRCodeResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.net.URLEncoder;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.o */
public final class C86950o extends AbstractC86851a<ScanQRCodeResponse.DataNode, ScanQRCodeResponse> {

    /* renamed from: c */
    public final C86687a f196039c;

    /* renamed from: d */
    public final String f196040d;

    /* renamed from: f */
    private final EffectQRCode f196041f;

    static {
        Covode.recordClassIndex(102715);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.o$a */
    public static final class C86951a {

        /* renamed from: a */
        public String f196042a = null;

        static {
            Covode.recordClassIndex(102716);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C86951a) && C89219l.m154714a(this.f196042a, ((C86951a) obj).f196042a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f196042a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "SecId(SecId=" + this.f196042a + ")";
        }

        private C86951a() {
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.o$b */
    static final class C86952b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Effect f196043a;

        /* renamed from: b */
        final /* synthetic */ C86950o f196044b;

        static {
            Covode.recordClassIndex(102717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86952b(Effect effect, C86950o oVar) {
            super(0);
            this.f196043a = effect;
            this.f196044b = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196044b.f196039c.f195443K.mo140035a(this.f196044b.f196040d);
            if (a != null) {
                a.onSuccess(this.f196043a);
            }
            this.f196044b.f196039c.f195443K.mo140037b(this.f196044b.f196040d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = this.f196039c.f195447c;
        if (str2 != null) {
            hashMap.put("sdk_version", str2);
        }
        C86695b bVar = this.f196039c.f195461q;
        if (bVar != null) {
            C86951a aVar = (C86951a) bVar.f195508a.convertJsonToObj(this.f196041f.getQrCodeText(), C86951a.class);
            if (!(aVar == null || (str = aVar.f196042a) == null)) {
                String str3 = "";
                C89219l.m154719c(str, str3);
                String encode = URLEncoder.encode(str);
                if (encode != null) {
                    str3 = encode;
                }
                hashMap.put("sec_id", str3);
            }
        }
        String str4 = this.f196039c.f195455k;
        if (str4 != null) {
            hashMap.put("aid", str4);
        }
        return new C86701e(C87002p.m150693a(hashMap, this.f196039c.f195433A + this.f196039c.f195445a + "/tidyEffect/secId"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ ScanQRCodeResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (ScanQRCodeResponse) bVar.f195508a.convertJsonToObj(str, ScanQRCodeResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86950o(C86687a aVar, EffectQRCode effectQRCode, String str) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(effectQRCode, "");
        C89219l.m154719c(str, "");
        this.f196039c = aVar;
        this.f196041f = effectQRCode;
        this.f196040d = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, ScanQRCodeResponse scanQRCodeResponse) {
        PlatformEffect effect;
        Effect effect2;
        ScanQRCodeResponse scanQRCodeResponse2 = scanQRCodeResponse;
        C89219l.m154719c(scanQRCodeResponse2, "");
        ScanQRCodeResponse.DataNode data = scanQRCodeResponse2.getData();
        if (data != null && (effect = data.getEffect()) != null && (effect2 = effect.toEffect(data.getUrl_prefix())) != null) {
            C86993j.m150662a(this.f196039c.f195453i, C89070n.m154516a(effect2));
            m150523a(new C86952b(effect2, this));
        }
    }
}
