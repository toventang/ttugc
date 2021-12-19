package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.i */
public final class C61634i extends MusNotice {

    /* renamed from: a */
    public static final C61635a f139912a = new C61635a((byte) 0);

    static {
        Covode.recordClassIndex(72361);
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.i$a */
    public static final class C61635a {
        static {
            Covode.recordClassIndex(72362);
        }

        private C61635a() {
        }

        public /* synthetic */ C61635a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.timeLineType));
    }

    public C61634i(int i) {
        super(true);
        ((MusNotice) this).type = 999;
        ((MusNotice) this).timeLineType = i;
        this.nid = String.valueOf(hashCode());
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61634i)) {
            return false;
        }
        C61634i iVar = (C61634i) obj;
        if (this.type == iVar.type && this.timeLineType == iVar.timeLineType) {
            return true;
        }
        return false;
    }
}
