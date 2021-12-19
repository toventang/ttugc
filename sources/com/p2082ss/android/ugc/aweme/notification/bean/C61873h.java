package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.h */
public final class C61873h extends MusNotice {
    static {
        Covode.recordClassIndex(72622);
    }

    public C61873h() {
        super(true);
        ((MusNotice) this).type = 9999;
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
        if ((obj instanceof C61873h) && this.type == ((C61873h) obj).type) {
            return true;
        }
        return false;
    }
}
