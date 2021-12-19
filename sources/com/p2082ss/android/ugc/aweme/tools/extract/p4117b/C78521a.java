package com.p2082ss.android.ugc.aweme.tools.extract.p4117b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.extract.C78548j;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.b.a */
public final class C78521a {

    /* renamed from: n */
    public static final C78522a f176449n = new C78522a((byte) 0);

    /* renamed from: a */
    public final List<C78523b> f176450a;

    /* renamed from: b */
    public final C78523b f176451b;

    /* renamed from: c */
    public final C78523b f176452c;

    /* renamed from: d */
    public final C78523b f176453d;

    /* renamed from: e */
    public final C78523b f176454e;

    /* renamed from: f */
    public final C78523b f176455f;

    /* renamed from: g */
    public final C78523b f176456g;

    /* renamed from: h */
    public final C78523b f176457h;

    /* renamed from: i */
    public final C78523b f176458i;

    /* renamed from: j */
    public final C78523b f176459j;

    /* renamed from: k */
    public final C78523b f176460k;

    /* renamed from: l */
    public final C78523b f176461l;

    /* renamed from: m */
    public final C78523b f176462m;

    static {
        Covode.recordClassIndex(91653);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.b.a$a */
    public static final class C78522a {
        static {
            Covode.recordClassIndex(91654);
        }

        private C78522a() {
        }

        public /* synthetic */ C78522a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C78521a m137094a(C78548j jVar) {
            String str;
            String str2;
            String str3;
            String str4;
            C89219l.m154721d(jVar, "");
            C78521a aVar = new C78521a();
            aVar.f176452c.f176463a = jVar.f176534a;
            aVar.f176453d.f176463a = String.valueOf(jVar.f176535b);
            C78523b bVar = aVar.f176454e;
            Boolean bool = jVar.f176537d;
            String str5 = null;
            if (bool != null) {
                str = String.valueOf(bool.booleanValue());
            } else {
                str = null;
            }
            bVar.f176463a = str;
            C78523b bVar2 = aVar.f176455f;
            Integer num = jVar.f176536c;
            if (num != null) {
                str2 = String.valueOf(num.intValue());
            } else {
                str2 = null;
            }
            bVar2.f176463a = str2;
            C78523b bVar3 = aVar.f176456g;
            Boolean bool2 = jVar.f176538e;
            if (bool2 != null) {
                str3 = String.valueOf(bool2.booleanValue());
            } else {
                str3 = null;
            }
            bVar3.f176463a = str3;
            C78523b bVar4 = aVar.f176457h;
            Integer num2 = jVar.f176539f;
            if (num2 != null) {
                str4 = String.valueOf(num2.intValue());
            } else {
                str4 = null;
            }
            bVar4.f176463a = str4;
            C78523b bVar5 = aVar.f176458i;
            Boolean bool3 = jVar.f176541h;
            if (bool3 != null) {
                str5 = String.valueOf(bool3.booleanValue());
            }
            bVar5.f176463a = str5;
            aVar.f176459j.f176463a = String.valueOf(jVar.f176542i);
            aVar.f176460k.f176463a = jVar.f176543j;
            return aVar;
        }
    }

    public C78521a() {
        ArrayList arrayList = new ArrayList();
        this.f176450a = arrayList;
        C78523b bVar = new C78523b("ToolsMonitorType", true);
        arrayList.add(bVar);
        this.f176451b = bVar;
        C78523b bVar2 = new C78523b("ToolsAwemeId", true);
        arrayList.add(bVar2);
        this.f176452c = bVar2;
        C78523b bVar3 = new C78523b("ToolsMatchFactors", true);
        arrayList.add(bVar3);
        this.f176453d = bVar3;
        C78523b bVar4 = new C78523b("ToolsIsDraft", false);
        arrayList.add(bVar4);
        this.f176454e = bVar4;
        C78523b bVar5 = new C78523b("ToolsOrigin", false);
        arrayList.add(bVar5);
        this.f176455f = bVar5;
        C78523b bVar6 = new C78523b("ToolsIsBackUp", false);
        arrayList.add(bVar6);
        this.f176456g = bVar6;
        C78523b bVar7 = new C78523b("ToolsErrCode", true);
        arrayList.add(bVar7);
        this.f176457h = bVar7;
        C78523b bVar8 = new C78523b("ToolsIsRetry", false);
        arrayList.add(bVar8);
        this.f176458i = bVar8;
        C78523b bVar9 = new C78523b("ToolsUploadErrCode", true);
        arrayList.add(bVar9);
        this.f176459j = bVar9;
        C78523b bVar10 = new C78523b("ToolsDescription", false);
        arrayList.add(bVar10);
        this.f176460k = bVar10;
        C78523b bVar11 = new C78523b("ToolsMissingCound", true);
        arrayList.add(bVar11);
        this.f176461l = bVar11;
        C78523b bVar12 = new C78523b("ToolsMissingRate", false);
        arrayList.add(bVar12);
        this.f176462m = bVar12;
    }
}
