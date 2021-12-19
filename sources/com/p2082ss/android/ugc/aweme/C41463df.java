package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.maker.C60253l;
import com.p2082ss.android.ugc.aweme.multi.maker.C60257m;
import com.p2082ss.android.ugc.aweme.multi.p3461a.C60191a;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.df */
public final class C41463df implements AbstractC34674d {

    /* renamed from: b */
    public static boolean f96710b = true;

    /* renamed from: c */
    public static final C41464a f96711c = new C41464a((byte) 0);

    /* renamed from: a */
    public final AbstractC33504a f96712a = new C60191a();

    /* renamed from: d */
    private C60202d f96713d;

    /* renamed from: e */
    private String f96714e;

    /* renamed from: com.ss.android.ugc.aweme.df$a */
    public static final class C41464a {
        static {
            Covode.recordClassIndex(49363);
        }

        private C41464a() {
        }

        public /* synthetic */ C41464a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(49362);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d
    /* renamed from: a */
    public final boolean mo61336a() {
        List<AbstractC60201c> list;
        C60202d dVar = this.f96713d;
        if (dVar == null || (list = dVar.f137229a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d
    /* renamed from: a */
    public final void mo61335a(AbstractC34673c cVar) {
        C60202d dVar;
        C89219l.m154721d(cVar, "");
        if (!f96710b && (dVar = this.f96713d) != null) {
            this.f96712a.mo59606c(dVar, cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d
    /* renamed from: b */
    public final void mo61337b(AbstractC34673c cVar) {
        C89219l.m154721d(cVar, "");
        C60202d dVar = this.f96713d;
        if (dVar != null) {
            AbstractC60201c cVar2 = (AbstractC60201c) C89070n.m154583g((List) dVar.f137229a);
            if (cVar2 != null && ((cVar2 instanceof C60253l) || (cVar2 instanceof C60257m))) {
                C39162r.m79460a("rd_tiktokec_shop_multi_anchor_show", new C33744d().mo59983a("where", "TagMultiHandler").mo59983a("presenter_name", this.f96712a.getClass().getName()).mo59983a("maker_name", cVar2.getClass().getName()).mo59983a("experiment", "5").mo59980a("anchor_count", dVar.mo97898g()).mo59980a("product_count", cVar2.mo97874d()).mo59983a("item_id", this.f96714e).f79943a);
            }
            int g = dVar.mo97898g();
            if (g == 0) {
                return;
            }
            if (g != 1) {
                this.f96712a.mo59605b(dVar, cVar);
            } else {
                this.f96712a.mo59604a(dVar, cVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d
    /* renamed from: a */
    public final int mo61334a(Aweme aweme, Activity activity, String str, JSONObject jSONObject, AbstractC49691s<C49672ag> sVar, boolean z, AbstractC34673c cVar) {
        int i;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(cVar, "");
        C60202d dVar = new C60202d(aweme, activity, str, "", jSONObject, sVar, z);
        this.f96714e = aweme.getAid();
        if (dVar.mo97898g() == 0) {
            this.f96713d = null;
            i = 0;
        } else {
            this.f96713d = dVar;
            i = -1000;
        }
        if (f96710b) {
            C60202d dVar2 = this.f96713d;
            if (dVar2 != null) {
                this.f96712a.mo59606c(dVar2, cVar);
            }
            f96710b = false;
        }
        return i;
    }
}
