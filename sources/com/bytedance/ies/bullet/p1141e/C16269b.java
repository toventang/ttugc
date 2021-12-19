package com.bytedance.ies.bullet.p1141e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16598ah;
import com.bytedance.ies.bullet.service.base.AbstractC16648i;
import com.bytedance.ies.bullet.service.base.AbstractC16657r;
import com.bytedance.ies.bullet.service.base.C16645f;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.b */
public final class C16269b implements AbstractC16657r {

    /* renamed from: a */
    public static final C16273d f39080a = new C16273d();

    /* renamed from: b */
    public static final C16272c f39081b = new C16272c();

    /* renamed from: c */
    public static final C16271b f39082c = new C16271b((byte) 0);

    /* renamed from: d */
    private final C16270a f39083d;

    /* renamed from: com.bytedance.ies.bullet.e.b$a */
    public static final class C16270a {

        /* renamed from: a */
        public int f39084a = 3;

        /* renamed from: b */
        public int f39085b = 3;

        /* renamed from: c */
        public AbstractC16598ah f39086c = C16269b.f39080a;

        /* renamed from: d */
        public AbstractC16648i f39087d = C16269b.f39081b;

        static {
            Covode.recordClassIndex(18563);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.b$b */
    public static final class C16271b {
        static {
            Covode.recordClassIndex(18564);
        }

        private C16271b() {
        }

        public /* synthetic */ C16271b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.b$c */
    public static final class C16272c implements AbstractC16648i {
        static {
            Covode.recordClassIndex(18565);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16648i
        /* renamed from: a */
        public final void mo25861a(C16645f fVar) {
            C89219l.m154719c(fVar, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16648i
        /* renamed from: a */
        public final void mo25862a(C16645f fVar, JSONObject jSONObject) {
            C89219l.m154719c(fVar, "");
            C89219l.m154719c(jSONObject, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16648i
        /* renamed from: b */
        public final void mo25863b(C16645f fVar) {
            C89219l.m154719c(fVar, "");
        }

        C16272c() {
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.b$d */
    public static final class C16273d implements AbstractC16598ah {
        static {
            Covode.recordClassIndex(18566);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16598ah
        /* renamed from: a */
        public final Uri mo25864a(Uri uri) {
            C89219l.m154719c(uri, "");
            return uri;
        }

        C16273d() {
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16657r
    /* renamed from: a */
    public final int mo25857a() {
        return this.f39083d.f39084a;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16657r
    /* renamed from: b */
    public final int mo25858b() {
        return this.f39083d.f39085b;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16657r
    /* renamed from: c */
    public final AbstractC16598ah mo25859c() {
        return this.f39083d.f39086c;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16657r
    /* renamed from: d */
    public final AbstractC16648i mo25860d() {
        return this.f39083d.f39087d;
    }

    static {
        Covode.recordClassIndex(18562);
    }

    private C16269b(C16270a aVar) {
        this.f39083d = aVar;
    }

    public /* synthetic */ C16269b(C16270a aVar, byte b) {
        this(aVar);
    }
}
