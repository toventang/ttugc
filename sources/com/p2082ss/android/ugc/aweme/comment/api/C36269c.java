package com.p2082ss.android.ugc.aweme.comment.api;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.api.c */
public final class C36269c {

    /* renamed from: a */
    public static final C36269c f85711a = new C36269c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.api.c$a */
    public static final class DialogInterface$OnClickListenerC36270a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC36270a f85712a = new DialogInterface$OnClickListenerC36270a();

        static {
            Covode.recordClassIndex(43545);
        }

        DialogInterface$OnClickListenerC36270a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private C36269c() {
    }

    static {
        Covode.recordClassIndex(43544);
    }

    /* renamed from: a */
    private static void m73909a(Context context, int i, boolean z) {
        if (!z && i != 0) {
            String string = context.getResources().getString(i);
            C89219l.m154716b(string, "");
            m73910a(context, string, z);
        }
    }

    /* renamed from: a */
    private static void m73910a(Context context, String str, boolean z) {
        if (!z) {
            try {
                new C79459a(context).mo123052a(str).mo123053a();
            } catch (Exception e) {
                Logger.throwException(e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m73912a(android.content.Context r6, java.lang.Exception r7, int r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 454
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.api.C36269c.m73912a(android.content.Context, java.lang.Exception, int, boolean, boolean):boolean");
    }
}
