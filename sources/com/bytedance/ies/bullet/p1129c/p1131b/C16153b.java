package com.bytedance.ies.bullet.p1129c.p1131b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.b.b */
public final class C16153b implements AbstractC16191p, AbstractC16576j {

    /* renamed from: a */
    public final String f38900a;

    /* renamed from: b */
    public final String f38901b;

    /* renamed from: c */
    final String f38902c;

    /* renamed from: d */
    public final JSONObject f38903d;

    /* renamed from: e */
    private final C16587q f38904e;

    static {
        Covode.recordClassIndex(18446);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
    /* renamed from: a */
    public final String mo25699a() {
        return this.f38902c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo25700b() {
        return this.f38903d;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return this.f38904e;
    }

    /* renamed from: com.bytedance.ies.bullet.c.b.b$a */
    public static final class C16154a implements AbstractC16183k.AbstractC16185b {

        /* renamed from: a */
        final /* synthetic */ C16153b f38905a;

        static {
            Covode.recordClassIndex(18447);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16154a(C16153b bVar) {
            this.f38905a = bVar;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
        /* renamed from: a */
        public final void mo25704a(JSONObject jSONObject) {
            C89219l.m154719c(jSONObject, "");
            C16153b bVar = this.f38905a;
            bVar.printLog(bVar.f38900a, EnumC16586p.D, "onComplete actionType:" + this.f38905a.f38901b + ", name:" + this.f38905a.f38902c);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
        /* renamed from: a */
        public final void mo25702a(int i, String str) {
            C89219l.m154719c(str, "");
            C16153b bVar = this.f38905a;
            bVar.printLog(bVar.f38900a, EnumC16586p.D, "onError actionType:" + this.f38905a.f38901b + ", code:" + i + ", message:" + str);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
        /* renamed from: a */
        public final void mo25703a(int i, String str, JSONObject jSONObject) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(jSONObject, "");
            C16153b bVar = this.f38905a;
            bVar.printLog(bVar.f38900a, EnumC16586p.D, "onError actionType:" + this.f38905a.f38901b + ", code:" + i + ", message:" + str);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.b.b$b */
    static final class C16155b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16153b f38906a;

        static {
            Covode.recordClassIndex(18448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16155b(C16153b bVar) {
            super(1);
            this.f38906a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            C16153b bVar = this.f38906a;
            bVar.printLog(bVar.f38900a, EnumC16586p.D, "onReject actionType:" + this.f38906a.f38901b + ", throwable:" + th2.getMessage());
            return C89391z.f203057a;
        }
    }

    public final void onEvent(AbstractC16187m mVar) {
        String str = this.f38901b;
        for (EnumC16152a aVar : EnumC16152a.values()) {
            if (C89219l.m154714a((Object) aVar.getActionType(), (Object) str)) {
                if (mVar != null) {
                    String str2 = this.f38902c;
                    JSONObject jSONObject = this.f38903d;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    mVar.mo25735a(str2, jSONObject, new C16154a(this), new C16155b(this));
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    public C16153b(String str, String str2, JSONObject jSONObject, C16587q qVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(qVar, "");
        this.f38901b = str;
        this.f38902c = str2;
        this.f38903d = jSONObject;
        this.f38904e = qVar;
        String simpleName = C16153b.class.getSimpleName();
        C89219l.m154709a((Object) simpleName, "");
        this.f38900a = simpleName;
    }
}
