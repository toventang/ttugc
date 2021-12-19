package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72692z;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aa */
public final class C72588aa implements AbstractC72628f {

    /* renamed from: a */
    private final Context f162740a;

    /* renamed from: b */
    private final VideoPublishEditModel f162741b;

    static {
        Covode.recordClassIndex(85271);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aa$a */
    static final class CallableC72589a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f162742a;

        static {
            Covode.recordClassIndex(85272);
        }

        CallableC72589a(String str) {
            this.f162742a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            new C79459a(C63238c.f143574a).mo123052a(this.f162742a).mo123053a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aa$b */
    static final class CallableC72590b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC72590b f162743a = new CallableC72590b();

        static {
            Covode.recordClassIndex(85273);
        }

        CallableC72590b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            new C79459a(C63238c.f143574a).mo123050a(R.string.bl6).mo123053a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m128070a(boolean z) {
        String str;
        C84425b bVar = new C84425b();
        bVar.mo129406a("enter_from", this.f162741b.enterFrom);
        bVar.mo129406a("shoot_way", this.f162741b.mShootWay);
        bVar.mo129406a("prop_list", this.f162741b.mStickerID);
        bVar.mo129406a("prop_selected_from", this.f162741b.getPropSource());
        bVar.mo129406a("content_type", C71817eu.m126792c(this.f162741b));
        if (z) {
            str = "succeed";
        } else {
            str = "failed";
        }
        bVar.mo129406a("status", str);
        C63244g.m114602a().mo73263I().mo101634a("prop_pic_toast_show", bVar.f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72628f
    /* renamed from: a */
    public final void mo114894a(List<C72692z.C72694b> list) {
        String string;
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                string = list.get(0).f162977c;
            } else {
                string = this.f162740a.getString(R.string.bl5);
                C89219l.m154716b(string, "");
            }
            C1731i.m5640b(new CallableC72589a(string), C1731i.f5564c);
            m128070a(true);
            return;
        }
        C1731i.m5640b(CallableC72590b.f162743a, C1731i.f5564c);
        m128070a(false);
    }

    public C72588aa(Context context, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f162740a = context;
        this.f162741b = videoPublishEditModel;
    }
}
