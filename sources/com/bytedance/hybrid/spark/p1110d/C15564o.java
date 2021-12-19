package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.AbstractC15528b;
import com.bytedance.hybrid.spark.C15534d;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.o */
public final class C15564o implements AbstractC15510f {

    /* renamed from: a */
    public static final C15565a f37937a = new C15565a((byte) 0);

    /* renamed from: b */
    private final C21136a f37938b;

    /* renamed from: c */
    private final SparkActivity f37939c;

    static {
        Covode.recordClassIndex(17826);
    }

    /* renamed from: com.bytedance.hybrid.spark.d.o$a */
    public static final class C15565a {

        /* renamed from: com.bytedance.hybrid.spark.d.o$a$a */
        public enum EnumC15566a {
            DARK,
            Light;

            static {
                Covode.recordClassIndex(17828);
            }
        }

        static {
            Covode.recordClassIndex(17827);
        }

        private C15565a() {
        }

        public /* synthetic */ C15565a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        String statusFontMode;
        AbstractC15528b bVar = C15534d.f37882a;
        C15565a.EnumC15566a aVar = null;
        if (bVar != null) {
            aVar = bVar.mo25315c().f37886b;
        }
        C21136a aVar2 = this.f37938b;
        if (!(aVar2 == null || (statusFontMode = aVar2.getStatusFontMode()) == null)) {
            int hashCode = statusFontMode.hashCode();
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && statusFontMode.equals("light")) {
                    aVar = C15565a.EnumC15566a.Light;
                }
            } else if (statusFontMode.equals("dark")) {
                aVar = C15565a.EnumC15566a.DARK;
            }
        }
        this.f37939c.f37985e = aVar;
    }

    public C15564o(C21136a aVar, SparkActivity sparkActivity) {
        C89219l.m154719c(sparkActivity, "");
        this.f37938b = aVar;
        this.f37939c = sparkActivity;
    }
}
