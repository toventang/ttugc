package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56254g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.d */
public final class C38671d {

    /* renamed from: a */
    public static final C38671d f91375a = new C38671d();

    private C38671d() {
    }

    static {
        Covode.recordClassIndex(46212);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.d$a */
    public static final class HandlerC38672a extends Handler {

        /* renamed from: a */
        final /* synthetic */ Aweme f91376a;

        /* renamed from: b */
        final /* synthetic */ Context f91377b;

        /* renamed from: c */
        final /* synthetic */ C56252e f91378c;

        static {
            Covode.recordClassIndex(46213);
        }

        public final void handleMessage(Message message) {
            String str;
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                C56254g gVar = new C56254g();
                gVar.commerceScene = "video";
                Aweme aweme = this.f91376a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                gVar.objectId = str;
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Context context = this.f91377b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(context, IMUser.fromUser((User) obj)).mo93266a(this.f91378c).mo93267a(gVar).f128281a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC38672a(Aweme aweme, Context context, C56252e eVar, Looper looper) {
            super(looper);
            this.f91376a = aweme;
            this.f91377b = context;
            this.f91378c = eVar;
        }
    }
}
