package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.f */
public final class C65849f {
    @AbstractC27891c(mo46611a = "qa_invitation_limit")

    /* renamed from: a */
    public final Integer f148395a;

    static {
        Covode.recordClassIndex(77350);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65849f) && C89219l.m154714a(this.f148395a, ((C65849f) obj).f148395a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f148395a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QAInvitationSettingsData(invitationLimit=" + this.f148395a + ")";
    }

    public C65849f(Integer num) {
        this.f148395a = num;
    }
}
