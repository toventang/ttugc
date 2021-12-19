package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.c */
public final class C68900c {

    /* renamed from: a */
    public static String f154110a = "share_panel";

    /* renamed from: b */
    public static String f154111b = "";

    /* renamed from: c */
    public static final C68900c f154112c = new C68900c();

    private C68900c() {
    }

    static {
        Covode.recordClassIndex(81206);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.c$a */
    public static final class CallableC68901a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Aweme f154113a;

        /* renamed from: b */
        final /* synthetic */ String f154114b;

        static {
            Covode.recordClassIndex(81207);
        }

        CallableC68901a(Aweme aweme, String str) {
            this.f154113a = aweme;
            this.f154114b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
            if (com.bytedance.ies.abmock.SettingsManager.m29616a().mo25400a("ug_diff_download_report_only_diff", false) == false) goto L_0x0070;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 310
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.C68900c.CallableC68901a.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    private static void m121587a(AwemeACLStruct.ACLCommonStruct aCLCommonStruct) {
        C89219l.m154721d(aCLCommonStruct, "");
        aCLCommonStruct.setCode(0);
        aCLCommonStruct.setShowType(2);
        aCLCommonStruct.setToastMsg("");
        aCLCommonStruct.setExtra("");
    }

    /* renamed from: a */
    public static final void m121589a(String str, Aweme aweme) {
        if (aweme != null && !C68909c.m121606b()) {
            C1731i.m5640b(new CallableC68901a(aweme, str), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static final void m121588a(C69684e.C69686b bVar, String str, Aweme aweme) {
        AbstractC69693h next;
        int i;
        C89219l.m154721d(bVar, "");
        m121587a(AwemeACLStruct.m121288a());
        f154110a = "share_panel";
        Iterator<AbstractC69693h> it = bVar.f155571b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            i = 1;
            if (C89219l.m154714a((Object) next.mo61919c(), (Object) "download") || C89219l.m154714a((Object) next.mo61919c(), (Object) "save")) {
                AwemeACLStruct.m121288a().setCode(0);
            } else {
                AwemeACLStruct.m121288a().setShowType(0);
                AwemeACLStruct.m121288a().setCode(1);
            }
        }
        AwemeACLStruct.m121288a().setCode(0);
        if (next.mo61923f()) {
            i = 2;
        }
        AwemeACLStruct.m121288a().setShowType(i);
        if (AwemeACLStruct.m121288a().getShowType() == 0) {
            m121589a(str, aweme);
        }
    }

    /* renamed from: a */
    public static final void m121590a(boolean z, String str, Aweme aweme) {
        m121587a(AwemeACLStruct.m121288a());
        if (!z) {
            AwemeACLStruct.m121288a().setShowType(0);
            AwemeACLStruct.m121288a().setCode(1);
            f154110a = "long_press_download";
            m121589a(str, aweme);
        }
    }
}
