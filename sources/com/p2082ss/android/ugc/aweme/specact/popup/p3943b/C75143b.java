package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75117b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75123h;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b */
public final class C75143b {

    /* renamed from: d */
    public static final C75144a f168961d = new C75144a((byte) 0);

    /* renamed from: a */
    public C75117b f168962a;

    /* renamed from: b */
    public Context f168963b;

    /* renamed from: c */
    public final C75124i f168964c;

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$c */
    public enum EnumC75146c {
        JUMP,
        TOAST,
        DIALOG,
        NONE;

        static {
            Covode.recordClassIndex(88022);
        }
    }

    static {
        Covode.recordClassIndex(88019);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$a */
    public static final class C75144a {
        static {
            Covode.recordClassIndex(88020);
        }

        private C75144a() {
        }

        public /* synthetic */ C75144a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$d */
    static final class CallableC75147d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C75143b f168970a;

        static {
            Covode.recordClassIndex(88023);
        }

        CallableC75147d(C75143b bVar) {
            this.f168970a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
            if (r2 == null) goto L_0x005b;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b.CallableC75147d.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    public final Integer mo118308a() {
        C75117b bVar = this.f168962a;
        if (bVar == null) {
            C89219l.m154710a("buttonAction");
        }
        Integer num = null;
        if (!bVar.f168864g.isEmpty()) {
            C75117b bVar2 = this.f168962a;
            if (bVar2 == null) {
                C89219l.m154710a("buttonAction");
            }
            for (C75123h hVar : bVar2.f168864g) {
                JSONObject a = m131897a(hVar.f168879b, hVar.f168878a, m131896a(hVar.f168880c));
                try {
                    if (a.getInt("status_code") == 0) {
                        int i = a.getJSONObject("data").getInt("amount");
                        if (num == null) {
                            num = Integer.valueOf(i);
                        } else {
                            num = Integer.valueOf(num.intValue() + i);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return num;
    }

    public C75143b(C75124i iVar) {
        C89219l.m154721d(iVar, "");
        this.f168964c = iVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C75117b m131895a(C75143b bVar) {
        C75117b bVar2 = bVar.f168962a;
        if (bVar2 == null) {
            C89219l.m154710a("buttonAction");
        }
        return bVar2;
    }

    /* renamed from: b */
    private final String m131900b(int i) {
        String string;
        Context context = this.f168963b;
        if (context == null || (string = context.getString(i)) == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    private final Map<String, String> m131896a(List<String> list) {
        if (list.isEmpty()) {
            return C89041ag.m154415a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(C80342dg.m139300a().mo46674b(this.f168964c));
            for (String str : list) {
                try {
                    String string = jSONObject.getString(str);
                    C89219l.m154716b(string, "");
                    linkedHashMap.put(str, string);
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
        return linkedHashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$f */
    static final class C75149f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75143b f168973a;

        /* renamed from: b */
        final /* synthetic */ DialogC75175j f168974b;

        static {
            Covode.recordClassIndex(88025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75149f(C75143b bVar, DialogC75175j jVar) {
            super(1);
            this.f168973a = bVar;
            this.f168974b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r5 != 6) goto L_0x001a;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.Integer r7) {
            /*
                r6 = this;
                java.lang.Number r7 = (java.lang.Number) r7
                int r5 = r7.intValue()
                r0 = -1
                r4 = 0
                java.lang.String r3 = "is_succ"
                java.lang.String r1 = "warmup_schedule_result_show"
                r2 = 1
                if (r5 == r0) goto L_0x0034
                if (r5 == r2) goto L_0x001d
                r0 = 2
                if (r5 == r0) goto L_0x0034
                r0 = 5
                if (r5 == r0) goto L_0x001d
                r0 = 6
                if (r5 == r0) goto L_0x0034
            L_0x001a:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x001d:
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo59980a(r3, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f79943a
                com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r1, r0)
                com.ss.android.ugc.aweme.specact.popup.b.j r1 = r6.f168974b
                r0 = 2131824533(0x7f110f95, float:1.9281897E38)
                com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b.m131898a(r1, r0, r4)
                goto L_0x001a
            L_0x0034:
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo59980a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f79943a
                com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r1, r0)
                com.ss.android.ugc.aweme.specact.popup.b.j r1 = r6.f168974b
                r0 = 2131824534(0x7f110f96, float:1.9281899E38)
                com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b.m131898a(r1, r0, r2)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b.C75149f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$e */
    static final class C75148e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C75143b f168971a;

        /* renamed from: b */
        final /* synthetic */ DialogC75175j f168972b;

        static {
            Covode.recordClassIndex(88024);
        }

        C75148e(C75143b bVar, DialogC75175j jVar) {
            this.f168971a = bVar;
            this.f168972b = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r4 != null) goto L_0x003a;
         */
        @Override // p077b.AbstractC1729g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p077b.C1731i r7) {
            /*
            // Method dump skipped, instructions count: 131
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b.C75148e.then(b.i):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final C75145b mo118307a(int i) {
        if (i != 0 && i != 2) {
            return null;
        }
        C75117b bVar = this.f168962a;
        if (bVar == null) {
            C89219l.m154710a("buttonAction");
        }
        String str = bVar.f168859b;
        C75117b bVar2 = this.f168962a;
        if (bVar2 == null) {
            C89219l.m154710a("buttonAction");
        }
        try {
            if (m131897a(i, str, m131896a(bVar2.f168861d)).getInt("status_code") == 0) {
                if (this.f168964c.f168895o.f168874b != null) {
                    return new C75145b("", EnumC75146c.DIALOG);
                }
                C75117b bVar3 = this.f168962a;
                if (bVar3 == null) {
                    C89219l.m154710a("buttonAction");
                }
                return new C75145b(bVar3.f168859b, EnumC75146c.JUMP);
            } else if (C89219l.m154714a((Object) this.f168964c.f168883c, (Object) "limit_time_task_reservation_reminder")) {
                return new C75145b(m131900b(R.string.c4x), EnumC75146c.TOAST, false, true);
            } else {
                return new C75145b(m131900b(R.string.dbo), EnumC75146c.TOAST, false, true);
            }
        } catch (JSONException unused) {
            return new C75145b(m131900b(R.string.dbo), EnumC75146c.TOAST, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$b */
    public static final class C75145b {

        /* renamed from: a */
        public final String f168965a;

        /* renamed from: b */
        public final EnumC75146c f168966b;

        /* renamed from: c */
        public final boolean f168967c;

        /* renamed from: d */
        public final boolean f168968d;

        static {
            Covode.recordClassIndex(88021);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75145b)) {
                return false;
            }
            C75145b bVar = (C75145b) obj;
            return C89219l.m154714a(this.f168965a, bVar.f168965a) && C89219l.m154714a(this.f168966b, bVar.f168966b) && this.f168967c == bVar.f168967c && this.f168968d == bVar.f168968d;
        }

        public final int hashCode() {
            String str = this.f168965a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EnumC75146c cVar = this.f168966b;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f168967c;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            if (!this.f168968d) {
                i3 = 0;
            }
            return i7 + i3;
        }

        public final String toString() {
            return "NextAction(data=" + this.f168965a + ", actionType=" + this.f168966b + ", needDismiss=" + this.f168967c + ", isError=" + this.f168968d + ")";
        }

        public /* synthetic */ C75145b(String str, EnumC75146c cVar) {
            this(str, cVar, true, false);
        }

        public C75145b(String str, EnumC75146c cVar, boolean z, boolean z2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(cVar, "");
            this.f168965a = str;
            this.f168966b = cVar;
            this.f168967c = z;
            this.f168968d = z2;
        }
    }

    /* renamed from: a */
    public static void m131898a(DialogC75175j jVar, int i, boolean z) {
        String string = jVar.getContext().getString(i);
        C89219l.m154716b(string, "");
        m131899a(jVar, string, false, z);
    }

    /* renamed from: a */
    private static JSONObject m131897a(int i, String str, Map<String, String> map) {
        if (i == 0) {
            return new JSONObject((String) SpecActRedPacketApi.f168955b.doPost(str, map).execute().f52262b);
        }
        if (i == 2) {
            return new JSONObject((String) SpecActRedPacketApi.f168955b.doGet(str, map).execute().f52262b);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status_code", -77777);
            return jSONObject;
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status_code", -88888);
            jSONObject2.put("err_msg", e.getMessage());
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static void m131899a(DialogC75175j jVar, String str, boolean z, boolean z2) {
        C23144b bVar;
        if (z) {
            bVar = new C23144b(jVar);
        } else {
            bVar = new C23144b(jVar.f169035d);
        }
        if (z2) {
            bVar.mo37635a(str).mo37636b(R.raw.icon_x_mark_small).mo37639d(R.attr.av);
        } else {
            bVar.mo37635a(str).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw);
        }
        bVar.mo37637b();
    }
}
