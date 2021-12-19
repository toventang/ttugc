package com.p2082ss.android.ugc.aweme.servicimpl;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.port.p3561in.IEmojiService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff */
public final class EmojiServiceImplDiff implements IEmojiService {
    static {
        Covode.recordClassIndex(80048);
    }

    /* renamed from: a */
    public static IEmojiService m120143a() {
        MethodCollector.m26663i(4889);
        Object a = C81908b.m141854a(IEmojiService.class, false);
        if (a != null) {
            IEmojiService iEmojiService = (IEmojiService) a;
            MethodCollector.m26664o(4889);
            return iEmojiService;
        }
        if (C81908b.f183308dE == null) {
            synchronized (IEmojiService.class) {
                try {
                    if (C81908b.f183308dE == null) {
                        C81908b.f183308dE = new EmojiServiceImplDiff();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4889);
                    throw th;
                }
            }
        }
        EmojiServiceImplDiff emojiServiceImplDiff = (EmojiServiceImplDiff) C81908b.f183308dE;
        MethodCollector.m26664o(4889);
        return emojiServiceImplDiff;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IEmojiService
    /* renamed from: a */
    public final void mo101499a(TextView textView) {
        C89219l.m154721d(textView, "");
        C46579b.m89899a(textView);
    }
}
