package com.bytedance.ies.xbridge.platform.p1352b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18469d;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18513f;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.platform.p1352b.p1353a.AbstractC18821a;
import com.bytedance.ies.xbridge.platform.p1352b.p1354b.C18828d;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.b.b */
public class C18822b extends AbstractC18469d {

    /* renamed from: a */
    private final EnumC18483e f44626a = EnumC18483e.WEB;

    static {
        Covode.recordClassIndex(21518);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18469d
    /* renamed from: a */
    public final EnumC18483e mo29617a() {
        return this.f44626a;
    }

    /* renamed from: a */
    public static AbstractC18754n m34925a(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        return new C18828d(C18820a.m34922a(map));
    }

    /* renamed from: com.bytedance.ies.xbridge.platform.b.b$a */
    public static final class C18823a implements AbstractC18293d {

        /* renamed from: a */
        final /* synthetic */ C18822b f44627a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18821a f44628b;

        /* renamed from: c */
        final /* synthetic */ C18513f f44629c;

        static {
            Covode.recordClassIndex(21519);
        }

        public C18823a(C18822b bVar, AbstractC18821a aVar, C18513f fVar) {
            this.f44627a = bVar;
            this.f44628b = aVar;
            this.f44629c = fVar;
        }

        @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
        public final void call(final C18297h hVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = hVar.f43671d;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("func", hVar.f43670c);
            hVar.f43676i = false;
            C18822b bVar = this.f44627a;
            String str = hVar.f43670c;
            C89219l.m154709a((Object) str, "");
            bVar.mo29618a(str, new C18828d(jSONObject2), new AbstractC18400b.AbstractC18402b(this) {
                /* class com.bytedance.ies.xbridge.platform.p1352b.C18822b.C18823a.C188241 */

                /* renamed from: a */
                final /* synthetic */ C18823a f44630a;

                static {
                    Covode.recordClassIndex(21520);
                }

                @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18402b
                /* renamed from: a */
                public final void mo13405a(Map<String, Object> map) {
                    C89219l.m154719c(map, "");
                    this.f44630a.f44628b.mo29826a(hVar.f43669b, new JSONObject(map));
                }

                {
                    this.f44630a = r1;
                }
            }, this.f44629c);
        }
    }
}
