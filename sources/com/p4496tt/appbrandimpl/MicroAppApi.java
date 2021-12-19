package com.p4496tt.appbrandimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.tt.appbrandimpl.MicroAppApi */
public final class MicroAppApi {

    /* renamed from: a */
    private static final AbstractC18099f f198180a = C18097a.m33697a("https://");

    /* renamed from: com.tt.appbrandimpl.MicroAppApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(103306);
        }

        @AbstractC89722f
        AbstractFutureC27655q<String> executeGet(int i, @AbstractC89740x String str);

        @AbstractC89722f(mo144276a = "https:///aweme/v1/microapp/follow/relation/")
        AbstractFutureC27655q<Object> getFollowRelation(@AbstractC89736t(mo144292a = "from_user_token") String str, @AbstractC89736t(mo144292a = "to_user_id") long j);

        @AbstractC89722f(mo144276a = "/developer/api/get_gid/")
        AbstractFutureC27655q<Object> getGid(@AbstractC89736t(mo144292a = "alias_id") String str);

        @AbstractC89722f(mo144276a = "https:///aweme/v1/microapp/record/list/")
        AbstractFutureC27655q<Object> getMicroAppList(@AbstractC89736t(mo144292a = "page") int i, @AbstractC89736t(mo144292a = "page_size") int i2, @AbstractC89736t(mo144292a = "list_type") int i3);

        @AbstractC89722f(mo144276a = "https:///aweme/v1/microapp/mutual/follow/")
        AbstractFutureC27655q<Object> mutualFollowUser(@AbstractC89736t(mo144292a = "from_user_id") long j, @AbstractC89736t(mo144292a = "to_user_id") long j2, @AbstractC89736t(mo144292a = "sec_from_user_id") String str);

        @AbstractC89722f(mo144276a = "https:///aweme/v1/microapp/record/update/")
        AbstractFutureC27655q<Object> updateMicroRecord(@AbstractC89736t(mo144292a = "schema") String str);
    }

    static {
        Covode.recordClassIndex(103305);
    }
}
