package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.f */
public final class C61871f extends MusNotice {

    /* renamed from: a */
    public final User f140462a;

    /* renamed from: b */
    public final int f140463b;

    /* renamed from: c */
    public final RoomInfo f140464c;

    static {
        Covode.recordClassIndex(72620);
    }

    public final String toString() {
        return "LiveNotice(user=" + this.f140462a + ", liveType=" + this.f140463b + ", roomInfo=" + this.f140464c + ")";
    }

    /* renamed from: a */
    public final String mo99968a() {
        RoomInfo roomInfo = this.f140464c;
        if (roomInfo != null) {
            return roomInfo.title;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.type);
        User user = this.f140462a;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = Integer.valueOf(this.f140463b);
        return Objects.hash(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61871f)) {
            return false;
        }
        C61871f fVar = (C61871f) obj;
        if (this.type != fVar.type || !Objects.equals(this.f140462a, fVar.f140462a) || this.f140463b != fVar.f140463b || !Objects.equals(this.f140464c, fVar.f140464c)) {
            return false;
        }
        return true;
    }

    public C61871f(User user, int i, RoomInfo roomInfo) {
        super(true);
        this.f140462a = user;
        this.f140463b = i;
        this.f140464c = roomInfo;
        ((MusNotice) this).type = 1001;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        this.priority = 2;
        this.timeLineType = 0;
        this.createTime = 9223372036854775805L;
    }
}
