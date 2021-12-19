package com.p2082ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.story.api.IStoryCommentListViewModel */
public abstract class IStoryCommentListViewModel extends DataCenter {

    /* renamed from: e */
    public static final C76440a f171703e = new C76440a((byte) 0);

    /* renamed from: c */
    public Map<String, CommentItemList> f171704c = new LinkedHashMap();

    /* renamed from: d */
    public Map<String, Integer> f171705d = new LinkedHashMap();

    static {
        Covode.recordClassIndex(89413);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.api.IStoryCommentListViewModel$a */
    public static final class C76440a {
        static {
            Covode.recordClassIndex(89414);
        }

        private C76440a() {
        }

        public /* synthetic */ C76440a(byte b) {
            this();
        }
    }
}
