package com.p2082ss.android.ugc.aweme.hybridkit.bridge;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import com.bytedance.bridge.magpie.C13427b;
import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.bridge.magpie.p885d.AbstractC13445d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c */
public final class C53411c {

    /* renamed from: a */
    public static final AbstractC89244h f122620a = C89250i.m154773a((AbstractC89171a) C53416b.f122627a);

    /* renamed from: b */
    public static final C53412a f122621b = new C53412a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c$a */
    public static final class C53412a {
        static {
            Covode.recordClassIndex(62979);
        }

        /* renamed from: a */
        public static ArrayMap<View, C16248b> m98548a() {
            return (ArrayMap) C53411c.f122620a.getValue();
        }

        private C53412a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c$a$a */
        public static final class C53413a extends AbstractC53418e {

            /* renamed from: a */
            final /* synthetic */ Context f122622a;

            /* renamed from: b */
            final /* synthetic */ View f122623b;

            /* renamed from: c */
            final /* synthetic */ C13427b f122624c;

            static {
                Covode.recordClassIndex(62980);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
            /* renamed from: b */
            public final EnumC16723b mo25769b() {
                if (this.f122624c.f32730a.f32695d != null) {
                    return EnumC16723b.LYNX;
                }
                return EnumC16723b.WEB;
            }

            @Override // com.p2082ss.android.ugc.aweme.hybridkit.bridge.AbstractC53418e, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
            public final void onEvent(AbstractC16191p pVar) {
                C89219l.m154721d(pVar, "");
                this.f122624c.mo21647a(pVar.mo25699a(), (JSONObject) pVar.mo25700b());
            }

            C53413a(Context context, View view, C13427b bVar) {
                this.f122622a = context;
                this.f122623b = view;
                this.f122624c = bVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c$a$b */
        public static final class C53414b implements AbstractC13444c {

            /* renamed from: a */
            final /* synthetic */ AbstractC16183k f122625a;

            static {
                Covode.recordClassIndex(62981);
            }

            /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c$a$b$a */
            public static final class C53415a implements AbstractC16183k.AbstractC16185b {

                /* renamed from: a */
                final /* synthetic */ AbstractC13445d f122626a;

                static {
                    Covode.recordClassIndex(62982);
                }

                C53415a(AbstractC13445d dVar) {
                    this.f122626a = dVar;
                }

                @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                /* renamed from: a */
                public final void mo25704a(JSONObject jSONObject) {
                    C89219l.m154721d(jSONObject, "");
                    this.f122626a.mo21666a(1, "success", jSONObject);
                }

                @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                /* renamed from: a */
                public final void mo25702a(int i, String str) {
                    C89219l.m154721d(str, "");
                    this.f122626a.mo21666a(i, str, null);
                }

                @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                /* renamed from: a */
                public final void mo25703a(int i, String str, JSONObject jSONObject) {
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(jSONObject, "");
                    this.f122626a.mo21666a(i, str, jSONObject);
                }
            }

            C53414b(AbstractC16183k kVar) {
                this.f122625a = kVar;
            }

            @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
            /* renamed from: a */
            public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
                JSONObject jSONObject;
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(dVar, "");
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception unused) {
                    if (C89219l.m154714a((Object) C89361p.m154910b((CharSequence) str2).toString(), (Object) "")) {
                        jSONObject = new JSONObject();
                    } else {
                        dVar.mo21666a(-1, "params illegal, params = ".concat(String.valueOf(str2)), null);
                        return;
                    }
                }
                this.f122625a.mo25748a(jSONObject, new C53415a(dVar));
            }
        }

        public /* synthetic */ C53412a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.c$b */
    static final class C53416b extends AbstractC89220m implements AbstractC89171a<ArrayMap<View, C16248b>> {

        /* renamed from: a */
        public static final C53416b f122627a = new C53416b();

        static {
            Covode.recordClassIndex(62983);
        }

        C53416b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayMap<View, C16248b> invoke() {
            return new ArrayMap(8);
        }
    }

    static {
        Covode.recordClassIndex(62978);
    }
}
