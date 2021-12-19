package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73933a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.d */
public final /* synthetic */ class RunnableC74005d implements Runnable {

    /* renamed from: a */
    private final Context f166095a;

    /* renamed from: b */
    private final String f166096b;

    /* renamed from: c */
    private final String f166097c;

    /* renamed from: d */
    private final String f166098d;

    static {
        Covode.recordClassIndex(86755);
    }

    RunnableC74005d(Context context, String str, String str2, String str3) {
        this.f166095a = context;
        this.f166096b = str;
        this.f166097c = str2;
        this.f166098d = str3;
    }

    public final void run() {
        Context context = this.f166095a;
        String str = this.f166096b;
        String str2 = this.f166097c;
        String str3 = this.f166098d;
        C73933a b = C73933a.m130025b(context, str);
        C73933a.C73935b a = b.mo116383a(b.f166009d, "leaving");
        if (a != null && b.f166006a != null) {
            if (b.f166006a == null) {
                C89219l.m154715b();
            }
            C73991bj.m130133d("\n".concat("av-performance\n"));
            String str4 = b.f166010e;
            int i = b.f166007b;
            C73933a.C73935b bVar = b.f166006a;
            if (bVar == null) {
                C89219l.m154715b();
            }
            long j = bVar.f166011a;
            long j2 = a.f166011a;
            C73933a.C73935b bVar2 = b.f166006a;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            long j3 = bVar2.f166013c;
            long j4 = a.f166013c;
            C73933a.C73935b bVar3 = b.f166006a;
            if (bVar3 == null) {
                C89219l.m154715b();
            }
            long j5 = bVar3.f166012b;
            long j6 = a.f166012b;
            C89219l.m154721d(str4, "");
            C80322d.m139251a("scene_memory_usage", new C84425b().mo129406a("creation_id", str3).mo129406a("shoot_way", str2).mo129406a("scene_name", str4 + "_page").mo129403a("finish_count", i).mo129404a("app_memory_end", j2).mo129404a("app_memory_start", j).mo129404a("app_memory_change", j - j2).mo129404a("available_memory_start", j3).mo129404a("available_memory_end", j4).mo129404a("available_memory_change", j3 - j4).mo129404a("used_memory_start", j5).mo129404a("used_memory_end", j6).mo129404a("used_memory_change", j5 - j6).f188764a);
        }
    }
}
