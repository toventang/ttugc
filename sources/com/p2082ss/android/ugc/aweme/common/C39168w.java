package com.p2082ss.android.ugc.aweme.common;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import java.io.File;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.w */
public final class C39168w {

    /* renamed from: a */
    static final Handler f92384a = new Handler();

    /* renamed from: b */
    public static final C39168w f92385b = new C39168w();

    private C39168w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.w$a */
    public static final class RunnableC39169a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f92386a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f92387b;

        /* renamed from: c */
        final /* synthetic */ int f92388c;

        static {
            Covode.recordClassIndex(46792);
        }

        RunnableC39169a(File file, AbstractC89183m mVar, int i) {
            this.f92386a = file;
            this.f92387b = mVar;
            this.f92388c = i;
        }

        public final void run() {
            C39168w.m79473a(this.f92386a, this.f92387b, this.f92388c + 1);
        }
    }

    static {
        Covode.recordClassIndex(46791);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.w$b */
    public static final class C39170b implements WeakHandler.IHandler {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f92389a;

        static {
            Covode.recordClassIndex(46793);
        }

        C39170b(AbstractC89183m mVar) {
            this.f92389a = mVar;
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            C39168w.f92384a.removeCallbacksAndMessages(null);
            if (message.obj instanceof AvatarUri) {
                AbstractC89183m mVar = this.f92389a;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                mVar.invoke(obj, false);
                return;
            }
            this.f92389a.invoke(null, true);
        }
    }

    /* renamed from: a */
    public static void m79473a(File file, AbstractC89183m<? super AvatarUri, ? super Boolean, C89391z> mVar, int i) {
        C89219l.m154721d(file, "");
        C89219l.m154721d(mVar, "");
        if (i > 2) {
            mVar.invoke(null, true);
            return;
        }
        int length = (int) (((file.length() / 1024) + 1) * 1024);
        StringBuilder append = new StringBuilder().append(Api.f79772e.toString()).append("?uid=");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String sb = append.append(g.getCurUserId()).toString();
        C39170b bVar = new C39170b(mVar);
        f92384a.postDelayed(new RunnableC39169a(file, mVar, i), 7000);
        C31575b.m65865g().uploadAvatar(new WeakHandler(bVar), sb, length, file.getPath(), null);
    }
}
