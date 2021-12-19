package com.bytedance.p1399im.core.p1404a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.proto.ConversationType;
import com.bytedance.p1399im.core.proto.StatusCode;

/* renamed from: com.bytedance.im.core.a.e */
public final class C19489e {
    static {
        Covode.recordClassIndex(22333);
    }

    /* renamed from: com.bytedance.im.core.a.e$a */
    public static abstract class AbstractC19490a {

        /* renamed from: a */
        public static final int f46180a = ConversationType.ONE_TO_ONE_CHAT.getValue();

        /* renamed from: b */
        public static final int f46181b = ConversationType.GROUP_CHAT.getValue();

        /* renamed from: c */
        public static final int f46182c = ConversationType.LIVE_CHAT.getValue();

        /* renamed from: d */
        public static final int f46183d = ConversationType.BROADCAST_CHAT.getValue();

        static {
            Covode.recordClassIndex(22334);
        }
    }

    /* renamed from: com.bytedance.im.core.a.e$b */
    public static abstract class AbstractC19491b {

        /* renamed from: a */
        public static final int f46184a = StatusCode.OK.getValue();

        /* renamed from: b */
        public static final int f46185b = StatusCode.INVALID_TOKEN.getValue();

        /* renamed from: c */
        public static final int f46186c = StatusCode.EXPIRED_TOKEN.getValue();

        /* renamed from: d */
        public static final int f46187d = StatusCode.INVALID_TICKET.getValue();

        /* renamed from: e */
        public static final int f46188e = StatusCode.INVALID_REQUEST.getValue();

        /* renamed from: f */
        public static final int f46189f = StatusCode.INVALID_CMD.getValue();

        /* renamed from: g */
        public static final int f46190g = StatusCode.SERVER_ERR.getValue();

        /* renamed from: h */
        public static final int f46191h = StatusCode.MESSAGE_TARGET_CONVERSATION_NOT_EXIST.getValue();

        static {
            Covode.recordClassIndex(22335);
        }
    }
}
