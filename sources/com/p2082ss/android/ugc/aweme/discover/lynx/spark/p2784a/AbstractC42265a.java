package com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a;

import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.bridge.magpie.p885d.AbstractC13445d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a */
public abstract class AbstractC42265a {

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a$a */
    public interface AbstractC42266a {
        static {
            Covode.recordClassIndex(50208);
        }

        /* renamed from: a */
        void mo71465a(String str);

        /* renamed from: a */
        void mo71466a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(50207);
    }

    /* renamed from: a */
    public abstract String mo71463a();

    /* renamed from: a */
    public abstract void mo71464a(JSONObject jSONObject, AbstractC42266a aVar);

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a$b */
    public static final class C42267b implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ AbstractC42265a f98474a;

        static {
            Covode.recordClassIndex(50209);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a$b$a */
        public static final class C42268a implements AbstractC42266a {

            /* renamed from: a */
            final /* synthetic */ AbstractC13445d f98475a;

            static {
                Covode.recordClassIndex(50210);
            }

            C42268a(AbstractC13445d dVar) {
                this.f98475a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a.AbstractC42266a
            /* renamed from: a */
            public final void mo71466a(JSONObject jSONObject) {
                C89219l.m154721d(jSONObject, "");
                this.f98475a.mo21666a(1, "success", jSONObject);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a.AbstractC42266a
            /* renamed from: a */
            public final void mo71465a(String str) {
                AbstractC13445d dVar = this.f98475a;
                if (str == null) {
                    C89219l.m154715b();
                }
                dVar.mo21666a(0, "failed", new JSONObject(str));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42267b(AbstractC42265a aVar) {
            this.f98474a = aVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            this.f98474a.mo71464a(new JSONObject(str2), new C42268a(dVar));
        }
    }
}
