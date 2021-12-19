package com.p2082ss.android.ugc.aweme.specact.pendant.p3936d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l;
import com.p2082ss.android.ugc.aweme.pendant.C62772f;
import com.p2082ss.android.ugc.aweme.pendant.C62797j;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75028h;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a */
public final class C75013a implements AbstractC75023d {

    /* renamed from: a */
    public static final AbstractC89244h f168625a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75015b.f168630a);

    /* renamed from: b */
    public static final C75014a f168626b = new C75014a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f168627c;

    /* renamed from: d */
    private final AbstractC89244h f168628d;

    /* renamed from: e */
    private final AbstractC89244h f168629e;

    /* renamed from: c */
    private final Map<String, Integer> m131664c() {
        return (Map) this.f168628d.getValue();
    }

    /* renamed from: a */
    public final C62797j mo118118a() {
        return (C62797j) this.f168627c.getValue();
    }

    /* renamed from: b */
    public final List<AbstractC75028h> mo118123b() {
        return (List) this.f168629e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$a */
    public static final class C75014a {
        static {
            Covode.recordClassIndex(87886);
        }

        private C75014a() {
        }

        public /* synthetic */ C75014a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$b */
    static final class C75015b extends AbstractC89220m implements AbstractC89171a<C75013a> {

        /* renamed from: a */
        public static final C75015b f168630a = new C75015b();

        static {
            Covode.recordClassIndex(87887);
        }

        C75015b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75013a invoke() {
            return new C75013a((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$c */
    static final class C75016c extends AbstractC89220m implements AbstractC89171a<List<AbstractC75028h>> {

        /* renamed from: a */
        public static final C75016c f168631a = new C75016c();

        static {
            Covode.recordClassIndex(87888);
        }

        C75016c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC75028h> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$e */
    static final class C75018e extends AbstractC89220m implements AbstractC89171a<C62797j> {

        /* renamed from: a */
        public static final C75018e f168635a = new C75018e();

        static {
            Covode.recordClassIndex(87890);
        }

        C75018e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62797j invoke() {
            return new C62797j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$f */
    static final class C75019f extends AbstractC89220m implements AbstractC89171a<Map<String, Integer>> {

        /* renamed from: a */
        public static final C75019f f168636a = new C75019f();

        static {
            Covode.recordClassIndex(87891);
        }

        C75019f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(87885);
    }

    private C75013a() {
        this.f168627c = C89250i.m154773a((AbstractC89171a) C75018e.f168635a);
        this.f168628d = C89250i.m154773a((AbstractC89171a) C75019f.f168636a);
        this.f168629e = C89250i.m154773a((AbstractC89171a) C75016c.f168631a);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$d */
    public static final class C75017d implements AbstractC62804l {

        /* renamed from: a */
        final /* synthetic */ C75013a f168632a;

        /* renamed from: b */
        final /* synthetic */ String f168633b;

        /* renamed from: c */
        final /* synthetic */ UgAwemeActivitySetting f168634c;

        static {
            Covode.recordClassIndex(87889);
        }

        @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
        /* renamed from: b */
        public final void mo100764b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
        /* renamed from: a */
        public final void mo100763a() {
            this.f168632a.mo118121a(this.f168633b, 1);
            Iterator<T> it = this.f168632a.mo118123b().iterator();
            while (it.hasNext()) {
                it.next().mo118053c(this.f168634c);
            }
            C12290b.m22066a("pendant_load_success", (JSONObject) null, (JSONObject) null, (JSONObject) null);
        }

        C75017d(C75013a aVar, String str, UgAwemeActivitySetting ugAwemeActivitySetting) {
            this.f168632a = aVar;
            this.f168633b = str;
            this.f168634c = ugAwemeActivitySetting;
        }
    }

    public /* synthetic */ C75013a(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d
    /* renamed from: a */
    public final void mo118120a(AbstractC75028h hVar) {
        C89219l.m154721d(hVar, "");
        mo118123b().add(hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d
    /* renamed from: a */
    public final boolean mo118122a(String str) {
        C89219l.m154721d(str, "");
        Integer num = m131664c().get(str);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo118121a(String str, int i) {
        C89219l.m154721d(str, "");
        m131664c().put(str, Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d
    /* renamed from: a */
    public final void mo118119a(Context context, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(ugAwemeActivitySetting, "");
        String d = C75060a.m131802d(ugAwemeActivitySetting);
        List<String> r = C75060a.m131816r(ugAwemeActivitySetting);
        String m = C75060a.m131811m(ugAwemeActivitySetting);
        if (!TextUtils.isEmpty(d) && !r.isEmpty() && !TextUtils.isEmpty(m)) {
            if (d == null) {
                C89219l.m154715b();
            }
            Integer num = m131664c().get(d);
            if (num == null || num.intValue() != 3) {
                mo118121a(d, 3);
                try {
                    mo118118a().mo100743a(d, r, m);
                    C62797j a = mo118118a();
                    C75017d dVar = new C75017d(this, d, ugAwemeActivitySetting);
                    C89219l.m154721d(context, "");
                    C89219l.m154721d(dVar, "");
                    if (a.f142385b) {
                        C62772f fVar = a.f142384a;
                        if (fVar == null) {
                            return;
                        }
                        if (fVar.mo100757f()) {
                            dVar.mo100763a();
                            return;
                        }
                        C62772f fVar2 = a.f142384a;
                        if (fVar2 != null) {
                            fVar2.mo100752a(context, dVar);
                            return;
                        }
                        return;
                    }
                    throw new Throwable("HAS NOT inited");
                } catch (Exception unused) {
                    mo118121a(d, 2);
                    Iterator<T> it = mo118123b().iterator();
                    while (it.hasNext()) {
                        it.next().mo118052b(ugAwemeActivitySetting);
                    }
                }
            }
        }
    }
}
