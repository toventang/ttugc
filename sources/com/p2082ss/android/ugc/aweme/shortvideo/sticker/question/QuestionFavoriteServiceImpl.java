package com.p2082ss.android.ugc.aweme.shortvideo.sticker.question;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.question.IQuestionFavoriteService;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl */
public final class QuestionFavoriteServiceImpl implements WeakHandler.IHandler, IQuestionFavoriteService {

    /* renamed from: a */
    private final int f164013a = 64;

    /* renamed from: b */
    private final Map<String, Integer> f164014b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(85791);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    /* renamed from: a */
    public static IQuestionFavoriteService m129023a() {
        MethodCollector.m26663i(4637);
        Object a = C81908b.m141854a(IQuestionFavoriteService.class, false);
        if (a != null) {
            IQuestionFavoriteService iQuestionFavoriteService = (IQuestionFavoriteService) a;
            MethodCollector.m26664o(4637);
            return iQuestionFavoriteService;
        }
        if (C81908b.f183373ec == null) {
            synchronized (IQuestionFavoriteService.class) {
                try {
                    if (C81908b.f183373ec == null) {
                        C81908b.f183373ec = new QuestionFavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4637);
                    throw th;
                }
            }
        }
        QuestionFavoriteServiceImpl questionFavoriteServiceImpl = (QuestionFavoriteServiceImpl) C81908b.f183373ec;
        MethodCollector.m26664o(4637);
        return questionFavoriteServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.question.IQuestionFavoriteService
    /* renamed from: a */
    public final void mo105438a(String str, int i) {
        MethodCollector.m26663i(4629);
        C89219l.m154721d(str, "");
        if (str.length() == 0) {
            MethodCollector.m26664o(4629);
            return;
        }
        synchronized (this.f164014b) {
            try {
                if (this.f164014b.size() >= this.f164013a) {
                    this.f164014b.entrySet().remove((Map.Entry) C89070n.m154559b((Iterable) this.f164014b.entrySet()));
                }
                this.f164014b.put(str, Integer.valueOf(i));
            } finally {
                MethodCollector.m26664o(4629);
            }
        }
    }
}
