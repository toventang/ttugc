package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.w */
public final class C32405w extends Throwable {
    public static final C32406a Companion = new C32406a((byte) 0);

    /* renamed from: a */
    private final int f77258a;

    /* renamed from: b */
    private final String f77259b;

    /* renamed from: c */
    private final EnumC32592i f77260c;

    /* renamed from: d */
    private final EnumC32594j f77261d;

    /* renamed from: e */
    private JSONObject f77262e;

    /* renamed from: f */
    private final String f77263f;

    static {
        Covode.recordClassIndex(39173);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.w$a */
    public static final class C32406a {
        static {
            Covode.recordClassIndex(39174);
        }

        private C32406a() {
        }

        public /* synthetic */ C32406a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C32405w m66783a(EnumC32592i iVar, EnumC32594j jVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(jVar, "");
            return new C32405w(-1, "no data", iVar, jVar, null, "no data");
        }
    }

    public final String getDetailErrorMsg() {
        return this.f77263f;
    }

    public final int getErrorCode() {
        return this.f77258a;
    }

    public final String getErrorMsg() {
        return this.f77259b;
    }

    public final JSONObject getExtra() {
        return this.f77262e;
    }

    public final EnumC32592i getScene() {
        return this.f77260c;
    }

    public final EnumC32594j getStep() {
        return this.f77261d;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.f77262e = jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32405w(int i, String str, EnumC32592i iVar, EnumC32594j jVar, JSONObject jSONObject, String str2) {
        super(str);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        this.f77258a = i;
        this.f77259b = str;
        this.f77260c = iVar;
        this.f77261d = jVar;
        this.f77262e = jSONObject;
        this.f77263f = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32405w(int i, String str, EnumC32592i iVar, EnumC32594j jVar, JSONObject jSONObject, String str2, int i2, C89214g gVar) {
        this(i, str, iVar, jVar, jSONObject, (i2 & 32) != 0 ? "" : str2);
    }
}
