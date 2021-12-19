package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u */
public final class C5727u {

    /* renamed from: a */
    public static boolean f14529a;

    /* renamed from: b */
    public static EnumC5730c f14530b;

    /* renamed from: c */
    public static EnumC5729b f14531c;

    /* renamed from: d */
    public static EnumC5728a f14532d;

    /* renamed from: e */
    public static Map<String, String> f14533e = new HashMap();

    /* renamed from: f */
    public static Map<String, String> f14534f = new HashMap();

    /* renamed from: g */
    public static AbstractC88412b f14535g;

    /* renamed from: h */
    public static final C5727u f14536h = new C5727u();

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$f */
    public static final class C5733f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5733f f14548a = new C5733f();

        static {
            Covode.recordClassIndex(6331);
        }

        C5733f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$h */
    public static final class C5735h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5735h f14550a = new C5735h();

        static {
            Covode.recordClassIndex(6333);
        }

        C5735h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$a */
    public enum EnumC5728a {
        INVITER("inviter"),
        INVITEE("invitee");
        

        /* renamed from: b */
        private String f14538b = "anchor_type";

        /* renamed from: c */
        private String f14539c;

        public final String getKey() {
            return this.f14538b;
        }

        public final String getValue() {
            return this.f14539c;
        }

        static {
            Covode.recordClassIndex(6326);
        }

        public final void setKey(String str) {
            C89219l.m154721d(str, "");
            this.f14538b = str;
        }

        public final void setValue(String str) {
            C89219l.m154721d(str, "");
            this.f14539c = str;
        }

        private EnumC5728a(String str) {
            this.f14539c = str;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$b */
    public enum EnumC5729b {
        ANCHOR_LINKMIC("anchor"),
        AUDIENCE_LINKMIC("audience");
        

        /* renamed from: b */
        private String f14541b = "connection_type";

        /* renamed from: c */
        private String f14542c;

        public final String getKey() {
            return this.f14541b;
        }

        public final String getValue() {
            return this.f14542c;
        }

        static {
            Covode.recordClassIndex(6327);
        }

        public final void setKey(String str) {
            C89219l.m154721d(str, "");
            this.f14541b = str;
        }

        public final void setValue(String str) {
            C89219l.m154721d(str, "");
            this.f14542c = str;
        }

        private EnumC5729b(String str) {
            this.f14542c = str;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$c */
    public enum EnumC5730c {
        ANCHOR("anchor"),
        AUDIENCE("audience");
        

        /* renamed from: b */
        private String f14544b = "user_type";

        /* renamed from: c */
        private String f14545c;

        public final String getKey() {
            return this.f14544b;
        }

        public final String getValue() {
            return this.f14545c;
        }

        static {
            Covode.recordClassIndex(6328);
        }

        public final void setKey(String str) {
            C89219l.m154721d(str, "");
            this.f14544b = str;
        }

        public final void setValue(String str) {
            C89219l.m154721d(str, "");
            this.f14545c = str;
        }

        private EnumC5730c(String str) {
            this.f14545c = str;
        }
    }

    private C5727u() {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$d */
    public static final class C5731d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C5731d f14546a = new C5731d();

        static {
            Covode.recordClassIndex(6329);
        }

        C5731d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            m12586a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m12586a() {
            Long l;
            Long l2;
            C5727u.f14530b = EnumC5730c.ANCHOR;
            C5727u.f14531c = EnumC5729b.ANCHOR_LINKMIC;
            Long l3 = null;
            if (C4384b.C4385a.m10496a().f11969q) {
                C5727u.f14532d = EnumC5728a.INVITER;
                Map<String, String> map = C5727u.f14533e;
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                if (b != null) {
                    l2 = Long.valueOf(b.mo13161c());
                } else {
                    l2 = null;
                }
                map.put("inviter_id", String.valueOf(l2));
                Map<String, String> map2 = C5727u.f14534f;
                C4384b a = C4384b.C4385a.m10496a();
                if (a != null) {
                    l3 = Long.valueOf(a.f11958f);
                }
                map2.put("invitee_id", String.valueOf(l3.longValue()));
                return;
            }
            C5727u.f14532d = EnumC5728a.INVITEE;
            Map<String, String> map3 = C5727u.f14533e;
            C4384b a2 = C4384b.C4385a.m10496a();
            if (a2 != null) {
                l = Long.valueOf(a2.f11958f);
            } else {
                l = null;
            }
            map3.put("inviter_id", String.valueOf(l.longValue()));
            Map<String, String> map4 = C5727u.f14534f;
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            if (b2 != null) {
                l3 = Long.valueOf(b2.mo13161c());
            }
            map4.put("invitee_id", String.valueOf(l3));
        }
    }

    static {
        Covode.recordClassIndex(6325);
    }

    /* renamed from: a */
    public static final void m12585a() {
        f14529a = false;
        f14530b = null;
        f14531c = null;
        f14532d = null;
        f14533e.clear();
        f14534f.clear();
        AbstractC88412b bVar = f14535g;
        if (bVar != null) {
            bVar.dispose();
        }
        f14535g = null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$g */
    public static final class C5734g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EnumC5730c f14549a;

        static {
            Covode.recordClassIndex(6332);
        }

        public C5734g(EnumC5730c cVar) {
            this.f14549a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String value;
            HashMap hashMap = new HashMap();
            hashMap.put(this.f14549a.getKey(), this.f14549a.getValue());
            EnumC5729b bVar = C5727u.f14531c;
            String str2 = "";
            if (bVar == null || (str = bVar.getKey()) == null) {
                str = str2;
            }
            EnumC5729b bVar2 = C5727u.f14531c;
            if (!(bVar2 == null || (value = bVar2.getValue()) == null)) {
                str2 = value;
            }
            hashMap.put(str, str2);
            String str3 = C4384b.C4385a.m10496a().f11976x;
            if (!TextUtils.isEmpty(str3)) {
                if (str3 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("request_id", str3);
            }
            C6501b.C6502a.m13948a("connection_onemin").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.u$e */
    public static final class C5732e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5732e f14547a = new C5732e();

        static {
            Covode.recordClassIndex(6330);
        }

        C5732e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String value;
            HashMap hashMap = new HashMap();
            EnumC5730c cVar = C5727u.f14530b;
            String str6 = "";
            if (cVar == null || (str = cVar.getKey()) == null) {
                str = str6;
            }
            EnumC5730c cVar2 = C5727u.f14530b;
            if (cVar2 == null || (str2 = cVar2.getValue()) == null) {
                str2 = str6;
            }
            hashMap.put(str, str2);
            EnumC5729b bVar = C5727u.f14531c;
            if (bVar == null || (str3 = bVar.getKey()) == null) {
                str3 = str6;
            }
            EnumC5729b bVar2 = C5727u.f14531c;
            if (bVar2 == null || (str4 = bVar2.getValue()) == null) {
                str4 = str6;
            }
            hashMap.put(str3, str4);
            EnumC5728a aVar = C5727u.f14532d;
            if (aVar == null || (str5 = aVar.getKey()) == null) {
                str5 = str6;
            }
            EnumC5728a aVar2 = C5727u.f14532d;
            if (!(aVar2 == null || (value = aVar2.getValue()) == null)) {
                str6 = value;
            }
            hashMap.put(str5, str6);
            hashMap.putAll(C5727u.f14533e);
            hashMap.putAll(C5727u.f14534f);
            C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
            if (!TextUtils.isEmpty(C4384b.C4385a.m10496a().f11932V)) {
                String str7 = C4384b.C4385a.m10496a().f11932V;
                if (str7 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("enter_from", str7);
            }
            String str8 = C4384b.C4385a.m10496a().f11976x;
            if (!TextUtils.isEmpty(str8)) {
                if (str8 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("request_id", str8);
            }
            C5737w.m12600a(hashMap);
            C6501b.C6502a.m13948a("connection_onemin").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
