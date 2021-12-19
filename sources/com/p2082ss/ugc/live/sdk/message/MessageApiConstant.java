package com.p2082ss.ugc.live.sdk.message;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.live.sdk.message.MessageApiConstant */
public class MessageApiConstant {
    static {
        Covode.recordClassIndex(102839);
    }

    /* renamed from: com.ss.ugc.live.sdk.message.MessageApiConstant$FetchRule */
    public static class FetchRule {
        public static int FETCH_DATA_AND_DETERMINE_TYPE = 1;
        public static int FETCH_DATA_FOR_WS_ALONGSIDE = 2;
        public static int FETCH_DATA_ONLY;

        static {
            Covode.recordClassIndex(102840);
        }
    }

    /* renamed from: com.ss.ugc.live.sdk.message.MessageApiConstant$FetchType */
    public static class FetchType {
        public static int HTTP;
        public static int WEBSOCKET = 1;

        static {
            Covode.recordClassIndex(102841);
        }
    }
}
