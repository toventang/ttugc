package com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b;

import android.content.Context;
import android.net.Uri;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.lynx.hybrid.C21218m;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35145b;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35146c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.EnumC42198c;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42269b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.e */
public final class C42281e {

    /* renamed from: a */
    public static final C42281e f98502a = new C42281e();

    private C42281e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.e$a */
    public static final class C42282a implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ Context f98503a;

        /* renamed from: b */
        final /* synthetic */ String f98504b;

        static {
            Covode.recordClassIndex(50224);
        }

        public C42282a(Context context, String str) {
            this.f98503a = context;
            this.f98504b = str;
        }

        public final boolean queueIdle() {
            C42193a.f98351b.mo71392a(this.f98503a, this.f98504b, null);
            return false;
        }
    }

    static {
        Covode.recordClassIndex(50223);
    }

    /* renamed from: a */
    public static void m84637a(String str, String str2) {
        BulletContainerView bulletContainerView;
        EnumC42198c cVar;
        C89219l.m154721d(str, "");
        if (str2 != null) {
            C21218m mVar = null;
            if (C42193a.m84456b(str)) {
                C42275b a = C42276c.m84630a(str);
                if (a != null) {
                    cVar = a.f98490c;
                } else {
                    cVar = null;
                }
                if (cVar == EnumC42198c.SUCCEED) {
                    AbstractC21154h kitView = a.f98489b.getKitView();
                    if (kitView instanceof C21218m) {
                        mVar = kitView;
                    }
                    C21218m mVar2 = mVar;
                    if (mVar2 != null) {
                        C42345d dVar = new C42345d();
                        dVar.setSchema(str);
                        dVar.setRawData(str2);
                        C42269b.m84619a(mVar2, dVar);
                        return;
                    }
                    return;
                }
                return;
            }
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            C35146c b = C35145b.m71915b(parse);
            if (b != null && (bulletContainerView = b.f82936a) != null) {
                Object tag = bulletContainerView.getTag();
                if (!(tag instanceof EnumC42198c)) {
                    tag = null;
                }
                if (tag == EnumC42198c.SUCCEED) {
                    TemplateData a2 = TemplateData.m56771a(str2);
                    C89219l.m154716b(a2, "");
                    C16248b bVar = new C16248b();
                    bVar.mo25831b(TemplateData.class, a2);
                    bulletContainerView.mo26841a(bVar, (AbstractC17046h.AbstractC17048b) null);
                }
            }
        }
    }
}
