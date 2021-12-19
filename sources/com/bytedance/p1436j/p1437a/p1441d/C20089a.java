package com.bytedance.p1436j.p1437a.p1441d;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.lynx.tasm.base.AbstractC28453b;
import com.lynx.tasm.base.EnumC28458g;
import com.p2082ss.android.agilelogger.ALog;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.d.a */
public final class C20089a extends AbstractC28453b {

    /* renamed from: d */
    public static final String f47816d = "Lynx";

    /* renamed from: e */
    public static long f47817e;

    /* renamed from: f */
    public static final C20090a f47818f = new C20090a((byte) 0);

    /* renamed from: a */
    public boolean f47819a;

    /* renamed from: b */
    public final AbstractC16654o f47820b;

    /* renamed from: c */
    public final AbstractC16584o f47821c;

    @Override // com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final int mo33433a() {
        return 1;
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: b */
    public final int mo33437b() {
        return 8;
    }

    /* renamed from: com.bytedance.j.a.d.a$a */
    public static final class C20090a {
        static {
            Covode.recordClassIndex(23598);
        }

        private C20090a() {
        }

        public /* synthetic */ C20090a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(23597);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final void mo33434a(String str) {
        AbstractC16654o oVar = this.f47820b;
        if (oVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str);
            oVar.mo26319a(new C16607an("LynxLog", jSONObject, null, 246));
        }
    }

    public C20089a(AbstractC16584o oVar) {
        C89219l.m154719c(oVar, "");
        this.f47821c = oVar;
        this.f47820b = (AbstractC16654o) oVar.mo25790b_(AbstractC16654o.class);
        try {
            f47817e = ALog.getALogSimpleWriteFuncAddr();
            this.f47819a = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just warning log, No ALog dependency found").printStackTrace();
        }
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final void mo33435a(String str, String str2) {
        this.f47821c.printLog(str + "_" + str2, EnumC16586p.V, f47816d);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: b */
    public final void mo33438b(String str, String str2) {
        this.f47821c.printLog(str + "_" + str2, EnumC16586p.D, f47816d);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: c */
    public final void mo33439c(String str, String str2) {
        this.f47821c.printLog(str + "_" + str2, EnumC16586p.I, f47816d);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: d */
    public final void mo33440d(String str, String str2) {
        this.f47821c.printLog(str + "_" + str2, EnumC16586p.W, f47816d);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: e */
    public final void mo33441e(String str, String str2) {
        this.f47821c.printLog(str + "_" + str2, EnumC16586p.E, f47816d);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final boolean mo33436a(EnumC28458g gVar, int i) {
        C89219l.m154719c(gVar, "");
        if (gVar == EnumC28458g.JAVA && i >= this.f66922g) {
            return true;
        }
        if (gVar == EnumC28458g.Native && i == 8) {
            return true;
        }
        return false;
    }
}
