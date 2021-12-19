package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.r */
public class C75972r {

    /* renamed from: a */
    public C75967n f170644a;

    /* renamed from: b */
    protected C77268b f170645b;

    /* renamed from: c */
    protected AbstractC75955e f170646c;

    /* renamed from: d */
    public C75971q f170647d;

    /* renamed from: e */
    protected AbstractC75974b f170648e;

    /* renamed from: f */
    protected ActivityC0945e f170649f;

    /* renamed from: g */
    protected boolean f170650g;

    /* renamed from: h */
    public int f170651h;

    /* renamed from: i */
    protected int f170652i;

    /* renamed from: j */
    protected String f170653j;

    /* renamed from: k */
    public boolean f170654k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.r$b */
    public interface AbstractC75974b {
        static {
            Covode.recordClassIndex(88916);
        }

        /* renamed from: a */
        void mo23198a(boolean z);
    }

    static {
        Covode.recordClassIndex(88914);
    }

    /* renamed from: a */
    public int mo119620a(int i, String str) {
        return 0;
    }

    /* renamed from: a */
    public void mo119637a() {
    }

    /* renamed from: b */
    public final void mo119654b() {
        this.f170650g = true;
        C75967n nVar = this.f170644a;
        if (nVar != null) {
            nVar.mo119642c();
        }
    }

    /* renamed from: c */
    public final void mo119655c() {
        C77268b bVar = this.f170645b;
        if (bVar != null) {
            bVar.mo120870a();
        }
        mo119653a("");
    }

    /* renamed from: d */
    public final void mo119656d() {
        C77268b bVar = this.f170645b;
        if (bVar != null) {
            bVar.mo120871a(new C75973a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.r$a */
    class C75973a implements C77268b.AbstractC77269a {
        static {
            Covode.recordClassIndex(88915);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: c */
        public final void mo77540c(int i) {
        }

        C75973a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: a */
        public final void mo77523a(int i) {
            if (C75972r.this.f170650g) {
                if (C75972r.this.f170644a != null) {
                    C75972r.this.f170644a.mo119643d();
                    C75972r.this.f170644a.mo119612a(i);
                }
                if (C75972r.this.f170648e != null) {
                    C75972r.this.f170648e.mo23198a(true);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: b */
        public final void mo77535b(int i) {
            if (C75972r.this.f170650g) {
                C75972r.this.f170650g = false;
                if (C75972r.this.f170644a != null) {
                    C75972r.this.mo119653a(C75972r.this.f170644a.getText());
                    C75972r.this.f170644a.setVisibility(8);
                    C75972r.this.f170644a.setText("");
                }
                if (C75972r.this.f170646c != null) {
                    C75972r.this.f170646c.mo119400a();
                }
                if (C75972r.this.f170648e != null) {
                    C75972r.this.f170648e.mo23198a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public C75972r mo119621a(C75967n nVar) {
        this.f170644a = nVar;
        nVar.setVisibility(8);
        return this;
    }

    /* renamed from: a */
    public final C75972r mo119652a(AbstractC75974b bVar) {
        this.f170648e = bVar;
        return this;
    }

    /* renamed from: a */
    public final void mo119653a(String str) {
        C75971q qVar;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        AbstractC75955e eVar = this.f170646c;
        if (eVar != null && (qVar = this.f170647d) != null) {
            this.f170653j = str;
            eVar.mo119403a(str, qVar.f170641b, this.f170647d.f170642c, this.f170647d.f170643d);
        }
    }

    public C75972r(ActivityC0945e eVar, AbstractC75955e eVar2, AbstractC84903j jVar) {
        if (eVar != null) {
            this.f170649f = eVar;
            this.f170646c = eVar2;
            this.f170645b = new C77268b(eVar, jVar);
        }
    }
}
