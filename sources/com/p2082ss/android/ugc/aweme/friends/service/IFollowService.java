package com.p2082ss.android.ugc.aweme.friends.service;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.friends.service.IFollowService */
public interface IFollowService {

    /* renamed from: com.ss.android.ugc.aweme.friends.service.IFollowService$a */
    public interface AbstractC51636a {
        static {
            Covode.recordClassIndex(60983);
        }

        /* renamed from: a */
        void mo87342a();

        /* renamed from: a */
        void mo87343a(Exception exc);
    }

    static {
        Covode.recordClassIndex(60982);
    }

    void sendRequest(String str, String str2, int i, AbstractC51636a aVar);
}
