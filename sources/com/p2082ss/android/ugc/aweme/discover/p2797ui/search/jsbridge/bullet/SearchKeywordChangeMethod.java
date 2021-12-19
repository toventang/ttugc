package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42954c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchKeywordChangeMethod */
public final class SearchKeywordChangeMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C42943a f100136c = new C42943a((byte) 0);

    /* renamed from: b */
    public AbstractC16183k.AbstractC16185b f100137b;

    /* renamed from: d */
    private final String f100138d = C42954c.f100162a;

    static {
        Covode.recordClassIndex(51066);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchKeywordChangeMethod$a */
    public static final class C42943a {
        static {
            Covode.recordClassIndex(51067);
        }

        private C42943a() {
        }

        public /* synthetic */ C42943a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100138d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchKeywordChangeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        super.mo25748a(jSONObject, bVar);
        this.f100137b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010d, code lost:
        if (r7.equals("search_history") != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a A[Catch:{ Exception -> 0x0160 }] */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r11, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r12) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchKeywordChangeMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
