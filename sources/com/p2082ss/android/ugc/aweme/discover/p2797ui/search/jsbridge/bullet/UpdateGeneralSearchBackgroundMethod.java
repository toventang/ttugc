package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42018g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod */
public final class UpdateGeneralSearchBackgroundMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42949b f100152b = new C42949b((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f100153c;

    /* renamed from: d */
    private final String f100154d = "updateGeneralSearchBackground";

    static {
        Covode.recordClassIndex(51075);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod$b */
    public static final class C42949b {
        static {
            Covode.recordClassIndex(51077);
        }

        private C42949b() {
        }

        public /* synthetic */ C42949b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100154d;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod$c */
    static final class C42950c extends AbstractC89220m implements AbstractC89171a<AbstractC16249c<? extends AbstractC42018g>> {

        /* renamed from: a */
        final /* synthetic */ C16248b f100156a;

        static {
            Covode.recordClassIndex(51078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42950c(C16248b bVar) {
            super(0);
            this.f100156a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16249c<? extends AbstractC42018g> invoke() {
            return this.f100156a.mo25830b(AbstractC42018g.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod$a */
    public static final class C42948a {

        /* renamed from: a */
        public final JSONObject f100155a;

        static {
            Covode.recordClassIndex(51076);
        }

        public C42948a(JSONObject jSONObject) {
            C89219l.m154721d(jSONObject, "");
            this.f100155a = jSONObject;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateGeneralSearchBackgroundMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f100153c = C89250i.m154773a((AbstractC89171a) new C42950c(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        AbstractC42018g gVar;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            AbstractC16249c cVar = (AbstractC16249c) this.f100153c.getValue();
            if (!(cVar == null || (gVar = (AbstractC42018g) cVar.mo25823b()) == null)) {
                gVar.mo71200a(new C42948a(jSONObject));
            }
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            C42912b.m85668a(e, "UpdateGeneralSearchBackgroundMethod");
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
