package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.t */
public final class C61890t extends MusNotice {

    /* renamed from: g */
    public static final C61891a f140519g = new C61891a((byte) 0);

    /* renamed from: a */
    public final String f140520a;

    /* renamed from: b */
    public final String f140521b;

    /* renamed from: c */
    public final String f140522c;

    /* renamed from: d */
    public final String f140523d;

    /* renamed from: e */
    public final String f140524e;

    /* renamed from: f */
    public final String f140525f;

    static {
        Covode.recordClassIndex(72639);
    }

    public final String toString() {
        return "TutorialVideoNotice(msgId=" + this.f140520a + ", icon=" + this.f140521b + ", title=" + this.f140522c + ", desc=" + this.f140523d + ", button=" + this.f140524e + ", deepLink=" + this.f140525f + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.t$a */
    public static final class C61891a {
        static {
            Covode.recordClassIndex(72640);
        }

        private C61891a() {
        }

        public /* synthetic */ C61891a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C61890t m112015a(TutorialVideoInfo tutorialVideoInfo) {
            C89219l.m154721d(tutorialVideoInfo, "");
            return new C61890t(tutorialVideoInfo.getMsgId(), tutorialVideoInfo.getIcon(), tutorialVideoInfo.getTitle(), tutorialVideoInfo.getDesc(), tutorialVideoInfo.getButton(), tutorialVideoInfo.getDeepLink());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f140520a, this.f140521b, this.f140522c, this.f140523d, this.f140524e, this.f140525f);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61890t)) {
            return false;
        }
        C61890t tVar = (C61890t) obj;
        if (this.type != tVar.type || !C89219l.m154714a((Object) this.f140520a, (Object) tVar.f140520a) || !C89219l.m154714a((Object) this.f140521b, (Object) tVar.f140521b) || !C89219l.m154714a((Object) this.f140522c, (Object) tVar.f140522c) || !C89219l.m154714a((Object) this.f140523d, (Object) tVar.f140523d) || !C89219l.m154714a((Object) this.f140524e, (Object) tVar.f140524e) || !C89219l.m154714a((Object) this.f140525f, (Object) tVar.f140525f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61890t(String str, String str2, String str3, String str4, String str5, String str6) {
        super(true);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.f140520a = str;
        this.f140521b = str2;
        this.f140522c = str3;
        this.f140523d = str4;
        this.f140524e = str5;
        this.f140525f = str6;
        ((MusNotice) this).type = 1000;
        ((MusNotice) this).nid = String.valueOf(hashCode());
    }
}
