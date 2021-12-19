package com.p2082ss.android.ugc.gamora.editor.sticker.permission;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.permission.a */
public final class C82949a {

    /* renamed from: a */
    public static boolean f185358a;

    /* renamed from: b */
    public static final C82949a f185359b = new C82949a();

    private C82949a() {
    }

    static {
        Covode.recordClassIndex(96810);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.permission.a$a */
    public static final class CallableC82950a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC82950a f185360a = new CallableC82950a();

        static {
            Covode.recordClassIndex(96811);
        }

        CallableC82950a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ((QuestionAndAnswerApi) C63244g.m114602a().mo73257C().createDefaultRetrofit(QuestionAndAnswerApi.class)).getAllowUserToQuestion().mo5532a(C829511.f185361a);
        }
    }
}
