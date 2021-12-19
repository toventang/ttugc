package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.r */
public final class C61888r extends MusNotice {
    static {
        Covode.recordClassIndex(72637);
    }

    public C61888r() {
        super(true);
        ((MusNotice) this).type = 99999;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type));
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C61888r) && this.type == ((C61888r) obj).type) {
            return true;
        }
        return false;
    }
}
