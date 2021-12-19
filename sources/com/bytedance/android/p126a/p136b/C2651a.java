package com.bytedance.android.p126a.p136b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p131d.AbstractC2625a;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2637a;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p127a.p135h.C2641b;
import com.bytedance.android.p126a.p127a.p135h.C2644e;
import com.bytedance.android.p126a.p136b.p137a.AbstractC2653a;
import com.bytedance.android.p126a.p136b.p138b.C2655a;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.android.p126a.p136b.p140c.C2669b;
import com.bytedance.android.p126a.p136b.p141d.AbstractC2674b;
import com.bytedance.android.p126a.p136b.p141d.C2672a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.a */
public final class C2651a extends AbstractC2637a<C2669b> {

    /* renamed from: a */
    public C2669b f7941a;

    /* renamed from: b */
    private C2652a f7942b;

    /* renamed from: c */
    private AbstractC2674b f7943c;

    /* renamed from: d */
    private C2655a f7944d;

    static {
        Covode.recordClassIndex(3039);
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2637a
    /* renamed from: b */
    public final String mo7156b() {
        return "c2s";
    }

    /* renamed from: com.bytedance.android.a.b.a$a */
    public static class C2652a {

        /* renamed from: a */
        public boolean f7945a = true;

        /* renamed from: b */
        public AbstractC2653a f7946b;

        /* renamed from: c */
        public List<AbstractC2661e> f7947c;

        static {
            Covode.recordClassIndex(3040);
        }

        /* renamed from: a */
        public final C2651a mo7171a() {
            return new C2651a(this, (byte) 0);
        }

        /* renamed from: a */
        public final C2652a mo7170a(AbstractC2661e... eVarArr) {
            if (this.f7947c == null) {
                this.f7947c = new ArrayList();
            }
            int i = 0;
            do {
                AbstractC2661e eVar = eVarArr[0];
                if (eVar != null) {
                    this.f7947c.add(eVar);
                }
                i++;
            } while (i <= 0);
            return this;
        }
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2637a
    /* renamed from: d */
    public final void mo7158d() {
        m7667a(false);
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2637a
    /* renamed from: e */
    public final void mo7159e() {
        m7667a(true);
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2637a
    /* renamed from: f */
    public final void mo7160f() {
        C2640a.m7643a("c2s is releasing");
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2639c
    /* renamed from: a */
    public final void mo7114a() {
        C2633a aVar = C2628e.m7607d().f7906c;
        if (aVar != null) {
            String b = mo7156b();
            if (!TextUtils.isEmpty(b)) {
                if (aVar.f7925h == null) {
                    aVar.f7925h = new HashMap();
                }
                JSONObject jSONObject = aVar.f7925h.get(b);
                if (jSONObject != null) {
                    this.f7941a.mo7153a(jSONObject);
                    this.f7943c.mo7187a(this.f7941a.f7974d);
                }
            }
        }
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2637a
    /* renamed from: c */
    public final void mo7157c() {
        C2669b.C2671a aVar = new C2669b.C2671a();
        aVar.f7984a = this.f7942b.f7945a;
        aVar.f7986c = this.f7942b.f7946b;
        this.f7941a = new C2669b(aVar, (byte) 0);
        this.f7944d = new C2655a(this, this.f7942b.f7947c);
        this.f7943c = new C2672a(this);
    }

    private C2651a(C2652a aVar) {
        this.f7942b = aVar;
    }

    /* renamed from: a */
    private void m7667a(boolean z) {
        if (!this.f7941a.f7931i) {
            C2640a.m7643a("c2s tracker is disabled");
            return;
        }
        List<C2626b> c = this.f7943c.mo7191c();
        if (!(c == null || c.isEmpty())) {
            C2654b.m7680a().mo7173b();
            boolean z2 = false;
            for (C2626b bVar : c) {
                if (!z || bVar.f7891m) {
                    if (z2 || !C2644e.f7932a.mo7163a()) {
                        C2640a.m7643a("try resend cached event when offline");
                        bVar.f7888j++;
                        this.f7943c.mo7192c(bVar);
                        z2 = true;
                    } else {
                        m7666a(bVar, true);
                    }
                }
            }
        }
    }

    /* synthetic */ C2651a(C2652a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private void m7666a(C2626b bVar, boolean z) {
        C2640a.m7643a(bVar.toString());
        List<String> list = bVar.f7884f;
        if (z || bVar.mo7143b()) {
            this.f7943c.mo7190b(bVar);
        }
        if (!bVar.mo7143b()) {
            for (int i = 0; i < list.size(); i++) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C2667c a = this.f7944d.mo7174a(list.get(i), bVar);
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                int i2 = this.f7941a.f7979j;
                if (a != null && i2 > 0) {
                    C2640a.m7643a("cost:" + uptimeMillis2 + " code:" + a.f7965a + " msg:" + a.f7966b);
                }
            }
            return;
        }
        C2640a.m7643a("event expired:" + bVar.toString());
        C2641b.onEventExpired(bVar);
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2639c
    /* renamed from: a */
    public final void mo7115a(View view, AbstractC2625a aVar) {
        String str;
        if (!(aVar instanceof C2626b)) {
            StringBuilder sb = new StringBuilder("incompatible event type: ");
            if (aVar != null) {
                str = aVar.getClass().getName();
            } else {
                str = "null";
            }
            C2640a.m7643a(sb.append(str).toString());
        } else if (!this.f7941a.f7931i) {
            C2640a.m7643a("c2s tracker is disabled");
        } else {
            C2626b bVar = (C2626b) aVar;
            List<String> list = bVar.f7884f;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    if (TextUtils.isEmpty(str2) || (!str2.startsWith("http://") && !str2.startsWith("https://"))) {
                        C2640a.m7643a("not a valid http url:".concat(String.valueOf(str2)));
                        arrayList.add(str2);
                    }
                }
                list.removeAll(arrayList);
                if (!list.isEmpty()) {
                    bVar.f7884f = list;
                    C2654b.m7680a().mo7148a("c2s_network_type_on_trigger", C2644e.f7932a.mo7164b(), (JSONObject) null);
                    if (!C2644e.f7932a.mo7163a()) {
                        C2640a.m7643a("network not available now, try saving event");
                        if (this.f7941a.f7973c) {
                            bVar.f7888j++;
                            if (!this.f7943c.mo7188a(bVar)) {
                                C2640a.m7643a("save event failed when offline");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    m7666a(bVar, false);
                    return;
                }
            }
            C2640a.m7643a("filtered urls is empty");
        }
    }
}
