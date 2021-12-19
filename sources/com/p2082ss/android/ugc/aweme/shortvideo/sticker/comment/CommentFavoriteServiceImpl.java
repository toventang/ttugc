package com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.comment.ICommentFavoriteService;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl */
public final class CommentFavoriteServiceImpl implements WeakHandler.IHandler, ICommentFavoriteService {

    /* renamed from: a */
    private final int f163469a = 64;

    /* renamed from: b */
    private final Map<String, Integer> f163470b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(85545);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    /* renamed from: a */
    public static ICommentFavoriteService m128654a() {
        MethodCollector.m26663i(8605);
        Object a = C81908b.m141854a(ICommentFavoriteService.class, false);
        if (a != null) {
            ICommentFavoriteService iCommentFavoriteService = (ICommentFavoriteService) a;
            MethodCollector.m26664o(8605);
            return iCommentFavoriteService;
        }
        if (C81908b.f183372eb == null) {
            synchronized (ICommentFavoriteService.class) {
                try {
                    if (C81908b.f183372eb == null) {
                        C81908b.f183372eb = new CommentFavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8605);
                    throw th;
                }
            }
        }
        CommentFavoriteServiceImpl commentFavoriteServiceImpl = (CommentFavoriteServiceImpl) C81908b.f183372eb;
        MethodCollector.m26664o(8605);
        return commentFavoriteServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.ICommentFavoriteService
    /* renamed from: a */
    public final int mo63316a(String str) {
        boolean z;
        Integer num;
        MethodCollector.m26663i(8454);
        C89219l.m154721d(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = -1;
        if (z) {
            MethodCollector.m26664o(8454);
            return -1;
        }
        synchronized (this.f163470b) {
            try {
                if (this.f163470b.containsKey(str) && (num = this.f163470b.get(str)) != null) {
                    i = num.intValue();
                }
            } finally {
                MethodCollector.m26664o(8454);
            }
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.ICommentFavoriteService
    /* renamed from: a */
    public final void mo63317a(String str, int i) {
        MethodCollector.m26663i(8452);
        C89219l.m154721d(str, "");
        if (str.length() == 0) {
            MethodCollector.m26664o(8452);
            return;
        }
        synchronized (this.f163470b) {
            try {
                if (this.f163470b.size() >= this.f163469a) {
                    this.f163470b.entrySet().remove((Map.Entry) C89070n.m154559b((Iterable) this.f163470b.entrySet()));
                }
                this.f163470b.put(str, Integer.valueOf(i));
            } finally {
                MethodCollector.m26664o(8452);
            }
        }
    }
}
