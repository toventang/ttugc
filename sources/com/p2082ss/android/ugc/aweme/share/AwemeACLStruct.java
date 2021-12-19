package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct */
public final class AwemeACLStruct {

    /* renamed from: a */
    public static final AwemeACLStruct f153905a = new AwemeACLStruct();

    /* renamed from: b */
    private static final AbstractC89244h f153906b = C89250i.m154773a((AbstractC89171a) C68819a.f153912a);

    /* renamed from: a */
    public static final ACLCommonStruct m121288a() {
        return (ACLCommonStruct) f153906b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct */
    public static final class ACLCommonStruct implements Serializable {
        private int code;
        private String extra = "";
        private int showType = 2;
        private String toastMsg = "";

        static {
            Covode.recordClassIndex(81097);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final String toString() {
            return "code = " + this.code + ", showType = " + this.showType + ", toastMsg = " + this.toastMsg + " extra = " + this.extra;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        public final void setExtra(String str) {
            C89219l.m154721d(str, "");
            this.extra = str;
        }

        public final void setToastMsg(String str) {
            C89219l.m154721d(str, "");
            this.toastMsg = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ServerExtra */
    public static final class ServerExtra implements Serializable {

        /* renamed from: aa */
        private Integer f153907aa = 0;
        private Boolean aac = true;
        private Integer aad = 0;
        private Boolean aas = false;

        /* renamed from: ad */
        private Boolean f153908ad = false;

        /* renamed from: ap */
        private Boolean f153909ap = false;
        private Boolean arw = false;
        private Boolean asa = false;
        private Integer asd = 0;
        private Boolean asr = false;
        private Integer avp = 0;

        /* renamed from: sd */
        private Integer f153910sd = 0;

        /* renamed from: ss */
        private Boolean f153911ss = false;

        static {
            Covode.recordClassIndex(81098);
        }

        public final Integer getAa() {
            return this.f153907aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAd() {
            return this.f153908ad;
        }

        public final Boolean getAp() {
            return this.f153909ap;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.f153910sd;
        }

        public final Boolean getSs() {
            return this.f153911ss;
        }

        public final void setAa(Integer num) {
            this.f153907aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAd(Boolean bool) {
            this.f153908ad = bool;
        }

        public final void setAp(Boolean bool) {
            this.f153909ap = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.f153910sd = num;
        }

        public final void setSs(Boolean bool) {
            this.f153911ss = bool;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean bool;
            Integer num;
            Integer num2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Integer num3;
            Boolean bool5;
            Integer num4;
            C89219l.m154721d(aweme, "");
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Boolean bool6 = null;
            if (author != null) {
                bool = Boolean.valueOf(author.isSecret());
            } else {
                bool = null;
            }
            serverExtra.aas = bool;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                num = Integer.valueOf(author2.getDownloadSetting());
            } else {
                num = null;
            }
            serverExtra.aad = num;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num2 = null;
            }
            serverExtra.avp = num2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                bool2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                bool2 = null;
            }
            serverExtra.arw = bool2;
            serverExtra.f153907aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                bool3 = Boolean.valueOf(awemeControl.canShare());
            } else {
                bool3 = null;
            }
            serverExtra.aac = bool3;
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                bool4 = Boolean.valueOf(status.isReviewed());
            } else {
                bool4 = null;
            }
            serverExtra.asr = bool4;
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Integer> r = sVar.mo60074r();
            if (r != null) {
                num3 = r.mo59941c();
            } else {
                num3 = null;
            }
            serverExtra.f153910sd = num3;
            serverExtra.f153909ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null) {
                bool5 = Boolean.valueOf(status2.isAllowShare());
            } else {
                bool5 = null;
            }
            serverExtra.asa = bool5;
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null) {
                num4 = Integer.valueOf(status3.getDownloadStatus());
            } else {
                num4 = null;
            }
            serverExtra.asd = num4;
            VideoControl videoControl2 = aweme.getVideoControl();
            if (videoControl2 != null) {
                bool6 = videoControl2.allowDownload;
            }
            serverExtra.f153908ad = bool6;
            return serverExtra;
        }
    }

    private AwemeACLStruct() {
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$a */
    static final class C68819a extends AbstractC89220m implements AbstractC89171a<ACLCommonStruct> {

        /* renamed from: a */
        public static final C68819a f153912a = new C68819a();

        static {
            Covode.recordClassIndex(81099);
        }

        C68819a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ACLCommonStruct invoke() {
            return new ACLCommonStruct();
        }
    }

    static {
        Covode.recordClassIndex(81096);
    }

    public final String toString() {
        return "ACLCommonStruct = [" + m121288a() + ']';
    }
}
