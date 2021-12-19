package com.bytedance.lynx.hybrid.p1520f;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.lynx.tasm.base.AbstractC28453b;
import com.lynx.tasm.base.EnumC28458g;
import com.p2082ss.android.agilelogger.ALog;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.f.a */
public final class C21189a extends AbstractC28453b {

    /* renamed from: b */
    public static final String f50272b = "Lynx";

    /* renamed from: c */
    public static long f50273c;

    /* renamed from: d */
    public static final C21190a f50274d = new C21190a((byte) 0);

    /* renamed from: a */
    public boolean f50275a;

    @Override // com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final int mo33433a() {
        return 1;
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final void mo33434a(String str) {
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: b */
    public final int mo33437b() {
        return 8;
    }

    /* renamed from: com.bytedance.lynx.hybrid.f.a$a */
    public static final class C21190a {
        static {
            Covode.recordClassIndex(24806);
        }

        private C21190a() {
        }

        public /* synthetic */ C21190a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(24805);
    }

    public C21189a() {
        try {
            f50273c = ALog.getALogSimpleWriteFuncAddr();
            this.f50275a = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just warning log, No ALog dependency found").printStackTrace();
        }
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: a */
    public final void mo33435a(String str, String str2) {
        C21210c.m39924a(str + "_" + str2, EnumC21209b.V, f50272b);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: b */
    public final void mo33438b(String str, String str2) {
        C21210c.m39924a(str + "_" + str2, EnumC21209b.D, f50272b);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: c */
    public final void mo33439c(String str, String str2) {
        C21210c.m39924a(str + "_" + str2, EnumC21209b.I, f50272b);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: d */
    public final void mo33440d(String str, String str2) {
        C21210c.m39924a(str + "_" + str2, EnumC21209b.W, f50272b);
    }

    @Override // com.lynx.tasm.base.AbstractC28456e, com.lynx.tasm.base.AbstractC28453b
    /* renamed from: e */
    public final void mo33441e(String str, String str2) {
        C21210c.m39924a(str + "_" + str2, EnumC21209b.E, f50272b);
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
