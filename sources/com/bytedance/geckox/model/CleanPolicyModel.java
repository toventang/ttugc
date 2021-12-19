package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class CleanPolicyModel {
    @AbstractC27891c(mo46611a = "group_clean")
    public GroupCleanPolicy groupClean;
    @AbstractC27891c(mo46611a = "specified_clean")
    public List<C14974a> specifiedClean;

    public static class GroupCleanPolicy {
        @AbstractC27891c(mo46611a = "limit")
        public int limit;
        @AbstractC27891c(mo46611a = "policy")
        public int policy;
        @AbstractC27891c(mo46611a = "rule")
        public int rule;

        static {
            Covode.recordClassIndex(17099);
        }
    }

    /* renamed from: com.bytedance.geckox.model.CleanPolicyModel$a */
    public class C14974a {
        @AbstractC27891c(mo46611a = "c")

        /* renamed from: a */
        public String f36572a;
        @AbstractC27891c(mo46611a = "clean_type")

        /* renamed from: b */
        public int f36573b;
        @AbstractC27891c(mo46611a = "version")

        /* renamed from: c */
        public List<Long> f36574c;
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: d */
        public int f36575d;
        @AbstractC27891c(mo46611a = "pkg_id")

        /* renamed from: e */
        public int f36576e;
        @AbstractC27891c(mo46611a = "err_code")

        /* renamed from: f */
        public int f36577f;
        @AbstractC27891c(mo46611a = "err_msg")

        /* renamed from: g */
        public String f36578g;

        static {
            Covode.recordClassIndex(17100);
        }
    }

    static {
        Covode.recordClassIndex(17098);
    }
}
