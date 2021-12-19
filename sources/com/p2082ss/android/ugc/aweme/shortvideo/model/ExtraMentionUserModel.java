package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel */
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    private List<C89378p<String, String>> userList = new ArrayList();

    static {
        Covode.recordClassIndex(84574);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(84575);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final ExtraMentionUserModel newInstance(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str, str2);
            return extraMentionUserModel;
        }
    }

    public final List<C89378p<String, String>> getUserList() {
        return this.userList;
    }

    public final void addMentionUser(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.userList.add(new C89378p<>(str, str2));
        }
    }
}
